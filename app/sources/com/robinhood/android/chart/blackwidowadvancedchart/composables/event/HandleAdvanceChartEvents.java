package com.robinhood.android.chart.blackwidowadvancedchart.composables.event;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartEvent;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.ChartAlert;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.ChartSnackbar;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.HapticEvent;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.LaunchActivity;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.LaunchDeeplink;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.SetChartScreenState;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.HapticEvents;
import com.robinhood.android.chart.equityadvancedchart.HandleEquityOrderCheckAlerts;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HandleAdvanceChartEvents.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"HandleAdvanceChartEvents", "", "events", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartEvent;", "orderCallbacks", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/IAdvanceChartOrderDuxo;", "chartDuxo", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDuxo;", "snackbarHostState", "Landroidx/compose/material3/SnackbarHostState;", "(Lcom/robinhood/android/udf/event/Event;Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/IAdvanceChartOrderDuxo;Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDuxo;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleAdvanceChartEventsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class HandleAdvanceChartEvents {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HandleAdvanceChartEvents$lambda$8(Event event, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4, BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, SnackbarHostState snackbarHostState, int i, Composer composer, int i2) {
        HandleAdvanceChartEvents(event, advanceChartOrderDuxo4, blackWidowAdvancedChartDuxo, snackbarHostState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HandleAdvanceChartEvents(final Event<AdvanceChartEvent> event, final AdvanceChartOrderDuxo4 orderCallbacks, final BlackWidowAdvancedChartDuxo chartDuxo, final SnackbarHostState snackbarHostState, Composer composer, final int i) {
        int i2;
        Event<AdvanceChartEvent> event2;
        final SnackbarHostState snackbarHostState2;
        EventConsumer<AdvanceChartEvent> eventConsumerInvoke;
        EventConsumer<AdvanceChartEvent> eventConsumerInvoke2;
        EventConsumer<AdvanceChartEvent> eventConsumerInvoke3;
        EventConsumer<AdvanceChartEvent> eventConsumerInvoke4;
        EventConsumer<AdvanceChartEvent> eventConsumerInvoke5;
        EventConsumer<AdvanceChartEvent> eventConsumerInvoke6;
        Intrinsics.checkNotNullParameter(orderCallbacks, "orderCallbacks");
        Intrinsics.checkNotNullParameter(chartDuxo, "chartDuxo");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2954449);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(event) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(orderCallbacks) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(chartDuxo) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(snackbarHostState) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            event2 = event;
            snackbarHostState2 = snackbarHostState;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2954449, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleAdvanceChartEvents (HandleAdvanceChartEvents.kt:33)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            final View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            if (event != null && (event.getData() instanceof LaunchActivity) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleAdvanceChartEventsKt$HandleAdvanceChartEvents$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m11880invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m11880invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Navigator.DefaultImpls.startActivity$default(navigator, context, ((LaunchActivity) event.getData()).getIntentKey(), null, false, null, null, 60, null);
                    }
                });
            }
            if (event != null && (event.getData() instanceof LaunchDeeplink) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleAdvanceChartEventsKt$HandleAdvanceChartEvents$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m11881invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m11881invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((LaunchDeeplink) event.getData()).getUri(), Boolean.FALSE, null, false, null, 40, null);
                    }
                });
            }
            if (event != null && (event.getData() instanceof ChartSnackbar) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleAdvanceChartEventsKt$HandleAdvanceChartEvents$$inlined$consumeIfType$3
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m11882invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m11882invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HandleAdvanceChartEvents2(snackbarHostState, (ChartSnackbar) event.getData(), null), 3, null);
                    }
                });
            }
            if (event != null && (event.getData() instanceof SetChartScreenState) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleAdvanceChartEventsKt$HandleAdvanceChartEvents$$inlined$consumeIfType$4
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m11883invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m11883invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        SetChartScreenState setChartScreenState = (SetChartScreenState) event.getData();
                        chartDuxo.setScreenState(setChartScreenState.getScreenState(), setChartScreenState.getAdvanceScreenState());
                    }
                });
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            if (event != null && (event.getData() instanceof ChartAlert) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleAdvanceChartEventsKt$HandleAdvanceChartEvents$$inlined$consumeIfType$5
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m11884invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.robinhood.android.chart.blackwidowadvancedchart.duxo.ChartAlert] */
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m11884invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        objectRef.element = (ChartAlert) event.getData();
                    }
                });
            }
            EffectsKt.LaunchedEffect(objectRef.element, new C107496(objectRef, context, navigator, null), composerStartRestartGroup, ChartAlert.$stable);
            if (event != null && (event.getData() instanceof HapticEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleAdvanceChartEventsKt$HandleAdvanceChartEvents$$inlined$consumeIfType$6
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m11885invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m11885invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        HapticEvents.handleHapticEvents(((HapticEvent) event.getData()).getStyle(), hapticFeedback, context, view);
                    }
                });
            }
            int i3 = i2 & 14;
            HandleChartDialog3.HandleChartDialog(event, composerStartRestartGroup, i3);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(orderCallbacks);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new HandleAdvanceChartEvents3(orderCallbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            HandleEquityOrderCheckAlerts.HandleEquityOrderEvents(event, (Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, i3);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(orderCallbacks);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new HandleAdvanceChartEvents4(orderCallbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            event2 = event;
            HandleQuickConversionEvent.HandleQuickConversionEvent(event2, snackbarHostState, (Function1) ((KFunction) objRememberedValue3), null, composerStartRestartGroup, i3 | ((i2 >> 6) & 112), 8);
            snackbarHostState2 = snackbarHostState;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Event<AdvanceChartEvent> event3 = event2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleAdvanceChartEventsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HandleAdvanceChartEvents.HandleAdvanceChartEvents$lambda$8(event3, orderCallbacks, chartDuxo, snackbarHostState2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: HandleAdvanceChartEvents.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleAdvanceChartEventsKt$HandleAdvanceChartEvents$6", m3645f = "HandleAdvanceChartEvents.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleAdvanceChartEventsKt$HandleAdvanceChartEvents$6 */
    static final class C107496 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Ref.ObjectRef<ChartAlert> $serverDrivenAlert;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C107496(Ref.ObjectRef<ChartAlert> objectRef, Context context, Navigator navigator, Continuation<? super C107496> continuation) {
            super(2, continuation);
            this.$serverDrivenAlert = objectRef;
            this.$context = context;
            this.$navigator = navigator;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C107496(this.$serverDrivenAlert, this.$context, this.$navigator, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C107496) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ChartAlert chartAlert = this.$serverDrivenAlert.element;
            if (chartAlert != null) {
                Context context = this.$context;
                Navigator navigator = this.$navigator;
                AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
                FragmentManager supportFragmentManager = appCompatActivityFindActivityBaseContext != null ? appCompatActivityFindActivityBaseContext.getSupportFragmentManager() : null;
                if (supportFragmentManager != null) {
                    Navigator.DefaultImpls.createDialogFragment$default(navigator, new LegacyDialogFragmentKey.ClientComponentAlert(chartAlert.getAlert(), false, false, 6, null), null, 2, null).show(supportFragmentManager, "pdt-warning-equities");
                }
            }
            return Unit.INSTANCE;
        }
    }
}
