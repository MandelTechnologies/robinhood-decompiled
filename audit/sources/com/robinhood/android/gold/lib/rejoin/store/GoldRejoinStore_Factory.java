package com.robinhood.android.gold.lib.rejoin.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.gold.lib.rejoin.api.GoldRejoinApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldRejoinStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/rejoin/store/GoldRejoinStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/gold/lib/rejoin/store/GoldRejoinStore;", "goldRejoinApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gold/lib/rejoin/api/GoldRejoinApi;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-gold-rejoin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GoldRejoinStore_Factory implements Factory<GoldRejoinStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<GoldRejoinApi> goldRejoinApi;
    private final Provider<MarginSubscriptionStore> marginSubscriptionStore;
    private final Provider<TraderPortfolioStore> portfolioStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final GoldRejoinStore_Factory create(Provider<GoldRejoinApi> provider, Provider<AccountProvider> provider2, Provider<TraderPortfolioStore> provider3, Provider<MarginSubscriptionStore> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final GoldRejoinStore newInstance(GoldRejoinApi goldRejoinApi, AccountProvider accountProvider, TraderPortfolioStore traderPortfolioStore, MarginSubscriptionStore marginSubscriptionStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(goldRejoinApi, accountProvider, traderPortfolioStore, marginSubscriptionStore, storeBundle);
    }

    public GoldRejoinStore_Factory(Provider<GoldRejoinApi> goldRejoinApi, Provider<AccountProvider> accountProvider, Provider<TraderPortfolioStore> portfolioStore, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(goldRejoinApi, "goldRejoinApi");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.goldRejoinApi = goldRejoinApi;
        this.accountProvider = accountProvider;
        this.portfolioStore = portfolioStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public GoldRejoinStore get() {
        Companion companion = INSTANCE;
        GoldRejoinApi goldRejoinApi = this.goldRejoinApi.get();
        Intrinsics.checkNotNullExpressionValue(goldRejoinApi, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        TraderPortfolioStore traderPortfolioStore = this.portfolioStore.get();
        Intrinsics.checkNotNullExpressionValue(traderPortfolioStore, "get(...)");
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(goldRejoinApi, accountProvider, traderPortfolioStore, marginSubscriptionStore, storeBundle);
    }

    /* compiled from: GoldRejoinStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/rejoin/store/GoldRejoinStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/gold/lib/rejoin/store/GoldRejoinStore_Factory;", "goldRejoinApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gold/lib/rejoin/api/GoldRejoinApi;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/gold/lib/rejoin/store/GoldRejoinStore;", "lib-gold-rejoin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GoldRejoinStore_Factory create(Provider<GoldRejoinApi> goldRejoinApi, Provider<AccountProvider> accountProvider, Provider<TraderPortfolioStore> portfolioStore, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(goldRejoinApi, "goldRejoinApi");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new GoldRejoinStore_Factory(goldRejoinApi, accountProvider, portfolioStore, marginSubscriptionStore, storeBundle);
        }

        @JvmStatic
        public final GoldRejoinStore newInstance(GoldRejoinApi goldRejoinApi, AccountProvider accountProvider, TraderPortfolioStore portfolioStore, MarginSubscriptionStore marginSubscriptionStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(goldRejoinApi, "goldRejoinApi");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new GoldRejoinStore(goldRejoinApi, accountProvider, portfolioStore, marginSubscriptionStore, storeBundle);
        }
    }
}
