package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.CryptobilityStore;
import com.robinhood.models.api.ApiCryptobility;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.crypto.dao.CryptobilityDao;
import com.robinhood.models.crypto.p314db.CryptoAccountInfo;
import com.robinhood.models.crypto.p314db.Cryptobility;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import retrofit2.Response;

/* compiled from: CryptobilityStore.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "Lcom/robinhood/store/Store;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "cryptobilityDao", "Lcom/robinhood/models/crypto/dao/CryptobilityDao;", "<init>", "(Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/crypto/dao/CryptobilityDao;)V", "getCryptobilityEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore$Args;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptobility;", "getCryptobilityQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/crypto/db/Cryptobility;", "pollCryptobility", "Lkotlinx/coroutines/flow/Flow;", "currencyPairId", "Ljava/util/UUID;", "Args", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptobilityStore extends Store {
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoBonfireApi cryptoBonfireApi;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptobilityDao cryptobilityDao;
    private final Endpoint<Args, Response<ApiCryptobility>> getCryptobilityEndpoint;
    private final Query<Args, Cryptobility> getCryptobilityQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptobilityStore(CryptoAccountProvider cryptoAccountProvider, CryptoBonfireApi cryptoBonfireApi, CryptoExperimentsStore cryptoExperimentsStore, StoreBundle storeBundle, CryptobilityDao cryptobilityDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(cryptobilityDao, "cryptobilityDao");
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoBonfireApi = cryptoBonfireApi;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptobilityDao = cryptobilityDao;
        this.getCryptobilityEndpoint = Endpoint.INSTANCE.create(new CryptobilityStore2(this, null), getLogoutKillswitch(), new CryptobilityStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Cryptobility.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        this.getCryptobilityQuery = Store.create$default(this, Query.INSTANCE, "getCryptobility", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptobilityStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptobilityStore.getCryptobilityQuery$lambda$0(this.f$0, (CryptobilityStore.Args) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptobilityStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptobilityStore.getCryptobilityQuery$lambda$1(this.f$0, (CryptobilityStore.Args) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getCryptobilityQuery$lambda$0(CryptobilityStore cryptobilityStore, Args args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return Endpoint8.backendPoll$default(cryptobilityStore.getCryptobilityEndpoint, args, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getCryptobilityQuery$lambda$1(CryptobilityStore cryptobilityStore, Args args) {
        Intrinsics.checkNotNullParameter(args, "args");
        CryptobilityDao cryptobilityDao = cryptobilityStore.cryptobilityDao;
        UUID currencyPairId = args.getCurrencyPairId();
        CryptoAccountInfo accountInfo = args.getAccountInfo();
        UUID cryptoAccountId = accountInfo != null ? accountInfo.getCryptoAccountId() : null;
        CryptoAccountInfo accountInfo2 = args.getAccountInfo();
        String fundingSourceId = accountInfo2 != null ? accountInfo2.getFundingSourceId() : null;
        CryptoAccountInfo accountInfo3 = args.getAccountInfo();
        return cryptobilityDao.getCryptobility(currencyPairId, cryptoAccountId, fundingSourceId, accountInfo3 != null ? accountInfo3.getFundingSourceType() : null);
    }

    public final Flow<Cryptobility> pollCryptobility(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return FlowKt.transformLatest(FlowKt.transformLatest(this.cryptoExperimentsStore.streamCryptoMibExperiment(), new CryptobilityStore$pollCryptobility$$inlined$flatMapLatest$1(null, this, currencyPairId)), new CryptobilityStore$pollCryptobility$$inlined$flatMapLatest$2(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object pollCryptobility$lambda$6$lambda$5$deleteAll(CryptobilityDao cryptobilityDao, Continuation continuation) {
        cryptobilityDao.deleteAll();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptobilityStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptobilityStore$Args;", "", "currencyPairId", "Ljava/util/UUID;", "accountInfo", "Lcom/robinhood/models/crypto/db/CryptoAccountInfo;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/crypto/db/CryptoAccountInfo;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getAccountInfo", "()Lcom/robinhood/models/crypto/db/CryptoAccountInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class Args {
        private final CryptoAccountInfo accountInfo;
        private final UUID currencyPairId;

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, CryptoAccountInfo cryptoAccountInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.currencyPairId;
            }
            if ((i & 2) != 0) {
                cryptoAccountInfo = args.accountInfo;
            }
            return args.copy(uuid, cryptoAccountInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoAccountInfo getAccountInfo() {
            return this.accountInfo;
        }

        public final Args copy(UUID currencyPairId, CryptoAccountInfo accountInfo) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new Args(currencyPairId, accountInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.currencyPairId, args.currencyPairId) && Intrinsics.areEqual(this.accountInfo, args.accountInfo);
        }

        public int hashCode() {
            int iHashCode = this.currencyPairId.hashCode() * 31;
            CryptoAccountInfo cryptoAccountInfo = this.accountInfo;
            return iHashCode + (cryptoAccountInfo == null ? 0 : cryptoAccountInfo.hashCode());
        }

        public String toString() {
            return "Args(currencyPairId=" + this.currencyPairId + ", accountInfo=" + this.accountInfo + ")";
        }

        public Args(UUID currencyPairId, CryptoAccountInfo cryptoAccountInfo) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.currencyPairId = currencyPairId;
            this.accountInfo = cryptoAccountInfo;
        }

        public /* synthetic */ Args(UUID uuid, CryptoAccountInfo cryptoAccountInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : cryptoAccountInfo);
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final CryptoAccountInfo getAccountInfo() {
            return this.accountInfo;
        }
    }
}
