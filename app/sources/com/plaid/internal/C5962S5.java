package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.di.PreCompletionResultStore", m3645f = "PreCompletionResultStore.kt", m3646l = {24}, m3647m = "readPreCompletionResult")
/* renamed from: com.plaid.internal.S5 */
/* loaded from: classes16.dex */
public final class C5962S5 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f1688a;

    /* renamed from: b */
    public final /* synthetic */ C5971T5 f1689b;

    /* renamed from: c */
    public int f1690c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5962S5(C5971T5 c5971t5, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1689b = c5971t5;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1688a = obj;
        this.f1690c |= Integer.MIN_VALUE;
        return this.f1689b.mo1318a(this);
    }
}
