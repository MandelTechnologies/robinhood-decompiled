package com.robinhood.android.sdui.chartgroup;

import android.os.Parcelable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.charts.Interactions;
import com.robinhood.android.charts.ScrubWindow;
import com.robinhood.android.charts.candlestick.CandlestickChart;
import com.robinhood.android.charts.model.Axis;
import com.robinhood.android.charts.model.AxisLabel;
import com.robinhood.android.charts.model.AxisRange;
import com.robinhood.android.charts.model.AxisScrubLabel;
import com.robinhood.android.charts.model.AxisType;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Fill;
import com.robinhood.android.charts.model.GradientChartFillStyle;
import com.robinhood.android.charts.model.ProtoAxis;
import com.robinhood.android.charts.model.ProtoAxisLabel;
import com.robinhood.android.charts.model.ProtoAxisRange;
import com.robinhood.android.charts.model.ProtoAxisScrubLabel;
import com.robinhood.android.charts.model.ProtoGradientChartFillStyle;
import com.robinhood.android.charts.models.p080db.ChartLine;
import com.robinhood.android.charts.models.p080db.ChartPoint;
import com.robinhood.android.charts.models.p080db.LineType;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.charts.segmented.ScrubLineType;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.android.charts.segmented.SegmentedLineChart;
import com.robinhood.android.charts.util.StaleState2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.theme.SduiColors;
import com.robinhood.compose.theme.SduiColors3;
import com.robinhood.models.serverdriven.experimental.api.ChartAxis;
import com.robinhood.models.serverdriven.experimental.api.ChartAxisLabel;
import com.robinhood.models.serverdriven.experimental.api.ChartAxisRange;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.ChartFillStyle;
import com.robinhood.models.serverdriven.experimental.api.ColorStopData;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.DottedChartFillStyle;
import com.robinhood.models.serverdriven.experimental.api.DottedLineType;
import com.robinhood.models.serverdriven.experimental.api.GradientAnimationChartFillStyle;
import com.robinhood.models.serverdriven.experimental.api.GradientChartFillStyle;
import com.robinhood.models.serverdriven.experimental.api.GradientStyle;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.LineCapStyle;
import com.robinhood.models.serverdriven.experimental.api.LinearGradientColor;
import com.robinhood.models.serverdriven.experimental.api.MoneyAxisRange;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.RoundedSolidChartFillStyle;
import com.robinhood.models.serverdriven.experimental.api.Segment;
import com.robinhood.models.serverdriven.experimental.api.SolidChartFillStyle;
import com.robinhood.models.serverdriven.experimental.api.SolidLineType;
import com.robinhood.models.serverdriven.experimental.api.Style;
import com.robinhood.models.serverdriven.experimental.api.StylesWithStates;
import com.robinhood.models.serverdriven.experimental.api.ThemedColorStops;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.api.UnitlessAxisRange;
import com.robinhood.rosetta.common.MoneyDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.ChartAxisDto;
import rh_server_driven_ui.p531v1.ChartAxisLabelDto;
import rh_server_driven_ui.p531v1.ChartAxisRangeDto;
import rh_server_driven_ui.p531v1.ChartFillDto;
import rh_server_driven_ui.p531v1.ChartFillStyleDto;
import rh_server_driven_ui.p531v1.ColorStopDataDto;
import rh_server_driven_ui.p531v1.DisplayTextDto;
import rh_server_driven_ui.p531v1.DottedLineTypeDto;
import rh_server_driven_ui.p531v1.GradientChartFillStyleDto;
import rh_server_driven_ui.p531v1.GradientStyleDto;
import rh_server_driven_ui.p531v1.LineCapStyleDto;
import rh_server_driven_ui.p531v1.LineDto;
import rh_server_driven_ui.p531v1.LineTypeDto;
import rh_server_driven_ui.p531v1.LinearGradientColorDto;
import rh_server_driven_ui.p531v1.MoneyAxisRangeDto;
import rh_server_driven_ui.p531v1.PointDto;
import rh_server_driven_ui.p531v1.SegmentDto;
import rh_server_driven_ui.p531v1.StyleDto;
import rh_server_driven_ui.p531v1.StylesWithStatesDto;
import rh_server_driven_ui.p531v1.ThemedColorStopsDto;
import rh_server_driven_ui.p531v1.UnitlessAxisRangeDto;

