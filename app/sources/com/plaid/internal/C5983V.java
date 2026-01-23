package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.V */
/* loaded from: classes16.dex */
public final class C5983V {

    /* renamed from: a */
    public final C7252x5 f1756a;

    public C5983V(C7252x5 plaidRetrofitFactory) {
        Intrinsics.checkNotNullParameter(plaidRetrofitFactory, "plaidRetrofitFactory");
        this.f1756a = plaidRetrofitFactory;
    }

    /* renamed from: a */
    public final C5826D6 m1329a(String str) {
        if (Intrinsics.areEqual(str, C5826D6.class.getSimpleName())) {
            return new C5826D6(this.f1756a);
        }
        throw new IllegalArgumentException("Unknown crash api class: " + str);
    }
}
