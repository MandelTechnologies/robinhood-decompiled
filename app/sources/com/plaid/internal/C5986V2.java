package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkStateReducer", m3645f = "LinkStateReducer.kt", m3646l = {53, 56, 64, 67, 75}, m3647m = "start")
/* renamed from: com.plaid.internal.V2 */
/* loaded from: classes16.dex */
public final class C5986V2 extends ContinuationImpl {

    /* renamed from: a */
    public C5995W2 f1761a;

    /* renamed from: b */
    public AbstractC5894L2 f1762b;

    /* renamed from: c */
    public boolean f1763c;

    /* renamed from: d */
    public /* synthetic */ Object f1764d;

    /* renamed from: e */
    public final /* synthetic */ C5995W2 f1765e;

    /* renamed from: f */
    public int f1766f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5986V2(C5995W2 c5995w2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1765e = c5995w2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1764d = obj;
        this.f1766f |= Integer.MIN_VALUE;
        return this.f1765e.m1345a((AbstractC5894L2) null, false, (ContinuationImpl) this);
    }
}
