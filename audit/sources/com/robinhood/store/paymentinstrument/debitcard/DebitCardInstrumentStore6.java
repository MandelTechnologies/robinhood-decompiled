package com.robinhood.store.paymentinstrument.debitcard;

import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiUpdateDebitCardRequest;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DebitCardInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrument;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiUpdateDebitCardRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore$updateEndpoint$1", m3645f = "DebitCardInstrumentStore.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore$updateEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class DebitCardInstrumentStore6 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends ApiUpdateDebitCardRequest>, Continuation<? super ApiPaymentInstrument>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DebitCardInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardInstrumentStore6(DebitCardInstrumentStore debitCardInstrumentStore, Continuation<? super DebitCardInstrumentStore6> continuation) {
        super(2, continuation);
        this.this$0 = debitCardInstrumentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DebitCardInstrumentStore6 debitCardInstrumentStore6 = new DebitCardInstrumentStore6(this.this$0, continuation);
        debitCardInstrumentStore6.L$0 = obj;
        return debitCardInstrumentStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends ApiUpdateDebitCardRequest> tuples2, Continuation<? super ApiPaymentInstrument> continuation) {
        return invoke2((Tuples2<UUID, ApiUpdateDebitCardRequest>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, ApiUpdateDebitCardRequest> tuples2, Continuation<? super ApiPaymentInstrument> continuation) {
        return ((DebitCardInstrumentStore6) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) tuples2.component1();
        ApiUpdateDebitCardRequest apiUpdateDebitCardRequest = (ApiUpdateDebitCardRequest) tuples2.component2();
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.this$0.bonfireApi;
        PaymentInstrumentType paymentInstrumentType = PaymentInstrumentType.DEBIT_CARD;
        this.label = 1;
        Object objUpdateDebitCard = paymentInstrumentBonfireApi.updateDebitCard(paymentInstrumentType, uuid, apiUpdateDebitCardRequest, this);
        return objUpdateDebitCard == coroutine_suspended ? coroutine_suspended : objUpdateDebitCard;
    }
}
