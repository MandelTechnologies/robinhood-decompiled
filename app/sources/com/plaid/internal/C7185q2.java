package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkController", m3645f = "LinkController.kt", m3646l = {108, 112, 115, 116, 119, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 125}, m3647m = "storeStateAndNavigate")
/* renamed from: com.plaid.internal.q2 */
/* loaded from: classes16.dex */
public final class C7185q2 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3126a;

    /* renamed from: b */
    public AbstractC5894L2 f3127b;

    /* renamed from: c */
    public /* synthetic */ Object f3128c;

    /* renamed from: d */
    public final /* synthetic */ C7194r2 f3129d;

    /* renamed from: e */
    public int f3130e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7185q2(C7194r2 c7194r2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3129d = c7194r2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3128c = obj;
        this.f3130e |= Integer.MIN_VALUE;
        return this.f3129d.m1580a((AbstractC5894L2) null, this);
    }
}
