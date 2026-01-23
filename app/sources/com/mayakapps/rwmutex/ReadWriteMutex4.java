package com.mayakapps.rwmutex;

import com.mayakapps.rwmutex.ReadWriteMutex3;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ReadWriteMutex.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.mayakapps.rwmutex.ReadWriteMutexImpl$WriteMutex", m3645f = "ReadWriteMutex.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE}, m3647m = "lock")
/* renamed from: com.mayakapps.rwmutex.ReadWriteMutexImpl$WriteMutex$lock$1, reason: use source file name */
/* loaded from: classes27.dex */
final class ReadWriteMutex4 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReadWriteMutex3.WriteMutex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReadWriteMutex4(ReadWriteMutex3.WriteMutex writeMutex, Continuation<? super ReadWriteMutex4> continuation) {
        super(continuation);
        this.this$0 = writeMutex;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.lock(null, this);
    }
}
