package com.robinhood.android.moneymovement.checkoutflow;

import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PaymentPreferenceDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$setupMicrogramActions$2$1$1$2$1", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PaymentPreferenceDuxo$setupMicrogramActions$2$1$1$2$1 extends ContinuationImpl7 implements Function2<PaymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState>, Object> {
    final /* synthetic */ TransferAccount $transferAccount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentPreferenceDuxo$setupMicrogramActions$2$1$1$2$1(TransferAccount transferAccount, Continuation<? super PaymentPreferenceDuxo$setupMicrogramActions$2$1$1$2$1> continuation) {
        super(2, continuation);
        this.$transferAccount = transferAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentPreferenceDuxo$setupMicrogramActions$2$1$1$2$1 paymentPreferenceDuxo$setupMicrogramActions$2$1$1$2$1 = new PaymentPreferenceDuxo$setupMicrogramActions$2$1$1$2$1(this.$transferAccount, continuation);
        paymentPreferenceDuxo$setupMicrogramActions$2$1$1$2$1.L$0 = obj;
        return paymentPreferenceDuxo$setupMicrogramActions$2$1$1$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PaymentPreferenceDataState paymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState> continuation) {
        return ((PaymentPreferenceDuxo$setupMicrogramActions$2$1$1$2$1) create(paymentPreferenceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PaymentPreferenceDataState.copy$default((PaymentPreferenceDataState) this.L$0, false, null, false, null, this.$transferAccount.getType(), false, 0, null, null, null, null, null, 4079, null);
    }
}
