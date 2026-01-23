package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", m3645f = "HeadlessOAuthViewModel.kt", m3646l = {97}, m3647m = "pollOAuthResult")
/* renamed from: com.plaid.internal.p1 */
/* loaded from: classes16.dex */
public final class C7175p1 extends ContinuationImpl {

    /* renamed from: a */
    public C7122k1 f3092a;

    /* renamed from: b */
    public String f3093b;

    /* renamed from: c */
    public /* synthetic */ Object f3094c;

    /* renamed from: d */
    public final /* synthetic */ C7122k1 f3095d;

    /* renamed from: e */
    public int f3096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7175p1(C7122k1 c7122k1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3095d = c7122k1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3094c = obj;
        this.f3096e |= Integer.MIN_VALUE;
        return C7122k1.m1541b(this.f3095d, null, this);
    }
}
