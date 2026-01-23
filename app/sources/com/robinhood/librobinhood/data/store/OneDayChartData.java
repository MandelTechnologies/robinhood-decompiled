package com.robinhood.librobinhood.data.store;

import com.robinhood.android.charts.models.p080db.ChartLine;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: OneDayChartData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J@\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OneDayChartData;", "", "", "Lcom/robinhood/android/charts/models/db/ChartLine;", "chartLines", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "overlays", "j$/time/Instant", "receivedAt", "<init>", "(Ljava/util/List;Ljava/util/List;Lj$/time/Instant;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Lj$/time/Instant;", "copy", "(Ljava/util/List;Ljava/util/List;Lj$/time/Instant;)Lcom/robinhood/librobinhood/data/store/OneDayChartData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getChartLines", "getOverlays", "Lj$/time/Instant;", "getReceivedAt", "lib-store-one-day-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OneDayChartData {
    private final List<ChartLine> chartLines;
    private final List<UIComponent<GenericAction>> overlays;
    private final Instant receivedAt;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneDayChartData copy$default(OneDayChartData oneDayChartData, List list, List list2, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oneDayChartData.chartLines;
        }
        if ((i & 2) != 0) {
            list2 = oneDayChartData.overlays;
        }
        if ((i & 4) != 0) {
            instant = oneDayChartData.receivedAt;
        }
        return oneDayChartData.copy(list, list2, instant);
    }

    public final List<ChartLine> component1() {
        return this.chartLines;
    }

    public final List<UIComponent<GenericAction>> component2() {
        return this.overlays;
    }

    /* renamed from: component3, reason: from getter */
    public final Instant getReceivedAt() {
        return this.receivedAt;
    }

    public final OneDayChartData copy(List<ChartLine> chartLines, List<? extends UIComponent<? extends GenericAction>> overlays, Instant receivedAt) {
        Intrinsics.checkNotNullParameter(chartLines, "chartLines");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
        Intrinsics.checkNotNullParameter(receivedAt, "receivedAt");
        return new OneDayChartData(chartLines, overlays, receivedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneDayChartData)) {
            return false;
        }
        OneDayChartData oneDayChartData = (OneDayChartData) other;
        return Intrinsics.areEqual(this.chartLines, oneDayChartData.chartLines) && Intrinsics.areEqual(this.overlays, oneDayChartData.overlays) && Intrinsics.areEqual(this.receivedAt, oneDayChartData.receivedAt);
    }

    public int hashCode() {
        return (((this.chartLines.hashCode() * 31) + this.overlays.hashCode()) * 31) + this.receivedAt.hashCode();
    }

    public String toString() {
        return "OneDayChartData(chartLines=" + this.chartLines + ", overlays=" + this.overlays + ", receivedAt=" + this.receivedAt + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OneDayChartData(List<ChartLine> chartLines, List<? extends UIComponent<? extends GenericAction>> overlays, Instant receivedAt) {
        Intrinsics.checkNotNullParameter(chartLines, "chartLines");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
        Intrinsics.checkNotNullParameter(receivedAt, "receivedAt");
        this.chartLines = chartLines;
        this.overlays = overlays;
        this.receivedAt = receivedAt;
    }

    public final List<ChartLine> getChartLines() {
        return this.chartLines;
    }

    public final List<UIComponent<GenericAction>> getOverlays() {
        return this.overlays;
    }

    public final Instant getReceivedAt() {
        return this.receivedAt;
    }
}
