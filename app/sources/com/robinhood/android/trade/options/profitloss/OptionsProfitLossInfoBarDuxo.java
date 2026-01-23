package com.robinhood.android.trade.options.profitloss;

import android.view.View;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.android.trade.options.profitloss.ChartParams;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBarViewState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossInfoBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarViewState;", "hostView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "setParamsToRefresh", "", "paramsToBeRefreshed", "Lcom/robinhood/android/trade/options/profitloss/UserEnteredProfitLossParams;", "reset", "submitProfitLossAdditionalInfo", "profitLossAdditionalInfo", "Lcom/robinhood/android/trade/options/profitloss/ProfitLossAdditionalInfo;", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OptionsProfitLossInfoBarDuxo extends ViewDuxo<OptionsProfitLossInfoBarViewState> {
    public static final int $stable = ViewDuxo.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsProfitLossInfoBarDuxo(View hostView) {
        super(hostView, new OptionsProfitLossInfoBarViewState(null, null, null, null, null, 31, null), null, 4, null);
        Intrinsics.checkNotNullParameter(hostView, "hostView");
    }

    public final void setParamsToRefresh(final UserEnteredProfitLossParams paramsToBeRefreshed) {
        Intrinsics.checkNotNullParameter(paramsToBeRefreshed, "paramsToBeRefreshed");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBarDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossInfoBarDuxo.setParamsToRefresh$lambda$0(paramsToBeRefreshed, (OptionsProfitLossInfoBarViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsProfitLossInfoBarViewState setParamsToRefresh$lambda$0(UserEnteredProfitLossParams userEnteredProfitLossParams, OptionsProfitLossInfoBarViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (!Intrinsics.areEqual(userEnteredProfitLossParams, applyMutation.getLastRefreshedParams()) && applyMutation.getLoadingState() != OptionsProfitLossInfoBarViewState.InfoBarLoadingState.INITIAL_LOADING) {
            return OptionsProfitLossInfoBarViewState.copy$default(applyMutation, null, null, null, userEnteredProfitLossParams, OptionsProfitLossInfoBarViewState.InfoBarLoadingState.RELOADING, 7, null);
        }
        return OptionsProfitLossInfoBarViewState.copy$default(applyMutation, null, null, null, null, null, 31, null);
    }

    public final void reset() {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBarDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossInfoBarDuxo.reset$lambda$1((OptionsProfitLossInfoBarViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsProfitLossInfoBarViewState reset$lambda$1(OptionsProfitLossInfoBarViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new OptionsProfitLossInfoBarViewState(null, null, null, null, null, 31, null);
    }

    public final void submitProfitLossAdditionalInfo(ProfitLossAdditionalInfo profitLossAdditionalInfo) {
        Intrinsics.checkNotNullParameter(profitLossAdditionalInfo, "profitLossAdditionalInfo");
        final CurrentProfitLoss currentProfitLoss = profitLossAdditionalInfo.getCurrentProfitLoss();
        final InfoBarValues infoBarValues = profitLossAdditionalInfo.getInfoBarValues();
        final ChartParams lastLoadedChartParams = profitLossAdditionalInfo.getLastLoadedChartParams();
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBarDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossInfoBarDuxo.submitProfitLossAdditionalInfo$lambda$2(lastLoadedChartParams, currentProfitLoss, infoBarValues, (OptionsProfitLossInfoBarViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsProfitLossInfoBarViewState submitProfitLossAdditionalInfo$lambda$2(ChartParams chartParams, CurrentProfitLoss currentProfitLoss, InfoBarValues infoBarValues, OptionsProfitLossInfoBarViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation.getLoadingState() == OptionsProfitLossInfoBarViewState.InfoBarLoadingState.RELOADING && !Intrinsics.areEqual(applyMutation.getLastRefreshedParams(), UserEnteredProfitLossParams.INSTANCE.getUserEnteredParams(chartParams.getParams()))) {
            return OptionsProfitLossInfoBarViewState.copy$default(applyMutation, currentProfitLoss, null, null, null, null, 30, null);
        }
        OptionsProfitLossInfoBarViewState.InfoBarLoadingState loadingState = applyMutation.getLoadingState();
        OptionsProfitLossInfoBarViewState.InfoBarLoadingState infoBarLoadingState = OptionsProfitLossInfoBarViewState.InfoBarLoadingState.LOADED;
        if ((loadingState == infoBarLoadingState || applyMutation.getLoadingState() == OptionsProfitLossInfoBarViewState.InfoBarLoadingState.STALE) && (chartParams instanceof ChartParams.Failed)) {
            return OptionsProfitLossInfoBarViewState.copy$default(applyMutation, currentProfitLoss, null, null, null, OptionsProfitLossInfoBarViewState.InfoBarLoadingState.STALE, 14, null);
        }
        if (chartParams instanceof ChartParams.Loaded) {
            return OptionsProfitLossInfoBarViewState.copy$default(applyMutation, currentProfitLoss, null, infoBarValues, null, infoBarLoadingState, 10, null);
        }
        if (!(chartParams instanceof ChartParams.Failed)) {
            throw new NoWhenBranchMatchedException();
        }
        return OptionsProfitLossInfoBarViewState.copy$default(applyMutation, currentProfitLoss, ((ChartParams.Failed) chartParams).getError(), null, null, OptionsProfitLossInfoBarViewState.InfoBarLoadingState.ERROR, 12, null);
    }
}
