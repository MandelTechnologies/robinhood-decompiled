package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaTreatment;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.models.p320db.matcha.MatchaTreatment;
import com.robinhood.models.p320db.matcha.dao.MatchaTreatmentDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MatchaTreatmentStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012J\u0010\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/api/matcha/MatchaApi;", "dao", "Lcom/robinhood/models/db/matcha/dao/MatchaTreatmentDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/models/db/matcha/dao/MatchaTreatmentDao;Lcom/robinhood/store/StoreBundle;)V", "getTreatment", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTreatment;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/matcha/MatchaTreatment;", "stream", "Lio/reactivex/Observable;", "streamCanInitiate", "", "refresh", "Lkotlinx/coroutines/Job;", "force", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MatchaTreatmentStore extends Store {
    private final MatchaApi api;
    private final MatchaTreatmentDao dao;
    private final Endpoint<Unit, ApiMatchaTreatment> getTreatment;
    private final Query<Unit, MatchaTreatment> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaTreatmentStore(MatchaApi api, MatchaTreatmentDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.dao = dao;
        Endpoint<Unit, ApiMatchaTreatment> endpointCreate = Endpoint.INSTANCE.create(new MatchaTreatmentStore2(this, null), getLogoutKillswitch(), new MatchaTreatmentStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getONE_MINUTE(), storeBundle.getClock()));
        this.getTreatment = endpointCreate;
        this.query = Store.create$default(this, Query.INSTANCE, "streamTreatment", CollectionsKt.listOf(new RefreshEach(new MatchaTreatmentStore4(endpointCreate))), new Function1() { // from class: com.robinhood.android.store.matcha.MatchaTreatmentStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaTreatmentStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(MatchaTreatmentStore matchaTreatmentStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return matchaTreatmentStore.dao.getTreatment();
    }

    public final Observable<MatchaTreatment> stream() {
        return this.query.asObservable(Unit.INSTANCE);
    }

    public final Observable<Boolean> streamCanInitiate() {
        Observable map = this.query.asObservable(Unit.INSTANCE).map(new Function() { // from class: com.robinhood.android.store.matcha.MatchaTreatmentStore.streamCanInitiate.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(MatchaTreatment it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getRolloutStatus() == ApiMatchaTreatment.RolloutStatus.CAN_INITIATE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static /* synthetic */ Job refresh$default(MatchaTreatmentStore matchaTreatmentStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return matchaTreatmentStore.refresh(z);
    }

    public final Job refresh(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.getTreatment, Unit.INSTANCE, force, null, 4, null);
    }
}
