package com.robinhood.android.equity.submission;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EquityOrderManager.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equity.submission.EquityOrderManager", m3645f = "EquityOrderManager.kt", m3646l = {74}, m3647m = "validateAndSubmit-BWLJW6A")
/* renamed from: com.robinhood.android.equity.submission.EquityOrderManager$validateAndSubmit$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityOrderManager3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EquityOrderManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityOrderManager3(EquityOrderManager equityOrderManager, Continuation<? super EquityOrderManager3> continuation) {
        super(continuation);
        this.this$0 = equityOrderManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM13723validateAndSubmitBWLJW6A = this.this$0.m13723validateAndSubmitBWLJW6A(null, null, null, this);
        return objM13723validateAndSubmitBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM13723validateAndSubmitBWLJW6A : Result.m28549boximpl(objM13723validateAndSubmitBWLJW6A);
    }
}
