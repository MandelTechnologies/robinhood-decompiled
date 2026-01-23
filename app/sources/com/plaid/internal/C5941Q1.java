package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.Q1 */
/* loaded from: classes16.dex */
public final class C5941Q1 implements Factory<InterfaceC7153m6> {

    /* renamed from: a */
    public final C7085g3 f1639a;

    public C5941Q1(C5848G1 c5848g1, C7085g3 c7085g3) {
        this.f1639a = c7085g3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C7125k4 oAuthRedirectUriStore = (C7125k4) this.f1639a.get();
        Intrinsics.checkNotNullParameter(oAuthRedirectUriStore, "oAuthRedirectUriStore");
        return (InterfaceC7153m6) Preconditions.checkNotNullFromProvides(oAuthRedirectUriStore);
    }
}
