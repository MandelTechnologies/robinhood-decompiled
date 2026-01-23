package com.robinhood.store.paymentinstrument.debitcard;

import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentUserStatus;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentProviderType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DebitCardInstrumentUserStatusStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentUserStatus;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentUserStatusStore$endpoint$1", m3645f = "DebitCardInstrumentUserStatusStore.kt", m3646l = {38}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentUserStatusStore$endpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class DebitCardInstrumentUserStatusStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ApiPaymentInstrumentUserStatus>, Object> {
    int label;
    final /* synthetic */ DebitCardInstrumentUserStatusStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardInstrumentUserStatusStore2(DebitCardInstrumentUserStatusStore debitCardInstrumentUserStatusStore, Continuation<? super DebitCardInstrumentUserStatusStore2> continuation) {
        super(2, continuation);
        this.this$0 = debitCardInstrumentUserStatusStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DebitCardInstrumentUserStatusStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ApiPaymentInstrumentUserStatus> continuation) {
        return ((DebitCardInstrumentUserStatusStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.this$0.bonfireApi;
        PaymentProviderType paymentProviderType = PaymentProviderType.STRIPE;
        this.label = 1;
        Object userStatusForPaymentProvider = paymentInstrumentBonfireApi.getUserStatusForPaymentProvider(paymentProviderType, this);
        return userStatusForPaymentProvider == coroutine_suspended ? coroutine_suspended : userStatusForPaymentProvider;
    }
}
