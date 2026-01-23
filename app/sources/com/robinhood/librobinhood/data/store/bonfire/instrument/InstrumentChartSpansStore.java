package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.models.dao.InstrumentChartSpansDao;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: InstrumentChartSpansStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartSpansStore;", "Lcom/robinhood/store/Store;", "dao", "Lcom/robinhood/models/dao/InstrumentChartSpansDao;", "instrumentsApi", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/models/dao/InstrumentChartSpansDao;Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;Lcom/robinhood/store/StoreBundle;)V", "chartSpansGetEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;", "query", "Lcom/robinhood/android/moria/db/Query;", "streamSpans", "Lio/reactivex/Observable;", "streamSpansFlow", "Lkotlinx/coroutines/flow/Flow;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class InstrumentChartSpansStore extends Store {
    private final Endpoint<Unit, InstrumentChartSpans> chartSpansGetEndpoint;
    private final InstrumentChartSpansDao dao;
    private final Query<Unit, InstrumentChartSpans> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentChartSpansStore(InstrumentChartSpansDao dao, InstrumentsApi instrumentsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dao = dao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        InstrumentChartSpansStore2 instrumentChartSpansStore2 = new InstrumentChartSpansStore2(instrumentsApi, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        InstrumentChartSpansStore3 instrumentChartSpansStore3 = new InstrumentChartSpansStore3(dao);
        Clock clock = storeBundle.getClock();
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        this.chartSpansGetEndpoint = companion.create(instrumentChartSpansStore2, logoutKillswitch, instrumentChartSpansStore3, clock, new DefaultStaleDecider(durationOfHours, storeBundle.getClock()));
        this.query = Store.create$default(this, Query.INSTANCE, "queryInstrumentChartSpans", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartSpansStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentChartSpansStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartSpansStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentChartSpansStore.query$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object chartSpansGetEndpoint$insert(InstrumentChartSpansDao instrumentChartSpansDao, InstrumentChartSpans instrumentChartSpans, Continuation continuation) {
        instrumentChartSpansDao.insert(instrumentChartSpans);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(InstrumentChartSpansStore instrumentChartSpansStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<Unit, InstrumentChartSpans> endpoint = instrumentChartSpansStore.chartSpansGetEndpoint;
        Unit unit = Unit.INSTANCE;
        Duration durationOfMinutes = Duration.ofMinutes(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, unit, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(InstrumentChartSpansStore instrumentChartSpansStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.filterNotNull(instrumentChartSpansStore.dao.stream());
    }

    public final Observable<InstrumentChartSpans> streamSpans() {
        return this.query.asObservable(Unit.INSTANCE);
    }

    public final Flow<InstrumentChartSpans> streamSpansFlow() {
        return this.query.asFlow(Unit.INSTANCE);
    }
}
