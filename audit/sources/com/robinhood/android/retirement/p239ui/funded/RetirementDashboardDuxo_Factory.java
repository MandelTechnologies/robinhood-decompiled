package com.robinhood.android.retirement.p239ui.funded;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.InboxBadgeStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementInvestmentAndTradeStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementDashboardDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB¯\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "matchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "retirementAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "retirementInvestmentAndTradeStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementInvestmentAndTradeStore;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "retirementNuxStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "portfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RetirementDashboardDuxo_Factory implements Factory<RetirementDashboardDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AggregateOptionPositionStore> aggregateOptionPositionStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<InboxBadgeStore> inboxBadgeStore;
    private final Provider<RetirementMatchStore> matchStore;
    private final Provider<PerformanceChartStore> performanceChartStore;
    private final Provider<BooleanPreference> portfolioPrivacyPref;
    private final Provider<RetirementAccountSwitcherStore> retirementAccountSwitcherStore;
    private final Provider<RetirementInvestmentAndTradeStore> retirementInvestmentAndTradeStore;
    private final Provider<RetirementNuxStore> retirementNuxStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RetirementDashboardDuxo_Factory create(Provider<AccountProvider> provider, Provider<AggregateOptionPositionStore> provider2, Provider<RetirementMatchStore> provider3, Provider<RetirementAccountSwitcherStore> provider4, Provider<RetirementInvestmentAndTradeStore> provider5, Provider<PerformanceChartStore> provider6, Provider<RetirementNuxStore> provider7, Provider<InboxBadgeStore> provider8, Provider<EventLogger> provider9, Provider<AccountAccessStore> provider10, Provider<BooleanPreference> provider11, Provider<DuxoBundle> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    public static final RetirementDashboardDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, RetirementMatchStore retirementMatchStore, RetirementAccountSwitcherStore retirementAccountSwitcherStore, RetirementInvestmentAndTradeStore retirementInvestmentAndTradeStore, PerformanceChartStore performanceChartStore, RetirementNuxStore retirementNuxStore, InboxBadgeStore inboxBadgeStore, EventLogger eventLogger, AccountAccessStore accountAccessStore, BooleanPreference booleanPreference, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, aggregateOptionPositionStore, retirementMatchStore, retirementAccountSwitcherStore, retirementInvestmentAndTradeStore, performanceChartStore, retirementNuxStore, inboxBadgeStore, eventLogger, accountAccessStore, booleanPreference, duxoBundle);
    }

    public RetirementDashboardDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<RetirementMatchStore> matchStore, Provider<RetirementAccountSwitcherStore> retirementAccountSwitcherStore, Provider<RetirementInvestmentAndTradeStore> retirementInvestmentAndTradeStore, Provider<PerformanceChartStore> performanceChartStore, Provider<RetirementNuxStore> retirementNuxStore, Provider<InboxBadgeStore> inboxBadgeStore, Provider<EventLogger> eventLogger, Provider<AccountAccessStore> accountAccessStore, Provider<BooleanPreference> portfolioPrivacyPref, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(matchStore, "matchStore");
        Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(retirementInvestmentAndTradeStore, "retirementInvestmentAndTradeStore");
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(retirementNuxStore, "retirementNuxStore");
        Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.matchStore = matchStore;
        this.retirementAccountSwitcherStore = retirementAccountSwitcherStore;
        this.retirementInvestmentAndTradeStore = retirementInvestmentAndTradeStore;
        this.performanceChartStore = performanceChartStore;
        this.retirementNuxStore = retirementNuxStore;
        this.inboxBadgeStore = inboxBadgeStore;
        this.eventLogger = eventLogger;
        this.accountAccessStore = accountAccessStore;
        this.portfolioPrivacyPref = portfolioPrivacyPref;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public RetirementDashboardDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionStore, "get(...)");
        RetirementMatchStore retirementMatchStore = this.matchStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementMatchStore, "get(...)");
        RetirementAccountSwitcherStore retirementAccountSwitcherStore = this.retirementAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementAccountSwitcherStore, "get(...)");
        RetirementInvestmentAndTradeStore retirementInvestmentAndTradeStore = this.retirementInvestmentAndTradeStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementInvestmentAndTradeStore, "get(...)");
        PerformanceChartStore performanceChartStore = this.performanceChartStore.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartStore, "get(...)");
        RetirementNuxStore retirementNuxStore = this.retirementNuxStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementNuxStore, "get(...)");
        InboxBadgeStore inboxBadgeStore = this.inboxBadgeStore.get();
        Intrinsics.checkNotNullExpressionValue(inboxBadgeStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        BooleanPreference booleanPreference = this.portfolioPrivacyPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountProvider, aggregateOptionPositionStore, retirementMatchStore, retirementAccountSwitcherStore, retirementInvestmentAndTradeStore, performanceChartStore, retirementNuxStore, inboxBadgeStore, eventLogger, accountAccessStore, booleanPreference, duxoBundle);
    }

    /* compiled from: RetirementDashboardDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J°\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007H\u0007Jh\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "matchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "retirementAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "retirementInvestmentAndTradeStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementInvestmentAndTradeStore;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "retirementNuxStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "portfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDuxo;", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RetirementDashboardDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<RetirementMatchStore> matchStore, Provider<RetirementAccountSwitcherStore> retirementAccountSwitcherStore, Provider<RetirementInvestmentAndTradeStore> retirementInvestmentAndTradeStore, Provider<PerformanceChartStore> performanceChartStore, Provider<RetirementNuxStore> retirementNuxStore, Provider<InboxBadgeStore> inboxBadgeStore, Provider<EventLogger> eventLogger, Provider<AccountAccessStore> accountAccessStore, Provider<BooleanPreference> portfolioPrivacyPref, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(matchStore, "matchStore");
            Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(retirementInvestmentAndTradeStore, "retirementInvestmentAndTradeStore");
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(retirementNuxStore, "retirementNuxStore");
            Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new RetirementDashboardDuxo_Factory(accountProvider, aggregateOptionPositionStore, matchStore, retirementAccountSwitcherStore, retirementInvestmentAndTradeStore, performanceChartStore, retirementNuxStore, inboxBadgeStore, eventLogger, accountAccessStore, portfolioPrivacyPref, duxoBundle);
        }

        @JvmStatic
        public final RetirementDashboardDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, RetirementMatchStore matchStore, RetirementAccountSwitcherStore retirementAccountSwitcherStore, RetirementInvestmentAndTradeStore retirementInvestmentAndTradeStore, PerformanceChartStore performanceChartStore, RetirementNuxStore retirementNuxStore, InboxBadgeStore inboxBadgeStore, EventLogger eventLogger, AccountAccessStore accountAccessStore, BooleanPreference portfolioPrivacyPref, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(matchStore, "matchStore");
            Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(retirementInvestmentAndTradeStore, "retirementInvestmentAndTradeStore");
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(retirementNuxStore, "retirementNuxStore");
            Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new RetirementDashboardDuxo(accountProvider, aggregateOptionPositionStore, matchStore, retirementAccountSwitcherStore, retirementInvestmentAndTradeStore, performanceChartStore, retirementNuxStore, inboxBadgeStore, eventLogger, accountAccessStore, portfolioPrivacyPref, duxoBundle);
        }
    }
}
