package com.robinhood.android.sdui.chartgroup;

import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChartLegend.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/sdui/chartgroup/LegendList;", "", "candleStickLegends", "", "Lcom/robinhood/models/serverdriven/experimental/api/ChartLegendItem;", "otherLegends", "x", "", "<init>", "(Ljava/util/List;Ljava/util/List;F)V", "getCandleStickLegends", "()Ljava/util/List;", "getOtherLegends", "getX", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-sdui-charts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LegendList {
    public static final int $stable = 8;
    private final List<ChartLegendItem> candleStickLegends;
    private final List<ChartLegendItem> otherLegends;
    private final float x;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LegendList copy$default(LegendList legendList, List list, List list2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            list = legendList.candleStickLegends;
        }
        if ((i & 2) != 0) {
            list2 = legendList.otherLegends;
        }
        if ((i & 4) != 0) {
            f = legendList.x;
        }
        return legendList.copy(list, list2, f);
    }

    public final List<ChartLegendItem> component1() {
        return this.candleStickLegends;
    }

    public final List<ChartLegendItem> component2() {
        return this.otherLegends;
    }

    /* renamed from: component3, reason: from getter */
    public final float getX() {
        return this.x;
    }

    public final LegendList copy(List<ChartLegendItem> candleStickLegends, List<ChartLegendItem> otherLegends, float x) {
        Intrinsics.checkNotNullParameter(candleStickLegends, "candleStickLegends");
        Intrinsics.checkNotNullParameter(otherLegends, "otherLegends");
        return new LegendList(candleStickLegends, otherLegends, x);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegendList)) {
            return false;
        }
        LegendList legendList = (LegendList) other;
        return Intrinsics.areEqual(this.candleStickLegends, legendList.candleStickLegends) && Intrinsics.areEqual(this.otherLegends, legendList.otherLegends) && Float.compare(this.x, legendList.x) == 0;
    }

    public int hashCode() {
        return (((this.candleStickLegends.hashCode() * 31) + this.otherLegends.hashCode()) * 31) + Float.hashCode(this.x);
    }

    public String toString() {
        return "LegendList(candleStickLegends=" + this.candleStickLegends + ", otherLegends=" + this.otherLegends + ", x=" + this.x + ")";
    }

    public LegendList(List<ChartLegendItem> candleStickLegends, List<ChartLegendItem> otherLegends, float f) {
        Intrinsics.checkNotNullParameter(candleStickLegends, "candleStickLegends");
        Intrinsics.checkNotNullParameter(otherLegends, "otherLegends");
        this.candleStickLegends = candleStickLegends;
        this.otherLegends = otherLegends;
        this.x = f;
    }

    public final List<ChartLegendItem> getCandleStickLegends() {
        return this.candleStickLegends;
    }

    public final List<ChartLegendItem> getOtherLegends() {
        return this.otherLegends;
    }

    public final float getX() {
        return this.x;
    }
}
