package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.OAuthPolling", m3645f = "OAuthPolling.kt", m3646l = {43, 45}, m3647m = "waitForOAuthComplete")
/* renamed from: com.plaid.internal.g4 */
/* loaded from: classes16.dex */
public final class C7086g4 extends ContinuationImpl {

    /* renamed from: a */
    public C7096h4 f2798a;

    /* renamed from: b */
    public long f2799b;

    /* renamed from: c */
    public /* synthetic */ Object f2800c;

    /* renamed from: d */
    public final /* synthetic */ C7096h4 f2801d;

    /* renamed from: e */
    public int f2802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7086g4(C7096h4 c7096h4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2801d = c7096h4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f2800c = obj;
        this.f2802e |= Integer.MIN_VALUE;
        return this.f2801d.m1522a(this);
    }
}
