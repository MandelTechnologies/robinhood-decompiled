package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* renamed from: com.plaid.internal.H1 */
/* loaded from: classes16.dex */
public final class C5857H1 implements Factory<C5810C> {

    /* renamed from: a */
    public final C5848G1 f1358a;

    /* renamed from: b */
    public final Provider<InterfaceC5916N3> f1359b;

    /* renamed from: c */
    public final Provider<Json> f1360c;

    public C5857H1(C5848G1 c5848g1, Provider<InterfaceC5916N3> provider, Provider<Json> provider2) {
        this.f1358a = c5848g1;
        this.f1359b = provider;
        this.f1360c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C5848G1 c5848g1 = this.f1358a;
        InterfaceC5916N3 localPaneStateStore = this.f1359b.get();
        Json json = this.f1360c.get();
        c5848g1.getClass();
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        Intrinsics.checkNotNullParameter(json, "json");
        return (C5810C) Preconditions.checkNotNullFromProvides(new C5810C(localPaneStateStore, json));
    }
}
