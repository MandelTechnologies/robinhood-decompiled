package com.plaid.internal;

import android.app.Application;
import android.content.res.Resources;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.j3 */
/* loaded from: classes16.dex */
public final class C7115j3 implements Factory<Resources> {

    /* renamed from: a */
    public final Factory f2875a;

    public C7115j3(C6042b3 c6042b3, Factory factory) {
        this.f2875a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f2875a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        Resources resources = application.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return (Resources) Preconditions.checkNotNullFromProvides(resources);
    }
}
