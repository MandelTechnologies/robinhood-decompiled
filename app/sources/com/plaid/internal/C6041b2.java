package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.b2 */
/* loaded from: classes16.dex */
public final class C6041b2 implements Factory<InterfaceC7080f8> {

    /* renamed from: a */
    public final C5893L1 f1919a;

    public C6041b2(C5848G1 c5848g1, C5893L1 c5893l1) {
        this.f1919a = c5893l1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C5971T5 preCompletionResultStore = (C5971T5) this.f1919a.get();
        Intrinsics.checkNotNullParameter(preCompletionResultStore, "preCompletionResultStore");
        return (InterfaceC7080f8) Preconditions.checkNotNullFromProvides(preCompletionResultStore);
    }
}
