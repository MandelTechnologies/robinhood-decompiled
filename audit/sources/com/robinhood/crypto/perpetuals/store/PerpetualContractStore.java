package com.robinhood.crypto.perpetuals.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualContractDao;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualContract;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.Uuids;
import crypto_perpetuals.service.p440v1.CryptoPerpetualsService;
import crypto_perpetuals.service.p440v1.GetContractRequestDto;
import crypto_perpetuals.service.p440v1.GetContractResponseDto;
import crypto_perpetuals.service.p440v1.ListContractRequestDto;
import crypto_perpetuals.service.p440v1.ListContractResponseDto;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PerpetualContractStore.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00190\u001bJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020 J\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00190\u001bJ\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00190\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "service", "Lcrypto_perpetuals/service/v1/CryptoPerpetualsService;", "contractDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualContractDao;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/shared/app/type/AppType;Lcrypto_perpetuals/service/v1/CryptoPerpetualsService;Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualContractDao;Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "getContractEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcrypto_perpetuals/service/v1/GetContractRequestDto;", "Lcrypto_perpetuals/service/v1/GetContractResponseDto;", "listContractsEndpoint", "Lcrypto_perpetuals/service/v1/ListContractRequestDto;", "Lcrypto_perpetuals/service/v1/ListContractResponseDto;", "getContractQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualContract;", "listContractsQuery", "", "getPerpetualContract", "Lkotlinx/coroutines/flow/Flow;", "contractId", "Ljava/util/UUID;", "getAllPerpetualContracts", "refresh", "", "refreshAll", "streamCachedContracts", "getContractRequest", "lib-store-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PerpetualContractStore extends Store {
    private final AppType appType;
    private final PerpetualContractDao contractDao;
    private final Endpoint<GetContractRequestDto, GetContractResponseDto> getContractEndpoint;
    private final Query<GetContractRequestDto, PerpetualContract> getContractQuery;
    private final Endpoint<ListContractRequestDto, ListContractResponseDto> listContractsEndpoint;
    private final Query<ListContractRequestDto, List<PerpetualContract>> listContractsQuery;
    private final RegionGateProvider regionGateProvider;
    private final CryptoPerpetualsService service;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualContractStore(StoreBundle storeBundle, AppType appType, CryptoPerpetualsService service, PerpetualContractDao contractDao, RegionGateProvider regionGateProvider) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(contractDao, "contractDao");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.appType = appType;
        this.service = service;
        this.contractDao = contractDao;
        this.regionGateProvider = regionGateProvider;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<GetContractRequestDto, GetContractResponseDto> endpointCreate$default = Endpoint.Companion.create$default(companion, new PerpetualContractStore2(service), getLogoutKillswitch(), new PerpetualContractStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.getContractEndpoint = endpointCreate$default;
        Endpoint<ListContractRequestDto, ListContractResponseDto> endpointCreate$default2 = Endpoint.Companion.create$default(companion, new PerpetualContractStore5(this, null), getLogoutKillswitch(), new PerpetualContractStore6(this, null), storeBundle.getClock(), null, 16, null);
        this.listContractsEndpoint = endpointCreate$default2;
        Query.Companion companion2 = Query.INSTANCE;
        this.getContractQuery = Store.create$default(this, companion2, "getContractQuery", CollectionsKt.listOf(new RefreshEach(new PerpetualContractStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualContractStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualContractStore.getContractQuery$lambda$0(this.f$0, (GetContractRequestDto) obj);
            }
        }, false, 8, null);
        this.listContractsQuery = Store.create$default(this, companion2, "listContractsQuery", CollectionsKt.listOf(new RefreshEach(new PerpetualContractStore7(endpointCreate$default2))), new Function1() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualContractStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualContractStore.listContractsQuery$lambda$2(this.f$0, (ListContractRequestDto) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getContractQuery$lambda$0(PerpetualContractStore perpetualContractStore, GetContractRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return perpetualContractStore.contractDao.getPerpetualContract(StringsKt.toUuid(request.getContract_id()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow listContractsQuery$lambda$2(PerpetualContractStore perpetualContractStore, ListContractRequestDto listContractRequestDto) {
        Intrinsics.checkNotNullParameter(listContractRequestDto, "<unused var>");
        return perpetualContractStore.contractDao.getAllPerpetualContracts();
    }

    public final Flow<PerpetualContract> getPerpetualContract(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        if (this.appType == AppType.RHC) {
            return this.getContractQuery.asFlow(getContractRequest(contractId));
        }
        return FlowKt.emptyFlow();
    }

    public final Flow<List<PerpetualContract>> getAllPerpetualContracts() {
        if (this.appType == AppType.RHC) {
            return this.listContractsQuery.asFlow(new ListContractRequestDto(null, 1, null));
        }
        return FlowKt.emptyFlow();
    }

    public final void refresh(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        if (this.appType == AppType.RHC) {
            Endpoint.DefaultImpls.refresh$default(this.getContractEndpoint, getContractRequest(contractId), false, null, 6, null);
        }
    }

    public final void refreshAll() {
        if (this.appType == AppType.RHC) {
            Endpoint.DefaultImpls.refresh$default(this.listContractsEndpoint, new ListContractRequestDto(null, 1, null), false, null, 6, null);
        }
    }

    public final Flow<List<PerpetualContract>> streamCachedContracts() {
        if (this.appType == AppType.RHC) {
            return this.contractDao.getAllPerpetualContracts();
        }
        return FlowKt.emptyFlow();
    }

    private final GetContractRequestDto getContractRequest(UUID contractId) {
        return new GetContractRequestDto(Uuids.safeToString(contractId));
    }
}
