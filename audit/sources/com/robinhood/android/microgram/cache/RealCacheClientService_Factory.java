package com.robinhood.android.microgram.cache;

import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealCacheClientService_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/microgram/cache/RealCacheClientService_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/microgram/cache/RealCacheClientService;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-microgram-cache_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class RealCacheClientService_Factory implements Factory<RealCacheClientService> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<CardManager> cardManager;
    private final Provider<MarginSubscriptionStore> marginSubscriptionStore;
    private final Provider<TraderPortfolioStore> portfolioStore;
    private final Provider<BaseSortingHatStore> sortingHatStore;
    private final Provider<SweepEnrollmentStore> sweepEnrollmentStore;
    private final Provider<SweepsInterestStore> sweepsInterestStore;

    @JvmStatic
    public static final RealCacheClientService_Factory create(Provider<AccountProvider> provider, Provider<CardManager> provider2, Provider<MarginSubscriptionStore> provider3, Provider<TraderPortfolioStore> provider4, Provider<BaseSortingHatStore> provider5, Provider<SweepEnrollmentStore> provider6, Provider<SweepsInterestStore> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final RealCacheClientService newInstance(AccountProvider accountProvider, CardManager cardManager, MarginSubscriptionStore marginSubscriptionStore, TraderPortfolioStore traderPortfolioStore, BaseSortingHatStore baseSortingHatStore, SweepEnrollmentStore sweepEnrollmentStore, SweepsInterestStore sweepsInterestStore) {
        return INSTANCE.newInstance(accountProvider, cardManager, marginSubscriptionStore, traderPortfolioStore, baseSortingHatStore, sweepEnrollmentStore, sweepsInterestStore);
    }

    public RealCacheClientService_Factory(Provider<AccountProvider> accountProvider, Provider<CardManager> cardManager, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<TraderPortfolioStore> portfolioStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<SweepEnrollmentStore> sweepEnrollmentStore, Provider<SweepsInterestStore> sweepsInterestStore) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        this.accountProvider = accountProvider;
        this.cardManager = cardManager;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.portfolioStore = portfolioStore;
        this.sortingHatStore = sortingHatStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.sweepsInterestStore = sweepsInterestStore;
    }

    @Override // javax.inject.Provider
    public RealCacheClientService get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        CardManager cardManager = this.cardManager.get();
        Intrinsics.checkNotNullExpressionValue(cardManager, "get(...)");
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionStore, "get(...)");
        TraderPortfolioStore traderPortfolioStore = this.portfolioStore.get();
        Intrinsics.checkNotNullExpressionValue(traderPortfolioStore, "get(...)");
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore.get();
        Intrinsics.checkNotNullExpressionValue(baseSortingHatStore, "get(...)");
        SweepEnrollmentStore sweepEnrollmentStore = this.sweepEnrollmentStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepEnrollmentStore, "get(...)");
        SweepsInterestStore sweepsInterestStore = this.sweepsInterestStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsInterestStore, "get(...)");
        return companion.newInstance(accountProvider, cardManager, marginSubscriptionStore, traderPortfolioStore, baseSortingHatStore, sweepEnrollmentStore, sweepsInterestStore);
    }

    /* compiled from: RealCacheClientService_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/microgram/cache/RealCacheClientService_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/microgram/cache/RealCacheClientService_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "newInstance", "Lcom/robinhood/android/microgram/cache/RealCacheClientService;", "lib-microgram-cache_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealCacheClientService_Factory create(Provider<AccountProvider> accountProvider, Provider<CardManager> cardManager, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<TraderPortfolioStore> portfolioStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<SweepEnrollmentStore> sweepEnrollmentStore, Provider<SweepsInterestStore> sweepsInterestStore) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
            Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
            return new RealCacheClientService_Factory(accountProvider, cardManager, marginSubscriptionStore, portfolioStore, sortingHatStore, sweepEnrollmentStore, sweepsInterestStore);
        }

        @JvmStatic
        public final RealCacheClientService newInstance(AccountProvider accountProvider, CardManager cardManager, MarginSubscriptionStore marginSubscriptionStore, TraderPortfolioStore portfolioStore, BaseSortingHatStore sortingHatStore, SweepEnrollmentStore sweepEnrollmentStore, SweepsInterestStore sweepsInterestStore) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
            Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
            return new RealCacheClientService(accountProvider, cardManager, marginSubscriptionStore, portfolioStore, sortingHatStore, sweepEnrollmentStore, sweepsInterestStore);
        }
    }
}
