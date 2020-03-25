import java.util.*;
class LongestHappyPrefix{
  public static void main(String[] args) {
    System.out.println(longestPrefix("level"));
    System.out.println(longestPrefix("ababab"));
    System.out.println(longestPrefix("leetcodeleet"));
    System.out.println(longestPrefix("a"));
    System.out.println(longestPrefix("lbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmnlbywxrxepmvsvlcaxgibdnffirmsxcpdlambtizoiflpzalqzzwapzfqxjsxazngtwkhoywuyduwlyhdmaqodmjympjrmakcwzghkzfeapsbwcgstmxfiusozuwcitzcsyvvuotyqewzwiifmxiffykgribzwupgiqqipefxgsoorekuieclzfgnymoanhmjajcfhcydrlvtvqxyfhgxgjlfgtmtaorwzktallnzdqnqavdwxfftrosmprugqougadicdwsvucbrbxspfmjunroegbydavcnsakajpiihijduexlnmsrvblzybxljuvzgssqheitqwxzfegesjrnloumysdprsdsgccexnvfxbxwxidrowykycgmvohokgpctznfsfcozujpivgvmuyvmyubfvxipldogacvlnhfceypgkqkedzyezpbmwjftstqtmqpkrvxdtonmcqepvqcjncuqfjpssjqfjjzusnapdlsvtcagkymnwigcdqaztrjabmlqfzsiwjcfxonascjfeljsjhdwtupkavlvhxdfboxroevfbosdgsdaqerghssxxidlwwiptkhuibkuwdkkslknmygkgkazwixvqiegmawralhfvdimhrtqltctetvzwgnnrzhhrgtbwnljtzqyccfmierpsgmduznlpmbqghmoqvvnhzcvybxemhiebebolkumnlfehwfoajqllsbmfunbfjesmigxwdvuxyvypuqetfmdpycyjycjkqnnzhyczcpdhcesvpebjvsjycruameowgkprdwrvphnxgedqcnsvpmdeigfovyrkntzzrtwbltduefcctvwuajomqqxlbywpozaolbbvldfhdrejiigofmxpqegphbuutnqbuguymrhhmrziwczxowwliimcrsjnyctnecxhumivfgnnysocapupgyfplhcmvjrlhgjuybuxkcwowqkiubthmgjhakzhqweqytuivqwgmn"));
  }
  public static String longestPrefix(String s) {
      Set<String> preSet = new HashSet<>();
      String pre = "";
      int len = s.length();
      for(int i = 0; i < len-1; i++){
          pre += s.charAt(i);
          preSet.add(pre);
      }
      // System.out.println("preSet =" + preSet);
      //Set<String> sufSet = new HashSet<>();
      String suf = "";
      String op ="";
      for(int i = len-1; i>0; i--){
          suf = s.charAt(i) + suf;
          if(preSet.contains(suf) && suf.length() > op.length()){
              op = suf;
          }
      }
      // System.out.println("sufSet =" + sufSet);
      // for(String temp: preSet){
      //     if(sufSet.contains(temp) && temp.length() > op.length()){
      //         op = temp;
      //     }
      // }
      return op;
  }
}
