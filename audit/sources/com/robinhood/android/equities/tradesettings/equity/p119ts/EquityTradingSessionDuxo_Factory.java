package com.robinhood.android.equities.tradesettings.equity.p119ts;

import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: EquityTradingSessionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0085\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/common/buysell/BuySellStore;", "buySellStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "tradeSettingsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionStateProvider;", "stateProvider", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDuxo;", "Ljavax/inject/Provider;", "Companion", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityTradingSessionDuxo_Factory implements Factory<EquityTradingSessionDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BuySellStore> buySellStore;
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<EquityTradingSessionStateProvider> stateProvider;
    private final Provider<TradeSettingsStore> tradeSettingsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EquityTradingSessionDuxo_Factory create(Provider<AccountProvider> provider, Provider<BuySellStore> provider2, Provider<ExperimentsStore> provider3, Provider<InstrumentStore> provider4, Provider<TraderMarketHoursManager> provider5, Provider<TradeSettingsStore> provider6, Provider<Clock> provider7, Provider<DuxoBundle> provider8, Provider<EquityTradingSessionStateProvider> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final EquityTradingSessionDuxo newInstance(AccountProvider accountProvider, BuySellStore buySellStore, ExperimentsStore experimentsStore, InstrumentStore instrumentStore, TraderMarketHoursManager traderMarketHoursManager, TradeSettingsStore tradeSettingsStore, Clock clock, DuxoBundle duxoBundle, EquityTradingSessionStateProvider equityTradingSessionStateProvider) {
        return INSTANCE.newInstance(accountProvider, buySellStore, experimentsStore, instrumentStore, traderMarketHoursManager, tradeSettingsStore, clock, duxoBundle, equityTradingSessionStateProvider);
    }

    public EquityTradingSessionDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<BuySellStore> buySellStore, Provider<ExperimentsStore> experimentsStore, Provider<InstrumentStore> instrumentStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<TradeSettingsStore> tradeSettingsStore, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle, Provider<EquityTradingSessionStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.accountProvider = accountProvider;
        this.buySellStore = buySellStore;
        this.experimentsStore = experimentsStore;
        this.instrumentStore = instrumentStore;
        this.marketHoursManager = marketHoursManager;
        this.tradeSettingsStore = tradeSettingsStore;
        this.clock = clock;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public EquityTradingSessionDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        BuySellStore buySellStore = this.buySellStore.get();
        Intrinsics.checkNotNullExpressionValue(buySellStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        TradeSettingsStore tradeSettingsStore = this.tradeSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(tradeSettingsStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        EquityTradingSessionStateProvider equityTradingSessionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(equityTradingSessionStateProvider, "get(...)");
        return companion.newInstance(accountProvider, buySellStore, experimentsStore, instrumentStore, traderMarketHoursManager, tradeSettingsStore, clock, duxoBundle, equityTradingSessionStateProvider);
    }

    /* compiled from: EquityTradingSessionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008d\u0001\u0010\u0018\u001a\u00020\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JW\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/common/buysell/BuySellStore;", "buySellStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "tradeSettingsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionStateProvider;", "stateProvider", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDuxo_Factory;", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDuxo;", "newInstance", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/common/buysell/BuySellStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionStateProvider;)Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDuxo;", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityTradingSessionDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<BuySellStore> buySellStore, Provider<ExperimentsStore> experimentsStore, Provider<InstrumentStore> instrumentStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<TradeSettingsStore> tradeSettingsStore, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle, Provider<EquityTradingSessionStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new EquityTradingSessionDuxo_Factory(accountProvider, buySellStore, experimentsStore, instrumentStore, marketHoursManager, tradeSettingsStore, clock, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final EquityTradingSessionDuxo newInstance(AccountProvider accountProvider, BuySellStore buySellStore, ExperimentsStore experimentsStore, InstrumentStore instrumentStore, TraderMarketHoursManager marketHoursManager, TradeSettingsStore tradeSettingsStore, Clock clock, DuxoBundle duxoBundle, EquityTradingSessionStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new EquityTradingSessionDuxo(accountProvider, buySellStore, experimentsStore, instrumentStore, marketHoursManager, tradeSettingsStore, clock, duxoBundle, stateProvider);
        }
    }
}
