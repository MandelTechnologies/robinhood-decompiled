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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_transferHubItemSelected$Arguments;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.transfers.hub.contracts.TransferHubManagedService_Adapter$Endpoint_transferHubItemSelected$call$1", m3645f = "TransferHubManagedService_Adapter.kt", m3646l = {91}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.transfers.hub.contracts.TransferHubManagedService_Adapter$Endpoint_transferHubItemSelected$call$1 */
/* loaded from: classes12.dex */
final class C41799xbc7934d extends ContinuationImpl7 implements Function2<TransferHubManagedService_Adapter.Endpoint_transferHubItemSelected.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransferHubManagedService_Adapter.Endpoint_transferHubItemSelected this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C41799xbc7934d(TransferHubManagedService_Adapter.Endpoint_transferHubItemSelected endpoint_transferHubItemSelected, Continuation<? super C41799xbc7934d> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_transferHubItemSelected;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C41799xbc7934d c41799xbc7934d = new C41799xbc7934d(this.this$0, continuation);
        c41799xbc7934d.L$0 = obj;
        return c41799xbc7934d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TransferHubManagedService_Adapter.Endpoint_transferHubItemSelected.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((C41799xbc7934d) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransferHubManagedService_Adapter.Endpoint_transferHubItemSelected.Arguments arguments = (TransferHubManagedService_Adapter.Endpoint_transferHubItemSelected.Arguments) this.L$0;
            TransferHubManagedService transferHubManagedService = this.this$0.service;
            TransferHubItemClickIdentifier identifier = arguments.getIdentifier();
            this.label = 1;
            if (transferHubManagedService.transferHubItemSelected(identifier, this) == coroutine_suspended) {
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
