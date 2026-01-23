package com.plaid.internal;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.W1 */
/* loaded from: classes16.dex */
public final class C5994W1 implements Factory<InterfaceC6046b7> {

    /* renamed from: a */
    public final Factory f1793a;

    public C5994W1(C5848G1 c5848g1, Factory factory) {
        this.f1793a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f1793a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        Context context = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        return (InterfaceC6046b7) Preconditions.checkNotNullFromProvides(new C5903M(new C5882K(context, new C5864I())));
    }
}
