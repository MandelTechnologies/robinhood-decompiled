package com.robinhood.android.futures.charts;

import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.store.futures.ChartType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesChartsServiceManager.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/futures/charts/FuturesChartArg;", "", "contractId", "Ljava/util/UUID;", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "chartType", "Lcom/robinhood/store/futures/ChartType;", "isContinuous", "", "isSparkline", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/store/futures/ChartType;ZZ)V", "getContractId", "()Ljava/util/UUID;", "getSpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getChartType", "()Lcom/robinhood/store/futures/ChartType;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-futures-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesChartArg {
    public static final int $stable = 8;
    private final ChartType chartType;
    private final UUID contractId;
    private final boolean isContinuous;
    private final boolean isSparkline;
    private final DisplaySpan span;

    public static /* synthetic */ FuturesChartArg copy$default(FuturesChartArg futuresChartArg, UUID uuid, DisplaySpan displaySpan, ChartType chartType, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = futuresChartArg.contractId;
        }
        if ((i & 2) != 0) {
            displaySpan = futuresChartArg.span;
        }
        if ((i & 4) != 0) {
            chartType = futuresChartArg.chartType;
        }
        if ((i & 8) != 0) {
            z = futuresChartArg.isContinuous;
        }
        if ((i & 16) != 0) {
            z2 = futuresChartArg.isSparkline;
        }
        boolean z3 = z2;
        ChartType chartType2 = chartType;
        return futuresChartArg.copy(uuid, displaySpan, chartType2, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getContractId() {
        return this.contractId;
    }

    /* renamed from: component2, reason: from getter */
    public final DisplaySpan getSpan() {
        return this.span;
    }

    /* renamed from: component3, reason: from getter */
    public final ChartType getChartType() {
        return this.chartType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsContinuous() {
        return this.isContinuous;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSparkline() {
        return this.isSparkline;
    }

    public final FuturesChartArg copy(UUID contractId, DisplaySpan span, ChartType chartType, boolean isContinuous, boolean isSparkline) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        return new FuturesChartArg(contractId, span, chartType, isContinuous, isSparkline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesChartArg)) {
            return false;
        }
        FuturesChartArg futuresChartArg = (FuturesChartArg) other;
        return Intrinsics.areEqual(this.contractId, futuresChartArg.contractId) && this.span == futuresChartArg.span && this.chartType == futuresChartArg.chartType && this.isContinuous == futuresChartArg.isContinuous && this.isSparkline == futuresChartArg.isSparkline;
    }

    public int hashCode() {
        return (((((((this.contractId.hashCode() * 31) + this.span.hashCode()) * 31) + this.chartType.hashCode()) * 31) + Boolean.hashCode(this.isContinuous)) * 31) + Boolean.hashCode(this.isSparkline);
    }

    public String toString() {
        return "FuturesChartArg(contractId=" + this.contractId + ", span=" + this.span + ", chartType=" + this.chartType + ", isContinuous=" + this.isContinuous + ", isSparkline=" + this.isSparkline + ")";
    }

    public FuturesChartArg(UUID contractId, DisplaySpan span, ChartType chartType, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        this.contractId = contractId;
        this.span = span;
        this.chartType = chartType;
        this.isContinuous = z;
        this.isSparkline = z2;
    }

    public final UUID getContractId() {
        return this.contractId;
    }

    public final DisplaySpan getSpan() {
        return this.span;
    }

    public final ChartType getChartType() {
        return this.chartType;
    }

    public final boolean isContinuous() {
        return this.isContinuous;
    }

    public final boolean isSparkline() {
        return this.isSparkline;
    }
}
