package com.robinhood.futures.ordercheck.contracts;

import com.robinhood.futures.ordercheck.contracts.FuturesOrderChecksService_Adapter;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderCheckRequest;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderChecksResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesOrderChecksService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService_Adapter$Endpoint_validateOrderAndPresentErrorAlert$Emission;", "it", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService_Adapter$Endpoint_validateOrderAndPresentErrorAlert$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.futures.ordercheck.contracts.FuturesOrderChecksService_Adapter$Endpoint_validateOrderAndPresentErrorAlert$call$1", m3645f = "FuturesOrderChecksService_Adapter.kt", m3646l = {63}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.futures.ordercheck.contracts.FuturesOrderChecksService_Adapter$Endpoint_validateOrderAndPresentErrorAlert$call$1, reason: use source file name */
/* loaded from: classes15.dex */
final class FuturesOrderChecksService_Adapter4 extends ContinuationImpl7 implements Function2<FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert.Arguments, Continuation<? super FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert.Emission>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesOrderChecksService_Adapter4(FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert endpoint_validateOrderAndPresentErrorAlert, Continuation<? super FuturesOrderChecksService_Adapter4> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_validateOrderAndPresentErrorAlert;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesOrderChecksService_Adapter4 futuresOrderChecksService_Adapter4 = new FuturesOrderChecksService_Adapter4(this.this$0, continuation);
        futuresOrderChecksService_Adapter4.L$0 = obj;
        return futuresOrderChecksService_Adapter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert.Arguments arguments, Continuation<? super FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert.Emission> continuation) {
        return ((FuturesOrderChecksService_Adapter4) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert.Arguments arguments = (FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert.Arguments) this.L$0;
            FuturesOrderChecksService futuresOrderChecksService = this.this$0.service;
            FuturesOrderCheckRequest candidateOrder = arguments.getCandidateOrder();
            this.label = 1;
            obj = futuresOrderChecksService.validateOrderAndPresentErrorAlert(candidateOrder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert.Emission.m22506boximpl(FuturesOrderChecksService_Adapter.Endpoint_validateOrderAndPresentErrorAlert.Emission.m22507constructorimpl((FuturesOrderChecksResult) obj));
    }
}
