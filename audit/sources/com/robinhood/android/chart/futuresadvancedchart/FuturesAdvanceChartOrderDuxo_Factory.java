package com.robinhood.android.chart.futuresadvancedchart;

import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountStore;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.RhdCostBasisStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAdvanceChartOrderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDuxo;", "accountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "rhdCostBasisStore", "Lcom/robinhood/store/futures/RhdCostBasisStore;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "futuresAdvanceChartOrderStateProvider", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-futures-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class FuturesAdvanceChartOrderDuxo_Factory implements Factory<FuturesAdvanceChartOrderDuxo> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountStore> accountStore;
    private final Provider<BwWebViewManager> bwWebViewManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<FuturesAdvanceChartOrderStateProvider> futuresAdvanceChartOrderStateProvider;
    private final Provider<FuturesContractStore> futuresContractStore;
    private final Provider<RhdCostBasisStore> rhdCostBasisStore;

    @JvmStatic
    public static final FuturesAdvanceChartOrderDuxo_Factory create(Provider<AccountStore> provider, Provider<FuturesAccountStore> provider2, Provider<FuturesContractStore> provider3, Provider<RhdCostBasisStore> provider4, Provider<BwWebViewManager> provider5, Provider<DuxoBundle> provider6, Provider<FuturesAdvanceChartOrderStateProvider> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final FuturesAdvanceChartOrderDuxo newInstance(AccountStore accountStore, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, RhdCostBasisStore rhdCostBasisStore, BwWebViewManager bwWebViewManager, DuxoBundle duxoBundle, FuturesAdvanceChartOrderStateProvider futuresAdvanceChartOrderStateProvider) {
        return INSTANCE.newInstance(accountStore, futuresAccountStore, futuresContractStore, rhdCostBasisStore, bwWebViewManager, duxoBundle, futuresAdvanceChartOrderStateProvider);
    }

    public FuturesAdvanceChartOrderDuxo_Factory(Provider<AccountStore> accountStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<FuturesContractStore> futuresContractStore, Provider<RhdCostBasisStore> rhdCostBasisStore, Provider<BwWebViewManager> bwWebViewManager, Provider<DuxoBundle> duxoBundle, Provider<FuturesAdvanceChartOrderStateProvider> futuresAdvanceChartOrderStateProvider) {
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
        Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(futuresAdvanceChartOrderStateProvider, "futuresAdvanceChartOrderStateProvider");
        this.accountStore = accountStore;
        this.futuresAccountStore = futuresAccountStore;
        this.futuresContractStore = futuresContractStore;
        this.rhdCostBasisStore = rhdCostBasisStore;
        this.bwWebViewManager = bwWebViewManager;
        this.duxoBundle = duxoBundle;
        this.futuresAdvanceChartOrderStateProvider = futuresAdvanceChartOrderStateProvider;
    }

    @Override // javax.inject.Provider
    public FuturesAdvanceChartOrderDuxo get() {
        Companion companion = INSTANCE;
        AccountStore accountStore = this.accountStore.get();
        Intrinsics.checkNotNullExpressionValue(accountStore, "get(...)");
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        FuturesContractStore futuresContractStore = this.futuresContractStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresContractStore, "get(...)");
        RhdCostBasisStore rhdCostBasisStore = this.rhdCostBasisStore.get();
        Intrinsics.checkNotNullExpressionValue(rhdCostBasisStore, "get(...)");
        BwWebViewManager bwWebViewManager = this.bwWebViewManager.get();
        Intrinsics.checkNotNullExpressionValue(bwWebViewManager, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        FuturesAdvanceChartOrderStateProvider futuresAdvanceChartOrderStateProvider = this.futuresAdvanceChartOrderStateProvider.get();
        Intrinsics.checkNotNullExpressionValue(futuresAdvanceChartOrderStateProvider, "get(...)");
        return companion.newInstance(accountStore, futuresAccountStore, futuresContractStore, rhdCostBasisStore, bwWebViewManager, duxoBundle, futuresAdvanceChartOrderStateProvider);
    }

    /* compiled from: FuturesAdvanceChartOrderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDuxo_Factory;", "accountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "rhdCostBasisStore", "Lcom/robinhood/store/futures/RhdCostBasisStore;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "futuresAdvanceChartOrderStateProvider", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderStateProvider;", "newInstance", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDuxo;", "lib-futures-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesAdvanceChartOrderDuxo_Factory create(Provider<AccountStore> accountStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<FuturesContractStore> futuresContractStore, Provider<RhdCostBasisStore> rhdCostBasisStore, Provider<BwWebViewManager> bwWebViewManager, Provider<DuxoBundle> duxoBundle, Provider<FuturesAdvanceChartOrderStateProvider> futuresAdvanceChartOrderStateProvider) {
            Intrinsics.checkNotNullParameter(accountStore, "accountStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
            Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(futuresAdvanceChartOrderStateProvider, "futuresAdvanceChartOrderStateProvider");
            return new FuturesAdvanceChartOrderDuxo_Factory(accountStore, futuresAccountStore, futuresContractStore, rhdCostBasisStore, bwWebViewManager, duxoBundle, futuresAdvanceChartOrderStateProvider);
        }

        @JvmStatic
        public final FuturesAdvanceChartOrderDuxo newInstance(AccountStore accountStore, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, RhdCostBasisStore rhdCostBasisStore, BwWebViewManager bwWebViewManager, DuxoBundle duxoBundle, FuturesAdvanceChartOrderStateProvider futuresAdvanceChartOrderStateProvider) {
            Intrinsics.checkNotNullParameter(accountStore, "accountStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
            Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(futuresAdvanceChartOrderStateProvider, "futuresAdvanceChartOrderStateProvider");
            return new FuturesAdvanceChartOrderDuxo(accountStore, futuresAccountStore, futuresContractStore, rhdCostBasisStore, bwWebViewManager, duxoBundle, futuresAdvanceChartOrderStateProvider);
        }
    }
}
