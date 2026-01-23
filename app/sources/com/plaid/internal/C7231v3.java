package com.plaid.internal;

import dagger.internal.Factory;

/* renamed from: com.plaid.internal.v3 */
/* loaded from: classes16.dex */
public final class C7231v3 implements Factory<C7195r3> {

    /* renamed from: a */
    public final C7133l3 f3241a;

    /* renamed from: b */
    public final C7065e3 f3242b;

    public C7231v3(C7133l3 c7133l3, C7065e3 c7065e3) {
        this.f3241a = c7133l3;
        this.f3242b = c7065e3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C7195r3((InterfaceC5929O7) this.f3241a.get(), (InterfaceC7222u3) this.f3242b.get());
    }
}
