package com.robinhood.android.lib.accountswitcher;

import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction;", "", "Refresh", "AllAccountsSelected", "AccountSelected", "ApplicationSelected", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction$AccountSelected;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction$AllAccountsSelected;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction$ApplicationSelected;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction$Refresh;", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherModalBottomSheetAction, reason: use source file name */
/* loaded from: classes8.dex */
public interface AccountSwitcherBottomSheet5 {

    /* compiled from: AccountSwitcherBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction$Refresh;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherModalBottomSheetAction$Refresh */
    public static final /* data */ class Refresh implements AccountSwitcherBottomSheet5 {
        public static final int $stable = 0;
        public static final Refresh INSTANCE = new Refresh();

        public boolean equals(Object other) {
            return this == other || (other instanceof Refresh);
        }

        public int hashCode() {
            return 959084091;
        }

        public String toString() {
            return "Refresh";
        }

        private Refresh() {
        }
    }

    /* compiled from: AccountSwitcherBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction$AllAccountsSelected;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherModalBottomSheetAction$AllAccountsSelected */
    public static final /* data */ class AllAccountsSelected implements AccountSwitcherBottomSheet5 {
        public static final int $stable = 0;
        public static final AllAccountsSelected INSTANCE = new AllAccountsSelected();

        public boolean equals(Object other) {
            return this == other || (other instanceof AllAccountsSelected);
        }

        public int hashCode() {
            return 1601502146;
        }

        public String toString() {
            return "AllAccountsSelected";
        }

        private AllAccountsSelected() {
        }
    }

    /* compiled from: AccountSwitcherBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction$AccountSelected;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction;", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getAccountNumber", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherModalBottomSheetAction$AccountSelected, reason: from toString */
    public static final /* data */ class AccountSelected implements AccountSwitcherBottomSheet5 {
        public static final int $stable = 0;
        private final String accountNumber;
        private final BrokerageAccountType brokerageAccountType;

        public static /* synthetic */ AccountSelected copy$default(AccountSelected accountSelected, String str, BrokerageAccountType brokerageAccountType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountSelected.accountNumber;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = accountSelected.brokerageAccountType;
            }
            return accountSelected.copy(str, brokerageAccountType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final AccountSelected copy(String accountNumber, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            return new AccountSelected(accountNumber, brokerageAccountType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountSelected)) {
                return false;
            }
            AccountSelected accountSelected = (AccountSelected) other;
            return Intrinsics.areEqual(this.accountNumber, accountSelected.accountNumber) && this.brokerageAccountType == accountSelected.brokerageAccountType;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.brokerageAccountType.hashCode();
        }

        public String toString() {
            return "AccountSelected(accountNumber=" + this.accountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ")";
        }

        public AccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            this.accountNumber = accountNumber;
            this.brokerageAccountType = brokerageAccountType;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }
    }

    /* compiled from: AccountSwitcherBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction$ApplicationSelected;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction;", "applicationId", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getApplicationId", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherModalBottomSheetAction$ApplicationSelected, reason: from toString */
    public static final /* data */ class ApplicationSelected implements AccountSwitcherBottomSheet5 {
        public static final int $stable = 0;
        private final String applicationId;
        private final BrokerageAccountType brokerageAccountType;

        public static /* synthetic */ ApplicationSelected copy$default(ApplicationSelected applicationSelected, String str, BrokerageAccountType brokerageAccountType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = applicationSelected.applicationId;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = applicationSelected.brokerageAccountType;
            }
            return applicationSelected.copy(str, brokerageAccountType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final ApplicationSelected copy(String applicationId, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            return new ApplicationSelected(applicationId, brokerageAccountType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApplicationSelected)) {
                return false;
            }
            ApplicationSelected applicationSelected = (ApplicationSelected) other;
            return Intrinsics.areEqual(this.applicationId, applicationSelected.applicationId) && this.brokerageAccountType == applicationSelected.brokerageAccountType;
        }

        public int hashCode() {
            return (this.applicationId.hashCode() * 31) + this.brokerageAccountType.hashCode();
        }

        public String toString() {
            return "ApplicationSelected(applicationId=" + this.applicationId + ", brokerageAccountType=" + this.brokerageAccountType + ")";
        }

        public ApplicationSelected(String applicationId, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            this.applicationId = applicationId;
            this.brokerageAccountType = brokerageAccountType;
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }
    }
}
