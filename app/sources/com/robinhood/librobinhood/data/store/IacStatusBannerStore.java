package com.robinhood.librobinhood.data.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.jakewharton.rxrelay2.Relay;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiIacActionRequest;
import com.robinhood.models.api.ApiIacStatusBannerResponse;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.p320db.IacStatusBanner;
import com.robinhood.shared.api.iac.IacStatusBannerApi;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;
import retrofit2.Response;

/* compiled from: IacStatusBannerStore.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100!J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0017\u001a\u00020%2\u0006\u0010&\u001a\u00020\tJ\u0018\u0010\u0019\u001a\u00020%2\u0006\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010(J\u0016\u0010\u001c\u001a\u00020%2\u0006\u0010&\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u001dJ\u000e\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0019\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0004\u0012\u00020\u00140\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\u001a\u0012\u0004\u0012\u00020\u00140\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/IacStatusBannerStore;", "Lcom/robinhood/store/Store;", "iacStatusBannerApi", "Lcom/robinhood/shared/api/iac/IacStatusBannerApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/api/iac/IacStatusBannerApi;Lcom/robinhood/store/StoreBundle;)V", "lastLoggedId", "Ljava/util/UUID;", "getLastLoggedId", "()Ljava/util/UUID;", "setLastLoggedId", "(Ljava/util/UUID;)V", "bannerRelay", "Lcom/jakewharton/rxrelay2/Relay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/IacStatusBanner;", "get", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIacStatusBannerResponse;", "postSeen", "Lcom/robinhood/android/moria/network/PostEndpoint;", "postTapped", "Lkotlin/Pair;", "Lcom/robinhood/models/api/ApiIacActionRequest;", "postDismissed", "Lcom/robinhood/models/api/IacDismissMethod;", "streamQuery", "Lcom/robinhood/android/moria/db/Query;", "stream", "Lio/reactivex/Observable;", "refresh", "force", "", "Lio/reactivex/Completable;", "receiptUuid", "action", "", "method", "shouldLogBanner", MerchantRewardDetailComposable.BANNER_TEST_TAG, "lib-store-iac_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class IacStatusBannerStore extends Store {
    private final Relay<Optional<IacStatusBanner>> bannerRelay;
    private final Endpoint<Unit, Response<ApiIacStatusBannerResponse>> get;
    private final IacStatusBannerApi iacStatusBannerApi;
    private UUID lastLoggedId;
    private final PostEndpoint<Tuples2<UUID, IacDismissMethod>, Unit> postDismissed;
    private final PostEndpoint<UUID, Unit> postSeen;
    private final PostEndpoint<Tuples2<UUID, ApiIacActionRequest>, Unit> postTapped;
    private final Query<Unit, Optional<IacStatusBanner>> streamQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IacStatusBannerStore(IacStatusBannerApi iacStatusBannerApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(iacStatusBannerApi, "iacStatusBannerApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.iacStatusBannerApi = iacStatusBannerApi;
        Relay serialized = BehaviorRelay.createDefault(Optional2.INSTANCE).toSerialized();
        Intrinsics.checkNotNullExpressionValue(serialized, "toSerialized(...)");
        this.bannerRelay = serialized;
        this.get = Endpoint.Companion.create$default(Endpoint.INSTANCE, new IacStatusBannerStore2(this, null), getLogoutKillswitch(), new IacStatusBannerStore3(this, null), storeBundle.getClock(), null, 16, null);
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.postSeen = companion.create(new C338751(null), new C338762(null));
        this.postTapped = companion.create(new C338791(null), new C338802(null));
        this.postDismissed = companion.create(new C338711(null), new C338722(null));
        this.streamQuery = Store.create$default(this, Query.INSTANCE, "queryBanner", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.IacStatusBannerStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IacStatusBannerStore.streamQuery$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.IacStatusBannerStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IacStatusBannerStore.streamQuery$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    public final UUID getLastLoggedId() {
        return this.lastLoggedId;
    }

    public final void setLastLoggedId(UUID uuid) {
        this.lastLoggedId = uuid;
    }

    /* compiled from: IacStatusBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "receiptUuid", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.IacStatusBannerStore$postSeen$1", m3645f = "IacStatusBannerStore.kt", m3646l = {56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.IacStatusBannerStore$postSeen$1 */
    static final class C338751 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C338751(Continuation<? super C338751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C338751 c338751 = IacStatusBannerStore.this.new C338751(continuation);
            c338751.L$0 = obj;
            return c338751;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
            return ((C338751) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UUID uuid = (UUID) this.L$0;
                IacStatusBannerApi iacStatusBannerApi = IacStatusBannerStore.this.iacStatusBannerApi;
                this.label = 1;
                if (iacStatusBannerApi.postIacStatusBannerSeen(uuid, this) == coroutine_suspended) {
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

    /* compiled from: IacStatusBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.IacStatusBannerStore$postSeen$2", m3645f = "IacStatusBannerStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.IacStatusBannerStore$postSeen$2 */
    static final class C338762 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        C338762(Continuation<? super C338762> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C338762(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C338762) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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

    /* compiled from: IacStatusBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/ApiIacActionRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.IacStatusBannerStore$postTapped$1", m3645f = "IacStatusBannerStore.kt", m3646l = {63}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.IacStatusBannerStore$postTapped$1 */
    static final class C338791 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends ApiIacActionRequest>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C338791(Continuation<? super C338791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C338791 c338791 = IacStatusBannerStore.this.new C338791(continuation);
            c338791.L$0 = obj;
            return c338791;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends ApiIacActionRequest> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<UUID, ApiIacActionRequest>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<UUID, ApiIacActionRequest> tuples2, Continuation<? super Unit> continuation) {
            return ((C338791) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
                IacStatusBannerApi iacStatusBannerApi = IacStatusBannerStore.this.iacStatusBannerApi;
                this.label = 1;
                if (iacStatusBannerApi.postIacStatusBannerTapped(uuid, apiIacActionRequest, this) == coroutine_suspended) {
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

    /* compiled from: IacStatusBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.IacStatusBannerStore$postTapped$2", m3645f = "IacStatusBannerStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.IacStatusBannerStore$postTapped$2 */
    static final class C338802 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        C338802(Continuation<? super C338802> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C338802(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C338802) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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

    /* compiled from: IacStatusBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/IacDismissMethod;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.IacStatusBannerStore$postDismissed$1", m3645f = "IacStatusBannerStore.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.IacStatusBannerStore$postDismissed$1 */
    static final class C338711 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends IacDismissMethod>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C338711(Continuation<? super C338711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C338711 c338711 = IacStatusBannerStore.this.new C338711(continuation);
            c338711.L$0 = obj;
            return c338711;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends IacDismissMethod> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<UUID, ? extends IacDismissMethod>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<UUID, ? extends IacDismissMethod> tuples2, Continuation<? super Unit> continuation) {
            return ((C338711) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
                IacStatusBannerApi iacStatusBannerApi = IacStatusBannerStore.this.iacStatusBannerApi;
                this.label = 1;
                if (iacStatusBannerApi.postIacStatusBannerDismissed(uuid, iacDismissMethod, this) == coroutine_suspended) {
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

    /* compiled from: IacStatusBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.IacStatusBannerStore$postDismissed$2", m3645f = "IacStatusBannerStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.IacStatusBannerStore$postDismissed$2 */
    static final class C338722 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        C338722(Continuation<? super C338722> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C338722(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C338722) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamQuery$lambda$0(IacStatusBannerStore iacStatusBannerStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint8.backendPoll$default(iacStatusBannerStore.get, Unit.INSTANCE, Durations.INSTANCE.getONE_MINUTE(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamQuery$lambda$1(IacStatusBannerStore iacStatusBannerStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Context7.buffer$default(RxConvert.asFlow(iacStatusBannerStore.bannerRelay), Integer.MAX_VALUE, null, 2, null);
    }

    public final Observable<Optional<IacStatusBanner>> stream() {
        return this.streamQuery.asObservable(Unit.INSTANCE);
    }

    public final void refresh(boolean force) {
        Endpoint.DefaultImpls.refresh$default(this.get, Unit.INSTANCE, force, null, 4, null);
    }

    /* compiled from: IacStatusBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.IacStatusBannerStore$postSeen$3", m3645f = "IacStatusBannerStore.kt", m3646l = {97}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.IacStatusBannerStore$postSeen$3 */
    static final class C338773 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $receiptUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C338773(UUID uuid, Continuation<? super C338773> continuation) {
            super(2, continuation);
            this.$receiptUuid = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacStatusBannerStore.this.new C338773(this.$receiptUuid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C338773) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = IacStatusBannerStore.this.postSeen;
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
        Completable completableOnErrorComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C338773(receiptUuid, null), 1, null).onErrorComplete(new Predicate() { // from class: com.robinhood.librobinhood.data.store.IacStatusBannerStore.postSeen.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Throwables.isNetworkRelated(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorComplete, "onErrorComplete(...)");
        return completableOnErrorComplete;
    }

    /* compiled from: IacStatusBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.IacStatusBannerStore$postTapped$3", m3645f = "IacStatusBannerStore.kt", m3646l = {101}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.IacStatusBannerStore$postTapped$3 */
    static final class C338813 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $action;
        final /* synthetic */ UUID $receiptUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C338813(UUID uuid, String str, Continuation<? super C338813> continuation) {
            super(2, continuation);
            this.$receiptUuid = uuid;
            this.$action = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacStatusBannerStore.this.new C338813(this.$receiptUuid, this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C338813) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = IacStatusBannerStore.this.postTapped;
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
        Completable completableOnErrorComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C338813(receiptUuid, action, null), 1, null).onErrorComplete(new Predicate() { // from class: com.robinhood.librobinhood.data.store.IacStatusBannerStore.postTapped.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Throwables.isNetworkRelated(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorComplete, "onErrorComplete(...)");
        return completableOnErrorComplete;
    }

    /* compiled from: IacStatusBannerStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.IacStatusBannerStore$postDismissed$3", m3645f = "IacStatusBannerStore.kt", m3646l = {105}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.IacStatusBannerStore$postDismissed$3 */
    static final class C338733 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IacDismissMethod $method;
        final /* synthetic */ UUID $receiptUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C338733(UUID uuid, IacDismissMethod iacDismissMethod, Continuation<? super C338733> continuation) {
            super(2, continuation);
            this.$receiptUuid = uuid;
            this.$method = iacDismissMethod;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacStatusBannerStore.this.new C338733(this.$receiptUuid, this.$method, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C338733) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = IacStatusBannerStore.this.postDismissed;
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
        Completable completableOnErrorComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C338733(receiptUuid, method, null), 1, null).onErrorComplete(new Predicate() { // from class: com.robinhood.librobinhood.data.store.IacStatusBannerStore.postDismissed.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Throwables.isNetworkRelated(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorComplete, "onErrorComplete(...)");
        return completableOnErrorComplete;
    }

    public final boolean shouldLogBanner(IacStatusBanner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        if (!Intrinsics.areEqual(this.lastLoggedId, banner.getReceiptUuid())) {
            UUID receiptUuid = banner.getReceiptUuid();
            this.lastLoggedId = receiptUuid;
            if (receiptUuid != null) {
                return true;
            }
        }
        return false;
    }
}
