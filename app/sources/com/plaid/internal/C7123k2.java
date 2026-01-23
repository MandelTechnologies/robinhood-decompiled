package com.plaid.internal;

import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkController", m3645f = "LinkController.kt", m3646l = {98}, m3647m = "handleSessionHandoff")
/* renamed from: com.plaid.internal.k2 */
/* loaded from: classes16.dex */
public final class C7123k2 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f2899a;

    /* renamed from: b */
    public final /* synthetic */ C7194r2 f2900b;

    /* renamed from: c */
    public int f2901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7123k2(C7194r2 c7194r2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2900b = c7194r2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f2899a = obj;
        this.f2901c |= Integer.MIN_VALUE;
        return this.f2900b.mo1582a((LinkedHashMap) null, this);
    }
}
