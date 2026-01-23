package com.robinhood.android.recommendations.retirement.p223ui.results.swipey;

import com.google.accompanist.pager.PagerState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecsRetirementQuestionnaireResultsSwipiesContent.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$ResultsSwipeyScreen$navigateBackward$1$1$1", m3645f = "RecsRetirementQuestionnaireResultsSwipiesContent.kt", m3646l = {106}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$ResultsSwipeyScreen$navigateBackward$1$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class RecsRetirementQuestionnaireResultsSwipiesContent6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PagerState $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecsRetirementQuestionnaireResultsSwipiesContent6(PagerState pagerState, Continuation<? super RecsRetirementQuestionnaireResultsSwipiesContent6> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecsRetirementQuestionnaireResultsSwipiesContent6(this.$pagerState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecsRetirementQuestionnaireResultsSwipiesContent6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PagerState pagerState = this.$pagerState;
            int currentPage = pagerState.getCurrentPage() - 1;
            this.label = 1;
            if (PagerState.animateScrollToPage$default(pagerState, currentPage, 0.0f, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
