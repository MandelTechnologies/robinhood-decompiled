package com.robinhood.android.lib.margin;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.api.MarginInvestingApi;
import com.robinhood.android.lib.margin.p167db.dao.LeveredMarginSettingsDao;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LeveredMarginSettingsStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "marginInvestingApi", "Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;", "leveredMarginSettingsDao", "Lcom/robinhood/android/lib/margin/db/dao/LeveredMarginSettingsDao;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class LeveredMarginSettingsStore_Factory implements Factory<LeveredMarginSettingsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<LeveredMarginSettingsDao> leveredMarginSettingsDao;
    private final Provider<MarginInvestingApi> marginInvestingApi;
    private final Provider<MarginSubscriptionStore> marginSubscriptionStore;
    private final Provider<TraderPortfolioStore> portfolioStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final LeveredMarginSettingsStore_Factory create(Provider<AccountProvider> provider, Provider<MarginInvestingApi> provider2, Provider<LeveredMarginSettingsDao> provider3, Provider<TraderPortfolioStore> provider4, Provider<MarginSubscriptionStore> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final LeveredMarginSettingsStore newInstance(AccountProvider accountProvider, MarginInvestingApi marginInvestingApi, LeveredMarginSettingsDao leveredMarginSettingsDao, TraderPortfolioStore traderPortfolioStore, MarginSubscriptionStore marginSubscriptionStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(accountProvider, marginInvestingApi, leveredMarginSettingsDao, traderPortfolioStore, marginSubscriptionStore, storeBundle);
    }

    public LeveredMarginSettingsStore_Factory(Provider<AccountProvider> accountProvider, Provider<MarginInvestingApi> marginInvestingApi, Provider<LeveredMarginSettingsDao> leveredMarginSettingsDao, Provider<TraderPortfolioStore> portfolioStore, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(marginInvestingApi, "marginInvestingApi");
        Intrinsics.checkNotNullParameter(leveredMarginSettingsDao, "leveredMarginSettingsDao");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.marginInvestingApi = marginInvestingApi;
        this.leveredMarginSettingsDao = leveredMarginSettingsDao;
        this.portfolioStore = portfolioStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public LeveredMarginSettingsStore get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        MarginInvestingApi marginInvestingApi = this.marginInvestingApi.get();
        Intrinsics.checkNotNullExpressionValue(marginInvestingApi, "get(...)");
        LeveredMarginSettingsDao leveredMarginSettingsDao = this.leveredMarginSettingsDao.get();
        Intrinsics.checkNotNullExpressionValue(leveredMarginSettingsDao, "get(...)");
        TraderPortfolioStore traderPortfolioStore = this.portfolioStore.get();
        Intrinsics.checkNotNullExpressionValue(traderPortfolioStore, "get(...)");
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(accountProvider, marginInvestingApi, leveredMarginSettingsDao, traderPortfolioStore, marginSubscriptionStore, storeBundle);
    }

    /* compiled from: LeveredMarginSettingsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "marginInvestingApi", "Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;", "leveredMarginSettingsDao", "Lcom/robinhood/android/lib/margin/db/dao/LeveredMarginSettingsDao;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LeveredMarginSettingsStore_Factory create(Provider<AccountProvider> accountProvider, Provider<MarginInvestingApi> marginInvestingApi, Provider<LeveredMarginSettingsDao> leveredMarginSettingsDao, Provider<TraderPortfolioStore> portfolioStore, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(marginInvestingApi, "marginInvestingApi");
            Intrinsics.checkNotNullParameter(leveredMarginSettingsDao, "leveredMarginSettingsDao");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new LeveredMarginSettingsStore_Factory(accountProvider, marginInvestingApi, leveredMarginSettingsDao, portfolioStore, marginSubscriptionStore, storeBundle);
        }

        @JvmStatic
        public final LeveredMarginSettingsStore newInstance(AccountProvider accountProvider, MarginInvestingApi marginInvestingApi, LeveredMarginSettingsDao leveredMarginSettingsDao, TraderPortfolioStore portfolioStore, MarginSubscriptionStore marginSubscriptionStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(marginInvestingApi, "marginInvestingApi");
            Intrinsics.checkNotNullParameter(leveredMarginSettingsDao, "leveredMarginSettingsDao");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new LeveredMarginSettingsStore(accountProvider, marginInvestingApi, leveredMarginSettingsDao, portfolioStore, marginSubscriptionStore, storeBundle);
        }
    }
}
