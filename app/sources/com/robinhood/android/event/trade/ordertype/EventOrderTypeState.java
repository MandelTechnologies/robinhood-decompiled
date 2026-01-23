package com.robinhood.android.event.trade.ordertype;

import kotlin.Metadata;

/* compiled from: EventOrderTypeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/event/trade/ordertype/EventOrderTypeState;", "", "showBuy", "", "<init>", "(Z)V", "getShowBuy", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventOrderTypeState {
    public static final int $stable = 0;
    private final boolean showBuy;

    public static /* synthetic */ EventOrderTypeState copy$default(EventOrderTypeState eventOrderTypeState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = eventOrderTypeState.showBuy;
        }
        return eventOrderTypeState.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowBuy() {
        return this.showBuy;
    }

    public final EventOrderTypeState copy(boolean showBuy) {
        return new EventOrderTypeState(showBuy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EventOrderTypeState) && this.showBuy == ((EventOrderTypeState) other).showBuy;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showBuy);
    }

    public String toString() {
        return "EventOrderTypeState(showBuy=" + this.showBuy + ")";
    }

    public EventOrderTypeState(boolean z) {
        this.showBuy = z;
    }

    public final boolean getShowBuy() {
        return this.showBuy;
    }
}
