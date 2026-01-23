package com.robinhood.android.sdui.chartgroup;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.Ranges3;

/* compiled from: SduiChartZoomTransformer.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/sdui/chartgroup/XAxisZoomState;", "", "zoomRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "edgeBounceOffset", "<init>", "(Lkotlin/ranges/ClosedFloatingPointRange;F)V", "getZoomRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "getEdgeBounceOffset", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-sdui-charts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class XAxisZoomState {
    public static final int $stable = 0;
    private final float edgeBounceOffset;
    private final Ranges3<Float> zoomRange;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ XAxisZoomState copy$default(XAxisZoomState xAxisZoomState, Ranges3 ranges3, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            ranges3 = xAxisZoomState.zoomRange;
        }
        if ((i & 2) != 0) {
            f = xAxisZoomState.edgeBounceOffset;
        }
        return xAxisZoomState.copy(ranges3, f);
    }

    public final Ranges3<Float> component1() {
        return this.zoomRange;
    }

    /* renamed from: component2, reason: from getter */
    public final float getEdgeBounceOffset() {
        return this.edgeBounceOffset;
    }

    public final XAxisZoomState copy(Ranges3<Float> zoomRange, float edgeBounceOffset) {
        Intrinsics.checkNotNullParameter(zoomRange, "zoomRange");
        return new XAxisZoomState(zoomRange, edgeBounceOffset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XAxisZoomState)) {
            return false;
        }
        XAxisZoomState xAxisZoomState = (XAxisZoomState) other;
        return Intrinsics.areEqual(this.zoomRange, xAxisZoomState.zoomRange) && Float.compare(this.edgeBounceOffset, xAxisZoomState.edgeBounceOffset) == 0;
    }

    public int hashCode() {
        return (this.zoomRange.hashCode() * 31) + Float.hashCode(this.edgeBounceOffset);
    }

    public String toString() {
        return "XAxisZoomState(zoomRange=" + this.zoomRange + ", edgeBounceOffset=" + this.edgeBounceOffset + ")";
    }

    public XAxisZoomState(Ranges3<Float> zoomRange, float f) {
        Intrinsics.checkNotNullParameter(zoomRange, "zoomRange");
        this.zoomRange = zoomRange;
        this.edgeBounceOffset = f;
    }

    public final Ranges3<Float> getZoomRange() {
        return this.zoomRange;
    }

    public final float getEdgeBounceOffset() {
        return this.edgeBounceOffset;
    }
}
