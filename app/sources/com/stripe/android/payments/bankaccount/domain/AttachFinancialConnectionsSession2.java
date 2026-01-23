package com.stripe.android.payments.bankaccount.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AttachFinancialConnectionsSession.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession", m3645f = "AttachFinancialConnectionsSession.kt", m3646l = {30}, m3647m = "forPaymentIntent-yxL6bBk")
/* renamed from: com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession$forPaymentIntent$1, reason: use source file name */
/* loaded from: classes22.dex */
final class AttachFinancialConnectionsSession2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AttachFinancialConnectionsSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AttachFinancialConnectionsSession2(AttachFinancialConnectionsSession attachFinancialConnectionsSession, Continuation<? super AttachFinancialConnectionsSession2> continuation) {
        super(continuation);
        this.this$0 = attachFinancialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM26919forPaymentIntentyxL6bBk = this.this$0.m26919forPaymentIntentyxL6bBk(null, null, null, null, this);
        return objM26919forPaymentIntentyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26919forPaymentIntentyxL6bBk : Result.m28549boximpl(objM26919forPaymentIntentyxL6bBk);
    }
}
