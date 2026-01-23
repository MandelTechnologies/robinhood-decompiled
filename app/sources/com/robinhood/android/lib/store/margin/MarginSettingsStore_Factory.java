package com.robinhood.android.lib.store.margin;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.api.BrokebackMarginApi;
import com.robinhood.models.dao.MarginSettingsDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginSettingsStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/store/margin/MarginSettingsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/MarginSettingsDao;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "brokebackMarginApi", "Lcom/robinhood/models/api/BrokebackMarginApi;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MarginSettingsStore_Factory implements Factory<MarginSettingsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<Brokeback> brokeback;
    private final Provider<BrokebackMarginApi> brokebackMarginApi;
    private final Provider<MarginSettingsDao> dao;
    private final Provider<TraderPortfolioStore> portfolioStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final MarginSettingsStore_Factory create(Provider<StoreBundle> provider, Provider<MarginSettingsDao> provider2, Provider<Brokeback> provider3, Provider<BrokebackMarginApi> provider4, Provider<AccountProvider> provider5, Provider<TraderPortfolioStore> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final MarginSettingsStore newInstance(StoreBundle storeBundle, MarginSettingsDao marginSettingsDao, Brokeback brokeback, BrokebackMarginApi brokebackMarginApi, AccountProvider accountProvider, TraderPortfolioStore traderPortfolioStore) {
        return INSTANCE.newInstance(storeBundle, marginSettingsDao, brokeback, brokebackMarginApi, accountProvider, traderPortfolioStore);
    }

    public MarginSettingsStore_Factory(Provider<StoreBundle> storeBundle, Provider<MarginSettingsDao> dao, Provider<Brokeback> brokeback, Provider<BrokebackMarginApi> brokebackMarginApi, Provider<AccountProvider> accountProvider, Provider<TraderPortfolioStore> portfolioStore) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(brokebackMarginApi, "brokebackMarginApi");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.brokeback = brokeback;
        this.brokebackMarginApi = brokebackMarginApi;
        this.accountProvider = accountProvider;
        this.portfolioStore = portfolioStore;
    }

    @Override // javax.inject.Provider
    public MarginSettingsStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        MarginSettingsDao marginSettingsDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(marginSettingsDao, "get(...)");
        Brokeback brokeback = this.brokeback.get();
        Intrinsics.checkNotNullExpressionValue(brokeback, "get(...)");
        BrokebackMarginApi brokebackMarginApi = this.brokebackMarginApi.get();
        Intrinsics.checkNotNullExpressionValue(brokebackMarginApi, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        TraderPortfolioStore traderPortfolioStore = this.portfolioStore.get();
        Intrinsics.checkNotNullExpressionValue(traderPortfolioStore, "get(...)");
        return companion.newInstance(storeBundle, marginSettingsDao, brokeback, brokebackMarginApi, accountProvider, traderPortfolioStore);
    }

    /* compiled from: MarginSettingsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/store/margin/MarginSettingsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/store/margin/MarginSettingsStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/MarginSettingsDao;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "brokebackMarginApi", "Lcom/robinhood/models/api/BrokebackMarginApi;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "newInstance", "Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;", "lib-store-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MarginSettingsStore_Factory create(Provider<StoreBundle> storeBundle, Provider<MarginSettingsDao> dao, Provider<Brokeback> brokeback, Provider<BrokebackMarginApi> brokebackMarginApi, Provider<AccountProvider> accountProvider, Provider<TraderPortfolioStore> portfolioStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(brokebackMarginApi, "brokebackMarginApi");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            return new MarginSettingsStore_Factory(storeBundle, dao, brokeback, brokebackMarginApi, accountProvider, portfolioStore);
        }

        @JvmStatic
        public final MarginSettingsStore newInstance(StoreBundle storeBundle, MarginSettingsDao dao, Brokeback brokeback, BrokebackMarginApi brokebackMarginApi, AccountProvider accountProvider, TraderPortfolioStore portfolioStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(brokebackMarginApi, "brokebackMarginApi");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            return new MarginSettingsStore(storeBundle, dao, brokeback, brokebackMarginApi, accountProvider, portfolioStore);
        }
    }
}
