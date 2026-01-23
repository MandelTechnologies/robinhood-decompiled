package com.robinhood.android.retirement.p239ui;

import com.robinhood.android.models.retirement.p194db.RetirementAccountSwitcher;
import com.robinhood.store.AsyncResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementDashboardEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementDashboardEvent;", "", "AccountSwitcherRefreshed", "Error", "Companion", "Lcom/robinhood/android/retirement/ui/RetirementDashboardEvent$AccountSwitcherRefreshed;", "Lcom/robinhood/android/retirement/ui/RetirementDashboardEvent$Error;", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RetirementDashboardEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: RetirementDashboardEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementDashboardEvent$AccountSwitcherRefreshed;", "Lcom/robinhood/android/retirement/ui/RetirementDashboardEvent;", "accountSwitcher", "Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;", "<init>", "(Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;)V", "getAccountSwitcher", "()Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountSwitcherRefreshed implements RetirementDashboardEvent {
        public static final int $stable = 8;
        private final RetirementAccountSwitcher accountSwitcher;

        public static /* synthetic */ AccountSwitcherRefreshed copy$default(AccountSwitcherRefreshed accountSwitcherRefreshed, RetirementAccountSwitcher retirementAccountSwitcher, int i, Object obj) {
            if ((i & 1) != 0) {
                retirementAccountSwitcher = accountSwitcherRefreshed.accountSwitcher;
            }
            return accountSwitcherRefreshed.copy(retirementAccountSwitcher);
        }

        /* renamed from: component1, reason: from getter */
        public final RetirementAccountSwitcher getAccountSwitcher() {
            return this.accountSwitcher;
        }

        public final AccountSwitcherRefreshed copy(RetirementAccountSwitcher accountSwitcher) {
            Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
            return new AccountSwitcherRefreshed(accountSwitcher);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccountSwitcherRefreshed) && Intrinsics.areEqual(this.accountSwitcher, ((AccountSwitcherRefreshed) other).accountSwitcher);
        }

        public int hashCode() {
            return this.accountSwitcher.hashCode();
        }

        public String toString() {
            return "AccountSwitcherRefreshed(accountSwitcher=" + this.accountSwitcher + ")";
        }

        public AccountSwitcherRefreshed(RetirementAccountSwitcher accountSwitcher) {
            Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
            this.accountSwitcher = accountSwitcher;
        }

        public final RetirementAccountSwitcher getAccountSwitcher() {
            return this.accountSwitcher;
        }
    }

    /* compiled from: RetirementDashboardEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementDashboardEvent$Error;", "Lcom/robinhood/android/retirement/ui/RetirementDashboardEvent;", "exception", "", "<init>", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements RetirementDashboardEvent {
        public static final int $stable = 8;
        private final Throwable exception;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.exception;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getException() {
            return this.exception;
        }

        public final Error copy(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new Error(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.exception, ((Error) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.exception + ")";
        }

        public Error(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public final Throwable getException() {
            return this.exception;
        }
    }

    /* compiled from: RetirementDashboardEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementDashboardEvent$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/retirement/ui/RetirementDashboardEvent;", "accountSwitcherResult", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final RetirementDashboardEvent from(AsyncResult<RetirementAccountSwitcher> accountSwitcherResult) {
            Intrinsics.checkNotNullParameter(accountSwitcherResult, "accountSwitcherResult");
            if (accountSwitcherResult instanceof AsyncResult.Failure) {
                return new Error(((AsyncResult.Failure) accountSwitcherResult).getException());
            }
            if (accountSwitcherResult instanceof AsyncResult.Loading) {
                return null;
            }
            if (accountSwitcherResult instanceof AsyncResult.Success) {
                return new AccountSwitcherRefreshed((RetirementAccountSwitcher) ((AsyncResult.Success) accountSwitcherResult).getValue());
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
