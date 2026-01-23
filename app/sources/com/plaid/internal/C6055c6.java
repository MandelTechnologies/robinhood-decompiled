package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.serialization.json.Json;

/* renamed from: com.plaid.internal.c6 */
/* loaded from: classes16.dex */
public final class C6055c6 implements Factory<C6045b6> {

    /* renamed from: a */
    public final Provider<C5861H5> f1943a;

    /* renamed from: b */
    public final Provider<C5988V4> f1944b;

    /* renamed from: c */
    public final Provider<Json> f1945c;

    public C6055c6(Provider<C5861H5> provider, Provider<C5988V4> provider2, Provider<Json> provider3) {
        this.f1943a = provider;
        this.f1944b = provider2;
        this.f1945c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C6045b6(this.f1943a.get(), this.f1944b.get(), this.f1945c.get());
    }
}
