package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.U1 */
/* loaded from: classes16.dex */
public final class C5976U1 implements Factory<InterfaceC5910M6> {

    /* renamed from: a */
    public final Provider<C7252x5> f1740a;

    /* renamed from: b */
    public final Provider<C7077f5> f1741b;

    public C5976U1(C5848G1 c5848g1, Provider<C7252x5> provider, Provider<C7077f5> provider2) {
        this.f1740a = provider;
        this.f1741b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws SecurityException {
        C7252x5 retrofitFactory = this.f1740a.get();
        C7077f5 plaidEnvironmentStore = this.f1741b.get();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(plaidEnvironmentStore, "plaidEnvironmentStore");
        EnumC6054c5 env = plaidEnvironmentStore.m1504b();
        Intrinsics.checkNotNullParameter(env, "env");
        int i = C7057d5.f2731a[env.ordinal()];
        String str = "https://production.plaid.com/";
        if (i != 1) {
            if (i == 2) {
                str = "https://development.plaid.com/";
            } else if (i == 3) {
                str = "https://sandbox.plaid.com/";
            }
        }
        Object objCreate = retrofitFactory.m1654a(str, new C5798A5(null, 3)).create(InterfaceC5910M6.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (InterfaceC5910M6) Preconditions.checkNotNullFromProvides((InterfaceC5910M6) objCreate);
    }
}
