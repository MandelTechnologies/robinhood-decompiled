package com.stripe.android.payments.bankaccount.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AttachFinancialConnectionsSession.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession", m3645f = "AttachFinancialConnectionsSession.kt", m3646l = {60}, m3647m = "forSetupIntent-yxL6bBk")
/* renamed from: com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession$forSetupIntent$1, reason: use source file name */
/* loaded from: classes22.dex */
final class AttachFinancialConnectionsSession3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AttachFinancialConnectionsSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AttachFinancialConnectionsSession3(AttachFinancialConnectionsSession attachFinancialConnectionsSession, Continuation<? super AttachFinancialConnectionsSession3> continuation) {
        super(continuation);
        this.this$0 = attachFinancialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM26920forSetupIntentyxL6bBk = this.this$0.m26920forSetupIntentyxL6bBk(null, null, null, null, this);
        return objM26920forSetupIntentyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26920forSetupIntentyxL6bBk : Result.m28549boximpl(objM26920forSetupIntentyxL6bBk);
    }
}
