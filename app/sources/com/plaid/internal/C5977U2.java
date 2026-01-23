package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkStateReducer", m3645f = "LinkStateReducer.kt", m3646l = {419, 436}, m3647m = "resume")
/* renamed from: com.plaid.internal.U2 */
/* loaded from: classes16.dex */
public final class C5977U2 extends ContinuationImpl {

    /* renamed from: a */
    public C5995W2 f1742a;

    /* renamed from: b */
    public AbstractC5894L2 f1743b;

    /* renamed from: c */
    public /* synthetic */ Object f1744c;

    /* renamed from: d */
    public final /* synthetic */ C5995W2 f1745d;

    /* renamed from: e */
    public int f1746e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5977U2(C5995W2 c5995w2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1745d = c5995w2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1744c = obj;
        this.f1746e |= Integer.MIN_VALUE;
        return this.f1745d.m1342a((AbstractC5894L2) null, (AbstractC7207s6) null, this);
    }
}
