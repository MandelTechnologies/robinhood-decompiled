package com.robinhood.android.advisory.onboarding.questionnaire;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PortfolioQuestionnaireIntroScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$PortfolioQuestionnaireIntroScreen$2$1", m3645f = "PortfolioQuestionnaireIntroScreen.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$PortfolioQuestionnaireIntroScreen$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class PortfolioQuestionnaireIntroScreen4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $showErrorDialog$delegate;
    final /* synthetic */ PortfolioQuestionnaireIntroViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PortfolioQuestionnaireIntroScreen4(PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState, SnapshotState<Boolean> snapshotState, Continuation<? super PortfolioQuestionnaireIntroScreen4> continuation) {
        super(2, continuation);
        this.$viewState = portfolioQuestionnaireIntroViewState;
        this.$showErrorDialog$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PortfolioQuestionnaireIntroScreen4(this.$viewState, this.$showErrorDialog$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PortfolioQuestionnaireIntroScreen4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PortfolioQuestionnaireIntroScreen3.PortfolioQuestionnaireIntroScreen$lambda$2(this.$showErrorDialog$delegate, this.$viewState.getErrorDialogData() != null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
