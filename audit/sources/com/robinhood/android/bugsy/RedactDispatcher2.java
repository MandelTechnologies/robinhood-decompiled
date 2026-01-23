package com.robinhood.android.bugsy;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RedactDispatcher.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.bugsy.RedactDispatcher", m3645f = "RedactDispatcher.kt", m3646l = {32}, m3647m = "withRedaction$lib_bugsy_externalRelease")
/* renamed from: com.robinhood.android.bugsy.RedactDispatcher$withRedaction$1, reason: use source file name */
/* loaded from: classes7.dex */
final class RedactDispatcher2 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RedactDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RedactDispatcher2(RedactDispatcher redactDispatcher, Continuation<? super RedactDispatcher2> continuation) {
        super(continuation);
        this.this$0 = redactDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.withRedaction$lib_bugsy_externalRelease(null, this);
    }
}
