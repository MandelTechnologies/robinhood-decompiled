package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", m3645f = "HeadlessOAuthViewModel.kt", m3646l = {91}, m3647m = "openLoginUrl")
/* renamed from: com.plaid.internal.o1 */
/* loaded from: classes16.dex */
public final class C7166o1 extends ContinuationImpl {

    /* renamed from: a */
    public C7122k1 f3053a;

    /* renamed from: b */
    public String f3054b;

    /* renamed from: c */
    public /* synthetic */ Object f3055c;

    /* renamed from: d */
    public final /* synthetic */ C7122k1 f3056d;

    /* renamed from: e */
    public int f3057e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7166o1(C7122k1 c7122k1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3056d = c7122k1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3055c = obj;
        this.f3057e |= Integer.MIN_VALUE;
        return C7122k1.m1538a(this.f3056d, (String) null, this);
    }
}
