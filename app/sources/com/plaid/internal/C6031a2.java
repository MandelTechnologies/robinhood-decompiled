package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.a2 */
/* loaded from: classes16.dex */
public final class C6031a2 implements Factory<InterfaceC7060d8> {

    /* renamed from: a */
    public final C5857H1 f1894a;

    public C6031a2(C5848G1 c5848g1, C5857H1 c5857h1) {
        this.f1894a = c5857h1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C5810C channelInfoStore = (C5810C) this.f1894a.get();
        Intrinsics.checkNotNullParameter(channelInfoStore, "channelInfoStore");
        return (InterfaceC7060d8) Preconditions.checkNotNullFromProvides(channelInfoStore);
    }
}
