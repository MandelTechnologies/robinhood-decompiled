package com.robinhood.android.widget.p277ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.widget.p277ui.PortfolioWidgetUpdater_MembersInjector;
import com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenPortfolioChartStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioWidgetUpdater_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater;", "lastUpdatedPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/LongPreference;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "serverDrivenPortfolioChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenPortfolioChartStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "viewsBuilder", "Lcom/robinhood/android/widget/ui/PortfolioWidgetViewsBuilder;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PortfolioWidgetUpdater_Factory implements Factory<PortfolioWidgetUpdater> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AuthManager> authManager;
    private final Provider<LongPreference> lastUpdatedPref;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<ServerDrivenPortfolioChartStore> serverDrivenPortfolioChartStore;
    private final Provider<UnifiedAccountStore> unifiedAccountStore;
    private final Provider<PortfolioWidgetViewsBuilder> viewsBuilder;

    @JvmStatic
    public static final PortfolioWidgetUpdater_Factory create(Provider<LongPreference> provider, Provider<UnifiedAccountStore> provider2, Provider<AuthManager> provider3, Provider<ServerDrivenPortfolioChartStore> provider4, Provider<TraderMarketHoursManager> provider5, Provider<PortfolioWidgetViewsBuilder> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final PortfolioWidgetUpdater newInstance() {
        return INSTANCE.newInstance();
    }

    public PortfolioWidgetUpdater_Factory(Provider<LongPreference> lastUpdatedPref, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<AuthManager> authManager, Provider<ServerDrivenPortfolioChartStore> serverDrivenPortfolioChartStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<PortfolioWidgetViewsBuilder> viewsBuilder) {
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

    @Override // javax.inject.Provider
    public PortfolioWidgetUpdater get() {
        PortfolioWidgetUpdater portfolioWidgetUpdaterNewInstance = INSTANCE.newInstance();
        PortfolioWidgetUpdater_MembersInjector.Companion companion = PortfolioWidgetUpdater_MembersInjector.INSTANCE;
        LongPreference longPreference = this.lastUpdatedPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        companion.injectLastUpdatedPref(portfolioWidgetUpdaterNewInstance, longPreference);
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(unifiedAccountStore, "get(...)");
        companion.injectUnifiedAccountStore(portfolioWidgetUpdaterNewInstance, unifiedAccountStore);
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        companion.injectAuthManager(portfolioWidgetUpdaterNewInstance, authManager);
        ServerDrivenPortfolioChartStore serverDrivenPortfolioChartStore = this.serverDrivenPortfolioChartStore.get();
        Intrinsics.checkNotNullExpressionValue(serverDrivenPortfolioChartStore, "get(...)");
        companion.injectServerDrivenPortfolioChartStore(portfolioWidgetUpdaterNewInstance, serverDrivenPortfolioChartStore);
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        companion.injectMarketHoursManager(portfolioWidgetUpdaterNewInstance, traderMarketHoursManager);
        PortfolioWidgetViewsBuilder portfolioWidgetViewsBuilder = this.viewsBuilder.get();
        Intrinsics.checkNotNullExpressionValue(portfolioWidgetViewsBuilder, "get(...)");
        companion.injectViewsBuilder(portfolioWidgetUpdaterNewInstance, portfolioWidgetViewsBuilder);
        return portfolioWidgetUpdaterNewInstance;
    }

    /* compiled from: PortfolioWidgetUpdater_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater_Factory;", "lastUpdatedPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/LongPreference;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "serverDrivenPortfolioChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenPortfolioChartStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "viewsBuilder", "Lcom/robinhood/android/widget/ui/PortfolioWidgetViewsBuilder;", "newInstance", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PortfolioWidgetUpdater_Factory create(Provider<LongPreference> lastUpdatedPref, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<AuthManager> authManager, Provider<ServerDrivenPortfolioChartStore> serverDrivenPortfolioChartStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<PortfolioWidgetViewsBuilder> viewsBuilder) {
            Intrinsics.checkNotNullParameter(lastUpdatedPref, "lastUpdatedPref");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(serverDrivenPortfolioChartStore, "serverDrivenPortfolioChartStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(viewsBuilder, "viewsBuilder");
            return new PortfolioWidgetUpdater_Factory(lastUpdatedPref, unifiedAccountStore, authManager, serverDrivenPortfolioChartStore, marketHoursManager, viewsBuilder);
        }

        @JvmStatic
        public final PortfolioWidgetUpdater newInstance() {
            return new PortfolioWidgetUpdater();
        }
    }
}
