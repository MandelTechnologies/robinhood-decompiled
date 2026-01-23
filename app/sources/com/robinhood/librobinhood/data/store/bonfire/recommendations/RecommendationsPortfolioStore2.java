package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.recommendations.models.api.ApiRecommendationsPortfolio;
import com.robinhood.recommendations.models.api.ApiRecommendationsPortfolioPostBody;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsPortfolio;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RecommendationsPortfolioStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio;", "submissionId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsPortfolioStore$endpoint$1", m3645f = "RecommendationsPortfolioStore.kt", m3646l = {23}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsPortfolioStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RecommendationsPortfolioStore2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super UiRecommendationsPortfolio>, Object> {
    final /* synthetic */ RecommendationsApi $recommendationsApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecommendationsPortfolioStore2(RecommendationsApi recommendationsApi, Continuation<? super RecommendationsPortfolioStore2> continuation) {
        super(2, continuation);
        this.$recommendationsApi = recommendationsApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecommendationsPortfolioStore2 recommendationsPortfolioStore2 = new RecommendationsPortfolioStore2(this.$recommendationsApi, continuation);
        recommendationsPortfolioStore2.L$0 = obj;
        return recommendationsPortfolioStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super UiRecommendationsPortfolio> continuation) {
        return ((RecommendationsPortfolioStore2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            RecommendationsApi recommendationsApi = this.$recommendationsApi;
            ApiRecommendationsPortfolioPostBody apiRecommendationsPortfolioPostBody = new ApiRecommendationsPortfolioPostBody(uuid);
            this.label = 1;
            obj = recommendationsApi.createPortfolioRecommendation(apiRecommendationsPortfolioPostBody, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((ApiRecommendationsPortfolio) obj).toUiModel();
    }
}
