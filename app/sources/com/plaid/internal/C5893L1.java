package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.L1 */
/* loaded from: classes16.dex */
public final class C5893L1 implements Factory<C5971T5> {

    /* renamed from: a */
    public final C5848G1 f1453a;

    /* renamed from: b */
    public final Provider<InterfaceC5916N3> f1454b;

    public C5893L1(C5848G1 c5848g1, Provider<InterfaceC5916N3> provider) {
        this.f1453a = c5848g1;
        this.f1454b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C5848G1 c5848g1 = this.f1453a;
        InterfaceC5916N3 localPaneStateStore = this.f1454b.get();
        c5848g1.getClass();
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        return (C5971T5) Preconditions.checkNotNullFromProvides(new C5971T5(localPaneStateStore));
    }
}
