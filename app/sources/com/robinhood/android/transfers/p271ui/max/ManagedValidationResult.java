package com.robinhood.android.transfers.p271ui.max;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/ManagedValidationResult;", "", "Continue", "ValidationErrorsWereDisplayed", "ExceptionOccuredDuringValidation", "Lcom/robinhood/android/transfers/ui/max/ManagedValidationResult$Continue;", "Lcom/robinhood/android/transfers/ui/max/ManagedValidationResult$ExceptionOccuredDuringValidation;", "Lcom/robinhood/android/transfers/ui/max/ManagedValidationResult$ValidationErrorsWereDisplayed;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ManagedValidationResult {

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/ManagedValidationResult$Continue;", "Lcom/robinhood/android/transfers/ui/max/ManagedValidationResult;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Continue implements ManagedValidationResult {
        public static final int $stable = 0;
        public static final Continue INSTANCE = new Continue();

        private Continue() {
        }
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/ManagedValidationResult$ValidationErrorsWereDisplayed;", "Lcom/robinhood/android/transfers/ui/max/ManagedValidationResult;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ValidationErrorsWereDisplayed implements ManagedValidationResult {
        public static final int $stable = 0;
        public static final ValidationErrorsWereDisplayed INSTANCE = new ValidationErrorsWereDisplayed();

        private ValidationErrorsWereDisplayed() {
        }
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/ManagedValidationResult$ExceptionOccuredDuringValidation;", "Lcom/robinhood/android/transfers/ui/max/ManagedValidationResult;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getE", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExceptionOccuredDuringValidation implements ManagedValidationResult {
        public static final int $stable = 8;
        private final Exception e;

        public static /* synthetic */ ExceptionOccuredDuringValidation copy$default(ExceptionOccuredDuringValidation exceptionOccuredDuringValidation, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = exceptionOccuredDuringValidation.e;
            }
            return exceptionOccuredDuringValidation.copy(exc);
        }

        /* renamed from: component1, reason: from getter */
        public final Exception getE() {
            return this.e;
        }

        public final ExceptionOccuredDuringValidation copy(Exception e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return new ExceptionOccuredDuringValidation(e);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExceptionOccuredDuringValidation) && Intrinsics.areEqual(this.e, ((ExceptionOccuredDuringValidation) other).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            return "ExceptionOccuredDuringValidation(e=" + this.e + ")";
        }

        public ExceptionOccuredDuringValidation(Exception e) {
            Intrinsics.checkNotNullParameter(e, "e");
            this.e = e;
        }

        public final Exception getE() {
            return this.e;
        }
    }
}
