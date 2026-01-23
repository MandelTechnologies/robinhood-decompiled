package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "it", "Lcom/robinhood/utils/Optional;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getInstrumentPositionRowFlow$optionInstrumentPositionFlow$3", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getInstrumentPositionRowFlow$optionInstrumentPositionFlow$3 */
/* loaded from: classes11.dex */
final class C23574x2d3a2110 extends ContinuationImpl7 implements Function2<Optional<? extends UiOptionInstrumentPosition>, Continuation<? super UiOptionInstrumentPosition>, Object> {
    /* synthetic */ Object L$0;
    int label;

    C23574x2d3a2110(Continuation<? super C23574x2d3a2110> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C23574x2d3a2110 c23574x2d3a2110 = new C23574x2d3a2110(continuation);
        c23574x2d3a2110.L$0 = obj;
        return c23574x2d3a2110;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<UiOptionInstrumentPosition> optional, Continuation<? super UiOptionInstrumentPosition> continuation) {
        return ((C23574x2d3a2110) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends UiOptionInstrumentPosition> optional, Continuation<? super UiOptionInstrumentPosition> continuation) {
        return invoke2((Optional<UiOptionInstrumentPosition>) optional, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((Optional) this.L$0).getOrNull();
    }
}
