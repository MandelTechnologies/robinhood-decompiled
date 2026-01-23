package com.plaid.internal;

import java.lang.reflect.Type;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.core.crashreporting.internal.CrashStorage", m3645f = "CrashStorage.kt", m3646l = {53}, m3647m = "loadEvents")
/* renamed from: com.plaid.internal.e0 */
/* loaded from: classes16.dex */
public final class C7062e0 extends ContinuationImpl {

    /* renamed from: a */
    public C7082g0 f2736a;

    /* renamed from: b */
    public Type f2737b;

    /* renamed from: c */
    public /* synthetic */ Object f2738c;

    /* renamed from: d */
    public final /* synthetic */ C7082g0 f2739d;

    /* renamed from: e */
    public int f2740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7062e0(C7082g0 c7082g0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2739d = c7082g0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f2738c = obj;
        this.f2740e |= Integer.MIN_VALUE;
        return C7082g0.m1509a(this.f2739d, null, null, this);
    }
}
