package com.robinhood.android.equities.equitytrade;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Order;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderStatusEvent.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent;", "", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "Aborted", "Failed", "Success", "Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent$Aborted;", "Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent$Failed;", "Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent$Success;", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface OrderStatusEvent {
    EquityOrderIntent getOrderIntent();

    /* compiled from: OrderStatusEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent$Aborted;", "Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent;", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "<init>", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;)V", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Aborted implements OrderStatusEvent {
        private final EquityOrderIntent orderIntent;

        public static /* synthetic */ Aborted copy$default(Aborted aborted, EquityOrderIntent equityOrderIntent, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderIntent = aborted.orderIntent;
            }
            return aborted.copy(equityOrderIntent);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        public final Aborted copy(EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            return new Aborted(orderIntent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Aborted) && Intrinsics.areEqual(this.orderIntent, ((Aborted) other).orderIntent);
        }

        public int hashCode() {
            return this.orderIntent.hashCode();
        }

        public String toString() {
            return "Aborted(orderIntent=" + this.orderIntent + ")";
        }

        public Aborted(EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            this.orderIntent = orderIntent;
        }

        @Override // com.robinhood.android.equities.equitytrade.OrderStatusEvent
        public EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }
    }

    /* compiled from: OrderStatusEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent$Failed;", "Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent;", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "throwable", "", "<init>", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;Ljava/lang/Throwable;)V", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failed implements OrderStatusEvent {
        private final EquityOrderIntent orderIntent;
        private final Throwable throwable;

        public static /* synthetic */ Failed copy$default(Failed failed, EquityOrderIntent equityOrderIntent, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderIntent = failed.orderIntent;
            }
            if ((i & 2) != 0) {
                th = failed.throwable;
            }
            return failed.copy(equityOrderIntent, th);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Failed copy(EquityOrderIntent orderIntent, Throwable throwable) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Failed(orderIntent, throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.orderIntent, failed.orderIntent) && Intrinsics.areEqual(this.throwable, failed.throwable);
        }

        public int hashCode() {
            return (this.orderIntent.hashCode() * 31) + this.throwable.hashCode();
        }

        public String toString() {
            return "Failed(orderIntent=" + this.orderIntent + ", throwable=" + this.throwable + ")";
        }

        public Failed(EquityOrderIntent orderIntent, Throwable throwable) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.orderIntent = orderIntent;
            this.throwable = throwable;
        }

        @Override // com.robinhood.android.equities.equitytrade.OrderStatusEvent
        public EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: OrderStatusEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent$Success;", "Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent;", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "<init>", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;Lcom/robinhood/models/db/Order;)V", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "getOrder", "()Lcom/robinhood/models/db/Order;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements OrderStatusEvent {
        private final Order order;
        private final EquityOrderIntent orderIntent;

        public static /* synthetic */ Success copy$default(Success success, EquityOrderIntent equityOrderIntent, Order order, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderIntent = success.orderIntent;
            }
            if ((i & 2) != 0) {
                order = success.order;
            }
            return success.copy(equityOrderIntent, order);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        /* renamed from: component2, reason: from getter */
        public final Order getOrder() {
            return this.order;
        }

        public final Success copy(EquityOrderIntent orderIntent, Order order) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            Intrinsics.checkNotNullParameter(order, "order");
            return new Success(orderIntent, order);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.orderIntent, success.orderIntent) && Intrinsics.areEqual(this.order, success.order);
        }

        public int hashCode() {
            return (this.orderIntent.hashCode() * 31) + this.order.hashCode();
        }

        public String toString() {
            return "Success(orderIntent=" + this.orderIntent + ", order=" + this.order + ")";
        }

        public Success(EquityOrderIntent orderIntent, Order order) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            Intrinsics.checkNotNullParameter(order, "order");
            this.orderIntent = orderIntent;
            this.order = order;
        }

        @Override // com.robinhood.android.equities.equitytrade.OrderStatusEvent
        public EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        public final Order getOrder() {
            return this.order;
        }
    }
}
