package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.d2 */
/* loaded from: classes16.dex */
public final class C7054d2 implements Factory<InterfaceC7100h8> {

    /* renamed from: a */
    public final C6012Y1 f2722a;

    public C7054d2(C5848G1 c5848g1, C6012Y1 c6012y1) {
        this.f2722a = c6012y1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C7208s7 webviewFallbackIdStore = (C7208s7) this.f2722a.get();
        Intrinsics.checkNotNullParameter(webviewFallbackIdStore, "webviewFallbackIdStore");
        return (InterfaceC7100h8) Preconditions.checkNotNullFromProvides(webviewFallbackIdStore);
    }
}
