package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkController", m3645f = "LinkController.kt", m3646l = {50, 50, 52}, m3647m = "next")
/* renamed from: com.plaid.internal.m2 */
/* loaded from: classes16.dex */
public final class C7149m2 extends ContinuationImpl {

    /* renamed from: a */
    public C7194r2 f2974a;

    /* renamed from: b */
    public Pane$PaneOutput[] f2975b;

    /* renamed from: c */
    public C5995W2 f2976c;

    /* renamed from: d */
    public /* synthetic */ Object f2977d;

    /* renamed from: e */
    public final /* synthetic */ C7194r2 f2978e;

    /* renamed from: f */
    public int f2979f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7149m2(C7194r2 c7194r2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2978e = c7194r2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f2977d = obj;
        this.f2979f |= Integer.MIN_VALUE;
        return this.f2978e.mo1584a((Pane$PaneOutput[]) null, this);
    }
}
