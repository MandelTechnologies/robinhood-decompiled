package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.e2 */
/* loaded from: classes16.dex */
public final class C7064e2 implements Factory<InterfaceC7110i8> {

    /* renamed from: a */
    public final C6021Z1 f2741a;

    /* renamed from: b */
    public final Provider<C7199r7> f2742b;

    public C7064e2(C5848G1 c5848g1, C6021Z1 c6021z1, Provider provider) {
        this.f2741a = c6021z1;
        this.f2742b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C7226u7 webviewFallbackUriStore = (C7226u7) this.f2741a.get();
        C7199r7 webviewFallbackBaseUrlOverWriter = this.f2742b.get();
        Intrinsics.checkNotNullParameter(webviewFallbackUriStore, "webviewFallbackUriStore");
        Intrinsics.checkNotNullParameter(webviewFallbackBaseUrlOverWriter, "webviewFallbackBaseUrlOverWriter");
        return (InterfaceC7110i8) Preconditions.checkNotNullFromProvides(webviewFallbackUriStore);
    }
}
