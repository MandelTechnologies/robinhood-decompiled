package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.crypto.p033v1.CryptoService;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.crypto.dao.CryptoNewsfeedDao;
import com.robinhood.models.crypto.p314db.CryptoNewsfeed;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CryptoNewsfeedStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00122\u0006\u0010\u0013\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoNewsfeedStore;", "Lcom/robinhood/store/Store;", "cryptoService", "Lbonfire/proto/idl/crypto/v1/CryptoService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/crypto/dao/CryptoNewsfeedDao;", "<init>", "(Lbonfire/proto/idl/crypto/v1/CryptoService;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/crypto/dao/CryptoNewsfeedDao;)V", "cryptoNewsfeedEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "", "Lcom/robinhood/models/crypto/db/CryptoNewsfeed;", "cryptoNewsfeedQuery", "Lcom/robinhood/android/moria/db/Query;", "getCryptoNewsfeed", "Lkotlinx/coroutines/flow/Flow;", "currencyId", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoNewsfeedStore extends Store {
    private final Endpoint<UUID, List<CryptoNewsfeed>> cryptoNewsfeedEndpoint;
    private final Query<UUID, List<CryptoNewsfeed>> cryptoNewsfeedQuery;
    private final CryptoService cryptoService;
    private final CryptoNewsfeedDao dao;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoNewsfeedStore(CryptoService cryptoService, StoreBundle storeBundle, CryptoNewsfeedDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cryptoService, "cryptoService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.cryptoService = cryptoService;
        this.dao = dao;
        Endpoint<UUID, List<CryptoNewsfeed>> endpointCreate = Endpoint.INSTANCE.create(new CryptoNewsfeedStore2(this, null), getLogoutKillswitch(), new CryptoNewsfeedStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(CryptoNewsfeed.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        this.cryptoNewsfeedEndpoint = endpointCreate;
        this.cryptoNewsfeedQuery = Store.create$default(this, Query.INSTANCE, CollectionsKt.listOf(new RefreshEach(new CryptoNewsfeedStore4(endpointCreate))), new CryptoNewsfeedStore5(dao), false, 4, null);
    }

    public final Flow<List<CryptoNewsfeed>> getCryptoNewsfeed(UUID currencyId) {
        Intrinsics.checkNotNullParameter(currencyId, "currencyId");
        return this.cryptoNewsfeedQuery.asFlow(currencyId);
    }
}
