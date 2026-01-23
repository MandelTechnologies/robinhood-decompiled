package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel", m3645f = "OutOfProcessWebviewViewModel.kt", m3646l = {115}, m3647m = "readChannelAndStartPolling")
/* renamed from: com.plaid.internal.t4 */
/* loaded from: classes16.dex */
public final class C7214t4 extends ContinuationImpl {

    /* renamed from: a */
    public C7205s4 f3217a;

    /* renamed from: b */
    public /* synthetic */ Object f3218b;

    /* renamed from: c */
    public final /* synthetic */ C7205s4 f3219c;

    /* renamed from: d */
    public int f3220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7214t4(C7205s4 c7205s4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3219c = c7205s4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3218b = obj;
        this.f3220d |= Integer.MIN_VALUE;
        return C7205s4.m1604a(this.f3219c, this);
    }
}
