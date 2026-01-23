package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.retirement.dao.Retirement401kFinderResultsDao;
import com.robinhood.android.models.retirement.dao.Retirement401kRolloverDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Retirement401kRolloverStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "retirement401kFinderResultsDao", "Ljavax/inject/Provider;", "Lcom/robinhood/android/models/retirement/dao/Retirement401kFinderResultsDao;", "retirement401kRolloverDao", "Lcom/robinhood/android/models/retirement/dao/Retirement401kRolloverDao;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class Retirement401kRolloverStore_Factory implements Factory<Retirement401kRolloverStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Retirement401kFinderResultsDao> retirement401kFinderResultsDao;
    private final Provider<Retirement401kRolloverDao> retirement401kRolloverDao;
    private final Provider<RetirementApi> retirementApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final Retirement401kRolloverStore_Factory create(Provider<Retirement401kFinderResultsDao> provider, Provider<Retirement401kRolloverDao> provider2, Provider<RetirementApi> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final Retirement401kRolloverStore newInstance(Retirement401kFinderResultsDao retirement401kFinderResultsDao, Retirement401kRolloverDao retirement401kRolloverDao, RetirementApi retirementApi, StoreBundle storeBundle) {
        return INSTANCE.newInstance(retirement401kFinderResultsDao, retirement401kRolloverDao, retirementApi, storeBundle);
    }

    public Retirement401kRolloverStore_Factory(Provider<Retirement401kFinderResultsDao> retirement401kFinderResultsDao, Provider<Retirement401kRolloverDao> retirement401kRolloverDao, Provider<RetirementApi> retirementApi, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(retirement401kFinderResultsDao, "retirement401kFinderResultsDao");
        Intrinsics.checkNotNullParameter(retirement401kRolloverDao, "retirement401kRolloverDao");
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.retirement401kFinderResultsDao = retirement401kFinderResultsDao;
        this.retirement401kRolloverDao = retirement401kRolloverDao;
        this.retirementApi = retirementApi;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public Retirement401kRolloverStore get() {
        Companion companion = INSTANCE;
        Retirement401kFinderResultsDao retirement401kFinderResultsDao = this.retirement401kFinderResultsDao.get();
        Intrinsics.checkNotNullExpressionValue(retirement401kFinderResultsDao, "get(...)");
        Retirement401kRolloverDao retirement401kRolloverDao = this.retirement401kRolloverDao.get();
        Intrinsics.checkNotNullExpressionValue(retirement401kRolloverDao, "get(...)");
        RetirementApi retirementApi = this.retirementApi.get();
        Intrinsics.checkNotNullExpressionValue(retirementApi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(retirement401kFinderResultsDao, retirement401kRolloverDao, retirementApi, storeBundle);
    }

    /* compiled from: Retirement401kRolloverStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore_Factory;", "retirement401kFinderResultsDao", "Ljavax/inject/Provider;", "Lcom/robinhood/android/models/retirement/dao/Retirement401kFinderResultsDao;", "retirement401kRolloverDao", "Lcom/robinhood/android/models/retirement/dao/Retirement401kRolloverDao;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Retirement401kRolloverStore_Factory create(Provider<Retirement401kFinderResultsDao> retirement401kFinderResultsDao, Provider<Retirement401kRolloverDao> retirement401kRolloverDao, Provider<RetirementApi> retirementApi, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(retirement401kFinderResultsDao, "retirement401kFinderResultsDao");
            Intrinsics.checkNotNullParameter(retirement401kRolloverDao, "retirement401kRolloverDao");
            Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new Retirement401kRolloverStore_Factory(retirement401kFinderResultsDao, retirement401kRolloverDao, retirementApi, storeBundle);
        }

        @JvmStatic
        public final Retirement401kRolloverStore newInstance(Retirement401kFinderResultsDao retirement401kFinderResultsDao, Retirement401kRolloverDao retirement401kRolloverDao, RetirementApi retirementApi, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(retirement401kFinderResultsDao, "retirement401kFinderResultsDao");
            Intrinsics.checkNotNullParameter(retirement401kRolloverDao, "retirement401kRolloverDao");
            Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new Retirement401kRolloverStore(retirement401kFinderResultsDao, retirement401kRolloverDao, retirementApi, storeBundle);
        }
    }
}
