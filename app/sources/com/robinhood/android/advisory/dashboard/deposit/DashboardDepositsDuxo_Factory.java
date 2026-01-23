package com.robinhood.android.advisory.dashboard.deposit;

import advisory.proto.p008v1.AdvisoryService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.store.advisory.AdvisoryDashboardDepositsStore;
import com.robinhood.store.advisory.AdvisoryDepositPromoStore;
import com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardDepositsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "dashboardDepositsStore", "Lcom/robinhood/store/advisory/AdvisoryDashboardDepositsStore;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "portfolioStore", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;", "depositPromoCardStore", "Lcom/robinhood/store/advisory/AdvisoryDepositPromoStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DashboardDepositsDuxo_Factory implements Factory<DashboardDepositsDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AdvisoryService> advisoryService;
    private final Provider<AutomaticDepositStore> automaticDepositStore;
    private final Provider<AdvisoryDashboardDepositsStore> dashboardDepositsStore;
    private final Provider<AdvisoryDepositPromoStore> depositPromoCardStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<PaymentTransferStore> paymentTransferStore;
    private final Provider<AdvisoryPortfolioBreakdownStore> portfolioStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final DashboardDepositsDuxo_Factory create(Provider<AccountProvider> provider, Provider<AdvisoryService> provider2, Provider<AdvisoryDashboardDepositsStore> provider3, Provider<AutomaticDepositStore> provider4, Provider<ExperimentsStore> provider5, Provider<PaymentTransferStore> provider6, Provider<AdvisoryPortfolioBreakdownStore> provider7, Provider<AdvisoryDepositPromoStore> provider8, Provider<DuxoBundle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final DashboardDepositsDuxo newInstance(AccountProvider accountProvider, AdvisoryService advisoryService, AdvisoryDashboardDepositsStore advisoryDashboardDepositsStore, AutomaticDepositStore automaticDepositStore, ExperimentsStore experimentsStore, PaymentTransferStore paymentTransferStore, AdvisoryPortfolioBreakdownStore advisoryPortfolioBreakdownStore, AdvisoryDepositPromoStore advisoryDepositPromoStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, advisoryService, advisoryDashboardDepositsStore, automaticDepositStore, experimentsStore, paymentTransferStore, advisoryPortfolioBreakdownStore, advisoryDepositPromoStore, duxoBundle);
    }

    public DashboardDepositsDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AdvisoryService> advisoryService, Provider<AdvisoryDashboardDepositsStore> dashboardDepositsStore, Provider<AutomaticDepositStore> automaticDepositStore, Provider<ExperimentsStore> experimentsStore, Provider<PaymentTransferStore> paymentTransferStore, Provider<AdvisoryPortfolioBreakdownStore> portfolioStore, Provider<AdvisoryDepositPromoStore> depositPromoCardStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(dashboardDepositsStore, "dashboardDepositsStore");
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(depositPromoCardStore, "depositPromoCardStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.advisoryService = advisoryService;
        this.dashboardDepositsStore = dashboardDepositsStore;
        this.automaticDepositStore = automaticDepositStore;
        this.experimentsStore = experimentsStore;
        this.paymentTransferStore = paymentTransferStore;
        this.portfolioStore = portfolioStore;
        this.depositPromoCardStore = depositPromoCardStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public DashboardDepositsDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AdvisoryService advisoryService = this.advisoryService.get();
        Intrinsics.checkNotNullExpressionValue(advisoryService, "get(...)");
        AdvisoryDashboardDepositsStore advisoryDashboardDepositsStore = this.dashboardDepositsStore.get();
        Intrinsics.checkNotNullExpressionValue(advisoryDashboardDepositsStore, "get(...)");
        AutomaticDepositStore automaticDepositStore = this.automaticDepositStore.get();
        Intrinsics.checkNotNullExpressionValue(automaticDepositStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        PaymentTransferStore paymentTransferStore = this.paymentTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentTransferStore, "get(...)");
        AdvisoryPortfolioBreakdownStore advisoryPortfolioBreakdownStore = this.portfolioStore.get();
        Intrinsics.checkNotNullExpressionValue(advisoryPortfolioBreakdownStore, "get(...)");
        AdvisoryDepositPromoStore advisoryDepositPromoStore = this.depositPromoCardStore.get();
        Intrinsics.checkNotNullExpressionValue(advisoryDepositPromoStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountProvider, advisoryService, advisoryDashboardDepositsStore, automaticDepositStore, experimentsStore, paymentTransferStore, advisoryPortfolioBreakdownStore, advisoryDepositPromoStore, duxoBundle);
    }

    /* compiled from: DashboardDepositsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "dashboardDepositsStore", "Lcom/robinhood/store/advisory/AdvisoryDashboardDepositsStore;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "portfolioStore", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;", "depositPromoCardStore", "Lcom/robinhood/store/advisory/AdvisoryDepositPromoStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDuxo;", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DashboardDepositsDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AdvisoryService> advisoryService, Provider<AdvisoryDashboardDepositsStore> dashboardDepositsStore, Provider<AutomaticDepositStore> automaticDepositStore, Provider<ExperimentsStore> experimentsStore, Provider<PaymentTransferStore> paymentTransferStore, Provider<AdvisoryPortfolioBreakdownStore> portfolioStore, Provider<AdvisoryDepositPromoStore> depositPromoCardStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
            Intrinsics.checkNotNullParameter(dashboardDepositsStore, "dashboardDepositsStore");
            Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(depositPromoCardStore, "depositPromoCardStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DashboardDepositsDuxo_Factory(accountProvider, advisoryService, dashboardDepositsStore, automaticDepositStore, experimentsStore, paymentTransferStore, portfolioStore, depositPromoCardStore, duxoBundle);
        }

        @JvmStatic
        public final DashboardDepositsDuxo newInstance(AccountProvider accountProvider, AdvisoryService advisoryService, AdvisoryDashboardDepositsStore dashboardDepositsStore, AutomaticDepositStore automaticDepositStore, ExperimentsStore experimentsStore, PaymentTransferStore paymentTransferStore, AdvisoryPortfolioBreakdownStore portfolioStore, AdvisoryDepositPromoStore depositPromoCardStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
            Intrinsics.checkNotNullParameter(dashboardDepositsStore, "dashboardDepositsStore");
            Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(depositPromoCardStore, "depositPromoCardStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DashboardDepositsDuxo(accountProvider, advisoryService, dashboardDepositsStore, automaticDepositStore, experimentsStore, paymentTransferStore, portfolioStore, depositPromoCardStore, duxoBundle);
        }
    }
}
