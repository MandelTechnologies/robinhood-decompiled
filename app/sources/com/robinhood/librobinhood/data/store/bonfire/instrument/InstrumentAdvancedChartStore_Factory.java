package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.android.charts.models.dao.AdvancedChartDao;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentAdvancedChartStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartStore;", "instrumentsApi", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "chartDao", "Lcom/robinhood/android/charts/models/dao/AdvancedChartDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class InstrumentAdvancedChartStore_Factory implements Factory<InstrumentAdvancedChartStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdvancedChartDao> chartDao;
    private final Provider<InstrumentsApi> instrumentsApi;
    private final Provider<LazyMoshi> moshi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final InstrumentAdvancedChartStore_Factory create(Provider<InstrumentsApi> provider, Provider<AdvancedChartDao> provider2, Provider<StoreBundle> provider3, Provider<LazyMoshi> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final InstrumentAdvancedChartStore newInstance(InstrumentsApi instrumentsApi, AdvancedChartDao advancedChartDao, StoreBundle storeBundle, LazyMoshi lazyMoshi) {
        return INSTANCE.newInstance(instrumentsApi, advancedChartDao, storeBundle, lazyMoshi);
    }

    public InstrumentAdvancedChartStore_Factory(Provider<InstrumentsApi> instrumentsApi, Provider<AdvancedChartDao> chartDao, Provider<StoreBundle> storeBundle, Provider<LazyMoshi> moshi) {
        Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
        Intrinsics.checkNotNullParameter(chartDao, "chartDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.instrumentsApi = instrumentsApi;
        this.chartDao = chartDao;
        this.storeBundle = storeBundle;
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public InstrumentAdvancedChartStore get() {
        Companion companion = INSTANCE;
        InstrumentsApi instrumentsApi = this.instrumentsApi.get();
        Intrinsics.checkNotNullExpressionValue(instrumentsApi, "get(...)");
        AdvancedChartDao advancedChartDao = this.chartDao.get();
        Intrinsics.checkNotNullExpressionValue(advancedChartDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        return companion.newInstance(instrumentsApi, advancedChartDao, storeBundle, lazyMoshi);
    }

    /* compiled from: InstrumentAdvancedChartStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartStore_Factory;", "instrumentsApi", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "chartDao", "Lcom/robinhood/android/charts/models/dao/AdvancedChartDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartStore;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InstrumentAdvancedChartStore_Factory create(Provider<InstrumentsApi> instrumentsApi, Provider<AdvancedChartDao> chartDao, Provider<StoreBundle> storeBundle, Provider<LazyMoshi> moshi) {
            Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
            Intrinsics.checkNotNullParameter(chartDao, "chartDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new InstrumentAdvancedChartStore_Factory(instrumentsApi, chartDao, storeBundle, moshi);
        }

        @JvmStatic
        public final InstrumentAdvancedChartStore newInstance(InstrumentsApi instrumentsApi, AdvancedChartDao chartDao, StoreBundle storeBundle, LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
            Intrinsics.checkNotNullParameter(chartDao, "chartDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new InstrumentAdvancedChartStore(instrumentsApi, chartDao, storeBundle, moshi);
        }
    }
}
