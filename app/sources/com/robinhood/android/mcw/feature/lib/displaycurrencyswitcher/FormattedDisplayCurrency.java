package com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher;

import com.adjust.sdk.Constants;
import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import com.robinhood.rosetta.common.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisplayCurrencySwitcherViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/FormattedDisplayCurrency;", "", "currency", "Lcom/robinhood/rosetta/common/Currency;", "symbol", "", "isSelected", "", "bolded", InstantRetirementSplashScreen.SecondaryButtonTag, Constants.REFERRER_API_META, "<init>", "(Lcom/robinhood/rosetta/common/Currency;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Lcom/robinhood/rosetta/common/Currency;", "getSymbol", "()Ljava/lang/String;", "()Z", "getBolded", "getSecondary", "getMeta", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-display-currency-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class FormattedDisplayCurrency {
    public static final int $stable = 0;
    private final String bolded;
    private final Currency currency;
    private final boolean isSelected;
    private final String meta;
    private final String secondary;
    private final String symbol;

    public static /* synthetic */ FormattedDisplayCurrency copy$default(FormattedDisplayCurrency formattedDisplayCurrency, Currency currency, String str, boolean z, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            currency = formattedDisplayCurrency.currency;
        }
        if ((i & 2) != 0) {
            str = formattedDisplayCurrency.symbol;
        }
        if ((i & 4) != 0) {
            z = formattedDisplayCurrency.isSelected;
        }
        if ((i & 8) != 0) {
            str2 = formattedDisplayCurrency.bolded;
        }
        if ((i & 16) != 0) {
            str3 = formattedDisplayCurrency.secondary;
        }
        if ((i & 32) != 0) {
            str4 = formattedDisplayCurrency.meta;
        }
        String str5 = str3;
        String str6 = str4;
        return formattedDisplayCurrency.copy(currency, str, z, str2, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final Currency getCurrency() {
        return this.currency;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBolded() {
        return this.bolded;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSecondary() {
        return this.secondary;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMeta() {
        return this.meta;
    }

    public final FormattedDisplayCurrency copy(Currency currency, String symbol, boolean isSelected, String bolded, String secondary, String meta) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(bolded, "bolded");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        Intrinsics.checkNotNullParameter(meta, "meta");
        return new FormattedDisplayCurrency(currency, symbol, isSelected, bolded, secondary, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormattedDisplayCurrency)) {
            return false;
        }
        FormattedDisplayCurrency formattedDisplayCurrency = (FormattedDisplayCurrency) other;
        return this.currency == formattedDisplayCurrency.currency && Intrinsics.areEqual(this.symbol, formattedDisplayCurrency.symbol) && this.isSelected == formattedDisplayCurrency.isSelected && Intrinsics.areEqual(this.bolded, formattedDisplayCurrency.bolded) && Intrinsics.areEqual(this.secondary, formattedDisplayCurrency.secondary) && Intrinsics.areEqual(this.meta, formattedDisplayCurrency.meta);
    }

    public int hashCode() {
        return (((((((((this.currency.hashCode() * 31) + this.symbol.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.bolded.hashCode()) * 31) + this.secondary.hashCode()) * 31) + this.meta.hashCode();
    }

    public String toString() {
        return "FormattedDisplayCurrency(currency=" + this.currency + ", symbol=" + this.symbol + ", isSelected=" + this.isSelected + ", bolded=" + this.bolded + ", secondary=" + this.secondary + ", meta=" + this.meta + ")";
    }

    public FormattedDisplayCurrency(Currency currency, String symbol, boolean z, String bolded, String secondary, String meta) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(bolded, "bolded");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.currency = currency;
        this.symbol = symbol;
        this.isSelected = z;
        this.bolded = bolded;
        this.secondary = secondary;
        this.meta = meta;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final String getBolded() {
        return this.bolded;
    }

    public final String getSecondary() {
        return this.secondary;
    }

    public final String getMeta() {
        return this.meta;
    }
}
