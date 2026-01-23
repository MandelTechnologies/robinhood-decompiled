package com.plaid.internal;

import android.content.res.Resources;
import dagger.internal.Factory;

/* renamed from: com.plaid.internal.A3 */
/* loaded from: classes16.dex */
public final class C5796A3 implements Factory<C7268z3> {

    /* renamed from: a */
    public final C7115j3 f1228a;

    public C5796A3(C7115j3 c7115j3) {
        this.f1228a = c7115j3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C7268z3((Resources) this.f1228a.get());
    }
}
