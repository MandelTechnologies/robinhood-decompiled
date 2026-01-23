package com.robinhood.crypto.perpetuals.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualButtonsDao;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualButtons;
import com.robinhood.crypto.models.perpetuals.p288db.SourceScreen;
import com.robinhood.crypto.models.perpetuals.p288db.SourceScreen2;
import com.robinhood.crypto.perpetuals.store.cachedService.PerpetualsButtonsCachedService;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.Uuids;
import contracts.perpetuals.proto.p433v1.GetButtonsRequestDto;
import contracts.perpetuals.proto.p433v1.GetButtonsResponseDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Duration;

/* compiled from: PerpetualsButtonsStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/store/PerpetualsButtonsStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "service", "Lcom/robinhood/crypto/perpetuals/store/cachedService/PerpetualsButtonsCachedService;", "dao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualButtonsDao;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/crypto/perpetuals/store/cachedService/PerpetualsButtonsCachedService;Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualButtonsDao;)V", "getDao", "()Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualButtonsDao;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcontracts/perpetuals/proto/v1/GetButtonsRequestDto;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualButtons;", "pollPerpetualButtons", "Lkotlinx/coroutines/flow/Flow;", "sourceScreen", "Lcom/robinhood/crypto/models/perpetuals/db/SourceScreen;", "perpetualContractId", "Ljava/util/UUID;", "lib-store-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PerpetualsButtonsStore extends Store {
    private final PerpetualButtonsDao dao;
    private final Endpoint<GetButtonsRequestDto, GetButtonsResponseDto> endpoint;
    private final Query<GetButtonsRequestDto, PerpetualButtons> query;

    public final PerpetualButtonsDao getDao() {
        return this.dao;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualsButtonsStore(StoreBundle storeBundle, PerpetualsButtonsCachedService service, PerpetualButtonsDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new PerpetualsButtonsStore2(service, null), getLogoutKillswitch(), new PerpetualsButtonsStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "perpetualButtonsQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsButtonsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualsButtonsStore.query$lambda$0(this.f$0, (GetButtonsRequestDto) obj);
            }
        })), new Function1() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsButtonsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualsButtonsStore.query$lambda$1(this.f$0, (GetButtonsRequestDto) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(PerpetualsButtonsStore perpetualsButtonsStore, GetButtonsRequestDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<GetButtonsRequestDto, GetButtonsResponseDto> endpoint = perpetualsButtonsStore.endpoint;
        Duration durationOfSeconds = Duration.ofSeconds(4L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, it, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(PerpetualsButtonsStore perpetualsButtonsStore, GetButtonsRequestDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PerpetualButtonsDao perpetualButtonsDao = perpetualsButtonsStore.dao;
        SourceScreen dbModel = SourceScreen2.toDbModel(it.getSource_screen());
        String perpetual_contract_id = it.getPerpetual_contract_id();
        if (perpetual_contract_id == null) {
            perpetual_contract_id = "";
        }
        return perpetualButtonsDao.getPerpetualDetailButtons(dbModel, perpetual_contract_id);
    }

    public final Flow<PerpetualButtons> pollPerpetualButtons(SourceScreen sourceScreen, UUID perpetualContractId) {
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        return this.query.asFlow(new GetButtonsRequestDto(SourceScreen2.toDto(sourceScreen), perpetualContractId != null ? Uuids.safeToString(perpetualContractId) : null));
    }
}
