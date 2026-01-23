package com.robinhood.android.futures.detail.p140ui.duxo;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onFlattenOrders$1$2$2$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onFlattenOrders$1$2$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FuturesDetailDuxo5 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    FuturesDetailDuxo5(Continuation<? super FuturesDetailDuxo5> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesDetailDuxo5 futuresDetailDuxo5 = new FuturesDetailDuxo5(continuation);
        futuresDetailDuxo5.L$0 = obj;
        return futuresDetailDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
        return ((FuturesDetailDuxo5) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, false, null, false, false, null, 2031615, null);
    }
}
