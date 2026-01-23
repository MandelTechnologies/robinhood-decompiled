package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.R1 */
/* loaded from: classes16.dex */
public final class C5949R1 implements Factory<InterfaceC7180p6> {

    /* renamed from: a */
    public final C6003X1 f1660a;

    public C5949R1(C5848G1 c5848g1, C6003X1 c6003x1) {
        this.f1660a = c6003x1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C7128k7 webviewBackgroundTransparencyStore = (C7128k7) this.f1660a.get();
        Intrinsics.checkNotNullParameter(webviewBackgroundTransparencyStore, "webviewBackgroundTransparencyStore");
        return (InterfaceC7180p6) Preconditions.checkNotNullFromProvides(webviewBackgroundTransparencyStore);
    }
}
