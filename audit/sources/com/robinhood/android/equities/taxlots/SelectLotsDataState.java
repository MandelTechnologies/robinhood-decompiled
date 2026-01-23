package com.robinhood.android.equities.taxlots;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.taxlots.selectionmethod.TaxLotSelectionMethod;
import com.robinhood.android.equities.taxlots.table.SelectableTaxLot;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import microgram.contracts.equity_order_context.proto.p487v1.OrderType;

/* compiled from: SelectLotsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bS\b\u0087\b\u0018\u00002\u00020\u0001Bï\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010$\u001a\u00020\n\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\n\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\f\u0012\b\b\u0002\u0010+\u001a\u00020\u000f\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00102\u001a\u00020\u0019¢\u0006\u0004\b3\u00104J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0005HÆ\u0003J\t\u0010d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010f\u001a\u00020\nHÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\t\u0010h\u001a\u00020\u000fHÆ\u0003J\u0017\u0010i\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\t\u0010j\u001a\u00020\nHÆ\u0003J\u001d\u0010k\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015HÆ\u0003J\t\u0010l\u001a\u00020\u0019HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0017\u0010o\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001fHÆ\u0003J\u000f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00120!HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010#HÆ\u0003J\t\u0010r\u001a\u00020\nHÆ\u0003J\t\u0010s\u001a\u00020\nHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010v\u001a\u00020\nHÆ\u0003J\u000f\u0010w\u001a\b\u0012\u0004\u0012\u00020*0\fHÆ\u0003J\t\u0010x\u001a\u00020\u000fHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010-HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u000100HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u000100HÆ\u0003J\t\u0010}\u001a\u00020\u0019HÆ\u0003Jù\u0002\u0010~\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\n2\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010(\u001a\u00020\n2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\f2\b\b\u0002\u0010+\u001a\u00020\u000f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\b\b\u0002\u00102\u001a\u00020\u0019HÆ\u0001J\u0014\u0010\u007f\u001a\u00020\n2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0019HÖ\u0001J\n\u0010\u0082\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bD\u0010=R%\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u001f\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120!¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0011\u0010$\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bS\u0010=R\u0011\u0010%\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bT\u0010=R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u00106R\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u00106R\u0011\u0010(\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bW\u0010=R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\f¢\u0006\b\n\u0000\u001a\u0004\bX\u0010?R\u0011\u0010+\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bY\u0010AR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0013\u0010.\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0013\u0010/\u001a\u0004\u0018\u000100¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0013\u00101\u001a\u0004\u0018\u000100¢\u0006\b\n\u0000\u001a\u0004\b`\u0010_R\u0011\u00102\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\ba\u0010H¨\u0006\u0083\u0001"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;", "", "accountNumber", "", "orderId", "Ljava/util/UUID;", "instrumentId", "instrument", "Lcom/robinhood/models/db/Instrument;", "readOnly", "", "selectableTaxLots", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equities/taxlots/table/SelectableTaxLot;", "initialSelectionStrategy", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "initialSelectedTaxLots", "", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "keyboardVisible", "updateTaxLotNumberOfShares", "Lkotlin/Function2;", "Ljava/math/BigDecimal;", "", "nextPageRequestSize", "", AnalyticsStrings.BUTTON_LIST_SORT, "Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "direction", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;", "onHeaderSelected", "Lkotlin/Function1;", "selectedTaxLots", "", "orderType", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderType;", "lotSelectionHasChanged", "strategySelectionHasChanged", "maxGainAndLoss", "maxCostPerShare", "m1Experiment", "availableSelectionStrategyOptions", "Lcom/robinhood/android/equities/taxlots/selectionmethod/TaxLotSelectionMethod;", "currentSelectionStrategy", "setSelectionStrategyFailure", "Lcom/robinhood/android/equities/taxlots/SetSelectionStrategyFailure;", "orderFormNumberOfShares", "position", "Lcom/robinhood/models/db/Position;", "showNotEnoughSharesAlert", "maximumNumberOfLots", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/db/Instrument;ZLkotlinx/collections/immutable/ImmutableList;Lequity_trading_tax_lots/proto/v1/SelectionStrategy;Ljava/util/Map;ZLkotlin/jvm/functions/Function2;ILequity_trading_tax_lots/proto/v1/TaxLotSort;Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lmicrogram/contracts/equity_order_context/proto/v1/OrderType;ZZLjava/lang/String;Ljava/lang/String;ZLkotlinx/collections/immutable/ImmutableList;Lequity_trading_tax_lots/proto/v1/SelectionStrategy;Lcom/robinhood/android/equities/taxlots/SetSelectionStrategyFailure;Ljava/math/BigDecimal;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/Position;I)V", "getAccountNumber", "()Ljava/lang/String;", "getOrderId", "()Ljava/util/UUID;", "getInstrumentId", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getReadOnly", "()Z", "getSelectableTaxLots", "()Lkotlinx/collections/immutable/ImmutableList;", "getInitialSelectionStrategy", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "getInitialSelectedTaxLots", "()Ljava/util/Map;", "getKeyboardVisible", "getUpdateTaxLotNumberOfShares", "()Lkotlin/jvm/functions/Function2;", "getNextPageRequestSize", "()I", "getSort", "()Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "getDirection", "()Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;", "getOnHeaderSelected", "()Lkotlin/jvm/functions/Function1;", "getSelectedTaxLots", "()Ljava/util/List;", "getOrderType", "()Lmicrogram/contracts/equity_order_context/proto/v1/OrderType;", "getLotSelectionHasChanged", "getStrategySelectionHasChanged", "getMaxGainAndLoss", "getMaxCostPerShare", "getM1Experiment", "getAvailableSelectionStrategyOptions", "getCurrentSelectionStrategy", "getSetSelectionStrategyFailure", "()Lcom/robinhood/android/equities/taxlots/SetSelectionStrategyFailure;", "getOrderFormNumberOfShares", "()Ljava/math/BigDecimal;", "getPosition", "()Lcom/robinhood/models/db/Position;", "getShowNotEnoughSharesAlert", "getMaximumNumberOfLots", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "equals", "other", "hashCode", "toString", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectLotsDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final ImmutableList<TaxLotSelectionMethod> availableSelectionStrategyOptions;
    private final SelectionStrategy currentSelectionStrategy;
    private final TaxLotSortDirection direction;
    private final Map<String, TaxLotSelection> initialSelectedTaxLots;
    private final SelectionStrategy initialSelectionStrategy;
    private final Instrument instrument;
    private final UUID instrumentId;
    private final boolean keyboardVisible;
    private final boolean lotSelectionHasChanged;
    private final boolean m1Experiment;
    private final String maxCostPerShare;
    private final String maxGainAndLoss;
    private final int maximumNumberOfLots;
    private final int nextPageRequestSize;
    private final Function1<TaxLotSort, Unit> onHeaderSelected;
    private final BigDecimal orderFormNumberOfShares;
    private final UUID orderId;
    private final OrderType orderType;
    private final Position position;
    private final boolean readOnly;
    private final ImmutableList<SelectableTaxLot> selectableTaxLots;
    private final List<TaxLotSelection> selectedTaxLots;
    private final SetSelectionStrategyFailure setSelectionStrategyFailure;
    private final Position showNotEnoughSharesAlert;
    private final TaxLotSort sort;
    private final boolean strategySelectionHasChanged;
    private final Function2<SelectableTaxLot, BigDecimal, Unit> updateTaxLotNumberOfShares;

    public static /* synthetic */ SelectLotsDataState copy$default(SelectLotsDataState selectLotsDataState, String str, UUID uuid, UUID uuid2, Instrument instrument, boolean z, ImmutableList immutableList, SelectionStrategy selectionStrategy, Map map, boolean z2, Function2 function2, int i, TaxLotSort taxLotSort, TaxLotSortDirection taxLotSortDirection, Function1 function1, List list, OrderType orderType, boolean z3, boolean z4, String str2, String str3, boolean z5, ImmutableList immutableList2, SelectionStrategy selectionStrategy2, SetSelectionStrategyFailure selectLotsStateProvider4, BigDecimal bigDecimal, Position position, Position position2, int i2, int i3, Object obj) {
        int i4;
        Position position3;
        String str4 = (i3 & 1) != 0 ? selectLotsDataState.accountNumber : str;
        UUID uuid3 = (i3 & 2) != 0 ? selectLotsDataState.orderId : uuid;
        UUID uuid4 = (i3 & 4) != 0 ? selectLotsDataState.instrumentId : uuid2;
        Instrument instrument2 = (i3 & 8) != 0 ? selectLotsDataState.instrument : instrument;
        boolean z6 = (i3 & 16) != 0 ? selectLotsDataState.readOnly : z;
        ImmutableList immutableList3 = (i3 & 32) != 0 ? selectLotsDataState.selectableTaxLots : immutableList;
        SelectionStrategy selectionStrategy3 = (i3 & 64) != 0 ? selectLotsDataState.initialSelectionStrategy : selectionStrategy;
        Map map2 = (i3 & 128) != 0 ? selectLotsDataState.initialSelectedTaxLots : map;
        boolean z7 = (i3 & 256) != 0 ? selectLotsDataState.keyboardVisible : z2;
        Function2 function22 = (i3 & 512) != 0 ? selectLotsDataState.updateTaxLotNumberOfShares : function2;
        int i5 = (i3 & 1024) != 0 ? selectLotsDataState.nextPageRequestSize : i;
        TaxLotSort taxLotSort2 = (i3 & 2048) != 0 ? selectLotsDataState.sort : taxLotSort;
        TaxLotSortDirection taxLotSortDirection2 = (i3 & 4096) != 0 ? selectLotsDataState.direction : taxLotSortDirection;
        Function1 function12 = (i3 & 8192) != 0 ? selectLotsDataState.onHeaderSelected : function1;
        String str5 = str4;
        List list2 = (i3 & 16384) != 0 ? selectLotsDataState.selectedTaxLots : list;
        OrderType orderType2 = (i3 & 32768) != 0 ? selectLotsDataState.orderType : orderType;
        boolean z8 = (i3 & 65536) != 0 ? selectLotsDataState.lotSelectionHasChanged : z3;
        boolean z9 = (i3 & 131072) != 0 ? selectLotsDataState.strategySelectionHasChanged : z4;
        String str6 = (i3 & 262144) != 0 ? selectLotsDataState.maxGainAndLoss : str2;
        String str7 = (i3 & 524288) != 0 ? selectLotsDataState.maxCostPerShare : str3;
        boolean z10 = (i3 & 1048576) != 0 ? selectLotsDataState.m1Experiment : z5;
        ImmutableList immutableList4 = (i3 & 2097152) != 0 ? selectLotsDataState.availableSelectionStrategyOptions : immutableList2;
        SelectionStrategy selectionStrategy4 = (i3 & 4194304) != 0 ? selectLotsDataState.currentSelectionStrategy : selectionStrategy2;
        SetSelectionStrategyFailure selectLotsStateProvider42 = (i3 & 8388608) != 0 ? selectLotsDataState.setSelectionStrategyFailure : selectLotsStateProvider4;
        BigDecimal bigDecimal2 = (i3 & 16777216) != 0 ? selectLotsDataState.orderFormNumberOfShares : bigDecimal;
        Position position4 = (i3 & 33554432) != 0 ? selectLotsDataState.position : position;
        Position position5 = (i3 & 67108864) != 0 ? selectLotsDataState.showNotEnoughSharesAlert : position2;
        if ((i3 & 134217728) != 0) {
            position3 = position5;
            i4 = selectLotsDataState.maximumNumberOfLots;
        } else {
            i4 = i2;
            position3 = position5;
        }
        return selectLotsDataState.copy(str5, uuid3, uuid4, instrument2, z6, immutableList3, selectionStrategy3, map2, z7, function22, i5, taxLotSort2, taxLotSortDirection2, function12, list2, orderType2, z8, z9, str6, str7, z10, immutableList4, selectionStrategy4, selectLotsStateProvider42, bigDecimal2, position4, position3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Function2<SelectableTaxLot, BigDecimal, Unit> component10() {
        return this.updateTaxLotNumberOfShares;
    }

    /* renamed from: component11, reason: from getter */
    public final int getNextPageRequestSize() {
        return this.nextPageRequestSize;
    }

    /* renamed from: component12, reason: from getter */
    public final TaxLotSort getSort() {
        return this.sort;
    }

    /* renamed from: component13, reason: from getter */
    public final TaxLotSortDirection getDirection() {
        return this.direction;
    }

    public final Function1<TaxLotSort, Unit> component14() {
        return this.onHeaderSelected;
    }

    public final List<TaxLotSelection> component15() {
        return this.selectedTaxLots;
    }

    /* renamed from: component16, reason: from getter */
    public final OrderType getOrderType() {
        return this.orderType;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getLotSelectionHasChanged() {
        return this.lotSelectionHasChanged;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getStrategySelectionHasChanged() {
        return this.strategySelectionHasChanged;
    }

    /* renamed from: component19, reason: from getter */
    public final String getMaxGainAndLoss() {
        return this.maxGainAndLoss;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    /* renamed from: component20, reason: from getter */
    public final String getMaxCostPerShare() {
        return this.maxCostPerShare;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getM1Experiment() {
        return this.m1Experiment;
    }

    public final ImmutableList<TaxLotSelectionMethod> component22() {
        return this.availableSelectionStrategyOptions;
    }

    /* renamed from: component23, reason: from getter */
    public final SelectionStrategy getCurrentSelectionStrategy() {
        return this.currentSelectionStrategy;
    }

    /* renamed from: component24, reason: from getter */
    public final SetSelectionStrategyFailure getSetSelectionStrategyFailure() {
        return this.setSelectionStrategyFailure;
    }

    /* renamed from: component25, reason: from getter */
    public final BigDecimal getOrderFormNumberOfShares() {
        return this.orderFormNumberOfShares;
    }

    /* renamed from: component26, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }

    /* renamed from: component27, reason: from getter */
    public final Position getShowNotEnoughSharesAlert() {
        return this.showNotEnoughSharesAlert;
    }

    /* renamed from: component28, reason: from getter */
    public final int getMaximumNumberOfLots() {
        return this.maximumNumberOfLots;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component4, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final ImmutableList<SelectableTaxLot> component6() {
        return this.selectableTaxLots;
    }

    /* renamed from: component7, reason: from getter */
    public final SelectionStrategy getInitialSelectionStrategy() {
        return this.initialSelectionStrategy;
    }

    public final Map<String, TaxLotSelection> component8() {
        return this.initialSelectedTaxLots;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getKeyboardVisible() {
        return this.keyboardVisible;
    }

    public final SelectLotsDataState copy(String accountNumber, UUID orderId, UUID instrumentId, Instrument instrument, boolean readOnly, ImmutableList<SelectableTaxLot> selectableTaxLots, SelectionStrategy initialSelectionStrategy, Map<String, TaxLotSelection> initialSelectedTaxLots, boolean keyboardVisible, Function2<? super SelectableTaxLot, ? super BigDecimal, Unit> updateTaxLotNumberOfShares, int nextPageRequestSize, TaxLotSort sort, TaxLotSortDirection direction, Function1<? super TaxLotSort, Unit> onHeaderSelected, List<TaxLotSelection> selectedTaxLots, OrderType orderType, boolean lotSelectionHasChanged, boolean strategySelectionHasChanged, String maxGainAndLoss, String maxCostPerShare, boolean m1Experiment, ImmutableList<TaxLotSelectionMethod> availableSelectionStrategyOptions, SelectionStrategy currentSelectionStrategy, SetSelectionStrategyFailure setSelectionStrategyFailure, BigDecimal orderFormNumberOfShares, Position position, Position showNotEnoughSharesAlert, int maximumNumberOfLots) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(initialSelectionStrategy, "initialSelectionStrategy");
        Intrinsics.checkNotNullParameter(selectedTaxLots, "selectedTaxLots");
        Intrinsics.checkNotNullParameter(availableSelectionStrategyOptions, "availableSelectionStrategyOptions");
        Intrinsics.checkNotNullParameter(currentSelectionStrategy, "currentSelectionStrategy");
        return new SelectLotsDataState(accountNumber, orderId, instrumentId, instrument, readOnly, selectableTaxLots, initialSelectionStrategy, initialSelectedTaxLots, keyboardVisible, updateTaxLotNumberOfShares, nextPageRequestSize, sort, direction, onHeaderSelected, selectedTaxLots, orderType, lotSelectionHasChanged, strategySelectionHasChanged, maxGainAndLoss, maxCostPerShare, m1Experiment, availableSelectionStrategyOptions, currentSelectionStrategy, setSelectionStrategyFailure, orderFormNumberOfShares, position, showNotEnoughSharesAlert, maximumNumberOfLots);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectLotsDataState)) {
            return false;
        }
        SelectLotsDataState selectLotsDataState = (SelectLotsDataState) other;
        return Intrinsics.areEqual(this.accountNumber, selectLotsDataState.accountNumber) && Intrinsics.areEqual(this.orderId, selectLotsDataState.orderId) && Intrinsics.areEqual(this.instrumentId, selectLotsDataState.instrumentId) && Intrinsics.areEqual(this.instrument, selectLotsDataState.instrument) && this.readOnly == selectLotsDataState.readOnly && Intrinsics.areEqual(this.selectableTaxLots, selectLotsDataState.selectableTaxLots) && this.initialSelectionStrategy == selectLotsDataState.initialSelectionStrategy && Intrinsics.areEqual(this.initialSelectedTaxLots, selectLotsDataState.initialSelectedTaxLots) && this.keyboardVisible == selectLotsDataState.keyboardVisible && Intrinsics.areEqual(this.updateTaxLotNumberOfShares, selectLotsDataState.updateTaxLotNumberOfShares) && this.nextPageRequestSize == selectLotsDataState.nextPageRequestSize && this.sort == selectLotsDataState.sort && this.direction == selectLotsDataState.direction && Intrinsics.areEqual(this.onHeaderSelected, selectLotsDataState.onHeaderSelected) && Intrinsics.areEqual(this.selectedTaxLots, selectLotsDataState.selectedTaxLots) && this.orderType == selectLotsDataState.orderType && this.lotSelectionHasChanged == selectLotsDataState.lotSelectionHasChanged && this.strategySelectionHasChanged == selectLotsDataState.strategySelectionHasChanged && Intrinsics.areEqual(this.maxGainAndLoss, selectLotsDataState.maxGainAndLoss) && Intrinsics.areEqual(this.maxCostPerShare, selectLotsDataState.maxCostPerShare) && this.m1Experiment == selectLotsDataState.m1Experiment && Intrinsics.areEqual(this.availableSelectionStrategyOptions, selectLotsDataState.availableSelectionStrategyOptions) && this.currentSelectionStrategy == selectLotsDataState.currentSelectionStrategy && Intrinsics.areEqual(this.setSelectionStrategyFailure, selectLotsDataState.setSelectionStrategyFailure) && Intrinsics.areEqual(this.orderFormNumberOfShares, selectLotsDataState.orderFormNumberOfShares) && Intrinsics.areEqual(this.position, selectLotsDataState.position) && Intrinsics.areEqual(this.showNotEnoughSharesAlert, selectLotsDataState.showNotEnoughSharesAlert) && this.maximumNumberOfLots == selectLotsDataState.maximumNumberOfLots;
    }

    public int hashCode() {
        int iHashCode = ((((this.accountNumber.hashCode() * 31) + this.orderId.hashCode()) * 31) + this.instrumentId.hashCode()) * 31;
        Instrument instrument = this.instrument;
        int iHashCode2 = (((iHashCode + (instrument == null ? 0 : instrument.hashCode())) * 31) + Boolean.hashCode(this.readOnly)) * 31;
        ImmutableList<SelectableTaxLot> immutableList = this.selectableTaxLots;
        int iHashCode3 = (((iHashCode2 + (immutableList == null ? 0 : immutableList.hashCode())) * 31) + this.initialSelectionStrategy.hashCode()) * 31;
        Map<String, TaxLotSelection> map = this.initialSelectedTaxLots;
        int iHashCode4 = (((iHashCode3 + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.keyboardVisible)) * 31;
        Function2<SelectableTaxLot, BigDecimal, Unit> function2 = this.updateTaxLotNumberOfShares;
        int iHashCode5 = (((iHashCode4 + (function2 == null ? 0 : function2.hashCode())) * 31) + Integer.hashCode(this.nextPageRequestSize)) * 31;
        TaxLotSort taxLotSort = this.sort;
        int iHashCode6 = (iHashCode5 + (taxLotSort == null ? 0 : taxLotSort.hashCode())) * 31;
        TaxLotSortDirection taxLotSortDirection = this.direction;
        int iHashCode7 = (iHashCode6 + (taxLotSortDirection == null ? 0 : taxLotSortDirection.hashCode())) * 31;
        Function1<TaxLotSort, Unit> function1 = this.onHeaderSelected;
        int iHashCode8 = (((iHashCode7 + (function1 == null ? 0 : function1.hashCode())) * 31) + this.selectedTaxLots.hashCode()) * 31;
        OrderType orderType = this.orderType;
        int iHashCode9 = (((((iHashCode8 + (orderType == null ? 0 : orderType.hashCode())) * 31) + Boolean.hashCode(this.lotSelectionHasChanged)) * 31) + Boolean.hashCode(this.strategySelectionHasChanged)) * 31;
        String str = this.maxGainAndLoss;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maxCostPerShare;
        int iHashCode11 = (((((((iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.m1Experiment)) * 31) + this.availableSelectionStrategyOptions.hashCode()) * 31) + this.currentSelectionStrategy.hashCode()) * 31;
        SetSelectionStrategyFailure selectLotsStateProvider4 = this.setSelectionStrategyFailure;
        int iHashCode12 = (iHashCode11 + (selectLotsStateProvider4 == null ? 0 : selectLotsStateProvider4.hashCode())) * 31;
        BigDecimal bigDecimal = this.orderFormNumberOfShares;
        int iHashCode13 = (iHashCode12 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Position position = this.position;
        int iHashCode14 = (iHashCode13 + (position == null ? 0 : position.hashCode())) * 31;
        Position position2 = this.showNotEnoughSharesAlert;
        return ((iHashCode14 + (position2 != null ? position2.hashCode() : 0)) * 31) + Integer.hashCode(this.maximumNumberOfLots);
    }

    public String toString() {
        return "SelectLotsDataState(accountNumber=" + this.accountNumber + ", orderId=" + this.orderId + ", instrumentId=" + this.instrumentId + ", instrument=" + this.instrument + ", readOnly=" + this.readOnly + ", selectableTaxLots=" + this.selectableTaxLots + ", initialSelectionStrategy=" + this.initialSelectionStrategy + ", initialSelectedTaxLots=" + this.initialSelectedTaxLots + ", keyboardVisible=" + this.keyboardVisible + ", updateTaxLotNumberOfShares=" + this.updateTaxLotNumberOfShares + ", nextPageRequestSize=" + this.nextPageRequestSize + ", sort=" + this.sort + ", direction=" + this.direction + ", onHeaderSelected=" + this.onHeaderSelected + ", selectedTaxLots=" + this.selectedTaxLots + ", orderType=" + this.orderType + ", lotSelectionHasChanged=" + this.lotSelectionHasChanged + ", strategySelectionHasChanged=" + this.strategySelectionHasChanged + ", maxGainAndLoss=" + this.maxGainAndLoss + ", maxCostPerShare=" + this.maxCostPerShare + ", m1Experiment=" + this.m1Experiment + ", availableSelectionStrategyOptions=" + this.availableSelectionStrategyOptions + ", currentSelectionStrategy=" + this.currentSelectionStrategy + ", setSelectionStrategyFailure=" + this.setSelectionStrategyFailure + ", orderFormNumberOfShares=" + this.orderFormNumberOfShares + ", position=" + this.position + ", showNotEnoughSharesAlert=" + this.showNotEnoughSharesAlert + ", maximumNumberOfLots=" + this.maximumNumberOfLots + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectLotsDataState(String accountNumber, UUID orderId, UUID instrumentId, Instrument instrument, boolean z, ImmutableList<SelectableTaxLot> immutableList, SelectionStrategy initialSelectionStrategy, Map<String, TaxLotSelection> map, boolean z2, Function2<? super SelectableTaxLot, ? super BigDecimal, Unit> function2, int i, TaxLotSort taxLotSort, TaxLotSortDirection taxLotSortDirection, Function1<? super TaxLotSort, Unit> function1, List<TaxLotSelection> selectedTaxLots, OrderType orderType, boolean z3, boolean z4, String str, String str2, boolean z5, ImmutableList<TaxLotSelectionMethod> availableSelectionStrategyOptions, SelectionStrategy currentSelectionStrategy, SetSelectionStrategyFailure selectLotsStateProvider4, BigDecimal bigDecimal, Position position, Position position2, int i2) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(initialSelectionStrategy, "initialSelectionStrategy");
        Intrinsics.checkNotNullParameter(selectedTaxLots, "selectedTaxLots");
        Intrinsics.checkNotNullParameter(availableSelectionStrategyOptions, "availableSelectionStrategyOptions");
        Intrinsics.checkNotNullParameter(currentSelectionStrategy, "currentSelectionStrategy");
        this.accountNumber = accountNumber;
        this.orderId = orderId;
        this.instrumentId = instrumentId;
        this.instrument = instrument;
        this.readOnly = z;
        this.selectableTaxLots = immutableList;
        this.initialSelectionStrategy = initialSelectionStrategy;
        this.initialSelectedTaxLots = map;
        this.keyboardVisible = z2;
        this.updateTaxLotNumberOfShares = function2;
        this.nextPageRequestSize = i;
        this.sort = taxLotSort;
        this.direction = taxLotSortDirection;
        this.onHeaderSelected = function1;
        this.selectedTaxLots = selectedTaxLots;
        this.orderType = orderType;
        this.lotSelectionHasChanged = z3;
        this.strategySelectionHasChanged = z4;
        this.maxGainAndLoss = str;
        this.maxCostPerShare = str2;
        this.m1Experiment = z5;
        this.availableSelectionStrategyOptions = availableSelectionStrategyOptions;
        this.currentSelectionStrategy = currentSelectionStrategy;
        this.setSelectionStrategyFailure = selectLotsStateProvider4;
        this.orderFormNumberOfShares = bigDecimal;
        this.position = position;
        this.showNotEnoughSharesAlert = position2;
        this.maximumNumberOfLots = i2;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final ImmutableList<SelectableTaxLot> getSelectableTaxLots() {
        return this.selectableTaxLots;
    }

    public /* synthetic */ SelectLotsDataState(String str, UUID uuid, UUID uuid2, Instrument instrument, boolean z, ImmutableList immutableList, SelectionStrategy selectionStrategy, Map map, boolean z2, Function2 function2, int i, TaxLotSort taxLotSort, TaxLotSortDirection taxLotSortDirection, Function1 function1, List list, OrderType orderType, boolean z3, boolean z4, String str2, String str3, boolean z5, ImmutableList immutableList2, SelectionStrategy selectionStrategy2, SetSelectionStrategyFailure selectLotsStateProvider4, BigDecimal bigDecimal, Position position, Position position2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uuid, uuid2, (i3 & 8) != 0 ? null : instrument, z, (i3 & 32) != 0 ? null : immutableList, (i3 & 64) != 0 ? SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED : selectionStrategy, (i3 & 128) != 0 ? null : map, (i3 & 256) != 0 ? false : z2, (i3 & 512) != 0 ? null : function2, (i3 & 1024) != 0 ? 50 : i, (i3 & 2048) != 0 ? null : taxLotSort, (i3 & 4096) != 0 ? null : taxLotSortDirection, (i3 & 8192) != 0 ? null : function1, (i3 & 16384) != 0 ? CollectionsKt.emptyList() : list, (32768 & i3) != 0 ? null : orderType, (65536 & i3) != 0 ? false : z3, (131072 & i3) != 0 ? false : z4, (262144 & i3) != 0 ? null : str2, (524288 & i3) != 0 ? null : str3, (1048576 & i3) != 0 ? false : z5, (2097152 & i3) != 0 ? extensions2.persistentListOf() : immutableList2, (4194304 & i3) != 0 ? SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED : selectionStrategy2, (8388608 & i3) != 0 ? null : selectLotsStateProvider4, (16777216 & i3) != 0 ? null : bigDecimal, (33554432 & i3) != 0 ? null : position, (67108864 & i3) != 0 ? null : position2, (i3 & 134217728) != 0 ? 30 : i2);
    }

    public final SelectionStrategy getInitialSelectionStrategy() {
        return this.initialSelectionStrategy;
    }

    public final Map<String, TaxLotSelection> getInitialSelectedTaxLots() {
        return this.initialSelectedTaxLots;
    }

    public final boolean getKeyboardVisible() {
        return this.keyboardVisible;
    }

    public final Function2<SelectableTaxLot, BigDecimal, Unit> getUpdateTaxLotNumberOfShares() {
        return this.updateTaxLotNumberOfShares;
    }

    public final int getNextPageRequestSize() {
        return this.nextPageRequestSize;
    }

    public final TaxLotSort getSort() {
        return this.sort;
    }

    public final TaxLotSortDirection getDirection() {
        return this.direction;
    }

    public final Function1<TaxLotSort, Unit> getOnHeaderSelected() {
        return this.onHeaderSelected;
    }

    public final List<TaxLotSelection> getSelectedTaxLots() {
        return this.selectedTaxLots;
    }

    public final OrderType getOrderType() {
        return this.orderType;
    }

    public final boolean getLotSelectionHasChanged() {
        return this.lotSelectionHasChanged;
    }

    public final boolean getStrategySelectionHasChanged() {
        return this.strategySelectionHasChanged;
    }

    public final String getMaxGainAndLoss() {
        return this.maxGainAndLoss;
    }

    public final String getMaxCostPerShare() {
        return this.maxCostPerShare;
    }

    public final boolean getM1Experiment() {
        return this.m1Experiment;
    }

    public final ImmutableList<TaxLotSelectionMethod> getAvailableSelectionStrategyOptions() {
        return this.availableSelectionStrategyOptions;
    }

    public final SelectionStrategy getCurrentSelectionStrategy() {
        return this.currentSelectionStrategy;
    }

    public final SetSelectionStrategyFailure getSetSelectionStrategyFailure() {
        return this.setSelectionStrategyFailure;
    }

    public final BigDecimal getOrderFormNumberOfShares() {
        return this.orderFormNumberOfShares;
    }

    public final Position getPosition() {
        return this.position;
    }

    public final Position getShowNotEnoughSharesAlert() {
        return this.showNotEnoughSharesAlert;
    }

    public final int getMaximumNumberOfLots() {
        return this.maximumNumberOfLots;
    }
}
