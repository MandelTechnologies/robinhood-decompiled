package com.robinhood.android.futures.detail.p140ui.chart;

import android.content.Context;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.candlestick.CandlestickLegendChart;
import com.robinhood.android.charts.candlestick.UtilKt;
import com.robinhood.android.charts.model.LegendItem;
import com.robinhood.android.charts.span.ChartDisplaySpanExtensions;
import com.robinhood.android.charts.span.SpanSelectorTrailingButton;
import com.robinhood.android.charts.span.UnifiedSpan;
import com.robinhood.android.charts.span.UnifiedSpanSelectorKt;
import com.robinhood.android.charts.span.UnifiedSpanSelectorState;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.extensions.ScrubDatas;
import com.robinhood.android.futures.detail.extensions.StringResources2;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartDuxo2;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartViewState;
import com.robinhood.android.futures.sharedfuturesui.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.futures.charts.contracts.models.ScrubData;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.store.futures.ChartType;
import com.robinhood.utils.Either2;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FuturesDetailChartSection.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a|\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0003¢\u0006\u0002\u0010\u001a\u001am\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010 2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010$\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006%²\u0006\u0012\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'X\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u0004\u0018\u00010 X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\f\u0010-\u001a\u0004\u0018\u00010.X\u008a\u008e\u0002²\u0006\f\u0010/\u001a\u0004\u0018\u00010 X\u008a\u008e\u0002"}, m3636d2 = {"CHART_LINE_REVEAL_ANIMATION_DURATION_IN_MILLIS", "", "FuturesDetailChartSection", "", "contractSelectorText", "Lcom/robinhood/utils/resource/StringResource;", "productName", "isFtuxChartEducationInProgress", "", "callbacks", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartCallbacks;", "onOpenContractsSelector", "Lkotlin/Function0;", "onOpenAdvancedChart", "Lkotlin/Function1;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "contractId", "onError", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartCallbacks;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChartSettingsButton", "onClick", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DefaultChartHeader", "shouldAddScrimOverlayToChartComponents", "activeCursorData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "scrubDisplayOverride", "", "showBidAsk", "bid", "ask", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/models/serverdriven/experimental/api/CursorData;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-futures-detail_externalDebug", "eventState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/futures/detail/ui/chart/ChartEvent;", "toastMsg", "viewState", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState;", "headerHeight", "savedScrubbedPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "savedScrubDisplayOverride"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FuturesDetailChartSectionKt {
    private static final int CHART_LINE_REVEAL_ANIMATION_DURATION_IN_MILLIS = 1000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartSettingsButton$lambda$33(Function0 function0, int i, Composer composer, int i2) {
        ChartSettingsButton(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultChartHeader$lambda$42(StringResource stringResource, StringResource stringResource2, boolean z, CursorData cursorData, String str, boolean z2, String str2, String str3, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DefaultChartHeader(stringResource, stringResource2, z, cursorData, str, z2, str2, str3, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailChartSection$lambda$32(StringResource stringResource, StringResource stringResource2, boolean z, FuturesDetailChartCallbacks futuresDetailChartCallbacks, Function0 function0, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesDetailChartSection(stringResource, stringResource2, z, futuresDetailChartCallbacks, function0, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final Event<FuturesDetailChartDuxo2> FuturesDetailChartSection$lambda$0(SnapshotState4<Event<FuturesDetailChartDuxo2>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final String FuturesDetailChartSection$lambda$3(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final Point FuturesDetailChartSection$lambda$31$lambda$12(SnapshotState<Point> snapshotState) {
        return snapshotState.getValue();
    }

    private static final String FuturesDetailChartSection$lambda$31$lambda$15(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesDetailChartViewState FuturesDetailChartSection$lambda$7(SnapshotState4<FuturesDetailChartViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05bb A[LOOP:1: B:226:0x05b5->B:228:0x05bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012a  */
    /* JADX WARN: Type inference failed for: r16v10, types: [com.robinhood.models.serverdriven.experimental.api.Chart] */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6, types: [androidx.compose.animation.core.AnimationSpec] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesDetailChartSection(final StringResource contractSelectorText, final StringResource productName, final boolean z, final FuturesDetailChartCallbacks callbacks, final Function0<Unit> onOpenContractsSelector, Function1<? super UUID, Unit> function1, final Function1<? super Throwable, Unit> onError, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Event<FuturesDetailChartDuxo2> eventFuturesDetailChartSection$lambda$0;
        Object objRememberedValue;
        Composer.Companion companion;
        final Event<FuturesDetailChartDuxo2> eventFuturesDetailChartSection$lambda$02;
        String strFuturesDetailChartSection$lambda$3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue2;
        Object objRememberedValue3;
        int i4;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object objRememberedValue4;
        List<ChartLegendItem> legendList;
        SnapshotState snapshotState;
        CursorData cursorData;
        FuturesDetailChartViewState.ChartData chartData;
        SnapshotState4 snapshotState4;
        String bid;
        Object objRememberedValue5;
        SnapshotState4 snapshotState42;
        int i5;
        Modifier modifier3;
        SnapshotState snapshotState2;
        Easing easing;
        int i6;
        final SnapshotState4 snapshotState43;
        boolean zChanged;
        Object objRememberedValue6;
        int i7;
        Object objRememberedValue7;
        final Modifier modifier4;
        FuturesDetailChartViewState.ChartData chartData2;
        Chart<Parcelable> chart;
        Map<String, List<ChartLegendItem>> legend_data;
        EventConsumer<FuturesDetailChartDuxo2> eventConsumerInvoke;
        EventConsumer<FuturesDetailChartDuxo2> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function1<? super UUID, Unit> onOpenAdvancedChart = function1;
        Intrinsics.checkNotNullParameter(contractSelectorText, "contractSelectorText");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(onOpenContractsSelector, "onOpenContractsSelector");
        Intrinsics.checkNotNullParameter(onOpenAdvancedChart, "onOpenAdvancedChart");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1567748289);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(contractSelectorText) : composerStartRestartGroup.changedInstance(contractSelectorText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(productName) : composerStartRestartGroup.changedInstance(productName) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOpenContractsSelector) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOpenAdvancedChart) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onError) ? 1048576 : 524288;
        }
        int i8 = i2 & 128;
        if (i8 == 0) {
            if ((12582912 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1567748289, i3, -1, "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSection (FuturesDetailChartSection.kt:86)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(callbacks.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                eventFuturesDetailChartSection$lambda$0 = FuturesDetailChartSection$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventFuturesDetailChartSection$lambda$0 != null) {
                    if ((eventFuturesDetailChartSection$lambda$0.getData() instanceof FuturesDetailChartDuxo2.Error) && (eventConsumerInvoke2 = eventFuturesDetailChartSection$lambda$0.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventFuturesDetailChartSection$lambda$0, new Function1() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$FuturesDetailChartSection$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m14589invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m14589invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                onError.invoke(((FuturesDetailChartDuxo2.Error) eventFuturesDetailChartSection$lambda$0.getData()).getError());
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                eventFuturesDetailChartSection$lambda$02 = FuturesDetailChartSection$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventFuturesDetailChartSection$lambda$02 != null) {
                    if ((eventFuturesDetailChartSection$lambda$02.getData() instanceof FuturesDetailChartDuxo2.Toast) && (eventConsumerInvoke = eventFuturesDetailChartSection$lambda$02.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventFuturesDetailChartSection$lambda$02, new Function1() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$FuturesDetailChartSection$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m14590invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m14590invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                snapshotState3.setValue(((FuturesDetailChartDuxo2.Toast) eventFuturesDetailChartSection$lambda$02.getData()).getMsg());
                            }
                        });
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                strFuturesDetailChartSection$lambda$3 = FuturesDetailChartSection$lambda$3(snapshotState3);
                composerStartRestartGroup.startReplaceGroup(927438358);
                if (strFuturesDetailChartSection$lambda$3 != null) {
                    Toast.makeText((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), strFuturesDetailChartSection$lambda$3, 0).show();
                    snapshotState3.setValue(null);
                    Unit unit3 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(callbacks.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 != companion.getEmpty()) {
                    i4 = 2;
                    snapshotMutationPolicy = null;
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    i4 = 2;
                    snapshotMutationPolicy = null;
                }
                SnapshotState snapshotState5 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i4, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                SnapshotState snapshotState6 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Point pointFuturesDetailChartSection$lambda$31$lambda$12 = FuturesDetailChartSection$lambda$31$lambda$12(snapshotState5);
                legendList = (pointFuturesDetailChartSection$lambda$31$lambda$12 != null || (chartData2 = FuturesDetailChartSection$lambda$7(snapshotState4CollectAsStateWithLifecycle2).getChartData()) == null || (chart = chartData2.getChart()) == null || (legend_data = chart.getLegend_data()) == null) ? null : UtilKt.getLegendList(legend_data, pointFuturesDetailChartSection$lambda$31$lambda$12);
                if (legendList == null) {
                    composerStartRestartGroup.startReplaceGroup(-1153491184);
                    snapshotState = snapshotState5;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(snapshotIntState2.getIntValue()), 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(505540685);
                    List<ChartLegendItem> list = legendList;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (ChartLegendItem chartLegendItem : list) {
                        ThemedColor color = chartLegendItem.getColor();
                        composerStartRestartGroup.startReplaceGroup(505544038);
                        Color composeColor = color == null ? null : SduiColors2.toComposeColor(color, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        String title = chartLegendItem.getTitle();
                        Color composeColor2 = SduiColors2.toComposeColor(chartLegendItem.getValue_color(), composerStartRestartGroup, 0);
                        Intrinsics.checkNotNull(composeColor2);
                        arrayList.add(new LegendItem(chartLegendItem.getId(), composeColor, title, chartLegendItem.getValue(), composeColor2.getValue(), null, 32, null));
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    CandlestickLegendChart.CandlestickLegendChart(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM(), 0.0f, 2, null), bentoTheme.getTypography(composerStartRestartGroup, i9).getTextM(), arrayList, 0, composerStartRestartGroup, 0, 8);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState42 = snapshotState4CollectAsStateWithLifecycle2;
                    i5 = i3;
                    modifier3 = modifier5;
                    easing = null;
                    snapshotState2 = snapshotState6;
                    i6 = 0;
                } else {
                    snapshotState = snapshotState5;
                    composerStartRestartGroup.startReplaceGroup(-1152475593);
                    Point pointFuturesDetailChartSection$lambda$31$lambda$122 = FuturesDetailChartSection$lambda$31$lambda$12(snapshotState);
                    CursorData cursor_data = pointFuturesDetailChartSection$lambda$31$lambda$122 != null ? pointFuturesDetailChartSection$lambda$31$lambda$122.getCursor_data() : null;
                    composerStartRestartGroup.startReplaceGroup(-1007000382);
                    if (cursor_data != null) {
                        cursorData = cursor_data;
                        composerStartRestartGroup.endReplaceGroup();
                        String strFuturesDetailChartSection$lambda$31$lambda$15 = FuturesDetailChartSection$lambda$31$lambda$15(snapshotState6);
                        boolean z2 = FuturesDetailChartSection$lambda$31$lambda$12(snapshotState) == null;
                        chartData = FuturesDetailChartSection$lambda$7(snapshotState4CollectAsStateWithLifecycle2).getChartData();
                        if (chartData != null) {
                            bid = chartData.getBid();
                            snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        } else {
                            snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                            bid = null;
                        }
                        FuturesDetailChartViewState.ChartData chartData3 = FuturesDetailChartSection$lambda$7(snapshotState4).getChartData();
                        String ask = chartData3 != null ? chartData3.getAsk() : null;
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return FuturesDetailChartSectionKt.FuturesDetailChartSection$lambda$31$lambda$22$lambda$21(snapshotIntState2, (LayoutCoordinates) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(OnGloballyPositionedModifier3.onGloballyPositioned(companion4, (Function1) objRememberedValue5), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 7, null);
                        int i10 = StringResource.$stable;
                        snapshotState42 = snapshotState4;
                        i5 = i3;
                        modifier3 = modifier5;
                        snapshotState2 = snapshotState6;
                        easing = null;
                        i6 = 0;
                        DefaultChartHeader(contractSelectorText, productName, z, cursorData, strFuturesDetailChartSection$lambda$31$lambda$15, z2, bid, ask, onOpenContractsSelector, modifierM5146paddingqDBjuR0$default2, composerStartRestartGroup, ((i3 << 12) & 234881024) | (i10 << 3) | (i3 & 14) | i10 | (i3 & 112) | (i3 & 896), 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        FuturesDetailChartViewState.ChartData chartData4 = FuturesDetailChartSection$lambda$7(snapshotState4CollectAsStateWithLifecycle2).getChartData();
                        FuturesDetailChartViewState.ChartData.CurrentCursorData currentCursorData = chartData4 != null ? chartData4.getCurrentCursorData() : null;
                        if (currentCursorData == null) {
                            cursorData = null;
                            composerStartRestartGroup.endReplaceGroup();
                            String strFuturesDetailChartSection$lambda$31$lambda$152 = FuturesDetailChartSection$lambda$31$lambda$15(snapshotState6);
                            if (FuturesDetailChartSection$lambda$31$lambda$12(snapshotState) == null) {
                            }
                            chartData = FuturesDetailChartSection$lambda$7(snapshotState4CollectAsStateWithLifecycle2).getChartData();
                            if (chartData != null) {
                            }
                            FuturesDetailChartViewState.ChartData chartData32 = FuturesDetailChartSection$lambda$7(snapshotState4).getChartData();
                            if (chartData32 != null) {
                            }
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM5146paddingqDBjuR0$default22 = PaddingKt.m5146paddingqDBjuR0$default(OnGloballyPositionedModifier3.onGloballyPositioned(companion42, (Function1) objRememberedValue5), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 7, null);
                            int i102 = StringResource.$stable;
                            snapshotState42 = snapshotState4;
                            i5 = i3;
                            modifier3 = modifier5;
                            snapshotState2 = snapshotState6;
                            easing = null;
                            i6 = 0;
                            DefaultChartHeader(contractSelectorText, productName, z, cursorData, strFuturesDetailChartSection$lambda$31$lambda$152, z2, bid, ask, onOpenContractsSelector, modifierM5146paddingqDBjuR0$default22, composerStartRestartGroup, ((i3 << 12) & 234881024) | (i102 << 3) | (i3 & 14) | i102 | (i3 & 112) | (i3 & 896), 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            cursor_data = FuturesDetailChartViewState.ChartData.CurrentCursorData.INSTANCE.toCursorData(currentCursorData, composerStartRestartGroup, 48);
                            cursorData = cursor_data;
                            composerStartRestartGroup.endReplaceGroup();
                            String strFuturesDetailChartSection$lambda$31$lambda$1522 = FuturesDetailChartSection$lambda$31$lambda$15(snapshotState6);
                            if (FuturesDetailChartSection$lambda$31$lambda$12(snapshotState) == null) {
                            }
                            chartData = FuturesDetailChartSection$lambda$7(snapshotState4CollectAsStateWithLifecycle2).getChartData();
                            if (chartData != null) {
                            }
                            FuturesDetailChartViewState.ChartData chartData322 = FuturesDetailChartSection$lambda$7(snapshotState4).getChartData();
                            if (chartData322 != null) {
                            }
                            Modifier.Companion companion422 = Modifier.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM5146paddingqDBjuR0$default222 = PaddingKt.m5146paddingqDBjuR0$default(OnGloballyPositionedModifier3.onGloballyPositioned(companion422, (Function1) objRememberedValue5), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 7, null);
                            int i1022 = StringResource.$stable;
                            snapshotState42 = snapshotState4;
                            i5 = i3;
                            modifier3 = modifier5;
                            snapshotState2 = snapshotState6;
                            easing = null;
                            i6 = 0;
                            DefaultChartHeader(contractSelectorText, productName, z, cursorData, strFuturesDetailChartSection$lambda$31$lambda$1522, z2, bid, ask, onOpenContractsSelector, modifierM5146paddingqDBjuR0$default222, composerStartRestartGroup, ((i3 << 12) & 234881024) | (i1022 << 3) | (i3 & 14) | i1022 | (i3 & 112) | (i3 & 896), 0);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                    }
                }
                FuturesDetailChartViewState.ChartData chartData5 = FuturesDetailChartSection$lambda$7(snapshotState42).getChartData();
                ?? chart2 = chartData5 == null ? chartData5.getChart() : easing;
                Point pointFuturesDetailChartSection$lambda$31$lambda$123 = FuturesDetailChartSection$lambda$31$lambda$12(snapshotState);
                ChartType currentChartType = FuturesDetailChartSection$lambda$7(snapshotState42).getCurrentChartType();
                ?? Tween$default = !z ? AnimationSpecKt.tween$default(1000, i6, easing, 6, easing) : easing;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                snapshotState43 = snapshotState42;
                zChanged = composerStartRestartGroup.changed(snapshotState43);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    final SnapshotState snapshotState7 = snapshotState;
                    final SnapshotState snapshotState8 = snapshotState2;
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FuturesDetailChartSectionKt.FuturesDetailChartSection$lambda$31$lambda$25$lambda$24(snapshotState7, snapshotState43, snapshotState8, (Point) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                FuturesDetailChart.FuturesDetailChart(chart2, pointFuturesDetailChartSection$lambda$31$lambda$123, currentChartType, Tween$default, (Function1) objRememberedValue6, null, composerStartRestartGroup, 0, 32);
                composerStartRestartGroup.startReplaceGroup(-1006950951);
                ImmutableList<DisplaySpan> futuresDisplaySpans = FuturesDetailChartViewState.INSTANCE.getFuturesDisplaySpans();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(futuresDisplaySpans, 10));
                for (DisplaySpan displaySpan : futuresDisplaySpans) {
                    arrayList2.add(new UnifiedSpan(displaySpan, StringResources_androidKt.stringResource(ChartDisplaySpanExtensions.getStringRes(displaySpan), composerStartRestartGroup, i6), false, false, ChartDisplaySpanExtensions.getEducationTourId(displaySpan), null, 40, null));
                }
                composerStartRestartGroup.endReplaceGroup();
                ImmutableList immutableList = extensions2.toImmutableList(arrayList2);
                DisplaySpan currentDisplaySpan = FuturesDetailChartSection$lambda$7(snapshotState43).getCurrentDisplaySpan();
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i11 = i5;
                int i12 = i11 & 7168;
                i7 = (i12 != 2048 || ((i11 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks))) ? 1 : i6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (i7 == 0 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new FuturesDetailChartSectionKt$FuturesDetailChartSection$4$6$1(callbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                onOpenAdvancedChart = function1;
                UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(new UnifiedSpanSelectorState(immutableList, currentDisplaySpan, (Function1) ((KFunction) objRememberedValue7), false, null, true, 0.0f, 80, null), ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), z, null, null, 6, null), null, Boolean.valueOf(FuturesDetailChartSection$lambda$7(snapshotState43).getShowAdvancedChartButton()), null, ComposableLambda3.rememberComposableLambda(-411164507, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$FuturesDetailChartSection$4$7
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                        invoke(row5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 UnifiedDynamicSpanSelector, Composer composer2, int i13) {
                        Intrinsics.checkNotNullParameter(UnifiedDynamicSpanSelector, "$this$UnifiedDynamicSpanSelector");
                        if ((i13 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-411164507, i13, -1, "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSection.<anonymous>.<anonymous> (FuturesDetailChartSection.kt:190)");
                        }
                        if (FuturesDetailChartSectionKt.FuturesDetailChartSection$lambda$7(snapshotState43).getShowAdvancedChartButton()) {
                            FuturesDetailChartCallbacks futuresDetailChartCallbacks = callbacks;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer2.changedInstance(futuresDetailChartCallbacks);
                            Object objRememberedValue8 = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue8 = new FuturesDetailChartSectionKt$FuturesDetailChartSection$4$7$1$1(futuresDetailChartCallbacks);
                                composer2.updateRememberedValue(objRememberedValue8);
                            }
                            composer2.endReplaceGroup();
                            FuturesDetailChartSectionKt.ChartSettingsButton((Function0) ((KFunction) objRememberedValue8), composer2, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1678160422, true, new FuturesDetailChartSectionKt$FuturesDetailChartSection$4$8(snapshotState43, callbacks, onOpenAdvancedChart), composerStartRestartGroup, 54), composerStartRestartGroup, UnifiedSpanSelectorState.$stable | 1769472, 20);
                composerStartRestartGroup.startReplaceGroup(-1006896030);
                if (FuturesDetailChartSection$lambda$7(snapshotState43).getChartSettingsVisible()) {
                    ChartType currentChartType2 = FuturesDetailChartSection$lambda$7(snapshotState43).getCurrentChartType();
                    boolean showContinuousChartToggle = FuturesDetailChartSection$lambda$7(snapshotState43).getShowContinuousChartToggle();
                    boolean zIsContinuousChart = FuturesDetailChartSection$lambda$7(snapshotState43).isContinuousChart();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i13 = (i12 == 2048 || ((i11 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks))) ? 1 : i6;
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (i13 != 0 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new FuturesDetailChartSectionKt$FuturesDetailChartSection$4$9$1(callbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function1 function12 = (Function1) ((KFunction) objRememberedValue8);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i14 = (i12 == 2048 || ((i11 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks))) ? 1 : i6;
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (i14 != 0 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new FuturesDetailChartSectionKt$FuturesDetailChartSection$4$10$1(callbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function1 function13 = (Function1) ((KFunction) objRememberedValue9);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i15 = (i12 == 2048 || ((i11 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks))) ? 1 : i6;
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (i15 != 0 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new FuturesDetailChartSectionKt$FuturesDetailChartSection$4$11$1(callbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ChartSettingsBottomSheetKt.ChartSettingsBottomSheet(currentChartType2, showContinuousChartToggle, zIsContinuousChart, function12, function13, (Function0) ((KFunction) objRememberedValue10), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function1<? super UUID, Unit> function14 = onOpenAdvancedChart;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesDetailChartSectionKt.FuturesDetailChartSection$lambda$32(contractSelectorText, productName, z, callbacks, onOpenContractsSelector, function14, onError, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 12582912;
        modifier2 = modifier;
        if ((i3 & 4793491) == 4793490) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(callbacks.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            eventFuturesDetailChartSection$lambda$0 = FuturesDetailChartSection$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
            if (eventFuturesDetailChartSection$lambda$0 != null) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState32 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            eventFuturesDetailChartSection$lambda$02 = FuturesDetailChartSection$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
            if (eventFuturesDetailChartSection$lambda$02 != null) {
            }
            strFuturesDetailChartSection$lambda$3 = FuturesDetailChartSection$lambda$3(snapshotState32);
            composerStartRestartGroup.startReplaceGroup(927438358);
            if (strFuturesDetailChartSection$lambda$3 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(callbacks.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 != companion.getEmpty()) {
                }
                SnapshotState snapshotState52 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                SnapshotState snapshotState62 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Point pointFuturesDetailChartSection$lambda$31$lambda$124 = FuturesDetailChartSection$lambda$31$lambda$12(snapshotState52);
                if (pointFuturesDetailChartSection$lambda$31$lambda$124 != null) {
                    if (legendList == null) {
                    }
                    FuturesDetailChartViewState.ChartData chartData52 = FuturesDetailChartSection$lambda$7(snapshotState42).getChartData();
                    if (chartData52 == null) {
                    }
                    Point pointFuturesDetailChartSection$lambda$31$lambda$1232 = FuturesDetailChartSection$lambda$31$lambda$12(snapshotState);
                    ChartType currentChartType3 = FuturesDetailChartSection$lambda$7(snapshotState42).getCurrentChartType();
                    if (!z) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    snapshotState43 = snapshotState42;
                    zChanged = composerStartRestartGroup.changed(snapshotState43);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        final SnapshotState snapshotState72 = snapshotState;
                        final SnapshotState snapshotState82 = snapshotState2;
                        objRememberedValue6 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FuturesDetailChartSectionKt.FuturesDetailChartSection$lambda$31$lambda$25$lambda$24(snapshotState72, snapshotState43, snapshotState82, (Point) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        composerStartRestartGroup.endReplaceGroup();
                        FuturesDetailChart.FuturesDetailChart(chart2, pointFuturesDetailChartSection$lambda$31$lambda$1232, currentChartType3, Tween$default, (Function1) objRememberedValue6, null, composerStartRestartGroup, 0, 32);
                        composerStartRestartGroup.startReplaceGroup(-1006950951);
                        ImmutableList<DisplaySpan> futuresDisplaySpans2 = FuturesDetailChartViewState.INSTANCE.getFuturesDisplaySpans();
                        ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(futuresDisplaySpans2, 10));
                        while (r0.hasNext()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ImmutableList immutableList2 = extensions2.toImmutableList(arrayList22);
                        DisplaySpan currentDisplaySpan2 = FuturesDetailChartSection$lambda$7(snapshotState43).getCurrentDisplaySpan();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        int i112 = i5;
                        int i122 = i112 & 7168;
                        if (i122 != 2048) {
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (i7 == 0) {
                                objRememberedValue7 = new FuturesDetailChartSectionKt$FuturesDetailChartSection$4$6$1(callbacks);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                composerStartRestartGroup.endReplaceGroup();
                                onOpenAdvancedChart = function1;
                                UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(new UnifiedSpanSelectorState(immutableList2, currentDisplaySpan2, (Function1) ((KFunction) objRememberedValue7), false, null, true, 0.0f, 80, null), ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), z, null, null, 6, null), null, Boolean.valueOf(FuturesDetailChartSection$lambda$7(snapshotState43).getShowAdvancedChartButton()), null, ComposableLambda3.rememberComposableLambda(-411164507, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$FuturesDetailChartSection$4$7
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                                        invoke(row5, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 UnifiedDynamicSpanSelector, Composer composer2, int i132) {
                                        Intrinsics.checkNotNullParameter(UnifiedDynamicSpanSelector, "$this$UnifiedDynamicSpanSelector");
                                        if ((i132 & 17) == 16 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-411164507, i132, -1, "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSection.<anonymous>.<anonymous> (FuturesDetailChartSection.kt:190)");
                                        }
                                        if (FuturesDetailChartSectionKt.FuturesDetailChartSection$lambda$7(snapshotState43).getShowAdvancedChartButton()) {
                                            FuturesDetailChartCallbacks futuresDetailChartCallbacks = callbacks;
                                            composer2.startReplaceGroup(5004770);
                                            boolean zChangedInstance = composer2.changedInstance(futuresDetailChartCallbacks);
                                            Object objRememberedValue82 = composer2.rememberedValue();
                                            if (zChangedInstance || objRememberedValue82 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue82 = new FuturesDetailChartSectionKt$FuturesDetailChartSection$4$7$1$1(futuresDetailChartCallbacks);
                                                composer2.updateRememberedValue(objRememberedValue82);
                                            }
                                            composer2.endReplaceGroup();
                                            FuturesDetailChartSectionKt.ChartSettingsButton((Function0) ((KFunction) objRememberedValue82), composer2, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1678160422, true, new FuturesDetailChartSectionKt$FuturesDetailChartSection$4$8(snapshotState43, callbacks, onOpenAdvancedChart), composerStartRestartGroup, 54), composerStartRestartGroup, UnifiedSpanSelectorState.$stable | 1769472, 20);
                                composerStartRestartGroup.startReplaceGroup(-1006896030);
                                if (FuturesDetailChartSection$lambda$7(snapshotState43).getChartSettingsVisible()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier3;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailChartSection$lambda$31$lambda$22$lambda$21(SnapshotIntState2 snapshotIntState2, LayoutCoordinates coords) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        snapshotIntState2.setIntValue((int) (coords.mo7241getSizeYbymL2g() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailChartSection$lambda$31$lambda$25$lambda$24(SnapshotState snapshotState, SnapshotState4 snapshotState4, SnapshotState snapshotState2, Point point) {
        snapshotState.setValue(point);
        String scrubDisplay = null;
        if (point != null) {
            float x = point.getX();
            ImmutableList3<ScrubData> scrubData = FuturesDetailChartSection$lambda$7(snapshotState4).getScrubData();
            if (scrubData != null) {
                scrubDisplay = ScrubDatas.getScrubDisplay(scrubData, x);
            }
        }
        snapshotState2.setValue(scrubDisplay);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartSettingsButton(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1512862888);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1512862888, i2, -1, "com.robinhood.android.futures.detail.ui.chart.ChartSettingsButton (FuturesDetailChartSection.kt:232)");
            }
            UnifiedSpanSelectorKt.UnifiedSpanSelectorTrailingButton(new SpanSelectorTrailingButton(Either2.asLeft(new BentoIcon4.Size16(ServerToBentoAssetMapper2.SETTINGS_16)), StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_settings_title, composerStartRestartGroup, 0), function0), null, composerStartRestartGroup, SpanSelectorTrailingButton.$stable, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesDetailChartSectionKt.ChartSettingsButton$lambda$33(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DefaultChartHeader(final StringResource contractSelectorText, final StringResource productName, final boolean z, final CursorData cursorData, final String str, final boolean z2, final String str2, final String str3, final Function0<Unit> onOpenContractsSelector, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String str4;
        final boolean z3;
        final String str5;
        final String str6;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        final Measurer2 measurer2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotState snapshotState;
        Object objRememberedValue4;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue5;
        final SnapshotState snapshotState2;
        final int i5;
        boolean zChanged;
        Object objRememberedValue6;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState3;
        Object objRememberedValue7;
        boolean zChangedInstance;
        Object objRememberedValue8;
        Composer composer2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(contractSelectorText, "contractSelectorText");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(onOpenContractsSelector, "onOpenContractsSelector");
        Composer composerStartRestartGroup = composer.startRestartGroup(1232101771);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(contractSelectorText) : composerStartRestartGroup.changedInstance(contractSelectorText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(productName) : composerStartRestartGroup.changedInstance(productName) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(cursorData) ? 2048 : 1024;
                }
                if ((i2 & 16) == 0) {
                    if ((i & 24576) == 0) {
                        str4 = str;
                        i3 |= composerStartRestartGroup.changed(str4) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                        z3 = z2;
                    } else {
                        z3 = z2;
                        if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                        }
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                        str5 = str2;
                    } else {
                        str5 = str2;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(str5) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                        str6 = str3;
                    } else {
                        str6 = str3;
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changed(str6) ? 8388608 : 4194304;
                        }
                    }
                    if ((i2 & 256) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(onOpenContractsSelector) ? 67108864 : 33554432;
                    }
                    i4 = i2 & 512;
                    if (i4 == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i3 |= composerStartRestartGroup.changed(modifier) ? 536870912 : 268435456;
                    }
                    if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1232101771, i3, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader (FuturesDetailChartSection.kt:254)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(-1003410150);
                        composerStartRestartGroup.startReplaceGroup(212064437);
                        composerStartRestartGroup.endReplaceGroup();
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Measurer2(density);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        measurer2 = (Measurer2) objRememberedValue;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ConstraintLayoutScope();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        Modifier modifier4 = modifier3;
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        snapshotState = (SnapshotState) objRememberedValue3;
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        snapshotState2 = (SnapshotState) objRememberedValue5;
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                        i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                        zChanged = zChangedInstance2 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$DefaultChartHeader$$inlined$ConstraintLayout$2
                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    snapshotState2.getValue();
                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                                    snapshotState.getValue();
                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                    final Measurer2 measurer22 = measurer2;
                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$DefaultChartHeader$$inlined$ConstraintLayout$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                            measurer22.performLayout(placementScope, list, linkedHashMap);
                                        }
                                    }, 4, null);
                                }
                            };
                            constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                            snapshotState3 = snapshotState;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                            snapshotState3 = snapshotState;
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$DefaultChartHeader$$inlined$ConstraintLayout$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    snapshotState3.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                    constraintSetForInlineDsl2.setKnownDirty(true);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        final Function0 function0 = (Function0) objRememberedValue7;
                        zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$DefaultChartHeader$$inlined$ConstraintLayout$4
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierFillMaxWidth$default, false, (Function1) objRememberedValue8, 1, null);
                        final String str7 = str4;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$DefaultChartHeader$$inlined$ConstraintLayout$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                int i7;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
                                ConstraintLayoutScope constraintLayoutScope2;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
                                int i8;
                                BentoTheme bentoTheme;
                                C17099x1454f9ae c17099x1454f9ae = this;
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState2.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
                                composer3.startReplaceGroup(-575089303);
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                                constraintLayoutScope3.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component5}, ConstraintLayoutBaseScope3.INSTANCE.getSpreadInside());
                                if (str7 != null) {
                                    composer3.startReplaceGroup(-575027552);
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    TextStyle textS = bentoTheme2.getTypography(composer3, i9).getTextS();
                                    FontWeight bold = FontWeight.INSTANCE.getBold();
                                    Modifier modifierM14735scrimGUYwDQI$default = ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5145paddingqDBjuR0(Modifier.INSTANCE, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer3, i9).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer3, i9).m21595getXsmallD9Ej5fM()), z, null, null, 6, null);
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChanged2 = composer3.changed(constraintLayoutBaseScope4Component2);
                                    Object objRememberedValue9 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue9 = new FuturesDetailChartSectionKt$DefaultChartHeader$1$1$1(constraintLayoutBaseScope4Component2);
                                        composer3.updateRememberedValue(objRememberedValue9);
                                    }
                                    composer3.endReplaceGroup();
                                    constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component3;
                                    i7 = helpersHashCode;
                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component5;
                                    BentoText2.m20747BentoText38GnDrw(str7, constraintLayoutScope3.constrainAs(modifierM14735scrimGUYwDQI$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9), null, null, bold, null, null, 0, false, 0, 0, null, 0, textS, composer3, 24576, 0, 8172);
                                    composer3.endReplaceGroup();
                                    constraintLayoutScope2 = constraintLayoutScope3;
                                    constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component1;
                                    constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component2;
                                } else {
                                    i7 = helpersHashCode;
                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component5;
                                    constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component3;
                                    composer3.startReplaceGroup(-574278344);
                                    StringResource stringResource = contractSelectorText;
                                    Function0 function02 = onOpenContractsSelector;
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                    int i10 = BentoTheme.$stable;
                                    Modifier modifierM14735scrimGUYwDQI$default2 = ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5145paddingqDBjuR0(companion2, bentoTheme3.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer3, i10).m21593getSmallD9Ej5fM(), bentoTheme3.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM()), z, null, null, 6, null);
                                    composer3.startReplaceGroup(5004770);
                                    constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component2;
                                    boolean zChanged3 = composer3.changed(constraintLayoutBaseScope43);
                                    Object objRememberedValue10 = composer3.rememberedValue();
                                    if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue10 = new FuturesDetailChartSectionKt$DefaultChartHeader$1$2$1(constraintLayoutBaseScope43);
                                        composer3.updateRememberedValue(objRememberedValue10);
                                    }
                                    composer3.endReplaceGroup();
                                    constraintLayoutScope2 = constraintLayoutScope3;
                                    constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component1;
                                    ContractHeader.ContractHeader(stringResource, function02, constraintLayoutScope2.constrainAs(modifierM14735scrimGUYwDQI$default2, constraintLayoutBaseScope44, (Function1) objRememberedValue10), composer3, StringResource.$stable, 0);
                                    composer3.endReplaceGroup();
                                }
                                String text = StringResources2.getText(productName, composer3, StringResource.$stable);
                                BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                                int i11 = BentoTheme.$stable;
                                TextStyle displayCapsuleLarge = bentoTheme4.getTypography(composer3, i11).getDisplayCapsuleLarge();
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme4.getSpacing(composer3, i11).m21592getMediumD9Ej5fM(), bentoTheme4.getSpacing(composer3, i11).m21595getXsmallD9Ej5fM(), bentoTheme4.getSpacing(composer3, i11).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                                composer3.startReplaceGroup(-1633490746);
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope45 = constraintLayoutBaseScope42;
                                boolean zChanged4 = composer3.changed(constraintLayoutBaseScope44) | composer3.changed(constraintLayoutBaseScope45);
                                Object objRememberedValue11 = composer3.rememberedValue();
                                if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new FuturesDetailChartSectionKt$DefaultChartHeader$1$3$1(constraintLayoutBaseScope44, constraintLayoutBaseScope45);
                                    composer3.updateRememberedValue(objRememberedValue11);
                                }
                                composer3.endReplaceGroup();
                                ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope2;
                                BentoText2.m20747BentoText38GnDrw(text, constraintLayoutScope2.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope43, (Function1) objRememberedValue11), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleLarge, composer3, 0, 0, 8188);
                                CompositionLocal3.CompositionLocalProvider(Styles2.getLocalStyles().provides(new C17103xd69dc07b((Styles) composer3.consume(Styles2.getLocalStyles()))), ComposableLambda3.rememberComposableLambda(55392340, true, new FuturesDetailChartSectionKt$DefaultChartHeader$1$4(constraintLayoutScope4, constraintLayoutBaseScope45, constraintLayoutBaseScope43, constraintLayoutBaseScope4Component4, cursorData, z), composer3, 54), composer3, ProvidedValue.$stable | 48);
                                Modifier modifierM14735scrimGUYwDQI$default3 = ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme4.getSpacing(composer3, i11).m21592getMediumD9Ej5fM(), 0.0f, 2, null), z, null, null, 6, null);
                                composer3.startReplaceGroup(-1633490746);
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope46 = constraintLayoutBaseScope4;
                                boolean zChanged5 = composer3.changed(constraintLayoutBaseScope45) | composer3.changed(constraintLayoutBaseScope46);
                                Object objRememberedValue12 = composer3.rememberedValue();
                                if (zChanged5 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue12 = new FuturesDetailChartSectionKt$DefaultChartHeader$1$5$1(constraintLayoutBaseScope45, constraintLayoutBaseScope46);
                                    composer3.updateRememberedValue(objRememberedValue12);
                                }
                                composer3.endReplaceGroup();
                                Modifier modifierConstrainAs = constraintLayoutScope4.constrainAs(modifierM14735scrimGUYwDQI$default3, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue12);
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierConstrainAs);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                if (z3) {
                                    composer3.startReplaceGroup(329873304);
                                    String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_bid_label, composer3, 0);
                                    long jM21426getFg20d7_KjU = bentoTheme4.getColors(composer3, i11).m21426getFg20d7_KjU();
                                    TextStyle textM = bentoTheme4.getTypography(composer3, i11).getTextM();
                                    FontWeight.Companion companion5 = FontWeight.INSTANCE;
                                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer3, 24576, 0, 8170);
                                    composer3.startReplaceGroup(-266444576);
                                    String str8 = str5;
                                    if (str8 == null) {
                                        bentoTheme = bentoTheme4;
                                        i8 = i11;
                                    } else {
                                        long jM21425getFg0d7_KjU = bentoTheme4.getColors(composer3, i11).m21425getFg0d7_KjU();
                                        i8 = i11;
                                        bentoTheme = bentoTheme4;
                                        BentoText2.m20747BentoText38GnDrw(str8, PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme4.getSpacing(composer3, i11).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer3, i11).getTextM(), composer3, 24576, 0, 8168);
                                    }
                                    composer3.endReplaceGroup();
                                    String strStringResource2 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_ask_label, composer3, 0);
                                    int i12 = i8;
                                    long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composer3, i12).m21426getFg20d7_KjU();
                                    BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composer3, i12).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM21426getFg20d7_KjU2), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i12).getTextM(), composer3, 24576, 0, 8168);
                                    String str9 = str6;
                                    if (str9 == null) {
                                        c17099x1454f9ae = this;
                                    } else {
                                        long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer3, i12).m21425getFg0d7_KjU();
                                        TextStyle textM2 = bentoTheme.getTypography(composer3, i12).getTextM();
                                        c17099x1454f9ae = this;
                                        BentoText2.m20747BentoText38GnDrw(str9, PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composer3, i12).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, textM2, composer3, 24576, 0, 8168);
                                    }
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(331292050);
                                    BentoText2.m20747BentoText38GnDrw("", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 6, 0, 16382);
                                    composer3.endReplaceGroup();
                                }
                                composer3.endNode();
                                composer3.endReplaceGroup();
                                if (constraintLayoutScope.getHelpersHashCode() != i7) {
                                    EffectsKt.SideEffect(function0, composer3, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        composer2 = composerStartRestartGroup;
                        LayoutKt.MultiMeasureLayout(modifierSemantics$default, composableLambdaRememberComposableLambda, measurePolicy, composer2, 48, 0);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return FuturesDetailChartSectionKt.DefaultChartHeader$lambda$42(contractSelectorText, productName, z, cursorData, str, z2, str2, str3, onOpenContractsSelector, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                str4 = str;
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                i4 = i2 & 512;
                if (i4 == 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1003410150);
                    composerStartRestartGroup.startReplaceGroup(212064437);
                    composerStartRestartGroup.endReplaceGroup();
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    measurer2 = (Measurer2) objRememberedValue;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    Modifier modifier42 = modifier3;
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue3;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue5;
                    boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(measurer2);
                    i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    zChanged = zChangedInstance22 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$DefaultChartHeader$$inlined$ConstraintLayout$2
                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                final Map linkedHashMap = new LinkedHashMap();
                                snapshotState2.getValue();
                                long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                                snapshotState.getValue();
                                int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                final Measurer2 measurer22 = measurer2;
                                return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$DefaultChartHeader$$inlined$ConstraintLayout$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                        measurer22.performLayout(placementScope, list, linkedHashMap);
                                    }
                                }, 4, null);
                            }
                        };
                        constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                        snapshotState3 = snapshotState;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                        }
                        final Function0 function02 = (Function0) objRememberedValue7;
                        zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$DefaultChartHeader$$inlined$ConstraintLayout$4
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifierFillMaxWidth$default2, false, (Function1) objRememberedValue8, 1, null);
                            final String str72 = str4;
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$DefaultChartHeader$$inlined$ConstraintLayout$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i6) {
                                    int i7;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
                                    ConstraintLayoutScope constraintLayoutScope22;
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
                                    int i8;
                                    BentoTheme bentoTheme;
                                    C17099x1454f9ae c17099x1454f9ae = this;
                                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                    }
                                    snapshotState2.setValue(Unit.INSTANCE);
                                    int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                    constraintLayoutScope2.reset();
                                    ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope2;
                                    composer3.startReplaceGroup(-575089303);
                                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                                    constraintLayoutScope3.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component5}, ConstraintLayoutBaseScope3.INSTANCE.getSpreadInside());
                                    if (str72 != null) {
                                        composer3.startReplaceGroup(-575027552);
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        TextStyle textS = bentoTheme2.getTypography(composer3, i9).getTextS();
                                        FontWeight bold = FontWeight.INSTANCE.getBold();
                                        Modifier modifierM14735scrimGUYwDQI$default = ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5145paddingqDBjuR0(Modifier.INSTANCE, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer3, i9).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer3, i9).m21595getXsmallD9Ej5fM()), z, null, null, 6, null);
                                        composer3.startReplaceGroup(5004770);
                                        boolean zChanged2 = composer3.changed(constraintLayoutBaseScope4Component2);
                                        Object objRememberedValue9 = composer3.rememberedValue();
                                        if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue9 = new FuturesDetailChartSectionKt$DefaultChartHeader$1$1$1(constraintLayoutBaseScope4Component2);
                                            composer3.updateRememberedValue(objRememberedValue9);
                                        }
                                        composer3.endReplaceGroup();
                                        constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component3;
                                        i7 = helpersHashCode;
                                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component5;
                                        BentoText2.m20747BentoText38GnDrw(str72, constraintLayoutScope3.constrainAs(modifierM14735scrimGUYwDQI$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9), null, null, bold, null, null, 0, false, 0, 0, null, 0, textS, composer3, 24576, 0, 8172);
                                        composer3.endReplaceGroup();
                                        constraintLayoutScope22 = constraintLayoutScope3;
                                        constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component1;
                                        constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component2;
                                    } else {
                                        i7 = helpersHashCode;
                                        constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component5;
                                        constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component3;
                                        composer3.startReplaceGroup(-574278344);
                                        StringResource stringResource = contractSelectorText;
                                        Function0 function022 = onOpenContractsSelector;
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                        int i10 = BentoTheme.$stable;
                                        Modifier modifierM14735scrimGUYwDQI$default2 = ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5145paddingqDBjuR0(companion2, bentoTheme3.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer3, i10).m21593getSmallD9Ej5fM(), bentoTheme3.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM()), z, null, null, 6, null);
                                        composer3.startReplaceGroup(5004770);
                                        constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component2;
                                        boolean zChanged3 = composer3.changed(constraintLayoutBaseScope43);
                                        Object objRememberedValue10 = composer3.rememberedValue();
                                        if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue10 = new FuturesDetailChartSectionKt$DefaultChartHeader$1$2$1(constraintLayoutBaseScope43);
                                            composer3.updateRememberedValue(objRememberedValue10);
                                        }
                                        composer3.endReplaceGroup();
                                        constraintLayoutScope22 = constraintLayoutScope3;
                                        constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component1;
                                        ContractHeader.ContractHeader(stringResource, function022, constraintLayoutScope22.constrainAs(modifierM14735scrimGUYwDQI$default2, constraintLayoutBaseScope44, (Function1) objRememberedValue10), composer3, StringResource.$stable, 0);
                                        composer3.endReplaceGroup();
                                    }
                                    String text = StringResources2.getText(productName, composer3, StringResource.$stable);
                                    BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                                    int i11 = BentoTheme.$stable;
                                    TextStyle displayCapsuleLarge = bentoTheme4.getTypography(composer3, i11).getDisplayCapsuleLarge();
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme4.getSpacing(composer3, i11).m21592getMediumD9Ej5fM(), bentoTheme4.getSpacing(composer3, i11).m21595getXsmallD9Ej5fM(), bentoTheme4.getSpacing(composer3, i11).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                                    composer3.startReplaceGroup(-1633490746);
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope45 = constraintLayoutBaseScope42;
                                    boolean zChanged4 = composer3.changed(constraintLayoutBaseScope44) | composer3.changed(constraintLayoutBaseScope45);
                                    Object objRememberedValue11 = composer3.rememberedValue();
                                    if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue11 = new FuturesDetailChartSectionKt$DefaultChartHeader$1$3$1(constraintLayoutBaseScope44, constraintLayoutBaseScope45);
                                        composer3.updateRememberedValue(objRememberedValue11);
                                    }
                                    composer3.endReplaceGroup();
                                    ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope22;
                                    BentoText2.m20747BentoText38GnDrw(text, constraintLayoutScope22.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope43, (Function1) objRememberedValue11), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleLarge, composer3, 0, 0, 8188);
                                    CompositionLocal3.CompositionLocalProvider(Styles2.getLocalStyles().provides(new C17103xd69dc07b((Styles) composer3.consume(Styles2.getLocalStyles()))), ComposableLambda3.rememberComposableLambda(55392340, true, new FuturesDetailChartSectionKt$DefaultChartHeader$1$4(constraintLayoutScope4, constraintLayoutBaseScope45, constraintLayoutBaseScope43, constraintLayoutBaseScope4Component4, cursorData, z), composer3, 54), composer3, ProvidedValue.$stable | 48);
                                    Modifier modifierM14735scrimGUYwDQI$default3 = ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme4.getSpacing(composer3, i11).m21592getMediumD9Ej5fM(), 0.0f, 2, null), z, null, null, 6, null);
                                    composer3.startReplaceGroup(-1633490746);
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope46 = constraintLayoutBaseScope4;
                                    boolean zChanged5 = composer3.changed(constraintLayoutBaseScope45) | composer3.changed(constraintLayoutBaseScope46);
                                    Object objRememberedValue12 = composer3.rememberedValue();
                                    if (zChanged5 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue12 = new FuturesDetailChartSectionKt$DefaultChartHeader$1$5$1(constraintLayoutBaseScope45, constraintLayoutBaseScope46);
                                        composer3.updateRememberedValue(objRememberedValue12);
                                    }
                                    composer3.endReplaceGroup();
                                    Modifier modifierConstrainAs = constraintLayoutScope4.constrainAs(modifierM14735scrimGUYwDQI$default3, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue12);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierConstrainAs);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    if (z3) {
                                        composer3.startReplaceGroup(329873304);
                                        String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_bid_label, composer3, 0);
                                        long jM21426getFg20d7_KjU = bentoTheme4.getColors(composer3, i11).m21426getFg20d7_KjU();
                                        TextStyle textM = bentoTheme4.getTypography(composer3, i11).getTextM();
                                        FontWeight.Companion companion5 = FontWeight.INSTANCE;
                                        BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer3, 24576, 0, 8170);
                                        composer3.startReplaceGroup(-266444576);
                                        String str8 = str5;
                                        if (str8 == null) {
                                            bentoTheme = bentoTheme4;
                                            i8 = i11;
                                        } else {
                                            long jM21425getFg0d7_KjU = bentoTheme4.getColors(composer3, i11).m21425getFg0d7_KjU();
                                            i8 = i11;
                                            bentoTheme = bentoTheme4;
                                            BentoText2.m20747BentoText38GnDrw(str8, PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme4.getSpacing(composer3, i11).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer3, i11).getTextM(), composer3, 24576, 0, 8168);
                                        }
                                        composer3.endReplaceGroup();
                                        String strStringResource2 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_ask_label, composer3, 0);
                                        int i12 = i8;
                                        long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composer3, i12).m21426getFg20d7_KjU();
                                        BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composer3, i12).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM21426getFg20d7_KjU2), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i12).getTextM(), composer3, 24576, 0, 8168);
                                        String str9 = str6;
                                        if (str9 == null) {
                                            c17099x1454f9ae = this;
                                        } else {
                                            long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer3, i12).m21425getFg0d7_KjU();
                                            TextStyle textM2 = bentoTheme.getTypography(composer3, i12).getTextM();
                                            c17099x1454f9ae = this;
                                            BentoText2.m20747BentoText38GnDrw(str9, PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composer3, i12).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, textM2, composer3, 24576, 0, 8168);
                                        }
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(331292050);
                                        BentoText2.m20747BentoText38GnDrw("", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 6, 0, 16382);
                                        composer3.endReplaceGroup();
                                    }
                                    composer3.endNode();
                                    composer3.endReplaceGroup();
                                    if (constraintLayoutScope2.getHelpersHashCode() != i7) {
                                        EffectsKt.SideEffect(function02, composer3, 6);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54);
                            composer2 = composerStartRestartGroup;
                            LayoutKt.MultiMeasureLayout(modifierSemantics$default2, composableLambdaRememberComposableLambda2, measurePolicy2, composer2, 48, 0);
                            composer2.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier42;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i2 & 16) == 0) {
            }
            str4 = str;
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i4 = i2 & 512;
            if (i4 == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        str4 = str;
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i4 = i2 & 512;
        if (i4 == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
