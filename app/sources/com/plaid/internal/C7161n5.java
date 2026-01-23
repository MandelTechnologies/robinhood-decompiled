package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.n5 */
/* loaded from: classes16.dex */
public final class C7161n5 implements Factory<C6030a1> {

    /* renamed from: a */
    public final C7117j5 f3022a;

    /* renamed from: b */
    public final Provider<AbstractC6050c1> f3023b;

    public C7161n5(C7117j5 c7117j5, Provider<AbstractC6050c1> provider) {
        this.f3022a = c7117j5;
        this.f3023b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C7117j5 c7117j5 = this.f3022a;
        AbstractC6050c1 featureStore = this.f3023b.get();
        c7117j5.getClass();
        Intrinsics.checkNotNullParameter(featureStore, "featureStore");
        return (C6030a1) Preconditions.checkNotNullFromProvides(new C6030a1(featureStore));
    }
}
