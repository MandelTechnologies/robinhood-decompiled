package com.robinhood.android.equitytradeladder;

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

/* compiled from: EquityTradeLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$accountNumberStream$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {642}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityTradeLadderDuxo$onCreate$6$accountNumberStream$1 extends ContinuationImpl7 implements Function2<FlowCollector<? super Optional<? extends String>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    EquityTradeLadderDuxo$onCreate$6$accountNumberStream$1(Continuation<? super EquityTradeLadderDuxo$onCreate$6$accountNumberStream$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityTradeLadderDuxo$onCreate$6$accountNumberStream$1 equityTradeLadderDuxo$onCreate$6$accountNumberStream$1 = new EquityTradeLadderDuxo$onCreate$6$accountNumberStream$1(continuation);
        equityTradeLadderDuxo$onCreate$6$accountNumberStream$1.L$0 = obj;
        return equityTradeLadderDuxo$onCreate$6$accountNumberStream$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Optional<? extends String>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Optional<String>>) flowCollector, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Optional<String>> flowCollector, Continuation<? super Unit> continuation) {
        return ((EquityTradeLadderDuxo$onCreate$6$accountNumberStream$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
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
