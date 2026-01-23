package com.robinhood.android.futures.lib.rhd.accountoverview;

import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhdAccountDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", "", "Ineligible", "Eligible", "EligibleOrInReviewInAnotherAccount", "AlreadyHasAccount", "AlreadyHasAccountInAnotherAccount", "InManualReview", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState$AlreadyHasAccount;", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState$AlreadyHasAccountInAnotherAccount;", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState$Eligible;", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState$EligibleOrInReviewInAnotherAccount;", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState$InManualReview;", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState$Ineligible;", "lib-rhd-account-overview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface RhdAccountDataState {

    /* compiled from: RhdAccountDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState$Ineligible;", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-rhd-account-overview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ineligible implements RhdAccountDataState {
        public static final Ineligible INSTANCE = new Ineligible();

        public boolean equals(Object other) {
            return this == other || (other instanceof Ineligible);
        }

        public int hashCode() {
            return 1689962693;
        }

        public String toString() {
            return "Ineligible";
        }

        private Ineligible() {
        }
    }

    /* compiled from: RhdAccountDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState$Eligible;", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-rhd-account-overview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Eligible implements RhdAccountDataState {
        public static final Eligible INSTANCE = new Eligible();

        public boolean equals(Object other) {
            return this == other || (other instanceof Eligible);
        }

        public int hashCode() {
            return -540750112;
        }

        public String toString() {
            return "Eligible";
        }

        private Eligible() {
        }
    }

    /* compiled from: RhdAccountDataState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState$EligibleOrInReviewInAnotherAccount;", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", "futuresAllowedAccount", "Lcom/robinhood/models/db/Account;", "<init>", "(Lcom/robinhood/models/db/Account;)V", "getFuturesAllowedAccount", "()Lcom/robinhood/models/db/Account;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-rhd-account-overview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EligibleOrInReviewInAnotherAccount implements RhdAccountDataState {
        private final Account futuresAllowedAccount;

        public static /* synthetic */ EligibleOrInReviewInAnotherAccount copy$default(EligibleOrInReviewInAnotherAccount eligibleOrInReviewInAnotherAccount, Account account, int i, Object obj) {
            if ((i & 1) != 0) {
                account = eligibleOrInReviewInAnotherAccount.futuresAllowedAccount;
            }
            return eligibleOrInReviewInAnotherAccount.copy(account);
        }

        /* renamed from: component1, reason: from getter */
        public final Account getFuturesAllowedAccount() {
            return this.futuresAllowedAccount;
        }

        public final EligibleOrInReviewInAnotherAccount copy(Account futuresAllowedAccount) {
            Intrinsics.checkNotNullParameter(futuresAllowedAccount, "futuresAllowedAccount");
            return new EligibleOrInReviewInAnotherAccount(futuresAllowedAccount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EligibleOrInReviewInAnotherAccount) && Intrinsics.areEqual(this.futuresAllowedAccount, ((EligibleOrInReviewInAnotherAccount) other).futuresAllowedAccount);
        }

        public int hashCode() {
            return this.futuresAllowedAccount.hashCode();
        }

        public String toString() {
            return "EligibleOrInReviewInAnotherAccount(futuresAllowedAccount=" + this.futuresAllowedAccount + ")";
        }

        public EligibleOrInReviewInAnotherAccount(Account futuresAllowedAccount) {
            Intrinsics.checkNotNullParameter(futuresAllowedAccount, "futuresAllowedAccount");
            this.futuresAllowedAccount = futuresAllowedAccount;
        }

        public final Account getFuturesAllowedAccount() {
            return this.futuresAllowedAccount;
        }
    }

    /* compiled from: RhdAccountDataState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState$AlreadyHasAccount;", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", "activeAccount", "Lcom/robinhood/models/db/Account;", "<init>", "(Lcom/robinhood/models/db/Account;)V", "getActiveAccount", "()Lcom/robinhood/models/db/Account;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-rhd-account-overview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AlreadyHasAccount implements RhdAccountDataState {
        private final Account activeAccount;

        public static /* synthetic */ AlreadyHasAccount copy$default(AlreadyHasAccount alreadyHasAccount, Account account, int i, Object obj) {
            if ((i & 1) != 0) {
                account = alreadyHasAccount.activeAccount;
            }
            return alreadyHasAccount.copy(account);
        }

        /* renamed from: component1, reason: from getter */
        public final Account getActiveAccount() {
            return this.activeAccount;
        }

        public final AlreadyHasAccount copy(Account activeAccount) {
            Intrinsics.checkNotNullParameter(activeAccount, "activeAccount");
            return new AlreadyHasAccount(activeAccount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AlreadyHasAccount) && Intrinsics.areEqual(this.activeAccount, ((AlreadyHasAccount) other).activeAccount);
        }

        public int hashCode() {
            return this.activeAccount.hashCode();
        }

        public String toString() {
            return "AlreadyHasAccount(activeAccount=" + this.activeAccount + ")";
        }

        public AlreadyHasAccount(Account activeAccount) {
            Intrinsics.checkNotNullParameter(activeAccount, "activeAccount");
            this.activeAccount = activeAccount;
        }

        public final Account getActiveAccount() {
            return this.activeAccount;
        }
    }

    /* compiled from: RhdAccountDataState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState$AlreadyHasAccountInAnotherAccount;", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", "futuresAllowedAccount", "Lcom/robinhood/models/db/Account;", "<init>", "(Lcom/robinhood/models/db/Account;)V", "getFuturesAllowedAccount", "()Lcom/robinhood/models/db/Account;", "isFuturesAllowedAccountDeactivated", "", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-rhd-account-overview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AlreadyHasAccountInAnotherAccount implements RhdAccountDataState {
        private final Account futuresAllowedAccount;

        public static /* synthetic */ AlreadyHasAccountInAnotherAccount copy$default(AlreadyHasAccountInAnotherAccount alreadyHasAccountInAnotherAccount, Account account, int i, Object obj) {
            if ((i & 1) != 0) {
                account = alreadyHasAccountInAnotherAccount.futuresAllowedAccount;
            }
            return alreadyHasAccountInAnotherAccount.copy(account);
        }

        /* renamed from: component1, reason: from getter */
        public final Account getFuturesAllowedAccount() {
            return this.futuresAllowedAccount;
        }

        public final AlreadyHasAccountInAnotherAccount copy(Account futuresAllowedAccount) {
            Intrinsics.checkNotNullParameter(futuresAllowedAccount, "futuresAllowedAccount");
            return new AlreadyHasAccountInAnotherAccount(futuresAllowedAccount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AlreadyHasAccountInAnotherAccount) && Intrinsics.areEqual(this.futuresAllowedAccount, ((AlreadyHasAccountInAnotherAccount) other).futuresAllowedAccount);
        }

        public int hashCode() {
            return this.futuresAllowedAccount.hashCode();
        }

        public String toString() {
            return "AlreadyHasAccountInAnotherAccount(futuresAllowedAccount=" + this.futuresAllowedAccount + ")";
        }

        public AlreadyHasAccountInAnotherAccount(Account futuresAllowedAccount) {
            Intrinsics.checkNotNullParameter(futuresAllowedAccount, "futuresAllowedAccount");
            this.futuresAllowedAccount = futuresAllowedAccount;
        }

        public final Account getFuturesAllowedAccount() {
            return this.futuresAllowedAccount;
        }

        public final boolean isFuturesAllowedAccountDeactivated() {
            return this.futuresAllowedAccount.getDeactivated();
        }
    }

    /* compiled from: RhdAccountDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState$InManualReview;", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-rhd-account-overview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InManualReview implements RhdAccountDataState {
        public static final InManualReview INSTANCE = new InManualReview();

        public boolean equals(Object other) {
            return this == other || (other instanceof InManualReview);
        }

        public int hashCode() {
            return -311485748;
        }

        public String toString() {
            return "InManualReview";
        }

        private InManualReview() {
        }
    }
}
