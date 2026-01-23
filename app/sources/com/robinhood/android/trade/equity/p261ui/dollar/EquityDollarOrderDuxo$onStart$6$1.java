package com.robinhood.android.trade.equity.p261ui.dollar;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityDollarOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onStart$6$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class EquityDollarOrderDuxo$onStart$6$1 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
    final /* synthetic */ boolean $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityDollarOrderDuxo$onStart$6$1(boolean z, Continuation<? super EquityDollarOrderDuxo$onStart$6$1> continuation) {
        super(2, continuation);
        this.$it = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityDollarOrderDuxo$onStart$6$1 equityDollarOrderDuxo$onStart$6$1 = new EquityDollarOrderDuxo$onStart$6$1(this.$it, continuation);
        equityDollarOrderDuxo$onStart$6$1.L$0 = obj;
        return equityDollarOrderDuxo$onStart$6$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
        return ((EquityDollarOrderDuxo$onStart$6$1) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return EquityDollarOrderDataState.copy$default((EquityDollarOrderDataState) this.L$0, null, null, null, null, false, null, null, null, this.$it, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, null, null, false, false, false, false, -257, 3, null);
    }
}
