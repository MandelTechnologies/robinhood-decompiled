package com.robinhood.android.crypto.tab.p093ui.header;

import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.dashboardpill.DashboardPillManager;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoRewardsStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.app.type.AppType;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoHomeHeaderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B¦\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\u0011\u0010\u0014\u001a\r\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u00130\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u001f\u0010\u0014\u001a\r\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u00130\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderStateProvider;", "stateProvider", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoRewardsStore;", "Lkotlin/jvm/JvmSuppressWildcards;", "cryptoRewardsStore", "Lcom/robinhood/android/dashboardpill/DashboardPillManager;", "dashboardPillManager", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoHomeHeaderDuxo_Factory implements Factory<CryptoHomeHeaderDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AppType> appType;
    private final Provider<Clock> clock;
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoRewardsStore> cryptoRewardsStore;
    private final Provider<DashboardPillManager> dashboardPillManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<PerformanceChartStore> performanceChartStore;
    private final Provider<Resources> resources;
    private final Provider<CryptoHomeHeaderDuxo7> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoHomeHeaderDuxo_Factory create(Provider<CryptoHomeHeaderDuxo7> provider, Provider<Resources> provider2, Provider<AccountProvider> provider3, Provider<AppType> provider4, Provider<PerformanceChartStore> provider5, Provider<CryptoAccountStore> provider6, Provider<CryptoExperimentsStore> provider7, Provider<CryptoRewardsStore> provider8, Provider<DashboardPillManager> provider9, Provider<Clock> provider10, Provider<DuxoBundle> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final CryptoHomeHeaderDuxo newInstance(CryptoHomeHeaderDuxo7 cryptoHomeHeaderDuxo7, Resources resources, AccountProvider accountProvider, AppType appType, PerformanceChartStore performanceChartStore, CryptoAccountStore cryptoAccountStore, CryptoExperimentsStore cryptoExperimentsStore, Lazy<CryptoRewardsStore> lazy, DashboardPillManager dashboardPillManager, Clock clock, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(cryptoHomeHeaderDuxo7, resources, accountProvider, appType, performanceChartStore, cryptoAccountStore, cryptoExperimentsStore, lazy, dashboardPillManager, clock, duxoBundle);
    }

    public CryptoHomeHeaderDuxo_Factory(Provider<CryptoHomeHeaderDuxo7> stateProvider, Provider<Resources> resources, Provider<AccountProvider> accountProvider, Provider<AppType> appType, Provider<PerformanceChartStore> performanceChartStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoRewardsStore> cryptoRewardsStore, Provider<DashboardPillManager> dashboardPillManager, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoRewardsStore, "cryptoRewardsStore");
        Intrinsics.checkNotNullParameter(dashboardPillManager, "dashboardPillManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.stateProvider = stateProvider;
        this.resources = resources;
        this.accountProvider = accountProvider;
        this.appType = appType;
        this.performanceChartStore = performanceChartStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoRewardsStore = cryptoRewardsStore;
        this.dashboardPillManager = dashboardPillManager;
        this.clock = clock;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CryptoHomeHeaderDuxo get() {
        Companion companion = INSTANCE;
        CryptoHomeHeaderDuxo7 cryptoHomeHeaderDuxo7 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHomeHeaderDuxo7, "get(...)");
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        PerformanceChartStore performanceChartStore = this.performanceChartStore.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartStore, "get(...)");
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        Lazy<CryptoRewardsStore> lazy = DoubleCheck.lazy(this.cryptoRewardsStore);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        DashboardPillManager dashboardPillManager = this.dashboardPillManager.get();
        Intrinsics.checkNotNullExpressionValue(dashboardPillManager, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(cryptoHomeHeaderDuxo7, resources, accountProvider, appType, performanceChartStore, cryptoAccountStore, cryptoExperimentsStore, lazy, dashboardPillManager, clock, duxoBundle);
    }

    /* compiled from: CryptoHomeHeaderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J®\u0001\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJr\u0010!\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u001f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderStateProvider;", "stateProvider", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoRewardsStore;", "Lkotlin/jvm/JvmSuppressWildcards;", "cryptoRewardsStore", "Lcom/robinhood/android/dashboardpill/DashboardPillManager;", "dashboardPillManager", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDuxo_Factory;", "Ldagger/Lazy;", "Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDuxo;", "newInstance", "(Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderStateProvider;Landroid/content/res/Resources;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Ldagger/Lazy;Lcom/robinhood/android/dashboardpill/DashboardPillManager;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDuxo;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoHomeHeaderDuxo_Factory create(Provider<CryptoHomeHeaderDuxo7> stateProvider, Provider<Resources> resources, Provider<AccountProvider> accountProvider, Provider<AppType> appType, Provider<PerformanceChartStore> performanceChartStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoRewardsStore> cryptoRewardsStore, Provider<DashboardPillManager> dashboardPillManager, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoRewardsStore, "cryptoRewardsStore");
            Intrinsics.checkNotNullParameter(dashboardPillManager, "dashboardPillManager");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoHomeHeaderDuxo_Factory(stateProvider, resources, accountProvider, appType, performanceChartStore, cryptoAccountStore, cryptoExperimentsStore, cryptoRewardsStore, dashboardPillManager, clock, duxoBundle);
        }

        @JvmStatic
        public final CryptoHomeHeaderDuxo newInstance(CryptoHomeHeaderDuxo7 stateProvider, Resources resources, AccountProvider accountProvider, AppType appType, PerformanceChartStore performanceChartStore, CryptoAccountStore cryptoAccountStore, CryptoExperimentsStore cryptoExperimentsStore, Lazy<CryptoRewardsStore> cryptoRewardsStore, DashboardPillManager dashboardPillManager, Clock clock, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoRewardsStore, "cryptoRewardsStore");
            Intrinsics.checkNotNullParameter(dashboardPillManager, "dashboardPillManager");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoHomeHeaderDuxo(stateProvider, resources, accountProvider, appType, performanceChartStore, cryptoAccountStore, cryptoExperimentsStore, cryptoRewardsStore, dashboardPillManager, clock, duxoBundle);
        }
    }
}
