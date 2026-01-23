package com.plaid.internal;

import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.s7 */
/* loaded from: classes16.dex */
public final class C7208s7 implements InterfaceC7189q6, InterfaceC7100h8 {

    /* renamed from: a */
    public final InterfaceC5916N3 f3208a;

    public C7208s7(InterfaceC5916N3 localPaneStateStore) {
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        this.f3208a = localPaneStateStore;
    }

    @Override // com.plaid.internal.InterfaceC7189q6
    /* renamed from: a */
    public final Object mo1575a(ContinuationImpl7 continuationImpl7) {
        Object objMo1256a = this.f3208a.mo1256a("webview_fallback_id_state", continuationImpl7);
        return objMo1256a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1256a : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.InterfaceC7189q6
    /* renamed from: a */
    public final Object mo1574a(ContinuationImpl continuationImpl) {
        return this.f3208a.mo1255a("webview_fallback_id_state", "webview_fallback_id", continuationImpl);
    }

    @Override // com.plaid.internal.InterfaceC7100h8
    /* renamed from: a */
    public final Object mo1525a(String str, C7185q2 c7185q2) {
        Object objMo1254a = this.f3208a.mo1254a("webview_fallback_id_state", "webview_fallback_id", str, c7185q2);
        return objMo1254a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1254a : Unit.INSTANCE;
    }
}
