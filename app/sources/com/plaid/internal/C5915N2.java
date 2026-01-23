package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkStateReducer", m3645f = "LinkStateReducer.kt", m3646l = {114, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "callWorkflowStart")
/* renamed from: com.plaid.internal.N2 */
/* loaded from: classes16.dex */
public final class C5915N2 extends ContinuationImpl {

    /* renamed from: a */
    public C5995W2 f1559a;

    /* renamed from: b */
    public String f1560b;

    /* renamed from: c */
    public String f1561c;

    /* renamed from: d */
    public String f1562d;

    /* renamed from: e */
    public /* synthetic */ Object f1563e;

    /* renamed from: f */
    public final /* synthetic */ C5995W2 f1564f;

    /* renamed from: g */
    public int f1565g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5915N2(C5995W2 c5995w2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1564f = c5995w2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1563e = obj;
        this.f1565g |= Integer.MIN_VALUE;
        return this.f1564f.m1346a((Workflow$LinkWorkflowStartRequest) null, (String) null, (String) null, (String) null, this);
    }
}
