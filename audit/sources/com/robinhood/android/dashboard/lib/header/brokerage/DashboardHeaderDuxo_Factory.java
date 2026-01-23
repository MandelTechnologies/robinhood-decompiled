package com.robinhood.android.dashboard.lib.header.brokerage;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardHeaderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDuxo;", "homeDashboardStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "accountSwitcherTooltipManager", "Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherTooltipManager;", "accountSwitcherBadgeManager", "Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherBadgeManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DashboardHeaderDuxo_Factory implements Factory<DashboardHeaderDuxo> {
    private final Provider<AccountSwitcherBadgeManager> accountSwitcherBadgeManager;
    private final Provider<AccountSwitcherTooltipManager> accountSwitcherTooltipManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<HomeDashboardStore> homeDashboardStore;
    private final Provider<BaseSortingHatStore> sortingHatStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final DashboardHeaderDuxo_Factory create(Provider<HomeDashboardStore> provider, Provider<BaseSortingHatStore> provider2, Provider<AccountSwitcherTooltipManager> provider3, Provider<AccountSwitcherBadgeManager> provider4, Provider<ExperimentsStore> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final DashboardHeaderDuxo newInstance(HomeDashboardStore homeDashboardStore, BaseSortingHatStore baseSortingHatStore, AccountSwitcherTooltipManager accountSwitcherTooltipManager, AccountSwitcherBadgeManager accountSwitcherBadgeManager, ExperimentsStore experimentsStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(homeDashboardStore, baseSortingHatStore, accountSwitcherTooltipManager, accountSwitcherBadgeManager, experimentsStore, duxoBundle);
    }

    public DashboardHeaderDuxo_Factory(Provider<HomeDashboardStore> homeDashboardStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<AccountSwitcherTooltipManager> accountSwitcherTooltipManager, Provider<AccountSwitcherBadgeManager> accountSwitcherBadgeManager, Provider<ExperimentsStore> experimentsStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(accountSwitcherTooltipManager, "accountSwitcherTooltipManager");
        Intrinsics.checkNotNullParameter(accountSwitcherBadgeManager, "accountSwitcherBadgeManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.homeDashboardStore = homeDashboardStore;
        this.sortingHatStore = sortingHatStore;
        this.accountSwitcherTooltipManager = accountSwitcherTooltipManager;
        this.accountSwitcherBadgeManager = accountSwitcherBadgeManager;
        this.experimentsStore = experimentsStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public DashboardHeaderDuxo get() {
        Companion companion = INSTANCE;
        HomeDashboardStore homeDashboardStore = this.homeDashboardStore.get();
        Intrinsics.checkNotNullExpressionValue(homeDashboardStore, "get(...)");
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore.get();
        Intrinsics.checkNotNullExpressionValue(baseSortingHatStore, "get(...)");
        AccountSwitcherTooltipManager accountSwitcherTooltipManager = this.accountSwitcherTooltipManager.get();
        Intrinsics.checkNotNullExpressionValue(accountSwitcherTooltipManager, "get(...)");
        AccountSwitcherBadgeManager accountSwitcherBadgeManager = this.accountSwitcherBadgeManager.get();
        Intrinsics.checkNotNullExpressionValue(accountSwitcherBadgeManager, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(homeDashboardStore, baseSortingHatStore, accountSwitcherTooltipManager, accountSwitcherBadgeManager, experimentsStore, duxoBundle);
    }

    /* compiled from: DashboardHeaderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDuxo_Factory;", "homeDashboardStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "accountSwitcherTooltipManager", "Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherTooltipManager;", "accountSwitcherBadgeManager", "Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherBadgeManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDuxo;", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DashboardHeaderDuxo_Factory create(Provider<HomeDashboardStore> homeDashboardStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<AccountSwitcherTooltipManager> accountSwitcherTooltipManager, Provider<AccountSwitcherBadgeManager> accountSwitcherBadgeManager, Provider<ExperimentsStore> experimentsStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(accountSwitcherTooltipManager, "accountSwitcherTooltipManager");
            Intrinsics.checkNotNullParameter(accountSwitcherBadgeManager, "accountSwitcherBadgeManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DashboardHeaderDuxo_Factory(homeDashboardStore, sortingHatStore, accountSwitcherTooltipManager, accountSwitcherBadgeManager, experimentsStore, duxoBundle);
        }

        @JvmStatic
        public final DashboardHeaderDuxo newInstance(HomeDashboardStore homeDashboardStore, BaseSortingHatStore sortingHatStore, AccountSwitcherTooltipManager accountSwitcherTooltipManager, AccountSwitcherBadgeManager accountSwitcherBadgeManager, ExperimentsStore experimentsStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(accountSwitcherTooltipManager, "accountSwitcherTooltipManager");
            Intrinsics.checkNotNullParameter(accountSwitcherBadgeManager, "accountSwitcherBadgeManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DashboardHeaderDuxo(homeDashboardStore, sortingHatStore, accountSwitcherTooltipManager, accountSwitcherBadgeManager, experimentsStore, duxoBundle);
        }
    }
}
