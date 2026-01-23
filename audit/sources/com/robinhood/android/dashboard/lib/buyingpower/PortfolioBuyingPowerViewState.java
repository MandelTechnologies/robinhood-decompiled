package com.robinhood.android.dashboard.lib.buyingpower;

import com.robinhood.android.dashboard.lib.C13691R;
import com.robinhood.models.p320db.MarginHealth;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioBuyingPowerViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerViewState$Loaded;", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerViewState$Loading;", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface PortfolioBuyingPowerViewState {

    /* compiled from: PortfolioBuyingPowerViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerViewState$Loading;", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements PortfolioBuyingPowerViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1226863229;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: PortfolioBuyingPowerViewState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003JS\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010*\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u001fHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerViewState$Loaded;", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerViewState;", "accountNumber", "", "buyingPower", "Lcom/robinhood/models/util/Money;", "marginHealthState", "Lcom/robinhood/models/db/MarginHealth$MarginHealthState;", "marginHubTooltip", "navigationDestination", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestination;", "displayDepositBoostMessage", "", "privacyEnabled", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/db/MarginHealth$MarginHealthState;Ljava/lang/String;Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestination;ZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getBuyingPower", "()Lcom/robinhood/models/util/Money;", "getMarginHealthState", "()Lcom/robinhood/models/db/MarginHealth$MarginHealthState;", "getMarginHubTooltip", "getNavigationDestination", "()Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestination;", "getDisplayDepositBoostMessage", "()Z", "getPrivacyEnabled", "hasAccountDeficit", "getHasAccountDeficit", "buyingPowerSubtitleId", "", "getBuyingPowerSubtitleId", "()Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements PortfolioBuyingPowerViewState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final Money buyingPower;
        private final boolean displayDepositBoostMessage;
        private final MarginHealth.MarginHealthState marginHealthState;
        private final String marginHubTooltip;
        private final PortfolioBuyingPowerNavigationDestinationProvider2 navigationDestination;
        private final boolean privacyEnabled;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, Money money, MarginHealth.MarginHealthState marginHealthState, String str2, PortfolioBuyingPowerNavigationDestinationProvider2 portfolioBuyingPowerNavigationDestinationProvider2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.accountNumber;
            }
            if ((i & 2) != 0) {
                money = loaded.buyingPower;
            }
            if ((i & 4) != 0) {
                marginHealthState = loaded.marginHealthState;
            }
            if ((i & 8) != 0) {
                str2 = loaded.marginHubTooltip;
            }
            if ((i & 16) != 0) {
                portfolioBuyingPowerNavigationDestinationProvider2 = loaded.navigationDestination;
            }
            if ((i & 32) != 0) {
                z = loaded.displayDepositBoostMessage;
            }
            if ((i & 64) != 0) {
                z2 = loaded.privacyEnabled;
            }
            boolean z3 = z;
            boolean z4 = z2;
            PortfolioBuyingPowerNavigationDestinationProvider2 portfolioBuyingPowerNavigationDestinationProvider22 = portfolioBuyingPowerNavigationDestinationProvider2;
            MarginHealth.MarginHealthState marginHealthState2 = marginHealthState;
            return loaded.copy(str, money, marginHealthState2, str2, portfolioBuyingPowerNavigationDestinationProvider22, z3, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getBuyingPower() {
            return this.buyingPower;
        }

        /* renamed from: component3, reason: from getter */
        public final MarginHealth.MarginHealthState getMarginHealthState() {
            return this.marginHealthState;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMarginHubTooltip() {
            return this.marginHubTooltip;
        }

        /* renamed from: component5, reason: from getter */
        public final PortfolioBuyingPowerNavigationDestinationProvider2 getNavigationDestination() {
            return this.navigationDestination;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getDisplayDepositBoostMessage() {
            return this.displayDepositBoostMessage;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getPrivacyEnabled() {
            return this.privacyEnabled;
        }

        public final Loaded copy(String accountNumber, Money buyingPower, MarginHealth.MarginHealthState marginHealthState, String marginHubTooltip, PortfolioBuyingPowerNavigationDestinationProvider2 navigationDestination, boolean displayDepositBoostMessage, boolean privacyEnabled) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(buyingPower, "buyingPower");
            Intrinsics.checkNotNullParameter(navigationDestination, "navigationDestination");
            return new Loaded(accountNumber, buyingPower, marginHealthState, marginHubTooltip, navigationDestination, displayDepositBoostMessage, privacyEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.accountNumber, loaded.accountNumber) && Intrinsics.areEqual(this.buyingPower, loaded.buyingPower) && this.marginHealthState == loaded.marginHealthState && Intrinsics.areEqual(this.marginHubTooltip, loaded.marginHubTooltip) && this.navigationDestination == loaded.navigationDestination && this.displayDepositBoostMessage == loaded.displayDepositBoostMessage && this.privacyEnabled == loaded.privacyEnabled;
        }

        public int hashCode() {
            int iHashCode = ((this.accountNumber.hashCode() * 31) + this.buyingPower.hashCode()) * 31;
            MarginHealth.MarginHealthState marginHealthState = this.marginHealthState;
            int iHashCode2 = (iHashCode + (marginHealthState == null ? 0 : marginHealthState.hashCode())) * 31;
            String str = this.marginHubTooltip;
            return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.navigationDestination.hashCode()) * 31) + Boolean.hashCode(this.displayDepositBoostMessage)) * 31) + Boolean.hashCode(this.privacyEnabled);
        }

        public String toString() {
            return "Loaded(accountNumber=" + this.accountNumber + ", buyingPower=" + this.buyingPower + ", marginHealthState=" + this.marginHealthState + ", marginHubTooltip=" + this.marginHubTooltip + ", navigationDestination=" + this.navigationDestination + ", displayDepositBoostMessage=" + this.displayDepositBoostMessage + ", privacyEnabled=" + this.privacyEnabled + ")";
        }

        public Loaded(String accountNumber, Money buyingPower, MarginHealth.MarginHealthState marginHealthState, String str, PortfolioBuyingPowerNavigationDestinationProvider2 navigationDestination, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(buyingPower, "buyingPower");
            Intrinsics.checkNotNullParameter(navigationDestination, "navigationDestination");
            this.accountNumber = accountNumber;
            this.buyingPower = buyingPower;
            this.marginHealthState = marginHealthState;
            this.marginHubTooltip = str;
            this.navigationDestination = navigationDestination;
            this.displayDepositBoostMessage = z;
            this.privacyEnabled = z2;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Money getBuyingPower() {
            return this.buyingPower;
        }

        public final MarginHealth.MarginHealthState getMarginHealthState() {
            return this.marginHealthState;
        }

        public final String getMarginHubTooltip() {
            return this.marginHubTooltip;
        }

        public final PortfolioBuyingPowerNavigationDestinationProvider2 getNavigationDestination() {
            return this.navigationDestination;
        }

        public final boolean getDisplayDepositBoostMessage() {
            return this.displayDepositBoostMessage;
        }

        public final boolean getPrivacyEnabled() {
            return this.privacyEnabled;
        }

        public final boolean getHasAccountDeficit() {
            return this.buyingPower.isNegative();
        }

        public final Integer getBuyingPowerSubtitleId() {
            if (getHasAccountDeficit() || !this.displayDepositBoostMessage) {
                return null;
            }
            return Integer.valueOf(C13691R.string.portfolio_buying_power_deposit_boost_message);
        }
    }
}
