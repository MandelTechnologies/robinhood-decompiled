package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.recommendations.models.api.ApiRecommendationsOrderPostBody;
import com.robinhood.recommendations.models.api.ApiRecommendationsOrderResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RecommendationsOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderResponse;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderPostBody;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsOrderStore$orderSubmissionEndpoint$1", m3645f = "RecommendationsOrderStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsOrderStore$orderSubmissionEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RecommendationsOrderStore4 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends ApiRecommendationsOrderPostBody>, Continuation<? super ApiRecommendationsOrderResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecommendationsOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecommendationsOrderStore4(RecommendationsOrderStore recommendationsOrderStore, Continuation<? super RecommendationsOrderStore4> continuation) {
        super(2, continuation);
        this.this$0 = recommendationsOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecommendationsOrderStore4 recommendationsOrderStore4 = new RecommendationsOrderStore4(this.this$0, continuation);
        recommendationsOrderStore4.L$0 = obj;
        return recommendationsOrderStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends ApiRecommendationsOrderPostBody> tuples2, Continuation<? super ApiRecommendationsOrderResponse> continuation) {
        return invoke2((Tuples2<UUID, ApiRecommendationsOrderPostBody>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, ApiRecommendationsOrderPostBody> tuples2, Continuation<? super ApiRecommendationsOrderResponse> continuation) {
        return ((RecommendationsOrderStore4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        UUID uuid = (UUID) tuples2.component1();
        ApiRecommendationsOrderPostBody apiRecommendationsOrderPostBody = (ApiRecommendationsOrderPostBody) tuples2.component2();
        RecommendationsApi recommendationsApi = this.this$0.recommendationsApi;
        this.label = 1;
        Object objSubmitRecommendationOrder = recommendationsApi.submitRecommendationOrder(uuid, apiRecommendationsOrderPostBody, this);
        return objSubmitRecommendationOrder == coroutine_suspended ? coroutine_suspended : objSubmitRecommendationOrder;
    }
}
