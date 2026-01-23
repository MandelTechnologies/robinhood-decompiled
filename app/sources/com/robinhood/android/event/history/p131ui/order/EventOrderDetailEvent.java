package com.robinhood.android.event.history.p131ui.order;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventOrderDetailEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/order/EventOrderDetailEvent;", "", "CancelOrderError", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailEvent$CancelOrderError;", "feature-event-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EventOrderDetailEvent {

    /* compiled from: EventOrderDetailEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/order/EventOrderDetailEvent$CancelOrderError;", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailEvent;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CancelOrderError implements EventOrderDetailEvent {
        public static final int $stable = 8;
        private final Exception error;

        public static /* synthetic */ CancelOrderError copy$default(CancelOrderError cancelOrderError, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = cancelOrderError.error;
            }
            return cancelOrderError.copy(exc);
        }

        /* renamed from: component1, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        public final CancelOrderError copy(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new CancelOrderError(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CancelOrderError) && Intrinsics.areEqual(this.error, ((CancelOrderError) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "CancelOrderError(error=" + this.error + ")";
        }

        public CancelOrderError(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Exception getError() {
            return this.error;
        }
    }
}
