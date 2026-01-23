package com.robinhood.android.advisory.portfolio.update;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateInvestorProfileEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileEvent;", "", "Done", "ShowResults", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileEvent$Done;", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileEvent$ShowResults;", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface UpdateInvestorProfileEvent {

    /* compiled from: UpdateInvestorProfileEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileEvent$Done;", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileEvent;", "nextScreenTitle", "", "<init>", "(Ljava/lang/String;)V", "getNextScreenTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Done implements UpdateInvestorProfileEvent {
        public static final int $stable = 0;
        private final String nextScreenTitle;

        public static /* synthetic */ Done copy$default(Done done, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = done.nextScreenTitle;
            }
            return done.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getNextScreenTitle() {
            return this.nextScreenTitle;
        }

        public final Done copy(String nextScreenTitle) {
            Intrinsics.checkNotNullParameter(nextScreenTitle, "nextScreenTitle");
            return new Done(nextScreenTitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Done) && Intrinsics.areEqual(this.nextScreenTitle, ((Done) other).nextScreenTitle);
        }

        public int hashCode() {
            return this.nextScreenTitle.hashCode();
        }

        public String toString() {
            return "Done(nextScreenTitle=" + this.nextScreenTitle + ")";
        }

        public Done(String nextScreenTitle) {
            Intrinsics.checkNotNullParameter(nextScreenTitle, "nextScreenTitle");
            this.nextScreenTitle = nextScreenTitle;
        }

        public final String getNextScreenTitle() {
            return this.nextScreenTitle;
        }
    }

    /* compiled from: UpdateInvestorProfileEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileEvent$ShowResults;", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileEvent;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowResults implements UpdateInvestorProfileEvent {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ ShowResults copy$default(ShowResults showResults, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showResults.accountNumber;
            }
            return showResults.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ShowResults copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new ShowResults(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowResults) && Intrinsics.areEqual(this.accountNumber, ((ShowResults) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "ShowResults(accountNumber=" + this.accountNumber + ")";
        }

        public ShowResults(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }
}
