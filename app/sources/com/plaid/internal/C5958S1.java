package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.S1 */
/* loaded from: classes16.dex */
public final class C5958S1 implements Factory<InterfaceC7189q6> {

    /* renamed from: a */
    public final C6012Y1 f1678a;

    public C5958S1(C5848G1 c5848g1, C6012Y1 c6012y1) {
        this.f1678a = c6012y1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C7208s7 webviewFallbackIdStore = (C7208s7) this.f1678a.get();
        Intrinsics.checkNotNullParameter(webviewFallbackIdStore, "webviewFallbackIdStore");
        return (InterfaceC7189q6) Preconditions.checkNotNullFromProvides(webviewFallbackIdStore);
    }
}
