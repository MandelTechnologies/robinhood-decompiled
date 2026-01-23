package com.robinhood.android.chart.equityadvancedchart;

import com.robinhood.android.chart.blackwidowadvancedchart.duxo.GenericAdvanceChartOrderAction;
import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvanceChartOrderAction.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/chart/equityadvancedchart/EquityOrderCheckAction;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/GenericAdvanceChartOrderAction;", "action", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "equityOrderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "<init>", "(Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;)V", "getAction", "()Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "getEquityOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EquityOrderCheckAction implements GenericAdvanceChartOrderAction {
    public static final int $stable = 8;
    private final ServerDrivenButton action;
    private final EquityOrderIntent equityOrderIntent;

    public static /* synthetic */ EquityOrderCheckAction copy$default(EquityOrderCheckAction equityOrderCheckAction, ServerDrivenButton serverDrivenButton, EquityOrderIntent equityOrderIntent, int i, Object obj) {
        if ((i & 1) != 0) {
            serverDrivenButton = equityOrderCheckAction.action;
        }
        if ((i & 2) != 0) {
            equityOrderIntent = equityOrderCheckAction.equityOrderIntent;
        }
        return equityOrderCheckAction.copy(serverDrivenButton, equityOrderIntent);
    }

    /* renamed from: component1, reason: from getter */
    public final ServerDrivenButton getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final EquityOrderIntent getEquityOrderIntent() {
        return this.equityOrderIntent;
    }

    public final EquityOrderCheckAction copy(ServerDrivenButton action, EquityOrderIntent equityOrderIntent) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
        return new EquityOrderCheckAction(action, equityOrderIntent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityOrderCheckAction)) {
            return false;
        }
        EquityOrderCheckAction equityOrderCheckAction = (EquityOrderCheckAction) other;
        return Intrinsics.areEqual(this.action, equityOrderCheckAction.action) && Intrinsics.areEqual(this.equityOrderIntent, equityOrderCheckAction.equityOrderIntent);
    }

    public int hashCode() {
        return (this.action.hashCode() * 31) + this.equityOrderIntent.hashCode();
    }

    public String toString() {
        return "EquityOrderCheckAction(action=" + this.action + ", equityOrderIntent=" + this.equityOrderIntent + ")";
    }

    public EquityOrderCheckAction(ServerDrivenButton action, EquityOrderIntent equityOrderIntent) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
        this.action = action;
        this.equityOrderIntent = equityOrderIntent;
    }

    public final ServerDrivenButton getAction() {
        return this.action;
    }

    public final EquityOrderIntent getEquityOrderIntent() {
        return this.equityOrderIntent;
    }
}
