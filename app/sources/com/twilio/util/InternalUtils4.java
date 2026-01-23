package com.twilio.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InternalUtils.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.twilio.util.InternalUtilsKt", m3645f = "InternalUtils.kt", m3646l = {55, 128}, m3647m = "await-8Mi8wO0")
/* renamed from: com.twilio.util.InternalUtilsKt$await$1, reason: use source file name */
/* loaded from: classes11.dex */
final class InternalUtils4<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    InternalUtils4(Continuation<? super InternalUtils4> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return InternalUtils3.m27240await8Mi8wO0(null, 0L, this);
    }
}
