package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.preload.PreloadLinkController", m3645f = "PreloadLinkController.kt", m3646l = {44, 48, 52}, m3647m = "preloadWorkflow")
/* renamed from: com.plaid.internal.X5 */
/* loaded from: classes16.dex */
public final class C6007X5 extends ContinuationImpl {

    /* renamed from: a */
    public C6025Z5 f1824a;

    /* renamed from: b */
    public /* synthetic */ Object f1825b;

    /* renamed from: c */
    public final /* synthetic */ C6025Z5 f1826c;

    /* renamed from: d */
    public int f1827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6007X5(C6025Z5 c6025z5, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1826c = c6025z5;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1825b = obj;
        this.f1827d |= Integer.MIN_VALUE;
        return this.f1826c.m1359c(this);
    }
}
