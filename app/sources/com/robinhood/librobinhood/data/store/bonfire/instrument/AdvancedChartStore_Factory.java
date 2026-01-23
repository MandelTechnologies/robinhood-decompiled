package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.android.charts.models.dao.AdvancedChartIndicatorDao;
import com.robinhood.android.charts.models.dao.AdvancedChartSupportedIndicatorDao;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;", "instrumentsApi", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "indicatorDao", "Lcom/robinhood/android/charts/models/dao/AdvancedChartIndicatorDao;", "supportedIndicatorDao", "Lcom/robinhood/android/charts/models/dao/AdvancedChartSupportedIndicatorDao;", "shouldShowAdvancedChartZoomNuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class AdvancedChartStore_Factory implements Factory<AdvancedChartStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdvancedChartIndicatorDao> indicatorDao;
    private final Provider<InstrumentsApi> instrumentsApi;
    private final Provider<BooleanPreference> shouldShowAdvancedChartZoomNuxPref;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<AdvancedChartSupportedIndicatorDao> supportedIndicatorDao;

    @JvmStatic
    public static final AdvancedChartStore_Factory create(Provider<InstrumentsApi> provider, Provider<AdvancedChartIndicatorDao> provider2, Provider<AdvancedChartSupportedIndicatorDao> provider3, Provider<BooleanPreference> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final AdvancedChartStore newInstance(InstrumentsApi instrumentsApi, AdvancedChartIndicatorDao advancedChartIndicatorDao, AdvancedChartSupportedIndicatorDao advancedChartSupportedIndicatorDao, BooleanPreference booleanPreference, StoreBundle storeBundle) {
        return INSTANCE.newInstance(instrumentsApi, advancedChartIndicatorDao, advancedChartSupportedIndicatorDao, booleanPreference, storeBundle);
    }

    public AdvancedChartStore_Factory(Provider<InstrumentsApi> instrumentsApi, Provider<AdvancedChartIndicatorDao> indicatorDao, Provider<AdvancedChartSupportedIndicatorDao> supportedIndicatorDao, Provider<BooleanPreference> shouldShowAdvancedChartZoomNuxPref, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
        Intrinsics.checkNotNullParameter(indicatorDao, "indicatorDao");
        Intrinsics.checkNotNullParameter(supportedIndicatorDao, "supportedIndicatorDao");
        Intrinsics.checkNotNullParameter(shouldShowAdvancedChartZoomNuxPref, "shouldShowAdvancedChartZoomNuxPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.instrumentsApi = instrumentsApi;
        this.indicatorDao = indicatorDao;
        this.supportedIndicatorDao = supportedIndicatorDao;
        this.shouldShowAdvancedChartZoomNuxPref = shouldShowAdvancedChartZoomNuxPref;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public AdvancedChartStore get() {
        Companion companion = INSTANCE;
        InstrumentsApi instrumentsApi = this.instrumentsApi.get();
        Intrinsics.checkNotNullExpressionValue(instrumentsApi, "get(...)");
        AdvancedChartIndicatorDao advancedChartIndicatorDao = this.indicatorDao.get();
        Intrinsics.checkNotNullExpressionValue(advancedChartIndicatorDao, "get(...)");
        AdvancedChartSupportedIndicatorDao advancedChartSupportedIndicatorDao = this.supportedIndicatorDao.get();
        Intrinsics.checkNotNullExpressionValue(advancedChartSupportedIndicatorDao, "get(...)");
        BooleanPreference booleanPreference = this.shouldShowAdvancedChartZoomNuxPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(instrumentsApi, advancedChartIndicatorDao, advancedChartSupportedIndicatorDao, booleanPreference, storeBundle);
    }

    /* compiled from: AdvancedChartStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore_Factory;", "instrumentsApi", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "indicatorDao", "Lcom/robinhood/android/charts/models/dao/AdvancedChartIndicatorDao;", "supportedIndicatorDao", "Lcom/robinhood/android/charts/models/dao/AdvancedChartSupportedIndicatorDao;", "shouldShowAdvancedChartZoomNuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvancedChartStore_Factory create(Provider<InstrumentsApi> instrumentsApi, Provider<AdvancedChartIndicatorDao> indicatorDao, Provider<AdvancedChartSupportedIndicatorDao> supportedIndicatorDao, Provider<BooleanPreference> shouldShowAdvancedChartZoomNuxPref, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
            Intrinsics.checkNotNullParameter(indicatorDao, "indicatorDao");
            Intrinsics.checkNotNullParameter(supportedIndicatorDao, "supportedIndicatorDao");
            Intrinsics.checkNotNullParameter(shouldShowAdvancedChartZoomNuxPref, "shouldShowAdvancedChartZoomNuxPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new AdvancedChartStore_Factory(instrumentsApi, indicatorDao, supportedIndicatorDao, shouldShowAdvancedChartZoomNuxPref, storeBundle);
        }

        @JvmStatic
        public final AdvancedChartStore newInstance(InstrumentsApi instrumentsApi, AdvancedChartIndicatorDao indicatorDao, AdvancedChartSupportedIndicatorDao supportedIndicatorDao, BooleanPreference shouldShowAdvancedChartZoomNuxPref, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
            Intrinsics.checkNotNullParameter(indicatorDao, "indicatorDao");
            Intrinsics.checkNotNullParameter(supportedIndicatorDao, "supportedIndicatorDao");
            Intrinsics.checkNotNullParameter(shouldShowAdvancedChartZoomNuxPref, "shouldShowAdvancedChartZoomNuxPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new AdvancedChartStore(instrumentsApi, indicatorDao, supportedIndicatorDao, shouldShowAdvancedChartZoomNuxPref, storeBundle);
        }
    }
}
