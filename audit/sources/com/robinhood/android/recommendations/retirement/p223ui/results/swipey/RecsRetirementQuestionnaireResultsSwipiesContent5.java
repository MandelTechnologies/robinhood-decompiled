package com.robinhood.android.recommendations.retirement.p223ui.results.swipey;

import androidx.compose.runtime.SnapshotFloatState2;
import com.google.accompanist.pager.PagerState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.recommendations.retirement.models.p364ui.UiQuestionnaireResults;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
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
@DebugMetadata(m3644c = "com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$ResultsSwipeyScreen$1$2$1", m3645f = "RecsRetirementQuestionnaireResultsSwipiesContent.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContentKt$ResultsSwipeyScreen$1$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class RecsRetirementQuestionnaireResultsSwipiesContent5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $eventContext;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Screen $eventScreen;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ SnapshotFloatState2 $progress$delegate;
    final /* synthetic */ List<UiQuestionnaireResults.SwipeyPage> $swipies;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecsRetirementQuestionnaireResultsSwipiesContent5(PagerState pagerState, List<UiQuestionnaireResults.SwipeyPage> list, EventLogger eventLogger, Screen screen, Context context, SnapshotFloatState2 snapshotFloatState2, Continuation<? super RecsRetirementQuestionnaireResultsSwipiesContent5> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$swipies = list;
        this.$eventLogger = eventLogger;
        this.$eventScreen = screen;
        this.$eventContext = context;
        this.$progress$delegate = snapshotFloatState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecsRetirementQuestionnaireResultsSwipiesContent5(this.$pagerState, this.$swipies, this.$eventLogger, this.$eventScreen, this.$eventContext, this.$progress$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecsRetirementQuestionnaireResultsSwipiesContent5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$progress$delegate.setFloatValue((this.$pagerState.getCurrentPage() + 1.0f) / this.$swipies.size());
            EventLogger.DefaultImpls.logScreenAppear$default(this.$eventLogger, null, this.$eventScreen, null, null, this.$eventContext, 13, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
