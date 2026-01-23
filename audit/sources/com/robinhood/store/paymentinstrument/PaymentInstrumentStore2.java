package com.robinhood.store.paymentinstrument;

import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentsV2;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: PaymentInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentsV2;", "it", "", "Lcom/robinhood/models/api/bonfire/paymentinstruments/PaymentInstrumentType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.paymentinstrument.PaymentInstrumentStore$endpoint$1", m3645f = "PaymentInstrumentStore.kt", m3646l = {33}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.paymentinstrument.PaymentInstrumentStore$endpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class PaymentInstrumentStore2 extends ContinuationImpl7 implements Function2<List<? extends PaymentInstrumentType>, Continuation<? super ApiPaymentInstrumentsV2>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentInstrumentStore2(PaymentInstrumentStore paymentInstrumentStore, Continuation<? super PaymentInstrumentStore2> continuation) {
        super(2, continuation);
        this.this$0 = paymentInstrumentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentInstrumentStore2 paymentInstrumentStore2 = new PaymentInstrumentStore2(this.this$0, continuation);
        paymentInstrumentStore2.L$0 = obj;
        return paymentInstrumentStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends PaymentInstrumentType> list, Continuation<? super ApiPaymentInstrumentsV2> continuation) {
        return ((PaymentInstrumentStore2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
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
        List list = (List) this.L$0;
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.this$0.api;
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((PaymentInstrumentType) it.next()).getServerValue());
        }
        CommaSeparatedList<String> commaSeparatedList = new CommaSeparatedList<>(arrayList);
        this.label = 1;
        Object paymentInstruments = paymentInstrumentBonfireApi.getPaymentInstruments(commaSeparatedList, this);
        return paymentInstruments == coroutine_suspended ? coroutine_suspended : paymentInstruments;
    }
}
