package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.create;

import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateEvent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateEvent;", "", "Success", "Error", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface CreateEvent {

    /* compiled from: CreateEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateEvent$Success;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateEvent;", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "<init>", "(Lcom/robinhood/models/ui/bonfire/PostTransferFlow;)V", "getPostTransferFlow", "()Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements CreateEvent {
        public static final int $stable = 8;
        private final PostTransferFlow postTransferFlow;

        public static /* synthetic */ Success copy$default(Success success, PostTransferFlow postTransferFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                postTransferFlow = success.postTransferFlow;
            }
            return success.copy(postTransferFlow);
        }

        /* renamed from: component1, reason: from getter */
        public final PostTransferFlow getPostTransferFlow() {
            return this.postTransferFlow;
        }

        public final Success copy(PostTransferFlow postTransferFlow) {
            Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
            return new Success(postTransferFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.postTransferFlow, ((Success) other).postTransferFlow);
        }

        public int hashCode() {
            return this.postTransferFlow.hashCode();
        }

        public String toString() {
            return "Success(postTransferFlow=" + this.postTransferFlow + ")";
        }

        public Success(PostTransferFlow postTransferFlow) {
            Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
            this.postTransferFlow = postTransferFlow;
        }

        public final PostTransferFlow getPostTransferFlow() {
            return this.postTransferFlow;
        }
    }

    /* compiled from: CreateEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateEvent$Error;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements CreateEvent {
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

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
