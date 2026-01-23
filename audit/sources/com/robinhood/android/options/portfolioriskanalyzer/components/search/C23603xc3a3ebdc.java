package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "equityUnderlyingOptionPositions", "indexUnderlyingOptionPositions"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$aggregateOptionPositionsFlow$3", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$aggregateOptionPositionsFlow$3 */
/* loaded from: classes11.dex */
final class C23603xc3a3ebdc extends ContinuationImpl7 implements Function3<List<? extends UiAggregateOptionPositionFull>, List<? extends UiAggregateOptionPositionFull>, Continuation<? super List<? extends UiAggregateOptionPositionFull>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    C23603xc3a3ebdc(Continuation<? super C23603xc3a3ebdc> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(List<? extends UiAggregateOptionPositionFull> list, List<? extends UiAggregateOptionPositionFull> list2, Continuation<? super List<? extends UiAggregateOptionPositionFull>> continuation) {
        return invoke2((List<UiAggregateOptionPositionFull>) list, (List<UiAggregateOptionPositionFull>) list2, (Continuation<? super List<UiAggregateOptionPositionFull>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<UiAggregateOptionPositionFull> list, List<UiAggregateOptionPositionFull> list2, Continuation<? super List<UiAggregateOptionPositionFull>> continuation) {
        C23603xc3a3ebdc c23603xc3a3ebdc = new C23603xc3a3ebdc(continuation);
        c23603xc3a3ebdc.L$0 = list;
        c23603xc3a3ebdc.L$1 = list2;
        return c23603xc3a3ebdc.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CollectionsKt.plus((Collection) this.L$0, (Iterable) this.L$1);
    }
}
