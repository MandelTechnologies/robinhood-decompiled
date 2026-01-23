package com.robinhood.android.equities.taxlots;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.taxlots.selectionmethod.TaxLotSelectionMethod;
import com.robinhood.android.equities.taxlots.table.SelectableTaxLot;
import com.robinhood.android.equities.taxlots.table.TaxLotsTableHelpers5;
import com.robinhood.android.equities.taxlots.table.TaxLotsTableViewState;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableCollection;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import microgram.contracts.equity_order_context.proto.p487v1.OrderType;

/* compiled from: SelectLotsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B·\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020&\u0018\u00010%\u0012\u001c\b\u0002\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020&\u0018\u00010(\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b,\u0010-J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\bHÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\t\u0010`\u001a\u00020\u0005HÆ\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010c\u001a\u00020\u000bHÆ\u0003J\u000f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010f\u001a\u00020\bHÂ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u001bHÂ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010HÂ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u001fHÂ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010!HÂ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010#HÂ\u0003J\u0017\u0010l\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020&\u0018\u00010%HÂ\u0003J\u001d\u0010m\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020&\u0018\u00010(HÂ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u000bHÂ\u0003JÁ\u0002\u0010p\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020&\u0018\u00010%2\u001c\b\u0002\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020&\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010q\u001a\u00020\u00052\b\u0010r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010s\u001a\u00020\bHÖ\u0001J\t\u0010t\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u00101R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u00101R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u00101R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b?\u00107R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010¢\u0006\b\n\u0000\u001a\u0004\b@\u0010<R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u000e\u0010\u0019\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020&\u0018\u00010%X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020&\u0018\u00010(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001d\u0018\u00010DX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010E\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u00101R\u0011\u0010G\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010J\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u00101R\u0011\u0010L\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u00101R\u0011\u0010N\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u00101R\u0011\u0010P\u001a\u00020Q¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010T\u001a\u00020U¢\u0006\b\n\u0000\u001a\u0004\bV\u0010W¨\u0006u"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsViewState;", "", "orderId", "Ljava/util/UUID;", "readOnly", "", "instrumentId", "maxNumberOfTaxLots", "", "keyboardVisible", "symbol", "", "lotSelectionHasChanged", "strategySelectionHasChanged", "m1Experiment", "selectionStrategies", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equities/taxlots/selectionmethod/TaxLotSelectionMethod;", "setSelectionStrategyFailure", "Lcom/robinhood/android/equities/taxlots/SetSelectionStrategyFailure;", "accountNumber", "selectedTaxLots", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "showNotEnoughSharesDialog", "Lcom/robinhood/models/db/Position;", "nextPageRequestSize", "orderType", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderType;", "selectableTaxLots", "Lcom/robinhood/android/equities/taxlots/table/SelectableTaxLot;", "fractionalTradability", "Lcom/robinhood/models/db/Tradability;", AnalyticsStrings.BUTTON_LIST_SORT, "Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "direction", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;", "onHeaderSelected", "Lkotlin/Function1;", "", "updateTaxLotNumberOfShares", "Lkotlin/Function2;", "Ljava/math/BigDecimal;", "maxGainAndLoss", "maxCostPerShare", "<init>", "(Ljava/util/UUID;ZLjava/util/UUID;IZLjava/lang/String;ZZZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/equities/taxlots/SetSelectionStrategyFailure;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/db/Position;ILmicrogram/contracts/equity_order_context/proto/v1/OrderType;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/db/Tradability;Lequity_trading_tax_lots/proto/v1/TaxLotSort;Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/util/UUID;", "getReadOnly", "()Z", "getInstrumentId", "getMaxNumberOfTaxLots", "()I", "getKeyboardVisible", "getSymbol", "()Ljava/lang/String;", "getLotSelectionHasChanged", "getStrategySelectionHasChanged", "getM1Experiment", "getSelectionStrategies", "()Lkotlinx/collections/immutable/ImmutableList;", "getSetSelectionStrategyFailure", "()Lcom/robinhood/android/equities/taxlots/SetSelectionStrategyFailure;", "getAccountNumber", "getSelectedTaxLots", "getShowNotEnoughSharesDialog", "()Lcom/robinhood/models/db/Position;", "selectableTaxLotsMap", "Lkotlinx/collections/immutable/ImmutableMap;", "showUnsavedAlert", "getShowUnsavedAlert", "numberOfShares", "getNumberOfShares", "()Ljava/math/BigDecimal;", "shouldShowLimitOrderFractionalLotAlert", "getShouldShowLimitOrderFractionalLotAlert", "shouldShowMarketOrderFractionalLotAlert", "getShouldShowMarketOrderFractionalLotAlert", "shouldAdvanceToReview", "getShouldAdvanceToReview", "taxLotsLoggingContext", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;", "getTaxLotsLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;", "tableState", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableViewState;", "getTableState", "()Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableViewState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "other", "hashCode", "toString", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class SelectLotsViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final TaxLotSortDirection direction;
    private final Tradability fractionalTradability;
    private final UUID instrumentId;
    private final boolean keyboardVisible;
    private final boolean lotSelectionHasChanged;
    private final boolean m1Experiment;
    private final String maxCostPerShare;
    private final String maxGainAndLoss;
    private final int maxNumberOfTaxLots;
    private final int nextPageRequestSize;
    private final BigDecimal numberOfShares;
    private final Function1<TaxLotSort, Unit> onHeaderSelected;
    private final UUID orderId;
    private final OrderType orderType;
    private final boolean readOnly;
    private final ImmutableList<SelectableTaxLot> selectableTaxLots;
    private final ImmutableMap<String, SelectableTaxLot> selectableTaxLotsMap;
    private final ImmutableList<TaxLotSelection> selectedTaxLots;
    private final ImmutableList<TaxLotSelectionMethod> selectionStrategies;
    private final SetSelectionStrategyFailure setSelectionStrategyFailure;
    private final boolean shouldAdvanceToReview;
    private final boolean shouldShowLimitOrderFractionalLotAlert;
    private final boolean shouldShowMarketOrderFractionalLotAlert;
    private final Position showNotEnoughSharesDialog;
    private final boolean showUnsavedAlert;
    private final TaxLotSort sort;
    private final boolean strategySelectionHasChanged;
    private final String symbol;
    private final TaxLotsTableViewState tableState;
    private final TaxLotsContext taxLotsLoggingContext;
    private final Function2<SelectableTaxLot, BigDecimal, Unit> updateTaxLotNumberOfShares;

    /* compiled from: SelectLotsViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderType.values().length];
            try {
                iArr[OrderType.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderType.MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderType.ORDER_KIND_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component15, reason: from getter */
    private final int getNextPageRequestSize() {
        return this.nextPageRequestSize;
    }

    /* renamed from: component16, reason: from getter */
    private final OrderType getOrderType() {
        return this.orderType;
    }

    private final ImmutableList<SelectableTaxLot> component17() {
        return this.selectableTaxLots;
    }

    /* renamed from: component18, reason: from getter */
    private final Tradability getFractionalTradability() {
        return this.fractionalTradability;
    }

    /* renamed from: component19, reason: from getter */
    private final TaxLotSort getSort() {
        return this.sort;
    }

    /* renamed from: component20, reason: from getter */
    private final TaxLotSortDirection getDirection() {
        return this.direction;
    }

    private final Function1<TaxLotSort, Unit> component21() {
        return this.onHeaderSelected;
    }

    private final Function2<SelectableTaxLot, BigDecimal, Unit> component22() {
        return this.updateTaxLotNumberOfShares;
    }

    /* renamed from: component23, reason: from getter */
    private final String getMaxGainAndLoss() {
        return this.maxGainAndLoss;
    }

    /* renamed from: component24, reason: from getter */
    private final String getMaxCostPerShare() {
        return this.maxCostPerShare;
    }

    public static /* synthetic */ SelectLotsViewState copy$default(SelectLotsViewState selectLotsViewState, UUID uuid, boolean z, UUID uuid2, int i, boolean z2, String str, boolean z3, boolean z4, boolean z5, ImmutableList immutableList, SetSelectionStrategyFailure setSelectionStrategyFailure, String str2, ImmutableList immutableList2, Position position, int i2, OrderType orderType, ImmutableList immutableList3, Tradability tradability, TaxLotSort taxLotSort, TaxLotSortDirection taxLotSortDirection, Function1 function1, Function2 function2, String str3, String str4, int i3, Object obj) {
        String str5;
        String str6;
        UUID uuid3 = (i3 & 1) != 0 ? selectLotsViewState.orderId : uuid;
        boolean z6 = (i3 & 2) != 0 ? selectLotsViewState.readOnly : z;
        UUID uuid4 = (i3 & 4) != 0 ? selectLotsViewState.instrumentId : uuid2;
        int i4 = (i3 & 8) != 0 ? selectLotsViewState.maxNumberOfTaxLots : i;
        boolean z7 = (i3 & 16) != 0 ? selectLotsViewState.keyboardVisible : z2;
        String str7 = (i3 & 32) != 0 ? selectLotsViewState.symbol : str;
        boolean z8 = (i3 & 64) != 0 ? selectLotsViewState.lotSelectionHasChanged : z3;
        boolean z9 = (i3 & 128) != 0 ? selectLotsViewState.strategySelectionHasChanged : z4;
        boolean z10 = (i3 & 256) != 0 ? selectLotsViewState.m1Experiment : z5;
        ImmutableList immutableList4 = (i3 & 512) != 0 ? selectLotsViewState.selectionStrategies : immutableList;
        SetSelectionStrategyFailure setSelectionStrategyFailure2 = (i3 & 1024) != 0 ? selectLotsViewState.setSelectionStrategyFailure : setSelectionStrategyFailure;
        String str8 = (i3 & 2048) != 0 ? selectLotsViewState.accountNumber : str2;
        ImmutableList immutableList5 = (i3 & 4096) != 0 ? selectLotsViewState.selectedTaxLots : immutableList2;
        Position position2 = (i3 & 8192) != 0 ? selectLotsViewState.showNotEnoughSharesDialog : position;
        UUID uuid5 = uuid3;
        int i5 = (i3 & 16384) != 0 ? selectLotsViewState.nextPageRequestSize : i2;
        OrderType orderType2 = (i3 & 32768) != 0 ? selectLotsViewState.orderType : orderType;
        ImmutableList immutableList6 = (i3 & 65536) != 0 ? selectLotsViewState.selectableTaxLots : immutableList3;
        Tradability tradability2 = (i3 & 131072) != 0 ? selectLotsViewState.fractionalTradability : tradability;
        TaxLotSort taxLotSort2 = (i3 & 262144) != 0 ? selectLotsViewState.sort : taxLotSort;
        TaxLotSortDirection taxLotSortDirection2 = (i3 & 524288) != 0 ? selectLotsViewState.direction : taxLotSortDirection;
        Function1 function12 = (i3 & 1048576) != 0 ? selectLotsViewState.onHeaderSelected : function1;
        Function2 function22 = (i3 & 2097152) != 0 ? selectLotsViewState.updateTaxLotNumberOfShares : function2;
        String str9 = (i3 & 4194304) != 0 ? selectLotsViewState.maxGainAndLoss : str3;
        if ((i3 & 8388608) != 0) {
            str6 = str9;
            str5 = selectLotsViewState.maxCostPerShare;
        } else {
            str5 = str4;
            str6 = str9;
        }
        return selectLotsViewState.copy(uuid5, z6, uuid4, i4, z7, str7, z8, z9, z10, immutableList4, setSelectionStrategyFailure2, str8, immutableList5, position2, i5, orderType2, immutableList6, tradability2, taxLotSort2, taxLotSortDirection2, function12, function22, str6, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    public final ImmutableList<TaxLotSelectionMethod> component10() {
        return this.selectionStrategies;
    }

    /* renamed from: component11, reason: from getter */
    public final SetSelectionStrategyFailure getSetSelectionStrategyFailure() {
        return this.setSelectionStrategyFailure;
    }

    /* renamed from: component12, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ImmutableList<TaxLotSelection> component13() {
        return this.selectedTaxLots;
    }

    /* renamed from: component14, reason: from getter */
    public final Position getShowNotEnoughSharesDialog() {
        return this.showNotEnoughSharesDialog;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxNumberOfTaxLots() {
        return this.maxNumberOfTaxLots;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getKeyboardVisible() {
        return this.keyboardVisible;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getLotSelectionHasChanged() {
        return this.lotSelectionHasChanged;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getStrategySelectionHasChanged() {
        return this.strategySelectionHasChanged;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getM1Experiment() {
        return this.m1Experiment;
    }

    public final SelectLotsViewState copy(UUID orderId, boolean readOnly, UUID instrumentId, int maxNumberOfTaxLots, boolean keyboardVisible, String symbol, boolean lotSelectionHasChanged, boolean strategySelectionHasChanged, boolean m1Experiment, ImmutableList<TaxLotSelectionMethod> selectionStrategies, SetSelectionStrategyFailure setSelectionStrategyFailure, String accountNumber, ImmutableList<TaxLotSelection> selectedTaxLots, Position showNotEnoughSharesDialog, int nextPageRequestSize, OrderType orderType, ImmutableList<SelectableTaxLot> selectableTaxLots, Tradability fractionalTradability, TaxLotSort sort, TaxLotSortDirection direction, Function1<? super TaxLotSort, Unit> onHeaderSelected, Function2<? super SelectableTaxLot, ? super BigDecimal, Unit> updateTaxLotNumberOfShares, String maxGainAndLoss, String maxCostPerShare) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(selectionStrategies, "selectionStrategies");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(selectedTaxLots, "selectedTaxLots");
        return new SelectLotsViewState(orderId, readOnly, instrumentId, maxNumberOfTaxLots, keyboardVisible, symbol, lotSelectionHasChanged, strategySelectionHasChanged, m1Experiment, selectionStrategies, setSelectionStrategyFailure, accountNumber, selectedTaxLots, showNotEnoughSharesDialog, nextPageRequestSize, orderType, selectableTaxLots, fractionalTradability, sort, direction, onHeaderSelected, updateTaxLotNumberOfShares, maxGainAndLoss, maxCostPerShare);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectLotsViewState)) {
            return false;
        }
        SelectLotsViewState selectLotsViewState = (SelectLotsViewState) other;
        return Intrinsics.areEqual(this.orderId, selectLotsViewState.orderId) && this.readOnly == selectLotsViewState.readOnly && Intrinsics.areEqual(this.instrumentId, selectLotsViewState.instrumentId) && this.maxNumberOfTaxLots == selectLotsViewState.maxNumberOfTaxLots && this.keyboardVisible == selectLotsViewState.keyboardVisible && Intrinsics.areEqual(this.symbol, selectLotsViewState.symbol) && this.lotSelectionHasChanged == selectLotsViewState.lotSelectionHasChanged && this.strategySelectionHasChanged == selectLotsViewState.strategySelectionHasChanged && this.m1Experiment == selectLotsViewState.m1Experiment && Intrinsics.areEqual(this.selectionStrategies, selectLotsViewState.selectionStrategies) && Intrinsics.areEqual(this.setSelectionStrategyFailure, selectLotsViewState.setSelectionStrategyFailure) && Intrinsics.areEqual(this.accountNumber, selectLotsViewState.accountNumber) && Intrinsics.areEqual(this.selectedTaxLots, selectLotsViewState.selectedTaxLots) && Intrinsics.areEqual(this.showNotEnoughSharesDialog, selectLotsViewState.showNotEnoughSharesDialog) && this.nextPageRequestSize == selectLotsViewState.nextPageRequestSize && this.orderType == selectLotsViewState.orderType && Intrinsics.areEqual(this.selectableTaxLots, selectLotsViewState.selectableTaxLots) && this.fractionalTradability == selectLotsViewState.fractionalTradability && this.sort == selectLotsViewState.sort && this.direction == selectLotsViewState.direction && Intrinsics.areEqual(this.onHeaderSelected, selectLotsViewState.onHeaderSelected) && Intrinsics.areEqual(this.updateTaxLotNumberOfShares, selectLotsViewState.updateTaxLotNumberOfShares) && Intrinsics.areEqual(this.maxGainAndLoss, selectLotsViewState.maxGainAndLoss) && Intrinsics.areEqual(this.maxCostPerShare, selectLotsViewState.maxCostPerShare);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.orderId.hashCode() * 31) + Boolean.hashCode(this.readOnly)) * 31) + this.instrumentId.hashCode()) * 31) + Integer.hashCode(this.maxNumberOfTaxLots)) * 31) + Boolean.hashCode(this.keyboardVisible)) * 31;
        String str = this.symbol;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.lotSelectionHasChanged)) * 31) + Boolean.hashCode(this.strategySelectionHasChanged)) * 31) + Boolean.hashCode(this.m1Experiment)) * 31) + this.selectionStrategies.hashCode()) * 31;
        SetSelectionStrategyFailure setSelectionStrategyFailure = this.setSelectionStrategyFailure;
        int iHashCode3 = (((((iHashCode2 + (setSelectionStrategyFailure == null ? 0 : setSelectionStrategyFailure.hashCode())) * 31) + this.accountNumber.hashCode()) * 31) + this.selectedTaxLots.hashCode()) * 31;
        Position position = this.showNotEnoughSharesDialog;
        int iHashCode4 = (((iHashCode3 + (position == null ? 0 : position.hashCode())) * 31) + Integer.hashCode(this.nextPageRequestSize)) * 31;
        OrderType orderType = this.orderType;
        int iHashCode5 = (iHashCode4 + (orderType == null ? 0 : orderType.hashCode())) * 31;
        ImmutableList<SelectableTaxLot> immutableList = this.selectableTaxLots;
        int iHashCode6 = (iHashCode5 + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        Tradability tradability = this.fractionalTradability;
        int iHashCode7 = (iHashCode6 + (tradability == null ? 0 : tradability.hashCode())) * 31;
        TaxLotSort taxLotSort = this.sort;
        int iHashCode8 = (iHashCode7 + (taxLotSort == null ? 0 : taxLotSort.hashCode())) * 31;
        TaxLotSortDirection taxLotSortDirection = this.direction;
        int iHashCode9 = (iHashCode8 + (taxLotSortDirection == null ? 0 : taxLotSortDirection.hashCode())) * 31;
        Function1<TaxLotSort, Unit> function1 = this.onHeaderSelected;
        int iHashCode10 = (iHashCode9 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function2<SelectableTaxLot, BigDecimal, Unit> function2 = this.updateTaxLotNumberOfShares;
        int iHashCode11 = (iHashCode10 + (function2 == null ? 0 : function2.hashCode())) * 31;
        String str2 = this.maxGainAndLoss;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maxCostPerShare;
        return iHashCode12 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SelectLotsViewState(orderId=" + this.orderId + ", readOnly=" + this.readOnly + ", instrumentId=" + this.instrumentId + ", maxNumberOfTaxLots=" + this.maxNumberOfTaxLots + ", keyboardVisible=" + this.keyboardVisible + ", symbol=" + this.symbol + ", lotSelectionHasChanged=" + this.lotSelectionHasChanged + ", strategySelectionHasChanged=" + this.strategySelectionHasChanged + ", m1Experiment=" + this.m1Experiment + ", selectionStrategies=" + this.selectionStrategies + ", setSelectionStrategyFailure=" + this.setSelectionStrategyFailure + ", accountNumber=" + this.accountNumber + ", selectedTaxLots=" + this.selectedTaxLots + ", showNotEnoughSharesDialog=" + this.showNotEnoughSharesDialog + ", nextPageRequestSize=" + this.nextPageRequestSize + ", orderType=" + this.orderType + ", selectableTaxLots=" + this.selectableTaxLots + ", fractionalTradability=" + this.fractionalTradability + ", sort=" + this.sort + ", direction=" + this.direction + ", onHeaderSelected=" + this.onHeaderSelected + ", updateTaxLotNumberOfShares=" + this.updateTaxLotNumberOfShares + ", maxGainAndLoss=" + this.maxGainAndLoss + ", maxCostPerShare=" + this.maxCostPerShare + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SelectLotsViewState(UUID orderId, boolean z, UUID instrumentId, int i, boolean z2, String str, boolean z3, boolean z4, boolean z5, ImmutableList<TaxLotSelectionMethod> selectionStrategies, SetSelectionStrategyFailure setSelectionStrategyFailure, String accountNumber, ImmutableList<TaxLotSelection> selectedTaxLots, Position position, int i2, OrderType orderType, ImmutableList<SelectableTaxLot> immutableList, Tradability tradability, TaxLotSort taxLotSort, TaxLotSortDirection taxLotSortDirection, Function1<? super TaxLotSort, Unit> function1, Function2<? super SelectableTaxLot, ? super BigDecimal, Unit> function2, String str2, String str3) {
        ImmutableMap<String, SelectableTaxLot> immutableMap;
        boolean z6;
        boolean z7;
        boolean z8;
        double estimated_credit;
        List<com.robinhood.rosetta.eventlogging.TaxLotSelection> tax_lot_selections;
        String amount;
        OrderType orderType2;
        OrderType orderType3;
        BigDecimal ZERO;
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(selectionStrategies, "selectionStrategies");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(selectedTaxLots, "selectedTaxLots");
        this.orderId = orderId;
        this.readOnly = z;
        this.instrumentId = instrumentId;
        this.maxNumberOfTaxLots = i;
        this.keyboardVisible = z2;
        this.symbol = str;
        this.lotSelectionHasChanged = z3;
        this.strategySelectionHasChanged = z4;
        this.m1Experiment = z5;
        this.selectionStrategies = selectionStrategies;
        this.setSelectionStrategyFailure = setSelectionStrategyFailure;
        this.accountNumber = accountNumber;
        this.selectedTaxLots = selectedTaxLots;
        this.showNotEnoughSharesDialog = position;
        this.nextPageRequestSize = i2;
        this.orderType = orderType;
        this.selectableTaxLots = immutableList;
        this.fractionalTradability = tradability;
        this.sort = taxLotSort;
        this.direction = taxLotSortDirection;
        this.onHeaderSelected = function1;
        this.updateTaxLotNumberOfShares = function2;
        this.maxGainAndLoss = str2;
        this.maxCostPerShare = str3;
        if (immutableList != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(immutableList, 10)), 16));
            for (SelectableTaxLot selectableTaxLot : immutableList) {
                linkedHashMap.put(selectableTaxLot.getId(), selectableTaxLot);
            }
            immutableMap = extensions2.toImmutableMap(linkedHashMap);
        } else {
            immutableMap = null;
        }
        this.selectableTaxLotsMap = immutableMap;
        this.showUnsavedAlert = this.m1Experiment ? this.lotSelectionHasChanged || this.strategySelectionHasChanged : this.lotSelectionHasChanged;
        ImmutableList<TaxLotSelection> immutableList2 = this.selectedTaxLots;
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        for (TaxLotSelection taxLotSelection : immutableList2) {
            Intrinsics.checkNotNull(bigDecimalAdd);
            String shares = taxLotSelection.getShares();
            if (shares == null || (ZERO = StringsKt.toBigDecimalOrNull(shares)) == null) {
                ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            }
            bigDecimalAdd = bigDecimalAdd.add(ZERO);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        Intrinsics.checkNotNull(bigDecimalAdd);
        this.numberOfShares = bigDecimalAdd;
        if (this.selectableTaxLotsMap == null || (orderType3 = this.orderType) == null) {
            z6 = false;
        } else {
            int i3 = orderType3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderType3.ordinal()];
            if (i3 == 1) {
                Collection<SelectableTaxLot> collectionValues = this.selectableTaxLotsMap.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (((SelectableTaxLot) obj).isSelected()) {
                        arrayList.add(obj);
                    }
                }
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bigDecimalValueOf = bigDecimalValueOf.add(((SelectableTaxLot) it.next()).getNumberOfShares());
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
                }
                z6 = UtilsKt.isIntegerValue(bigDecimalValueOf) ? z6 : true;
            } else if (i3 != 2 && i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z6 = false;
        }
        this.shouldShowLimitOrderFractionalLotAlert = z6;
        if (this.selectableTaxLotsMap == null || (orderType2 = this.orderType) == null || this.fractionalTradability == null) {
            z7 = false;
        } else {
            int i4 = orderType2 != null ? WhenMappings.$EnumSwitchMapping$0[orderType2.ordinal()] : -1;
            if (i4 != 1) {
                if (i4 == 2) {
                    Collection<SelectableTaxLot> collectionValues2 = this.selectableTaxLotsMap.values();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : collectionValues2) {
                        if (((SelectableTaxLot) obj2).isSelected()) {
                            arrayList2.add(obj2);
                        }
                    }
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0L);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        bigDecimalValueOf2 = bigDecimalValueOf2.add(((SelectableTaxLot) it2.next()).getNumberOfShares());
                        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "add(...)");
                    }
                    if (!UtilsKt.isIntegerValue(bigDecimalValueOf2) && this.fractionalTradability != Tradability.TRADABLE) {
                        z7 = true;
                    }
                } else if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                z7 = false;
            }
        }
        this.shouldShowMarketOrderFractionalLotAlert = z7;
        ImmutableMap<String, SelectableTaxLot> immutableMap2 = this.selectableTaxLotsMap;
        if (immutableMap2 == null) {
            z8 = false;
        } else {
            Collection<SelectableTaxLot> collectionValues3 = immutableMap2.values();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : collectionValues3) {
                if (((SelectableTaxLot) obj3).isSelected()) {
                    arrayList3.add(obj3);
                }
            }
            BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(0L);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                bigDecimalValueOf3 = bigDecimalValueOf3.add(((SelectableTaxLot) it3.next()).getNumberOfShares());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "add(...)");
            }
            if (this.m1Experiment && bigDecimalValueOf3.compareTo(BigDecimal.ZERO) > 0) {
                z8 = true;
            }
        }
        this.shouldAdvanceToReview = z8;
        ImmutableMap<String, SelectableTaxLot> immutableMap3 = this.selectableTaxLotsMap;
        Iterable<SelectableTaxLot> iterablePersistentSetOf = (immutableMap3 == null || (iterablePersistentSetOf = (ImmutableCollection) immutableMap3.values()) == null) ? extensions2.persistentSetOf() : iterablePersistentSetOf;
        TaxLotsContext taxLotsContext = new TaxLotsContext(null, null, null, null, 0.0d, 0.0d, 0.0d, null, null, 511, null);
        for (SelectableTaxLot selectableTaxLot2 : iterablePersistentSetOf) {
            if (selectableTaxLot2.isSelected()) {
                double estimated_credit2 = taxLotsContext.getEstimated_credit();
                double dDoubleValue = selectableTaxLot2.getNumberOfShares().doubleValue();
                Money cost_basis = selectableTaxLot2.getTaxLot().getCost_basis();
                estimated_credit = estimated_credit2 + (dDoubleValue * ((cost_basis == null || (amount = cost_basis.getAmount()) == null) ? 0.0d : Double.parseDouble(amount)));
            } else {
                estimated_credit = taxLotsContext.getEstimated_credit();
            }
            double total_shares = selectableTaxLot2.isSelected() ? taxLotsContext.getTotal_shares() + selectableTaxLot2.getNumberOfShares().doubleValue() : taxLotsContext.getTotal_shares();
            List<com.robinhood.rosetta.eventlogging.TaxLotSelection> lots_available = taxLotsContext.getLots_available();
            String id = selectableTaxLot2.getId();
            Double doubleOrNull = StringsKt.toDoubleOrNull(selectableTaxLot2.getTaxLot().getAvailable_shares());
            List listPlus = CollectionsKt.plus((Collection<? extends com.robinhood.rosetta.eventlogging.TaxLotSelection>) lots_available, new com.robinhood.rosetta.eventlogging.TaxLotSelection(id, 0.0d, doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d, null, null, 26, null));
            if (selectableTaxLot2.isSelected()) {
                List<com.robinhood.rosetta.eventlogging.TaxLotSelection> tax_lot_selections2 = taxLotsContext.getTax_lot_selections();
                String id2 = selectableTaxLot2.getId();
                double dDoubleValue2 = selectableTaxLot2.getNumberOfShares().doubleValue();
                Double doubleOrNull2 = StringsKt.toDoubleOrNull(selectableTaxLot2.getTaxLot().getAvailable_shares());
                tax_lot_selections = CollectionsKt.plus((Collection<? extends com.robinhood.rosetta.eventlogging.TaxLotSelection>) tax_lot_selections2, new com.robinhood.rosetta.eventlogging.TaxLotSelection(id2, dDoubleValue2, doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d, null, null, 24, null));
            } else {
                tax_lot_selections = taxLotsContext.getTax_lot_selections();
            }
            taxLotsContext = new TaxLotsContext(listPlus, tax_lot_selections, null, null, estimated_credit, 0.0d, total_shares, null, null, 428, null);
        }
        this.taxLotsLoggingContext = taxLotsContext;
        ImmutableList<SelectableTaxLot> immutableList3 = this.selectableTaxLots;
        this.tableState = (immutableList3 == null || this.sort == null || this.direction == null || this.onHeaderSelected == null || this.updateTaxLotNumberOfShares == null) ? TaxLotsTableViewState.Loading.INSTANCE : new TaxLotsTableViewState.Loaded(TaxLotsTableHelpers5.tableDataV2FromTaxLots(this.sort, this.direction, this.readOnly, this.selectableTaxLots, this.onHeaderSelected, this.updateTaxLotNumberOfShares, this.orderId, this.accountNumber, this.instrumentId, this.selectedTaxLots.size(), this.maxGainAndLoss, this.maxCostPerShare, this.maxNumberOfTaxLots), immutableList3.size() >= this.nextPageRequestSize);
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final int getMaxNumberOfTaxLots() {
        return this.maxNumberOfTaxLots;
    }

    public final boolean getKeyboardVisible() {
        return this.keyboardVisible;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final boolean getLotSelectionHasChanged() {
        return this.lotSelectionHasChanged;
    }

    public final boolean getStrategySelectionHasChanged() {
        return this.strategySelectionHasChanged;
    }

    public final boolean getM1Experiment() {
        return this.m1Experiment;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SelectLotsViewState(java.util.UUID r28, boolean r29, java.util.UUID r30, int r31, boolean r32, java.lang.String r33, boolean r34, boolean r35, boolean r36, kotlinx.collections.immutable.ImmutableList r37, com.robinhood.android.equities.taxlots.SetSelectionStrategyFailure r38, java.lang.String r39, kotlinx.collections.immutable.ImmutableList r40, com.robinhood.models.p320db.Position r41, int r42, microgram.contracts.equity_order_context.proto.p487v1.OrderType r43, kotlinx.collections.immutable.ImmutableList r44, com.robinhood.models.p320db.Tradability r45, equity_trading_tax_lots.proto.p460v1.TaxLotSort r46, equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection r47, kotlin.jvm.functions.Function1 r48, kotlin.jvm.functions.Function2 r49, java.lang.String r50, java.lang.String r51, int r52, kotlin.jvm.internal.DefaultConstructorMarker r53) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.equities.taxlots.SelectLotsViewState.<init>(java.util.UUID, boolean, java.util.UUID, int, boolean, java.lang.String, boolean, boolean, boolean, kotlinx.collections.immutable.ImmutableList, com.robinhood.android.equities.taxlots.SetSelectionStrategyFailure, java.lang.String, kotlinx.collections.immutable.ImmutableList, com.robinhood.models.db.Position, int, microgram.contracts.equity_order_context.proto.v1.OrderType, kotlinx.collections.immutable.ImmutableList, com.robinhood.models.db.Tradability, equity_trading_tax_lots.proto.v1.TaxLotSort, equity_trading_tax_lots.proto.v1.TaxLotSortDirection, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ImmutableList<TaxLotSelectionMethod> getSelectionStrategies() {
        return this.selectionStrategies;
    }

    public final SetSelectionStrategyFailure getSetSelectionStrategyFailure() {
        return this.setSelectionStrategyFailure;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ImmutableList<TaxLotSelection> getSelectedTaxLots() {
        return this.selectedTaxLots;
    }

    public final Position getShowNotEnoughSharesDialog() {
        return this.showNotEnoughSharesDialog;
    }

    public final boolean getShowUnsavedAlert() {
        return this.showUnsavedAlert;
    }

    public final BigDecimal getNumberOfShares() {
        return this.numberOfShares;
    }

    public final boolean getShouldShowLimitOrderFractionalLotAlert() {
        return this.shouldShowLimitOrderFractionalLotAlert;
    }

    public final boolean getShouldShowMarketOrderFractionalLotAlert() {
        return this.shouldShowMarketOrderFractionalLotAlert;
    }

    public final boolean getShouldAdvanceToReview() {
        return this.shouldAdvanceToReview;
    }

    public final TaxLotsContext getTaxLotsLoggingContext() {
        return this.taxLotsLoggingContext;
    }

    public final TaxLotsTableViewState getTableState() {
        return this.tableState;
    }
}
