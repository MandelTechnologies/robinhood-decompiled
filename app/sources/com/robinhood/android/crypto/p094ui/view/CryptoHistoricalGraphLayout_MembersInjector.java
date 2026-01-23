package com.robinhood.android.crypto.p094ui.view;

import android.content.SharedPreferences;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.librobinhood.data.store.prefs.ShowCandlestickChartPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHistoricalGraphLayout_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/view/CryptoHistoricalGraphLayout_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/crypto/ui/view/CryptoHistoricalGraphLayout;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "showCandlestickChartPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHistoricalGraphLayout_MembersInjector implements MembersInjector<CryptoHistoricalGraphLayout> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<EventLogger> eventLogger;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<BooleanPreference> showCandlestickChartPref;
    private final Provider<SharedPreferences> userPrefs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CryptoHistoricalGraphLayout> create(Provider<AnalyticsLogger> provider, Provider<EventLogger> provider2, Provider<TraderMarketHoursManager> provider3, Provider<SharedPreferences> provider4, Provider<BooleanPreference> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectAnalytics(CryptoHistoricalGraphLayout cryptoHistoricalGraphLayout, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(cryptoHistoricalGraphLayout, analyticsLogger);
    }

    @JvmStatic
    public static final void injectEventLogger(CryptoHistoricalGraphLayout cryptoHistoricalGraphLayout, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(cryptoHistoricalGraphLayout, eventLogger);
    }

    @JvmStatic
    public static final void injectMarketHoursManager(CryptoHistoricalGraphLayout cryptoHistoricalGraphLayout, TraderMarketHoursManager traderMarketHoursManager) {
        INSTANCE.injectMarketHoursManager(cryptoHistoricalGraphLayout, traderMarketHoursManager);
    }

    @JvmStatic
    @ShowCandlestickChartPref
    public static final void injectShowCandlestickChartPref(CryptoHistoricalGraphLayout cryptoHistoricalGraphLayout, BooleanPreference booleanPreference) {
        INSTANCE.injectShowCandlestickChartPref(cryptoHistoricalGraphLayout, booleanPreference);
    }

    @JvmStatic
    @UserPrefs
    public static final void injectUserPrefs(CryptoHistoricalGraphLayout cryptoHistoricalGraphLayout, SharedPreferences sharedPreferences) {
        INSTANCE.injectUserPrefs(cryptoHistoricalGraphLayout, sharedPreferences);
    }

    public CryptoHistoricalGraphLayout_MembersInjector(Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<TraderMarketHoursManager> marketHoursManager, Provider<SharedPreferences> userPrefs, Provider<BooleanPreference> showCandlestickChartPref) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.marketHoursManager = marketHoursManager;
        this.userPrefs = userPrefs;
        this.showCandlestickChartPref = showCandlestickChartPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CryptoHistoricalGraphLayout instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion.injectAnalytics(instance, analyticsLogger);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion.injectEventLogger(instance, eventLogger);
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        companion.injectMarketHoursManager(instance, traderMarketHoursManager);
        SharedPreferences sharedPreferences = this.userPrefs.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        companion.injectUserPrefs(instance, sharedPreferences);
        BooleanPreference booleanPreference = this.showCandlestickChartPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion.injectShowCandlestickChartPref(instance, booleanPreference);
    }

    /* compiled from: CryptoHistoricalGraphLayout_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/view/CryptoHistoricalGraphLayout_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/crypto/ui/view/CryptoHistoricalGraphLayout;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "showCandlestickChartPref", "Lcom/robinhood/prefs/BooleanPreference;", "injectAnalytics", "", "instance", "injectEventLogger", "injectMarketHoursManager", "injectUserPrefs", "injectShowCandlestickChartPref", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CryptoHistoricalGraphLayout> create(Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<TraderMarketHoursManager> marketHoursManager, Provider<SharedPreferences> userPrefs, Provider<BooleanPreference> showCandlestickChartPref) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
            return new CryptoHistoricalGraphLayout_MembersInjector(analytics, eventLogger, marketHoursManager, userPrefs, showCandlestickChartPref);
        }

        @JvmStatic
        public final void injectAnalytics(CryptoHistoricalGraphLayout instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectEventLogger(CryptoHistoricalGraphLayout instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectMarketHoursManager(CryptoHistoricalGraphLayout instance, TraderMarketHoursManager marketHoursManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            instance.setMarketHoursManager(marketHoursManager);
        }

        @JvmStatic
        @UserPrefs
        public final void injectUserPrefs(CryptoHistoricalGraphLayout instance, SharedPreferences userPrefs) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            instance.setUserPrefs(userPrefs);
        }

        @JvmStatic
        @ShowCandlestickChartPref
        public final void injectShowCandlestickChartPref(CryptoHistoricalGraphLayout instance, BooleanPreference showCandlestickChartPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
            instance.setShowCandlestickChartPref(showCandlestickChartPref);
        }
    }
}
