package com.robinhood.internalassettransfers.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.internalassettransfers.retrofit.InternalAssetTransfersApi;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.internalassettransfer.p328db.dao.InternalAssetTransferDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nimbus.service.p511v1.NimbusService;

/* compiled from: InternalAssetTransfersStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;", "internalAssetTransfersApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/internalassettransfers/retrofit/InternalAssetTransfersApi;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "nimbusService", "Lnimbus/service/v1/NimbusService;", "internalAssetTransferDao", "Lcom/robinhood/models/internalassettransfer/db/dao/InternalAssetTransferDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class InternalAssetTransfersStore_Factory implements Factory<InternalAssetTransfersStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<InternalAssetTransferDao> internalAssetTransferDao;
    private final Provider<InternalAssetTransfersApi> internalAssetTransfersApi;
    private final Provider<NimbusService> nimbusService;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final InternalAssetTransfersStore_Factory create(Provider<InternalAssetTransfersApi> provider, Provider<InstrumentStore> provider2, Provider<NimbusService> provider3, Provider<InternalAssetTransferDao> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final InternalAssetTransfersStore newInstance(InternalAssetTransfersApi internalAssetTransfersApi, InstrumentStore instrumentStore, NimbusService nimbusService, InternalAssetTransferDao internalAssetTransferDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(internalAssetTransfersApi, instrumentStore, nimbusService, internalAssetTransferDao, storeBundle);
    }

    public InternalAssetTransfersStore_Factory(Provider<InternalAssetTransfersApi> internalAssetTransfersApi, Provider<InstrumentStore> instrumentStore, Provider<NimbusService> nimbusService, Provider<InternalAssetTransferDao> internalAssetTransferDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(internalAssetTransfersApi, "internalAssetTransfersApi");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(nimbusService, "nimbusService");
        Intrinsics.checkNotNullParameter(internalAssetTransferDao, "internalAssetTransferDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.internalAssetTransfersApi = internalAssetTransfersApi;
        this.instrumentStore = instrumentStore;
        this.nimbusService = nimbusService;
        this.internalAssetTransferDao = internalAssetTransferDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public InternalAssetTransfersStore get() {
        Companion companion = INSTANCE;
        InternalAssetTransfersApi internalAssetTransfersApi = this.internalAssetTransfersApi.get();
        Intrinsics.checkNotNullExpressionValue(internalAssetTransfersApi, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        NimbusService nimbusService = this.nimbusService.get();
        Intrinsics.checkNotNullExpressionValue(nimbusService, "get(...)");
        InternalAssetTransferDao internalAssetTransferDao = this.internalAssetTransferDao.get();
        Intrinsics.checkNotNullExpressionValue(internalAssetTransferDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(internalAssetTransfersApi, instrumentStore, nimbusService, internalAssetTransferDao, storeBundle);
    }

    /* compiled from: InternalAssetTransfersStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore_Factory;", "internalAssetTransfersApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/internalassettransfers/retrofit/InternalAssetTransfersApi;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "nimbusService", "Lnimbus/service/v1/NimbusService;", "internalAssetTransferDao", "Lcom/robinhood/models/internalassettransfer/db/dao/InternalAssetTransferDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;", "lib-store-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InternalAssetTransfersStore_Factory create(Provider<InternalAssetTransfersApi> internalAssetTransfersApi, Provider<InstrumentStore> instrumentStore, Provider<NimbusService> nimbusService, Provider<InternalAssetTransferDao> internalAssetTransferDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(internalAssetTransfersApi, "internalAssetTransfersApi");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(nimbusService, "nimbusService");
            Intrinsics.checkNotNullParameter(internalAssetTransferDao, "internalAssetTransferDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new InternalAssetTransfersStore_Factory(internalAssetTransfersApi, instrumentStore, nimbusService, internalAssetTransferDao, storeBundle);
        }

        @JvmStatic
        public final InternalAssetTransfersStore newInstance(InternalAssetTransfersApi internalAssetTransfersApi, InstrumentStore instrumentStore, NimbusService nimbusService, InternalAssetTransferDao internalAssetTransferDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(internalAssetTransfersApi, "internalAssetTransfersApi");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(nimbusService, "nimbusService");
            Intrinsics.checkNotNullParameter(internalAssetTransferDao, "internalAssetTransferDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new InternalAssetTransfersStore(internalAssetTransfersApi, instrumentStore, nimbusService, internalAssetTransferDao, storeBundle);
        }
    }
}
