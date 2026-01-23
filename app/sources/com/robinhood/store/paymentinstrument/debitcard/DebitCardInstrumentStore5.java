package com.robinhood.store.paymentinstrument.debitcard;

import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DebitCardInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrument;", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore$singleEndpoint$1", m3645f = "DebitCardInstrumentStore.kt", m3646l = {61}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore$singleEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class DebitCardInstrumentStore5 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiPaymentInstrument>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DebitCardInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardInstrumentStore5(DebitCardInstrumentStore debitCardInstrumentStore, Continuation<? super DebitCardInstrumentStore5> continuation) {
        super(2, continuation);
        this.this$0 = debitCardInstrumentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DebitCardInstrumentStore5 debitCardInstrumentStore5 = new DebitCardInstrumentStore5(this.this$0, continuation);
        debitCardInstrumentStore5.L$0 = obj;
        return debitCardInstrumentStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiPaymentInstrument> continuation) {
        return ((DebitCardInstrumentStore5) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) this.L$0;
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.this$0.bonfireApi;
        PaymentInstrumentType paymentInstrumentType = PaymentInstrumentType.DEBIT_CARD;
        this.label = 1;
        Object debitCard = paymentInstrumentBonfireApi.getDebitCard(paymentInstrumentType, uuid, this);
        return debitCard == coroutine_suspended ? coroutine_suspended : debitCard;
    }
}
