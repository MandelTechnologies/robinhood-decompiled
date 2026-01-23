package com.robinhood.android.chart.equityadvancedchart;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartEvent;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.GenericAdvanceChartOrderAction;
import com.robinhood.android.chart.equityadvancedchart.popups.EquityOrderCheckPopup;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HandleEquityOrderCheckAlerts.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002"}, m3636d2 = {"HandleEquityOrderEvents", "", "events", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartEvent;", "handleOrderEvent", "Lkotlin/Function1;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/GenericAdvanceChartOrderAction;", "(Lcom/robinhood/android/udf/event/Event;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lib-equity-advanced-chart_externalDebug", "orderCheckAlert", "Lcom/robinhood/android/chart/equityadvancedchart/EquityOrderCheckAlert;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.equityadvancedchart.HandleEquityOrderCheckAlertsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class HandleEquityOrderCheckAlerts {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HandleEquityOrderEvents$lambda$9(Event event, Function1 function1, int i, Composer composer, int i2) {
        HandleEquityOrderEvents(event, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HandleEquityOrderEvents(final Event<AdvanceChartEvent> event, final Function1<? super GenericAdvanceChartOrderAction, Unit> handleOrderEvent, Composer composer, final int i) {
        int i2;
        EventConsumer<AdvanceChartEvent> eventConsumerInvoke;
        Intrinsics.checkNotNullParameter(handleOrderEvent, "handleOrderEvent");
        Composer composerStartRestartGroup = composer.startRestartGroup(79094418);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(event) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(handleOrderEvent) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(79094418, i2, -1, "com.robinhood.android.chart.equityadvancedchart.HandleEquityOrderEvents (HandleEquityOrderCheckAlerts.kt:16)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (event != null && (event.getData() instanceof EquityOrderCheckAlert) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.chart.equityadvancedchart.HandleEquityOrderCheckAlertsKt$HandleEquityOrderEvents$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m11967invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m11967invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        snapshotState.setValue((EquityOrderCheckAlert) event.getData());
                    }
                });
            }
            EquityOrderCheckAlert equityOrderCheckAlertHandleEquityOrderEvents$lambda$1 = HandleEquityOrderEvents$lambda$1(snapshotState);
            if (equityOrderCheckAlertHandleEquityOrderEvents$lambda$1 != null) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.equityadvancedchart.HandleEquityOrderCheckAlertsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HandleEquityOrderCheckAlerts.HandleEquityOrderEvents$lambda$8$lambda$5$lambda$4(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z = (i2 & 112) == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function2() { // from class: com.robinhood.android.chart.equityadvancedchart.HandleEquityOrderCheckAlertsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HandleEquityOrderCheckAlerts.HandleEquityOrderEvents$lambda$8$lambda$7$lambda$6(handleOrderEvent, (EquityOrderCheckAlert) obj, (ServerDrivenButton) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EquityOrderCheckPopup.EquityOrderCheckPopup(equityOrderCheckAlertHandleEquityOrderEvents$lambda$1, function0, (Function2) objRememberedValue3, null, composerStartRestartGroup, 48, 8);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.equityadvancedchart.HandleEquityOrderCheckAlertsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HandleEquityOrderCheckAlerts.HandleEquityOrderEvents$lambda$9(event, handleOrderEvent, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HandleEquityOrderEvents$lambda$8$lambda$7$lambda$6(Function1 function1, EquityOrderCheckAlert alert, ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(button, "button");
        function1.invoke(new EquityOrderCheckAction(button, alert.getEquityOrderIntent()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HandleEquityOrderEvents$lambda$8$lambda$5$lambda$4(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    private static final EquityOrderCheckAlert HandleEquityOrderEvents$lambda$1(SnapshotState<EquityOrderCheckAlert> snapshotState) {
        return snapshotState.getValue();
    }
}
