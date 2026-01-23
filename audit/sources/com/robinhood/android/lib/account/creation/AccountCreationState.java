package com.robinhood.android.lib.account.creation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCreationState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/account/creation/AccountCreationState;", "", "Fetched", "Polling", "Absent", "Failed", "Lcom/robinhood/android/lib/account/creation/AccountCreationState$Absent;", "Lcom/robinhood/android/lib/account/creation/AccountCreationState$Failed;", "Lcom/robinhood/android/lib/account/creation/AccountCreationState$Fetched;", "Lcom/robinhood/android/lib/account/creation/AccountCreationState$Polling;", "lib-account-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface AccountCreationState {

    /* compiled from: AccountCreationState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/account/creation/AccountCreationState$Fetched;", "Lcom/robinhood/android/lib/account/creation/AccountCreationState;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-account-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Fetched implements AccountCreationState {
        private final String accountNumber;

        public static /* synthetic */ Fetched copy$default(Fetched fetched, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fetched.accountNumber;
            }
            return fetched.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Fetched copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Fetched(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Fetched) && Intrinsics.areEqual(this.accountNumber, ((Fetched) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "Fetched(accountNumber=" + this.accountNumber + ")";
        }

        public Fetched(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: AccountCreationState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/account/creation/AccountCreationState$Polling;", "Lcom/robinhood/android/lib/account/creation/AccountCreationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-account-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Polling implements AccountCreationState {
        public static final Polling INSTANCE = new Polling();

        public boolean equals(Object other) {
            return this == other || (other instanceof Polling);
        }

        public int hashCode() {
            return -29908277;
        }

        public String toString() {
            return "Polling";
        }

        private Polling() {
        }
    }

    /* compiled from: AccountCreationState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/account/creation/AccountCreationState$Absent;", "Lcom/robinhood/android/lib/account/creation/AccountCreationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-account-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Absent implements AccountCreationState {
        public static final Absent INSTANCE = new Absent();

        public boolean equals(Object other) {
            return this == other || (other instanceof Absent);
        }

        public int hashCode() {
            return -2104773839;
        }

        public String toString() {
            return "Absent";
        }

        private Absent() {
        }
    }

    /* compiled from: AccountCreationState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/account/creation/AccountCreationState$Failed;", "Lcom/robinhood/android/lib/account/creation/AccountCreationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-account-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failed implements AccountCreationState {
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object other) {
            return this == other || (other instanceof Failed);
        }

        public int hashCode() {
            return -1962843083;
        }

        public String toString() {
            return "Failed";
        }

        private Failed() {
        }
    }
}
