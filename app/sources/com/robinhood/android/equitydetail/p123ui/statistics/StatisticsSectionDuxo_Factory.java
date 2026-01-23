package com.robinhood.android.equitydetail.p123ui.statistics;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.engagement.l2improvements.GoldL2ImprovementsStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.EtpDetailsStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.shared.equities.models.instrumentdetails.store.FundamentalStore;
import com.robinhood.shared.equities.store.subzero.ShortingInfoStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StatisticsSectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionDuxo;", "fundamentalStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "etpDetailsStore", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "shortingInfoStore", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "accountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "goldL2ImprovementsStore", "Lcom/robinhood/android/engagement/l2improvements/GoldL2ImprovementsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class StatisticsSectionDuxo_Factory implements Factory<StatisticsSectionDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<InstrumentAccountSwitcherStore> accountSwitcherStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EtpDetailsStore> etpDetailsStore;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<FundamentalStore> fundamentalStore;
    private final Provider<GoldL2ImprovementsStore> goldL2ImprovementsStore;
    private final Provider<MarginSubscriptionStore> marginSubscriptionStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<ShortingInfoStore> shortingInfoStore;
    private final Provider<StatisticsSectionStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final StatisticsSectionDuxo_Factory create(Provider<FundamentalStore> provider, Provider<EtpDetailsStore> provider2, Provider<QuoteStore> provider3, Provider<ExperimentsStore> provider4, Provider<RegionGateProvider> provider5, Provider<MarginSubscriptionStore> provider6, Provider<PositionStore> provider7, Provider<ShortingInfoStore> provider8, Provider<InstrumentAccountSwitcherStore> provider9, Provider<AccountProvider> provider10, Provider<AccountAccessStore> provider11, Provider<GoldL2ImprovementsStore> provider12, Provider<DuxoBundle> provider13, Provider<StatisticsSectionStateProvider> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final StatisticsSectionDuxo newInstance(FundamentalStore fundamentalStore, EtpDetailsStore etpDetailsStore, QuoteStore quoteStore, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, MarginSubscriptionStore marginSubscriptionStore, PositionStore positionStore, ShortingInfoStore shortingInfoStore, InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, AccountProvider accountProvider, AccountAccessStore accountAccessStore, GoldL2ImprovementsStore goldL2ImprovementsStore, DuxoBundle duxoBundle, StatisticsSectionStateProvider statisticsSectionStateProvider) {
        return INSTANCE.newInstance(fundamentalStore, etpDetailsStore, quoteStore, experimentsStore, regionGateProvider, marginSubscriptionStore, positionStore, shortingInfoStore, instrumentAccountSwitcherStore, accountProvider, accountAccessStore, goldL2ImprovementsStore, duxoBundle, statisticsSectionStateProvider);
    }

    public StatisticsSectionDuxo_Factory(Provider<FundamentalStore> fundamentalStore, Provider<EtpDetailsStore> etpDetailsStore, Provider<QuoteStore> quoteStore, Provider<ExperimentsStore> experimentsStore, Provider<RegionGateProvider> regionGateProvider, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<PositionStore> positionStore, Provider<ShortingInfoStore> shortingInfoStore, Provider<InstrumentAccountSwitcherStore> accountSwitcherStore, Provider<AccountProvider> accountProvider, Provider<AccountAccessStore> accountAccessStore, Provider<GoldL2ImprovementsStore> goldL2ImprovementsStore, Provider<DuxoBundle> duxoBundle, Provider<StatisticsSectionStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(fundamentalStore, "fundamentalStore");
        Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
        Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(goldL2ImprovementsStore, "goldL2ImprovementsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.fundamentalStore = fundamentalStore;
        this.etpDetailsStore = etpDetailsStore;
        this.quoteStore = quoteStore;
        this.experimentsStore = experimentsStore;
        this.regionGateProvider = regionGateProvider;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.positionStore = positionStore;
        this.shortingInfoStore = shortingInfoStore;
        this.accountSwitcherStore = accountSwitcherStore;
        this.accountProvider = accountProvider;
        this.accountAccessStore = accountAccessStore;
        this.goldL2ImprovementsStore = goldL2ImprovementsStore;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public StatisticsSectionDuxo get() {
        Companion companion = INSTANCE;
        FundamentalStore fundamentalStore = this.fundamentalStore.get();
        Intrinsics.checkNotNullExpressionValue(fundamentalStore, "get(...)");
        EtpDetailsStore etpDetailsStore = this.etpDetailsStore.get();
        Intrinsics.checkNotNullExpressionValue(etpDetailsStore, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionStore, "get(...)");
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        ShortingInfoStore shortingInfoStore = this.shortingInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(shortingInfoStore, "get(...)");
        InstrumentAccountSwitcherStore instrumentAccountSwitcherStore = this.accountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentAccountSwitcherStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        GoldL2ImprovementsStore goldL2ImprovementsStore = this.goldL2ImprovementsStore.get();
        Intrinsics.checkNotNullExpressionValue(goldL2ImprovementsStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        StatisticsSectionStateProvider statisticsSectionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(statisticsSectionStateProvider, "get(...)");
        return companion.newInstance(fundamentalStore, etpDetailsStore, quoteStore, experimentsStore, regionGateProvider, marginSubscriptionStore, positionStore, shortingInfoStore, instrumentAccountSwitcherStore, accountProvider, accountAccessStore, goldL2ImprovementsStore, duxoBundle, statisticsSectionStateProvider);
    }

    /* compiled from: StatisticsSectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H\u0007Jx\u0010#\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionDuxo_Factory;", "fundamentalStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "etpDetailsStore", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "shortingInfoStore", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "accountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "goldL2ImprovementsStore", "Lcom/robinhood/android/engagement/l2improvements/GoldL2ImprovementsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionStateProvider;", "newInstance", "Lcom/robinhood/android/equitydetail/ui/statistics/StatisticsSectionDuxo;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StatisticsSectionDuxo_Factory create(Provider<FundamentalStore> fundamentalStore, Provider<EtpDetailsStore> etpDetailsStore, Provider<QuoteStore> quoteStore, Provider<ExperimentsStore> experimentsStore, Provider<RegionGateProvider> regionGateProvider, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<PositionStore> positionStore, Provider<ShortingInfoStore> shortingInfoStore, Provider<InstrumentAccountSwitcherStore> accountSwitcherStore, Provider<AccountProvider> accountProvider, Provider<AccountAccessStore> accountAccessStore, Provider<GoldL2ImprovementsStore> goldL2ImprovementsStore, Provider<DuxoBundle> duxoBundle, Provider<StatisticsSectionStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(fundamentalStore, "fundamentalStore");
            Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
            Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(goldL2ImprovementsStore, "goldL2ImprovementsStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new StatisticsSectionDuxo_Factory(fundamentalStore, etpDetailsStore, quoteStore, experimentsStore, regionGateProvider, marginSubscriptionStore, positionStore, shortingInfoStore, accountSwitcherStore, accountProvider, accountAccessStore, goldL2ImprovementsStore, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final StatisticsSectionDuxo newInstance(FundamentalStore fundamentalStore, EtpDetailsStore etpDetailsStore, QuoteStore quoteStore, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, MarginSubscriptionStore marginSubscriptionStore, PositionStore positionStore, ShortingInfoStore shortingInfoStore, InstrumentAccountSwitcherStore accountSwitcherStore, AccountProvider accountProvider, AccountAccessStore accountAccessStore, GoldL2ImprovementsStore goldL2ImprovementsStore, DuxoBundle duxoBundle, StatisticsSectionStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(fundamentalStore, "fundamentalStore");
            Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
            Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(goldL2ImprovementsStore, "goldL2ImprovementsStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new StatisticsSectionDuxo(fundamentalStore, etpDetailsStore, quoteStore, experimentsStore, regionGateProvider, marginSubscriptionStore, positionStore, shortingInfoStore, accountSwitcherStore, accountProvider, accountAccessStore, goldL2ImprovementsStore, duxoBundle, stateProvider);
        }
    }
}
