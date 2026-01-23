package com.robinhood.android.cash.disputes.p070ui.question;

import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.ErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResponseValidationResult.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationResult;", "", "<init>", "()V", "Success", "Error", "Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationResult$Error;", "Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationResult$Success;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class ResponseValidationResult {
    public static final int $stable = 0;

    public /* synthetic */ ResponseValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ResponseValidationResult() {
    }

    /* compiled from: ResponseValidationResult.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationResult$Success;", "Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationResult;", "validatedQuestionResponse", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "<init>", "(Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;)V", "getValidatedQuestionResponse", "()Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends ResponseValidationResult {
        public static final int $stable = 0;
        private final DisputeQuestionResponse validatedQuestionResponse;

        public static /* synthetic */ Success copy$default(Success success, DisputeQuestionResponse disputeQuestionResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                disputeQuestionResponse = success.validatedQuestionResponse;
            }
            return success.copy(disputeQuestionResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final DisputeQuestionResponse getValidatedQuestionResponse() {
            return this.validatedQuestionResponse;
        }

        public final Success copy(DisputeQuestionResponse validatedQuestionResponse) {
            Intrinsics.checkNotNullParameter(validatedQuestionResponse, "validatedQuestionResponse");
            return new Success(validatedQuestionResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.validatedQuestionResponse, ((Success) other).validatedQuestionResponse);
        }

        public int hashCode() {
            return this.validatedQuestionResponse.hashCode();
        }

        public String toString() {
            return "Success(validatedQuestionResponse=" + this.validatedQuestionResponse + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(DisputeQuestionResponse validatedQuestionResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(validatedQuestionResponse, "validatedQuestionResponse");
            this.validatedQuestionResponse = validatedQuestionResponse;
        }

        public final DisputeQuestionResponse getValidatedQuestionResponse() {
            return this.validatedQuestionResponse;
        }
    }

    /* compiled from: ResponseValidationResult.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationResult$Error;", "Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationResult;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends ResponseValidationResult {
        public static final int $stable = 8;
        private final String errorMessage;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Error(Throwable throwable) {
            super(0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
            ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(throwable);
            this.errorMessage = errorResponseExtractErrorResponse != null ? errorResponseExtractErrorResponse.getDisplayMessage() : null;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }
    }
}
