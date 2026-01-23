package com.robinhood.android.optionsstrategybuilder;

import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: OptionStrategyBuilderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$13$commitCallback$1$1 */
/* loaded from: classes11.dex */
final class RunnableC24865x3e6a5f57 implements Runnable {
    final /* synthetic */ int $scrollPosition;
    final /* synthetic */ OptionStrategyBuilderViewState $state;
    final /* synthetic */ OptionStrategyBuilderViewState.StrategyChainAdapterState $strategyChainAdapterState;
    final /* synthetic */ OptionStrategyBuilderFragment this$0;

    RunnableC24865x3e6a5f57(OptionStrategyBuilderFragment optionStrategyBuilderFragment, int i, OptionStrategyBuilderViewState optionStrategyBuilderViewState, OptionStrategyBuilderViewState.StrategyChainAdapterState strategyChainAdapterState) {
        this.this$0 = optionStrategyBuilderFragment;
        this.$scrollPosition = i;
        this.$state = optionStrategyBuilderViewState;
        this.$strategyChainAdapterState = strategyChainAdapterState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Unit unitConsumeUiEventIfStrategyInSet;
        this.this$0.strategyChainListAdapter.setScrollPosition(this.$scrollPosition);
        OptionStrategyBuilderViewState.SavedScrollTarget savedScrollTarget = this.$state.getSavedScrollTarget();
        if (savedScrollTarget != null) {
            List<StrategyChainListAdapter2> rows = this.$strategyChainAdapterState.getRows();
            final OptionStrategyBuilderViewState optionStrategyBuilderViewState = this.$state;
            final OptionStrategyBuilderFragment optionStrategyBuilderFragment = this.this$0;
            unitConsumeUiEventIfStrategyInSet = savedScrollTarget.consumeUiEventIfStrategyInSet(rows, new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$13$commitCallback$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RunnableC24865x3e6a5f57.run$lambda$0(optionStrategyBuilderViewState, optionStrategyBuilderFragment, ((Integer) obj).intValue());
                }
            });
        } else {
            unitConsumeUiEventIfStrategyInSet = null;
        }
        boolean z = unitConsumeUiEventIfStrategyInSet != null;
        UiEvent<Unit> scrollEvent = this.$state.getFilteredStrategiesListData().getScrollEvent();
        boolean z2 = (scrollEvent != null ? scrollEvent.consume() : null) != null;
        if (z || !z2) {
            return;
        }
        OptionStrategyBuilderFragment.doScroll$default(this.this$0, false, 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$0(OptionStrategyBuilderViewState optionStrategyBuilderViewState, OptionStrategyBuilderFragment optionStrategyBuilderFragment, int i) {
        UiEvent<Unit> scrollEvent = optionStrategyBuilderViewState.getFilteredStrategiesListData().getScrollEvent();
        if (scrollEvent != null) {
            scrollEvent.consume();
        }
        OptionStrategyBuilderFragment.doScroll$default(optionStrategyBuilderFragment, false, i, 1, null);
        return Unit.INSTANCE;
    }
}
