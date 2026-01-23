package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.s5 */
/* loaded from: classes16.dex */
public final class C7206s5 implements Factory<C5935P4> {

    /* renamed from: a */
    public final C7117j5 f3203a;

    /* renamed from: b */
    public final Provider<C5807B5> f3204b;

    public C7206s5(C7117j5 c7117j5, Provider<C5807B5> provider) {
        this.f3203a = c7117j5;
        this.f3204b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C7117j5 c7117j5 = this.f3203a;
        C5807B5 storage = this.f3204b.get();
        c7117j5.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        return (C5935P4) Preconditions.checkNotNullFromProvides(new C5935P4(storage));
    }
}
