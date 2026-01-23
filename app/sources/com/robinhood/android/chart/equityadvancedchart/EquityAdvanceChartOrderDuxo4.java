package com.robinhood.android.chart.equityadvancedchart;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.SetChartScreenState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.AutoSendRenew;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartSettings;
import com.robinhood.android.chart.blackwidowadvancedchart.models.IdentiAgreement;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore2;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityAdvanceChartOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$onAutoSendToggled$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {1261}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$onAutoSendToggled$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class EquityAdvanceChartOrderDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EquityAdvanceChartOrderDataState $ds;
    final /* synthetic */ boolean $enabled;
    int label;
    final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityAdvanceChartOrderDuxo4(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, boolean z, EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = equityAdvanceChartOrderDuxo;
        this.$enabled = z;
        this.$ds = equityAdvanceChartOrderDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityAdvanceChartOrderDuxo4(this.this$0, this.$enabled, this.$ds, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityAdvanceChartOrderDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object autoSendStateEvent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TradeSettingsStore tradeSettingsStore = this.this$0.tradeSettingsStore;
            TradeSettingsStore4 tradeSettingsStore4 = TradeSettingsStore4.MAC;
            TradeSettingsStore3.Equity equity = new TradeSettingsStore3.Equity(null);
            boolean z = this.$enabled;
            String serverValue = IdentiAgreementType.ClientDriven.EQUITIES_MOBILE_AUTO_SEND.getServerValue();
            this.label = 1;
            autoSendStateEvent = tradeSettingsStore.setAutoSendStateEvent(tradeSettingsStore4, equity, z, serverValue, this);
            if (autoSendStateEvent == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            autoSendStateEvent = obj;
        }
        TradeSettingsStore2 tradeSettingsStore2 = (TradeSettingsStore2) autoSendStateEvent;
        if (Intrinsics.areEqual(tradeSettingsStore2, TradeSettingsStore2.ExpiredAgreement.INSTANCE)) {
            this.this$0.submit(new SetChartScreenState(new AutoSendRenew(IdentiAgreementType.ClientDriven.EQUITIES_MOBILE_AUTO_SEND, new ChartSettings(true, null, 2, null)), true));
        } else if (Intrinsics.areEqual(tradeSettingsStore2, TradeSettingsStore2.NotSignedAgreement.INSTANCE)) {
            this.this$0.submit(new SetChartScreenState(new IdentiAgreement(IdentiAgreementType.ClientDriven.EQUITIES_MOBILE_AUTO_SEND, false, false), true));
        } else if (!(tradeSettingsStore2 instanceof TradeSettingsStore2.AutosendIsOnAgreementNotSigned) && !(tradeSettingsStore2 instanceof TradeSettingsStore2.State)) {
            throw new NoWhenBranchMatchedException();
        }
        EventLogger eventLogger = this.this$0.eventLogger;
        Component component = new Component(Component.ComponentType.TOGGLE, "ChartSettingsBottomSheetAutoSend", null, 4, null);
        Screen screen = new Screen(Screen.Name.MOBILE_ADVANCED_CHARTS, null, null, null, 14, null);
        LegendAdvancedChartsContext loggingContext = this.$ds.getLoggingContext();
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, loggingContext.copy((6655 & 1) != 0 ? loggingContext.selected_span : null, (6655 & 2) != 0 ? loggingContext.selected_interval : null, (6655 & 4) != 0 ? loggingContext.selected_template : null, (6655 & 8) != 0 ? loggingContext.active_indicators : null, (6655 & 16) != 0 ? loggingContext.instrument_id : null, (6655 & 32) != 0 ? loggingContext.trade_amount : 0.0d, (6655 & 64) != 0 ? loggingContext.auto_send_enabled : tradeSettingsStore2.getAutoSend(), (6655 & 128) != 0 ? loggingContext.indicator_id : null, (6655 & 256) != 0 ? loggingContext.set_id : null, (6655 & 512) != 0 ? loggingContext.indicator_settings : null, (6655 & 1024) != 0 ? loggingContext.chart_settings : null, (6655 & 2048) != 0 ? loggingContext.price : 0.0d, (6655 & 4096) != 0 ? loggingContext.ref_id : null, (6655 & 8192) != 0 ? loggingContext.unknownFields() : null), null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16381, null), false, 41, null);
        return Unit.INSTANCE;
    }
}
