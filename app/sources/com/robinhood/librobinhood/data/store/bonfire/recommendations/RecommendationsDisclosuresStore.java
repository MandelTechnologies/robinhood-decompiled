package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.recommendations.models.api.ApiSignRecommendationsDisclosuresPostBody;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsDisclosures;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecommendationsDisclosuresStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010J\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsDisclosuresStore;", "Lcom/robinhood/store/Store;", "recommendationsApi", "Lcom/robinhood/api/retrofit/RecommendationsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/RecommendationsApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsDisclosures;", "signDisclosuresEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/recommendations/models/api/ApiSignRecommendationsDisclosuresPostBody;", "fetchRecommendationDisclosures", "Lio/reactivex/Single;", "signDisclosures", "Lcom/robinhood/utils/Optional;", "recommendationId", "Ljava/util/UUID;", "disclosureVersion", "", "lib-store-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RecommendationsDisclosuresStore extends Store {
    private final Endpoint<Unit, UiRecommendationsDisclosures> endpoint;
    private final PostEndpoint<ApiSignRecommendationsDisclosuresPostBody, Unit> signDisclosuresEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsDisclosuresStore(RecommendationsApi recommendationsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(recommendationsApi, "recommendationsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RecommendationsDisclosuresStore2(recommendationsApi, null), getLogoutKillswitch(), new RecommendationsDisclosuresStore3(null), storeBundle.getClock(), null, 16, null);
        this.signDisclosuresEndpoint = PostEndpoint.INSTANCE.create(new RecommendationsDisclosuresStore4(recommendationsApi), new RecommendationsDisclosuresStore5(null));
    }

    /* compiled from: RecommendationsDisclosuresStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsDisclosures;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsDisclosuresStore$fetchRecommendationDisclosures$1", m3645f = "RecommendationsDisclosuresStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsDisclosuresStore$fetchRecommendationDisclosures$1 */
    static final class C346971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiRecommendationsDisclosures>, Object> {
        int label;

        C346971(Continuation<? super C346971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecommendationsDisclosuresStore.this.new C346971(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiRecommendationsDisclosures> continuation) {
            return ((C346971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = RecommendationsDisclosuresStore.this.endpoint;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<UiRecommendationsDisclosures> fetchRecommendationDisclosures() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346971(null), 1, null);
    }

    public final Single<Optional<Unit>> signDisclosures(UUID recommendationId, int disclosureVersion) {
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346981(new ApiSignRecommendationsDisclosuresPostBody(recommendationId, disclosureVersion), null), 1, null);
    }

    /* compiled from: RecommendationsDisclosuresStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsDisclosuresStore$signDisclosures$1", m3645f = "RecommendationsDisclosuresStore.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsDisclosuresStore$signDisclosures$1 */
    static final class C346981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends Unit>>, Object> {
        final /* synthetic */ ApiSignRecommendationsDisclosuresPostBody $request;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346981(ApiSignRecommendationsDisclosuresPostBody apiSignRecommendationsDisclosuresPostBody, Continuation<? super C346981> continuation) {
            super(2, continuation);
            this.$request = apiSignRecommendationsDisclosuresPostBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecommendationsDisclosuresStore.this.new C346981(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends Unit>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<Unit>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<Unit>> continuation) {
            return ((C346981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Optional.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Optional.Companion companion2 = Optional.INSTANCE;
                PostEndpoint postEndpoint = RecommendationsDisclosuresStore.this.signDisclosuresEndpoint;
                ApiSignRecommendationsDisclosuresPostBody apiSignRecommendationsDisclosuresPostBody = this.$request;
                this.L$0 = companion2;
                this.label = 1;
                Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiSignRecommendationsDisclosuresPostBody, null, this, 2, null);
                if (objPost$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                companion = companion2;
                obj = objPost$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (Optional.Companion) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return companion.m2972of(obj);
        }
    }
}
