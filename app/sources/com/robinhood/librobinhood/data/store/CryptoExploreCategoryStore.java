package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.crypto.p033v1.CryptoService;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.librobinhood.data.store.CryptoExploreCategoryStore;
import com.robinhood.models.api.trading.CryptoTradingAssetType;
import com.robinhood.models.api.trading.CryptoTradingOptionsLocation;
import com.robinhood.models.crypto.dao.CryptoExploreCategoryDao;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreCategories;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CryptoExploreCategoryStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "cryptoService", "Lbonfire/proto/idl/crypto/v1/CryptoService;", "dao", "Lcom/robinhood/models/crypto/dao/CryptoExploreCategoryDao;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lbonfire/proto/idl/crypto/v1/CryptoService;Lcom/robinhood/models/crypto/dao/CryptoExploreCategoryDao;)V", "cryptoExploreCategoryEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore$ExploreCategoryRequest;", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;", "cryptoExploreCategoryQuery", "Lcom/robinhood/android/moria/db/Query;", "getCryptoExploreCategories", "Lkotlinx/coroutines/flow/Flow;", "assetType", "Lcom/robinhood/models/api/trading/CryptoTradingAssetType;", "location", "Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;", "ExploreCategoryRequest", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoExploreCategoryStore extends Store {
    private final Endpoint<ExploreCategoryRequest, CryptoExploreCategories> cryptoExploreCategoryEndpoint;
    private final Query<ExploreCategoryRequest, CryptoExploreCategories> cryptoExploreCategoryQuery;
    private final CryptoService cryptoService;
    private final CryptoExploreCategoryDao dao;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoExploreCategoryStore(StoreBundle storeBundle, CryptoService cryptoService, CryptoExploreCategoryDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(cryptoService, "cryptoService");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.cryptoService = cryptoService;
        this.dao = dao;
        Endpoint<ExploreCategoryRequest, CryptoExploreCategories> endpointCreate = Endpoint.INSTANCE.create(new CryptoExploreCategoryStore2(this, null), getLogoutKillswitch(), new CryptoExploreCategoryStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(CryptoExploreCategories.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        this.cryptoExploreCategoryEndpoint = endpointCreate;
        this.cryptoExploreCategoryQuery = Store.create$default(this, Query.INSTANCE, "getCryptoCategoriesQuery", CollectionsKt.listOf(new RefreshEach(new CryptoExploreCategoryStore4(endpointCreate))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoExploreCategoryStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoExploreCategoryStore.cryptoExploreCategoryQuery$lambda$0(this.f$0, (CryptoExploreCategoryStore.ExploreCategoryRequest) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow cryptoExploreCategoryQuery$lambda$0(CryptoExploreCategoryStore cryptoExploreCategoryStore, ExploreCategoryRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoExploreCategoryStore.dao.get(it.getAssetType(), it.getLocation());
    }

    public final Flow<CryptoExploreCategories> getCryptoExploreCategories(CryptoTradingAssetType assetType, CryptoTradingOptionsLocation location) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.cryptoExploreCategoryQuery.asFlow(new ExploreCategoryRequest(assetType, location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoExploreCategoryStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore$ExploreCategoryRequest;", "", "assetType", "Lcom/robinhood/models/api/trading/CryptoTradingAssetType;", "location", "Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;", "<init>", "(Lcom/robinhood/models/api/trading/CryptoTradingAssetType;Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;)V", "getAssetType", "()Lcom/robinhood/models/api/trading/CryptoTradingAssetType;", "getLocation", "()Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class ExploreCategoryRequest {
        private final CryptoTradingAssetType assetType;
        private final CryptoTradingOptionsLocation location;

        public static /* synthetic */ ExploreCategoryRequest copy$default(ExploreCategoryRequest exploreCategoryRequest, CryptoTradingAssetType cryptoTradingAssetType, CryptoTradingOptionsLocation cryptoTradingOptionsLocation, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoTradingAssetType = exploreCategoryRequest.assetType;
            }
            if ((i & 2) != 0) {
                cryptoTradingOptionsLocation = exploreCategoryRequest.location;
            }
            return exploreCategoryRequest.copy(cryptoTradingAssetType, cryptoTradingOptionsLocation);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoTradingAssetType getAssetType() {
            return this.assetType;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoTradingOptionsLocation getLocation() {
            return this.location;
        }

        public final ExploreCategoryRequest copy(CryptoTradingAssetType assetType, CryptoTradingOptionsLocation location) {
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(location, "location");
            return new ExploreCategoryRequest(assetType, location);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExploreCategoryRequest)) {
                return false;
            }
            ExploreCategoryRequest exploreCategoryRequest = (ExploreCategoryRequest) other;
            return this.assetType == exploreCategoryRequest.assetType && this.location == exploreCategoryRequest.location;
        }

        public int hashCode() {
            return (this.assetType.hashCode() * 31) + this.location.hashCode();
        }

        public String toString() {
            return "ExploreCategoryRequest(assetType=" + this.assetType + ", location=" + this.location + ")";
        }

        public ExploreCategoryRequest(CryptoTradingAssetType assetType, CryptoTradingOptionsLocation location) {
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(location, "location");
            this.assetType = assetType;
            this.location = location;
        }

        public final CryptoTradingAssetType getAssetType() {
            return this.assetType;
        }

        public final CryptoTradingOptionsLocation getLocation() {
            return this.location;
        }
    }
}
