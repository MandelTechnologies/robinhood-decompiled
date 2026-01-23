package com.robinhood.android.data.store.portfolio;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.PortfolioDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import rosetta.portfolio.p541v1.Portfolio;

/* compiled from: TraderPortfolioStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "Ljavax/inject/Provider;", "Lrosetta/portfolio/v1/Portfolio;", "portfolioService", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/PortfolioDao;", "dao", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TraderPortfolioStore_Factory implements Factory<TraderPortfolioStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<Clock> clock;
    private final Provider<PortfolioDao> dao;
    private final Provider<Portfolio> portfolioService;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final TraderPortfolioStore_Factory create(Provider<Portfolio> provider, Provider<StoreBundle> provider2, Provider<PortfolioDao> provider3, Provider<AccountProvider> provider4, Provider<Clock> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final TraderPortfolioStore newInstance(Portfolio portfolio, StoreBundle storeBundle, PortfolioDao portfolioDao, AccountProvider accountProvider, Clock clock) {
        return INSTANCE.newInstance(portfolio, storeBundle, portfolioDao, accountProvider, clock);
    }

    public TraderPortfolioStore_Factory(Provider<Portfolio> portfolioService, Provider<StoreBundle> storeBundle, Provider<PortfolioDao> dao, Provider<AccountProvider> accountProvider, Provider<Clock> clock) {
        Intrinsics.checkNotNullParameter(portfolioService, "portfolioService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.portfolioService = portfolioService;
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.accountProvider = accountProvider;
        this.clock = clock;
    }

    @Override // javax.inject.Provider
    public TraderPortfolioStore get() {
        Companion companion = INSTANCE;
        Portfolio portfolio = this.portfolioService.get();
        Intrinsics.checkNotNullExpressionValue(portfolio, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        PortfolioDao portfolioDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(portfolioDao, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        return companion.newInstance(portfolio, storeBundle, portfolioDao, accountProvider, clock);
    }

    /* compiled from: TraderPortfolioStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lrosetta/portfolio/v1/Portfolio;", "portfolioService", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/PortfolioDao;", "dao", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore_Factory;", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "newInstance", "(Lrosetta/portfolio/v1/Portfolio;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/PortfolioDao;Lcom/robinhood/android/lib/account/AccountProvider;Lj$/time/Clock;)Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TraderPortfolioStore_Factory create(Provider<Portfolio> portfolioService, Provider<StoreBundle> storeBundle, Provider<PortfolioDao> dao, Provider<AccountProvider> accountProvider, Provider<Clock> clock) {
            Intrinsics.checkNotNullParameter(portfolioService, "portfolioService");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new TraderPortfolioStore_Factory(portfolioService, storeBundle, dao, accountProvider, clock);
        }

        @JvmStatic
        public final TraderPortfolioStore newInstance(Portfolio portfolioService, StoreBundle storeBundle, PortfolioDao dao, AccountProvider accountProvider, Clock clock) {
            Intrinsics.checkNotNullParameter(portfolioService, "portfolioService");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new TraderPortfolioStore(portfolioService, storeBundle, dao, accountProvider, clock);
        }
    }
}
