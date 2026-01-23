package com.robinhood.store.paymentinstrument;

import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentsV2;
import com.robinhood.models.paymentinstrument.dao.PaymentInstrumentV2Dao;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV22;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PaymentInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentsV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.paymentinstrument.PaymentInstrumentStore$endpoint$2", m3645f = "PaymentInstrumentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.paymentinstrument.PaymentInstrumentStore$endpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class PaymentInstrumentStore3 extends ContinuationImpl7 implements Function2<ApiPaymentInstrumentsV2, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentInstrumentStore3(PaymentInstrumentStore paymentInstrumentStore, Continuation<? super PaymentInstrumentStore3> continuation) {
        super(2, continuation);
        this.this$0 = paymentInstrumentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentInstrumentStore3 paymentInstrumentStore3 = new PaymentInstrumentStore3(this.this$0, continuation);
        paymentInstrumentStore3.L$0 = obj;
        return paymentInstrumentStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiPaymentInstrumentsV2 apiPaymentInstrumentsV2, Continuation<? super Unit> continuation) {
        return ((PaymentInstrumentStore3) create(apiPaymentInstrumentsV2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ApiPaymentInstrumentsV2 apiPaymentInstrumentsV2 = (ApiPaymentInstrumentsV2) this.L$0;
            PaymentInstrumentV2Dao paymentInstrumentV2Dao = this.this$0.dao;
            ImmutableList<ApiPaymentInstrumentV2> paymentInstruments = apiPaymentInstrumentsV2.getPaymentInstruments();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(paymentInstruments, 10));
            Iterator<ApiPaymentInstrumentV2> it = paymentInstruments.iterator();
            while (it.hasNext()) {
                arrayList.add(PaymentInstrumentV22.toDbModel(it.next()));
            }
            paymentInstrumentV2Dao.insert((Iterable) arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
