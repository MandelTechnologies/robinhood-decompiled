package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.models.dao.TaxLotEligibilityDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotEligibilityStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/TaxLotEligibilityDao;", "brokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TaxLotEligibilityStore_Factory implements Factory<TaxLotEligibilityStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<EquitiesBrokeback> brokeback;
    private final Provider<TaxLotEligibilityDao> dao;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final TaxLotEligibilityStore_Factory create(Provider<StoreBundle> provider, Provider<TaxLotEligibilityDao> provider2, Provider<EquitiesBrokeback> provider3, Provider<RegionGateProvider> provider4, Provider<AccountProvider> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final TaxLotEligibilityStore newInstance(StoreBundle storeBundle, TaxLotEligibilityDao taxLotEligibilityDao, EquitiesBrokeback equitiesBrokeback, RegionGateProvider regionGateProvider, AccountProvider accountProvider) {
        return INSTANCE.newInstance(storeBundle, taxLotEligibilityDao, equitiesBrokeback, regionGateProvider, accountProvider);
    }

    public TaxLotEligibilityStore_Factory(Provider<StoreBundle> storeBundle, Provider<TaxLotEligibilityDao> dao, Provider<EquitiesBrokeback> brokeback, Provider<RegionGateProvider> regionGateProvider, Provider<AccountProvider> accountProvider) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.brokeback = brokeback;
        this.regionGateProvider = regionGateProvider;
        this.accountProvider = accountProvider;
    }

    @Override // javax.inject.Provider
    public TaxLotEligibilityStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        TaxLotEligibilityDao taxLotEligibilityDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(taxLotEligibilityDao, "get(...)");
        EquitiesBrokeback equitiesBrokeback = this.brokeback.get();
        Intrinsics.checkNotNullExpressionValue(equitiesBrokeback, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        return companion.newInstance(storeBundle, taxLotEligibilityDao, equitiesBrokeback, regionGateProvider, accountProvider);
    }

    /* compiled from: TaxLotEligibilityStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/TaxLotEligibilityDao;", "brokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "newInstance", "Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TaxLotEligibilityStore_Factory create(Provider<StoreBundle> storeBundle, Provider<TaxLotEligibilityDao> dao, Provider<EquitiesBrokeback> brokeback, Provider<RegionGateProvider> regionGateProvider, Provider<AccountProvider> accountProvider) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            return new TaxLotEligibilityStore_Factory(storeBundle, dao, brokeback, regionGateProvider, accountProvider);
        }

        @JvmStatic
        public final TaxLotEligibilityStore newInstance(StoreBundle storeBundle, TaxLotEligibilityDao dao, EquitiesBrokeback brokeback, RegionGateProvider regionGateProvider, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            return new TaxLotEligibilityStore(storeBundle, dao, brokeback, regionGateProvider, accountProvider);
        }
    }
}
