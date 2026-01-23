package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.persistence.LinkWorkflowAnalyticsDatabaseBackedStore", m3645f = "LinkWorkflowAnalyticsDatabaseBackedStore.kt", m3646l = {25}, m3647m = "retrieveAllEvents")
/* renamed from: com.plaid.internal.s3 */
/* loaded from: classes16.dex */
public final class C7204s3 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f3183a;

    /* renamed from: b */
    public final /* synthetic */ C7213t3 f3184b;

    /* renamed from: c */
    public int f3185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7204s3(C7213t3 c7213t3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3184b = c7213t3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3183a = obj;
        this.f3185c |= Integer.MIN_VALUE;
        return this.f3184b.mo1618a(this);
    }
}
