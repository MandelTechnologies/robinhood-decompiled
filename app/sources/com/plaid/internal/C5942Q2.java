package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkStateReducer", m3645f = "LinkStateReducer.kt", m3646l = {469, 471}, m3647m = "handleSuccess")
/* renamed from: com.plaid.internal.Q2 */
/* loaded from: classes16.dex */
public final class C5942Q2 extends ContinuationImpl {

    /* renamed from: a */
    public C5995W2 f1640a;

    /* renamed from: b */
    public String f1641b;

    /* renamed from: c */
    public String f1642c;

    /* renamed from: d */
    public String f1643d;

    /* renamed from: e */
    public String f1644e;

    /* renamed from: f */
    public Pane$PaneRendering f1645f;

    /* renamed from: g */
    public List f1646g;

    /* renamed from: h */
    public List f1647h;

    /* renamed from: i */
    public String f1648i;

    /* renamed from: j */
    public Iterator f1649j;

    /* renamed from: k */
    public /* synthetic */ Object f1650k;

    /* renamed from: l */
    public final /* synthetic */ C5995W2 f1651l;

    /* renamed from: m */
    public int f1652m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5942Q2(C5995W2 c5995w2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1651l = c5995w2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f1650k = obj;
        this.f1652m |= Integer.MIN_VALUE;
        return this.f1651l.m1347a(null, null, null, null, null, null, null, null, this);
    }
}
