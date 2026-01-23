package com.robinhood.android.chart.futuresadvancedchart;

import com.robinhood.android.models.futures.p189db.FuturesCostBasis;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/chart/futuresadvancedchart/FuturesChartPosition;", "Lcom/robinhood/shared/trading/orderstate/InstrumentPosition;", "costBasis", "Lcom/robinhood/android/models/futures/db/FuturesCostBasis;", "<init>", "(Lcom/robinhood/android/models/futures/db/FuturesCostBasis;)V", "getCostBasis", "()Lcom/robinhood/android/models/futures/db/FuturesCostBasis;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-futures-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FuturesChartPosition implements InstrumentOrderState3 {
    private final FuturesCostBasis costBasis;

    public static /* synthetic */ FuturesChartPosition copy$default(FuturesChartPosition futuresChartPosition, FuturesCostBasis futuresCostBasis, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresCostBasis = futuresChartPosition.costBasis;
        }
        return futuresChartPosition.copy(futuresCostBasis);
    }

    /* renamed from: component1, reason: from getter */
    public final FuturesCostBasis getCostBasis() {
        return this.costBasis;
    }

    public final FuturesChartPosition copy(FuturesCostBasis costBasis) {
        return new FuturesChartPosition(costBasis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FuturesChartPosition) && Intrinsics.areEqual(this.costBasis, ((FuturesChartPosition) other).costBasis);
    }

    public int hashCode() {
        FuturesCostBasis futuresCostBasis = this.costBasis;
        if (futuresCostBasis == null) {
            return 0;
        }
        return futuresCostBasis.hashCode();
    }

    public String toString() {
        return "FuturesChartPosition(costBasis=" + this.costBasis + ")";
    }

    public FuturesChartPosition(FuturesCostBasis futuresCostBasis) {
        this.costBasis = futuresCostBasis;
    }

    public final FuturesCostBasis getCostBasis() {
        return this.costBasis;
    }
}
