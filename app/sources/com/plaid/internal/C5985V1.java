package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.V1 */
/* loaded from: classes16.dex */
public final class C5985V1 implements Factory<C6026Z6> {

    /* renamed from: a */
    public final Provider<InterfaceC6046b7> f1759a;

    /* renamed from: b */
    public final C5976U1 f1760b;

    public C5985V1(C5848G1 c5848g1, Provider provider, C5976U1 c5976u1) {
        this.f1759a = provider;
        this.f1760b = c5976u1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC6046b7 twilioVerifySna = this.f1759a.get();
        InterfaceC5910M6 snaApi = (InterfaceC5910M6) this.f1760b.get();
        Intrinsics.checkNotNullParameter(twilioVerifySna, "twilioVerifySna");
        Intrinsics.checkNotNullParameter(snaApi, "snaApi");
        return (C6026Z6) Preconditions.checkNotNullFromProvides(new C6026Z6(twilioVerifySna, snaApi));
    }
}
