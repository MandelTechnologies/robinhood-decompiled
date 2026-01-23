package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.p7 */
/* loaded from: classes16.dex */
public final class C7181p7 implements Factory<C7172o7> {

    /* renamed from: a */
    public final Provider<C7195r3> f3113a;

    /* renamed from: b */
    public final Provider<InterfaceC7189q6> f3114b;

    public C7181p7(Provider<C7195r3> provider, Provider<InterfaceC7189q6> provider2) {
        this.f3113a = provider;
        this.f3114b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C7172o7(this.f3113a.get(), this.f3114b.get());
    }
}
