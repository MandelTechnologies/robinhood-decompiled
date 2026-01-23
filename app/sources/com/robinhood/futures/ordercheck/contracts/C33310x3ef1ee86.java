package com.robinhood.futures.ordercheck.contracts;

import com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesOrderCheckResolver_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver_Adapter$Endpoint_focusOnQuantityText$call$1", m3645f = "FuturesOrderCheckResolver_Adapter.kt", m3646l = {99}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver_Adapter$Endpoint_focusOnQuantityText$call$1 */
/* loaded from: classes15.dex */
final class C33310x3ef1ee86 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FuturesOrderCheckResolver_Adapter.Endpoint_focusOnQuantityText this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C33310x3ef1ee86(FuturesOrderCheckResolver_Adapter.Endpoint_focusOnQuantityText endpoint_focusOnQuantityText, Continuation<? super C33310x3ef1ee86> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_focusOnQuantityText;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C33310x3ef1ee86(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((C33310x3ef1ee86) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FuturesOrderCheckResolver futuresOrderCheckResolver = this.this$0.service;
            this.label = 1;
            if (futuresOrderCheckResolver.focusOnQuantityText(this) == coroutine_suspended) {
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
