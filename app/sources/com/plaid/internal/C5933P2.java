package com.plaid.internal;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkStateReducer", m3645f = "LinkStateReducer.kt", m3646l = {375, 390}, m3647m = "exitFromCurrentState")
/* renamed from: com.plaid.internal.P2 */
/* loaded from: classes16.dex */
public final class C5933P2 extends ContinuationImpl {

    /* renamed from: a */
    public C5995W2 f1619a;

    /* renamed from: b */
    public AbstractC5894L2 f1620b;

    /* renamed from: c */
    public String f1621c;

    /* renamed from: d */
    public List f1622d;

    /* renamed from: e */
    public /* synthetic */ Object f1623e;

    /* renamed from: f */
    public final /* synthetic */ C5995W2 f1624f;

    /* renamed from: g */
    public int f1625g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5933P2(C5995W2 c5995w2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1624f = c5995w2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1623e = obj;
        this.f1625g |= Integer.MIN_VALUE;
        return this.f1624f.m1344a(null, this);
    }
}
