package com.robinhood.android.equitydetail.p123ui.tradebar;

import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: InstrumentDetailTradeBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiOptionChain;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$8$1$1$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {703}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$8$1$1$2, reason: use source file name */
/* loaded from: classes3.dex */
final class InstrumentDetailTradeBarDuxo2 extends ContinuationImpl7 implements Function2<FlowCollector<? super Optional<? extends UiOptionChain>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    InstrumentDetailTradeBarDuxo2(Continuation<? super InstrumentDetailTradeBarDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstrumentDetailTradeBarDuxo2 instrumentDetailTradeBarDuxo2 = new InstrumentDetailTradeBarDuxo2(continuation);
        instrumentDetailTradeBarDuxo2.L$0 = obj;
        return instrumentDetailTradeBarDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Optional<? extends UiOptionChain>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Optional<UiOptionChain>>) flowCollector, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Optional<UiOptionChain>> flowCollector, Continuation<? super Unit> continuation) {
        return ((InstrumentDetailTradeBarDuxo2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Optional2 optional2 = Optional2.INSTANCE;
            this.label = 1;
            if (flowCollector.emit(optional2, this) == coroutine_suspended) {
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
