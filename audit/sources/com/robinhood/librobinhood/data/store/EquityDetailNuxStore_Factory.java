package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.StockDetailStore;
import com.robinhood.prefs.LongSetPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityDetailNuxStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EquityDetailNuxStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/EquityDetailNuxStore;", "stockDetailStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "fractionalEquityDetailNuxPref", "Lcom/robinhood/prefs/LongSetPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EquityDetailNuxStore_Factory implements Factory<EquityDetailNuxStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<LongSetPreference> fractionalEquityDetailNuxPref;
    private final Provider<OrderStore> orderStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<StockDetailStore> stockDetailStore;

    @JvmStatic
    public static final EquityDetailNuxStore_Factory create(Provider<StockDetailStore> provider, Provider<OrderStore> provider2, Provider<QuoteStore> provider3, Provider<LongSetPreference> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final EquityDetailNuxStore newInstance(StockDetailStore stockDetailStore, OrderStore orderStore, QuoteStore quoteStore, LongSetPreference longSetPreference) {
        return INSTANCE.newInstance(stockDetailStore, orderStore, quoteStore, longSetPreference);
    }

    public EquityDetailNuxStore_Factory(Provider<StockDetailStore> stockDetailStore, Provider<OrderStore> orderStore, Provider<QuoteStore> quoteStore, Provider<LongSetPreference> fractionalEquityDetailNuxPref) {
        Intrinsics.checkNotNullParameter(stockDetailStore, "stockDetailStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(fractionalEquityDetailNuxPref, "fractionalEquityDetailNuxPref");
        this.stockDetailStore = stockDetailStore;
        this.orderStore = orderStore;
        this.quoteStore = quoteStore;
        this.fractionalEquityDetailNuxPref = fractionalEquityDetailNuxPref;
    }

    @Override // javax.inject.Provider
    public EquityDetailNuxStore get() {
        Companion companion = INSTANCE;
        StockDetailStore stockDetailStore = this.stockDetailStore.get();
        Intrinsics.checkNotNullExpressionValue(stockDetailStore, "get(...)");
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        LongSetPreference longSetPreference = this.fractionalEquityDetailNuxPref.get();
        Intrinsics.checkNotNullExpressionValue(longSetPreference, "get(...)");
        return companion.newInstance(stockDetailStore, orderStore, quoteStore, longSetPreference);
    }

    /* compiled from: EquityDetailNuxStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EquityDetailNuxStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/EquityDetailNuxStore_Factory;", "stockDetailStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "fractionalEquityDetailNuxPref", "Lcom/robinhood/prefs/LongSetPreference;", "newInstance", "Lcom/robinhood/librobinhood/data/store/EquityDetailNuxStore;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityDetailNuxStore_Factory create(Provider<StockDetailStore> stockDetailStore, Provider<OrderStore> orderStore, Provider<QuoteStore> quoteStore, Provider<LongSetPreference> fractionalEquityDetailNuxPref) {
            Intrinsics.checkNotNullParameter(stockDetailStore, "stockDetailStore");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(fractionalEquityDetailNuxPref, "fractionalEquityDetailNuxPref");
            return new EquityDetailNuxStore_Factory(stockDetailStore, orderStore, quoteStore, fractionalEquityDetailNuxPref);
        }

        @JvmStatic
        public final EquityDetailNuxStore newInstance(StockDetailStore stockDetailStore, OrderStore orderStore, QuoteStore quoteStore, LongSetPreference fractionalEquityDetailNuxPref) {
            Intrinsics.checkNotNullParameter(stockDetailStore, "stockDetailStore");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(fractionalEquityDetailNuxPref, "fractionalEquityDetailNuxPref");
            return new EquityDetailNuxStore(stockDetailStore, orderStore, quoteStore, fractionalEquityDetailNuxPref);
        }
    }
}
