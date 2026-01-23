package com.stripe.android.payments;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentFlowResultProcessor.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.PaymentFlowResultProcessor", m3645f = "PaymentFlowResultProcessor.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "refreshStripeIntentUntilTerminalState-BWLJW6A")
/* renamed from: com.stripe.android.payments.PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1 */
/* loaded from: classes22.dex */
final class C42556x95b5fde5 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentFlowResultProcessor<T, S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C42556x95b5fde5(PaymentFlowResultProcessor<T, ? extends S> paymentFlowResultProcessor, Continuation<? super C42556x95b5fde5> continuation) {
        super(continuation);
        this.this$0 = paymentFlowResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM26912refreshStripeIntentUntilTerminalStateBWLJW6A = this.this$0.m26912refreshStripeIntentUntilTerminalStateBWLJW6A(null, null, null, this);
        return objM26912refreshStripeIntentUntilTerminalStateBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26912refreshStripeIntentUntilTerminalStateBWLJW6A : Result.m28549boximpl(objM26912refreshStripeIntentUntilTerminalStateBWLJW6A);
    }
}
