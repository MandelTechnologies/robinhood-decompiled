package com.robinhood.android.futures.onboarding.p145ui.submission;

import com.robinhood.android.models.futures.p192ui.CreateFuturesAccountResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAccountSubmissionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionViewState;", "", "<init>", "()V", "Submitting", "Success", "NetworkError", "Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionViewState$NetworkError;", "Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionViewState$Submitting;", "Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionViewState$Success;", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionViewState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class FuturesAccountSubmissionDuxo4 {
    public static final int $stable = 0;

    public /* synthetic */ FuturesAccountSubmissionDuxo4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: FuturesAccountSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionViewState$Submitting;", "Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionViewState$Submitting */
    public static final /* data */ class Submitting extends FuturesAccountSubmissionDuxo4 {
        public static final int $stable = 0;
        public static final Submitting INSTANCE = new Submitting();

        public boolean equals(Object other) {
            return this == other || (other instanceof Submitting);
        }

        public int hashCode() {
            return 262139098;
        }

        public String toString() {
            return "Submitting";
        }

        private Submitting() {
            super(null);
        }
    }

    private FuturesAccountSubmissionDuxo4() {
    }

    /* compiled from: FuturesAccountSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionViewState$Success;", "Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionViewState;", "accountCreationResult", "Lcom/robinhood/android/models/futures/ui/CreateFuturesAccountResult;", "<init>", "(Lcom/robinhood/android/models/futures/ui/CreateFuturesAccountResult;)V", "getAccountCreationResult", "()Lcom/robinhood/android/models/futures/ui/CreateFuturesAccountResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionViewState$Success, reason: from toString */
    public static final /* data */ class Success extends FuturesAccountSubmissionDuxo4 {
        public static final int $stable = 8;
        private final CreateFuturesAccountResult accountCreationResult;

        public static /* synthetic */ Success copy$default(Success success, CreateFuturesAccountResult createFuturesAccountResult, int i, Object obj) {
            if ((i & 1) != 0) {
                createFuturesAccountResult = success.accountCreationResult;
            }
            return success.copy(createFuturesAccountResult);
        }

        /* renamed from: component1, reason: from getter */
        public final CreateFuturesAccountResult getAccountCreationResult() {
            return this.accountCreationResult;
        }

        public final Success copy(CreateFuturesAccountResult accountCreationResult) {
            Intrinsics.checkNotNullParameter(accountCreationResult, "accountCreationResult");
            return new Success(accountCreationResult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.accountCreationResult, ((Success) other).accountCreationResult);
        }

        public int hashCode() {
            return this.accountCreationResult.hashCode();
        }

        public String toString() {
            return "Success(accountCreationResult=" + this.accountCreationResult + ")";
        }

        public final CreateFuturesAccountResult getAccountCreationResult() {
            return this.accountCreationResult;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(CreateFuturesAccountResult accountCreationResult) {
            super(null);
            Intrinsics.checkNotNullParameter(accountCreationResult, "accountCreationResult");
            this.accountCreationResult = accountCreationResult;
        }
    }

    /* compiled from: FuturesAccountSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionViewState$NetworkError;", "Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionViewState$NetworkError, reason: from toString */
    public static final /* data */ class NetworkError extends FuturesAccountSubmissionDuxo4 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ NetworkError copy$default(NetworkError networkError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = networkError.throwable;
            }
            return networkError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final NetworkError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new NetworkError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NetworkError) && Intrinsics.areEqual(this.throwable, ((NetworkError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "NetworkError(throwable=" + this.throwable + ")";
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }
}
