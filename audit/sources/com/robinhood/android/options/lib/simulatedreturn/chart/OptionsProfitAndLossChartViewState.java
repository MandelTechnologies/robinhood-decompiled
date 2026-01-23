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
import androidx.compose.p011ui.graphics.drawscope.DrawScope3;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.lib.simulatedreturn.C23151R;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDataState4;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState2;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsGridLine;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartParams;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossLimit;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossLimitType;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossMetrics;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnMarketDataParamsRequestV3;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnMarketDataParamsRequestV4;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartLegBundle;
import com.robinhood.models.p355ui.OptionUnderlyings;
import com.robinhood.shared.compose.color.LinearGradientColor;
import com.robinhood.utils.Either;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionsProfitAndLossChartViewState.kt */
@Metadata(m3635d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010 \u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\b\u0010Z\u001a\u0004\u0018\u00010\u001fJ\u001f\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020^H\u0017¢\u0006\u0002\u0010`J\u0010\u0010a\u001a\u00020\u00152\u0006\u0010b\u001a\u00020cH\u0002J\u0010\u0010d\u001a\u00020\u00152\u0006\u0010b\u001a\u00020cH\u0002J\u000f\u0010e\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0002\bfJ\b\u0010g\u001a\u00020hH\u0002J\u001b\u0010i\u001a\b\u0012\u0004\u0012\u00020j0D2\u0006\u0010k\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010lJ\u001b\u0010m\u001a\b\u0012\u0004\u0012\u00020j0D2\u0006\u0010k\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010lJ\u0013\u0010n\u001a\b\u0012\u0004\u0012\u00020j0DH\u0003¢\u0006\u0002\u0010oJ\u0013\u0010p\u001a\b\u0012\u0004\u0012\u00020j0DH\u0003¢\u0006\u0002\u0010oJ\u0013\u0010q\u001a\b\u0012\u0004\u0012\u00020\\0DH\u0017¢\u0006\u0002\u0010oJ\u000f\u0010r\u001a\u0004\u0018\u00010\\H\u0003¢\u0006\u0002\u0010sJ\u000f\u0010t\u001a\u0004\u0018\u00010\\H\u0003¢\u0006\u0002\u0010sJ\u0013\u0010u\u001a\b\u0012\u0004\u0012\u00020\\0vH\u0003¢\u0006\u0002\u0010wJ\u0015\u0010x\u001a\u00020y2\u0006\u0010k\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010zJ\u0015\u0010{\u001a\u00020y2\u0006\u0010k\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010zJ\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u007f\u001a\u00020\tHÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0011HÆ\u0003J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00103J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00108J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0013HÆ\u0003JÈ\u0001\u0010\u008c\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u0013HÆ\u0001¢\u0006\u0003\u0010\u008d\u0001J\u0016\u0010\u008e\u0001\u001a\u00020\u00132\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u0001HÖ\u0003J\u000b\u0010\u0091\u0001\u001a\u00030\u0092\u0001HÖ\u0001J\n\u0010\u0093\u0001\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u00104\u001a\u0004\b\u0012\u00103R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010 \u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b \u0010BR\u0019\u0010C\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010D¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0016\u0010H\u001a\u0004\u0018\u00010I8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010L\u001a\u0004\u0018\u00010M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001f\u0010P\u001a\u0010\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020M\u0018\u00010Q8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0010\u0010T\u001a\u0004\u0018\u00010UX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010V\u001a\u00020WX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010Y¨\u0006\u0094\u0001"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartViewState;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartViewState;", "pnlChartParams", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartParams;", "pnlLaunchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;", "pnlPostProcessParams", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartPostProcessParams;", "chartData", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartData;", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "chartBundle", "Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "scrubState", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;", "snappedScrubPoint", "Lcom/robinhood/android/charts/model/Point;", "isSingleLeg", "", "strategyCode", "", "estimatedContractPrice", "", "errorState", "Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "pnlMetrics", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingValue", "Ljava/math/BigDecimal;", "isSnappedToUnderlyingQuote", "<init>", "(Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartParams;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartPostProcessParams;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartData;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;Lcom/robinhood/android/charts/model/Point;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Ljava/math/BigDecimal;Z)V", "getPnlChartParams", "()Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartParams;", "getPnlLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;", "getPnlPostProcessParams", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartPostProcessParams;", "getChartData", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartData;", "getLoggingState", "()Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "getChartBundle", "()Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "getScrubState", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;", "getSnappedScrubPoint", "()Lcom/robinhood/android/charts/model/Point;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStrategyCode", "()Ljava/lang/String;", "getEstimatedContractPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getErrorState", "()Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "getPnlMetrics", "()Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getUnderlyingValue", "()Ljava/math/BigDecimal;", "()Z", "optionInstrumentIds", "", "Ljava/util/UUID;", "getOptionInstrumentIds", "()Ljava/util/List;", "simulatedReturnMarketDataParamsRequestV3", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV3;", "getSimulatedReturnMarketDataParamsRequestV3", "()Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV3;", "simulatedReturnMarketDataParamsRequestV4", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV4;", "getSimulatedReturnMarketDataParamsRequestV4", "()Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV4;", "simulatedReturnMarketDataParamsRequest", "Lcom/robinhood/utils/Either;", "getSimulatedReturnMarketDataParamsRequest", "()Lcom/robinhood/utils/Either;", "scrubbedDataPoint", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartPoint;", "headerState", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "getHeaderState", "()Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "getScrubbedUnderlyingPrice", "getDateLabel", "Lcom/robinhood/android/charts/overlay/ChartOverlay;", "chartWidth", "", "parentWidthAfterPadding", "(FFLandroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/overlay/ChartOverlay;", "getEstimatedContractPriceValue", "resources", "Landroid/content/res/Resources;", "getTickerText", "getReturnPercentage", "getReturnPercentage$lib_options_simulated_return_externalDebug", "getTickerDirection", "Lcom/robinhood/android/options/lib/simulatedreturn/header/TickerDirection;", "getAnnotations", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "usePreTradeStyle", "(ZLandroidx/compose/runtime/Composer;I)Ljava/util/List;", "getGridLines", "getSegmentedLine", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "getShadedAreas", "getOverlays", "getScrubLine", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/overlay/ChartOverlay;", "getUnderlyingLine", "getPointsOfInterestDots", "Lkotlinx/collections/immutable/ImmutableList;", "(Landroidx/compose/runtime/Composer;I)Lkotlinx/collections/immutable/ImmutableList;", "getXAxis", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisModel;", "(ZLandroidx/compose/runtime/Composer;I)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisModel;", "getYAxis", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartParams;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartPostProcessParams;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartData;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;Lcom/robinhood/android/charts/model/Point;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Ljava/math/BigDecimal;Z)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartViewState;", "equals", "other", "", "hashCode", "", "toString", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionsProfitAndLossChartViewState implements OptionsSimulatedChartViewState {
    public static final int $stable = 8;
    private final OptionSimulatedChartBundle chartBundle;
    private final OptionsProfitAndLossChartData chartData;
    private final OptionsSimulatedReturnErrorState errorState;
    private final Double estimatedContractPrice;
    private final OptionsSimulatedChartHeaderState headerState;
    private final Boolean isSingleLeg;
    private final boolean isSnappedToUnderlyingQuote;
    private final OptionsSimulatedReturnLoggingState loggingState;
    private final List<UUID> optionInstrumentIds;
    private final ProfitAndLossChartParams pnlChartParams;
    private final OptionsProfitAndLossChartDataState4 pnlLaunchMode;
    private final ProfitAndLossMetrics pnlMetrics;
    private final OptionsProfitAndLossChartPostProcessParams pnlPostProcessParams;
    private final OptionsSimulatedChartScrubState scrubState;
    private final OptionsSimulatedReturnChartPoint scrubbedDataPoint;
    private final Point snappedScrubPoint;
    private final String strategyCode;
    private final OptionChain.UnderlyingType underlyingType;
    private final BigDecimal underlyingValue;

    /* compiled from: OptionsProfitAndLossChartViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            int[] iArr2 = new int[OptionsSimulatedChartHeaderState2.values().length];
            try {
                iArr2[OptionsSimulatedChartHeaderState2.f4734UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OptionsSimulatedChartHeaderState2.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ProfitAndLossLimitType.values().length];
            try {
                iArr3[ProfitAndLossLimitType.LIMIT_FINITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ProfitAndLossLimitType.LIMIT_POSITIVE_INFINITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ProfitAndLossLimitType.LIMIT_NEGATIVE_INFINITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ProfitAndLossLimitType.LIMIT_UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* renamed from: component1, reason: from getter */
    public final ProfitAndLossChartParams getPnlChartParams() {
        return this.pnlChartParams;
    }

    /* renamed from: component10, reason: from getter */
    public final String getStrategyCode() {
        return this.strategyCode;
    }

    /* renamed from: component11, reason: from getter */
    public final Double getEstimatedContractPrice() {
        return this.estimatedContractPrice;
    }

    /* renamed from: component12, reason: from getter */
    public final OptionsSimulatedReturnErrorState getErrorState() {
        return this.errorState;
    }

    /* renamed from: component13, reason: from getter */
    public final ProfitAndLossMetrics getPnlMetrics() {
        return this.pnlMetrics;
    }

    /* renamed from: component14, reason: from getter */
    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    /* renamed from: component15, reason: from getter */
    public final BigDecimal getUnderlyingValue() {
        return this.underlyingValue;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsSnappedToUnderlyingQuote() {
        return this.isSnappedToUnderlyingQuote;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionsProfitAndLossChartDataState4 getPnlLaunchMode() {
        return this.pnlLaunchMode;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionsProfitAndLossChartPostProcessParams getPnlPostProcessParams() {
        return this.pnlPostProcessParams;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionsProfitAndLossChartData getChartData() {
        return this.chartData;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionSimulatedChartBundle getChartBundle() {
        return this.chartBundle;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionsSimulatedChartScrubState getScrubState() {
        return this.scrubState;
    }

    /* renamed from: component8, reason: from getter */
    public final Point getSnappedScrubPoint() {
        return this.snappedScrubPoint;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsSingleLeg() {
        return this.isSingleLeg;
    }

    public final OptionsProfitAndLossChartViewState copy(ProfitAndLossChartParams pnlChartParams, OptionsProfitAndLossChartDataState4 pnlLaunchMode, OptionsProfitAndLossChartPostProcessParams pnlPostProcessParams, OptionsProfitAndLossChartData chartData, OptionsSimulatedReturnLoggingState loggingState, OptionSimulatedChartBundle chartBundle, OptionsSimulatedChartScrubState scrubState, Point snappedScrubPoint, Boolean isSingleLeg, String strategyCode, Double estimatedContractPrice, OptionsSimulatedReturnErrorState errorState, ProfitAndLossMetrics pnlMetrics, OptionChain.UnderlyingType underlyingType, BigDecimal underlyingValue, boolean isSnappedToUnderlyingQuote) {
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Intrinsics.checkNotNullParameter(scrubState, "scrubState");
        Intrinsics.checkNotNullParameter(snappedScrubPoint, "snappedScrubPoint");
        return new OptionsProfitAndLossChartViewState(pnlChartParams, pnlLaunchMode, pnlPostProcessParams, chartData, loggingState, chartBundle, scrubState, snappedScrubPoint, isSingleLeg, strategyCode, estimatedContractPrice, errorState, pnlMetrics, underlyingType, underlyingValue, isSnappedToUnderlyingQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsProfitAndLossChartViewState)) {
            return false;
        }
        OptionsProfitAndLossChartViewState optionsProfitAndLossChartViewState = (OptionsProfitAndLossChartViewState) other;
        return Intrinsics.areEqual(this.pnlChartParams, optionsProfitAndLossChartViewState.pnlChartParams) && Intrinsics.areEqual(this.pnlLaunchMode, optionsProfitAndLossChartViewState.pnlLaunchMode) && Intrinsics.areEqual(this.pnlPostProcessParams, optionsProfitAndLossChartViewState.pnlPostProcessParams) && Intrinsics.areEqual(this.chartData, optionsProfitAndLossChartViewState.chartData) && Intrinsics.areEqual(this.loggingState, optionsProfitAndLossChartViewState.loggingState) && Intrinsics.areEqual(this.chartBundle, optionsProfitAndLossChartViewState.chartBundle) && this.scrubState == optionsProfitAndLossChartViewState.scrubState && Intrinsics.areEqual(this.snappedScrubPoint, optionsProfitAndLossChartViewState.snappedScrubPoint) && Intrinsics.areEqual(this.isSingleLeg, optionsProfitAndLossChartViewState.isSingleLeg) && Intrinsics.areEqual(this.strategyCode, optionsProfitAndLossChartViewState.strategyCode) && Intrinsics.areEqual((Object) this.estimatedContractPrice, (Object) optionsProfitAndLossChartViewState.estimatedContractPrice) && this.errorState == optionsProfitAndLossChartViewState.errorState && Intrinsics.areEqual(this.pnlMetrics, optionsProfitAndLossChartViewState.pnlMetrics) && this.underlyingType == optionsProfitAndLossChartViewState.underlyingType && Intrinsics.areEqual(this.underlyingValue, optionsProfitAndLossChartViewState.underlyingValue) && this.isSnappedToUnderlyingQuote == optionsProfitAndLossChartViewState.isSnappedToUnderlyingQuote;
    }

    public int hashCode() {
        ProfitAndLossChartParams profitAndLossChartParams = this.pnlChartParams;
        int iHashCode = (profitAndLossChartParams == null ? 0 : profitAndLossChartParams.hashCode()) * 31;
        OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState4 = this.pnlLaunchMode;
        int iHashCode2 = (iHashCode + (optionsProfitAndLossChartDataState4 == null ? 0 : optionsProfitAndLossChartDataState4.hashCode())) * 31;
        OptionsProfitAndLossChartPostProcessParams optionsProfitAndLossChartPostProcessParams = this.pnlPostProcessParams;
        int iHashCode3 = (((iHashCode2 + (optionsProfitAndLossChartPostProcessParams == null ? 0 : optionsProfitAndLossChartPostProcessParams.hashCode())) * 31) + this.chartData.hashCode()) * 31;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = this.loggingState;
        int iHashCode4 = (iHashCode3 + (optionsSimulatedReturnLoggingState == null ? 0 : optionsSimulatedReturnLoggingState.hashCode())) * 31;
        OptionSimulatedChartBundle optionSimulatedChartBundle = this.chartBundle;
        int iHashCode5 = (((((iHashCode4 + (optionSimulatedChartBundle == null ? 0 : optionSimulatedChartBundle.hashCode())) * 31) + this.scrubState.hashCode()) * 31) + this.snappedScrubPoint.hashCode()) * 31;
        Boolean bool = this.isSingleLeg;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.strategyCode;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.estimatedContractPrice;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState = this.errorState;
        int iHashCode9 = (iHashCode8 + (optionsSimulatedReturnErrorState == null ? 0 : optionsSimulatedReturnErrorState.hashCode())) * 31;
        ProfitAndLossMetrics profitAndLossMetrics = this.pnlMetrics;
        int iHashCode10 = (iHashCode9 + (profitAndLossMetrics == null ? 0 : profitAndLossMetrics.hashCode())) * 31;
        OptionChain.UnderlyingType underlyingType = this.underlyingType;
        int iHashCode11 = (iHashCode10 + (underlyingType == null ? 0 : underlyingType.hashCode())) * 31;
        BigDecimal bigDecimal = this.underlyingValue;
        return ((iHashCode11 + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSnappedToUnderlyingQuote);
    }

    public String toString() {
        return "OptionsProfitAndLossChartViewState(pnlChartParams=" + this.pnlChartParams + ", pnlLaunchMode=" + this.pnlLaunchMode + ", pnlPostProcessParams=" + this.pnlPostProcessParams + ", chartData=" + this.chartData + ", loggingState=" + this.loggingState + ", chartBundle=" + this.chartBundle + ", scrubState=" + this.scrubState + ", snappedScrubPoint=" + this.snappedScrubPoint + ", isSingleLeg=" + this.isSingleLeg + ", strategyCode=" + this.strategyCode + ", estimatedContractPrice=" + this.estimatedContractPrice + ", errorState=" + this.errorState + ", pnlMetrics=" + this.pnlMetrics + ", underlyingType=" + this.underlyingType + ", underlyingValue=" + this.underlyingValue + ", isSnappedToUnderlyingQuote=" + this.isSnappedToUnderlyingQuote + ")";
    }

    public OptionsProfitAndLossChartViewState(ProfitAndLossChartParams profitAndLossChartParams, OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState4, OptionsProfitAndLossChartPostProcessParams optionsProfitAndLossChartPostProcessParams, OptionsProfitAndLossChartData chartData, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionSimulatedChartBundle optionSimulatedChartBundle, OptionsSimulatedChartScrubState scrubState, Point snappedScrubPoint, Boolean bool, String str, Double d, OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, ProfitAndLossMetrics profitAndLossMetrics, OptionChain.UnderlyingType underlyingType, BigDecimal bigDecimal, boolean z) {
        ArrayList arrayList;
        OptionsSimulatedChartHeaderState portfolioRiskAnalyzerHeader;
        BentoTheme4 bentoTheme4;
        int i;
        ImmutableList<OptionSimulatedChartLegBundle> legBundles;
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Intrinsics.checkNotNullParameter(scrubState, "scrubState");
        Intrinsics.checkNotNullParameter(snappedScrubPoint, "snappedScrubPoint");
        this.pnlChartParams = profitAndLossChartParams;
        this.pnlLaunchMode = optionsProfitAndLossChartDataState4;
        this.pnlPostProcessParams = optionsProfitAndLossChartPostProcessParams;
        this.chartData = chartData;
        this.loggingState = optionsSimulatedReturnLoggingState;
        this.chartBundle = optionSimulatedChartBundle;
        this.scrubState = scrubState;
        this.snappedScrubPoint = snappedScrubPoint;
        this.isSingleLeg = bool;
        this.strategyCode = str;
        this.estimatedContractPrice = d;
        this.errorState = optionsSimulatedReturnErrorState;
        this.pnlMetrics = profitAndLossMetrics;
        this.underlyingType = underlyingType;
        this.underlyingValue = bigDecimal;
        this.isSnappedToUnderlyingQuote = z;
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
        this.scrubbedDataPoint = (OptionsSimulatedReturnChartPoint) UtilKt.getClosestItemByValue(this.chartData.getDataPoints(), this.snappedScrubPoint.getX(), new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(OptionsProfitAndLossChartViewState.scrubbedDataPoint$lambda$3((OptionsSimulatedReturnChartPoint) obj));
            }
        });
        OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState42 = this.pnlLaunchMode;
        if (optionsProfitAndLossChartDataState42 instanceof OptionsProfitAndLossChartDataState4.PreTrade) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.scrubState.ordinal()];
            if (i2 == 1) {
                portfolioRiskAnalyzerHeader = new OptionsSimulatedChartHeaderState.OptionsProfitAndLossMetricsHeader(new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsProfitAndLossChartViewState.headerState$lambda$4(this.f$0, (Resources) obj);
                    }
                }, new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsProfitAndLossChartViewState.headerState$lambda$5(this.f$0, (Resources) obj);
                    }
                }, new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsProfitAndLossChartViewState.headerState$lambda$6(this.f$0, (Resources) obj);
                    }
                });
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                OptionsSimulatedChartHeaderState2 tickerDirection = getTickerDirection();
                Function1 function1 = new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsProfitAndLossChartViewState.headerState$lambda$7(this.f$0, (Resources) obj);
                    }
                };
                Boolean bool2 = this.isSingleLeg;
                if (bool2 == null || bool2.booleanValue()) {
                    i = C23151R.string.options_simulated_return_header_est_contract_price;
                } else {
                    i = C23151R.string.options_simulated_return_header_est_strategy_price;
                }
                portfolioRiskAnalyzerHeader = new OptionsSimulatedChartHeaderState.OptionsSimulatedReturnHeader(tickerDirection, function1, i, new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsProfitAndLossChartViewState.headerState$lambda$8(this.f$0, (Resources) obj);
                    }
                }, OptionsSimulatedReturnChartViewState3.DOLLAR);
            }
        } else if (optionsProfitAndLossChartDataState42 instanceof OptionsProfitAndLossChartDataState4.PortfolioRiskAnalyzer) {
            Function1 function12 = new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsProfitAndLossChartViewState.headerState$lambda$9(this.f$0, (Resources) obj);
                }
            };
            Function1 function13 = new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsProfitAndLossChartViewState.headerState$lambda$10(this.f$0, (Resources) obj);
                }
            };
            Function1 function14 = new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsProfitAndLossChartViewState.headerState$lambda$11(this.f$0, (Resources) obj);
                }
            };
            BigDecimal returnPercentage$lib_options_simulated_return_externalDebug = getReturnPercentage$lib_options_simulated_return_externalDebug();
            int i3 = WhenMappings.$EnumSwitchMapping$1[getTickerDirection().ordinal()];
            if (i3 == 1) {
                bentoTheme4 = BentoTheme4.POSITIVE;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bentoTheme4 = BentoTheme4.NEGATIVE;
            }
            portfolioRiskAnalyzerHeader = new OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader(function12, function13, function14, returnPercentage$lib_options_simulated_return_externalDebug, bentoTheme4);
        } else {
            if (optionsProfitAndLossChartDataState42 != null) {
                throw new NoWhenBranchMatchedException();
            }
            portfolioRiskAnalyzerHeader = OptionsSimulatedChartHeaderState.EmptyHeader.INSTANCE;
        }
        this.headerState = portfolioRiskAnalyzerHeader;
    }

    public final ProfitAndLossChartParams getPnlChartParams() {
        return this.pnlChartParams;
    }

    public final OptionsProfitAndLossChartDataState4 getPnlLaunchMode() {
        return this.pnlLaunchMode;
    }

    public final OptionsProfitAndLossChartPostProcessParams getPnlPostProcessParams() {
        return this.pnlPostProcessParams;
    }

    public final OptionsProfitAndLossChartData getChartData() {
        return this.chartData;
    }

    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    public final OptionSimulatedChartBundle getChartBundle() {
        return this.chartBundle;
    }

    public final OptionsSimulatedChartScrubState getScrubState() {
        return this.scrubState;
    }

    public final Point getSnappedScrubPoint() {
        return this.snappedScrubPoint;
    }

    public final Boolean isSingleLeg() {
        return this.isSingleLeg;
    }

    public final String getStrategyCode() {
        return this.strategyCode;
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public Double getEstimatedContractPrice() {
        return this.estimatedContractPrice;
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public OptionsSimulatedReturnErrorState getErrorState() {
        return this.errorState;
    }

    public final ProfitAndLossMetrics getPnlMetrics() {
        return this.pnlMetrics;
    }

    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    public final BigDecimal getUnderlyingValue() {
        return this.underlyingValue;
    }

    public final boolean isSnappedToUnderlyingQuote() {
        return this.isSnappedToUnderlyingQuote;
    }

    public final List<UUID> getOptionInstrumentIds() {
        return this.optionInstrumentIds;
    }

    private final OptionSimulatedReturnMarketDataParamsRequestV3 getSimulatedReturnMarketDataParamsRequestV3() {
        OptionSimulatedChartBundle optionSimulatedChartBundle = this.chartBundle;
        if (optionSimulatedChartBundle == null || this.strategyCode == null) {
            return null;
        }
        return new OptionSimulatedReturnMarketDataParamsRequestV3(optionSimulatedChartBundle.isLateClosing(), this.chartBundle.getOptionInstruments(), this.chartBundle.getUnderlying(), this.chartBundle.getChainToLegExpirationDatesList(), this.strategyCode);
    }

    private final OptionSimulatedReturnMarketDataParamsRequestV4 getSimulatedReturnMarketDataParamsRequestV4() {
        OptionSimulatedChartBundle optionSimulatedChartBundle = this.chartBundle;
        if (optionSimulatedChartBundle == null) {
            return null;
        }
        return new OptionSimulatedReturnMarketDataParamsRequestV4(this.chartBundle.getOptionInstruments(), optionSimulatedChartBundle.getUnderlying(), this.chartBundle.getChainToLegExpirationDatesList());
    }

    public final Either<OptionSimulatedReturnMarketDataParamsRequestV3, OptionSimulatedReturnMarketDataParamsRequestV4> getSimulatedReturnMarketDataParamsRequest() {
        if (this.pnlLaunchMode instanceof OptionsProfitAndLossChartDataState4.PortfolioRiskAnalyzer) {
            OptionSimulatedReturnMarketDataParamsRequestV4 simulatedReturnMarketDataParamsRequestV4 = getSimulatedReturnMarketDataParamsRequestV4();
            if (simulatedReturnMarketDataParamsRequestV4 != null) {
                return new Either.Right(simulatedReturnMarketDataParamsRequestV4);
            }
            return null;
        }
        OptionSimulatedReturnMarketDataParamsRequestV3 simulatedReturnMarketDataParamsRequestV3 = getSimulatedReturnMarketDataParamsRequestV3();
        if (simulatedReturnMarketDataParamsRequestV3 != null) {
            return new Either.Left(simulatedReturnMarketDataParamsRequestV3);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scrubbedDataPoint$lambda$3(OptionsSimulatedReturnChartPoint it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getX();
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public OptionsSimulatedChartHeaderState getHeaderState() {
        return this.headerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$4(OptionsProfitAndLossChartViewState optionsProfitAndLossChartViewState, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        ProfitAndLossMetrics profitAndLossMetrics = optionsProfitAndLossChartViewState.pnlMetrics;
        return OptionsProfitAndLossChartUtils.getMaxProfitOrLossDisplayText(resources, profitAndLossMetrics != null ? profitAndLossMetrics.getMaxProfit() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$5(OptionsProfitAndLossChartViewState optionsProfitAndLossChartViewState, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        ProfitAndLossMetrics profitAndLossMetrics = optionsProfitAndLossChartViewState.pnlMetrics;
        return OptionsProfitAndLossChartUtils.getMaxProfitOrLossDisplayText(resources, profitAndLossMetrics != null ? profitAndLossMetrics.getMaxLoss() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$6(OptionsProfitAndLossChartViewState optionsProfitAndLossChartViewState, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        OptionChain.UnderlyingType underlyingType = optionsProfitAndLossChartViewState.underlyingType;
        ProfitAndLossMetrics profitAndLossMetrics = optionsProfitAndLossChartViewState.pnlMetrics;
        return OptionsProfitAndLossChartUtils.getBreakevenDisplayText(resources, underlyingType, profitAndLossMetrics != null ? profitAndLossMetrics.getBreakevenPoints() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$7(OptionsProfitAndLossChartViewState optionsProfitAndLossChartViewState, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return optionsProfitAndLossChartViewState.getTickerText(resources);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$8(OptionsProfitAndLossChartViewState optionsProfitAndLossChartViewState, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return optionsProfitAndLossChartViewState.getEstimatedContractPriceValue(resources);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$9(OptionsProfitAndLossChartViewState optionsProfitAndLossChartViewState, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        ProfitAndLossMetrics profitAndLossMetrics = optionsProfitAndLossChartViewState.pnlMetrics;
        return OptionsProfitAndLossChartUtils.getMaxProfitOrLossDisplayText(resources, profitAndLossMetrics != null ? profitAndLossMetrics.getMaxProfit() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$10(OptionsProfitAndLossChartViewState optionsProfitAndLossChartViewState, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        ProfitAndLossMetrics profitAndLossMetrics = optionsProfitAndLossChartViewState.pnlMetrics;
        return OptionsProfitAndLossChartUtils.getMaxProfitOrLossDisplayText(resources, profitAndLossMetrics != null ? profitAndLossMetrics.getMaxLoss() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headerState$lambda$11(OptionsProfitAndLossChartViewState optionsProfitAndLossChartViewState, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return optionsProfitAndLossChartViewState.getTickerText(resources);
    }

    public final BigDecimal getScrubbedUnderlyingPrice() {
        BigDecimal bigDecimal;
        OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint = this.scrubbedDataPoint;
        if (optionsSimulatedReturnChartPoint == null) {
            return null;
        }
        if (Intrinsics.areEqual(optionsSimulatedReturnChartPoint, CollectionsKt.firstOrNull((List) this.chartData.getDataPoints()))) {
            return BigDecimal.ZERO;
        }
        if (Intrinsics.areEqual(optionsSimulatedReturnChartPoint, CollectionsKt.lastOrNull((List) this.chartData.getDataPoints()))) {
            return null;
        }
        return (!this.isSnappedToUnderlyingQuote || (bigDecimal = this.underlyingValue) == null) ? optionsSimulatedReturnChartPoint.getXValue() : bigDecimal;
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public Overlays getDateLabel(float f, float f2, Composer composer, int i) {
        final String dateLabel;
        BigDecimal bigDecimal;
        composer.startReplaceGroup(1300857691);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1300857691, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getDateLabel (OptionsProfitAndLossChartViewState.kt:172)");
        }
        OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint = this.scrubbedDataPoint;
        if (optionsSimulatedReturnChartPoint == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        OverlayPosition overlayPosition = new OverlayPosition(new Point((optionsSimulatedReturnChartPoint.getX() * f) / f2, 0.0f), OverlayPosition.HorizontalAlignment.CENTER, OverlayPosition.VerticalAlignment.BOTTOM);
        OptionsProfitAndLossChartPostProcessParams optionsProfitAndLossChartPostProcessParams = this.pnlPostProcessParams;
        NumberFormatter underlyingNumberFormatter = OptionUnderlyings.getUnderlyingNumberFormatter(optionsProfitAndLossChartPostProcessParams != null ? optionsProfitAndLossChartPostProcessParams.getUnderlyingType() : null);
        composer.startReplaceGroup(288776129);
        if (Intrinsics.areEqual(optionsSimulatedReturnChartPoint, CollectionsKt.firstOrNull((List) this.chartData.getDataPoints()))) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            dateLabel = underlyingNumberFormatter.format(ZERO);
        } else if (Intrinsics.areEqual(optionsSimulatedReturnChartPoint, CollectionsKt.lastOrNull((List) this.chartData.getDataPoints()))) {
            dateLabel = StringResources_androidKt.stringResource(C23151R.string.options_profit_and_loss_unlimited_label, composer, 0);
        } else {
            dateLabel = (!this.isSnappedToUnderlyingQuote || (bigDecimal = this.underlyingValue) == null) ? optionsSimulatedReturnChartPoint.getDateLabel() : underlyingNumberFormatter.format(bigDecimal);
        }
        composer.endReplaceGroup();
        Overlays overlays = new Overlays(overlayPosition, true, false, ComposableLambda3.rememberComposableLambda(-1786734405, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getDateLabel.1
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
                    ComposerKt.traceEventStart(-1786734405, i2, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getDateLabel.<anonymous> (OptionsProfitAndLossChartViewState.kt:193)");
                }
                FontWeight bold = FontWeight.INSTANCE.getBold();
                long preTradeScrubColor = OptionsSimulatedChartUtils.getPreTradeScrubColor(OptionsProfitAndLossChartViewState.this.getScrubState(), composer2, 0);
                BentoText2.m20747BentoText38GnDrw(dateLabel, null, Color.m6701boximpl(preTradeScrubColor), null, bold, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS(), composer2, 24576, 0, 8170);
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

    private final String getEstimatedContractPriceValue(Resources resources) throws Resources.NotFoundException {
        ProfitAndLossLimit limitAtInfinity;
        String string2 = resources.getString(C11048R.string.general_label_n_a_short);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint = this.scrubbedDataPoint;
        if (optionsSimulatedReturnChartPoint != null) {
            if (Intrinsics.areEqual(optionsSimulatedReturnChartPoint, CollectionsKt.firstOrNull((List) this.chartData.getDataPoints()))) {
                limitAtInfinity = this.chartData.getLimitAtZero();
            } else {
                if (!Intrinsics.areEqual(optionsSimulatedReturnChartPoint, CollectionsKt.lastOrNull((List) this.chartData.getDataPoints()))) {
                    NumberFormatter amountFormat = Formats.getAmountFormat();
                    String str = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{optionsSimulatedReturnChartPoint.getEstimatedContractPrice()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    return amountFormat.format(new BigDecimal(str));
                }
                limitAtInfinity = this.chartData.getLimitAtInfinity();
            }
            ProfitAndLossLimitType type2 = limitAtInfinity != null ? limitAtInfinity.getType() : null;
            int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$2[type2.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    NumberFormatter amountFormat2 = Formats.getAmountFormat();
                    String str2 = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{optionsSimulatedReturnChartPoint.getEstimatedContractPrice()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    return amountFormat2.format(new BigDecimal(str2));
                }
                if (i == 2 || i == 3) {
                    String string3 = resources.getString(C23151R.string.options_profit_and_loss_unlimited_label);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    return string3;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return string2;
    }

    private final String getTickerText(Resources resources) throws Resources.NotFoundException {
        ProfitAndLossLimit limitAtInfinity;
        String string2 = resources.getString(C11048R.string.general_label_n_a_short);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint = this.scrubbedDataPoint;
        if (optionsSimulatedReturnChartPoint == null) {
            return string2;
        }
        if (Intrinsics.areEqual(optionsSimulatedReturnChartPoint, CollectionsKt.firstOrNull((List) this.chartData.getDataPoints()))) {
            limitAtInfinity = this.chartData.getLimitAtZero();
        } else {
            if (!Intrinsics.areEqual(optionsSimulatedReturnChartPoint, CollectionsKt.lastOrNull((List) this.chartData.getDataPoints()))) {
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceDeltaWithHundredthDecimalFormat(), optionsSimulatedReturnChartPoint.getYValue(), null, 2, null);
            }
            limitAtInfinity = this.chartData.getLimitAtInfinity();
        }
        ProfitAndLossLimitType type2 = limitAtInfinity != null ? limitAtInfinity.getType() : null;
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$2[type2.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceDeltaWithHundredthDecimalFormat(), limitAtInfinity.getProfitOrLoss(), null, 2, null);
            }
            if (i == 2 || i == 3) {
                String string3 = resources.getString(C23151R.string.options_profit_and_loss_unlimited_label);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        String string4 = resources.getString(C11048R.string.general_label_n_a_short);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    public final BigDecimal getReturnPercentage$lib_options_simulated_return_externalDebug() {
        ProfitAndLossLimit limitAtInfinity;
        OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState4 = this.pnlLaunchMode;
        if (!(optionsProfitAndLossChartDataState4 instanceof OptionsProfitAndLossChartDataState4.PortfolioRiskAnalyzer)) {
            return null;
        }
        BigDecimal decimalValue = ((OptionsProfitAndLossChartDataState4.PortfolioRiskAnalyzer) optionsProfitAndLossChartDataState4).getTotalCostForPercentageCalculation().getDecimalValue();
        OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint = this.scrubbedDataPoint;
        if (optionsSimulatedReturnChartPoint == null) {
            return null;
        }
        if (Intrinsics.areEqual(optionsSimulatedReturnChartPoint, CollectionsKt.firstOrNull((List) this.chartData.getDataPoints()))) {
            limitAtInfinity = this.chartData.getLimitAtZero();
        } else {
            if (!Intrinsics.areEqual(optionsSimulatedReturnChartPoint, CollectionsKt.lastOrNull((List) this.chartData.getDataPoints()))) {
                return BigDecimals7.safeDivide(optionsSimulatedReturnChartPoint.getYValue(), decimalValue);
            }
            limitAtInfinity = this.chartData.getLimitAtInfinity();
        }
        ProfitAndLossLimitType type2 = limitAtInfinity != null ? limitAtInfinity.getType() : null;
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$2[type2.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return BigDecimals7.safeDivide(limitAtInfinity.getProfitOrLoss(), decimalValue);
            }
            if (i != 2 && i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    private final OptionsSimulatedChartHeaderState2 getTickerDirection() {
        OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint = this.scrubbedDataPoint;
        if (optionsSimulatedReturnChartPoint == null || optionsSimulatedReturnChartPoint.getYValue().compareTo(BigDecimal.ZERO) >= 0) {
            return OptionsSimulatedChartHeaderState2.f4734UP;
        }
        return OptionsSimulatedChartHeaderState2.DOWN;
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public List<ChartAnnotation> getAnnotations(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(-1151939283);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1151939283, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getAnnotations (OptionsProfitAndLossChartViewState.kt:275)");
        }
        List<ChartAnnotation> gridLines = getGridLines(z, composer, i & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        int i2 = (i >> 3) & 14;
        List<ChartAnnotation> listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) gridLines, (Iterable) getSegmentedLine(composer, i2)), (Iterable) getShadedAreas(composer, i2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listPlus;
    }

    private final List<ChartAnnotation> getGridLines(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(-829154536);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-829154536, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getGridLines (OptionsProfitAndLossChartViewState.kt:281)");
        }
        int i2 = i & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
        OptionsSimulatedReturnChartAxisModel xAxis = getXAxis(z, composer, i2);
        OptionsSimulatedReturnChartAxisModel yAxis = getYAxis(z, composer, i2);
        List<OptionsSimulatedReturnChartAxisLabel> labels = xAxis.getLabels();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels, 10));
        for (OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel : labels) {
            arrayList.add(new Line(CollectionsKt.listOf((Object[]) new Point[]{new Point(optionsSimulatedReturnChartAxisLabel.getPosition(), 0.0f), new Point(optionsSimulatedReturnChartAxisLabel.getPosition(), 1.0f)}), optionsSimulatedReturnChartAxisLabel.m16938getLineColor0d7_KjU(), null, optionsSimulatedReturnChartAxisLabel.getLineDrawStyle(), null, null, 52, null));
        }
        List<OptionsSimulatedReturnChartAxisLabel> labels2 = yAxis.getLabels();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels2, 10));
        for (OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel2 : labels2) {
            arrayList2.add(new Line(CollectionsKt.listOf((Object[]) new Point[]{new Point(0.0f, optionsSimulatedReturnChartAxisLabel2.getPosition()), new Point(1.0f, optionsSimulatedReturnChartAxisLabel2.getPosition())}), optionsSimulatedReturnChartAxisLabel2.m16938getLineColor0d7_KjU(), null, optionsSimulatedReturnChartAxisLabel2.getLineDrawStyle(), null, null, 52, null));
        }
        List<ChartAnnotation> listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listPlus;
    }

    private final List<ChartAnnotation> getSegmentedLine(Composer composer, int i) {
        composer.startReplaceGroup(-1060808225);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1060808225, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getSegmentedLine (OptionsProfitAndLossChartViewState.kt:300)");
        }
        List<ChartAnnotation> listMapSegmentedLinesWithScrubPoint = UtilKt.mapSegmentedLinesWithScrubPoint(CollectionsKt.listOf(OptionsProfitAndLossChartViewState5.createOptionsProfitLAndLossChartSegmentedLine(this.chartData.getSegmentedLineData(), composer, 0)), this.scrubbedDataPoint != null ? new Point(this.scrubbedDataPoint.getX(), this.scrubbedDataPoint.getY()) : null, ScrubLineType.SCRUBBING_DISABLED, null, composer, SegmentedLine.Default.$stable | 384 | (Point.$stable << 3), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listMapSegmentedLinesWithScrubPoint;
    }

    private final List<ChartAnnotation> getShadedAreas(Composer composer, int i) {
        composer.startReplaceGroup(812377320);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(812377320, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getShadedAreas (OptionsProfitAndLossChartViewState.kt:311)");
        }
        composer.startReplaceGroup(-989439609);
        ImmutableList<List<OptionsProfitAndLossSegment>> positiveAreas = this.chartData.getPositiveAreas();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(positiveAreas, 10));
        for (List<OptionsProfitAndLossSegment> list : positiveAreas) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<OptionsSimulatedReturnChartPoint> points = ((OptionsProfitAndLossSegment) it.next()).getPoints();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
                for (OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint : points) {
                    arrayList3.add(new Point(optionsSimulatedReturnChartPoint.getX(), optionsSimulatedReturnChartPoint.getY()));
                }
                CollectionsKt.addAll(arrayList2, arrayList3);
            }
            LinearGradientColor linearGradientColor = null;
            arrayList.add(new Line(arrayList2, Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), linearGradientColor, DrawScope3.INSTANCE, null, null, 52, null));
        }
        composer.endReplaceGroup();
        ImmutableList<List<OptionsProfitAndLossSegment>> negativeAreas = this.chartData.getNegativeAreas();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(negativeAreas, 10));
        for (List<OptionsProfitAndLossSegment> list2 : negativeAreas) {
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                List<OptionsSimulatedReturnChartPoint> points2 = ((OptionsProfitAndLossSegment) it2.next()).getPoints();
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points2, 10));
                for (OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint2 : points2) {
                    arrayList6.add(new Point(optionsSimulatedReturnChartPoint2.getX(), optionsSimulatedReturnChartPoint2.getY()));
                }
                CollectionsKt.addAll(arrayList5, arrayList6);
            }
            LinearGradientColor linearGradientColor2 = null;
            arrayList4.add(new Line(arrayList5, Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), linearGradientColor2, DrawScope3.INSTANCE, null, null, 52, null));
        }
        List<ChartAnnotation> listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listPlus;
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public List<Overlays> getOverlays(Composer composer, int i) {
        composer.startReplaceGroup(1023034732);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1023034732, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getOverlays (OptionsProfitAndLossChartViewState.kt:328)");
        }
        int i2 = i & 14;
        List<Overlays> listPlus = CollectionsKt.plus((Collection) CollectionsKt.listOfNotNull((Object[]) new Overlays[]{getUnderlyingLine(composer, i2), getScrubLine(composer, i2)}), (Iterable) getPointsOfInterestDots(composer, i2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listPlus;
    }

    private final Overlays getScrubLine(Composer composer, int i) {
        composer.startReplaceGroup(37909680);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(37909680, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getScrubLine (OptionsProfitAndLossChartViewState.kt:333)");
        }
        OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint = this.scrubbedDataPoint;
        if (optionsSimulatedReturnChartPoint == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        Overlays overlays = new Overlays(new OverlayPosition(new Point(optionsSimulatedReturnChartPoint.getX(), 0.0f), OverlayPosition.HorizontalAlignment.CENTER, OverlayPosition.VerticalAlignment.BOTTOM), false, false, ComposableLambda3.rememberComposableLambda(-2115830960, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getScrubLine.1
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
                    ComposerKt.traceEventStart(-2115830960, i2, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getScrubLine.<anonymous> (OptionsProfitAndLossChartViewState.kt:343)");
                }
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null), OptionsSimulatedChartUtils.getPreTradeScrubColor(OptionsProfitAndLossChartViewState.this.getScrubState(), composer2, 0), null, 2, null), composer2, 0);
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

    private final Overlays getUnderlyingLine(Composer composer, int i) {
        composer.startReplaceGroup(1954464686);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1954464686, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getUnderlyingLine (OptionsProfitAndLossChartViewState.kt:353)");
        }
        Float underlyingX = this.chartData.getUnderlyingX();
        if (underlyingX == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        Overlays overlays = new Overlays(new OverlayPosition(new Point(underlyingX.floatValue(), 0.0f), OverlayPosition.HorizontalAlignment.CENTER, OverlayPosition.VerticalAlignment.BOTTOM), false, false, OptionsProfitAndLossChartViewState2.INSTANCE.getLambda$1934188814$lib_options_simulated_return_externalDebug(), 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return overlays;
    }

    private final ImmutableList<Overlays> getPointsOfInterestDots(Composer composer, int i) {
        final long jM21425getFg0d7_KjU;
        Tuples2 tuples2M3642to;
        composer.startReplaceGroup(1538173227);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1538173227, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getPointsOfInterestDots (OptionsProfitAndLossChartViewState.kt:372)");
        }
        if (this.chartData.getPointsOfInterest().isEmpty()) {
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return immutableList3PersistentListOf;
        }
        ImmutableList<OptionsSimulatedReturnChartPoint> pointsOfInterest = this.chartData.getPointsOfInterest();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pointsOfInterest, 10));
        for (OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint : pointsOfInterest) {
            BigDecimal yValue = optionsSimulatedReturnChartPoint.getYValue();
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (yValue.compareTo(bigDecimal) > 0) {
                composer.startReplaceGroup(557697684);
                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                composer.endReplaceGroup();
            } else if (optionsSimulatedReturnChartPoint.getYValue().compareTo(bigDecimal) < 0) {
                composer.startReplaceGroup(557700148);
                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(557701774);
                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            }
            OverlayPosition overlayPosition = new OverlayPosition(new Point(optionsSimulatedReturnChartPoint.getX(), optionsSimulatedReturnChartPoint.getY()), OverlayPosition.HorizontalAlignment.CENTER, OverlayPosition.VerticalAlignment.CENTER);
            OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint2 = this.scrubbedDataPoint;
            if (Intrinsics.areEqual(optionsSimulatedReturnChartPoint2 != null ? Float.valueOf(optionsSimulatedReturnChartPoint2.getX()) : null, optionsSimulatedReturnChartPoint.getX())) {
                tuples2M3642to = Tuples4.m3642to(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(10)), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl((float) 7.5d)));
            } else {
                tuples2M3642to = Tuples4.m3642to(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl((float) 7.5d)), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(6)));
            }
            final float value = ((C2002Dp) tuples2M3642to.component1()).getValue();
            final float value2 = ((C2002Dp) tuples2M3642to.component2()).getValue();
            arrayList.add(new Overlays(overlayPosition, false, false, ComposableLambda3.rememberComposableLambda(521788716, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState$getPointsOfInterestDots$1$1
                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(521788716, i2, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getPointsOfInterestDots.<anonymous>.<anonymous> (OptionsProfitAndLossChartViewState.kt:394)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer2, i3).m21595getXsmallD9Ej5fM()), value), bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU(), RoundedCornerShape2.getCircleShape());
                    float f = value2;
                    long j = jM21425getFg0d7_KjU;
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
                    BoxKt.Box(BoxScopeInstance.INSTANCE.align(Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(companion, f), j, RoundedCornerShape2.getCircleShape()), companion2.getCenter()), composer2, 0);
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
            }, composer, 54), 6, null));
        }
        ImmutableList<Overlays> immutableList = extensions2.toImmutableList(arrayList);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return immutableList;
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public OptionsSimulatedReturnChartAxisModel getXAxis(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(-1854824042);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1854824042, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getXAxis (OptionsProfitAndLossChartViewState.kt:412)");
        }
        OptionsSimulatedReturnChartAxisModel optionsSimulatedReturnChartAxisModel = new OptionsSimulatedReturnChartAxisModel(OptionsSimulatedReturnChartAxis.f4730X, OptionsProfitAndLossChartViewState5.createOptionsProfitAndLossChartXAxisLabels(this.chartData.getXAxisData(), z, composer, ((i << 3) & 112) | SimulatedReturnsGridLine.$stable));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return optionsSimulatedReturnChartAxisModel;
    }

    @Override // com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartViewState
    public OptionsSimulatedReturnChartAxisModel getYAxis(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(255867317);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(255867317, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState.getYAxis (OptionsProfitAndLossChartViewState.kt:420)");
        }
        OptionsSimulatedReturnChartAxisModel optionsSimulatedReturnChartAxisModel = new OptionsSimulatedReturnChartAxisModel(OptionsSimulatedReturnChartAxis.f4731Y, OptionsProfitAndLossChartViewState5.createOptionsProfitAndLossChartYAxisLabels(this.chartData.getYAxisData(), z, composer, ((i << 3) & 112) | SimulatedReturnsGridLine.$stable));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return optionsSimulatedReturnChartAxisModel;
    }
}
