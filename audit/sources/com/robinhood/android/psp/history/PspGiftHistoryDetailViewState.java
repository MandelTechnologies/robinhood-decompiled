package com.robinhood.android.psp.history;

import com.robinhood.models.p320db.bonfire.PspGiftHistoryDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PspGiftHistoryDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState;", "", "result", "Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState$Result;", "<init>", "(Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState$Result;)V", "getResult", "()Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState$Result;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Result", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PspGiftHistoryDetailViewState {
    public static final int $stable = 0;
    private final Result result;

    /* JADX WARN: Multi-variable type inference failed */
    public PspGiftHistoryDetailViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PspGiftHistoryDetailViewState copy$default(PspGiftHistoryDetailViewState pspGiftHistoryDetailViewState, Result result, int i, Object obj) {
        if ((i & 1) != 0) {
            result = pspGiftHistoryDetailViewState.result;
        }
        return pspGiftHistoryDetailViewState.copy(result);
    }

    /* renamed from: component1, reason: from getter */
    public final Result getResult() {
        return this.result;
    }

    public final PspGiftHistoryDetailViewState copy(Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new PspGiftHistoryDetailViewState(result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PspGiftHistoryDetailViewState) && Intrinsics.areEqual(this.result, ((PspGiftHistoryDetailViewState) other).result);
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public String toString() {
        return "PspGiftHistoryDetailViewState(result=" + this.result + ")";
    }

    public PspGiftHistoryDetailViewState(Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
    }

    public /* synthetic */ PspGiftHistoryDetailViewState(Result result, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Result.Loading.INSTANCE : result);
    }

    public final Result getResult() {
        return this.result;
    }

    /* compiled from: PspGiftHistoryDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState$Result;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState$Result$Error;", "Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState$Result$Loading;", "Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState$Result$Success;", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Result {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: PspGiftHistoryDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState$Result$Loading;", "Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState$Result;", "<init>", "()V", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends Result {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private Result() {
        }

        /* compiled from: PspGiftHistoryDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState$Result$Success;", "Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState$Result;", "pspGiftHistoryDetail", "Lcom/robinhood/models/db/bonfire/PspGiftHistoryDetail;", "<init>", "(Lcom/robinhood/models/db/bonfire/PspGiftHistoryDetail;)V", "getPspGiftHistoryDetail", "()Lcom/robinhood/models/db/bonfire/PspGiftHistoryDetail;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Result {
            public static final int $stable = 8;
            private final PspGiftHistoryDetail pspGiftHistoryDetail;

            public static /* synthetic */ Success copy$default(Success success, PspGiftHistoryDetail pspGiftHistoryDetail, int i, Object obj) {
                if ((i & 1) != 0) {
                    pspGiftHistoryDetail = success.pspGiftHistoryDetail;
                }
                return success.copy(pspGiftHistoryDetail);
            }

            /* renamed from: component1, reason: from getter */
            public final PspGiftHistoryDetail getPspGiftHistoryDetail() {
                return this.pspGiftHistoryDetail;
            }

            public final Success copy(PspGiftHistoryDetail pspGiftHistoryDetail) {
                Intrinsics.checkNotNullParameter(pspGiftHistoryDetail, "pspGiftHistoryDetail");
                return new Success(pspGiftHistoryDetail);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.pspGiftHistoryDetail, ((Success) other).pspGiftHistoryDetail);
            }

            public int hashCode() {
                return this.pspGiftHistoryDetail.hashCode();
            }

            public String toString() {
                return "Success(pspGiftHistoryDetail=" + this.pspGiftHistoryDetail + ")";
            }

            public final PspGiftHistoryDetail getPspGiftHistoryDetail() {
                return this.pspGiftHistoryDetail;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(PspGiftHistoryDetail pspGiftHistoryDetail) {
                super(null);
                Intrinsics.checkNotNullParameter(pspGiftHistoryDetail, "pspGiftHistoryDetail");
                this.pspGiftHistoryDetail = pspGiftHistoryDetail;
            }
        }

        /* compiled from: PspGiftHistoryDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState$Result$Error;", "Lcom/robinhood/android/psp/history/PspGiftHistoryDetailViewState$Result;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error extends Result {
            public static final int $stable = 8;
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
            public Error(Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }
    }
}
