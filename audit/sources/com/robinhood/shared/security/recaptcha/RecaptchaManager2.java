package com.robinhood.shared.security.recaptcha;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RecaptchaManager.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.security.recaptcha.RecaptchaManager", m3645f = "RecaptchaManager.kt", m3646l = {100, 107, 108}, m3647m = "retryWithBackoff-0E7RQCE")
/* renamed from: com.robinhood.shared.security.recaptcha.RecaptchaManager$retryWithBackoff$1, reason: use source file name */
/* loaded from: classes6.dex */
final class RecaptchaManager2<T> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecaptchaManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecaptchaManager2(RecaptchaManager recaptchaManager, Continuation<? super RecaptchaManager2> continuation) {
        super(continuation);
        this.this$0 = recaptchaManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM25663retryWithBackoff0E7RQCE = this.this$0.m25663retryWithBackoff0E7RQCE(0, null, this);
        return objM25663retryWithBackoff0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM25663retryWithBackoff0E7RQCE : Result.m28549boximpl(objM25663retryWithBackoff0E7RQCE);
    }
}
