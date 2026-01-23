package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.Z1 */
/* loaded from: classes16.dex */
public final class C6021Z1 implements Factory<C7226u7> {

    /* renamed from: a */
    public final C5848G1 f1861a;

    /* renamed from: b */
    public final Provider<InterfaceC5916N3> f1862b;

    public C6021Z1(C5848G1 c5848g1, Provider<InterfaceC5916N3> provider) {
        this.f1861a = c5848g1;
        this.f1862b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C5848G1 c5848g1 = this.f1861a;
        InterfaceC5916N3 localPaneStateStore = this.f1862b.get();
        c5848g1.getClass();
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        return (C7226u7) Preconditions.checkNotNullFromProvides(new C7226u7(localPaneStateStore));
    }
}
