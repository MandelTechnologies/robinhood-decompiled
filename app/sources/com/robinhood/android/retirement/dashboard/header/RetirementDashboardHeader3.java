package com.robinhood.android.retirement.dashboard.header;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.models.retirement.p194db.MatchRateBreakdown;
import com.robinhood.android.models.retirement.p194db.RetirementAccountSwitcher;
import com.robinhood.android.retirement.dashboard.C26985R;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherUtils4;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementDashboardHeader.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\u0003\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "activeMatchBreakdown", "Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", "getActiveMatchBreakdown", "()Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", "onlyAccountIsRoth", "", "getOnlyAccountIsRoth", "()Z", "Loading", "Loaded", "Companion", "Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState$Loaded;", "Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState$Loading;", "lib-retirement-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeaderViewState, reason: use source file name */
/* loaded from: classes5.dex */
public abstract class RetirementDashboardHeader3 {
    private final MatchRateBreakdown activeMatchBreakdown;
    private final StringResource title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ RetirementDashboardHeader3(StringResource stringResource, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource);
    }

    private RetirementDashboardHeader3(StringResource stringResource) {
        this.title = stringResource;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public MatchRateBreakdown getActiveMatchBreakdown() {
        return this.activeMatchBreakdown;
    }

    /* compiled from: RetirementDashboardHeader.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState$Loading;", "Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-retirement-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeaderViewState$Loading */
    public static final /* data */ class Loading extends RetirementDashboardHeader3 {
        public static final Loading INSTANCE = new Loading();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 2070586392;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(StringResource.INSTANCE.invoke(C26985R.string.retirement_dashboard_title, new Object[0]), null);
        }
    }

    /* compiled from: RetirementDashboardHeader.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState$Loaded;", "Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;", "activeAccount", "Lcom/robinhood/models/db/Account;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "activeMatchBreakdown", "Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;)V", "getActiveAccount", "()Lcom/robinhood/models/db/Account;", "getData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "getActiveMatchBreakdown", "()Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-retirement-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeaderViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends RetirementDashboardHeader3 {
        public static final int $stable = 8;
        private final Account activeAccount;
        private final MatchRateBreakdown activeMatchBreakdown;
        private final AccountSwitcherData data;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, Account account, AccountSwitcherData accountSwitcherData, MatchRateBreakdown matchRateBreakdown, int i, Object obj) {
            if ((i & 1) != 0) {
                account = loaded.activeAccount;
            }
            if ((i & 2) != 0) {
                accountSwitcherData = loaded.data;
            }
            if ((i & 4) != 0) {
                matchRateBreakdown = loaded.activeMatchBreakdown;
            }
            return loaded.copy(account, accountSwitcherData, matchRateBreakdown);
        }

        /* renamed from: component1, reason: from getter */
        public final Account getActiveAccount() {
            return this.activeAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final AccountSwitcherData getData() {
            return this.data;
        }

        /* renamed from: component3, reason: from getter */
        public final MatchRateBreakdown getActiveMatchBreakdown() {
            return this.activeMatchBreakdown;
        }

        public final Loaded copy(Account activeAccount, AccountSwitcherData data, MatchRateBreakdown activeMatchBreakdown) {
            Intrinsics.checkNotNullParameter(activeAccount, "activeAccount");
            Intrinsics.checkNotNullParameter(data, "data");
            return new Loaded(activeAccount, data, activeMatchBreakdown);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.activeAccount, loaded.activeAccount) && Intrinsics.areEqual(this.data, loaded.data) && Intrinsics.areEqual(this.activeMatchBreakdown, loaded.activeMatchBreakdown);
        }

        public int hashCode() {
            int iHashCode = ((this.activeAccount.hashCode() * 31) + this.data.hashCode()) * 31;
            MatchRateBreakdown matchRateBreakdown = this.activeMatchBreakdown;
            return iHashCode + (matchRateBreakdown == null ? 0 : matchRateBreakdown.hashCode());
        }

        public String toString() {
            return "Loaded(activeAccount=" + this.activeAccount + ", data=" + this.data + ", activeMatchBreakdown=" + this.activeMatchBreakdown + ")";
        }

        public final Account getActiveAccount() {
            return this.activeAccount;
        }

        public final AccountSwitcherData getData() {
            return this.data;
        }

        @Override // com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeader3
        public MatchRateBreakdown getActiveMatchBreakdown() {
            return this.activeMatchBreakdown;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(Account activeAccount, AccountSwitcherData data, MatchRateBreakdown matchRateBreakdown) {
            super(AccountDisplayNames.getDisplayName(activeAccount).getHeadline(), null);
            Intrinsics.checkNotNullParameter(activeAccount, "activeAccount");
            Intrinsics.checkNotNullParameter(data, "data");
            this.activeAccount = activeAccount;
            this.data = data;
            this.activeMatchBreakdown = matchRateBreakdown;
        }
    }

    public final boolean getOnlyAccountIsRoth() {
        if (this instanceof Loaded) {
            Loaded loaded = (Loaded) this;
            return loaded.getActiveAccount().getBrokerageAccountType() == BrokerageAccountType.IRA_ROTH && loaded.getData().getRows().size() == 1;
        }
        if (this instanceof Loading) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: RetirementDashboardHeader.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;", "activeAccountNumber", "", "retirementAccounts", "", "Lcom/robinhood/models/db/Account;", "accountSwitcher", "Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;", "activeMatchBreakdown", "Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", "lib-retirement-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeaderViewState$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RetirementDashboardHeader3 from(String activeAccountNumber, List<Account> retirementAccounts, RetirementAccountSwitcher accountSwitcher, MatchRateBreakdown activeMatchBreakdown) {
            Object next;
            AccountSwitcherData accountSwitcherDataFrom$default;
            Intrinsics.checkNotNullParameter(retirementAccounts, "retirementAccounts");
            Iterator<T> it = retirementAccounts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((Account) next).getAccountNumber(), activeAccountNumber)) {
                    break;
                }
            }
            Account account = (Account) next;
            if (account != null) {
                if (accountSwitcher == null || (accountSwitcherDataFrom$default = AccountSwitcherExtensions2.toAccountSwitcherData(accountSwitcher, activeAccountNumber)) == null) {
                    accountSwitcherDataFrom$default = AccountSwitcherData.Companion.from$default(AccountSwitcherData.INSTANCE, account.getAccountNumber(), AccountSwitcherUtils4.filterDeactivatedForSwitcher(retirementAccounts), true, false, null, 24, null);
                }
                return new Loaded(account, accountSwitcherDataFrom$default, activeMatchBreakdown);
            }
            return Loading.INSTANCE;
        }
    }
}
