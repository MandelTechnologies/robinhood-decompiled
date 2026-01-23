package com.plaid.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.preload.PreloadLinkController", m3645f = "PreloadLinkController.kt", m3646l = {99}, m3647m = "getResult")
/* renamed from: com.plaid.internal.U5 */
/* loaded from: classes16.dex */
public final class C5980U5 extends ContinuationImpl {

    /* renamed from: a */
    public C6025Z5 f1751a;

    /* renamed from: b */
    public /* synthetic */ Object f1752b;

    /* renamed from: c */
    public final /* synthetic */ C6025Z5 f1753c;

    /* renamed from: d */
    public int f1754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5980U5(C6025Z5 c6025z5, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1753c = c6025z5;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1752b = obj;
        this.f1754d |= Integer.MIN_VALUE;
        return this.f1753c.m1357a(this);
    }
}
