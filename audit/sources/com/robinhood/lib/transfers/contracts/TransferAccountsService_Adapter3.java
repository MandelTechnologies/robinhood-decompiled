package com.robinhood.lib.transfers.contracts;

import com.robinhood.lib.transfers.contracts.TransferAccountsService_Adapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TransferAccountsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/lib/transfers/contracts/TransferAccountsService_Adapter$Endpoint_getTransferAccounts$Emission;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.lib.transfers.contracts.TransferAccountsService_Adapter$Endpoint_getTransferAccounts$call$1", m3645f = "TransferAccountsService_Adapter.kt", m3646l = {58}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.lib.transfers.contracts.TransferAccountsService_Adapter$Endpoint_getTransferAccounts$call$1, reason: use source file name */
/* loaded from: classes3.dex */
final class TransferAccountsService_Adapter3 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super TransferAccountsService_Adapter.Endpoint_getTransferAccounts.Emission>, Object> {
    int label;
    final /* synthetic */ TransferAccountsService_Adapter.Endpoint_getTransferAccounts this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferAccountsService_Adapter3(TransferAccountsService_Adapter.Endpoint_getTransferAccounts endpoint_getTransferAccounts, Continuation<? super TransferAccountsService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_getTransferAccounts;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransferAccountsService_Adapter3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super TransferAccountsService_Adapter.Endpoint_getTransferAccounts.Emission> continuation) {
        return ((TransferAccountsService_Adapter3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransferAccountsService transferAccountsService = this.this$0.service;
            this.label = 1;
            obj = transferAccountsService.getTransferAccounts(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return TransferAccountsService_Adapter.Endpoint_getTransferAccounts.Emission.m22543boximpl(TransferAccountsService_Adapter.Endpoint_getTransferAccounts.Emission.m22544constructorimpl((List) obj));
    }
}
