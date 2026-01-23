package com.plaid.internal;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.w5 */
/* loaded from: classes16.dex */
public final class C7242w5 implements Factory<C5816C5> {

    /* renamed from: a */
    public final Factory f3284a;

    public C7242w5(C7117j5 c7117j5, Factory factory) {
        this.f3284a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f3284a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        return (C5816C5) Preconditions.checkNotNullFromProvides(new C5816C5(application));
    }
}
