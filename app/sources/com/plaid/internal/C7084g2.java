package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.link.LinkActivityViewModel", m3645f = "LinkActivityViewModel.kt", m3646l = {105}, m3647m = "onBackPressed")
/* renamed from: com.plaid.internal.g2 */
/* loaded from: classes16.dex */
public final class C7084g2 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f2793a;

    /* renamed from: b */
    public final /* synthetic */ C7094h2 f2794b;

    /* renamed from: c */
    public int f2795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7084g2(C7094h2 c7094h2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2794b = c7094h2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f2793a = obj;
        this.f2795c |= Integer.MIN_VALUE;
        return this.f2794b.m1521a(this);
    }
}
