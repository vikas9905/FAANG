#include <stack>
#include <stdexcept>
#include <string>
#include <vector>

#include "test_framework/generic_test.h"
#include "test_framework/serialization_traits.h"
#include "test_framework/test_failure.h"

using std::length_error;
using std::stack;

class Queue {
 public:
  void Enqueue(int x) { enqueue_.emplace(x); }

  int Dequeue() {
    if (empty(dequeue_)) {
      // Transfers the elements in enqueue_ to dequeue_.
      while (!empty(enqueue_)) {
        dequeue_.emplace(enqueue_.top());
        enqueue_.pop();
      }
    }

    if (empty(dequeue_)) {  // dequeue_ is still empty!
      throw length_error("empty queue");
    }
    int result = dequeue_.top();
    dequeue_.pop();
    return result;
  }

 private:
  stack<int> enqueue_, dequeue_;
};

struct QueueOp {
  enum { kConstruct, kDequeue, kEnqueue } op;
  int argument;

  QueueOp(const std::string& op_string, int arg) : argument(arg) {
    if (op_string == "Queue") {
      op = kConstruct;
    } else if (op_string == "dequeue") {
      op = kDequeue;
    } else if (op_string == "enqueue") {
      op = kEnqueue;
    } else {
      throw std::runtime_error("Unsupported queue operation: " + op_string);
    }
  }
};

template <>
struct SerializationTraits<QueueOp> : UserSerTraits<QueueOp, std::string, int> {
};

void QueueTester(const std::vector<QueueOp>& ops) {
  try {
    Queue q;
    for (auto& x : ops) {
      switch (x.op) {
        case QueueOp::kConstruct:
          break;
        case QueueOp::kDequeue: {
          int result = q.Dequeue();
          if (result != x.argument) {
            throw TestFailure("Dequeue: expected " +
                              std::to_string(x.argument) + ", got " +
                              std::to_string(result));
          }
        } break;
        case QueueOp::kEnqueue:
          q.Enqueue(x.argument);
          break;
      }
    }
  } catch (length_error&) {
    throw TestFailure("Unexpected length_error exception");
  }
}

int main(int argc, char* argv[]) {
  std::vector<std::string> args{argv + 1, argv + argc};
  std::vector<std::string> param_names{"ops"};
  return GenericTestMain(args, "queue_from_stacks.cc", "queue_from_stacks.tsv",
                         &QueueTester, DefaultComparator{}, param_names);
}
