package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.recommendations.models.api.allocationweights.ApiRecommendationsAllocationWeightsResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RecommendationsAllocationWeightsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsAllocationWeightsStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RecommendationsAllocationWeightsStore2 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiRecommendationsAllocationWeightsResponse>, Object>, ContinuationImpl6 {
    RecommendationsAllocationWeightsStore2(Object obj) {
        super(2, obj, RecommendationsApi.class, "getRecommendationAllocationWeights", "getRecommendationAllocationWeights(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiRecommendationsAllocationWeightsResponse> continuation) {
        return ((RecommendationsApi) this.receiver).getRecommendationAllocationWeights(uuid, continuation);
    }
}
