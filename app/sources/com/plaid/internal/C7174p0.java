package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.persistence.DatabaseBackedPaneStore", m3645f = "DatabaseBackedPaneStore.kt", m3646l = {19}, m3647m = "getPane")
/* renamed from: com.plaid.internal.p0 */
/* loaded from: classes16.dex */
public final class C7174p0 extends ContinuationImpl {

    /* renamed from: a */
    public C7183q0 f3087a;

    /* renamed from: b */
    public C6009X7 f3088b;

    /* renamed from: c */
    public /* synthetic */ Object f3089c;

    /* renamed from: d */
    public final /* synthetic */ C7183q0 f3090d;

    /* renamed from: e */
    public int f3091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7174p0(C7183q0 c7183q0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3090d = c7183q0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3089c = obj;
        this.f3091e |= Integer.MIN_VALUE;
        return this.f3090d.mo1566a(null, this);
    }
}
