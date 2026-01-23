package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionsPortfolioRiskAnalyzerEquityPositionRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowKt$OptionsPortfolioRiskAnalyzerEquityPositionRow$1$1", m3645f = "OptionsPortfolioRiskAnalyzerEquityPositionRow.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowKt$OptionsPortfolioRiskAnalyzerEquityPositionRow$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsPortfolioRiskAnalyzerEquityPositionRow4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $expanded$delegate;
    final /* synthetic */ MutableTransitionState<Boolean> $visibleState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsPortfolioRiskAnalyzerEquityPositionRow4(MutableTransitionState<Boolean> mutableTransitionState, SnapshotState<Boolean> snapshotState, Continuation<? super OptionsPortfolioRiskAnalyzerEquityPositionRow4> continuation) {
        super(2, continuation);
        this.$visibleState = mutableTransitionState;
        this.$expanded$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionsPortfolioRiskAnalyzerEquityPositionRow4(this.$visibleState, this.$expanded$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionsPortfolioRiskAnalyzerEquityPositionRow4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$visibleState.setTargetState(boxing.boxBoolean(OptionsPortfolioRiskAnalyzerEquityPositionRow3.OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$2(this.$expanded$delegate)));
        return Unit.INSTANCE;
    }
}
