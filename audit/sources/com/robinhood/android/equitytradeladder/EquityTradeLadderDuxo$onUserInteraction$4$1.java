package com.robinhood.android.equitytradeladder;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityTradeLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$4$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityTradeLadderDuxo$onUserInteraction$4$1 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    EquityTradeLadderDuxo$onUserInteraction$4$1(Continuation<? super EquityTradeLadderDuxo$onUserInteraction$4$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityTradeLadderDuxo$onUserInteraction$4$1 equityTradeLadderDuxo$onUserInteraction$4$1 = new EquityTradeLadderDuxo$onUserInteraction$4$1(continuation);
        equityTradeLadderDuxo$onUserInteraction$4$1.L$0 = obj;
        return equityTradeLadderDuxo$onUserInteraction$4$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
        return ((EquityTradeLadderDuxo$onUserInteraction$4$1) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((EquityTradeLadderDataState) this.L$0).copyToClearSelectionState();
    }
}
