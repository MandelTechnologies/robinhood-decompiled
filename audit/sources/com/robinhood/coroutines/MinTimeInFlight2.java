package com.robinhood.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MinTimeInFlight.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.coroutines.MinTimeInFlightKt", m3645f = "MinTimeInFlight.kt", m3646l = {20, 25}, m3647m = "withMinTimeInFlight-dWUq8MI")
/* renamed from: com.robinhood.coroutines.MinTimeInFlightKt$withMinTimeInFlight$1, reason: use source file name */
/* loaded from: classes15.dex */
final class MinTimeInFlight2<T> extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    MinTimeInFlight2(Continuation<? super MinTimeInFlight2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MinTimeInFlight.m22184withMinTimeInFlightdWUq8MI(null, 0L, null, this);
    }
}
