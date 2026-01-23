package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.l3 */
/* loaded from: classes16.dex */
public final class C7133l3 implements Factory<InterfaceC5929O7> {

    /* renamed from: a */
    public final Provider<C7252x5> f2917a;

    /* renamed from: b */
    public final Provider<C7077f5> f2918b;

    public C7133l3(C6042b3 c6042b3, Provider<C7252x5> provider, Provider<C7077f5> provider2) {
        this.f2917a = provider;
        this.f2918b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws SecurityException {
        C7252x5 retrofitFactory = this.f2917a.get();
        C7077f5 plaidEnvironmentStore = this.f2918b.get();
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
        Object objCreate = retrofitFactory.m1654a(str, new C5798A5(null, 3)).create(InterfaceC5929O7.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (InterfaceC5929O7) Preconditions.checkNotNullFromProvides((InterfaceC5929O7) objCreate);
    }
}
