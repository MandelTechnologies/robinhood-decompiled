package com.robinhood.android.options.simulatedreturn;

import android.content.res.Resources;
import com.robinhood.android.common.options.toolbar.OptionsToolbarDisplayMode;
import com.robinhood.android.common.options.toolbar.OptionsToolbarUtils;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDataState2;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState3;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnToolbarState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OptionStrategyInfo;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.models.p320db.OptionUnderlying;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p355ui.OptionBundles;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.OptionUnderlyings;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.p355ui.UiOptionStrategyLeg;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnStateProvider.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getToolbarState", "Lcom/robinhood/android/options/simulatedreturn/toolbar/OptionsSimulatedReturnToolbarState;", "ds", "getViewUnderlier", "Lcom/robinhood/android/options/simulatedreturn/toolbar/OptionsSimulatedReturnToolbarState$ViewUnderlier;", "getLoggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "getOptionOrderBundleForChart", "Lcom/robinhood/models/ui/OptionOrderBundle;", "reduce", "dataState", "feature-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnStateProvider implements StateProvider<OptionsSimulatedReturnDataState, OptionsSimulatedReturnViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public OptionsSimulatedReturnStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    private final OptionsSimulatedReturnToolbarState getToolbarState(OptionsSimulatedReturnDataState ds) {
        OptionChain.UnderlyingType underlyingType;
        Resources resources = this.resources;
        UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity = ds.getUiAggregatePositionIncludingZeroQuantity();
        UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity = ds.getUiOptionInstrumentPositionIncludingZeroQuantity();
        UiOptionStrategyInfo uiStrategyInfo = ds.getUiStrategyInfo();
        CuratedListItem curatedListItem = ds.getCuratedListItem();
        OptionsToolbarDisplayMode optionsToolbarDisplayMode = OptionsToolbarDisplayMode.OPTIONS_PROJECTED_RETURN_PAGE;
        boolean useWatchlist = ds.getUseWatchlist();
        UiOptionStrategyInfo uiStrategyInfo2 = ds.getUiStrategyInfo();
        if (uiStrategyInfo2 == null || (underlyingType = uiStrategyInfo2.getUnderlyingType()) == null) {
            underlyingType = OptionChain.UnderlyingType.EQUITY;
        }
        return new OptionsSimulatedReturnToolbarState(OptionsToolbarUtils.getToolbarTitle(resources, uiAggregatePositionIncludingZeroQuantity, uiOptionInstrumentPositionIncludingZeroQuantity, uiStrategyInfo, curatedListItem, optionsToolbarDisplayMode, useWatchlist, underlyingType), getViewUnderlier(ds));
    }

    private final OptionsSimulatedReturnToolbarState.ViewUnderlier getViewUnderlier(OptionsSimulatedReturnDataState ds) {
        if (ds.getUnderlyingType() == null || ds.getUnderlyingSymbol() == null || ds.getUnderlyingInstrumentId() == null) {
            return null;
        }
        return new OptionsSimulatedReturnToolbarState.ViewUnderlier(ds.getFixedAccountNumber(), ds.getUnderlyingSymbol(), ds.getUnderlyingInstrumentId(), ds.getAllAccounts().size() == 1, ds.getUnderlyingType());
    }

    private final OptionsSimulatedReturnLoggingState getLoggingState(OptionsSimulatedReturnDataState ds) {
        OptionStrategyInfo optionStrategyInfo;
        String strategyCode;
        OptionInstrumentPosition optionInstrumentPosition;
        String fixedAccountNumber = ds.getFixedAccountNumber();
        OptionChainSettingsPnlChartType optionChainSettingsPnlChartType = OptionChainSettingsPnlChartType.OVER_TIME;
        UiOptionStrategyInfo uiStrategyInfo = ds.getUiStrategyInfo();
        if (uiStrategyInfo == null || (optionStrategyInfo = uiStrategyInfo.getOptionStrategyInfo()) == null || (strategyCode = optionStrategyInfo.getStrategyCode()) == null) {
            return null;
        }
        Boolean boolIsWatching = ds.isWatching();
        if (boolIsWatching == null) {
            return null;
        }
        boolean zBooleanValue = boolIsWatching.booleanValue();
        Boolean hasRealPosition = ds.getHasRealPosition();
        if (hasRealPosition == null) {
            return null;
        }
        boolean zBooleanValue2 = hasRealPosition.booleanValue();
        boolean zIsLegContext = ds.isLegContext();
        int size = ds.getUiStrategyInfo().getLegs().size();
        UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity = ds.getUiAggregatePositionIncludingZeroQuantity();
        UUID id = uiAggregatePositionIncludingZeroQuantity != null ? uiAggregatePositionIncludingZeroQuantity.getId() : null;
        UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity = ds.getUiOptionInstrumentPositionIncludingZeroQuantity();
        UUID id2 = (uiOptionInstrumentPositionIncludingZeroQuantity == null || (optionInstrumentPosition = uiOptionInstrumentPositionIncludingZeroQuantity.getOptionInstrumentPosition()) == null) ? null : optionInstrumentPosition.getId();
        BrokerageAccountType accountType = ds.getAccountType();
        if (accountType == null) {
            return null;
        }
        return new OptionsSimulatedReturnLoggingState(fixedAccountNumber, optionChainSettingsPnlChartType, strategyCode, zBooleanValue, zBooleanValue2, zIsLegContext, size, id, id2, accountType, ds.getLastAppearEventTimestamp(), ds.getEstimatedContractPrice(), Screen.Name.OPTION_SIMULATED_RETURNS);
    }

    private final OptionOrderBundle getOptionOrderBundleForChart(OptionsSimulatedReturnDataState ds) {
        OptionLegBundle legBundle;
        List<UiOptionStrategyLeg> legs;
        UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity = ds.getUiAggregatePositionIncludingZeroQuantity();
        OptionOrderBundle singleLegOrder = null;
        OptionOrderBundle orderBundle = uiAggregatePositionIncludingZeroQuantity != null ? OptionBundles.toOrderBundle(uiAggregatePositionIncludingZeroQuantity, OrderPositionEffect.OPEN) : null;
        UiOptionStrategyInfo uiStrategyInfo = ds.getUiStrategyInfo();
        UiOptionStrategyLeg uiOptionStrategyLeg = (uiStrategyInfo == null || (legs = uiStrategyInfo.getLegs()) == null) ? null : (UiOptionStrategyLeg) CollectionsKt.singleOrNull((List) legs);
        if (uiOptionStrategyLeg != null && (legBundle = OptionBundles.toLegBundle(uiOptionStrategyLeg, ds.getUnderlyingInstrumentId(), uiOptionStrategyLeg.getPositionType().getSide(), new UiOptionChain(ds.getUiStrategyInfo().getOptionChain(), CollectionsKt.emptyList(), ds.getUiStrategyInfo().getUnderlyings()))) != null) {
            singleLegOrder = legBundle.toSingleLegOrder();
        }
        return orderBundle == null ? singleLegOrder : orderBundle;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionsSimulatedReturnViewState reduce(OptionsSimulatedReturnDataState dataState) {
        OptionsSimulatedReturnChartDataState2 optionsSimulatedReturnChartDataState2;
        List<OptionUnderlying> underlyings;
        List<OptionUnderlying> underlyings2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        OptionTooltip nuxSliderTooltip = dataState.getNuxSliderTooltip();
        OptionTooltip nuxInfoTooltip = dataState.getNuxSliderTooltip() == null ? dataState.getNuxInfoTooltip() : null;
        UUID indexUnderlyingId = null;
        String fixedAccountNumber = dataState.getFixedAccountNumber();
        OptionsSimulatedReturnChartViewState3 chartType = dataState.getChartType();
        OptionOrderBundle optionOrderBundleForChart = getOptionOrderBundleForChart(dataState);
        OptionChain.UnderlyingType underlyingType = dataState.getUnderlyingType();
        UUID underlyingInstrumentId = dataState.getUnderlyingInstrumentId();
        OptionsSimulatedReturnToolbarState toolbarState = getToolbarState(dataState);
        int tradebarHeight = dataState.getTradebarHeight();
        UiOptionStrategyInfo uiStrategyInfo = dataState.getUiStrategyInfo();
        Boolean boolValueOf = uiStrategyInfo != null ? Boolean.valueOf(uiStrategyInfo.isSingleLeg()) : null;
        UiOptionStrategyInfo uiStrategyInfo2 = dataState.getUiStrategyInfo();
        UUID singleEquityUnderlyingId = (uiStrategyInfo2 == null || (underlyings2 = uiStrategyInfo2.getUnderlyings()) == null) ? null : OptionUnderlyings.getSingleEquityUnderlyingId(underlyings2);
        UiOptionStrategyInfo uiStrategyInfo3 = dataState.getUiStrategyInfo();
        if (uiStrategyInfo3 != null && (underlyings = uiStrategyInfo3.getUnderlyings()) != null) {
            indexUnderlyingId = OptionUnderlyings.getIndexUnderlyingId(underlyings);
        }
        UUID uuid = indexUnderlyingId;
        OptionsSimulatedReturnLoggingState loggingState = getLoggingState(dataState);
        if (dataState.getUseWatchlist()) {
            optionsSimulatedReturnChartDataState2 = OptionsSimulatedReturnChartDataState2.Watchlist.INSTANCE;
        } else {
            optionsSimulatedReturnChartDataState2 = dataState.isLegContext() ? OptionsSimulatedReturnChartDataState2.InstrumentPosition.INSTANCE : OptionsSimulatedReturnChartDataState2.AggregatePosition.INSTANCE;
        }
        return new OptionsSimulatedReturnViewState(fixedAccountNumber, chartType, nuxInfoTooltip, nuxSliderTooltip, optionOrderBundleForChart, underlyingType, underlyingInstrumentId, toolbarState, tradebarHeight, boolValueOf, singleEquityUnderlyingId, uuid, loggingState, optionsSimulatedReturnChartDataState2);
    }
}
