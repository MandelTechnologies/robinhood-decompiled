package com.robinhood.android.dashboard.lib.buyingpower;

import com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerViewState;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencyExtensions;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.MarginHealth;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioBuyingPowerDataState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010'\u001a\u00020\tHÂ\u0003J\t\u0010(\u001a\u00020\tHÂ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jh\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDataState;", "", "account", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "marginHubTooltip", "", "navigationDestination", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestination;", "displayDepositBoostMessage", "", "noFuturesHoldings", "privacyEnabled", "selectedDisplayCurrency", "Lcom/robinhood/rosetta/common/Currency;", "displayCurrencyFxRate", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Ljava/lang/String;Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestination;Ljava/lang/Boolean;ZZLcom/robinhood/rosetta/common/Currency;Ljava/math/BigDecimal;)V", "getAccount", "()Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getMarginHubTooltip", "()Ljava/lang/String;", "getNavigationDestination", "()Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestination;", "getDisplayDepositBoostMessage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSelectedDisplayCurrency", "()Lcom/robinhood/rosetta/common/Currency;", "getDisplayCurrencyFxRate", "()Ljava/math/BigDecimal;", "marginHealthState", "Lcom/robinhood/models/db/MarginHealth$MarginHealthState;", "getMarginHealthState", "()Lcom/robinhood/models/db/MarginHealth$MarginHealthState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Ljava/lang/String;Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestination;Ljava/lang/Boolean;ZZLcom/robinhood/rosetta/common/Currency;Ljava/math/BigDecimal;)Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDataState;", "equals", "other", "hashCode", "", "toString", "Companion", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PortfolioBuyingPowerDataState {
    private final UnifiedAccountV2 account;
    private final BigDecimal displayCurrencyFxRate;
    private final Boolean displayDepositBoostMessage;
    private final String marginHubTooltip;
    private final PortfolioBuyingPowerNavigationDestinationProvider2 navigationDestination;
    private final boolean noFuturesHoldings;
    private final boolean privacyEnabled;
    private final Currency selectedDisplayCurrency;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: component5, reason: from getter */
    private final boolean getNoFuturesHoldings() {
        return this.noFuturesHoldings;
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getPrivacyEnabled() {
        return this.privacyEnabled;
    }

    public static /* synthetic */ PortfolioBuyingPowerDataState copy$default(PortfolioBuyingPowerDataState portfolioBuyingPowerDataState, UnifiedAccountV2 unifiedAccountV2, String str, PortfolioBuyingPowerNavigationDestinationProvider2 portfolioBuyingPowerNavigationDestinationProvider2, Boolean bool, boolean z, boolean z2, Currency currency, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            unifiedAccountV2 = portfolioBuyingPowerDataState.account;
        }
        if ((i & 2) != 0) {
            str = portfolioBuyingPowerDataState.marginHubTooltip;
        }
        if ((i & 4) != 0) {
            portfolioBuyingPowerNavigationDestinationProvider2 = portfolioBuyingPowerDataState.navigationDestination;
        }
        if ((i & 8) != 0) {
            bool = portfolioBuyingPowerDataState.displayDepositBoostMessage;
        }
        if ((i & 16) != 0) {
            z = portfolioBuyingPowerDataState.noFuturesHoldings;
        }
        if ((i & 32) != 0) {
            z2 = portfolioBuyingPowerDataState.privacyEnabled;
        }
        if ((i & 64) != 0) {
            currency = portfolioBuyingPowerDataState.selectedDisplayCurrency;
        }
        if ((i & 128) != 0) {
            bigDecimal = portfolioBuyingPowerDataState.displayCurrencyFxRate;
        }
        Currency currency2 = currency;
        BigDecimal bigDecimal2 = bigDecimal;
        boolean z3 = z;
        boolean z4 = z2;
        return portfolioBuyingPowerDataState.copy(unifiedAccountV2, str, portfolioBuyingPowerNavigationDestinationProvider2, bool, z3, z4, currency2, bigDecimal2);
    }

    /* renamed from: component1, reason: from getter */
    public final UnifiedAccountV2 getAccount() {
        return this.account;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMarginHubTooltip() {
        return this.marginHubTooltip;
    }

    /* renamed from: component3, reason: from getter */
    public final PortfolioBuyingPowerNavigationDestinationProvider2 getNavigationDestination() {
        return this.navigationDestination;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getDisplayDepositBoostMessage() {
        return this.displayDepositBoostMessage;
    }

    /* renamed from: component7, reason: from getter */
    public final Currency getSelectedDisplayCurrency() {
        return this.selectedDisplayCurrency;
    }

    /* renamed from: component8, reason: from getter */
    public final BigDecimal getDisplayCurrencyFxRate() {
        return this.displayCurrencyFxRate;
    }

    public final PortfolioBuyingPowerDataState copy(UnifiedAccountV2 account, String marginHubTooltip, PortfolioBuyingPowerNavigationDestinationProvider2 navigationDestination, Boolean displayDepositBoostMessage, boolean noFuturesHoldings, boolean privacyEnabled, Currency selectedDisplayCurrency, BigDecimal displayCurrencyFxRate) {
        Intrinsics.checkNotNullParameter(selectedDisplayCurrency, "selectedDisplayCurrency");
        return new PortfolioBuyingPowerDataState(account, marginHubTooltip, navigationDestination, displayDepositBoostMessage, noFuturesHoldings, privacyEnabled, selectedDisplayCurrency, displayCurrencyFxRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioBuyingPowerDataState)) {
            return false;
        }
        PortfolioBuyingPowerDataState portfolioBuyingPowerDataState = (PortfolioBuyingPowerDataState) other;
        return Intrinsics.areEqual(this.account, portfolioBuyingPowerDataState.account) && Intrinsics.areEqual(this.marginHubTooltip, portfolioBuyingPowerDataState.marginHubTooltip) && this.navigationDestination == portfolioBuyingPowerDataState.navigationDestination && Intrinsics.areEqual(this.displayDepositBoostMessage, portfolioBuyingPowerDataState.displayDepositBoostMessage) && this.noFuturesHoldings == portfolioBuyingPowerDataState.noFuturesHoldings && this.privacyEnabled == portfolioBuyingPowerDataState.privacyEnabled && this.selectedDisplayCurrency == portfolioBuyingPowerDataState.selectedDisplayCurrency && Intrinsics.areEqual(this.displayCurrencyFxRate, portfolioBuyingPowerDataState.displayCurrencyFxRate);
    }

    public int hashCode() {
        UnifiedAccountV2 unifiedAccountV2 = this.account;
        int iHashCode = (unifiedAccountV2 == null ? 0 : unifiedAccountV2.hashCode()) * 31;
        String str = this.marginHubTooltip;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PortfolioBuyingPowerNavigationDestinationProvider2 portfolioBuyingPowerNavigationDestinationProvider2 = this.navigationDestination;
        int iHashCode3 = (iHashCode2 + (portfolioBuyingPowerNavigationDestinationProvider2 == null ? 0 : portfolioBuyingPowerNavigationDestinationProvider2.hashCode())) * 31;
        Boolean bool = this.displayDepositBoostMessage;
        int iHashCode4 = (((((((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.noFuturesHoldings)) * 31) + Boolean.hashCode(this.privacyEnabled)) * 31) + this.selectedDisplayCurrency.hashCode()) * 31;
        BigDecimal bigDecimal = this.displayCurrencyFxRate;
        return iHashCode4 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    public String toString() {
        return "PortfolioBuyingPowerDataState(account=" + this.account + ", marginHubTooltip=" + this.marginHubTooltip + ", navigationDestination=" + this.navigationDestination + ", displayDepositBoostMessage=" + this.displayDepositBoostMessage + ", noFuturesHoldings=" + this.noFuturesHoldings + ", privacyEnabled=" + this.privacyEnabled + ", selectedDisplayCurrency=" + this.selectedDisplayCurrency + ", displayCurrencyFxRate=" + this.displayCurrencyFxRate + ")";
    }

    public PortfolioBuyingPowerDataState(UnifiedAccountV2 unifiedAccountV2, String str, PortfolioBuyingPowerNavigationDestinationProvider2 portfolioBuyingPowerNavigationDestinationProvider2, Boolean bool, boolean z, boolean z2, Currency selectedDisplayCurrency, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(selectedDisplayCurrency, "selectedDisplayCurrency");
        this.account = unifiedAccountV2;
        this.marginHubTooltip = str;
        this.navigationDestination = portfolioBuyingPowerNavigationDestinationProvider2;
        this.displayDepositBoostMessage = bool;
        this.noFuturesHoldings = z;
        this.privacyEnabled = z2;
        this.selectedDisplayCurrency = selectedDisplayCurrency;
        this.displayCurrencyFxRate = bigDecimal;
    }

    public /* synthetic */ PortfolioBuyingPowerDataState(UnifiedAccountV2 unifiedAccountV2, String str, PortfolioBuyingPowerNavigationDestinationProvider2 portfolioBuyingPowerNavigationDestinationProvider2, Boolean bool, boolean z, boolean z2, Currency currency, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : unifiedAccountV2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : portfolioBuyingPowerNavigationDestinationProvider2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, currency, (i & 128) != 0 ? null : bigDecimal);
    }

    public final UnifiedAccountV2 getAccount() {
        return this.account;
    }

    public final String getMarginHubTooltip() {
        return this.marginHubTooltip;
    }

    public final PortfolioBuyingPowerNavigationDestinationProvider2 getNavigationDestination() {
        return this.navigationDestination;
    }

    public final Boolean getDisplayDepositBoostMessage() {
        return this.displayDepositBoostMessage;
    }

    public final Currency getSelectedDisplayCurrency() {
        return this.selectedDisplayCurrency;
    }

    public final BigDecimal getDisplayCurrencyFxRate() {
        return this.displayCurrencyFxRate;
    }

    public final MarginHealth.MarginHealthState getMarginHealthState() {
        UnifiedAccountV2 unifiedAccountV2;
        MarginHealth marginHealth;
        if (!this.noFuturesHoldings || (unifiedAccountV2 = this.account) == null || (marginHealth = unifiedAccountV2.getMarginHealth()) == null) {
            return null;
        }
        return marginHealth.getMarginHealthState();
    }

    /* compiled from: PortfolioBuyingPowerDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDataState;", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerViewState;", "<init>", "()V", "reduce", "dataState", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<PortfolioBuyingPowerDataState, PortfolioBuyingPowerViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public PortfolioBuyingPowerViewState reduce(PortfolioBuyingPowerDataState dataState) {
            Money accountBuyingPower;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getAccount() != null && dataState.getNavigationDestination() != null && dataState.getDisplayDepositBoostMessage() != null) {
                if (dataState.getSelectedDisplayCurrency() != Currency.USD && dataState.getDisplayCurrencyFxRate() == null) {
                    return PortfolioBuyingPowerViewState.Loading.INSTANCE;
                }
                if (!Intrinsics.areEqual(dataState.getAccount().getAccountBuyingPower().getCurrency(), Currencies.USD)) {
                    throw new IllegalStateException("Account buying power not returned in USD!");
                }
                if (dataState.getDisplayCurrencyFxRate() != null) {
                    BigDecimal bigDecimalMultiply = dataState.getAccount().getAccountBuyingPower().getDecimalValue().multiply(dataState.getDisplayCurrencyFxRate());
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                    accountBuyingPower = Money3.toMoney(bigDecimalMultiply, DisplayCurrencyExtensions.toJavaCurrency(dataState.getSelectedDisplayCurrency()));
                } else {
                    accountBuyingPower = dataState.getAccount().getAccountBuyingPower();
                }
                Money money = accountBuyingPower;
                MarginHealth.MarginHealthState marginHealthState = dataState.getMarginHealthState();
                String marginHubTooltip = dataState.getMarginHubTooltip();
                String accountNumber = dataState.getAccount().getAccountNumber();
                PortfolioBuyingPowerNavigationDestinationProvider2 navigationDestination = dataState.getNavigationDestination();
                Boolean displayDepositBoostMessage = dataState.getDisplayDepositBoostMessage();
                return new PortfolioBuyingPowerViewState.Loaded(accountNumber, money, marginHealthState, marginHubTooltip, navigationDestination, displayDepositBoostMessage.booleanValue(), dataState.privacyEnabled);
            }
            return PortfolioBuyingPowerViewState.Loading.INSTANCE;
        }
    }
}
