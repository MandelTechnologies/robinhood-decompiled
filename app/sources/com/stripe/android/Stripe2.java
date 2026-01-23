package com.stripe.android;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Stripe.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.Stripe", m3645f = "Stripe.kt", m3646l = {1535}, m3647m = "createTokenOrThrow$payments_core_release")
/* renamed from: com.stripe.android.Stripe$createTokenOrThrow$1, reason: use source file name */
/* loaded from: classes10.dex */
final class Stripe2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Stripe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Stripe2(Stripe stripe, Continuation<? super Stripe2> continuation) {
        super(continuation);
        this.this$0 = stripe;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createTokenOrThrow$payments_core_release(null, null, null, this);
    }
}
