package com.robinhood.android.sdui.chartgroup;

import androidx.compose.p011ui.geometry.Offset;
import com.robinhood.android.charts.model.Point;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartGroupState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u001b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001cJ\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u00020\u0007HÀ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J\t\u0010 \u001a\u00020\tHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010\"\u001a\u00020\u0005HÆ\u0003JN\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/sdui/chartgroup/ScrubState;", "", "chartIndex", "", "chartStartXOffset", "", "effectiveGlobalScrubOffset", "Landroidx/compose/ui/geometry/Offset;", "point", "Lcom/robinhood/android/charts/model/Point;", "snapX", "scrubLineX", "<init>", "(IFJLcom/robinhood/android/charts/model/Point;Ljava/lang/Float;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChartIndex$lib_sdui_charts_externalRelease", "()I", "getChartStartXOffset", "()F", "getEffectiveGlobalScrubOffset-F1C5BW0$lib_sdui_charts_externalRelease", "()J", "J", "getPoint", "()Lcom/robinhood/android/charts/model/Point;", "getSnapX", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getScrubLineX", "component1", "component1$lib_sdui_charts_externalRelease", "component2", "component3", "component3-F1C5BW0$lib_sdui_charts_externalRelease", "component4", "component5", "component6", "copy", "copy-1hIXUjU", "(IFJLcom/robinhood/android/charts/model/Point;Ljava/lang/Float;F)Lcom/robinhood/android/sdui/chartgroup/ScrubState;", "equals", "", "other", "hashCode", "toString", "", "lib-sdui-charts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ScrubState {
    public static final int $stable = Point.$stable;
    private final int chartIndex;
    private final float chartStartXOffset;
    private final long effectiveGlobalScrubOffset;
    private final Point point;
    private final float scrubLineX;
    private final Float snapX;

    public /* synthetic */ ScrubState(int i, float f, long j, Point point, Float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f, j, point, f2, f3);
    }

    /* renamed from: copy-1hIXUjU$default, reason: not valid java name */
    public static /* synthetic */ ScrubState m18537copy1hIXUjU$default(ScrubState scrubState, int i, float f, long j, Point point, Float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = scrubState.chartIndex;
        }
        if ((i2 & 2) != 0) {
            f = scrubState.chartStartXOffset;
        }
        if ((i2 & 4) != 0) {
            j = scrubState.effectiveGlobalScrubOffset;
        }
        if ((i2 & 8) != 0) {
            point = scrubState.point;
        }
        if ((i2 & 16) != 0) {
            f2 = scrubState.snapX;
        }
        if ((i2 & 32) != 0) {
            f3 = scrubState.scrubLineX;
        }
        float f4 = f3;
        Point point2 = point;
        long j2 = j;
        return scrubState.m18539copy1hIXUjU(i, f, j2, point2, f2, f4);
    }

    /* renamed from: component1$lib_sdui_charts_externalRelease, reason: from getter */
    public final int getChartIndex() {
        return this.chartIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final float getChartStartXOffset() {
        return this.chartStartXOffset;
    }

    /* renamed from: component3-F1C5BW0$lib_sdui_charts_externalRelease, reason: not valid java name and from getter */
    public final long getEffectiveGlobalScrubOffset() {
        return this.effectiveGlobalScrubOffset;
    }

    /* renamed from: component4, reason: from getter */
    public final Point getPoint() {
        return this.point;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getSnapX() {
        return this.snapX;
    }

    /* renamed from: component6, reason: from getter */
    public final float getScrubLineX() {
        return this.scrubLineX;
    }

    /* renamed from: copy-1hIXUjU, reason: not valid java name */
    public final ScrubState m18539copy1hIXUjU(int chartIndex, float chartStartXOffset, long effectiveGlobalScrubOffset, Point point, Float snapX, float scrubLineX) {
        Intrinsics.checkNotNullParameter(point, "point");
        return new ScrubState(chartIndex, chartStartXOffset, effectiveGlobalScrubOffset, point, snapX, scrubLineX, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrubState)) {
            return false;
        }
        ScrubState scrubState = (ScrubState) other;
        return this.chartIndex == scrubState.chartIndex && Float.compare(this.chartStartXOffset, scrubState.chartStartXOffset) == 0 && Offset.m6540equalsimpl0(this.effectiveGlobalScrubOffset, scrubState.effectiveGlobalScrubOffset) && Intrinsics.areEqual(this.point, scrubState.point) && Intrinsics.areEqual((Object) this.snapX, (Object) scrubState.snapX) && Float.compare(this.scrubLineX, scrubState.scrubLineX) == 0;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.chartIndex) * 31) + Float.hashCode(this.chartStartXOffset)) * 31) + Offset.m6545hashCodeimpl(this.effectiveGlobalScrubOffset)) * 31) + this.point.hashCode()) * 31;
        Float f = this.snapX;
        return ((iHashCode + (f == null ? 0 : f.hashCode())) * 31) + Float.hashCode(this.scrubLineX);
    }

    public String toString() {
        return "ScrubState(chartIndex=" + this.chartIndex + ", chartStartXOffset=" + this.chartStartXOffset + ", effectiveGlobalScrubOffset=" + Offset.m6549toStringimpl(this.effectiveGlobalScrubOffset) + ", point=" + this.point + ", snapX=" + this.snapX + ", scrubLineX=" + this.scrubLineX + ")";
    }

    private ScrubState(int i, float f, long j, Point point, Float f2, float f3) {
        Intrinsics.checkNotNullParameter(point, "point");
        this.chartIndex = i;
        this.chartStartXOffset = f;
        this.effectiveGlobalScrubOffset = j;
        this.point = point;
        this.snapX = f2;
        this.scrubLineX = f3;
    }

    public final int getChartIndex$lib_sdui_charts_externalRelease() {
        return this.chartIndex;
    }

    public final float getChartStartXOffset() {
        return this.chartStartXOffset;
    }

    /* renamed from: getEffectiveGlobalScrubOffset-F1C5BW0$lib_sdui_charts_externalRelease */
    public final long m2457x73acf0ad() {
        return this.effectiveGlobalScrubOffset;
    }

    public final Point getPoint() {
        return this.point;
    }

    public final Float getSnapX() {
        return this.snapX;
    }

    public final float getScrubLineX() {
        return this.scrubLineX;
    }
}
