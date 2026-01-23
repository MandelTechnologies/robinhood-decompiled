package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkController", m3645f = "LinkController.kt", m3646l = {42, 44, 46}, m3647m = "start")
/* renamed from: com.plaid.internal.p2 */
/* loaded from: classes16.dex */
public final class C7176p2 extends ContinuationImpl {

    /* renamed from: a */
    public C7194r2 f3097a;

    /* renamed from: b */
    public /* synthetic */ Object f3098b;

    /* renamed from: c */
    public final /* synthetic */ C7194r2 f3099c;

    /* renamed from: d */
    public int f3100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7176p2(C7194r2 c7194r2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3099c = c7194r2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3098b = obj;
        this.f3100d |= Integer.MIN_VALUE;
        return this.f3099c.mo1588b(this);
    }
}
