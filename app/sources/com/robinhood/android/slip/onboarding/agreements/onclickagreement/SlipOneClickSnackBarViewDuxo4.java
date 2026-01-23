package com.robinhood.android.slip.onboarding.agreements.onclickagreement;

import com.robinhood.android.account.strings.DisplayName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipOneClickSnackBarViewDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoViewState;", "", "<init>", "()V", "Success", "Loading", "Error", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoViewState$Error;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoViewState$Loading;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoViewState$Success;", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.EmptyViewDuxoViewState, reason: use source file name */
/* loaded from: classes5.dex */
public abstract class SlipOneClickSnackBarViewDuxo4 {
    public static final int $stable = 0;

    public /* synthetic */ SlipOneClickSnackBarViewDuxo4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: SlipOneClickSnackBarViewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoViewState$Success;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoViewState;", "accountDisplayName", "Lcom/robinhood/android/account/strings/DisplayName;", "<init>", "(Lcom/robinhood/android/account/strings/DisplayName;)V", "getAccountDisplayName", "()Lcom/robinhood/android/account/strings/DisplayName;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.EmptyViewDuxoViewState$Success, reason: from toString */
    public static final /* data */ class Success extends SlipOneClickSnackBarViewDuxo4 {
        public static final int $stable = DisplayName.$stable;
        private final DisplayName accountDisplayName;

        public static /* synthetic */ Success copy$default(Success success, DisplayName displayName, int i, Object obj) {
            if ((i & 1) != 0) {
                displayName = success.accountDisplayName;
            }
            return success.copy(displayName);
        }

        /* renamed from: component1, reason: from getter */
        public final DisplayName getAccountDisplayName() {
            return this.accountDisplayName;
        }

        public final Success copy(DisplayName accountDisplayName) {
            Intrinsics.checkNotNullParameter(accountDisplayName, "accountDisplayName");
            return new Success(accountDisplayName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.accountDisplayName, ((Success) other).accountDisplayName);
        }

        public int hashCode() {
            return this.accountDisplayName.hashCode();
        }

        public String toString() {
            return "Success(accountDisplayName=" + this.accountDisplayName + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(DisplayName accountDisplayName) {
            super(null);
            Intrinsics.checkNotNullParameter(accountDisplayName, "accountDisplayName");
            this.accountDisplayName = accountDisplayName;
        }

        public final DisplayName getAccountDisplayName() {
            return this.accountDisplayName;
        }
    }

    private SlipOneClickSnackBarViewDuxo4() {
    }

    /* compiled from: SlipOneClickSnackBarViewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoViewState$Loading;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.EmptyViewDuxoViewState$Loading */
    public static final /* data */ class Loading extends SlipOneClickSnackBarViewDuxo4 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -2040829855;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: SlipOneClickSnackBarViewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoViewState$Error;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoViewState;", "exception", "", "<init>", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.EmptyViewDuxoViewState$Error, reason: from toString */
    public static final /* data */ class Error extends SlipOneClickSnackBarViewDuxo4 {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public final Throwable getException() {
            return this.exception;
        }
    }
}
