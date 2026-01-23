package com.robinhood.android.transfers.ach.p265ui;

import com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewRecurringDepositEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositEvent;", "", "TransferSuccess", "TransferFailed", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositEvent$TransferFailed;", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositEvent$TransferSuccess;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ReviewRecurringDepositEvent {

    /* compiled from: ReviewRecurringDepositEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositEvent$TransferSuccess;", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositEvent;", "result", "Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;", "<init>", "(Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;)V", "getResult", "()Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransferSuccess implements ReviewRecurringDepositEvent {
        public static final int $stable = 8;
        private final BaseReviewAchTransferFragment.AchTransferResult result;

        public static /* synthetic */ TransferSuccess copy$default(TransferSuccess transferSuccess, BaseReviewAchTransferFragment.AchTransferResult achTransferResult, int i, Object obj) {
            if ((i & 1) != 0) {
                achTransferResult = transferSuccess.result;
            }
            return transferSuccess.copy(achTransferResult);
        }

        /* renamed from: component1, reason: from getter */
        public final BaseReviewAchTransferFragment.AchTransferResult getResult() {
            return this.result;
        }

        public final TransferSuccess copy(BaseReviewAchTransferFragment.AchTransferResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new TransferSuccess(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TransferSuccess) && Intrinsics.areEqual(this.result, ((TransferSuccess) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "TransferSuccess(result=" + this.result + ")";
        }

        public TransferSuccess(BaseReviewAchTransferFragment.AchTransferResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public final BaseReviewAchTransferFragment.AchTransferResult getResult() {
            return this.result;
        }
    }

    /* compiled from: ReviewRecurringDepositEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositEvent$TransferFailed;", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransferFailed implements ReviewRecurringDepositEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ TransferFailed copy$default(TransferFailed transferFailed, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = transferFailed.throwable;
            }
            return transferFailed.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final TransferFailed copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new TransferFailed(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TransferFailed) && Intrinsics.areEqual(this.throwable, ((TransferFailed) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "TransferFailed(throwable=" + this.throwable + ")";
        }

        public TransferFailed(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
