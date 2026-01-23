package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.minerva.ApiRoutingDetails;
import com.robinhood.models.dao.bonfire.RhyAccountRoutingDetailsDao;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.bonfire.RhyAccountRoutingDetails;
import com.robinhood.models.p320db.bonfire.RhyAccountRoutingDetails2;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RhyAccountRoutingDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\u0006\u0010\u0013\u001a\u00020\fJ\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u0006\u0010\u0013\u001a\u00020\fJ\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b2\u0006\u0010\u0013\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountRoutingDetailsStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/RhyAccountRoutingDetailsDao;", "<init>", "(Lcom/robinhood/api/rhy/RhyBonfireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/RhyAccountRoutingDetailsDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/minerva/ApiRoutingDetails;", "rhyAccountRoutingDetailsQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/bonfire/RhyAccountRoutingDetails;", "refresh", "", "rhyAccountId", "force", "", "streamRhyAccountRoutingDetailsObservable", "Lio/reactivex/Observable;", "streamRhyAccountRoutingDetails", "Lkotlinx/coroutines/flow/Flow;", "forceFetchRhyAccountRoutingDetails", "Lio/reactivex/Single;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyAccountRoutingDetailsStore extends Store {
    private final RhyBonfireApi bonfireApi;
    private final RhyAccountRoutingDetailsDao dao;
    private final Endpoint<UUID, ApiRoutingDetails> endpoint;
    private final Query<UUID, RhyAccountRoutingDetails> rhyAccountRoutingDetailsQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyAccountRoutingDetailsStore(RhyBonfireApi bonfireApi, StoreBundle storeBundle, RhyAccountRoutingDetailsDao dao) {
        super(storeBundle, RhyAccount.INSTANCE);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.bonfireApi = bonfireApi;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RhyAccountRoutingDetailsStore2(this, null), getLogoutKillswitch(), new RhyAccountRoutingDetailsStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.rhyAccountRoutingDetailsQuery = Store.create$default(this, Query.INSTANCE, "queryRhyAccountRoutingDetails", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyAccountRoutingDetailsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAccountRoutingDetailsStore.rhyAccountRoutingDetailsQuery$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyAccountRoutingDetailsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAccountRoutingDetailsStore.rhyAccountRoutingDetailsQuery$lambda$1(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow rhyAccountRoutingDetailsQuery$lambda$0(RhyAccountRoutingDetailsStore rhyAccountRoutingDetailsStore, UUID rhyAccountId) {
        Intrinsics.checkNotNullParameter(rhyAccountId, "rhyAccountId");
        return Endpoint.DefaultImpls.poll$default(rhyAccountRoutingDetailsStore.endpoint, rhyAccountId, RhyAccountRoutingDetails.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow rhyAccountRoutingDetailsQuery$lambda$1(RhyAccountRoutingDetailsStore rhyAccountRoutingDetailsStore, UUID rhyAccountId) {
        Intrinsics.checkNotNullParameter(rhyAccountId, "rhyAccountId");
        return rhyAccountRoutingDetailsStore.dao.getRoutingDetails(rhyAccountId);
    }

    public final void refresh(UUID rhyAccountId, boolean force) {
        Intrinsics.checkNotNullParameter(rhyAccountId, "rhyAccountId");
        Endpoint.DefaultImpls.refresh$default(this.endpoint, rhyAccountId, force, null, 4, null);
    }

    public final Observable<RhyAccountRoutingDetails> streamRhyAccountRoutingDetailsObservable(UUID rhyAccountId) {
        Intrinsics.checkNotNullParameter(rhyAccountId, "rhyAccountId");
        return this.rhyAccountRoutingDetailsQuery.asObservable(rhyAccountId);
    }

    public final Flow<RhyAccountRoutingDetails> streamRhyAccountRoutingDetails(UUID rhyAccountId) {
        Intrinsics.checkNotNullParameter(rhyAccountId, "rhyAccountId");
        return this.rhyAccountRoutingDetailsQuery.asFlow(rhyAccountId);
    }

    /* compiled from: RhyAccountRoutingDetailsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/RhyAccountRoutingDetails;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.RhyAccountRoutingDetailsStore$forceFetchRhyAccountRoutingDetails$1", m3645f = "RhyAccountRoutingDetailsStore.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyAccountRoutingDetailsStore$forceFetchRhyAccountRoutingDetails$1 */
    static final class C345371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super RhyAccountRoutingDetails>, Object> {
        final /* synthetic */ UUID $rhyAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345371(UUID uuid, Continuation<? super C345371> continuation) {
            super(2, continuation);
            this.$rhyAccountId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyAccountRoutingDetailsStore.this.new C345371(this.$rhyAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RhyAccountRoutingDetails> continuation) {
            return ((C345371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = RhyAccountRoutingDetailsStore.this.endpoint;
                UUID uuid = this.$rhyAccountId;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RhyAccountRoutingDetailsStore.this, null);
                this.label = 1;
                obj = endpoint.forceFetch(uuid, anonymousClass1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return RhyAccountRoutingDetails2.toDbModel((ApiRoutingDetails) obj);
        }

        /* compiled from: RhyAccountRoutingDetailsStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Ljava/util/UUID;", "apiRoutingDetails", "Lcom/robinhood/models/api/minerva/ApiRoutingDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.RhyAccountRoutingDetailsStore$forceFetchRhyAccountRoutingDetails$1$1", m3645f = "RhyAccountRoutingDetailsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyAccountRoutingDetailsStore$forceFetchRhyAccountRoutingDetails$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<UUID, ApiRoutingDetails, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RhyAccountRoutingDetailsStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RhyAccountRoutingDetailsStore rhyAccountRoutingDetailsStore, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = rhyAccountRoutingDetailsStore;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(UUID uuid, ApiRoutingDetails apiRoutingDetails, Continuation<? super Unit> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = apiRoutingDetails;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.dao.insert(RhyAccountRoutingDetails2.toDbModel((ApiRoutingDetails) this.L$0));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Single<RhyAccountRoutingDetails> forceFetchRhyAccountRoutingDetails(UUID rhyAccountId) {
        Intrinsics.checkNotNullParameter(rhyAccountId, "rhyAccountId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C345371(rhyAccountId, null), 1, null);
    }
}
