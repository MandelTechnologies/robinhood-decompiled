package com.robinhood.utils.android.dagger;

import android.app.Application;
import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.i18n.dynamic.translations.DynamicTranslationsContextWrapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidUtilsModule_ProvideResourcesFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/utils/android/dagger/AndroidUtilsModule_ProvideResourcesFactory;", "Ldagger/internal/Factory;", "Landroid/content/res/Resources;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "dynamicTranslationsContextWrapper", "Lcom/robinhood/shared/i18n/dynamic/translations/DynamicTranslationsContextWrapper;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AndroidUtilsModule_ProvideResourcesFactory implements Factory<Resources> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> app;
    private final Provider<DynamicTranslationsContextWrapper> dynamicTranslationsContextWrapper;

    @JvmStatic
    public static final AndroidUtilsModule_ProvideResourcesFactory create(Provider<Application> provider, Provider<DynamicTranslationsContextWrapper> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final Resources provideResources(Application application, DynamicTranslationsContextWrapper dynamicTranslationsContextWrapper) {
        return INSTANCE.provideResources(application, dynamicTranslationsContextWrapper);
    }

    public AndroidUtilsModule_ProvideResourcesFactory(Provider<Application> app, Provider<DynamicTranslationsContextWrapper> dynamicTranslationsContextWrapper) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(dynamicTranslationsContextWrapper, "dynamicTranslationsContextWrapper");
        this.app = app;
        this.dynamicTranslationsContextWrapper = dynamicTranslationsContextWrapper;
    }

    @Override // javax.inject.Provider
    public Resources get() {
        Companion companion = INSTANCE;
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        DynamicTranslationsContextWrapper dynamicTranslationsContextWrapper = this.dynamicTranslationsContextWrapper.get();
        Intrinsics.checkNotNullExpressionValue(dynamicTranslationsContextWrapper, "get(...)");
        return companion.provideResources(application, dynamicTranslationsContextWrapper);
    }

    /* compiled from: AndroidUtilsModule_ProvideResourcesFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/android/dagger/AndroidUtilsModule_ProvideResourcesFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/utils/android/dagger/AndroidUtilsModule_ProvideResourcesFactory;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "dynamicTranslationsContextWrapper", "Lcom/robinhood/shared/i18n/dynamic/translations/DynamicTranslationsContextWrapper;", "provideResources", "Landroid/content/res/Resources;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AndroidUtilsModule_ProvideResourcesFactory create(Provider<Application> app, Provider<DynamicTranslationsContextWrapper> dynamicTranslationsContextWrapper) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(dynamicTranslationsContextWrapper, "dynamicTranslationsContextWrapper");
            return new AndroidUtilsModule_ProvideResourcesFactory(app, dynamicTranslationsContextWrapper);
        }

        @JvmStatic
        public final Resources provideResources(Application app, DynamicTranslationsContextWrapper dynamicTranslationsContextWrapper) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(dynamicTranslationsContextWrapper, "dynamicTranslationsContextWrapper");
            Object objCheckNotNull = Preconditions.checkNotNull(AndroidUtilsModule.INSTANCE.provideResources(app, dynamicTranslationsContextWrapper), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Resources) objCheckNotNull;
        }
    }
}
