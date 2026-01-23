package com.robinhood.android.equitydetail.p123ui.chart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.EquityInstrumentDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartInstrumentDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InstrumentChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$onLaunchAdvancedChart$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$onLaunchAdvancedChart$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class InstrumentChartDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InstrumentChartViewDataState $ds;
    int label;
    final /* synthetic */ InstrumentChartDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentChartDuxo2(InstrumentChartDuxo instrumentChartDuxo, InstrumentChartViewDataState instrumentChartViewDataState, Continuation<? super InstrumentChartDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = instrumentChartDuxo;
        this.$ds = instrumentChartViewDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InstrumentChartDuxo2(this.this$0, this.$ds, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InstrumentChartDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BwWebViewManager bwWebViewManager = this.this$0.bwWebViewManager;
            Instrument instrument = this.$ds.getInstrument();
            String strValueOf = String.valueOf(instrument != null ? instrument.getId() : null);
            Instrument instrument2 = this.$ds.getInstrument();
            SetChartInstrumentDto.InstrumentDto.EquityInstrument equityInstrument = new SetChartInstrumentDto.InstrumentDto.EquityInstrument(new EquityInstrumentDto(strValueOf, String.valueOf(instrument2 != null ? instrument2.getSymbol() : null), false));
            this.label = 1;
            if (bwWebViewManager.setChartInstrument(equityInstrument, null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
