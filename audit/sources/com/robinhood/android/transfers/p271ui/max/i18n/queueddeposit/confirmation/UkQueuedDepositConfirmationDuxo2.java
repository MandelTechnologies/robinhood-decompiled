package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.confirmation;

import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: UkQueuedDepositConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationDuxo$onStart$1$instrument$1", m3645f = "UkQueuedDepositConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationDuxo$onStart$1$instrument$1, reason: use source file name */
/* loaded from: classes9.dex */
final class UkQueuedDepositConfirmationDuxo2 extends ContinuationImpl7 implements Function2<PaymentInstrumentV2, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    UkQueuedDepositConfirmationDuxo2(Continuation<? super UkQueuedDepositConfirmationDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UkQueuedDepositConfirmationDuxo2 ukQueuedDepositConfirmationDuxo2 = new UkQueuedDepositConfirmationDuxo2(continuation);
        ukQueuedDepositConfirmationDuxo2.L$0 = obj;
        return ukQueuedDepositConfirmationDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PaymentInstrumentV2 paymentInstrumentV2, Continuation<? super Boolean> continuation) {
        return ((UkQueuedDepositConfirmationDuxo2) create(paymentInstrumentV2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return boxing.boxBoolean(UkQueuedDepositConfirmationStateProvider2.hasUkBankAccountDetails((PaymentInstrumentV2) this.L$0));
    }
}
