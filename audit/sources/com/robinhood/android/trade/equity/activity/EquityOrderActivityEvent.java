package com.robinhood.android.trade.equity.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderActivityEvent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityEvent;", "", "AccountNotApproved", "QuoteFetchError", "SubzeroKillswitchEvent", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface EquityOrderActivityEvent {

    /* compiled from: EquityOrderActivityEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityEvent$AccountNotApproved;", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityEvent;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AccountNotApproved implements EquityOrderActivityEvent {
        public static final int $stable = 0;
        public static final AccountNotApproved INSTANCE = new AccountNotApproved();

        private AccountNotApproved() {
        }
    }

    /* compiled from: EquityOrderActivityEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityEvent$QuoteFetchError;", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityEvent;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuoteFetchError implements EquityOrderActivityEvent {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ QuoteFetchError copy$default(QuoteFetchError quoteFetchError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = quoteFetchError.accountNumber;
            }
            return quoteFetchError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final QuoteFetchError copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new QuoteFetchError(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QuoteFetchError) && Intrinsics.areEqual(this.accountNumber, ((QuoteFetchError) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "QuoteFetchError(accountNumber=" + this.accountNumber + ")";
        }

        public QuoteFetchError(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: EquityOrderActivityEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityEvent$SubzeroKillswitchEvent;", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityEvent;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SubzeroKillswitchEvent implements EquityOrderActivityEvent {
        public static final int $stable = 0;
        public static final SubzeroKillswitchEvent INSTANCE = new SubzeroKillswitchEvent();

        private SubzeroKillswitchEvent() {
        }
    }
}
