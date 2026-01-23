package com.plaid.internal;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkStateReducer", m3645f = "LinkStateReducer.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m3647m = "next")
/* renamed from: com.plaid.internal.R2 */
/* loaded from: classes16.dex */
public final class C5950R2 extends ContinuationImpl {

    /* renamed from: a */
    public C5995W2 f1661a;

    /* renamed from: b */
    public AbstractC5894L2 f1662b;

    /* renamed from: c */
    public List f1663c;

    /* renamed from: d */
    public String f1664d;

    /* renamed from: e */
    public /* synthetic */ Object f1665e;

    /* renamed from: f */
    public final /* synthetic */ C5995W2 f1666f;

    /* renamed from: g */
    public int f1667g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5950R2(C5995W2 c5995w2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1666f = c5995w2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1665e = obj;
        this.f1667g |= Integer.MIN_VALUE;
        return this.f1666f.m1343a((AbstractC5894L2) null, (List) null, this);
    }
}
