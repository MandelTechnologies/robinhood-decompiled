package com.robinhood.android.dashboard.lib.appbar;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.BrokerageAccountTypes2;
import com.robinhood.android.dashboard.lib.C13691R;
import com.robinhood.android.dashboard.lib.appbar.NavigationIcon;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import com.robinhood.shared.settings.contracts.SettingsPage;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardAppBarDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJf\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\r\u0010\u001b¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/appbar/DashboardAppBarDataState;", "", "activeAccount", "Lcom/robinhood/models/db/Account;", "homeDashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "accountValue", "Lcom/robinhood/models/util/Money;", "shouldShowInboxBadge", "", "inboxBadgeIsCritical", "hasPrivacy", "showMcwCurrencySwitcher", "isInvested", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/android/home/contracts/HomeDashboardType;Lcom/robinhood/models/util/Money;ZZZZLjava/lang/Boolean;)V", "getActiveAccount", "()Lcom/robinhood/models/db/Account;", "getHomeDashboardType", "()Lcom/robinhood/android/home/contracts/HomeDashboardType;", "getAccountValue", "()Lcom/robinhood/models/util/Money;", "getShouldShowInboxBadge", "()Z", "getInboxBadgeIsCritical", "getHasPrivacy", "getShowMcwCurrencySwitcher", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/android/home/contracts/HomeDashboardType;Lcom/robinhood/models/util/Money;ZZZZLjava/lang/Boolean;)Lcom/robinhood/android/dashboard/lib/appbar/DashboardAppBarDataState;", "equals", "other", "hashCode", "", "toString", "", "Companion", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DashboardAppBarDataState {
    private final Money accountValue;
    private final Account activeAccount;
    private final boolean hasPrivacy;
    private final HomeDashboardType homeDashboardType;
    private final boolean inboxBadgeIsCritical;
    private final Boolean isInvested;
    private final boolean shouldShowInboxBadge;
    private final boolean showMcwCurrencySwitcher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DashboardAppBarDataState() {
        this(null, null, null, false, false, false, false, null, 255, null);
    }

    public static /* synthetic */ DashboardAppBarDataState copy$default(DashboardAppBarDataState dashboardAppBarDataState, Account account, HomeDashboardType homeDashboardType, Money money, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            account = dashboardAppBarDataState.activeAccount;
        }
        if ((i & 2) != 0) {
            homeDashboardType = dashboardAppBarDataState.homeDashboardType;
        }
        if ((i & 4) != 0) {
            money = dashboardAppBarDataState.accountValue;
        }
        if ((i & 8) != 0) {
            z = dashboardAppBarDataState.shouldShowInboxBadge;
        }
        if ((i & 16) != 0) {
            z2 = dashboardAppBarDataState.inboxBadgeIsCritical;
        }
        if ((i & 32) != 0) {
            z3 = dashboardAppBarDataState.hasPrivacy;
        }
        if ((i & 64) != 0) {
            z4 = dashboardAppBarDataState.showMcwCurrencySwitcher;
        }
        if ((i & 128) != 0) {
            bool = dashboardAppBarDataState.isInvested;
        }
        boolean z5 = z4;
        Boolean bool2 = bool;
        boolean z6 = z2;
        boolean z7 = z3;
        return dashboardAppBarDataState.copy(account, homeDashboardType, money, z, z6, z7, z5, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getActiveAccount() {
        return this.activeAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final HomeDashboardType getHomeDashboardType() {
        return this.homeDashboardType;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getAccountValue() {
        return this.accountValue;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShouldShowInboxBadge() {
        return this.shouldShowInboxBadge;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getInboxBadgeIsCritical() {
        return this.inboxBadgeIsCritical;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasPrivacy() {
        return this.hasPrivacy;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowMcwCurrencySwitcher() {
        return this.showMcwCurrencySwitcher;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsInvested() {
        return this.isInvested;
    }

    public final DashboardAppBarDataState copy(Account activeAccount, HomeDashboardType homeDashboardType, Money accountValue, boolean shouldShowInboxBadge, boolean inboxBadgeIsCritical, boolean hasPrivacy, boolean showMcwCurrencySwitcher, Boolean isInvested) {
        return new DashboardAppBarDataState(activeAccount, homeDashboardType, accountValue, shouldShowInboxBadge, inboxBadgeIsCritical, hasPrivacy, showMcwCurrencySwitcher, isInvested);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardAppBarDataState)) {
            return false;
        }
        DashboardAppBarDataState dashboardAppBarDataState = (DashboardAppBarDataState) other;
        return Intrinsics.areEqual(this.activeAccount, dashboardAppBarDataState.activeAccount) && Intrinsics.areEqual(this.homeDashboardType, dashboardAppBarDataState.homeDashboardType) && Intrinsics.areEqual(this.accountValue, dashboardAppBarDataState.accountValue) && this.shouldShowInboxBadge == dashboardAppBarDataState.shouldShowInboxBadge && this.inboxBadgeIsCritical == dashboardAppBarDataState.inboxBadgeIsCritical && this.hasPrivacy == dashboardAppBarDataState.hasPrivacy && this.showMcwCurrencySwitcher == dashboardAppBarDataState.showMcwCurrencySwitcher && Intrinsics.areEqual(this.isInvested, dashboardAppBarDataState.isInvested);
    }

    public int hashCode() {
        Account account = this.activeAccount;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        HomeDashboardType homeDashboardType = this.homeDashboardType;
        int iHashCode2 = (iHashCode + (homeDashboardType == null ? 0 : homeDashboardType.hashCode())) * 31;
        Money money = this.accountValue;
        int iHashCode3 = (((((((((iHashCode2 + (money == null ? 0 : money.hashCode())) * 31) + Boolean.hashCode(this.shouldShowInboxBadge)) * 31) + Boolean.hashCode(this.inboxBadgeIsCritical)) * 31) + Boolean.hashCode(this.hasPrivacy)) * 31) + Boolean.hashCode(this.showMcwCurrencySwitcher)) * 31;
        Boolean bool = this.isInvested;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "DashboardAppBarDataState(activeAccount=" + this.activeAccount + ", homeDashboardType=" + this.homeDashboardType + ", accountValue=" + this.accountValue + ", shouldShowInboxBadge=" + this.shouldShowInboxBadge + ", inboxBadgeIsCritical=" + this.inboxBadgeIsCritical + ", hasPrivacy=" + this.hasPrivacy + ", showMcwCurrencySwitcher=" + this.showMcwCurrencySwitcher + ", isInvested=" + this.isInvested + ")";
    }

    public DashboardAppBarDataState(Account account, HomeDashboardType homeDashboardType, Money money, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool) {
        this.activeAccount = account;
        this.homeDashboardType = homeDashboardType;
        this.accountValue = money;
        this.shouldShowInboxBadge = z;
        this.inboxBadgeIsCritical = z2;
        this.hasPrivacy = z3;
        this.showMcwCurrencySwitcher = z4;
        this.isInvested = bool;
    }

    public final Account getActiveAccount() {
        return this.activeAccount;
    }

    public final HomeDashboardType getHomeDashboardType() {
        return this.homeDashboardType;
    }

    public final Money getAccountValue() {
        return this.accountValue;
    }

    public final boolean getShouldShowInboxBadge() {
        return this.shouldShowInboxBadge;
    }

    public final boolean getInboxBadgeIsCritical() {
        return this.inboxBadgeIsCritical;
    }

    public final boolean getHasPrivacy() {
        return this.hasPrivacy;
    }

    public final boolean getShowMcwCurrencySwitcher() {
        return this.showMcwCurrencySwitcher;
    }

    public /* synthetic */ DashboardAppBarDataState(Account account, HomeDashboardType homeDashboardType, Money money, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, (i & 2) != 0 ? null : homeDashboardType, (i & 4) != 0 ? null : money, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? Boolean.FALSE : bool);
    }

    public final Boolean isInvested() {
        return this.isInvested;
    }

    /* compiled from: DashboardAppBarDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/appbar/DashboardAppBarDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/dashboard/lib/appbar/DashboardAppBarDataState;", "Lcom/robinhood/android/dashboard/lib/appbar/DashboardAppBarViewState;", "<init>", "()V", "reduce", "dataState", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<DashboardAppBarDataState, DashboardAppBarViewState> {

        /* compiled from: DashboardAppBarDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BrokerageAccountType.values().length];
                try {
                    iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x0129  */
        @Override // com.robinhood.android.udf.StateProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DashboardAppBarViewState reduce(DashboardAppBarDataState dataState) {
            BrokerageAccountType brokerageAccountType;
            StringResource stringResourceInvoke;
            String str;
            SearchFragmentKey.Source source;
            boolean z;
            SearchFragmentKey.Source source2;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            Account activeAccount = dataState.getActiveAccount();
            NavigationIcon settings = null;
            if (activeAccount == null || (brokerageAccountType = activeAccount.getBrokerageAccountType()) == null) {
                HomeDashboardType homeDashboardType = dataState.getHomeDashboardType();
                HomeDashboardType.PendingApplication pendingApplication = homeDashboardType instanceof HomeDashboardType.PendingApplication ? (HomeDashboardType.PendingApplication) homeDashboardType : null;
                brokerageAccountType = pendingApplication != null ? pendingApplication.getBrokerageAccountType() : null;
            }
            Account activeAccount2 = dataState.getActiveAccount();
            String accountNumber = activeAccount2 != null ? activeAccount2.getAccountNumber() : null;
            if (dataState.getActiveAccount() != null) {
                stringResourceInvoke = AccountDisplayNames.getDisplayName(dataState.getActiveAccount()).getHeadline();
            } else {
                HomeDashboardType homeDashboardType2 = dataState.getHomeDashboardType();
                if ((homeDashboardType2 instanceof HomeDashboardType.Account) || (homeDashboardType2 instanceof HomeDashboardType.Nux) || homeDashboardType2 == null) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C13691R.string.individual_investing_title, new Object[0]);
                } else {
                    if (!(homeDashboardType2 instanceof HomeDashboardType.PendingApplication)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stringResourceInvoke = StringResource.INSTANCE.invoke(BrokerageAccountTypes2.getDisplayNameRes(((HomeDashboardType.PendingApplication) dataState.getHomeDashboardType()).getBrokerageAccountType()), new Object[0]);
                }
            }
            if (dataState.getHasPrivacy()) {
                str = "****";
            } else {
                Money accountValue = dataState.getAccountValue();
                str = accountValue != null ? Money.format$default(accountValue, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null;
            }
            boolean shouldShowInboxBadge = dataState.getShouldShowInboxBadge();
            String str2 = str;
            boolean inboxBadgeIsCritical = dataState.getInboxBadgeIsCritical();
            HomeDashboardType homeDashboardType3 = dataState.getHomeDashboardType();
            switch (brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
                case -1:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    source = SearchFragmentKey.Source.UNIVERSAL;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 6:
                    source = SearchFragmentKey.Source.JOINT_ACCOUNTS;
                    break;
                case 7:
                case 8:
                    source = SearchFragmentKey.Source.RETIREMENT;
                    break;
            }
            HomeDashboardType homeDashboardType4 = dataState.getHomeDashboardType();
            if (!(homeDashboardType4 instanceof HomeDashboardType.Account)) {
                if (!Intrinsics.areEqual(homeDashboardType4, HomeDashboardType.Nux.INSTANCE) && !(homeDashboardType4 instanceof HomeDashboardType.PendingApplication) && homeDashboardType4 != null) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                Account activeAccount3 = dataState.getActiveAccount();
                if ((activeAccount3 != null ? activeAccount3.getManagementType() : null) != ManagementType.SELF_DIRECTED) {
                    SearchFragmentKey.Source source3 = source;
                    z = false;
                    source2 = source3;
                }
                if (accountNumber == null && dataState.getShowMcwCurrencySwitcher() && Intrinsics.areEqual(dataState.isInvested(), Boolean.TRUE)) {
                    settings = new NavigationIcon.CurrencySwitcher(accountNumber);
                } else if (accountNumber != null && brokerageAccountType != null && brokerageAccountType.isRetirement()) {
                    settings = new NavigationIcon.Settings(new SettingsPage("retirement", accountNumber, RetirementLastKnownEntryPointManager.INSTANCE.getLastKnownEntryPoint()));
                }
                return new DashboardAppBarViewState(stringResourceInvoke, str2, shouldShowInboxBadge, inboxBadgeIsCritical, homeDashboardType3, source2, z, settings);
            }
            source2 = source;
            z = true;
            if (accountNumber == null) {
                if (accountNumber != null) {
                    settings = new NavigationIcon.Settings(new SettingsPage("retirement", accountNumber, RetirementLastKnownEntryPointManager.INSTANCE.getLastKnownEntryPoint()));
                }
            }
            return new DashboardAppBarViewState(stringResourceInvoke, str2, shouldShowInboxBadge, inboxBadgeIsCritical, homeDashboardType3, source2, z, settings);
        }
    }
}
