package com.robinhood.android.designsystem.colorscheme;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.prefs.EnumPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColorSchemeManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB.\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "preference", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/style/ColorScheme;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-design-system-color-scheme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ColorSchemeManager_Factory implements Factory<ColorSchemeManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> app;
    private final Provider<EnumPreference<ColorScheme>> preference;

    @JvmStatic
    public static final ColorSchemeManager_Factory create(Provider<Application> provider, Provider<EnumPreference<ColorScheme>> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final ColorSchemeManager newInstance(Application application, EnumPreference<ColorScheme> enumPreference) {
        return INSTANCE.newInstance(application, enumPreference);
    }

    public ColorSchemeManager_Factory(Provider<Application> app, Provider<EnumPreference<ColorScheme>> preference) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.app = app;
        this.preference = preference;
    }

    @Override // javax.inject.Provider
    public ColorSchemeManager get() {
        Companion companion = INSTANCE;
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        EnumPreference<ColorScheme> enumPreference = this.preference.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        return companion.newInstance(application, enumPreference);
    }

    /* compiled from: ColorSchemeManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\t\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007H\u0007J#\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager_Factory;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "preference", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/style/ColorScheme;", "Lkotlin/jvm/JvmSuppressWildcards;", "newInstance", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "lib-design-system-color-scheme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ColorSchemeManager_Factory create(Provider<Application> app, Provider<EnumPreference<ColorScheme>> preference) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(preference, "preference");
            return new ColorSchemeManager_Factory(app, preference);
        }

        @JvmStatic
        public final ColorSchemeManager newInstance(Application app, EnumPreference<ColorScheme> preference) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(preference, "preference");
            return new ColorSchemeManager(app, preference);
        }
    }
}
