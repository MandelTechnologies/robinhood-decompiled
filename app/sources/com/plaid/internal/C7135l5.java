package com.plaid.internal;

import android.app.Application;
import com.plaid.internal.AbstractC6010Y;
import com.plaid.internal.core.crashreporting.internal.models.SentryProject;
import com.plaid.link.Plaid;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.l5 */
/* loaded from: classes16.dex */
public final class C7135l5 implements Factory<C5988V4> {

    /* renamed from: a */
    public final Factory f2921a;

    /* renamed from: b */
    public final Provider<C7252x5> f2922b;

    /* renamed from: c */
    public final Provider<C7077f5> f2923c;

    public C7135l5(C7117j5 c7117j5, Factory factory, Provider provider, Provider provider2) {
        this.f2921a = factory;
        this.f2922b = provider;
        this.f2923c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f2921a.get();
        C7252x5 plaidRetrofit = this.f2922b.get();
        C7077f5 plaidGlobalValuesStore = this.f2923c.get();
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(plaidRetrofit, "plaidRetrofit");
        Intrinsics.checkNotNullParameter(plaidGlobalValuesStore, "plaidGlobalValuesStore");
        return (C5988V4) Preconditions.checkNotNullFromProvides(new C5988V4(application, SentryProject.LinkSdk.INSTANCE, Plaid.getVERSION_NAME(), AbstractC6010Y.a.f1841a, plaidRetrofit, plaidGlobalValuesStore, new C5885K2(application)));
    }
}
