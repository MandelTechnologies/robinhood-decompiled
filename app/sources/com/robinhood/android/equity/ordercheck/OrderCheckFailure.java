package com.robinhood.android.equity.ordercheck;

import com.robinhood.models.p320db.SilentEquityOrderChecksAlert;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderCheckFailure.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/OrderCheckFailure;", "", "alert", "Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert;", "silentAlert", "Lcom/robinhood/models/db/SilentEquityOrderChecksAlert;", "<init>", "(Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert;Lcom/robinhood/models/db/SilentEquityOrderChecksAlert;)V", "getAlert", "()Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert;", "getSilentAlert", "()Lcom/robinhood/models/db/SilentEquityOrderChecksAlert;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderCheckFailure {
    public static final int $stable = 8;
    private final VisibleEquityOrderChecksAlert alert;
    private final SilentEquityOrderChecksAlert silentAlert;

    public static /* synthetic */ OrderCheckFailure copy$default(OrderCheckFailure orderCheckFailure, VisibleEquityOrderChecksAlert visibleEquityOrderChecksAlert, SilentEquityOrderChecksAlert silentEquityOrderChecksAlert, int i, Object obj) {
        if ((i & 1) != 0) {
            visibleEquityOrderChecksAlert = orderCheckFailure.alert;
        }
        if ((i & 2) != 0) {
            silentEquityOrderChecksAlert = orderCheckFailure.silentAlert;
        }
        return orderCheckFailure.copy(visibleEquityOrderChecksAlert, silentEquityOrderChecksAlert);
    }

    /* renamed from: component1, reason: from getter */
    public final VisibleEquityOrderChecksAlert getAlert() {
        return this.alert;
    }

    /* renamed from: component2, reason: from getter */
    public final SilentEquityOrderChecksAlert getSilentAlert() {
        return this.silentAlert;
    }

    public final OrderCheckFailure copy(VisibleEquityOrderChecksAlert alert, SilentEquityOrderChecksAlert silentAlert) {
        return new OrderCheckFailure(alert, silentAlert);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderCheckFailure)) {
            return false;
        }
        OrderCheckFailure orderCheckFailure = (OrderCheckFailure) other;
        return Intrinsics.areEqual(this.alert, orderCheckFailure.alert) && Intrinsics.areEqual(this.silentAlert, orderCheckFailure.silentAlert);
    }

    public int hashCode() {
        VisibleEquityOrderChecksAlert visibleEquityOrderChecksAlert = this.alert;
        int iHashCode = (visibleEquityOrderChecksAlert == null ? 0 : visibleEquityOrderChecksAlert.hashCode()) * 31;
        SilentEquityOrderChecksAlert silentEquityOrderChecksAlert = this.silentAlert;
        return iHashCode + (silentEquityOrderChecksAlert != null ? silentEquityOrderChecksAlert.hashCode() : 0);
    }

    public String toString() {
        return "OrderCheckFailure(alert=" + this.alert + ", silentAlert=" + this.silentAlert + ")";
    }

    public OrderCheckFailure(VisibleEquityOrderChecksAlert visibleEquityOrderChecksAlert, SilentEquityOrderChecksAlert silentEquityOrderChecksAlert) {
        this.alert = visibleEquityOrderChecksAlert;
        this.silentAlert = silentEquityOrderChecksAlert;
    }

    public final VisibleEquityOrderChecksAlert getAlert() {
        return this.alert;
    }

    public final SilentEquityOrderChecksAlert getSilentAlert() {
        return this.silentAlert;
    }
}
