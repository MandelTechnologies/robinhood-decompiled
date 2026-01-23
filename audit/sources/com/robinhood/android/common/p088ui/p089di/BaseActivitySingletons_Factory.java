package com.robinhood.android.common.p088ui.p089di;

import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.util.AppContainer;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseActivitySingletons_Factory.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Bô\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0017\u0010\u000e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\u0011\u0010\u001c\u001a\r\u0012\t\u0012\u00070\u001d¢\u0006\u0002\b\u00110\u0004\u0012\u0017\u0010\u001e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0002\b\u00110\u0004\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004¢\u0006\u0004\b%\u0010&J\b\u0010'\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\r\u0012\t\u0012\u00070\u001d¢\u0006\u0002\b\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0002\b\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/common/ui/di/BaseActivitySingletons_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "appContainer", "Lcom/robinhood/android/common/util/AppContainer;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "eventLoggerInternal", "Lcom/robinhood/analytics/EventLogger;", "fragmentLifecycleCallbacks", "", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Lkotlin/jvm/JvmSuppressWildcards;", "isNewDevicePref", "Lcom/robinhood/prefs/BooleanPreference;", "lastDeepLinkNoncePref", "Lcom/robinhood/prefs/StringPreference;", "marketHoursManager", "Lcom/robinhood/store/base/MarketHoursManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "themePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "notificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "pltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class BaseActivitySingletons_Factory implements Factory<BaseActivitySingletons> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<AppContainer> appContainer;
    private final Provider<AuthManager> authManager;
    private final Provider<ColorSchemeManager> colorSchemeManager;
    private final Provider<EventLogger> eventLoggerInternal;
    private final Provider<Set<FragmentManager.FragmentLifecycleCallbacks>> fragmentLifecycleCallbacks;
    private final Provider<BooleanPreference> isNewDevicePref;
    private final Provider<StringPreference> lastDeepLinkNoncePref;
    private final Provider<MarketHoursManager> marketHoursManager;
    private final Provider<Navigator> navigator;
    private final Provider<NightModeManager> nightModeManager;
    private final Provider<NotificationManager> notificationManager;
    private final Provider<PltManager> pltManager;
    private final Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner;
    private final Provider<EnumPreference<Theme>> themePref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final BaseActivitySingletons_Factory create(Provider<AnalyticsLogger> provider, Provider<AppContainer> provider2, Provider<AuthManager> provider3, Provider<ColorSchemeManager> provider4, Provider<EventLogger> provider5, Provider<Set<FragmentManager.FragmentLifecycleCallbacks>> provider6, Provider<BooleanPreference> provider7, Provider<StringPreference> provider8, Provider<MarketHoursManager> provider9, Provider<Navigator> provider10, Provider<NightModeManager> provider11, Provider<RhProcessLifecycleOwner> provider12, Provider<EnumPreference<Theme>> provider13, Provider<NotificationManager> provider14, Provider<PltManager> provider15) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    @JvmStatic
    public static final BaseActivitySingletons newInstance(AnalyticsLogger analyticsLogger, AppContainer appContainer, AuthManager authManager, ColorSchemeManager colorSchemeManager, EventLogger eventLogger, Set<FragmentManager.FragmentLifecycleCallbacks> set, BooleanPreference booleanPreference, StringPreference stringPreference, MarketHoursManager marketHoursManager, Navigator navigator, NightModeManager nightModeManager, Lazy<RhProcessLifecycleOwner> lazy, EnumPreference<Theme> enumPreference, NotificationManager notificationManager, PltManager pltManager) {
        return INSTANCE.newInstance(analyticsLogger, appContainer, authManager, colorSchemeManager, eventLogger, set, booleanPreference, stringPreference, marketHoursManager, navigator, nightModeManager, lazy, enumPreference, notificationManager, pltManager);
    }

    public BaseActivitySingletons_Factory(Provider<AnalyticsLogger> analytics, Provider<AppContainer> appContainer, Provider<AuthManager> authManager, Provider<ColorSchemeManager> colorSchemeManager, Provider<EventLogger> eventLoggerInternal, Provider<Set<FragmentManager.FragmentLifecycleCallbacks>> fragmentLifecycleCallbacks, Provider<BooleanPreference> isNewDevicePref, Provider<StringPreference> lastDeepLinkNoncePref, Provider<MarketHoursManager> marketHoursManager, Provider<Navigator> navigator, Provider<NightModeManager> nightModeManager, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner, Provider<EnumPreference<Theme>> themePref, Provider<NotificationManager> notificationManager, Provider<PltManager> pltManager) {
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

    @Override // javax.inject.Provider
    public BaseActivitySingletons get() {
        Companion companion = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        AppContainer appContainer = this.appContainer.get();
        Intrinsics.checkNotNullExpressionValue(appContainer, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager.get();
        Intrinsics.checkNotNullExpressionValue(colorSchemeManager, "get(...)");
        EventLogger eventLogger = this.eventLoggerInternal.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        Set<FragmentManager.FragmentLifecycleCallbacks> set = this.fragmentLifecycleCallbacks.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        BooleanPreference booleanPreference = this.isNewDevicePref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        StringPreference stringPreference = this.lastDeepLinkNoncePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        MarketHoursManager marketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(marketHoursManager, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        NightModeManager nightModeManager = this.nightModeManager.get();
        Intrinsics.checkNotNullExpressionValue(nightModeManager, "get(...)");
        Lazy<RhProcessLifecycleOwner> lazy = DoubleCheck.lazy(this.rhProcessLifecycleOwner);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        EnumPreference<Theme> enumPreference = this.themePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        NotificationManager notificationManager = this.notificationManager.get();
        Intrinsics.checkNotNullExpressionValue(notificationManager, "get(...)");
        NotificationManager notificationManager2 = notificationManager;
        PltManager pltManager = this.pltManager.get();
        Intrinsics.checkNotNullExpressionValue(pltManager, "get(...)");
        return companion.newInstance(analyticsLogger, appContainer, authManager, colorSchemeManager, eventLogger, set, booleanPreference, stringPreference, marketHoursManager, navigator, nightModeManager, lazy, enumPreference, notificationManager2, pltManager);
    }

    /* compiled from: BaseActivitySingletons_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jõ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0017\u0010\u0011\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\u0011\u0010\u001f\u001a\r\u0012\t\u0012\u00070 ¢\u0006\u0002\b\u00140\u00072\u0017\u0010!\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020#0\"¢\u0006\u0002\b\u00140\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0007H\u0007J¡\u0001\u0010(\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0011\u0010\u001f\u001a\r\u0012\t\u0012\u00070 ¢\u0006\u0002\b\u00140*2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020#0\"¢\u0006\u0002\b\u00142\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0007¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/common/ui/di/BaseActivitySingletons_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons_Factory;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "appContainer", "Lcom/robinhood/android/common/util/AppContainer;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "eventLoggerInternal", "Lcom/robinhood/analytics/EventLogger;", "fragmentLifecycleCallbacks", "", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Lkotlin/jvm/JvmSuppressWildcards;", "isNewDevicePref", "Lcom/robinhood/prefs/BooleanPreference;", "lastDeepLinkNoncePref", "Lcom/robinhood/prefs/StringPreference;", "marketHoursManager", "Lcom/robinhood/store/base/MarketHoursManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "themePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "notificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "pltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "newInstance", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "Ldagger/Lazy;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BaseActivitySingletons_Factory create(Provider<AnalyticsLogger> analytics, Provider<AppContainer> appContainer, Provider<AuthManager> authManager, Provider<ColorSchemeManager> colorSchemeManager, Provider<EventLogger> eventLoggerInternal, Provider<Set<FragmentManager.FragmentLifecycleCallbacks>> fragmentLifecycleCallbacks, Provider<BooleanPreference> isNewDevicePref, Provider<StringPreference> lastDeepLinkNoncePref, Provider<MarketHoursManager> marketHoursManager, Provider<Navigator> navigator, Provider<NightModeManager> nightModeManager, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner, Provider<EnumPreference<Theme>> themePref, Provider<NotificationManager> notificationManager, Provider<PltManager> pltManager) {
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
            return new BaseActivitySingletons_Factory(analytics, appContainer, authManager, colorSchemeManager, eventLoggerInternal, fragmentLifecycleCallbacks, isNewDevicePref, lastDeepLinkNoncePref, marketHoursManager, navigator, nightModeManager, rhProcessLifecycleOwner, themePref, notificationManager, pltManager);
        }

        @JvmStatic
        public final BaseActivitySingletons newInstance(AnalyticsLogger analytics, AppContainer appContainer, AuthManager authManager, ColorSchemeManager colorSchemeManager, EventLogger eventLoggerInternal, Set<FragmentManager.FragmentLifecycleCallbacks> fragmentLifecycleCallbacks, BooleanPreference isNewDevicePref, StringPreference lastDeepLinkNoncePref, MarketHoursManager marketHoursManager, Navigator navigator, NightModeManager nightModeManager, Lazy<RhProcessLifecycleOwner> rhProcessLifecycleOwner, EnumPreference<Theme> themePref, NotificationManager notificationManager, PltManager pltManager) {
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
            return new BaseActivitySingletons(analytics, appContainer, authManager, colorSchemeManager, eventLoggerInternal, fragmentLifecycleCallbacks, isNewDevicePref, lastDeepLinkNoncePref, marketHoursManager, navigator, nightModeManager, rhProcessLifecycleOwner, themePref, notificationManager, pltManager);
        }
    }
}
