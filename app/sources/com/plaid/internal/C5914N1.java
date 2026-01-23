package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.N1 */
/* loaded from: classes16.dex */
public final class C5914N1 implements Factory<InterfaceC7136l6> {

    /* renamed from: a */
    public final C5857H1 f1558a;

    public C5914N1(C5848G1 c5848g1, C5857H1 c5857h1) {
        this.f1558a = c5857h1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C5810C channelInfoStore = (C5810C) this.f1558a.get();
        Intrinsics.checkNotNullParameter(channelInfoStore, "channelInfoStore");
        return (InterfaceC7136l6) Preconditions.checkNotNullFromProvides(channelInfoStore);
    }
}
