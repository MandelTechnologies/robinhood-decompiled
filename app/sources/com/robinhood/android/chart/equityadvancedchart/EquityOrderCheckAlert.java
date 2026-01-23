package com.robinhood.android.chart.equityadvancedchart;

import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartEvent;
import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvanceChartOrderEvent.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/chart/equityadvancedchart/EquityOrderCheckAlert;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartEvent;", "orderCheckAlert", "Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert;", "equityOrderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "<init>", "(Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert;Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;)V", "getOrderCheckAlert", "()Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert;", "getEquityOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EquityOrderCheckAlert implements AdvanceChartEvent {
    public static final int $stable = 8;
    private final EquityOrderIntent equityOrderIntent;
    private final VisibleEquityOrderChecksAlert orderCheckAlert;

    public static /* synthetic */ EquityOrderCheckAlert copy$default(EquityOrderCheckAlert equityOrderCheckAlert, VisibleEquityOrderChecksAlert visibleEquityOrderChecksAlert, EquityOrderIntent equityOrderIntent, int i, Object obj) {
        if ((i & 1) != 0) {
            visibleEquityOrderChecksAlert = equityOrderCheckAlert.orderCheckAlert;
        }
        if ((i & 2) != 0) {
            equityOrderIntent = equityOrderCheckAlert.equityOrderIntent;
        }
        return equityOrderCheckAlert.copy(visibleEquityOrderChecksAlert, equityOrderIntent);
    }

    /* renamed from: component1, reason: from getter */
    public final VisibleEquityOrderChecksAlert getOrderCheckAlert() {
        return this.orderCheckAlert;
    }

    /* renamed from: component2, reason: from getter */
    public final EquityOrderIntent getEquityOrderIntent() {
        return this.equityOrderIntent;
    }

    public final EquityOrderCheckAlert copy(VisibleEquityOrderChecksAlert orderCheckAlert, EquityOrderIntent equityOrderIntent) {
        Intrinsics.checkNotNullParameter(orderCheckAlert, "orderCheckAlert");
        Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
        return new EquityOrderCheckAlert(orderCheckAlert, equityOrderIntent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityOrderCheckAlert)) {
            return false;
        }
        EquityOrderCheckAlert equityOrderCheckAlert = (EquityOrderCheckAlert) other;
        return Intrinsics.areEqual(this.orderCheckAlert, equityOrderCheckAlert.orderCheckAlert) && Intrinsics.areEqual(this.equityOrderIntent, equityOrderCheckAlert.equityOrderIntent);
    }

    public int hashCode() {
        return (this.orderCheckAlert.hashCode() * 31) + this.equityOrderIntent.hashCode();
    }

    public String toString() {
        return "EquityOrderCheckAlert(orderCheckAlert=" + this.orderCheckAlert + ", equityOrderIntent=" + this.equityOrderIntent + ")";
    }

    public EquityOrderCheckAlert(VisibleEquityOrderChecksAlert orderCheckAlert, EquityOrderIntent equityOrderIntent) {
        Intrinsics.checkNotNullParameter(orderCheckAlert, "orderCheckAlert");
        Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
        this.orderCheckAlert = orderCheckAlert;
        this.equityOrderIntent = equityOrderIntent;
    }

    public final VisibleEquityOrderChecksAlert getOrderCheckAlert() {
        return this.orderCheckAlert;
    }

    public final EquityOrderIntent getEquityOrderIntent() {
        return this.equityOrderIntent;
    }
}
