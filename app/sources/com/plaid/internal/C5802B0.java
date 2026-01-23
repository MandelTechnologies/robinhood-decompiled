package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.B0 */
/* loaded from: classes16.dex */
public final class C5802B0 implements Factory<C7265z0> {

    /* renamed from: a */
    public final Provider<InterfaceC7162n6> f1262a;

    public C5802B0(Provider<InterfaceC7162n6> provider) {
        this.f1262a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C7265z0(this.f1262a.get());
    }
}
