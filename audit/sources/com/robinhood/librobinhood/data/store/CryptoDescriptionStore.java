package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.api.ApiCryptoDescription;
import com.robinhood.models.crypto.p314db.CryptoDescription;
import com.robinhood.models.dao.CryptoDescriptionDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CryptoDescriptionStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0006\u0010\u0015\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;", "Lcom/robinhood/store/Store;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CryptoDescriptionDao;", "<init>", "(Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/CryptoDescriptionDao;)V", "cryptoDescriptionEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/ApiCryptoDescription;", "streamCryptoDescription", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/crypto/db/CryptoDescription;", "getStreamCryptoDescription", "()Lcom/robinhood/android/moria/db/Query;", "fetchCryptoDescription", "Lkotlinx/coroutines/flow/Flow;", "currencyPairId", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoDescriptionStore extends Store {
    private final Brokeback brokeback;
    private final Endpoint<UUID, ApiCryptoDescription> cryptoDescriptionEndpoint;
    private final CryptoDescriptionDao dao;
    private final Query<UUID, CryptoDescription> fetchCryptoDescription;
    private final Query<UUID, CryptoDescription> streamCryptoDescription;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoDescriptionStore(Brokeback brokeback, StoreBundle storeBundle, CryptoDescriptionDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.brokeback = brokeback;
        this.dao = dao;
        this.cryptoDescriptionEndpoint = Endpoint.INSTANCE.create(new CryptoDescriptionStore2(brokeback), getLogoutKillswitch(), new CryptoDescriptionStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(CryptoDescription.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        Query.Companion companion = Query.INSTANCE;
        this.streamCryptoDescription = Store.create$default(this, companion, CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoDescriptionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDescriptionStore.streamCryptoDescription$lambda$0(this.f$0, (UUID) obj);
            }
        })), new CryptoDescriptionStore4(dao), false, 4, null);
        this.fetchCryptoDescription = Store.create$default(this, companion, CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoDescriptionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDescriptionStore.fetchCryptoDescription$lambda$1(this.f$0, (UUID) obj);
            }
        })), new C336962(dao), false, 4, null);
    }

    public final Query<UUID, CryptoDescription> getStreamCryptoDescription() {
        return this.streamCryptoDescription;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamCryptoDescription$lambda$0(CryptoDescriptionStore cryptoDescriptionStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(cryptoDescriptionStore.cryptoDescriptionEndpoint, it, CryptoDescription.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* compiled from: CryptoDescriptionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoDescriptionStore$fetchCryptoDescription$2 */
    /* synthetic */ class C336962 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends CryptoDescription>> {
        C336962(Object obj) {
            super(1, obj, CryptoDescriptionDao.class, "getCryptoDescription", "getCryptoDescription(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Flow<CryptoDescription> invoke(UUID p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((CryptoDescriptionDao) this.receiver).getCryptoDescription(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job fetchCryptoDescription$lambda$1(CryptoDescriptionStore cryptoDescriptionStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(cryptoDescriptionStore.cryptoDescriptionEndpoint, it, false, null, 6, null);
    }

    public final Flow<CryptoDescription> fetchCryptoDescription(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return this.fetchCryptoDescription.asFlow(currencyPairId);
    }
}
