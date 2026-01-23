package com.robinhood.transfers.hub.contracts;

import com.robinhood.transfers.hub.contracts.TransferHubManagedService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TransferHubManagedService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_getDataForDisplayLogic$Emission;", "it", ""}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.transfers.hub.contracts.TransferHubManagedService_Adapter$Endpoint_getDataForDisplayLogic$call$1", m3645f = "TransferHubManagedService_Adapter.kt", m3646l = {76}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.transfers.hub.contracts.TransferHubManagedService_Adapter$Endpoint_getDataForDisplayLogic$call$1 */
/* loaded from: classes12.dex */
final class C41797x5d1be094 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super TransferHubManagedService_Adapter.Endpoint_getDataForDisplayLogic.Emission>, Object> {
    int label;
    final /* synthetic */ TransferHubManagedService_Adapter.Endpoint_getDataForDisplayLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C41797x5d1be094(TransferHubManagedService_Adapter.Endpoint_getDataForDisplayLogic endpoint_getDataForDisplayLogic, Continuation<? super C41797x5d1be094> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_getDataForDisplayLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C41797x5d1be094(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super TransferHubManagedService_Adapter.Endpoint_getDataForDisplayLogic.Emission> continuation) {
        return ((C41797x5d1be094) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransferHubManagedService transferHubManagedService = this.this$0.service;
            this.label = 1;
            obj = transferHubManagedService.getDataForDisplayLogic(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return TransferHubManagedService_Adapter.Endpoint_getDataForDisplayLogic.Emission.m26562boximpl(TransferHubManagedService_Adapter.Endpoint_getDataForDisplayLogic.Emission.m26563constructorimpl((TransferHubDisplayLogicContainer) obj));
    }
}
