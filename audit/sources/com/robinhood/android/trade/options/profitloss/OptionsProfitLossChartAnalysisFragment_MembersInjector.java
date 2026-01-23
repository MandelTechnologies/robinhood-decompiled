package com.robinhood.android.trade.options.profitloss;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.options.order.OptionOrderContextFactory;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.librobinhood.data.store.QuoteStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossChartAnalysisFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartAnalysisFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartAnalysisFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "optionOrderContextFactory", "Lcom/robinhood/android/common/options/order/OptionOrderContextFactory;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionsProfitLossChartAnalysisFragment_MembersInjector implements MembersInjector<OptionsProfitLossChartAnalysisFragment> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<IndexStore> indexStore;
    private final Provider<OptionOrderContextFactory> optionOrderContextFactory;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OptionsProfitLossChartAnalysisFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AccountProvider> provider2, Provider<AnalyticsLogger> provider3, Provider<OptionOrderContextFactory> provider4, Provider<QuoteStore> provider5, Provider<IndexStore> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectAccountProvider(OptionsProfitLossChartAnalysisFragment optionsProfitLossChartAnalysisFragment, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(optionsProfitLossChartAnalysisFragment, accountProvider);
    }

    @JvmStatic
    public static final void injectAnalytics(OptionsProfitLossChartAnalysisFragment optionsProfitLossChartAnalysisFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(optionsProfitLossChartAnalysisFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectIndexStore(OptionsProfitLossChartAnalysisFragment optionsProfitLossChartAnalysisFragment, IndexStore indexStore) {
        INSTANCE.injectIndexStore(optionsProfitLossChartAnalysisFragment, indexStore);
    }

    @JvmStatic
    public static final void injectOptionOrderContextFactory(OptionsProfitLossChartAnalysisFragment optionsProfitLossChartAnalysisFragment, OptionOrderContextFactory optionOrderContextFactory) {
        INSTANCE.injectOptionOrderContextFactory(optionsProfitLossChartAnalysisFragment, optionOrderContextFactory);
    }

    @JvmStatic
    public static final void injectQuoteStore(OptionsProfitLossChartAnalysisFragment optionsProfitLossChartAnalysisFragment, QuoteStore quoteStore) {
        INSTANCE.injectQuoteStore(optionsProfitLossChartAnalysisFragment, quoteStore);
    }

    public OptionsProfitLossChartAnalysisFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AccountProvider> accountProvider, Provider<AnalyticsLogger> analytics, Provider<OptionOrderContextFactory> optionOrderContextFactory, Provider<QuoteStore> quoteStore, Provider<IndexStore> indexStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(optionOrderContextFactory, "optionOrderContextFactory");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        this.singletons = singletons;
        this.accountProvider = accountProvider;
        this.analytics = analytics;
        this.optionOrderContextFactory = optionOrderContextFactory;
        this.quoteStore = quoteStore;
        this.indexStore = indexStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionsProfitLossChartAnalysisFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion2.injectAccountProvider(instance, accountProvider);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        OptionOrderContextFactory optionOrderContextFactory = this.optionOrderContextFactory.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderContextFactory, "get(...)");
        companion2.injectOptionOrderContextFactory(instance, optionOrderContextFactory);
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        companion2.injectQuoteStore(instance, quoteStore);
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        companion2.injectIndexStore(instance, indexStore);
    }

    /* compiled from: OptionsProfitLossChartAnalysisFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartAnalysisFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartAnalysisFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "optionOrderContextFactory", "Lcom/robinhood/android/common/options/order/OptionOrderContextFactory;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "injectAccountProvider", "", "instance", "injectAnalytics", "injectOptionOrderContextFactory", "injectQuoteStore", "injectIndexStore", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OptionsProfitLossChartAnalysisFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AccountProvider> accountProvider, Provider<AnalyticsLogger> analytics, Provider<OptionOrderContextFactory> optionOrderContextFactory, Provider<QuoteStore> quoteStore, Provider<IndexStore> indexStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(optionOrderContextFactory, "optionOrderContextFactory");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            return new OptionsProfitLossChartAnalysisFragment_MembersInjector(singletons, accountProvider, analytics, optionOrderContextFactory, quoteStore, indexStore);
        }

        @JvmStatic
        public final void injectAccountProvider(OptionsProfitLossChartAnalysisFragment instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectAnalytics(OptionsProfitLossChartAnalysisFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectOptionOrderContextFactory(OptionsProfitLossChartAnalysisFragment instance, OptionOrderContextFactory optionOrderContextFactory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionOrderContextFactory, "optionOrderContextFactory");
            instance.setOptionOrderContextFactory(optionOrderContextFactory);
        }

        @JvmStatic
        public final void injectQuoteStore(OptionsProfitLossChartAnalysisFragment instance, QuoteStore quoteStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            instance.setQuoteStore(quoteStore);
        }

        @JvmStatic
        public final void injectIndexStore(OptionsProfitLossChartAnalysisFragment instance, IndexStore indexStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            instance.setIndexStore(indexStore);
        }
    }
}
