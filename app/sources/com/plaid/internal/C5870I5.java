package com.plaid.internal;

import android.app.Application;
import dagger.internal.Factory;

/* renamed from: com.plaid.internal.I5 */
/* loaded from: classes16.dex */
public final class C5870I5 implements Factory<C5861H5> {

    /* renamed from: a */
    public final Factory f1383a;

    public C5870I5(Factory factory) {
        this.f1383a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C5861H5((Application) this.f1383a.get());
    }
}
