package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel", m3645f = "OutOfProcessWebviewViewModel.kt", m3646l = {107}, m3647m = "getUrlUri")
/* renamed from: com.plaid.internal.q4 */
/* loaded from: classes16.dex */
public final class C7187q4 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f3139a;

    /* renamed from: b */
    public final /* synthetic */ C7205s4 f3140b;

    /* renamed from: c */
    public int f3141c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7187q4(C7205s4 c7205s4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3140b = c7205s4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3139a = obj;
        this.f3141c |= Integer.MIN_VALUE;
        return this.f3140b.m1607a(this);
    }
}
