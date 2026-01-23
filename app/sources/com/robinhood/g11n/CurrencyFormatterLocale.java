package com.robinhood.g11n;

import com.robinhood.iso.countrycode.CountryCode;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyFormatterLocale.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \f2\u00020\u0001:\u0004\f\r\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/g11n/CurrencyFormatterLocale;", "", "cryptoLocale", "Ljava/util/Locale;", "getCryptoLocale", "()Ljava/util/Locale;", "dateTimeFormatterLocale", "getDateTimeFormatterLocale", "numpadLocale", "getNumpadLocale", "numberFormatterLocale", "getNumberFormatterLocale", "Companion", "SystemDefault", "UK", CountryCode.COUNTRY_CODE_US, "Lcom/robinhood/g11n/CurrencyFormatterLocale$SystemDefault;", "Lcom/robinhood/g11n/CurrencyFormatterLocale$UK;", "Lcom/robinhood/g11n/CurrencyFormatterLocale$US;", "lib-g11n_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface CurrencyFormatterLocale {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Locale getCryptoLocale();

    Locale getDateTimeFormatterLocale();

    Locale getNumberFormatterLocale();

    Locale getNumpadLocale();

    /* compiled from: CurrencyFormatterLocale.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/g11n/CurrencyFormatterLocale$Companion;", "", "<init>", "()V", "defaultFormatter", "Lcom/robinhood/g11n/CurrencyFormatterLocale;", "getInstance", "initialize", "", "formatter", "lib-g11n_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static CurrencyFormatterLocale defaultFormatter = C33329US.INSTANCE;

        private Companion() {
        }

        public final CurrencyFormatterLocale getInstance() {
            return defaultFormatter;
        }

        public final void initialize(CurrencyFormatterLocale formatter) {
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            defaultFormatter = formatter;
        }
    }

    /* compiled from: CurrencyFormatterLocale.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/g11n/CurrencyFormatterLocale$SystemDefault;", "Lcom/robinhood/g11n/CurrencyFormatterLocale;", "<init>", "()V", "cryptoLocale", "Ljava/util/Locale;", "getCryptoLocale", "()Ljava/util/Locale;", "numberFormatterLocale", "getNumberFormatterLocale", "numpadLocale", "getNumpadLocale", "dateTimeFormatterLocale", "getDateTimeFormatterLocale", "adjustedLocale", "getAdjustedLocale", "sanitizedLocale", "getSanitizedLocale", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-g11n_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class SystemDefault implements CurrencyFormatterLocale {
        public static final SystemDefault INSTANCE = new SystemDefault();

        public boolean equals(Object other) {
            return this == other || (other instanceof SystemDefault);
        }

        public int hashCode() {
            return -462777115;
        }

        public String toString() {
            return "SystemDefault";
        }

        private SystemDefault() {
        }

        @Override // com.robinhood.g11n.CurrencyFormatterLocale
        public Locale getCryptoLocale() {
            return getSanitizedLocale();
        }

        @Override // com.robinhood.g11n.CurrencyFormatterLocale
        public Locale getNumberFormatterLocale() {
            return getSanitizedLocale();
        }

        @Override // com.robinhood.g11n.CurrencyFormatterLocale
        public Locale getNumpadLocale() {
            return getSanitizedLocale();
        }

        @Override // com.robinhood.g11n.CurrencyFormatterLocale
        public Locale getDateTimeFormatterLocale() {
            return getSanitizedLocale();
        }

        private final Locale getAdjustedLocale() {
            Locale locale = Locale.getDefault(Locale.Category.FORMAT);
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            return locale;
        }

        private final Locale getSanitizedLocale() {
            return SupportedLocales.sanitized(getAdjustedLocale());
        }
    }

    /* compiled from: CurrencyFormatterLocale.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/g11n/CurrencyFormatterLocale$UK;", "Lcom/robinhood/g11n/CurrencyFormatterLocale;", "<init>", "()V", "cryptoLocale", "Ljava/util/Locale;", "getCryptoLocale", "()Ljava/util/Locale;", "numberFormatterLocale", "getNumberFormatterLocale", "numpadLocale", "getNumpadLocale", "dateTimeFormatterLocale", "getDateTimeFormatterLocale", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-g11n_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.g11n.CurrencyFormatterLocale$UK */
    /* loaded from: classes15.dex */
    public static final /* data */ class C33328UK implements CurrencyFormatterLocale {
        public static final C33328UK INSTANCE = new C33328UK();
        private static final Locale cryptoLocale;
        private static final Locale dateTimeFormatterLocale;
        private static final Locale numberFormatterLocale;
        private static final Locale numpadLocale;

        public boolean equals(Object other) {
            return this == other || (other instanceof C33328UK);
        }

        public int hashCode() {
            return -605841277;
        }

        public String toString() {
            return "UK";
        }

        private C33328UK() {
        }

        static {
            Locale UK = Locale.UK;
            Intrinsics.checkNotNullExpressionValue(UK, "UK");
            cryptoLocale = UK;
            Intrinsics.checkNotNullExpressionValue(UK, "UK");
            numberFormatterLocale = UK;
            Intrinsics.checkNotNullExpressionValue(UK, "UK");
            numpadLocale = UK;
            Intrinsics.checkNotNullExpressionValue(UK, "UK");
            dateTimeFormatterLocale = UK;
        }

        @Override // com.robinhood.g11n.CurrencyFormatterLocale
        public Locale getCryptoLocale() {
            return cryptoLocale;
        }

        @Override // com.robinhood.g11n.CurrencyFormatterLocale
        public Locale getNumberFormatterLocale() {
            return numberFormatterLocale;
        }

        @Override // com.robinhood.g11n.CurrencyFormatterLocale
        public Locale getNumpadLocale() {
            return numpadLocale;
        }

        @Override // com.robinhood.g11n.CurrencyFormatterLocale
        public Locale getDateTimeFormatterLocale() {
            return dateTimeFormatterLocale;
        }
    }

    /* compiled from: CurrencyFormatterLocale.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/g11n/CurrencyFormatterLocale$US;", "Lcom/robinhood/g11n/CurrencyFormatterLocale;", "<init>", "()V", "cryptoLocale", "Ljava/util/Locale;", "getCryptoLocale", "()Ljava/util/Locale;", "numberFormatterLocale", "getNumberFormatterLocale", "numpadLocale", "getNumpadLocale", "dateTimeFormatterLocale", "getDateTimeFormatterLocale", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-g11n_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.g11n.CurrencyFormatterLocale$US */
    public static final /* data */ class C33329US implements CurrencyFormatterLocale {
        public static final C33329US INSTANCE = new C33329US();
        private static final Locale cryptoLocale;
        private static final Locale dateTimeFormatterLocale;
        private static final Locale numberFormatterLocale;
        private static final Locale numpadLocale;

        public boolean equals(Object other) {
            return this == other || (other instanceof C33329US);
        }

        public int hashCode() {
            return -605841269;
        }

        public String toString() {
            return CountryCode.COUNTRY_CODE_US;
        }

        private C33329US() {
        }

        static {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            cryptoLocale = US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            numberFormatterLocale = US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            numpadLocale = US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            dateTimeFormatterLocale = US;
        }

        @Override // com.robinhood.g11n.CurrencyFormatterLocale
        public Locale getCryptoLocale() {
            return cryptoLocale;
        }

        @Override // com.robinhood.g11n.CurrencyFormatterLocale
        public Locale getNumberFormatterLocale() {
            return numberFormatterLocale;
        }

        @Override // com.robinhood.g11n.CurrencyFormatterLocale
        public Locale getNumpadLocale() {
            return numpadLocale;
        }

        @Override // com.robinhood.g11n.CurrencyFormatterLocale
        public Locale getDateTimeFormatterLocale() {
            return dateTimeFormatterLocale;
        }
    }
}
