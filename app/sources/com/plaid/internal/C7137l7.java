package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.WebviewFallbackAnalytics", m3645f = "WebviewFallbackAnalytics.kt", m3646l = {31}, m3647m = "trackWebviewFallbackCancel$link_sdk_release")
/* renamed from: com.plaid.internal.l7 */
/* loaded from: classes16.dex */
public final class C7137l7 extends ContinuationImpl {

    /* renamed from: a */
    public C7172o7 f2924a;

    /* renamed from: b */
    public /* synthetic */ Object f2925b;

    /* renamed from: c */
    public final /* synthetic */ C7172o7 f2926c;

    /* renamed from: d */
    public int f2927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7137l7(C7172o7 c7172o7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2926c = c7172o7;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f2925b = obj;
        this.f2927d |= Integer.MIN_VALUE;
        return this.f2926c.m1569a(this);
    }
}
