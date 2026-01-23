package com.robinhood.android.common.p088ui.p089di;

import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.data.prefs.IsNewDevicePref;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.prefs.LastDeepLinkNoncePref;
import com.robinhood.android.common.util.AppContainer;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.base.MarketHoursManager;
import com.robinhood.utils.RhProcessLifecycleOwner;
import dagger.Lazy;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseActivitySingletons.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001B\u009c\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001f\u0010\f\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0014\u0010\u0016\u001a\u00020\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0014\u0010\u0018\u001a\u00020\u0019X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0014\u0010 \u001a\u00020!X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0014\u0010\"\u001a\u00020#X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "appContainer", "Lcom/robinhood/android/common/util/AppContainer;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "eventLoggerInternal", "Lcom/robinhood/analytics/EventLogger;", "fragmentLifecycleCallbacks", "", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Lkotlin/jvm/JvmSuppressWildcards;", "isNewDevicePref", "Lcom/robinhood/prefs/BooleanPreference;", "lastDeepLinkNoncePref", "Lcom/robinhood/prefs/StringPreference;", "marketHoursManager", "Lcom/robinhood/store/base/MarketHoursManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "rhProcessLifecycleOwner", "Ldagger/Lazy;", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "themePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "notificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "pltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/android/common/util/AppContainer;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;Lcom/robinhood/analytics/EventLogger;Ljava/util/Set;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/store/base/MarketHoursManager;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/common/ui/daynight/NightModeManager;Ldagger/Lazy;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/android/common/notification/NotificationManager;Lcom/robinhood/android/plt/contract/PltManager;)V", "getAnalytics$lib_common_externalRelease", "()Lcom/robinhood/analytics/AnalyticsLogger;", "getAppContainer$lib_common_externalRelease", "()Lcom/robinhood/android/common/util/AppContainer;", "getAuthManager$lib_common_externalRelease", "()Lcom/robinhood/shared/security/auth/AuthManager;", "getColorSchemeManager$lib_common_externalRelease", "()Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "getEventLoggerInternal$lib_common_externalRelease", "()Lcom/robinhood/analytics/EventLogger;", "getFragmentLifecycleCallbacks$lib_common_externalRelease", "()Ljava/util/Set;", "isNewDevicePref$lib_common_externalRelease", "()Lcom/robinhood/prefs/BooleanPreference;", "getLastDeepLinkNoncePref$lib_common_externalRelease", "()Lcom/robinhood/prefs/StringPreference;", "getMarketHoursManager$lib_common_externalRelease", "()Lcom/robinhood/store/base/MarketHoursManager;", "getNavigator$lib_common_externalRelease", "()Lcom/robinhood/android/navigation/Navigator;", "getNightModeManager$lib_common_externalRelease", "()Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "getRhProcessLifecycleOwner$lib_common_externalRelease", "()Ldagger/Lazy;", "getThemePref$lib_common_externalRelease", "()Lcom/robinhood/prefs/EnumPreference;", "getNotificationManager$lib_common_externalRelease", "()Lcom/robinhood/android/common/notification/NotificationManager;", "getPltManager$lib_common_externalRelease", "()Lcom/robinhood/android/plt/contract/PltManager;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class BaseActivitySingletons {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    private final AppContainer appContainer;
    private final AuthManager authManager;
    private final ColorSchemeManager colorSchemeManager;
    private final EventLogger eventLoggerInternal;
    private final Set<FragmentManager.FragmentLifecycleCallbacks> fragmentLifecycleCallbacks;
    private final BooleanPreference isNewDevicePref;
    private final StringPreference lastDeepLinkNoncePref;
    private final MarketHoursManager marketHoursManager;
    private final Navigator navigator;
    private final NightModeManager nightModeManager;
    private final NotificationManager notificationManager;
    private final PltManager pltManager;
    private final Lazy<RhProcessLifecycleOwner> rhProcessLifecycleOwner;
    private final EnumPreference<Theme> themePref;

    public BaseActivitySingletons(AnalyticsLogger analytics, AppContainer appContainer, AuthManager authManager, ColorSchemeManager colorSchemeManager, EventLogger eventLoggerInternal, Set<FragmentManager.FragmentLifecycleCallbacks> fragmentLifecycleCallbacks, @IsNewDevicePref BooleanPreference isNewDevicePref, @LastDeepLinkNoncePref StringPreference lastDeepLinkNoncePref, MarketHoursManager marketHoursManager, Navigator navigator, NightModeManager nightModeManager, Lazy<RhProcessLifecycleOwner> rhProcessLifecycleOwner, EnumPreference<Theme> themePref, NotificationManager notificationManager, PltManager pltManager) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(appContainer, "appContainer");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
        Intrinsics.checkNotNullParameter(eventLoggerInternal, "eventLoggerInternal");
        Intrinsics.checkNotNullParameter(fragmentLifecycleCallbacks, "fragmentLifecycleCallbacks");
        Intrinsics.checkNotNullParameter(isNewDevicePref, "isNewDevicePref");
        Intrinsics.checkNotNullParameter(lastDeepLinkNoncePref, "lastDeepLinkNoncePref");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        Intrinsics.checkNotNullParameter(themePref, "themePref");
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        Intrinsics.checkNotNullParameter(pltManager, "pltManager");
        this.analytics = analytics;
        this.appContainer = appContainer;
        this.authManager = authManager;
        this.colorSchemeManager = colorSchemeManager;
        this.eventLoggerInternal = eventLoggerInternal;
        this.fragmentLifecycleCallbacks = fragmentLifecycleCallbacks;
        this.isNewDevicePref = isNewDevicePref;
        this.lastDeepLinkNoncePref = lastDeepLinkNoncePref;
        this.marketHoursManager = marketHoursManager;
        this.navigator = navigator;
        this.nightModeManager = nightModeManager;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
        this.themePref = themePref;
        this.notificationManager = notificationManager;
        this.pltManager = pltManager;
    }

    /* renamed from: getAnalytics$lib_common_externalRelease, reason: from getter */
    public final AnalyticsLogger getAnalytics() {
        return this.analytics;
    }

    /* renamed from: getAppContainer$lib_common_externalRelease, reason: from getter */
    public final AppContainer getAppContainer() {
        return this.appContainer;
    }

    /* renamed from: getAuthManager$lib_common_externalRelease, reason: from getter */
    public final AuthManager getAuthManager() {
        return this.authManager;
    }

    /* renamed from: getColorSchemeManager$lib_common_externalRelease, reason: from getter */
    public final ColorSchemeManager getColorSchemeManager() {
        return this.colorSchemeManager;
    }

    /* renamed from: getEventLoggerInternal$lib_common_externalRelease, reason: from getter */
    public final EventLogger getEventLoggerInternal() {
        return this.eventLoggerInternal;
    }

    public final Set<FragmentManager.FragmentLifecycleCallbacks> getFragmentLifecycleCallbacks$lib_common_externalRelease() {
        return this.fragmentLifecycleCallbacks;
    }

    /* renamed from: isNewDevicePref$lib_common_externalRelease, reason: from getter */
    public final BooleanPreference getIsNewDevicePref() {
        return this.isNewDevicePref;
    }

    /* renamed from: getLastDeepLinkNoncePref$lib_common_externalRelease, reason: from getter */
    public final StringPreference getLastDeepLinkNoncePref() {
        return this.lastDeepLinkNoncePref;
    }

    /* renamed from: getMarketHoursManager$lib_common_externalRelease, reason: from getter */
    public final MarketHoursManager getMarketHoursManager() {
        return this.marketHoursManager;
    }

    /* renamed from: getNavigator$lib_common_externalRelease, reason: from getter */
    public final Navigator getNavigator() {
        return this.navigator;
    }

    /* renamed from: getNightModeManager$lib_common_externalRelease, reason: from getter */
    public final NightModeManager getNightModeManager() {
        return this.nightModeManager;
    }

    public final Lazy<RhProcessLifecycleOwner> getRhProcessLifecycleOwner$lib_common_externalRelease() {
        return this.rhProcessLifecycleOwner;
    }

    public final EnumPreference<Theme> getThemePref$lib_common_externalRelease() {
        return this.themePref;
    }

    /* renamed from: getNotificationManager$lib_common_externalRelease, reason: from getter */
    public final NotificationManager getNotificationManager() {
        return this.notificationManager;
    }

    /* renamed from: getPltManager$lib_common_externalRelease, reason: from getter */
    public final PltManager getPltManager() {
        return this.pltManager;
    }
}
