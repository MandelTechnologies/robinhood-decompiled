package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.dao.bonfire.InstrumentDisclosureDao;
import com.robinhood.models.p320db.bonfire.InstrumentDisclosure;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: InstrumentDisclosureStore.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/InstrumentDisclosureStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/InstrumentDisclosureDao;", "<init>", "(Lcom/robinhood/api/retrofit/BonfireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/InstrumentDisclosureDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Ljava/util/UUID;", "", "Lcom/robinhood/models/db/bonfire/InstrumentDisclosure;", "query", "Lcom/robinhood/android/moria/db/Query;", "stream", "Lkotlinx/coroutines/flow/Flow;", "instrumentId", "accountNumber", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class InstrumentDisclosureStore extends Store {
    private final InstrumentDisclosureDao dao;
    private final Endpoint<Tuples2<UUID, String>, InstrumentDisclosure> endpoint;
    private final Query<Tuples2<UUID, String>, InstrumentDisclosure> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentDisclosureStore(BonfireApi bonfireApi, StoreBundle storeBundle, InstrumentDisclosureDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new InstrumentDisclosureStore2(bonfireApi, null), getLogoutKillswitch(), new InstrumentDisclosureStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "queryInstrumentDisclosure", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.InstrumentDisclosureStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDisclosureStore.query$lambda$0(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.InstrumentDisclosureStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDisclosureStore.query$lambda$1(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(InstrumentDisclosureStore instrumentDisclosureStore, Tuples2 pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        return Endpoint.DefaultImpls.poll$default(instrumentDisclosureStore.endpoint, pair, InstrumentDisclosure.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(InstrumentDisclosureStore instrumentDisclosureStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return instrumentDisclosureStore.dao.getInstrumentDisclosure((UUID) tuples2.component1(), (String) tuples2.component2());
    }

    public final Flow<InstrumentDisclosure> stream(UUID instrumentId, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.query.asFlow(Tuples4.m3642to(instrumentId, accountNumber));
    }
}
