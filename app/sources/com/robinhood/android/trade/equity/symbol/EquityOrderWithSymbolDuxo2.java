package com.robinhood.android.trade.equity.symbol;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityOrderWithSymbolDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/symbol/EquityOrderWithSymbolViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.symbol.EquityOrderWithSymbolDuxo$getInstrument$1$1", m3645f = "EquityOrderWithSymbolDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.trade.equity.symbol.EquityOrderWithSymbolDuxo$getInstrument$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class EquityOrderWithSymbolDuxo2 extends ContinuationImpl7 implements Function2<EquityOrderWithSymbolViewState, Continuation<? super EquityOrderWithSymbolViewState>, Object> {
    final /* synthetic */ UUID $id;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityOrderWithSymbolDuxo2(UUID uuid, Continuation<? super EquityOrderWithSymbolDuxo2> continuation) {
        super(2, continuation);
        this.$id = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityOrderWithSymbolDuxo2 equityOrderWithSymbolDuxo2 = new EquityOrderWithSymbolDuxo2(this.$id, continuation);
        equityOrderWithSymbolDuxo2.L$0 = obj;
        return equityOrderWithSymbolDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityOrderWithSymbolViewState equityOrderWithSymbolViewState, Continuation<? super EquityOrderWithSymbolViewState> continuation) {
        return ((EquityOrderWithSymbolDuxo2) create(equityOrderWithSymbolViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((EquityOrderWithSymbolViewState) this.L$0).copy(this.$id);
    }
}
