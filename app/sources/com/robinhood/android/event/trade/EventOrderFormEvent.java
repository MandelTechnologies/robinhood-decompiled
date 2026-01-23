package com.robinhood.android.event.trade;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventOrderFormEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormEvent;", "", "RouteToAttestation", "OrderError", "ExitOrderFormEvent", "OrderSubmittedEvent", "NotionalPriceErrorShake", "Lcom/robinhood/android/event/trade/EventOrderFormEvent$ExitOrderFormEvent;", "Lcom/robinhood/android/event/trade/EventOrderFormEvent$NotionalPriceErrorShake;", "Lcom/robinhood/android/event/trade/EventOrderFormEvent$OrderError;", "Lcom/robinhood/android/event/trade/EventOrderFormEvent$OrderSubmittedEvent;", "Lcom/robinhood/android/event/trade/EventOrderFormEvent$RouteToAttestation;", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EventOrderFormEvent {

    /* compiled from: EventOrderFormEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormEvent$RouteToAttestation;", "Lcom/robinhood/android/event/trade/EventOrderFormEvent;", "attestationType", "", "<init>", "(Ljava/lang/String;)V", "getAttestationType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RouteToAttestation implements EventOrderFormEvent {
        public static final int $stable = 0;
        private final String attestationType;

        public static /* synthetic */ RouteToAttestation copy$default(RouteToAttestation routeToAttestation, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = routeToAttestation.attestationType;
            }
            return routeToAttestation.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAttestationType() {
            return this.attestationType;
        }

        public final RouteToAttestation copy(String attestationType) {
            Intrinsics.checkNotNullParameter(attestationType, "attestationType");
            return new RouteToAttestation(attestationType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RouteToAttestation) && Intrinsics.areEqual(this.attestationType, ((RouteToAttestation) other).attestationType);
        }

        public int hashCode() {
            return this.attestationType.hashCode();
        }

        public String toString() {
            return "RouteToAttestation(attestationType=" + this.attestationType + ")";
        }

        public RouteToAttestation(String attestationType) {
            Intrinsics.checkNotNullParameter(attestationType, "attestationType");
            this.attestationType = attestationType;
        }

        public final String getAttestationType() {
            return this.attestationType;
        }
    }

    /* compiled from: EventOrderFormEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormEvent$OrderError;", "Lcom/robinhood/android/event/trade/EventOrderFormEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderError implements EventOrderFormEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ OrderError copy$default(OrderError orderError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = orderError.error;
            }
            return orderError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final OrderError copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new OrderError(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OrderError) && Intrinsics.areEqual(this.error, ((OrderError) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "OrderError(error=" + this.error + ")";
        }

        public OrderError(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: EventOrderFormEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormEvent$ExitOrderFormEvent;", "Lcom/robinhood/android/event/trade/EventOrderFormEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExitOrderFormEvent implements EventOrderFormEvent {
        public static final int $stable = 0;
        public static final ExitOrderFormEvent INSTANCE = new ExitOrderFormEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof ExitOrderFormEvent);
        }

        public int hashCode() {
            return 1292200740;
        }

        public String toString() {
            return "ExitOrderFormEvent";
        }

        private ExitOrderFormEvent() {
        }
    }

    /* compiled from: EventOrderFormEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormEvent$OrderSubmittedEvent;", "Lcom/robinhood/android/event/trade/EventOrderFormEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderSubmittedEvent implements EventOrderFormEvent {
        public static final int $stable = 0;
        public static final OrderSubmittedEvent INSTANCE = new OrderSubmittedEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof OrderSubmittedEvent);
        }

        public int hashCode() {
            return 1652472623;
        }

        public String toString() {
            return "OrderSubmittedEvent";
        }

        private OrderSubmittedEvent() {
        }
    }

    /* compiled from: EventOrderFormEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormEvent$NotionalPriceErrorShake;", "Lcom/robinhood/android/event/trade/EventOrderFormEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NotionalPriceErrorShake implements EventOrderFormEvent {
        public static final int $stable = 0;
        public static final NotionalPriceErrorShake INSTANCE = new NotionalPriceErrorShake();

        public boolean equals(Object other) {
            return this == other || (other instanceof NotionalPriceErrorShake);
        }

        public int hashCode() {
            return -1833448055;
        }

        public String toString() {
            return "NotionalPriceErrorShake";
        }

        private NotionalPriceErrorShake() {
        }
    }
}
