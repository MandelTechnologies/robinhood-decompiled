package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.networking.StripeApiRepository", m3645f = "StripeApiRepository.kt", m3646l = {1213}, m3647m = "attachFinancialConnectionsSessionToSetupIntent-hUnOzRk")
/* renamed from: com.stripe.android.networking.StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1 */
/* loaded from: classes22.dex */
final class C42548x126ea553 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C42548x126ea553(StripeApiRepository stripeApiRepository, Continuation<? super C42548x126ea553> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo26867attachFinancialConnectionsSessionToSetupIntenthUnOzRk = this.this$0.mo26867attachFinancialConnectionsSessionToSetupIntenthUnOzRk(null, null, null, null, null, this);
        return objMo26867attachFinancialConnectionsSessionToSetupIntenthUnOzRk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo26867attachFinancialConnectionsSessionToSetupIntenthUnOzRk : Result.m28549boximpl(objMo26867attachFinancialConnectionsSessionToSetupIntenthUnOzRk);
    }
}
