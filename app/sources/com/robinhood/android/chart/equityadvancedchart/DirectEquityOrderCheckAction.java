package com.robinhood.android.chart.equityadvancedchart;

import com.robinhood.android.chart.blackwidowadvancedchart.duxo.GenericAdvanceChartOrderAction;
import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvanceChartOrderAction.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/chart/equityadvancedchart/DirectEquityOrderCheckAction;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/GenericAdvanceChartOrderAction;", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "equityOrderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "<init>", "(Lcom/robinhood/models/serverdriven/db/GenericAction;Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;)V", "getAction", "()Lcom/robinhood/models/serverdriven/db/GenericAction;", "getEquityOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DirectEquityOrderCheckAction implements GenericAdvanceChartOrderAction {
    public static final int $stable = 8;
    private final GenericAction action;
    private final EquityOrderIntent equityOrderIntent;

    public static /* synthetic */ DirectEquityOrderCheckAction copy$default(DirectEquityOrderCheckAction directEquityOrderCheckAction, GenericAction genericAction, EquityOrderIntent equityOrderIntent, int i, Object obj) {
        if ((i & 1) != 0) {
            genericAction = directEquityOrderCheckAction.action;
        }
        if ((i & 2) != 0) {
            equityOrderIntent = directEquityOrderCheckAction.equityOrderIntent;
        }
        return directEquityOrderCheckAction.copy(genericAction, equityOrderIntent);
    }

    /* renamed from: component1, reason: from getter */
    public final GenericAction getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final EquityOrderIntent getEquityOrderIntent() {
        return this.equityOrderIntent;
    }

    public final DirectEquityOrderCheckAction copy(GenericAction action, EquityOrderIntent equityOrderIntent) {
        Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
        return new DirectEquityOrderCheckAction(action, equityOrderIntent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectEquityOrderCheckAction)) {
            return false;
        }
        DirectEquityOrderCheckAction directEquityOrderCheckAction = (DirectEquityOrderCheckAction) other;
        return Intrinsics.areEqual(this.action, directEquityOrderCheckAction.action) && Intrinsics.areEqual(this.equityOrderIntent, directEquityOrderCheckAction.equityOrderIntent);
    }

    public int hashCode() {
        GenericAction genericAction = this.action;
        return ((genericAction == null ? 0 : genericAction.hashCode()) * 31) + this.equityOrderIntent.hashCode();
    }

    public String toString() {
        return "DirectEquityOrderCheckAction(action=" + this.action + ", equityOrderIntent=" + this.equityOrderIntent + ")";
    }

    public DirectEquityOrderCheckAction(GenericAction genericAction, EquityOrderIntent equityOrderIntent) {
        Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
        this.action = genericAction;
        this.equityOrderIntent = equityOrderIntent;
    }

    public final GenericAction getAction() {
        return this.action;
    }

    public final EquityOrderIntent getEquityOrderIntent() {
        return this.equityOrderIntent;
    }
}
