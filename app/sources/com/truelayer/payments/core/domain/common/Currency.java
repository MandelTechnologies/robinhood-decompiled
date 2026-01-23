package com.truelayer.payments.core.domain.common;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.TrueLayerCore;
import com.truelayer.payments.core.logger.Logger6;
import com.truelayer.payments.core.utils.ErrorUtils2;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: Currency.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0002 !B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0003J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/truelayer/payments/core/domain/common/Currency;", "", "currencyCode", "", "displayLocale", "Ljava/util/Locale;", "(Ljava/lang/String;Ljava/util/Locale;)V", "currency", "Ljava/util/Currency;", "getCurrency", "()Ljava/util/Currency;", "setCurrency", "(Ljava/util/Currency;)V", "getCurrencyCode", "()Ljava/lang/String;", "getDisplayLocale", "()Ljava/util/Locale;", "component1", "component2", "copy", "currencySign", "defaultFractionDigits", "", "displayName", "equals", "", "other", "formatAmount", "amountInMinor", "", "hashCode", "toString", "Companion", "Defaults", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Currency {
    private java.util.Currency currency;
    private final String currencyCode;
    private final Locale displayLocale;

    public static /* synthetic */ Currency copy$default(Currency currency, String str, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currency.currencyCode;
        }
        if ((i & 2) != 0) {
            locale = currency.displayLocale;
        }
        return currency.copy(str, locale);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final Locale getDisplayLocale() {
        return this.displayLocale;
    }

    public final Currency copy(String currencyCode, Locale displayLocale) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(displayLocale, "displayLocale");
        return new Currency(currencyCode, displayLocale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Currency)) {
            return false;
        }
        Currency currency = (Currency) other;
        return Intrinsics.areEqual(this.currencyCode, currency.currencyCode) && Intrinsics.areEqual(this.displayLocale, currency.displayLocale);
    }

    public int hashCode() {
        return (this.currencyCode.hashCode() * 31) + this.displayLocale.hashCode();
    }

    public String toString() {
        return "Currency(currencyCode=" + this.currencyCode + ", displayLocale=" + this.displayLocale + ")";
    }

    public Currency(String currencyCode, Locale displayLocale) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(displayLocale, "displayLocale");
        this.currencyCode = currencyCode;
        this.displayLocale = displayLocale;
        try {
            this.currency = java.util.Currency.getInstance(currencyCode);
        } catch (IllegalArgumentException unused) {
            Logger6.e$default(Logger6.INSTANCE, "Failed to convert code into currency: " + this.currencyCode + ", locale: " + this.displayLocale, null, null, 6, null);
            TrueLayerCore.INSTANCE.getAnalytics$payments_core_release().track(new AnalyticsEvents.BackgroundError(null, "Failed to convert code into currency: " + this.currencyCode + ", locale: " + this.displayLocale, ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, null));
        }
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Currency(String str, Locale locale, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        }
        this(str, locale);
    }

    public final Locale getDisplayLocale() {
        return this.displayLocale;
    }

    /* compiled from: Currency.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/common/Currency$Defaults;", "", "()V", "EUR", "Lcom/truelayer/payments/core/domain/common/Currency;", "getEUR", "()Lcom/truelayer/payments/core/domain/common/Currency;", "GBP", "getGBP", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Defaults {
        private static final Currency EUR;
        private static final Currency GBP;
        public static final Defaults INSTANCE = new Defaults();

        private Defaults() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            int i = 2;
            GBP = new Currency("GBP", null, i, 0 == true ? 1 : 0);
            EUR = new Currency("EUR", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        }

        public final Currency getGBP() {
            return GBP;
        }

        public final Currency getEUR() {
            return EUR;
        }
    }

    public final java.util.Currency getCurrency() {
        return this.currency;
    }

    public final void setCurrency(java.util.Currency currency) {
        this.currency = currency;
    }

    public final String currencySign() {
        java.util.Currency currency = this.currency;
        String symbol = currency != null ? currency.getSymbol() : null;
        return symbol == null ? this.currencyCode : symbol;
    }

    public final int defaultFractionDigits() {
        java.util.Currency currency = this.currency;
        if (currency != null) {
            return currency.getDefaultFractionDigits();
        }
        return 2;
    }

    public final String displayName() {
        java.util.Currency currency = this.currency;
        String displayName = currency != null ? currency.getDisplayName() : null;
        return displayName == null ? this.currencyCode : displayName;
    }

    public final String formatAmount(long amountInMinor) {
        String str;
        double dPow = amountInMinor / Math.pow(10.0d, defaultFractionDigits());
        java.util.Currency currency = this.currency;
        if (currency != null) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(this.displayLocale);
            currencyInstance.setCurrency(currency);
            str = currencyInstance.format(dPow);
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        char c = (char) EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%." + defaultFractionDigits() + "f" + c + "%s", Arrays.copyOf(new Object[]{Double.valueOf(dPow), currencySign()}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }
}
