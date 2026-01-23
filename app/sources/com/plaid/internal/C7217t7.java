package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.di.WebviewFallbackUriStore", m3645f = "WebviewFallbackUriStore.kt", m3646l = {20, 24}, m3647m = "readWebviewFallbackUri")
/* renamed from: com.plaid.internal.t7 */
/* loaded from: classes16.dex */
public final class C7217t7 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3222a;

    /* renamed from: b */
    public /* synthetic */ Object f3223b;

    /* renamed from: c */
    public final /* synthetic */ C7226u7 f3224c;

    /* renamed from: d */
    public int f3225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7217t7(C7226u7 c7226u7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3224c = c7226u7;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3223b = obj;
        this.f3225d |= Integer.MIN_VALUE;
        return this.f3224c.mo1600a(this);
    }
}
