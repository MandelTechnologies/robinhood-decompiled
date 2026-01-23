package com.robinhood.android.retirement.contributions;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContributionSink.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/contributions/ContributionSink;", "", "Account", "PendingAccount", "Lcom/robinhood/android/retirement/contributions/ContributionSink$Account;", "Lcom/robinhood/android/retirement/contributions/ContributionSink$PendingAccount;", "lib-retirement-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface ContributionSink {

    /* compiled from: ContributionSink.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/contributions/ContributionSink$Account;", "Lcom/robinhood/android/retirement/contributions/ContributionSink;", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-retirement-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Account implements ContributionSink {
        public static final int $stable = 8;
        private final TransferAccount account;

        public static /* synthetic */ Account copy$default(Account account, TransferAccount transferAccount, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccount = account.account;
            }
            return account.copy(transferAccount);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccount getAccount() {
            return this.account;
        }

        public final Account copy(TransferAccount account) {
            Intrinsics.checkNotNullParameter(account, "account");
            return new Account(account);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Account) && Intrinsics.areEqual(this.account, ((Account) other).account);
        }

        public int hashCode() {
            return this.account.hashCode();
        }

        public String toString() {
            return "Account(account=" + this.account + ")";
        }

        public Account(TransferAccount account) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
        }

        public final TransferAccount getAccount() {
            return this.account;
        }
    }

    /* compiled from: ContributionSink.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/retirement/contributions/ContributionSink$PendingAccount;", "Lcom/robinhood/android/retirement/contributions/ContributionSink;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "managementType", "Lcom/robinhood/models/api/ManagementType;", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getManagementType", "()Lcom/robinhood/models/api/ManagementType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-retirement-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PendingAccount implements ContributionSink {
        public static final int $stable = 0;
        private final BrokerageAccountType accountType;
        private final ManagementType managementType;

        public static /* synthetic */ PendingAccount copy$default(PendingAccount pendingAccount, BrokerageAccountType brokerageAccountType, ManagementType managementType, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountType = pendingAccount.accountType;
            }
            if ((i & 2) != 0) {
                managementType = pendingAccount.managementType;
            }
            return pendingAccount.copy(brokerageAccountType, managementType);
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        /* renamed from: component2, reason: from getter */
        public final ManagementType getManagementType() {
            return this.managementType;
        }

        public final PendingAccount copy(BrokerageAccountType accountType, ManagementType managementType) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(managementType, "managementType");
            return new PendingAccount(accountType, managementType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingAccount)) {
                return false;
            }
            PendingAccount pendingAccount = (PendingAccount) other;
            return this.accountType == pendingAccount.accountType && this.managementType == pendingAccount.managementType;
        }

        public int hashCode() {
            return (this.accountType.hashCode() * 31) + this.managementType.hashCode();
        }

        public String toString() {
            return "PendingAccount(accountType=" + this.accountType + ", managementType=" + this.managementType + ")";
        }

        public PendingAccount(BrokerageAccountType accountType, ManagementType managementType) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(managementType, "managementType");
            this.accountType = accountType;
            this.managementType = managementType;
        }

        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        public final ManagementType getManagementType() {
            return this.managementType;
        }
    }
}
