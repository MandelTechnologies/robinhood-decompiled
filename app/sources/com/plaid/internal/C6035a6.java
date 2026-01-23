package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.a6 */
/* loaded from: classes16.dex */
public final class C6035a6 implements Factory<C6025Z5> {

    /* renamed from: a */
    public final Provider<InterfaceC6004X2> f1901a;

    /* renamed from: b */
    public final Provider<C5995W2> f1902b;

    /* renamed from: c */
    public final Provider<C5861H5> f1903c;

    /* renamed from: d */
    public final Provider<C6030a1> f1904d;

    /* renamed from: e */
    public final C6055c6 f1905e;

    /* renamed from: f */
    public final Provider<C7199r7> f1906f;

    public C6035a6(Provider provider, Provider provider2, Provider provider3, Provider provider4, C6055c6 c6055c6, Provider provider5) {
        this.f1901a = provider;
        this.f1902b = provider2;
        this.f1903c = provider3;
        this.f1904d = provider4;
        this.f1905e = c6055c6;
        this.f1906f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C6025Z5(this.f1901a.get(), this.f1902b.get(), this.f1903c.get(), this.f1904d.get(), (C6045b6) this.f1905e.get(), this.f1906f.get());
    }
}
