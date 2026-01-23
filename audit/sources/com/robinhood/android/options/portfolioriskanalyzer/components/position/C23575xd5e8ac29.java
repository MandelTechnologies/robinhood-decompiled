package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "optionInstrumentPosition", "optionInstrumentQuote"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getInstrumentPositionRowFlow$optionInstrumentPositionToQuoteFlow$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getInstrumentPositionRowFlow$optionInstrumentPositionToQuoteFlow$1 */
/* loaded from: classes11.dex */
final class C23575xd5e8ac29 extends ContinuationImpl7 implements Function3<UiOptionInstrumentPosition, OptionInstrumentQuote, Continuation<? super Tuples2<? extends UiOptionInstrumentPosition, ? extends OptionInstrumentQuote>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    C23575xd5e8ac29(Continuation<? super C23575xd5e8ac29> continuation) {
        super(3, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(UiOptionInstrumentPosition uiOptionInstrumentPosition, OptionInstrumentQuote optionInstrumentQuote, Continuation<? super Tuples2<UiOptionInstrumentPosition, OptionInstrumentQuote>> continuation) {
        C23575xd5e8ac29 c23575xd5e8ac29 = new C23575xd5e8ac29(continuation);
        c23575xd5e8ac29.L$0 = uiOptionInstrumentPosition;
        c23575xd5e8ac29.L$1 = optionInstrumentQuote;
        return c23575xd5e8ac29.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(UiOptionInstrumentPosition uiOptionInstrumentPosition, OptionInstrumentQuote optionInstrumentQuote, Continuation<? super Tuples2<? extends UiOptionInstrumentPosition, ? extends OptionInstrumentQuote>> continuation) {
        return invoke2(uiOptionInstrumentPosition, optionInstrumentQuote, (Continuation<? super Tuples2<UiOptionInstrumentPosition, OptionInstrumentQuote>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Tuples4.m3642to((UiOptionInstrumentPosition) this.L$0, (OptionInstrumentQuote) this.L$1);
    }
}
