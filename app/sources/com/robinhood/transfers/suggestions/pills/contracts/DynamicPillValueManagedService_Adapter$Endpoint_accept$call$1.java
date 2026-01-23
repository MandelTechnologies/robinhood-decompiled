package com.robinhood.transfers.suggestions.pills.contracts;

import com.robinhood.transfers.suggestions.pills.contracts.DynamicPillValueManagedService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DynamicPillValueManagedService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_accept$Emission;", "it", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_accept$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.transfers.suggestions.pills.contracts.DynamicPillValueManagedService_Adapter$Endpoint_accept$call$1", m3645f = "DynamicPillValueManagedService_Adapter.kt", m3646l = {85}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DynamicPillValueManagedService_Adapter$Endpoint_accept$call$1 extends ContinuationImpl7 implements Function2<DynamicPillValueManagedService_Adapter.Endpoint_accept.Arguments, Continuation<? super DynamicPillValueManagedService_Adapter.Endpoint_accept.Emission>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DynamicPillValueManagedService_Adapter.Endpoint_accept this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DynamicPillValueManagedService_Adapter$Endpoint_accept$call$1(DynamicPillValueManagedService_Adapter.Endpoint_accept endpoint_accept, Continuation<? super DynamicPillValueManagedService_Adapter$Endpoint_accept$call$1> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_accept;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DynamicPillValueManagedService_Adapter$Endpoint_accept$call$1 dynamicPillValueManagedService_Adapter$Endpoint_accept$call$1 = new DynamicPillValueManagedService_Adapter$Endpoint_accept$call$1(this.this$0, continuation);
        dynamicPillValueManagedService_Adapter$Endpoint_accept$call$1.L$0 = obj;
        return dynamicPillValueManagedService_Adapter$Endpoint_accept$call$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DynamicPillValueManagedService_Adapter.Endpoint_accept.Arguments arguments, Continuation<? super DynamicPillValueManagedService_Adapter.Endpoint_accept.Emission> continuation) {
        return ((DynamicPillValueManagedService_Adapter$Endpoint_accept$call$1) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DynamicPillValueManagedService_Adapter.Endpoint_accept.Arguments arguments = (DynamicPillValueManagedService_Adapter.Endpoint_accept.Arguments) this.L$0;
            DynamicPillValueManagedService dynamicPillValueManagedService = this.this$0.service;
            String response = arguments.getResponse();
            this.label = 1;
            obj = dynamicPillValueManagedService.accept(response, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return DynamicPillValueManagedService_Adapter.Endpoint_accept.Emission.m26573boximpl(DynamicPillValueManagedService_Adapter.Endpoint_accept.Emission.m26574constructorimpl(((Boolean) obj).booleanValue()));
    }
}
