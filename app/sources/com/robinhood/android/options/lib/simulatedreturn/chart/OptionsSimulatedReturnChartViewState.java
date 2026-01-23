package com.robinhood.android.options.lib.simulatedreturn.chart;

import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Line;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.overlay.OverlayPosition;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.charts.segmented.ScrubLineType;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.android.charts.segmented.UtilKt;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.lib.simulatedreturn.C23151R;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDataState2;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState2;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsChart;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsGridLine;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsLine;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsParams;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartParams;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossMetrics;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnMarketDataParamsRequestV3;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import com.robinhood.models.p355ui.OptionSimulatedChartLegBundle;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.datetime.Instant;

/* compiled from: OptionsSimulatedReturnChartViewState.kt */
@Metadata(m3635d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0007\u0012\b\u0010$\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010\"\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\b\u0010+\u001a\u0004\u0018\u00010,¢\u0006\u0004\b-\u0010.J\u0015\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010jJ\u0015\u0010k\u001a\u00020h2\u0006\u0010i\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010jJ\u001b\u0010l\u001a\b\u0012\u0004\u0012\u00020m0Z2\u0006\u0010i\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010nJ\u001b\u0010o\u001a\b\u0012\u0004\u0012\u00020m0Z2\u0006\u0010i\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010nJ\u0013\u0010p\u001a\b\u0012\u0004\u0012\u00020m0ZH\u0003¢\u0006\u0002\u0010qJ\u0013\u0010r\u001a\b\u0012\u0004\u0012\u00020s0ZH\u0017¢\u0006\u0002\u0010qJ\u000f\u0010t\u001a\u0004\u0018\u00010sH\u0003¢\u0006\u0002\u0010uJ\u000f\u0010v\u001a\u0004\u0018\u00010sH\u0003¢\u0006\u0002\u0010uJ\u001f\u0010w\u001a\u0004\u0018\u00010s2\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0002\u0010{J\u0018\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020\u001aH\u0003¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0007\u0010\u0081\u0001\u001a\u00020\u0003J\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001J\u0007\u0010\u0084\u0001\u001a\u00020\u0003J\n\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0002J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010:J\n\u0010\u008d\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0010HÆ\u0003J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010=J\n\u0010\u0090\u0001\u001a\u00020\u0014HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u001aHÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u001cHÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020 HÆ\u0003J\u0010\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u0007HÆ\u0003J\u0010\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u0007HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010'HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J®\u0002\u0010\u009f\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,HÆ\u0001¢\u0006\u0003\u0010 \u0001J\u0016\u0010¡\u0001\u001a\u00020\u00102\n\u0010¢\u0001\u001a\u0005\u0018\u00010£\u0001HÖ\u0003J\u000b\u0010¤\u0001\u001a\u00030\u0083\u0001HÖ\u0001J\n\u0010¥\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010<R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010<R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010>\u001a\u0004\b\u0012\u0010=R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007¢\u0006\b\n\u0000\u001a\u0004\bM\u00104R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0007¢\u0006\b\n\u0000\u001a\u0004\bN\u00104R\u0013\u0010$\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0013\u0010%\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010PR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u00100R\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0019\u0010Y\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010Z¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0013\u0010^\u001a\u0004\u0018\u00010_8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0010\u0010b\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010c\u001a\u00020dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010f¨\u0006¦\u0001"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartViewState;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartViewState;", "accountNumber", "", "chart", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChart;", "dataPoints", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartPoint;", "earliestExpirationTime", "Lkotlinx/datetime/Instant;", "errorState", "Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "estimatedContractPrice", "", "isHundredTradeValueMultiplier", "", "isSingleLeg", "isPositionClosed", "launchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "chartBundle", "Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "params", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams;", "scrubState", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;", "scrubPoint", "Lcom/robinhood/android/charts/model/Point;", "segmentedLineData", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLine;", "type", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "xAxisData", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;", "yAxisData", "maxProfit", "maxLoss", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "strategyCode", "pnlMetricParams", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartParams;", "pnlMetrics", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChart;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/datetime/Instant;Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;Ljava/lang/Double;ZZLjava/lang/Boolean;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;Lcom/robinhood/android/charts/model/Point;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLine;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Ljava/lang/String;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartParams;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;)V", "getAccountNumber", "()Ljava/lang/String;", "getChart", "()Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChart;", "getDataPoints", "()Lkotlinx/collections/immutable/ImmutableList;", "getEarliestExpirationTime", "()Lkotlinx/datetime/Instant;", "getErrorState", "()Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "getEstimatedContractPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "getChartBundle", "()Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "getParams", "()Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams;", "getScrubState", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;", "getScrubPoint", "()Lcom/robinhood/android/charts/model/Point;", "getSegmentedLineData", "()Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLine;", "getType", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "getXAxisData", "getYAxisData", "getMaxProfit", "()Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;", "getMaxLoss", "getLoggingState", "()Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "getStrategyCode", "getPnlMetricParams", "()Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartParams;", "getPnlMetrics", "()Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;", "optionInstrumentIds", "", "Ljava/util/UUID;", "getOptionInstrumentIds", "()Ljava/util/List;", "simulatedReturnMarketDataParamsRequestV3", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV3;", "getSimulatedReturnMarketDataParamsRequestV3", "()Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV3;", "scrubbedDataPoint", "headerState", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "getHeaderState", "()Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "getXAxis", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisModel;", "usePreTradeStyle", "(ZLandroidx/compose/runtime/Composer;I)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisModel;", "getYAxis", "getAnnotations", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "(ZLandroidx/compose/runtime/Composer;I)Ljava/util/List;", "getGridLines", "getSegmentedLine", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "getOverlays", "Lcom/robinhood/android/charts/overlay/ChartOverlay;", "getScrubLine", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/overlay/ChartOverlay;", "getScrubDot", "getDateLabel", "chartWidth", "", "parentWidthAfterPadding", "(FFLandroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/overlay/ChartOverlay;", "getScrubColor", "Landroidx/compose/ui/graphics/Color;", "state", "getScrubColor-XeAY9LY", "(Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;Landroidx/compose/runtime/Composer;I)J", "getEstimatedContractPriceValue", "getEstimatedContractPriceLabelRes", "", "getTickerText", "getTickerDirection", "Lcom/robinhood/android/options/lib/simulatedreturn/header/TickerDirection;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChart;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/datetime/Instant;Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;Ljava/lang/Double;ZZLjava/lang/Boolean;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;Lcom/robinhood/android/charts/model/Point;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLine;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Ljava/lang/String;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartParams;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartViewState;", "equals", "other", "", "hashCode", "toString", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnChartViewState implements OptionsSimulatedChartViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final SimulatedReturnsChart chart;
    private final OptionSimulatedChartBundle chartBundle;
    private final ImmutableList<OptionsSimulatedReturnChartPoint> dataPoints;
    private final Instant earliestExpirationTime;
    private final OptionsSimulatedReturnErrorState errorState;
    private final Double estimatedContractPrice;
    private final OptionsSimulatedChartHeaderState headerState;
    private final boolean isHundredTradeValueMultiplier;
    private final Boolean isPositionClosed;
    private final boolean isSingleLeg;
    private final OptionsSimulatedReturnChartDataState2 launchMode;
    private final OptionsSimulatedReturnLoggingState loggingState;
    private final SimulatedReturnsGridLine maxLoss;
    private final SimulatedReturnsGridLine maxProfit;
    private final List<UUID> optionInstrumentIds;
    private final SimulatedReturnsParams params;
    private final ProfitAndLossChartParams pnlMetricParams;
    private final ProfitAndLossMetrics pnlMetrics;
    private final Point scrubPoint;
    private final OptionsSimulatedChartScrubState scrubState;
    private final OptionsSimulatedReturnChartPoint scrubbedDataPoint;
    private final SimulatedReturnsLine segmentedLineData;
    private final String strategyCode;
    private final OptionsSimulatedReturnChartViewState3 type;
    private final ImmutableList<SimulatedReturnsGridLine> xAxisData;
    private final ImmutableList<SimulatedReturnsGridLine> yAxisData;

    /* compiled from: OptionsSimulatedReturnChartViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionsSimulatedChartScrubState.values().length];
            try {
                iArr[OptionsSimulatedChartScrubState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsSimulatedChartScrubState.SCRUB_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionsSimulatedChartScrubState.SCRUB_PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionsSimulatedReturnChartViewState3.values().length];
            try {
                iArr2[OptionsSimulatedReturnChartViewState3.DOLLAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OptionsSimulatedReturnChartViewState3.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ OptionsSimulatedReturnChartViewState copy$default(OptionsSimulatedReturnChartViewState optionsSimulatedReturnChartViewState, String str, SimulatedReturnsChart simulatedReturnsChart, ImmutableList immutableList, Instant instant, OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, Double d, boolean z, boolean z2, Boolean bool, OptionsSimulatedReturnChartDataState2 optionsSimulatedReturnChartDataState2, OptionSimulatedChartBundle optionSimulatedChartBundle, SimulatedReturnsParams simulatedReturnsParams, OptionsSimulatedChartScrubState optionsSimulatedChartScrubState, Point point, SimulatedReturnsLine simulatedReturnsLine, OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState3, ImmutableList immutableList2, ImmutableList immutableList3, SimulatedReturnsGridLine simulatedReturnsGridLine, SimulatedReturnsGridLine simulatedReturnsGridLine2, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, String str2, ProfitAndLossChartParams profitAndLossChartParams, ProfitAndLossMetrics profitAndLossMetrics, int i, Object obj) {
        ProfitAndLossMetrics profitAndLossMetrics2;
        ProfitAndLossChartParams profitAndLossChartParams2;
        String str3 = (i & 1) != 0 ? optionsSimulatedReturnChartViewState.accountNumber : str;
        SimulatedReturnsChart simulatedReturnsChart2 = (i & 2) != 0 ? optionsSimulatedReturnChartViewState.chart : simulatedReturnsChart;
        ImmutableList immutableList4 = (i & 4) != 0 ? optionsSimulatedReturnChartViewState.dataPoints : immutableList;
        Instant instant2 = (i & 8) != 0 ? optionsSimulatedReturnChartViewState.earliestExpirationTime : instant;
        OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState2 = (i & 16) != 0 ? optionsSimulatedReturnChartViewState.errorState : optionsSimulatedReturnErrorState;
        Double d2 = (i & 32) != 0 ? optionsSimulatedReturnChartViewState.estimatedContractPrice : d;
        boolean z3 = (i & 64) != 0 ? optionsSimulatedReturnChartViewState.isHundredTradeValueMultiplier : z;
        boolean z4 = (i & 128) != 0 ? optionsSimulatedReturnChartViewState.isSingleLeg : z2;
        Boolean bool2 = (i & 256) != 0 ? optionsSimulatedReturnChartViewState.isPositionClosed : bool;
        OptionsSimulatedReturnChartDataState2 optionsSimulatedReturnChartDataState22 = (i & 512) != 0 ? optionsSimulatedReturnChartViewState.launchMode : optionsSimulatedReturnChartDataState2;
        OptionSimulatedChartBundle optionSimulatedChartBundle2 = (i & 1024) != 0 ? optionsSimulatedReturnChartViewState.chartBundle : optionSimulatedChartBundle;
        SimulatedReturnsParams simulatedReturnsParams2 = (i & 2048) != 0 ? optionsSimulatedReturnChartViewState.params : simulatedReturnsParams;
        OptionsSimulatedChartScrubState optionsSimulatedChartScrubState2 = (i & 4096) != 0 ? optionsSimulatedReturnChartViewState.scrubState : optionsSimulatedChartScrubState;
        Point point2 = (i & 8192) != 0 ? optionsSimulatedReturnChartViewState.scrubPoint : point;
        String str4 = str3;
        SimulatedReturnsLine simulatedReturnsLine2 = (i & 16384) != 0 ? optionsSimulatedReturnChartViewState.segmentedLineData : simulatedReturnsLine;
        OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState32 = (i & 32768) != 0 ? optionsSimulatedReturnChartViewState.type : optionsSimulatedReturnChartViewState3;
        ImmutableList immutableList5 = (i & 65536) != 0 ? optionsSimulatedReturnChartViewState.xAxisData : immutableList2;
        ImmutableList immutableList6 = (i & 131072) != 0 ? optionsSimulatedReturnChartViewState.yAxisData : immutableList3;
        SimulatedReturnsGridLine simulatedReturnsGridLine3 = (i & 262144) != 0 ? optionsSimulatedReturnChartViewState.maxProfit : simulatedReturnsGridLine;
        SimulatedReturnsGridLine simulatedReturnsGridLine4 = (i & 524288) != 0 ? optionsSimulatedReturnChartViewState.maxLoss : simulatedReturnsGridLine2;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState2 = (i & 1048576) != 0 ? optionsSimulatedReturnChartViewState.loggingState : optionsSimulatedReturnLoggingState;
        String str5 = (i & 2097152) != 0 ? optionsSimulatedReturnChartViewState.strategyCode : str2;
        ProfitAndLossChartParams profitAndLossChartParams3 = (i & 4194304) != 0 ? optionsSimulatedReturnChartViewState.pnlMetricParams : profitAndLossChartParams;
        if ((i & 8388608) != 0) {
            profitAndLossChartParams2 = profitAndLossChartParams3;
            profitAndLossMetrics2 = optionsSimulatedReturnChartViewState.pnlMetrics;
        } else {
            profitAndLossMetrics2 = profitAndLossMetrics;
            profitAndLossChartParams2 = profitAndLossChartParams3;
        }
        return optionsSimulatedReturnChartViewState.copy(str4, simulatedReturnsChart2, immutableList4, instant2, optionsSimulatedReturnErrorState2, d2, z3, z4, bool2, optionsSimulatedReturnChartDataState22, optionSimulatedChartBundle2, simulatedReturnsParams2, optionsSimulatedChartScrubState2, point2, simulatedReturnsLine2, optionsSimulatedReturnChartViewState32, immutableList5, immutableList6, simulatedReturnsGridLine3, simulatedReturnsGridLine4, optionsSimulatedReturnLoggingState2, str5, profitAndLossChartParams2, profitAndLossMetrics2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final OptionsSimulatedReturnChartDataState2 getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component11, reason: from getter */
    public final OptionSimulatedChartBundle getChartBundle() {
        return this.chartBundle;
    }

    /* renamed from: component12, reason: from getter */
    public final SimulatedReturnsParams getParams() {
        return this.params;
    }

    /* renamed from: component13, reason: from getter */
    public final OptionsSimulatedChartScrubState getScrubState() {
        return this.scrubState;
    }

    /* renamed from: component14, reason: from getter */
    public final Point getScrubPoint() {
        return this.scrubPoint;
    }

    /* renamed from: component15, reason: from getter */
    public final SimulatedReturnsLine getSegmentedLineData() {
        return this.segmentedLineData;
    }

    /* renamed from: component16, reason: from getter */
    public final OptionsSimulatedReturnChartViewState3 getType() {
        return this.type;
    }

    public final ImmutableList<SimulatedReturnsGridLine> component17() {
        return this.xAxisData;
    }

    public final ImmutableList<SimulatedReturnsGridLine> component18() {
        return this.yAxisData;
    }

    /* renamed from: component19, reason: from getter */
    public final SimulatedReturnsGridLine getMaxProfit() {
        return this.maxProfit;
    }

    /* renamed from: component2, reason: from getter */
    public final SimulatedReturnsChart getChart() {
        return this.chart;
    }

    /* renamed from: component20, reason: from getter */
    public final SimulatedReturnsGridLine getMaxLoss() {
        return this.maxLoss;
    }

    /* renamed from: component21, reason: from getter */
    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    /* renamed from: component22, reason: from getter */
    public final String getStrategyCode() {
        return this.strategyCode;
    }

    /* renamed from: component23, reason: from getter */
    public final ProfitAndLossChartParams getPnlMetricParams() {
        return this.pnlMetricParams;
    }

    /* renamed from: component24, reason: from getter */
    public final ProfitAndLossMetrics getPnlMetrics() {
        return this.pnlMetrics;
    }

    public final ImmutableList<OptionsSimulatedReturnChartPoint> component3() {
        return this.dataPoints;
    }

    /* renamed from: component4, reason: from getter */
    public final Instant getEarliestExpirationTime() {
        return this.earliestExpirationTime;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionsSimulatedReturnErrorState getErrorState() {
        return this.errorState;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getEstimatedContractPrice() {
        return this.estimatedContractPrice;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsHundredTradeValueMultiplier() {
        return this.isHundredTradeValueMultiplier;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsSingleLeg() {
        return this.isSingleLeg;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsPositionClosed() {
        return this.isPositionClosed;
    }

    public final OptionsSimulatedReturnChartViewState copy(String accountNumber, SimulatedReturnsChart chart, ImmutableList<OptionsSimulatedReturnChartPoint> dataPoints, Instant earliestExpirationTime, OptionsSimulatedReturnErrorState errorState, Double estimatedContractPrice, boolean isHundredTradeValueMultiplier, boolean isSingleLeg, Boolean isPositionClosed, OptionsSimulatedReturnChartDataState2 launchMode, OptionSimulatedChartBundle chartBundle, SimulatedReturnsParams params, OptionsSimulatedChartScrubState scrubState, Point scrubPoint, SimulatedReturnsLine segmentedLineData, OptionsSimulatedReturnChartViewState3 type2, ImmutableList<SimulatedReturnsGridLine> xAxisData, ImmutableList<SimulatedReturnsGridLine> yAxisData, SimulatedReturnsGridLine maxProfit, SimulatedReturnsGridLine maxLoss, OptionsSimulatedReturnLoggingState loggingState, String strategyCode, ProfitAndLossChartParams pnlMetricParams, ProfitAndLossMetrics pnlMetrics) {
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(scrubState, "scrubState");
        Intrinsics.checkNotNullParameter(scrubPoint, "scrubPoint");
        Intrinsics.checkNotNullParameter(segmentedLineData, "segmentedLineData");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(xAxisData, "xAxisData");
        Intrinsics.checkNotNullParameter(yAxisData, "yAxisData");
        return new OptionsSimulatedReturnChartViewState(accountNumber, chart, dataPoints, earliestExpirationTime, errorState, estimatedContractPrice, isHundredTradeValueMultiplier, isSingleLeg, isPositionClosed, launchMode, chartBundle, params, scrubState, scrubPoint, segmentedLineData, type2, xAxisData, yAxisData, maxProfit, maxLoss, loggingState, strategyCode, pnlMetricParams, pnlMetrics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSimulatedReturnChartViewState)) {
            return false;
        }
        OptionsSimulatedReturnChartViewState optionsSimulatedReturnChartViewState = (OptionsSimulatedReturnChartViewState) other;
        return Intrinsics.areEqual(this.accountNumber, optionsSimulatedReturnChartViewState.accountNumber) && Intrinsics.areEqual(this.chart, optionsSimulatedReturnChartViewState.chart) && Intrinsics.areEqual(this.dataPoints, optionsSimulatedReturnChartViewState.dataPoints) && Intrinsics.areEqual(this.earliestExpirationTime, optionsSimulatedReturnChartViewState.earliestExpirationTime) && this.errorState == optionsSimulatedReturnChartViewState.errorState && Intrinsics.areEqual((Object) this.estimatedContractPrice, (Object) optionsSimulatedReturnChartViewState.estimatedContractPrice) && this.isHundredTradeValueMultiplier == optionsSimulatedReturnChartViewState.isHundredTradeValueMultiplier && this.isSingleLeg == optionsSimulatedReturnChartViewState.isSingleLeg && Intrinsics.areEqual(this.isPositionClosed, optionsSimulatedReturnChartViewState.isPositionClosed) && Intrinsics.areEqual(this.launchMode, optionsSimulatedReturnChartViewState.launchMode) && Intrinsics.areEqual(this.chartBundle, optionsSimulatedReturnChartViewState.chartBundle) && Intrinsics.areEqual(this.params, optionsSimulatedReturnChartViewState.params) && this.scrubState == optionsSimulatedReturnChartViewState.scrubState && Intrinsics.areEqual(this.scrubPoint, optionsSimulatedReturnChartViewState.scrubPoint) && Intrinsics.areEqual(this.segmentedLineData, optionsSimulatedReturnChartViewState.segmentedLineData) && this.type == optionsSimulatedReturnChartViewState.type && Intrinsics.areEqual(this.xAxisData, optionsSimulatedReturnChartViewState.xAxisData) && Intrinsics.areEqual(this.yAxisData, optionsSimulatedReturnChartViewState.yAxisData) && Intrinsics.areEqual(this.maxProfit, optionsSimulatedReturnChartViewState.maxProfit) && Intrinsics.areEqual(this.maxLoss, optionsSimulatedReturnChartViewState.maxLoss) && Intrinsics.areEqual(this.loggingState, optionsSimulatedReturnChartViewState.loggingState) && Intrinsics.areEqual(this.strategyCode, optionsSimulatedReturnChartViewState.strategyCode) && Intrinsics.areEqual(this.pnlMetricParams, optionsSimulatedReturnChartViewState.pnlMetricParams) && Intrinsics.areEqual(this.pnlMetrics, optionsSimulatedReturnChartViewState.pnlMetrics);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SimulatedReturnsChart simulatedReturnsChart = this.chart;
        int iHashCode2 = (((iHashCode + (simulatedReturnsChart == null ? 0 : simulatedReturnsChart.hashCode())) * 31) + this.dataPoints.hashCode()) * 31;
        Instant instant = this.earliestExpirationTime;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState = this.errorState;
        int iHashCode4 = (iHashCode3 + (optionsSimulatedReturnErrorState == null ? 0 : optionsSimulatedReturnErrorState.hashCode())) * 31;
        Double d = this.estimatedContractPrice;
        int iHashCode5 = (((((iHashCode4 + (d == null ? 0 : d.hashCode())) * 31) + Boolean.hashCode(this.isHundredTradeValueMultiplier)) * 31) + Boolean.hashCode(this.isSingleLeg)) * 31;
        Boolean bool = this.isPositionClosed;
        int iHashCode6 = (((iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + this.launchMode.hashCode()) * 31;
        OptionSimulatedChartBundle optionSimulatedChartBundle = this.chartBundle;
        int iHashCode7 = (iHashCode6 + (optionSimulatedChartBundle == null ? 0 : optionSimulatedChartBundle.hashCode())) * 31;
        SimulatedReturnsParams simulatedReturnsParams = this.params;
        int iHashCode8 = (((((((((((((iHashCode7 + (simulatedReturnsParams == null ? 0 : simulatedReturnsParams.hashCode())) * 31) + this.scrubState.hashCode()) * 31) + this.scrubPoint.hashCode()) * 31) + this.segmentedLineData.hashCode()) * 31) + this.type.hashCode()) * 31) + this.xAxisData.hashCode()) * 31) + this.yAxisData.hashCode()) * 31;
        SimulatedReturnsGridLine simulatedReturnsGridLine = this.maxProfit;
        int iHashCode9 = (iHashCode8 + (simulatedReturnsGridLine == null ? 0 : simulatedReturnsGridLine.hashCode())) * 31;
        SimulatedReturnsGridLine simulatedReturnsGridLine2 = this.maxLoss;
        int iHashCode10 = (iHashCode9 + (simulatedReturnsGridLine2 == null ? 0 : simulatedReturnsGridLine2.hashCode())) * 31;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = this.loggingState;
        int iHashCode11 = (iHashCode10 + (optionsSimulatedReturnLoggingState == null ? 0 : optionsSimulatedReturnLoggingState.hashCode())) * 31;
        String str2 = this.strategyCode;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProfitAndLossChartParams profitAndLossChartParams = this.pnlMetricParams;
        int iHashCode13 = (iHashCode12 + (profitAndLossChartParams == null ? 0 : profitAndLossChartParams.hashCode())) * 31;
        ProfitAndLossMetrics profitAndLossMetrics = this.pnlMetrics;
        return iHashCode13 + (profitAndLossMetrics != null ? profitAndLossMetrics.hashCode() : 0);
    }

    public String toString() {
        return "OptionsSimulatedReturnChartViewState(accountNumber=" + this.accountNumber + ", chart=" + this.chart + ", dataPoints=" + this.dataPoints + ", earliestExpirationTime=" + this.earliestExpirationTime + ", errorState=" + this.errorState + ", estimatedContractPrice=" + this.estimatedContractPrice + ", isHundredTradeValueMultiplier=" + this.isHundredTradeValueMultiplier + ", isSingleLeg=" + this.isSingleLeg + ", isPositionClosed=" + this.isPositionClosed + ", launchMode=" + this.launchMode + ", chartBundle=" + this.chartBundle + ", params=" + this.params + ", scrubState=" + this.scrubState + ", scrubPoint=" + this.scrubPoint + ", segmentedLineData=" + this.segmentedLineData + ", type=" + this.type + ", xAxisData=" + this.xAxisData + ", yAxisData=" + this.yAxisData + ", maxProfit=" + this.maxProfit + ", maxLoss=" + this.maxLoss + ", loggingState=" + this.loggingState + ", strategyCode=" + this.strategyCode + ", pnlMetricParams=" + this.pnlMetricParams + ", pnlMetrics=" + this.pnlMetrics + ")";
    }

    public OptionsSimulatedReturnChartViewState(String str, SimulatedReturnsChart simulatedReturnsChart, ImmutableList<OptionsSimulatedReturnChartPoint> dataPoints, Instant instant, OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, Double d, boolean z, boolean z2, Boolean bool, OptionsSimulatedReturnChartDataState2 launchMode, OptionSimulatedChartBundle optionSimulatedChartBundle, SimulatedReturnsParams simulatedReturnsParams, OptionsSimulatedChartScrubState scrubState, Point scrubPoint, SimulatedReturnsLine segmentedLineData, OptionsSimulatedReturnChartViewState3 type2, ImmutableList<SimulatedReturnsGridLine> xAxisData, ImmutableList<SimulatedReturnsGridLine> yAxisData, SimulatedReturnsGridLine simulatedReturnsGridLine, SimulatedReturnsGridLine simulatedReturnsGridLine2, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, String str2, ProfitAndLossChartParams profitAndLossChartParams, ProfitAndLossMetrics profitAndLossMetrics) {
        ArrayList arrayList;
        OptionsSimulatedChartHeaderState optionsSimulatedReturnHeader;
        ImmutableList<OptionSimulatedChartLegBundle> legBundles;
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(scrubState, "scrubState");
        Intrinsics.checkNotNullParameter(scrubPoint, "scrubPoint");
        Intrinsics.checkNotNullParameter(segmentedLineData, "segmentedLineData");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(xAxisData, "xAxisData");
        Intrinsics.checkNotNullParameter(yAxisData, "yAxisData");
        this.accountNumber = str;
        this.chart = simulatedReturnsChart;
        this.dataPoints = dataPoints;
        this.earliestExpirationTime = instant;
        this.errorState = optionsSimulatedReturnErrorState;
        this.estimatedContractPrice = d;
        this.isHundredTradeValueMultiplier = z;
        this.isSingleLeg = z2;
        this.isPositionClosed = bool;
        this.launchMode = launchMode;
        this.chartBundle = optionSimulatedChartBundle;
        this.params = simulatedReturnsParams;
        this.scrubState = scrubState;
        this.scrubPoint = scrubPoint;
        this.segmentedLineData = segmentedLineData;
        this.type = type2;
        this.xAxisData = xAxisData;
        this.yAxisData = yAxisData;
        this.maxProfit = simulatedReturnsGridLine;
        this.maxLoss = simulatedReturnsGridLine2;
        this.loggingState = optionsSimulatedReturnLoggingState;
        this.strategyCode = str2;
        this.pnlMetricParams = profitAndLossChartParams;
        this.pnlMetrics = profitAndLossMetrics;
        if (optionSimulatedChartBundle == null || (legBundles = optionSimulatedChartBundle.getLegBundles()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundles, 10));
            Iterator<OptionSimulatedChartLegBundle> it = legBundles.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getOptionInstrument().getId());
            }
        }
        this.optionInstrumentIds = arrayList;
        this.scrubbedDataPoint = (OptionsSimulatedReturnChartPoint) UtilKt.getClosestItemByValue(this.dataPoints, this.scrubPoint.getX(), new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(OptionsSimulatedReturnChartViewState.scrubbedDataPoint$lambda$1((OptionsSimulatedReturnChartPoint) obj));
            }
        });
        OptionsSimulatedReturnChartDataState2 optionsSimulatedReturnChartDataState2 = this.launchMode;
        if (optionsSimulatedReturnChartDataState2 instanceof OptionsSimulatedReturnChartDataState2.PreTrade) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.scrubState.ordinal()];
            if (i == 1) {
                optionsSimulatedReturnHeader = new OptionsSimulatedChartHeaderState.OptionsProfitAndLossMetricsHeader(new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsSimulatedReturnChartViewState.headerState$lambda$2(this.f$0, (Resources) obj);
                    }
                }, new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsSimulatedReturnChartViewState.headerState$lambda$3(this.f$0, (Resources) obj);
                    }
                }, new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsSimulatedReturnChartViewState.headerState$lambda$4(this.f$0, (Resources) obj);
                    }
                });
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                optionsSimulatedReturnHeader = new OptionsSimulatedChartHeaderState.OptionsSimulatedReturnHeader(getTickerDirection(), new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsSimulatedReturnChartViewState.headerState$lambda$5(this.f$0, (Resources) obj);
                    }
                }, getEstimatedContractPriceLabelRes(), new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsSimulatedReturnChartViewState.headerState$lambda$6(this.f$0, (Resources) obj);
                    }
                }, this.type);
            }
        } else {
            if (!Intrinsics.areEqual(optionsSimulatedReturnChartDataState2, OptionsSimulatedReturnChartDataState2.AggregatePosition.INSTANCE) && !Intrinsics.areEqual(optionsSimulatedReturnChartDataState2, OptionsSimulatedReturnChartDataState2.InstrumentPosition.INSTANCE) && !Intrinsics.areEqual(optionsSimulatedReturnChartDataState2, OptionsSimulatedReturnChartDataState2.Watchlist.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            optionsSimulatedReturnHeader = new OptionsSimulatedChartHeaderState.OptionsSimulatedReturnHeader(getTickerDirection(), new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsSimulatedReturnChartViewState.headerState$lambda$7(this.f$0, (Resources) obj);
                }
            }, getEstimatedContractPriceLabelRes(), new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsSimulatedReturnChartViewState.headerState$lambda$8(this.f$0, (Resources) obj);
                }
            }, this.type);
        }
        this.headerState = optionsSimulatedReturnHeader;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final SimulatedReturnsChart getChart() {
        return this.chart;
    }

    public final ImmutableList<OptionsSimulatedReturnChartPoint> getDataPoints() {
        return this.dataPoints;
    }

    public final Instant getEarliestExpirationTime() {
        return this.earliestExpirationTime;
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public OptionsSimulatedReturnErrorState getErrorState() {
        return this.errorState;
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public Double getEstimatedContractPrice() {
        return this.estimatedContractPrice;
    }

    public final boolean isHundredTradeValueMultiplier() {
        return this.isHundredTradeValueMultiplier;
    }

    public final boolean isSingleLeg() {
        return this.isSingleLeg;
    }

    public final Boolean isPositionClosed() {
        return this.isPositionClosed;
    }

    public final OptionsSimulatedReturnChartDataState2 getLaunchMode() {
        return this.launchMode;
    }

    public final OptionSimulatedChartBundle getChartBundle() {
        return this.chartBundle;
    }

    public final SimulatedReturnsParams getParams() {
        return this.params;
    }

    public final OptionsSimulatedChartScrubState getScrubState() {
        return this.scrubState;
    }

    public final Point getScrubPoint() {
        return this.scrubPoint;
    }

    public final SimulatedReturnsLine getSegmentedLineData() {
        return this.segmentedLineData;
    }

    public final OptionsSimulatedReturnChartViewState3 getType() {
        return this.type;
    }

    public final ImmutableList<SimulatedReturnsGridLine> getXAxisData() {
        return this.xAxisData;
    }

    public final ImmutableList<SimulatedReturnsGridLine> getYAxisData() {
        return this.yAxisData;
    }

    public final SimulatedReturnsGridLine getMaxProfit() {
        return this.maxProfit;
    }

    public final SimulatedReturnsGridLine getMaxLoss() {
        return this.maxLoss;
    }

    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    public final String getStrategyCode() {
        return this.strategyCode;
    }

    public final ProfitAndLossChartParams getPnlMetricParams() {
        return this.pnlMetricParams;
    }

    public final ProfitAndLossMetrics getPnlMetrics() {
        return this.pnlMetrics;
    }

    public final List<UUID> getOptionInstrumentIds() {
        return this.optionInstrumentIds;
    }

    public final OptionSimulatedReturnMarketDataParamsRequestV3 getSimulatedReturnMarketDataParamsRequestV3() {
        OptionSimulatedChartBundle optionSimulatedChartBundle = this.chartBundle;
        if (optionSimulatedChartBundle == null || this.strategyCode == null) {
            return null;
        }
        return new OptionSimulatedReturnMarketDataParamsRequestV3(optionSimulatedChartBundle.isLateClosing(), this.chartBundle.getOptionInstruments(), this.chartBundle.getUnderlying(), this.chartBundle.getChainToLegExpirationDatesList(), this.strategyCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scrubbedDataPoint$lambda$1(OptionsSimulatedReturnChartPoint it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getX();
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public OptionsSimulatedChartHeaderState getHeaderState() {
        return this.headerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$2(OptionsSimulatedReturnChartViewState optionsSimulatedReturnChartViewState, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        ProfitAndLossMetrics profitAndLossMetrics = optionsSimulatedReturnChartViewState.pnlMetrics;
        return OptionsProfitAndLossChartUtils.getMaxProfitOrLossDisplayText(resources, profitAndLossMetrics != null ? profitAndLossMetrics.getMaxProfit() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$3(OptionsSimulatedReturnChartViewState optionsSimulatedReturnChartViewState, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        ProfitAndLossMetrics profitAndLossMetrics = optionsSimulatedReturnChartViewState.pnlMetrics;
        return OptionsProfitAndLossChartUtils.getMaxProfitOrLossDisplayText(resources, profitAndLossMetrics != null ? profitAndLossMetrics.getMaxLoss() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$4(OptionsSimulatedReturnChartViewState optionsSimulatedReturnChartViewState, Resources resources) {
        OptionSimulatedChartBundle5 underlying;
        Intrinsics.checkNotNullParameter(resources, "resources");
        OptionSimulatedChartBundle optionSimulatedChartBundle = optionsSimulatedReturnChartViewState.chartBundle;
        OptionChain.UnderlyingType type2 = (optionSimulatedChartBundle == null || (underlying = optionSimulatedChartBundle.getUnderlying()) == null) ? null : underlying.getType();
        ProfitAndLossMetrics profitAndLossMetrics = optionsSimulatedReturnChartViewState.pnlMetrics;
        return OptionsProfitAndLossChartUtils.getBreakevenDisplayText(resources, type2, profitAndLossMetrics != null ? profitAndLossMetrics.getBreakevenPoints() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$5(OptionsSimulatedReturnChartViewState optionsSimulatedReturnChartViewState, Resources it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return optionsSimulatedReturnChartViewState.getTickerText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$6(OptionsSimulatedReturnChartViewState optionsSimulatedReturnChartViewState, Resources it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return optionsSimulatedReturnChartViewState.getEstimatedContractPriceValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$7(OptionsSimulatedReturnChartViewState optionsSimulatedReturnChartViewState, Resources it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return optionsSimulatedReturnChartViewState.getTickerText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$8(OptionsSimulatedReturnChartViewState optionsSimulatedReturnChartViewState, Resources it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return optionsSimulatedReturnChartViewState.getEstimatedContractPriceValue();
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public OptionsSimulatedReturnChartAxisModel getXAxis(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(-343600990);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-343600990, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getXAxis (OptionsSimulatedReturnChartViewState.kt:141)");
        }
        OptionsSimulatedReturnChartAxisModel optionsSimulatedReturnChartAxisModel = new OptionsSimulatedReturnChartAxisModel(OptionsSimulatedReturnChartAxis.f4730X, OptionsSimulatedReturnChartViewState4.createOptionsSimulatedReturnChartXAxisLabels(this.xAxisData, z, composer, ((i << 3) & 112) | SimulatedReturnsGridLine.$stable));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return optionsSimulatedReturnChartAxisModel;
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public OptionsSimulatedReturnChartAxisModel getYAxis(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(838631745);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(838631745, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getYAxis (OptionsSimulatedReturnChartViewState.kt:147)");
        }
        OptionsSimulatedReturnChartAxis optionsSimulatedReturnChartAxis = OptionsSimulatedReturnChartAxis.f4731Y;
        ImmutableList<SimulatedReturnsGridLine> immutableList = this.yAxisData;
        SimulatedReturnsGridLine simulatedReturnsGridLine = this.maxProfit;
        SimulatedReturnsGridLine simulatedReturnsGridLine2 = this.maxLoss;
        int i2 = SimulatedReturnsGridLine.$stable;
        OptionsSimulatedReturnChartAxisModel optionsSimulatedReturnChartAxisModel = new OptionsSimulatedReturnChartAxisModel(optionsSimulatedReturnChartAxis, OptionsSimulatedReturnChartViewState4.createOptionsSimulatedReturnChartYAxisLabels(immutableList, z, simulatedReturnsGridLine, simulatedReturnsGridLine2, composer, ((i << 3) & 112) | i2 | (i2 << 6) | (i2 << 9), 0));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return optionsSimulatedReturnChartAxisModel;
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public List<ChartAnnotation> getAnnotations(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(19699897);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(19699897, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getAnnotations (OptionsSimulatedReturnChartViewState.kt:158)");
        }
        List<ChartAnnotation> listPlus = CollectionsKt.plus((Collection) getGridLines(z, composer, i & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE), (Iterable) getSegmentedLine(composer, (i >> 3) & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listPlus;
    }

    private final List<ChartAnnotation> getGridLines(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(2011887908);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2011887908, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getGridLines (OptionsSimulatedReturnChartViewState.kt:163)");
        }
        int i2 = i & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
        OptionsSimulatedReturnChartAxisModel xAxis = getXAxis(z, composer, i2);
        OptionsSimulatedReturnChartAxisModel yAxis = getYAxis(z, composer, i2);
        List<OptionsSimulatedReturnChartAxisLabel> labels = xAxis.getLabels();
        ArrayList<OptionsSimulatedReturnChartAxisLabel> arrayList = new ArrayList();
        for (Object obj : labels) {
            OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel = (OptionsSimulatedReturnChartAxisLabel) obj;
            if (!z || Math.abs(optionsSimulatedReturnChartAxisLabel.getPosition() - 1.0f) >= 0.001f) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel2 : arrayList) {
            arrayList2.add(new Line(CollectionsKt.listOf((Object[]) new Point[]{new Point(optionsSimulatedReturnChartAxisLabel2.getPosition(), 0.0f), new Point(optionsSimulatedReturnChartAxisLabel2.getPosition(), 1.0f)}), optionsSimulatedReturnChartAxisLabel2.m16938getLineColor0d7_KjU(), null, optionsSimulatedReturnChartAxisLabel2.getLineDrawStyle(), null, null, 52, null));
        }
        List<OptionsSimulatedReturnChartAxisLabel> labels2 = yAxis.getLabels();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels2, 10));
        for (OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel3 : labels2) {
            arrayList3.add(new Line(CollectionsKt.listOf((Object[]) new Point[]{new Point(0.0f, optionsSimulatedReturnChartAxisLabel3.getPosition()), new Point(1.0f, optionsSimulatedReturnChartAxisLabel3.getPosition())}), optionsSimulatedReturnChartAxisLabel3.m16938getLineColor0d7_KjU(), null, optionsSimulatedReturnChartAxisLabel3.getLineDrawStyle(), null, null, 52, null));
        }
        List<ChartAnnotation> listPlus = CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listPlus;
    }

    private final List<ChartAnnotation> getSegmentedLine(Composer composer, int i) {
        composer.startReplaceGroup(1581349995);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1581349995, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getSegmentedLine (OptionsSimulatedReturnChartViewState.kt:185)");
        }
        List<ChartAnnotation> listMapSegmentedLinesWithScrubPoint = UtilKt.mapSegmentedLinesWithScrubPoint(CollectionsKt.listOf(OptionsSimulatedReturnChartViewState4.createOptionsSimulatedReturnChartSegmentedLine(this.segmentedLineData, composer, SimulatedReturnsLine.$stable)), this.scrubbedDataPoint != null ? new Point(this.scrubbedDataPoint.getX(), this.scrubbedDataPoint.getY()) : null, ScrubLineType.SCRUBBING_DISABLED, null, composer, SegmentedLine.Default.$stable | 384 | (Point.$stable << 3), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listMapSegmentedLinesWithScrubPoint;
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public List<Overlays> getOverlays(Composer composer, int i) {
        composer.startReplaceGroup(-1748248200);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1748248200, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getOverlays (OptionsSimulatedReturnChartViewState.kt:196)");
        }
        int i2 = i & 14;
        List<Overlays> listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new Overlays[]{getScrubLine(composer, i2), getScrubDot(composer, i2)});
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listListOfNotNull;
    }

    private final Overlays getScrubLine(Composer composer, int i) {
        composer.startReplaceGroup(321046204);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(321046204, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getScrubLine (OptionsSimulatedReturnChartViewState.kt:201)");
        }
        OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint = this.scrubbedDataPoint;
        if (optionsSimulatedReturnChartPoint == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        Overlays overlays = new Overlays(new OverlayPosition(new Point(optionsSimulatedReturnChartPoint.getX(), 0.0f), OverlayPosition.HorizontalAlignment.CENTER, OverlayPosition.VerticalAlignment.BOTTOM), false, false, ComposableLambda3.rememberComposableLambda(736034140, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getScrubLine.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(736034140, i2, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getScrubLine.<anonymous> (OptionsSimulatedReturnChartViewState.kt:209)");
                }
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl((float) 1.5d)), 0.0f, 1, null);
                OptionsSimulatedReturnChartViewState optionsSimulatedReturnChartViewState = OptionsSimulatedReturnChartViewState.this;
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxHeight$default, optionsSimulatedReturnChartViewState.m16955getScrubColorXeAY9LY(optionsSimulatedReturnChartViewState.getScrubState(), composer2, 0), null, 2, null), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return overlays;
    }

    private final Overlays getScrubDot(Composer composer, int i) {
        final long jM21452getNegative0d7_KjU;
        composer.startReplaceGroup(-394734045);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-394734045, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getScrubDot (OptionsSimulatedReturnChartViewState.kt:219)");
        }
        OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint = this.scrubbedDataPoint;
        if (optionsSimulatedReturnChartPoint == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        if (optionsSimulatedReturnChartPoint.getYValue().compareTo(BigDecimal.ZERO) >= 0) {
            composer.startReplaceGroup(98691053);
            jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(98746605);
            jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
            composer.endReplaceGroup();
        }
        Overlays overlays = new Overlays(new OverlayPosition(new Point(optionsSimulatedReturnChartPoint.getX(), optionsSimulatedReturnChartPoint.getY()), OverlayPosition.HorizontalAlignment.CENTER, OverlayPosition.VerticalAlignment.CENTER), false, false, ComposableLambda3.rememberComposableLambda(34294659, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getScrubDot.1
            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(34294659, i2, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getScrubDot.<anonymous> (OptionsSimulatedReturnChartViewState.kt:233)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer2, i3).m21595getXsmallD9Ej5fM()), C2002Dp.m7995constructorimpl(10)), bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU(), RoundedCornerShape2.getCircleShape());
                long j = jM21452getNegative0d7_KjU;
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4871backgroundbw27NRU);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxKt.Box(BoxScopeInstance.INSTANCE.align(Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(7)), j, RoundedCornerShape2.getCircleShape()), companion2.getCenter()), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }
        }, composer, 54), 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return overlays;
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public Overlays getDateLabel(float f, float f2, Composer composer, int i) {
        composer.startReplaceGroup(832341991);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(832341991, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getDateLabel (OptionsSimulatedReturnChartViewState.kt:253)");
        }
        final OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint = this.scrubbedDataPoint;
        if (optionsSimulatedReturnChartPoint == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        Overlays overlays = new Overlays(new OverlayPosition(new Point((optionsSimulatedReturnChartPoint.getX() * f) / f2, 0.0f), OverlayPosition.HorizontalAlignment.CENTER, OverlayPosition.VerticalAlignment.BOTTOM), true, false, ComposableLambda3.rememberComposableLambda(-750129849, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getDateLabel.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-750129849, i2, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getDateLabel.<anonymous> (OptionsSimulatedReturnChartViewState.kt:264)");
                }
                String dateLabel = optionsSimulatedReturnChartPoint.getDateLabel();
                FontWeight bold = FontWeight.INSTANCE.getBold();
                OptionsSimulatedReturnChartViewState optionsSimulatedReturnChartViewState = this;
                long jM16955getScrubColorXeAY9LY = optionsSimulatedReturnChartViewState.m16955getScrubColorXeAY9LY(optionsSimulatedReturnChartViewState.getScrubState(), composer2, 0);
                BentoText2.m20747BentoText38GnDrw(dateLabel, null, Color.m6701boximpl(jM16955getScrubColorXeAY9LY), null, bold, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS(), composer2, 24576, 0, 8170);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), 4, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return overlays;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getScrubColor-XeAY9LY, reason: not valid java name */
    public final long m16955getScrubColorXeAY9LY(OptionsSimulatedChartScrubState optionsSimulatedChartScrubState, Composer composer, int i) {
        long jM21426getFg20d7_KjU;
        composer.startReplaceGroup(866202554);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(866202554, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState.getScrubColor (OptionsSimulatedReturnChartViewState.kt:274)");
        }
        OptionsSimulatedReturnChartDataState2 optionsSimulatedReturnChartDataState2 = this.launchMode;
        if (optionsSimulatedReturnChartDataState2 instanceof OptionsSimulatedReturnChartDataState2.PreTrade) {
            composer.startReplaceGroup(876937140);
            jM21426getFg20d7_KjU = OptionsSimulatedChartUtils.getPreTradeScrubColor(optionsSimulatedChartScrubState, composer, i & 14);
            composer.endReplaceGroup();
        } else {
            if (!Intrinsics.areEqual(optionsSimulatedReturnChartDataState2, OptionsSimulatedReturnChartDataState2.AggregatePosition.INSTANCE) && !Intrinsics.areEqual(optionsSimulatedReturnChartDataState2, OptionsSimulatedReturnChartDataState2.InstrumentPosition.INSTANCE) && !Intrinsics.areEqual(optionsSimulatedReturnChartDataState2, OptionsSimulatedReturnChartDataState2.Watchlist.INSTANCE)) {
                composer.startReplaceGroup(-802997777);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(877197323);
            if (optionsSimulatedChartScrubState.getScrubbing()) {
                composer.startReplaceGroup(877291284);
                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(877348851);
                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21426getFg20d7_KjU;
    }

    public final String getEstimatedContractPriceValue() {
        OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint = this.scrubbedDataPoint;
        BigDecimal estimatedContractPrice = optionsSimulatedReturnChartPoint != null ? optionsSimulatedReturnChartPoint.getEstimatedContractPrice() : null;
        if (estimatedContractPrice != null) {
            String str = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{estimatedContractPrice}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            estimatedContractPrice = new BigDecimal(str);
        }
        return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getAmountFormat(), estimatedContractPrice, null, 2, null);
    }

    public final int getEstimatedContractPriceLabelRes() {
        boolean z = this.isSingleLeg;
        if (z && (this.launchMode instanceof OptionsSimulatedReturnChartDataState2.PreTrade)) {
            return C23151R.string.options_simulated_return_header_est_contract_price;
        }
        if (!z && (this.launchMode instanceof OptionsSimulatedReturnChartDataState2.PreTrade)) {
            return C23151R.string.options_simulated_return_header_est_strategy_price;
        }
        if (z) {
            return C23151R.string.options_simulated_return_estimated_contract_price;
        }
        return C23151R.string.options_simulated_return_estimated_strategy_price;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getTickerText() {
        BigDecimal yValue;
        BigDecimal yValue2;
        int i = WhenMappings.$EnumSwitchMapping$1[this.type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            NumberFormatter percentDeltaWithHundredthDecimalFormat = Formats.getPercentDeltaWithHundredthDecimalFormat();
            OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint = this.scrubbedDataPoint;
            return NumberFormatter.DefaultImpls.formatNullable$default(percentDeltaWithHundredthDecimalFormat, optionsSimulatedReturnChartPoint != null ? optionsSimulatedReturnChartPoint.getYValue() : null, null, 2, null);
        }
        if (this.isHundredTradeValueMultiplier) {
            OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint2 = this.scrubbedDataPoint;
            yValue = (optionsSimulatedReturnChartPoint2 == null || (yValue2 = optionsSimulatedReturnChartPoint2.getYValue()) == null) ? null : yValue2.setScale(0, RoundingMode.HALF_UP);
        } else {
            OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint3 = this.scrubbedDataPoint;
            if (optionsSimulatedReturnChartPoint3 != null) {
                yValue = optionsSimulatedReturnChartPoint3.getYValue();
            }
        }
        return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceDeltaWithHundredthDecimalFormat(), yValue, null, 2, null);
    }

    private final OptionsSimulatedChartHeaderState2 getTickerDirection() {
        OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint = this.scrubbedDataPoint;
        if (optionsSimulatedReturnChartPoint == null || optionsSimulatedReturnChartPoint.getYValue().compareTo(BigDecimal.ZERO) >= 0) {
            return OptionsSimulatedChartHeaderState2.f4734UP;
        }
        return OptionsSimulatedChartHeaderState2.DOWN;
    }
}
