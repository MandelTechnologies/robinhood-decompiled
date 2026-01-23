package com.robinhood.android.widget.p277ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.widget.util.PortfolioWidgetLastUpdatedPref;
import com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenPortfolioChartStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioWidgetUpdater_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater;", "lastUpdatedPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/LongPreference;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "serverDrivenPortfolioChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenPortfolioChartStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "viewsBuilder", "Lcom/robinhood/android/widget/ui/PortfolioWidgetViewsBuilder;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PortfolioWidgetUpdater_MembersInjector implements MembersInjector<PortfolioWidgetUpdater> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AuthManager> authManager;
    private final Provider<LongPreference> lastUpdatedPref;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<ServerDrivenPortfolioChartStore> serverDrivenPortfolioChartStore;
    private final Provider<UnifiedAccountStore> unifiedAccountStore;
    private final Provider<PortfolioWidgetViewsBuilder> viewsBuilder;

    @JvmStatic
    public static final MembersInjector<PortfolioWidgetUpdater> create(Provider<LongPreference> provider, Provider<UnifiedAccountStore> provider2, Provider<AuthManager> provider3, Provider<ServerDrivenPortfolioChartStore> provider4, Provider<TraderMarketHoursManager> provider5, Provider<PortfolioWidgetViewsBuilder> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectAuthManager(PortfolioWidgetUpdater portfolioWidgetUpdater, AuthManager authManager) {
        INSTANCE.injectAuthManager(portfolioWidgetUpdater, authManager);
    }

    @JvmStatic
    @PortfolioWidgetLastUpdatedPref
    public static final void injectLastUpdatedPref(PortfolioWidgetUpdater portfolioWidgetUpdater, LongPreference longPreference) {
        INSTANCE.injectLastUpdatedPref(portfolioWidgetUpdater, longPreference);
    }

    @JvmStatic
    public static final void injectMarketHoursManager(PortfolioWidgetUpdater portfolioWidgetUpdater, TraderMarketHoursManager traderMarketHoursManager) {
        INSTANCE.injectMarketHoursManager(portfolioWidgetUpdater, traderMarketHoursManager);
    }

    @JvmStatic
    public static final void injectServerDrivenPortfolioChartStore(PortfolioWidgetUpdater portfolioWidgetUpdater, ServerDrivenPortfolioChartStore serverDrivenPortfolioChartStore) {
        INSTANCE.injectServerDrivenPortfolioChartStore(portfolioWidgetUpdater, serverDrivenPortfolioChartStore);
    }

    @JvmStatic
    public static final void injectUnifiedAccountStore(PortfolioWidgetUpdater portfolioWidgetUpdater, UnifiedAccountStore unifiedAccountStore) {
        INSTANCE.injectUnifiedAccountStore(portfolioWidgetUpdater, unifiedAccountStore);
    }

    @JvmStatic
    public static final void injectViewsBuilder(PortfolioWidgetUpdater portfolioWidgetUpdater, PortfolioWidgetViewsBuilder portfolioWidgetViewsBuilder) {
        INSTANCE.injectViewsBuilder(portfolioWidgetUpdater, portfolioWidgetViewsBuilder);
    }

    public PortfolioWidgetUpdater_MembersInjector(Provider<LongPreference> lastUpdatedPref, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<AuthManager> authManager, Provider<ServerDrivenPortfolioChartStore> serverDrivenPortfolioChartStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<PortfolioWidgetViewsBuilder> viewsBuilder) {
        Intrinsics.checkNotNullParameter(lastUpdatedPref, "lastUpdatedPref");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(serverDrivenPortfolioChartStore, "serverDrivenPortfolioChartStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(viewsBuilder, "viewsBuilder");
        this.lastUpdatedPref = lastUpdatedPref;
        this.unifiedAccountStore = unifiedAccountStore;
        this.authManager = authManager;
        this.serverDrivenPortfolioChartStore = serverDrivenPortfolioChartStore;
        this.marketHoursManager = marketHoursManager;
        this.viewsBuilder = viewsBuilder;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PortfolioWidgetUpdater instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        LongPreference longPreference = this.lastUpdatedPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        companion.injectLastUpdatedPref(instance, longPreference);
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(unifiedAccountStore, "get(...)");
        companion.injectUnifiedAccountStore(instance, unifiedAccountStore);
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        companion.injectAuthManager(instance, authManager);
        ServerDrivenPortfolioChartStore serverDrivenPortfolioChartStore = this.serverDrivenPortfolioChartStore.get();
        Intrinsics.checkNotNullExpressionValue(serverDrivenPortfolioChartStore, "get(...)");
        companion.injectServerDrivenPortfolioChartStore(instance, serverDrivenPortfolioChartStore);
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        companion.injectMarketHoursManager(instance, traderMarketHoursManager);
        PortfolioWidgetViewsBuilder portfolioWidgetViewsBuilder = this.viewsBuilder.get();
        Intrinsics.checkNotNullExpressionValue(portfolioWidgetViewsBuilder, "get(...)");
        companion.injectViewsBuilder(instance, portfolioWidgetViewsBuilder);
    }

    /* compiled from: PortfolioWidgetUpdater_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater;", "lastUpdatedPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/LongPreference;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "serverDrivenPortfolioChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenPortfolioChartStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "viewsBuilder", "Lcom/robinhood/android/widget/ui/PortfolioWidgetViewsBuilder;", "injectLastUpdatedPref", "", "instance", "injectUnifiedAccountStore", "injectAuthManager", "injectServerDrivenPortfolioChartStore", "injectMarketHoursManager", "injectViewsBuilder", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<PortfolioWidgetUpdater> create(Provider<LongPreference> lastUpdatedPref, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<AuthManager> authManager, Provider<ServerDrivenPortfolioChartStore> serverDrivenPortfolioChartStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<PortfolioWidgetViewsBuilder> viewsBuilder) {
            Intrinsics.checkNotNullParameter(lastUpdatedPref, "lastUpdatedPref");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(serverDrivenPortfolioChartStore, "serverDrivenPortfolioChartStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(viewsBuilder, "viewsBuilder");
            return new PortfolioWidgetUpdater_MembersInjector(lastUpdatedPref, unifiedAccountStore, authManager, serverDrivenPortfolioChartStore, marketHoursManager, viewsBuilder);
        }

        @JvmStatic
        @PortfolioWidgetLastUpdatedPref
        public final void injectLastUpdatedPref(PortfolioWidgetUpdater instance, LongPreference lastUpdatedPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(lastUpdatedPref, "lastUpdatedPref");
            instance.setLastUpdatedPref(lastUpdatedPref);
        }

        @JvmStatic
        public final void injectUnifiedAccountStore(PortfolioWidgetUpdater instance, UnifiedAccountStore unifiedAccountStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            instance.setUnifiedAccountStore(unifiedAccountStore);
        }

        @JvmStatic
        public final void injectAuthManager(PortfolioWidgetUpdater instance, AuthManager authManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            instance.setAuthManager(authManager);
        }

        @JvmStatic
        public final void injectServerDrivenPortfolioChartStore(PortfolioWidgetUpdater instance, ServerDrivenPortfolioChartStore serverDrivenPortfolioChartStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(serverDrivenPortfolioChartStore, "serverDrivenPortfolioChartStore");
            instance.setServerDrivenPortfolioChartStore(serverDrivenPortfolioChartStore);
        }

        @JvmStatic
        public final void injectMarketHoursManager(PortfolioWidgetUpdater instance, TraderMarketHoursManager marketHoursManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            instance.setMarketHoursManager(marketHoursManager);
        }

        @JvmStatic
        public final void injectViewsBuilder(PortfolioWidgetUpdater instance, PortfolioWidgetViewsBuilder viewsBuilder) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(viewsBuilder, "viewsBuilder");
            instance.setViewsBuilder$feature_widget_externalDebug(viewsBuilder);
        }
    }
}
