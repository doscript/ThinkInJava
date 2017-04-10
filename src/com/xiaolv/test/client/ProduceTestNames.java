package com.xiaolv.test.client;

import java.awt.FontFormatException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sun.org.apache.xpath.internal.functions.FuncSubstringBefore;
import com.sun.org.apache.xpath.internal.operations.And;

public class ProduceTestNames {
	
    static String  string = "twebqdkf";//,tioskf,tandroidkf,tjavakf,tphpkf,tcyykf,tjbkf,trjgcs,tyjgcs,txqgcs,txtjgsjs,tsjkfgcs,terpjskfyy,tyysptxkf,tuisj,tyhtyueuxsj,twysj,tyxsjkf,tyxch,tyxjmsj,txtjcgcs,tsfgcs,tfzyygcs,tjsjfzsjs,twzjgsjs,tcsgcs,tqtrjyjhlwkf,thlwcpzyjlzj,tdzswzyjlzj,thlwcpyy,thlwscyy,thlwnryy,twzbj,twztgseosem,txmtyy,twdwsyy,tqthlwcpyygl,titjsyfzyjlzj,titxmxdzyjlzj,titzlgl,titzyjl,tpzgl,txxjsbzh,txtgl,twlgl,txxaqgl,tsjkgl,tyjwh,tqtitglxmxdywpz,ttxjs,ttxyf,tsjtx,tydtx,tdxwl,tdxjh,tyxcs,twxsptx,ttxdy,ttxbzh,ttxxmgl,ttxzzcpkf,tqtdxtxjs,tfdcxmch,tfdcxmztb,tfdcxmkfbj,tfdcxmptgcs,tysfdcxs,tesfdcxsjj,tfdcdc,tfdcpg,tfdcjc,tfdcxmgl,tfdczcgl,tqtfdckfjj,tjzgcs,tjzsjs,ttmtjjggcs,tytgc,tjzzt,tjzgcchcl,tdlqlsdgcjs,tslgkgcjs,tjxgdgcjs,tgpsnt,tkdgcsj,tznlybxrdaf,tcsghsj,tszgcs,tgcjlzlgl,tgczjyjs,tjzsgxcgl,tsgy,tjzgcaqgl,tlyzzsj,tmqgcs,tyljgsj,tsnzxsj,tcglsj,tzxdfzr,tdg,tsgmgyqg,twg,tqttmjzszgczxsj,twygl,twygwjl,twyzsgl,twyzlxs,twywx,twyjkwh,tqtwygl,tyxjlxc,tdtjl,tyxkhdbjlzj,tyxkhfw,tzhyw,tgsyw,tgryw,tyxhjgy,tyxkdzyxywtg,txdglzxpg,txshc,twhjy,tjckxyzjs,tyxqsyw,tyxfxglkz,tqtyxyw,tzqqhwhjjr,tzqtzkhdbjlzj,tzqfxjryj,ttzlcjrfw,ttzyxyw,ttzyxcwfx,trzzyjlzj,tgpqhcps,tzcpg,tfxglkzjc,tzqtzxmgl,tjrjjyjy,tjrcpjl,tjrcpxs,tjjxmjl,tjrzl,tqtjrtzyw,tbxywgl,tbxxmkfch,tbxpxs,tbxdljjr,tbxgwcwghs,tbxqygl,thblp,tqcdscxlp,tbxjss,tbxxqglkhfw,tbxxsdx,tbxha,tqtbxyw,txtyw,tdbyw,tpmyw,tddyw,tzbcpjd,tscyygl,tscxmgl,tscxmgcs,tscjh,tsccpgl,tzzgcs,tgyzcgcs,tgygcs,tscsbgl,tscwlglpmc,tbzgcs,tjswdgcs,tzgcsfzgcs,tscwy,tscgd,tqtscglyy,tccmcxcccg,tmjg,tqgjxgzjg,tdhgmhg,tdg,tsgmgyqg,tccccg,tkdgdtgglg,tzzg,tbzg,tdlxlg,tsyg,tybg,tddg,tpsg,tdcsjkcsj,tqxg,twg,tgjg,twng,tptjgczg,txtg,tqtjgczg,tdzdqyf,tdzdqgyzc,tdzdqsbgcs,tdzdqwxby,tdzdqxmgl,tdzgcs,tdqgcs,tdqsj,txljgsj,tbdtjs,tyqybjlgcs,tzdhgcs,txcyygcsfae,tcskkxgcs,tdsyxgcs,tdlgcs,tmndlsjyy,tbtsj,tjcdlsjyy,ticyz,tdzyqjgcs,tspgcs,twxdgcs,tjggdzjs,tgyzmgcs,tbyqycdgcs,tdcdykf,tjydqsmcpyf,tkdgcsj,typspgcs,tafxtgcs,tqtdzdqbdtyqyb,tgcjxjl,tjxsbjl,tjxgcs,tjxsjs,tjxzty,tjxyfgcs,tjxjggcs,tjxgyzcgcs,tqdgcs,tcncskgcs,tmjgcs,tjjgcs,tzsgcs,tzzdzgcs,tjdgcs,tclgcs,tjxwxby,tfjsjyzz,tfjwxby,tlcsjyzz,tlcwxby,tcbsjyzz,tcbwxby,tjxzzjsyf,tjxzzcpch,tjxzzxmgl,tjxzzsysgcs,tgygcs,tjxwxjl,tjxzpgcs,thjgcs,tcygcs,tglgcs,tgfxtgcs,tqcmtcgcs,tgdjtgcs,tskcz,tskbc,tjxzzwsjc,tffblcz,tgzgcs,tqtjxsjzzwx,tqcdlxtgcs,tqcdpzzgcs,tcssjgcs,tqcdzgcs,tqcjxgcs,tqclbjsjs,tqczpgygcs,tqcaqxngcs,tqcgcxmgl,tqcjggcs,tqcdg,tqczzshfwkhfw,tjyzjqzcdzfw,tfdjzzgcs,tqtqczzyw,tqczcxs,tqclpjxs,tqc4sdfwgl,tqc4sdshfwkhfw,tqcwxby,tqczlgljyjc,tqcdscxlp,tqcqxmrzs,tescpgs,tqtqcxsfw,tyyxmgl,tyyxmztb,tswgcswzy,typyf,tylqxyf,tyyjsyf,tlcyjy,tlcxdy,tlcsjfxy,tyyhxfx,typzc,tylqxzc,typsczlgl,tylqxsczlgl,tylqxwxby,tlctgjl,tyyjsyfry,tyyxs,typsctg,tylqxxs,tylqxtg,tyyxstg,tyyzs,tqtswzyylqx,thggcs,thgyfgcs,thxfx,thxjsyy,thxcz,thxzjyf,tyqhgtlyf,tslgcs,thxsysyjy,thgxmgl,txjgcs,thgpsjsy,thzpyf,tzzyf,thxhgjszj,tqthgyw,tfzfzpgsj,tfzdyzb,tfzfzpggys,tdnfmy,tcc,tyyg,tmlflkfcg,tfzfzpggd,tfzfzpgzlgl,tfzfzpgxmgl,tfzfzpgxs,tzyscbs,tcjg,tfrg,tfzgzzg,tfzfzpsg,tyrg,tprg,tdcg,tjsg,tzjg,txsg,tqtfzfzpgsjscyw,tsytrqgzz,tkdrngzz,thlhlgzz,tslsdgzz,tdlgzz,tdzkcxkck,tnykcxmgl,tdlxtyfgcs,tdldzyfgcs,tkzbhyfgcs,tqtnykcdzkcyw,thbjsgcs,thjpjgcs,thjjcgcs,tsclgcs,tgfclgcs,tfqclgcs,tstzlgh,thjglyljqbh,tqthjhb,tnys,tlys,tyys,txms,tdwyzyz,tdwyyslyf,tslxs,tncpxs,tqtnlmyyw,tcgzyjlzj,tgyskf,tgylgl,tgyscgzlgl,tms,tmyzyjlzj,tgjmyzyjlzj,tcgmyywgd,tbgy,tqtcgmyyw,twlycsj,tczcsj,tzzsj,tgjsc,tgjxt,tdtsc,tdtxt,ttlsc,ttlxtyg,tcbsc,tcbxt,thkkq,thkdq,thkxt,thkht,tqcjsjl,tfjcbjsjl,tjxfwgl,tclgly,tglsfy,tglxxqfw,tjyzjqzcdzfw,tqtjtysyw,twlzyjlzj,thydl,tyszg,tkdy,tsykylycz,tjzxyw,tbgy,tdzy,tckwlgl,tlhfjdb,twlccxmgl,tbyg,tjzxwh,tjzxcz,twlxs,tgylgl,thgswgl,twlddcl,tqtwlccyw,txsdbjlzj,tkhfwkhgx,txsgcs,tqdfxyw,tqyxsyw,txsywtz,tdkhxs,ttgyw,tdhxs,twlzxxs,txsywgd,tzsyw,tkhzxrxyyhjzx,twlzxkf,tsqshjszc,tqtxssqshyw,tzlgly,tzljycsy,thyjyy,trztxshygcs,thjjkaqjlgcs,tgyscgzlgl,taqxfgl,tkkdgcs,tgzfxgcs,tqtzlaqglyw,tggcysj,tggwach,tggmszd,tggzzzx,tggkhdbjlzj,tgghzywtz,thzchsj,thwzyjl,tgghzxmgl,tqyywfzjl,tqtgghzyw,tsczyjlzj,tscywtz,tcpzyjlzj,tppgl,tlsjmyw,tscchqhwa,tschdzx,tcxyw,twztgseosem,txztzxdkf,tsctl,tzxgwjlzj,tzxs,tfwy,tzxxmgl,tdyy,tsjxxfxs,tsmgk,tgszzfw,tgzyzkz,tqtscdyzxssyw,txsxz,txsyy,tswzyjl,txspxs,txssjfx,tywfx,tqtswxsxzyw,tggdbjlzj,tmjdbjlzj,tmjch,tmjhdzx,tzfswgl,tqtggmjyw,tcwzyjlzj,tcwfx,thjshjry,tcny,tcbgl,tzczjgl,ttjy,tsjssjry,tswsswry,tpgspgry,trlzyzyjlzj,tygpx,tygzp,txcfl,tjxkh,tyggxqywh,tqypxsjs,tltgw,tqtrlzyyw,txzzyjlzj,twyms,tqtjd,twdzlgl,tdzlry,ttsgly,tdgtsw,thqbz,tbabw,tqtxzyw,tzcceofzc,tqyjgzzfzr,tbmglfzr,tzcmszl,tdmtzzgx,tdsjs,tcsrhhr,tqtgjgl,tyyfy,tfyfy,tryfy,tdyfy,teyfy,txbyyfy,tydlyfy,tptyyfy,talbyfy,thyfy,tqtyzfy,tyeyjs,txxjs,tczjs,tgzjs,tzyjsjs,tdxjs,tdxjshou,ttsjyjs,tzjyjjgls,tcgzxwfdls,tzyzznlpxs,tseyypxs,tcryypxs,twjjs,tslqljs,twdjs,tshjs,tysljs,tqypxsjs,tzxjnpxs,tjxjwgl,tzjyjjgyy,txwfdjgyy,tcrpxjgyy,tzskcgwxjgw,tjycpkf,ttsggl,tqtjypxyw,tfgjcg,tsjy,tqyfw,tqyhg,tssls,tfsls,tgzy,tzscqgwdlr,tzcy,tdjy,tqtflyw,tdy,tbj,tzpr,tysyy,tqzyy,twtjyy,twdyy,tqyby,txqby,tzjjqby,tqtby,tpyyy,tgssl,tqlyz,thshj,tsfj,tsgyj,twhccr,tzjsrzgr,tbyzc,txczcsy,tmt,tspzb,twlhr,tjjr,tyszdwmsj,tbylyssjzj,tsyssxs,thzszxs,tfzdj,tdgs,tyxs,tyxiaos,thqzz,tbfgl,tyswyxmch,tyswyxmzz,tyswyxmyytg,tyswyxmfw,tzyydy,ttyssxmzzyy,ttyssxmfw,tqtyswtmtyw,tbddb,tjzcb,ttpjz,tzjsrzgr,tzbfzb,twzbjzg,tmsbjmssj,twach,txdlr,tfxgl,tpbsj,tyspbzb,tyscz,tbjcb,tdsy,ttjg,tsby,tzdy,tsmzyflsc,tdmjs,tdfcz,tdgjcz,tqzjcz,tzjy,tfjy,tyhy,tysjjxc,tqtxwcbysyw,thshj,tsfj,tsgyj,twhccr,tyssjzj,tpmsj,tcadsjzt,tsw3dsjzz,tflashsjzz,ttxsj,tsjsj,tyhtyueuxsj,tuisj,tmsbjmssj,tdmtdhsj,tbzsj,tjjsj,tjjypsj,tgypzbsj,twjsj,tdmzlzsclsj,tsnzxsj,tgysj,tyljgsj,tqtyssj,tsccsgl,tspzlgl,tshydgy,tsccssyy,tlhy,tsccscxzgdd,tplgl,tfsynb,tqtsccsfw,tjdgl,tjdqtjdyb,tjdqt,txly,tdtjllb,tkfgl,tkffwy,tqtjdfw,tjdssy,tkzmsjy,tqtsccsjdzsyw,tjsmtkcjl,tydjnjl,tamszls,tzjstns,tmrs,tmjs,tmrmtgw,tfxshfyf,thyzmhjgw,tjsydcgfwgl,tbjmrmfhsfwgl,tqtbjjsmrmf,tlycpxs,tlygw,tlyjhdd,tlycpxlch,tqzywbl,tdyou,tcgjjy,tgyylbyyy,tdwxys,tgybwgfwgl,tyjyfwgl,txxylcgfwgl,tqtlyxxyl,tzhmzqkys,tnkys,twkys,tekys,tykys,tmrzxkys,tzyys,tmzys,txlys,tyankys,tzkys,tyxyxfskys,thyjykys,tyfglyjs,tlls,tyingyangs,tzjstns,tygs,tggwsjbkz,thlhsry,thlhsc,tylglry,tyyyc,tsy,tcwhl,tqtyyylhl,tgjcsxzzc,tzccs,txccs,tmdsxds,tcszl,tspjgcl,tpjs,tdjs,tcyyps,tkfs,tyys,tmspl,tctfw,tjbsbkftfw,tdgffw,txcmslsfw,tscywsy,tspylyf,tspyljy,tcydjygl,tscfw,tqtpzcysp,thlch,thlzc,thsyssy,thqzbfw,tyjdfw,tygs,tetqzhdfw,txhlzhdfw,tbldgsdfw,tbmhlkh,tgj,tscfw,tsqba,ttpsfydys,tszfw,txyfw,txpxlyh,tbjfw,tjdzbwx,tsjwx,tsdqjjwxaz,tbjbyfw,tcwhl,tqtshjjfw,trdxt,tzxxt,tfyxt,tjcyxt,tjwxt,twjxt,tfgxt,tjyxt,tkjxt,tgxxt,tgaxt,tjcxt,tmzxt,tczxt,trsxt,tgtzyxt,thbxt,tcjxt,tjtxt,tslxt,tnyxt,tswxt,twhxt,trxxt,tgzxt,thgxt,tgsxt,ttyxt,tajxt,tsyjxt,ttjxt,tlyxt,tzscqxt,tlyouxt,tzjxt,tgatxt,tyjxt,tzjianxt,tbjxt,tdzxt,tqxxt,txfxt,tlsxt,tnyuanxt,tycxt,thyxt,tchdxxt,ttlxt,tmhxt,tyzxt,twwxt,tyyxt,tqtjgsydw,tlj,thj,tkj,tep,twjnwbd,tslhjsdjtbd,tbfbd,txfbd,tjwbd,tzaxzhjjc,tjtjc,tsfaqjc,tqtjrjc,tzrkxlyjyxz,tzxshkxlyjyxz,tkxyjlstgzz,tgsfwlstgzz,tnylstgzz,tjylstgzz,twslstgzz,twhlstgzz,ttylstgzz,tsthjlstgzz,tshfwlstgzz,tgycslstgzz,tfllstgzz,tzjlstgzz,tzycyzzzgzz,tgjjswzzgzz,tqtshttgzz,tshgzz,tzyfwz,tqtkygyshtt,tczs,tgzs,tzks,tbks,tyjs,tbss,tzglxs,twglhlxs,tzxyx,tjjxyx,tfxyx,tjyxyx,twxyyyx,tlsxyx,tlxyx,tgxyx,tnxyx,tyxyx,tglxyx,tjsxyx,tlxjtxj,tjtzf,tzyzyz,tqtzy";
    static String  stringzhs = "WEBǰ�˿���";//,IOS����,Android����,Java����,PHP����,C���Կ���,�ű�����,�������ʦ,Ӳ������ʦ,���󹤳�ʦ,ϵͳ�ܹ����ʦ,���ݿ�������ʦ,ERP����/����Ӧ��,����/��Ƶ/ͼ�ο���,UI���,�û����飨UE/UX���/,��ҳ���,��Ϸ��ƿ���,��Ϸ�߻�,��Ϸ�������,ϵͳ���ɹ���ʦ,�㷨����ʦ,����Ӧ�ù���ʦ,������������ʦ,��վ�ܹ����ʦ,���Թ���ʦ,�������/Ӳ��/����������,��������ƷרԱ/����/�ܼ�,��������רԱ/����/�ܼ�,��������Ʒ��Ӫ,�������г���Ӫ,������������Ӫ,��վ�༭,��վ�ƹ�/SEO/SEM,��ý����Ӫ,����΢����Ӫ,������������Ʒ/��Ӫ����,IT����/�з�רԱ/����/�ܼ�,IT��ĿЭ��רԱ/����/�ܼ�,IT��������,ITרԱ/����,���ù���,��Ϣ������׼��,ϵͳ����,�������,��Ϣ��ȫ����,���ݿ����,Ӳ��ά��,����IT����/��ĿЭ��/��ά/����,ͨ�ż���,ͨ���з�,����ͨ��,�ƶ�ͨ��,��������,���Ž���,���ߴ���,����/��Ƶͨ��,ͨ�ŵ�Դ,ͨ�ű�׼��,ͨ����Ŀ����,ͨ����ֵ��Ʒ����,��������/ͨ�ż���,���ز���Ŀ�߻�,���ز���Ŀ��Ͷ��,���ز���Ŀ��������,���ز���Ŀ���׹���ʦ,һ�ַ��ز�����,���ַ��ز�����/����,���ز��곤,���ز�����,���ز����,���ز���Ŀ����,���ز��ʲ�����,�������ز�����/����,��������ʦ,�������ʦ,��ľ/����/�ṹ����ʦ,��������,������ͼ,�������̲��/����,��·/����/������̼���,ˮ��/�ۿڹ��̼���,����/�ܵ����̼���,����ˮ/ůͨ,�յ�����/���,����¥��/����/����/����,���й滮���,��������ʦ,���̼���/��������,�������/Ԥ����,����ʩ���ֳ�����,ʩ��Ա,�������̰�ȫ����,¥��װ�����,Ļǽ����ʦ,԰��/�������,����װ�����,���������,װ�޶Ӹ�����,�繤,ˮ��/ľ��/���Ṥ,�߹�,������ľ/����/��������/װ�����,��ҵ����,��ҵ����/����,��ҵ���̹���,��ҵ����/����,��ҵά��,��ҵ���ά��,������ҵ����,���о���/�г�,���þ���,���пͻ�����/����/�ܼ�,���пͻ�����,�ۺ�ҵ��,��˾ҵ��,����ҵ��,���л��/��Ա,���п�/��������ҵ���ƹ�,�Ŵ�����/��������,����˲�,��㽻��,������/����֤����,��������ҵ��,���з��չ���/����,��������ҵ��,֤ȯ/�ڻ�/��㾭����,֤ȯ/Ͷ�ʿͻ�����/����/�ܼ�,֤ȯ����/�����о�,Ͷ����ƽ��ڷ���,Ͷ������ҵ��,Ͷ�����в������,����רԱ/����/�ܼ�,��Ʊ/�ڻ�������,�ʲ�����,���չ���/����/����,֤ȯͶ����Ŀ����,����/�����о�Ա,���ڲ�Ʒ����,���ڲ�Ʒ����,������Ŀ����,��������,��������Ͷ��ҵ��,����ҵ�����,������Ŀ�����߻�,������ѵʦ,���մ���/������,���չ���/����滮ʦ,������Լ����,�˱�����,��������/��������,���վ���ʦ,�������ڹ���/�ͻ�����,��������/����,���պ˰�,��������ҵ��,����ҵ��,����ҵ��,����ҵ��,�䵱ҵ��,�鱦/��Ʒ����,������Ӫ����,������Ŀ����,������Ŀ����ʦ,�����ƻ�,������Ʒ����,���칤��ʦ,����/�Ƴ̹���ʦ,��ҵ����ʦ,�����豸����,�������Ϲ���PMC/,��װ����ʦ,�����ĵ�����ʦ,�ܹ���ʦ/���ܹ���ʦ,������Ա,��������,������������/��Ӫ,����/ĥ��/ϳ��/�崲��,ģ�߹�,ǯ��/���޹�/�ӽ�,�纸��/í����,�繤,ˮ��/ľ��/���Ṥ,����/�泵��,�յ���/���ݹ�/��¯��,��װ��,��װ��,������·��,ʩѹ��,�Ǳ�,��ƹ�,���ܹ�,����˾��/����˾��,��ϴ��,�߹�,�ֽ,���ܹ�,��ͨ����/������,ѧͽ��,��������/������,����/�����з�,����/��������/�Ƴ�,����/�����豸����ʦ,����/����ά��/����,����/������Ŀ����,���ӹ���ʦ,��������ʦ,�������,��·�ṹ���,�뵼�弼��,����/�Ǳ�/��������ʦ,�Զ�������ʦ,�ֳ�Ӧ�ù���ʦ��FAE/,����/�ɿ��Թ���ʦ,����/���칤��ʦ,��·����ʦ,ģ���·���/Ӧ��,��ͼ���,���ɵ�·���/Ӧ��,IC��֤,����Ԫ��������ʦ,��Ƶ����ʦ,���ߵ繤��ʦ,����/����Ӽ���,��Դ/��������ʦ,��ѹ����ŵ繤��ʦ,���/��Դ����,���õ���/�����Ʒ�з�,�յ�����/���,��Ƶ/��Ƶ����ʦ,����ϵͳ����ʦ,��������/����/�뵼��/�����Ǳ�,���̻�е����,��е�豸����,��е����ʦ,��е���ʦ,��е��ͼԱ,��е�з�����ʦ,��е�ṹ����ʦ,��е����/�Ƴ̹���ʦ,��������ʦ,CNC/���ع���ʦ,ģ�߹���ʦ,�о߹���ʦ,ע�ܹ���ʦ,����/���칤��ʦ,���繤��ʦ,���Ϲ���ʦ,��еά��/����,�ɻ����������,�ɻ�ά��/����,�г����������,�г�ά��/����,�������������,����ά��/����,��е/���켼���з�,��е/�����Ʒ�߻�,��е/������Ŀ����,��е/����ʵ���ҹ���ʦ,��ҵ����ʦ,��еά�޾���,��еװ�乤��ʦ,���ӹ���ʦ,��ѹ����ʦ,��¯����ʦ,���ϵͳ����ʦ,����/Ħ�г�����ʦ,�����ͨ����ʦ,���ز���,���ر��,��е/����������,������������,��װ����ʦ,������е���/����/ά��,��������ϵͳ����ʦ,��������/��װ����ʦ,������ƹ���ʦ,�������ӹ���ʦ,������е����ʦ,�����㲿�����ʦ,����װ�乤�չ���ʦ,������ȫ���ܹ���ʦ,����������Ŀ����,������������ʦ,�����繤,���������ۺ����/�ͻ�����,����վ/����վ/���վ����,������/��װ����ʦ,������������ҵ��,������������,�������������,����4S��������,����4S���ۺ����/�ͻ�����,����ά��/����,������������/������,��������/��������,������ϴ/����/װ��,���ֳ�����ʦ,������������/����,ҽҩ��Ŀ����,ҽҩ��Ŀ��Ͷ��,���﹤��/������ҩ,ҩƷ�з�,ҽ����е�з�,ҽҩ�����з�,�ٴ��о�Ա,�ٴ�Э��Ա,�ٴ����ݷ���Ա,ҽҩ��ѧ����,ҩƷע��,ҽ����еע��,ҩƷ����/��������,ҽ����е����/��������,ҽ����еά��/����,�ٴ��ƹ㾭��,ҽҩ�����з���Ա,ҽҩ����,ҩƷ�г��ƹ�,ҽ����е����,ҽ����е�ƹ�,ҽҩѧ���ƹ�,ҽҩ����,����/����/��ҩ/ҽ����е,��������ʦ,�����з�����ʦ,��ѧ����,��ѧ����Ӧ��,��ѧ����,��ѧ�Ƽ��з�,����/����Ϳ���з�,���Ϲ���ʦ,��ѧʵ�����о�Ա,������Ŀ����,�𽺹���ʦ,������ɫ����Ա,��ױƷ�з�,��ֽ�з�,��ѧ/���������ܼ�,��������ҵ��,��װ/��֯/Ƥ�����,��װ����/�ư�,��װ/��֯/Ƥ�﹤��ʦ,���Է���Ա,�ô�,���¹�,���ϸ��Ͽ���/�ɹ�,��װ/��֯/Ƥ�����,��װ/��֯/Ƥ����������,��װ/��֯/Ƥ����Ŀ����,��װ/��֯/Ƥ������,ֽ��ʦ/����ʦ,�ü���,���ҹ�,��֯��/��֯��,��װ��֯��ɫ��,ӡȾ��,ƯȾ��,������,��ɴ��,������,ϸɴ��,������װ/��֯/Ƥ�����/����ҵ��,ʯ��/��Ȼ��������,�յ�/���ܹ�����,����/����������,ˮ��/ˮ�繤����,����������,��ַ����/ѡ��/�ɿ�,��Դ/�����Ŀ����,����ϵͳ�з�����ʦ,���������з�����ʦ,���Ʊ����з�����ʦ,������Դ/���/��ַ����ҵ��,������������ʦ,�������۹���ʦ,������⹤��ʦ,ˮ������ʦ,�̷ϴ�����ʦ,����������ʦ,��̬����/�滮,��������/԰�־�������,��������/����,ũ��ʦ,��ҵʦ,԰��ʦ,����ʦ,��������/��ֳ,����Ӫ��/�����з�,��������,ũ��Ʒ����,����ũ/��/��/��ҵ��,�ɹ�רԱ/����/�ܼ�,��Ӧ�̿���,��Ӧ������,��Ӧ��/�ɹ���������,����,ó��רԱ/����/�ܼ�,����ó��רԱ/����/�ܼ�,�ɹ�/ó��ҵ�����,����Ա,�����ɹ�/ó��ҵ��,����Լ��˾��,���⳵˾��,רְ˾��,����˾��,����ϵͳ,����˾��,����ϵͳ,��·˾��,��·ϵͳ,����˾��,����ϵͳ,���տ���,���յ���,����ϵͳ,���պ���,������ʻ����,�ɻ�������ʻ����,��У�������,��������Ա,��·�շ�Ա,��·��Ϣ������,����վ/����վ/���վ����,������ͨ����ҵ��,����רԱ/����/�ܼ�,���˴���,��������,���Ա,ˮ��/����/½�˲���,��װ��ҵ��,����Ա,��֤Ա,�ֿ�/���Ϲ���,���/�ּ�/���,����/�ִ���Ŀ����,���˹�,��װ��ά��,��װ�����,��������,��Ӧ������,�����������,������������,��������/�ִ�ҵ��,���۴���/����/�ܼ�,�ͻ�����/�ͻ���ϵ,���۹���ʦ,����/����ҵ��,��������ҵ��,����ҵ����չ,��ͻ�����,�Ź�ҵ��,�绰����,����/��������,����ҵ�����,����ҵ��,�ͻ���ѯ����/������������,����/���߿ͷ�,��ǰ/�ۺ���֧��,��������/��ǰ�ۺ�ҵ��,��������Ա,��������/����Ա,����/����Ա,��֤/��ϵ���Ա/����ʦ,����/����/��ȫ����/����ʦ,��Ӧ��/�ɹ���������,��ȫ��������,�ɿ��ȹ���ʦ,���Ϸ�������ʦ,��������/��ȫ����ҵ��,��洴�����,����İ��߻�,�������ָ��,�������ִ��,���ͻ�����/����/�ܼ�,���/��չҵ����չ,��չ�߻����,����רԱ/����,���/��չ��Ŀ����,��ҵ/ҵ��չ����,�������/��չҵ��,�г�רԱ/����/�ܼ�,�г�ҵ����չ,��ƷרԱ/����/�ܼ�,Ʒ�ƹ���,����/����ҵ��,�г��߻�/��/�İ�,�г��ִ��,����ҵ��,��վ�ƹ�/SEO/SEM,ѡַ��չ/�µ꿪��,�г�ͨ·,��ѯ����/����/�ܼ�,��ѯʦ,����Ա,��ѯ��Ŀ����,����Ա,������Ϣ����ʦ,���ع˿�,����֤�շ���,����/ӡ�¿���,�����г�/����/��ѯ/����ҵ��,��������,������Ӫ,����רԱ/����,������ѵʦ,�������ݷ���,ҵ�����,��������/��������ҵ��,���ش���/����/�ܼ�,ý�����/����/�ܼ�,ý��߻�,ý��ִ��,�����������,��������/ý��ҵ��,����רԱ/����/�ܼ�,�������,���ʦ/�����Ա,����Ա,�ɱ�����,�ʲ�/�ʽ����,ͳ��Ա,���ʦ/�����Ա,˰��ʦ/˰����Ա,����ʦ/������Ա,������ԴרԱ/����/�ܼ�,Ա����ѵ,Ա����Ƹ,н�긣��,��Ч����,Ա����ϵ/��ҵ�Ļ�,��ҵ��ѵʦ/��ʦ,��ͷ����,����������Դҵ��,����רԱ/����/�ܼ�,��Ա/����,ǰ̨/�Ӵ�,�ĵ����Ϲ���,����/¼��Ա,ͼ�����Ա,����������,���ڱ���,��������,��������ҵ��,�ܲ�/CEO/���ܲ�,��ҵ/����/��֯������,���Ź�������,�ܲ�����/����,����/Ͷ���߹�ϵ,����/����,��ʼ��/�ϻ���,�����߼�����,Ӣ�﷭��,���﷭��,���﷭��,���﷭��,���﷭��,�������﷭��,������﷭��,�������﷭��,�������﷭��,���﷭��,�������ַ���,�׶�԰��ʦ,Сѧ��ʦ,���н�ʦ,���н�ʦ,ְҵ������ʦ,��ѧ��ʦ,��ѧ����,���������ʦ,���/�׽̻�����ʦ,������У�⸨����ʦ,ְҵ����������ѵʦ,�ٶ�Ӣ����ѵʦ,����Ӣ����ѵʦ,�⼮��ʦ,�������ֽ�ʦ,�赸��ʦ,�黭��ʦ,�������ʦ,��ҵ��ѵʦ/��ʦ,ר�����ѵʦ,��ѧ/�������,���/�׽̻�����Ӫ,У�⸨��������Ӫ,������ѵ������Ӫ,����/�γ̹���/ѧ������,������Ʒ����,ͼ��ݹ���,��������/��ѵҵ��,����/����,���Ա,��ҵ����,��ҵ�Ϲ�,������ʦ,������ʦ,��֤Ա,֪ʶ��Ȩ����/������,�ٲ�Ա,����Ա,��������ҵ��,����,���,��Ƭ��,Ӱ����Ա,Ⱥ����Ա,��̨����Ա,�赸��Ա,���ձ���,Ϸ������,�Ӽ����ɱ���,��������,������Ա,����/����,��������,��ʦ/����,�鷨��,�ֹ��ռ�,�Ļ�������,����/ʫ��/׫����,��������,�ֳ�����/˾��,ģ��,��Ƶ����,�������,������,����ָ��/�������,����������/����ܼ�,��Ӱʦ/����ʦ,��ױʦ/����ʦ,��װ/����,�ƹ�ʦ,����ʦ,��Чʦ,��������,���Ź���,Ӱ��������Ŀ�߻�,Ӱ��������Ŀ����,Ӱ��������Ŀ��Ӫ�ƹ�,Ӱ��������Ŀ����,רҵ�˶�Ա,����������Ŀ��֯��Ӫ,����������Ŀ����,����Ӱ��/����/ý��ҵ��,�ർ/����,����/�ɱ�,ͼƬ����,����/ʫ��/׫����,�ܱ�/���ܱ�,���ֱ༭/���,�����༭/�������,�İ��߻�,У��/¼��,���й���,�Ű����,ӡˢ�Ű�/�ư�,ӡˢ����,�༭����,��ɫԱ,�̽�,ɹ��Ա,װ��Ա,����ֱӡ/�������,��ī��ʦ,��ֲ���,��������,��ֽ������,�ѽ�Ա,����Ա,ѹ��Ա,ӡˢ����е��,��������/����/ӡˢҵ��,��ʦ/����,�鷨��,�ֹ��ռ�,�Ļ�������,����/����ܼ�,ƽ�����,CAD���/��ͼ,��ά/3D�������,Flash���/����,��Ч���,�Ӿ����,�û����飨UE/UX���/,UI���,�����༭/�������,��ý��/�������,��װ���,�Ҿ����,�Ҿ���Ʒ���,����Ʒ/�鱦���,������,����/չ��/չʾ/�������,����װ�����,��ҵ���,԰��/�������,��������/���,�̳�/���й���,��Ʒ��������,�ۻ�Ա/����Ա,�̳�/��������Ա,���Ա,�̳�/���д�������/����,Ʒ�����,����Ա/�ڱ�,�����̳�/���з���,�Ƶ����,�Ƶ�ǰ���Ӵ�/ӭ��,�Ƶ�ǰ̨,����Ա,���þ���/���,�ͷ�����,�ͷ�����Ա,�����Ƶ����,�Ƶ���˯Ա,��ջ/���޾�Ӫ,�����̳�/����/�Ƶ�ס��ҵ��,����/����/�γ̽���,�˶�/���ܽ���,��Ħʦ/����ʦ,���ʦ/����ʦ,����ʦ,����ʦ,�����������,����ʦ/��������,��Ա��ļ/�Ἦ����,�����˶����ݷ������,�����������������������,��������/����/����/����,���β�Ʒ����,���ι���,���μƻ�����,���β�Ʒ/��·�߻�,ǩ֤ҵ�����,����,�ι۽���Ա,��԰���ֱ�����Ա,����ѱ��ʦ,��԰/����ݷ������,Ӱ��Ժ�������,�������ֳ��ݷ������,��������/����/����,�ۺ�����/ȫ��ҽ��,�ڿ�ҽ��,���ҽ��,����ҽ��,����ҽ��,�������ο�ҽ��,��ҽҽ��,����ҽ��,����ҽ��,�ۿ�ҽ��,ר��ҽ��,ҽѧӰ��/�����ҽʦ,����/�����ҽʦ,ҩ������/ҩ��ʦ,����ʦ,Ӫ��ʦ,���ʦ/����ʦ,���ʦ,��������/��������,����/��ʿ��Ա,����/��ʿ��,ҽ�ƹ�����Ա,ҽԺԺ��,��ҽ,���ﻤ��,����ҽԺ/ҽ��/����,�߼���ʦ/��������,�вͳ�ʦ,���ͳ�ʦ,���ʦ/����ʦ,��ʦ����,ʳƷ�ӹ�/����,Ʒ��ʦ,����ʦ,����/��Ʒʦ,����ʦ,Ӫ��ʦ,��ʳ����,��������,�ư�ˮ�ɿ���������,���ⷿ����,С����ʳ���۷���,�Ͳ�Ա/����Ա,ʳƷ/�����з�,ʳƷ/���ϼ���,�����꾭Ӫ����,˽������,�������/����/ʳƷ,����߻�,��������,��ɴ/������Ӱ,�����ܱ߷���,�۾������,���ʦ,��ͯ/���ӻ����,�ʻ���ֲ/�������,������/���ߵ����,��ķ/����/����,�ܼ�,˽������,��������,ͼƬ��/��ӡ��ӡ��,ˮվ����,ϴ�·���,ЬƷ��������,�������,�ҵ�/�ӱ�ά��,�ֻ�ά��,ˮ�����Ҿ�ά�ް�װ,���/���˷���,���ﻤ��,��������/�Ҿӷ���,�˴�ϵͳ,��Эϵͳ,��Ժϵͳ,���Ժϵͳ,��ίϵͳ,�⽻ϵͳ,����ϵͳ,����ϵͳ,�Ƽ�ϵͳ,����ϵͳ,����ϵͳ,���ϵͳ,����ϵͳ,����ϵͳ,����ϵͳ,������Դϵͳ,����ϵͳ,�ǽ�ϵͳ,��ͨϵͳ,ˮ��ϵͳ,ũҵϵͳ,����ϵͳ,�Ļ�ϵͳ,����ϵͳ,����ϵͳ,����ϵͳ,����ϵͳ,����ϵͳ,����ϵͳ,ʳҩ��ϵͳ,ͳ��ϵͳ,��ҵϵͳ,֪ʶ��Ȩϵͳ,����ϵͳ,�ڽ�ϵͳ,�۰�̨ϵͳ,����ϵͳ,֤��ϵͳ,����ϵͳ,����ϵͳ,����ϵͳ,�ŷ�ϵͳ,��ʳϵͳ,��Դϵͳ,�̲�ϵͳ,����ϵͳ,������ϵͳ,��·ϵͳ,��ϵͳ,����ϵͳ,����ϵͳ,ҽԺϵͳ,��������/��ҵ��λ,½��,����,�վ�,����,�侯��������,ɭ��/�ƽ�/ˮ��/��ͨ����,�߷�����,��������,��������,�ΰ�/����/��������,��ͨ����,˾��/��ȫ����,��������/����,��Ȼ��ѧ���о�Ա/ѧ��,��ѧ����ѧ���о�Ա/ѧ��,��ѧ�о������Ź�����,���̷��������Ź�����,ũҵ�����Ź�����,���������Ź�����,���������Ź�����,�Ļ������Ź�����,���������Ź�����,��̬���������Ź�����,�����������Ź�����,������������Ź�����,���������Ź�����,�ڽ������Ź�����,ְҵ/��ҵ����֯������,���ʼ�������֯������,����������幤����,��Ṥ����,־Ը������,��������/����/�������,������,������,ר����,������,�о���,��ʿ��,�й���ѧ��,���������ѧ��,��ѧԺϵ,����ѧԺϵ,��ѧԺϵ,����ѧԺϵ,��ѧ����Ժϵ,��ʷѧԺϵ,��ѧԺϵ,��ѧԺϵ,ũѧԺϵ,ҽѧԺϵ,����ѧԺϵ,����ѧԺϵ,���м�/̽�ռ�,��ͥ����,����ְҵ��,����ְҵ";
	
	
	public static void main(String ...args) {
		
		String names[] = string.split(",");
		
		
		int i=0;
		for(String name:names){
//			String newName = name.split("/")[0];
			String newName = name.replaceAll("/", "");
			newName = newName.replaceFirst("test", "t");
			System.out.println(i+":" + newName);
			names[i] = newName;
			i++;
		}

		int m = 0;
		int cnt = 0;
	    List<String> listUsers = new ArrayList<String>();
		listUsers= Arrays.asList(names);
		for (String string : names) {
			for(int n=0;  n<names.length && m< names.length; n++ ){
				if (m!=n&&names[n].equals(string)) {
					cnt++;
//					System.out.println(cnt+"--" + m+":"+n+"���ظ��� is  "+ string);
				    listUsers.remove(n);
					System.out.println(string);
				}
			}
			m++;
		}
		
		InnerClassTest subClassTest = new InnerClassTest();
	    InnerClassTest.InnerClass innerClass = subClassTest.new InnerClass();
		System.out.println("");checkRepeat((String[]) listUsers.toArray());
		
		
		//test params addr
		ProduceTestNames produceTestNames = new ProduceTestNames();
		InnerCls cls = produceTestNames.new InnerCls();
		cls.a = 10;
		
		
		produceTestNames.paramRef(cls);
		
		System.out.println("after call cls.a =" + cls.a);
		
		
	}
	
	
	//�ж��������Ƿ����ظ�ֵ
	public static boolean checkRepeat(String[] array){
	  Set<String> set = new HashSet<String>();
	  for(String str : array){
	    set.add(str);
	  }
	  System.out.println("�ظ��˶�������" + (array.length - set.size()));
	  if(set.size() != array.length){
	    return false;//���ظ�
	  }else{
	    return true;//���ظ�
	  }
	}
	
	class InnerCls {
		int a = 0;
		
	}
	
	void paramRef(InnerCls icls){
		InnerCls cls = null;
		cls = icls;
		
		System.out.println("cls == icls ?" + (cls==icls?"yes":"no"));
		System.out.println("1 cls.a =" + cls.a);
		cls.a = icls.a++;
		System.out.println("2 cls.a =" + cls.a);
		
		icls = null;
		System.out.println("cls == icls ?" + (cls==icls?"yes":"no"));
	}

}
