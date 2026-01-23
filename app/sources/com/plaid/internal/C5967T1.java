package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.T1 */
/* loaded from: classes16.dex */
public final class C5967T1 implements Factory<InterfaceC7198r6> {

    /* renamed from: a */
    public final C6021Z1 f1705a;

    public C5967T1(C5848G1 c5848g1, C6021Z1 c6021z1) {
        this.f1705a = c6021z1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C7226u7 webviewFallbackUriStore = (C7226u7) this.f1705a.get();
        Intrinsics.checkNotNullParameter(webviewFallbackUriStore, "webviewFallbackUriStore");
        return (InterfaceC7198r6) Preconditions.checkNotNullFromProvides(webviewFallbackUriStore);
    }
}
