package com.robinhood.store.paymentinstrument;

import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2;
import com.robinhood.models.paymentinstrument.dao.PaymentInstrumentV2Dao;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV22;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PaymentInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.paymentinstrument.PaymentInstrumentStore$endpointSingle$2", m3645f = "PaymentInstrumentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.paymentinstrument.PaymentInstrumentStore$endpointSingle$2, reason: use source file name */
/* loaded from: classes12.dex */
final class PaymentInstrumentStore5 extends ContinuationImpl7 implements Function2<ApiPaymentInstrumentV2, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentInstrumentStore5(PaymentInstrumentStore paymentInstrumentStore, Continuation<? super PaymentInstrumentStore5> continuation) {
        super(2, continuation);
        this.this$0 = paymentInstrumentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentInstrumentStore5 paymentInstrumentStore5 = new PaymentInstrumentStore5(this.this$0, continuation);
        paymentInstrumentStore5.L$0 = obj;
        return paymentInstrumentStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiPaymentInstrumentV2 apiPaymentInstrumentV2, Continuation<? super Unit> continuation) {
        return ((PaymentInstrumentStore5) create(apiPaymentInstrumentV2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insert((PaymentInstrumentV2Dao) PaymentInstrumentV22.toDbModel((ApiPaymentInstrumentV2) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
