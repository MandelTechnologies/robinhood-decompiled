package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.di.WebviewBackgroundTransparencyStore", m3645f = "WebviewBackgroundTransparencyStore.kt", m3646l = {27}, m3647m = "readWebviewBackgroundTransparencyState")
/* renamed from: com.plaid.internal.j7 */
/* loaded from: classes16.dex */
public final class C7119j7 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f2882a;

    /* renamed from: b */
    public final /* synthetic */ C7128k7 f2883b;

    /* renamed from: c */
    public int f2884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7119j7(C7128k7 c7128k7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2883b = c7128k7;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f2882a = obj;
        this.f2884c |= Integer.MIN_VALUE;
        return this.f2883b.mo1548a(this);
    }
}
