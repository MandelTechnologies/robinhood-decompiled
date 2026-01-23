package rh_server_driven_ui.p531v1;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Flag.kt */
@Metadata(m3635d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\b\u0080\u0002\b\u0086\u0081\u0002\u0018\u0000 \u0083\u00022\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u0083\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002¨\u0006\u0084\u0002"}, m3636d2 = {"Lrh_server_driven_ui/v1/Flag;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FLAG_UNSPECIFIED", "FLAG_AD", "FLAG_AE", "FLAG_AF", "FLAG_AG", "FLAG_AI", "FLAG_AL", "FLAG_AM", "FLAG_AO", "FLAG_AQ", "FLAG_AR", "FLAG_AS", "FLAG_AT", "FLAG_AU", "FLAG_AW", "FLAG_AX", "FLAG_AZ", "FLAG_BA", "FLAG_BB", "FLAG_BD", "FLAG_BE", "FLAG_BF", "FLAG_BG", "FLAG_BH", "FLAG_BI", "FLAG_BJ", "FLAG_BL", "FLAG_BM", "FLAG_BN", "FLAG_BO", "FLAG_BR", "FLAG_BS", "FLAG_BT", "FLAG_BV", "FLAG_BW", "FLAG_BY", "FLAG_BZ", "FLAG_CA", "FLAG_CC", "FLAG_CD", "FLAG_CF", "FLAG_CG", "FLAG_CH", "FLAG_CI", "FLAG_CK", "FLAG_CL", "FLAG_CM", "FLAG_CN", "FLAG_CO", "FLAG_CR", "FLAG_CU", "FLAG_CV", "FLAG_CW", "FLAG_CX", "FLAG_CY", "FLAG_CZ", "FLAG_DE", "FLAG_DJ", "FLAG_DK", "FLAG_DM", "FLAG_DO", "FLAG_DZ", "FLAG_EC", "FLAG_EE", "FLAG_EG", "FLAG_EH", "FLAG_ER", "FLAG_ES", "FLAG_ET", "FLAG_EU", "FLAG_FI", "FLAG_FJ", "FLAG_FK", "FLAG_FM", "FLAG_FO", "FLAG_FR", "FLAG_GA", "FLAG_GB", "FLAG_GD", "FLAG_GE", "FLAG_GENERIC", "FLAG_GF", "FLAG_GG", "FLAG_GH", "FLAG_GI", "FLAG_GL", "FLAG_GM", "FLAG_GN", "FLAG_GP", "FLAG_GQ", "FLAG_GR", "FLAG_GS", "FLAG_GT", "FLAG_GU", "FLAG_GW", "FLAG_GY", "FLAG_HK", "FLAG_HM", "FLAG_HN", "FLAG_HR", "FLAG_HT", "FLAG_HU", "FLAG_ID", "FLAG_IE", "FLAG_IL", "FLAG_IM", "FLAG_IN", "FLAG_IO", "FLAG_IQ", "FLAG_IR", "FLAG_IS", "FLAG_IT", "FLAG_JE", "FLAG_JM", "FLAG_JO", "FLAG_JP", "FLAG_KE", "FLAG_KG", "FLAG_KH", "FLAG_KI", "FLAG_KM", "FLAG_KN", "FLAG_KP", "FLAG_KR", "FLAG_KW", "FLAG_KY", "FLAG_KZ", "FLAG_LA", "FLAG_LB", "FLAG_LC", "FLAG_LI", "FLAG_LK", "FLAG_LR", "FLAG_LS", "FLAG_LT", "FLAG_LU", "FLAG_LV", "FLAG_LY", "FLAG_MA", "FLAG_MC", "FLAG_MD", "FLAG_ME", "FLAG_MF", "FLAG_MG", "FLAG_MH", "FLAG_MK", "FLAG_ML", "FLAG_MM", "FLAG_MN", "FLAG_MO", "FLAG_MP", "FLAG_MQ", "FLAG_MR", "FLAG_MS", "FLAG_MT", "FLAG_MU", "FLAG_MV", "FLAG_MW", "FLAG_MX", "FLAG_MY", "FLAG_MZ", "FLAG_NA", "FLAG_NC", "FLAG_NE", "FLAG_NF", "FLAG_NG", "FLAG_NI", "FLAG_NL", "FLAG_NO", "FLAG_NP", "FLAG_NR", "FLAG_NU", "FLAG_NZ", "FLAG_OM", "FLAG_PA", "FLAG_PE", "FLAG_PF", "FLAG_PG", "FLAG_PH", "FLAG_PK", "FLAG_PL", "FLAG_PM", "FLAG_PN", "FLAG_PR", "FLAG_PS", "FLAG_PT", "FLAG_PW", "FLAG_PY", "FLAG_QA", "FLAG_RE", "FLAG_RO", "FLAG_RS", "FLAG_RU", "FLAG_RW", "FLAG_SA", "FLAG_SB", "FLAG_SC", "FLAG_SD", "FLAG_SE", "FLAG_SG", "FLAG_SH", "FLAG_SI", "FLAG_SJ", "FLAG_SK", "FLAG_SL", "FLAG_SM", "FLAG_SN", "FLAG_SO", "FLAG_SR", "FLAG_ST", "FLAG_SV", "FLAG_SX", "FLAG_SY", "FLAG_SZ", "FLAG_TC", "FLAG_TD", "FLAG_TF", "FLAG_TG", "FLAG_TH", "FLAG_TJ", "FLAG_TK", "FLAG_TL", "FLAG_TM", "FLAG_TN", "FLAG_TO", "FLAG_TR", "FLAG_TT", "FLAG_TV", "FLAG_TW", "FLAG_TZ", "FLAG_UA", "FLAG_UG", "FLAG_UM", "FLAG_US", "FLAG_UY", "FLAG_UZ", "FLAG_VA", "FLAG_VC", "FLAG_VE", "FLAG_VG", "FLAG_VI", "FLAG_VN", "FLAG_VU", "FLAG_WF", "FLAG_WS", "FLAG_YE", "FLAG_YT", "FLAG_ZA", "FLAG_ZM", "FLAG_ZW", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Flag implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Flag[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Flag> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Flag FLAG_AD;
    public static final Flag FLAG_AE;
    public static final Flag FLAG_AF;
    public static final Flag FLAG_AG;
    public static final Flag FLAG_AI;
    public static final Flag FLAG_AL;
    public static final Flag FLAG_AM;
    public static final Flag FLAG_AO;
    public static final Flag FLAG_AQ;
    public static final Flag FLAG_AR;
    public static final Flag FLAG_AS;
    public static final Flag FLAG_AT;
    public static final Flag FLAG_AU;
    public static final Flag FLAG_AW;
    public static final Flag FLAG_AX;
    public static final Flag FLAG_AZ;
    public static final Flag FLAG_BA;
    public static final Flag FLAG_BB;
    public static final Flag FLAG_BD;
    public static final Flag FLAG_BE;
    public static final Flag FLAG_BF;
    public static final Flag FLAG_BG;
    public static final Flag FLAG_BH;
    public static final Flag FLAG_BI;
    public static final Flag FLAG_BJ;
    public static final Flag FLAG_BL;
    public static final Flag FLAG_BM;
    public static final Flag FLAG_BN;
    public static final Flag FLAG_BO;
    public static final Flag FLAG_BR;
    public static final Flag FLAG_BS;
    public static final Flag FLAG_BT;
    public static final Flag FLAG_BV;
    public static final Flag FLAG_BW;
    public static final Flag FLAG_BY;
    public static final Flag FLAG_BZ;
    public static final Flag FLAG_CA;
    public static final Flag FLAG_CC;
    public static final Flag FLAG_CD;
    public static final Flag FLAG_CF;
    public static final Flag FLAG_CG;
    public static final Flag FLAG_CH;
    public static final Flag FLAG_CI;
    public static final Flag FLAG_CK;
    public static final Flag FLAG_CL;
    public static final Flag FLAG_CM;
    public static final Flag FLAG_CN;
    public static final Flag FLAG_CO;
    public static final Flag FLAG_CR;
    public static final Flag FLAG_CU;
    public static final Flag FLAG_CV;
    public static final Flag FLAG_CW;
    public static final Flag FLAG_CX;
    public static final Flag FLAG_CY;
    public static final Flag FLAG_CZ;
    public static final Flag FLAG_DE;
    public static final Flag FLAG_DJ;
    public static final Flag FLAG_DK;
    public static final Flag FLAG_DM;
    public static final Flag FLAG_DO;
    public static final Flag FLAG_DZ;
    public static final Flag FLAG_EC;
    public static final Flag FLAG_EE;
    public static final Flag FLAG_EG;
    public static final Flag FLAG_EH;
    public static final Flag FLAG_ER;
    public static final Flag FLAG_ES;
    public static final Flag FLAG_ET;
    public static final Flag FLAG_EU;
    public static final Flag FLAG_FI;
    public static final Flag FLAG_FJ;
    public static final Flag FLAG_FK;
    public static final Flag FLAG_FM;
    public static final Flag FLAG_FO;
    public static final Flag FLAG_FR;
    public static final Flag FLAG_GA;
    public static final Flag FLAG_GB;
    public static final Flag FLAG_GD;
    public static final Flag FLAG_GE;
    public static final Flag FLAG_GENERIC;
    public static final Flag FLAG_GF;
    public static final Flag FLAG_GG;
    public static final Flag FLAG_GH;
    public static final Flag FLAG_GI;
    public static final Flag FLAG_GL;
    public static final Flag FLAG_GM;
    public static final Flag FLAG_GN;
    public static final Flag FLAG_GP;
    public static final Flag FLAG_GQ;
    public static final Flag FLAG_GR;
    public static final Flag FLAG_GS;
    public static final Flag FLAG_GT;
    public static final Flag FLAG_GU;
    public static final Flag FLAG_GW;
    public static final Flag FLAG_GY;
    public static final Flag FLAG_HK;
    public static final Flag FLAG_HM;
    public static final Flag FLAG_HN;
    public static final Flag FLAG_HR;
    public static final Flag FLAG_HT;
    public static final Flag FLAG_HU;
    public static final Flag FLAG_ID;
    public static final Flag FLAG_IE;
    public static final Flag FLAG_IL;
    public static final Flag FLAG_IM;
    public static final Flag FLAG_IN;
    public static final Flag FLAG_IO;
    public static final Flag FLAG_IQ;
    public static final Flag FLAG_IR;
    public static final Flag FLAG_IS;
    public static final Flag FLAG_IT;
    public static final Flag FLAG_JE;
    public static final Flag FLAG_JM;
    public static final Flag FLAG_JO;
    public static final Flag FLAG_JP;
    public static final Flag FLAG_KE;
    public static final Flag FLAG_KG;
    public static final Flag FLAG_KH;
    public static final Flag FLAG_KI;
    public static final Flag FLAG_KM;
    public static final Flag FLAG_KN;
    public static final Flag FLAG_KP;
    public static final Flag FLAG_KR;
    public static final Flag FLAG_KW;
    public static final Flag FLAG_KY;
    public static final Flag FLAG_KZ;
    public static final Flag FLAG_LA;
    public static final Flag FLAG_LB;
    public static final Flag FLAG_LC;
    public static final Flag FLAG_LI;
    public static final Flag FLAG_LK;
    public static final Flag FLAG_LR;
    public static final Flag FLAG_LS;
    public static final Flag FLAG_LT;
    public static final Flag FLAG_LU;
    public static final Flag FLAG_LV;
    public static final Flag FLAG_LY;
    public static final Flag FLAG_MA;
    public static final Flag FLAG_MC;
    public static final Flag FLAG_MD;
    public static final Flag FLAG_ME;
    public static final Flag FLAG_MF;
    public static final Flag FLAG_MG;
    public static final Flag FLAG_MH;
    public static final Flag FLAG_MK;
    public static final Flag FLAG_ML;
    public static final Flag FLAG_MM;
    public static final Flag FLAG_MN;
    public static final Flag FLAG_MO;
    public static final Flag FLAG_MP;
    public static final Flag FLAG_MQ;
    public static final Flag FLAG_MR;
    public static final Flag FLAG_MS;
    public static final Flag FLAG_MT;
    public static final Flag FLAG_MU;
    public static final Flag FLAG_MV;
    public static final Flag FLAG_MW;
    public static final Flag FLAG_MX;
    public static final Flag FLAG_MY;
    public static final Flag FLAG_MZ;
    public static final Flag FLAG_NA;
    public static final Flag FLAG_NC;
    public static final Flag FLAG_NE;
    public static final Flag FLAG_NF;
    public static final Flag FLAG_NG;
    public static final Flag FLAG_NI;
    public static final Flag FLAG_NL;
    public static final Flag FLAG_NO;
    public static final Flag FLAG_NP;
    public static final Flag FLAG_NR;
    public static final Flag FLAG_NU;
    public static final Flag FLAG_NZ;
    public static final Flag FLAG_OM;
    public static final Flag FLAG_PA;
    public static final Flag FLAG_PE;
    public static final Flag FLAG_PF;
    public static final Flag FLAG_PG;
    public static final Flag FLAG_PH;
    public static final Flag FLAG_PK;
    public static final Flag FLAG_PL;
    public static final Flag FLAG_PM;
    public static final Flag FLAG_PN;
    public static final Flag FLAG_PR;
    public static final Flag FLAG_PS;
    public static final Flag FLAG_PT;
    public static final Flag FLAG_PW;
    public static final Flag FLAG_PY;
    public static final Flag FLAG_QA;
    public static final Flag FLAG_RE;
    public static final Flag FLAG_RO;
    public static final Flag FLAG_RS;
    public static final Flag FLAG_RU;
    public static final Flag FLAG_RW;
    public static final Flag FLAG_SA;
    public static final Flag FLAG_SB;
    public static final Flag FLAG_SC;
    public static final Flag FLAG_SD;
    public static final Flag FLAG_SE;
    public static final Flag FLAG_SG;
    public static final Flag FLAG_SH;
    public static final Flag FLAG_SI;
    public static final Flag FLAG_SJ;
    public static final Flag FLAG_SK;
    public static final Flag FLAG_SL;
    public static final Flag FLAG_SM;
    public static final Flag FLAG_SN;
    public static final Flag FLAG_SO;
    public static final Flag FLAG_SR;
    public static final Flag FLAG_ST;
    public static final Flag FLAG_SV;
    public static final Flag FLAG_SX;
    public static final Flag FLAG_SY;
    public static final Flag FLAG_SZ;
    public static final Flag FLAG_TC;
    public static final Flag FLAG_TD;
    public static final Flag FLAG_TF;
    public static final Flag FLAG_TG;
    public static final Flag FLAG_TH;
    public static final Flag FLAG_TJ;
    public static final Flag FLAG_TK;
    public static final Flag FLAG_TL;
    public static final Flag FLAG_TM;
    public static final Flag FLAG_TN;
    public static final Flag FLAG_TO;
    public static final Flag FLAG_TR;
    public static final Flag FLAG_TT;
    public static final Flag FLAG_TV;
    public static final Flag FLAG_TW;
    public static final Flag FLAG_TZ;
    public static final Flag FLAG_UA;
    public static final Flag FLAG_UG;
    public static final Flag FLAG_UM;
    public static final Flag FLAG_UNSPECIFIED;
    public static final Flag FLAG_US;
    public static final Flag FLAG_UY;
    public static final Flag FLAG_UZ;
    public static final Flag FLAG_VA;
    public static final Flag FLAG_VC;
    public static final Flag FLAG_VE;
    public static final Flag FLAG_VG;
    public static final Flag FLAG_VI;
    public static final Flag FLAG_VN;
    public static final Flag FLAG_VU;
    public static final Flag FLAG_WF;
    public static final Flag FLAG_WS;
    public static final Flag FLAG_YE;
    public static final Flag FLAG_YT;
    public static final Flag FLAG_ZA;
    public static final Flag FLAG_ZM;
    public static final Flag FLAG_ZW;
    private final int value;

    private static final /* synthetic */ Flag[] $values() {
        return new Flag[]{FLAG_UNSPECIFIED, FLAG_AD, FLAG_AE, FLAG_AF, FLAG_AG, FLAG_AI, FLAG_AL, FLAG_AM, FLAG_AO, FLAG_AQ, FLAG_AR, FLAG_AS, FLAG_AT, FLAG_AU, FLAG_AW, FLAG_AX, FLAG_AZ, FLAG_BA, FLAG_BB, FLAG_BD, FLAG_BE, FLAG_BF, FLAG_BG, FLAG_BH, FLAG_BI, FLAG_BJ, FLAG_BL, FLAG_BM, FLAG_BN, FLAG_BO, FLAG_BR, FLAG_BS, FLAG_BT, FLAG_BV, FLAG_BW, FLAG_BY, FLAG_BZ, FLAG_CA, FLAG_CC, FLAG_CD, FLAG_CF, FLAG_CG, FLAG_CH, FLAG_CI, FLAG_CK, FLAG_CL, FLAG_CM, FLAG_CN, FLAG_CO, FLAG_CR, FLAG_CU, FLAG_CV, FLAG_CW, FLAG_CX, FLAG_CY, FLAG_CZ, FLAG_DE, FLAG_DJ, FLAG_DK, FLAG_DM, FLAG_DO, FLAG_DZ, FLAG_EC, FLAG_EE, FLAG_EG, FLAG_EH, FLAG_ER, FLAG_ES, FLAG_ET, FLAG_EU, FLAG_FI, FLAG_FJ, FLAG_FK, FLAG_FM, FLAG_FO, FLAG_FR, FLAG_GA, FLAG_GB, FLAG_GD, FLAG_GE, FLAG_GENERIC, FLAG_GF, FLAG_GG, FLAG_GH, FLAG_GI, FLAG_GL, FLAG_GM, FLAG_GN, FLAG_GP, FLAG_GQ, FLAG_GR, FLAG_GS, FLAG_GT, FLAG_GU, FLAG_GW, FLAG_GY, FLAG_HK, FLAG_HM, FLAG_HN, FLAG_HR, FLAG_HT, FLAG_HU, FLAG_ID, FLAG_IE, FLAG_IL, FLAG_IM, FLAG_IN, FLAG_IO, FLAG_IQ, FLAG_IR, FLAG_IS, FLAG_IT, FLAG_JE, FLAG_JM, FLAG_JO, FLAG_JP, FLAG_KE, FLAG_KG, FLAG_KH, FLAG_KI, FLAG_KM, FLAG_KN, FLAG_KP, FLAG_KR, FLAG_KW, FLAG_KY, FLAG_KZ, FLAG_LA, FLAG_LB, FLAG_LC, FLAG_LI, FLAG_LK, FLAG_LR, FLAG_LS, FLAG_LT, FLAG_LU, FLAG_LV, FLAG_LY, FLAG_MA, FLAG_MC, FLAG_MD, FLAG_ME, FLAG_MF, FLAG_MG, FLAG_MH, FLAG_MK, FLAG_ML, FLAG_MM, FLAG_MN, FLAG_MO, FLAG_MP, FLAG_MQ, FLAG_MR, FLAG_MS, FLAG_MT, FLAG_MU, FLAG_MV, FLAG_MW, FLAG_MX, FLAG_MY, FLAG_MZ, FLAG_NA, FLAG_NC, FLAG_NE, FLAG_NF, FLAG_NG, FLAG_NI, FLAG_NL, FLAG_NO, FLAG_NP, FLAG_NR, FLAG_NU, FLAG_NZ, FLAG_OM, FLAG_PA, FLAG_PE, FLAG_PF, FLAG_PG, FLAG_PH, FLAG_PK, FLAG_PL, FLAG_PM, FLAG_PN, FLAG_PR, FLAG_PS, FLAG_PT, FLAG_PW, FLAG_PY, FLAG_QA, FLAG_RE, FLAG_RO, FLAG_RS, FLAG_RU, FLAG_RW, FLAG_SA, FLAG_SB, FLAG_SC, FLAG_SD, FLAG_SE, FLAG_SG, FLAG_SH, FLAG_SI, FLAG_SJ, FLAG_SK, FLAG_SL, FLAG_SM, FLAG_SN, FLAG_SO, FLAG_SR, FLAG_ST, FLAG_SV, FLAG_SX, FLAG_SY, FLAG_SZ, FLAG_TC, FLAG_TD, FLAG_TF, FLAG_TG, FLAG_TH, FLAG_TJ, FLAG_TK, FLAG_TL, FLAG_TM, FLAG_TN, FLAG_TO, FLAG_TR, FLAG_TT, FLAG_TV, FLAG_TW, FLAG_TZ, FLAG_UA, FLAG_UG, FLAG_UM, FLAG_US, FLAG_UY, FLAG_UZ, FLAG_VA, FLAG_VC, FLAG_VE, FLAG_VG, FLAG_VI, FLAG_VN, FLAG_VU, FLAG_WF, FLAG_WS, FLAG_YE, FLAG_YT, FLAG_ZA, FLAG_ZM, FLAG_ZW};
    }

    @JvmStatic
    public static final Flag fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Flag> getEntries() {
        return $ENTRIES;
    }

    private Flag(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Flag flag = new Flag("FLAG_UNSPECIFIED", 0, 0);
        FLAG_UNSPECIFIED = flag;
        FLAG_AD = new Flag("FLAG_AD", 1, 46);
        FLAG_AE = new Flag("FLAG_AE", 2, 47);
        FLAG_AF = new Flag("FLAG_AF", 3, 48);
        FLAG_AG = new Flag("FLAG_AG", 4, 49);
        FLAG_AI = new Flag("FLAG_AI", 5, 50);
        FLAG_AL = new Flag("FLAG_AL", 6, 51);
        FLAG_AM = new Flag("FLAG_AM", 7, 52);
        FLAG_AO = new Flag("FLAG_AO", 8, 53);
        FLAG_AQ = new Flag("FLAG_AQ", 9, 54);
        FLAG_AR = new Flag("FLAG_AR", 10, 55);
        FLAG_AS = new Flag("FLAG_AS", 11, 56);
        FLAG_AT = new Flag("FLAG_AT", 12, 1);
        FLAG_AU = new Flag("FLAG_AU", 13, 2);
        FLAG_AW = new Flag("FLAG_AW", 14, 57);
        FLAG_AX = new Flag("FLAG_AX", 15, 58);
        FLAG_AZ = new Flag("FLAG_AZ", 16, 59);
        FLAG_BA = new Flag("FLAG_BA", 17, 60);
        FLAG_BB = new Flag("FLAG_BB", 18, 61);
        FLAG_BD = new Flag("FLAG_BD", 19, 62);
        FLAG_BE = new Flag("FLAG_BE", 20, 3);
        FLAG_BF = new Flag("FLAG_BF", 21, 63);
        FLAG_BG = new Flag("FLAG_BG", 22, 4);
        FLAG_BH = new Flag("FLAG_BH", 23, 64);
        FLAG_BI = new Flag("FLAG_BI", 24, 65);
        FLAG_BJ = new Flag("FLAG_BJ", 25, 66);
        FLAG_BL = new Flag("FLAG_BL", 26, 67);
        FLAG_BM = new Flag("FLAG_BM", 27, 68);
        FLAG_BN = new Flag("FLAG_BN", 28, 69);
        FLAG_BO = new Flag("FLAG_BO", 29, 70);
        FLAG_BR = new Flag("FLAG_BR", 30, 71);
        FLAG_BS = new Flag("FLAG_BS", 31, 72);
        FLAG_BT = new Flag("FLAG_BT", 32, 73);
        FLAG_BV = new Flag("FLAG_BV", 33, 74);
        FLAG_BW = new Flag("FLAG_BW", 34, 75);
        FLAG_BY = new Flag("FLAG_BY", 35, 76);
        FLAG_BZ = new Flag("FLAG_BZ", 36, 77);
        FLAG_CA = new Flag("FLAG_CA", 37, 5);
        FLAG_CC = new Flag("FLAG_CC", 38, 78);
        FLAG_CD = new Flag("FLAG_CD", 39, 79);
        FLAG_CF = new Flag("FLAG_CF", 40, 80);
        FLAG_CG = new Flag("FLAG_CG", 41, 81);
        FLAG_CH = new Flag("FLAG_CH", 42, 6);
        FLAG_CI = new Flag("FLAG_CI", 43, 82);
        FLAG_CK = new Flag("FLAG_CK", 44, 83);
        FLAG_CL = new Flag("FLAG_CL", 45, 84);
        FLAG_CM = new Flag("FLAG_CM", 46, 85);
        FLAG_CN = new Flag("FLAG_CN", 47, 86);
        FLAG_CO = new Flag("FLAG_CO", 48, 87);
        FLAG_CR = new Flag("FLAG_CR", 49, 88);
        FLAG_CU = new Flag("FLAG_CU", 50, 89);
        FLAG_CV = new Flag("FLAG_CV", 51, 90);
        FLAG_CW = new Flag("FLAG_CW", 52, 91);
        FLAG_CX = new Flag("FLAG_CX", 53, 92);
        FLAG_CY = new Flag("FLAG_CY", 54, 7);
        FLAG_CZ = new Flag("FLAG_CZ", 55, 8);
        FLAG_DE = new Flag("FLAG_DE", 56, 9);
        FLAG_DJ = new Flag("FLAG_DJ", 57, 93);
        FLAG_DK = new Flag("FLAG_DK", 58, 10);
        FLAG_DM = new Flag("FLAG_DM", 59, 94);
        FLAG_DO = new Flag("FLAG_DO", 60, 95);
        FLAG_DZ = new Flag("FLAG_DZ", 61, 96);
        FLAG_EC = new Flag("FLAG_EC", 62, 97);
        FLAG_EE = new Flag("FLAG_EE", 63, 11);
        FLAG_EG = new Flag("FLAG_EG", 64, 98);
        FLAG_EH = new Flag("FLAG_EH", 65, 99);
        FLAG_ER = new Flag("FLAG_ER", 66, 100);
        FLAG_ES = new Flag("FLAG_ES", 67, 12);
        FLAG_ET = new Flag("FLAG_ET", 68, 101);
        FLAG_EU = new Flag("FLAG_EU", 69, 13);
        FLAG_FI = new Flag("FLAG_FI", 70, 14);
        FLAG_FJ = new Flag("FLAG_FJ", 71, 102);
        FLAG_FK = new Flag("FLAG_FK", 72, 103);
        FLAG_FM = new Flag("FLAG_FM", 73, 192);
        FLAG_FO = new Flag("FLAG_FO", 74, 104);
        FLAG_FR = new Flag("FLAG_FR", 75, 15);
        FLAG_GA = new Flag("FLAG_GA", 76, 105);
        FLAG_GB = new Flag("FLAG_GB", 77, 16);
        FLAG_GD = new Flag("FLAG_GD", 78, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE);
        FLAG_GE = new Flag("FLAG_GE", 79, 106);
        FLAG_GENERIC = new Flag("FLAG_GENERIC", 80, 17);
        FLAG_GF = new Flag("FLAG_GF", 81, 107);
        FLAG_GG = new Flag("FLAG_GG", 82, EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE);
        FLAG_GH = new Flag("FLAG_GH", 83, EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE);
        FLAG_GI = new Flag("FLAG_GI", 84, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
        FLAG_GL = new Flag("FLAG_GL", 85, EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE);
        FLAG_GM = new Flag("FLAG_GM", 86, 108);
        FLAG_GN = new Flag("FLAG_GN", 87, EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE);
        FLAG_GP = new Flag("FLAG_GP", 88, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE);
        FLAG_GQ = new Flag("FLAG_GQ", 89, 109);
        FLAG_GR = new Flag("FLAG_GR", 90, 18);
        FLAG_GS = new Flag("FLAG_GS", 91, 110);
        FLAG_GT = new Flag("FLAG_GT", 92, 200);
        FLAG_GU = new Flag("FLAG_GU", 93, 201);
        FLAG_GW = new Flag("FLAG_GW", 94, 202);
        FLAG_GY = new Flag("FLAG_GY", 95, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE);
        FLAG_HK = new Flag("FLAG_HK", 96, 19);
        FLAG_HM = new Flag("FLAG_HM", 97, 204);
        FLAG_HN = new Flag("FLAG_HN", 98, EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE);
        FLAG_HR = new Flag("FLAG_HR", 99, 20);
        FLAG_HT = new Flag("FLAG_HT", 100, EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE);
        FLAG_HU = new Flag("FLAG_HU", 101, 21);
        FLAG_ID = new Flag("FLAG_ID", 102, 22);
        FLAG_IE = new Flag("FLAG_IE", 103, 23);
        FLAG_IL = new Flag("FLAG_IL", 104, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE);
        FLAG_IM = new Flag("FLAG_IM", 105, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE);
        FLAG_IN = new Flag("FLAG_IN", 106, 111);
        FLAG_IO = new Flag("FLAG_IO", 107, 112);
        FLAG_IQ = new Flag("FLAG_IQ", 108, EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE);
        FLAG_IR = new Flag("FLAG_IR", 109, EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
        FLAG_IS = new Flag("FLAG_IS", 110, 113);
        FLAG_IT = new Flag("FLAG_IT", 111, 24);
        FLAG_JE = new Flag("FLAG_JE", 112, 211);
        FLAG_JM = new Flag("FLAG_JM", 113, EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE);
        FLAG_JO = new Flag("FLAG_JO", 114, EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE);
        FLAG_JP = new Flag("FLAG_JP", 115, 25);
        FLAG_KE = new Flag("FLAG_KE", 116, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE);
        FLAG_KG = new Flag("FLAG_KG", 117, EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE);
        FLAG_KH = new Flag("FLAG_KH", 118, 114);
        FLAG_KI = new Flag("FLAG_KI", 119, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
        FLAG_KM = new Flag("FLAG_KM", 120, 115);
        FLAG_KN = new Flag("FLAG_KN", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, 116);
        FLAG_KP = new Flag("FLAG_KP", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE);
        FLAG_KR = new Flag("FLAG_KR", 123, EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE);
        FLAG_KW = new Flag("FLAG_KW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE);
        FLAG_KY = new Flag("FLAG_KY", 125, 117);
        FLAG_KZ = new Flag("FLAG_KZ", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
        FLAG_LA = new Flag("FLAG_LA", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE);
        FLAG_LB = new Flag("FLAG_LB", 128, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
        FLAG_LC = new Flag("FLAG_LC", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 118);
        FLAG_LI = new Flag("FLAG_LI", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 119);
        FLAG_LK = new Flag("FLAG_LK", 131, 120);
        FLAG_LR = new Flag("FLAG_LR", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
        FLAG_LS = new Flag("FLAG_LS", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 224);
        FLAG_LT = new Flag("FLAG_LT", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, 26);
        FLAG_LU = new Flag("FLAG_LU", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, 27);
        FLAG_LV = new Flag("FLAG_LV", 136, 28);
        FLAG_LY = new Flag("FLAG_LY", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, 225);
        FLAG_MA = new Flag("FLAG_MA", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE);
        FLAG_MC = new Flag("FLAG_MC", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE);
        FLAG_MD = new Flag("FLAG_MD", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
        FLAG_ME = new Flag("FLAG_ME", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE);
        FLAG_MF = new Flag("FLAG_MF", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
        FLAG_MG = new Flag("FLAG_MG", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
        FLAG_MH = new Flag("FLAG_MH", 144, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE);
        FLAG_MK = new Flag("FLAG_MK", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
        FLAG_ML = new Flag("FLAG_ML", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
        FLAG_MM = new Flag("FLAG_MM", 147, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE);
        FLAG_MN = new Flag("FLAG_MN", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
        FLAG_MO = new Flag("FLAG_MO", EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
        FLAG_MP = new Flag("FLAG_MP", 150, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        FLAG_MQ = new Flag("FLAG_MQ", 151, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE);
        FLAG_MR = new Flag("FLAG_MR", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
        FLAG_MS = new Flag("FLAG_MS", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, 239);
        FLAG_MT = new Flag("FLAG_MT", EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, 29);
        FLAG_MU = new Flag("FLAG_MU", 155, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        FLAG_MV = new Flag("FLAG_MV", 156, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE);
        FLAG_MW = new Flag("FLAG_MW", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, EnumC7081g.f2778x3356acf6);
        FLAG_MX = new Flag("FLAG_MX", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 123);
        FLAG_MY = new Flag("FLAG_MY", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, 30);
        FLAG_MZ = new Flag("FLAG_MZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE);
        FLAG_NA = new Flag("FLAG_NA", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
        FLAG_NC = new Flag("FLAG_NC", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
        FLAG_NE = new Flag("FLAG_NE", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        FLAG_NF = new Flag("FLAG_NF", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 125);
        FLAG_NG = new Flag("FLAG_NG", 165, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        FLAG_NI = new Flag("FLAG_NI", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
        FLAG_NL = new Flag("FLAG_NL", 167, 31);
        FLAG_NO = new Flag("FLAG_NO", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 32);
        FLAG_NP = new Flag("FLAG_NP", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
        FLAG_NR = new Flag("FLAG_NR", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE);
        FLAG_NU = new Flag("FLAG_NU", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, 128);
        FLAG_NZ = new Flag("FLAG_NZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 33);
        FLAG_OM = new Flag("FLAG_OM", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        FLAG_PA = new Flag("FLAG_PA", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
        FLAG_PE = new Flag("FLAG_PE", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, 131);
        FLAG_PF = new Flag("FLAG_PF", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
        FLAG_PG = new Flag("FLAG_PG", EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
        FLAG_PH = new Flag("FLAG_PH", EnumC7081g.f2773x8d9721ad, 34);
        FLAG_PK = new Flag("FLAG_PK", EnumC7081g.f2780x600b66fe, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE);
        FLAG_PL = new Flag("FLAG_PL", EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 35);
        FLAG_PM = new Flag("FLAG_PM", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE);
        FLAG_PN = new Flag("FLAG_PN", 182, 136);
        FLAG_PR = new Flag("FLAG_PR", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE);
        FLAG_PS = new Flag("FLAG_PS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE);
        FLAG_PT = new Flag("FLAG_PT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, 36);
        FLAG_PW = new Flag("FLAG_PW", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
        FLAG_PY = new Flag("FLAG_PY", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
        FLAG_QA = new Flag("FLAG_QA", 188, EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE);
        FLAG_RE = new Flag("FLAG_RE", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE);
        FLAG_RO = new Flag("FLAG_RO", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 37);
        FLAG_RS = new Flag("FLAG_RS", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE);
        FLAG_RU = new Flag("FLAG_RU", 192, 144);
        FLAG_RW = new Flag("FLAG_RW", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE);
        FLAG_SA = new Flag("FLAG_SA", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE);
        FLAG_SB = new Flag("FLAG_SB", EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 147);
        FLAG_SC = new Flag("FLAG_SC", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
        FLAG_SD = new Flag("FLAG_SD", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE);
        FLAG_SE = new Flag("FLAG_SE", EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, 38);
        FLAG_SG = new Flag("FLAG_SG", EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, 39);
        FLAG_SH = new Flag("FLAG_SH", 200, 150);
        FLAG_SI = new Flag("FLAG_SI", 201, 40);
        FLAG_SJ = new Flag("FLAG_SJ", 202, 151);
        FLAG_SK = new Flag("FLAG_SK", EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, 41);
        FLAG_SL = new Flag("FLAG_SL", 204, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
        FLAG_SM = new Flag("FLAG_SM", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE);
        FLAG_SN = new Flag("FLAG_SN", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE);
        FLAG_SO = new Flag("FLAG_SO", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, 155);
        FLAG_SR = new Flag("FLAG_SR", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, 156);
        FLAG_ST = new Flag("FLAG_ST", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE);
        FLAG_SV = new Flag("FLAG_SV", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
        FLAG_SX = new Flag("FLAG_SX", 211, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE);
        FLAG_SY = new Flag("FLAG_SY", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
        FLAG_SZ = new Flag("FLAG_SZ", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE);
        FLAG_TC = new Flag("FLAG_TC", EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE);
        FLAG_TD = new Flag("FLAG_TD", EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE);
        FLAG_TF = new Flag("FLAG_TF", EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
        FLAG_TG = new Flag("FLAG_TG", EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE, 165);
        FLAG_TH = new Flag("FLAG_TH", EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE, 42);
        FLAG_TJ = new Flag("FLAG_TJ", EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE);
        FLAG_TK = new Flag("FLAG_TK", EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 167);
        FLAG_TL = new Flag("FLAG_TL", EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
        FLAG_TM = new Flag("FLAG_TM", EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE);
        FLAG_TN = new Flag("FLAG_TN", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
        FLAG_TO = new Flag("FLAG_TO", 224, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE);
        FLAG_TR = new Flag("FLAG_TR", 225, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE);
        FLAG_TT = new Flag("FLAG_TT", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE);
        FLAG_TV = new Flag("FLAG_TV", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE);
        FLAG_TW = new Flag("FLAG_TW", EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, 43);
        FLAG_TZ = new Flag("FLAG_TZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE);
        FLAG_UA = new Flag("FLAG_UA", EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
        FLAG_UG = new Flag("FLAG_UG", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
        FLAG_UM = new Flag("FLAG_UM", EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC7081g.f2773x8d9721ad);
        FLAG_US = new Flag("FLAG_US", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 44);
        FLAG_UY = new Flag("FLAG_UY", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, EnumC7081g.f2780x600b66fe);
        FLAG_UZ = new Flag("FLAG_UZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE);
        FLAG_VA = new Flag("FLAG_VA", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
        FLAG_VC = new Flag("FLAG_VC", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE);
        FLAG_VE = new Flag("FLAG_VE", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, 182);
        FLAG_VG = new Flag("FLAG_VG", 239, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE);
        FLAG_VI = new Flag("FLAG_VI", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
        FLAG_VN = new Flag("FLAG_VN", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 45);
        FLAG_VU = new Flag("FLAG_VU", EnumC7081g.f2778x3356acf6, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE);
        FLAG_WF = new Flag("FLAG_WF", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE);
        FLAG_WS = new Flag("FLAG_WS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE);
        FLAG_YE = new Flag("FLAG_YE", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 188);
        FLAG_YT = new Flag("FLAG_YT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC7081g.f2779x59907a3d);
        FLAG_ZA = new Flag("FLAG_ZA", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE);
        FLAG_ZM = new Flag("FLAG_ZM", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
        FLAG_ZW = new Flag("FLAG_ZW", EnumC7081g.f2779x59907a3d, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
        Flag[] flagArr$values = $values();
        $VALUES = flagArr$values;
        $ENTRIES = EnumEntries2.enumEntries(flagArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Flag.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Flag>(orCreateKotlinClass, syntax, flag) { // from class: rh_server_driven_ui.v1.Flag$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Flag fromValue(int value) {
                return Flag.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Flag.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/Flag$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/Flag;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Flag fromValue(int value) {
            switch (value) {
                case 0:
                    return Flag.FLAG_UNSPECIFIED;
                case 1:
                    return Flag.FLAG_AT;
                case 2:
                    return Flag.FLAG_AU;
                case 3:
                    return Flag.FLAG_BE;
                case 4:
                    return Flag.FLAG_BG;
                case 5:
                    return Flag.FLAG_CA;
                case 6:
                    return Flag.FLAG_CH;
                case 7:
                    return Flag.FLAG_CY;
                case 8:
                    return Flag.FLAG_CZ;
                case 9:
                    return Flag.FLAG_DE;
                case 10:
                    return Flag.FLAG_DK;
                case 11:
                    return Flag.FLAG_EE;
                case 12:
                    return Flag.FLAG_ES;
                case 13:
                    return Flag.FLAG_EU;
                case 14:
                    return Flag.FLAG_FI;
                case 15:
                    return Flag.FLAG_FR;
                case 16:
                    return Flag.FLAG_GB;
                case 17:
                    return Flag.FLAG_GENERIC;
                case 18:
                    return Flag.FLAG_GR;
                case 19:
                    return Flag.FLAG_HK;
                case 20:
                    return Flag.FLAG_HR;
                case 21:
                    return Flag.FLAG_HU;
                case 22:
                    return Flag.FLAG_ID;
                case 23:
                    return Flag.FLAG_IE;
                case 24:
                    return Flag.FLAG_IT;
                case 25:
                    return Flag.FLAG_JP;
                case 26:
                    return Flag.FLAG_LT;
                case 27:
                    return Flag.FLAG_LU;
                case 28:
                    return Flag.FLAG_LV;
                case 29:
                    return Flag.FLAG_MT;
                case 30:
                    return Flag.FLAG_MY;
                case 31:
                    return Flag.FLAG_NL;
                case 32:
                    return Flag.FLAG_NO;
                case 33:
                    return Flag.FLAG_NZ;
                case 34:
                    return Flag.FLAG_PH;
                case 35:
                    return Flag.FLAG_PL;
                case 36:
                    return Flag.FLAG_PT;
                case 37:
                    return Flag.FLAG_RO;
                case 38:
                    return Flag.FLAG_SE;
                case 39:
                    return Flag.FLAG_SG;
                case 40:
                    return Flag.FLAG_SI;
                case 41:
                    return Flag.FLAG_SK;
                case 42:
                    return Flag.FLAG_TH;
                case 43:
                    return Flag.FLAG_TW;
                case 44:
                    return Flag.FLAG_US;
                case 45:
                    return Flag.FLAG_VN;
                case 46:
                    return Flag.FLAG_AD;
                case 47:
                    return Flag.FLAG_AE;
                case 48:
                    return Flag.FLAG_AF;
                case 49:
                    return Flag.FLAG_AG;
                case 50:
                    return Flag.FLAG_AI;
                case 51:
                    return Flag.FLAG_AL;
                case 52:
                    return Flag.FLAG_AM;
                case 53:
                    return Flag.FLAG_AO;
                case 54:
                    return Flag.FLAG_AQ;
                case 55:
                    return Flag.FLAG_AR;
                case 56:
                    return Flag.FLAG_AS;
                case 57:
                    return Flag.FLAG_AW;
                case 58:
                    return Flag.FLAG_AX;
                case 59:
                    return Flag.FLAG_AZ;
                case 60:
                    return Flag.FLAG_BA;
                case 61:
                    return Flag.FLAG_BB;
                case 62:
                    return Flag.FLAG_BD;
                case 63:
                    return Flag.FLAG_BF;
                case 64:
                    return Flag.FLAG_BH;
                case 65:
                    return Flag.FLAG_BI;
                case 66:
                    return Flag.FLAG_BJ;
                case 67:
                    return Flag.FLAG_BL;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return Flag.FLAG_BM;
                case 69:
                    return Flag.FLAG_BN;
                case 70:
                    return Flag.FLAG_BO;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return Flag.FLAG_BR;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return Flag.FLAG_BS;
                case 73:
                    return Flag.FLAG_BT;
                case 74:
                    return Flag.FLAG_BV;
                case 75:
                    return Flag.FLAG_BW;
                case 76:
                    return Flag.FLAG_BY;
                case 77:
                    return Flag.FLAG_BZ;
                case 78:
                    return Flag.FLAG_CC;
                case 79:
                    return Flag.FLAG_CD;
                case 80:
                    return Flag.FLAG_CF;
                case 81:
                    return Flag.FLAG_CG;
                case 82:
                    return Flag.FLAG_CI;
                case 83:
                    return Flag.FLAG_CK;
                case 84:
                    return Flag.FLAG_CL;
                case 85:
                    return Flag.FLAG_CM;
                case 86:
                    return Flag.FLAG_CN;
                case 87:
                    return Flag.FLAG_CO;
                case 88:
                    return Flag.FLAG_CR;
                case 89:
                    return Flag.FLAG_CU;
                case 90:
                    return Flag.FLAG_CV;
                case 91:
                    return Flag.FLAG_CW;
                case 92:
                    return Flag.FLAG_CX;
                case 93:
                    return Flag.FLAG_DJ;
                case 94:
                    return Flag.FLAG_DM;
                case 95:
                    return Flag.FLAG_DO;
                case 96:
                    return Flag.FLAG_DZ;
                case 97:
                    return Flag.FLAG_EC;
                case 98:
                    return Flag.FLAG_EG;
                case 99:
                    return Flag.FLAG_EH;
                case 100:
                    return Flag.FLAG_ER;
                case 101:
                    return Flag.FLAG_ET;
                case 102:
                    return Flag.FLAG_FJ;
                case 103:
                    return Flag.FLAG_FK;
                case 104:
                    return Flag.FLAG_FO;
                case 105:
                    return Flag.FLAG_GA;
                case 106:
                    return Flag.FLAG_GE;
                case 107:
                    return Flag.FLAG_GF;
                case 108:
                    return Flag.FLAG_GM;
                case 109:
                    return Flag.FLAG_GQ;
                case 110:
                    return Flag.FLAG_GS;
                case 111:
                    return Flag.FLAG_IN;
                case 112:
                    return Flag.FLAG_IO;
                case 113:
                    return Flag.FLAG_IS;
                case 114:
                    return Flag.FLAG_KH;
                case 115:
                    return Flag.FLAG_KM;
                case 116:
                    return Flag.FLAG_KN;
                case 117:
                    return Flag.FLAG_KY;
                case 118:
                    return Flag.FLAG_LC;
                case 119:
                    return Flag.FLAG_LI;
                case 120:
                    return Flag.FLAG_LK;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                    return Flag.FLAG_MF;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    return Flag.FLAG_MP;
                case 123:
                    return Flag.FLAG_MX;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return Flag.FLAG_NE;
                case 125:
                    return Flag.FLAG_NF;
                case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                    return Flag.FLAG_NG;
                case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                    return Flag.FLAG_NI;
                case 128:
                    return Flag.FLAG_NU;
                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                    return Flag.FLAG_OM;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                    return Flag.FLAG_PA;
                case 131:
                    return Flag.FLAG_PE;
                case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                    return Flag.FLAG_PF;
                case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                    return Flag.FLAG_PG;
                case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                    return Flag.FLAG_PK;
                case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                    return Flag.FLAG_PM;
                case 136:
                    return Flag.FLAG_PN;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                    return Flag.FLAG_PR;
                case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                    return Flag.FLAG_PS;
                case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                    return Flag.FLAG_PW;
                case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                    return Flag.FLAG_PY;
                case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                    return Flag.FLAG_QA;
                case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                    return Flag.FLAG_RE;
                case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                    return Flag.FLAG_RS;
                case 144:
                    return Flag.FLAG_RU;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                    return Flag.FLAG_RW;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                    return Flag.FLAG_SA;
                case 147:
                    return Flag.FLAG_SB;
                case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                    return Flag.FLAG_SC;
                case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                    return Flag.FLAG_SD;
                case 150:
                    return Flag.FLAG_SH;
                case 151:
                    return Flag.FLAG_SJ;
                case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                    return Flag.FLAG_SL;
                case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
                    return Flag.FLAG_SM;
                case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                    return Flag.FLAG_SN;
                case 155:
                    return Flag.FLAG_SO;
                case 156:
                    return Flag.FLAG_SR;
                case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                    return Flag.FLAG_ST;
                case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                    return Flag.FLAG_SV;
                case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                    return Flag.FLAG_SX;
                case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                    return Flag.FLAG_SY;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                    return Flag.FLAG_SZ;
                case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                    return Flag.FLAG_TC;
                case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                    return Flag.FLAG_TD;
                case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                    return Flag.FLAG_TF;
                case 165:
                    return Flag.FLAG_TG;
                case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                    return Flag.FLAG_TJ;
                case 167:
                    return Flag.FLAG_TK;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                    return Flag.FLAG_TL;
                case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                    return Flag.FLAG_TM;
                case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                    return Flag.FLAG_TN;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                    return Flag.FLAG_TO;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                    return Flag.FLAG_TR;
                case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                    return Flag.FLAG_TT;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                    return Flag.FLAG_TV;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                    return Flag.FLAG_TZ;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                    return Flag.FLAG_UA;
                case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                    return Flag.FLAG_UG;
                case f2773x8d9721ad:
                    return Flag.FLAG_UM;
                case f2780x600b66fe:
                    return Flag.FLAG_UY;
                case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                    return Flag.FLAG_UZ;
                case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                    return Flag.FLAG_VC;
                case 182:
                    return Flag.FLAG_VE;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                    return Flag.FLAG_VG;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                    return Flag.FLAG_VI;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE:
                    return Flag.FLAG_VU;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                    return Flag.FLAG_WF;
                case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                    return Flag.FLAG_WS;
                case 188:
                    return Flag.FLAG_YE;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                    return Flag.FLAG_ZA;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                    return Flag.FLAG_ZM;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                    return Flag.FLAG_ZW;
                case 192:
                    return Flag.FLAG_FM;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                    return Flag.FLAG_GD;
                case SDK_ASSET_ICON_EXTERNAL_VALUE:
                    return Flag.FLAG_GG;
                case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                    return Flag.FLAG_GH;
                case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                    return Flag.FLAG_GI;
                case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                    return Flag.FLAG_GL;
                case SDK_ASSET_ICON_ARROW_UP_VALUE:
                    return Flag.FLAG_GN;
                case SDK_ASSET_ICON_CANCEL_VALUE:
                    return Flag.FLAG_GP;
                case 200:
                    return Flag.FLAG_GT;
                case 201:
                    return Flag.FLAG_GU;
                case 202:
                    return Flag.FLAG_GW;
                case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                    return Flag.FLAG_GY;
                case 204:
                    return Flag.FLAG_HM;
                case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                    return Flag.FLAG_HN;
                case SDK_ASSET_ICON_CLOCK_VALUE:
                    return Flag.FLAG_HT;
                case SDK_ASSET_ICON_COMMENT_VALUE:
                    return Flag.FLAG_IL;
                case SDK_ASSET_ICON_INCOME_VALUE:
                    return Flag.FLAG_IM;
                case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                    return Flag.FLAG_IQ;
                case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                    return Flag.FLAG_IR;
                case 211:
                    return Flag.FLAG_JE;
                case SDK_ASSET_ICON_OVERRIDE_VALUE:
                    return Flag.FLAG_JM;
                case SDK_ASSET_ICON_PAUSE_VALUE:
                    return Flag.FLAG_JO;
                case SDK_ASSET_ICON_PIN_VALUE:
                    return Flag.FLAG_KE;
                case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                    return Flag.FLAG_KG;
                case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                    return Flag.FLAG_KI;
                case SDK_ASSET_ICON_PROGRESS_VALUE:
                    return Flag.FLAG_KP;
                case SDK_ASSET_ICON_QUESTION_VALUE:
                    return Flag.FLAG_KR;
                case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                    return Flag.FLAG_KW;
                case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                    return Flag.FLAG_KZ;
                case SDK_ASSET_ICON_SUBMIT_VALUE:
                    return Flag.FLAG_LA;
                case SDK_ASSET_ICON_SUBTRACT_VALUE:
                    return Flag.FLAG_LB;
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                    return Flag.FLAG_LR;
                case 224:
                    return Flag.FLAG_LS;
                case 225:
                    return Flag.FLAG_LY;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                    return Flag.FLAG_MA;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                    return Flag.FLAG_MC;
                case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                    return Flag.FLAG_MD;
                case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                    return Flag.FLAG_ME;
                case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                    return Flag.FLAG_MG;
                case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                    return Flag.FLAG_MH;
                case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                    return Flag.FLAG_MK;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                    return Flag.FLAG_ML;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                    return Flag.FLAG_MM;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                    return Flag.FLAG_MN;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                    return Flag.FLAG_MO;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                    return Flag.FLAG_MQ;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                    return Flag.FLAG_MR;
                case 239:
                    return Flag.FLAG_MS;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                    return Flag.FLAG_MU;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                    return Flag.FLAG_MV;
                case f2778x3356acf6:
                    return Flag.FLAG_MW;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                    return Flag.FLAG_MZ;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                    return Flag.FLAG_NA;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                    return Flag.FLAG_NC;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                    return Flag.FLAG_NP;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                    return Flag.FLAG_NR;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                    return Flag.FLAG_VA;
                case f2779x59907a3d:
                    return Flag.FLAG_YT;
                default:
                    return null;
            }
        }
    }

    public static Flag valueOf(String str) {
        return (Flag) Enum.valueOf(Flag.class, str);
    }

    public static Flag[] values() {
        return (Flag[]) $VALUES.clone();
    }
}
