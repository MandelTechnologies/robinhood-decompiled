package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.P1 */
/* loaded from: classes16.dex */
public final class C5932P1 implements Factory<InterfaceC7171o6> {

    /* renamed from: a */
    public final C5893L1 f1618a;

    public C5932P1(C5848G1 c5848g1, C5893L1 c5893l1) {
        this.f1618a = c5893l1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C5971T5 preCompletionResultStore = (C5971T5) this.f1618a.get();
        Intrinsics.checkNotNullParameter(preCompletionResultStore, "preCompletionResultStore");
        return (InterfaceC7171o6) Preconditions.checkNotNullFromProvides(preCompletionResultStore);
    }
}
