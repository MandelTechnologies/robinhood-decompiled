package com.robinhood.iso.countrycode;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.iso.countrycode.Affiliate;
import java.io.Serializable;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

/* compiled from: CountryCode.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00162\u00020\u0001:\u0003\u0014\u0015\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\tH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode;", "Ljava/io/Serializable;", "iso3166CountryCode", "", "<init>", "(Ljava/lang/String;)V", "getIso3166CountryCode", "()Ljava/lang/String;", "countryLocale", "Ljava/util/Locale;", "getCountryLocale$annotations", "()V", "isGdprApplicable", "", "()Z", "isRhsg", "parentLocality", "getParentLocality", "getDisplayCountry", "locale", "Unsupported", "Supported", "Companion", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "Lcom/robinhood/iso/countrycode/CountryCode$Unsupported;", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public abstract class CountryCode implements Serializable {
    public static final String COUNTRY_CODE_AS = "AS";
    public static final String COUNTRY_CODE_AT = "AT";
    public static final String COUNTRY_CODE_AU = "AU";
    public static final String COUNTRY_CODE_BE = "BE";
    public static final String COUNTRY_CODE_BG = "BG";
    public static final String COUNTRY_CODE_BN = "BN";
    public static final String COUNTRY_CODE_CK = "CK";
    public static final String COUNTRY_CODE_CN = "CN";
    public static final String COUNTRY_CODE_CY = "CY";
    public static final String COUNTRY_CODE_CZ = "CZ";
    public static final String COUNTRY_CODE_DE = "DE";
    public static final String COUNTRY_CODE_DK = "DK";
    public static final String COUNTRY_CODE_EE = "EE";
    public static final String COUNTRY_CODE_ES = "ES";
    public static final String COUNTRY_CODE_FI = "FI";
    public static final String COUNTRY_CODE_FJ = "FJ";
    public static final String COUNTRY_CODE_FM = "FM";
    public static final String COUNTRY_CODE_FR = "FR";
    public static final String COUNTRY_CODE_GB = "GB";
    public static final String COUNTRY_CODE_GR = "GR";
    public static final String COUNTRY_CODE_GU = "GU";
    public static final String COUNTRY_CODE_HK = "HK";
    public static final String COUNTRY_CODE_HR = "HR";
    public static final String COUNTRY_CODE_HU = "HU";
    public static final String COUNTRY_CODE_ID = "ID";
    public static final String COUNTRY_CODE_IE = "IE";
    public static final String COUNTRY_CODE_IN = "IN";
    public static final String COUNTRY_CODE_IS = "IS";
    public static final String COUNTRY_CODE_IT = "IT";
    public static final String COUNTRY_CODE_JP = "JP";
    public static final String COUNTRY_CODE_KH = "KH";
    public static final String COUNTRY_CODE_KI = "KI";
    public static final String COUNTRY_CODE_KR = "KR";
    public static final String COUNTRY_CODE_LA = "LA";
    public static final String COUNTRY_CODE_LI = "LI";
    public static final String COUNTRY_CODE_LT = "LT";
    public static final String COUNTRY_CODE_LU = "LU";
    public static final String COUNTRY_CODE_LV = "LV";
    public static final String COUNTRY_CODE_MH = "MH";
    public static final String COUNTRY_CODE_MN = "MN";
    public static final String COUNTRY_CODE_MO = "MO";
    public static final String COUNTRY_CODE_MP = "MP";
    public static final String COUNTRY_CODE_MT = "MT";
    public static final String COUNTRY_CODE_MY = "MY";
    public static final String COUNTRY_CODE_NC = "NC";
    public static final String COUNTRY_CODE_NL = "NL";
    public static final String COUNTRY_CODE_NO = "NO";
    public static final String COUNTRY_CODE_NR = "NR";
    public static final String COUNTRY_CODE_NU = "NU";
    public static final String COUNTRY_CODE_NZ = "NZ";
    public static final String COUNTRY_CODE_PG = "PG";
    public static final String COUNTRY_CODE_PH = "PH";
    public static final String COUNTRY_CODE_PL = "PL";
    public static final String COUNTRY_CODE_PR = "PR";
    public static final String COUNTRY_CODE_PT = "PT";
    public static final String COUNTRY_CODE_PW = "PW";
    public static final String COUNTRY_CODE_RO = "RO";
    public static final String COUNTRY_CODE_SB = "SB";
    public static final String COUNTRY_CODE_SE = "SE";
    public static final String COUNTRY_CODE_SG = "SG";
    public static final String COUNTRY_CODE_SI = "SI";
    public static final String COUNTRY_CODE_SK = "SK";
    public static final String COUNTRY_CODE_TH = "TH";
    public static final String COUNTRY_CODE_TL = "TL";
    public static final String COUNTRY_CODE_TO = "TO";
    public static final String COUNTRY_CODE_TV = "TV";
    public static final String COUNTRY_CODE_TW = "TW";
    public static final String COUNTRY_CODE_UM = "UM";
    public static final String COUNTRY_CODE_US = "US";
    public static final String COUNTRY_CODE_VI = "VI";
    public static final String COUNTRY_CODE_VN = "VN";
    public static final String COUNTRY_CODE_VU = "VU";
    public static final String COUNTRY_CODE_WS = "WS";
    private static final Set<String> iso3166CountryCodes;
    private final transient Locale countryLocale;
    private final String iso3166CountryCode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Regex iso3166CountryCodeRegex = new Regex("[a-zA-Z]{2}");
    private static final ConcurrentHashMap<String, CountryCode> instances = new ConcurrentHashMap<>();

    public /* synthetic */ CountryCode(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private static /* synthetic */ void getCountryLocale$annotations() {
    }

    @JvmStatic
    public static final CountryCode getInstance(String str) {
        return INSTANCE.getInstance(str);
    }

    @JvmOverloads
    public final String getDisplayCountry() {
        return getDisplayCountry$default(this, null, 1, null);
    }

    private CountryCode(String str) {
        this.iso3166CountryCode = str;
        this.countryLocale = new Locale("", str);
    }

    public final String getIso3166CountryCode() {
        return this.iso3166CountryCode;
    }

    public final boolean isGdprApplicable() {
        return (Intrinsics.areEqual(this, Supported.UnitedStates.INSTANCE) || INSTANCE.getUS_SUBDIVISIONS().contains(this.iso3166CountryCode) || isRhsg()) ? false : true;
    }

    public final boolean isRhsg() {
        return Affiliate.RHSG.INSTANCE.contains(this);
    }

    public final String getParentLocality() {
        if (INSTANCE.getUS_SUBDIVISIONS().contains(this.iso3166CountryCode)) {
            return Supported.UnitedStates.INSTANCE.getIso3166CountryCode();
        }
        return this.iso3166CountryCode;
    }

    public static /* synthetic */ String getDisplayCountry$default(CountryCode countryCode, Locale locale, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDisplayCountry");
        }
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
        }
        return countryCode.getDisplayCountry(locale);
    }

    @JvmOverloads
    public final String getDisplayCountry(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String displayCountry = this.countryLocale.getDisplayCountry(locale);
        Intrinsics.checkNotNullExpressionValue(displayCountry, "getDisplayCountry(...)");
        return displayCountry;
    }

    /* compiled from: CountryCode.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Unsupported;", "Lcom/robinhood/iso/countrycode/CountryCode;", "iso3166CountryCode", "", "<init>", "(Ljava/lang/String;)V", "readResolve", "", "toString", "Companion", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Unsupported extends CountryCode {
        private static final long serialVersionUID = -90023775;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unsupported(String iso3166CountryCode) {
            super(iso3166CountryCode, null);
            Intrinsics.checkNotNullParameter(iso3166CountryCode, "iso3166CountryCode");
        }

        private final Object readResolve() {
            return CountryCode.INSTANCE.getInstance(getIso3166CountryCode());
        }

        public String toString() {
            return "Unsupported";
        }
    }

    /* compiled from: CountryCode.kt */
    @Metadata(m3635d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 .2\u00020\u0001:)\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001(/0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUV¨\u0006W"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "Lcom/robinhood/iso/countrycode/CountryCode;", "iso3166CountryCode", "", "<init>", "(Ljava/lang/String;)V", "UnitedStates", "UnitedKingdom", "Singapore", "Austria", "Belgium", "Bulgaria", "Cyprus", "Czechia", "Germany", "Denmark", "Estonia", "Spain", "Finland", "France", "Greece", "Croatia", "Hungary", "Ireland", "Iceland", "Italy", "Liechtenstein", "Lithuania", "Luxembourg", "Latvia", "Malta", "Netherlands", "Norway", "Poland", "Portugal", "Romania", "Sweden", "Slovenia", "Slovakia", "Vietnam", "Taiwan", "HongKongSARChina", "Indonesia", "Malaysia", "Thailand", "India", "Companion", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Austria;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Belgium;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Bulgaria;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Croatia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Cyprus;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Czechia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Denmark;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Estonia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Finland;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$France;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Germany;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Greece;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$HongKongSARChina;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Hungary;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Iceland;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$India;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Indonesia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Ireland;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Italy;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Latvia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Liechtenstein;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Lithuania;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Luxembourg;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Malaysia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Malta;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Netherlands;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Norway;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Poland;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Portugal;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Romania;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Singapore;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Slovakia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Slovenia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Spain;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Sweden;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Taiwan;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Thailand;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$UnitedKingdom;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$UnitedStates;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported$Vietnam;", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Supported extends CountryCode {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ Supported(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$UnitedStates;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UnitedStates extends Supported {
            public static final UnitedStates INSTANCE = new UnitedStates();
            private static final long serialVersionUID = -90000042;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof UnitedStates);
            }

            public int hashCode() {
                return 359336089;
            }

            public String toString() {
                return "UnitedStates";
            }

            private UnitedStates() {
                super(CountryCode.COUNTRY_CODE_US, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        private Supported(String str) {
            super(str, null);
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$UnitedKingdom;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UnitedKingdom extends Supported {
            public static final UnitedKingdom INSTANCE = new UnitedKingdom();
            private static final long serialVersionUID = -95827786;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof UnitedKingdom);
            }

            public int hashCode() {
                return -558881132;
            }

            public String toString() {
                return "UnitedKingdom";
            }

            private UnitedKingdom() {
                super(CountryCode.COUNTRY_CODE_GB, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Singapore;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Singapore extends Supported {
            public static final Singapore INSTANCE = new Singapore();
            private static final long serialVersionUID = 364161800106763874L;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Singapore);
            }

            public int hashCode() {
                return -425964528;
            }

            public String toString() {
                return "Singapore";
            }

            private Singapore() {
                super(CountryCode.COUNTRY_CODE_SG, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Austria;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Austria extends Supported {
            public static final Austria INSTANCE = new Austria();
            private static final long serialVersionUID = -79332611;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Austria);
            }

            public int hashCode() {
                return 703769409;
            }

            public String toString() {
                return "Austria";
            }

            private Austria() {
                super(CountryCode.COUNTRY_CODE_AT, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Belgium;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Belgium extends Supported {
            public static final Belgium INSTANCE = new Belgium();
            private static final long serialVersionUID = -81831511;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Belgium);
            }

            public int hashCode() {
                return 1126346479;
            }

            public String toString() {
                return "Belgium";
            }

            private Belgium() {
                super(CountryCode.COUNTRY_CODE_BE, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Bulgaria;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Bulgaria extends Supported {
            public static final Bulgaria INSTANCE = new Bulgaria();
            private static final long serialVersionUID = -32598220;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Bulgaria);
            }

            public int hashCode() {
                return 1871918251;
            }

            public String toString() {
                return "Bulgaria";
            }

            private Bulgaria() {
                super(CountryCode.COUNTRY_CODE_BG, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Cyprus;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Cyprus extends Supported {
            public static final Cyprus INSTANCE = new Cyprus();
            private static final long serialVersionUID = -68318465;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Cyprus);
            }

            public int hashCode() {
                return 222110762;
            }

            public String toString() {
                return "Cyprus";
            }

            private Cyprus() {
                super(CountryCode.COUNTRY_CODE_CY, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Czechia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Czechia extends Supported {
            public static final Czechia INSTANCE = new Czechia();
            private static final long serialVersionUID = -50404656;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Czechia);
            }

            public int hashCode() {
                return -1686490121;
            }

            public String toString() {
                return "Czechia";
            }

            private Czechia() {
                super(CountryCode.COUNTRY_CODE_CZ, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Germany;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Germany extends Supported {
            public static final Germany INSTANCE = new Germany();
            private static final long serialVersionUID = -25558170;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Germany);
            }

            public int hashCode() {
                return 1274609567;
            }

            public String toString() {
                return "Germany";
            }

            private Germany() {
                super(CountryCode.COUNTRY_CODE_DE, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Denmark;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Denmark extends Supported {
            public static final Denmark INSTANCE = new Denmark();
            private static final long serialVersionUID = -84700559;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Denmark);
            }

            public int hashCode() {
                return -1391595450;
            }

            public String toString() {
                return "Denmark";
            }

            private Denmark() {
                super(CountryCode.COUNTRY_CODE_DK, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Estonia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Estonia extends Supported {
            public static final Estonia INSTANCE = new Estonia();
            private static final long serialVersionUID = -72454692;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Estonia);
            }

            public int hashCode() {
                return -97670743;
            }

            public String toString() {
                return "Estonia";
            }

            private Estonia() {
                super(CountryCode.COUNTRY_CODE_EE, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Spain;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Spain extends Supported {
            public static final Spain INSTANCE = new Spain();
            private static final long serialVersionUID = -56997863;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Spain);
            }

            public int hashCode() {
                return 1545679029;
            }

            public String toString() {
                return "Spain";
            }

            private Spain() {
                super(CountryCode.COUNTRY_CODE_ES, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Finland;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Finland extends Supported {
            public static final Finland INSTANCE = new Finland();
            private static final long serialVersionUID = -82019713;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Finland);
            }

            public int hashCode() {
                return 497898594;
            }

            public String toString() {
                return "Finland";
            }

            private Finland() {
                super(CountryCode.COUNTRY_CODE_FI, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$France;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class France extends Supported {
            public static final France INSTANCE = new France();
            private static final long serialVersionUID = -84817444;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof France);
            }

            public int hashCode() {
                return 301082287;
            }

            public String toString() {
                return "France";
            }

            private France() {
                super(CountryCode.COUNTRY_CODE_FR, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Greece;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Greece extends Supported {
            public static final Greece INSTANCE = new Greece();
            private static final long serialVersionUID = -38646560;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Greece);
            }

            public int hashCode() {
                return 329821953;
            }

            public String toString() {
                return "Greece";
            }

            private Greece() {
                super(CountryCode.COUNTRY_CODE_GR, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Croatia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Croatia extends Supported {
            public static final Croatia INSTANCE = new Croatia();
            private static final long serialVersionUID = -64646832;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Croatia);
            }

            public int hashCode() {
                return -1906336169;
            }

            public String toString() {
                return "Croatia";
            }

            private Croatia() {
                super(CountryCode.COUNTRY_CODE_HR, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Hungary;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Hungary extends Supported {
            public static final Hungary INSTANCE = new Hungary();
            private static final long serialVersionUID = -86870536;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Hungary);
            }

            public int hashCode() {
                return -1678660338;
            }

            public String toString() {
                return "Hungary";
            }

            private Hungary() {
                super(CountryCode.COUNTRY_CODE_HU, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Ireland;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Ireland extends Supported {
            public static final Ireland INSTANCE = new Ireland();
            private static final long serialVersionUID = -68782813;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Ireland);
            }

            public int hashCode() {
                return -885206989;
            }

            public String toString() {
                return "Ireland";
            }

            private Ireland() {
                super(CountryCode.COUNTRY_CODE_IE, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Iceland;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final /* data */ class Iceland extends Supported {
            public static final Iceland INSTANCE = new Iceland();
            private static final long serialVersionUID = -30335019;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Iceland);
            }

            public int hashCode() {
                return -1314644254;
            }

            public String toString() {
                return "Iceland";
            }

            private Iceland() {
                super(CountryCode.COUNTRY_CODE_IS, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Italy;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Italy extends Supported {
            public static final Italy INSTANCE = new Italy();
            private static final long serialVersionUID = -89910639;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Italy);
            }

            public int hashCode() {
                return 1536563087;
            }

            public String toString() {
                return "Italy";
            }

            private Italy() {
                super(CountryCode.COUNTRY_CODE_IT, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Liechtenstein;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final /* data */ class Liechtenstein extends Supported {
            public static final Liechtenstein INSTANCE = new Liechtenstein();
            private static final long serialVersionUID = -82084615;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Liechtenstein);
            }

            public int hashCode() {
                return 1816141605;
            }

            public String toString() {
                return "Liechtenstein";
            }

            private Liechtenstein() {
                super(CountryCode.COUNTRY_CODE_LI, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Lithuania;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Lithuania extends Supported {
            public static final Lithuania INSTANCE = new Lithuania();
            private static final long serialVersionUID = -30341291;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Lithuania);
            }

            public int hashCode() {
                return 418021077;
            }

            public String toString() {
                return "Lithuania";
            }

            private Lithuania() {
                super(CountryCode.COUNTRY_CODE_LT, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Luxembourg;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Luxembourg extends Supported {
            public static final Luxembourg INSTANCE = new Luxembourg();
            private static final long serialVersionUID = -30414486;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Luxembourg);
            }

            public int hashCode() {
                return -355170310;
            }

            public String toString() {
                return "Luxembourg";
            }

            private Luxembourg() {
                super(CountryCode.COUNTRY_CODE_LU, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Latvia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Latvia extends Supported {
            public static final Latvia INSTANCE = new Latvia();
            private static final long serialVersionUID = -20008250;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Latvia);
            }

            public int hashCode() {
                return 457731235;
            }

            public String toString() {
                return "Latvia";
            }

            private Latvia() {
                super(CountryCode.COUNTRY_CODE_LV, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Malta;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Malta extends Supported {
            public static final Malta INSTANCE = new Malta();
            private static final long serialVersionUID = -32489387;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Malta);
            }

            public int hashCode() {
                return 1539701937;
            }

            public String toString() {
                return "Malta";
            }

            private Malta() {
                super(CountryCode.COUNTRY_CODE_MT, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Netherlands;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Netherlands extends Supported {
            public static final Netherlands INSTANCE = new Netherlands();
            private static final long serialVersionUID = -68955104;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Netherlands);
            }

            public int hashCode() {
                return -1352083332;
            }

            public String toString() {
                return "Netherlands";
            }

            private Netherlands() {
                super(CountryCode.COUNTRY_CODE_NL, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Norway;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final /* data */ class Norway extends Supported {
            public static final Norway INSTANCE = new Norway();
            private static final long serialVersionUID = -17508362;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Norway);
            }

            public int hashCode() {
                return 527859986;
            }

            public String toString() {
                return "Norway";
            }

            private Norway() {
                super(CountryCode.COUNTRY_CODE_NO, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Poland;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Poland extends Supported {
            public static final Poland INSTANCE = new Poland();
            private static final long serialVersionUID = -55203462;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Poland);
            }

            public int hashCode() {
                return 584918782;
            }

            public String toString() {
                return "Poland";
            }

            private Poland() {
                super(CountryCode.COUNTRY_CODE_PL, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Portugal;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Portugal extends Supported {
            public static final Portugal INSTANCE = new Portugal();
            private static final long serialVersionUID = -64360438;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Portugal);
            }

            public int hashCode() {
                return -344229934;
            }

            public String toString() {
                return "Portugal";
            }

            private Portugal() {
                super(CountryCode.COUNTRY_CODE_PT, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Romania;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Romania extends Supported {
            public static final Romania INSTANCE = new Romania();
            private static final long serialVersionUID = -60520847;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Romania);
            }

            public int hashCode() {
                return -1566423103;
            }

            public String toString() {
                return "Romania";
            }

            private Romania() {
                super(CountryCode.COUNTRY_CODE_RO, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Sweden;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Sweden extends Supported {
            public static final Sweden INSTANCE = new Sweden();
            private static final long serialVersionUID = -56787566;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Sweden);
            }

            public int hashCode() {
                return 677988480;
            }

            public String toString() {
                return "Sweden";
            }

            private Sweden() {
                super(CountryCode.COUNTRY_CODE_SE, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Slovenia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Slovenia extends Supported {
            public static final Slovenia INSTANCE = new Slovenia();
            private static final long serialVersionUID = -87294053;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Slovenia);
            }

            public int hashCode() {
                return 2137179925;
            }

            public String toString() {
                return "Slovenia";
            }

            private Slovenia() {
                super(CountryCode.COUNTRY_CODE_SI, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Slovakia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Slovakia extends Supported {
            public static final Slovakia INSTANCE = new Slovakia();
            private static final long serialVersionUID = -39795048;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Slovakia);
            }

            public int hashCode() {
                return 2137057878;
            }

            public String toString() {
                return "Slovakia";
            }

            private Slovakia() {
                super(CountryCode.COUNTRY_CODE_SK, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Vietnam;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final /* data */ class Vietnam extends Supported {
            public static final Vietnam INSTANCE = new Vietnam();
            private static final long serialVersionUID = -99540926;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Vietnam);
            }

            public int hashCode() {
                return 1804994340;
            }

            public String toString() {
                return "Vietnam";
            }

            private Vietnam() {
                super(CountryCode.COUNTRY_CODE_VN, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Taiwan;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final /* data */ class Taiwan extends Supported {
            public static final Taiwan INSTANCE = new Taiwan();
            private static final long serialVersionUID = -19559749;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Taiwan);
            }

            public int hashCode() {
                return 686437468;
            }

            public String toString() {
                return "Taiwan";
            }

            private Taiwan() {
                super(CountryCode.COUNTRY_CODE_TW, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$HongKongSARChina;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final /* data */ class HongKongSARChina extends Supported {
            public static final HongKongSARChina INSTANCE = new HongKongSARChina();
            private static final long serialVersionUID = -66719600;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof HongKongSARChina);
            }

            public int hashCode() {
                return -1842076732;
            }

            public String toString() {
                return "HongKongSARChina";
            }

            private HongKongSARChina() {
                super(CountryCode.COUNTRY_CODE_HK, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Indonesia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final /* data */ class Indonesia extends Supported {
            public static final Indonesia INSTANCE = new Indonesia();
            private static final long serialVersionUID = -50151125;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Indonesia);
            }

            public int hashCode() {
                return 548440624;
            }

            public String toString() {
                return "Indonesia";
            }

            private Indonesia() {
                super(CountryCode.COUNTRY_CODE_ID, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Malaysia;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final /* data */ class Malaysia extends Supported {
            public static final Malaysia INSTANCE = new Malaysia();
            private static final long serialVersionUID = -16413264;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Malaysia);
            }

            public int hashCode() {
                return -1007034161;
            }

            public String toString() {
                return "Malaysia";
            }

            private Malaysia() {
                super(CountryCode.COUNTRY_CODE_MY, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Thailand;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final /* data */ class Thailand extends Supported {
            public static final Thailand INSTANCE = new Thailand();
            private static final long serialVersionUID = -29650874;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Thailand);
            }

            public int hashCode() {
                return -82642149;
            }

            public String toString() {
                return "Thailand";
            }

            private Thailand() {
                super(CountryCode.COUNTRY_CODE_TH, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$India;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readResolve", "", "serialVersionUID", "", "getSerialVersionUID$annotations", "equals", "", "other", "hashCode", "", "toString", "", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final /* data */ class India extends Supported {
            public static final India INSTANCE = new India();
            private static final long serialVersionUID = -17706830;

            private static /* synthetic */ void getSerialVersionUID$annotations() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof India);
            }

            public int hashCode() {
                return 1536387107;
            }

            public String toString() {
                return "India";
            }

            private India() {
                super(CountryCode.COUNTRY_CODE_IN, null);
            }

            private final Object readResolve() {
                return INSTANCE;
            }
        }

        /* compiled from: CountryCode.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Supported$Companion;", "", "<init>", "()V", "EU_COUNTRIES", "", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getEU_COUNTRIES", "()Ljava/util/Set;", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Set<Supported> getEU_COUNTRIES() {
                return SetsKt.setOf((Object[]) new Supported[]{Austria.INSTANCE, Belgium.INSTANCE, Bulgaria.INSTANCE, Croatia.INSTANCE, Cyprus.INSTANCE, Czechia.INSTANCE, Denmark.INSTANCE, Estonia.INSTANCE, Finland.INSTANCE, France.INSTANCE, Germany.INSTANCE, Greece.INSTANCE, Hungary.INSTANCE, Iceland.INSTANCE, Ireland.INSTANCE, Italy.INSTANCE, Latvia.INSTANCE, Liechtenstein.INSTANCE, Lithuania.INSTANCE, Luxembourg.INSTANCE, Malta.INSTANCE, Netherlands.INSTANCE, Norway.INSTANCE, Poland.INSTANCE, Portugal.INSTANCE, Romania.INSTANCE, Slovakia.INSTANCE, Slovenia.INSTANCE, Spain.INSTANCE, Sweden.INSTANCE});
            }
        }
    }

    /* compiled from: CountryCode.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\"\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\t2\u0006\u0010[\u001a\u00020\bJ\u0010\u0010\\\u001a\u00020\t2\u0006\u0010]\u001a\u00020\bH\u0007J\u0010\u0010^\u001a\u00020\t2\u0006\u0010]\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\b0T8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001f\u0010W\u001a\u0010\u0012\f\u0012\n X*\u0004\u0018\u00010\b0\b0T¢\u0006\b\n\u0000\u001a\u0004\bY\u0010V¨\u0006_"}, m3636d2 = {"Lcom/robinhood/iso/countrycode/CountryCode$Companion;", "", "<init>", "()V", "iso3166CountryCodeRegex", "Lkotlin/text/Regex;", "instances", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/robinhood/iso/countrycode/CountryCode;", "COUNTRY_CODE_US", "COUNTRY_CODE_GB", "COUNTRY_CODE_AS", "COUNTRY_CODE_GU", "COUNTRY_CODE_MP", "COUNTRY_CODE_PR", "COUNTRY_CODE_UM", "COUNTRY_CODE_VI", "COUNTRY_CODE_AT", "COUNTRY_CODE_BE", "COUNTRY_CODE_BG", "COUNTRY_CODE_CY", "COUNTRY_CODE_CZ", "COUNTRY_CODE_DE", "COUNTRY_CODE_DK", "COUNTRY_CODE_EE", "COUNTRY_CODE_ES", "COUNTRY_CODE_FI", "COUNTRY_CODE_FR", "COUNTRY_CODE_GR", "COUNTRY_CODE_HR", "COUNTRY_CODE_HU", "COUNTRY_CODE_IE", "COUNTRY_CODE_IS", "COUNTRY_CODE_IT", "COUNTRY_CODE_LI", "COUNTRY_CODE_LT", "COUNTRY_CODE_LU", "COUNTRY_CODE_LV", "COUNTRY_CODE_MT", "COUNTRY_CODE_NL", "COUNTRY_CODE_NO", "COUNTRY_CODE_PL", "COUNTRY_CODE_PT", "COUNTRY_CODE_RO", "COUNTRY_CODE_SE", "COUNTRY_CODE_SI", "COUNTRY_CODE_SK", "COUNTRY_CODE_SG", "COUNTRY_CODE_VN", "COUNTRY_CODE_TW", "COUNTRY_CODE_HK", "COUNTRY_CODE_MY", "COUNTRY_CODE_ID", "COUNTRY_CODE_TH", "COUNTRY_CODE_IN", "COUNTRY_CODE_AU", "COUNTRY_CODE_BN", "COUNTRY_CODE_KH", "COUNTRY_CODE_CK", "COUNTRY_CODE_TL", "COUNTRY_CODE_FJ", "COUNTRY_CODE_JP", "COUNTRY_CODE_KI", "COUNTRY_CODE_LA", "COUNTRY_CODE_MO", "COUNTRY_CODE_MH", "COUNTRY_CODE_FM", "COUNTRY_CODE_MN", "COUNTRY_CODE_NR", "COUNTRY_CODE_NC", "COUNTRY_CODE_NZ", "COUNTRY_CODE_NU", "COUNTRY_CODE_PW", "COUNTRY_CODE_PG", "COUNTRY_CODE_CN", "COUNTRY_CODE_PH", "COUNTRY_CODE_WS", "COUNTRY_CODE_SB", "COUNTRY_CODE_KR", "COUNTRY_CODE_TO", "COUNTRY_CODE_TV", "COUNTRY_CODE_VU", "US_SUBDIVISIONS", "", "getUS_SUBDIVISIONS", "()Ljava/util/Set;", "iso3166CountryCodes", "kotlin.jvm.PlatformType", "getIso3166CountryCodes", "parseInstance", PlaceTypes.COUNTRY, "getInstance", "iso3166CountryCode", "createInstance", "lib-country-code"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<String> getUS_SUBDIVISIONS() {
            return SetsKt.setOf((Object[]) new String[]{CountryCode.COUNTRY_CODE_AS, CountryCode.COUNTRY_CODE_GU, CountryCode.COUNTRY_CODE_MP, "PR", CountryCode.COUNTRY_CODE_UM, CountryCode.COUNTRY_CODE_VI});
        }

        public final Set<String> getIso3166CountryCodes() {
            return CountryCode.iso3166CountryCodes;
        }

        public final CountryCode parseInstance(String country) {
            Intrinsics.checkNotNullParameter(country, "country");
            if (!CountryCode.iso3166CountryCodeRegex.matches(country)) {
                country = null;
            }
            if (country != null) {
                return CountryCode.INSTANCE.getInstance(country);
            }
            return null;
        }

        @JvmStatic
        public final CountryCode getInstance(String iso3166CountryCode) {
            Object objPutIfAbsent;
            Intrinsics.checkNotNullParameter(iso3166CountryCode, "iso3166CountryCode");
            if (CountryCode.iso3166CountryCodeRegex.matches(iso3166CountryCode)) {
                ConcurrentHashMap concurrentHashMap = CountryCode.instances;
                Object objCreateInstance = concurrentHashMap.get(iso3166CountryCode);
                if (objCreateInstance == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(iso3166CountryCode, (objCreateInstance = CountryCode.INSTANCE.createInstance(iso3166CountryCode)))) != null) {
                    objCreateInstance = objPutIfAbsent;
                }
                Intrinsics.checkNotNullExpressionValue(objCreateInstance, "getOrPut(...)");
                return (CountryCode) objCreateInstance;
            }
            throw new IllegalArgumentException(("Provided code does not match ISO 3166-2 spec: " + iso3166CountryCode).toString());
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private final CountryCode createInstance(String iso3166CountryCode) {
            switch (iso3166CountryCode.hashCode()) {
                case 2099:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_AT)) {
                        return Supported.Austria.INSTANCE;
                    }
                    break;
                case 2115:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_BE)) {
                        return Supported.Belgium.INSTANCE;
                    }
                    break;
                case 2117:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_BG)) {
                        return Supported.Bulgaria.INSTANCE;
                    }
                    break;
                case 2166:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_CY)) {
                        return Supported.Cyprus.INSTANCE;
                    }
                    break;
                case 2167:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_CZ)) {
                        return Supported.Czechia.INSTANCE;
                    }
                    break;
                case 2177:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_DE)) {
                        return Supported.Germany.INSTANCE;
                    }
                    break;
                case 2183:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_DK)) {
                        return Supported.Denmark.INSTANCE;
                    }
                    break;
                case 2208:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_EE)) {
                        return Supported.Estonia.INSTANCE;
                    }
                    break;
                case 2222:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_ES)) {
                        return Supported.Spain.INSTANCE;
                    }
                    break;
                case 2243:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_FI)) {
                        return Supported.Finland.INSTANCE;
                    }
                    break;
                case 2252:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_FR)) {
                        return Supported.France.INSTANCE;
                    }
                    break;
                case 2267:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_GB)) {
                        return Supported.UnitedKingdom.INSTANCE;
                    }
                    break;
                case 2283:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_GR)) {
                        return Supported.Greece.INSTANCE;
                    }
                    break;
                case 2307:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_HK)) {
                        return Supported.HongKongSARChina.INSTANCE;
                    }
                    break;
                case 2314:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_HR)) {
                        return Supported.Croatia.INSTANCE;
                    }
                    break;
                case 2317:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_HU)) {
                        return Supported.Hungary.INSTANCE;
                    }
                    break;
                case 2331:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_ID)) {
                        return Supported.Indonesia.INSTANCE;
                    }
                    break;
                case 2332:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_IE)) {
                        return Supported.Ireland.INSTANCE;
                    }
                    break;
                case 2341:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_IN)) {
                        return Supported.India.INSTANCE;
                    }
                    break;
                case 2346:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_IS)) {
                        return Supported.Iceland.INSTANCE;
                    }
                    break;
                case 2347:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_IT)) {
                        return Supported.Italy.INSTANCE;
                    }
                    break;
                case 2429:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_LI)) {
                        return Supported.Liechtenstein.INSTANCE;
                    }
                    break;
                case 2440:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_LT)) {
                        return Supported.Lithuania.INSTANCE;
                    }
                    break;
                case 2441:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_LU)) {
                        return Supported.Luxembourg.INSTANCE;
                    }
                    break;
                case 2442:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_LV)) {
                        return Supported.Latvia.INSTANCE;
                    }
                    break;
                case 2471:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_MT)) {
                        return Supported.Malta.INSTANCE;
                    }
                    break;
                case 2476:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_MY)) {
                        return Supported.Malaysia.INSTANCE;
                    }
                    break;
                case 2494:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_NL)) {
                        return Supported.Netherlands.INSTANCE;
                    }
                    break;
                case 2497:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_NO)) {
                        return Supported.Norway.INSTANCE;
                    }
                    break;
                case 2556:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_PL)) {
                        return Supported.Poland.INSTANCE;
                    }
                    break;
                case 2564:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_PT)) {
                        return Supported.Portugal.INSTANCE;
                    }
                    break;
                case 2621:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_RO)) {
                        return Supported.Romania.INSTANCE;
                    }
                    break;
                case 2642:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_SE)) {
                        return Supported.Sweden.INSTANCE;
                    }
                    break;
                case 2644:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_SG)) {
                        return Supported.Singapore.INSTANCE;
                    }
                    break;
                case 2646:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_SI)) {
                        return Supported.Slovenia.INSTANCE;
                    }
                    break;
                case 2648:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_SK)) {
                        return Supported.Slovakia.INSTANCE;
                    }
                    break;
                case 2676:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_TH)) {
                        return Supported.Thailand.INSTANCE;
                    }
                    break;
                case 2691:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_TW)) {
                        return Supported.Taiwan.INSTANCE;
                    }
                    break;
                case 2718:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_US)) {
                        return Supported.UnitedStates.INSTANCE;
                    }
                    break;
                case 2744:
                    if (iso3166CountryCode.equals(CountryCode.COUNTRY_CODE_VN)) {
                        return Supported.Vietnam.INSTANCE;
                    }
                    break;
            }
            return new Unsupported(iso3166CountryCode);
        }
    }

    static {
        String[] iSOCountries = Locale.getISOCountries();
        Intrinsics.checkNotNullExpressionValue(iSOCountries, "getISOCountries(...)");
        iso3166CountryCodes = ArraysKt.toSet(iSOCountries);
    }
}
