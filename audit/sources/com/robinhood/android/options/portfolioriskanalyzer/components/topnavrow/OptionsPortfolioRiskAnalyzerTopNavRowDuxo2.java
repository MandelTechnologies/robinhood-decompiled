package com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/NavRowItemViewState;", "indexInstruments", "equityInstruments"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowDuxo$onCreate$1$1$1", m3645f = "OptionsPortfolioRiskAnalyzerTopNavRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowDuxo$onCreate$1$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsPortfolioRiskAnalyzerTopNavRowDuxo2 extends ContinuationImpl7 implements Function3<List<? extends NavRowItemViewState>, List<? extends NavRowItemViewState>, Continuation<? super List<? extends NavRowItemViewState>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    OptionsPortfolioRiskAnalyzerTopNavRowDuxo2(Continuation<? super OptionsPortfolioRiskAnalyzerTopNavRowDuxo2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(List<? extends NavRowItemViewState> list, List<? extends NavRowItemViewState> list2, Continuation<? super List<? extends NavRowItemViewState>> continuation) {
        return invoke2((List<NavRowItemViewState>) list, (List<NavRowItemViewState>) list2, (Continuation<? super List<NavRowItemViewState>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<NavRowItemViewState> list, List<NavRowItemViewState> list2, Continuation<? super List<NavRowItemViewState>> continuation) {
        OptionsPortfolioRiskAnalyzerTopNavRowDuxo2 optionsPortfolioRiskAnalyzerTopNavRowDuxo2 = new OptionsPortfolioRiskAnalyzerTopNavRowDuxo2(continuation);
        optionsPortfolioRiskAnalyzerTopNavRowDuxo2.L$0 = list;
        optionsPortfolioRiskAnalyzerTopNavRowDuxo2.L$1 = list2;
        return optionsPortfolioRiskAnalyzerTopNavRowDuxo2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CollectionsKt.sortedWith(CollectionsKt.plus((Collection) this.L$0, (Iterable) this.L$1), new Comparator() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowDuxo$onCreate$1$1$1$invokeSuspend$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((NavRowItemViewState) t).getSymbol(), ((NavRowItemViewState) t2).getSymbol());
            }
        });
    }
}
