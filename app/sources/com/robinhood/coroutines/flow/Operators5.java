package com.robinhood.coroutines.flow;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Operators.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.coroutines.flow.OperatorsKt", m3645f = "Operators.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "withTimeoutWithDefault-rnQQ1Ag")
/* renamed from: com.robinhood.coroutines.flow.OperatorsKt$withTimeoutWithDefault$1, reason: use source file name */
/* loaded from: classes15.dex */
final class Operators5<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    Operators5(Continuation<? super Operators5> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return Operators.m22188withTimeoutWithDefaultrnQQ1Ag(0L, null, null, this);
    }
}
