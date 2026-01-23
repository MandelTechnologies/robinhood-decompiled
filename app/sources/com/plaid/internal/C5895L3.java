package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.persistence.LocalPaneStateDatabaseStore", m3645f = "LocalPaneStateDatabaseStore.kt", m3646l = {23}, m3647m = "putString")
/* renamed from: com.plaid.internal.L3 */
/* loaded from: classes16.dex */
public final class C5895L3 extends ContinuationImpl {

    /* renamed from: a */
    public C5907M3 f1520a;

    /* renamed from: b */
    public String f1521b;

    /* renamed from: c */
    public String f1522c;

    /* renamed from: d */
    public /* synthetic */ Object f1523d;

    /* renamed from: e */
    public final /* synthetic */ C5907M3 f1524e;

    /* renamed from: f */
    public int f1525f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5895L3(C5907M3 c5907m3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1524e = c5907m3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1523d = obj;
        this.f1525f |= Integer.MIN_VALUE;
        return this.f1524e.mo1254a(null, null, null, this);
    }
}
