package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.K1 */
/* loaded from: classes16.dex */
public final class C5884K1 implements Factory<C5837F> {

    /* renamed from: a */
    public final C7133l3 f1423a;

    public C5884K1(C5848G1 c5848g1, C7133l3 c7133l3) {
        this.f1423a = c7133l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC5929O7 workflowApi = (InterfaceC5929O7) this.f1423a.get();
        Intrinsics.checkNotNullParameter(workflowApi, "workflowApi");
        return (C5837F) Preconditions.checkNotNullFromProvides(new C5837F(workflowApi));
    }
}
