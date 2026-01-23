package com.robinhood.android.options.lib.simulatedreturn.chart;

import android.view.View;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.ChartWithOverlays;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.charts.overlay.Overlays2;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartLaunchMode;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartEvent;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionsSimulatedReturnChart.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aÁ\u0001\u0010\u001d\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00040\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00040\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u0011H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006&²\u0006\f\u0010\u000b\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\u0014\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\"8\nX\u008a\u0084\u0002²\u0006\u0014\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010$\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010%\u001a\u00020#8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartLaunchMode;", "launchMode", "Landroidx/compose/ui/Modifier;", "modifier", "", "OptionsSimulatedReturnChart", "(Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartLaunchMode;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "activityErrorHandler", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartViewState;", "chart", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartEvent;", "event", "", "usePreTradeStyle", "Lkotlin/Function1;", "", "onEstimatedContractPriceUpdated", "Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "onErrorStateUpdated", "Lcom/robinhood/android/charts/model/Point;", "onScrubPointUpdated", "Lkotlin/Function0;", "onScrubStopped", "errorComponent", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "headerComponent", "OptionsSimulatedReturnBaseChart", "(Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartViewState;Lcom/robinhood/android/udf/event/Event;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "OptionsSimulatedReturnChartDivider", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartViewState;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartViewState;", "", "parentWidthAfterPadding", "chartWidth", "lib-options-simulated-return_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnChartKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnBaseChart$lambda$27(ActivityErrorHandler activityErrorHandler, OptionsSimulatedChartViewState optionsSimulatedChartViewState, Event event, boolean z, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function3 function3, Modifier modifier, Function3 function32, int i, int i2, int i3, Composer composer, int i4) {
        OptionsSimulatedReturnBaseChart(activityErrorHandler, optionsSimulatedChartViewState, event, z, function1, function12, function13, function0, function3, modifier, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnBaseChart$lambda$47(ActivityErrorHandler activityErrorHandler, OptionsSimulatedChartViewState optionsSimulatedChartViewState, Event event, boolean z, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function3 function3, Modifier modifier, Function3 function32, int i, int i2, int i3, Composer composer, int i4) {
        OptionsSimulatedReturnBaseChart(activityErrorHandler, optionsSimulatedChartViewState, event, z, function1, function12, function13, function0, function3, modifier, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnChart$lambda$22(OptionsSimulatedChartLaunchMode optionsSimulatedChartLaunchMode, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionsSimulatedReturnChart(optionsSimulatedChartLaunchMode, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnChartDivider$lambda$48(Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionsSimulatedReturnChartDivider(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsSimulatedReturnChart(final OptionsSimulatedChartLaunchMode launchMode, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Composer composerStartRestartGroup = composer.startRestartGroup(-44884798);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(launchMode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-44884798, i3, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChart (OptionsSimulatedReturnChart.kt:40)");
                }
                if (launchMode instanceof OptionsSimulatedChartLaunchMode.ProfitAndLoss) {
                    modifier3 = modifier4;
                    if (!(launchMode instanceof OptionsSimulatedChartLaunchMode.SimulatedReturn)) {
                        composerStartRestartGroup.startReplaceGroup(-184609374);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-1425937095);
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsSimulatedReturnChartDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$$inlined$duxo$2
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$$inlined$duxo$2.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    final OptionsSimulatedReturnChartDuxo optionsSimulatedReturnChartDuxo = (OptionsSimulatedReturnChartDuxo) baseDuxo;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(optionsSimulatedReturnChartDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final StateFlow<Event<OptionsSimulatedReturnChartEvent>> eventFlow = optionsSimulatedReturnChartDuxo.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$$inlined$collectEventAsStateWithLifecycle$2

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$$inlined$collectEventAsStateWithLifecycle$2$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$$inlined$collectEventAsStateWithLifecycle$2$2", m3645f = "OptionsSimulatedReturnChart.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$$inlined$collectEventAsStateWithLifecycle$2$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Event event = (Event) obj;
                                    if ((event != null ? event.getData() : null) instanceof OptionsSimulatedReturnChartEvent) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                            Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    Event<OptionsSimulatedReturnChartEvent> value = eventFlow.getValue();
                    Event<OptionsSimulatedReturnChartEvent> event = value;
                    if (!((event != null ? event.getData() : null) instanceof OptionsSimulatedReturnChartEvent)) {
                        value = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    OptionsSimulatedChartLaunchMode.SimulatedReturn simulatedReturn = (OptionsSimulatedChartLaunchMode.SimulatedReturn) launchMode;
                    Object[] objArr = {simulatedReturn.getAccountNumber(), simulatedReturn.getType(), simulatedReturn.getLoggingState(), simulatedReturn.getChartBundle(), simulatedReturn.getSliderPosition(), simulatedReturn.getSimulatedReturnLaunchMode(), Boolean.valueOf(simulatedReturn.getUsePreTradeStyle()), Boolean.valueOf(simulatedReturn.isFullyExpanded())};
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(optionsSimulatedReturnChartDuxo) | composerStartRestartGroup.changedInstance(simulatedReturn);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$2$1$1(optionsSimulatedReturnChartDuxo, simulatedReturn, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    Boolean boolValueOf = Boolean.valueOf(simulatedReturn.isBottomSheetHiddenOrNull());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(optionsSimulatedReturnChartDuxo) | composerStartRestartGroup.changedInstance(simulatedReturn);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$2$2$1(optionsSimulatedReturnChartDuxo, simulatedReturn, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                    ActivityErrorHandler activityErrorHandler = simulatedReturn.getActivityErrorHandler();
                    OptionsSimulatedReturnChartViewState optionsSimulatedReturnChartViewStateOptionsSimulatedReturnChart$lambda$11 = OptionsSimulatedReturnChart$lambda$11(snapshotState4CollectAsStateWithLifecycle);
                    Event<OptionsSimulatedReturnChartEvent> eventOptionsSimulatedReturnChart$lambda$12 = OptionsSimulatedReturnChart$lambda$12(snapshotState4CollectAsStateWithLifecycle2);
                    boolean usePreTradeStyle = simulatedReturn.getUsePreTradeStyle();
                    Function1<Double, Unit> onEstimatedContractPriceUpdated = simulatedReturn.getOnEstimatedContractPriceUpdated();
                    Function1<OptionsSimulatedReturnErrorState, Unit> onErrorStateUpdated = simulatedReturn.getOnErrorStateUpdated();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(optionsSimulatedReturnChartDuxo);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$2$3$1(optionsSimulatedReturnChartDuxo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    KFunction kFunction = (KFunction) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(optionsSimulatedReturnChartDuxo);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChart$lambda$21$lambda$18$lambda$17(optionsSimulatedReturnChartDuxo);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifier3, interactionSource3, null, false, null, null, (Function0) objRememberedValue6, 28, null);
                    Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> headerComponent = simulatedReturn.getHeaderComponent();
                    Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> errorComponent = simulatedReturn.getErrorComponent();
                    Function1 function1 = (Function1) kFunction;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(optionsSimulatedReturnChartDuxo);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance6 || objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChart$lambda$21$lambda$20$lambda$19(optionsSimulatedReturnChartDuxo);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    OptionsSimulatedReturnBaseChart(activityErrorHandler, optionsSimulatedReturnChartViewStateOptionsSimulatedReturnChart$lambda$11, eventOptionsSimulatedReturnChart$lambda$12, usePreTradeStyle, onEstimatedContractPriceUpdated, onErrorStateUpdated, function1, (Function0) objRememberedValue7, errorComponent, modifierM4891clickableO2vRcR0$default, headerComponent, composerStartRestartGroup, ActivityErrorHandler.$stable, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1427913283);
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory2 = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsProfitAndLossChartDuxo.class), current2, (String) null, factoryCreateViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo2 = (BaseDuxo) viewModel2;
                    final Lifecycle lifecycle2 = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(baseDuxo2) | composerStartRestartGroup.changedInstance(lifecycle2);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance7 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo2);
                                lifecycle2.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle3 = lifecycle2;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle3.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue8, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    final OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo = (OptionsProfitAndLossChartDuxo) baseDuxo2;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(optionsProfitAndLossChartDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final StateFlow<Event<OptionsSimulatedReturnChartEvent>> eventFlow2 = optionsProfitAndLossChartDuxo.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "OptionsSimulatedReturnChart.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Event event = (Event) obj;
                                    if ((event != null ? event.getData() : null) instanceof OptionsSimulatedReturnChartEvent) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                            Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    Event<OptionsSimulatedReturnChartEvent> value2 = eventFlow2.getValue();
                    Event<OptionsSimulatedReturnChartEvent> event2 = value2;
                    if (!((event2 != null ? event2.getData() : null) instanceof OptionsSimulatedReturnChartEvent)) {
                        value2 = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    OptionsSimulatedChartLaunchMode.ProfitAndLoss profitAndLoss = (OptionsSimulatedChartLaunchMode.ProfitAndLoss) launchMode;
                    Object[] objArr2 = {profitAndLoss.getAccountNumber(), profitAndLoss.getLoggingState(), profitAndLoss.getSliderPosition(), profitAndLoss.getProfitLossLaunchMode(), profitAndLoss.getChartBundle(), Boolean.valueOf(profitAndLoss.isFullyExpanded())};
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance8 = composerStartRestartGroup.changedInstance(optionsProfitAndLossChartDuxo) | composerStartRestartGroup.changedInstance(profitAndLoss);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance8 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$1$1$1(optionsProfitAndLossChartDuxo, profitAndLoss, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, 0);
                    Boolean boolValueOf2 = Boolean.valueOf(profitAndLoss.isBottomSheetHiddenOrNull());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance9 = composerStartRestartGroup.changedInstance(optionsProfitAndLossChartDuxo) | composerStartRestartGroup.changedInstance(profitAndLoss);
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance9 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$1$2$1(optionsProfitAndLossChartDuxo, profitAndLoss, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 0);
                    OptionsProfitAndLossChartViewState optionsProfitAndLossChartViewStateOptionsSimulatedReturnChart$lambda$0 = OptionsSimulatedReturnChart$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
                    Event<OptionsSimulatedReturnChartEvent> eventOptionsSimulatedReturnChart$lambda$1 = OptionsSimulatedReturnChart$lambda$1(snapshotState4CollectAsStateWithLifecycle4);
                    boolean usePreTradeStyle2 = profitAndLoss.getUsePreTradeStyle();
                    Function1<Double, Unit> onEstimatedContractPriceUpdated2 = profitAndLoss.getOnEstimatedContractPriceUpdated();
                    Function1<OptionsSimulatedReturnErrorState, Unit> onErrorStateUpdated2 = profitAndLoss.getOnErrorStateUpdated();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance10 = composerStartRestartGroup.changedInstance(optionsProfitAndLossChartDuxo);
                    Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance10 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$1$3$1(optionsProfitAndLossChartDuxo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    KFunction kFunction2 = (KFunction) objRememberedValue11;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue12 == companion2.getEmpty()) {
                        objRememberedValue12 = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue12;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance11 = composerStartRestartGroup.changedInstance(optionsProfitAndLossChartDuxo);
                    Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance11 || objRememberedValue13 == companion2.getEmpty()) {
                        objRememberedValue13 = new Function0() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChart$lambda$10$lambda$7$lambda$6(optionsProfitAndLossChartDuxo);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifier5, interactionSource32, null, false, null, null, (Function0) objRememberedValue13, 28, null);
                    modifier3 = modifier5;
                    Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> headerComponent2 = profitAndLoss.getHeaderComponent();
                    Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> errorComponent2 = profitAndLoss.getErrorComponent();
                    Function1 function12 = (Function1) kFunction2;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance12 = composerStartRestartGroup.changedInstance(optionsProfitAndLossChartDuxo);
                    Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance12 || objRememberedValue14 == companion2.getEmpty()) {
                        objRememberedValue14 = new Function0() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChart$lambda$10$lambda$9$lambda$8(optionsProfitAndLossChartDuxo);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    OptionsSimulatedReturnBaseChart(null, optionsProfitAndLossChartViewStateOptionsSimulatedReturnChart$lambda$0, eventOptionsSimulatedReturnChart$lambda$1, usePreTradeStyle2, onEstimatedContractPriceUpdated2, onErrorStateUpdated2, function12, (Function0) objRememberedValue14, errorComponent2, modifierM4891clickableO2vRcR0$default2, headerComponent2, composerStartRestartGroup, 6, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Unit unit2 = Unit.INSTANCE;
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChart$lambda$22(launchMode, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (launchMode instanceof OptionsSimulatedChartLaunchMode.ProfitAndLoss) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnChart$lambda$10$lambda$9$lambda$8(OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo) {
        optionsProfitAndLossChartDuxo.onScrubStopped();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnChart$lambda$10$lambda$7$lambda$6(OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo) {
        OptionsProfitAndLossChartDuxo.resetScrubState$default(optionsProfitAndLossChartDuxo, false, 1, null);
        return Unit.INSTANCE;
    }

    private static final OptionsProfitAndLossChartViewState OptionsSimulatedReturnChart$lambda$0(SnapshotState4<OptionsProfitAndLossChartViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<OptionsSimulatedReturnChartEvent> OptionsSimulatedReturnChart$lambda$1(SnapshotState4<Event<OptionsSimulatedReturnChartEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final OptionsSimulatedReturnChartViewState OptionsSimulatedReturnChart$lambda$11(SnapshotState4<OptionsSimulatedReturnChartViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<OptionsSimulatedReturnChartEvent> OptionsSimulatedReturnChart$lambda$12(SnapshotState4<Event<OptionsSimulatedReturnChartEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnChart$lambda$21$lambda$20$lambda$19(OptionsSimulatedReturnChartDuxo optionsSimulatedReturnChartDuxo) {
        optionsSimulatedReturnChartDuxo.onScrubStopped();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnChart$lambda$21$lambda$18$lambda$17(OptionsSimulatedReturnChartDuxo optionsSimulatedReturnChartDuxo) {
        optionsSimulatedReturnChartDuxo.resetScrubState();
        return Unit.INSTANCE;
    }

    public static final void OptionsSimulatedReturnBaseChart(final ActivityErrorHandler activityErrorHandler, final OptionsSimulatedChartViewState chart, final Event<OptionsSimulatedReturnChartEvent> event, final boolean z, final Function1<? super Double, Unit> onEstimatedContractPriceUpdated, final Function1<? super OptionsSimulatedReturnErrorState, Unit> onErrorStateUpdated, final Function1<? super Point, Unit> onScrubPointUpdated, final Function0<Unit> onScrubStopped, final Function3<? super OptionsSimulatedReturnErrorState, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, final Function3<? super OptionsSimulatedChartHeaderState, ? super Composer, ? super Integer, Unit> headerComponent, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function3<? super OptionsSimulatedChartHeaderState, ? super Composer, ? super Integer, Unit> function32;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final SnapshotState snapshotState;
        Composer composer2;
        EventConsumer<OptionsSimulatedReturnChartEvent> eventConsumerInvoke;
        EventConsumer<OptionsSimulatedReturnChartEvent> eventConsumerInvoke2;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(onEstimatedContractPriceUpdated, "onEstimatedContractPriceUpdated");
        Intrinsics.checkNotNullParameter(onErrorStateUpdated, "onErrorStateUpdated");
        Intrinsics.checkNotNullParameter(onScrubPointUpdated, "onScrubPointUpdated");
        Intrinsics.checkNotNullParameter(onScrubStopped, "onScrubStopped");
        Intrinsics.checkNotNullParameter(headerComponent, "headerComponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-158459993);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? composerStartRestartGroup.changed(activityErrorHandler) : composerStartRestartGroup.changedInstance(activityErrorHandler) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? composerStartRestartGroup.changed(chart) : composerStartRestartGroup.changedInstance(chart) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(event) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onEstimatedContractPriceUpdated) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onErrorStateUpdated) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onScrubPointUpdated) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onScrubStopped) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 67108864 : 33554432;
        }
        int i6 = i3 & 512;
        if (i6 != 0) {
            i4 |= 805306368;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
            }
        }
        if ((i3 & 1024) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (composerStartRestartGroup.changedInstance(headerComponent) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            function32 = headerComponent;
        } else {
            Modifier modifier3 = i6 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-158459993, i4, i5, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnBaseChart (OptionsSimulatedReturnChart.kt:164)");
            }
            Double estimatedContractPrice = chart.getEstimatedContractPrice();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i7 = i4 & 112;
            int i8 = i5;
            boolean z2 = (i7 == 32 || ((i4 & 64) != 0 && composerStartRestartGroup.changedInstance(chart))) | ((i4 & 57344) == 16384);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C23282xfaa9a906(onEstimatedContractPriceUpdated, chart, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(estimatedContractPrice, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            OptionsSimulatedReturnErrorState errorState = chart.getErrorState();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z3 = ((458752 & i4) == 131072) | (i7 == 32 || ((i4 & 64) != 0 && composerStartRestartGroup.changedInstance(chart)));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new C23283xfaa9acc7(onErrorStateUpdated, chart, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(errorState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            final View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            if (event != null) {
                if ((event.getData() instanceof OptionsSimulatedReturnChartEvent.ScrubberHapticFeedback) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnBaseChart$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m16944invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m16944invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            view.performHapticFeedback(1);
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            }
            if (event != null) {
                if ((event.getData() instanceof OptionsSimulatedReturnChartEvent.GenericErrorEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnBaseChart$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m16945invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m16945invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            OptionsSimulatedReturnChartEvent.GenericErrorEvent genericErrorEvent = (OptionsSimulatedReturnChartEvent.GenericErrorEvent) event.getData();
                            ActivityErrorHandler activityErrorHandler2 = activityErrorHandler;
                            if (activityErrorHandler2 != null) {
                                AbsErrorHandler.handleError$default(activityErrorHandler2, genericErrorEvent.getError(), false, 2, null);
                            }
                        }
                    });
                }
                Unit unit2 = Unit.INSTANCE;
            }
            OptionsSimulatedReturnErrorState errorState2 = chart.getErrorState();
            composerStartRestartGroup.startReplaceGroup(-1956158480);
            if (z && errorState2 != null && function3 != null) {
                function3.invoke(errorState2, composerStartRestartGroup, Integer.valueOf((i4 >> 21) & 112));
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionsSimulatedReturnChartKt.OptionsSimulatedReturnBaseChart$lambda$27(activityErrorHandler, chart, event, z, onEstimatedContractPriceUpdated, onErrorStateUpdated, onScrubPointUpdated, onScrubStopped, function3, modifier4, headerComponent, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function32 = headerComponent;
            modifier2 = modifier3;
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            function32.invoke(chart.getHeaderState(), composerStartRestartGroup, Integer.valueOf((i8 << 3) & 112));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = new Measurer2(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final Measurer2 measurer2 = (Measurer2) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion3.getEmpty()) {
                objRememberedValue4 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion3.getEmpty()) {
                objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion3.getEmpty()) {
                objRememberedValue6 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion3.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue7;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
            final int i9 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            boolean zChanged = zChangedInstance | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue8 == companion3.getEmpty()) {
                objRememberedValue8 = new MeasurePolicy() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnBaseChart$lambda$46$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i10);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i10);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i10);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i10);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        snapshotState3.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i9);
                        snapshotState2.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnBaseChart$lambda$46$$inlined$ConstraintLayout$2.1
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
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                snapshotState = snapshotState2;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                snapshotState = snapshotState2;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion3.getEmpty()) {
                objRememberedValue9 = new Function0<Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnBaseChart$lambda$46$$inlined$ConstraintLayout$3
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
                        snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            final Function0 function0 = (Function0) objRememberedValue9;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue10 == companion3.getEmpty()) {
                objRememberedValue10 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnBaseChart$lambda$46$$inlined$ConstraintLayout$4
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
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            composer2 = composerStartRestartGroup;
            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierWeight$default, false, (Function1) objRememberedValue10, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnBaseChart$lambda$46$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i10) {
                    boolean z4;
                    if ((i10 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i10, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    snapshotState3.setValue(Unit.INSTANCE);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer3.startReplaceGroup(-714496529);
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                    composer3.startReplaceGroup(1849434622);
                    Object objRememberedValue11 = composer3.rememberedValue();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objRememberedValue11 == companion4.getEmpty()) {
                        objRememberedValue11 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                        composer3.updateRememberedValue(objRememberedValue11);
                    }
                    SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue11;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(1849434622);
                    Object objRememberedValue12 = composer3.rememberedValue();
                    if (objRememberedValue12 == companion4.getEmpty()) {
                        objRememberedValue12 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                        composer3.updateRememberedValue(objRememberedValue12);
                    }
                    SnapshotFloatState2 snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue12;
                    composer3.endReplaceGroup();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i11 = BentoTheme.$stable;
                    float fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composer3, i11).m21592getMediumD9Ej5fM();
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    composer3.startReplaceGroup(5004770);
                    boolean zChanged2 = composer3.changed(constraintLayoutBaseScope4Component2);
                    Object objRememberedValue13 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue13 == companion4.getEmpty()) {
                        objRememberedValue13 = new C23284xd491f825(constraintLayoutBaseScope4Component2);
                        composer3.updateRememberedValue(objRememberedValue13);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope2.constrainAs(companion5, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue13), fM21592getMediumD9Ej5fM, 0.0f, fM21592getMediumD9Ej5fM, bentoTheme.getSpacing(composer3, i11).m21593getSmallD9Ej5fM(), 2, null);
                    composer3.startReplaceGroup(5004770);
                    Object objRememberedValue14 = composer3.rememberedValue();
                    if (objRememberedValue14 == companion4.getEmpty()) {
                        objRememberedValue14 = new C23286xd491fbe6(snapshotFloatState2);
                        composer3.updateRememberedValue(objRememberedValue14);
                    }
                    composer3.endReplaceGroup();
                    Overlays2.Overlays(OnRemeasuredModifier2.onSizeChanged(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue14), CollectionsKt.listOfNotNull(chart.getDateLabel(snapshotFloatState22.getFloatValue(), snapshotFloatState2.getFloatValue(), composer3, 0)), composer3, Overlays.$stable << 3, 0);
                    composer3.startReplaceGroup(-1746271574);
                    boolean zChanged3 = composer3.changed(constraintLayoutBaseScope4Component1) | composer3.changed(constraintLayoutBaseScope4Component3) | composer3.changed(z);
                    Object objRememberedValue15 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue15 == companion4.getEmpty()) {
                        objRememberedValue15 = new C23287xd491ffa7(constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component3, z);
                        composer3.updateRememberedValue(objRememberedValue15);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion5, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue15);
                    if (z) {
                        z4 = false;
                        modifierConstrainAs = Alpha.alpha(modifierConstrainAs, 0.0f);
                    } else {
                        z4 = false;
                    }
                    OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChartDivider(modifierConstrainAs, composer3, 0, 0);
                    composer3.startReplaceGroup(-1746271574);
                    boolean zChanged4 = composer3.changed(constraintLayoutBaseScope4Component2) | composer3.changed(constraintLayoutBaseScope4Component6) | composer3.changed(constraintLayoutBaseScope4Component5);
                    Object objRememberedValue16 = composer3.rememberedValue();
                    if (zChanged4 || objRememberedValue16 == companion4.getEmpty()) {
                        objRememberedValue16 = new C23288xd4920729(constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component6, constraintLayoutBaseScope4Component5);
                        composer3.updateRememberedValue(objRememberedValue16);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope2.constrainAs(companion5, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue16), fM21592getMediumD9Ej5fM, 0.0f, 0.0f, 0.0f, 14, null);
                    composer3.startReplaceGroup(5004770);
                    Object objRememberedValue17 = composer3.rememberedValue();
                    if (objRememberedValue17 == companion4.getEmpty()) {
                        objRememberedValue17 = new C23289xd4920aea(snapshotFloatState22);
                        composer3.updateRememberedValue(objRememberedValue17);
                    }
                    composer3.endReplaceGroup();
                    ChartWithOverlays.ChartWithOverlays(OnRemeasuredModifier2.onSizeChanged(modifierM5146paddingqDBjuR0$default2, (Function1) objRememberedValue17), chart.getAnnotations(z, composer3, 0), chart.getOverlays(composer3, 0), 0L, onScrubPointUpdated, onScrubStopped, false, composer3, 0, 72);
                    composer3.startReplaceGroup(-1746271574);
                    boolean zChanged5 = composer3.changed(constraintLayoutBaseScope4Component3) | composer3.changed(constraintLayoutBaseScope4Component4) | composer3.changed(z);
                    Object objRememberedValue18 = composer3.rememberedValue();
                    if (zChanged5 || objRememberedValue18 == companion4.getEmpty()) {
                        objRememberedValue18 = new C23290xd4920eab(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4, z);
                        composer3.updateRememberedValue(objRememberedValue18);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(companion5, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue18);
                    if (z) {
                        modifierConstrainAs2 = Alpha.alpha(modifierConstrainAs2, 0.0f);
                    }
                    OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChartDivider(modifierConstrainAs2, composer3, 0, 0);
                    composer3.startReplaceGroup(-1633490746);
                    boolean zChanged6 = composer3.changed(constraintLayoutBaseScope4Component6) | composer3.changed(constraintLayoutBaseScope4Component3);
                    Object objRememberedValue19 = composer3.rememberedValue();
                    if (zChanged6 || objRememberedValue19 == companion4.getEmpty()) {
                        objRememberedValue19 = new C23291xd492162d(constraintLayoutBaseScope4Component6, constraintLayoutBaseScope4Component3);
                        composer3.updateRememberedValue(objRememberedValue19);
                    }
                    composer3.endReplaceGroup();
                    float f = 12;
                    OptionsSimulatedReturnChartAxis2.OptionsSimulatedReturnChartAxis(chart.getXAxis(z, composer3, 0), z, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope2.constrainAs(companion5, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue19), fM21592getMediumD9Ej5fM, C2002Dp.m7995constructorimpl(f), 0.0f, C2002Dp.m7995constructorimpl(f), 4, null), composer3, 0, 0);
                    composer3.startReplaceGroup(5004770);
                    boolean zChanged7 = composer3.changed(constraintLayoutBaseScope4Component3);
                    Object objRememberedValue20 = composer3.rememberedValue();
                    if (zChanged7 || objRememberedValue20 == companion4.getEmpty()) {
                        objRememberedValue20 = new C23285xbdad3825(constraintLayoutBaseScope4Component3);
                        composer3.updateRememberedValue(objRememberedValue20);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierConstrainAs3 = constraintLayoutScope2.constrainAs(companion5, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue20);
                    if (!z) {
                        modifierConstrainAs3 = Clip.clipToBounds(modifierConstrainAs3);
                    }
                    OptionsSimulatedReturnChartAxis2.OptionsSimulatedReturnChartAxis(chart.getYAxis(z, composer3, 0), z, PaddingKt.m5146paddingqDBjuR0$default(modifierConstrainAs3, bentoTheme.getSpacing(composer3, i11).m21593getSmallD9Ej5fM(), 0.0f, C2002Dp.m7995constructorimpl(20), 0.0f, 10, null), composer3, 0, 0);
                    composer3.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(function0, composer3, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), measurePolicy, composer2, 48, 0);
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1942349615);
            if (!z) {
                OptionsSimulatedReturnChartDivider(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composer2, 6, 0);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier5 = modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final Function3<? super OptionsSimulatedChartHeaderState, ? super Composer, ? super Integer, Unit> function33 = function32;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsSimulatedReturnChartKt.OptionsSimulatedReturnBaseChart$lambda$47(activityErrorHandler, chart, event, z, onEstimatedContractPriceUpdated, onErrorStateUpdated, onScrubPointUpdated, onScrubStopped, function3, modifier5, function33, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionsSimulatedReturnChartDivider(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1618869049);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1618869049, i3, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDivider (OptionsSimulatedReturnChart.kt:301)");
            }
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifier2, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl((float) 1.5d), composerStartRestartGroup, (i3 & 14) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChartDivider$lambda$48(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
