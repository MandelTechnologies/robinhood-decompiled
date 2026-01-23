package com.robinhood.android.trade.equity.activity;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.EquityOrderDefaultStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore;
import com.robinhood.shared.equities.store.subzero.SubzeroKillswitchStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderActivityDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityDuxo;", "instrumentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "equityOrderDefaultStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "subzeroKillswitchStore", "Lcom/robinhood/shared/equities/store/subzero/SubzeroKillswitchStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EquityOrderActivityDuxo_Factory implements Factory<EquityOrderActivityDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BuySellStore> buySellStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EquityOrderDefaultStore> equityOrderDefaultStore;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<NbboSummaryStore> nbboSummaryStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<SubzeroKillswitchStore> subzeroKillswitchStore;
    private final Provider<TaxLotsCachedService> taxLotsCachedService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EquityOrderActivityDuxo_Factory create(Provider<InstrumentStore> provider, Provider<PositionStore> provider2, Provider<AccountProvider> provider3, Provider<ExperimentsStore> provider4, Provider<RegionGateProvider> provider5, Provider<QuoteStore> provider6, Provider<TraderMarketHoursManager> provider7, Provider<NbboSummaryStore> provider8, Provider<EquityOrderDefaultStore> provider9, Provider<SavedStateHandle> provider10, Provider<TaxLotsCachedService> provider11, Provider<BuySellStore> provider12, Provider<SubzeroKillswitchStore> provider13, Provider<DuxoBundle> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final EquityOrderActivityDuxo newInstance(InstrumentStore instrumentStore, PositionStore positionStore, AccountProvider accountProvider, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, QuoteStore quoteStore, TraderMarketHoursManager traderMarketHoursManager, NbboSummaryStore nbboSummaryStore, EquityOrderDefaultStore equityOrderDefaultStore, SavedStateHandle savedStateHandle, TaxLotsCachedService taxLotsCachedService, BuySellStore buySellStore, SubzeroKillswitchStore subzeroKillswitchStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(instrumentStore, positionStore, accountProvider, experimentsStore, regionGateProvider, quoteStore, traderMarketHoursManager, nbboSummaryStore, equityOrderDefaultStore, savedStateHandle, taxLotsCachedService, buySellStore, subzeroKillswitchStore, duxoBundle);
    }

    public EquityOrderActivityDuxo_Factory(Provider<InstrumentStore> instrumentStore, Provider<PositionStore> positionStore, Provider<AccountProvider> accountProvider, Provider<ExperimentsStore> experimentsStore, Provider<RegionGateProvider> regionGateProvider, Provider<QuoteStore> quoteStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<NbboSummaryStore> nbboSummaryStore, Provider<EquityOrderDefaultStore> equityOrderDefaultStore, Provider<SavedStateHandle> savedStateHandle, Provider<TaxLotsCachedService> taxLotsCachedService, Provider<BuySellStore> buySellStore, Provider<SubzeroKillswitchStore> subzeroKillswitchStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
        Intrinsics.checkNotNullParameter(equityOrderDefaultStore, "equityOrderDefaultStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(subzeroKillswitchStore, "subzeroKillswitchStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.instrumentStore = instrumentStore;
        this.positionStore = positionStore;
        this.accountProvider = accountProvider;
        this.experimentsStore = experimentsStore;
        this.regionGateProvider = regionGateProvider;
        this.quoteStore = quoteStore;
        this.marketHoursManager = marketHoursManager;
        this.nbboSummaryStore = nbboSummaryStore;
        this.equityOrderDefaultStore = equityOrderDefaultStore;
        this.savedStateHandle = savedStateHandle;
        this.taxLotsCachedService = taxLotsCachedService;
        this.buySellStore = buySellStore;
        this.subzeroKillswitchStore = subzeroKillswitchStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public EquityOrderActivityDuxo get() {
        Companion companion = INSTANCE;
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        NbboSummaryStore nbboSummaryStore = this.nbboSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(nbboSummaryStore, "get(...)");
        EquityOrderDefaultStore equityOrderDefaultStore = this.equityOrderDefaultStore.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderDefaultStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        TaxLotsCachedService taxLotsCachedService = this.taxLotsCachedService.get();
        Intrinsics.checkNotNullExpressionValue(taxLotsCachedService, "get(...)");
        BuySellStore buySellStore = this.buySellStore.get();
        Intrinsics.checkNotNullExpressionValue(buySellStore, "get(...)");
        SubzeroKillswitchStore subzeroKillswitchStore = this.subzeroKillswitchStore.get();
        Intrinsics.checkNotNullExpressionValue(subzeroKillswitchStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(instrumentStore, positionStore, accountProvider, experimentsStore, regionGateProvider, quoteStore, traderMarketHoursManager, nbboSummaryStore, equityOrderDefaultStore, savedStateHandle, taxLotsCachedService, buySellStore, subzeroKillswitchStore, duxoBundle);
    }

    /* compiled from: EquityOrderActivityDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H\u0007Jx\u0010#\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityDuxo_Factory;", "instrumentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "equityOrderDefaultStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "subzeroKillswitchStore", "Lcom/robinhood/shared/equities/store/subzero/SubzeroKillswitchStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityDuxo;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityOrderActivityDuxo_Factory create(Provider<InstrumentStore> instrumentStore, Provider<PositionStore> positionStore, Provider<AccountProvider> accountProvider, Provider<ExperimentsStore> experimentsStore, Provider<RegionGateProvider> regionGateProvider, Provider<QuoteStore> quoteStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<NbboSummaryStore> nbboSummaryStore, Provider<EquityOrderDefaultStore> equityOrderDefaultStore, Provider<SavedStateHandle> savedStateHandle, Provider<TaxLotsCachedService> taxLotsCachedService, Provider<BuySellStore> buySellStore, Provider<SubzeroKillswitchStore> subzeroKillswitchStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
            Intrinsics.checkNotNullParameter(equityOrderDefaultStore, "equityOrderDefaultStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(subzeroKillswitchStore, "subzeroKillswitchStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new EquityOrderActivityDuxo_Factory(instrumentStore, positionStore, accountProvider, experimentsStore, regionGateProvider, quoteStore, marketHoursManager, nbboSummaryStore, equityOrderDefaultStore, savedStateHandle, taxLotsCachedService, buySellStore, subzeroKillswitchStore, duxoBundle);
        }

        @JvmStatic
        public final EquityOrderActivityDuxo newInstance(InstrumentStore instrumentStore, PositionStore positionStore, AccountProvider accountProvider, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, QuoteStore quoteStore, TraderMarketHoursManager marketHoursManager, NbboSummaryStore nbboSummaryStore, EquityOrderDefaultStore equityOrderDefaultStore, SavedStateHandle savedStateHandle, TaxLotsCachedService taxLotsCachedService, BuySellStore buySellStore, SubzeroKillswitchStore subzeroKillswitchStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
            Intrinsics.checkNotNullParameter(equityOrderDefaultStore, "equityOrderDefaultStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(subzeroKillswitchStore, "subzeroKillswitchStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new EquityOrderActivityDuxo(instrumentStore, positionStore, accountProvider, experimentsStore, regionGateProvider, quoteStore, marketHoursManager, nbboSummaryStore, equityOrderDefaultStore, savedStateHandle, taxLotsCachedService, buySellStore, subzeroKillswitchStore, duxoBundle);
        }
    }
}
