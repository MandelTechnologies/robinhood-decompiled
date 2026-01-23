package com.robinhood.android.common.p088ui.daynight;

import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.store.base.MarketHoursManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealNightModeManager_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BJ\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u001f\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/ui/daynight/RealNightModeManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/ui/daynight/RealNightModeManager;", "themePreference", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "Lkotlin/jvm/JvmSuppressWildcards;", "marketHoursManager", "Lcom/robinhood/store/base/MarketHoursManager;", "resources", "Landroid/content/res/Resources;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RealNightModeManager_Factory implements Factory<NightModeManager3> {
    private final Provider<AppType> appType;
    private final Provider<MarketHoursManager> marketHoursManager;
    private final Provider<Resources> resources;
    private final Provider<EnumPreference<Theme>> themePreference;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RealNightModeManager_Factory create(Provider<EnumPreference<Theme>> provider, Provider<MarketHoursManager> provider2, Provider<Resources> provider3, Provider<AppType> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final NightModeManager3 newInstance(EnumPreference<Theme> enumPreference, MarketHoursManager marketHoursManager, Resources resources, AppType appType) {
        return INSTANCE.newInstance(enumPreference, marketHoursManager, resources, appType);
    }

    public RealNightModeManager_Factory(Provider<EnumPreference<Theme>> themePreference, Provider<MarketHoursManager> marketHoursManager, Provider<Resources> resources, Provider<AppType> appType) {
        Intrinsics.checkNotNullParameter(themePreference, "themePreference");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.themePreference = themePreference;
        this.marketHoursManager = marketHoursManager;
        this.resources = resources;
        this.appType = appType;
    }

    @Override // javax.inject.Provider
    public NightModeManager3 get() {
        Companion companion = INSTANCE;
        EnumPreference<Theme> enumPreference = this.themePreference.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        MarketHoursManager marketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(marketHoursManager, "get(...)");
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        return companion.newInstance(enumPreference, marketHoursManager, resources, appType);
    }

    /* compiled from: RealNightModeManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J3\u0010\u0011\u001a\u00020\u00122\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/ui/daynight/RealNightModeManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/ui/daynight/RealNightModeManager_Factory;", "themePreference", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "Lkotlin/jvm/JvmSuppressWildcards;", "marketHoursManager", "Lcom/robinhood/store/base/MarketHoursManager;", "resources", "Landroid/content/res/Resources;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "newInstance", "Lcom/robinhood/android/common/ui/daynight/RealNightModeManager;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealNightModeManager_Factory create(Provider<EnumPreference<Theme>> themePreference, Provider<MarketHoursManager> marketHoursManager, Provider<Resources> resources, Provider<AppType> appType) {
            Intrinsics.checkNotNullParameter(themePreference, "themePreference");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new RealNightModeManager_Factory(themePreference, marketHoursManager, resources, appType);
        }

        @JvmStatic
        public final NightModeManager3 newInstance(EnumPreference<Theme> themePreference, MarketHoursManager marketHoursManager, Resources resources, AppType appType) {
            Intrinsics.checkNotNullParameter(themePreference, "themePreference");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new NightModeManager3(themePreference, marketHoursManager, resources, appType);
        }
    }
}
