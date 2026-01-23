package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import com.robinhood.models.p320db.Quote;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/Quote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$quoteFlow$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OptionsPortfolioRiskAnalyzerPositionDuxo$bind$quoteFlow$1 extends ContinuationImpl7 implements Function1<Continuation<? super Quote>, Object> {
    int label;

    OptionsPortfolioRiskAnalyzerPositionDuxo$bind$quoteFlow$1(Continuation<? super OptionsPortfolioRiskAnalyzerPositionDuxo$bind$quoteFlow$1> continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OptionsPortfolioRiskAnalyzerPositionDuxo$bind$quoteFlow$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Quote> continuation) {
        return ((OptionsPortfolioRiskAnalyzerPositionDuxo$bind$quoteFlow$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return null;
    }
}
