package com.robinhood.android.sdui.chartgroup;

import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ChartAxisDto;
import rh_server_driven_ui.p531v1.PointDto;

/* compiled from: AdvancedChartGroupState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\b,J\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\b.J\u0010\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\b0J\t\u00101\u001a\u00020\u000eHÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006HÆ\u0003J\u0092\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\b7J\u0013\u00108\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001b¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/sdui/chartgroup/ProtoAxisConfig;", "", "gapBetweenScrubbingLabels", "", "primaryChartMaxX", "pointsForYAxisZoomRangeCalculation", "", "Lrh_server_driven_ui/v1/PointDto;", "xAxisTextAlign", "Landroidx/compose/ui/text/style/TextAlign;", "xAxisTopPadding", "Landroidx/compose/ui/unit/Dp;", "xAxisBottomPadding", "xAxisBottomDividers", "", "yAxisPrimaryLocation", "Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;", "yAxisSecondaryLocation", "xAxisZoomable", "sortedChartGroupZoomXAxes", "Lrh_server_driven_ui/v1/ChartAxisDto;", "<init>", "(FFLjava/util/List;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;ZLcom/robinhood/android/sdui/chartgroup/YAxisLocation;Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;ZLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getGapBetweenScrubbingLabels", "()F", "getPrimaryChartMaxX", "getPointsForYAxisZoomRangeCalculation", "()Ljava/util/List;", "getXAxisTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getXAxisTopPadding-lTKBWiU", "()Landroidx/compose/ui/unit/Dp;", "getXAxisBottomPadding-lTKBWiU", "getXAxisBottomDividers", "()Z", "getYAxisPrimaryLocation", "()Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;", "getYAxisSecondaryLocation", "getXAxisZoomable", "getSortedChartGroupZoomXAxes", "component1", "component2", "component3", "component4", "component4-buA522U", "component5", "component5-lTKBWiU", "component6", "component6-lTKBWiU", "component7", "component8", "component9", "component10", "component11", "copy", "copy-zbhsIog", "equals", "other", "hashCode", "", "toString", "", "lib-sdui-charts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ProtoAxisConfig {
    public static final int $stable = 8;
    private final float gapBetweenScrubbingLabels;
    private final List<PointDto> pointsForYAxisZoomRangeCalculation;
    private final float primaryChartMaxX;
    private final List<ChartAxisDto> sortedChartGroupZoomXAxes;
    private final boolean xAxisBottomDividers;
    private final C2002Dp xAxisBottomPadding;
    private final TextAlign xAxisTextAlign;
    private final C2002Dp xAxisTopPadding;
    private final boolean xAxisZoomable;
    private final YAxisLocation yAxisPrimaryLocation;
    private final YAxisLocation yAxisSecondaryLocation;

    public /* synthetic */ ProtoAxisConfig(float f, float f2, List list, TextAlign textAlign, C2002Dp c2002Dp, C2002Dp c2002Dp2, boolean z, YAxisLocation yAxisLocation, YAxisLocation yAxisLocation2, boolean z2, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, list, textAlign, c2002Dp, c2002Dp2, z, yAxisLocation, yAxisLocation2, z2, list2);
    }

    /* renamed from: copy-zbhsIog$default, reason: not valid java name */
    public static /* synthetic */ ProtoAxisConfig m18529copyzbhsIog$default(ProtoAxisConfig protoAxisConfig, float f, float f2, List list, TextAlign textAlign, C2002Dp c2002Dp, C2002Dp c2002Dp2, boolean z, YAxisLocation yAxisLocation, YAxisLocation yAxisLocation2, boolean z2, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = protoAxisConfig.gapBetweenScrubbingLabels;
        }
        if ((i & 2) != 0) {
            f2 = protoAxisConfig.primaryChartMaxX;
        }
        if ((i & 4) != 0) {
            list = protoAxisConfig.pointsForYAxisZoomRangeCalculation;
        }
        if ((i & 8) != 0) {
            textAlign = protoAxisConfig.xAxisTextAlign;
        }
        if ((i & 16) != 0) {
            c2002Dp = protoAxisConfig.xAxisTopPadding;
        }
        if ((i & 32) != 0) {
            c2002Dp2 = protoAxisConfig.xAxisBottomPadding;
        }
        if ((i & 64) != 0) {
            z = protoAxisConfig.xAxisBottomDividers;
        }
        if ((i & 128) != 0) {
            yAxisLocation = protoAxisConfig.yAxisPrimaryLocation;
        }
        if ((i & 256) != 0) {
            yAxisLocation2 = protoAxisConfig.yAxisSecondaryLocation;
        }
        if ((i & 512) != 0) {
            z2 = protoAxisConfig.xAxisZoomable;
        }
        if ((i & 1024) != 0) {
            list2 = protoAxisConfig.sortedChartGroupZoomXAxes;
        }
        boolean z3 = z2;
        List list3 = list2;
        YAxisLocation yAxisLocation3 = yAxisLocation;
        YAxisLocation yAxisLocation4 = yAxisLocation2;
        C2002Dp c2002Dp3 = c2002Dp2;
        boolean z4 = z;
        C2002Dp c2002Dp4 = c2002Dp;
        List list4 = list;
        return protoAxisConfig.m18533copyzbhsIog(f, f2, list4, textAlign, c2002Dp4, c2002Dp3, z4, yAxisLocation3, yAxisLocation4, z3, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final float getGapBetweenScrubbingLabels() {
        return this.gapBetweenScrubbingLabels;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getXAxisZoomable() {
        return this.xAxisZoomable;
    }

    public final List<ChartAxisDto> component11() {
        return this.sortedChartGroupZoomXAxes;
    }

    /* renamed from: component2, reason: from getter */
    public final float getPrimaryChartMaxX() {
        return this.primaryChartMaxX;
    }

    public final List<PointDto> component3() {
        return this.pointsForYAxisZoomRangeCalculation;
    }

    /* renamed from: component4-buA522U, reason: not valid java name and from getter */
    public final TextAlign getXAxisTextAlign() {
        return this.xAxisTextAlign;
    }

    /* renamed from: component5-lTKBWiU, reason: not valid java name and from getter */
    public final C2002Dp getXAxisTopPadding() {
        return this.xAxisTopPadding;
    }

    /* renamed from: component6-lTKBWiU, reason: not valid java name and from getter */
    public final C2002Dp getXAxisBottomPadding() {
        return this.xAxisBottomPadding;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getXAxisBottomDividers() {
        return this.xAxisBottomDividers;
    }

    /* renamed from: component8, reason: from getter */
    public final YAxisLocation getYAxisPrimaryLocation() {
        return this.yAxisPrimaryLocation;
    }

    /* renamed from: component9, reason: from getter */
    public final YAxisLocation getYAxisSecondaryLocation() {
        return this.yAxisSecondaryLocation;
    }

    /* renamed from: copy-zbhsIog, reason: not valid java name */
    public final ProtoAxisConfig m18533copyzbhsIog(float gapBetweenScrubbingLabels, float primaryChartMaxX, List<PointDto> pointsForYAxisZoomRangeCalculation, TextAlign xAxisTextAlign, C2002Dp xAxisTopPadding, C2002Dp xAxisBottomPadding, boolean xAxisBottomDividers, YAxisLocation yAxisPrimaryLocation, YAxisLocation yAxisSecondaryLocation, boolean xAxisZoomable, List<ChartAxisDto> sortedChartGroupZoomXAxes) {
        Intrinsics.checkNotNullParameter(pointsForYAxisZoomRangeCalculation, "pointsForYAxisZoomRangeCalculation");
        Intrinsics.checkNotNullParameter(yAxisPrimaryLocation, "yAxisPrimaryLocation");
        return new ProtoAxisConfig(gapBetweenScrubbingLabels, primaryChartMaxX, pointsForYAxisZoomRangeCalculation, xAxisTextAlign, xAxisTopPadding, xAxisBottomPadding, xAxisBottomDividers, yAxisPrimaryLocation, yAxisSecondaryLocation, xAxisZoomable, sortedChartGroupZoomXAxes, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtoAxisConfig)) {
            return false;
        }
        ProtoAxisConfig protoAxisConfig = (ProtoAxisConfig) other;
        return Float.compare(this.gapBetweenScrubbingLabels, protoAxisConfig.gapBetweenScrubbingLabels) == 0 && Float.compare(this.primaryChartMaxX, protoAxisConfig.primaryChartMaxX) == 0 && Intrinsics.areEqual(this.pointsForYAxisZoomRangeCalculation, protoAxisConfig.pointsForYAxisZoomRangeCalculation) && Intrinsics.areEqual(this.xAxisTextAlign, protoAxisConfig.xAxisTextAlign) && Intrinsics.areEqual(this.xAxisTopPadding, protoAxisConfig.xAxisTopPadding) && Intrinsics.areEqual(this.xAxisBottomPadding, protoAxisConfig.xAxisBottomPadding) && this.xAxisBottomDividers == protoAxisConfig.xAxisBottomDividers && this.yAxisPrimaryLocation == protoAxisConfig.yAxisPrimaryLocation && this.yAxisSecondaryLocation == protoAxisConfig.yAxisSecondaryLocation && this.xAxisZoomable == protoAxisConfig.xAxisZoomable && Intrinsics.areEqual(this.sortedChartGroupZoomXAxes, protoAxisConfig.sortedChartGroupZoomXAxes);
    }

    public int hashCode() {
        int iHashCode = ((((Float.hashCode(this.gapBetweenScrubbingLabels) * 31) + Float.hashCode(this.primaryChartMaxX)) * 31) + this.pointsForYAxisZoomRangeCalculation.hashCode()) * 31;
        TextAlign textAlign = this.xAxisTextAlign;
        int iM7916hashCodeimpl = (iHashCode + (textAlign == null ? 0 : TextAlign.m7916hashCodeimpl(textAlign.getValue()))) * 31;
        C2002Dp c2002Dp = this.xAxisTopPadding;
        int iM7998hashCodeimpl = (iM7916hashCodeimpl + (c2002Dp == null ? 0 : C2002Dp.m7998hashCodeimpl(c2002Dp.getValue()))) * 31;
        C2002Dp c2002Dp2 = this.xAxisBottomPadding;
        int iM7998hashCodeimpl2 = (((((iM7998hashCodeimpl + (c2002Dp2 == null ? 0 : C2002Dp.m7998hashCodeimpl(c2002Dp2.getValue()))) * 31) + Boolean.hashCode(this.xAxisBottomDividers)) * 31) + this.yAxisPrimaryLocation.hashCode()) * 31;
        YAxisLocation yAxisLocation = this.yAxisSecondaryLocation;
        int iHashCode2 = (((iM7998hashCodeimpl2 + (yAxisLocation == null ? 0 : yAxisLocation.hashCode())) * 31) + Boolean.hashCode(this.xAxisZoomable)) * 31;
        List<ChartAxisDto> list = this.sortedChartGroupZoomXAxes;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ProtoAxisConfig(gapBetweenScrubbingLabels=" + this.gapBetweenScrubbingLabels + ", primaryChartMaxX=" + this.primaryChartMaxX + ", pointsForYAxisZoomRangeCalculation=" + this.pointsForYAxisZoomRangeCalculation + ", xAxisTextAlign=" + this.xAxisTextAlign + ", xAxisTopPadding=" + this.xAxisTopPadding + ", xAxisBottomPadding=" + this.xAxisBottomPadding + ", xAxisBottomDividers=" + this.xAxisBottomDividers + ", yAxisPrimaryLocation=" + this.yAxisPrimaryLocation + ", yAxisSecondaryLocation=" + this.yAxisSecondaryLocation + ", xAxisZoomable=" + this.xAxisZoomable + ", sortedChartGroupZoomXAxes=" + this.sortedChartGroupZoomXAxes + ")";
    }

    private ProtoAxisConfig(float f, float f2, List<PointDto> pointsForYAxisZoomRangeCalculation, TextAlign textAlign, C2002Dp c2002Dp, C2002Dp c2002Dp2, boolean z, YAxisLocation yAxisPrimaryLocation, YAxisLocation yAxisLocation, boolean z2, List<ChartAxisDto> list) {
        Intrinsics.checkNotNullParameter(pointsForYAxisZoomRangeCalculation, "pointsForYAxisZoomRangeCalculation");
        Intrinsics.checkNotNullParameter(yAxisPrimaryLocation, "yAxisPrimaryLocation");
        this.gapBetweenScrubbingLabels = f;
        this.primaryChartMaxX = f2;
        this.pointsForYAxisZoomRangeCalculation = pointsForYAxisZoomRangeCalculation;
        this.xAxisTextAlign = textAlign;
        this.xAxisTopPadding = c2002Dp;
        this.xAxisBottomPadding = c2002Dp2;
        this.xAxisBottomDividers = z;
        this.yAxisPrimaryLocation = yAxisPrimaryLocation;
        this.yAxisSecondaryLocation = yAxisLocation;
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
    public /* synthetic */ ProtoAxisConfig(float f, float f2, List list, TextAlign textAlign, C2002Dp c2002Dp, C2002Dp c2002Dp2, boolean z, YAxisLocation yAxisLocation, YAxisLocation yAxisLocation2, boolean z2, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        float f3 = (i & 1) != 0 ? 0.0f : f;
        float f4 = (i & 2) != 0 ? 1.0f : f2;
        List listEmptyList = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        TextAlign textAlign2 = (i & 8) != 0 ? null : textAlign;
        C2002Dp c2002Dp3 = (i & 16) != 0 ? null : c2002Dp;
        C2002Dp c2002Dp4 = (i & 32) != 0 ? null : c2002Dp2;
        boolean z3 = (i & 64) != 0 ? true : z;
        YAxisLocation yAxisLocation3 = (i & 128) != 0 ? YAxisLocation.END : yAxisLocation;
        YAxisLocation yAxisLocation4 = (i & 256) != 0 ? null : yAxisLocation2;
        boolean z4 = (i & 512) != 0 ? false : z2;
        this(f3, f4, listEmptyList, textAlign2, c2002Dp3, c2002Dp4, z3, yAxisLocation3, yAxisLocation4, z4, (i & 1024) == 0 ? list2 : null, null);
    }

    public final List<PointDto> getPointsForYAxisZoomRangeCalculation() {
        return this.pointsForYAxisZoomRangeCalculation;
    }

    /* renamed from: getXAxisTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m18535getXAxisTextAlignbuA522U() {
        return this.xAxisTextAlign;
    }

    /* renamed from: getXAxisTopPadding-lTKBWiU, reason: not valid java name */
    public final C2002Dp m18536getXAxisTopPaddinglTKBWiU() {
        return this.xAxisTopPadding;
    }

    /* renamed from: getXAxisBottomPadding-lTKBWiU, reason: not valid java name */
    public final C2002Dp m18534getXAxisBottomPaddinglTKBWiU() {
        return this.xAxisBottomPadding;
    }

    public final boolean getXAxisBottomDividers() {
        return this.xAxisBottomDividers;
    }

    public final YAxisLocation getYAxisPrimaryLocation() {
        return this.yAxisPrimaryLocation;
    }

    public final YAxisLocation getYAxisSecondaryLocation() {
        return this.yAxisSecondaryLocation;
    }

    public final boolean getXAxisZoomable() {
        return this.xAxisZoomable;
    }

    public final List<ChartAxisDto> getSortedChartGroupZoomXAxes() {
        return this.sortedChartGroupZoomXAxes;
    }
}
