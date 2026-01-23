package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.g3 */
/* loaded from: classes16.dex */
public final class C7085g3 implements Factory<C7125k4> {

    /* renamed from: a */
    public final C6042b3 f2796a;

    /* renamed from: b */
    public final Provider<InterfaceC5916N3> f2797b;

    public C7085g3(C6042b3 c6042b3, Provider<InterfaceC5916N3> provider) {
        this.f2796a = c6042b3;
        this.f2797b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C6042b3 c6042b3 = this.f2796a;
        InterfaceC5916N3 localPaneStateStore = this.f2797b.get();
        c6042b3.getClass();
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        return (C7125k4) Preconditions.checkNotNullFromProvides(new C7125k4(localPaneStateStore));
    }
}
