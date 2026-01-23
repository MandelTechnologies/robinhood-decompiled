package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.X1 */
/* loaded from: classes16.dex */
public final class C6003X1 implements Factory<C7128k7> {

    /* renamed from: a */
    public final C5848G1 f1817a;

    /* renamed from: b */
    public final Provider<InterfaceC5916N3> f1818b;

    /* renamed from: c */
    public final Provider<C6030a1> f1819c;

    public C6003X1(C5848G1 c5848g1, Provider<InterfaceC5916N3> provider, Provider<C6030a1> provider2) {
        this.f1817a = c5848g1;
        this.f1818b = provider;
        this.f1819c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C5848G1 c5848g1 = this.f1817a;
        InterfaceC5916N3 localPaneStateStore = this.f1818b.get();
        C6030a1 featureManager = this.f1819c.get();
        c5848g1.getClass();
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        return (C7128k7) Preconditions.checkNotNullFromProvides(new C7128k7(localPaneStateStore, featureManager));
    }
}