/* compiled from: SduiChartMappers.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020'0,*\u00020\u0012H\u0003¢\u0006\u0002\u0010.\u001a\u001d\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020'0,*\u00020\u0014H\u0003¢\u0006\u0002\u0010/\u001a\u0015\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0007¢\u0006\u0002\u00104\u001a\u0015\u00105\u001a\u0002012\u0006\u00102\u001a\u000206H\u0007¢\u0006\u0002\u00107\u001a!\u00108\u001a\b\u0012\u0004\u0012\u0002090\u00022\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0002\u0010;\u001a!\u0010<\u001a\b\u0012\u0004\u0012\u0002090\u00022\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00170=H\u0007¢\u0006\u0002\u0010>\u001a!\u0010?\u001a\b\u0012\u0004\u0012\u00020@0=2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u0002H\u0007¢\u0006\u0002\u0010C\u001a!\u0010D\u001a\b\u0012\u0004\u0012\u00020@0=2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020E0=H\u0007¢\u0006\u0002\u0010F\u001a\u0015\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0007¢\u0006\u0002\u0010K\u001a\u0017\u0010G\u001a\u00020L2\b\u0010I\u001a\u0004\u0018\u00010MH\u0007¢\u0006\u0002\u0010N\u001a\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020P0=*\u00020QH\u0007¢\u0006\u0002\u0010R\u001a\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020S0=*\u00020TH\u0007¢\u0006\u0002\u0010U\u001a\u001d\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0007¢\u0006\u0002\u0010\\\u001a\u001d\u0010V\u001a\u00020]2\u0006\u0010X\u001a\u00020^2\u0006\u0010Z\u001a\u00020[H\u0007¢\u0006\u0002\u0010_\u001a\u001d\u0010`\u001a\b\u0012\u0002\b\u0003\u0018\u00010a2\b\u0010b\u001a\u0004\u0018\u00010cH\u0003¢\u0006\u0002\u0010d\u001a\u001d\u0010`\u001a\b\u0012\u0002\b\u0003\u0018\u00010e2\b\u0010b\u001a\u0004\u0018\u00010fH\u0003¢\u0006\u0002\u0010g\u001a)\u0010m\u001a\u00020'*\u00020h2\b\b\u0002\u0010n\u001a\u00020k2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\bp\u0010q\u001a3\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020'0,*\u00020\b2\u0006\u0010n\u001a\u00020k2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010 H\u0003¢\u0006\u0004\br\u0010s\u001a\u0011\u0010t\u001a\u000201*\u000203H\u0007¢\u0006\u0002\u00104\u001a-\u0010u\u001a\u0002012\u0006\u00102\u001a\u00020v2\b\b\u0002\u0010n\u001a\u00020k2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\bw\u0010x\u001a9\u0010y\u001a\b\u0012\u0004\u0012\u0002090=2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0002\u0010n\u001a\u00020k2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\bz\u0010{\u001a'\u0010|\u001a\b\u0012\u0004\u0012\u0002090=*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010}\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010~\u001a#\u0010\u007f\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0002\u001a$\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u0002*\b\u0012\u0004\u0012\u00020B0\u00022\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0002\u001a®\u0001\u0010\u0084\u0001\u001a\u00030\u0085\u0001\"\n\b\u0000\u0010\u0086\u0001*\u00030\u0087\u00012\n\b\u0002\u0010\u0088\u0001\u001a\u00030\u0089\u00012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u00022\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0\u008b\u00012\u000f\u0010\u008c\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0086\u00010\u008d\u00012\t\b\u0002\u0010\u008e\u0001\u001a\u00020\u00072\u001e\b\u0002\u0010\u008f\u0001\u001a\u0017\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0080\u00010\u0002\u0012\u0005\u0012\u00030\u0085\u00010\u0090\u00012\u0011\b\u0002\u0010\u0091\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0092\u00012\t\b\u0002\u0010\u0093\u0001\u001a\u00020\u0007H\u0007¢\u0006\u0003\u0010\u0094\u0001\u001a\u0089\u0002\u0010\u0095\u0001\u001a\u00030\u0085\u0001\"\f\b\u0000\u0010\u0086\u0001\u0018\u0001*\u00030\u0087\u00012\n\b\u0002\u0010\u0088\u0001\u001a\u00030\u0089\u00012\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u00022\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0015\u0010\u0096\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u0003H\u0086\u00010\u0097\u00010\u00022\u0011\u0010\u008c\u0001\u001a\f\u0012\u0005\u0012\u0003H\u0086\u0001\u0018\u00010\u008d\u00012\u0012\b\u0002\u0010\u0098\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0099\u00012\t\b\u0002\u0010\u008e\u0001\u001a\u00020\u00072*\b\n\u0010\u008f\u0001\u001a#\u0012\u0017\u0012\u00150\u0082\u0001¢\u0006\u000f\b\u009a\u0001\u0012\n\b\u009b\u0001\u0012\u0005\b\b(\u009c\u0001\u0012\u0005\u0012\u00030\u0085\u00010\u0090\u00012\u001e\b\n\u0010\u009d\u0001\u001a\u0017\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0080\u00010\u0002\u0012\u0005\u0012\u00030\u0085\u00010\u0090\u00012\u0011\b\n\u0010\u009e\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0092\u00012\t\b\u0002\u0010\u0093\u0001\u001a\u00020\u00072\b\b\u0002\u0010}\u001a\u00020\u000fH\u0087\bø\u0001\u0000¢\u0006\u0003\u0010\u009f\u0001\u001a\u0094\u0002\u0010\u0095\u0001\u001a\u00030\u0085\u0001\"\n\b\u0000\u0010\u0086\u0001*\u00030\u0087\u00012\n\b\u0002\u0010\u0088\u0001\u001a\u00030\u0089\u00012\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u00022\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0015\u0010\u0096\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u0003H\u0086\u00010\u0097\u00010\u00022\u0011\u0010\u008c\u0001\u001a\f\u0012\u0005\u0012\u0003H\u0086\u0001\u0018\u00010\u008d\u00012*\b\u0002\u0010\u008f\u0001\u001a#\u0012\u0017\u0012\u00150\u0082\u0001¢\u0006\u000f\b\u009a\u0001\u0012\n\b\u009b\u0001\u0012\u0005\b\b(\u009c\u0001\u0012\u0005\u0012\u00030\u0085\u00010\u0090\u00012\u001e\b\u0002\u0010\u009d\u0001\u001a\u0017\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0080\u00010\u0002\u0012\u0005\u0012\u00030\u0085\u00010\u0090\u00012\u0011\b\u0002\u0010\u009e\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0092\u00012\t\b\u0002\u0010\u0093\u0001\u001a\u00020\u00072\t\b\u0002\u0010\u008e\u0001\u001a\u00020\u00072\u0012\b\u0002\u0010\u0098\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0099\u00012\b\b\u0002\u0010}\u001a\u00020\u000f2\u000f\u0010 \u0001\u001a\n\u0012\u0005\u0012\u0003H\u0086\u00010¡\u0001H\u0001¢\u0006\u0003\u0010¢\u0001\"\u001e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0018\u0010\u000b\u001a\u00020\u0007*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0013\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0015\"\u0018\u0010\u000b\u001a\u00020\u0007*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0016\"\u0018\u0010\u000b\u001a\u00020\u0007*\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0018\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0019\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001a\"\u0018\u0010\u000b\u001a\u00020\u0007*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001c\"\u0018\u0010\u000b\u001a\u00020\u0007*\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001e\"\u0015\u0010\u001f\u001a\u00020 *\u00020!8G¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0015\u0010\u001f\u001a\u00020 *\u00020$8G¢\u0006\u0006\u001a\u0004\b\"\u0010%\"\u0015\u0010&\u001a\u00020'*\u00020!8G¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0015\u0010&\u001a\u00020'*\u00020$8G¢\u0006\u0006\u001a\u0004\b(\u0010*\"\u0015\u0010\u001f\u001a\u00020 *\u00020h8G¢\u0006\u0006\u001a\u0004\b\"\u0010i\"\u0010\u0010j\u001a\u00020kX\u0082\u0004¢\u0006\u0004\n\u0002\u0010l\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006£\u0001"}, m3636d2 = {"scrubWindow", "Lcom/robinhood/android/charts/ScrubWindow;", "", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "getScrubWindow", "(Ljava/util/List;)Lcom/robinhood/android/charts/ScrubWindow;", "sameLineStyle", "", "Lcom/robinhood/android/charts/models/db/ChartLine$Segment$StyleSet;", "getSameLineStyle", "(Lcom/robinhood/android/charts/models/db/ChartLine$Segment$StyleSet;)Z", "isDotted", "Lcom/robinhood/android/charts/models/db/ChartLine;", "(Lcom/robinhood/android/charts/models/db/ChartLine;)Z", "dashGap", "", "getDashGap", "(Lcom/robinhood/android/charts/models/db/ChartLine;)F", "Lcom/robinhood/models/serverdriven/experimental/api/StylesWithStates;", "(Lcom/robinhood/models/serverdriven/experimental/api/StylesWithStates;)Z", "Lrh_server_driven_ui/v1/StylesWithStatesDto;", "(Lrh_server_driven_ui/v1/StylesWithStatesDto;)Z", "(Lcom/robinhood/models/serverdriven/experimental/api/Line;)Z", "Lrh_server_driven_ui/v1/LineDto;", "(Lrh_server_driven_ui/v1/LineDto;)Z", "(Lcom/robinhood/models/serverdriven/experimental/api/Line;)F", "(Lrh_server_driven_ui/v1/LineDto;)F", "Lcom/robinhood/models/serverdriven/experimental/api/LineType;", "(Lcom/robinhood/models/serverdriven/experimental/api/LineType;)Z", "Lrh_server_driven_ui/v1/LineTypeDto;", "(Lrh_server_driven_ui/v1/LineTypeDto;)Z", "composeColor", "Landroidx/compose/ui/graphics/Color;", "Lcom/robinhood/models/serverdriven/experimental/api/Style;", "getComposeColor", "(Lcom/robinhood/models/serverdriven/experimental/api/Style;Landroidx/compose/runtime/Composer;I)J", "Lrh_server_driven_ui/v1/StyleDto;", "(Lrh_server_driven_ui/v1/StyleDto;Landroidx/compose/runtime/Composer;I)J", "segmentStyle", "Lcom/robinhood/android/charts/segmented/SegmentedLine$Style;", "getSegmentStyle", "(Lcom/robinhood/models/serverdriven/experimental/api/Style;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/segmented/SegmentedLine$Style;", "(Lrh_server_driven_ui/v1/StyleDto;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/segmented/SegmentedLine$Style;", "toInteractionMap", "", "Lcom/robinhood/android/charts/InteractionState;", "(Lcom/robinhood/models/serverdriven/experimental/api/StylesWithStates;Landroidx/compose/runtime/Composer;I)Ljava/util/Map;", "(Lrh_server_driven_ui/v1/StylesWithStatesDto;Landroidx/compose/runtime/Composer;I)Ljava/util/Map;", "mapSduiSegment", "Lcom/robinhood/android/charts/segmented/SegmentedLine$Segment;", "segment", "Lcom/robinhood/models/serverdriven/experimental/api/Segment;", "(Lcom/robinhood/models/serverdriven/experimental/api/Segment;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/segmented/SegmentedLine$Segment;", "mapSegmentDto", "Lrh_server_driven_ui/v1/SegmentDto;", "(Lrh_server_driven_ui/v1/SegmentDto;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/segmented/SegmentedLine$Segment;", "mapSduiSegmentedLines", "Lcom/robinhood/android/charts/segmented/SegmentedLine;", "lines", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "mapSegmentedDtoLines", "Lkotlinx/collections/immutable/ImmutableList;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "mapSduiFills", "Lcom/robinhood/android/charts/model/Fill;", "fills", "Lcom/robinhood/models/serverdriven/experimental/api/ChartFill;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lkotlinx/collections/immutable/ImmutableList;", "mapFillDto", "Lrh_server_driven_ui/v1/ChartFillDto;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)Lkotlinx/collections/immutable/ImmutableList;", "mapGradientChartFillStyle", "Lcom/robinhood/android/charts/model/GradientChartFillStyle;", "sduiStyle", "Lcom/robinhood/models/serverdriven/experimental/api/GradientChartFillStyle;", "(Lcom/robinhood/models/serverdriven/experimental/api/GradientChartFillStyle;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/model/GradientChartFillStyle;", "Lcom/robinhood/android/charts/model/ProtoGradientChartFillStyle;", "Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "(Lrh_server_driven_ui/v1/GradientChartFillStyleDto;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/model/ProtoGradientChartFillStyle;", "toColorStops", "Lcom/robinhood/android/charts/model/GradientChartFillStyle$ColorStop;", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColorStops;", "(Lcom/robinhood/models/serverdriven/experimental/api/ThemedColorStops;Landroidx/compose/runtime/Composer;I)Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/model/ProtoGradientChartFillStyle$ColorStop;", "Lrh_server_driven_ui/v1/ThemedColorStopsDto;", "(Lrh_server_driven_ui/v1/ThemedColorStopsDto;Landroidx/compose/runtime/Composer;I)Lkotlinx/collections/immutable/ImmutableList;", "mapSduiAxis", "Lcom/robinhood/android/charts/model/Axis;", "axis", "Lcom/robinhood/models/serverdriven/experimental/api/ChartAxis;", "axisType", "Lcom/robinhood/android/charts/model/AxisType;", "(Lcom/robinhood/models/serverdriven/experimental/api/ChartAxis;Lcom/robinhood/android/charts/model/AxisType;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/model/Axis;", "Lcom/robinhood/android/charts/model/ProtoAxis;", "Lrh_server_driven_ui/v1/ChartAxisDto;", "(Lrh_server_driven_ui/v1/ChartAxisDto;Lcom/robinhood/android/charts/model/AxisType;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/model/ProtoAxis;", "mapSduiAxisRange", "Lcom/robinhood/android/charts/model/AxisRange;", "axisRange", "Lcom/robinhood/models/serverdriven/experimental/api/ChartAxisRange;", "(Lcom/robinhood/models/serverdriven/experimental/api/ChartAxisRange;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/model/AxisRange;", "Lcom/robinhood/android/charts/model/ProtoAxisRange;", "Lrh_server_driven_ui/v1/ChartAxisRangeDto;", "(Lrh_server_driven_ui/v1/ChartAxisRangeDto;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/model/ProtoAxisRange;", "Lcom/robinhood/android/charts/models/db/ChartLine$Segment$Style;", "(Lcom/robinhood/android/charts/models/db/ChartLine$Segment$Style;Landroidx/compose/runtime/Composer;I)J", "DefaultStrokeWidth", "Landroidx/compose/ui/unit/Dp;", "F", "toSegmentedStyle", "strokeWidth", "strokeColor", "toSegmentedStyle-RxXgDco", "(Lcom/robinhood/android/charts/models/db/ChartLine$Segment$Style;FLandroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/android/charts/segmented/SegmentedLine$Style;", "toInteractionMap-RxXgDco", "(Lcom/robinhood/android/charts/models/db/ChartLine$Segment$StyleSet;FLandroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)Ljava/util/Map;", "toSegment", "mapSdcSegment", "Lcom/robinhood/android/charts/models/db/ChartLine$Segment;", "mapSdcSegment-RxXgDco", "(Lcom/robinhood/android/charts/models/db/ChartLine$Segment;FLandroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/android/charts/segmented/SegmentedLine$Segment;", "mapSdcSegmentedLines", "mapSdcSegmentedLines-RxXgDco", "(Ljava/util/List;FLandroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)Lkotlinx/collections/immutable/ImmutableList;", "toSegmentedLines", "dashGapAdjustment", "(Ljava/util/List;FLandroidx/compose/runtime/Composer;II)Lkotlinx/collections/immutable/ImmutableList;", "getHorizontalChartPoints", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "point", "Lcom/robinhood/android/charts/model/Point;", "getHorizontalChartFillPoints", "SduiCandlestickChart", "", "ActionT", "Landroid/os/Parcelable;", "modifier", "Landroidx/compose/ui/Modifier;", "legendPoints", "", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "scrubLine", "onScrub", "Lkotlin/Function1;", "onScrubStopped", "Lkotlin/Function0;", "showPlaceholder", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "SduiSegmentedLineChart", "overlays", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "lineRevealAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "Lkotlin/ParameterName;", "name", "scrubPoint", "onChartPointsScrubbed", "onChartPointsScrubStopped", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZFLandroidx/compose/runtime/Composer;III)V", "actionClass", "Ljava/lang/Class;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZZLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/Class;Landroidx/compose/runtime/Composer;III)V", "lib-sdui-charts_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SduiChartMappersKt {
    private static final float DefaultStrokeWidth = C2002Dp.m7995constructorimpl(2);

    /* compiled from: SduiChartMappers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LineCapStyle.values().length];
            try {
                iArr[LineCapStyle.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LineCapStyle.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LineCapStyle.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LineCapStyleDto.values().length];
            try {
                iArr2[LineCapStyleDto.LINE_CAP_STYLE_BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LineCapStyleDto.LINE_CAP_STYLE_ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LineCapStyleDto.LINE_CAP_STYLE_SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LineCapStyleDto.LINE_CAP_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiCandlestickChart$lambda$60(Modifier modifier, List list, List list2, Set set, SduiActionHandler sduiActionHandler, boolean z, Function1 function1, Function0 function0, boolean z2, int i, int i2, Composer composer, int i3) {
        SduiCandlestickChart(modifier, list, list2, set, sduiActionHandler, z, function1, function0, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiSegmentedLineChart$lambda$70(Modifier modifier, List list, List list2, List list3, SduiActionHandler sduiActionHandler, Function1 function1, Function1 function12, Function0 function0, boolean z, boolean z2, AnimationSpec animationSpec, float f, Class cls, int i, int i2, int i3, Composer composer, int i4) {
        SduiSegmentedLineChart(modifier, list, list2, list3, sduiActionHandler, function1, function12, function0, z, z2, animationSpec, f, cls, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrubWindow getScrubWindow(List<Line> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((Line) it.next()).getSegments());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((Segment) it2.next()).getPoints());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((Point) obj).getCursor_data() != null) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            float x = ((Point) it3.next()).getX();
            while (it3.hasNext()) {
                x = Math.min(x, ((Point) it3.next()).getX());
            }
            Iterator it4 = arrayList3.iterator();
            if (!it4.hasNext()) {
                throw new NoSuchElementException();
            }
            float y = ((Point) it4.next()).getY();
            while (it4.hasNext()) {
                y = Math.min(y, ((Point) it4.next()).getY());
            }
            Iterator it5 = arrayList3.iterator();
            if (!it5.hasNext()) {
                throw new NoSuchElementException();
            }
            float x2 = ((Point) it5.next()).getX();
            while (it5.hasNext()) {
                x2 = Math.max(x2, ((Point) it5.next()).getX());
            }
            Iterator it6 = arrayList3.iterator();
            if (it6.hasNext()) {
                float y2 = ((Point) it6.next()).getY();
                while (it6.hasNext()) {
                    y2 = Math.max(y2, ((Point) it6.next()).getY());
                }
                return new ScrubWindow(x, y, x2, y2);
            }
            throw new NoSuchElementException();
        }
        return new ScrubWindow(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    private static final boolean getSameLineStyle(ChartLine.Segment.StyleSet styleSet) {
        ChartLine.Segment.Style active = styleSet.getActive();
        if (active == null) {
            active = styleSet.getDefault();
        }
        LineType lineType = active.getLineType();
        ChartLine.Segment.Style inactive = styleSet.getInactive();
        if (inactive == null) {
            inactive = styleSet.getDefault();
        }
        return Intrinsics.areEqual(styleSet.getDefault().getLineType(), lineType) && Intrinsics.areEqual(styleSet.getDefault().getLineType(), inactive.getLineType());
    }

    private static final boolean isDotted(ChartLine chartLine) {
        List<ChartLine.Segment> segments = chartLine.getSegments();
        if ((segments instanceof Collection) && segments.isEmpty()) {
            return true;
        }
        for (ChartLine.Segment segment : segments) {
            if (!getSameLineStyle(segment.getStyles()) || !(segment.getStyles().getDefault().getLineType() instanceof LineType.Dotted)) {
                return false;
            }
        }
        return true;
    }

    private static final float getDashGap(ChartLine chartLine) {
        ChartLine.Segment.StyleSet styles;
        ChartLine.Segment.Style style;
        ChartLine.Segment segment = (ChartLine.Segment) CollectionsKt.firstOrNull((List) chartLine.getSegments());
        LineType lineType = (segment == null || (styles = segment.getStyles()) == null || (style = styles.getDefault()) == null) ? null : style.getLineType();
        LineType.Dotted dotted = lineType instanceof LineType.Dotted ? (LineType.Dotted) lineType : null;
        if (dotted != null) {
            return dotted.getDashGap();
        }
        return 0.01f;
    }

    private static final boolean getSameLineStyle(StylesWithStates stylesWithStates) {
        Style active = stylesWithStates.getActive();
        if (active == null) {
            active = stylesWithStates.getDefault();
        }
        com.robinhood.models.serverdriven.experimental.api.LineType line_type = active.getLine_type();
        Style inactive = stylesWithStates.getInactive();
        if (inactive == null) {
            inactive = stylesWithStates.getDefault();
        }
        return stylesWithStates.getDefault().getLine_type().getClass() == line_type.getClass() && stylesWithStates.getDefault().getLine_type().getClass() == inactive.getLine_type().getClass();
    }

    private static final boolean getSameLineStyle(StylesWithStatesDto stylesWithStatesDto) {
        LineTypeDto line_type;
        LineTypeDto.StyleDetailsDto style_details;
        LineTypeDto.StyleDetailsDto style_details2;
        LineTypeDto.StyleDetailsDto style_details3;
        LineTypeDto line_type2;
        LineTypeDto line_type3;
        StyleDto styleDto = stylesWithStatesDto.getDefault();
        if (styleDto == null || (line_type = styleDto.getLine_type()) == null || (style_details = line_type.getStyle_details()) == null) {
            throw new IllegalStateException("Default line type must not be null");
        }
        StyleDto active = stylesWithStatesDto.getActive();
        if (active == null || (line_type3 = active.getLine_type()) == null || (style_details2 = line_type3.getStyle_details()) == null) {
            style_details2 = style_details;
        }
        StyleDto inactive = stylesWithStatesDto.getInactive();
        if (inactive == null || (line_type2 = inactive.getLine_type()) == null || (style_details3 = line_type2.getStyle_details()) == null) {
            style_details3 = style_details;
        }
        return style_details.getClass() == style_details2.getClass() && style_details.getClass() == style_details3.getClass();
    }

    public static final boolean isDotted(Line line) {
        Intrinsics.checkNotNullParameter(line, "<this>");
        List<Segment> segments = line.getSegments();
        if ((segments instanceof Collection) && segments.isEmpty()) {
            return true;
        }
        for (Segment segment : segments) {
            if (!getSameLineStyle(segment.getStyles()) || !isDotted(segment.getStyles().getDefault().getLine_type())) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isDotted(LineDto lineDto) {
        StylesWithStatesDto styles;
        StyleDto styleDto;
        LineTypeDto line_type;
        Intrinsics.checkNotNullParameter(lineDto, "<this>");
        List<SegmentDto> segments = lineDto.getSegments();
        if ((segments instanceof Collection) && segments.isEmpty()) {
            return true;
        }
        for (SegmentDto segmentDto : segments) {
            StylesWithStatesDto styles2 = segmentDto.getStyles();
            if (styles2 == null || !getSameLineStyle(styles2) || (styles = segmentDto.getStyles()) == null || (styleDto = styles.getDefault()) == null || (line_type = styleDto.getLine_type()) == null || !isDotted(line_type)) {
                return false;
            }
        }
        return true;
    }

    private static final float getDashGap(Line line) {
        StylesWithStates styles;
        Style style;
        Segment segment = (Segment) CollectionsKt.firstOrNull((List) line.getSegments());
        com.robinhood.models.serverdriven.experimental.api.LineType line_type = (segment == null || (styles = segment.getStyles()) == null || (style = styles.getDefault()) == null) ? null : style.getLine_type();
        DottedLineType dottedLineType = line_type instanceof DottedLineType ? (DottedLineType) line_type : null;
        if (dottedLineType != null) {
            return dottedLineType.getDash_gap();
        }
        return 0.01f;
    }

    private static final float getDashGap(LineDto lineDto) {
        DottedLineTypeDto value;
        StylesWithStatesDto styles;
        StyleDto styleDto;
        LineTypeDto line_type;
        SegmentDto segmentDto = (SegmentDto) CollectionsKt.firstOrNull((List) lineDto.getSegments());
        LineTypeDto.StyleDetailsDto style_details = (segmentDto == null || (styles = segmentDto.getStyles()) == null || (styleDto = styles.getDefault()) == null || (line_type = styleDto.getLine_type()) == null) ? null : line_type.getStyle_details();
        LineTypeDto.StyleDetailsDto.Dotted dotted = style_details instanceof LineTypeDto.StyleDetailsDto.Dotted ? (LineTypeDto.StyleDetailsDto.Dotted) style_details : null;
        if (dotted == null || (value = dotted.getValue()) == null) {
            return 0.01f;
        }
        return value.getDash_gap();
    }

    public static final boolean isDotted(com.robinhood.models.serverdriven.experimental.api.LineType lineType) {
        Intrinsics.checkNotNullParameter(lineType, "<this>");
        return lineType instanceof DottedLineType;
    }

    public static final boolean isDotted(LineTypeDto lineTypeDto) {
        Intrinsics.checkNotNullParameter(lineTypeDto, "<this>");
        return lineTypeDto.getStyle_details() instanceof LineTypeDto.StyleDetailsDto.Dotted;
    }

    @JvmName
    public static final long getComposeColor(Style style, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(style, "<this>");
        composer.startReplaceGroup(-1916014800);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1916014800, i, -1, "com.robinhood.android.sdui.chartgroup.<get-composeColor> (SduiChartMappers.kt:148)");
        }
        long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(StaleState2.m12177orStaleek8zF_U(SduiColors2.m18896toComposeColorDefaultediJQMabo(style.getColor(), 0L, composer, 0, 1), composer, 0), style.getOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM6705copywmQWz5c$default;
    }

    @JvmName
    public static final long getComposeColor(StyleDto styleDto, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(styleDto, "<this>");
        composer.startReplaceGroup(-1837553079);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1837553079, i, -1, "com.robinhood.android.sdui.chartgroup.<get-composeColor> (SduiChartMappers.kt:153)");
        }
        long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(StaleState2.m12177orStaleek8zF_U(SduiColors2.m18897toComposeColorDefaultediJQMabo(styleDto.getColor(), 0L, composer, 0, 1), composer, 0), styleDto.getOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM6705copywmQWz5c$default;
    }

    @JvmName
    public static final SegmentedLine.Style getSegmentStyle(Style style, Composer composer, int i) {
        int iM6848getButtKaPHkGw;
        SegmentedLine.Style dotted;
        Intrinsics.checkNotNullParameter(style, "<this>");
        composer.startReplaceGroup(-176271266);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-176271266, i, -1, "com.robinhood.android.sdui.chartgroup.<get-segmentStyle> (SduiChartMappers.kt:158)");
        }
        com.robinhood.models.serverdriven.experimental.api.LineType line_type = style.getLine_type();
        if (line_type instanceof DottedLineType) {
            composer.startReplaceGroup(-1892958636);
            dotted = new SegmentedLine.Style.Dotted(getComposeColor(style, composer, i & 14), ((DottedLineType) line_type).getDash_gap(), null);
            composer.endReplaceGroup();
        } else {
            if (!(line_type instanceof SolidLineType)) {
                composer.startReplaceGroup(-1892960711);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1892953866);
            long composeColor = getComposeColor(style, composer, i & 14);
            LinearGradientColor gradient_color = style.getGradient_color();
            com.robinhood.shared.compose.color.LinearGradientColor linearGradientColor = gradient_color != null ? SduiColors2.toLinearGradientColor(gradient_color, 0.0f, composer, 0, 1) : null;
            SolidLineType solidLineType = (SolidLineType) line_type;
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(solidLineType.getStroke_width());
            int i2 = WhenMappings.$EnumSwitchMapping$0[solidLineType.getCap_style().ordinal()];
            if (i2 == 1) {
                iM6848getButtKaPHkGw = StrokeCap.INSTANCE.m6848getButtKaPHkGw();
            } else if (i2 == 2) {
                iM6848getButtKaPHkGw = StrokeCap.INSTANCE.m6849getRoundKaPHkGw();
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iM6848getButtKaPHkGw = StrokeCap.INSTANCE.m6850getSquareKaPHkGw();
            }
            SegmentedLine.Style.Solid solid = new SegmentedLine.Style.Solid(composeColor, linearGradientColor, fM7995constructorimpl, iM6848getButtKaPHkGw, null);
            composer.endReplaceGroup();
            dotted = solid;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return dotted;
    }

    @JvmName
    public static final SegmentedLine.Style getSegmentStyle(StyleDto styleDto, Composer composer, int i) {
        int iM6848getButtKaPHkGw;
        SegmentedLine.Style dotted;
        Intrinsics.checkNotNullParameter(styleDto, "<this>");
        composer.startReplaceGroup(-97809545);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-97809545, i, -1, "com.robinhood.android.sdui.chartgroup.<get-segmentStyle> (SduiChartMappers.kt:178)");
        }
        LineTypeDto line_type = styleDto.getLine_type();
        LineTypeDto.StyleDetailsDto style_details = line_type != null ? line_type.getStyle_details() : null;
        if (style_details instanceof LineTypeDto.StyleDetailsDto.Dotted) {
            composer.startReplaceGroup(494312211);
            dotted = new SegmentedLine.Style.Dotted(getComposeColor(styleDto, composer, i & 14), ((LineTypeDto.StyleDetailsDto.Dotted) style_details).getValue().getDash_gap(), null);
            composer.endReplaceGroup();
        } else {
            if (!(style_details instanceof LineTypeDto.StyleDetailsDto.Solid)) {
                if (style_details != null) {
                    composer.startReplaceGroup(494309376);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(494334325);
                composer.endReplaceGroup();
                throw new IllegalStateException("Unsupported line type");
            }
            composer.startReplaceGroup(494317816);
            long composeColor = getComposeColor(styleDto, composer, i & 14);
            LinearGradientColorDto gradient_color = styleDto.getGradient_color();
            com.robinhood.shared.compose.color.LinearGradientColor linearGradientColor = gradient_color != null ? SduiColors2.toLinearGradientColor(gradient_color, 0.0f, composer, 0, 1) : null;
            LineTypeDto.StyleDetailsDto.Solid solid = (LineTypeDto.StyleDetailsDto.Solid) style_details;
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(solid.getValue().getStroke_width());
            int i2 = WhenMappings.$EnumSwitchMapping$1[solid.getValue().getCap_style().ordinal()];
            if (i2 == 1) {
                iM6848getButtKaPHkGw = StrokeCap.INSTANCE.m6848getButtKaPHkGw();
            } else if (i2 == 2) {
                iM6848getButtKaPHkGw = StrokeCap.INSTANCE.m6849getRoundKaPHkGw();
            } else if (i2 == 3) {
                iM6848getButtKaPHkGw = StrokeCap.INSTANCE.m6850getSquareKaPHkGw();
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                iM6848getButtKaPHkGw = StrokeCap.INSTANCE.m6848getButtKaPHkGw();
            }
            SegmentedLine.Style.Solid solid2 = new SegmentedLine.Style.Solid(composeColor, linearGradientColor, fM7995constructorimpl, iM6848getButtKaPHkGw, null);
            composer.endReplaceGroup();
            dotted = solid2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return dotted;
    }

    private static final Map<Interactions, SegmentedLine.Style> toInteractionMap(StylesWithStates stylesWithStates, Composer composer, int i) {
        composer.startReplaceGroup(1615344662);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1615344662, i, -1, "com.robinhood.android.sdui.chartgroup.toInteractionMap (SduiChartMappers.kt:200)");
        }
        Map<Interactions, SegmentedLine.Style> mapMutableMapOf = MapsKt.mutableMapOf(Tuples4.m3642to(Interactions.DEFAULT, getSegmentStyle(stylesWithStates.getDefault(), composer, 0)));
        Style active = stylesWithStates.getActive();
        composer.startReplaceGroup(1863033132);
        if (active != null) {
            mapMutableMapOf.put(Interactions.ACTIVE, getSegmentStyle(active, composer, 0));
            Unit unit = Unit.INSTANCE;
        }
        composer.endReplaceGroup();
        Style inactive = stylesWithStates.getInactive();
        if (inactive != null) {
            mapMutableMapOf.put(Interactions.INACTIVE, getSegmentStyle(inactive, composer, 0));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return mapMutableMapOf;
    }

    private static final Map<Interactions, SegmentedLine.Style> toInteractionMap(StylesWithStatesDto stylesWithStatesDto, Composer composer, int i) {
        composer.startReplaceGroup(-877704345);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-877704345, i, -1, "com.robinhood.android.sdui.chartgroup.toInteractionMap (SduiChartMappers.kt:212)");
        }
        StyleDto styleDto = stylesWithStatesDto.getDefault();
        composer.startReplaceGroup(-1660280781);
        SegmentedLine.Style segmentStyle = styleDto == null ? null : getSegmentStyle(styleDto, composer, 0);
        composer.endReplaceGroup();
        if (segmentStyle == null) {
            throw new IllegalStateException("Default segment style must not be null");
        }
        Map<Interactions, SegmentedLine.Style> mapMutableMapOf = MapsKt.mutableMapOf(Tuples4.m3642to(Interactions.DEFAULT, segmentStyle));
        StyleDto active = stylesWithStatesDto.getActive();
        composer.startReplaceGroup(-1660275395);
        if (active != null) {
            mapMutableMapOf.put(Interactions.ACTIVE, getSegmentStyle(active, composer, 0));
            Unit unit = Unit.INSTANCE;
        }
        composer.endReplaceGroup();
        StyleDto inactive = stylesWithStatesDto.getInactive();
        if (inactive != null) {
            mapMutableMapOf.put(Interactions.INACTIVE, getSegmentStyle(inactive, composer, 0));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return mapMutableMapOf;
    }

    public static final SegmentedLine.Segment mapSduiSegment(Segment segment, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        composer.startReplaceGroup(-657581823);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-657581823, i, -1, "com.robinhood.android.sdui.chartgroup.mapSduiSegment (SduiChartMappers.kt:224)");
        }
        List<Point> points = segment.getPoints();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
        for (Point point : points) {
            arrayList.add(new com.robinhood.android.charts.model.Point(point.getX(), point.getY()));
        }
        SegmentedLine.Segment segment2 = new SegmentedLine.Segment(arrayList, toInteractionMap(segment.getStyles(), composer, 0));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return segment2;
    }

    public static final SegmentedLine.Segment mapSegmentDto(SegmentDto segment, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        composer.startReplaceGroup(-760436206);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-760436206, i, -1, "com.robinhood.android.sdui.chartgroup.mapSegmentDto (SduiChartMappers.kt:234)");
        }
        List<PointDto> points = segment.getPoints();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
        for (PointDto pointDto : points) {
            arrayList.add(new com.robinhood.android.charts.model.Point(pointDto.getX(), pointDto.getY()));
        }
        StylesWithStatesDto styles = segment.getStyles();
        Map<Interactions, SegmentedLine.Style> interactionMap = styles == null ? null : toInteractionMap(styles, composer, 0);
        if (interactionMap == null) {
            interactionMap = MapsKt.emptyMap();
        }
        SegmentedLine.Segment segment2 = new SegmentedLine.Segment(arrayList, interactionMap);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return segment2;
    }

    public static final List<SegmentedLine> mapSduiSegmentedLines(List<Line> lines, Composer composer, int i) {
        SegmentedLine dotted;
        Intrinsics.checkNotNullParameter(lines, "lines");
        composer.startReplaceGroup(884793877);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(884793877, i, -1, "com.robinhood.android.sdui.chartgroup.mapSduiSegmentedLines (SduiChartMappers.kt:242)");
        }
        List<Line> list = lines;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Line line : list) {
            if (isDotted(line)) {
                composer.startReplaceGroup(-1760405888);
                List<Segment> segments = line.getSegments();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, 10));
                Iterator<T> it = segments.iterator();
                while (it.hasNext()) {
                    arrayList2.add(mapSduiSegment((Segment) it.next(), composer, 0));
                }
                dotted = new SegmentedLine.Dotted(arrayList2, getDashGap(line), null, 4, null);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1760400615);
                List<Segment> segments2 = line.getSegments();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments2, 10));
                Iterator<T> it2 = segments2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(mapSduiSegment((Segment) it2.next(), composer, 0));
                }
                dotted = new SegmentedLine.Default(arrayList3, null, 2, null);
                composer.endReplaceGroup();
            }
            arrayList.add(dotted);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return arrayList;
    }

    public static final ImmutableList<Fill> mapSduiFills(List<ChartFill> fills, Composer composer, int i) {
        ChartAnnotation gradientAnimationFill;
        ChartAnnotation roundedSolidFill;
        Intrinsics.checkNotNullParameter(fills, "fills");
        composer.startReplaceGroup(-1541608682);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1541608682, i, -1, "com.robinhood.android.sdui.chartgroup.mapSduiFills (SduiChartMappers.kt:276)");
        }
        List<ChartFill> list = fills;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ChartFill chartFill : list) {
            ChartFillStyle style = chartFill.getStyle();
            if (style instanceof DottedChartFillStyle) {
                composer.startReplaceGroup(1841591400);
                List<Point> points = chartFill.getPoints();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
                for (Point point : points) {
                    arrayList2.add(new com.robinhood.android.charts.model.Point(point.getX(), point.getY()));
                }
                DottedChartFillStyle dottedChartFillStyle = (DottedChartFillStyle) style;
                roundedSolidFill = new Fill.DottedFill(arrayList2, SduiColors2.m18896toComposeColorDefaultediJQMabo(dottedChartFillStyle.getDot_color(), 0L, composer, 0, 1), C2002Dp.m7995constructorimpl(dottedChartFillStyle.getDot_size()), C2002Dp.m7995constructorimpl(dottedChartFillStyle.getDot_distance()), dottedChartFillStyle.getOpacity(), null, 32, null);
                composer.endReplaceGroup();
            } else if (style instanceof SolidChartFillStyle) {
                composer.startReplaceGroup(-79128252);
                List<Point> points2 = chartFill.getPoints();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points2, 10));
                for (Point point2 : points2) {
                    arrayList3.add(new com.robinhood.android.charts.model.Point(point2.getX(), point2.getY()));
                }
                SolidChartFillStyle solidChartFillStyle = (SolidChartFillStyle) style;
                roundedSolidFill = new Fill.SolidFill(arrayList3, SduiColors2.m18896toComposeColorDefaultediJQMabo(solidChartFillStyle.getColor(), 0L, composer, 0, 1), solidChartFillStyle.getOpacity(), null, 8, null);
                composer.endReplaceGroup();
            } else if (style instanceof RoundedSolidChartFillStyle) {
                composer.startReplaceGroup(-79118708);
                List<Point> points3 = chartFill.getPoints();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points3, 10));
                for (Point point3 : points3) {
                    arrayList4.add(new com.robinhood.android.charts.model.Point(point3.getX(), point3.getY()));
                }
                RoundedSolidChartFillStyle roundedSolidChartFillStyle = (RoundedSolidChartFillStyle) style;
                roundedSolidFill = new Fill.RoundedSolidFill(arrayList4, SduiColors2.m18896toComposeColorDefaultediJQMabo(roundedSolidChartFillStyle.getColor(), 0L, composer, 0, 1), roundedSolidChartFillStyle.getOpacity(), roundedSolidChartFillStyle.getCorner_radius_info(), null, 16, null);
                composer.endReplaceGroup();
            } else {
                if (style instanceof GradientChartFillStyle) {
                    composer.startReplaceGroup(-79107160);
                    List<Point> points4 = chartFill.getPoints();
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points4, 10));
                    for (Point point4 : points4) {
                        arrayList5.add(new com.robinhood.android.charts.model.Point(point4.getX(), point4.getY()));
                    }
                    gradientAnimationFill = new Fill.GradientFill(extensions2.toPersistentList(arrayList5), mapGradientChartFillStyle((GradientChartFillStyle) style, composer, 0), null, 4, null);
                    composer.endReplaceGroup();
                } else {
                    if (!(style instanceof GradientAnimationChartFillStyle)) {
                        composer.startReplaceGroup(-79142096);
                        composer.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(1842930476);
                    GradientAnimationChartFillStyle gradientAnimationChartFillStyle = (GradientAnimationChartFillStyle) style;
                    String id = gradientAnimationChartFillStyle.getId();
                    List<Point> points5 = chartFill.getPoints();
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points5, 10));
                    for (Point point5 : points5) {
                        arrayList6.add(new com.robinhood.android.charts.model.Point(point5.getX(), point5.getY()));
                    }
                    gradientAnimationFill = new Fill.GradientAnimationFill(id, arrayList6, gradientAnimationChartFillStyle.getGradient_style(), mapGradientChartFillStyle(gradientAnimationChartFillStyle.getBefore_pivot_gradient(), composer, 0), mapGradientChartFillStyle(gradientAnimationChartFillStyle.getAfter_pivot_gradient(), composer, 0), gradientAnimationChartFillStyle.getSpeed(), SduiColors2.m18896toComposeColorDefaultediJQMabo(gradientAnimationChartFillStyle.getBase_color(), 0L, composer, 0, 1), gradientAnimationChartFillStyle.getBase_color_opacity(), gradientAnimationChartFillStyle.getCorner_radius_info(), null, 512, null);
                    composer.endReplaceGroup();
                }
                roundedSolidFill = gradientAnimationFill;
            }
            arrayList.add(roundedSolidFill);
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return persistentList;
    }

    public static final com.robinhood.android.charts.model.GradientChartFillStyle mapGradientChartFillStyle(GradientChartFillStyle sduiStyle, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(sduiStyle, "sduiStyle");
        composer.startReplaceGroup(-1423369753);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1423369753, i, -1, "com.robinhood.android.sdui.chartgroup.mapGradientChartFillStyle (SduiChartMappers.kt:391)");
        }
        long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(SduiColors2.m18896toComposeColorDefaultediJQMabo(sduiStyle.getStart_color(), 0L, composer, 0, 1), sduiStyle.getStart_color_opacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(SduiColors2.m18896toComposeColorDefaultediJQMabo(sduiStyle.getEnd_color(), 0L, composer, 0, 1), sduiStyle.getEnd_color_opacity(), 0.0f, 0.0f, 0.0f, 14, null);
        GradientStyle gradient_style = sduiStyle.getGradient_style();
        ThemedColorStops themed_color_stops = sduiStyle.getThemed_color_stops();
        ImmutableList<GradientChartFillStyle.ColorStop> colorStops = themed_color_stops == null ? null : toColorStops(themed_color_stops, composer, 0);
        if (colorStops == null) {
            colorStops = extensions2.persistentListOf(new GradientChartFillStyle.ColorStop(jM6705copywmQWz5c$default, 0.0f, null), new GradientChartFillStyle.ColorStop(jM6705copywmQWz5c$default2, 1.0f, null));
        }
        com.robinhood.android.charts.model.GradientChartFillStyle gradientChartFillStyle = new com.robinhood.android.charts.model.GradientChartFillStyle(jM6705copywmQWz5c$default, jM6705copywmQWz5c$default2, gradient_style, colorStops, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return gradientChartFillStyle;
    }

    public static final ProtoGradientChartFillStyle mapGradientChartFillStyle(GradientChartFillStyleDto gradientChartFillStyleDto, Composer composer, int i) {
        composer.startReplaceGroup(154876914);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(154876914, i, -1, "com.robinhood.android.sdui.chartgroup.mapGradientChartFillStyle (SduiChartMappers.kt:413)");
        }
        if (gradientChartFillStyleDto == null) {
            throw new IllegalStateException("sduiStyle must not be null");
        }
        long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(SduiColors2.m18897toComposeColorDefaultediJQMabo(gradientChartFillStyleDto.getStart_color(), 0L, composer, 0, 1), gradientChartFillStyleDto.getStart_color_opacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(SduiColors2.m18897toComposeColorDefaultediJQMabo(gradientChartFillStyleDto.getEnd_color(), 0L, composer, 0, 1), gradientChartFillStyleDto.getEnd_color_opacity(), 0.0f, 0.0f, 0.0f, 14, null);
        GradientStyleDto gradient_style = gradientChartFillStyleDto.getGradient_style();
        ThemedColorStopsDto themed_color_stops = gradientChartFillStyleDto.getThemed_color_stops();
        ImmutableList<ProtoGradientChartFillStyle.ColorStop> colorStops = themed_color_stops == null ? null : toColorStops(themed_color_stops, composer, 0);
        if (colorStops == null) {
            colorStops = extensions2.persistentListOf(new ProtoGradientChartFillStyle.ColorStop(jM6705copywmQWz5c$default, 0.0f, null), new ProtoGradientChartFillStyle.ColorStop(jM6705copywmQWz5c$default2, 1.0f, null));
        }
        ProtoGradientChartFillStyle protoGradientChartFillStyle = new ProtoGradientChartFillStyle(jM6705copywmQWz5c$default, jM6705copywmQWz5c$default2, gradient_style, colorStops, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return protoGradientChartFillStyle;
    }

    public static final ImmutableList<GradientChartFillStyle.ColorStop> toColorStops(ThemedColorStops themedColorStops, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(themedColorStops, "<this>");
        composer.startReplaceGroup(-1752938697);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1752938697, i, -1, "com.robinhood.android.sdui.chartgroup.toColorStops (SduiChartMappers.kt:436)");
        }
        List<ColorStopData> light = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).isDay(composer, 0) ? themedColorStops.getLight() : themedColorStops.getDark();
        ArrayList arrayList = new ArrayList();
        for (ColorStopData colorStopData : light) {
            Color composeColor = SduiColors2.toComposeColor(colorStopData.getColor(), composer, 0);
            GradientChartFillStyle.ColorStop colorStop = composeColor != null ? new GradientChartFillStyle.ColorStop(Color.m6705copywmQWz5c$default(composeColor.getValue(), colorStopData.getOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorStopData.getStop(), null) : null;
            if (colorStop != null) {
                arrayList.add(colorStop);
            }
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return persistentList;
    }

    public static final ImmutableList<ProtoGradientChartFillStyle.ColorStop> toColorStops(ThemedColorStopsDto themedColorStopsDto, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(themedColorStopsDto, "<this>");
        composer.startReplaceGroup(-143964570);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-143964570, i, -1, "com.robinhood.android.sdui.chartgroup.toColorStops (SduiChartMappers.kt:448)");
        }
        List<ColorStopDataDto> light = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).isDay(composer, 0) ? themedColorStopsDto.getLight() : themedColorStopsDto.getDark();
        ArrayList arrayList = new ArrayList();
        for (ColorStopDataDto colorStopDataDto : light) {
            Color composeColor = SduiColors2.toComposeColor(colorStopDataDto.getColor(), composer, 0);
            ProtoGradientChartFillStyle.ColorStop colorStop = composeColor != null ? new ProtoGradientChartFillStyle.ColorStop(Color.m6705copywmQWz5c$default(composeColor.getValue(), colorStopDataDto.getOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorStopDataDto.getStop(), null) : null;
            if (colorStop != null) {
                arrayList.add(colorStop);
            }
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return persistentList;
    }

    public static final Axis mapSduiAxis(ChartAxis axis, AxisType axisType, Composer composer, int i) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(axisType, "axisType");
        composer.startReplaceGroup(-734937144);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-734937144, i, -1, "com.robinhood.android.sdui.chartgroup.mapSduiAxis (SduiChartMappers.kt:463)");
        }
        Map<String, DisplayText> scrubbing_labels = axis.getScrubbing_labels();
        if (scrubbing_labels != null) {
            listEmptyList = new ArrayList(scrubbing_labels.size());
            for (Map.Entry<String, DisplayText> entry : scrubbing_labels.entrySet()) {
                String key = entry.getKey();
                DisplayText value = entry.getValue();
                listEmptyList.add(new AxisScrubLabel(value.getValue(), value.getColor(), Float.parseFloat(key)));
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        List<ChartAxisLabel> labels = axis.getLabels();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels, 10));
        for (ChartAxisLabel chartAxisLabel : labels) {
            arrayList.add(new AxisLabel(chartAxisLabel.getText(), chartAxisLabel.getText_style(), chartAxisLabel.getColor(), chartAxisLabel.getValue()));
        }
        Axis axis2 = new Axis(arrayList, mapSduiAxisRange(axis.getRange(), composer, 0), mapSduiAxisRange(axis.getEffective_range(), composer, 0), list, axisType);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return axis2;
    }

    public static final ProtoAxis mapSduiAxis(ChartAxisDto axis, AxisType axisType, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(axisType, "axisType");
        composer.startReplaceGroup(1073845315);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1073845315, i, -1, "com.robinhood.android.sdui.chartgroup.mapSduiAxis (SduiChartMappers.kt:484)");
        }
        Map<String, DisplayTextDto> scrubbing_labels = axis.getScrubbing_labels();
        ArrayList arrayList = new ArrayList(scrubbing_labels.size());
        for (Map.Entry<String, DisplayTextDto> entry : scrubbing_labels.entrySet()) {
            String key = entry.getKey();
            DisplayTextDto value = entry.getValue();
            arrayList.add(new ProtoAxisScrubLabel(value.getValue(), value.getColor(), Float.parseFloat(key)));
        }
        List<ChartAxisLabelDto> labels = axis.getLabels();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels, 10));
        for (ChartAxisLabelDto chartAxisLabelDto : labels) {
            arrayList2.add(new ProtoAxisLabel(chartAxisLabelDto.getText(), chartAxisLabelDto.getText_style(), chartAxisLabelDto.getColor(), chartAxisLabelDto.getValue()));
        }
        ProtoAxis protoAxis = new ProtoAxis(arrayList2, mapSduiAxisRange(axis.getRange(), composer, 0), mapSduiAxisRange(axis.getEffective_range(), composer, 0), arrayList, axisType);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return protoAxis;
    }

    private static final AxisRange<?> mapSduiAxisRange(ChartAxisRange chartAxisRange, Composer composer, int i) {
        AxisRange<?> unitlessAxisRange;
        composer.startReplaceGroup(-440082042);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-440082042, i, -1, "com.robinhood.android.sdui.chartgroup.mapSduiAxisRange (SduiChartMappers.kt:502)");
        }
        if (chartAxisRange == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        if (chartAxisRange instanceof MoneyAxisRange) {
            MoneyAxisRange moneyAxisRange = (MoneyAxisRange) chartAxisRange;
            unitlessAxisRange = new AxisRange.MoneyAxisRange(moneyAxisRange.getMin_value(), moneyAxisRange.getMax_value());
        } else {
            if (!(chartAxisRange instanceof UnitlessAxisRange)) {
                throw new NoWhenBranchMatchedException();
            }
            UnitlessAxisRange unitlessAxisRange2 = (UnitlessAxisRange) chartAxisRange;
            unitlessAxisRange = new AxisRange.UnitlessAxisRange(unitlessAxisRange2.getMin_value(), unitlessAxisRange2.getMax_value());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return unitlessAxisRange;
    }

    private static final ProtoAxisRange<?> mapSduiAxisRange(ChartAxisRangeDto chartAxisRangeDto, Composer composer, int i) {
        composer.startReplaceGroup(-1146635109);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1146635109, i, -1, "com.robinhood.android.sdui.chartgroup.mapSduiAxisRange (SduiChartMappers.kt:518)");
        }
        ProtoAxisRange<?> unitlessAxisRange = null;
        if (chartAxisRangeDto == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        ChartAxisRangeDto.RangeDetailsDto range_details = chartAxisRangeDto.getRange_details();
        if (range_details instanceof ChartAxisRangeDto.RangeDetailsDto.Money) {
            MoneyAxisRangeDto money = chartAxisRangeDto.getMoney();
            MoneyDto min_value = money != null ? money.getMin_value() : null;
            MoneyAxisRangeDto money2 = chartAxisRangeDto.getMoney();
            MoneyDto max_value = money2 != null ? money2.getMax_value() : null;
            if (min_value != null && max_value != null) {
                unitlessAxisRange = new ProtoAxisRange.MoneyAxisRange(min_value, max_value);
            }
        } else {
            if (!(range_details instanceof ChartAxisRangeDto.RangeDetailsDto.Unitless)) {
                if (range_details != null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Unsupported axis range type");
            }
            UnitlessAxisRangeDto unitless = chartAxisRangeDto.getUnitless();
            Float fValueOf = unitless != null ? Float.valueOf(unitless.getMin_value()) : null;
            UnitlessAxisRangeDto unitless2 = chartAxisRangeDto.getUnitless();
            Float fValueOf2 = unitless2 != null ? Float.valueOf(unitless2.getMax_value()) : null;
            if (fValueOf != null && fValueOf2 != null) {
                unitlessAxisRange = new ProtoAxisRange.UnitlessAxisRange(fValueOf.floatValue(), fValueOf2.floatValue());
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return unitlessAxisRange;
    }

    @JvmName
    public static final long getComposeColor(ChartLine.Segment.Style style, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(style, "<this>");
        composer.startReplaceGroup(-1916014800);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1916014800, i, -1, "com.robinhood.android.sdui.chartgroup.<get-composeColor> (SduiChartMappers.kt:556)");
        }
        long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(SduiColors2.m18896toComposeColorDefaultediJQMabo(style.getColor(), 0L, composer, 0, 1), style.getOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM6705copywmQWz5c$default;
    }

    /* renamed from: toSegmentedStyle-RxXgDco, reason: not valid java name */
    public static final SegmentedLine.Style m18606toSegmentedStyleRxXgDco(ChartLine.Segment.Style toSegmentedStyle, float f, Color color, Composer composer, int i, int i2) {
        SegmentedLine.Style dotted;
        Intrinsics.checkNotNullParameter(toSegmentedStyle, "$this$toSegmentedStyle");
        composer.startReplaceGroup(696421192);
        if ((i2 & 1) != 0) {
            f = DefaultStrokeWidth;
        }
        float f2 = f;
        if ((i2 & 2) != 0) {
            color = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(696421192, i, -1, "com.robinhood.android.sdui.chartgroup.toSegmentedStyle (SduiChartMappers.kt:565)");
        }
        LineType lineType = toSegmentedStyle.getLineType();
        if (lineType instanceof LineType.Dotted) {
            composer.startReplaceGroup(-754124724);
            dotted = new SegmentedLine.Style.Dotted(color == null ? getComposeColor(toSegmentedStyle, composer, i & 14) : color.getValue(), ((LineType.Dotted) lineType).getDashGap(), null);
            composer.endReplaceGroup();
        } else {
            if (!(lineType instanceof LineType.Solid)) {
                composer.startReplaceGroup(-754126866);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-754119804);
            SegmentedLine.Style.Solid solid = new SegmentedLine.Style.Solid(color == null ? getComposeColor(toSegmentedStyle, composer, i & 14) : color.getValue(), null, f2, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), 2, null);
            composer.endReplaceGroup();
            dotted = solid;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return dotted;
    }

    /* renamed from: toInteractionMap-RxXgDco, reason: not valid java name */
    private static final Map<Interactions, SegmentedLine.Style> m18605toInteractionMapRxXgDco(ChartLine.Segment.StyleSet styleSet, float f, Color color, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-538943412);
        if ((i2 & 2) != 0) {
            color = null;
        }
        Color color2 = color;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-538943412, i, -1, "com.robinhood.android.sdui.chartgroup.toInteractionMap (SduiChartMappers.kt:585)");
        }
        int i3 = i & 1008;
        Map<Interactions, SegmentedLine.Style> mapMutableMapOf = MapsKt.mutableMapOf(Tuples4.m3642to(Interactions.DEFAULT, m18606toSegmentedStyleRxXgDco(styleSet.getDefault(), f, color2, composer, i3, 0)));
        ChartLine.Segment.Style active = styleSet.getActive();
        composer.startReplaceGroup(1766433728);
        if (active != null) {
            mapMutableMapOf.put(Interactions.ACTIVE, m18606toSegmentedStyleRxXgDco(active, f, color2, composer, i3, 0));
            Unit unit = Unit.INSTANCE;
        }
        composer.endReplaceGroup();
        ChartLine.Segment.Style inactive = styleSet.getInactive();
        if (inactive != null) {
            mapMutableMapOf.put(Interactions.INACTIVE, m18606toSegmentedStyleRxXgDco(inactive, f, color2, composer, i3, 0));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return mapMutableMapOf;
    }

    public static final SegmentedLine.Segment toSegment(Segment segment, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, "<this>");
        composer.startReplaceGroup(-406207405);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-406207405, i, -1, "com.robinhood.android.sdui.chartgroup.toSegment (SduiChartMappers.kt:597)");
        }
        List<Point> points = segment.getPoints();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
        for (Point point : points) {
            arrayList.add(new com.robinhood.android.charts.model.Point(point.getX(), point.getY()));
        }
        SegmentedLine.Segment segment2 = new SegmentedLine.Segment(arrayList, toInteractionMap(segment.getStyles(), composer, 0));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return segment2;
    }

    /* renamed from: mapSdcSegment-RxXgDco, reason: not valid java name */
    public static final SegmentedLine.Segment m18603mapSdcSegmentRxXgDco(ChartLine.Segment segment, float f, Color color, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        composer.startReplaceGroup(-1421929705);
        if ((i2 & 2) != 0) {
            f = DefaultStrokeWidth;
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            color = null;
        }
        Color color2 = color;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1421929705, i, -1, "com.robinhood.android.sdui.chartgroup.mapSdcSegment (SduiChartMappers.kt:611)");
        }
        List<ChartPoint> points = segment.getPoints();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
        for (ChartPoint chartPoint : points) {
            arrayList.add(new com.robinhood.android.charts.model.Point(chartPoint.getX(), chartPoint.getY()));
        }
        SegmentedLine.Segment segment2 = new SegmentedLine.Segment(arrayList, m18605toInteractionMapRxXgDco(segment.getStyles(), f2, color2, composer, i & 1008, 0));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return segment2;
    }

    /* renamed from: mapSdcSegmentedLines-RxXgDco, reason: not valid java name */
    public static final ImmutableList<SegmentedLine> m18604mapSdcSegmentedLinesRxXgDco(List<ChartLine> lines, float f, Color color, Composer composer, int i, int i2) {
        float f2;
        SegmentedLine dotted;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(lines, "lines");
        composer2.startReplaceGroup(-1936381691);
        float f3 = (i2 & 2) != 0 ? DefaultStrokeWidth : f;
        Color color2 = (i2 & 4) != 0 ? null : color;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1936381691, i, -1, "com.robinhood.android.sdui.chartgroup.mapSdcSegmentedLines (SduiChartMappers.kt:625)");
        }
        List<ChartLine> list = lines;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ChartLine chartLine : list) {
            if (isDotted(chartLine)) {
                composer2.startReplaceGroup(1018341750);
                List<ChartLine.Segment> segments = chartLine.getSegments();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, 10));
                Iterator<T> it = segments.iterator();
                while (it.hasNext()) {
                    arrayList2.add(m18603mapSdcSegmentRxXgDco((ChartLine.Segment) it.next(), 0.0f, color2, composer2, i & 896, 2));
                }
                dotted = new SegmentedLine.Dotted(arrayList2, getDashGap(chartLine), null, 4, null);
                composer2.endReplaceGroup();
                f2 = f3;
            } else {
                composer2.startReplaceGroup(1018352162);
                List<ChartLine.Segment> segments2 = chartLine.getSegments();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments2, 10));
                Iterator<T> it2 = segments2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(m18603mapSdcSegmentRxXgDco((ChartLine.Segment) it2.next(), f3, color2, composer2, i & 1008, 0));
                    composer2 = composer;
                }
                f2 = f3;
                dotted = new SegmentedLine.Default(arrayList3, null, 2, null);
                composer.endReplaceGroup();
            }
            arrayList.add(dotted);
            composer2 = composer;
            f3 = f2;
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return persistentList;
    }

    public static final ImmutableList<SegmentedLine> toSegmentedLines(List<Line> list, float f, Composer composer, int i, int i2) {
        SegmentedLine dotted;
        Intrinsics.checkNotNullParameter(list, "<this>");
        composer.startReplaceGroup(1619118625);
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1619118625, i, -1, "com.robinhood.android.sdui.chartgroup.toSegmentedLines (SduiChartMappers.kt:653)");
        }
        List<Line> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Line line : list2) {
            if (isDotted(line)) {
                composer.startReplaceGroup(-415781045);
                List<Segment> segments = line.getSegments();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, 10));
                Iterator<T> it = segments.iterator();
                while (it.hasNext()) {
                    arrayList2.add(toSegment((Segment) it.next(), composer, 0));
                }
                dotted = new SegmentedLine.Dotted(arrayList2, getDashGap(line) + f, null, 4, null);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-415775280);
                List<Segment> segments2 = line.getSegments();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments2, 10));
                Iterator<T> it2 = segments2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(toSegment((Segment) it2.next(), composer, 0));
                }
                dotted = new SegmentedLine.Default(arrayList3, null, 2, null);
                composer.endReplaceGroup();
            }
            arrayList.add(dotted);
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return persistentList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Point> getHorizontalChartPoints(List<Line> list, com.robinhood.android.charts.model.Point point) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<Segment> segments = ((Line) it.next()).getSegments();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = segments.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList2, ((Segment) it2.next()).getPoints());
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (((Point) next).getX() == point.getX()) {
                    break;
                }
            }
            Point point2 = (Point) next;
            if (point2 != null) {
                arrayList.add(point2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Point> getHorizontalChartFillPoints(List<ChartFill> list, com.robinhood.android.charts.model.Point point) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((ChartFill) it.next()).getPoints().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((Point) next).getX() == point.getX()) {
                    break;
                }
            }
            Point point2 = (Point) next;
            if (point2 != null) {
                arrayList.add(point2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiCandlestickChart$lambda$57$lambda$56(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* compiled from: SduiChartMappers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$SduiCandlestickChart$3 */
    static final class C279003 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ List<ChartFill> $fills;
        final /* synthetic */ Set<Float> $legendPoints;
        final /* synthetic */ List<Line> $lines;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<List<Point>, Unit> $onScrub;
        final /* synthetic */ Function0<Unit> $onScrubStopped;
        final /* synthetic */ boolean $scrubLine;
        final /* synthetic */ boolean $showPlaceholder;

        /* JADX WARN: Multi-variable type inference failed */
        C279003(List<ChartFill> list, List<Line> list2, Modifier modifier, boolean z, Set<Float> set, Function1<? super List<Point>, Unit> function1, Function0<Unit> function0, boolean z2) {
            this.$fills = list;
            this.$lines = list2;
            this.$modifier = modifier;
            this.$scrubLine = z;
            this.$legendPoints = set;
            this.$onScrub = function1;
            this.$onScrubStopped = function0;
            this.$showPlaceholder = z2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-574993366, i, -1, "com.robinhood.android.sdui.chartgroup.SduiCandlestickChart.<anonymous> (SduiChartMappers.kt:695)");
            }
            ImmutableList<Fill> immutableListMapSduiFills = SduiChartMappersKt.mapSduiFills(this.$fills, composer, 0);
            List<SegmentedLine> listMapSduiSegmentedLines = SduiChartMappersKt.mapSduiSegmentedLines(this.$lines, composer, 0);
            Modifier modifier = this.$modifier;
            boolean z = this.$scrubLine;
            Set<Float> set = this.$legendPoints;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onScrub) | composer.changedInstance(this.$fills);
            final Function1<List<Point>, Unit> function1 = this.$onScrub;
            final List<ChartFill> list = this.$fills;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$SduiCandlestickChart$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiChartMappersKt.C279003.invoke$lambda$1$lambda$0(function1, list, (com.robinhood.android.charts.model.Point) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CandlestickChart.CandlestickChart(modifier, immutableListMapSduiFills, listMapSduiSegmentedLines, z, set, null, null, (Function1) objRememberedValue, this.$onScrubStopped, this.$showPlaceholder, composer, 0, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, List list, com.robinhood.android.charts.model.Point point) {
            Intrinsics.checkNotNullParameter(point, "point");
            function1.invoke(SduiChartMappersKt.getHorizontalChartFillPoints(list, point));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiCandlestickChart(Modifier modifier, final List<ChartFill> fills, final List<Line> lines, final Set<Float> legendPoints, final SduiActionHandler<? super ActionT> actionHandler, boolean z, Function1<? super List<Point>, Unit> function1, Function0<Unit> function0, boolean z2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z3;
        int i4;
        Function1<? super List<Point>, Unit> function12;
        int i5;
        int i6;
        int i7;
        Function1<? super List<Point>, Unit> function13;
        Function0<Unit> function02;
        final Modifier modifier3;
        final boolean z4;
        final Function0<Unit> function03;
        final Function1<? super List<Point>, Unit> function14;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(fills, "fills");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(legendPoints, "legendPoints");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(1450970121);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(fills) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(lines) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(legendPoints) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 16384 : 8192;
        }
        int i9 = i2 & 32;
        if (i9 != 0) {
            i3 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else {
                if ((1572864 & i) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                }
                i6 = i2 & 256;
                if (i6 == 0) {
                    if ((i & 100663296) == 0) {
                        i7 = i6;
                        i3 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
                    }
                    if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i9 != 0) {
                            z3 = true;
                        }
                        if (i4 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return SduiChartMappersKt.SduiCandlestickChart$lambda$57$lambda$56((List) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            function13 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function13 = function12;
                        }
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function02 = (Function0) objRememberedValue2;
                        } else {
                            function02 = function0;
                        }
                        boolean z6 = i7 == 0 ? false : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1450970121, i3, -1, "com.robinhood.android.sdui.chartgroup.SduiCandlestickChart (SduiChartMappers.kt:693)");
                        }
                        int i10 = i3;
                        Function1<? super List<Point>, Unit> function15 = function13;
                        boolean z7 = z3;
                        boolean z8 = z6;
                        SduiActionHandler3.ProvideActionHandler(actionHandler, ComposableLambda3.rememberComposableLambda(-574993366, true, new C279003(fills, lines, modifier4, z7, legendPoints, function15, function02, z8), composerStartRestartGroup, 54), composerStartRestartGroup, ((i10 >> 12) & 14) | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z4 = z8;
                        function03 = function02;
                        function14 = function15;
                        z5 = z7;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z4 = z2;
                        modifier3 = modifier2;
                        z5 = z3;
                        function14 = function12;
                        function03 = function0;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SduiChartMappersKt.SduiCandlestickChart$lambda$60(modifier3, fills, lines, legendPoints, actionHandler, z5, function14, function03, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 100663296;
                i7 = i6;
                if ((i3 & 38347923) == 38347922) {
                    if (i8 == 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i102 = i3;
                    Function1<? super List<Point>, Unit> function152 = function13;
                    boolean z72 = z3;
                    boolean z82 = z6;
                    SduiActionHandler3.ProvideActionHandler(actionHandler, ComposableLambda3.rememberComposableLambda(-574993366, true, new C279003(fills, lines, modifier4, z72, legendPoints, function152, function02, z82), composerStartRestartGroup, 54), composerStartRestartGroup, ((i102 >> 12) & 14) | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    z4 = z82;
                    function03 = function02;
                    function14 = function152;
                    z5 = z72;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function12 = function1;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z3 = z;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final /* synthetic */ <ActionT extends Parcelable> void SduiSegmentedLineChart(Modifier modifier, List<ChartFill> list, List<Line> lines, List<? extends UIComponent<? extends ActionT>> overlays, SduiActionHandler<? super ActionT> sduiActionHandler, AnimationSpec<Float> animationSpec, boolean z, Function1<? super com.robinhood.android.charts.model.Point, Unit> function1, Function1<? super List<Point>, Unit> function12, Function0<Unit> function0, boolean z2, float f, Composer composer, int i, int i2, int i3) {
        Function1<? super com.robinhood.android.charts.model.Point, Unit> function13;
        Function1<? super List<Point>, Unit> function14;
        Function0<Unit> function02;
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
        composer.startReplaceGroup(977840936);
        Modifier modifier2 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        List<ChartFill> listEmptyList = (i3 & 2) != 0 ? CollectionsKt.emptyList() : list;
        AnimationSpec<Float> animationSpec2 = (i3 & 32) != 0 ? null : animationSpec;
        boolean z3 = (i3 & 64) != 0 ? true : z;
        if ((i3 & 128) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<com.robinhood.android.charts.model.Point, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$SduiSegmentedLineChart$1$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(com.robinhood.android.charts.model.Point it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(com.robinhood.android.charts.model.Point point) {
                        invoke2(point);
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function13 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        } else {
            function13 = function1;
        }
        if ((i3 & 256) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1<List<? extends Point>, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$SduiSegmentedLineChart$2$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<Point> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Point> list2) {
                        invoke2((List<Point>) list2);
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            function14 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
        } else {
            function14 = function12;
        }
        if ((i3 & 512) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$SduiSegmentedLineChart$3$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            function02 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
        } else {
            function02 = function0;
        }
        boolean z4 = (i3 & 1024) != 0 ? false : z2;
        float f2 = (i3 & 2048) != 0 ? 0.0f : f;
        Intrinsics.reifiedOperationMarker(4, "ActionT");
        int i4 = i >> 6;
        SduiSegmentedLineChart(modifier2, listEmptyList, lines, overlays, sduiActionHandler, function13, function14, function02, z4, z3, animationSpec2, f2, Parcelable.class, composer, (i & 65534) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128) | ((i2 << 24) & 234881024) | ((i << 9) & 1879048192), ((i >> 15) & 14) | (i2 & 112), 0);
        composer.endReplaceGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiSegmentedLineChart$lambda$65$lambda$64(com.robinhood.android.charts.model.Point it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiSegmentedLineChart$lambda$67$lambda$66(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0132  */
    @PublishedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiSegmentedLineChart(Modifier modifier, List<ChartFill> list, final List<Line> lines, final List<? extends UIComponent<? extends ActionT>> overlays, final SduiActionHandler<? super ActionT> sduiActionHandler, Function1<? super com.robinhood.android.charts.model.Point, Unit> function1, Function1<? super List<Point>, Unit> function12, Function0<Unit> function0, boolean z, boolean z2, AnimationSpec<Float> animationSpec, float f, final Class<ActionT> actionClass, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        List<ChartFill> list2;
        SduiActionHandler<? super ActionT> sduiActionHandler2;
        int i5;
        Function1<? super com.robinhood.android.charts.model.Point, Unit> function13;
        int i6;
        Function1<? super List<Point>, Unit> function14;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        final Function1<? super com.robinhood.android.charts.model.Point, Unit> function15;
        Function1<? super List<Point>, Unit> function16;
        final Function0<Unit> function02;
        Modifier modifier3;
        Composer composer2;
        final List<ChartFill> list3;
        final boolean z3;
        final Function1<? super com.robinhood.android.charts.model.Point, Unit> function17;
        final Function0<Unit> function03;
        final Modifier modifier4;
        final Function1<? super List<Point>, Unit> function18;
        final boolean z4;
        final AnimationSpec<Float> animationSpec2;
        final float f2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
        Intrinsics.checkNotNullParameter(actionClass, "actionClass");
        Composer composerStartRestartGroup = composer.startRestartGroup(1196994644);
        int i18 = i3 & 1;
        if (i18 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
            list2 = list;
        } else {
            list2 = list;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(lines) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(overlays) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                sduiActionHandler2 = sduiActionHandler;
                i4 |= composerStartRestartGroup.changedInstance(sduiActionHandler2) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
                function13 = function1;
            } else {
                function13 = function1;
                if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
                }
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                function14 = function12;
            } else {
                function14 = function12;
                if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function14) ? 1048576 : 524288;
                }
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
            } else {
                if ((i & 12582912) == 0) {
                    i8 = i7;
                    i4 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i10 = i9;
                        i4 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                    }
                    i11 = i3 & 512;
                    if (i11 != 0) {
                        if ((i & 805306368) == 0) {
                            i12 = i11;
                            i4 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i15 = i2 | 6;
                            i14 = i13;
                        } else if ((i2 & 6) == 0) {
                            i14 = i13;
                            i15 = i2 | (composerStartRestartGroup.changedInstance(animationSpec) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i2;
                        }
                        i16 = i3 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i2 & 48) == 0) {
                            i17 = i16;
                            i15 |= composerStartRestartGroup.changed(f) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i20 = i15;
                        if ((i3 & 4096) != 0) {
                            i20 |= 384;
                        } else if ((i2 & 384) == 0) {
                            i20 |= composerStartRestartGroup.changedInstance(actionClass) ? 256 : 128;
                        }
                        if ((306783379 & i4) != 306783378 || (i20 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier5 = i18 == 0 ? Modifier.INSTANCE : modifier2;
                            List<ChartFill> listEmptyList = i19 == 0 ? CollectionsKt.emptyList() : list2;
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SduiChartMappersKt.SduiSegmentedLineChart$lambda$65$lambda$64((com.robinhood.android.charts.model.Point) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function15 = (Function1) objRememberedValue;
                            } else {
                                function15 = function13;
                            }
                            if (i6 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SduiChartMappersKt.SduiSegmentedLineChart$lambda$67$lambda$66((List) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                function16 = (Function1) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function16 = function14;
                            }
                            if (i8 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function02 = (Function0) objRememberedValue3;
                            } else {
                                function02 = function0;
                            }
                            final boolean z5 = i10 == 0 ? false : z;
                            boolean z6 = i12 == 0 ? true : z2;
                            AnimationSpec<Float> animationSpec3 = i14 == 0 ? null : animationSpec;
                            float f3 = i17 == 0 ? 0.0f : f;
                            if (ComposerKt.isTraceInProgress()) {
                                modifier3 = modifier5;
                            } else {
                                modifier3 = modifier5;
                                ComposerKt.traceEventStart(1196994644, i4, i20, "com.robinhood.android.sdui.chartgroup.SduiSegmentedLineChart (SduiChartMappers.kt:758)");
                            }
                            composer2 = composerStartRestartGroup;
                            list3 = listEmptyList;
                            final Function1<? super List<Point>, Unit> function19 = function16;
                            final SduiActionHandler<? super ActionT> sduiActionHandler3 = sduiActionHandler2;
                            final boolean z7 = z6;
                            final AnimationSpec<Float> animationSpec4 = animationSpec3;
                            final float f4 = f3;
                            final Modifier modifier6 = modifier3;
                            CompositionLocal3.CompositionLocalProvider(UtilKt.getLocalActionClass().provides(actionClass), ComposableLambda3.rememberComposableLambda(1782997908, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt.SduiSegmentedLineChart.7

                                /* compiled from: SduiChartMappers.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$SduiSegmentedLineChart$7$1, reason: invalid class name */
                                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ float $dashGapAdjustment;
                                    final /* synthetic */ List<ChartFill> $fills;
                                    final /* synthetic */ AnimationSpec<Float> $lineRevealAnimationSpec;
                                    final /* synthetic */ List<Line> $lines;
                                    final /* synthetic */ Modifier $modifier;
                                    final /* synthetic */ Function0<Unit> $onChartPointsScrubStopped;
                                    final /* synthetic */ Function1<List<Point>, Unit> $onChartPointsScrubbed;
                                    final /* synthetic */ Function1<com.robinhood.android.charts.model.Point, Unit> $onScrub;
                                    final /* synthetic */ List<UIComponent<ActionT>> $overlays;
                                    final /* synthetic */ boolean $scrubLine;
                                    final /* synthetic */ boolean $showPlaceholder;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    AnonymousClass1(List<ChartFill> list, List<Line> list2, float f, List<? extends UIComponent<? extends ActionT>> list3, boolean z, Modifier modifier, Function1<? super com.robinhood.android.charts.model.Point, Unit> function1, Function1<? super List<Point>, Unit> function12, Function0<Unit> function0, boolean z2, AnimationSpec<Float> animationSpec) {
                                        this.$fills = list;
                                        this.$lines = list2;
                                        this.$dashGapAdjustment = f;
                                        this.$overlays = list3;
                                        this.$scrubLine = z;
                                        this.$modifier = modifier;
                                        this.$onScrub = function1;
                                        this.$onChartPointsScrubbed = function12;
                                        this.$onChartPointsScrubStopped = function0;
                                        this.$showPlaceholder = z2;
                                        this.$lineRevealAnimationSpec = animationSpec;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer, int i) {
                                        if ((i & 3) == 2 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1293356141, i, -1, "com.robinhood.android.sdui.chartgroup.SduiSegmentedLineChart.<anonymous>.<anonymous> (SduiChartMappers.kt:763)");
                                        }
                                        ImmutableList<Fill> immutableListMapSduiFills = SduiChartMappersKt.mapSduiFills(this.$fills, composer, 0);
                                        ImmutableList<SegmentedLine> segmentedLines = SduiChartMappersKt.toSegmentedLines(this.$lines, this.$dashGapAdjustment, composer, 0, 0);
                                        ImmutableList<Overlays> chartOverlays = SduiChartLayeredStack2.toChartOverlays(this.$overlays);
                                        ScrubWindow scrubWindow = SduiChartMappersKt.getScrubWindow(this.$lines);
                                        ScrubLineType scrubLineType = this.$scrubLine ? ScrubLineType.DEFAULT : ScrubLineType.SCRUBBING_DISABLED;
                                        Modifier modifier = this.$modifier;
                                        composer.startReplaceGroup(-1746271574);
                                        boolean zChanged = composer.changed(this.$onScrub) | composer.changed(this.$onChartPointsScrubbed) | composer.changedInstance(this.$lines);
                                        final Function1<com.robinhood.android.charts.model.Point, Unit> function1 = this.$onScrub;
                                        final Function1<List<Point>, Unit> function12 = this.$onChartPointsScrubbed;
                                        final List<Line> list = this.$lines;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$SduiSegmentedLineChart$7$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return SduiChartMappersKt.C279017.AnonymousClass1.invoke$lambda$1$lambda$0(function1, function12, list, (com.robinhood.android.charts.model.Point) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        SegmentedLineChart.SegmentedLineChart(segmentedLines, modifier, immutableListMapSduiFills, null, chartOverlays, scrubWindow, (Function1) objRememberedValue, this.$onChartPointsScrubStopped, scrubLineType, this.$showPlaceholder, this.$lineRevealAnimationSpec, composer, (ScrubWindow.$stable << 15) | SegmentedLine.$stable | (Overlays.$stable << 12), 0, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, Function1 function12, List list, com.robinhood.android.charts.model.Point point) {
                                        Intrinsics.checkNotNullParameter(point, "point");
                                        function1.invoke(point);
                                        function12.invoke(SduiChartMappersKt.getHorizontalChartPoints(list, point));
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i21) {
                                    if ((i21 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1782997908, i21, -1, "com.robinhood.android.sdui.chartgroup.SduiSegmentedLineChart.<anonymous> (SduiChartMappers.kt:762)");
                                    }
                                    SduiActionHandler3.ProvideActionHandler(sduiActionHandler3, ComposableLambda3.rememberComposableLambda(-1293356141, true, new AnonymousClass1(list3, lines, f4, overlays, z7, modifier6, function15, function19, function02, z5, animationSpec4), composer3, 54), composer3, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            Function0<Unit> function04 = function02;
                            z3 = z7;
                            function17 = function15;
                            function03 = function04;
                            modifier4 = modifier6;
                            function18 = function19;
                            z4 = z5;
                            animationSpec2 = animationSpec4;
                            f2 = f4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z4 = z;
                            z3 = z2;
                            composer2 = composerStartRestartGroup;
                            list3 = list2;
                            modifier4 = modifier2;
                            function17 = function13;
                            function18 = function14;
                            function03 = function0;
                            animationSpec2 = animationSpec;
                            f2 = f;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return SduiChartMappersKt.SduiSegmentedLineChart$lambda$70(modifier4, list3, lines, overlays, sduiActionHandler, function17, function18, function03, z4, z3, animationSpec2, f2, actionClass, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i12 = i11;
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 != 0) {
                    }
                    int i202 = i15;
                    if ((i3 & 4096) != 0) {
                    }
                    if ((306783379 & i4) != 306783378) {
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composerStartRestartGroup;
                        list3 = listEmptyList;
                        final Function1<? super List<Point>, Unit> function192 = function16;
                        final SduiActionHandler<? super ActionT> sduiActionHandler32 = sduiActionHandler2;
                        final boolean z72 = z6;
                        final AnimationSpec<Float> animationSpec42 = animationSpec3;
                        final float f42 = f3;
                        final Modifier modifier62 = modifier3;
                        CompositionLocal3.CompositionLocalProvider(UtilKt.getLocalActionClass().provides(actionClass), ComposableLambda3.rememberComposableLambda(1782997908, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt.SduiSegmentedLineChart.7

                            /* compiled from: SduiChartMappers.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$SduiSegmentedLineChart$7$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ float $dashGapAdjustment;
                                final /* synthetic */ List<ChartFill> $fills;
                                final /* synthetic */ AnimationSpec<Float> $lineRevealAnimationSpec;
                                final /* synthetic */ List<Line> $lines;
                                final /* synthetic */ Modifier $modifier;
                                final /* synthetic */ Function0<Unit> $onChartPointsScrubStopped;
                                final /* synthetic */ Function1<List<Point>, Unit> $onChartPointsScrubbed;
                                final /* synthetic */ Function1<com.robinhood.android.charts.model.Point, Unit> $onScrub;
                                final /* synthetic */ List<UIComponent<ActionT>> $overlays;
                                final /* synthetic */ boolean $scrubLine;
                                final /* synthetic */ boolean $showPlaceholder;

                                /* JADX WARN: Multi-variable type inference failed */
                                AnonymousClass1(List<ChartFill> list, List<Line> list2, float f, List<? extends UIComponent<? extends ActionT>> list3, boolean z, Modifier modifier, Function1<? super com.robinhood.android.charts.model.Point, Unit> function1, Function1<? super List<Point>, Unit> function12, Function0<Unit> function0, boolean z2, AnimationSpec<Float> animationSpec) {
                                    this.$fills = list;
                                    this.$lines = list2;
                                    this.$dashGapAdjustment = f;
                                    this.$overlays = list3;
                                    this.$scrubLine = z;
                                    this.$modifier = modifier;
                                    this.$onScrub = function1;
                                    this.$onChartPointsScrubbed = function12;
                                    this.$onChartPointsScrubStopped = function0;
                                    this.$showPlaceholder = z2;
                                    this.$lineRevealAnimationSpec = animationSpec;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1293356141, i, -1, "com.robinhood.android.sdui.chartgroup.SduiSegmentedLineChart.<anonymous>.<anonymous> (SduiChartMappers.kt:763)");
                                    }
                                    ImmutableList<Fill> immutableListMapSduiFills = SduiChartMappersKt.mapSduiFills(this.$fills, composer, 0);
                                    ImmutableList<SegmentedLine> segmentedLines = SduiChartMappersKt.toSegmentedLines(this.$lines, this.$dashGapAdjustment, composer, 0, 0);
                                    ImmutableList<Overlays> chartOverlays = SduiChartLayeredStack2.toChartOverlays(this.$overlays);
                                    ScrubWindow scrubWindow = SduiChartMappersKt.getScrubWindow(this.$lines);
                                    ScrubLineType scrubLineType = this.$scrubLine ? ScrubLineType.DEFAULT : ScrubLineType.SCRUBBING_DISABLED;
                                    Modifier modifier = this.$modifier;
                                    composer.startReplaceGroup(-1746271574);
                                    boolean zChanged = composer.changed(this.$onScrub) | composer.changed(this.$onChartPointsScrubbed) | composer.changedInstance(this.$lines);
                                    final Function1 function1 = this.$onScrub;
                                    final Function1 function12 = this.$onChartPointsScrubbed;
                                    final List list = this.$lines;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.android.sdui.chartgroup.SduiChartMappersKt$SduiSegmentedLineChart$7$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return SduiChartMappersKt.C279017.AnonymousClass1.invoke$lambda$1$lambda$0(function1, function12, list, (com.robinhood.android.charts.model.Point) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    SegmentedLineChart.SegmentedLineChart(segmentedLines, modifier, immutableListMapSduiFills, null, chartOverlays, scrubWindow, (Function1) objRememberedValue, this.$onChartPointsScrubStopped, scrubLineType, this.$showPlaceholder, this.$lineRevealAnimationSpec, composer, (ScrubWindow.$stable << 15) | SegmentedLine.$stable | (Overlays.$stable << 12), 0, 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(Function1 function1, Function1 function12, List list, com.robinhood.android.charts.model.Point point) {
                                    Intrinsics.checkNotNullParameter(point, "point");
                                    function1.invoke(point);
                                    function12.invoke(SduiChartMappersKt.getHorizontalChartPoints(list, point));
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i21) {
                                if ((i21 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1782997908, i21, -1, "com.robinhood.android.sdui.chartgroup.SduiSegmentedLineChart.<anonymous> (SduiChartMappers.kt:762)");
                                }
                                SduiActionHandler3.ProvideActionHandler(sduiActionHandler32, ComposableLambda3.rememberComposableLambda(-1293356141, true, new AnonymousClass1(list3, lines, f42, overlays, z72, modifier62, function15, function192, function02, z5, animationSpec42), composer3, 54), composer3, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Function0<Unit> function042 = function02;
                        z3 = z72;
                        function17 = function15;
                        function03 = function042;
                        modifier4 = modifier62;
                        function18 = function192;
                        z4 = z5;
                        animationSpec2 = animationSpec42;
                        f2 = f42;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                i16 = i3 & 2048;
                if (i16 != 0) {
                }
                int i2022 = i15;
                if ((i3 & 4096) != 0) {
                }
                if ((306783379 & i4) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i8 = i7;
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
            }
            int i20222 = i15;
            if ((i3 & 4096) != 0) {
            }
            if ((306783379 & i4) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        sduiActionHandler2 = sduiActionHandler;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        i16 = i3 & 2048;
        if (i16 != 0) {
        }
        int i202222 = i15;
        if ((i3 & 4096) != 0) {
        }
        if ((306783379 & i4) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final ImmutableList<Fill> mapFillDto(ImmutableList<ChartFillDto> fills, Composer composer, int i) {
        ChartAnnotation protoGradientFill;
        Intrinsics.checkNotNullParameter(fills, "fills");
        composer.startReplaceGroup(926972825);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(926972825, i, -1, "com.robinhood.android.sdui.chartgroup.mapFillDto (SduiChartMappers.kt:331)");
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fills, 10));
        for (ChartFillDto chartFillDto : fills) {
            ChartFillStyleDto style = chartFillDto.getStyle();
            ChartFillStyleDto.StyleDetailsDto style_details = style != null ? style.getStyle_details() : null;
            if (style_details instanceof ChartFillStyleDto.StyleDetailsDto.Dot) {
                composer.startReplaceGroup(52351140);
                List<PointDto> points = chartFillDto.getPoints();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
                for (PointDto pointDto : points) {
                    arrayList2.add(new com.robinhood.android.charts.model.Point(pointDto.getX(), pointDto.getY()));
                }
                ChartFillStyleDto.StyleDetailsDto.Dot dot = (ChartFillStyleDto.StyleDetailsDto.Dot) style_details;
                protoGradientFill = new Fill.DotFill(arrayList2, SduiColors2.m18897toComposeColorDefaultediJQMabo(dot.getValue().getDot_color(), 0L, composer, 0, 1), dot.getValue().getDot_size(), dot.getValue().getOpacity(), chartFillDto.getDraw_layer(), null);
                composer.endReplaceGroup();
            } else if (style_details instanceof ChartFillStyleDto.StyleDetailsDto.Dotted) {
                composer.startReplaceGroup(1623266487);
                List<PointDto> points2 = chartFillDto.getPoints();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points2, 10));
                for (PointDto pointDto2 : points2) {
                    arrayList3.add(new com.robinhood.android.charts.model.Point(pointDto2.getX(), pointDto2.getY()));
                }
                ChartFillStyleDto.StyleDetailsDto.Dotted dotted = (ChartFillStyleDto.StyleDetailsDto.Dotted) style_details;
                protoGradientFill = new Fill.DottedFill(arrayList3, SduiColors2.m18897toComposeColorDefaultediJQMabo(dotted.getValue().getDot_color(), 0L, composer, 0, 1), C2002Dp.m7995constructorimpl(dotted.getValue().getDot_size()), C2002Dp.m7995constructorimpl(dotted.getValue().getDot_distance()), dotted.getValue().getOpacity(), chartFillDto.getDraw_layer(), null);
                composer.endReplaceGroup();
            } else if (style_details instanceof ChartFillStyleDto.StyleDetailsDto.SolidColor) {
                composer.startReplaceGroup(52377929);
                List<PointDto> points3 = chartFillDto.getPoints();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points3, 10));
                for (PointDto pointDto3 : points3) {
                    arrayList4.add(new com.robinhood.android.charts.model.Point(pointDto3.getX(), pointDto3.getY()));
                }
                ChartFillStyleDto.StyleDetailsDto.SolidColor solidColor = (ChartFillStyleDto.StyleDetailsDto.SolidColor) style_details;
                protoGradientFill = new Fill.SolidFill(arrayList4, SduiColors2.m18897toComposeColorDefaultediJQMabo(solidColor.getValue().getColor(), 0L, composer, 0, 1), solidColor.getValue().getOpacity(), chartFillDto.getDraw_layer(), null);
                composer.endReplaceGroup();
            } else if (style_details instanceof ChartFillStyleDto.StyleDetailsDto.RoundedSolidColor) {
                composer.startReplaceGroup(52388700);
                List<PointDto> points4 = chartFillDto.getPoints();
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points4, 10));
                for (PointDto pointDto4 : points4) {
                    arrayList5.add(new com.robinhood.android.charts.model.Point(pointDto4.getX(), pointDto4.getY()));
                }
                ChartFillStyleDto.StyleDetailsDto.RoundedSolidColor roundedSolidColor = (ChartFillStyleDto.StyleDetailsDto.RoundedSolidColor) style_details;
                protoGradientFill = new Fill.ProtoRoundedSolidFill(arrayList5, SduiColors2.m18897toComposeColorDefaultediJQMabo(roundedSolidColor.getValue().getColor(), 0L, composer, 0, 1), roundedSolidColor.getValue().getOpacity(), roundedSolidColor.getValue().getCorner_radius_info(), chartFillDto.getDraw_layer(), null);
                composer.endReplaceGroup();
            } else if (style_details instanceof ChartFillStyleDto.StyleDetailsDto.Gradient) {
                composer.startReplaceGroup(52401644);
                List<PointDto> points5 = chartFillDto.getPoints();
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points5, 10));
                for (PointDto pointDto5 : points5) {
                    arrayList6.add(new com.robinhood.android.charts.model.Point(pointDto5.getX(), pointDto5.getY()));
                }
                protoGradientFill = new Fill.ProtoGradientFill(extensions2.toPersistentList(arrayList6), mapGradientChartFillStyle(((ChartFillStyleDto.StyleDetailsDto.Gradient) style_details).getValue(), composer, 0), chartFillDto.getDraw_layer());
                composer.endReplaceGroup();
            } else {
                if (!(style_details instanceof ChartFillStyleDto.StyleDetailsDto.GradientAnimation)) {
                    if (style_details == null) {
                        composer.startReplaceGroup(52435335);
                        composer.endReplaceGroup();
                        throw new IllegalStateException("Unsupported fill style");
                    }
                    composer.startReplaceGroup(52350033);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(1624769150);
                ChartFillStyleDto.StyleDetailsDto.GradientAnimation gradientAnimation = (ChartFillStyleDto.StyleDetailsDto.GradientAnimation) style_details;
                String id = gradientAnimation.getValue().getId();
                List<PointDto> points6 = chartFillDto.getPoints();
                ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points6, 10));
                for (PointDto pointDto6 : points6) {
                    arrayList7.add(new com.robinhood.android.charts.model.Point(pointDto6.getX(), pointDto6.getY()));
                }
                ChartAnnotation protoGradientAnimationFill = new Fill.ProtoGradientAnimationFill(id, arrayList7, gradientAnimation.getValue().getGradient_style(), mapGradientChartFillStyle(gradientAnimation.getValue().getBefore_pivot_gradient(), composer, 0), mapGradientChartFillStyle(gradientAnimation.getValue().getAfter_pivot_gradient(), composer, 0), gradientAnimation.getValue().getSpeed(), SduiColors2.m18897toComposeColorDefaultediJQMabo(gradientAnimation.getValue().getBase_color(), 0L, composer, 0, 1), gradientAnimation.getValue().getBase_color_opacity(), gradientAnimation.getValue().getCorner_radius_info(), chartFillDto.getDraw_layer(), null);
                composer.endReplaceGroup();
                protoGradientFill = protoGradientAnimationFill;
            }
            arrayList.add(protoGradientFill);
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return persistentList;
    }

    public static final List<SegmentedLine> mapSegmentedDtoLines(ImmutableList<LineDto> lines, Composer composer, int i) {
        SegmentedLine dotted;
        Intrinsics.checkNotNullParameter(lines, "lines");
        composer.startReplaceGroup(-1079484149);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1079484149, i, -1, "com.robinhood.android.sdui.chartgroup.mapSegmentedDtoLines (SduiChartMappers.kt:258)");
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lines, 10));
        for (LineDto lineDto : lines) {
            if (isDotted(lineDto)) {
                composer.startReplaceGroup(1076100707);
                List<SegmentDto> segments = lineDto.getSegments();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, 10));
                Iterator<T> it = segments.iterator();
                while (it.hasNext()) {
                    arrayList2.add(mapSegmentDto((SegmentDto) it.next(), composer, 0));
                }
                dotted = new SegmentedLine.Dotted(arrayList2, getDashGap(lineDto), lineDto.getDraw_layer());
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1076107388);
                List<SegmentDto> segments2 = lineDto.getSegments();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments2, 10));
                Iterator<T> it2 = segments2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(mapSegmentDto((SegmentDto) it2.next(), composer, 0));
                }
                dotted = new SegmentedLine.Default(arrayList3, lineDto.getDraw_layer());
                composer.endReplaceGroup();
            }
            arrayList.add(dotted);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return arrayList;
    }
}
