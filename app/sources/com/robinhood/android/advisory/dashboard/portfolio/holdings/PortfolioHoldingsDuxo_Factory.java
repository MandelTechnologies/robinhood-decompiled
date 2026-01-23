package com.robinhood.android.advisory.dashboard.portfolio.holdings;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioHoldingsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsStateProvider;", "portfolioBreakdownStore", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PortfolioHoldingsDuxo_Factory implements Factory<PortfolioHoldingsDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<AdvisoryPortfolioBreakdownStore> portfolioBreakdownStore;
    private final Provider<PortfolioHoldingsStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PortfolioHoldingsDuxo_Factory create(Provider<DuxoBundle> provider, Provider<PortfolioHoldingsStateProvider> provider2, Provider<AdvisoryPortfolioBreakdownStore> provider3, Provider<AccountProvider> provider4, Provider<ExperimentsStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final PortfolioHoldingsDuxo newInstance(DuxoBundle duxoBundle, PortfolioHoldingsStateProvider portfolioHoldingsStateProvider, AdvisoryPortfolioBreakdownStore advisoryPortfolioBreakdownStore, AccountProvider accountProvider, ExperimentsStore experimentsStore) {
        return INSTANCE.newInstance(duxoBundle, portfolioHoldingsStateProvider, advisoryPortfolioBreakdownStore, accountProvider, experimentsStore);
    }

    public PortfolioHoldingsDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<PortfolioHoldingsStateProvider> stateProvider, Provider<AdvisoryPortfolioBreakdownStore> portfolioBreakdownStore, Provider<AccountProvider> accountProvider, Provider<ExperimentsStore> experimentsStore) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(portfolioBreakdownStore, "portfolioBreakdownStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.portfolioBreakdownStore = portfolioBreakdownStore;
        this.accountProvider = accountProvider;
        this.experimentsStore = experimentsStore;
    }

    @Override // javax.inject.Provider
    public PortfolioHoldingsDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        PortfolioHoldingsStateProvider portfolioHoldingsStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(portfolioHoldingsStateProvider, "get(...)");
        AdvisoryPortfolioBreakdownStore advisoryPortfolioBreakdownStore = this.portfolioBreakdownStore.get();
        Intrinsics.checkNotNullExpressionValue(advisoryPortfolioBreakdownStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        return companion.newInstance(duxoBundle, portfolioHoldingsStateProvider, advisoryPortfolioBreakdownStore, accountProvider, experimentsStore);
    }

    /* compiled from: PortfolioHoldingsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsStateProvider;", "portfolioBreakdownStore", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "newInstance", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsDuxo;", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PortfolioHoldingsDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<PortfolioHoldingsStateProvider> stateProvider, Provider<AdvisoryPortfolioBreakdownStore> portfolioBreakdownStore, Provider<AccountProvider> accountProvider, Provider<ExperimentsStore> experimentsStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(portfolioBreakdownStore, "portfolioBreakdownStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new PortfolioHoldingsDuxo_Factory(duxoBundle, stateProvider, portfolioBreakdownStore, accountProvider, experimentsStore);
        }

        @JvmStatic
        public final PortfolioHoldingsDuxo newInstance(DuxoBundle duxoBundle, PortfolioHoldingsStateProvider stateProvider, AdvisoryPortfolioBreakdownStore portfolioBreakdownStore, AccountProvider accountProvider, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(portfolioBreakdownStore, "portfolioBreakdownStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new PortfolioHoldingsDuxo(duxoBundle, stateProvider, portfolioBreakdownStore, accountProvider, experimentsStore);
        }
    }
}
