package com.stripe.android.payments.bankaccount.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RetrieveStripeIntent.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent", m3645f = "RetrieveStripeIntent.kt", m3646l = {19}, m3647m = "invoke-0E7RQCE")
/* renamed from: com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent$invoke$1, reason: use source file name */
/* loaded from: classes22.dex */
final class RetrieveStripeIntent2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RetrieveStripeIntent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetrieveStripeIntent2(RetrieveStripeIntent retrieveStripeIntent, Continuation<? super RetrieveStripeIntent2> continuation) {
        super(continuation);
        this.this$0 = retrieveStripeIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM26924invoke0E7RQCE = this.this$0.m26924invoke0E7RQCE(null, null, this);
        return objM26924invoke0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26924invoke0E7RQCE : Result.m28549boximpl(objM26924invoke0E7RQCE);
    }
}
