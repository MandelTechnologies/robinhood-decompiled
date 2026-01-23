package com.robinhood.android.options.portfolioriskanalyzer;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt;
import com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartHeaderDuxo;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionViewState;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$4$1", m3645f = "OptionsPortfolioRiskAnalyzerComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$4$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ OptionsPortfolioRiskAnalyzerChartHeaderDuxo $chartHeaderDuxo;
    final /* synthetic */ SnapshotState4<OptionsPortfolioRiskAnalyzerPositionViewState> $positionViewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$4$1(OptionsPortfolioRiskAnalyzerChartHeaderDuxo optionsPortfolioRiskAnalyzerChartHeaderDuxo, String str, SnapshotState4<OptionsPortfolioRiskAnalyzerPositionViewState> snapshotState4, Continuation<? super OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$4$1> continuation) {
        super(2, continuation);
        this.$chartHeaderDuxo = optionsPortfolioRiskAnalyzerChartHeaderDuxo;
        this.$accountNumber = str;
        this.$positionViewState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$4$1(this.$chartHeaderDuxo, this.$accountNumber, this.$positionViewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            OptionSimulatedChartBundle5 underlying = OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$7(this.$positionViewState$delegate).getChartBundle().getUnderlying();
            if (underlying != null) {
                this.$chartHeaderDuxo.bind(underlying, this.$accountNumber);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
