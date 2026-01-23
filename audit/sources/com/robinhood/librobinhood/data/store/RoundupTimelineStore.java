package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.pluto.PlutoApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.pluto.ApiRoundupTimeline;
import com.robinhood.models.dao.RoundupTimelineDao;
import com.robinhood.models.p320db.mcduckling.RoundupOverview;
import com.robinhood.models.p320db.mcduckling.RoundupTimeline;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RoundupTimelineStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a2\u0006\u0010\u0016\u001a\u00020\fJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c2\u0006\u0010\u0016\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RoundupTimelineStore;", "Lcom/robinhood/store/Store;", "pluto", "Lcom/robinhood/api/pluto/PlutoApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/RoundupTimelineDao;", "<init>", "(Lcom/robinhood/api/pluto/PlutoApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/RoundupTimelineDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/pluto/ApiRoundupTimeline;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/mcduckling/RoundupTimeline;", "skipRoundupOrderEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "", "refresh", "Lkotlinx/coroutines/Job;", "id", "force", "", "stream", "Lio/reactivex/Observable;", "skipRoundupOrder", "Lio/reactivex/Single;", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RoundupTimelineStore extends Store {
    private final RoundupTimelineDao dao;
    private final Endpoint<UUID, ApiRoundupTimeline> endpoint;
    private final PlutoApi pluto;
    private final Query<UUID, RoundupTimeline> query;
    private final PostEndpoint<UUID, Unit> skipRoundupOrderEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundupTimelineStore(PlutoApi pluto, StoreBundle storeBundle, RoundupTimelineDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(pluto, "pluto");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.pluto = pluto;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RoundupTimelineStore2(this, null), getLogoutKillswitch(), new RoundupTimelineStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "streamRoundupTimeline", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.RoundupTimelineStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupTimelineStore.query$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.RoundupTimelineStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupTimelineStore.query$lambda$1(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.skipRoundupOrderEndpoint = PostEndpoint.INSTANCE.create(new RoundupTimelineStore4(pluto), new RoundupTimelineStore5(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(RoundupTimelineStore roundupTimelineStore, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return Endpoint.DefaultImpls.poll$default(roundupTimelineStore.endpoint, id, RoundupOverview.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(RoundupTimelineStore roundupTimelineStore, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return roundupTimelineStore.dao.getRoundupTimeline(id);
    }

    public final Job refresh(UUID id, boolean force) {
        Intrinsics.checkNotNullParameter(id, "id");
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, id, force, null, 4, null);
    }

    public final Observable<RoundupTimeline> stream(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.query.asObservable(id);
    }

    /* compiled from: RoundupTimelineStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RoundupTimelineStore$skipRoundupOrder$1", m3645f = "RoundupTimelineStore.kt", m3646l = {64}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.RoundupTimelineStore$skipRoundupOrder$1 */
    static final class C343131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343131(UUID uuid, Continuation<? super C343131> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RoundupTimelineStore.this.new C343131(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C343131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = RoundupTimelineStore.this.skipRoundupOrderEndpoint;
                UUID uuid = this.$id;
                this.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, uuid, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Single<Unit> skipRoundupOrder(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C343131(id, null), 1, null);
    }
}
