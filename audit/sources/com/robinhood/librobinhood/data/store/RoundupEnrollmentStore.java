package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.pluto.PlutoApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.pluto.ApiRoundupEnrollment;
import com.robinhood.models.api.pluto.RoundupInvestmentType;
import com.robinhood.models.dao.RoundupEnrollmentDao;
import com.robinhood.models.p320db.mcduckling.RoundupEnrollment;
import com.robinhood.models.p320db.mcduckling.RoundupEnrollment2;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RoundupEnrollmentStore.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u001bJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c2\u0006\u0010\u001d\u001a\u00020\u0013J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001cJ\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "Lcom/robinhood/store/Store;", "pluto", "Lcom/robinhood/api/pluto/PlutoApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/RoundupEnrollmentDao;", "<init>", "(Lcom/robinhood/api/pluto/PlutoApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/RoundupEnrollmentDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/mcduckling/RoundupEnrollment;", "createEnrollment", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$CreateRequest;", "updateEnrollment", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$UpdateRequest;", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "stream", "Lio/reactivex/Observable;", "Lio/reactivex/Single;", "request", "pauseEnrollment", "resumeEnrollment", "investmentType", "Lcom/robinhood/models/api/pluto/RoundupInvestmentType;", "investmentAssetId", "Ljava/util/UUID;", "updateRoundupInvestment", "Companion", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RoundupEnrollmentStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ApiRoundupEnrollment ROUNDUP_ENROLLMENT_INITIAL_STATE;
    private final PostEndpoint<ApiRoundupEnrollment.CreateRequest, ApiRoundupEnrollment> createEnrollment;
    private final RoundupEnrollmentDao dao;
    private final Endpoint<Unit, ApiRoundupEnrollment> endpoint;
    private final PlutoApi pluto;
    private final Query<Unit, RoundupEnrollment> query;
    private final PostEndpoint<ApiRoundupEnrollment.UpdateRequest, ApiRoundupEnrollment> updateEnrollment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundupEnrollmentStore(PlutoApi pluto, StoreBundle storeBundle, RoundupEnrollmentDao dao) {
        super(storeBundle, RoundupEnrollment.INSTANCE);
        Intrinsics.checkNotNullParameter(pluto, "pluto");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.pluto = pluto;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RoundupEnrollmentStore2(this, null), getLogoutKillswitch(), new RoundupEnrollmentStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "streamRoundupEnrollment", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.RoundupEnrollmentStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupEnrollmentStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.RoundupEnrollmentStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupEnrollmentStore.query$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.createEnrollment = companion.create(new C343071(pluto), new C343082(null));
        this.updateEnrollment = companion.create(new C343101(pluto), new C343112(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(RoundupEnrollmentStore roundupEnrollmentStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(roundupEnrollmentStore.endpoint, Unit.INSTANCE, RoundupEnrollment.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(RoundupEnrollmentStore roundupEnrollmentStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return roundupEnrollmentStore.dao.getRoundupEnrollment();
    }

    /* compiled from: RoundupEnrollmentStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.RoundupEnrollmentStore$createEnrollment$1 */
    /* synthetic */ class C343071 extends FunctionReferenceImpl implements Function2<ApiRoundupEnrollment.CreateRequest, Continuation<? super ApiRoundupEnrollment>, Object>, ContinuationImpl6 {
        C343071(Object obj) {
            super(2, obj, PlutoApi.class, "createRoundupEnrollment", "createRoundupEnrollment(Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$CreateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiRoundupEnrollment.CreateRequest createRequest, Continuation<? super ApiRoundupEnrollment> continuation) {
            return ((PlutoApi) this.receiver).createRoundupEnrollment(createRequest, continuation);
        }
    }

    /* compiled from: RoundupEnrollmentStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiRoundupEnrollment", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RoundupEnrollmentStore$createEnrollment$2", m3645f = "RoundupEnrollmentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.RoundupEnrollmentStore$createEnrollment$2 */
    static final class C343082 extends ContinuationImpl7 implements Function2<ApiRoundupEnrollment, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C343082(Continuation<? super C343082> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C343082 c343082 = RoundupEnrollmentStore.this.new C343082(continuation);
            c343082.L$0 = obj;
            return c343082;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiRoundupEnrollment apiRoundupEnrollment, Continuation<? super Unit> continuation) {
            return ((C343082) create(apiRoundupEnrollment, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                RoundupEnrollmentStore.this.dao.insert(RoundupEnrollment2.toDbModel((ApiRoundupEnrollment) this.L$0));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: RoundupEnrollmentStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.RoundupEnrollmentStore$updateEnrollment$1 */
    /* synthetic */ class C343101 extends FunctionReferenceImpl implements Function2<ApiRoundupEnrollment.UpdateRequest, Continuation<? super ApiRoundupEnrollment>, Object>, ContinuationImpl6 {
        C343101(Object obj) {
            super(2, obj, PlutoApi.class, "updateRoundupEnrollment", "updateRoundupEnrollment(Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$UpdateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiRoundupEnrollment.UpdateRequest updateRequest, Continuation<? super ApiRoundupEnrollment> continuation) {
            return ((PlutoApi) this.receiver).updateRoundupEnrollment(updateRequest, continuation);
        }
    }

    /* compiled from: RoundupEnrollmentStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiRoundupEnrollment", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RoundupEnrollmentStore$updateEnrollment$2", m3645f = "RoundupEnrollmentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.RoundupEnrollmentStore$updateEnrollment$2 */
    static final class C343112 extends ContinuationImpl7 implements Function2<ApiRoundupEnrollment, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C343112(Continuation<? super C343112> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C343112 c343112 = RoundupEnrollmentStore.this.new C343112(continuation);
            c343112.L$0 = obj;
            return c343112;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiRoundupEnrollment apiRoundupEnrollment, Continuation<? super Unit> continuation) {
            return ((C343112) create(apiRoundupEnrollment, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                RoundupEnrollmentStore.this.dao.insert(RoundupEnrollment2.toDbModel((ApiRoundupEnrollment) this.L$0));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Job refresh(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, Unit.INSTANCE, force, null, 4, null);
    }

    public final Observable<RoundupEnrollment> stream() {
        return this.query.asObservable(Unit.INSTANCE);
    }

    /* compiled from: RoundupEnrollmentStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/mcduckling/RoundupEnrollment;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RoundupEnrollmentStore$createEnrollment$3", m3645f = "RoundupEnrollmentStore.kt", m3646l = {84}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.RoundupEnrollmentStore$createEnrollment$3 */
    static final class C343093 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super RoundupEnrollment>, Object> {
        final /* synthetic */ ApiRoundupEnrollment.CreateRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343093(ApiRoundupEnrollment.CreateRequest createRequest, Continuation<? super C343093> continuation) {
            super(2, continuation);
            this.$request = createRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RoundupEnrollmentStore.this.new C343093(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RoundupEnrollment> continuation) {
            return ((C343093) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = RoundupEnrollmentStore.this.createEnrollment;
                ApiRoundupEnrollment.CreateRequest createRequest = this.$request;
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, createRequest, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return RoundupEnrollment2.toDbModel((ApiRoundupEnrollment) obj);
        }
    }

    public final Single<RoundupEnrollment> createEnrollment(ApiRoundupEnrollment.CreateRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C343093(request, null), 1, null);
    }

    public final Single<RoundupEnrollment> pauseEnrollment() {
        return updateEnrollment(new ApiRoundupEnrollment.UpdateRequest(ApiRoundupEnrollment.State.INACTIVE, null, null, 6, null));
    }

    public final Single<RoundupEnrollment> resumeEnrollment(RoundupInvestmentType investmentType, UUID investmentAssetId) {
        Intrinsics.checkNotNullParameter(investmentType, "investmentType");
        Intrinsics.checkNotNullParameter(investmentAssetId, "investmentAssetId");
        return updateEnrollment(new ApiRoundupEnrollment.UpdateRequest(ApiRoundupEnrollment.State.ACTIVE, investmentType, investmentAssetId));
    }

    public final Single<RoundupEnrollment> updateRoundupInvestment(RoundupInvestmentType investmentType, UUID investmentAssetId) {
        Intrinsics.checkNotNullParameter(investmentType, "investmentType");
        Intrinsics.checkNotNullParameter(investmentAssetId, "investmentAssetId");
        return updateEnrollment(new ApiRoundupEnrollment.UpdateRequest(null, investmentType, investmentAssetId, 1, null));
    }

    /* compiled from: RoundupEnrollmentStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/mcduckling/RoundupEnrollment;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RoundupEnrollmentStore$updateEnrollment$3", m3645f = "RoundupEnrollmentStore.kt", m3646l = {118}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.RoundupEnrollmentStore$updateEnrollment$3 */
    static final class C343123 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super RoundupEnrollment>, Object> {
        final /* synthetic */ ApiRoundupEnrollment.UpdateRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343123(ApiRoundupEnrollment.UpdateRequest updateRequest, Continuation<? super C343123> continuation) {
            super(2, continuation);
            this.$request = updateRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RoundupEnrollmentStore.this.new C343123(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RoundupEnrollment> continuation) {
            return ((C343123) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = RoundupEnrollmentStore.this.updateEnrollment;
                ApiRoundupEnrollment.UpdateRequest updateRequest = this.$request;
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, updateRequest, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return RoundupEnrollment2.toDbModel((ApiRoundupEnrollment) obj);
        }
    }

    private final Single<RoundupEnrollment> updateEnrollment(ApiRoundupEnrollment.UpdateRequest request) {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C343123(request, null), 1, null);
    }

    /* compiled from: RoundupEnrollmentStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore$Companion;", "", "<init>", "()V", "ROUNDUP_ENROLLMENT_INITIAL_STATE", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment;", "getROUNDUP_ENROLLMENT_INITIAL_STATE", "()Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment;", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ApiRoundupEnrollment getROUNDUP_ENROLLMENT_INITIAL_STATE() {
            return RoundupEnrollmentStore.ROUNDUP_ENROLLMENT_INITIAL_STATE;
        }
    }

    static {
        ApiRoundupEnrollment.State state = ApiRoundupEnrollment.State.SIGNUP;
        UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-00000000000");
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        RoundupInvestmentType roundupInvestmentType = RoundupInvestmentType.UNKNOWN;
        UUID uuidFromString2 = UUID.fromString("00000000-0000-0000-0000-00000000000");
        Intrinsics.checkNotNullExpressionValue(uuidFromString2, "fromString(...)");
        ROUNDUP_ENROLLMENT_INITIAL_STATE = new ApiRoundupEnrollment(state, uuidFromString, "000000000", null, roundupInvestmentType, uuidFromString2, null);
    }
}
