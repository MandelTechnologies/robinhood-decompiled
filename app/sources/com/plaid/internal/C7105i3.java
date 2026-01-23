package com.plaid.internal;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.plaid.link.Plaid;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.i3 */
/* loaded from: classes16.dex */
public final class C7105i3 implements Factory<C5973T7> {

    /* renamed from: a */
    public final Factory f2854a;

    /* renamed from: b */
    public final Provider<C5816C5> f2855b;

    /* renamed from: c */
    public final Provider<C6030a1> f2856c;

    /* renamed from: d */
    public final C6052c3 f2857d;

    public C7105i3(C6042b3 c6042b3, Factory factory, Provider provider, Provider provider2, C6052c3 c6052c3) {
        this.f2854a = factory;
        this.f2855b = provider;
        this.f2856c = provider2;
        this.f2857d = c6052c3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f2854a.get();
        C5816C5 sdkVersionDetails = this.f2855b.get();
        C6030a1 featureManager = this.f2856c.get();
        C7071f appSignatureHelper = (C7071f) this.f2857d.get();
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(sdkVersionDetails, "sdkVersionDetails");
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        Intrinsics.checkNotNullParameter(appSignatureHelper, "appSignatureHelper");
        C5860H4 c5860h4 = C5860H4.f1365a;
        String strM1193a = C5838F0.m1193a(application);
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        String version_name = Plaid.getVERSION_NAME();
        Bundle bundle = sdkVersionDetails.f1299a.getPackageManager().getApplicationInfo(sdkVersionDetails.f1299a.getPackageName(), 128).metaData;
        String string2 = bundle != null ? bundle.getString("com.plaid.link.react_native") : null;
        Bundle bundle2 = sdkVersionDetails.f1299a.getPackageManager().getApplicationInfo(sdkVersionDetails.f1299a.getPackageName(), 128).metaData;
        String string3 = bundle2 != null ? bundle2.getString("com.github.jorgefspereira.plaid_flutter.version") : null;
        String strM1207a = C5851G4.m1207a(application);
        String packageName = application.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        String strM1287a = C5930P.m1287a(application);
        PackageManager packageManager = application.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        return (C5973T7) Preconditions.checkNotNullFromProvides(new C5973T7(strM1193a, version_name, string2, string3, strM1207a, packageName, strM1287a, packageManager, appSignatureHelper.m1500a(application), new C6022Z2(featureManager)));
    }
}
