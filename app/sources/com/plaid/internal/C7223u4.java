package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel", m3645f = "OutOfProcessWebviewViewModel.kt", m3646l = {125, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "readPendingResult")
/* renamed from: com.plaid.internal.u4 */
/* loaded from: classes16.dex */
public final class C7223u4 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3231a;

    /* renamed from: b */
    public /* synthetic */ Object f3232b;

    /* renamed from: c */
    public final /* synthetic */ C7205s4 f3233c;

    /* renamed from: d */
    public int f3234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7223u4(C7205s4 c7205s4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3233c = c7205s4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3232b = obj;
        this.f3234d |= Integer.MIN_VALUE;
        return C7205s4.m1606b(this.f3233c, this);
    }
}
