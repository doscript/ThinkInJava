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
    static String  stringzhs = "WEB前端开发";//,IOS开发,Android开发,Java开发,PHP开发,C语言开发,脚本开发,软件工程师,硬件工程师,需求工程师,系统架构设计师,数据开发工程师,ERP技术/开发应用,语音/视频/图形开发,UI设计,用户体验（UE/UX设计/,网页设计,游戏设计开发,游戏策划,游戏界面设计,系统集成工程师,算法工程师,仿真应用工程师,计算机辅助设计师,网站架构设计师,测试工程师,其他软件/硬件/互联网开发,互联网产品专员/经理/总监,电子商务专员/经理/总监,互联网产品运营,互联网市场运营,互联网内容运营,网站编辑,网站推广/SEO/SEM,新媒体运营,网店微商运营,其他互联网产品/运营管理,IT技术/研发专员/经理/总监,IT项目协调专员/经理/总监,IT质量管理,IT专员/经理,配置管理,信息技术标准化,系统管理,网络管理,信息安全管理,数据库管理,硬件维护,其他IT管理/项目协调/运维/配置,通信技术,通信研发,数据通信,移动通信,电信网络,电信交换,有线传输,无线/射频通信,通信电源,通信标准化,通信项目管理,通信增值产品开发,其他电信/通信技术,房地产项目策划,房地产项目招投标,房地产项目开发报建,房地产项目配套工程师,一手房地产销售,二手房地产销售/经纪,房地产店长,房地产评估,房地产监察,房地产项目管理,房地产资产管理,其他房地产开发/经纪,建筑工程师,建筑设计师,土木/土建/结构工程师,岩土工程,建筑制图,建筑工程测绘/测量,道路/桥梁/隧道工程技术,水利/港口工程技术,架线/管道工程技术,给排水/暖通,空调工程/设计,智能楼宇/布线/弱电/安防,城市规划设计,市政工程师,工程监理/质量管理,工程造价/预决算,建筑施工现场管理,施工员,建筑工程安全管理,楼宇装潢设计,幕墙工程师,园林/景观设计,室内装修设计,橱柜类设计,装修队负责人,电工,水工/木工/油漆工,瓦工,其他土木/建筑/市政工程/装修设计,物业管理,物业顾问/经理,物业招商管理,物业租赁/销售,物业维修,物业监控维护,其他物业管理,银行经理/行长,大堂经理,银行客户代表/经理/总监,银行客户服务,综合业务,公司业务,个人业务,银行会计/柜员,银行卡/电子银行业务推广,信贷管理/资信评估,信审核查,外汇交易,进出口/信用证结算,银行清算业务,银行风险管理/控制,其他银行业务,证券/期货/外汇经纪人,证券/投资客户代表/经理/总监,证券分析/金融研究,投资理财金融服务,投资银行业务,投资银行财务分析,融资专员/经理/总监,股票/期货操盘手,资产评估,风险管理/控制/稽查,证券投资项目管理,金融/经济研究员,金融产品经理,金融产品销售,基金项目经理,金融租赁,其他金融投资业务,保险业务管理,保险项目开发策划,保险培训师,保险代理/经纪人,保险顾问/财务规划师,保险契约管理,核保理赔,汽车定损/车险理赔,保险精算师,保险续期管理/客户服务,保险销售/电销,保险核安,其他保险业务,信托业务,担保业务,拍卖业务,典当业务,珠宝/藏品鉴定,生产运营管理,生产项目管理,生产项目工程师,生产计划,生产产品管理,制造工程师,工艺/制程工程师,工业工程师,生产设备管理,生产物料管理（PMC/,包装工程师,技术文档工程师,总工程师/副总工程师,生产文员,生产跟单,其他生产管理/运营,车床/磨床/铣床/冲床工,模具工,钳工/机修工/钣金工,电焊工/铆焊工,电工,水工/木工/油漆工,铲车/叉车工,空调工/电梯工/锅炉工,组装工,包装工,电力线路工,施压工,仪表工,电镀工,喷塑工,吊车司机/卡车司机,清洗工,瓦工,钢筋工,万能工,普通技工/操作工,学徒工,其他技工/操作工,电子/电器研发,电子/电器工艺/制程,电子/电器设备工程师,电子/电器维修/保养,电子/电器项目管理,电子工程师,电气工程师,电气设计,线路结构设计,半导体技术,仪器/仪表/计量工程师,自动化工程师,现场应用工程师（FAE/,测试/可靠性工程师,电声/音响工程师,电路工程师,模拟电路设计/应用,版图设计,集成电路设计/应用,IC验证,电子元器件工程师,射频工程师,无线电工程师,激光/光电子技术,光源/照明工程师,变压器与磁电工程师,电池/电源开发,家用电器/数码产品研发,空调工程/设计,音频/视频工程师,安防系统工程师,其他电子/电器/半导体/仪器仪表,工程机械经理,机械设备经理,机械工程师,机械设计师,机械制图员,机械研发工程师,机械结构工程师,机械工艺/制程工程师,气动工程师,CNC/数控工程师,模具工程师,夹具工程师,注塑工程师,铸造/锻造工程师,机电工程师,材料工程师,机械维修/保养,飞机设计与制造,飞机维修/保养,列车设计与制造,列车维修/保养,船舶设计与制造,船舶维修/保养,机械/制造技术研发,机械/制造产品策划,机械/制造项目管理,机械/制造实验室工程师,工业工程师,机械维修经理,机械装配工程师,焊接工程师,冲压工程师,锅炉工程师,光伏系统工程师,汽车/摩托车工程师,轨道交通工程师,数控操作,数控编程,机械/制造无损检测,浮法玻璃操作,工装工程师,其他机械设计/制造/维修,汽车动力系统工程师,汽车底盘/总装工程师,车身设计工程师,汽车电子工程师,汽车机械工程师,汽车零部件设计师,汽车装配工艺工程师,汽车安全性能工程师,汽车工程项目管理,汽车机构工程师,汽车电工,汽车制造售后服务/客户服务,加油站/加气站/充电站服务,发动机/总装工程师,其他汽车制造业务,汽车整车销售,汽车零配件销售,汽车4S店服务管理,汽车4S店售后服务/客户服务,汽车维修/保养,汽车质量管理/检验检测,汽车定损/车险理赔,汽车清洗/美容/装饰,二手车评估师,其他汽车销售/服务,医药项目管理,医药项目招投标,生物工程/生物制药,药品研发,医疗器械研发,医药技术研发,临床研究员,临床协调员,临床数据分析员,医药化学分析,药品注册,医疗器械注册,药品生产/质量管理,医疗器械生产/质量管理,医疗器械维修/保养,临床推广经理,医药技术研发人员,医药销售,药品市场推广,医疗器械销售,医疗器械推广,医药学术推广,医药招商,其他/生物/制药/医疗器械,化工工程师,化工研发工程师,化学分析,化学技术应用,化学操作,化学制剂研发,油漆/化工涂料研发,塑料工程师,化学实验室研究员,化工项目管理,橡胶工程师,化工配色技术员,化妆品研发,造纸研发,化学/化工技术总监,其他化工业务,服装/纺织/皮革设计,服装打样/制版,服装/纺织/皮革工艺师,电脑放码员,裁床,样衣工,面料辅料开发/采购,服装/纺织/皮革跟单,服装/纺织/皮革质量管理,服装/纺织/皮革项目管理,服装/纺织/皮革销售,纸样师/车版师,裁剪工,缝纫工,纺织工/针织工,服装纺织配色工,印染工,漂染工,挡车工,浆纱工,整经工,细纱工,其他服装/纺织/皮革设计/生产业务,石油/天然气工作者,空调/热能工作者,核力/火力工作者,水利/水电工作者,电力工作者,地址勘察/选矿/采矿,能源/矿产项目管理,电力系统研发工程师,电力电子研发工程师,控制保护研发工程师,其他能源/矿产/地址勘察业务,环保技术工程师,环境评价工程师,环境监测工程师,水处理工程师,固废处理工程师,废气处理工程师,生态治理/规划,环境管理/园林景区保护,其他环境/环保,农艺师,林业师,园艺师,畜牧师,动物育种/养殖,动物营养/饲料研发,饲料销售,农产品销售,其他农/林/牧/渔业务,采购专员/经理/总监,供应商开发,供应链管理,供应商/采购质量管理,买手,贸易专员/经理/总监,国际贸易专员/经理/总监,采购/贸易业务跟单,报关员,其他采购/贸易业务,网络约车司机,出租车司机,专职司机,公交司乘,公交系统,地铁司乘,地铁系统,铁路司乘,铁路系统,船舶司乘,船舶系统,航空空勤,航空地勤,航空系统,航空航天,汽车驾驶教练,飞机船舶驾驶教练,驾校服务管理,车辆管理员,公路收费员,公路休息区服务,加油站/加气站/充电站服务,其他交通运输业务,物流专员/经理/总监,货运代理,运输主管,快递员,水运/空运/陆运操作,集装箱业务,报关员,单证员,仓库/物料管理,理货/分拣/打包,物流/仓储项目管理,搬运工,集装箱维护,集装箱操作,物流销售,供应链管理,海关事务管理,物流订单处理,其他物流/仓储业务,销售代表/经理/总监,客户服务/客户关系,销售工程师,渠道/分销业务,区域销售业务,销售业务拓展,大客户销售,团购业务,电话销售,网络/在线销售,销售业务跟单,招商业务,客户咨询热线/语音呼叫中心,网络/在线客服,售前/售后技术支持,其他销售/售前售后业务,质量管理员,质量检验/测试员,化验/检验员,认证/体系审核员/工程师,环境/健康/安全经理/工程师,供应商/采购质量管理,安全消防管理,可靠度工程师,故障分析工程师,其他质量/安全管理业务,广告创意设计,广告文案策划,广告美术指导,广告制作执行,广告客户代表/经理/总监,广告/会展业务拓展,会展策划设计,会务专员/经理,广告/会展项目管理,企业/业务发展经理,其他广告/会展业务,市场专员/经理/总监,市场业务拓展,产品专员/经理/总监,品牌管理,连锁/加盟业务,市场策划/企划/文案,市场活动执行,促销业务,网站推广/SEO/SEM,选址拓展/新店开发,市场通路,咨询顾问/经理/总监,咨询师,访问员,咨询项目管理,调研员,数据信息分析师,神秘顾客,工商证照服务,公章/印章刻制,其他市场/调研/咨询/商事业务,销售行政,销售运营,商务专员/经理,销售培训师,销售数据分析,业务分析,其他商务/销售行政业务,公关代表/经理/总监,媒介代表/经理/总监,媒介策划,媒介活动执行,政府事务管理,其他公关/媒介业务,财务专员/经理/总监,财务分析,会计师/会计人员,出纳员,成本管理,资产/资金管理,统计员,审计师/审计人员,税务师/税务人员,评估师/评估人员,人力资源专员/经理/总监,员工培训,员工招聘,薪酬福利,绩效考核,员工关系/企业文化,企业培训师/讲师,猎头顾问,其他人力资源业务,行政专员/经理/总监,文员/秘书,前台/接待,文档资料管理,打字/录入员,图书管理员,党工团事务,后勤保障,保安保卫,其他行政业务,总裁/CEO/副总裁,企业/机构/组织负责人,部门管理负责人,总裁秘书/助理,董秘/投资者关系,董事/监事,创始人/合伙人,其他高级管理,英语翻译,法语翻译,日语翻译,德语翻译,俄语翻译,西班牙语翻译,意大利语翻译,葡萄牙语翻译,阿拉伯语翻译,韩语翻译,其他语种翻译,幼儿园教师,小学教师,初中教师,高中教师,职业技术教师,大学教师,大学教授,特殊教育教师,早教/幼教机构老师,初高中校外辅导老师,职业资质能力培训师,少儿英语培训师,成人英语培训师,外籍教师,声乐器乐教师,舞蹈教师,书画教师,艺术类教师,企业培训师/讲师,专项技能培训师,教学/教务管理,早教/幼教机构运营,校外辅导机构运营,成人培训机构运营,招生/课程顾问/学籍顾问,教育产品开发,图书馆管理,其他教育/培训业务,法官/检察官,书记员,企业法务,企业合规,诉讼律师,非诉律师,公证员,知识产权顾问/代理人,仲裁员,调解员,其他法律业务,导演,编剧,制片人,影视演员,群众演员,舞台剧演员,舞蹈演员,曲艺表演,戏曲表演,杂技技巧表演,其他表演,配音演员,歌手/声乐,器乐演奏,画师/画家,书法家,手工艺家,文化传承人,作家/诗人/撰稿人,播音主持,现场主持/司仪,模特,视频主播,网络红人,经纪人,艺术指导/舞美设计,表演类艺术/设计总监,摄影师/摄像师,化妆师/造型师,服装/道具,灯光师,音响师,音效师,后期制作,播放管理,影视文艺项目策划,影视文艺项目制作,影视文艺项目运营推广,影视文艺项目服务,专业运动员,体育赛事项目组织运营,体育赛事项目服务,其他影视/文体/媒体业务,编导/导播,记者/采编,图片记者,作家/诗人/撰稿人,总编/副总编,文字编辑/组稿,美术编辑/美术设计,文案策划,校对/录入,发行管理,排版设计,印刷排版/制版,印刷操作,编辑出版,调色员,烫金工,晒版员,装订员,数码直印/菲林输出,调墨技师,电分操作,打稿机操作,切纸机操作,裱胶员,复卷员,压痕员,印刷机机械长,其他新闻/出版/印刷业务,画师/画家,书法家,手工艺家,文化传承人,艺术/设计总监,平面设计,CAD设计/制图,三维/3D设计制作,Flash设计/制作,特效设计,视觉设计,用户体验（UE/UX设计/,UI设计,美术编辑/美术设计,多媒体/动画设计,包装设计,家具设计,家居用品设计,工艺品/珠宝设计,玩具设计,店面/展览/展示/陈列设计,室内装修设计,工业设计,园林/景观设计,其他艺术/设计,商场/超市管理,商品质量管理,售货员/导购员,商场/超市收银员,理货员,商场/超市促销主管/督导,品类管理,防损员/内保,其他商场/超市服务,酒店管理,酒店前厅接待/迎宾,酒店前台,行李员,大堂经理/领班,客房管理,客房服务员,其他酒店服务,酒店试睡员,客栈/民宿经营,其他商场/超市/酒店住宿业务,健身/美体/课程教练,运动/技能教练,按摩师/足疗师,针灸师/推拿师,美容师,美甲师,美容美体顾问,发型师/护发养发,会员招募/会籍顾问,健身运动场馆服务管理,保健美容美发会所服务管理,其他保健/健身/美容/美发,旅游产品销售,旅游顾问,旅游计划调度,旅游产品/线路策划,签证业务办理,导游,参观讲解员,公园游乐表演演员,动物驯养师,公园/博物馆服务管理,影剧院服务管理,休闲娱乐场馆服务管理,其他旅游/休闲/娱乐,综合门诊/全科医生,内科医生,外科医生,儿科医生,牙科医生,美容整形科医生,中医医生,麻醉医生,心理医生,眼科医生,专科医生,医学影像/放射科医师,化验/检验科医师,药房管理/药剂师,理疗师,营养师,针灸师/推拿师,验光师,公共卫生/疾病控制,护理/护士人员,护理/护士长,医疗管理人员,医院院长,兽医,宠物护理,其他医院/医疗/护理,高级厨师/行政主厨,中餐厨师,西餐厨师,面点师/西点师,厨师助理,食品加工/处理,品酒师,调酒师,茶艺/饮品师,咖啡师,营养师,美食评论,餐厅服务,酒吧水吧咖啡厅服务,蛋糕房服务,小吃美食零售服务,送餐员/外送员,食品/饮料研发,食品/饮料检验,餐饮店经营管理,私厨服务,其他烹饪/餐饮/食品,婚礼策划,婚礼主持,婚纱/艺术摄影,婚庆周边服务,眼镜店服务,验光师,儿童/亲子活动服务,鲜花绿植/花店服务,便利店/果蔬店服务,保姆/护理/看护,管家,私厨服务,社区保安,图片社/复印打印社,水站服务,洗衣服务,鞋品修理养护,保洁服务,家电/钟表维修,手机维修,水电气家具维修安装,搬家/搬运服务,宠物护理,其他生活/家居服务,人大系统,政协系统,法院系统,检察院系统,军委系统,外交系统,发改系统,教育系统,科技系统,工信系统,公安系统,监察系统,民政系统,财政系统,人社系统,国土资源系统,环保系统,城建系统,交通系统,水利系统,农业系统,商务系统,文化系统,人行系统,国资系统,海关系统,工商系统,体育系统,安监系统,食药监系统,统计系统,林业系统,知识产权系统,旅游系统,宗教系统,港澳台系统,银监系统,证监系统,保监系统,地震系统,气象系统,信访系统,粮食系统,能源系统,烟草系统,海洋系统,测绘地信系统,铁路系统,民航系统,邮政系统,文物系统,医院系统,其他机关/事业单位,陆军,海军,空军,二炮,武警内卫部队,森林/黄金/水电/交通部队,边防部队,消防部队,警卫部队,治安/刑侦/户籍警察,交通警察,司法/安全警察,其他军人/警察,自然科学类研究员/学者,哲学社会科学类研究员/学者,科学研究类社团工作者,工商服务类社团工作者,农业类社团工作者,教育类社团工作者,卫生类社团工作者,文化类社团工作者,体育类社团工作者,生态环境类社团工作者,社会服务类社团工作者,公益慈善类社团工作者,法律类社团工作者,宗教类社团工作者,职业/从业者组织工作者,国际及涉外组织工作者,其他社会团体工作者,社会工作者,志愿服务者,其他科研/公益/社会团体,初中生,高中生,专科生,本科生,研究生,博士生,中国留学生,外国来华留学生,哲学院系,经济学院系,法学院系,教育学院系,文学语言院系,历史学院系,理学院系,工学院系,农学院系,医学院系,管理学院系,军事学院系,旅行家/探险家,家庭主妇,自由职业者,其他职业";
	
	
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
//					System.out.println(cnt+"--" + m+":"+n+"是重复的 is  "+ string);
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
	
	
	//判断数组中是否有重复值
	public static boolean checkRepeat(String[] array){
	  Set<String> set = new HashSet<String>();
	  for(String str : array){
	    set.add(str);
	  }
	  System.out.println("重复了多少条：" + (array.length - set.size()));
	  if(set.size() != array.length){
	    return false;//有重复
	  }else{
	    return true;//不重复
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
