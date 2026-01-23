package com.robinhood.store.paymentinstrument.debitcard;

import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* compiled from: DebitCardInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore$verifyEndpoint$2", m3645f = "DebitCardInstrumentStore.kt", m3646l = {90}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore$verifyEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class DebitCardInstrumentStore8 extends ContinuationImpl7 implements Function2<Response<ApiPaymentInstrument>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DebitCardInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardInstrumentStore8(DebitCardInstrumentStore debitCardInstrumentStore, Continuation<? super DebitCardInstrumentStore8> continuation) {
        super(2, continuation);
        this.this$0 = debitCardInstrumentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DebitCardInstrumentStore8 debitCardInstrumentStore8 = new DebitCardInstrumentStore8(this.this$0, continuation);
        debitCardInstrumentStore8.L$0 = obj;
        return debitCardInstrumentStore8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<ApiPaymentInstrument> response, Continuation<? super Unit> continuation) {
        return ((DebitCardInstrumentStore8) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Response response = (Response) this.L$0;
            Function2 function2 = this.this$0.defaultUpdateSaveAction;
            Object objBody = response.body();
            Intrinsics.checkNotNull(objBody);
            this.label = 1;
            if (function2.invoke(objBody, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
