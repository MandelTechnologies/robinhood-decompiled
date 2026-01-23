package com.robinhood.store.futures.arsenal;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.futures.arsenal.dao.FuturesContractDao;
import com.robinhood.android.models.futures.arsenal.dao.FuturesProductDao;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesContractStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/store/futures/arsenal/FuturesContractStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "arsenalService", "Ljavax/inject/Provider;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "futuresContractDao", "Lcom/robinhood/android/models/futures/arsenal/dao/FuturesContractDao;", "futuresProductDao", "Lcom/robinhood/android/models/futures/arsenal/dao/FuturesProductDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FuturesContractStore_Factory implements Factory<FuturesContractStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<InstrumentService> arsenalService;
    private final Provider<FuturesContractDao> futuresContractDao;
    private final Provider<FuturesProductDao> futuresProductDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final FuturesContractStore_Factory create(Provider<InstrumentService> provider, Provider<FuturesContractDao> provider2, Provider<FuturesProductDao> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final FuturesContractStore newInstance(InstrumentService instrumentService, FuturesContractDao futuresContractDao, FuturesProductDao futuresProductDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(instrumentService, futuresContractDao, futuresProductDao, storeBundle);
    }

    public FuturesContractStore_Factory(Provider<InstrumentService> arsenalService, Provider<FuturesContractDao> futuresContractDao, Provider<FuturesProductDao> futuresProductDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(arsenalService, "arsenalService");
        Intrinsics.checkNotNullParameter(futuresContractDao, "futuresContractDao");
        Intrinsics.checkNotNullParameter(futuresProductDao, "futuresProductDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.arsenalService = arsenalService;
        this.futuresContractDao = futuresContractDao;
        this.futuresProductDao = futuresProductDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public FuturesContractStore get() {
        Companion companion = INSTANCE;
        InstrumentService instrumentService = this.arsenalService.get();
        Intrinsics.checkNotNullExpressionValue(instrumentService, "get(...)");
        FuturesContractDao futuresContractDao = this.futuresContractDao.get();
        Intrinsics.checkNotNullExpressionValue(futuresContractDao, "get(...)");
        FuturesProductDao futuresProductDao = this.futuresProductDao.get();
        Intrinsics.checkNotNullExpressionValue(futuresProductDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(instrumentService, futuresContractDao, futuresProductDao, storeBundle);
    }

    /* compiled from: FuturesContractStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/store/futures/arsenal/FuturesContractStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/futures/arsenal/FuturesContractStore_Factory;", "arsenalService", "Ljavax/inject/Provider;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "futuresContractDao", "Lcom/robinhood/android/models/futures/arsenal/dao/FuturesContractDao;", "futuresProductDao", "Lcom/robinhood/android/models/futures/arsenal/dao/FuturesProductDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesContractStore_Factory create(Provider<InstrumentService> arsenalService, Provider<FuturesContractDao> futuresContractDao, Provider<FuturesProductDao> futuresProductDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(arsenalService, "arsenalService");
            Intrinsics.checkNotNullParameter(futuresContractDao, "futuresContractDao");
            Intrinsics.checkNotNullParameter(futuresProductDao, "futuresProductDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FuturesContractStore_Factory(arsenalService, futuresContractDao, futuresProductDao, storeBundle);
        }

        @JvmStatic
        public final FuturesContractStore newInstance(InstrumentService arsenalService, FuturesContractDao futuresContractDao, FuturesProductDao futuresProductDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(arsenalService, "arsenalService");
            Intrinsics.checkNotNullParameter(futuresContractDao, "futuresContractDao");
            Intrinsics.checkNotNullParameter(futuresProductDao, "futuresProductDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FuturesContractStore(arsenalService, futuresContractDao, futuresProductDao, storeBundle);
        }
    }
}
