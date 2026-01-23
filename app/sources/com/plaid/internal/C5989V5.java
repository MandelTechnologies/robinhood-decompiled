package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.preload.PreloadLinkController", m3645f = "PreloadLinkController.kt", m3646l = {56, 64}, m3647m = "maybePreloadLink")
/* renamed from: com.plaid.internal.V5 */
/* loaded from: classes16.dex */
public final class C5989V5 extends ContinuationImpl {

    /* renamed from: a */
    public C6025Z5 f1770a;

    /* renamed from: b */
    public /* synthetic */ Object f1771b;

    /* renamed from: c */
    public final /* synthetic */ C6025Z5 f1772c;

    /* renamed from: d */
    public int f1773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5989V5(C6025Z5 c6025z5, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1772c = c6025z5;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1771b = obj;
        this.f1773d |= Integer.MIN_VALUE;
        return this.f1772c.m1358b(this);
    }
}
