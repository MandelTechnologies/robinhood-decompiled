package com.plaid.internal;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.o5 */
/* loaded from: classes16.dex */
public final class C7170o5 implements Factory<AbstractC6050c1> {

    /* renamed from: a */
    public final Factory f3076a;

    public C7170o5(C7117j5 c7117j5, Factory factory) {
        this.f3076a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f3076a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        SharedPreferences sharedPreferences = application.getSharedPreferences("plaid_feature_overrides", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences sharedPreferences2 = application.getSharedPreferences("plaid_features_from_server", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
        return (AbstractC6050c1) Preconditions.checkNotNullFromProvides(new C5853G6(sharedPreferences, sharedPreferences2));
    }
}
