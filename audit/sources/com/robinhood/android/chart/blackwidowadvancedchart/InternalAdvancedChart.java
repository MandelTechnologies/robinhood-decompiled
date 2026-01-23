package com.robinhood.android.chart.blackwidowadvancedchart;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TimeSpanDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks;
import com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChart;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartWebView;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBar;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.UnsupportedWebViewVersionAlert;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.TradingButtonsRowKt;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartTopBar;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.GenericAdvanceChartOrderAction3;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.TradeRowState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.EditNumberOfShares;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Placeholders;
import com.robinhood.android.chart.equityadvancedchart.MacEquityOrderState;
import com.robinhood.android.charts.span.UnifiedSpan;
import com.robinhood.android.charts.span.UnifiedSpanSelectorKt;
import com.robinhood.android.charts.span.UnifiedSpanSelectorState;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import com.robinhood.shared.trading.orderstate.Quantity;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: InternalAdvancedChart.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ae\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aP\u0010\u001c\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00182\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 \"\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010 \"\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010 \"\u0014\u0010$\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010 \"\u0014\u0010%\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010 \"\u0014\u0010&\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010 ¨\u0006)²\u0006\f\u0010(\u001a\u00020'8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartViewState;", "chartViewState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderViewState;", "orderViewState", "", "hideLoadingState", "Lkotlin/Function0;", "", "snackbarHost", "onBackPressed", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/IAdvanceChartOrderDuxo;", "orderCallbacks", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;", "chartCallbacks", "Landroidx/compose/ui/Modifier;", "modifier", "InternalAdvancedChart", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartViewState;Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderViewState;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/IAdvanceChartOrderDuxo;Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/chart/blackwidowadvancedchart/SpanSelectorState;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "trailingButton", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "onSpanSelected", InternalAdvancedChart.BOTTOM_BAR_SPAN_SELECTOR, "(Lcom/robinhood/android/chart/blackwidowadvancedchart/SpanSelectorState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "BOTTOM_BAR_TRADE_QUANTITY", "Ljava/lang/String;", "BOTTOM_BAR_SPAN_SELECTOR", "BOTTOM_BAR_INTERVAL_SELECTOR", "BOTTOM_BAR_BUY_SUBMIT", "BOTTOM_BAR_SELL_SUBMIT", "BOTTOM_BAR_BUY", "BOTTOM_BAR_SELL", "Landroidx/compose/ui/unit/IntOffset;", "bottomBarLoadingOffset", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class InternalAdvancedChart {
    private static final String BOTTOM_BAR_BUY = "Buy";
    private static final String BOTTOM_BAR_BUY_SUBMIT = "BuySubmit";
    private static final String BOTTOM_BAR_INTERVAL_SELECTOR = "IntervalSelector";
    private static final String BOTTOM_BAR_SELL = "Sell";
    private static final String BOTTOM_BAR_SELL_SUBMIT = "SellSubmit";
    private static final String BOTTOM_BAR_SPAN_SELECTOR = "SpanSelector";
    private static final String BOTTOM_BAR_TRADE_QUANTITY = "TradeQuantity";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAdvancedChart$lambda$2(BwWebViewManager bwWebViewManager, BlackWidowAdvancedChartViewState blackWidowAdvancedChartViewState, AdvanceChartOrderViewState advanceChartOrderViewState, boolean z, Function2 function2, Function0 function0, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InternalAdvancedChart(bwWebViewManager, blackWidowAdvancedChartViewState, advanceChartOrderViewState, z, function2, function0, advanceChartOrderDuxo4, blackWidowAdvanceChartCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpanSelector$lambda$3(SpanSelectorState spanSelectorState, Function3 function3, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SpanSelector(spanSelectorState, function3, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalAdvancedChart(final BwWebViewManager bwWebViewManager, final BlackWidowAdvancedChartViewState chartViewState, final AdvanceChartOrderViewState orderViewState, final boolean z, final Function2<? super Composer, ? super Integer, Unit> snackbarHost, final Function0<Unit> onBackPressed, final AdvanceChartOrderDuxo4 orderCallbacks, final BlackWidowAdvanceChartCallbacks chartCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChanged;
        Object objRememberedValue;
        long jM8033constructorimpl;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
        Intrinsics.checkNotNullParameter(chartViewState, "chartViewState");
        Intrinsics.checkNotNullParameter(orderViewState, "orderViewState");
        Intrinsics.checkNotNullParameter(snackbarHost, "snackbarHost");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(orderCallbacks, "orderCallbacks");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1597844547);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(bwWebViewManager) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(chartViewState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(orderViewState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(snackbarHost) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(orderCallbacks) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= (16777216 & i) == 0 ? composerStartRestartGroup.changed(chartCallbacks) : composerStartRestartGroup.changedInstance(chartCallbacks) ? 8388608 : 4194304;
        }
        int i4 = i2 & 256;
        if (i4 == 0) {
            if ((100663296 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
            }
            if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1597844547, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChart (InternalAdvancedChart.kt:78)");
                }
                EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                TradeRowState tradeRowState = orderViewState.getTradeRowState();
                BottomBarState bottomBarState = chartViewState.getBottomBarState();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(bottomBarState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = chartViewState.getBottomBarState();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                BottomBarState bottomBarState2 = (BottomBarState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int i5 = 0;
                if (!chartViewState.getLoadingComplete() || z) {
                    long j = 0;
                    jM8033constructorimpl = IntOffset.m8033constructorimpl((j << 32) | (j & 4294967295L));
                } else {
                    jM8033constructorimpl = IntOffset.m8033constructorimpl((500 & 4294967295L) | (0 << 32));
                    i5 = 0;
                }
                SnapshotState4<IntOffset> snapshotState4M4813animateIntOffsetAsStateHyPO7BM = AnimateAsState.m4813animateIntOffsetAsStateHyPO7BM(jM8033constructorimpl, AnimationSpecKt.tween$default(300, i5, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-672821753, true, new C106111(chartViewState, z, orderViewState, chartCallbacks, onBackPressed), composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1418707784, true, new C106122(chartViewState, z, tradeRowState, snapshotState4M4813animateIntOffsetAsStateHyPO7BM, orderViewState, current, userInteractionEventDescriptor, chartCallbacks, orderCallbacks), composerStartRestartGroup, 54);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, snackbarHost, null, 0, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-1830138734, true, new C106133(chartViewState, chartCallbacks, orderViewState, bwWebViewManager, orderCallbacks, snapshotState4M4813animateIntOffsetAsStateHyPO7BM, bottomBarState2, current, userInteractionEventDescriptor), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 7168) | 805306800, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternalAdvancedChart.InternalAdvancedChart$lambda$2(bwWebViewManager, chartViewState, orderViewState, z, snackbarHost, onBackPressed, orderCallbacks, chartCallbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 100663296;
        modifier2 = modifier;
        if ((i3 & 38347923) == 38347922) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            TradeRowState tradeRowState2 = orderViewState.getTradeRowState();
            BottomBarState bottomBarState3 = chartViewState.getBottomBarState();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(bottomBarState3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = chartViewState.getBottomBarState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                BottomBarState bottomBarState22 = (BottomBarState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int i52 = 0;
                if (!chartViewState.getLoadingComplete()) {
                    long j2 = 0;
                    jM8033constructorimpl = IntOffset.m8033constructorimpl((j2 << 32) | (j2 & 4294967295L));
                    SnapshotState4<IntOffset> snapshotState4M4813animateIntOffsetAsStateHyPO7BM2 = AnimateAsState.m4813animateIntOffsetAsStateHyPO7BM(jM8033constructorimpl, AnimationSpecKt.tween$default(300, i52, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-672821753, true, new C106111(chartViewState, z, orderViewState, chartCallbacks, onBackPressed), composerStartRestartGroup, 54);
                    ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(1418707784, true, new C106122(chartViewState, z, tradeRowState2, snapshotState4M4813animateIntOffsetAsStateHyPO7BM2, orderViewState, current2, userInteractionEventDescriptor2, chartCallbacks, orderCallbacks), composerStartRestartGroup, 54);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifier52 = modifier4;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default2, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda22, snackbarHost, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-1830138734, true, new C106133(chartViewState, chartCallbacks, orderViewState, bwWebViewManager, orderCallbacks, snapshotState4M4813animateIntOffsetAsStateHyPO7BM2, bottomBarState22, current2, userInteractionEventDescriptor2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 7168) | 805306800, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long InternalAdvancedChart$lambda$1(SnapshotState4<IntOffset> snapshotState4) {
        return snapshotState4.getValue().getPackedValue();
    }

    /* compiled from: InternalAdvancedChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$1 */
    static final class C106111 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ BlackWidowAdvanceChartCallbacks $chartCallbacks;
        final /* synthetic */ BlackWidowAdvancedChartViewState $chartViewState;
        final /* synthetic */ boolean $hideLoadingState;
        final /* synthetic */ Function0<Unit> $onBackPressed;
        final /* synthetic */ AdvanceChartOrderViewState $orderViewState;

        C106111(BlackWidowAdvancedChartViewState blackWidowAdvancedChartViewState, boolean z, AdvanceChartOrderViewState advanceChartOrderViewState, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, Function0<Unit> function0) {
            this.$chartViewState = blackWidowAdvancedChartViewState;
            this.$hideLoadingState = z;
            this.$orderViewState = advanceChartOrderViewState;
            this.$chartCallbacks = blackWidowAdvanceChartCallbacks;
            this.$onBackPressed = function0;
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
                ComposerKt.traceEventStart(-672821753, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChart.<anonymous> (InternalAdvancedChart.kt:100)");
            }
            TopBarState topBarState = this.$chartViewState.getTopBarState();
            boolean webViewVersionUnsupported = this.$chartViewState.getWebViewVersionUnsupported();
            boolean z = this.$chartViewState.getLoadingComplete() || this.$hideLoadingState;
            AdvanceChartOrderViewState advanceChartOrderViewState = this.$orderViewState;
            BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks = this.$chartCallbacks;
            Function0<Unit> function0 = this.$onBackPressed;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$chartCallbacks);
            final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks2 = this.$chartCallbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAdvancedChart.C106111.invoke$lambda$1$lambda$0(blackWidowAdvanceChartCallbacks2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ChartTopBar.ChartTopBar(topBarState, advanceChartOrderViewState, z, webViewVersionUnsupported, blackWidowAdvanceChartCallbacks, function0, (Function0) objRememberedValue, null, composer, 0, 128);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks) {
            blackWidowAdvanceChartCallbacks.onToggleIndicatorsRow();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: InternalAdvancedChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$3 */
    static final class C106133 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<IntOffset> $bottomBarLoadingOffset$delegate;
        final /* synthetic */ BottomBarState $bottomBarState;
        final /* synthetic */ BwWebViewManager $bwWebViewManager;
        final /* synthetic */ BlackWidowAdvanceChartCallbacks $chartCallbacks;
        final /* synthetic */ BlackWidowAdvancedChartViewState $chartViewState;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ AdvanceChartOrderDuxo4 $orderCallbacks;
        final /* synthetic */ AdvanceChartOrderViewState $orderViewState;

        C106133(BlackWidowAdvancedChartViewState blackWidowAdvancedChartViewState, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, AdvanceChartOrderViewState advanceChartOrderViewState, BwWebViewManager bwWebViewManager, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4, SnapshotState4<IntOffset> snapshotState4, BottomBarState bottomBarState, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
            this.$chartViewState = blackWidowAdvancedChartViewState;
            this.$chartCallbacks = blackWidowAdvanceChartCallbacks;
            this.$orderViewState = advanceChartOrderViewState;
            this.$bwWebViewManager = bwWebViewManager;
            this.$orderCallbacks = advanceChartOrderDuxo4;
            this.$bottomBarLoadingOffset$delegate = snapshotState4;
            this.$bottomBarState = bottomBarState;
            this.$eventLogger = eventLogger;
            this.$eventDescriptor = userInteractionEventDescriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$11$lambda$10$lambda$9(int i) {
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$11$lambda$8$lambda$7(int i) {
            return i;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$6$lambda$1$lambda$0(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4) {
            blackWidowAdvanceChartCallbacks.hideIndicatorsRow();
            advanceChartOrderDuxo4.handleGenericAdvanceChartOrderAction(GenericAdvanceChartOrderAction3.INSTANCE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IntOffset invoke$lambda$11$lambda$6$lambda$3$lambda$2(SnapshotState4 snapshotState4, Density offset) {
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffset.m8030boximpl(InternalAdvancedChart.InternalAdvancedChart$lambda$1(snapshotState4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$6$lambda$5$lambda$4(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, TimeSpanDto it) {
            Intrinsics.checkNotNullParameter(it, "it");
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, InternalAdvancedChart.BOTTOM_BAR_SPAN_SELECTOR, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, it.getLabel(), null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, null, 32765, null).getContext(), false, 41, null);
            blackWidowAdvanceChartCallbacks.onSpanSelected(it);
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1830138734, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChart.<anonymous> (InternalAdvancedChart.kt:113)");
            }
            if (this.$chartViewState.getWebViewVersionUnsupported()) {
                composer.startReplaceGroup(-1342165770);
                UnsupportedWebViewVersionAlert.UnsupportedWebViewVersionAlert(SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1347907001);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                BlackWidowAdvancedChartViewState blackWidowAdvancedChartViewState = this.$chartViewState;
                final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks = this.$chartCallbacks;
                AdvanceChartOrderViewState advanceChartOrderViewState = this.$orderViewState;
                BwWebViewManager bwWebViewManager = this.$bwWebViewManager;
                final AdvanceChartOrderDuxo4 advanceChartOrderDuxo4 = this.$orderCallbacks;
                final SnapshotState4<IntOffset> snapshotState4 = this.$bottomBarLoadingOffset$delegate;
                BottomBarState bottomBarState = this.$bottomBarState;
                final EventLogger eventLogger = this.$eventLogger;
                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                LowerTopAppBar.LowerTopAppBar(blackWidowAdvancedChartViewState.getLowerTopBarState(), blackWidowAdvanceChartCallbacks, boxScopeInstance.align(ZIndexModifier2.zIndex(companion, 50.0f), companion2.getTopCenter()), composer, 0, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer, 0);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), null, null, 3, null);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(blackWidowAdvanceChartCallbacks) | composer.changedInstance(advanceChartOrderDuxo4);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAdvancedChart.C106133.invoke$lambda$11$lambda$6$lambda$1$lambda$0(blackWidowAdvanceChartCallbacks, advanceChartOrderDuxo4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                ChartWebView.ChartWebView(bwWebViewManager, (Function0) objRememberedValue, modifierAnimateContentSize$default, composer, 0, 0);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(snapshotState4);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InternalAdvancedChart.C106133.invoke$lambda$11$lambda$6$lambda$3$lambda$2(snapshotState4, (Density) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(OffsetKt.offset(companion, (Function1) objRememberedValue2), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                SpanSelectorState spanSelectorState = bottomBarState.getSpanSelectorState();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(130726780, true, new InternalAdvancedChart4(bottomBarState, eventLogger, userInteractionEventDescriptor, blackWidowAdvanceChartCallbacks), composer, 54);
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composer.changedInstance(eventLogger) | composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(blackWidowAdvanceChartCallbacks);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$3$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InternalAdvancedChart.C106133.invoke$lambda$11$lambda$6$lambda$5$lambda$4(eventLogger, userInteractionEventDescriptor, blackWidowAdvanceChartCallbacks, (TimeSpanDto) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                InternalAdvancedChart.SpanSelector(spanSelectorState, composableLambdaRememberComposableLambda, (Function1) objRememberedValue3, modifierFillMaxWidth$default, composer, 48, 0);
                Composer composer2 = composer;
                composer2.endNode();
                InstrumentOrderState instrumentOrderState = advanceChartOrderViewState.getInstrumentOrderState();
                composer2.startReplaceGroup(-1348085979);
                if (instrumentOrderState instanceof MacEquityOrderState) {
                    Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getBottomCenter());
                    boolean showNbbo = ((MacEquityOrderState) instrumentOrderState).getShowNbbo();
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objRememberedValue4 == companion4.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$3$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Integer.valueOf(InternalAdvancedChart.C106133.invoke$lambda$11$lambda$8$lambda$7(((Integer) obj).intValue()));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    EnterTransition enterTransitionSlideInVertically$default = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue4, 1, null);
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (objRememberedValue5 == companion4.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$3$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Integer.valueOf(InternalAdvancedChart.C106133.invoke$lambda$11$lambda$10$lambda$9(((Integer) obj).intValue()));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    AnimatedVisibilityKt.AnimatedVisibility(showNbbo, modifierAlign, enterTransitionSlideInVertically$default, EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue5, 1, null), (String) null, ComposableLambda3.rememberComposableLambda(-1079258495, true, new InternalAdvancedChart7(instrumentOrderState, advanceChartOrderDuxo4), composer2, 54), composer, 200064, 16);
                    composer2 = composer;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* compiled from: InternalAdvancedChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$2 */
    static final class C106122 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<IntOffset> $bottomBarLoadingOffset$delegate;
        final /* synthetic */ BlackWidowAdvanceChartCallbacks $chartCallbacks;
        final /* synthetic */ BlackWidowAdvancedChartViewState $chartViewState;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ boolean $hideLoadingState;
        final /* synthetic */ AdvanceChartOrderDuxo4 $orderCallbacks;
        final /* synthetic */ AdvanceChartOrderViewState $orderViewState;
        final /* synthetic */ TradeRowState $tradeRowState;

        C106122(BlackWidowAdvancedChartViewState blackWidowAdvancedChartViewState, boolean z, TradeRowState tradeRowState, SnapshotState4<IntOffset> snapshotState4, AdvanceChartOrderViewState advanceChartOrderViewState, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4) {
            this.$chartViewState = blackWidowAdvancedChartViewState;
            this.$hideLoadingState = z;
            this.$tradeRowState = tradeRowState;
            this.$bottomBarLoadingOffset$delegate = snapshotState4;
            this.$orderViewState = advanceChartOrderViewState;
            this.$eventLogger = eventLogger;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$chartCallbacks = blackWidowAdvanceChartCallbacks;
            this.$orderCallbacks = advanceChartOrderDuxo4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            InstrumentOrderState4 quantity;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1418707784, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChart.<anonymous> (InternalAdvancedChart.kt:227)");
            }
            if ((this.$chartViewState.getLoadingComplete() || this.$hideLoadingState) && !this.$chartViewState.getChartError() && this.$tradeRowState != null) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$bottomBarLoadingOffset$delegate);
                final SnapshotState4<IntOffset> snapshotState4 = this.$bottomBarLoadingOffset$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InternalAdvancedChart.C106122.invoke$lambda$1$lambda$0(snapshotState4, (Density) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(modifierOffset, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), 0.0f, 1, null), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null);
                InstrumentOrderState instrumentOrderState = this.$orderViewState.getInstrumentOrderState();
                if (instrumentOrderState == null || (quantity = instrumentOrderState.getOrderTradeAmount()) == null) {
                    BigDecimal ONE = BigDecimal.ONE;
                    Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                    quantity = new Quantity(ONE);
                }
                InstrumentOrderState4 instrumentOrderState4 = quantity;
                TradeRowState tradeRowState = this.$tradeRowState;
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$chartCallbacks);
                final EventLogger eventLogger = this.$eventLogger;
                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks = this.$chartCallbacks;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAdvancedChart.C106122.invoke$lambda$3$lambda$2(eventLogger, userInteractionEventDescriptor, blackWidowAdvanceChartCallbacks);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance2 = composer.changedInstance(this.$orderViewState) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$orderCallbacks);
                AdvanceChartOrderViewState advanceChartOrderViewState = this.$orderViewState;
                EventLogger eventLogger2 = this.$eventLogger;
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
                AdvanceChartOrderDuxo4 advanceChartOrderDuxo4 = this.$orderCallbacks;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new InternalAdvancedChart2(advanceChartOrderViewState, eventLogger2, userInteractionEventDescriptor2, advanceChartOrderDuxo4, null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function2 function2 = (Function2) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance3 = composer.changedInstance(this.$orderViewState) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$orderCallbacks);
                AdvanceChartOrderViewState advanceChartOrderViewState2 = this.$orderViewState;
                EventLogger eventLogger3 = this.$eventLogger;
                UserInteractionEventDescriptor userInteractionEventDescriptor3 = this.$eventDescriptor;
                AdvanceChartOrderDuxo4 advanceChartOrderDuxo42 = this.$orderCallbacks;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    InternalAdvancedChart3 internalAdvancedChart3 = new InternalAdvancedChart3(advanceChartOrderViewState2, eventLogger3, userInteractionEventDescriptor3, advanceChartOrderDuxo42, null);
                    composer.updateRememberedValue(internalAdvancedChart3);
                    objRememberedValue4 = internalAdvancedChart3;
                }
                composer.endReplaceGroup();
                TradingButtonsRowKt.TradingButtonsRow(tradeRowState, instrumentOrderState4, function0, function2, (Function2) objRememberedValue4, modifierM4872backgroundbw27NRU$default, composer, TradeRowState.$stable, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IntOffset invoke$lambda$1$lambda$0(SnapshotState4 snapshotState4, Density offset) {
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffset.m8030boximpl(InternalAdvancedChart.InternalAdvancedChart$lambda$1(snapshotState4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.PILL, InternalAdvancedChart.BOTTOM_BAR_TRADE_QUANTITY, null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
            BlackWidowAdvanceChartCallbacks.DefaultImpls.setScreenState$default(blackWidowAdvanceChartCallbacks, new EditNumberOfShares(false, null, 3, null), false, 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SpanSelector(final SpanSelectorState spanSelectorState, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, final Function1<? super TimeSpanDto, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32;
        Function1<? super TimeSpanDto, Unit> function12;
        int i4;
        Modifier modifier2;
        ImmutableList<UnifiedSpan<TimeSpanDto>> placeholder_spans;
        final Modifier modifier3;
        TimeSpanDto selectedSpan;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1114334133);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(spanSelectorState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function32 = function3;
        } else {
            function32 = function3;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function32) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1114334133, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.SpanSelector (InternalAdvancedChart.kt:305)");
                    }
                    if (spanSelectorState != null || (placeholder_spans = spanSelectorState.getUnifiedSpans()) == null) {
                        placeholder_spans = Placeholders.getPLACEHOLDER_SPANS();
                    }
                    UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(new UnifiedSpanSelectorState(placeholder_spans, (spanSelectorState != null || (selectedSpan = spanSelectorState.getSelectedSpan()) == null) ? new TimeSpanDto("1D", 0.0f, null, 6, null) : selectedSpan, function12, spanSelectorState != null, null, false, 0.0f, 64, null), modifier4, null, null, null, null, function32, composerStartRestartGroup, ((i3 >> 6) & 112) | ((i3 << 15) & 3670016), 60);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InternalAdvancedChart.SpanSelector$lambda$3(spanSelectorState, function3, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) != 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (spanSelectorState != null) {
                    placeholder_spans = Placeholders.getPLACEHOLDER_SPANS();
                    if (spanSelectorState != null) {
                        UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(new UnifiedSpanSelectorState(placeholder_spans, (spanSelectorState != null || (selectedSpan = spanSelectorState.getSelectedSpan()) == null) ? new TimeSpanDto("1D", 0.0f, null, 6, null) : selectedSpan, function12, spanSelectorState != null, null, false, 0.0f, 64, null), modifier4, null, null, null, null, function32, composerStartRestartGroup, ((i3 >> 6) & 112) | ((i3 << 15) & 3670016), 60);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function12 = function1;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
