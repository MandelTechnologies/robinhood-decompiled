package com.robinhood.android.acatsin.accountnumber;

import com.robinhood.models.acats.p299db.p300ui.UiAcatsValidationResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAccountNumberEvent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberEvent;", "", "NetworkErrorEvent", "AccountNumberToValidationResponseEvent", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AcatsInAccountNumberEvent {

    /* compiled from: AcatsInAccountNumberEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberEvent$NetworkErrorEvent;", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NetworkErrorEvent implements AcatsInAccountNumberEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ NetworkErrorEvent copy$default(NetworkErrorEvent networkErrorEvent, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = networkErrorEvent.throwable;
            }
            return networkErrorEvent.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final NetworkErrorEvent copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new NetworkErrorEvent(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NetworkErrorEvent) && Intrinsics.areEqual(this.throwable, ((NetworkErrorEvent) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "NetworkErrorEvent(throwable=" + this.throwable + ")";
        }

        public NetworkErrorEvent(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: AcatsInAccountNumberEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberEvent$AccountNumberToValidationResponseEvent;", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberEvent;", "accountNumber", "", "response", "Lcom/robinhood/models/acats/db/ui/UiAcatsValidationResponse;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/acats/db/ui/UiAcatsValidationResponse;)V", "getAccountNumber", "()Ljava/lang/String;", "getResponse", "()Lcom/robinhood/models/acats/db/ui/UiAcatsValidationResponse;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountNumberToValidationResponseEvent implements AcatsInAccountNumberEvent {
        public static final int $stable = 8;
        private final String accountNumber;
        private final UiAcatsValidationResponse response;

        public static /* synthetic */ AccountNumberToValidationResponseEvent copy$default(AccountNumberToValidationResponseEvent accountNumberToValidationResponseEvent, String str, UiAcatsValidationResponse uiAcatsValidationResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountNumberToValidationResponseEvent.accountNumber;
            }
            if ((i & 2) != 0) {
                uiAcatsValidationResponse = accountNumberToValidationResponseEvent.response;
            }
            return accountNumberToValidationResponseEvent.copy(str, uiAcatsValidationResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UiAcatsValidationResponse getResponse() {
            return this.response;
        }

        public final AccountNumberToValidationResponseEvent copy(String accountNumber, UiAcatsValidationResponse response) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new AccountNumberToValidationResponseEvent(accountNumber, response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountNumberToValidationResponseEvent)) {
                return false;
            }
            AccountNumberToValidationResponseEvent accountNumberToValidationResponseEvent = (AccountNumberToValidationResponseEvent) other;
            return Intrinsics.areEqual(this.accountNumber, accountNumberToValidationResponseEvent.accountNumber) && Intrinsics.areEqual(this.response, accountNumberToValidationResponseEvent.response);
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            UiAcatsValidationResponse uiAcatsValidationResponse = this.response;
            return iHashCode + (uiAcatsValidationResponse == null ? 0 : uiAcatsValidationResponse.hashCode());
        }

        public String toString() {
            return "AccountNumberToValidationResponseEvent(accountNumber=" + this.accountNumber + ", response=" + this.response + ")";
        }

        public AccountNumberToValidationResponseEvent(String accountNumber, UiAcatsValidationResponse uiAcatsValidationResponse) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.response = uiAcatsValidationResponse;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UiAcatsValidationResponse getResponse() {
            return this.response;
        }
    }
}
