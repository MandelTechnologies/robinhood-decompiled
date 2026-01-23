package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.recommendations.models.api.ApiRecommendationsRiskProfilePostBody;
import com.robinhood.recommendations.models.api.ApiRecommendationsRiskProfileResponse;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsRiskProfile;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RecommendationsRiskProfileStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile;", "request", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsRiskProfilePostBody;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsRiskProfileStore$endpoint$1", m3645f = "RecommendationsRiskProfileStore.kt", m3646l = {24}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsRiskProfileStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RecommendationsRiskProfileStore2 extends ContinuationImpl7 implements Function2<ApiRecommendationsRiskProfilePostBody, Continuation<? super UiRecommendationsRiskProfile>, Object> {
    final /* synthetic */ RecommendationsApi $recommendationsApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecommendationsRiskProfileStore2(RecommendationsApi recommendationsApi, Continuation<? super RecommendationsRiskProfileStore2> continuation) {
        super(2, continuation);
        this.$recommendationsApi = recommendationsApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecommendationsRiskProfileStore2 recommendationsRiskProfileStore2 = new RecommendationsRiskProfileStore2(this.$recommendationsApi, continuation);
        recommendationsRiskProfileStore2.L$0 = obj;
        return recommendationsRiskProfileStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiRecommendationsRiskProfilePostBody apiRecommendationsRiskProfilePostBody, Continuation<? super UiRecommendationsRiskProfile> continuation) {
        return ((RecommendationsRiskProfileStore2) create(apiRecommendationsRiskProfilePostBody, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiRecommendationsRiskProfilePostBody apiRecommendationsRiskProfilePostBody = (ApiRecommendationsRiskProfilePostBody) this.L$0;
            RecommendationsApi recommendationsApi = this.$recommendationsApi;
            this.label = 1;
            obj = recommendationsApi.createRecommendationsRiskProfile(apiRecommendationsRiskProfilePostBody, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((ApiRecommendationsRiskProfileResponse) obj).toUiModel();
    }
}
