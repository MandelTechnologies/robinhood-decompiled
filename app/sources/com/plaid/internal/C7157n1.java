package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", m3645f = "HeadlessOAuthViewModel.kt", m3646l = {78, 82}, m3647m = "getOAuthState")
/* renamed from: com.plaid.internal.n1 */
/* loaded from: classes16.dex */
public final class C7157n1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3006a;

    /* renamed from: b */
    public Pane$PaneRendering f3007b;

    /* renamed from: c */
    public /* synthetic */ Object f3008c;

    /* renamed from: d */
    public final /* synthetic */ C7122k1 f3009d;

    /* renamed from: e */
    public int f3010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7157n1(C7122k1 c7122k1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3009d = c7122k1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.f3008c = obj;
        this.f3010e |= Integer.MIN_VALUE;
        return C7122k1.m1537a(this.f3009d, (Pane$PaneRendering) null, this);
    }
}
