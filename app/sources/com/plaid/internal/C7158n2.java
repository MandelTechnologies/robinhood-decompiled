package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkController", m3645f = "LinkController.kt", m3646l = {56, 56, 58}, m3647m = "previous")
/* renamed from: com.plaid.internal.n2 */
/* loaded from: classes16.dex */
public final class C7158n2 extends ContinuationImpl {

    /* renamed from: a */
    public C7194r2 f3011a;

    /* renamed from: b */
    public C5995W2 f3012b;

    /* renamed from: c */
    public /* synthetic */ Object f3013c;

    /* renamed from: d */
    public final /* synthetic */ C7194r2 f3014d;

    /* renamed from: e */
    public int f3015e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7158n2(C7194r2 c7194r2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3014d = c7194r2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3013c = obj;
        this.f3015e |= Integer.MIN_VALUE;
        return this.f3014d.mo1583a(this);
    }
}
