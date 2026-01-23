package com.plaid.internal;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.M1 */
/* loaded from: classes16.dex */
public final class C5905M1 implements Factory<C7088g6> {

    /* renamed from: a */
    public final Factory f1542a;

    /* renamed from: b */
    public final C5976U1 f1543b;

    public C5905M1(C5848G1 c5848g1, Factory factory, C5976U1 c5976u1) {
        this.f1542a = factory;
        this.f1543b = c5976u1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f1542a.get();
        InterfaceC5910M6 snaApi = (InterfaceC5910M6) this.f1543b.get();
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(snaApi, "snaApi");
        return (C7088g6) Preconditions.checkNotNullFromProvides(new C7088g6(application.getApplicationContext(), snaApi));
    }
}
