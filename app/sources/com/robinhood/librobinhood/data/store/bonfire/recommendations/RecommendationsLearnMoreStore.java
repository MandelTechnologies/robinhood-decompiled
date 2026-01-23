package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.models.dao.RecommendationsLearnMoreDao;
import com.robinhood.recommendations.models.api.RecommendationsLearnMoreEntryPoint;
import com.robinhood.recommendations.models.p362db.RecommendationsLearnMore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RecommendationsLearnMoreStore.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsLearnMoreStore;", "Lcom/robinhood/store/Store;", "recommendationsApi", "Lcom/robinhood/api/retrofit/RecommendationsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/RecommendationsLearnMoreDao;", "<init>", "(Lcom/robinhood/api/retrofit/RecommendationsApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/RecommendationsLearnMoreDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/recommendations/models/api/RecommendationsLearnMoreEntryPoint;", "Lcom/robinhood/recommendations/models/db/RecommendationsLearnMore;", "query", "Lcom/robinhood/android/moria/db/Query;", "streamLearnMore", "Lio/reactivex/Observable;", "instrumentId", "entryPoint", "lib-store-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RecommendationsLearnMoreStore extends Store {
    private final RecommendationsLearnMoreDao dao;
    private final Endpoint<Tuples2<UUID, RecommendationsLearnMoreEntryPoint>, RecommendationsLearnMore> endpoint;
    private final Query<Tuples2<UUID, ? extends RecommendationsLearnMoreEntryPoint>, RecommendationsLearnMore> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsLearnMoreStore(RecommendationsApi recommendationsApi, StoreBundle storeBundle, RecommendationsLearnMoreDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(recommendationsApi, "recommendationsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RecommendationsLearnMoreStore2(recommendationsApi, null), getLogoutKillswitch(), new RecommendationsLearnMoreStore3(dao), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "recommendationsLearnMore", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsLearnMoreStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsLearnMoreStore.query$lambda$0(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsLearnMoreStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsLearnMoreStore.query$lambda$1(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object endpoint$insert(RecommendationsLearnMoreDao recommendationsLearnMoreDao, RecommendationsLearnMore recommendationsLearnMore, Continuation continuation) {
        recommendationsLearnMoreDao.insert((RecommendationsLearnMoreDao) recommendationsLearnMore);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job query$lambda$0(RecommendationsLearnMoreStore recommendationsLearnMoreStore, Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(recommendationsLearnMoreStore.endpoint, it, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(RecommendationsLearnMoreStore recommendationsLearnMoreStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return recommendationsLearnMoreStore.dao.getLearnMore((UUID) tuples2.component1(), ((RecommendationsLearnMoreEntryPoint) tuples2.component2()).getServerValue());
    }

    public final Observable<RecommendationsLearnMore> streamLearnMore(UUID instrumentId, RecommendationsLearnMoreEntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return this.query.asObservable(Tuples4.m3642to(instrumentId, entryPoint));
    }
}
