package com.robinhood.store.futures;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.futures.dao.FuturesCashCorrectionDao;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesCashCorrectionStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesCashCorrectionStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/futures/FuturesCashCorrectionStore;", "ceres", "Ljavax/inject/Provider;", "Lcom/robinhood/ceres/v1/Ceres;", "cashCorrectionDao", "Lcom/robinhood/android/models/futures/dao/FuturesCashCorrectionDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FuturesCashCorrectionStore_Factory implements Factory<FuturesCashCorrectionStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<FuturesCashCorrectionDao> cashCorrectionDao;
    private final Provider<Ceres> ceres;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final FuturesCashCorrectionStore_Factory create(Provider<Ceres> provider, Provider<FuturesCashCorrectionDao> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final FuturesCashCorrectionStore newInstance(Ceres ceres, FuturesCashCorrectionDao futuresCashCorrectionDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(ceres, futuresCashCorrectionDao, storeBundle);
    }

    public FuturesCashCorrectionStore_Factory(Provider<Ceres> ceres, Provider<FuturesCashCorrectionDao> cashCorrectionDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(cashCorrectionDao, "cashCorrectionDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ceres = ceres;
        this.cashCorrectionDao = cashCorrectionDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public FuturesCashCorrectionStore get() {
        Companion companion = INSTANCE;
        Ceres ceres = this.ceres.get();
        Intrinsics.checkNotNullExpressionValue(ceres, "get(...)");
        FuturesCashCorrectionDao futuresCashCorrectionDao = this.cashCorrectionDao.get();
        Intrinsics.checkNotNullExpressionValue(futuresCashCorrectionDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(ceres, futuresCashCorrectionDao, storeBundle);
    }

    /* compiled from: FuturesCashCorrectionStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesCashCorrectionStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/futures/FuturesCashCorrectionStore_Factory;", "ceres", "Ljavax/inject/Provider;", "Lcom/robinhood/ceres/v1/Ceres;", "cashCorrectionDao", "Lcom/robinhood/android/models/futures/dao/FuturesCashCorrectionDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/futures/FuturesCashCorrectionStore;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesCashCorrectionStore_Factory create(Provider<Ceres> ceres, Provider<FuturesCashCorrectionDao> cashCorrectionDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(ceres, "ceres");
            Intrinsics.checkNotNullParameter(cashCorrectionDao, "cashCorrectionDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FuturesCashCorrectionStore_Factory(ceres, cashCorrectionDao, storeBundle);
        }

        @JvmStatic
        public final FuturesCashCorrectionStore newInstance(Ceres ceres, FuturesCashCorrectionDao cashCorrectionDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(ceres, "ceres");
            Intrinsics.checkNotNullParameter(cashCorrectionDao, "cashCorrectionDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FuturesCashCorrectionStore(ceres, cashCorrectionDao, storeBundle);
        }
    }
}
