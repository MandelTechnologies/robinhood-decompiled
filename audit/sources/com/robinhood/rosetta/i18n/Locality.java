package com.robinhood.rosetta.i18n;

import com.robinhood.iso.countrycode.CountryCode;
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
/* compiled from: Locality.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b/\b\u0086\u0081\u0002\u0018\u0000 22\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u00012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/Locality;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LOCALITY_UNSPECIFIED", CountryCode.COUNTRY_CODE_US, CountryCode.COUNTRY_CODE_GB, CountryCode.COUNTRY_CODE_AT, CountryCode.COUNTRY_CODE_BE, CountryCode.COUNTRY_CODE_BG, CountryCode.COUNTRY_CODE_HR, CountryCode.COUNTRY_CODE_CY, CountryCode.COUNTRY_CODE_CZ, CountryCode.COUNTRY_CODE_DK, CountryCode.COUNTRY_CODE_EE, CountryCode.COUNTRY_CODE_FI, CountryCode.COUNTRY_CODE_FR, CountryCode.COUNTRY_CODE_DE, CountryCode.COUNTRY_CODE_GR, CountryCode.COUNTRY_CODE_HU, CountryCode.COUNTRY_CODE_IE, CountryCode.COUNTRY_CODE_IT, CountryCode.COUNTRY_CODE_LV, CountryCode.COUNTRY_CODE_LT, CountryCode.COUNTRY_CODE_LU, CountryCode.COUNTRY_CODE_MT, CountryCode.COUNTRY_CODE_NL, CountryCode.COUNTRY_CODE_PL, CountryCode.COUNTRY_CODE_PT, CountryCode.COUNTRY_CODE_RO, CountryCode.COUNTRY_CODE_SK, CountryCode.COUNTRY_CODE_SI, CountryCode.COUNTRY_CODE_ES, CountryCode.COUNTRY_CODE_SE, CountryCode.COUNTRY_CODE_SG, CountryCode.COUNTRY_CODE_TW, CountryCode.COUNTRY_CODE_HK, CountryCode.COUNTRY_CODE_ID, CountryCode.COUNTRY_CODE_MY, CountryCode.COUNTRY_CODE_TH, CountryCode.COUNTRY_CODE_VN, CountryCode.COUNTRY_CODE_IN, CountryCode.COUNTRY_CODE_NO, CountryCode.COUNTRY_CODE_LI, CountryCode.COUNTRY_CODE_IS, "Companion", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Locality implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Locality[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Locality> ADAPTER;

    /* renamed from: AT */
    public static final Locality f6070AT;

    /* renamed from: BE */
    public static final Locality f6071BE;

    /* renamed from: BG */
    public static final Locality f6072BG;

    /* renamed from: CY */
    public static final Locality f6073CY;

    /* renamed from: CZ */
    public static final Locality f6074CZ;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: DE */
    public static final Locality f6075DE;

    /* renamed from: DK */
    public static final Locality f6076DK;

    /* renamed from: EE */
    public static final Locality f6077EE;

    /* renamed from: ES */
    public static final Locality f6078ES;

    /* renamed from: FI */
    public static final Locality f6079FI;

    /* renamed from: FR */
    public static final Locality f6080FR;

    /* renamed from: GB */
    public static final Locality f6081GB;

    /* renamed from: GR */
    public static final Locality f6082GR;

    /* renamed from: HK */
    public static final Locality f6083HK;

    /* renamed from: HR */
    public static final Locality f6084HR;

    /* renamed from: HU */
    public static final Locality f6085HU;

    /* renamed from: ID */
    public static final Locality f6086ID;

    /* renamed from: IE */
    public static final Locality f6087IE;

    /* renamed from: IN */
    public static final Locality f6088IN;

    /* renamed from: IS */
    public static final Locality f6089IS;

    /* renamed from: IT */
    public static final Locality f6090IT;

    /* renamed from: LI */
    public static final Locality f6091LI;
    public static final Locality LOCALITY_UNSPECIFIED;

    /* renamed from: LT */
    public static final Locality f6092LT;

    /* renamed from: LU */
    public static final Locality f6093LU;

    /* renamed from: LV */
    public static final Locality f6094LV;

    /* renamed from: MT */
    public static final Locality f6095MT;

    /* renamed from: MY */
    public static final Locality f6096MY;

    /* renamed from: NL */
    public static final Locality f6097NL;

    /* renamed from: NO */
    public static final Locality f6098NO;

    /* renamed from: PL */
    public static final Locality f6099PL;

    /* renamed from: PT */
    public static final Locality f6100PT;

    /* renamed from: RO */
    public static final Locality f6101RO;

    /* renamed from: SE */
    public static final Locality f6102SE;

    /* renamed from: SG */
    public static final Locality f6103SG;

    /* renamed from: SI */
    public static final Locality f6104SI;

    /* renamed from: SK */
    public static final Locality f6105SK;

    /* renamed from: TH */
    public static final Locality f6106TH;

    /* renamed from: TW */
    public static final Locality f6107TW;

    /* renamed from: US */
    public static final Locality f6108US;

    /* renamed from: VN */
    public static final Locality f6109VN;
    private final int value;

    private static final /* synthetic */ Locality[] $values() {
        return new Locality[]{LOCALITY_UNSPECIFIED, f6108US, f6081GB, f6070AT, f6071BE, f6072BG, f6084HR, f6073CY, f6074CZ, f6076DK, f6077EE, f6079FI, f6080FR, f6075DE, f6082GR, f6085HU, f6087IE, f6090IT, f6094LV, f6092LT, f6093LU, f6095MT, f6097NL, f6099PL, f6100PT, f6101RO, f6105SK, f6104SI, f6078ES, f6102SE, f6103SG, f6107TW, f6083HK, f6086ID, f6096MY, f6106TH, f6109VN, f6088IN, f6098NO, f6091LI, f6089IS};
    }

    @JvmStatic
    public static final Locality fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Locality> getEntries() {
        return $ENTRIES;
    }

    private Locality(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Locality locality = new Locality("LOCALITY_UNSPECIFIED", 0, 0);
        LOCALITY_UNSPECIFIED = locality;
        f6108US = new Locality(CountryCode.COUNTRY_CODE_US, 1, 1);
        f6081GB = new Locality(CountryCode.COUNTRY_CODE_GB, 2, 2);
        f6070AT = new Locality(CountryCode.COUNTRY_CODE_AT, 3, 4);
        f6071BE = new Locality(CountryCode.COUNTRY_CODE_BE, 4, 5);
        f6072BG = new Locality(CountryCode.COUNTRY_CODE_BG, 5, 6);
        f6084HR = new Locality(CountryCode.COUNTRY_CODE_HR, 6, 7);
        f6073CY = new Locality(CountryCode.COUNTRY_CODE_CY, 7, 8);
        f6074CZ = new Locality(CountryCode.COUNTRY_CODE_CZ, 8, 9);
        f6076DK = new Locality(CountryCode.COUNTRY_CODE_DK, 9, 10);
        f6077EE = new Locality(CountryCode.COUNTRY_CODE_EE, 10, 11);
        f6079FI = new Locality(CountryCode.COUNTRY_CODE_FI, 11, 12);
        f6080FR = new Locality(CountryCode.COUNTRY_CODE_FR, 12, 13);
        f6075DE = new Locality(CountryCode.COUNTRY_CODE_DE, 13, 14);
        f6082GR = new Locality(CountryCode.COUNTRY_CODE_GR, 14, 15);
        f6085HU = new Locality(CountryCode.COUNTRY_CODE_HU, 15, 16);
        f6087IE = new Locality(CountryCode.COUNTRY_CODE_IE, 16, 17);
        f6090IT = new Locality(CountryCode.COUNTRY_CODE_IT, 17, 18);
        f6094LV = new Locality(CountryCode.COUNTRY_CODE_LV, 18, 19);
        f6092LT = new Locality(CountryCode.COUNTRY_CODE_LT, 19, 20);
        f6093LU = new Locality(CountryCode.COUNTRY_CODE_LU, 20, 21);
        f6095MT = new Locality(CountryCode.COUNTRY_CODE_MT, 21, 22);
        f6097NL = new Locality(CountryCode.COUNTRY_CODE_NL, 22, 23);
        f6099PL = new Locality(CountryCode.COUNTRY_CODE_PL, 23, 24);
        f6100PT = new Locality(CountryCode.COUNTRY_CODE_PT, 24, 25);
        f6101RO = new Locality(CountryCode.COUNTRY_CODE_RO, 25, 26);
        f6105SK = new Locality(CountryCode.COUNTRY_CODE_SK, 26, 27);
        f6104SI = new Locality(CountryCode.COUNTRY_CODE_SI, 27, 28);
        f6078ES = new Locality(CountryCode.COUNTRY_CODE_ES, 28, 29);
        f6102SE = new Locality(CountryCode.COUNTRY_CODE_SE, 29, 30);
        f6103SG = new Locality(CountryCode.COUNTRY_CODE_SG, 30, 31);
        f6107TW = new Locality(CountryCode.COUNTRY_CODE_TW, 31, 32);
        f6083HK = new Locality(CountryCode.COUNTRY_CODE_HK, 32, 33);
        f6086ID = new Locality(CountryCode.COUNTRY_CODE_ID, 33, 34);
        f6096MY = new Locality(CountryCode.COUNTRY_CODE_MY, 34, 35);
        f6106TH = new Locality(CountryCode.COUNTRY_CODE_TH, 35, 36);
        f6109VN = new Locality(CountryCode.COUNTRY_CODE_VN, 36, 37);
        f6088IN = new Locality(CountryCode.COUNTRY_CODE_IN, 37, 38);
        f6098NO = new Locality(CountryCode.COUNTRY_CODE_NO, 38, 40);
        f6091LI = new Locality(CountryCode.COUNTRY_CODE_LI, 39, 41);
        f6089IS = new Locality(CountryCode.COUNTRY_CODE_IS, 40, 42);
        Locality[] localityArr$values = $values();
        $VALUES = localityArr$values;
        $ENTRIES = EnumEntries2.enumEntries(localityArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Locality.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Locality>(orCreateKotlinClass, syntax, locality) { // from class: com.robinhood.rosetta.i18n.Locality$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Locality fromValue(int value) {
                return Locality.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Locality.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/Locality$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/i18n/Locality;", "fromValue", "value", "", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Locality fromValue(int value) {
            switch (value) {
                case 0:
                    return Locality.LOCALITY_UNSPECIFIED;
                case 1:
                    return Locality.f6108US;
                case 2:
                    return Locality.f6081GB;
                case 3:
                case 39:
                default:
                    return null;
                case 4:
                    return Locality.f6070AT;
                case 5:
                    return Locality.f6071BE;
                case 6:
                    return Locality.f6072BG;
                case 7:
                    return Locality.f6084HR;
                case 8:
                    return Locality.f6073CY;
                case 9:
                    return Locality.f6074CZ;
                case 10:
                    return Locality.f6076DK;
                case 11:
                    return Locality.f6077EE;
                case 12:
                    return Locality.f6079FI;
                case 13:
                    return Locality.f6080FR;
                case 14:
                    return Locality.f6075DE;
                case 15:
                    return Locality.f6082GR;
                case 16:
                    return Locality.f6085HU;
                case 17:
                    return Locality.f6087IE;
                case 18:
                    return Locality.f6090IT;
                case 19:
                    return Locality.f6094LV;
                case 20:
                    return Locality.f6092LT;
                case 21:
                    return Locality.f6093LU;
                case 22:
                    return Locality.f6095MT;
                case 23:
                    return Locality.f6097NL;
                case 24:
                    return Locality.f6099PL;
                case 25:
                    return Locality.f6100PT;
                case 26:
                    return Locality.f6101RO;
                case 27:
                    return Locality.f6105SK;
                case 28:
                    return Locality.f6104SI;
                case 29:
                    return Locality.f6078ES;
                case 30:
                    return Locality.f6102SE;
                case 31:
                    return Locality.f6103SG;
                case 32:
                    return Locality.f6107TW;
                case 33:
                    return Locality.f6083HK;
                case 34:
                    return Locality.f6086ID;
                case 35:
                    return Locality.f6096MY;
                case 36:
                    return Locality.f6106TH;
                case 37:
                    return Locality.f6109VN;
                case 38:
                    return Locality.f6088IN;
                case 40:
                    return Locality.f6098NO;
                case 41:
                    return Locality.f6091LI;
                case 42:
                    return Locality.f6089IS;
            }
        }
    }

    public static Locality valueOf(String str) {
        return (Locality) Enum.valueOf(Locality.class, str);
    }

    public static Locality[] values() {
        return (Locality[]) $VALUES.clone();
    }
}
