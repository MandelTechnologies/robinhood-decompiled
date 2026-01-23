package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.optionsproduct.OptionsProduct;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import options_product.service.SimulatedReturns;
import p479j$.time.Clock;

/* compiled from: OptionSimulatedReturnsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019Bw\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "optionUnderlyingQuoteStore", "Lcom/robinhood/android/api/optionsproduct/OptionsProduct;", "optionsProductApi", "Loptions_product/service/SimulatedReturns;", "simulatedReturnsService", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionSimulatedReturnsStore_Factory implements Factory<OptionSimulatedReturnsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<MarketHoursStore> marketHoursStore;
    private final Provider<OptionMarketHoursStore> optionMarketHoursStore;
    private final Provider<OptionQuoteStore> optionQuoteStore;
    private final Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore;
    private final Provider<OptionsProduct> optionsProductApi;
    private final Provider<SimulatedReturns> simulatedReturnsService;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionSimulatedReturnsStore_Factory create(Provider<Clock> provider, Provider<MarketHoursStore> provider2, Provider<OptionMarketHoursStore> provider3, Provider<OptionQuoteStore> provider4, Provider<OptionUnderlyingQuoteStore> provider5, Provider<OptionsProduct> provider6, Provider<SimulatedReturns> provider7, Provider<StoreBundle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final OptionSimulatedReturnsStore newInstance(Clock clock, MarketHoursStore marketHoursStore, OptionMarketHoursStore optionMarketHoursStore, OptionQuoteStore optionQuoteStore, OptionUnderlyingQuoteStore optionUnderlyingQuoteStore, OptionsProduct optionsProduct, SimulatedReturns simulatedReturns, StoreBundle storeBundle) {
        return INSTANCE.newInstance(clock, marketHoursStore, optionMarketHoursStore, optionQuoteStore, optionUnderlyingQuoteStore, optionsProduct, simulatedReturns, storeBundle);
    }

    public OptionSimulatedReturnsStore_Factory(Provider<Clock> clock, Provider<MarketHoursStore> marketHoursStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore, Provider<OptionsProduct> optionsProductApi, Provider<SimulatedReturns> simulatedReturnsService, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
        Intrinsics.checkNotNullParameter(optionsProductApi, "optionsProductApi");
        Intrinsics.checkNotNullParameter(simulatedReturnsService, "simulatedReturnsService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.clock = clock;
        this.marketHoursStore = marketHoursStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionUnderlyingQuoteStore = optionUnderlyingQuoteStore;
        this.optionsProductApi = optionsProductApi;
        this.simulatedReturnsService = simulatedReturnsService;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public OptionSimulatedReturnsStore get() {
        Companion companion = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        MarketHoursStore marketHoursStore = this.marketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(marketHoursStore, "get(...)");
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketHoursStore, "get(...)");
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteStore, "get(...)");
        OptionUnderlyingQuoteStore optionUnderlyingQuoteStore = this.optionUnderlyingQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionUnderlyingQuoteStore, "get(...)");
        OptionsProduct optionsProduct = this.optionsProductApi.get();
        Intrinsics.checkNotNullExpressionValue(optionsProduct, "get(...)");
        SimulatedReturns simulatedReturns = this.simulatedReturnsService.get();
        Intrinsics.checkNotNullExpressionValue(simulatedReturns, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(clock, marketHoursStore, optionMarketHoursStore, optionQuoteStore, optionUnderlyingQuoteStore, optionsProduct, simulatedReturns, storeBundle);
    }

    /* compiled from: OptionSimulatedReturnsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u007f\u0010\u0016\u001a\u00020\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JO\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "optionUnderlyingQuoteStore", "Lcom/robinhood/android/api/optionsproduct/OptionsProduct;", "optionsProductApi", "Loptions_product/service/SimulatedReturns;", "simulatedReturnsService", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore_Factory;", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "newInstance", "(Lj$/time/Clock;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;Lcom/robinhood/android/api/optionsproduct/OptionsProduct;Loptions_product/service/SimulatedReturns;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionSimulatedReturnsStore_Factory create(Provider<Clock> clock, Provider<MarketHoursStore> marketHoursStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore, Provider<OptionsProduct> optionsProductApi, Provider<SimulatedReturns> simulatedReturnsService, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
            Intrinsics.checkNotNullParameter(optionsProductApi, "optionsProductApi");
            Intrinsics.checkNotNullParameter(simulatedReturnsService, "simulatedReturnsService");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionSimulatedReturnsStore_Factory(clock, marketHoursStore, optionMarketHoursStore, optionQuoteStore, optionUnderlyingQuoteStore, optionsProductApi, simulatedReturnsService, storeBundle);
        }

        @JvmStatic
        public final OptionSimulatedReturnsStore newInstance(Clock clock, MarketHoursStore marketHoursStore, OptionMarketHoursStore optionMarketHoursStore, OptionQuoteStore optionQuoteStore, OptionUnderlyingQuoteStore optionUnderlyingQuoteStore, OptionsProduct optionsProductApi, SimulatedReturns simulatedReturnsService, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
            Intrinsics.checkNotNullParameter(optionsProductApi, "optionsProductApi");
            Intrinsics.checkNotNullParameter(simulatedReturnsService, "simulatedReturnsService");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionSimulatedReturnsStore(clock, marketHoursStore, optionMarketHoursStore, optionQuoteStore, optionUnderlyingQuoteStore, optionsProductApi, simulatedReturnsService, storeBundle);
        }
    }
}
