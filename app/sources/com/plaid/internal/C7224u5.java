package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.u5 */
/* loaded from: classes16.dex */
public final class C7224u5 implements Factory<C7252x5> {

    /* renamed from: a */
    public final Provider<C5816C5> f3235a;

    public C7224u5(C7117j5 c7117j5, Provider<C5816C5> provider) {
        this.f3235a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C5816C5 sdkVersionDetails = this.f3235a.get();
        Intrinsics.checkNotNullParameter(sdkVersionDetails, "sdkVersionDetails");
        return (C7252x5) Preconditions.checkNotNullFromProvides(C7252x5.f3298d.m1655a(sdkVersionDetails.m1169a()));
    }
}
