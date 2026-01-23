package com.robinhood.store.paymentinstrument.debitcard;

import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiVerifyDebitCardRequest;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentProviderType;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: DebitCardInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrument;", "endpointData", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore$VerifyEndpointData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore$verifyEndpoint$1", m3645f = "DebitCardInstrumentStore.kt", m3646l = {93}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore$verifyEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class DebitCardInstrumentStore7 extends ContinuationImpl7 implements Function2<DebitCardInstrumentStore.VerifyEndpointData, Continuation<? super Response<ApiPaymentInstrument>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DebitCardInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardInstrumentStore7(DebitCardInstrumentStore debitCardInstrumentStore, Continuation<? super DebitCardInstrumentStore7> continuation) {
        super(2, continuation);
        this.this$0 = debitCardInstrumentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DebitCardInstrumentStore7 debitCardInstrumentStore7 = new DebitCardInstrumentStore7(this.this$0, continuation);
        debitCardInstrumentStore7.L$0 = obj;
        return debitCardInstrumentStore7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DebitCardInstrumentStore.VerifyEndpointData verifyEndpointData, Continuation<? super Response<ApiPaymentInstrument>> continuation) {
        return ((DebitCardInstrumentStore7) create(verifyEndpointData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DebitCardInstrumentStore.VerifyEndpointData verifyEndpointData = (DebitCardInstrumentStore.VerifyEndpointData) this.L$0;
            PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.this$0.bonfireApi;
            PaymentInstrumentType paymentInstrumentType = PaymentInstrumentType.DEBIT_CARD;
            UUID instrumentId = verifyEndpointData.getInstrumentId();
            ApiVerifyDebitCardRequest apiVerifyDebitCardRequest = new ApiVerifyDebitCardRequest(PaymentProviderType.STRIPE, verifyEndpointData.getVerificationCode(), verifyEndpointData.getVerifyOnly());
            this.label = 1;
            obj = paymentInstrumentBonfireApi.verifyDebitCard(paymentInstrumentType, instrumentId, apiVerifyDebitCardRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Response response = (Response) obj;
        if (response.isSuccessful()) {
            return response;
        }
        throw new HttpException(response);
    }
}
