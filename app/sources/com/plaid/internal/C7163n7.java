package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.WebviewFallbackAnalytics", m3645f = "WebviewFallbackAnalytics.kt", m3646l = {20}, m3647m = "trackWebviewFallbackOpen$link_sdk_release")
/* renamed from: com.plaid.internal.n7 */
/* loaded from: classes16.dex */
public final class C7163n7 extends ContinuationImpl {

    /* renamed from: a */
    public C7172o7 f3024a;

    /* renamed from: b */
    public /* synthetic */ Object f3025b;

    /* renamed from: c */
    public final /* synthetic */ C7172o7 f3026c;

    /* renamed from: d */
    public int f3027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7163n7(C7172o7 c7172o7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3026c = c7172o7;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3025b = obj;
        this.f3027d |= Integer.MIN_VALUE;
        return this.f3026c.m1571c(this);
    }
}
