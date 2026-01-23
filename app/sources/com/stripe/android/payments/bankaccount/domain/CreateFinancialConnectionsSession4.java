package com.stripe.android.payments.bankaccount.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CreateFinancialConnectionsSession.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession", m3645f = "CreateFinancialConnectionsSession.kt", m3646l = {62}, m3647m = "forSetupIntent-hUnOzRk")
/* renamed from: com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession$forSetupIntent$1, reason: use source file name */
/* loaded from: classes22.dex */
final class CreateFinancialConnectionsSession4 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CreateFinancialConnectionsSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateFinancialConnectionsSession4(CreateFinancialConnectionsSession createFinancialConnectionsSession, Continuation<? super CreateFinancialConnectionsSession4> continuation) {
        super(continuation);
        this.this$0 = createFinancialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM26923forSetupIntenthUnOzRk = this.this$0.m26923forSetupIntenthUnOzRk(null, null, null, null, null, this);
        return objM26923forSetupIntenthUnOzRk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26923forSetupIntenthUnOzRk : Result.m28549boximpl(objM26923forSetupIntenthUnOzRk);
    }
}
