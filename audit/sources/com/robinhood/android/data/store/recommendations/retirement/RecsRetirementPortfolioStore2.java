package com.robinhood.android.data.store.recommendations.retirement;

import com.robinhood.android.data.store.recommendations.retirement.RecsRetirementPortfolioStore;
import com.robinhood.api.retrofit.RecsRetirementApi;
import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementPortfolio;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RecsRetirementPortfolioStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementPortfolio;", "<destruct>", "Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementPortfolioStore$Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.data.store.recommendations.retirement.RecsRetirementPortfolioStore$postEndpoint$1", m3645f = "RecsRetirementPortfolioStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.data.store.recommendations.retirement.RecsRetirementPortfolioStore$postEndpoint$1, reason: use source file name */
/* loaded from: classes2.dex */
final class RecsRetirementPortfolioStore2 extends ContinuationImpl7 implements Function2<RecsRetirementPortfolioStore.Request, Continuation<? super ApiRecsRetirementPortfolio>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecsRetirementPortfolioStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecsRetirementPortfolioStore2(RecsRetirementPortfolioStore recsRetirementPortfolioStore, Continuation<? super RecsRetirementPortfolioStore2> continuation) {
        super(2, continuation);
        this.this$0 = recsRetirementPortfolioStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecsRetirementPortfolioStore2 recsRetirementPortfolioStore2 = new RecsRetirementPortfolioStore2(this.this$0, continuation);
        recsRetirementPortfolioStore2.L$0 = obj;
        return recsRetirementPortfolioStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RecsRetirementPortfolioStore.Request request, Continuation<? super ApiRecsRetirementPortfolio> continuation) {
        return ((RecsRetirementPortfolioStore2) create(request, continuation)).invokeSuspend(Unit.INSTANCE);
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
        RecsRetirementPortfolioStore.Request request = (RecsRetirementPortfolioStore.Request) this.L$0;
        UUID recommendationId = request.getRecommendationId();
        boolean isReorder = request.getIsReorder();
        RecsRetirementApi recsRetirementApi = this.this$0.recsRetirementApi;
        this.label = 1;
        Object portfolio = recsRetirementApi.getPortfolio(recommendationId, isReorder, this);
        return portfolio == coroutine_suspended ? coroutine_suspended : portfolio;
    }
}
