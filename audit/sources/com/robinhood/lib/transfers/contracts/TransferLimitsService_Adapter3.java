package com.robinhood.lib.transfers.contracts;

import com.robinhood.lib.transfers.contracts.TransferLimitsService_Adapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TransferLimitsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/lib/transfers/contracts/TransferLimitsService_Adapter$Endpoint_getTransferLimits$Emission;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.lib.transfers.contracts.TransferLimitsService_Adapter$Endpoint_getTransferLimits$call$1", m3645f = "TransferLimitsService_Adapter.kt", m3646l = {58}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.lib.transfers.contracts.TransferLimitsService_Adapter$Endpoint_getTransferLimits$call$1, reason: use source file name */
/* loaded from: classes3.dex */
final class TransferLimitsService_Adapter3 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super TransferLimitsService_Adapter.Endpoint_getTransferLimits.Emission>, Object> {
    int label;
    final /* synthetic */ TransferLimitsService_Adapter.Endpoint_getTransferLimits this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferLimitsService_Adapter3(TransferLimitsService_Adapter.Endpoint_getTransferLimits endpoint_getTransferLimits, Continuation<? super TransferLimitsService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_getTransferLimits;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransferLimitsService_Adapter3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super TransferLimitsService_Adapter.Endpoint_getTransferLimits.Emission> continuation) {
        return ((TransferLimitsService_Adapter3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransferLimitsService transferLimitsService = this.this$0.service;
            this.label = 1;
            obj = transferLimitsService.getTransferLimits(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return TransferLimitsService_Adapter.Endpoint_getTransferLimits.Emission.m22552boximpl(TransferLimitsService_Adapter.Endpoint_getTransferLimits.Emission.m22553constructorimpl((List) obj));
    }
}
