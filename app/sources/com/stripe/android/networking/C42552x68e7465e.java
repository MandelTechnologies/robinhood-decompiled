package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.networking.StripeApiRepository", m3645f = "StripeApiRepository.kt", m3646l = {1130}, m3647m = "createPaymentIntentFinancialConnectionsSession-BWLJW6A")
/* renamed from: com.stripe.android.networking.StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1 */
/* loaded from: classes22.dex */
final class C42552x68e7465e extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C42552x68e7465e(StripeApiRepository stripeApiRepository, Continuation<? super C42552x68e7465e> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo26875createPaymentIntentFinancialConnectionsSessionBWLJW6A = this.this$0.mo26875createPaymentIntentFinancialConnectionsSessionBWLJW6A(null, null, null, this);
        return objMo26875createPaymentIntentFinancialConnectionsSessionBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo26875createPaymentIntentFinancialConnectionsSessionBWLJW6A : Result.m28549boximpl(objMo26875createPaymentIntentFinancialConnectionsSessionBWLJW6A);
    }
}
