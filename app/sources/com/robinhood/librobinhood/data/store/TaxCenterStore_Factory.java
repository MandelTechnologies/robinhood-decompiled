package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.taxcenter.dao.PreviousTaxFormsDao;
import com.robinhood.android.models.taxcenter.dao.TaxCenterTimelineDao;
import com.robinhood.android.models.taxcenter.dao.TaxDocumentDao;
import com.robinhood.android.models.taxcenter.dao.TaxTimelineInfoDao;
import com.robinhood.android.taxcenter.api.TaxCenterApi;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxCenterStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TaxCenterStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/TaxCenterStore;", "taxCenterApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/taxcenter/api/TaxCenterApi;", "timelineDao", "Lcom/robinhood/android/models/taxcenter/dao/TaxCenterTimelineDao;", "timelineInfoDao", "Lcom/robinhood/android/models/taxcenter/dao/TaxTimelineInfoDao;", "previousTaxFormsDao", "Lcom/robinhood/android/models/taxcenter/dao/PreviousTaxFormsDao;", "taxDocumentDao", "Lcom/robinhood/android/models/taxcenter/dao/TaxDocumentDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TaxCenterStore_Factory implements Factory<TaxCenterStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<PreviousTaxFormsDao> previousTaxFormsDao;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<TaxCenterApi> taxCenterApi;
    private final Provider<TaxDocumentDao> taxDocumentDao;
    private final Provider<TaxCenterTimelineDao> timelineDao;
    private final Provider<TaxTimelineInfoDao> timelineInfoDao;

    @JvmStatic
    public static final TaxCenterStore_Factory create(Provider<TaxCenterApi> provider, Provider<TaxCenterTimelineDao> provider2, Provider<TaxTimelineInfoDao> provider3, Provider<PreviousTaxFormsDao> provider4, Provider<TaxDocumentDao> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final TaxCenterStore newInstance(TaxCenterApi taxCenterApi, TaxCenterTimelineDao taxCenterTimelineDao, TaxTimelineInfoDao taxTimelineInfoDao, PreviousTaxFormsDao previousTaxFormsDao, TaxDocumentDao taxDocumentDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(taxCenterApi, taxCenterTimelineDao, taxTimelineInfoDao, previousTaxFormsDao, taxDocumentDao, storeBundle);
    }

    public TaxCenterStore_Factory(Provider<TaxCenterApi> taxCenterApi, Provider<TaxCenterTimelineDao> timelineDao, Provider<TaxTimelineInfoDao> timelineInfoDao, Provider<PreviousTaxFormsDao> previousTaxFormsDao, Provider<TaxDocumentDao> taxDocumentDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(taxCenterApi, "taxCenterApi");
        Intrinsics.checkNotNullParameter(timelineDao, "timelineDao");
        Intrinsics.checkNotNullParameter(timelineInfoDao, "timelineInfoDao");
        Intrinsics.checkNotNullParameter(previousTaxFormsDao, "previousTaxFormsDao");
        Intrinsics.checkNotNullParameter(taxDocumentDao, "taxDocumentDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.taxCenterApi = taxCenterApi;
        this.timelineDao = timelineDao;
        this.timelineInfoDao = timelineInfoDao;
        this.previousTaxFormsDao = previousTaxFormsDao;
        this.taxDocumentDao = taxDocumentDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public TaxCenterStore get() {
        Companion companion = INSTANCE;
        TaxCenterApi taxCenterApi = this.taxCenterApi.get();
        Intrinsics.checkNotNullExpressionValue(taxCenterApi, "get(...)");
        TaxCenterTimelineDao taxCenterTimelineDao = this.timelineDao.get();
        Intrinsics.checkNotNullExpressionValue(taxCenterTimelineDao, "get(...)");
        TaxTimelineInfoDao taxTimelineInfoDao = this.timelineInfoDao.get();
        Intrinsics.checkNotNullExpressionValue(taxTimelineInfoDao, "get(...)");
        PreviousTaxFormsDao previousTaxFormsDao = this.previousTaxFormsDao.get();
        Intrinsics.checkNotNullExpressionValue(previousTaxFormsDao, "get(...)");
        TaxDocumentDao taxDocumentDao = this.taxDocumentDao.get();
        Intrinsics.checkNotNullExpressionValue(taxDocumentDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(taxCenterApi, taxCenterTimelineDao, taxTimelineInfoDao, previousTaxFormsDao, taxDocumentDao, storeBundle);
    }

    /* compiled from: TaxCenterStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TaxCenterStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/TaxCenterStore_Factory;", "taxCenterApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/taxcenter/api/TaxCenterApi;", "timelineDao", "Lcom/robinhood/android/models/taxcenter/dao/TaxCenterTimelineDao;", "timelineInfoDao", "Lcom/robinhood/android/models/taxcenter/dao/TaxTimelineInfoDao;", "previousTaxFormsDao", "Lcom/robinhood/android/models/taxcenter/dao/PreviousTaxFormsDao;", "taxDocumentDao", "Lcom/robinhood/android/models/taxcenter/dao/TaxDocumentDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/TaxCenterStore;", "lib-store-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TaxCenterStore_Factory create(Provider<TaxCenterApi> taxCenterApi, Provider<TaxCenterTimelineDao> timelineDao, Provider<TaxTimelineInfoDao> timelineInfoDao, Provider<PreviousTaxFormsDao> previousTaxFormsDao, Provider<TaxDocumentDao> taxDocumentDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(taxCenterApi, "taxCenterApi");
            Intrinsics.checkNotNullParameter(timelineDao, "timelineDao");
            Intrinsics.checkNotNullParameter(timelineInfoDao, "timelineInfoDao");
            Intrinsics.checkNotNullParameter(previousTaxFormsDao, "previousTaxFormsDao");
            Intrinsics.checkNotNullParameter(taxDocumentDao, "taxDocumentDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new TaxCenterStore_Factory(taxCenterApi, timelineDao, timelineInfoDao, previousTaxFormsDao, taxDocumentDao, storeBundle);
        }

        @JvmStatic
        public final TaxCenterStore newInstance(TaxCenterApi taxCenterApi, TaxCenterTimelineDao timelineDao, TaxTimelineInfoDao timelineInfoDao, PreviousTaxFormsDao previousTaxFormsDao, TaxDocumentDao taxDocumentDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(taxCenterApi, "taxCenterApi");
            Intrinsics.checkNotNullParameter(timelineDao, "timelineDao");
            Intrinsics.checkNotNullParameter(timelineInfoDao, "timelineInfoDao");
            Intrinsics.checkNotNullParameter(previousTaxFormsDao, "previousTaxFormsDao");
            Intrinsics.checkNotNullParameter(taxDocumentDao, "taxDocumentDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new TaxCenterStore(taxCenterApi, timelineDao, timelineInfoDao, previousTaxFormsDao, taxDocumentDao, storeBundle);
        }
    }
}
