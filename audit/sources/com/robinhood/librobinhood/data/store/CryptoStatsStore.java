package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.api.ApiCryptoStats;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.crypto.dao.CryptoStatsDao;
import com.robinhood.models.crypto.p314db.CryptoStats;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CryptoStatsStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00112\u0006\u0010\u0012\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoStatsStore;", "Lcom/robinhood/store/Store;", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/crypto/dao/CryptoStatsDao;", "<init>", "(Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/crypto/dao/CryptoStatsDao;)V", "cryptoStatsEndpoints", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/ApiCryptoStats;", "streamCryptoStats", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/crypto/db/CryptoStats;", "Lkotlinx/coroutines/flow/Flow;", "currencyPairId", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoStatsStore extends Store {
    private final CryptoBonfireApi cryptoBonfireApi;
    private final Endpoint<UUID, ApiCryptoStats> cryptoStatsEndpoints;
    private final CryptoStatsDao dao;
    private final Query<UUID, CryptoStats> streamCryptoStats;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoStatsStore(CryptoBonfireApi cryptoBonfireApi, StoreBundle storeBundle, CryptoStatsDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.cryptoBonfireApi = cryptoBonfireApi;
        this.dao = dao;
        this.cryptoStatsEndpoints = Endpoint.INSTANCE.create(new CryptoStatsStore2(cryptoBonfireApi), getLogoutKillswitch(), new CryptoStatsStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(CryptoStats.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        this.streamCryptoStats = Store.create$default(this, Query.INSTANCE, CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoStatsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoStatsStore.streamCryptoStats$lambda$0(this.f$0, (UUID) obj);
            }
        })), new C337602(dao), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamCryptoStats$lambda$0(CryptoStatsStore cryptoStatsStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(cryptoStatsStore.cryptoStatsEndpoints, it, CryptoStats.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* compiled from: CryptoStatsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoStatsStore$streamCryptoStats$2 */
    /* synthetic */ class C337602 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends CryptoStats>> {
        C337602(Object obj) {
            super(1, obj, CryptoStatsDao.class, "getCryptoStats", "getCryptoStats(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Flow<CryptoStats> invoke(UUID p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((CryptoStatsDao) this.receiver).getCryptoStats(p0);
        }
    }

    public final Flow<CryptoStats> streamCryptoStats(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return this.streamCryptoStats.asFlow(currencyPairId);
    }
}
