package com.robinhood.android.optionsstrategybuilder;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.contracts.OptionStrategyBottomSheetFragmentKey;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.android.optionsstrategybuilder.extensions.OptionStrategyChainTemplates;
import com.robinhood.android.optionsstrategybuilder.rows.OptionStrategyRowModel;
import com.robinhood.android.optionsstrategybuilder.rows.OptionStrategyRowView;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionStrategyBuilderFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m3636d2 = {"com/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderFragment$strategyChainListCallbacks$1", "Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowView$Callbacks;", "onLaunchStatisticsDetail", "", "model", "Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowModel;", "onPriceClicked", "strategy", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy;", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionStrategyBuilderFragment$strategyChainListCallbacks$1 implements OptionStrategyRowView.Callbacks {
    final /* synthetic */ OptionStrategyBuilderFragment this$0;

    OptionStrategyBuilderFragment$strategyChainListCallbacks$1(OptionStrategyBuilderFragment optionStrategyBuilderFragment) {
        this.this$0 = optionStrategyBuilderFragment;
    }

    @Override // com.robinhood.android.optionchain.BaseOptionRowView.Callbacks
    public void onLaunchStatisticsDetail(final OptionStrategyRowModel model) {
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(model, "model");
        final OptionStrategyBuilderViewState.Strategy.Leg leg = (OptionStrategyBuilderViewState.Strategy.Leg) CollectionsKt.singleOrNull((List) model.getStrategy().getLegs());
        this.this$0.getDuxo().saveFocusedStrategy(model.getStrategy());
        OptionStrategyBuilderDuxo duxo = this.this$0.getDuxo();
        if (model.getStrategy().isSingleLeg()) {
            action = UserInteractionEventData.Action.VIEW_OPTIONS_STATISTICS_BOTTOM_SHEET;
        } else {
            action = UserInteractionEventData.Action.VIEW_STRATEGY_CHAIN_BOTTOM_SHEET;
        }
        duxo.logStrategyChainRowTap(action, model.getStrategy());
        OptionStrategyBuilderFragment optionStrategyBuilderFragment = this.this$0;
        Observable observableTake = optionStrategyBuilderFragment.getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$strategyChainListCallbacks$1$onLaunchStatisticsDetail$1
            @Override // io.reactivex.functions.Function
            public final String apply(OptionStrategyBuilderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getAccountNumber();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(optionStrategyBuilderFragment, observableTake, (LifecycleEvent) null, 1, (Object) null);
        final OptionStrategyBuilderFragment optionStrategyBuilderFragment2 = this.this$0;
        scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$strategyChainListCallbacks$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment$strategyChainListCallbacks$1.onLaunchStatisticsDetail$lambda$0(leg, optionStrategyBuilderFragment2, model, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLaunchStatisticsDetail$lambda$0(OptionStrategyBuilderViewState.Strategy.Leg leg, OptionStrategyBuilderFragment optionStrategyBuilderFragment, OptionStrategyRowModel optionStrategyRowModel, String str) {
        OptionStatisticsTradableState optionStatisticsTradableState;
        if (leg != null) {
            ActivityResultLauncher activityResultLauncher = optionStrategyBuilderFragment.optionOrderLauncher;
            Navigator navigator = optionStrategyBuilderFragment.getNavigator();
            Context contextRequireContext = optionStrategyBuilderFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            OptionStrategyBuilderViewState.Strategy strategy = optionStrategyRowModel.getStrategy();
            Intrinsics.checkNotNull(str);
            OptionOrderIntentKey optionOrderIntentKey = strategy.getOptionOrderIntentKey(str, ((OptionStrategyBuilderFragment.Args) OptionStrategyBuilderFragment.INSTANCE.getArgs((Fragment) optionStrategyBuilderFragment)).getTemplate(), optionStrategyRowModel.getStrategy().getUiOptionChain());
            boolean tradableFromBottomSheet = optionStrategyRowModel.getTradableFromBottomSheet();
            if (tradableFromBottomSheet) {
                optionStatisticsTradableState = OptionStatisticsTradableState.Tradable.INSTANCE;
            } else {
                if (tradableFromBottomSheet) {
                    throw new NoWhenBranchMatchedException();
                }
                optionStatisticsTradableState = OptionStatisticsTradableState.NotAvailable.INSTANCE;
            }
            activityResultLauncher.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, leg.getOptionStatisticsFragmentKey(optionOrderIntentKey, optionStatisticsTradableState), false, false, false, null, false, false, false, false, false, null, false, 8180, null));
        } else {
            Navigator navigator2 = optionStrategyBuilderFragment.getNavigator();
            Intrinsics.checkNotNull(str);
            OptionSettings.DefaultPricingSetting defaultPricingSetting = optionStrategyRowModel.getDefaultPricingSetting();
            OptionStrategyBuilderViewState.Strategy strategy2 = optionStrategyRowModel.getStrategy();
            OptionStrategyBuilderFragment.Companion companion = OptionStrategyBuilderFragment.INSTANCE;
            Navigator.DefaultImpls.createDialogFragment$default(navigator2, new OptionStrategyBottomSheetFragmentKey(str, defaultPricingSetting, strategy2.toOptionsContextLog(((OptionStrategyBuilderFragment.Args) companion.getArgs((Fragment) optionStrategyBuilderFragment)).getTemplate().getStrategyId()), optionStrategyRowModel.getStrategy().getOptionOrderBundle(((OptionStrategyBuilderFragment.Args) companion.getArgs((Fragment) optionStrategyBuilderFragment)).getTemplate(), optionStrategyRowModel.getStrategy().getUiOptionChain()), optionStrategyRowModel.getOptionPositionCounts(), OptionOrderFormSource.STRATEGY_CHAIN, OptionStrategyChainTemplates.getBottomSheetTitle(((OptionStrategyBuilderFragment.Args) companion.getArgs((Fragment) optionStrategyBuilderFragment)).getTemplate(), optionStrategyRowModel.getStrategy().getLegs()), optionStrategyRowModel.getTradableFromBottomSheet(), TransitionReason.OPTION_TRADE_CHAIN, optionStrategyRowModel.getStrategy().getUiOptionChain()), null, 2, null).show(optionStrategyBuilderFragment.getChildFragmentManager(), "optionStrategySpreadBottomSheet");
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.optionsstrategybuilder.rows.OptionStrategyRowView.Callbacks
    public void onPriceClicked(final OptionStrategyBuilderViewState.Strategy strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.this$0.getDuxo().saveFocusedStrategy(strategy);
        this.this$0.getDuxo().logStrategyChainRowTap(UserInteractionEventData.Action.VIEW_OPTION_ORDER_FORM, strategy);
        OptionStrategyBuilderFragment optionStrategyBuilderFragment = this.this$0;
        Observable observableTake = optionStrategyBuilderFragment.getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$strategyChainListCallbacks$1$onPriceClicked$1
            @Override // io.reactivex.functions.Function
            public final String apply(OptionStrategyBuilderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getAccountNumber();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(optionStrategyBuilderFragment, observableTake, (LifecycleEvent) null, 1, (Object) null);
        final OptionStrategyBuilderFragment optionStrategyBuilderFragment2 = this.this$0;
        scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$strategyChainListCallbacks$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment$strategyChainListCallbacks$1.onPriceClicked$lambda$1(optionStrategyBuilderFragment2, strategy, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPriceClicked$lambda$1(OptionStrategyBuilderFragment optionStrategyBuilderFragment, OptionStrategyBuilderViewState.Strategy strategy, String str) {
        Intrinsics.checkNotNull(str);
        optionStrategyBuilderFragment.launchOrderForm(strategy.getOptionOrderIntentKey(str, ((OptionStrategyBuilderFragment.Args) OptionStrategyBuilderFragment.INSTANCE.getArgs((Fragment) optionStrategyBuilderFragment)).getTemplate(), strategy.getUiOptionChain()));
        return Unit.INSTANCE;
    }
}
