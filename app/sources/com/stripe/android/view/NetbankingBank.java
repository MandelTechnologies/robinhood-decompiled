package com.stripe.android.view;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetbankingBank.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b`\b\u0080\u0081\u0002\u0018\u0000 g2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001gB+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bf¨\u0006h"}, m3636d2 = {"Lcom/stripe/android/view/NetbankingBank;", "", "Lcom/stripe/android/view/Bank;", "id", "", "code", "displayName", "brandIconResId", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBrandIconResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/String;", "getDisplayName", "getId", "KotakBank", "AndraBank", "AllahabadBank", "AndhraPragathiBank", "AirtelBank", "AUSmallFinanceBank", "BankOfBahrainAndKuwait", "BankOfBaroda", "BasseinCatholicBank", "BandhanBank", "BankOfIndia", "BankofMaharashtra", "CentralBankOfIndia", "CanaraBank", "CosmosBank", "CorporationBank", "CatholicSyrianBank", "CityUnionBank", "DeutscheBank", "Digibank", "DevelopmentCreditBank", "DenaBank", "DhanlakshmiBank", "EquitasSmallFinanceBank", "ESAFBank", "FederalBank", "FincareBank", "HDFCBank", "ICICIBank", "IDBIBank", "IDFCBank", "IndusIndBank", "IndianBank", "IndianOverseasBank", "JammuKashmirBank", "JanaBank", "JanataSahakariBank", "KarnatakaBank", "KalyanJanataBank", "KalpurBank", "KarurVysyaBank", "KarnatakaVikasGrameenaBank", "LaxmiVilasBank", "MehsanaBank", "NEBank", "NKGSBBank", "OBCBank", "PunjabNationalBank", "PunjabAndSindBank", "RBLBank", "SBI", "StandardCharteredBank", "ShivalikMercantileBank", "SouthIndianBank", "SuryodayBank", "SaraswatBank", "SyndicateBank", "ThaneBharatBank", "TJSBBank", "TamilnadMercantileBank", "TamilNaduStateBank", "UBI", "UNIBank", "AxisBank", "VijayaBank", "VarachhaBank", "YesBank", "ZoroastrianBank", "KarnatakaGraminBank", "ShamraoVithalBank", "NutanNagrikBank", "BOBBank", "PunjabNationalCorpBank", "ShamraoVithalCorpBank", "BNPParibas", "RBLCorpBank", "ICICICorpBank", "IDBICorpBank", "AxisCorpBank", "AndhraCorpBank", "DhanlaxmiCorpBank", "AllahabadCorpBank", "HFDCCorpBank", "YesCorpBank", "CorporationBankCorporate", "BarclaysCorpBank", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class NetbankingBank implements Bank {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NetbankingBank[] $VALUES;
    public static final NetbankingBank AndhraCorpBank;
    public static final NetbankingBank BandhanBank;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final NetbankingBank Digibank;
    public static final NetbankingBank IDBIBank;
    public static final NetbankingBank KalpurBank;
    public static final NetbankingBank RBLBank;
    public static final NetbankingBank ShamraoVithalBank;
    public static final NetbankingBank TamilnadMercantileBank;
    private final Integer brandIconResId;
    private final String code;
    private final String displayName;
    private final String id;
    public static final NetbankingBank KotakBank = new NetbankingBank("KotakBank", 0, "162", "kotak", "Kotak Bank", null, 8, null);
    public static final NetbankingBank AndraBank = new NetbankingBank("AndraBank", 1, "ADB", "andhra", "Andhra Bank", null, 8, null);
    public static final NetbankingBank AllahabadBank = new NetbankingBank("AllahabadBank", 2, "ALB", "allahabad", "Allahabad Bank", null, 8, null);
    public static final NetbankingBank AndhraPragathiBank = new NetbankingBank("AndhraPragathiBank", 3, "APG", "andhra_pragathi", "Andhra Pragathi Grameena Bank", null, 8, null);
    public static final NetbankingBank AirtelBank = new NetbankingBank("AirtelBank", 4, "ATP", "airtel", "Airtel Payment Bank", null, 8, null);
    public static final NetbankingBank AUSmallFinanceBank = new NetbankingBank("AUSmallFinanceBank", 5, "AUB", "au_small_finance", "AU Small Finance Bank", null, 8, null);
    public static final NetbankingBank BankOfBahrainAndKuwait = new NetbankingBank("BankOfBahrainAndKuwait", 6, "BBK", "bank_of_bahrain_and_kuwait", "Bank of Bahrain and Kuwait", null, 8, null);
    public static final NetbankingBank BankOfBaroda = new NetbankingBank("BankOfBaroda", 7, "BBR", "bob", "Bank of Baroda - Retail Banking", null, 8, null);
    public static final NetbankingBank BasseinCatholicBank = new NetbankingBank("BasseinCatholicBank", 8, "BCB", "bassein_catholic", "Bassein Catholic Co-operative Bank", null, 8, null);
    public static final NetbankingBank BankOfIndia = new NetbankingBank("BankOfIndia", 10, "BOI", "bank_of_india", "Bank of India", null, 8, null);
    public static final NetbankingBank BankofMaharashtra = new NetbankingBank("BankofMaharashtra", 11, "BOM", "bank_of_maharashtra", "Bank of Maharashtra", null, 8, null);
    public static final NetbankingBank CentralBankOfIndia = new NetbankingBank("CentralBankOfIndia", 12, "cbi001", "central_bank_of_india", "Central Bank of India", null, 8, null);
    public static final NetbankingBank CanaraBank = new NetbankingBank("CanaraBank", 13, "CNB", "canara", "Canara Bank", null, 8, null);
    public static final NetbankingBank CosmosBank = new NetbankingBank("CosmosBank", 14, "COB", "cosmos", "Cosmos Bank", null, 8, null);
    public static final NetbankingBank CorporationBank = new NetbankingBank("CorporationBank", 15, "CRP", "corporation_bank", "Corporation Bank", null, 8, null);
    public static final NetbankingBank CatholicSyrianBank = new NetbankingBank("CatholicSyrianBank", 16, "CSB", "catholic_syrian", "Catholic Syrian Bank", null, 8, null);
    public static final NetbankingBank CityUnionBank = new NetbankingBank("CityUnionBank", 17, "CUB", "city_union", "City Union Bank", null, 8, 0 == true ? 1 : 0);
    public static final NetbankingBank DeutscheBank = new NetbankingBank("DeutscheBank", 18, "DBK", "deutsche", "Deutsche Bank", null, 8, null);
    public static final NetbankingBank DevelopmentCreditBank = new NetbankingBank("DevelopmentCreditBank", 20, "DCB", "development_credit_bank", "Development Credit Bank", null, 8, null);
    public static final NetbankingBank DenaBank = new NetbankingBank("DenaBank", 21, "DEN", "dena", "Dena Bank", null, 8, null);
    public static final NetbankingBank DhanlakshmiBank = new NetbankingBank("DhanlakshmiBank", 22, "DLB", "dhanlakshmi", "Dhanlakshmi Bank", null, 8, null);
    public static final NetbankingBank EquitasSmallFinanceBank = new NetbankingBank("EquitasSmallFinanceBank", 23, "EQB", "equitas_small_finance", "Equitas Small Finance Bank", null, 8, null);
    public static final NetbankingBank ESAFBank = new NetbankingBank("ESAFBank", 24, "ESF", "esaf", "ESAF Small Finance Bank", null, 8, null);
    public static final NetbankingBank FederalBank = new NetbankingBank("FederalBank", 25, "FBK", "federal_bank", "Federal Bank", null, 8, null);
    public static final NetbankingBank FincareBank = new NetbankingBank("FincareBank", 26, "FNC", "fincare", "Fincare Bank", null, 8, null);
    public static final NetbankingBank HDFCBank = new NetbankingBank("HDFCBank", 27, "HDF", "hdfc", "HDFC Bank", null, 8, 0 == true ? 1 : 0);
    public static final NetbankingBank ICICIBank = new NetbankingBank("ICICIBank", 28, "ICI", "icici", "ICICI Bank", null, 8, null);
    public static final NetbankingBank IDFCBank = new NetbankingBank("IDFCBank", 30, "IDN", "idfc_first", "IDFC FIRST Bank", null, 8, null);
    public static final NetbankingBank IndusIndBank = new NetbankingBank("IndusIndBank", 31, "IDS", "indusind", "IndusInd Bank", null, 8, null);
    public static final NetbankingBank IndianBank = new NetbankingBank("IndianBank", 32, "INB", "indian_bank", "Indian Bank", null, 8, null);
    public static final NetbankingBank IndianOverseasBank = new NetbankingBank("IndianOverseasBank", 33, "IOB", "indian_overseas", "Indian Overseas Bank", null, 8, null);
    public static final NetbankingBank JammuKashmirBank = new NetbankingBank("JammuKashmirBank", 34, "JKB", "jnk", "Jammu & Kashmir Bank", null, 8, null);
    public static final NetbankingBank JanaBank = new NetbankingBank("JanaBank", 35, "JNB", "jana_small_finance", "Jana Small Finance Bank", null, 8, null);
    public static final NetbankingBank JanataSahakariBank = new NetbankingBank("JanataSahakariBank", 36, "JSB", "janata_sahakari_bank", "Janata Sahakari Bank Ltd Pune", null, 8, null);
    public static final NetbankingBank KarnatakaBank = new NetbankingBank("KarnatakaBank", 37, "KBL", "karnataka_bank", "Karnataka Bank Limited", null, 8, 0 == true ? 1 : 0);
    public static final NetbankingBank KalyanJanataBank = new NetbankingBank("KalyanJanataBank", 38, "KJB", "kalyan_janata", "Kalyan Janata Sahakari Bank", null, 8, null);
    public static final NetbankingBank KarurVysyaBank = new NetbankingBank("KarurVysyaBank", 40, "KVB", "karur_vysya", "Karur Vysya Bank", null, 8, null);
    public static final NetbankingBank KarnatakaVikasGrameenaBank = new NetbankingBank("KarnatakaVikasGrameenaBank", 41, "KVG", "kvg", "Karnataka Vikas Grameena Bank", null, 8, null);
    public static final NetbankingBank LaxmiVilasBank = new NetbankingBank("LaxmiVilasBank", 42, "LVR", "kvg", "Laxmi Vilas Bank", null, 8, null);
    public static final NetbankingBank MehsanaBank = new NetbankingBank("MehsanaBank", 43, "MSB", "mehsana", "Mehsana urban Co-operative Bank", null, 8, null);
    public static final NetbankingBank NEBank = new NetbankingBank("NEBank", 44, "NEB", "ne_small_finance", "North East Small Finance Bank", null, 8, null);
    public static final NetbankingBank NKGSBBank = new NetbankingBank("NKGSBBank", 45, "NKB", "nkgsb", "NKGSB Co-op Bank", null, 8, null);
    public static final NetbankingBank OBCBank = new NetbankingBank("OBCBank", 46, "OBC", "obc", "PNB (Erstwhile-Oriental Bank of Commerce)", null, 8, null);
    public static final NetbankingBank PunjabNationalBank = new NetbankingBank("PunjabNationalBank", 47, "PNB", "pnb", "Punjab National Bank - Retail Banking", null, 8, 0 == true ? 1 : 0);
    public static final NetbankingBank PunjabAndSindBank = new NetbankingBank("PunjabAndSindBank", 48, "PSB", "punjab_and_sind", "Punjab & Sind Bank", null, 8, null);
    public static final NetbankingBank SBI = new NetbankingBank("SBI", 50, "SBI", "sbi", "State Bank of India", null, 8, null);
    public static final NetbankingBank StandardCharteredBank = new NetbankingBank("StandardCharteredBank", 51, "SCB", "scb", "Standard Chartered Bank", null, 8, null);
    public static final NetbankingBank ShivalikMercantileBank = new NetbankingBank("ShivalikMercantileBank", 52, "SHB", "shivalik", "Shivalik Mercantile Cooperative Bank Ltd", null, 8, null);
    public static final NetbankingBank SouthIndianBank = new NetbankingBank("SouthIndianBank", 53, "SIB", "south_indian_bank", "South Indian Bank", null, 8, null);
    public static final NetbankingBank SuryodayBank = new NetbankingBank("SuryodayBank", 54, "SRB", "suryoday", "Suryoday Small Finance Bank", null, 8, null);
    public static final NetbankingBank SaraswatBank = new NetbankingBank("SaraswatBank", 55, "SWB", "saraswat", "Saraswat Bank", null, 8, null);
    public static final NetbankingBank SyndicateBank = new NetbankingBank("SyndicateBank", 56, "SYD", "syndicate", "Syndicate Bank", null, 8, null);
    public static final NetbankingBank ThaneBharatBank = new NetbankingBank("ThaneBharatBank", 57, "TBB", "thane_bharat", "Thane Bharat Sahakari Bank Ltd", null, 8, 0 == true ? 1 : 0);
    public static final NetbankingBank TJSBBank = new NetbankingBank("TJSBBank", 58, "TJB", "tjsb", "TJSB Bank", null, 8, null);
    public static final NetbankingBank TamilNaduStateBank = new NetbankingBank("TamilNaduStateBank", 60, "TNC", "tnc", "Tamil Nadu State Co-operative Bank", null, 8, null);
    public static final NetbankingBank UBI = new NetbankingBank("UBI", 61, "UBI", "ubi", "Union Bank of India", null, 8, null);
    public static final NetbankingBank UNIBank = new NetbankingBank("UNIBank", 62, "UNI", "united_bank_of_india", "PNB (Erstwhile-United Bank of India)", null, 8, null);
    public static final NetbankingBank AxisBank = new NetbankingBank("AxisBank", 63, "UTI", "axis", "Axis Bank", null, 8, null);
    public static final NetbankingBank VijayaBank = new NetbankingBank("VijayaBank", 64, "VJB", "vijaya", "Vijaya Bank", null, 8, null);
    public static final NetbankingBank VarachhaBank = new NetbankingBank("VarachhaBank", 65, "VRB", "varachha", "Varachha Co-operative Bank Limited", null, 8, null);
    public static final NetbankingBank YesBank = new NetbankingBank("YesBank", 66, "YBK", "yes", "Yes Bank", null, 8, null);
    public static final NetbankingBank ZoroastrianBank = new NetbankingBank("ZoroastrianBank", 67, "ZOB", "zoroastrian", "Zoroastrian Co-operative Bank Limited", null, 8, 0 == true ? 1 : 0);
    public static final NetbankingBank KarnatakaGraminBank = new NetbankingBank("KarnatakaGraminBank", 68, "PKB", "karnataka_gramin", "Karnataka Gramin Bank", null, 8, null);
    public static final NetbankingBank NutanNagrikBank = new NetbankingBank("NutanNagrikBank", 70, "NUT", "nutan_nagrik", "Nutan Nagrik Bank", null, 8, null);
    public static final NetbankingBank BOBBank = new NetbankingBank("BOBBank", 71, "BBC", "bob_corp", "Bank of Baroda - Corporate Banking", null, 8, null);
    public static final NetbankingBank PunjabNationalCorpBank = new NetbankingBank("PunjabNationalCorpBank", 72, "CPN", "pnb_corp", "Punjab National Bank - Corporate Banking", null, 8, null);
    public static final NetbankingBank ShamraoVithalCorpBank = new NetbankingBank("ShamraoVithalCorpBank", 73, "SV2", "shamrao_vithal_corp", "Shamrao Vithal Co-op Bank - Corporate", null, 8, null);
    public static final NetbankingBank BNPParibas = new NetbankingBank("BNPParibas", 74, "BNP", "bnp_paribas", "BNP Paribas", null, 8, null);
    public static final NetbankingBank RBLCorpBank = new NetbankingBank("RBLCorpBank", 75, "RTC", "rbl_corp", "RBL Bank Limited - Corporate Banking", null, 8, null);
    public static final NetbankingBank ICICICorpBank = new NetbankingBank("ICICICorpBank", 76, "ICO", "icici_corp", "ICICI Corporate Netbanking", null, 8, null);
    public static final NetbankingBank IDBICorpBank = new NetbankingBank("IDBICorpBank", 77, "IDC", "idbi_corp", "IDBI Corporate", null, 8, 0 == true ? 1 : 0);
    public static final NetbankingBank AxisCorpBank = new NetbankingBank("AxisCorpBank", 78, "AXC", "axis_corp", "Axis Bank Corporate", null, 8, null);
    public static final NetbankingBank DhanlaxmiCorpBank = new NetbankingBank("DhanlaxmiCorpBank", 80, "DL2", "dhanlaxmi_corp", "Dhanlaxmi Bank Corporate", null, 8, null);
    public static final NetbankingBank AllahabadCorpBank = new NetbankingBank("AllahabadCorpBank", 81, "ALC", "allahabad_corp", "Allahabad Bank Corporate", null, 8, null);
    public static final NetbankingBank HFDCCorpBank = new NetbankingBank("HFDCCorpBank", 82, "CH3", "hdfc_corp", "HDFC Bank Corporate", null, 8, null);
    public static final NetbankingBank YesCorpBank = new NetbankingBank("YesCorpBank", 83, "YBC", "yes_corp", "Yes Bank Corporate", null, 8, null);
    public static final NetbankingBank CorporationBankCorporate = new NetbankingBank("CorporationBankCorporate", 84, "CR2", "corporation_bank_corp", "Corporation Bank - Corporate", null, 8, null);
    public static final NetbankingBank BarclaysCorpBank = new NetbankingBank("BarclaysCorpBank", 85, "BRL", "barclays_corp", "Barclays Bank - Corporate Net Banking", null, 8, null);

    private static final /* synthetic */ NetbankingBank[] $values() {
        return new NetbankingBank[]{KotakBank, AndraBank, AllahabadBank, AndhraPragathiBank, AirtelBank, AUSmallFinanceBank, BankOfBahrainAndKuwait, BankOfBaroda, BasseinCatholicBank, BandhanBank, BankOfIndia, BankofMaharashtra, CentralBankOfIndia, CanaraBank, CosmosBank, CorporationBank, CatholicSyrianBank, CityUnionBank, DeutscheBank, Digibank, DevelopmentCreditBank, DenaBank, DhanlakshmiBank, EquitasSmallFinanceBank, ESAFBank, FederalBank, FincareBank, HDFCBank, ICICIBank, IDBIBank, IDFCBank, IndusIndBank, IndianBank, IndianOverseasBank, JammuKashmirBank, JanaBank, JanataSahakariBank, KarnatakaBank, KalyanJanataBank, KalpurBank, KarurVysyaBank, KarnatakaVikasGrameenaBank, LaxmiVilasBank, MehsanaBank, NEBank, NKGSBBank, OBCBank, PunjabNationalBank, PunjabAndSindBank, RBLBank, SBI, StandardCharteredBank, ShivalikMercantileBank, SouthIndianBank, SuryodayBank, SaraswatBank, SyndicateBank, ThaneBharatBank, TJSBBank, TamilnadMercantileBank, TamilNaduStateBank, UBI, UNIBank, AxisBank, VijayaBank, VarachhaBank, YesBank, ZoroastrianBank, KarnatakaGraminBank, ShamraoVithalBank, NutanNagrikBank, BOBBank, PunjabNationalCorpBank, ShamraoVithalCorpBank, BNPParibas, RBLCorpBank, ICICICorpBank, IDBICorpBank, AxisCorpBank, AndhraCorpBank, DhanlaxmiCorpBank, AllahabadCorpBank, HFDCCorpBank, YesCorpBank, CorporationBankCorporate, BarclaysCorpBank};
    }

    @JvmStatic
    public static final NetbankingBank get(String str) {
        return INSTANCE.get(str);
    }

    public static EnumEntries<NetbankingBank> getEntries() {
        return $ENTRIES;
    }

    public static NetbankingBank valueOf(String str) {
        return (NetbankingBank) Enum.valueOf(NetbankingBank.class, str);
    }

    public static NetbankingBank[] values() {
        return (NetbankingBank[]) $VALUES.clone();
    }

    private NetbankingBank(String str, int i, String str2, String str3, String str4, Integer num) {
        this.id = str2;
        this.code = str3;
        this.displayName = str4;
        this.brandIconResId = num;
    }

    /* synthetic */ NetbankingBank(String str, int i, String str2, String str3, String str4, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, (i2 & 8) != 0 ? null : num);
    }

    @Override // com.stripe.android.view.Bank
    public String getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    @Override // com.stripe.android.view.Bank
    public String getDisplayName() {
        return this.displayName;
    }

    @Override // com.stripe.android.view.Bank
    public Integer getBrandIconResId() {
        return this.brandIconResId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        BandhanBank = new NetbankingBank("BandhanBank", 9, "BDN", "bandhan", "Bandhan Bank", null, 8, defaultConstructorMarker);
        Digibank = new NetbankingBank("Digibank", 19, "DBS", "digibank_dbs", "Digibank by DBS", null, 8, defaultConstructorMarker);
        IDBIBank = new NetbankingBank("IDBIBank", 29, "IDB", "idbi", "IDBI Bank", null, 8, defaultConstructorMarker);
        KalpurBank = new NetbankingBank("KalpurBank", 39, "KLB", "The Kalupur Commercial Co-operative Bank", "kalupur", null, 8, defaultConstructorMarker);
        RBLBank = new NetbankingBank("RBLBank", 49, "RBL", "rbl", "RBL Bank Limited", null, 8, defaultConstructorMarker);
        TamilnadMercantileBank = new NetbankingBank("TamilnadMercantileBank", 59, "TMB", "tamilnad_mercantile", "Tamilnad Mercantile Bank Limited", null, 8, defaultConstructorMarker);
        ShamraoVithalBank = new NetbankingBank("ShamraoVithalBank", 69, "SVC", "shamrao_vithal", "Shamrao Vithal Co-op Bank", null, 8, defaultConstructorMarker);
        AndhraCorpBank = new NetbankingBank("AndhraCorpBank", 79, "ADC", "andhra_corp", "Andhra Bank Corporate", null, 8, defaultConstructorMarker);
        NetbankingBank[] netbankingBankArr$values = $values();
        $VALUES = netbankingBankArr$values;
        $ENTRIES = EnumEntries2.enumEntries(netbankingBankArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: NetbankingBank.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/view/NetbankingBank$Companion;", "", "()V", "get", "Lcom/stripe/android/view/NetbankingBank;", "bankCode", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NetbankingBank get(String bankCode) {
            NetbankingBank next;
            Iterator<NetbankingBank> it = NetbankingBank.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getCode(), bankCode)) {
                    break;
                }
            }
            return next;
        }
    }
}
