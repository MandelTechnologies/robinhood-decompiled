package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.c2 */
/* loaded from: classes16.dex */
public final class C6051c2 implements Factory<InterfaceC7090g8> {

    /* renamed from: a */
    public final C6003X1 f1937a;

    public C6051c2(C5848G1 c5848g1, C6003X1 c6003x1) {
        this.f1937a = c6003x1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C7128k7 webviewBackgroundTransparencyStore = (C7128k7) this.f1937a.get();
        Intrinsics.checkNotNullParameter(webviewBackgroundTransparencyStore, "webviewBackgroundTransparencyStore");
        return (InterfaceC7090g8) Preconditions.checkNotNullFromProvides(webviewBackgroundTransparencyStore);
    }
}
