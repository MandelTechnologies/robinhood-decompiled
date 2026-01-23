package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.k3 */
/* loaded from: classes16.dex */
public final class C7124k3 implements Factory<C7199r7> {

    /* renamed from: a */
    public final Provider<C6030a1> f2902a;

    public C7124k3(C6042b3 c6042b3, Provider<C6030a1> provider) {
        this.f2902a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C6030a1 featureManager = this.f2902a.get();
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        return (C7199r7) Preconditions.checkNotNullFromProvides(new C7199r7(new C6032a3(featureManager)));
    }
}
