package com.robinhood.android.sdui.chartgroup;

import androidx.compose.p011ui.text.style.TextAlign;
import com.robinhood.models.serverdriven.experimental.api.ChartAxis;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartGroupState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\b$J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006HÆ\u0003Jn\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\b*J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/sdui/chartgroup/AxisConfig;", "", "gapBetweenScrubbingLabels", "", "primaryChartMaxX", "pointsForYAxisZoomRangeCalculation", "", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "xAxisTextAlign", "Landroidx/compose/ui/text/style/TextAlign;", "xAxisBottomDividers", "", "yAxisLocation", "Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;", "xAxisZoomable", "sortedChartGroupZoomXAxes", "Lcom/robinhood/models/serverdriven/experimental/api/ChartAxis;", "<init>", "(FFLjava/util/List;Landroidx/compose/ui/text/style/TextAlign;ZLcom/robinhood/android/sdui/chartgroup/YAxisLocation;ZLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getGapBetweenScrubbingLabels", "()F", "getPrimaryChartMaxX", "getPointsForYAxisZoomRangeCalculation", "()Ljava/util/List;", "getXAxisTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getXAxisBottomDividers", "()Z", "getYAxisLocation", "()Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;", "getXAxisZoomable", "getSortedChartGroupZoomXAxes", "component1", "component2", "component3", "component4", "component4-buA522U", "component5", "component6", "component7", "component8", "copy", "copy-nW1ISZY", "equals", "other", "hashCode", "", "toString", "", "lib-sdui-charts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AxisConfig {
    public static final int $stable = 8;
    private final float gapBetweenScrubbingLabels;
    private final List<Point> pointsForYAxisZoomRangeCalculation;
    private final float primaryChartMaxX;
    private final List<ChartAxis> sortedChartGroupZoomXAxes;
    private final boolean xAxisBottomDividers;
    private final TextAlign xAxisTextAlign;
    private final boolean xAxisZoomable;
    private final YAxisLocation yAxisLocation;

    public /* synthetic */ AxisConfig(float f, float f2, List list, TextAlign textAlign, boolean z, YAxisLocation yAxisLocation, boolean z2, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, list, textAlign, z, yAxisLocation, z2, list2);
    }

    /* renamed from: copy-nW1ISZY$default, reason: not valid java name */
    public static /* synthetic */ AxisConfig m18509copynW1ISZY$default(AxisConfig axisConfig, float f, float f2, List list, TextAlign textAlign, boolean z, YAxisLocation yAxisLocation, boolean z2, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = axisConfig.gapBetweenScrubbingLabels;
        }
        if ((i & 2) != 0) {
            f2 = axisConfig.primaryChartMaxX;
        }
        if ((i & 4) != 0) {
            list = axisConfig.pointsForYAxisZoomRangeCalculation;
        }
        if ((i & 8) != 0) {
            textAlign = axisConfig.xAxisTextAlign;
        }
        if ((i & 16) != 0) {
            z = axisConfig.xAxisBottomDividers;
        }
        if ((i & 32) != 0) {
            yAxisLocation = axisConfig.yAxisLocation;
        }
        if ((i & 64) != 0) {
            z2 = axisConfig.xAxisZoomable;
        }
        if ((i & 128) != 0) {
            list2 = axisConfig.sortedChartGroupZoomXAxes;
        }
        boolean z3 = z2;
        List list3 = list2;
        boolean z4 = z;
        YAxisLocation yAxisLocation2 = yAxisLocation;
        return axisConfig.m18511copynW1ISZY(f, f2, list, textAlign, z4, yAxisLocation2, z3, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final float getGapBetweenScrubbingLabels() {
        return this.gapBetweenScrubbingLabels;
    }

    /* renamed from: component2, reason: from getter */
    public final float getPrimaryChartMaxX() {
        return this.primaryChartMaxX;
    }

    public final List<Point> component3() {
        return this.pointsForYAxisZoomRangeCalculation;
    }

    /* renamed from: component4-buA522U, reason: not valid java name and from getter */
    public final TextAlign getXAxisTextAlign() {
        return this.xAxisTextAlign;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getXAxisBottomDividers() {
        return this.xAxisBottomDividers;
    }

    /* renamed from: component6, reason: from getter */
    public final YAxisLocation getYAxisLocation() {
        return this.yAxisLocation;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getXAxisZoomable() {
        return this.xAxisZoomable;
    }

    public final List<ChartAxis> component8() {
        return this.sortedChartGroupZoomXAxes;
    }

    /* renamed from: copy-nW1ISZY, reason: not valid java name */
    public final AxisConfig m18511copynW1ISZY(float gapBetweenScrubbingLabels, float primaryChartMaxX, List<Point> pointsForYAxisZoomRangeCalculation, TextAlign xAxisTextAlign, boolean xAxisBottomDividers, YAxisLocation yAxisLocation, boolean xAxisZoomable, List<ChartAxis> sortedChartGroupZoomXAxes) {
        Intrinsics.checkNotNullParameter(pointsForYAxisZoomRangeCalculation, "pointsForYAxisZoomRangeCalculation");
        Intrinsics.checkNotNullParameter(yAxisLocation, "yAxisLocation");
        return new AxisConfig(gapBetweenScrubbingLabels, primaryChartMaxX, pointsForYAxisZoomRangeCalculation, xAxisTextAlign, xAxisBottomDividers, yAxisLocation, xAxisZoomable, sortedChartGroupZoomXAxes, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AxisConfig)) {
            return false;
        }
        AxisConfig axisConfig = (AxisConfig) other;
        return Float.compare(this.gapBetweenScrubbingLabels, axisConfig.gapBetweenScrubbingLabels) == 0 && Float.compare(this.primaryChartMaxX, axisConfig.primaryChartMaxX) == 0 && Intrinsics.areEqual(this.pointsForYAxisZoomRangeCalculation, axisConfig.pointsForYAxisZoomRangeCalculation) && Intrinsics.areEqual(this.xAxisTextAlign, axisConfig.xAxisTextAlign) && this.xAxisBottomDividers == axisConfig.xAxisBottomDividers && this.yAxisLocation == axisConfig.yAxisLocation && this.xAxisZoomable == axisConfig.xAxisZoomable && Intrinsics.areEqual(this.sortedChartGroupZoomXAxes, axisConfig.sortedChartGroupZoomXAxes);
    }

    public int hashCode() {
        int iHashCode = ((((Float.hashCode(this.gapBetweenScrubbingLabels) * 31) + Float.hashCode(this.primaryChartMaxX)) * 31) + this.pointsForYAxisZoomRangeCalculation.hashCode()) * 31;
        TextAlign textAlign = this.xAxisTextAlign;
        int iM7916hashCodeimpl = (((((((iHashCode + (textAlign == null ? 0 : TextAlign.m7916hashCodeimpl(textAlign.getValue()))) * 31) + Boolean.hashCode(this.xAxisBottomDividers)) * 31) + this.yAxisLocation.hashCode()) * 31) + Boolean.hashCode(this.xAxisZoomable)) * 31;
        List<ChartAxis> list = this.sortedChartGroupZoomXAxes;
        return iM7916hashCodeimpl + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "AxisConfig(gapBetweenScrubbingLabels=" + this.gapBetweenScrubbingLabels + ", primaryChartMaxX=" + this.primaryChartMaxX + ", pointsForYAxisZoomRangeCalculation=" + this.pointsForYAxisZoomRangeCalculation + ", xAxisTextAlign=" + this.xAxisTextAlign + ", xAxisBottomDividers=" + this.xAxisBottomDividers + ", yAxisLocation=" + this.yAxisLocation + ", xAxisZoomable=" + this.xAxisZoomable + ", sortedChartGroupZoomXAxes=" + this.sortedChartGroupZoomXAxes + ")";
    }

    private AxisConfig(float f, float f2, List<Point> pointsForYAxisZoomRangeCalculation, TextAlign textAlign, boolean z, YAxisLocation yAxisLocation, boolean z2, List<ChartAxis> list) {
        Intrinsics.checkNotNullParameter(pointsForYAxisZoomRangeCalculation, "pointsForYAxisZoomRangeCalculation");
        Intrinsics.checkNotNullParameter(yAxisLocation, "yAxisLocation");
        this.gapBetweenScrubbingLabels = f;
        this.primaryChartMaxX = f2;
        this.pointsForYAxisZoomRangeCalculation = pointsForYAxisZoomRangeCalculation;
        this.xAxisTextAlign = textAlign;
        this.xAxisBottomDividers = z;
        this.yAxisLocation = yAxisLocation;
        this.xAxisZoomable = z2;
        this.sortedChartGroupZoomXAxes = list;
    }

    public final float getGapBetweenScrubbingLabels() {
        return this.gapBetweenScrubbingLabels;
    }

    public final float getPrimaryChartMaxX() {
        return this.primaryChartMaxX;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AxisConfig(float f, float f2, List list, TextAlign textAlign, boolean z, YAxisLocation yAxisLocation, boolean z2, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        float f3 = (i & 1) != 0 ? 0.0f : f;
        float f4 = (i & 2) != 0 ? 1.0f : f2;
        List listEmptyList = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        TextAlign textAlign2 = (i & 8) != 0 ? null : textAlign;
        boolean z3 = (i & 16) != 0 ? true : z;
        YAxisLocation yAxisLocation2 = (i & 32) != 0 ? YAxisLocation.END : yAxisLocation;
        boolean z4 = (i & 64) != 0 ? false : z2;
        this(f3, f4, listEmptyList, textAlign2, z3, yAxisLocation2, z4, (i & 128) == 0 ? list2 : null, null);
    }

    public final List<Point> getPointsForYAxisZoomRangeCalculation() {
        return this.pointsForYAxisZoomRangeCalculation;
    }

    /* renamed from: getXAxisTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m18512getXAxisTextAlignbuA522U() {
        return this.xAxisTextAlign;
    }

    public final boolean getXAxisBottomDividers() {
        return this.xAxisBottomDividers;
    }

    public final YAxisLocation getYAxisLocation() {
        return this.yAxisLocation;
    }

    public final boolean getXAxisZoomable() {
        return this.xAxisZoomable;
    }

    public final List<ChartAxis> getSortedChartGroupZoomXAxes() {
        return this.sortedChartGroupZoomXAxes;
    }
}
