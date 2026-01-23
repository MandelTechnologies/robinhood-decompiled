package com.robinhood.android.equities.equitytrade;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.bonfire.daytrades.store.DayTradeWarningsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.inject.MicrogramComponent;
import p479j$.time.Clock;

/* compiled from: EquityTradeService_Factory.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0093\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/EquityTradeService_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/store/DayTradeWarningsStore;", "dayTradeWarningsStore", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "equityOrderCheckValidator", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "equityOrderManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "Ljavax/inject/Provider;", "Companion", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityTradeService_Factory implements Factory<EquityTradeService> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<DayTradeWarningsStore> dayTradeWarningsStore;
    private final Provider<EquityOrderCheckValidator> equityOrderCheckValidator;
    private final Provider<EquityOrderManager> equityOrderManager;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<OrderStore> orderStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final EquityTradeService_Factory create(Provider<DayTradeWarningsStore> provider, Provider<EquityOrderCheckValidator> provider2, Provider<EquityOrderManager> provider3, Provider<TraderMarketHoursManager> provider4, Provider<OrderStore> provider5, Provider<RegionGateProvider> provider6, Provider<ExperimentsStore> provider7, Provider<Clock> provider8, Provider<MicrogramComponent.Factory> provider9, Provider<StoreBundle> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final EquityTradeService newInstance(DayTradeWarningsStore dayTradeWarningsStore, EquityOrderCheckValidator equityOrderCheckValidator, EquityOrderManager equityOrderManager, TraderMarketHoursManager traderMarketHoursManager, OrderStore orderStore, RegionGateProvider regionGateProvider, ExperimentsStore experimentsStore, Clock clock, MicrogramComponent.Factory factory, StoreBundle storeBundle) {
        return INSTANCE.newInstance(dayTradeWarningsStore, equityOrderCheckValidator, equityOrderManager, traderMarketHoursManager, orderStore, regionGateProvider, experimentsStore, clock, factory, storeBundle);
    }

    public EquityTradeService_Factory(Provider<DayTradeWarningsStore> dayTradeWarningsStore, Provider<EquityOrderCheckValidator> equityOrderCheckValidator, Provider<EquityOrderManager> equityOrderManager, Provider<TraderMarketHoursManager> marketHoursManager, Provider<OrderStore> orderStore, Provider<RegionGateProvider> regionGateProvider, Provider<ExperimentsStore> experimentsStore, Provider<Clock> clock, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(dayTradeWarningsStore, "dayTradeWarningsStore");
        Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
        Intrinsics.checkNotNullParameter(equityOrderManager, "equityOrderManager");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dayTradeWarningsStore = dayTradeWarningsStore;
        this.equityOrderCheckValidator = equityOrderCheckValidator;
        this.equityOrderManager = equityOrderManager;
        this.marketHoursManager = marketHoursManager;
        this.orderStore = orderStore;
        this.regionGateProvider = regionGateProvider;
        this.experimentsStore = experimentsStore;
        this.clock = clock;
        this.microgramComponentFactory = microgramComponentFactory;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public EquityTradeService get() {
        Companion companion = INSTANCE;
        DayTradeWarningsStore dayTradeWarningsStore = this.dayTradeWarningsStore.get();
        Intrinsics.checkNotNullExpressionValue(dayTradeWarningsStore, "get(...)");
        EquityOrderCheckValidator equityOrderCheckValidator = this.equityOrderCheckValidator.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderCheckValidator, "get(...)");
        EquityOrderManager equityOrderManager = this.equityOrderManager.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderManager, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(dayTradeWarningsStore, equityOrderCheckValidator, equityOrderManager, traderMarketHoursManager, orderStore, regionGateProvider, experimentsStore, clock, factory, storeBundle);
    }

    /* compiled from: EquityTradeService_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009b\u0001\u0010\u001a\u001a\u00020\u00192\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ_\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/EquityTradeService_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/store/DayTradeWarningsStore;", "dayTradeWarningsStore", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "equityOrderCheckValidator", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "equityOrderManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/android/equities/equitytrade/EquityTradeService_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/equities/equitytrade/EquityTradeService_Factory;", "Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "newInstance", "(Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/store/DayTradeWarningsStore;Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;Lcom/robinhood/android/equity/submission/EquityOrderManager;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lj$/time/Clock;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityTradeService_Factory create(Provider<DayTradeWarningsStore> dayTradeWarningsStore, Provider<EquityOrderCheckValidator> equityOrderCheckValidator, Provider<EquityOrderManager> equityOrderManager, Provider<TraderMarketHoursManager> marketHoursManager, Provider<OrderStore> orderStore, Provider<RegionGateProvider> regionGateProvider, Provider<ExperimentsStore> experimentsStore, Provider<Clock> clock, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(dayTradeWarningsStore, "dayTradeWarningsStore");
            Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
            Intrinsics.checkNotNullParameter(equityOrderManager, "equityOrderManager");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EquityTradeService_Factory(dayTradeWarningsStore, equityOrderCheckValidator, equityOrderManager, marketHoursManager, orderStore, regionGateProvider, experimentsStore, clock, microgramComponentFactory, storeBundle);
        }

        @JvmStatic
        public final EquityTradeService newInstance(DayTradeWarningsStore dayTradeWarningsStore, EquityOrderCheckValidator equityOrderCheckValidator, EquityOrderManager equityOrderManager, TraderMarketHoursManager marketHoursManager, OrderStore orderStore, RegionGateProvider regionGateProvider, ExperimentsStore experimentsStore, Clock clock, MicrogramComponent.Factory microgramComponentFactory, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(dayTradeWarningsStore, "dayTradeWarningsStore");
            Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
            Intrinsics.checkNotNullParameter(equityOrderManager, "equityOrderManager");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EquityTradeService(dayTradeWarningsStore, equityOrderCheckValidator, equityOrderManager, marketHoursManager, orderStore, regionGateProvider, experimentsStore, clock, microgramComponentFactory, storeBundle);
        }
    }
}
