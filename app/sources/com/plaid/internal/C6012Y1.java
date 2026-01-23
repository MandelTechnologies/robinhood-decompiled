package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.Y1 */
/* loaded from: classes16.dex */
public final class C6012Y1 implements Factory<C7208s7> {

    /* renamed from: a */
    public final C5848G1 f1844a;

    /* renamed from: b */
    public final Provider<InterfaceC5916N3> f1845b;

    public C6012Y1(C5848G1 c5848g1, Provider<InterfaceC5916N3> provider) {
        this.f1844a = c5848g1;
        this.f1845b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C5848G1 c5848g1 = this.f1844a;
        InterfaceC5916N3 localPaneStateStore = this.f1845b.get();
        c5848g1.getClass();
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        return (C7208s7) Preconditions.checkNotNullFromProvides(new C7208s7(localPaneStateStore));
    }
}
