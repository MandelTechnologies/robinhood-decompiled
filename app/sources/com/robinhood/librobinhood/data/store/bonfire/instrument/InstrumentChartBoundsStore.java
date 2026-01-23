package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.models.dao.InstrumentChartBoundsDao;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartBounds;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Instant;

/* compiled from: InstrumentChartBoundsStore.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR&\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R)\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartBoundsStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "instrumentsApi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/InstrumentChartBoundsDao;", "dao", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/InstrumentChartBoundsDao;)V", "Lcom/robinhood/models/dao/InstrumentChartBoundsDao;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/utils/Optional;", "j$/time/Instant", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartBounds;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "query", "Lcom/robinhood/android/moria/db/Query;", "getQuery", "()Lcom/robinhood/android/moria/db/Query;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class InstrumentChartBoundsStore extends Store {
    private final InstrumentChartBoundsDao dao;
    private final Endpoint<Optional<Instant>, InstrumentChartBounds> endpoint;
    private final Query<Optional<Instant>, InstrumentChartBounds> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentChartBoundsStore(InstrumentsApi instrumentsApi, StoreBundle storeBundle, InstrumentChartBoundsDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new InstrumentChartBoundsStore2(instrumentsApi, null), getLogoutKillswitch(), new InstrumentChartBoundsStore3(dao), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "pollChartBounds", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartBoundsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentChartBoundsStore.query$lambda$0(this.f$0, (Optional) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartBoundsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentChartBoundsStore.query$lambda$1(this.f$0, (Optional) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object endpoint$insert(InstrumentChartBoundsDao instrumentChartBoundsDao, InstrumentChartBounds instrumentChartBounds, Continuation continuation) {
        instrumentChartBoundsDao.insert(instrumentChartBounds);
        return Unit.INSTANCE;
    }

    public final Query<Optional<Instant>, InstrumentChartBounds> getQuery() {
        return this.query;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(InstrumentChartBoundsStore instrumentChartBoundsStore, Optional it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(instrumentChartBoundsStore.endpoint, it, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(InstrumentChartBoundsStore instrumentChartBoundsStore, Optional it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return instrumentChartBoundsStore.dao.getInstrumentChartBounds();
    }
}
