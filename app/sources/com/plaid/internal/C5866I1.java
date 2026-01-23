package com.plaid.internal;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.I1 */
/* loaded from: classes16.dex */
public final class C5866I1 implements Factory<C6044b5> {

    /* renamed from: a */
    public final Factory f1380a;

    public C5866I1(C5848G1 c5848g1, Factory factory) {
        this.f1380a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f1380a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        File cacheDir = application.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        return (C6044b5) Preconditions.checkNotNullFromProvides(new C6044b5(cacheDir, "plaid-sdk/images"));
    }
}
