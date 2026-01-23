package com.plaid.internal;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.t5 */
/* loaded from: classes16.dex */
public final class C7215t5 implements Factory<C7077f5> {

    /* renamed from: a */
    public final Factory f3221a;

    public C7215t5(C7117j5 c7117j5, Factory factory) {
        this.f3221a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f3221a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        return (C7077f5) Preconditions.checkNotNullFromProvides(new C7077f5(application));
    }
}
