package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.recommendations.models.api.allocationweights.ApiRecommendationsAllocationWeightsResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import java.util.List;
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

/* compiled from: RecommendationsAllocationWeightsStore.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\nR\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsAllocationWeightsStore;", "Lcom/robinhood/store/Store;", "recommendationsApi", "Lcom/robinhood/api/retrofit/RecommendationsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/RecommendationsApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/recommendations/models/api/allocationweights/ApiRecommendationsAllocationWeightsResponse;", "getAllocationWeights", "Lio/reactivex/Single;", "", "Lcom/robinhood/recommendations/models/api/allocationweights/ApiRecommendationsAllocationWeightsResponse$Weight;", "recommendationId", "lib-store-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RecommendationsAllocationWeightsStore extends Store {
    private final Endpoint<UUID, ApiRecommendationsAllocationWeightsResponse> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsAllocationWeightsStore(RecommendationsApi recommendationsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(recommendationsApi, "recommendationsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RecommendationsAllocationWeightsStore2(recommendationsApi), getLogoutKillswitch(), new RecommendationsAllocationWeightsStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: RecommendationsAllocationWeightsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/recommendations/models/api/allocationweights/ApiRecommendationsAllocationWeightsResponse$Weight;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsAllocationWeightsStore$getAllocationWeights$1", m3645f = "RecommendationsAllocationWeightsStore.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsAllocationWeightsStore$getAllocationWeights$1 */
    static final class C346941 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends ApiRecommendationsAllocationWeightsResponse.Weight>>, Object> {
        final /* synthetic */ UUID $recommendationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346941(UUID uuid, Continuation<? super C346941> continuation) {
            super(2, continuation);
            this.$recommendationId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecommendationsAllocationWeightsStore.this.new C346941(this.$recommendationId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ApiRecommendationsAllocationWeightsResponse.Weight>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<ApiRecommendationsAllocationWeightsResponse.Weight>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ApiRecommendationsAllocationWeightsResponse.Weight>> continuation) {
            return ((C346941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = RecommendationsAllocationWeightsStore.this.endpoint;
                UUID uuid = this.$recommendationId;
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
            return ((ApiRecommendationsAllocationWeightsResponse) obj).getWeights();
        }
    }

    public final Single<List<ApiRecommendationsAllocationWeightsResponse.Weight>> getAllocationWeights(UUID recommendationId) {
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346941(recommendationId, null), 1, null);
    }
}
