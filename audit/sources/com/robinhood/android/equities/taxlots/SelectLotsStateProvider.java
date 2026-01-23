package com.robinhood.android.equities.taxlots;

import com.robinhood.android.equities.taxlots.selectionmethod.TaxLotSelectionMethod;
import com.robinhood.android.equities.taxlots.table.SelectableTaxLot;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Tradability;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import microgram.contracts.equity_order_context.proto.p487v1.OrderType;

/* compiled from: SelectLotsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;", "Lcom/robinhood/android/equities/taxlots/SelectLotsViewState;", "<init>", "()V", "reduce", "dataState", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class SelectLotsStateProvider implements StateProvider<SelectLotsDataState, SelectLotsViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SelectLotsViewState reduce(SelectLotsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        boolean keyboardVisible = dataState.getKeyboardVisible();
        boolean lotSelectionHasChanged = dataState.getLotSelectionHasChanged();
        boolean strategySelectionHasChanged = dataState.getStrategySelectionHasChanged();
        UUID orderId = dataState.getOrderId();
        Instrument instrument = dataState.getInstrument();
        String symbol = instrument != null ? instrument.getSymbol() : null;
        boolean m1Experiment = dataState.getM1Experiment();
        ImmutableList<TaxLotSelectionMethod> availableSelectionStrategyOptions = dataState.getAvailableSelectionStrategyOptions();
        SetSelectionStrategyFailure setSelectionStrategyFailure = dataState.getSetSelectionStrategyFailure();
        String accountNumber = dataState.getAccountNumber();
        ImmutableList3 persistentList = extensions2.toPersistentList(dataState.getSelectedTaxLots());
        Tradability fractionalTradability = null;
        boolean readOnly = dataState.getReadOnly();
        OrderType orderType = dataState.getOrderType();
        ImmutableList<SelectableTaxLot> selectableTaxLots = dataState.getSelectableTaxLots();
        UUID instrumentId = dataState.getInstrumentId();
        Instrument instrument2 = dataState.getInstrument();
        if (instrument2 != null) {
            fractionalTradability = instrument2.getFractionalTradability();
        }
        TaxLotSort sort = dataState.getSort();
        TaxLotSortDirection direction = dataState.getDirection();
        Function1<TaxLotSort, Unit> onHeaderSelected = dataState.getOnHeaderSelected();
        Function2<SelectableTaxLot, BigDecimal, Unit> updateTaxLotNumberOfShares = dataState.getUpdateTaxLotNumberOfShares();
        String maxGainAndLoss = dataState.getMaxGainAndLoss();
        String maxCostPerShare = dataState.getMaxCostPerShare();
        return new SelectLotsViewState(orderId, readOnly, instrumentId, dataState.getMaximumNumberOfLots(), keyboardVisible, symbol, lotSelectionHasChanged, strategySelectionHasChanged, m1Experiment, availableSelectionStrategyOptions, setSelectionStrategyFailure, accountNumber, persistentList, dataState.getShowNotEnoughSharesAlert(), dataState.getNextPageRequestSize(), orderType, selectableTaxLots, fractionalTradability, sort, direction, onHeaderSelected, updateTaxLotNumberOfShares, maxGainAndLoss, maxCostPerShare);
    }
}
