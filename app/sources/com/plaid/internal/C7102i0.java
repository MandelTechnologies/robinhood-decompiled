package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.core.crashreporting.internal.CrashWorkManager", m3645f = "CrashWorkManager.kt", m3646l = {30}, m3647m = "storeCrashAndScheduleUpload")
/* renamed from: com.plaid.internal.i0 */
/* loaded from: classes16.dex */
public final class C7102i0 extends ContinuationImpl {

    /* renamed from: a */
    public C7112j0 f2841a;

    /* renamed from: b */
    public /* synthetic */ Object f2842b;

    /* renamed from: c */
    public final /* synthetic */ C7112j0 f2843c;

    /* renamed from: d */
    public int f2844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7102i0(C7112j0 c7112j0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2843c = c7112j0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f2842b = obj;
        this.f2844d |= Integer.MIN_VALUE;
        return this.f2843c.m1534a(null, this);
    }
}
