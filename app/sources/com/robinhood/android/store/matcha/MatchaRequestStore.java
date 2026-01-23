package com.robinhood.android.store.matcha;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.models.matcha.api.ApiMatchaRequest;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.p320db.matcha.MatchaRequest;
import com.robinhood.models.p320db.matcha.MatchaRequest2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchaRequestStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\u0006\u0010\u0012\u001a\u00020\u000fJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \f*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaRequestStore;", "Lcom/robinhood/store/Store;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/store/StoreBundle;)V", "requestRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "Lcom/robinhood/models/db/matcha/MatchaRequest;", "kotlin.jvm.PlatformType", "getRequest", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/android/models/matcha/api/ApiMatchaRequest;", "Lio/reactivex/Single;", "requestId", "stream", "Lio/reactivex/Observable;", "refresh", "", "force", "", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MatchaRequestStore extends Store {
    private final Endpoint<UUID, ApiMatchaRequest> getRequest;
    private final MatchaApi matchaApi;
    private final BehaviorRelay<List<MatchaRequest>> requestRelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaRequestStore(MatchaApi matchaApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.matchaApi = matchaApi;
        BehaviorRelay<List<MatchaRequest>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(CollectionsKt.emptyList());
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.requestRelay = behaviorRelayCreateDefault;
        this.getRequest = Endpoint.Companion.create$default(Endpoint.INSTANCE, new C287491(matchaApi), getLogoutKillswitch(), new C287502(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: MatchaRequestStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.store.matcha.MatchaRequestStore$getRequest$1 */
    /* synthetic */ class C287491 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiMatchaRequest>, Object>, ContinuationImpl6 {
        C287491(Object obj) {
            super(2, obj, MatchaApi.class, "getRequest", "getRequest(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super ApiMatchaRequest> continuation) {
            return ((MatchaApi) this.receiver).getRequest(uuid, continuation);
        }
    }

    /* compiled from: MatchaRequestStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/matcha/api/ApiMatchaRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaRequestStore$getRequest$2", m3645f = "MatchaRequestStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.store.matcha.MatchaRequestStore$getRequest$2 */
    static final class C287502 extends ContinuationImpl7 implements Function2<ApiMatchaRequest, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C287502(Continuation<? super C287502> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C287502 c287502 = MatchaRequestStore.this.new C287502(continuation);
            c287502.L$0 = obj;
            return c287502;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiMatchaRequest apiMatchaRequest, Continuation<? super Unit> continuation) {
            return ((C287502) create(apiMatchaRequest, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ApiMatchaRequest apiMatchaRequest = (ApiMatchaRequest) this.L$0;
                BehaviorRelay behaviorRelay = MatchaRequestStore.this.requestRelay;
                Object value = MatchaRequestStore.this.requestRelay.getValue();
                Intrinsics.checkNotNull(value);
                behaviorRelay.accept(CollectionsKt.plus((Collection<? extends MatchaRequest>) value, MatchaRequest2.toDbModel(apiMatchaRequest)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: MatchaRequestStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/matcha/MatchaRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaRequestStore$getRequest$3", m3645f = "MatchaRequestStore.kt", m3646l = {36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.store.matcha.MatchaRequestStore$getRequest$3 */
    static final class C287513 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super MatchaRequest>, Object> {
        final /* synthetic */ UUID $requestId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C287513(UUID uuid, Continuation<? super C287513> continuation) {
            super(2, continuation);
            this.$requestId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaRequestStore.this.new C287513(this.$requestId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MatchaRequest> continuation) {
            return ((C287513) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = MatchaRequestStore.this.getRequest;
                UUID uuid = this.$requestId;
                this.label = 1;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return MatchaRequest2.toDbModel((ApiMatchaRequest) obj);
        }
    }

    public final Single<MatchaRequest> getRequest(UUID requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C287513(requestId, null), 1, null);
    }

    public final Observable<MatchaRequest> stream(final UUID requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Observable<R> map = this.requestRelay.map(new Function() { // from class: com.robinhood.android.store.matcha.MatchaRequestStore.stream.1
            @Override // io.reactivex.functions.Function
            public final Optional<MatchaRequest> apply(List<MatchaRequest> requests) {
                Object next;
                Intrinsics.checkNotNullParameter(requests, "requests");
                UUID uuid = requestId;
                Iterator<T> it = requests.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((MatchaRequest) next).getId(), uuid)) {
                        break;
                    }
                }
                return Optional3.asOptional(next);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ObservablesKt.filterIsPresent(map);
    }

    public static /* synthetic */ void refresh$default(MatchaRequestStore matchaRequestStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        matchaRequestStore.refresh(uuid, z);
    }

    public final void refresh(UUID requestId, boolean force) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Endpoint.DefaultImpls.refresh$default(this.getRequest, requestId, force, null, 4, null);
    }
}
