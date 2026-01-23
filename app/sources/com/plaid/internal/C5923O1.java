package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.O1 */
/* loaded from: classes16.dex */
public final class C5923O1 implements Factory<InterfaceC7162n6> {

    /* renamed from: a */
    public final C5848G1 f1580a;

    /* renamed from: b */
    public final Provider<InterfaceC5833E4> f1581b;

    public C5923O1(C5848G1 c5848g1, Provider<InterfaceC5833E4> provider) {
        this.f1580a = c5848g1;
        this.f1581b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C5848G1 c5848g1 = this.f1580a;
        InterfaceC5833E4 paneStore = this.f1581b.get();
        c5848g1.getClass();
        Intrinsics.checkNotNullParameter(paneStore, "paneStore");
        return (InterfaceC7162n6) Preconditions.checkNotNullFromProvides(paneStore);
    }
}
