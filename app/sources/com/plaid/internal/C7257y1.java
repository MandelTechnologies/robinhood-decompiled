package com.plaid.internal;

import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.serialization.json.Json;

/* renamed from: com.plaid.internal.y1 */
/* loaded from: classes16.dex */
public final class C7257y1 implements Factory<C7248x1> {

    /* renamed from: a */
    public final Provider<C5807B5> f3318a;

    /* renamed from: b */
    public final Provider<Json> f3319b;

    public C7257y1(Provider<C5807B5> provider, Provider<Json> provider2) {
        this.f3318a = provider;
        this.f3319b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C7248x1(this.f3318a.get(), DoubleCheck.lazy(this.f3319b));
    }
}
