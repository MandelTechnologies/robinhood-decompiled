package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossData;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/PnLUiState;", "unrealizedProfitAndLoss", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$equityPnLFlow$1", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$equityPnLFlow$1 */
/* loaded from: classes11.dex */
final class C23604x66b2c17b extends ContinuationImpl7 implements Function2<UnrealizedProfitAndLossData, Continuation<? super PnLUiState>, Object> {
    /* synthetic */ Object L$0;
    int label;

    C23604x66b2c17b(Continuation<? super C23604x66b2c17b> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C23604x66b2c17b c23604x66b2c17b = new C23604x66b2c17b(continuation);
        c23604x66b2c17b.L$0 = obj;
        return c23604x66b2c17b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UnrealizedProfitAndLossData unrealizedProfitAndLossData, Continuation<? super PnLUiState> continuation) {
        return ((C23604x66b2c17b) create(unrealizedProfitAndLossData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Money totalReturn;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UnrealizedProfitAndLossData unrealizedProfitAndLossData = (UnrealizedProfitAndLossData) this.L$0;
        return new PnLUiState((unrealizedProfitAndLossData == null || (totalReturn = unrealizedProfitAndLossData.getTotalReturn()) == null) ? null : Money3.getBigDecimalCompat(totalReturn), unrealizedProfitAndLossData != null ? unrealizedProfitAndLossData.getTotalReturnPercentage() : null);
    }
}
