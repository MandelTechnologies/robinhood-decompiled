package com.robinhood.store.paymentinstrument;

import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PaymentInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentV2;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/PaymentInstrumentType;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.paymentinstrument.PaymentInstrumentStore$endpointSingle$1", m3645f = "PaymentInstrumentStore.kt", m3646l = {45}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.paymentinstrument.PaymentInstrumentStore$endpointSingle$1, reason: use source file name */
/* loaded from: classes12.dex */
final class PaymentInstrumentStore4 extends ContinuationImpl7 implements Function2<Tuples2<? extends PaymentInstrumentType, ? extends String>, Continuation<? super ApiPaymentInstrumentV2>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentInstrumentStore4(PaymentInstrumentStore paymentInstrumentStore, Continuation<? super PaymentInstrumentStore4> continuation) {
        super(2, continuation);
        this.this$0 = paymentInstrumentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentInstrumentStore4 paymentInstrumentStore4 = new PaymentInstrumentStore4(this.this$0, continuation);
        paymentInstrumentStore4.L$0 = obj;
        return paymentInstrumentStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends PaymentInstrumentType, ? extends String> tuples2, Continuation<? super ApiPaymentInstrumentV2> continuation) {
        return invoke2((Tuples2<? extends PaymentInstrumentType, String>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends PaymentInstrumentType, String> tuples2, Continuation<? super ApiPaymentInstrumentV2> continuation) {
        return ((PaymentInstrumentStore4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        PaymentInstrumentType paymentInstrumentType = (PaymentInstrumentType) tuples2.component1();
        String str = (String) tuples2.component2();
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.this$0.api;
        String serverValue = paymentInstrumentType.getServerValue();
        this.label = 1;
        Object paymentInstrument = paymentInstrumentBonfireApi.getPaymentInstrument(serverValue, str, this);
        return paymentInstrument == coroutine_suspended ? coroutine_suspended : paymentInstrument;
    }
}
