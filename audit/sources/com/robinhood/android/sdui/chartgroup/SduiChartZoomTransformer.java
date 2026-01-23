package com.robinhood.android.sdui.chartgroup;

import android.os.Parcelable;
import androidx.compose.p011ui.geometry.Offset;
import com.robinhood.android.charts.model.AxisType;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartAxis;
import com.robinhood.models.serverdriven.experimental.api.ChartAxisLabel;
import com.robinhood.models.serverdriven.experimental.api.ChartAxisRange;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.DottedLineType;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.models.serverdriven.experimental.api.MoneyAxisRange;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.Segment;
import com.robinhood.models.serverdriven.experimental.api.Style;
import com.robinhood.models.serverdriven.experimental.api.StylesWithStates;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UnitlessAxisRange;
import com.robinhood.rosetta.common.MoneyDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.Ranges3;
import kotlin.ranges.RangesKt;
import rh_server_driven_ui.p531v1.ChartAxisDto;
import rh_server_driven_ui.p531v1.ChartAxisLabelDto;
import rh_server_driven_ui.p531v1.ChartAxisRangeDto;
import rh_server_driven_ui.p531v1.ChartDto;
import rh_server_driven_ui.p531v1.ChartFillDto;
import rh_server_driven_ui.p531v1.ChartGroupDto;
import rh_server_driven_ui.p531v1.ChartLegendItemListDto;
import rh_server_driven_ui.p531v1.ColorDto;
import rh_server_driven_ui.p531v1.DirectionDto;
import rh_server_driven_ui.p531v1.DisplayTextDto;
import rh_server_driven_ui.p531v1.DottedLineTypeDto;
import rh_server_driven_ui.p531v1.LineDto;
import rh_server_driven_ui.p531v1.LineTypeDto;
import rh_server_driven_ui.p531v1.MoneyAxisRangeDto;
import rh_server_driven_ui.p531v1.PointDto;
import rh_server_driven_ui.p531v1.SegmentDto;
import rh_server_driven_ui.p531v1.StyleDto;
import rh_server_driven_ui.p531v1.StylesWithStatesDto;
import rh_server_driven_ui.p531v1.TextStyleDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.UnitlessAxisRangeDto;

