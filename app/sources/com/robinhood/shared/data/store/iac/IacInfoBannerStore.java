package com.robinhood.shared.data.store.iac;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiIacActionRequest;
import com.robinhood.models.api.ApiIacInfoBannerBatchResponse;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.dao.IacInfoBannerDao;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.shared.api.iac.IacInfoBannerApi;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import retrofit2.Response;

/* compiled from: IacInfoBannerStore.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0098\u0001\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001d2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\rJ\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0 2\u0006\u0010.\u001a\u00020\u0010J\u0096\u0001\u0010/\u001a\u00020\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001d2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\r2\b\b\u0002\u00100\u001a\u000201J\u000e\u00102\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u00103J\u000e\u0010\u0013\u001a\u0002042\u0006\u00105\u001a\u00020\rJ\u0018\u0010\u0016\u001a\u0002042\u0006\u00105\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u00010+J\u0016\u0010\u0019\u001a\u0002042\u0006\u00105\u001a\u00020\r2\u0006\u00107\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0019\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001a0\u0017\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, m3636d2 = {"Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "Lcom/robinhood/store/Store;", "iacInfoBannerApi", "Lcom/robinhood/shared/api/iac/IacInfoBannerApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/IacInfoBannerDao;", "<init>", "(Lcom/robinhood/shared/api/iac/IacInfoBannerApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/IacInfoBannerDao;)V", "dismissedReceiptUuidsRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "Ljava/util/UUID;", "getBatch", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/shared/data/store/iac/IacInfoBannersBatchParams;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIacInfoBannerBatchResponse;", "postSeen", "Lcom/robinhood/android/moria/network/PostEndpoint;", "", "postTapped", "Lkotlin/Pair;", "Lcom/robinhood/models/api/ApiIacActionRequest;", "postDismissed", "Lcom/robinhood/models/api/IacDismissMethod;", "streamBatchIacInfoBanner", "Lcom/robinhood/android/moria/db/Query;", "", "Lcom/robinhood/models/db/IacInfoBanner;", "streamBatch", "Lio/reactivex/Observable;", "locations", "Lcom/robinhood/models/db/IacInfoBannerLocation;", "instrumentId", "currencyPairId", "perpetualContractId", "optionChainId", "listId", "eventId", "futuresContractId", "optionStrategyCode", "", "accountNumber", "orderId", "batchParams", "refresh", "forced", "", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/Completable;", "receiptUuid", "action", "method", "lib-store-iac_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class IacInfoBannerStore extends Store {
    private final IacInfoBannerDao dao;
    private final BehaviorRelay<Set<UUID>> dismissedReceiptUuidsRelay;
    private final Endpoint<IacInfoBannersBatchParams, Response<ApiIacInfoBannerBatchResponse>> getBatch;
    private final IacInfoBannerApi iacInfoBannerApi;
    private final PostEndpoint<Tuples2<UUID, IacDismissMethod>, Unit> postDismissed;
    private final PostEndpoint<UUID, Unit> postSeen;
    private final PostEndpoint<Tuples2<UUID, ApiIacActionRequest>, Unit> postTapped;
    private final Query<IacInfoBannersBatchParams, List<IacInfoBanner>> streamBatchIacInfoBanner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IacInfoBannerStore(IacInfoBannerApi iacInfoBannerApi, StoreBundle storeBundle, IacInfoBannerDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(iacInfoBannerApi, "iacInfoBannerApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.iacInfoBannerApi = iacInfoBannerApi;
        this.dao = dao;
        BehaviorRelay<Set<UUID>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(SetsKt.emptySet());
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.dismissedReceiptUuidsRelay = behaviorRelayCreateDefault;
        this.getBatch = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new IacInfoBannerStore2(this, null), getLogoutKillswitch(), new IacInfoBannerStore3(this, null), storeBundle.getClock(), null, 16, null);
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.postSeen = companion.create(new C386891(null), new C386902(null));
        this.postTapped = companion.create(new C386931(null), new C386942(null));
        this.postDismissed = companion.createWithParams(new C386851(null), new C386862(null));
        this.streamBatchIacInfoBanner = Store.create$default(this, Query.INSTANCE, "streamBatchIacInfoBanner", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.shared.data.store.iac.IacInfoBannerStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IacInfoBannerStore.streamBatchIacInfoBanner$lambda$0(this.f$0, (IacInfoBannersBatchParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.shared.data.store.iac.IacInfoBannerStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IacInfoBannerStore.streamBatchIacInfoBanner$lambda$1(this.f$0, (IacInfoBannersBatchParams) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: IacInfoBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "receiptUuid", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacInfoBannerStore$postSeen$1", m3645f = "IacInfoBannerStore.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.data.store.iac.IacInfoBannerStore$postSeen$1 */
    static final class C386891 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C386891(Continuation<? super C386891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C386891 c386891 = IacInfoBannerStore.this.new C386891(continuation);
            c386891.L$0 = obj;
            return c386891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
            return ((C386891) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UUID uuid = (UUID) this.L$0;
                IacInfoBannerApi iacInfoBannerApi = IacInfoBannerStore.this.iacInfoBannerApi;
                this.label = 1;
                if (iacInfoBannerApi.postIacInfoBannerSeen(uuid, this) == coroutine_suspended) {
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

    /* compiled from: IacInfoBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacInfoBannerStore$postSeen$2", m3645f = "IacInfoBannerStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.data.store.iac.IacInfoBannerStore$postSeen$2 */
    static final class C386902 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        C386902(Continuation<? super C386902> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C386902(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C386902) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: IacInfoBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/ApiIacActionRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacInfoBannerStore$postTapped$1", m3645f = "IacInfoBannerStore.kt", m3646l = {89}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.data.store.iac.IacInfoBannerStore$postTapped$1 */
    static final class C386931 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends ApiIacActionRequest>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C386931(Continuation<? super C386931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C386931 c386931 = IacInfoBannerStore.this.new C386931(continuation);
            c386931.L$0 = obj;
            return c386931;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends ApiIacActionRequest> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<UUID, ApiIacActionRequest>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<UUID, ApiIacActionRequest> tuples2, Continuation<? super Unit> continuation) {
            return ((C386931) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                UUID uuid = (UUID) tuples2.component1();
                ApiIacActionRequest apiIacActionRequest = (ApiIacActionRequest) tuples2.component2();
                IacInfoBannerApi iacInfoBannerApi = IacInfoBannerStore.this.iacInfoBannerApi;
                this.label = 1;
                if (iacInfoBannerApi.postIacInfoBannerTapped(uuid, apiIacActionRequest, this) == coroutine_suspended) {
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

    /* compiled from: IacInfoBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacInfoBannerStore$postTapped$2", m3645f = "IacInfoBannerStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.data.store.iac.IacInfoBannerStore$postTapped$2 */
    static final class C386942 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        C386942(Continuation<? super C386942> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C386942(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C386942) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: IacInfoBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/IacDismissMethod;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacInfoBannerStore$postDismissed$1", m3645f = "IacInfoBannerStore.kt", m3646l = {96}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.data.store.iac.IacInfoBannerStore$postDismissed$1 */
    static final class C386851 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends IacDismissMethod>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C386851(Continuation<? super C386851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C386851 c386851 = IacInfoBannerStore.this.new C386851(continuation);
            c386851.L$0 = obj;
            return c386851;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends IacDismissMethod> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<UUID, ? extends IacDismissMethod>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<UUID, ? extends IacDismissMethod> tuples2, Continuation<? super Unit> continuation) {
            return ((C386851) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                UUID uuid = (UUID) tuples2.component1();
                IacDismissMethod iacDismissMethod = (IacDismissMethod) tuples2.component2();
                IacInfoBannerApi iacInfoBannerApi = IacInfoBannerStore.this.iacInfoBannerApi;
                this.label = 1;
                if (iacInfoBannerApi.postIacInfoBannerDismissed(uuid, iacDismissMethod, this) == coroutine_suspended) {
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

    /* compiled from: IacInfoBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/IacDismissMethod;", "<unused var>"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacInfoBannerStore$postDismissed$2", m3645f = "IacInfoBannerStore.kt", m3646l = {99}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.data.store.iac.IacInfoBannerStore$postDismissed$2 */
    static final class C386862 extends ContinuationImpl7 implements Function3<Tuples2<? extends UUID, ? extends IacDismissMethod>, Unit, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C386862(Continuation<? super C386862> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends IacDismissMethod> tuples2, Unit unit, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<UUID, ? extends IacDismissMethod>) tuples2, unit, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<UUID, ? extends IacDismissMethod> tuples2, Unit unit, Continuation<? super Unit> continuation) {
            C386862 c386862 = IacInfoBannerStore.this.new C386862(continuation);
            c386862.L$0 = tuples2;
            return c386862.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UUID uuid = (UUID) ((Tuples2) this.L$0).component1();
                IacInfoBannerDao iacInfoBannerDao = IacInfoBannerStore.this.dao;
                this.label = 1;
                if (iacInfoBannerDao.delete(uuid, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamBatchIacInfoBanner$lambda$0(IacInfoBannerStore iacInfoBannerStore, IacInfoBannersBatchParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint8.backendPoll$default(iacInfoBannerStore.getBatch, params, IacInfoBanner.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamBatchIacInfoBanner$lambda$1(IacInfoBannerStore iacInfoBannerStore, IacInfoBannersBatchParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        IacInfoBannerDao iacInfoBannerDao = iacInfoBannerStore.dao;
        List<IacInfoBannerLocation> locations = params.getLocations();
        UUID locationId = params.getLocationId();
        if (locationId == null) {
            locationId = IacInfoBanner.INSTANCE.getLOCATION_ID_NONE();
        }
        return iacInfoBannerDao.getBatch(locations, locationId, params.getAccountNumber());
    }

    public static /* synthetic */ Observable streamBatch$default(IacInfoBannerStore iacInfoBannerStore, List list, UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, UUID uuid5, UUID uuid6, UUID uuid7, String str, String str2, UUID uuid8, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            uuid2 = null;
        }
        if ((i & 8) != 0) {
            uuid3 = null;
        }
        if ((i & 16) != 0) {
            uuid4 = null;
        }
        if ((i & 32) != 0) {
            uuid5 = null;
        }
        if ((i & 64) != 0) {
            uuid6 = null;
        }
        if ((i & 128) != 0) {
            uuid7 = null;
        }
        if ((i & 256) != 0) {
            str = null;
        }
        if ((i & 512) != 0) {
            str2 = null;
        }
        if ((i & 1024) != 0) {
            uuid8 = null;
        }
        return iacInfoBannerStore.streamBatch(list, uuid, uuid2, uuid3, uuid4, uuid5, uuid6, uuid7, str, str2, uuid8);
    }

    public final Observable<List<IacInfoBanner>> streamBatch(List<? extends IacInfoBannerLocation> locations, UUID instrumentId, UUID currencyPairId, UUID perpetualContractId, UUID optionChainId, UUID listId, UUID eventId, UUID futuresContractId, String optionStrategyCode, String accountNumber, UUID orderId) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        return streamBatch(new IacInfoBannersBatchParams(locations, instrumentId, currencyPairId, perpetualContractId, optionChainId, listId, eventId, futuresContractId, optionStrategyCode, accountNumber, orderId));
    }

    public final Observable<List<IacInfoBanner>> streamBatch(IacInfoBannersBatchParams batchParams) {
        Intrinsics.checkNotNullParameter(batchParams, "batchParams");
        Observables observables = Observables.INSTANCE;
        Observable<List<IacInfoBanner>> observableCombineLatest = Observable.combineLatest(this.streamBatchIacInfoBanner.asObservable(batchParams), this.dismissedReceiptUuidsRelay, new BiFunction<T1, T2, R>() { // from class: com.robinhood.shared.data.store.iac.IacInfoBannerStore$streamBatch$$inlined$combineLatest$1
            /* JADX WARN: Type inference failed for: r0v2, types: [R, java.util.ArrayList, java.util.Collection] */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Set set = (Set) t2;
                ?? r0 = (R) new ArrayList();
                for (Object obj : (List) t1) {
                    if (!set.contains(((IacInfoBanner) obj).getReceiptUuid())) {
                        r0.add(obj);
                    }
                }
                return r0;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        return observableCombineLatest;
    }

    public static /* synthetic */ void refresh$default(IacInfoBannerStore iacInfoBannerStore, List list, UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, UUID uuid5, UUID uuid6, UUID uuid7, String str, String str2, UUID uuid8, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            uuid2 = null;
        }
        if ((i & 8) != 0) {
            uuid3 = null;
        }
        if ((i & 16) != 0) {
            uuid4 = null;
        }
        if ((i & 32) != 0) {
            uuid5 = null;
        }
        if ((i & 64) != 0) {
            uuid6 = null;
        }
        if ((i & 128) != 0) {
            uuid7 = null;
        }
        if ((i & 256) != 0) {
            str = null;
        }
        if ((i & 512) != 0) {
            str2 = null;
        }
        if ((i & 1024) != 0) {
            uuid8 = null;
        }
        if ((i & 2048) != 0) {
            z = false;
        }
        iacInfoBannerStore.refresh(list, uuid, uuid2, uuid3, uuid4, uuid5, uuid6, uuid7, str, str2, uuid8, z);
    }

    public final void refresh(List<? extends IacInfoBannerLocation> locations, UUID instrumentId, UUID currencyPairId, UUID perpetualContractId, UUID optionChainId, UUID listId, UUID eventId, UUID futuresContractId, String accountNumber, String optionStrategyCode, UUID orderId, boolean forced) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        Endpoint.DefaultImpls.refresh$default(this.getBatch, new IacInfoBannersBatchParams(locations, instrumentId, currencyPairId, perpetualContractId, optionChainId, listId, eventId, futuresContractId, optionStrategyCode, accountNumber, orderId), forced, null, 4, null);
    }

    public final Object deleteAll(Continuation<? super Unit> continuation) {
        Object objDeleteAll = this.dao.deleteAll(continuation);
        return objDeleteAll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDeleteAll : Unit.INSTANCE;
    }

    /* compiled from: IacInfoBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacInfoBannerStore$postSeen$3", m3645f = "IacInfoBannerStore.kt", m3646l = {202}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.data.store.iac.IacInfoBannerStore$postSeen$3 */
    static final class C386913 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $receiptUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C386913(UUID uuid, Continuation<? super C386913> continuation) {
            super(2, continuation);
            this.$receiptUuid = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacInfoBannerStore.this.new C386913(this.$receiptUuid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C386913) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = IacInfoBannerStore.this.postSeen;
                UUID uuid = this.$receiptUuid;
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

    public final Completable postSeen(UUID receiptUuid) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Completable completableOnErrorComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C386913(receiptUuid, null), 1, null).onErrorComplete(new Predicate() { // from class: com.robinhood.shared.data.store.iac.IacInfoBannerStore.postSeen.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Throwables.isNetworkRelated(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorComplete, "onErrorComplete(...)");
        return completableOnErrorComplete;
    }

    /* compiled from: IacInfoBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacInfoBannerStore$postTapped$3", m3645f = "IacInfoBannerStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.data.store.iac.IacInfoBannerStore$postTapped$3 */
    static final class C386953 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $action;
        final /* synthetic */ UUID $receiptUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C386953(UUID uuid, String str, Continuation<? super C386953> continuation) {
            super(2, continuation);
            this.$receiptUuid = uuid;
            this.$action = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacInfoBannerStore.this.new C386953(this.$receiptUuid, this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C386953) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = IacInfoBannerStore.this.postTapped;
                Tuples2 tuples2 = new Tuples2(this.$receiptUuid, new ApiIacActionRequest(this.$action));
                this.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2, null, this, 2, null) == coroutine_suspended) {
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

    public final Completable postTapped(UUID receiptUuid, String action) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Completable completableOnErrorComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C386953(receiptUuid, action, null), 1, null).onErrorComplete(new Predicate() { // from class: com.robinhood.shared.data.store.iac.IacInfoBannerStore.postTapped.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Throwables.isNetworkRelated(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorComplete, "onErrorComplete(...)");
        return completableOnErrorComplete;
    }

    /* compiled from: IacInfoBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacInfoBannerStore$postDismissed$3", m3645f = "IacInfoBannerStore.kt", m3646l = {211}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.data.store.iac.IacInfoBannerStore$postDismissed$3 */
    static final class C386873 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IacDismissMethod $method;
        final /* synthetic */ UUID $receiptUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C386873(UUID uuid, IacDismissMethod iacDismissMethod, Continuation<? super C386873> continuation) {
            super(2, continuation);
            this.$receiptUuid = uuid;
            this.$method = iacDismissMethod;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacInfoBannerStore.this.new C386873(this.$receiptUuid, this.$method, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C386873) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BehaviorRelay behaviorRelay = IacInfoBannerStore.this.dismissedReceiptUuidsRelay;
                Object value = IacInfoBannerStore.this.dismissedReceiptUuidsRelay.getValue();
                Intrinsics.checkNotNull(value);
                behaviorRelay.accept(SetsKt.plus((Set<? extends UUID>) value, this.$receiptUuid));
                PostEndpoint postEndpoint = IacInfoBannerStore.this.postDismissed;
                Tuples2 tuples2 = new Tuples2(this.$receiptUuid, this.$method);
                this.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2, null, this, 2, null) == coroutine_suspended) {
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

    public final Completable postDismissed(UUID receiptUuid, IacDismissMethod method) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(method, "method");
        Completable completableOnErrorComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C386873(receiptUuid, method, null), 1, null).onErrorComplete(new Predicate() { // from class: com.robinhood.shared.data.store.iac.IacInfoBannerStore.postDismissed.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Throwables.isNetworkRelated(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorComplete, "onErrorComplete(...)");
        return completableOnErrorComplete;
    }
}
