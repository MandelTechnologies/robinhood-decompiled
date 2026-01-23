package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.network.ExponentialBackoffRetry", m3645f = "ExponentialBackoffRetry.kt", m3646l = {22, 24}, m3647m = "doNetworkCallWithRetries$link_sdk_release")
/* renamed from: com.plaid.internal.W0 */
/* loaded from: classes16.dex */
public final class C5993W0<T> extends ContinuationImpl {

    /* renamed from: a */
    public Object f1787a;

    /* renamed from: b */
    public Ref.ObjectRef f1788b;

    /* renamed from: c */
    public Ref.ObjectRef f1789c;

    /* renamed from: d */
    public /* synthetic */ Object f1790d;

    /* renamed from: e */
    public final /* synthetic */ C6011Y0 f1791e;

    /* renamed from: f */
    public int f1792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5993W0(C6011Y0 c6011y0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1791e = c6011y0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1790d = obj;
        this.f1792f |= Integer.MIN_VALUE;
        return this.f1791e.m1356a(null, this);
    }
}
