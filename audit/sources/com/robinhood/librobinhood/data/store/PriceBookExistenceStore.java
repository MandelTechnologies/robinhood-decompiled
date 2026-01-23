package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.models.api.ApiPriceBookExistenceResult;
import com.robinhood.models.dao.PriceBookExistenceDao;
import com.robinhood.models.p355ui.PriceBookExistence;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: PriceBookExistenceStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0013\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PriceBookExistenceStore;", "Lcom/robinhood/store/Store;", "equitiesBrokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "priceBookExistenceDao", "Lcom/robinhood/models/dao/PriceBookExistenceDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/equity/EquitiesBrokeback;Lcom/robinhood/models/dao/PriceBookExistenceDao;Lcom/robinhood/store/StoreBundle;)V", "priceBookExistenceQuery", "Lcom/robinhood/android/moria/db/Query;", "Ljava/util/UUID;", "Lcom/robinhood/models/ui/PriceBookExistence;", "priceBookExistenceEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/ApiPriceBookExistenceResult;", "streamPriceBookExistence", "Lkotlinx/coroutines/flow/Flow;", "instrumentId", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class PriceBookExistenceStore extends Store {
    private final EquitiesBrokeback equitiesBrokeback;
    private final PriceBookExistenceDao priceBookExistenceDao;
    private final Endpoint<UUID, ApiPriceBookExistenceResult> priceBookExistenceEndpoint;
    private final Query<UUID, PriceBookExistence> priceBookExistenceQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceBookExistenceStore(EquitiesBrokeback equitiesBrokeback, PriceBookExistenceDao priceBookExistenceDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
        Intrinsics.checkNotNullParameter(priceBookExistenceDao, "priceBookExistenceDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.equitiesBrokeback = equitiesBrokeback;
        this.priceBookExistenceDao = priceBookExistenceDao;
        this.priceBookExistenceQuery = Store.create$default(this, Query.INSTANCE, "hasPriceBook", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.PriceBookExistenceStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PriceBookExistenceStore.priceBookExistenceQuery$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.PriceBookExistenceStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PriceBookExistenceStore.priceBookExistenceQuery$lambda$1(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        PriceBookExistenceStore2 priceBookExistenceStore2 = new PriceBookExistenceStore2(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        PriceBookExistenceStore3 priceBookExistenceStore3 = new PriceBookExistenceStore3(this, null);
        Clock clock = storeBundle.getClock();
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        this.priceBookExistenceEndpoint = companion.create(priceBookExistenceStore2, logoutKillswitch, priceBookExistenceStore3, clock, new DefaultStaleDecider(durationOfMinutes, storeBundle.getClock()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow priceBookExistenceQuery$lambda$0(PriceBookExistenceStore priceBookExistenceStore, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return Endpoint.DefaultImpls.poll$default(priceBookExistenceStore.priceBookExistenceEndpoint, id, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow priceBookExistenceQuery$lambda$1(PriceBookExistenceStore priceBookExistenceStore, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return priceBookExistenceStore.priceBookExistenceDao.streamPriceBookExistence(instrumentId);
    }

    public final Flow<PriceBookExistence> streamPriceBookExistence(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return this.priceBookExistenceQuery.asFlow(instrumentId);
    }
}
