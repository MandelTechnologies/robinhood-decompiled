package com.robinhood.android.libdesignsystem.serverui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.enums.RhEnum;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServerToBentoAssetMapper.kt */
@Metadata(m3635d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\bÿ\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u0087\u00022\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u0087\u0002B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0083\u0002\u001a\u00030\u0084\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002¨\u0006\u0088\u0002"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/FlagAsset;", "Lcom/robinhood/enums/RhEnum;", "", "resourceId", "", "<init>", "(Ljava/lang/String;II)V", "getResourceId", "()I", "UNKNOWN", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", CountryCode.COUNTRY_CODE_AS, CountryCode.COUNTRY_CODE_AT, CountryCode.COUNTRY_CODE_AU, "AW", "AX", "AZ", "BA", "BB", "BD", CountryCode.COUNTRY_CODE_BE, "BF", CountryCode.COUNTRY_CODE_BG, "BH", "BI", "BJ", "BL", "BM", CountryCode.COUNTRY_CODE_BN, "BO", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", CountryCode.COUNTRY_CODE_CK, "CL", "CM", CountryCode.COUNTRY_CODE_CN, "CO", "CR", "CU", "CV", "CW", "CX", CountryCode.COUNTRY_CODE_CY, CountryCode.COUNTRY_CODE_CZ, CountryCode.COUNTRY_CODE_DE, "DJ", CountryCode.COUNTRY_CODE_DK, "DM", "DO", "DZ", "EC", CountryCode.COUNTRY_CODE_EE, "EG", "EH", "ER", CountryCode.COUNTRY_CODE_ES, "ET", "EU", CountryCode.COUNTRY_CODE_FI, CountryCode.COUNTRY_CODE_FJ, "FK", CountryCode.COUNTRY_CODE_FM, "FO", CountryCode.COUNTRY_CODE_FR, "GA", CountryCode.COUNTRY_CODE_GB, "GD", "GE", "GENERIC", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", CountryCode.COUNTRY_CODE_GR, "GS", "GT", CountryCode.COUNTRY_CODE_GU, "GW", "GY", CountryCode.COUNTRY_CODE_HK, "HM", "HN", CountryCode.COUNTRY_CODE_HR, "HT", CountryCode.COUNTRY_CODE_HU, CountryCode.COUNTRY_CODE_ID, CountryCode.COUNTRY_CODE_IE, "IL", "IM", CountryCode.COUNTRY_CODE_IN, "IO", "IQ", "IR", CountryCode.COUNTRY_CODE_IS, CountryCode.COUNTRY_CODE_IT, "JE", "JM", "JO", CountryCode.COUNTRY_CODE_JP, "KE", "KG", CountryCode.COUNTRY_CODE_KH, CountryCode.COUNTRY_CODE_KI, "KM", "KN", "KP", CountryCode.COUNTRY_CODE_KR, "KW", "KY", "KZ", CountryCode.COUNTRY_CODE_LA, "LB", "LC", CountryCode.COUNTRY_CODE_LI, "LK", "LR", "LS", CountryCode.COUNTRY_CODE_LT, CountryCode.COUNTRY_CODE_LU, CountryCode.COUNTRY_CODE_LV, "LY", "MA", "MC", "MD", "ME", "MF", "MG", CountryCode.COUNTRY_CODE_MH, "MK", "ML", "MM", CountryCode.COUNTRY_CODE_MN, CountryCode.COUNTRY_CODE_MO, CountryCode.COUNTRY_CODE_MP, "MQ", "MR", "MS", CountryCode.COUNTRY_CODE_MT, "MU", "MV", "MW", "MX", CountryCode.COUNTRY_CODE_MY, "MZ", "NA", CountryCode.COUNTRY_CODE_NC, "NE", "NF", "NG", "NI", CountryCode.COUNTRY_CODE_NL, CountryCode.COUNTRY_CODE_NO, "NP", CountryCode.COUNTRY_CODE_NR, CountryCode.COUNTRY_CODE_NU, CountryCode.COUNTRY_CODE_NZ, "OM", "PA", "PE", "PF", CountryCode.COUNTRY_CODE_PG, CountryCode.COUNTRY_CODE_PH, "PK", CountryCode.COUNTRY_CODE_PL, "PM", "PN", "PR", "PS", CountryCode.COUNTRY_CODE_PT, CountryCode.COUNTRY_CODE_PW, "PY", "QA", "RE", CountryCode.COUNTRY_CODE_RO, "RS", "RU", "RW", "SA", CountryCode.COUNTRY_CODE_SB, "SC", "SD", CountryCode.COUNTRY_CODE_SE, CountryCode.COUNTRY_CODE_SG, "SH", CountryCode.COUNTRY_CODE_SI, "SJ", CountryCode.COUNTRY_CODE_SK, "SL", "SM", "SN", "SO", "SR", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", CountryCode.COUNTRY_CODE_TH, "TJ", "TK", CountryCode.COUNTRY_CODE_TL, "TM", "TN", CountryCode.COUNTRY_CODE_TO, "TR", "TT", CountryCode.COUNTRY_CODE_TV, CountryCode.COUNTRY_CODE_TW, "TZ", "UA", "UG", CountryCode.COUNTRY_CODE_UM, CountryCode.COUNTRY_CODE_US, "UY", "UZ", "VA", "VC", "VE", "VG", CountryCode.COUNTRY_CODE_VI, CountryCode.COUNTRY_CODE_VN, CountryCode.COUNTRY_CODE_VU, "WF", CountryCode.COUNTRY_CODE_WS, "YE", "YT", "ZA", "ZM", "ZW", "serverValue", "", "getServerValue", "()Ljava/lang/String;", "Companion", "lib-design-system-res_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.FlagAsset, reason: use source file name */
/* loaded from: classes8.dex */
public final class ServerToBentoAssetMapper implements RhEnum<ServerToBentoAssetMapper> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ServerToBentoAssetMapper[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Map<String, ServerToBentoAssetMapper> map;
    private final int resourceId;
    public static final ServerToBentoAssetMapper UNKNOWN = new ServerToBentoAssetMapper("UNKNOWN", 0, C20690R.drawable.empty);

    /* renamed from: AD */
    public static final ServerToBentoAssetMapper f4282AD = new ServerToBentoAssetMapper("AD", 1, C20690R.drawable.ic_flag_ad);

    /* renamed from: AE */
    public static final ServerToBentoAssetMapper f4283AE = new ServerToBentoAssetMapper("AE", 2, C20690R.drawable.ic_flag_ae);

    /* renamed from: AF */
    public static final ServerToBentoAssetMapper f4284AF = new ServerToBentoAssetMapper("AF", 3, C20690R.drawable.ic_flag_af);

    /* renamed from: AG */
    public static final ServerToBentoAssetMapper f4285AG = new ServerToBentoAssetMapper("AG", 4, C20690R.drawable.ic_flag_ag);

    /* renamed from: AI */
    public static final ServerToBentoAssetMapper f4286AI = new ServerToBentoAssetMapper("AI", 5, C20690R.drawable.ic_flag_ai);

    /* renamed from: AL */
    public static final ServerToBentoAssetMapper f4287AL = new ServerToBentoAssetMapper("AL", 6, C20690R.drawable.ic_flag_al);

    /* renamed from: AM */
    public static final ServerToBentoAssetMapper f4288AM = new ServerToBentoAssetMapper("AM", 7, C20690R.drawable.ic_flag_am);

    /* renamed from: AO */
    public static final ServerToBentoAssetMapper f4289AO = new ServerToBentoAssetMapper("AO", 8, C20690R.drawable.ic_flag_ao);

    /* renamed from: AQ */
    public static final ServerToBentoAssetMapper f4290AQ = new ServerToBentoAssetMapper("AQ", 9, C20690R.drawable.ic_flag_aq);

    /* renamed from: AR */
    public static final ServerToBentoAssetMapper f4291AR = new ServerToBentoAssetMapper("AR", 10, C20690R.drawable.ic_flag_ar);

    /* renamed from: AS */
    public static final ServerToBentoAssetMapper f4292AS = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_AS, 11, C20690R.drawable.ic_flag_as);

    /* renamed from: AT */
    public static final ServerToBentoAssetMapper f4293AT = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_AT, 12, C20690R.drawable.ic_flag_at);

    /* renamed from: AU */
    public static final ServerToBentoAssetMapper f4294AU = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_AU, 13, C20690R.drawable.ic_flag_au);

    /* renamed from: AW */
    public static final ServerToBentoAssetMapper f4295AW = new ServerToBentoAssetMapper("AW", 14, C20690R.drawable.ic_flag_aw);

    /* renamed from: AX */
    public static final ServerToBentoAssetMapper f4296AX = new ServerToBentoAssetMapper("AX", 15, C20690R.drawable.ic_flag_ax);

    /* renamed from: AZ */
    public static final ServerToBentoAssetMapper f4297AZ = new ServerToBentoAssetMapper("AZ", 16, C20690R.drawable.ic_flag_az);

    /* renamed from: BA */
    public static final ServerToBentoAssetMapper f4298BA = new ServerToBentoAssetMapper("BA", 17, C20690R.drawable.ic_flag_ba);

    /* renamed from: BB */
    public static final ServerToBentoAssetMapper f4299BB = new ServerToBentoAssetMapper("BB", 18, C20690R.drawable.ic_flag_bb);

    /* renamed from: BD */
    public static final ServerToBentoAssetMapper f4300BD = new ServerToBentoAssetMapper("BD", 19, C20690R.drawable.ic_flag_bd);

    /* renamed from: BE */
    public static final ServerToBentoAssetMapper f4301BE = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_BE, 20, C20690R.drawable.ic_flag_be);

    /* renamed from: BF */
    public static final ServerToBentoAssetMapper f4302BF = new ServerToBentoAssetMapper("BF", 21, C20690R.drawable.ic_flag_bf);

    /* renamed from: BG */
    public static final ServerToBentoAssetMapper f4303BG = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_BG, 22, C20690R.drawable.ic_flag_bg);

    /* renamed from: BH */
    public static final ServerToBentoAssetMapper f4304BH = new ServerToBentoAssetMapper("BH", 23, C20690R.drawable.ic_flag_bh);

    /* renamed from: BI */
    public static final ServerToBentoAssetMapper f4305BI = new ServerToBentoAssetMapper("BI", 24, C20690R.drawable.ic_flag_bi);

    /* renamed from: BJ */
    public static final ServerToBentoAssetMapper f4306BJ = new ServerToBentoAssetMapper("BJ", 25, C20690R.drawable.ic_flag_bj);

    /* renamed from: BL */
    public static final ServerToBentoAssetMapper f4307BL = new ServerToBentoAssetMapper("BL", 26, C20690R.drawable.ic_flag_bl);

    /* renamed from: BM */
    public static final ServerToBentoAssetMapper f4308BM = new ServerToBentoAssetMapper("BM", 27, C20690R.drawable.ic_flag_bm);

    /* renamed from: BN */
    public static final ServerToBentoAssetMapper f4309BN = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_BN, 28, C20690R.drawable.ic_flag_bn);

    /* renamed from: BO */
    public static final ServerToBentoAssetMapper f4310BO = new ServerToBentoAssetMapper("BO", 29, C20690R.drawable.ic_flag_bo);

    /* renamed from: BR */
    public static final ServerToBentoAssetMapper f4311BR = new ServerToBentoAssetMapper("BR", 30, C20690R.drawable.ic_flag_br);

    /* renamed from: BS */
    public static final ServerToBentoAssetMapper f4312BS = new ServerToBentoAssetMapper("BS", 31, C20690R.drawable.ic_flag_bs);

    /* renamed from: BT */
    public static final ServerToBentoAssetMapper f4313BT = new ServerToBentoAssetMapper("BT", 32, C20690R.drawable.ic_flag_bt);

    /* renamed from: BV */
    public static final ServerToBentoAssetMapper f4314BV = new ServerToBentoAssetMapper("BV", 33, C20690R.drawable.ic_flag_bv);

    /* renamed from: BW */
    public static final ServerToBentoAssetMapper f4315BW = new ServerToBentoAssetMapper("BW", 34, C20690R.drawable.ic_flag_bw);

    /* renamed from: BY */
    public static final ServerToBentoAssetMapper f4316BY = new ServerToBentoAssetMapper("BY", 35, C20690R.drawable.ic_flag_by);

    /* renamed from: BZ */
    public static final ServerToBentoAssetMapper f4317BZ = new ServerToBentoAssetMapper("BZ", 36, C20690R.drawable.ic_flag_bz);

    /* renamed from: CA */
    public static final ServerToBentoAssetMapper f4318CA = new ServerToBentoAssetMapper("CA", 37, C20690R.drawable.ic_flag_ca);

    /* renamed from: CC */
    public static final ServerToBentoAssetMapper f4319CC = new ServerToBentoAssetMapper("CC", 38, C20690R.drawable.ic_flag_cc);

    /* renamed from: CD */
    public static final ServerToBentoAssetMapper f4320CD = new ServerToBentoAssetMapper("CD", 39, C20690R.drawable.ic_flag_cd);

    /* renamed from: CF */
    public static final ServerToBentoAssetMapper f4321CF = new ServerToBentoAssetMapper("CF", 40, C20690R.drawable.ic_flag_cf);

    /* renamed from: CG */
    public static final ServerToBentoAssetMapper f4322CG = new ServerToBentoAssetMapper("CG", 41, C20690R.drawable.ic_flag_cg);

    /* renamed from: CH */
    public static final ServerToBentoAssetMapper f4323CH = new ServerToBentoAssetMapper("CH", 42, C20690R.drawable.ic_flag_ch);

    /* renamed from: CI */
    public static final ServerToBentoAssetMapper f4324CI = new ServerToBentoAssetMapper("CI", 43, C20690R.drawable.ic_flag_ci);

    /* renamed from: CK */
    public static final ServerToBentoAssetMapper f4325CK = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_CK, 44, C20690R.drawable.ic_flag_ck);

    /* renamed from: CL */
    public static final ServerToBentoAssetMapper f4326CL = new ServerToBentoAssetMapper("CL", 45, C20690R.drawable.ic_flag_cl);

    /* renamed from: CM */
    public static final ServerToBentoAssetMapper f4327CM = new ServerToBentoAssetMapper("CM", 46, C20690R.drawable.ic_flag_cm);

    /* renamed from: CN */
    public static final ServerToBentoAssetMapper f4328CN = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_CN, 47, C20690R.drawable.ic_flag_cn);

    /* renamed from: CO */
    public static final ServerToBentoAssetMapper f4329CO = new ServerToBentoAssetMapper("CO", 48, C20690R.drawable.ic_flag_co);

    /* renamed from: CR */
    public static final ServerToBentoAssetMapper f4330CR = new ServerToBentoAssetMapper("CR", 49, C20690R.drawable.ic_flag_cr);

    /* renamed from: CU */
    public static final ServerToBentoAssetMapper f4331CU = new ServerToBentoAssetMapper("CU", 50, C20690R.drawable.ic_flag_cu);

    /* renamed from: CV */
    public static final ServerToBentoAssetMapper f4332CV = new ServerToBentoAssetMapper("CV", 51, C20690R.drawable.ic_flag_cv);

    /* renamed from: CW */
    public static final ServerToBentoAssetMapper f4333CW = new ServerToBentoAssetMapper("CW", 52, C20690R.drawable.ic_flag_cw);

    /* renamed from: CX */
    public static final ServerToBentoAssetMapper f4334CX = new ServerToBentoAssetMapper("CX", 53, C20690R.drawable.ic_flag_cx);

    /* renamed from: CY */
    public static final ServerToBentoAssetMapper f4335CY = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_CY, 54, C20690R.drawable.ic_flag_cy);

    /* renamed from: CZ */
    public static final ServerToBentoAssetMapper f4336CZ = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_CZ, 55, C20690R.drawable.ic_flag_cz);

    /* renamed from: DE */
    public static final ServerToBentoAssetMapper f4337DE = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_DE, 56, C20690R.drawable.ic_flag_de);

    /* renamed from: DJ */
    public static final ServerToBentoAssetMapper f4338DJ = new ServerToBentoAssetMapper("DJ", 57, C20690R.drawable.ic_flag_dj);

    /* renamed from: DK */
    public static final ServerToBentoAssetMapper f4339DK = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_DK, 58, C20690R.drawable.ic_flag_dk);

    /* renamed from: DM */
    public static final ServerToBentoAssetMapper f4340DM = new ServerToBentoAssetMapper("DM", 59, C20690R.drawable.ic_flag_dm);

    /* renamed from: DO */
    public static final ServerToBentoAssetMapper f4341DO = new ServerToBentoAssetMapper("DO", 60, C20690R.drawable.ic_flag_do);

    /* renamed from: DZ */
    public static final ServerToBentoAssetMapper f4342DZ = new ServerToBentoAssetMapper("DZ", 61, C20690R.drawable.ic_flag_dz);

    /* renamed from: EC */
    public static final ServerToBentoAssetMapper f4343EC = new ServerToBentoAssetMapper("EC", 62, C20690R.drawable.ic_flag_ec);

    /* renamed from: EE */
    public static final ServerToBentoAssetMapper f4344EE = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_EE, 63, C20690R.drawable.ic_flag_ee);

    /* renamed from: EG */
    public static final ServerToBentoAssetMapper f4345EG = new ServerToBentoAssetMapper("EG", 64, C20690R.drawable.ic_flag_eg);

    /* renamed from: EH */
    public static final ServerToBentoAssetMapper f4346EH = new ServerToBentoAssetMapper("EH", 65, C20690R.drawable.ic_flag_eh);

    /* renamed from: ER */
    public static final ServerToBentoAssetMapper f4347ER = new ServerToBentoAssetMapper("ER", 66, C20690R.drawable.ic_flag_er);

    /* renamed from: ES */
    public static final ServerToBentoAssetMapper f4348ES = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_ES, 67, C20690R.drawable.ic_flag_es);

    /* renamed from: ET */
    public static final ServerToBentoAssetMapper f4349ET = new ServerToBentoAssetMapper("ET", 68, C20690R.drawable.ic_flag_et);

    /* renamed from: EU */
    public static final ServerToBentoAssetMapper f4350EU = new ServerToBentoAssetMapper("EU", 69, C20690R.drawable.ic_flag_eu);

    /* renamed from: FI */
    public static final ServerToBentoAssetMapper f4351FI = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_FI, 70, C20690R.drawable.ic_flag_fi);

    /* renamed from: FJ */
    public static final ServerToBentoAssetMapper f4352FJ = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_FJ, 71, C20690R.drawable.ic_flag_fj);

    /* renamed from: FK */
    public static final ServerToBentoAssetMapper f4353FK = new ServerToBentoAssetMapper("FK", 72, C20690R.drawable.ic_flag_fk);

    /* renamed from: FM */
    public static final ServerToBentoAssetMapper f4354FM = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_FM, 73, C20690R.drawable.ic_flag_fm);

    /* renamed from: FO */
    public static final ServerToBentoAssetMapper f4355FO = new ServerToBentoAssetMapper("FO", 74, C20690R.drawable.ic_flag_fo);

    /* renamed from: FR */
    public static final ServerToBentoAssetMapper f4356FR = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_FR, 75, C20690R.drawable.ic_flag_fr);

    /* renamed from: GA */
    public static final ServerToBentoAssetMapper f4357GA = new ServerToBentoAssetMapper("GA", 76, C20690R.drawable.ic_flag_ga);

    /* renamed from: GB */
    public static final ServerToBentoAssetMapper f4358GB = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_GB, 77, C20690R.drawable.ic_flag_gb);

    /* renamed from: GD */
    public static final ServerToBentoAssetMapper f4359GD = new ServerToBentoAssetMapper("GD", 78, C20690R.drawable.ic_flag_gd);

    /* renamed from: GE */
    public static final ServerToBentoAssetMapper f4360GE = new ServerToBentoAssetMapper("GE", 79, C20690R.drawable.ic_flag_ge);
    public static final ServerToBentoAssetMapper GENERIC = new ServerToBentoAssetMapper("GENERIC", 80, C20690R.drawable.ic_flag_generic);

    /* renamed from: GF */
    public static final ServerToBentoAssetMapper f4361GF = new ServerToBentoAssetMapper("GF", 81, C20690R.drawable.ic_flag_gf);

    /* renamed from: GG */
    public static final ServerToBentoAssetMapper f4362GG = new ServerToBentoAssetMapper("GG", 82, C20690R.drawable.ic_flag_gg);

    /* renamed from: GH */
    public static final ServerToBentoAssetMapper f4363GH = new ServerToBentoAssetMapper("GH", 83, C20690R.drawable.ic_flag_gh);

    /* renamed from: GI */
    public static final ServerToBentoAssetMapper f4364GI = new ServerToBentoAssetMapper("GI", 84, C20690R.drawable.ic_flag_gi);

    /* renamed from: GL */
    public static final ServerToBentoAssetMapper f4365GL = new ServerToBentoAssetMapper("GL", 85, C20690R.drawable.ic_flag_gl);

    /* renamed from: GM */
    public static final ServerToBentoAssetMapper f4366GM = new ServerToBentoAssetMapper("GM", 86, C20690R.drawable.ic_flag_gm);

    /* renamed from: GN */
    public static final ServerToBentoAssetMapper f4367GN = new ServerToBentoAssetMapper("GN", 87, C20690R.drawable.ic_flag_gn);

    /* renamed from: GP */
    public static final ServerToBentoAssetMapper f4368GP = new ServerToBentoAssetMapper("GP", 88, C20690R.drawable.ic_flag_gp);

    /* renamed from: GQ */
    public static final ServerToBentoAssetMapper f4369GQ = new ServerToBentoAssetMapper("GQ", 89, C20690R.drawable.ic_flag_gq);

    /* renamed from: GR */
    public static final ServerToBentoAssetMapper f4370GR = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_GR, 90, C20690R.drawable.ic_flag_gr);

    /* renamed from: GS */
    public static final ServerToBentoAssetMapper f4371GS = new ServerToBentoAssetMapper("GS", 91, C20690R.drawable.ic_flag_gs);

    /* renamed from: GT */
    public static final ServerToBentoAssetMapper f4372GT = new ServerToBentoAssetMapper("GT", 92, C20690R.drawable.ic_flag_gt);

    /* renamed from: GU */
    public static final ServerToBentoAssetMapper f4373GU = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_GU, 93, C20690R.drawable.ic_flag_gu);

    /* renamed from: GW */
    public static final ServerToBentoAssetMapper f4374GW = new ServerToBentoAssetMapper("GW", 94, C20690R.drawable.ic_flag_gw);

    /* renamed from: GY */
    public static final ServerToBentoAssetMapper f4375GY = new ServerToBentoAssetMapper("GY", 95, C20690R.drawable.ic_flag_gy);

    /* renamed from: HK */
    public static final ServerToBentoAssetMapper f4376HK = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_HK, 96, C20690R.drawable.ic_flag_hk);

    /* renamed from: HM */
    public static final ServerToBentoAssetMapper f4377HM = new ServerToBentoAssetMapper("HM", 97, C20690R.drawable.ic_flag_hm);

    /* renamed from: HN */
    public static final ServerToBentoAssetMapper f4378HN = new ServerToBentoAssetMapper("HN", 98, C20690R.drawable.ic_flag_hn);

    /* renamed from: HR */
    public static final ServerToBentoAssetMapper f4379HR = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_HR, 99, C20690R.drawable.ic_flag_hr);

    /* renamed from: HT */
    public static final ServerToBentoAssetMapper f4380HT = new ServerToBentoAssetMapper("HT", 100, C20690R.drawable.ic_flag_ht);

    /* renamed from: HU */
    public static final ServerToBentoAssetMapper f4381HU = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_HU, 101, C20690R.drawable.ic_flag_hu);

    /* renamed from: ID */
    public static final ServerToBentoAssetMapper f4382ID = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_ID, 102, C20690R.drawable.ic_flag_id);

    /* renamed from: IE */
    public static final ServerToBentoAssetMapper f4383IE = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_IE, 103, C20690R.drawable.ic_flag_ie);

    /* renamed from: IL */
    public static final ServerToBentoAssetMapper f4384IL = new ServerToBentoAssetMapper("IL", 104, C20690R.drawable.ic_flag_il);

    /* renamed from: IM */
    public static final ServerToBentoAssetMapper f4385IM = new ServerToBentoAssetMapper("IM", 105, C20690R.drawable.ic_flag_im);

    /* renamed from: IN */
    public static final ServerToBentoAssetMapper f4386IN = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_IN, 106, C20690R.drawable.ic_flag_in);

    /* renamed from: IO */
    public static final ServerToBentoAssetMapper f4387IO = new ServerToBentoAssetMapper("IO", 107, C20690R.drawable.ic_flag_io);

    /* renamed from: IQ */
    public static final ServerToBentoAssetMapper f4388IQ = new ServerToBentoAssetMapper("IQ", 108, C20690R.drawable.ic_flag_iq);

    /* renamed from: IR */
    public static final ServerToBentoAssetMapper f4389IR = new ServerToBentoAssetMapper("IR", 109, C20690R.drawable.ic_flag_ir);

    /* renamed from: IS */
    public static final ServerToBentoAssetMapper f4390IS = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_IS, 110, C20690R.drawable.ic_flag_is);

    /* renamed from: IT */
    public static final ServerToBentoAssetMapper f4391IT = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_IT, 111, C20690R.drawable.ic_flag_it);

    /* renamed from: JE */
    public static final ServerToBentoAssetMapper f4392JE = new ServerToBentoAssetMapper("JE", 112, C20690R.drawable.ic_flag_je);

    /* renamed from: JM */
    public static final ServerToBentoAssetMapper f4393JM = new ServerToBentoAssetMapper("JM", 113, C20690R.drawable.ic_flag_jm);

    /* renamed from: JO */
    public static final ServerToBentoAssetMapper f4394JO = new ServerToBentoAssetMapper("JO", 114, C20690R.drawable.ic_flag_jo);

    /* renamed from: JP */
    public static final ServerToBentoAssetMapper f4395JP = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_JP, 115, C20690R.drawable.ic_flag_jp);

    /* renamed from: KE */
    public static final ServerToBentoAssetMapper f4396KE = new ServerToBentoAssetMapper("KE", 116, C20690R.drawable.ic_flag_ke);

    /* renamed from: KG */
    public static final ServerToBentoAssetMapper f4397KG = new ServerToBentoAssetMapper("KG", 117, C20690R.drawable.ic_flag_kg);

    /* renamed from: KH */
    public static final ServerToBentoAssetMapper f4398KH = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_KH, 118, C20690R.drawable.ic_flag_kh);

    /* renamed from: KI */
    public static final ServerToBentoAssetMapper f4399KI = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_KI, 119, C20690R.drawable.ic_flag_ki);

    /* renamed from: KM */
    public static final ServerToBentoAssetMapper f4400KM = new ServerToBentoAssetMapper("KM", 120, C20690R.drawable.ic_flag_km);

    /* renamed from: KN */
    public static final ServerToBentoAssetMapper f4401KN = new ServerToBentoAssetMapper("KN", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, C20690R.drawable.ic_flag_kn);

    /* renamed from: KP */
    public static final ServerToBentoAssetMapper f4402KP = new ServerToBentoAssetMapper("KP", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, C20690R.drawable.ic_flag_kp);

    /* renamed from: KR */
    public static final ServerToBentoAssetMapper f4403KR = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_KR, 123, C20690R.drawable.ic_flag_kr);

    /* renamed from: KW */
    public static final ServerToBentoAssetMapper f4404KW = new ServerToBentoAssetMapper("KW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, C20690R.drawable.ic_flag_kw);

    /* renamed from: KY */
    public static final ServerToBentoAssetMapper f4405KY = new ServerToBentoAssetMapper("KY", 125, C20690R.drawable.ic_flag_ky);

    /* renamed from: KZ */
    public static final ServerToBentoAssetMapper f4406KZ = new ServerToBentoAssetMapper("KZ", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, C20690R.drawable.ic_flag_kz);

    /* renamed from: LA */
    public static final ServerToBentoAssetMapper f4407LA = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_LA, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, C20690R.drawable.ic_flag_la);

    /* renamed from: LB */
    public static final ServerToBentoAssetMapper f4408LB = new ServerToBentoAssetMapper("LB", 128, C20690R.drawable.ic_flag_lb);

    /* renamed from: LC */
    public static final ServerToBentoAssetMapper f4409LC = new ServerToBentoAssetMapper("LC", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, C20690R.drawable.ic_flag_lc);

    /* renamed from: LI */
    public static final ServerToBentoAssetMapper f4410LI = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_LI, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, C20690R.drawable.ic_flag_li);

    /* renamed from: LK */
    public static final ServerToBentoAssetMapper f4411LK = new ServerToBentoAssetMapper("LK", 131, C20690R.drawable.ic_flag_lk);

    /* renamed from: LR */
    public static final ServerToBentoAssetMapper f4412LR = new ServerToBentoAssetMapper("LR", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, C20690R.drawable.ic_flag_lr);

    /* renamed from: LS */
    public static final ServerToBentoAssetMapper f4413LS = new ServerToBentoAssetMapper("LS", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, C20690R.drawable.ic_flag_ls);

    /* renamed from: LT */
    public static final ServerToBentoAssetMapper f4414LT = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_LT, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, C20690R.drawable.ic_flag_lt);

    /* renamed from: LU */
    public static final ServerToBentoAssetMapper f4415LU = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_LU, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, C20690R.drawable.ic_flag_lu);

    /* renamed from: LV */
    public static final ServerToBentoAssetMapper f4416LV = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_LV, 136, C20690R.drawable.ic_flag_lv);

    /* renamed from: LY */
    public static final ServerToBentoAssetMapper f4417LY = new ServerToBentoAssetMapper("LY", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, C20690R.drawable.ic_flag_ly);

    /* renamed from: MA */
    public static final ServerToBentoAssetMapper f4418MA = new ServerToBentoAssetMapper("MA", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, C20690R.drawable.ic_flag_ma);

    /* renamed from: MC */
    public static final ServerToBentoAssetMapper f4419MC = new ServerToBentoAssetMapper("MC", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, C20690R.drawable.ic_flag_mc);

    /* renamed from: MD */
    public static final ServerToBentoAssetMapper f4420MD = new ServerToBentoAssetMapper("MD", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, C20690R.drawable.ic_flag_md);

    /* renamed from: ME */
    public static final ServerToBentoAssetMapper f4421ME = new ServerToBentoAssetMapper("ME", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, C20690R.drawable.ic_flag_me);

    /* renamed from: MF */
    public static final ServerToBentoAssetMapper f4422MF = new ServerToBentoAssetMapper("MF", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, C20690R.drawable.ic_flag_mf);

    /* renamed from: MG */
    public static final ServerToBentoAssetMapper f4423MG = new ServerToBentoAssetMapper("MG", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, C20690R.drawable.ic_flag_mg);

    /* renamed from: MH */
    public static final ServerToBentoAssetMapper f4424MH = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_MH, 144, C20690R.drawable.ic_flag_mh);

    /* renamed from: MK */
    public static final ServerToBentoAssetMapper f4425MK = new ServerToBentoAssetMapper("MK", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, C20690R.drawable.ic_flag_mk);

    /* renamed from: ML */
    public static final ServerToBentoAssetMapper f4426ML = new ServerToBentoAssetMapper("ML", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, C20690R.drawable.ic_flag_ml);

    /* renamed from: MM */
    public static final ServerToBentoAssetMapper f4427MM = new ServerToBentoAssetMapper("MM", 147, C20690R.drawable.ic_flag_mm);

    /* renamed from: MN */
    public static final ServerToBentoAssetMapper f4428MN = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_MN, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, C20690R.drawable.ic_flag_mn);

    /* renamed from: MO */
    public static final ServerToBentoAssetMapper f4429MO = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_MO, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, C20690R.drawable.ic_flag_mo);

    /* renamed from: MP */
    public static final ServerToBentoAssetMapper f4430MP = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_MP, 150, C20690R.drawable.ic_flag_mp);

    /* renamed from: MQ */
    public static final ServerToBentoAssetMapper f4431MQ = new ServerToBentoAssetMapper("MQ", 151, C20690R.drawable.ic_flag_mq);

    /* renamed from: MR */
    public static final ServerToBentoAssetMapper f4432MR = new ServerToBentoAssetMapper("MR", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, C20690R.drawable.ic_flag_mr);

    /* renamed from: MS */
    public static final ServerToBentoAssetMapper f4433MS = new ServerToBentoAssetMapper("MS", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, C20690R.drawable.ic_flag_ms);

    /* renamed from: MT */
    public static final ServerToBentoAssetMapper f4434MT = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_MT, EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, C20690R.drawable.ic_flag_mt);

    /* renamed from: MU */
    public static final ServerToBentoAssetMapper f4435MU = new ServerToBentoAssetMapper("MU", 155, C20690R.drawable.ic_flag_mu);

    /* renamed from: MV */
    public static final ServerToBentoAssetMapper f4436MV = new ServerToBentoAssetMapper("MV", 156, C20690R.drawable.ic_flag_mv);

    /* renamed from: MW */
    public static final ServerToBentoAssetMapper f4437MW = new ServerToBentoAssetMapper("MW", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, C20690R.drawable.ic_flag_mw);

    /* renamed from: MX */
    public static final ServerToBentoAssetMapper f4438MX = new ServerToBentoAssetMapper("MX", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, C20690R.drawable.ic_flag_mx);

    /* renamed from: MY */
    public static final ServerToBentoAssetMapper f4439MY = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_MY, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, C20690R.drawable.ic_flag_my);

    /* renamed from: MZ */
    public static final ServerToBentoAssetMapper f4440MZ = new ServerToBentoAssetMapper("MZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, C20690R.drawable.ic_flag_mz);

    /* renamed from: NA */
    public static final ServerToBentoAssetMapper f4441NA = new ServerToBentoAssetMapper("NA", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, C20690R.drawable.ic_flag_na);

    /* renamed from: NC */
    public static final ServerToBentoAssetMapper f4442NC = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_NC, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, C20690R.drawable.ic_flag_nc);

    /* renamed from: NE */
    public static final ServerToBentoAssetMapper f4443NE = new ServerToBentoAssetMapper("NE", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, C20690R.drawable.ic_flag_ne);

    /* renamed from: NF */
    public static final ServerToBentoAssetMapper f4444NF = new ServerToBentoAssetMapper("NF", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, C20690R.drawable.ic_flag_nf);

    /* renamed from: NG */
    public static final ServerToBentoAssetMapper f4445NG = new ServerToBentoAssetMapper("NG", 165, C20690R.drawable.ic_flag_ng);

    /* renamed from: NI */
    public static final ServerToBentoAssetMapper f4446NI = new ServerToBentoAssetMapper("NI", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, C20690R.drawable.ic_flag_ni);

    /* renamed from: NL */
    public static final ServerToBentoAssetMapper f4447NL = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_NL, 167, C20690R.drawable.ic_flag_nl);

    /* renamed from: NO */
    public static final ServerToBentoAssetMapper f4448NO = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_NO, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, C20690R.drawable.ic_flag_no);

    /* renamed from: NP */
    public static final ServerToBentoAssetMapper f4449NP = new ServerToBentoAssetMapper("NP", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, C20690R.drawable.ic_flag_np);

    /* renamed from: NR */
    public static final ServerToBentoAssetMapper f4450NR = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_NR, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, C20690R.drawable.ic_flag_nr);

    /* renamed from: NU */
    public static final ServerToBentoAssetMapper f4451NU = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_NU, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, C20690R.drawable.ic_flag_nu);

    /* renamed from: NZ */
    public static final ServerToBentoAssetMapper f4452NZ = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_NZ, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_flag_nz);

    /* renamed from: OM */
    public static final ServerToBentoAssetMapper f4453OM = new ServerToBentoAssetMapper("OM", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_flag_om);

    /* renamed from: PA */
    public static final ServerToBentoAssetMapper f4454PA = new ServerToBentoAssetMapper("PA", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, C20690R.drawable.ic_flag_pa);

    /* renamed from: PE */
    public static final ServerToBentoAssetMapper f4455PE = new ServerToBentoAssetMapper("PE", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_flag_pe);

    /* renamed from: PF */
    public static final ServerToBentoAssetMapper f4456PF = new ServerToBentoAssetMapper("PF", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_flag_pf);

    /* renamed from: PG */
    public static final ServerToBentoAssetMapper f4457PG = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_PG, EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, C20690R.drawable.ic_flag_pg);

    /* renamed from: PH */
    public static final ServerToBentoAssetMapper f4458PH = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_PH, EnumC7081g.f2773x8d9721ad, C20690R.drawable.ic_flag_ph);

    /* renamed from: PK */
    public static final ServerToBentoAssetMapper f4459PK = new ServerToBentoAssetMapper("PK", EnumC7081g.f2780x600b66fe, C20690R.drawable.ic_flag_pk);

    /* renamed from: PL */
    public static final ServerToBentoAssetMapper f4460PL = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_PL, EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, C20690R.drawable.ic_flag_pl);

    /* renamed from: PM */
    public static final ServerToBentoAssetMapper f4461PM = new ServerToBentoAssetMapper("PM", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, C20690R.drawable.ic_flag_pm);

    /* renamed from: PN */
    public static final ServerToBentoAssetMapper f4462PN = new ServerToBentoAssetMapper("PN", 182, C20690R.drawable.ic_flag_pn);

    /* renamed from: PR */
    public static final ServerToBentoAssetMapper f4463PR = new ServerToBentoAssetMapper("PR", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, C20690R.drawable.ic_flag_pr);

    /* renamed from: PS */
    public static final ServerToBentoAssetMapper f4464PS = new ServerToBentoAssetMapper("PS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, C20690R.drawable.ic_flag_ps);

    /* renamed from: PT */
    public static final ServerToBentoAssetMapper f4465PT = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_PT, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, C20690R.drawable.ic_flag_pt);

    /* renamed from: PW */
    public static final ServerToBentoAssetMapper f4466PW = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_PW, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, C20690R.drawable.ic_flag_pw);

    /* renamed from: PY */
    public static final ServerToBentoAssetMapper f4467PY = new ServerToBentoAssetMapper("PY", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, C20690R.drawable.ic_flag_py);

    /* renamed from: QA */
    public static final ServerToBentoAssetMapper f4468QA = new ServerToBentoAssetMapper("QA", 188, C20690R.drawable.ic_flag_qa);

    /* renamed from: RE */
    public static final ServerToBentoAssetMapper f4469RE = new ServerToBentoAssetMapper("RE", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, C20690R.drawable.ic_flag_re);

    /* renamed from: RO */
    public static final ServerToBentoAssetMapper f4470RO = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_RO, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, C20690R.drawable.ic_flag_ro);

    /* renamed from: RS */
    public static final ServerToBentoAssetMapper f4471RS = new ServerToBentoAssetMapper("RS", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, C20690R.drawable.ic_flag_rs);

    /* renamed from: RU */
    public static final ServerToBentoAssetMapper f4472RU = new ServerToBentoAssetMapper("RU", 192, C20690R.drawable.ic_flag_ru);

    /* renamed from: RW */
    public static final ServerToBentoAssetMapper f4473RW = new ServerToBentoAssetMapper("RW", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, C20690R.drawable.ic_flag_rw);

    /* renamed from: SA */
    public static final ServerToBentoAssetMapper f4474SA = new ServerToBentoAssetMapper("SA", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, C20690R.drawable.ic_flag_sa);

    /* renamed from: SB */
    public static final ServerToBentoAssetMapper f4475SB = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_SB, EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, C20690R.drawable.ic_flag_sb);

    /* renamed from: SC */
    public static final ServerToBentoAssetMapper f4476SC = new ServerToBentoAssetMapper("SC", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, C20690R.drawable.ic_flag_sc);

    /* renamed from: SD */
    public static final ServerToBentoAssetMapper f4477SD = new ServerToBentoAssetMapper("SD", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, C20690R.drawable.ic_flag_sd);

    /* renamed from: SE */
    public static final ServerToBentoAssetMapper f4478SE = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_SE, EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, C20690R.drawable.ic_flag_se);

    /* renamed from: SG */
    public static final ServerToBentoAssetMapper f4479SG = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_SG, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, C20690R.drawable.ic_flag_sg);

    /* renamed from: SH */
    public static final ServerToBentoAssetMapper f4480SH = new ServerToBentoAssetMapper("SH", 200, C20690R.drawable.ic_flag_sh);

    /* renamed from: SI */
    public static final ServerToBentoAssetMapper f4481SI = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_SI, 201, C20690R.drawable.ic_flag_si);

    /* renamed from: SJ */
    public static final ServerToBentoAssetMapper f4482SJ = new ServerToBentoAssetMapper("SJ", 202, C20690R.drawable.ic_flag_sj);

    /* renamed from: SK */
    public static final ServerToBentoAssetMapper f4483SK = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_SK, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, C20690R.drawable.ic_flag_sk);

    /* renamed from: SL */
    public static final ServerToBentoAssetMapper f4484SL = new ServerToBentoAssetMapper("SL", 204, C20690R.drawable.ic_flag_sl);

    /* renamed from: SM */
    public static final ServerToBentoAssetMapper f4485SM = new ServerToBentoAssetMapper("SM", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE, C20690R.drawable.ic_flag_sm);

    /* renamed from: SN */
    public static final ServerToBentoAssetMapper f4486SN = new ServerToBentoAssetMapper("SN", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, C20690R.drawable.ic_flag_sn);

    /* renamed from: SO */
    public static final ServerToBentoAssetMapper f4487SO = new ServerToBentoAssetMapper("SO", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, C20690R.drawable.ic_flag_so);

    /* renamed from: SR */
    public static final ServerToBentoAssetMapper f4488SR = new ServerToBentoAssetMapper("SR", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, C20690R.drawable.ic_flag_sr);

    /* renamed from: ST */
    public static final ServerToBentoAssetMapper f4489ST = new ServerToBentoAssetMapper("ST", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, C20690R.drawable.ic_flag_st);

    /* renamed from: SV */
    public static final ServerToBentoAssetMapper f4490SV = new ServerToBentoAssetMapper("SV", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, C20690R.drawable.ic_flag_sv);

    /* renamed from: SX */
    public static final ServerToBentoAssetMapper f4491SX = new ServerToBentoAssetMapper("SX", 211, C20690R.drawable.ic_flag_sx);

    /* renamed from: SY */
    public static final ServerToBentoAssetMapper f4492SY = new ServerToBentoAssetMapper("SY", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE, C20690R.drawable.ic_flag_sy);

    /* renamed from: SZ */
    public static final ServerToBentoAssetMapper f4493SZ = new ServerToBentoAssetMapper("SZ", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, C20690R.drawable.ic_flag_sz);

    /* renamed from: TC */
    public static final ServerToBentoAssetMapper f4494TC = new ServerToBentoAssetMapper("TC", EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, C20690R.drawable.ic_flag_tc);

    /* renamed from: TD */
    public static final ServerToBentoAssetMapper f4495TD = new ServerToBentoAssetMapper("TD", EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, C20690R.drawable.ic_flag_td);

    /* renamed from: TF */
    public static final ServerToBentoAssetMapper f4496TF = new ServerToBentoAssetMapper("TF", EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, C20690R.drawable.ic_flag_tf);

    /* renamed from: TG */
    public static final ServerToBentoAssetMapper f4497TG = new ServerToBentoAssetMapper("TG", EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE, C20690R.drawable.ic_flag_tg);

    /* renamed from: TH */
    public static final ServerToBentoAssetMapper f4498TH = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_TH, EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE, C20690R.drawable.ic_flag_th);

    /* renamed from: TJ */
    public static final ServerToBentoAssetMapper f4499TJ = new ServerToBentoAssetMapper("TJ", EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE, C20690R.drawable.ic_flag_tj);

    /* renamed from: TK */
    public static final ServerToBentoAssetMapper f4500TK = new ServerToBentoAssetMapper("TK", EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, C20690R.drawable.ic_flag_tk);

    /* renamed from: TL */
    public static final ServerToBentoAssetMapper f4501TL = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_TL, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, C20690R.drawable.ic_flag_tl);

    /* renamed from: TM */
    public static final ServerToBentoAssetMapper f4502TM = new ServerToBentoAssetMapper("TM", EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, C20690R.drawable.ic_flag_tm);

    /* renamed from: TN */
    public static final ServerToBentoAssetMapper f4503TN = new ServerToBentoAssetMapper("TN", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, C20690R.drawable.ic_flag_tn);

    /* renamed from: TO */
    public static final ServerToBentoAssetMapper f4504TO = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_TO, 224, C20690R.drawable.ic_flag_to);

    /* renamed from: TR */
    public static final ServerToBentoAssetMapper f4505TR = new ServerToBentoAssetMapper("TR", 225, C20690R.drawable.ic_flag_tr);

    /* renamed from: TT */
    public static final ServerToBentoAssetMapper f4506TT = new ServerToBentoAssetMapper("TT", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, C20690R.drawable.ic_flag_tt);

    /* renamed from: TV */
    public static final ServerToBentoAssetMapper f4507TV = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_TV, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, C20690R.drawable.ic_flag_tv);

    /* renamed from: TW */
    public static final ServerToBentoAssetMapper f4508TW = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_TW, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, C20690R.drawable.ic_flag_tw);

    /* renamed from: TZ */
    public static final ServerToBentoAssetMapper f4509TZ = new ServerToBentoAssetMapper("TZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, C20690R.drawable.ic_flag_tz);

    /* renamed from: UA */
    public static final ServerToBentoAssetMapper f4510UA = new ServerToBentoAssetMapper("UA", EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, C20690R.drawable.ic_flag_ua);

    /* renamed from: UG */
    public static final ServerToBentoAssetMapper f4511UG = new ServerToBentoAssetMapper("UG", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, C20690R.drawable.ic_flag_ug);

    /* renamed from: UM */
    public static final ServerToBentoAssetMapper f4512UM = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_UM, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, C20690R.drawable.ic_flag_um);

    /* renamed from: US */
    public static final ServerToBentoAssetMapper f4513US = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_US, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, C20690R.drawable.ic_flag_us);

    /* renamed from: UY */
    public static final ServerToBentoAssetMapper f4514UY = new ServerToBentoAssetMapper("UY", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, C20690R.drawable.ic_flag_uy);

    /* renamed from: UZ */
    public static final ServerToBentoAssetMapper f4515UZ = new ServerToBentoAssetMapper("UZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, C20690R.drawable.ic_flag_uz);

    /* renamed from: VA */
    public static final ServerToBentoAssetMapper f4516VA = new ServerToBentoAssetMapper("VA", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, C20690R.drawable.ic_flag_va);

    /* renamed from: VC */
    public static final ServerToBentoAssetMapper f4517VC = new ServerToBentoAssetMapper("VC", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, C20690R.drawable.ic_flag_vc);

    /* renamed from: VE */
    public static final ServerToBentoAssetMapper f4518VE = new ServerToBentoAssetMapper("VE", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, C20690R.drawable.ic_flag_ve);

    /* renamed from: VG */
    public static final ServerToBentoAssetMapper f4519VG = new ServerToBentoAssetMapper("VG", 239, C20690R.drawable.ic_flag_vg);

    /* renamed from: VI */
    public static final ServerToBentoAssetMapper f4520VI = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_VI, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, C20690R.drawable.ic_flag_vi);

    /* renamed from: VN */
    public static final ServerToBentoAssetMapper f4521VN = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_VN, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, C20690R.drawable.ic_flag_vn);

    /* renamed from: VU */
    public static final ServerToBentoAssetMapper f4522VU = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_VU, EnumC7081g.f2778x3356acf6, C20690R.drawable.ic_flag_vu);

    /* renamed from: WF */
    public static final ServerToBentoAssetMapper f4523WF = new ServerToBentoAssetMapper("WF", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, C20690R.drawable.ic_flag_wf);

    /* renamed from: WS */
    public static final ServerToBentoAssetMapper f4524WS = new ServerToBentoAssetMapper(CountryCode.COUNTRY_CODE_WS, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, C20690R.drawable.ic_flag_ws);

    /* renamed from: YE */
    public static final ServerToBentoAssetMapper f4525YE = new ServerToBentoAssetMapper("YE", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, C20690R.drawable.ic_flag_ye);

    /* renamed from: YT */
    public static final ServerToBentoAssetMapper f4526YT = new ServerToBentoAssetMapper("YT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, C20690R.drawable.ic_flag_yt);

    /* renamed from: ZA */
    public static final ServerToBentoAssetMapper f4527ZA = new ServerToBentoAssetMapper("ZA", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, C20690R.drawable.ic_flag_za);

    /* renamed from: ZM */
    public static final ServerToBentoAssetMapper f4528ZM = new ServerToBentoAssetMapper("ZM", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, C20690R.drawable.ic_flag_zm);

    /* renamed from: ZW */
    public static final ServerToBentoAssetMapper f4529ZW = new ServerToBentoAssetMapper("ZW", EnumC7081g.f2779x59907a3d, C20690R.drawable.ic_flag_zw);

    private static final /* synthetic */ ServerToBentoAssetMapper[] $values() {
        return new ServerToBentoAssetMapper[]{UNKNOWN, f4282AD, f4283AE, f4284AF, f4285AG, f4286AI, f4287AL, f4288AM, f4289AO, f4290AQ, f4291AR, f4292AS, f4293AT, f4294AU, f4295AW, f4296AX, f4297AZ, f4298BA, f4299BB, f4300BD, f4301BE, f4302BF, f4303BG, f4304BH, f4305BI, f4306BJ, f4307BL, f4308BM, f4309BN, f4310BO, f4311BR, f4312BS, f4313BT, f4314BV, f4315BW, f4316BY, f4317BZ, f4318CA, f4319CC, f4320CD, f4321CF, f4322CG, f4323CH, f4324CI, f4325CK, f4326CL, f4327CM, f4328CN, f4329CO, f4330CR, f4331CU, f4332CV, f4333CW, f4334CX, f4335CY, f4336CZ, f4337DE, f4338DJ, f4339DK, f4340DM, f4341DO, f4342DZ, f4343EC, f4344EE, f4345EG, f4346EH, f4347ER, f4348ES, f4349ET, f4350EU, f4351FI, f4352FJ, f4353FK, f4354FM, f4355FO, f4356FR, f4357GA, f4358GB, f4359GD, f4360GE, GENERIC, f4361GF, f4362GG, f4363GH, f4364GI, f4365GL, f4366GM, f4367GN, f4368GP, f4369GQ, f4370GR, f4371GS, f4372GT, f4373GU, f4374GW, f4375GY, f4376HK, f4377HM, f4378HN, f4379HR, f4380HT, f4381HU, f4382ID, f4383IE, f4384IL, f4385IM, f4386IN, f4387IO, f4388IQ, f4389IR, f4390IS, f4391IT, f4392JE, f4393JM, f4394JO, f4395JP, f4396KE, f4397KG, f4398KH, f4399KI, f4400KM, f4401KN, f4402KP, f4403KR, f4404KW, f4405KY, f4406KZ, f4407LA, f4408LB, f4409LC, f4410LI, f4411LK, f4412LR, f4413LS, f4414LT, f4415LU, f4416LV, f4417LY, f4418MA, f4419MC, f4420MD, f4421ME, f4422MF, f4423MG, f4424MH, f4425MK, f4426ML, f4427MM, f4428MN, f4429MO, f4430MP, f4431MQ, f4432MR, f4433MS, f4434MT, f4435MU, f4436MV, f4437MW, f4438MX, f4439MY, f4440MZ, f4441NA, f4442NC, f4443NE, f4444NF, f4445NG, f4446NI, f4447NL, f4448NO, f4449NP, f4450NR, f4451NU, f4452NZ, f4453OM, f4454PA, f4455PE, f4456PF, f4457PG, f4458PH, f4459PK, f4460PL, f4461PM, f4462PN, f4463PR, f4464PS, f4465PT, f4466PW, f4467PY, f4468QA, f4469RE, f4470RO, f4471RS, f4472RU, f4473RW, f4474SA, f4475SB, f4476SC, f4477SD, f4478SE, f4479SG, f4480SH, f4481SI, f4482SJ, f4483SK, f4484SL, f4485SM, f4486SN, f4487SO, f4488SR, f4489ST, f4490SV, f4491SX, f4492SY, f4493SZ, f4494TC, f4495TD, f4496TF, f4497TG, f4498TH, f4499TJ, f4500TK, f4501TL, f4502TM, f4503TN, f4504TO, f4505TR, f4506TT, f4507TV, f4508TW, f4509TZ, f4510UA, f4511UG, f4512UM, f4513US, f4514UY, f4515UZ, f4516VA, f4517VC, f4518VE, f4519VG, f4520VI, f4521VN, f4522VU, f4523WF, f4524WS, f4525YE, f4526YT, f4527ZA, f4528ZM, f4529ZW};
    }

    @JvmStatic
    public static ServerToBentoAssetMapper fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<ServerToBentoAssetMapper> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(ServerToBentoAssetMapper serverToBentoAssetMapper) {
        return INSTANCE.toServerValue(serverToBentoAssetMapper);
    }

    private ServerToBentoAssetMapper(String str, int i, int i2) {
        this.resourceId = i2;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    static {
        ServerToBentoAssetMapper[] serverToBentoAssetMapperArr$values = $values();
        $VALUES = serverToBentoAssetMapperArr$values;
        $ENTRIES = EnumEntries2.enumEntries(serverToBentoAssetMapperArr$values);
        INSTANCE = new Companion(null);
        EnumEntries<ServerToBentoAssetMapper> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (ServerToBentoAssetMapper serverToBentoAssetMapper : entries) {
            linkedHashMap.put(serverToBentoAssetMapper.name(), serverToBentoAssetMapper);
        }
        map = linkedHashMap;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* compiled from: ServerToBentoAssetMapper.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017J\u0013\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0086\u0002R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/FlagAsset$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/android/libdesignsystem/serverui/FlagAsset;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "map", "", "get", "value", "lib-design-system-res_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.FlagAsset$Companion, reason: from kotlin metadata */
    public static final class Companion extends RhEnum.Converter.Defaulted<ServerToBentoAssetMapper> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super((Enum[]) ServerToBentoAssetMapper.getEntries().toArray(new ServerToBentoAssetMapper[0]), ServerToBentoAssetMapper.UNKNOWN, false, 4, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(ServerToBentoAssetMapper enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public ServerToBentoAssetMapper fromServerValue(String serverValue) {
            return (ServerToBentoAssetMapper) super.fromServerValue(serverValue);
        }

        public final ServerToBentoAssetMapper get(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (ServerToBentoAssetMapper) ServerToBentoAssetMapper.map.get(value);
        }
    }

    public static ServerToBentoAssetMapper valueOf(String str) {
        return (ServerToBentoAssetMapper) Enum.valueOf(ServerToBentoAssetMapper.class, str);
    }

    public static ServerToBentoAssetMapper[] values() {
        return (ServerToBentoAssetMapper[]) $VALUES.clone();
    }
}
