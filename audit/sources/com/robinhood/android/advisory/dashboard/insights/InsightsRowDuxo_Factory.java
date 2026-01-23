package com.robinhood.android.advisory.dashboard.insights;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.store.advisory.AdvisoryInsightsStore;
import com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InsightsRowDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "insightsRowStateProvider", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowStateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "insightsStore", "Lcom/robinhood/store/advisory/AdvisoryInsightsStore;", "portfolioStore", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;", "digestStore", "Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "insightsImpressionsPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class InsightsRowDuxo_Factory implements Factory<InsightsRowDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<PortfolioDigestStore> digestStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<StringToLongMapPreference> insightsImpressionsPref;
    private final Provider<InsightsRowStateProvider> insightsRowStateProvider;
    private final Provider<AdvisoryInsightsStore> insightsStore;
    private final Provider<AdvisoryPortfolioBreakdownStore> portfolioStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InsightsRowDuxo_Factory create(Provider<DuxoBundle> provider, Provider<InsightsRowStateProvider> provider2, Provider<AccountProvider> provider3, Provider<AdvisoryInsightsStore> provider4, Provider<AdvisoryPortfolioBreakdownStore> provider5, Provider<PortfolioDigestStore> provider6, Provider<ExperimentsStore> provider7, Provider<StringToLongMapPreference> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final InsightsRowDuxo newInstance(DuxoBundle duxoBundle, InsightsRowStateProvider insightsRowStateProvider, AccountProvider accountProvider, AdvisoryInsightsStore advisoryInsightsStore, AdvisoryPortfolioBreakdownStore advisoryPortfolioBreakdownStore, PortfolioDigestStore portfolioDigestStore, ExperimentsStore experimentsStore, StringToLongMapPreference stringToLongMapPreference) {
        return INSTANCE.newInstance(duxoBundle, insightsRowStateProvider, accountProvider, advisoryInsightsStore, advisoryPortfolioBreakdownStore, portfolioDigestStore, experimentsStore, stringToLongMapPreference);
    }

    public InsightsRowDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<InsightsRowStateProvider> insightsRowStateProvider, Provider<AccountProvider> accountProvider, Provider<AdvisoryInsightsStore> insightsStore, Provider<AdvisoryPortfolioBreakdownStore> portfolioStore, Provider<PortfolioDigestStore> digestStore, Provider<ExperimentsStore> experimentsStore, Provider<StringToLongMapPreference> insightsImpressionsPref) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(insightsRowStateProvider, "insightsRowStateProvider");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(insightsStore, "insightsStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(digestStore, "digestStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(insightsImpressionsPref, "insightsImpressionsPref");
        this.duxoBundle = duxoBundle;
        this.insightsRowStateProvider = insightsRowStateProvider;
        this.accountProvider = accountProvider;
        this.insightsStore = insightsStore;
        this.portfolioStore = portfolioStore;
        this.digestStore = digestStore;
        this.experimentsStore = experimentsStore;
        this.insightsImpressionsPref = insightsImpressionsPref;
    }

    @Override // javax.inject.Provider
    public InsightsRowDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        InsightsRowStateProvider insightsRowStateProvider = this.insightsRowStateProvider.get();
        Intrinsics.checkNotNullExpressionValue(insightsRowStateProvider, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AdvisoryInsightsStore advisoryInsightsStore = this.insightsStore.get();
        Intrinsics.checkNotNullExpressionValue(advisoryInsightsStore, "get(...)");
        AdvisoryPortfolioBreakdownStore advisoryPortfolioBreakdownStore = this.portfolioStore.get();
        Intrinsics.checkNotNullExpressionValue(advisoryPortfolioBreakdownStore, "get(...)");
        PortfolioDigestStore portfolioDigestStore = this.digestStore.get();
        Intrinsics.checkNotNullExpressionValue(portfolioDigestStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        StringToLongMapPreference stringToLongMapPreference = this.insightsImpressionsPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        return companion.newInstance(duxoBundle, insightsRowStateProvider, accountProvider, advisoryInsightsStore, advisoryPortfolioBreakdownStore, portfolioDigestStore, experimentsStore, stringToLongMapPreference);
    }

    /* compiled from: InsightsRowDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "insightsRowStateProvider", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowStateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "insightsStore", "Lcom/robinhood/store/advisory/AdvisoryInsightsStore;", "portfolioStore", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;", "digestStore", "Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "insightsImpressionsPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "newInstance", "Lcom/robinhood/android/advisory/dashboard/insights/InsightsRowDuxo;", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InsightsRowDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<InsightsRowStateProvider> insightsRowStateProvider, Provider<AccountProvider> accountProvider, Provider<AdvisoryInsightsStore> insightsStore, Provider<AdvisoryPortfolioBreakdownStore> portfolioStore, Provider<PortfolioDigestStore> digestStore, Provider<ExperimentsStore> experimentsStore, Provider<StringToLongMapPreference> insightsImpressionsPref) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(insightsRowStateProvider, "insightsRowStateProvider");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(insightsStore, "insightsStore");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(digestStore, "digestStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(insightsImpressionsPref, "insightsImpressionsPref");
            return new InsightsRowDuxo_Factory(duxoBundle, insightsRowStateProvider, accountProvider, insightsStore, portfolioStore, digestStore, experimentsStore, insightsImpressionsPref);
        }

        @JvmStatic
        public final InsightsRowDuxo newInstance(DuxoBundle duxoBundle, InsightsRowStateProvider insightsRowStateProvider, AccountProvider accountProvider, AdvisoryInsightsStore insightsStore, AdvisoryPortfolioBreakdownStore portfolioStore, PortfolioDigestStore digestStore, ExperimentsStore experimentsStore, StringToLongMapPreference insightsImpressionsPref) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(insightsRowStateProvider, "insightsRowStateProvider");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(insightsStore, "insightsStore");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(digestStore, "digestStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(insightsImpressionsPref, "insightsImpressionsPref");
            return new InsightsRowDuxo(duxoBundle, insightsRowStateProvider, accountProvider, insightsStore, portfolioStore, digestStore, experimentsStore, insightsImpressionsPref);
        }
    }
}
