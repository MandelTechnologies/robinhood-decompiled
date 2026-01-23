package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.m3 */
/* loaded from: classes16.dex */
public final class C7150m3 implements Factory<InterfaceC7070e8> {

    /* renamed from: a */
    public final C7085g3 f2980a;

    public C7150m3(C6042b3 c6042b3, C7085g3 c7085g3) {
        this.f2980a = c7085g3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C7125k4 oAuthRedirectUriStore = (C7125k4) this.f2980a.get();
        Intrinsics.checkNotNullParameter(oAuthRedirectUriStore, "oAuthRedirectUriStore");
        return (InterfaceC7070e8) Preconditions.checkNotNullFromProvides(oAuthRedirectUriStore);
    }
}
