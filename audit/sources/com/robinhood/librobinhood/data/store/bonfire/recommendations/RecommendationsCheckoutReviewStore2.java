package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.recommendations.models.api.ApiRecommendationsCheckoutReview;
import com.robinhood.recommendations.models.api.ApiRecommendationsCheckoutReviewPostBody;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsCheckoutReview;
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

/* compiled from: RecommendationsCheckoutReviewStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutReview;", EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE, "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsCheckoutReviewPostBody;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsCheckoutReviewStore$endpoint$1", m3645f = "RecommendationsCheckoutReviewStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsCheckoutReviewStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RecommendationsCheckoutReviewStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends ApiRecommendationsCheckoutReviewPostBody>, Continuation<? super UiRecommendationsCheckoutReview>, Object> {
    final /* synthetic */ RecommendationsApi $recommendationsApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecommendationsCheckoutReviewStore2(RecommendationsApi recommendationsApi, Continuation<? super RecommendationsCheckoutReviewStore2> continuation) {
        super(2, continuation);
        this.$recommendationsApi = recommendationsApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecommendationsCheckoutReviewStore2 recommendationsCheckoutReviewStore2 = new RecommendationsCheckoutReviewStore2(this.$recommendationsApi, continuation);
        recommendationsCheckoutReviewStore2.L$0 = obj;
        return recommendationsCheckoutReviewStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends ApiRecommendationsCheckoutReviewPostBody> tuples2, Continuation<? super UiRecommendationsCheckoutReview> continuation) {
        return invoke2((Tuples2<UUID, ApiRecommendationsCheckoutReviewPostBody>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, ApiRecommendationsCheckoutReviewPostBody> tuples2, Continuation<? super UiRecommendationsCheckoutReview> continuation) {
        return ((RecommendationsCheckoutReviewStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            RecommendationsApi recommendationsApi = this.$recommendationsApi;
            UUID uuid = (UUID) tuples2.getFirst();
            ApiRecommendationsCheckoutReviewPostBody apiRecommendationsCheckoutReviewPostBody = (ApiRecommendationsCheckoutReviewPostBody) tuples2.getSecond();
            this.label = 1;
            obj = recommendationsApi.createRecommendationsCheckoutReview(uuid, apiRecommendationsCheckoutReviewPostBody, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((ApiRecommendationsCheckoutReview) obj).toUiModel();
    }
}
