package com.robinhood.android.redesign.accounttab.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountTabStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/store/AccountTabStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/redesign/accounttab/store/AccountTabStore;", "performanceChartStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "bundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AccountTabStore_Factory implements Factory<AccountTabStore> {
    private final Provider<StoreBundle> bundle;
    private final Provider<HomeDashboardStore> homeDashboardStore;
    private final Provider<PerformanceChartStore> performanceChartStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AccountTabStore_Factory create(Provider<PerformanceChartStore> provider, Provider<HomeDashboardStore> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final AccountTabStore newInstance(PerformanceChartStore performanceChartStore, HomeDashboardStore homeDashboardStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(performanceChartStore, homeDashboardStore, storeBundle);
    }

    public AccountTabStore_Factory(Provider<PerformanceChartStore> performanceChartStore, Provider<HomeDashboardStore> homeDashboardStore, Provider<StoreBundle> bundle) {
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.performanceChartStore = performanceChartStore;
        this.homeDashboardStore = homeDashboardStore;
        this.bundle = bundle;
    }

    @Override // javax.inject.Provider
    public AccountTabStore get() {
        Companion companion = INSTANCE;
        PerformanceChartStore performanceChartStore = this.performanceChartStore.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartStore, "get(...)");
        HomeDashboardStore homeDashboardStore = this.homeDashboardStore.get();
        Intrinsics.checkNotNullExpressionValue(homeDashboardStore, "get(...)");
        StoreBundle storeBundle = this.bundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(performanceChartStore, homeDashboardStore, storeBundle);
    }

    /* compiled from: AccountTabStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/store/AccountTabStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/redesign/accounttab/store/AccountTabStore_Factory;", "performanceChartStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "bundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/redesign/accounttab/store/AccountTabStore;", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountTabStore_Factory create(Provider<PerformanceChartStore> performanceChartStore, Provider<HomeDashboardStore> homeDashboardStore, Provider<StoreBundle> bundle) {
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return new AccountTabStore_Factory(performanceChartStore, homeDashboardStore, bundle);
        }

        @JvmStatic
        public final AccountTabStore newInstance(PerformanceChartStore performanceChartStore, HomeDashboardStore homeDashboardStore, StoreBundle bundle) {
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return new AccountTabStore(performanceChartStore, homeDashboardStore, bundle);
        }
    }
}
