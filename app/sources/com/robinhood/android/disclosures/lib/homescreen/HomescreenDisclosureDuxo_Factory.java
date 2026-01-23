package com.robinhood.android.disclosures.lib.homescreen;

import advisory.proto.p008v1.AdvisoryService;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomescreenDisclosureDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureDuxo;", "accountAccessStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "lastSeenDisclosurePref", "Lcom/robinhood/prefs/IntPreference;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-disclosures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class HomescreenDisclosureDuxo_Factory implements Factory<HomescreenDisclosureDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AdvisoryService> advisoryService;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<BrokerageResourceManager> brokerageResourceManager;
    private final Provider<CuratedListStore> curatedListStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<IntPreference> lastSeenDisclosurePref;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final HomescreenDisclosureDuxo_Factory create(Provider<AccountAccessStore> provider, Provider<AccountProvider> provider2, Provider<AnalyticsLogger> provider3, Provider<BrokerageResourceManager> provider4, Provider<RegionGateProvider> provider5, Provider<UserStore> provider6, Provider<AdvisoryService> provider7, Provider<IntPreference> provider8, Provider<CuratedListStore> provider9, Provider<DuxoBundle> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final HomescreenDisclosureDuxo newInstance(AccountAccessStore accountAccessStore, AccountProvider accountProvider, AnalyticsLogger analyticsLogger, BrokerageResourceManager brokerageResourceManager, RegionGateProvider regionGateProvider, UserStore userStore, AdvisoryService advisoryService, IntPreference intPreference, CuratedListStore curatedListStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountAccessStore, accountProvider, analyticsLogger, brokerageResourceManager, regionGateProvider, userStore, advisoryService, intPreference, curatedListStore, duxoBundle);
    }

    public HomescreenDisclosureDuxo_Factory(Provider<AccountAccessStore> accountAccessStore, Provider<AccountProvider> accountProvider, Provider<AnalyticsLogger> analytics, Provider<BrokerageResourceManager> brokerageResourceManager, Provider<RegionGateProvider> regionGateProvider, Provider<UserStore> userStore, Provider<AdvisoryService> advisoryService, Provider<IntPreference> lastSeenDisclosurePref, Provider<CuratedListStore> curatedListStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(lastSeenDisclosurePref, "lastSeenDisclosurePref");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountAccessStore = accountAccessStore;
        this.accountProvider = accountProvider;
        this.analytics = analytics;
        this.brokerageResourceManager = brokerageResourceManager;
        this.regionGateProvider = regionGateProvider;
        this.userStore = userStore;
        this.advisoryService = advisoryService;
        this.lastSeenDisclosurePref = lastSeenDisclosurePref;
        this.curatedListStore = curatedListStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public HomescreenDisclosureDuxo get() {
        Companion companion = INSTANCE;
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        BrokerageResourceManager brokerageResourceManager = this.brokerageResourceManager.get();
        Intrinsics.checkNotNullExpressionValue(brokerageResourceManager, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        AdvisoryService advisoryService = this.advisoryService.get();
        Intrinsics.checkNotNullExpressionValue(advisoryService, "get(...)");
        IntPreference intPreference = this.lastSeenDisclosurePref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        CuratedListStore curatedListStore = this.curatedListStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountAccessStore, accountProvider, analyticsLogger, brokerageResourceManager, regionGateProvider, userStore, advisoryService, intPreference, curatedListStore, duxoBundle);
    }

    /* compiled from: HomescreenDisclosureDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007JX\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureDuxo_Factory;", "accountAccessStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "lastSeenDisclosurePref", "Lcom/robinhood/prefs/IntPreference;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureDuxo;", "lib-disclosures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HomescreenDisclosureDuxo_Factory create(Provider<AccountAccessStore> accountAccessStore, Provider<AccountProvider> accountProvider, Provider<AnalyticsLogger> analytics, Provider<BrokerageResourceManager> brokerageResourceManager, Provider<RegionGateProvider> regionGateProvider, Provider<UserStore> userStore, Provider<AdvisoryService> advisoryService, Provider<IntPreference> lastSeenDisclosurePref, Provider<CuratedListStore> curatedListStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
            Intrinsics.checkNotNullParameter(lastSeenDisclosurePref, "lastSeenDisclosurePref");
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new HomescreenDisclosureDuxo_Factory(accountAccessStore, accountProvider, analytics, brokerageResourceManager, regionGateProvider, userStore, advisoryService, lastSeenDisclosurePref, curatedListStore, duxoBundle);
        }

        @JvmStatic
        public final HomescreenDisclosureDuxo newInstance(AccountAccessStore accountAccessStore, AccountProvider accountProvider, AnalyticsLogger analytics, BrokerageResourceManager brokerageResourceManager, RegionGateProvider regionGateProvider, UserStore userStore, AdvisoryService advisoryService, IntPreference lastSeenDisclosurePref, CuratedListStore curatedListStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
            Intrinsics.checkNotNullParameter(lastSeenDisclosurePref, "lastSeenDisclosurePref");
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new HomescreenDisclosureDuxo(accountAccessStore, accountProvider, analytics, brokerageResourceManager, regionGateProvider, userStore, advisoryService, lastSeenDisclosurePref, curatedListStore, duxoBundle);
        }
    }
}
