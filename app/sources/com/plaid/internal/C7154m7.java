package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.WebviewFallbackAnalytics", m3645f = "WebviewFallbackAnalytics.kt", m3646l = {41}, m3647m = "trackWebviewFallbackEmitPreCompletionResult$link_sdk_release")
/* renamed from: com.plaid.internal.m7 */
/* loaded from: classes16.dex */
public final class C7154m7 extends ContinuationImpl {

    /* renamed from: a */
    public C7172o7 f2987a;

    /* renamed from: b */
    public /* synthetic */ Object f2988b;

    /* renamed from: c */
    public final /* synthetic */ C7172o7 f2989c;

    /* renamed from: d */
    public int f2990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7154m7(C7172o7 c7172o7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2989c = c7172o7;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f2988b = obj;
        this.f2990d |= Integer.MIN_VALUE;
        return this.f2989c.m1570b(this);
    }
}
