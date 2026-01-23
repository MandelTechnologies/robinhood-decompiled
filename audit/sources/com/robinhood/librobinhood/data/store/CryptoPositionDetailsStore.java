package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.CryptoPositionDetailsStore;
import com.robinhood.models.api.ApiCryptoPositionDetails;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.crypto.dao.CryptoPositionDetailsDao;
import com.robinhood.models.crypto.p314db.CryptoPositionDetails;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import retrofit2.Response;

/* compiled from: CryptoPositionDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0014\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoPositionDetailsStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "cryptoPositionDetailsDao", "Lcom/robinhood/models/crypto/dao/CryptoPositionDetailsDao;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;Lcom/robinhood/models/crypto/dao/CryptoPositionDetailsDao;)V", "getCryptoPositionDetailsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/CryptoPositionDetailsStore$CryptoPositionDetailsParams;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptoPositionDetails;", "streamCryptoPositionDetailsQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/crypto/db/CryptoPositionDetails;", "streamCryptoPositionDetails", "Lkotlinx/coroutines/flow/Flow;", "params", "CryptoPositionDetailsParams", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoPositionDetailsStore extends Store {
    private final CryptoBonfireApi cryptoBonfireApi;
    private final CryptoPositionDetailsDao cryptoPositionDetailsDao;
    private final Endpoint<CryptoPositionDetailsParams, Response<ApiCryptoPositionDetails>> getCryptoPositionDetailsEndpoint;
    private final Query<CryptoPositionDetailsParams, CryptoPositionDetails> streamCryptoPositionDetailsQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoPositionDetailsStore(StoreBundle storeBundle, CryptoBonfireApi cryptoBonfireApi, CryptoPositionDetailsDao cryptoPositionDetailsDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
        Intrinsics.checkNotNullParameter(cryptoPositionDetailsDao, "cryptoPositionDetailsDao");
        this.cryptoBonfireApi = cryptoBonfireApi;
        this.cryptoPositionDetailsDao = cryptoPositionDetailsDao;
        Endpoint<CryptoPositionDetailsParams, Response<ApiCryptoPositionDetails>> endpointCreate = Endpoint.INSTANCE.create(new CryptoPositionDetailsStore2(this, null), getLogoutKillswitch(), new CryptoPositionDetailsStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(CryptoPositionDetails.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        this.getCryptoPositionDetailsEndpoint = endpointCreate;
        this.streamCryptoPositionDetailsQuery = Store.create$default(this, Query.INSTANCE, "streamCryptoPositionDetailsQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new CryptoPositionDetailsStore4(endpointCreate))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoPositionDetailsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoPositionDetailsStore.streamCryptoPositionDetailsQuery$lambda$0(this.f$0, (CryptoPositionDetailsStore.CryptoPositionDetailsParams) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamCryptoPositionDetailsQuery$lambda$0(CryptoPositionDetailsStore cryptoPositionDetailsStore, CryptoPositionDetailsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return cryptoPositionDetailsStore.cryptoPositionDetailsDao.getCryptoPositionDetails(params.getCurrencyPairId(), params.getCryptoAccountId());
    }

    public final Flow<CryptoPositionDetails> streamCryptoPositionDetails(CryptoPositionDetailsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.streamCryptoPositionDetailsQuery.asFlow(params);
    }

    /* compiled from: CryptoPositionDetailsStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoPositionDetailsStore$CryptoPositionDetailsParams;", "", "currencyPairId", "Ljava/util/UUID;", "cryptoAccountId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getCryptoAccountId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CryptoPositionDetailsParams {
        private final UUID cryptoAccountId;
        private final UUID currencyPairId;

        public static /* synthetic */ CryptoPositionDetailsParams copy$default(CryptoPositionDetailsParams cryptoPositionDetailsParams, UUID uuid, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = cryptoPositionDetailsParams.currencyPairId;
            }
            if ((i & 2) != 0) {
                uuid2 = cryptoPositionDetailsParams.cryptoAccountId;
            }
            return cryptoPositionDetailsParams.copy(uuid, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getCryptoAccountId() {
            return this.cryptoAccountId;
        }

        public final CryptoPositionDetailsParams copy(UUID currencyPairId, UUID cryptoAccountId) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new CryptoPositionDetailsParams(currencyPairId, cryptoAccountId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CryptoPositionDetailsParams)) {
                return false;
            }
            CryptoPositionDetailsParams cryptoPositionDetailsParams = (CryptoPositionDetailsParams) other;
            return Intrinsics.areEqual(this.currencyPairId, cryptoPositionDetailsParams.currencyPairId) && Intrinsics.areEqual(this.cryptoAccountId, cryptoPositionDetailsParams.cryptoAccountId);
        }

        public int hashCode() {
            int iHashCode = this.currencyPairId.hashCode() * 31;
            UUID uuid = this.cryptoAccountId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "CryptoPositionDetailsParams(currencyPairId=" + this.currencyPairId + ", cryptoAccountId=" + this.cryptoAccountId + ")";
        }

        public CryptoPositionDetailsParams(UUID currencyPairId, UUID uuid) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.currencyPairId = currencyPairId;
            this.cryptoAccountId = uuid;
        }

        public /* synthetic */ CryptoPositionDetailsParams(UUID uuid, UUID uuid2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : uuid2);
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final UUID getCryptoAccountId() {
            return this.cryptoAccountId;
        }
    }
}
