package com.robinhood.android.recommendations.p224ui.walkthrough.learnmore;

import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.recommendations.models.p362db.RecommendationsLearnMore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RecommendationsLearnMoreDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.recommendations.ui.walkthrough.learnmore.RecommendationsLearnMoreDuxo$onStart$1$1", m3645f = "RecommendationsLearnMoreDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.recommendations.ui.walkthrough.learnmore.RecommendationsLearnMoreDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class RecommendationsLearnMoreDuxo2 extends ContinuationImpl7 implements Function2<RecommendationsLearnMoreViewState, Continuation<? super RecommendationsLearnMoreViewState>, Object> {
    final /* synthetic */ EtpDetails $etpDetails;
    final /* synthetic */ RecommendationsLearnMore $learnMore;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecommendationsLearnMoreDuxo2(RecommendationsLearnMore recommendationsLearnMore, EtpDetails etpDetails, Continuation<? super RecommendationsLearnMoreDuxo2> continuation) {
        super(2, continuation);
        this.$learnMore = recommendationsLearnMore;
        this.$etpDetails = etpDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecommendationsLearnMoreDuxo2 recommendationsLearnMoreDuxo2 = new RecommendationsLearnMoreDuxo2(this.$learnMore, this.$etpDetails, continuation);
        recommendationsLearnMoreDuxo2.L$0 = obj;
        return recommendationsLearnMoreDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RecommendationsLearnMoreViewState recommendationsLearnMoreViewState, Continuation<? super RecommendationsLearnMoreViewState> continuation) {
        return ((RecommendationsLearnMoreDuxo2) create(recommendationsLearnMoreViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RecommendationsLearnMoreViewState.copy$default((RecommendationsLearnMoreViewState) this.L$0, null, null, this.$learnMore, this.$etpDetails, null, 19, null);
    }
}
