package com.robinhood.android.trade.options.profitloss;

import androidx.fragment.app.Fragment;
import com.robinhood.android.common.options.order.OptionOrderContext;
import com.robinhood.android.common.options.order.OptionOrderContextFactory;
import com.robinhood.android.options.contracts.OptionsProfitLossChartAnalysisFragmentKey;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: OptionsProfitLossChartAnalysisFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment$getRequestParams$legContextObservables$1, reason: use source file name */
/* loaded from: classes9.dex */
final class OptionsProfitLossChartAnalysisFragment3<T, R> implements Function {
    final /* synthetic */ OptionsProfitLossChartAnalysisFragment this$0;

    OptionsProfitLossChartAnalysisFragment3(OptionsProfitLossChartAnalysisFragment optionsProfitLossChartAnalysisFragment) {
        this.this$0 = optionsProfitLossChartAnalysisFragment;
    }

    @Override // io.reactivex.functions.Function
    public final ObservableSource<? extends List<OptionOrderContext.LegContext>> apply(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Observables observables = Observables.INSTANCE;
        Sequence sequenceAsSequence = CollectionsKt.asSequence(((OptionsProfitLossChartAnalysisFragmentKey) OptionsProfitLossChartAnalysisFragment.INSTANCE.getArgs((Fragment) this.this$0)).getOptionOrderBundle().getLegBundles());
        final OptionsProfitLossChartAnalysisFragment optionsProfitLossChartAnalysisFragment = this.this$0;
        return ObservablesKt.combineLatest(observables, SequencesKt.asIterable(SequencesKt.map(sequenceAsSequence, new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment$getRequestParams$legContextObservables$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossChartAnalysisFragment3.apply$lambda$0(optionsProfitLossChartAnalysisFragment, accountNumber, (OptionLegBundle) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable apply$lambda$0(OptionsProfitLossChartAnalysisFragment optionsProfitLossChartAnalysisFragment, String str, OptionLegBundle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OptionOrderContextFactory optionOrderContextFactory = optionsProfitLossChartAnalysisFragment.getOptionOrderContextFactory();
        Intrinsics.checkNotNull(str);
        return optionOrderContextFactory.createForLeg(str, it);
    }
}