/* compiled from: SduiChartZoomTransformer.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000e\u001aT\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u001a>\u0010\u0000\u001a\u00020\u000e*\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100\n\u001a^\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002\u001aH\u0010\u0000\u001a\u00020\u0015*\u00020\u00152\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100\nH\u0002\u001a,\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007\u001a,\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0007\u001a&\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n2\u0006\u0010\u001b\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u001a&\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\n2\u0006\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\u0014\u0010\u001d\u001a\u00020!*\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a(\u0010\u0000\u001a\u00020\u001e*\u00020\u001e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a(\u0010\u0000\u001a\u00020!*\u00020!2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a(\u0010\u0000\u001a\u00020\"*\u00020\"2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a(\u0010\u0000\u001a\u00020#*\u00020#2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a>\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\n0$*\u0014\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\n0$2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a2\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020(0$*\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020(0$2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a(\u0010\u0000\u001a\u00020\u000b*\u00020\u000b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n\u001a(\u0010\u0000\u001a\u00020\u000f*\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\n\u001a\u001a\u0010\u0000\u001a\u00020+*\u00020+2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a\u001a\u0010\u0000\u001a\u00020,*\u00020,2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a\n\u0010-\u001a\u00020\b*\u00020\u001e\u001a\n\u0010.\u001a\u00020\b*\u00020\"\u001a\n\u0010.\u001a\u00020\b*\u00020#\u001a2\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0012\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002\u001a2\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0012\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100\nH\u0002\u001a$\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001022\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001aS\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00062\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006¢\u0006\u0004\b>\u0010?\u001a9\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u00109\u001a\u0004\u0018\u00010\u00062\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006¢\u0006\u0002\u0010A\"\u000e\u0010B\u001a\u00020%X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020%X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020%X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010E\u001a\u00020%X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010F\u001a\u00020%X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010G\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010H\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010I\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010J\u001a\u00020KX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010L\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010M\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010N\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010O\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010P\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010Q\u001a\u00020KX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010R\u001a\u00020KX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010S\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010T\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010U\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\bW\u0010X¨\u0006Y"}, m3636d2 = {"transform", "Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;", "ActionT", "Landroid/os/Parcelable;", "xZoomRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "xAxisZoomable", "", "sortedZoomXAxes", "", "Lcom/robinhood/models/serverdriven/experimental/api/ChartAxis;", "pointsForYAxisZoomRangeCalculation", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "Lrh_server_driven_ui/v1/ChartGroupDto;", "Lrh_server_driven_ui/v1/ChartAxisDto;", "Lrh_server_driven_ui/v1/PointDto;", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "useDynamicYAxis", "chartGroupXAxisLabels", "Lcom/robinhood/models/serverdriven/experimental/api/ChartAxisLabel;", "Lrh_server_driven_ui/v1/ChartDto;", "Lrh_server_driven_ui/v1/ChartAxisLabelDto;", "getDynamicChartGroupXAxisLabels", "chartGroupZoomXAxes", "getProtoDynamicChartGroupXAxisLabels", "getDynamicChartYAxisLabels", "yAxis", "yZoomRange", "toGridline", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "type", "Lcom/robinhood/android/charts/model/AxisType;", "Lrh_server_driven_ui/v1/LineDto;", "Lcom/robinhood/models/serverdriven/experimental/api/ChartFill;", "Lrh_server_driven_ui/v1/ChartFillDto;", "", "", "Lcom/robinhood/models/serverdriven/experimental/api/ChartLegendItem;", "transformDto", "Lrh_server_driven_ui/v1/ChartLegendItemListDto;", "normalizedZoomRange", "dynamicAxisLabels", "Lcom/robinhood/models/serverdriven/experimental/api/ChartAxisRange;", "Lrh_server_driven_ui/v1/ChartAxisRangeDto;", "isGridLine", "isVolumeBar", "getYAxisZoomRange", "getProtoYAxisZoomRange", "getPointTransformFunc", "Lkotlin/Function1;", "mapGestureToXAxisZoomRangeAndBounceOffset", "Lcom/robinhood/android/sdui/chartgroup/XAxisZoomState;", "centroid", "Landroidx/compose/ui/geometry/Offset;", "offset", "zoomScale", "chartWidth", "oldZoomRange", "oldEdgeBounceOffset", "primaryChartMaxX", "gapBetweenScrubbingLabels", "mapGestureToXAxisZoomRangeAndBounceOffset-xrV--mA", "(JJFFLkotlin/ranges/ClosedFloatingPointRange;FFF)Lcom/robinhood/android/sdui/chartgroup/XAxisZoomState;", "validateXAxisZoomRange", "(Ljava/lang/Float;Lkotlin/ranges/ClosedFloatingPointRange;FF)Lkotlin/ranges/ClosedFloatingPointRange;", "CANDLESTICK_DOJI_BODY_IDENTIFIER", "CANDLESTICK_WICK_IDENTIFIER", "HORIZONTAL_GRID_LINE_IDENTIFIER", "VERTICAL_GRID_LINE_IDENTIFIER", "VOLUME_IDENTIFIER", "FLOAT_ERROR", "Y_AXIS_ZOOM_PADDING_PERCENT", "X_AXIS_MIN_ZOOM_WIDTH", "X_AXIS_MIN_NUM_OF_SCRUBBING_LABEL_GAPS", "", "CANDLESTICK_WICK_MAX_WIDTH", "CANDLESTICK_DOJI_BODY_HEIGHT", "MAX_BOUNCE_OFFSET_PERCENT", "MAX_EMPTY_CHART_PERCENT", "PAN_SPEED_COEFFICIENT", "MAX_X_AXIS_LABEL_GAPS", "MIN_X_AXIS_LABEL_GAPS", "X_AXIS_LABEL_OVERLAP_THRESHOLD", "X_AXIS_LABEL_CUTOFF_BOUND_START", "Y_AXIS_LABEL_CUTOFF_RANGE", "WHOLE_ZOOM_RANGE", "getWHOLE_ZOOM_RANGE", "()Lkotlin/ranges/ClosedFloatingPointRange;", "lib-sdui-charts_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformerKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SduiChartZoomTransformer {
    private static final float CANDLESTICK_DOJI_BODY_HEIGHT = 0.002f;
    public static final String CANDLESTICK_DOJI_BODY_IDENTIFIER = "candlestick_doji_body";
    public static final String CANDLESTICK_WICK_IDENTIFIER = "candlestick_wick";
    private static final float CANDLESTICK_WICK_MAX_WIDTH = 0.002f;
    private static final float FLOAT_ERROR = 1.0E-5f;
    public static final String HORIZONTAL_GRID_LINE_IDENTIFIER = "horizontal_grid_line";
    private static final float MAX_BOUNCE_OFFSET_PERCENT = 0.1f;
    private static final float MAX_EMPTY_CHART_PERCENT = 0.25f;
    private static final int MAX_X_AXIS_LABEL_GAPS = 5;
    private static final int MIN_X_AXIS_LABEL_GAPS = 2;
    private static final float PAN_SPEED_COEFFICIENT = 2.0f;
    public static final String VERTICAL_GRID_LINE_IDENTIFIER = "vertical_grid_line";
    public static final String VOLUME_IDENTIFIER = "volume";
    private static final Ranges3<Float> WHOLE_ZOOM_RANGE = RangesKt.rangeTo(0.0f, 1.0f);
    private static final float X_AXIS_LABEL_CUTOFF_BOUND_START = 0.01f;
    private static final float X_AXIS_LABEL_OVERLAP_THRESHOLD = 0.125f;
    public static final int X_AXIS_MIN_NUM_OF_SCRUBBING_LABEL_GAPS = 10;
    private static final float X_AXIS_MIN_ZOOM_WIDTH = 0.05f;
    private static final float Y_AXIS_LABEL_CUTOFF_RANGE = 0.05f;
    private static final float Y_AXIS_ZOOM_PADDING_PERCENT = 0.2f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getPointTransformFunc$lambda$80(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public static final Ranges3<Float> validateXAxisZoomRange(Float f, Ranges3<Float> oldZoomRange, float f2, float f3) {
        Intrinsics.checkNotNullParameter(oldZoomRange, "oldZoomRange");
        return f != null ? m18611mapGestureToXAxisZoomRangeAndBounceOffsetxrVmA(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(0.0f))), 1.0f, f.floatValue(), oldZoomRange, 0.0f, f2, f3).getZoomRange() : oldZoomRange;
    }

    public static final <ActionT extends Parcelable> ChartGroup<ActionT> transform(ChartGroup<? extends ActionT> chartGroup, Ranges3<Float> xZoomRange, boolean z, List<ChartAxis> list, List<Point> list2) {
        boolean z2;
        List<ChartAxisLabel> labels;
        Intrinsics.checkNotNullParameter(chartGroup, "<this>");
        Intrinsics.checkNotNullParameter(xZoomRange, "xZoomRange");
        List<Point> pointsForYAxisZoomRangeCalculation = list2;
        Intrinsics.checkNotNullParameter(pointsForYAxisZoomRangeCalculation, "pointsForYAxisZoomRangeCalculation");
        List<ChartAxisLabel> dynamicChartGroupXAxisLabels = (!z || list == null) ? null : getDynamicChartGroupXAxisLabels(xZoomRange, list);
        List<Chart<ActionT>> charts = chartGroup.getCharts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(charts, 10));
        int i = 0;
        for (Object obj : charts) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Chart chart = (Chart) obj;
            boolean z3 = i == 0 && z;
            if (dynamicChartGroupXAxisLabels == null) {
                ChartAxis x_axis = chartGroup.getX_axis();
                if (x_axis != null) {
                    z2 = z;
                    labels = x_axis.getLabels();
                } else {
                    z2 = z;
                    labels = null;
                }
            } else {
                z2 = z;
                labels = dynamicChartGroupXAxisLabels;
            }
            arrayList.add(transform(chart, xZoomRange, z3, z2, labels, pointsForYAxisZoomRangeCalculation));
            pointsForYAxisZoomRangeCalculation = list2;
            i = i2;
        }
        ChartAxis x_axis2 = chartGroup.getX_axis();
        return ChartGroup.copy$default(chartGroup, arrayList, null, x_axis2 != null ? transform(x_axis2, xZoomRange, dynamicChartGroupXAxisLabels) : null, null, transform(chartGroup.getLegend_data(), xZoomRange), 10, null);
    }

    public static final ChartGroupDto transform(ChartGroupDto chartGroupDto, Ranges3<Float> xZoomRange, boolean z, List<ChartAxisDto> list, List<PointDto> list2) {
        boolean z2;
        List<ChartAxisLabelDto> labels;
        Intrinsics.checkNotNullParameter(chartGroupDto, "<this>");
        Intrinsics.checkNotNullParameter(xZoomRange, "xZoomRange");
        List<PointDto> pointsForYAxisZoomRangeCalculation = list2;
        Intrinsics.checkNotNullParameter(pointsForYAxisZoomRangeCalculation, "pointsForYAxisZoomRangeCalculation");
        List<ChartAxisLabelDto> protoDynamicChartGroupXAxisLabels = (!z || list == null) ? null : getProtoDynamicChartGroupXAxisLabels(xZoomRange, list);
        List<ChartDto> charts = chartGroupDto.getCharts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(charts, 10));
        int i = 0;
        for (Object obj : charts) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ChartDto chartDto = (ChartDto) obj;
            boolean z3 = i == 0 && z;
            if (protoDynamicChartGroupXAxisLabels == null) {
                ChartAxisDto x_axis = chartGroupDto.getX_axis();
                if (x_axis != null) {
                    z2 = z;
                    labels = x_axis.getLabels();
                } else {
                    z2 = z;
                    labels = null;
                }
            } else {
                z2 = z;
                labels = protoDynamicChartGroupXAxisLabels;
            }
            arrayList.add(transform(chartDto, xZoomRange, z3, z2, labels, pointsForYAxisZoomRangeCalculation));
            pointsForYAxisZoomRangeCalculation = list2;
            i = i2;
        }
        ChartAxisDto x_axis2 = chartGroupDto.getX_axis();
        return ChartGroupDto.copy$default(chartGroupDto, arrayList, null, x_axis2 != null ? transform(x_axis2, xZoomRange, protoDynamicChartGroupXAxisLabels) : null, null, transformDto(chartGroupDto.getLegend_data(), xZoomRange), null, 42, null);
    }

    private static final <ActionT extends Parcelable> Chart<ActionT> transform(Chart<? extends ActionT> chart, Ranges3<Float> ranges3, boolean z, boolean z2, List<ChartAxisLabel> list, List<Point> list2) {
        Collection collectionEmptyList;
        Collection collectionEmptyList2;
        List<ChartAxisLabel> labels;
        Ranges3<Float> yAxisZoomRange = getYAxisZoomRange(ranges3, z, list2);
        ChartAxis y_axis = chart.getY_axis();
        List<ChartAxisLabel> dynamicChartYAxisLabels = (!z || y_axis == null) ? null : getDynamicChartYAxisLabels(y_axis, yAxisZoomRange);
        int i = 10;
        if (z2) {
            if (dynamicChartYAxisLabels == null) {
                ChartAxis y_axis2 = chart.getY_axis();
                labels = y_axis2 != null ? y_axis2.getLabels() : null;
            } else {
                labels = dynamicChartYAxisLabels;
            }
            if (labels != null) {
                List<ChartAxisLabel> list3 = labels;
                collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    collectionEmptyList.add(toGridline((ChartAxisLabel) it.next(), AxisType.f3954Y));
                }
            } else {
                collectionEmptyList = CollectionsKt.emptyList();
            }
        } else {
            collectionEmptyList = CollectionsKt.emptyList();
        }
        if (!z2 || list == null) {
            collectionEmptyList2 = CollectionsKt.emptyList();
        } else {
            List<ChartAxisLabel> list4 = list;
            collectionEmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                collectionEmptyList2.add(toGridline((ChartAxisLabel) it2.next(), AxisType.f3953X));
            }
        }
        List<Line> listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) chart.getLines(), (Iterable) collectionEmptyList), (Iterable) collectionEmptyList2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        for (Line line : listPlus) {
            List<Segment> segments = line.getSegments();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, i));
            for (Segment segment : segments) {
                List<Point> points = segment.getPoints();
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                for (Object obj : points) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Point point = (Point) obj;
                    Point point2 = (Point) CollectionsKt.getOrNull(segment.getPoints(), i2 - 1);
                    Point point3 = (Point) CollectionsKt.getOrNull(segment.getPoints(), i3);
                    boolean z3 = true;
                    boolean z4 = (point2 == null || point2.getX() < ranges3.getStart().floatValue()) && point.getX() < ranges3.getStart().floatValue() && (point3 == null || point3.getX() < ranges3.getStart().floatValue());
                    if ((point2 != null && point2.getX() <= ranges3.getEndInclusive().floatValue()) || point.getX() <= ranges3.getEndInclusive().floatValue() || (point3 != null && point3.getX() <= ranges3.getEndInclusive().floatValue())) {
                        z3 = false;
                    }
                    if (!z4 && !z3) {
                        arrayList3.add(obj);
                    }
                    i2 = i3;
                }
                arrayList2.add(Segment.copy$default(segment, arrayList3, null, 2, null));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (!((Segment) obj2).getPoints().isEmpty()) {
                    arrayList4.add(obj2);
                }
            }
            arrayList.add(Line.copy$default(line, null, arrayList4, null, false, 13, null));
            i = 10;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!((Line) obj3).getSegments().isEmpty()) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(transform((Line) it3.next(), ranges3, yAxisZoomRange));
        }
        ChartAxis x_axis = chart.getX_axis();
        ChartAxis chartAxisTransform = x_axis != null ? transform(x_axis, ranges3, (List<ChartAxisLabel>) null) : null;
        ChartAxis y_axis3 = chart.getY_axis();
        ChartAxis chartAxisTransform2 = y_axis3 != null ? transform(y_axis3, yAxisZoomRange, dynamicChartYAxisLabels) : null;
        Map<String, List<ChartLegendItem>> mapTransform = transform(chart.getLegend_data(), ranges3);
        List<ChartFill> fills = chart.getFills();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : fills) {
            List<Point> points2 = ((ChartFill) obj4).getPoints();
            boolean z5 = points2 instanceof Collection;
            if (!z5 || !points2.isEmpty()) {
                Iterator<T> it4 = points2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (((Point) it4.next()).getX() >= ranges3.getStart().floatValue()) {
                        if (!z5 || !points2.isEmpty()) {
                            Iterator<T> it5 = points2.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                if (((Point) it5.next()).getX() <= ranges3.getEndInclusive().floatValue()) {
                                    arrayList7.add(obj4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
        Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            arrayList8.add(transform((ChartFill) it6.next(), ranges3, yAxisZoomRange));
        }
        return Chart.copy$default(chart, null, null, arrayList6, chartAxisTransform, chartAxisTransform2, mapTransform, arrayList8, null, 131, null);
    }

    private static final ChartDto transform(ChartDto chartDto, Ranges3<Float> ranges3, boolean z, boolean z2, List<ChartAxisLabelDto> list, List<PointDto> list2) {
        Collection collectionEmptyList;
        Collection collectionEmptyList2;
        List<ChartAxisLabelDto> labels;
        Ranges3<Float> protoYAxisZoomRange = getProtoYAxisZoomRange(ranges3, z, list2);
        ChartAxisDto y_axis = chartDto.getY_axis();
        List<ChartAxisLabelDto> dynamicChartYAxisLabels = (!z || y_axis == null) ? null : getDynamicChartYAxisLabels(y_axis, protoYAxisZoomRange);
        int i = 10;
        if (z2) {
            if (dynamicChartYAxisLabels == null) {
                ChartAxisDto y_axis2 = chartDto.getY_axis();
                labels = y_axis2 != null ? y_axis2.getLabels() : null;
            } else {
                labels = dynamicChartYAxisLabels;
            }
            if (labels != null) {
                List<ChartAxisLabelDto> list3 = labels;
                collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    collectionEmptyList.add(toGridline((ChartAxisLabelDto) it.next(), AxisType.f3954Y));
                }
            } else {
                collectionEmptyList = CollectionsKt.emptyList();
            }
        } else {
            collectionEmptyList = CollectionsKt.emptyList();
        }
        if (!z2 || list == null) {
            collectionEmptyList2 = CollectionsKt.emptyList();
        } else {
            List<ChartAxisLabelDto> list4 = list;
            collectionEmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                collectionEmptyList2.add(toGridline((ChartAxisLabelDto) it2.next(), AxisType.f3953X));
            }
        }
        List<LineDto> listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) chartDto.getLines(), (Iterable) collectionEmptyList), (Iterable) collectionEmptyList2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        for (LineDto lineDto : listPlus) {
            List<SegmentDto> segments = lineDto.getSegments();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, i));
            for (SegmentDto segmentDto : segments) {
                List<PointDto> points = segmentDto.getPoints();
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                for (Object obj : points) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    PointDto pointDto = (PointDto) obj;
                    PointDto pointDto2 = (PointDto) CollectionsKt.getOrNull(segmentDto.getPoints(), i2 - 1);
                    PointDto pointDto3 = (PointDto) CollectionsKt.getOrNull(segmentDto.getPoints(), i3);
                    boolean z3 = true;
                    boolean z4 = (pointDto2 == null || pointDto2.getX() < ranges3.getStart().floatValue()) && pointDto.getX() < ranges3.getStart().floatValue() && (pointDto3 == null || pointDto3.getX() < ranges3.getStart().floatValue());
                    if ((pointDto2 != null && pointDto2.getX() <= ranges3.getEndInclusive().floatValue()) || pointDto.getX() <= ranges3.getEndInclusive().floatValue() || (pointDto3 != null && pointDto3.getX() <= ranges3.getEndInclusive().floatValue())) {
                        z3 = false;
                    }
                    if (!z4 && !z3) {
                        arrayList3.add(obj);
                    }
                    i2 = i3;
                }
                arrayList2.add(SegmentDto.copy$default(segmentDto, arrayList3, null, 2, null));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (!((SegmentDto) obj2).getPoints().isEmpty()) {
                    arrayList4.add(obj2);
                }
            }
            arrayList.add(LineDto.copy$default(lineDto, null, arrayList4, null, false, null, 29, null));
            i = 10;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!((LineDto) obj3).getSegments().isEmpty()) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(transform((LineDto) it3.next(), ranges3, protoYAxisZoomRange));
        }
        ChartAxisDto x_axis = chartDto.getX_axis();
        ChartAxisDto chartAxisDtoTransform = x_axis != null ? transform(x_axis, ranges3, (List<ChartAxisLabelDto>) null) : null;
        ChartAxisDto y_axis3 = chartDto.getY_axis();
        ChartAxisDto chartAxisDtoTransform2 = y_axis3 != null ? transform(y_axis3, protoYAxisZoomRange, dynamicChartYAxisLabels) : null;
        Map<String, ChartLegendItemListDto> mapTransformDto = transformDto(chartDto.getLegend_data(), ranges3);
        List<ChartFillDto> fills = chartDto.getFills();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : fills) {
            List<PointDto> points2 = ((ChartFillDto) obj4).getPoints();
            boolean z5 = points2 instanceof Collection;
            if (!z5 || !points2.isEmpty()) {
                Iterator<T> it4 = points2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (((PointDto) it4.next()).getX() >= ranges3.getStart().floatValue()) {
                        if (!z5 || !points2.isEmpty()) {
                            Iterator<T> it5 = points2.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                if (((PointDto) it5.next()).getX() <= ranges3.getEndInclusive().floatValue()) {
                                    arrayList7.add(obj4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
        Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            arrayList8.add(transform((ChartFillDto) it6.next(), ranges3, protoYAxisZoomRange));
        }
        return ChartDto.copy$default(chartDto, null, null, arrayList6, chartAxisDtoTransform, chartAxisDtoTransform2, mapTransformDto, arrayList8, null, null, 387, null);
    }

    public static final List<ChartAxisLabel> getDynamicChartGroupXAxisLabels(Ranges3<Float> xZoomRange, List<ChartAxis> chartGroupZoomXAxes) {
        Intrinsics.checkNotNullParameter(xZoomRange, "xZoomRange");
        Intrinsics.checkNotNullParameter(chartGroupZoomXAxes, "chartGroupZoomXAxes");
        int i = 0;
        int i2 = 0;
        for (Object obj : chartGroupZoomXAxes) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<ChartAxisLabel> labels = ((ChartAxis) obj).getLabels();
            if (labels.size() >= 2) {
                float value = (((ChartAxisLabel) CollectionsKt.last((List) labels)).getValue() - ((ChartAxisLabel) CollectionsKt.first((List) labels)).getValue()) / (labels.size() - 1);
                float fFloatValue = xZoomRange.getEndInclusive().floatValue() - xZoomRange.getStart().floatValue();
                float f = 2 * value;
                float f2 = 5 * value;
                if (fFloatValue > f || i2 == chartGroupZoomXAxes.size() - 1) {
                    if ((fFloatValue > f || i2 != chartGroupZoomXAxes.size() - 1) && i2 != 0 && (f > fFloatValue || fFloatValue > f2)) {
                        int iCoerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt(Math.pow(2.0d, MathKt.roundToInt((float) Math.ceil(MathKt.log2(fFloatValue / f2))))), 1);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : labels) {
                            int i4 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (i % iCoerceAtLeast == 0) {
                                arrayList.add(obj2);
                            }
                            i = i4;
                        }
                        labels = arrayList;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (ChartAxisLabel chartAxisLabel : labels) {
                        if (arrayList2.isEmpty()) {
                            arrayList2.add(chartAxisLabel);
                        } else if (chartAxisLabel.getValue() - ((ChartAxisLabel) CollectionsKt.last((List) arrayList2)).getValue() > X_AXIS_LABEL_OVERLAP_THRESHOLD * fFloatValue) {
                            arrayList2.add(chartAxisLabel);
                        }
                    }
                    float fMax = Math.max(xZoomRange.getStart().floatValue(), fFloatValue * 0.01f);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        float fFloatValue2 = xZoomRange.getEndInclusive().floatValue();
                        float value2 = ((ChartAxisLabel) obj3).getValue();
                        if (fMax <= value2 && value2 <= fFloatValue2) {
                            arrayList3.add(obj3);
                        }
                    }
                    return arrayList3;
                }
            }
            i2 = i3;
        }
        return null;
    }

    public static final List<ChartAxisLabelDto> getProtoDynamicChartGroupXAxisLabels(Ranges3<Float> xZoomRange, List<ChartAxisDto> chartGroupZoomXAxes) {
        Intrinsics.checkNotNullParameter(xZoomRange, "xZoomRange");
        Intrinsics.checkNotNullParameter(chartGroupZoomXAxes, "chartGroupZoomXAxes");
        int i = 0;
        int i2 = 0;
        for (Object obj : chartGroupZoomXAxes) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<ChartAxisLabelDto> labels = ((ChartAxisDto) obj).getLabels();
            if (labels.size() >= 2) {
                float value = (((ChartAxisLabelDto) CollectionsKt.last((List) labels)).getValue() - ((ChartAxisLabelDto) CollectionsKt.first((List) labels)).getValue()) / (labels.size() - 1);
                float fFloatValue = xZoomRange.getEndInclusive().floatValue() - xZoomRange.getStart().floatValue();
                float f = 2 * value;
                float f2 = 5 * value;
                if (fFloatValue > f || i2 == chartGroupZoomXAxes.size() - 1) {
                    if ((fFloatValue > f || i2 != chartGroupZoomXAxes.size() - 1) && i2 != 0 && (f > fFloatValue || fFloatValue > f2)) {
                        int iCoerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt(Math.pow(2.0d, MathKt.roundToInt((float) Math.ceil(MathKt.log2(fFloatValue / f2))))), 1);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : labels) {
                            int i4 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (i % iCoerceAtLeast == 0) {
                                arrayList.add(obj2);
                            }
                            i = i4;
                        }
                        labels = arrayList;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (ChartAxisLabelDto chartAxisLabelDto : labels) {
                        if (arrayList2.isEmpty()) {
                            arrayList2.add(chartAxisLabelDto);
                        } else if (chartAxisLabelDto.getValue() - ((ChartAxisLabelDto) CollectionsKt.last((List) arrayList2)).getValue() > X_AXIS_LABEL_OVERLAP_THRESHOLD * fFloatValue) {
                            arrayList2.add(chartAxisLabelDto);
                        }
                    }
                    float fMax = Math.max(xZoomRange.getStart().floatValue(), fFloatValue * 0.01f);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        float fFloatValue2 = xZoomRange.getEndInclusive().floatValue();
                        float value2 = ((ChartAxisLabelDto) obj3).getValue();
                        if (fMax <= value2 && value2 <= fFloatValue2) {
                            arrayList3.add(obj3);
                        }
                    }
                    return arrayList3;
                }
            }
            i2 = i3;
        }
        return null;
    }

    public static final List<ChartAxisLabel> getDynamicChartYAxisLabels(ChartAxis yAxis, Ranges3<Float> yZoomRange) {
        Tuples2 tuples2M3642to;
        String str;
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(yZoomRange, "yZoomRange");
        ChartAxisRange range = yAxis.getRange();
        if (range == null) {
            return null;
        }
        boolean z = range instanceof MoneyAxisRange;
        if (z) {
            MoneyAxisRange moneyAxisRange = (MoneyAxisRange) range;
            tuples2M3642to = Tuples4.m3642to(Float.valueOf(moneyAxisRange.getMin_value().getAmount().floatValue()), Float.valueOf(moneyAxisRange.getMax_value().getAmount().floatValue()));
        } else {
            if (!(range instanceof UnitlessAxisRange)) {
                throw new NoWhenBranchMatchedException();
            }
            UnitlessAxisRange unitlessAxisRange = (UnitlessAxisRange) range;
            tuples2M3642to = Tuples4.m3642to(Float.valueOf(unitlessAxisRange.getMin_value()), Float.valueOf(unitlessAxisRange.getMax_value()));
        }
        float fFloatValue = ((Number) tuples2M3642to.component1()).floatValue();
        float fFloatValue2 = ((Number) tuples2M3642to.component2()).floatValue() - fFloatValue;
        float fFloatValue3 = (yZoomRange.getEndInclusive().floatValue() - yZoomRange.getStart().floatValue()) * fFloatValue2;
        if (fFloatValue2 < FLOAT_ERROR || fFloatValue3 < FLOAT_ERROR) {
            return null;
        }
        float fPow = (float) Math.pow(10.0f, (float) Math.floor((float) Math.log10(fFloatValue3)));
        float f = 5;
        if (fFloatValue3 <= f * fPow) {
            float f2 = 2;
            fPow = fFloatValue3 > f2 * fPow ? fPow / f2 : fPow / f;
        }
        float fFloatValue4 = (yZoomRange.getEndInclusive().floatValue() - yZoomRange.getStart().floatValue()) * 0.05f;
        Ranges3<Float> ranges3RangeTo = RangesKt.rangeTo(yZoomRange.getStart().floatValue() + fFloatValue4, yZoomRange.getEndInclusive().floatValue() - fFloatValue4);
        PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(MathKt.roundToInt((float) Math.floor(fFloatValue / fPow)), MathKt.roundToInt((float) Math.ceil(r2 / fPow)));
        ArrayList arrayList = new ArrayList();
        for (Integer num : primitiveRanges2) {
            float fIntValue = num.intValue() * fPow;
            float f3 = (fIntValue - fFloatValue) / fFloatValue2;
            if (z && fIntValue >= 0.0f && ranges3RangeTo.contains(Float.valueOf(f3))) {
                arrayList.add(num);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            float fIntValue2 = ((Number) it.next()).intValue() * fPow;
            float f4 = (fIntValue2 - fFloatValue) / fFloatValue2;
            Color color = Color.FG2;
            ThemedColor themedColor = new ThemedColor(color, color);
            TextStyle textStyle = TextStyle.TEXT_SMALL;
            if (z) {
                str = Formats.getPriceFormat().format(Float.valueOf(fIntValue2));
            } else {
                if (!(range instanceof UnitlessAxisRange)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = Formats.getNoSymbolWithHundredthDecimalPercentFormat().format(Float.valueOf(fIntValue2));
            }
            arrayList2.add(new ChartAxisLabel(f4, themedColor, textStyle, str));
        }
        return arrayList2;
    }

    public static final List<ChartAxisLabelDto> getDynamicChartYAxisLabels(ChartAxisDto yAxis, Ranges3<Float> yZoomRange) {
        ChartAxisRangeDto.RangeDetailsDto range_details;
        Tuples2 tuples2M3642to;
        String str;
        IdlDecimal amount;
        BigDecimal bigDecimalOrNull;
        IdlDecimal amount2;
        BigDecimal bigDecimalOrNull2;
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(yZoomRange, "yZoomRange");
        ChartAxisRangeDto range = yAxis.getRange();
        if (range != null && (range_details = range.getRange_details()) != null) {
            boolean z = range_details instanceof ChartAxisRangeDto.RangeDetailsDto.Money;
            if (z) {
                ChartAxisRangeDto.RangeDetailsDto.Money money = (ChartAxisRangeDto.RangeDetailsDto.Money) range_details;
                MoneyDto min_value = money.getValue().getMin_value();
                Float fValueOf = (min_value == null || (amount2 = min_value.getAmount()) == null || (bigDecimalOrNull2 = amount2.toBigDecimalOrNull()) == null) ? null : Float.valueOf(bigDecimalOrNull2.floatValue());
                MoneyDto max_value = money.getValue().getMax_value();
                tuples2M3642to = Tuples4.m3642to(fValueOf, (max_value == null || (amount = max_value.getAmount()) == null || (bigDecimalOrNull = amount.toBigDecimalOrNull()) == null) ? null : Float.valueOf(bigDecimalOrNull.floatValue()));
            } else if (range_details instanceof ChartAxisRangeDto.RangeDetailsDto.Unitless) {
                ChartAxisRangeDto.RangeDetailsDto.Unitless unitless = (ChartAxisRangeDto.RangeDetailsDto.Unitless) range_details;
                tuples2M3642to = Tuples4.m3642to(Float.valueOf(unitless.getValue().getMin_value()), Float.valueOf(unitless.getValue().getMax_value()));
            }
            Float f = (Float) tuples2M3642to.component1();
            Float f2 = (Float) tuples2M3642to.component2();
            if (f != null && f2 != null) {
                float fFloatValue = f2.floatValue() - f.floatValue();
                float fFloatValue2 = (yZoomRange.getEndInclusive().floatValue() - yZoomRange.getStart().floatValue()) * fFloatValue;
                if (fFloatValue >= FLOAT_ERROR && fFloatValue2 >= FLOAT_ERROR) {
                    float fPow = (float) Math.pow(10.0f, (float) Math.floor((float) Math.log10(fFloatValue2)));
                    float f3 = 5;
                    if (fFloatValue2 <= f3 * fPow) {
                        float f4 = 2;
                        fPow = fFloatValue2 > f4 * fPow ? fPow / f4 : fPow / f3;
                    }
                    float fFloatValue3 = (yZoomRange.getEndInclusive().floatValue() - yZoomRange.getStart().floatValue()) * 0.05f;
                    Ranges3<Float> ranges3RangeTo = RangesKt.rangeTo(yZoomRange.getStart().floatValue() + fFloatValue3, yZoomRange.getEndInclusive().floatValue() - fFloatValue3);
                    PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(MathKt.roundToInt((float) Math.floor(f.floatValue() / fPow)), MathKt.roundToInt((float) Math.ceil(f2.floatValue() / fPow)));
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : primitiveRanges2) {
                        float fIntValue = num.intValue() * fPow;
                        float fFloatValue4 = (fIntValue - f.floatValue()) / (f2.floatValue() - f.floatValue());
                        if (z && fIntValue >= 0.0f && ranges3RangeTo.contains(Float.valueOf(fFloatValue4))) {
                            arrayList.add(num);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        float fIntValue2 = ((Number) it.next()).intValue() * fPow;
                        float fFloatValue5 = (fIntValue2 - f.floatValue()) / (f2.floatValue() - f.floatValue());
                        ColorDto colorDto = ColorDto.COLOR_FG2;
                        ThemedColorDto themedColorDto = new ThemedColorDto(colorDto, colorDto);
                        TextStyleDto textStyleDto = TextStyleDto.TEXT_STYLE_TEXT_SMALL;
                        if (z) {
                            str = Formats.getPriceFormat().format(Float.valueOf(fIntValue2));
                        } else {
                            if (!(range_details instanceof ChartAxisRangeDto.RangeDetailsDto.Unitless)) {
                                return null;
                            }
                            str = Formats.getNoSymbolWithHundredthDecimalPercentFormat().format(Float.valueOf(fIntValue2));
                        }
                        arrayList2.add(new ChartAxisLabelDto(fFloatValue5, themedColorDto, textStyleDto, str));
                    }
                    return arrayList2;
                }
            }
        }
        return null;
    }

    public static final Line toGridline(ChartAxisLabel chartAxisLabel, AxisType type2) {
        String str;
        List listListOf;
        List listListOf2;
        Intrinsics.checkNotNullParameter(chartAxisLabel, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        AxisType axisType = AxisType.f3953X;
        if (type2 == axisType) {
            str = VERTICAL_GRID_LINE_IDENTIFIER;
        } else {
            str = HORIZONTAL_GRID_LINE_IDENTIFIER;
        }
        if (type2 == axisType) {
            listListOf = CollectionsKt.listOf((Object[]) new Point[]{new Point(chartAxisLabel.getValue(), 0.0f, null, 4, null), new Point(chartAxisLabel.getValue(), 1.0f, null, 4, null)});
        } else {
            listListOf = CollectionsKt.listOf((Object[]) new Point[]{new Point(0.0f, chartAxisLabel.getValue(), null, 4, null), new Point(1.0f, chartAxisLabel.getValue(), null, 4, null)});
        }
        Color color = Color.FG3;
        Segment segment = new Segment(listListOf, new StylesWithStates(new Style(new ThemedColor(color, color), 1.0f, new DottedLineType(0.03f), null, 8, null), null, null, 6, null));
        if (type2 == axisType) {
            listListOf2 = CollectionsKt.listOf((Object[]) new Point[]{new Point(chartAxisLabel.getValue(), 1.0f, null, 4, null), new Point(chartAxisLabel.getValue() + 1.0f, 0.0f, null, 4, null)});
        } else {
            listListOf2 = CollectionsKt.listOf((Object[]) new Point[]{new Point(1.0f, chartAxisLabel.getValue(), null, 4, null), new Point(0.0f, chartAxisLabel.getValue() + 1.0f, null, 4, null)});
        }
        Color color2 = Color.f5843BG;
        return new Line(str, CollectionsKt.listOf((Object[]) new Segment[]{segment, new Segment(listListOf2, new StylesWithStates(new Style(new ThemedColor(color2, color2), 0.0f, new DottedLineType(0.03f), null, 8, null), null, null, 6, null))}), Direction.f5855UP, false);
    }

    public static final LineDto toGridline(ChartAxisLabelDto chartAxisLabelDto, AxisType type2) {
        String str;
        List listListOf;
        List listListOf2;
        Intrinsics.checkNotNullParameter(chartAxisLabelDto, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        AxisType axisType = AxisType.f3953X;
        if (type2 == axisType) {
            str = VERTICAL_GRID_LINE_IDENTIFIER;
        } else {
            str = HORIZONTAL_GRID_LINE_IDENTIFIER;
        }
        if (type2 == axisType) {
            listListOf = CollectionsKt.listOf((Object[]) new PointDto[]{new PointDto(chartAxisLabelDto.getValue(), 0.0f, null, 4, null), new PointDto(chartAxisLabelDto.getValue(), 1.0f, null, 4, null)});
        } else {
            listListOf = CollectionsKt.listOf((Object[]) new PointDto[]{new PointDto(0.0f, chartAxisLabelDto.getValue(), null, 4, null), new PointDto(1.0f, chartAxisLabelDto.getValue(), null, 4, null)});
        }
        ColorDto colorDto = ColorDto.COLOR_FG3;
        SegmentDto segmentDto = new SegmentDto((List<PointDto>) listListOf, new StylesWithStatesDto(new StyleDto(new ThemedColorDto(colorDto, colorDto), 1.0f, new LineTypeDto(new LineTypeDto.StyleDetailsDto.Dotted(new DottedLineTypeDto(0.03f))), null, 8, null), null, null, 6, null));
        if (type2 == axisType) {
            listListOf2 = CollectionsKt.listOf((Object[]) new PointDto[]{new PointDto(chartAxisLabelDto.getValue(), 1.0f, null, 4, null), new PointDto(chartAxisLabelDto.getValue() + 1.0f, 0.0f, null, 4, null)});
        } else {
            listListOf2 = CollectionsKt.listOf((Object[]) new PointDto[]{new PointDto(1.0f, chartAxisLabelDto.getValue(), null, 4, null), new PointDto(0.0f, chartAxisLabelDto.getValue() + 1.0f, null, 4, null)});
        }
        ColorDto colorDto2 = ColorDto.COLOR_BG;
        return new LineDto(str, CollectionsKt.listOf((Object[]) new SegmentDto[]{segmentDto, new SegmentDto((List<PointDto>) listListOf2, new StylesWithStatesDto(new StyleDto(new ThemedColorDto(colorDto2, colorDto2), 0.0f, new LineTypeDto(new LineTypeDto.StyleDetailsDto.Dotted(new DottedLineTypeDto(0.03f))), null, 8, null), null, null, 6, null))}), DirectionDto.DIRECTION_UP, false, null, 16, null);
    }

    private static final Line transform(Line line, Ranges3<Float> ranges3, Ranges3<Float> ranges32) {
        Function1<Float, Float> pointTransformFunc;
        Line lineCopy$default = Line.copy$default(line, null, CollectionsKt.emptyList(), null, false, 13, null);
        Function1<Float, Float> pointTransformFunc2 = getPointTransformFunc(ranges3);
        if (pointTransformFunc2 == null || (pointTransformFunc = getPointTransformFunc(ranges32)) == null) {
            return lineCopy$default;
        }
        List<Segment> segments = line.getSegments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, 10));
        for (Segment segment : segments) {
            List<Point> points = segment.getPoints();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
            for (Point point : points) {
                arrayList2.add(Point.copy$default(point, pointTransformFunc2.invoke(Float.valueOf(point.getX())).floatValue(), pointTransformFunc.invoke(Float.valueOf(point.getY())).floatValue(), null, 4, null));
            }
            arrayList.add(Segment.copy$default(segment, arrayList2, null, 2, null));
        }
        return Line.copy$default(line, null, arrayList, null, false, 13, null);
    }

    private static final LineDto transform(LineDto lineDto, Ranges3<Float> ranges3, Ranges3<Float> ranges32) {
        Function1<Float, Float> pointTransformFunc;
        LineDto lineDtoCopy$default = LineDto.copy$default(lineDto, null, CollectionsKt.emptyList(), null, false, null, 29, null);
        Function1<Float, Float> pointTransformFunc2 = getPointTransformFunc(ranges3);
        if (pointTransformFunc2 == null || (pointTransformFunc = getPointTransformFunc(ranges32)) == null) {
            return lineDtoCopy$default;
        }
        List<SegmentDto> segments = lineDto.getSegments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, 10));
        for (SegmentDto segmentDto : segments) {
            List<PointDto> points = segmentDto.getPoints();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
            for (PointDto pointDto : points) {
                arrayList2.add(PointDto.copy$default(pointDto, pointTransformFunc2.invoke(Float.valueOf(pointDto.getX())).floatValue(), pointTransformFunc.invoke(Float.valueOf(pointDto.getY())).floatValue(), null, 4, null));
            }
            arrayList.add(SegmentDto.copy$default(segmentDto, arrayList2, null, 2, null));
        }
        return LineDto.copy$default(lineDto, null, arrayList, null, false, null, 29, null);
    }

    private static final ChartFill transform(ChartFill chartFill, Ranges3<Float> ranges3, Ranges3<Float> ranges32) {
        Function1<Float, Float> pointTransformFunc;
        ArrayList arrayList;
        ChartFill chartFillCopy$default = ChartFill.copy$default(chartFill, null, null, CollectionsKt.emptyList(), 3, null);
        Function1<Float, Float> pointTransformFunc2 = getPointTransformFunc(ranges3);
        if (pointTransformFunc2 == null || (pointTransformFunc = getPointTransformFunc(ranges32)) == null) {
            return chartFillCopy$default;
        }
        List<Point> points = chartFill.getPoints();
        ArrayList<Point> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
        for (Point point : points) {
            arrayList2.add(Point.copy$default(point, pointTransformFunc2.invoke(Float.valueOf(point.getX())).floatValue(), pointTransformFunc.invoke(Float.valueOf(point.getY())).floatValue(), null, 4, null));
        }
        if (Intrinsics.areEqual(chartFill.getIdentifier(), CANDLESTICK_WICK_IDENTIFIER)) {
            Iterator it = arrayList2.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            float x = ((Point) it.next()).getX();
            while (it.hasNext()) {
                x = Math.min(x, ((Point) it.next()).getX());
            }
            Iterator it2 = arrayList2.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            float x2 = ((Point) it2.next()).getX();
            while (it2.hasNext()) {
                x2 = Math.max(x2, ((Point) it2.next()).getX());
            }
            float f = (x + x2) / 2.0f;
            if (x2 - x > 0.002f) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (Point pointCopy$default : arrayList2) {
                    if (Math.abs(pointCopy$default.getX() - x) < FLOAT_ERROR) {
                        pointCopy$default = Point.copy$default(pointCopy$default, f - 0.001f, 0.0f, null, 6, null);
                    } else if (Math.abs(pointCopy$default.getX() - x2) < FLOAT_ERROR) {
                        pointCopy$default = Point.copy$default(pointCopy$default, f + 0.001f, 0.0f, null, 6, null);
                    }
                    arrayList3.add(pointCopy$default);
                }
                arrayList2 = arrayList3;
            }
        }
        if (Intrinsics.areEqual(chartFill.getIdentifier(), CANDLESTICK_DOJI_BODY_IDENTIFIER)) {
            Iterator it3 = arrayList2.iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            float y = ((Point) it3.next()).getY();
            while (it3.hasNext()) {
                y = Math.min(y, ((Point) it3.next()).getY());
            }
            Iterator it4 = arrayList2.iterator();
            if (!it4.hasNext()) {
                throw new NoSuchElementException();
            }
            float y2 = ((Point) it4.next()).getY();
            while (it4.hasNext()) {
                y2 = Math.max(y2, ((Point) it4.next()).getY());
            }
            float f2 = (y + y2) / 2.0f;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (Point pointCopy$default2 : arrayList2) {
                if (Math.abs(pointCopy$default2.getY() - y) < FLOAT_ERROR) {
                    pointCopy$default2 = Point.copy$default(pointCopy$default2, 0.0f, f2 - 0.001f, null, 5, null);
                } else if (Math.abs(pointCopy$default2.getY() - y2) < FLOAT_ERROR) {
                    pointCopy$default2 = Point.copy$default(pointCopy$default2, 0.0f, f2 + 0.001f, null, 5, null);
                }
                arrayList4.add(pointCopy$default2);
            }
            arrayList2 = arrayList4;
        }
        if (isVolumeBar(chartFill)) {
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            int i = 0;
            for (Object obj : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList5.add(Point.copy$default((Point) obj, 0.0f, chartFill.getPoints().get(i).getY(), null, 5, null));
                i = i2;
            }
            arrayList = arrayList5;
        } else {
            arrayList = arrayList2;
        }
        return ChartFill.copy$default(chartFill, null, null, arrayList, 3, null);
    }

    private static final ChartFillDto transform(ChartFillDto chartFillDto, Ranges3<Float> ranges3, Ranges3<Float> ranges32) {
        Function1<Float, Float> pointTransformFunc;
        ArrayList arrayList;
        ChartFillDto chartFillDtoCopy$default = ChartFillDto.copy$default(chartFillDto, null, null, CollectionsKt.emptyList(), null, 11, null);
        Function1<Float, Float> pointTransformFunc2 = getPointTransformFunc(ranges3);
        if (pointTransformFunc2 == null || (pointTransformFunc = getPointTransformFunc(ranges32)) == null) {
            return chartFillDtoCopy$default;
        }
        List<PointDto> points = chartFillDto.getPoints();
        ArrayList<PointDto> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
        for (PointDto pointDto : points) {
            arrayList2.add(PointDto.copy$default(pointDto, pointTransformFunc2.invoke(Float.valueOf(pointDto.getX())).floatValue(), pointTransformFunc.invoke(Float.valueOf(pointDto.getY())).floatValue(), null, 4, null));
        }
        if (Intrinsics.areEqual(chartFillDto.getIdentifier(), CANDLESTICK_WICK_IDENTIFIER)) {
            Iterator it = arrayList2.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            float x = ((PointDto) it.next()).getX();
            while (it.hasNext()) {
                x = Math.min(x, ((PointDto) it.next()).getX());
            }
            Iterator it2 = arrayList2.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            float x2 = ((PointDto) it2.next()).getX();
            while (it2.hasNext()) {
                x2 = Math.max(x2, ((PointDto) it2.next()).getX());
            }
            float f = (x + x2) / 2.0f;
            if (x2 - x > 0.002f) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (PointDto pointDtoCopy$default : arrayList2) {
                    if (Math.abs(pointDtoCopy$default.getX() - x) < FLOAT_ERROR) {
                        pointDtoCopy$default = PointDto.copy$default(pointDtoCopy$default, f - 0.001f, 0.0f, null, 6, null);
                    } else if (Math.abs(pointDtoCopy$default.getX() - x2) < FLOAT_ERROR) {
                        pointDtoCopy$default = PointDto.copy$default(pointDtoCopy$default, f + 0.001f, 0.0f, null, 6, null);
                    }
                    arrayList3.add(pointDtoCopy$default);
                }
                arrayList2 = arrayList3;
            }
        }
        if (Intrinsics.areEqual(chartFillDto.getIdentifier(), CANDLESTICK_DOJI_BODY_IDENTIFIER)) {
            Iterator it3 = arrayList2.iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            float y = ((PointDto) it3.next()).getY();
            while (it3.hasNext()) {
                y = Math.min(y, ((PointDto) it3.next()).getY());
            }
            Iterator it4 = arrayList2.iterator();
            if (!it4.hasNext()) {
                throw new NoSuchElementException();
            }
            float y2 = ((PointDto) it4.next()).getY();
            while (it4.hasNext()) {
                y2 = Math.max(y2, ((PointDto) it4.next()).getY());
            }
            float f2 = (y + y2) / 2.0f;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (PointDto pointDtoCopy$default2 : arrayList2) {
                if (Math.abs(pointDtoCopy$default2.getY() - y) < FLOAT_ERROR) {
                    pointDtoCopy$default2 = PointDto.copy$default(pointDtoCopy$default2, 0.0f, f2 - 0.001f, null, 5, null);
                } else if (Math.abs(pointDtoCopy$default2.getY() - y2) < FLOAT_ERROR) {
                    pointDtoCopy$default2 = PointDto.copy$default(pointDtoCopy$default2, 0.0f, f2 + 0.001f, null, 5, null);
                }
                arrayList4.add(pointDtoCopy$default2);
            }
            arrayList2 = arrayList4;
        }
        if (isVolumeBar(chartFillDto)) {
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            int i = 0;
            for (Object obj : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList5.add(PointDto.copy$default((PointDto) obj, 0.0f, chartFillDto.getPoints().get(i).getY(), null, 5, null));
                i = i2;
            }
            arrayList = arrayList5;
        } else {
            arrayList = arrayList2;
        }
        return ChartFillDto.copy$default(chartFillDto, null, null, arrayList, null, 11, null);
    }

    private static final Map<String, List<ChartLegendItem>> transform(Map<String, ? extends List<ChartLegendItem>> map, Ranges3<Float> ranges3) {
        Map<String, List<ChartLegendItem>> mapEmptyMap = MapsKt.emptyMap();
        Function1<Float, Float> pointTransformFunc = getPointTransformFunc(ranges3);
        if (pointTransformFunc == null) {
            return mapEmptyMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends List<ChartLegendItem>> entry : map.entrySet()) {
            if (ranges3.contains(Float.valueOf(Float.parseFloat(entry.getKey())))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(String.valueOf(pointTransformFunc.invoke(Float.valueOf(Float.parseFloat((String) entry2.getKey()))).floatValue()), entry2.getValue());
        }
        return linkedHashMap2;
    }

    private static final Map<String, ChartLegendItemListDto> transformDto(Map<String, ChartLegendItemListDto> map, Ranges3<Float> ranges3) {
        Map<String, ChartLegendItemListDto> mapEmptyMap = MapsKt.emptyMap();
        Function1<Float, Float> pointTransformFunc = getPointTransformFunc(ranges3);
        if (pointTransformFunc == null) {
            return mapEmptyMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ChartLegendItemListDto> entry : map.entrySet()) {
            if (ranges3.contains(Float.valueOf(Float.parseFloat(entry.getKey())))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(String.valueOf(pointTransformFunc.invoke(Float.valueOf(Float.parseFloat((String) entry2.getKey()))).floatValue()), entry2.getValue());
        }
        return linkedHashMap2;
    }

    public static final ChartAxis transform(ChartAxis chartAxis, Ranges3<Float> normalizedZoomRange, List<ChartAxisLabel> list) {
        ChartAxisLabel chartAxisLabel;
        Map<String, DisplayText> map;
        Intrinsics.checkNotNullParameter(chartAxis, "<this>");
        Intrinsics.checkNotNullParameter(normalizedZoomRange, "normalizedZoomRange");
        List listEmptyList = CollectionsKt.emptyList();
        Map mapEmptyMap = MapsKt.emptyMap();
        ChartAxisRange range = chartAxis.getRange();
        ChartAxis chartAxisCopy$default = ChartAxis.copy$default(chartAxis, listEmptyList, range != null ? transform(range, normalizedZoomRange) : null, null, mapEmptyMap, 4, null);
        Function1<Float, Float> pointTransformFunc = getPointTransformFunc(normalizedZoomRange);
        if (pointTransformFunc == null) {
            return chartAxisCopy$default;
        }
        List<ChartAxisLabel> labels = list == null ? chartAxis.getLabels() : list;
        ArrayList<ChartAxisLabel> arrayList = new ArrayList();
        for (Object obj : labels) {
            if (normalizedZoomRange.contains(Float.valueOf(((ChartAxisLabel) obj).getValue()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (ChartAxisLabel chartAxisLabel2 : arrayList) {
            arrayList2.add(ChartAxisLabel.copy$default(chartAxisLabel2, pointTransformFunc.invoke(Float.valueOf(chartAxisLabel2.getValue())).floatValue(), null, null, null, 14, null));
        }
        if (arrayList2.isEmpty()) {
            Color color = Color.f5843BG;
            chartAxisLabel = new ChartAxisLabel(0.0f, new ThemedColor(color, color), TextStyle.TEXT_SMALL, "");
        } else {
            chartAxisLabel = null;
        }
        Map<String, DisplayText> scrubbing_labels = chartAxis.getScrubbing_labels();
        if (scrubbing_labels != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, DisplayText> entry : scrubbing_labels.entrySet()) {
                if (normalizedZoomRange.contains(Float.valueOf(Float.parseFloat(entry.getKey())))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList3.add(Tuples4.m3642to(String.valueOf(pointTransformFunc.invoke(Float.valueOf(Float.parseFloat((String) entry2.getKey()))).floatValue()), (DisplayText) entry2.getValue()));
            }
            map = MapsKt.toMap(arrayList3);
        } else {
            map = null;
        }
        List<ChartAxisLabel> listPlus = CollectionsKt.plus((Collection) arrayList2, (Iterable) CollectionsKt.listOfNotNull(chartAxisLabel));
        ChartAxisRange range2 = chartAxis.getRange();
        return chartAxis.copy(listPlus, range2 != null ? transform(range2, normalizedZoomRange) : null, chartAxis.getEffective_range(), map);
    }

    public static final ChartAxisDto transform(ChartAxisDto chartAxisDto, Ranges3<Float> normalizedZoomRange, List<ChartAxisLabelDto> list) {
        ChartAxisLabelDto chartAxisLabelDto;
        Intrinsics.checkNotNullParameter(chartAxisDto, "<this>");
        Intrinsics.checkNotNullParameter(normalizedZoomRange, "normalizedZoomRange");
        List listEmptyList = CollectionsKt.emptyList();
        Map mapEmptyMap = MapsKt.emptyMap();
        ChartAxisRangeDto range = chartAxisDto.getRange();
        ChartAxisDto chartAxisDtoCopy$default = ChartAxisDto.copy$default(chartAxisDto, listEmptyList, range != null ? transform(range, normalizedZoomRange) : null, null, mapEmptyMap, null, 20, null);
        Function1<Float, Float> pointTransformFunc = getPointTransformFunc(normalizedZoomRange);
        if (pointTransformFunc == null) {
            return chartAxisDtoCopy$default;
        }
        List<ChartAxisLabelDto> labels = list == null ? chartAxisDto.getLabels() : list;
        ArrayList<ChartAxisLabelDto> arrayList = new ArrayList();
        for (Object obj : labels) {
            if (normalizedZoomRange.contains(Float.valueOf(((ChartAxisLabelDto) obj).getValue()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (ChartAxisLabelDto chartAxisLabelDto2 : arrayList) {
            arrayList2.add(ChartAxisLabelDto.copy$default(chartAxisLabelDto2, pointTransformFunc.invoke(Float.valueOf(chartAxisLabelDto2.getValue())).floatValue(), null, null, null, 14, null));
        }
        if (arrayList2.isEmpty()) {
            ColorDto colorDto = ColorDto.COLOR_BG;
            chartAxisLabelDto = new ChartAxisLabelDto(0.0f, new ThemedColorDto(colorDto, colorDto), TextStyleDto.TEXT_STYLE_TEXT_SMALL, "");
        } else {
            chartAxisLabelDto = null;
        }
        Map<String, DisplayTextDto> scrubbing_labels = chartAxisDto.getScrubbing_labels();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, DisplayTextDto> entry : scrubbing_labels.entrySet()) {
            if (normalizedZoomRange.contains(Float.valueOf(Float.parseFloat(entry.getKey())))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList3.add(Tuples4.m3642to(String.valueOf(pointTransformFunc.invoke(Float.valueOf(Float.parseFloat((String) entry2.getKey()))).floatValue()), (DisplayTextDto) entry2.getValue()));
        }
        Map map = MapsKt.toMap(arrayList3);
        List listPlus = CollectionsKt.plus((Collection) arrayList2, (Iterable) CollectionsKt.listOfNotNull(chartAxisLabelDto));
        ChartAxisRangeDto range2 = chartAxisDto.getRange();
        return ChartAxisDto.copy$default(chartAxisDto, listPlus, range2 != null ? transform(range2, normalizedZoomRange) : null, chartAxisDto.getEffective_range(), map, null, 16, null);
    }

    private static final ChartAxisRange transform(final ChartAxisRange chartAxisRange, Ranges3<Float> ranges3) {
        if (chartAxisRange instanceof MoneyAxisRange) {
            MoneyAxisRange moneyAxisRange = (MoneyAxisRange) chartAxisRange;
            final BigDecimal amount = moneyAxisRange.getMin_value().getAmount();
            final BigDecimal amount2 = moneyAxisRange.getMax_value().getAmount();
            Function1 function1 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SduiChartZoomTransformer.transform$lambda$70(amount, amount2, ((Float) obj).floatValue());
                }
            };
            return MoneyAxisRange.copy$default(moneyAxisRange, Money.copy$default(moneyAxisRange.getMin_value(), null, null, (BigDecimal) function1.invoke(ranges3.getStart()), 3, null), Money.copy$default(moneyAxisRange.getMax_value(), null, null, (BigDecimal) function1.invoke(ranges3.getEndInclusive()), 3, null), null, 4, null);
        }
        if (!(chartAxisRange instanceof UnitlessAxisRange)) {
            throw new NoWhenBranchMatchedException();
        }
        Function1 function12 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformerKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(SduiChartZoomTransformer.transform$lambda$71(chartAxisRange, ((Float) obj).floatValue()));
            }
        };
        return UnitlessAxisRange.copy$default((UnitlessAxisRange) chartAxisRange, ((Number) function12.invoke(ranges3.getStart())).floatValue(), ((Number) function12.invoke(ranges3.getEndInclusive())).floatValue(), 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal transform$lambda$70(BigDecimal bigDecimal, BigDecimal bigDecimal2, float f) {
        BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(new BigDecimal(String.valueOf(f)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimalMultiply);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float transform$lambda$71(ChartAxisRange chartAxisRange, float f) {
        UnitlessAxisRange unitlessAxisRange = (UnitlessAxisRange) chartAxisRange;
        return unitlessAxisRange.getMin_value() + ((unitlessAxisRange.getMax_value() - unitlessAxisRange.getMin_value()) * f);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final ChartAxisRangeDto transform(ChartAxisRangeDto chartAxisRangeDto, Ranges3<Float> ranges3) {
        UnitlessAxisRangeDto value;
        MoneyAxisRangeDto value2;
        MoneyDto max_value;
        MoneyDto min_value;
        MoneyDto max_value2;
        IdlDecimal amount;
        MoneyDto min_value2;
        IdlDecimal amount2;
        ChartAxisRangeDto.RangeDetailsDto range_details = chartAxisRangeDto.getRange_details();
        moneyDtoCopy$default = null;
        MoneyDto moneyDtoCopy$default = null;
        if (range_details instanceof ChartAxisRangeDto.RangeDetailsDto.Money) {
            MoneyAxisRangeDto money = chartAxisRangeDto.getMoney();
            final BigDecimal bigDecimalOrNull = (money == null || (min_value2 = money.getMin_value()) == null || (amount2 = min_value2.getAmount()) == null) ? null : amount2.toBigDecimalOrNull();
            MoneyAxisRangeDto money2 = chartAxisRangeDto.getMoney();
            final BigDecimal bigDecimalOrNull2 = (money2 == null || (max_value2 = money2.getMax_value()) == null || (amount = max_value2.getAmount()) == null) ? null : amount.toBigDecimalOrNull();
            if (bigDecimalOrNull == null || bigDecimalOrNull2 == null) {
                return chartAxisRangeDto;
            }
            Function1 function1 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SduiChartZoomTransformer.transform$lambda$72(bigDecimalOrNull, bigDecimalOrNull2, ((Float) obj).floatValue());
                }
            };
            ChartAxisRangeDto.RangeDetailsDto.Money money3 = (ChartAxisRangeDto.RangeDetailsDto.Money) range_details;
            MoneyAxisRangeDto money4 = chartAxisRangeDto.getMoney();
            if (money4 != null) {
                MoneyAxisRangeDto money5 = chartAxisRangeDto.getMoney();
                MoneyDto moneyDtoCopy$default2 = (money5 == null || (min_value = money5.getMin_value()) == null) ? null : MoneyDto.copy$default(min_value, (IdlDecimal) function1.invoke(ranges3.getStart()), null, 2, null);
                MoneyAxisRangeDto money6 = chartAxisRangeDto.getMoney();
                if (money6 != null && (max_value = money6.getMax_value()) != null) {
                    moneyDtoCopy$default = MoneyDto.copy$default(max_value, (IdlDecimal) function1.invoke(ranges3.getEndInclusive()), null, 2, null);
                }
                value2 = MoneyAxisRangeDto.copy$default(money4, moneyDtoCopy$default2, moneyDtoCopy$default, null, 4, null);
                if (value2 == null) {
                }
            } else {
                value2 = money3.getValue();
            }
            return chartAxisRangeDto.copy(money3.copy(value2));
        }
        if (!(range_details instanceof ChartAxisRangeDto.RangeDetailsDto.Unitless)) {
            return chartAxisRangeDto;
        }
        UnitlessAxisRangeDto unitless = chartAxisRangeDto.getUnitless();
        final Float fValueOf = unitless != null ? Float.valueOf(unitless.getMin_value()) : null;
        UnitlessAxisRangeDto unitless2 = chartAxisRangeDto.getUnitless();
        final Float fValueOf2 = unitless2 != null ? Float.valueOf(unitless2.getMax_value()) : null;
        if (fValueOf == null || fValueOf2 == null) {
            return chartAxisRangeDto;
        }
        Function1 function12 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformerKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(SduiChartZoomTransformer.transform$lambda$73(fValueOf, fValueOf2, ((Float) obj).floatValue()));
            }
        };
        ChartAxisRangeDto.RangeDetailsDto.Unitless unitless3 = (ChartAxisRangeDto.RangeDetailsDto.Unitless) range_details;
        UnitlessAxisRangeDto unitless4 = chartAxisRangeDto.getUnitless();
        if (unitless4 == null || (value = UnitlessAxisRangeDto.copy$default(unitless4, ((Number) function12.invoke(ranges3.getStart())).floatValue(), ((Number) function12.invoke(ranges3.getEndInclusive())).floatValue(), 0.0f, 4, null)) == null) {
            value = unitless3.getValue();
        }
        return chartAxisRangeDto.copy(unitless3.copy(value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlDecimal transform$lambda$72(BigDecimal bigDecimal, BigDecimal bigDecimal2, float f) {
        BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(new BigDecimal(String.valueOf(f)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimalMultiply);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return IdlDecimal2.toIdlDecimal(bigDecimalAdd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float transform$lambda$73(Float f, Float f2, float f3) {
        return f.floatValue() + ((f2.floatValue() - f.floatValue()) * f3);
    }

    public static final boolean isGridLine(Line line) {
        Intrinsics.checkNotNullParameter(line, "<this>");
        return Intrinsics.areEqual(line.getIdentifier(), HORIZONTAL_GRID_LINE_IDENTIFIER) || Intrinsics.areEqual(line.getIdentifier(), VERTICAL_GRID_LINE_IDENTIFIER);
    }

    public static final boolean isVolumeBar(ChartFill chartFill) {
        Intrinsics.checkNotNullParameter(chartFill, "<this>");
        return Intrinsics.areEqual(chartFill.getIdentifier(), VOLUME_IDENTIFIER);
    }

    public static final boolean isVolumeBar(ChartFillDto chartFillDto) {
        Intrinsics.checkNotNullParameter(chartFillDto, "<this>");
        return Intrinsics.areEqual(chartFillDto.getIdentifier(), VOLUME_IDENTIFIER);
    }

    private static final Ranges3<Float> getYAxisZoomRange(Ranges3<Float> ranges3, boolean z, List<Point> list) {
        Float fValueOf;
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (ranges3.contains(Float.valueOf(((Point) obj).getX()))) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            Float fValueOf2 = null;
            if (it.hasNext()) {
                float y = ((Point) it.next()).getY();
                while (it.hasNext()) {
                    y = Math.min(y, ((Point) it.next()).getY());
                }
                fValueOf = Float.valueOf(y);
            } else {
                fValueOf = null;
            }
            float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                float y2 = ((Point) it2.next()).getY();
                while (it2.hasNext()) {
                    y2 = Math.max(y2, ((Point) it2.next()).getY());
                }
                fValueOf2 = Float.valueOf(y2);
            }
            float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 1.0f;
            float f = fFloatValue2 - fFloatValue;
            if (Math.abs(f) < FLOAT_ERROR) {
                return RangesKt.rangeTo(0.0f, 1.0f);
            }
            float f2 = f * Y_AXIS_ZOOM_PADDING_PERCENT;
            return RangesKt.rangeTo(RangesKt.coerceAtLeast(fFloatValue - f2, 0.0f), RangesKt.coerceAtMost(fFloatValue2 + f2, 1.0f));
        }
        return RangesKt.rangeTo(0.0f, 1.0f);
    }

    private static final Ranges3<Float> getProtoYAxisZoomRange(Ranges3<Float> ranges3, boolean z, List<PointDto> list) {
        Float fValueOf;
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (ranges3.contains(Float.valueOf(((PointDto) obj).getX()))) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            Float fValueOf2 = null;
            if (it.hasNext()) {
                float y = ((PointDto) it.next()).getY();
                while (it.hasNext()) {
                    y = Math.min(y, ((PointDto) it.next()).getY());
                }
                fValueOf = Float.valueOf(y);
            } else {
                fValueOf = null;
            }
            float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                float y2 = ((PointDto) it2.next()).getY();
                while (it2.hasNext()) {
                    y2 = Math.max(y2, ((PointDto) it2.next()).getY());
                }
                fValueOf2 = Float.valueOf(y2);
            }
            float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 1.0f;
            float f = fFloatValue2 - fFloatValue;
            if (Math.abs(f) < FLOAT_ERROR) {
                return RangesKt.rangeTo(0.0f, 1.0f);
            }
            float f2 = f * Y_AXIS_ZOOM_PADDING_PERCENT;
            return RangesKt.rangeTo(RangesKt.coerceAtLeast(fFloatValue - f2, 0.0f), RangesKt.coerceAtMost(fFloatValue2 + f2, 1.0f));
        }
        return RangesKt.rangeTo(0.0f, 1.0f);
    }

    private static final Function1<Float, Float> getPointTransformFunc(Ranges3<Float> ranges3) {
        final float fFloatValue = ranges3.getStart().floatValue();
        final float fFloatValue2 = ranges3.getEndInclusive().floatValue();
        if (Math.abs(fFloatValue - fFloatValue2) < FLOAT_ERROR) {
            return null;
        }
        return new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformerKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(SduiChartZoomTransformer.getPointTransformFunc$lambda$80(fFloatValue, fFloatValue2, ((Float) obj).floatValue()));
            }
        };
    }

    /* renamed from: mapGestureToXAxisZoomRangeAndBounceOffset-xrV--mA, reason: not valid java name */
    public static final XAxisZoomState m18611mapGestureToXAxisZoomRangeAndBounceOffsetxrVmA(long j, long j2, float f, float f2, Ranges3<Float> oldZoomRange, float f3, float f4, float f5) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldZoomRange, "oldZoomRange");
        if (Math.abs(f - 0.0f) >= FLOAT_ERROR && Math.abs(f2 - 0.0f) >= FLOAT_ERROR) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f2;
            float fFloatValue = oldZoomRange.getStart().floatValue();
            float fFloatValue2 = oldZoomRange.getEndInclusive().floatValue() - fFloatValue;
            float f6 = fIntBitsToFloat * fFloatValue2;
            float f7 = fFloatValue + f6;
            float fIntBitsToFloat2 = ((Float.intBitsToFloat((int) (j2 >> 32)) * fFloatValue2) / f2) * 2.0f;
            float f8 = (f7 - (f6 / f)) - fIntBitsToFloat2;
            boolean z2 = true;
            float f9 = (f7 + (((1 - fIntBitsToFloat) * fFloatValue2) / f)) - fIntBitsToFloat2;
            float f10 = f9 - f8;
            float fCoerceAtMost = RangesKt.coerceAtMost(Math.max(0.05f, f5), 1.0f);
            if (f10 > 1.0f) {
                return new XAxisZoomState(WHOLE_ZOOM_RANGE, 0.0f);
            }
            if (f10 < fCoerceAtMost) {
                float f11 = (f8 + f9) / 2.0f;
                float f12 = fCoerceAtMost / 2.0f;
                float f13 = f11 - f12;
                f9 = f11 + f12;
                f8 = f13;
                f10 = f9 - f13;
                z = true;
            } else {
                z = false;
            }
            float fCoerceAtMost2 = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(f4 + (0.25f * f10), f10), 1.0f);
            if (Math.abs(f - 1.0f) < FLOAT_ERROR && !z) {
                z2 = false;
            }
            if (f8 < 0.0f) {
                return new XAxisZoomState(RangesKt.rangeTo(0.0f, f10), z2 ? 0.0f : RangesKt.coerceAtMost(RangesKt.coerceAtLeast(f3 + (((0.0f - f8) * 0.1f) / f10), -0.1f), 0.1f));
            }
            if (f9 > fCoerceAtMost2) {
                return new XAxisZoomState(RangesKt.rangeTo(fCoerceAtMost2 - f10, fCoerceAtMost2), z2 ? 0.0f : RangesKt.coerceAtMost(RangesKt.coerceAtLeast(f3 + (((fCoerceAtMost2 - f9) * 0.1f) / f10), -0.1f), 0.1f));
            }
            return new XAxisZoomState(RangesKt.rangeTo(f8, f9), 0.0f);
        }
        return new XAxisZoomState(oldZoomRange, 0.0f);
    }

    public static final Ranges3<Float> getWHOLE_ZOOM_RANGE() {
        return WHOLE_ZOOM_RANGE;
    }
}
