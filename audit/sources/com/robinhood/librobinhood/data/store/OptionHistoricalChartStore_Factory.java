package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.charts.ChartsBonfireApi;
import com.robinhood.android.charts.models.dao.OptionHistoricalChartDao;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionHistoricalChartStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;", "aggregateOptionStrategyQuoteStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "chartDao", "Lcom/robinhood/android/charts/models/dao/OptionHistoricalChartDao;", "chartsBonfireApi", "Lcom/robinhood/android/api/charts/ChartsBonfireApi;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionHistoricalChartStore_Factory implements Factory<OptionHistoricalChartStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore;
    private final Provider<OptionHistoricalChartDao> chartDao;
    private final Provider<ChartsBonfireApi> chartsBonfireApi;
    private final Provider<OptionStrategyInfoStore> optionStrategyInfoStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionHistoricalChartStore_Factory create(Provider<AggregateOptionStrategyQuoteStore> provider, Provider<OptionHistoricalChartDao> provider2, Provider<ChartsBonfireApi> provider3, Provider<OptionStrategyInfoStore> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final OptionHistoricalChartStore newInstance(AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, OptionHistoricalChartDao optionHistoricalChartDao, ChartsBonfireApi chartsBonfireApi, OptionStrategyInfoStore optionStrategyInfoStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(aggregateOptionStrategyQuoteStore, optionHistoricalChartDao, chartsBonfireApi, optionStrategyInfoStore, storeBundle);
    }

    public OptionHistoricalChartStore_Factory(Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore, Provider<OptionHistoricalChartDao> chartDao, Provider<ChartsBonfireApi> chartsBonfireApi, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
        Intrinsics.checkNotNullParameter(chartDao, "chartDao");
        Intrinsics.checkNotNullParameter(chartsBonfireApi, "chartsBonfireApi");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.aggregateOptionStrategyQuoteStore = aggregateOptionStrategyQuoteStore;
        this.chartDao = chartDao;
        this.chartsBonfireApi = chartsBonfireApi;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public OptionHistoricalChartStore get() {
        Companion companion = INSTANCE;
        AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore = this.aggregateOptionStrategyQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionStrategyQuoteStore, "get(...)");
        OptionHistoricalChartDao optionHistoricalChartDao = this.chartDao.get();
        Intrinsics.checkNotNullExpressionValue(optionHistoricalChartDao, "get(...)");
        ChartsBonfireApi chartsBonfireApi = this.chartsBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(chartsBonfireApi, "get(...)");
        OptionStrategyInfoStore optionStrategyInfoStore = this.optionStrategyInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyInfoStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(aggregateOptionStrategyQuoteStore, optionHistoricalChartDao, chartsBonfireApi, optionStrategyInfoStore, storeBundle);
    }

    /* compiled from: OptionHistoricalChartStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore_Factory;", "aggregateOptionStrategyQuoteStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "chartDao", "Lcom/robinhood/android/charts/models/dao/OptionHistoricalChartDao;", "chartsBonfireApi", "Lcom/robinhood/android/api/charts/ChartsBonfireApi;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionHistoricalChartStore_Factory create(Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore, Provider<OptionHistoricalChartDao> chartDao, Provider<ChartsBonfireApi> chartsBonfireApi, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
            Intrinsics.checkNotNullParameter(chartDao, "chartDao");
            Intrinsics.checkNotNullParameter(chartsBonfireApi, "chartsBonfireApi");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionHistoricalChartStore_Factory(aggregateOptionStrategyQuoteStore, chartDao, chartsBonfireApi, optionStrategyInfoStore, storeBundle);
        }

        @JvmStatic
        public final OptionHistoricalChartStore newInstance(AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, OptionHistoricalChartDao chartDao, ChartsBonfireApi chartsBonfireApi, OptionStrategyInfoStore optionStrategyInfoStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
            Intrinsics.checkNotNullParameter(chartDao, "chartDao");
            Intrinsics.checkNotNullParameter(chartsBonfireApi, "chartsBonfireApi");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionHistoricalChartStore(aggregateOptionStrategyQuoteStore, chartDao, chartsBonfireApi, optionStrategyInfoStore, storeBundle);
        }
    }
}
