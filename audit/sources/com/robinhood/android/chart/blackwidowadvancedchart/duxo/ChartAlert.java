package com.robinhood.android.chart.blackwidowadvancedchart.duxo;

import com.robinhood.models.p320db.ClientComponentAlert;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvanceChartEvent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/ChartAlert;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartEvent;", "alert", "Lcom/robinhood/models/db/ClientComponentAlert;", "<init>", "(Lcom/robinhood/models/db/ClientComponentAlert;)V", "getAlert", "()Lcom/robinhood/models/db/ClientComponentAlert;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ChartAlert implements AdvanceChartEvent {
    public static final int $stable = 8;
    private final ClientComponentAlert alert;

    public static /* synthetic */ ChartAlert copy$default(ChartAlert chartAlert, ClientComponentAlert clientComponentAlert, int i, Object obj) {
        if ((i & 1) != 0) {
            clientComponentAlert = chartAlert.alert;
        }
        return chartAlert.copy(clientComponentAlert);
    }

    /* renamed from: component1, reason: from getter */
    public final ClientComponentAlert getAlert() {
        return this.alert;
    }

    public final ChartAlert copy(ClientComponentAlert alert) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        return new ChartAlert(alert);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChartAlert) && Intrinsics.areEqual(this.alert, ((ChartAlert) other).alert);
    }

    public int hashCode() {
        return this.alert.hashCode();
    }

    public String toString() {
        return "ChartAlert(alert=" + this.alert + ")";
    }

    public ChartAlert(ClientComponentAlert alert) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        this.alert = alert;
    }

    public final ClientComponentAlert getAlert() {
        return this.alert;
    }
}
