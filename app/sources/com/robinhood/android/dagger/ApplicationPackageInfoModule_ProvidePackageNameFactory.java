package com.robinhood.android.dagger;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApplicationPackageInfoModule_ProvidePackageNameFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/dagger/ApplicationPackageInfoModule_ProvidePackageNameFactory;", "Ldagger/internal/Factory;", "", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ApplicationPackageInfoModule_ProvidePackageNameFactory implements Factory<String> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> app;

    @JvmStatic
    public static final ApplicationPackageInfoModule_ProvidePackageNameFactory create(Provider<Application> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final String providePackageName(Application application) {
        return INSTANCE.providePackageName(application);
    }

    public ApplicationPackageInfoModule_ProvidePackageNameFactory(Provider<Application> app) {
        Intrinsics.checkNotNullParameter(app, "app");
        this.app = app;
    }

    @Override // javax.inject.Provider
    public String get() {
        Companion companion = INSTANCE;
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        return companion.providePackageName(application);
    }

    /* compiled from: ApplicationPackageInfoModule_ProvidePackageNameFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/dagger/ApplicationPackageInfoModule_ProvidePackageNameFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/dagger/ApplicationPackageInfoModule_ProvidePackageNameFactory;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "providePackageName", "", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ApplicationPackageInfoModule_ProvidePackageNameFactory create(Provider<Application> app) {
            Intrinsics.checkNotNullParameter(app, "app");
            return new ApplicationPackageInfoModule_ProvidePackageNameFactory(app);
        }

        @JvmStatic
        public final String providePackageName(Application app) {
            Intrinsics.checkNotNullParameter(app, "app");
            Object objCheckNotNull = Preconditions.checkNotNull(ApplicationPackageInfoModule.INSTANCE.providePackageName(app), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (String) objCheckNotNull;
        }
    }
}
