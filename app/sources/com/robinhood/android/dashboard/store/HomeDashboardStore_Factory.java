package com.robinhood.android.dashboard.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.home.api.HomeApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.models.home.dao.HomeStateDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeDashboardStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/dashboard/store/HomeDashboardStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "homeApi", "Lcom/robinhood/android/home/api/HomeApi;", "homeStateDao", "Lcom/robinhood/models/home/dao/HomeStateDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class HomeDashboardStore_Factory implements Factory<HomeDashboardStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<HomeApi> homeApi;
    private final Provider<HomeStateDao> homeStateDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final HomeDashboardStore_Factory create(Provider<AccountProvider> provider, Provider<HomeApi> provider2, Provider<HomeStateDao> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final HomeDashboardStore newInstance(AccountProvider accountProvider, HomeApi homeApi, HomeStateDao homeStateDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(accountProvider, homeApi, homeStateDao, storeBundle);
    }

    public HomeDashboardStore_Factory(Provider<AccountProvider> accountProvider, Provider<HomeApi> homeApi, Provider<HomeStateDao> homeStateDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(homeApi, "homeApi");
        Intrinsics.checkNotNullParameter(homeStateDao, "homeStateDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.homeApi = homeApi;
        this.homeStateDao = homeStateDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public HomeDashboardStore get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        HomeApi homeApi = this.homeApi.get();
        Intrinsics.checkNotNullExpressionValue(homeApi, "get(...)");
        HomeStateDao homeStateDao = this.homeStateDao.get();
        Intrinsics.checkNotNullExpressionValue(homeStateDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(accountProvider, homeApi, homeStateDao, storeBundle);
    }

    /* compiled from: HomeDashboardStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/dashboard/store/HomeDashboardStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/dashboard/store/HomeDashboardStore_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "homeApi", "Lcom/robinhood/android/home/api/HomeApi;", "homeStateDao", "Lcom/robinhood/models/home/dao/HomeStateDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "lib-store-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HomeDashboardStore_Factory create(Provider<AccountProvider> accountProvider, Provider<HomeApi> homeApi, Provider<HomeStateDao> homeStateDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(homeApi, "homeApi");
            Intrinsics.checkNotNullParameter(homeStateDao, "homeStateDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new HomeDashboardStore_Factory(accountProvider, homeApi, homeStateDao, storeBundle);
        }

        @JvmStatic
        public final HomeDashboardStore newInstance(AccountProvider accountProvider, HomeApi homeApi, HomeStateDao homeStateDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(homeApi, "homeApi");
            Intrinsics.checkNotNullParameter(homeStateDao, "homeStateDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new HomeDashboardStore(accountProvider, homeApi, homeStateDao, storeBundle);
        }
    }
}
