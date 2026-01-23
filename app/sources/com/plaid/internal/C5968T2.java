package com.plaid.internal;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkStateReducer", m3645f = "LinkStateReducer.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE, 331, 338, 365}, m3647m = "previous")
/* renamed from: com.plaid.internal.T2 */
/* loaded from: classes16.dex */
public final class C5968T2 extends ContinuationImpl {

    /* renamed from: a */
    public C5995W2 f1706a;

    /* renamed from: b */
    public AbstractC5894L2 f1707b;

    /* renamed from: c */
    public C6009X7 f1708c;

    /* renamed from: d */
    public List f1709d;

    /* renamed from: e */
    public C6009X7 f1710e;

    /* renamed from: f */
    public /* synthetic */ Object f1711f;

    /* renamed from: g */
    public final /* synthetic */ C5995W2 f1712g;

    /* renamed from: h */
    public int f1713h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5968T2(C5995W2 c5995w2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1712g = c5995w2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1711f = obj;
        this.f1713h |= Integer.MIN_VALUE;
        return this.f1712g.m1348b(null, this);
    }
}
