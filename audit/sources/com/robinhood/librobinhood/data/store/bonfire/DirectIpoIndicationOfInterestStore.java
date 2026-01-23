package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.directipo.models.api.ApiDirectIpoIndicationOfInterest;
import com.robinhood.directipo.models.p292db.DirectIpoEnrollment;
import com.robinhood.directipo.models.p292db.DirectIpoIndicationOfInterest;
import com.robinhood.models.dao.bonfire.DirectIpoIndicationOfInterestDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
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
import kotlinx.coroutines.flow.Flow;

/* compiled from: DirectIpoIndicationOfInterestStore.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\u0006\u0010\u0018\u001a\u00020\fJ\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u00150\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/DirectIpoIndicationOfInterestStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/DirectIpoIndicationOfInterestDao;", "<init>", "(Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/DirectIpoIndicationOfInterestDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/directipo/models/api/ApiDirectIpoIndicationOfInterest;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/directipo/models/db/DirectIpoIndicationOfInterest;", "enrollPostEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lkotlin/Pair;", "", "Lcom/robinhood/directipo/models/db/DirectIpoEnrollment;", "getIndicationOfInterest", "Lio/reactivex/Observable;", "instrumentId", "enrollInDirectIpoInstrument", "Lio/reactivex/Single;", "accountNumber", "lib-store-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class DirectIpoIndicationOfInterestStore extends Store {
    private final DirectIpoApi api;
    private final DirectIpoIndicationOfInterestDao dao;
    private final Endpoint<UUID, ApiDirectIpoIndicationOfInterest> endpoint;
    private final PostEndpoint<Tuples2<UUID, String>, DirectIpoEnrollment> enrollPostEndpoint;
    private final Query<UUID, DirectIpoIndicationOfInterest> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectIpoIndicationOfInterestStore(DirectIpoApi api, StoreBundle storeBundle, DirectIpoIndicationOfInterestDao dao) {
        super(storeBundle, DirectIpoIndicationOfInterest.INSTANCE);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.api = api;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new DirectIpoIndicationOfInterestStore2(api), getLogoutKillswitch(), new DirectIpoIndicationOfInterestStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "directIpoIndicationOfInterest", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.DirectIpoIndicationOfInterestStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoIndicationOfInterestStore.query$lambda$0(this.f$0, (UUID) obj);
            }
        })), new DirectIpoIndicationOfInterestStore6(dao), false, 8, null);
        this.enrollPostEndpoint = PostEndpoint.INSTANCE.create(new DirectIpoIndicationOfInterestStore4(this, null), new DirectIpoIndicationOfInterestStore5(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(DirectIpoIndicationOfInterestStore directIpoIndicationOfInterestStore, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return Endpoint.DefaultImpls.poll$default(directIpoIndicationOfInterestStore.endpoint, instrumentId, DirectIpoIndicationOfInterest.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    public final Observable<DirectIpoIndicationOfInterest> getIndicationOfInterest(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return this.query.asObservable(instrumentId);
    }

    /* compiled from: DirectIpoIndicationOfInterestStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/directipo/models/db/DirectIpoEnrollment;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.DirectIpoIndicationOfInterestStore$enrollInDirectIpoInstrument$1", m3645f = "DirectIpoIndicationOfInterestStore.kt", m3646l = {56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.DirectIpoIndicationOfInterestStore$enrollInDirectIpoInstrument$1 */
    static final class C344911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super DirectIpoEnrollment>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344911(UUID uuid, String str, Continuation<? super C344911> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DirectIpoIndicationOfInterestStore.this.new C344911(this.$instrumentId, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DirectIpoEnrollment> continuation) {
            return ((C344911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            PostEndpoint postEndpoint = DirectIpoIndicationOfInterestStore.this.enrollPostEndpoint;
            Tuples2 tuples2 = new Tuples2(this.$instrumentId, this.$accountNumber);
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<DirectIpoEnrollment> enrollInDirectIpoInstrument(UUID instrumentId, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C344911(instrumentId, accountNumber, null), 1, null);
    }
}
