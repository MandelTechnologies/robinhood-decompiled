package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.dao.PaymentTransferDao;
import com.robinhood.models.p320db.bonfire.PaymentTransfer2;
import com.robinhood.transfers.api.ApiPaymentTransferUpdateResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PaymentTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "updatedResponse", "Lcom/robinhood/transfers/api/ApiPaymentTransferUpdateResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore$cancelEndpoint$2", m3645f = "PaymentTransferStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PaymentTransferStore$cancelEndpoint$2 extends ContinuationImpl7 implements Function2<ApiPaymentTransferUpdateResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentTransferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentTransferStore$cancelEndpoint$2(PaymentTransferStore paymentTransferStore, Continuation<? super PaymentTransferStore$cancelEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = paymentTransferStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentTransferStore$cancelEndpoint$2 paymentTransferStore$cancelEndpoint$2 = new PaymentTransferStore$cancelEndpoint$2(this.this$0, continuation);
        paymentTransferStore$cancelEndpoint$2.L$0 = obj;
        return paymentTransferStore$cancelEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiPaymentTransferUpdateResponse apiPaymentTransferUpdateResponse, Continuation<? super Unit> continuation) {
        return ((PaymentTransferStore$cancelEndpoint$2) create(apiPaymentTransferUpdateResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.paymentTransferDao.insert((PaymentTransferDao) PaymentTransfer2.toDbModel(((ApiPaymentTransferUpdateResponse) this.L$0).getTransfer()));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
