package com.robinhood.android.event.trade;

import com.robinhood.android.eventcontracts.trade.UiEventOrderContext;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderSubmissionState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/event/trade/OrderSubmissionState;", "", "<init>", "()V", "Editing", "Reviewing", "Submitting", "Lcom/robinhood/android/event/trade/OrderSubmissionState$Editing;", "Lcom/robinhood/android/event/trade/OrderSubmissionState$Reviewing;", "Lcom/robinhood/android/event/trade/OrderSubmissionState$Submitting;", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public abstract class OrderSubmissionState {
    public static final int $stable = 0;

    public /* synthetic */ OrderSubmissionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: OrderSubmissionState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/trade/OrderSubmissionState$Editing;", "Lcom/robinhood/android/event/trade/OrderSubmissionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Editing extends OrderSubmissionState {
        public static final int $stable = 0;
        public static final Editing INSTANCE = new Editing();

        public boolean equals(Object other) {
            return this == other || (other instanceof Editing);
        }

        public int hashCode() {
            return 1113240211;
        }

        public String toString() {
            return "Editing";
        }

        private Editing() {
            super(null);
        }
    }

    private OrderSubmissionState() {
    }

    /* compiled from: OrderSubmissionState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/trade/OrderSubmissionState$Reviewing;", "Lcom/robinhood/android/event/trade/OrderSubmissionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Reviewing extends OrderSubmissionState {
        public static final int $stable = 0;
        public static final Reviewing INSTANCE = new Reviewing();

        public boolean equals(Object other) {
            return this == other || (other instanceof Reviewing);
        }

        public int hashCode() {
            return -1567970363;
        }

        public String toString() {
            return "Reviewing";
        }

        private Reviewing() {
            super(null);
        }
    }

    /* compiled from: OrderSubmissionState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/event/trade/OrderSubmissionState$Submitting;", "Lcom/robinhood/android/event/trade/OrderSubmissionState;", "result", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result;", "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext;", "<init>", "(Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result;)V", "getResult", "()Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Submitting extends OrderSubmissionState {
        public static final int $stable = OrderSubmissionManager.Result.$stable;
        private final OrderSubmissionManager.Result<FuturesOrderDto, UiEventOrderContext> result;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Submitting copy$default(Submitting submitting, OrderSubmissionManager.Result result, int i, Object obj) {
            if ((i & 1) != 0) {
                result = submitting.result;
            }
            return submitting.copy(result);
        }

        public final OrderSubmissionManager.Result<FuturesOrderDto, UiEventOrderContext> component1() {
            return this.result;
        }

        public final Submitting copy(OrderSubmissionManager.Result<FuturesOrderDto, UiEventOrderContext> result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new Submitting(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Submitting) && Intrinsics.areEqual(this.result, ((Submitting) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Submitting(result=" + this.result + ")";
        }

        public final OrderSubmissionManager.Result<FuturesOrderDto, UiEventOrderContext> getResult() {
            return this.result;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Submitting(OrderSubmissionManager.Result<FuturesOrderDto, UiEventOrderContext> result) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }
    }
}
