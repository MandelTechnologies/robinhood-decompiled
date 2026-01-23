package com.robinhood.android.futures.charts;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.arsenal.FuturesProductStore;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesChartsClientServiceImp_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/futures/charts/FuturesChartsClientServiceImp_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/futures/charts/FuturesChartsClientServiceImp;", "contractStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "marketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "productStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "quoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-futures-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesChartsClientServiceImp_Factory implements Factory<FuturesChartsClientServiceImp> {
    private final Provider<FuturesContractStore> contractStore;
    private final Provider<EventMarketdataStore> eventMarketdataStore;
    private final Provider<EventStore> eventStore;
    private final Provider<FuturesMarketDataStore> marketDataStore;
    private final Provider<FuturesProductStore> productStore;
    private final Provider<FuturesQuoteStore> quoteStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FuturesChartsClientServiceImp_Factory create(Provider<FuturesContractStore> provider, Provider<EventStore> provider2, Provider<EventMarketdataStore> provider3, Provider<FuturesMarketDataStore> provider4, Provider<FuturesProductStore> provider5, Provider<FuturesQuoteStore> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final FuturesChartsClientServiceImp newInstance(FuturesContractStore futuresContractStore, EventStore eventStore, EventMarketdataStore eventMarketdataStore, FuturesMarketDataStore futuresMarketDataStore, FuturesProductStore futuresProductStore, FuturesQuoteStore futuresQuoteStore) {
        return INSTANCE.newInstance(futuresContractStore, eventStore, eventMarketdataStore, futuresMarketDataStore, futuresProductStore, futuresQuoteStore);
    }

    public FuturesChartsClientServiceImp_Factory(Provider<FuturesContractStore> contractStore, Provider<EventStore> eventStore, Provider<EventMarketdataStore> eventMarketdataStore, Provider<FuturesMarketDataStore> marketDataStore, Provider<FuturesProductStore> productStore, Provider<FuturesQuoteStore> quoteStore) {
        Intrinsics.checkNotNullParameter(contractStore, "contractStore");
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(marketDataStore, "marketDataStore");
        Intrinsics.checkNotNullParameter(productStore, "productStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        this.contractStore = contractStore;
        this.eventStore = eventStore;
        this.eventMarketdataStore = eventMarketdataStore;
        this.marketDataStore = marketDataStore;
        this.productStore = productStore;
        this.quoteStore = quoteStore;
    }

    @Override // javax.inject.Provider
    public FuturesChartsClientServiceImp get() {
        Companion companion = INSTANCE;
        FuturesContractStore futuresContractStore = this.contractStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresContractStore, "get(...)");
        EventStore eventStore = this.eventStore.get();
        Intrinsics.checkNotNullExpressionValue(eventStore, "get(...)");
        EventMarketdataStore eventMarketdataStore = this.eventMarketdataStore.get();
        Intrinsics.checkNotNullExpressionValue(eventMarketdataStore, "get(...)");
        FuturesMarketDataStore futuresMarketDataStore = this.marketDataStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresMarketDataStore, "get(...)");
        FuturesProductStore futuresProductStore = this.productStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresProductStore, "get(...)");
        FuturesQuoteStore futuresQuoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresQuoteStore, "get(...)");
        return companion.newInstance(futuresContractStore, eventStore, eventMarketdataStore, futuresMarketDataStore, futuresProductStore, futuresQuoteStore);
    }

    /* compiled from: FuturesChartsClientServiceImp_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/charts/FuturesChartsClientServiceImp_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/charts/FuturesChartsClientServiceImp_Factory;", "contractStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "marketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "productStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "quoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "newInstance", "Lcom/robinhood/android/futures/charts/FuturesChartsClientServiceImp;", "lib-futures-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesChartsClientServiceImp_Factory create(Provider<FuturesContractStore> contractStore, Provider<EventStore> eventStore, Provider<EventMarketdataStore> eventMarketdataStore, Provider<FuturesMarketDataStore> marketDataStore, Provider<FuturesProductStore> productStore, Provider<FuturesQuoteStore> quoteStore) {
            Intrinsics.checkNotNullParameter(contractStore, "contractStore");
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
            Intrinsics.checkNotNullParameter(marketDataStore, "marketDataStore");
            Intrinsics.checkNotNullParameter(productStore, "productStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            return new FuturesChartsClientServiceImp_Factory(contractStore, eventStore, eventMarketdataStore, marketDataStore, productStore, quoteStore);
        }

        @JvmStatic
        public final FuturesChartsClientServiceImp newInstance(FuturesContractStore contractStore, EventStore eventStore, EventMarketdataStore eventMarketdataStore, FuturesMarketDataStore marketDataStore, FuturesProductStore productStore, FuturesQuoteStore quoteStore) {
            Intrinsics.checkNotNullParameter(contractStore, "contractStore");
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
            Intrinsics.checkNotNullParameter(marketDataStore, "marketDataStore");
            Intrinsics.checkNotNullParameter(productStore, "productStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            return new FuturesChartsClientServiceImp(contractStore, eventStore, eventMarketdataStore, marketDataStore, productStore, quoteStore);
        }
    }
}
