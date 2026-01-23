package com.robinhood.librobinhood.data.store;

import bff_crypto_trading.service.p018v1.BffCryptoTradingService;
import bff_crypto_trading.service.p018v1.CryptoAssetTypeDto;
import bff_crypto_trading.service.p018v1.GetCryptoExploreStateRequestDto;
import bff_crypto_trading.service.p018v1.GetCryptoExploreStateResponseDto;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.librobinhood.data.store.CryptoExploreStateStore;
import com.robinhood.models.crypto.dao.CryptoExploreStateDao;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState3;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CryptoExploreStateStore.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoExploreStateStore;", "Lcom/robinhood/store/Store;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "bffCryptoTradingApi", "Lbff_crypto_trading/service/v1/BffCryptoTradingService;", "cryptoExploreStateDao", "Lcom/robinhood/models/crypto/dao/CryptoExploreStateDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/security/auth/AuthManager;Lbff_crypto_trading/service/v1/BffCryptoTradingService;Lcom/robinhood/models/crypto/dao/CryptoExploreStateDao;Lcom/robinhood/store/StoreBundle;)V", "getCryptoExploreStateEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateRequestDto;", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateResponseDto;", "streamCryptoExploreQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/librobinhood/data/store/CryptoExploreStateStore$ExploreRequest;", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreState;", "stream", "Lkotlinx/coroutines/flow/Flow;", "assetType", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;", "force", "", "ExploreRequest", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoExploreStateStore extends Store {
    private final AuthManager authManager;
    private final BffCryptoTradingService bffCryptoTradingApi;
    private final CryptoExploreStateDao cryptoExploreStateDao;
    private final Endpoint<GetCryptoExploreStateRequestDto, GetCryptoExploreStateResponseDto> getCryptoExploreStateEndpoint;
    private final Query<ExploreRequest, CryptoExploreState> streamCryptoExploreQuery;

    /* compiled from: CryptoExploreStateStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoExploreState3.values().length];
            try {
                iArr[CryptoExploreState3.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoExploreState3.TOKENIZED_ETF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoExploreState3.TOKENIZED_STOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoExploreState3.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoExploreStateStore(AuthManager authManager, BffCryptoTradingService bffCryptoTradingApi, CryptoExploreStateDao cryptoExploreStateDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(bffCryptoTradingApi, "bffCryptoTradingApi");
        Intrinsics.checkNotNullParameter(cryptoExploreStateDao, "cryptoExploreStateDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.authManager = authManager;
        this.bffCryptoTradingApi = bffCryptoTradingApi;
        this.cryptoExploreStateDao = cryptoExploreStateDao;
        this.getCryptoExploreStateEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CryptoExploreStateStore2(this, null), getLogoutKillswitch(), new CryptoExploreStateStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.streamCryptoExploreQuery = Store.create$default(this, Query.INSTANCE, "getCryptoExploreQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoExploreStateStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoExploreStateStore.streamCryptoExploreQuery$lambda$0(this.f$0, (CryptoExploreStateStore.ExploreRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoExploreStateStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoExploreStateStore.streamCryptoExploreQuery$lambda$1(this.f$0, (CryptoExploreStateStore.ExploreRequest) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamCryptoExploreQuery$lambda$0(CryptoExploreStateStore cryptoExploreStateStore, ExploreRequest it) {
        CryptoAssetTypeDto cryptoAssetTypeDto;
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<GetCryptoExploreStateRequestDto, GetCryptoExploreStateResponseDto> endpoint = cryptoExploreStateStore.getCryptoExploreStateEndpoint;
        int i = WhenMappings.$EnumSwitchMapping$0[it.getAssetType().ordinal()];
        if (i == 1) {
            cryptoAssetTypeDto = CryptoAssetTypeDto.CRYPTO_ASSET_TYPE_CRYPTO;
        } else if (i == 2) {
            cryptoAssetTypeDto = CryptoAssetTypeDto.CRYPTO_ASSET_TYPE_TOKENIZED_ETF;
        } else if (i == 3) {
            cryptoAssetTypeDto = CryptoAssetTypeDto.CRYPTO_ASSET_TYPE_TOKENIZED_STOCK;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            cryptoAssetTypeDto = null;
        }
        return Endpoint.DefaultImpls.refresh$default(endpoint, new GetCryptoExploreStateRequestDto(cryptoAssetTypeDto), it.getForce(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamCryptoExploreQuery$lambda$1(CryptoExploreStateStore cryptoExploreStateStore, ExploreRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoExploreStateStore.cryptoExploreStateDao.getExploreState(it.getAssetType());
    }

    public static /* synthetic */ Flow stream$default(CryptoExploreStateStore cryptoExploreStateStore, CryptoExploreState3 cryptoExploreState3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return cryptoExploreStateStore.stream(cryptoExploreState3, z);
    }

    public final Flow<CryptoExploreState> stream(CryptoExploreState3 assetType, boolean force) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        return this.streamCryptoExploreQuery.asFlow(new ExploreRequest(assetType, force));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoExploreStateStore.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoExploreStateStore$ExploreRequest;", "", "assetType", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;", "force", "", "<init>", "(Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;Z)V", "getAssetType", "()Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;", "getForce", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class ExploreRequest {
        private final CryptoExploreState3 assetType;
        private final boolean force;

        public static /* synthetic */ ExploreRequest copy$default(ExploreRequest exploreRequest, CryptoExploreState3 cryptoExploreState3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoExploreState3 = exploreRequest.assetType;
            }
            if ((i & 2) != 0) {
                z = exploreRequest.force;
            }
            return exploreRequest.copy(cryptoExploreState3, z);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoExploreState3 getAssetType() {
            return this.assetType;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getForce() {
            return this.force;
        }

        public final ExploreRequest copy(CryptoExploreState3 assetType, boolean force) {
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            return new ExploreRequest(assetType, force);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExploreRequest)) {
                return false;
            }
            ExploreRequest exploreRequest = (ExploreRequest) other;
            return this.assetType == exploreRequest.assetType && this.force == exploreRequest.force;
        }

        public int hashCode() {
            return (this.assetType.hashCode() * 31) + Boolean.hashCode(this.force);
        }

        public String toString() {
            return "ExploreRequest(assetType=" + this.assetType + ", force=" + this.force + ")";
        }

        public ExploreRequest(CryptoExploreState3 assetType, boolean z) {
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            this.assetType = assetType;
            this.force = z;
        }

        public final CryptoExploreState3 getAssetType() {
            return this.assetType;
        }

        public final boolean getForce() {
            return this.force;
        }
    }
}
