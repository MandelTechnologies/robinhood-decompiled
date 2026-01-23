package com.robinhood.android.debitcard.linking.p098ui;

import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiLinkDebitCardRequest;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import retrofit2.Response;

/* compiled from: DebitCardLinkingLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.debitcard.linking.ui.DebitCardLinkingLoadingFragment$onCreateView$2$1$paymentInstrument$1", m3645f = "DebitCardLinkingLoadingFragment.kt", m3646l = {84}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingLoadingFragment$onCreateView$2$1$paymentInstrument$1, reason: use source file name */
/* loaded from: classes2.dex */
final class DebitCardLinkingLoadingFragment2 extends ContinuationImpl7 implements Function1<Continuation<? super Response<ApiPaymentInstrument>>, Object> {
    final /* synthetic */ ApiLinkDebitCardRequest $request;
    int label;
    final /* synthetic */ DebitCardLinkingLoadingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardLinkingLoadingFragment2(DebitCardLinkingLoadingFragment debitCardLinkingLoadingFragment, ApiLinkDebitCardRequest apiLinkDebitCardRequest, Continuation<? super DebitCardLinkingLoadingFragment2> continuation) {
        super(1, continuation);
        this.this$0 = debitCardLinkingLoadingFragment;
        this.$request = apiLinkDebitCardRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DebitCardLinkingLoadingFragment2(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Response<ApiPaymentInstrument>> continuation) {
        return ((DebitCardLinkingLoadingFragment2) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
        PaymentInstrumentBonfireApi bonfireApi = this.this$0.getBonfireApi();
        ApiLinkDebitCardRequest apiLinkDebitCardRequest = this.$request;
        this.label = 1;
        Object objLinkDebitCard = bonfireApi.linkDebitCard(apiLinkDebitCardRequest, this);
        return objLinkDebitCard == coroutine_suspended ? coroutine_suspended : objLinkDebitCard;
    }
}
