package com.robinhood.android.chart.blackwidowadvancedchart;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposable;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreen;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreen;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.ChartBottomSheetKt;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleAdvanceChartEvents;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartEvent;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.GenericAdvanceChartOrderAction2;
import com.robinhood.android.chart.blackwidowadvancedchart.models.AutoSendUpsell;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BottomSheet;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartScreenState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.IdentiAgreement;
import com.robinhood.android.chart.blackwidowadvancedchart.models.InstrumentSearch;
import com.robinhood.android.chart.blackwidowadvancedchart.models.SlideUp;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.GetAdvanceChartOrderDuxo;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import com.robinhood.shared.trading.orderstate.Quantity;
import com.robinhood.shared.trading.tradecomponentscompose.bottomsheets.AutoSendUpsellBottomSheet;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BlackWidowAdvancedChartComposable.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001aO\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a5\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001f¨\u0006 ²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\u0012\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u008a\u0084\u0002²\u0006\u0012\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u008a\u0084\u0002²\u0006\n\u0010\u0004\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020\u0001X\u008a\u0084\u0002"}, m3636d2 = {"createLegendAdvanceChartContext", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext;", "chartContext", "Lcom/robinhood/android/chart/blackwidowadvancedchart/ChartContext;", "orderState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderViewState;", "BlackWidowAdvancedChartComposable", "", "instrumentId", "", "instrumentType", "Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "screenSource", "onBackPressed", "Lkotlin/Function0;", "showNuxLoading", "", "modifier", "Landroidx/compose/ui/Modifier;", "chartDuxo", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDuxo;", "(Ljava/lang/String;Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDuxo;Landroidx/compose/runtime/Composer;II)V", "ChartScreenStates", "screenState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartScreenState;", "chartViewState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartViewState;", "chartCallbacks", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;", "orderCallbacks", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/IAdvanceChartOrderDuxo;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartScreenState;Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartViewState;Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderViewState;Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/IAdvanceChartOrderDuxo;Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "chartDuxoEvents", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartEvent;", "orderDuxoEvents", "legendAdvancedChartsContext"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BlackWidowAdvancedChartComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlackWidowAdvancedChartComposable$lambda$8(String str, BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey2, String str2, Function0 function0, boolean z, Modifier modifier, BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, int i, int i2, Composer composer, int i3) {
        BlackWidowAdvancedChartComposable(str, blackWidowAdvancedChartFragmentKey2, str2, function0, z, modifier, blackWidowAdvancedChartDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartScreenStates$lambda$11(ChartScreenState chartScreenState, BlackWidowAdvancedChartViewState blackWidowAdvancedChartViewState, AdvanceChartOrderViewState advanceChartOrderViewState, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4, int i, Composer composer, int i2) {
        ChartScreenStates(chartScreenState, blackWidowAdvancedChartViewState, advanceChartOrderViewState, blackWidowAdvanceChartCallbacks, advanceChartOrderDuxo4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final LegendAdvancedChartsContext createLegendAdvanceChartContext(ChartContext chartContext, AdvanceChartOrderViewState orderState) {
        BigDecimal amount;
        Intrinsics.checkNotNullParameter(chartContext, "chartContext");
        Intrinsics.checkNotNullParameter(orderState, "orderState");
        InstrumentOrderState instrumentOrderState = orderState.getInstrumentOrderState();
        String selectedSpan = chartContext.getSelectedSpan();
        String selectedInterval = chartContext.getSelectedInterval();
        String selectedTemplate = chartContext.getSelectedTemplate();
        List<String> activeIndicators = chartContext.getActiveIndicators();
        String instrumentId = chartContext.getInstrumentId();
        InstrumentOrderState4 orderTradeAmount = instrumentOrderState != null ? instrumentOrderState.getOrderTradeAmount() : null;
        Quantity quantity = orderTradeAmount instanceof Quantity ? (Quantity) orderTradeAmount : null;
        return new LegendAdvancedChartsContext(selectedSpan, selectedInterval, selectedTemplate, activeIndicators, instrumentId, (quantity == null || (amount = quantity.getAmount()) == null) ? 0.0d : amount.doubleValue(), orderState.getAutoSendOrders(), null, null, null, null, 0.0d, null, null, 16256, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlackWidowAdvancedChartViewState BlackWidowAdvancedChartComposable$lambda$0(SnapshotState4<BlackWidowAdvancedChartViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<AdvanceChartEvent> BlackWidowAdvancedChartComposable$lambda$1(SnapshotState4<Event<AdvanceChartEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<AdvanceChartEvent> BlackWidowAdvancedChartComposable$lambda$2(SnapshotState4<Event<AdvanceChartEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvanceChartOrderViewState BlackWidowAdvancedChartComposable$lambda$3(SnapshotState4<? extends AdvanceChartOrderViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final LegendAdvancedChartsContext BlackWidowAdvancedChartComposable$lambda$7(SnapshotState4<LegendAdvancedChartsContext> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BlackWidowAdvancedChartComposable(final String instrumentId, final BlackWidowAdvancedChartFragmentKey2 instrumentType, final String screenSource, final Function0<Unit> onBackPressed, final boolean z, Modifier modifier, BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo2;
        Modifier modifier3;
        BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle2;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChanged;
        Object objRememberedValue2;
        Composer composer2;
        final BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(screenSource, "screenSource");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(533192421);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(instrumentId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(instrumentType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(screenSource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    blackWidowAdvancedChartDuxo2 = blackWidowAdvancedChartDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(blackWidowAdvancedChartDuxo2) ? 1048576 : 524288;
                    i3 |= i5;
                } else {
                    blackWidowAdvancedChartDuxo2 = blackWidowAdvancedChartDuxo;
                }
                i3 |= i5;
            } else {
                blackWidowAdvancedChartDuxo2 = blackWidowAdvancedChartDuxo;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 64) == 0) {
                        BlackWidowAdvancedChartDuxo.InitArgs initArgs = new BlackWidowAdvancedChartDuxo.InitArgs(instrumentId, instrumentType);
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(BlackWidowAdvancedChartDuxo.class), current, "BlackWidowAdvancedChartDuxo", factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 384, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt$BlackWidowAdvancedChartComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt$BlackWidowAdvancedChartComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i3 &= -3670017;
                        blackWidowAdvancedChartDuxo3 = (BlackWidowAdvancedChartDuxo) baseDuxo;
                        modifier3 = modifier5;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(533192421, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposable (BlackWidowAdvancedChartComposable.kt:85)");
                        }
                        final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(blackWidowAdvancedChartDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(blackWidowAdvancedChartDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        boolean z2 = z && BlackWidowAdvancedChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getWebLoadingSkeletonEnabled();
                        final AdvanceChartOrderDuxo<?, ?> advanceChartOrderDuxo = GetAdvanceChartOrderDuxo.getAdvanceChartOrderDuxo(BlackWidowAdvancedChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getActiveAccountNumber(), BlackWidowAdvancedChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getActiveInstrumentId(), BlackWidowAdvancedChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getActiveInstrumentType(), composerStartRestartGroup, 0);
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(advanceChartOrderDuxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(advanceChartOrderDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new SnackbarHostState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        final SnackbarHostState snackbarHostState = (SnackbarHostState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        ChartContext chartContext = BlackWidowAdvancedChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getChartContext();
                        AdvanceChartOrderViewState advanceChartOrderViewStateBlackWidowAdvancedChartComposable$lambda$3 = BlackWidowAdvancedChartComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle2);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged = composerStartRestartGroup.changed(chartContext) | composerStartRestartGroup.changed(advanceChartOrderViewStateBlackWidowAdvancedChartComposable$lambda$3);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$6$lambda$5(snapshotState4CollectAsStateWithLifecycle, snapshotState4CollectAsStateWithLifecycle2);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.MOBILE_ADVANCED_CHARTS, screenSource, null, null, 12, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, BlackWidowAdvancedChartComposable$lambda$7((SnapshotState4) objRememberedValue2), null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16381, null), null, null, 53, null);
                        final Modifier modifier6 = modifier3;
                        final BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo5 = blackWidowAdvancedChartDuxo3;
                        final boolean z3 = z2;
                        AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-700815078, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt.BlackWidowAdvancedChartComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-700815078, i6, -1, "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposable.<anonymous> (BlackWidowAdvancedChartComposable.kt:114)");
                                }
                                BentoTheme4 direction = BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDirection();
                                final AdvanceChartOrderDuxo<?, ?> advanceChartOrderDuxo2 = advanceChartOrderDuxo;
                                final BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo6 = blackWidowAdvancedChartDuxo5;
                                final SnackbarHostState snackbarHostState2 = snackbarHostState;
                                final boolean z4 = z3;
                                final Function0<Unit> function0 = onBackPressed;
                                final Modifier modifier7 = modifier6;
                                final SnapshotState4<BlackWidowAdvancedChartViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                final EventLogger eventLogger = current2;
                                final SnapshotState4<Event<AdvanceChartEvent>> snapshotState42 = snapshotState4CollectAsStateWithLifecycle3;
                                final SnapshotState4<Event<AdvanceChartEvent>> snapshotState43 = snapshotState4CollectAsStateWithLifecycle4;
                                final SnapshotState4<AdvanceChartOrderViewState> snapshotState44 = snapshotState4CollectAsStateWithLifecycle2;
                                BentoThemeOverlays.DirectionThemeOverlay(direction, ComposableLambda3.rememberComposableLambda(2080652340, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt.BlackWidowAdvancedChartComposable.1.1
                                    public final void invoke(Composer composer4, int i7) {
                                        int i8;
                                        final SnackbarHostState snackbarHostState3;
                                        boolean z5;
                                        int i9;
                                        boolean z6;
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2080652340, i7, -1, "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposable.<anonymous>.<anonymous> (BlackWidowAdvancedChartComposable.kt:115)");
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(companion2, WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, composer4, 6));
                                        AdvanceChartOrderDuxo<?, ?> advanceChartOrderDuxo3 = advanceChartOrderDuxo2;
                                        BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo7 = blackWidowAdvancedChartDuxo6;
                                        SnackbarHostState snackbarHostState4 = snackbarHostState2;
                                        boolean z7 = z4;
                                        Function0<Unit> function02 = function0;
                                        Modifier modifier8 = modifier7;
                                        SnapshotState4<BlackWidowAdvancedChartViewState> snapshotState45 = snapshotState4;
                                        EventLogger eventLogger2 = eventLogger;
                                        SnapshotState4<Event<AdvanceChartEvent>> snapshotState46 = snapshotState42;
                                        SnapshotState4<Event<AdvanceChartEvent>> snapshotState47 = snapshotState43;
                                        SnapshotState4<AdvanceChartOrderViewState> snapshotState48 = snapshotState44;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierWindowInsetsPadding);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        Event eventBlackWidowAdvancedChartComposable$lambda$1 = BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$1(snapshotState46);
                                        int i10 = AdvanceChartOrderDuxo.$stable;
                                        HandleAdvanceChartEvents.HandleAdvanceChartEvents(eventBlackWidowAdvancedChartComposable$lambda$1, advanceChartOrderDuxo3, blackWidowAdvancedChartDuxo7, snackbarHostState4, composer4, (i10 << 3) | 3072);
                                        Composer composer5 = composer4;
                                        HandleAdvanceChartEvents.HandleAdvanceChartEvents(BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$2(snapshotState47), advanceChartOrderDuxo3, blackWidowAdvancedChartDuxo7, snackbarHostState4, composer5, (i10 << 3) | 3072);
                                        composer5.startReplaceGroup(-1592323127);
                                        boolean z8 = true;
                                        if (z7) {
                                            i8 = i10;
                                            snackbarHostState3 = snackbarHostState4;
                                            z5 = z7;
                                            i9 = 0;
                                            z6 = true;
                                        } else {
                                            Modifier modifierZIndex = ZIndexModifier2.zIndex(companion2, 999.0f);
                                            if (BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(snapshotState45).getLoadingComplete() || BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(snapshotState45).getChartError()) {
                                                z8 = false;
                                            }
                                            i9 = 0;
                                            i8 = i10;
                                            snackbarHostState3 = snackbarHostState4;
                                            z5 = z7;
                                            z6 = true;
                                            AnimatedVisibilityKt.AnimatedVisibility(z8, modifierZIndex, (EnterTransition) null, EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(50, 0, null, 6, null), 0.0f, 2, null), (String) null, BlackWidowAdvancedChartComposable4.INSTANCE.m1748x1ec0074c(), composer4, 199728, 20);
                                            composer5 = composer4;
                                        }
                                        composer5.endReplaceGroup();
                                        int i11 = i9;
                                        InternalAdvancedChart.InternalAdvancedChart(blackWidowAdvancedChartDuxo7.getBwWebViewManager(), BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(snapshotState45), BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$3(snapshotState48), z5, ComposableLambda3.rememberComposableLambda(1813084414, z6, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt$BlackWidowAdvancedChartComposable$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                invoke(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer6, int i12) {
                                                if ((i12 & 3) == 2 && composer6.getSkipping()) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1813084414, i12, -1, "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlackWidowAdvancedChartComposable.kt:144)");
                                                }
                                                SnackbarHostKt.SnackbarHost(snackbarHostState3, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer6, BentoTheme.$stable).m21596getXxlargeD9Ej5fM(), 7, null), BlackWidowAdvancedChartComposable4.INSTANCE.m1747x95a70365(), composer6, 390, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer5, 54), function02, advanceChartOrderDuxo3, blackWidowAdvancedChartDuxo7, modifier8, composer5, (i8 << 18) | 24576, 0);
                                        BlackWidowAdvancedChartComposable.ChartScreenStates(BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(snapshotState45).getScreenState(), BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(snapshotState45), BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$3(snapshotState48), blackWidowAdvancedChartDuxo7, advanceChartOrderDuxo3, composer4, i8 << 12);
                                        UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                        Boolean boolValueOf = Boolean.valueOf(BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(snapshotState45).getLoadingComplete());
                                        composer4.startReplaceGroup(-1746271574);
                                        boolean zChanged2 = composer4.changed(snapshotState45) | composer4.changedInstance(eventLogger2) | composer4.changedInstance(userInteractionEventDescriptor2);
                                        Object objRememberedValue4 = composer4.rememberedValue();
                                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new BlackWidowAdvancedChartComposable3(eventLogger2, userInteractionEventDescriptor2, snapshotState45, null);
                                            composer4.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer4.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer4, i11);
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        blackWidowAdvancedChartDuxo4 = blackWidowAdvancedChartDuxo5;
                        modifier4 = modifier6;
                    } else {
                        modifier3 = modifier5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    modifier3 = modifier2;
                }
                blackWidowAdvancedChartDuxo3 = blackWidowAdvancedChartDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(blackWidowAdvancedChartDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final SnapshotState4<Event<AdvanceChartEvent>> snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(blackWidowAdvancedChartDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                if (z) {
                    final AdvanceChartOrderDuxo<?, ?> advanceChartOrderDuxo2 = GetAdvanceChartOrderDuxo.getAdvanceChartOrderDuxo(BlackWidowAdvancedChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getActiveAccountNumber(), BlackWidowAdvancedChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getActiveInstrumentId(), BlackWidowAdvancedChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getActiveInstrumentType(), composerStartRestartGroup, 0);
                    final SnapshotState4<Event<AdvanceChartEvent>> snapshotState4CollectAsStateWithLifecycle42 = FlowExtKt.collectAsStateWithLifecycle(advanceChartOrderDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(advanceChartOrderDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    final SnackbarHostState snackbarHostState2 = (SnackbarHostState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    ChartContext chartContext2 = BlackWidowAdvancedChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getChartContext();
                    AdvanceChartOrderViewState advanceChartOrderViewStateBlackWidowAdvancedChartComposable$lambda$32 = BlackWidowAdvancedChartComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle2);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(chartContext2) | composerStartRestartGroup.changed(advanceChartOrderViewStateBlackWidowAdvancedChartComposable$lambda$32);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$6$lambda$5(snapshotState4CollectAsStateWithLifecycle, snapshotState4CollectAsStateWithLifecycle2);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        UserInteractionEventDescriptor userInteractionEventDescriptor2 = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.MOBILE_ADVANCED_CHARTS, screenSource, null, null, 12, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, BlackWidowAdvancedChartComposable$lambda$7((SnapshotState4) objRememberedValue2), null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16381, null), null, null, 53, null);
                        final Modifier modifier62 = modifier3;
                        final BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo52 = blackWidowAdvancedChartDuxo3;
                        final boolean z32 = z2;
                        AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor2, ComposableLambda3.rememberComposableLambda(-700815078, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt.BlackWidowAdvancedChartComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-700815078, i6, -1, "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposable.<anonymous> (BlackWidowAdvancedChartComposable.kt:114)");
                                }
                                BentoTheme4 direction = BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDirection();
                                final AdvanceChartOrderDuxo<?, ?> advanceChartOrderDuxo22 = advanceChartOrderDuxo2;
                                final BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo6 = blackWidowAdvancedChartDuxo52;
                                final SnackbarHostState snackbarHostState22 = snackbarHostState2;
                                final boolean z4 = z32;
                                final Function0<Unit> function0 = onBackPressed;
                                final Modifier modifier7 = modifier62;
                                final SnapshotState4<BlackWidowAdvancedChartViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                final EventLogger eventLogger = current22;
                                final SnapshotState4<Event<AdvanceChartEvent>> snapshotState42 = snapshotState4CollectAsStateWithLifecycle32;
                                final SnapshotState4<Event<AdvanceChartEvent>> snapshotState43 = snapshotState4CollectAsStateWithLifecycle42;
                                final SnapshotState4<? extends AdvanceChartOrderViewState> snapshotState44 = snapshotState4CollectAsStateWithLifecycle2;
                                BentoThemeOverlays.DirectionThemeOverlay(direction, ComposableLambda3.rememberComposableLambda(2080652340, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt.BlackWidowAdvancedChartComposable.1.1
                                    public final void invoke(Composer composer4, int i7) {
                                        int i8;
                                        final SnackbarHostState snackbarHostState3;
                                        boolean z5;
                                        int i9;
                                        boolean z6;
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2080652340, i7, -1, "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposable.<anonymous>.<anonymous> (BlackWidowAdvancedChartComposable.kt:115)");
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(companion2, WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, composer4, 6));
                                        AdvanceChartOrderDuxo<?, ?> advanceChartOrderDuxo3 = advanceChartOrderDuxo22;
                                        BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo7 = blackWidowAdvancedChartDuxo6;
                                        SnackbarHostState snackbarHostState4 = snackbarHostState22;
                                        boolean z7 = z4;
                                        Function0<Unit> function02 = function0;
                                        Modifier modifier8 = modifier7;
                                        SnapshotState4<BlackWidowAdvancedChartViewState> snapshotState45 = snapshotState4;
                                        EventLogger eventLogger2 = eventLogger;
                                        SnapshotState4<Event<AdvanceChartEvent>> snapshotState46 = snapshotState42;
                                        SnapshotState4<Event<AdvanceChartEvent>> snapshotState47 = snapshotState43;
                                        SnapshotState4<AdvanceChartOrderViewState> snapshotState48 = snapshotState44;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierWindowInsetsPadding);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        Event eventBlackWidowAdvancedChartComposable$lambda$1 = BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$1(snapshotState46);
                                        int i10 = AdvanceChartOrderDuxo.$stable;
                                        HandleAdvanceChartEvents.HandleAdvanceChartEvents(eventBlackWidowAdvancedChartComposable$lambda$1, advanceChartOrderDuxo3, blackWidowAdvancedChartDuxo7, snackbarHostState4, composer4, (i10 << 3) | 3072);
                                        Composer composer5 = composer4;
                                        HandleAdvanceChartEvents.HandleAdvanceChartEvents(BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$2(snapshotState47), advanceChartOrderDuxo3, blackWidowAdvancedChartDuxo7, snackbarHostState4, composer5, (i10 << 3) | 3072);
                                        composer5.startReplaceGroup(-1592323127);
                                        boolean z8 = true;
                                        if (z7) {
                                            i8 = i10;
                                            snackbarHostState3 = snackbarHostState4;
                                            z5 = z7;
                                            i9 = 0;
                                            z6 = true;
                                        } else {
                                            Modifier modifierZIndex = ZIndexModifier2.zIndex(companion2, 999.0f);
                                            if (BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(snapshotState45).getLoadingComplete() || BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(snapshotState45).getChartError()) {
                                                z8 = false;
                                            }
                                            i9 = 0;
                                            i8 = i10;
                                            snackbarHostState3 = snackbarHostState4;
                                            z5 = z7;
                                            z6 = true;
                                            AnimatedVisibilityKt.AnimatedVisibility(z8, modifierZIndex, (EnterTransition) null, EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(50, 0, null, 6, null), 0.0f, 2, null), (String) null, BlackWidowAdvancedChartComposable4.INSTANCE.m1748x1ec0074c(), composer4, 199728, 20);
                                            composer5 = composer4;
                                        }
                                        composer5.endReplaceGroup();
                                        int i11 = i9;
                                        InternalAdvancedChart.InternalAdvancedChart(blackWidowAdvancedChartDuxo7.getBwWebViewManager(), BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(snapshotState45), BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$3(snapshotState48), z5, ComposableLambda3.rememberComposableLambda(1813084414, z6, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt$BlackWidowAdvancedChartComposable$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                invoke(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer6, int i12) {
                                                if ((i12 & 3) == 2 && composer6.getSkipping()) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1813084414, i12, -1, "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlackWidowAdvancedChartComposable.kt:144)");
                                                }
                                                SnackbarHostKt.SnackbarHost(snackbarHostState3, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer6, BentoTheme.$stable).m21596getXxlargeD9Ej5fM(), 7, null), BlackWidowAdvancedChartComposable4.INSTANCE.m1747x95a70365(), composer6, 390, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer5, 54), function02, advanceChartOrderDuxo3, blackWidowAdvancedChartDuxo7, modifier8, composer5, (i8 << 18) | 24576, 0);
                                        BlackWidowAdvancedChartComposable.ChartScreenStates(BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(snapshotState45).getScreenState(), BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(snapshotState45), BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$3(snapshotState48), blackWidowAdvancedChartDuxo7, advanceChartOrderDuxo3, composer4, i8 << 12);
                                        UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                        Boolean boolValueOf = Boolean.valueOf(BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$0(snapshotState45).getLoadingComplete());
                                        composer4.startReplaceGroup(-1746271574);
                                        boolean zChanged2 = composer4.changed(snapshotState45) | composer4.changedInstance(eventLogger2) | composer4.changedInstance(userInteractionEventDescriptor22);
                                        Object objRememberedValue4 = composer4.rememberedValue();
                                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new BlackWidowAdvancedChartComposable3(eventLogger2, userInteractionEventDescriptor22, snapshotState45, null);
                                            composer4.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer4.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer4, i11);
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        blackWidowAdvancedChartDuxo4 = blackWidowAdvancedChartDuxo52;
                        modifier4 = modifier62;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
                blackWidowAdvancedChartDuxo4 = blackWidowAdvancedChartDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BlackWidowAdvancedChartComposable.BlackWidowAdvancedChartComposable$lambda$8(instrumentId, instrumentType, screenSource, onBackPressed, z, modifier4, blackWidowAdvancedChartDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegendAdvancedChartsContext BlackWidowAdvancedChartComposable$lambda$6$lambda$5(SnapshotState4 snapshotState4, SnapshotState4 snapshotState42) {
        return createLegendAdvanceChartContext(BlackWidowAdvancedChartComposable$lambda$0(snapshotState4).getChartContext(), BlackWidowAdvancedChartComposable$lambda$3(snapshotState42));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartScreenStates(final ChartScreenState chartScreenState, final BlackWidowAdvancedChartViewState blackWidowAdvancedChartViewState, final AdvanceChartOrderViewState advanceChartOrderViewState, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4, Composer composer, final int i) {
        int i2;
        final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks2;
        final AdvanceChartOrderDuxo4 advanceChartOrderDuxo42;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1333511661);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chartScreenState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(blackWidowAdvancedChartViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(advanceChartOrderViewState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(blackWidowAdvanceChartCallbacks) : composerStartRestartGroup.changedInstance(blackWidowAdvanceChartCallbacks) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(advanceChartOrderDuxo4) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1333511661, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.ChartScreenStates (BlackWidowAdvancedChartComposable.kt:187)");
            }
            if (chartScreenState instanceof InstrumentSearch) {
                composerStartRestartGroup.startReplaceGroup(1801970654);
                ChartSearchScreen.ChartSearchScreen(blackWidowAdvancedChartViewState.getSearchContentTypes(), blackWidowAdvanceChartCallbacks, null, composerStartRestartGroup, (i2 >> 6) & 112, 4);
                composerStartRestartGroup.endReplaceGroup();
                blackWidowAdvanceChartCallbacks2 = blackWidowAdvanceChartCallbacks;
                advanceChartOrderDuxo42 = advanceChartOrderDuxo4;
            } else if (chartScreenState instanceof SlideUp) {
                composerStartRestartGroup.startReplaceGroup(1802176401);
                SlideUpScreen.SlideUpScreen((SlideUp) chartScreenState, blackWidowAdvancedChartViewState.getSlideUpScreenState().getAddIndicatorScreenState(), blackWidowAdvancedChartViewState.getAvailableColorPickerColors(), blackWidowAdvanceChartCallbacks, advanceChartOrderDuxo4, composerStartRestartGroup, i2 & 64512);
                composerStartRestartGroup.endReplaceGroup();
                blackWidowAdvanceChartCallbacks2 = blackWidowAdvanceChartCallbacks;
                advanceChartOrderDuxo42 = advanceChartOrderDuxo4;
            } else {
                int i3 = i2;
                if (chartScreenState instanceof BottomSheet) {
                    composerStartRestartGroup.startReplaceGroup(1802594994);
                    composerStartRestartGroup.startMovableGroup(-1604419336, chartScreenState);
                    int i4 = i3 << 12;
                    ChartBottomSheetKt.ChartBottomSheet((BottomSheet) chartScreenState, advanceChartOrderViewState, blackWidowAdvancedChartViewState.getSettingsBottomSheetState(), blackWidowAdvancedChartViewState.getYAxisSection(), blackWidowAdvancedChartViewState.getChartUrl(), blackWidowAdvancedChartViewState.getSelectedTemplate(), blackWidowAdvancedChartViewState.getAvailableTemplates(), blackWidowAdvanceChartCallbacks, advanceChartOrderDuxo4, blackWidowAdvancedChartViewState.getActiveInstrumentType().isFuturesInstrument(), null, composerStartRestartGroup, ((i3 >> 3) & 112) | (29360128 & i4) | (i4 & 234881024), 0, 1024);
                    blackWidowAdvanceChartCallbacks2 = blackWidowAdvanceChartCallbacks;
                    advanceChartOrderDuxo42 = advanceChartOrderDuxo4;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endMovableGroup();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    blackWidowAdvanceChartCallbacks2 = blackWidowAdvanceChartCallbacks;
                    advanceChartOrderDuxo42 = advanceChartOrderDuxo4;
                    if (chartScreenState instanceof AutoSendUpsell) {
                        composerStartRestartGroup.startReplaceGroup(1803395414);
                        Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE);
                        SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = ((i3 & 7168) == 2048 || ((i3 & 4096) != 0 && composerStartRestartGroup.changedInstance(blackWidowAdvanceChartCallbacks2))) | composerStartRestartGroup.changedInstance(advanceChartOrderDuxo42);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BlackWidowAdvancedChartComposable.ChartScreenStates$lambda$10$lambda$9(advanceChartOrderDuxo42, blackWidowAdvanceChartCallbacks2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue, modifierStatusBarsPadding, false, sheetStateRememberModalBottomSheetState, null, 0L, ComposableLambda3.rememberComposableLambda(2025227675, true, new C105452(blackWidowAdvanceChartCallbacks2, chartScreenState), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 52);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1804483917);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            blackWidowAdvanceChartCallbacks2 = blackWidowAdvanceChartCallbacks;
            advanceChartOrderDuxo42 = advanceChartOrderDuxo4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks3 = blackWidowAdvanceChartCallbacks2;
            final AdvanceChartOrderDuxo4 advanceChartOrderDuxo43 = advanceChartOrderDuxo42;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlackWidowAdvancedChartComposable.ChartScreenStates$lambda$11(chartScreenState, blackWidowAdvancedChartViewState, advanceChartOrderViewState, blackWidowAdvanceChartCallbacks3, advanceChartOrderDuxo43, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartScreenStates$lambda$10$lambda$9(AdvanceChartOrderDuxo4 advanceChartOrderDuxo4, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks) {
        advanceChartOrderDuxo4.handleGenericAdvanceChartOrderAction(GenericAdvanceChartOrderAction2.INSTANCE);
        BlackWidowAdvanceChartCallbacks.DefaultImpls.advanceScreenState$default(blackWidowAdvanceChartCallbacks, null, 1, null);
        return Unit.INSTANCE;
    }

    /* compiled from: BlackWidowAdvancedChartComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt$ChartScreenStates$2 */
    static final class C105452 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ BlackWidowAdvanceChartCallbacks $chartCallbacks;
        final /* synthetic */ ChartScreenState $screenState;

        C105452(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, ChartScreenState chartScreenState) {
            this.$chartCallbacks = blackWidowAdvanceChartCallbacks;
            this.$screenState = chartScreenState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025227675, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.ChartScreenStates.<anonymous> (BlackWidowAdvancedChartComposable.kt:232)");
            }
            composer.startReplaceGroup(-1746271574);
            int i3 = i2 & 14;
            boolean z = true;
            boolean zChangedInstance = composer.changedInstance(this.$chartCallbacks) | composer.changedInstance(this.$screenState) | (i3 == 4 || ((i2 & 8) != 0 && composer.changedInstance(RhModalBottomSheet)));
            final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks = this.$chartCallbacks;
            final ChartScreenState chartScreenState = this.$screenState;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt$ChartScreenStates$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlackWidowAdvancedChartComposable.C105452.invoke$lambda$1$lambda$0(blackWidowAdvanceChartCallbacks, chartScreenState, RhModalBottomSheet);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            if (i3 != 4 && ((i2 & 8) == 0 || !composer.changedInstance(RhModalBottomSheet))) {
                z = false;
            }
            Object objRememberedValue2 = composer.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartComposableKt$ChartScreenStates$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlackWidowAdvancedChartComposable.C105452.invoke$lambda$3$lambda$2(RhModalBottomSheet);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AutoSendUpsellBottomSheet.AutoSendUpsellBottomSheet(function0, (Function0) objRememberedValue2, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, ChartScreenState chartScreenState, RhModalBottomSheet5 rhModalBottomSheet5) {
            blackWidowAdvanceChartCallbacks.setScreenState(new IdentiAgreement(((AutoSendUpsell) chartScreenState).getIdentiAgreementType(), true, true), false);
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }
    }
}
