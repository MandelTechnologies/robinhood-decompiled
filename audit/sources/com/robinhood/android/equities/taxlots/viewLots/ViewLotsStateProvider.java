package com.robinhood.android.equities.taxlots.viewLots;

import com.robinhood.android.equities.taxlots.table.SelectableTaxLot;
import com.robinhood.android.equities.taxlots.table.TaxLotsTableHelpers5;
import com.robinhood.android.equities.taxlots.table.TaxLotsTableViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.rosetta.eventlogging.TaxLotSelection;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableCollection;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: ViewLotsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0001¢\u0006\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsDataState;", "Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsViewState;", "<init>", "()V", "reduce", "dataState", "buildTaxLotsLoggingContext", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;", "buildTableViewState", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableViewState;", "buildTableViewState$lib_tax_lots_externalDebug", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ViewLotsStateProvider implements StateProvider<ViewLotsDataState, ViewLotsViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public ViewLotsViewState reduce(ViewLotsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new ViewLotsViewState(buildTableViewState$lib_tax_lots_externalDebug(dataState), buildTaxLotsLoggingContext(dataState));
    }

    private final TaxLotsContext buildTaxLotsLoggingContext(ViewLotsDataState dataState) {
        List listEmptyList;
        ImmutableCollection<SelectableTaxLot> immutableCollection;
        ImmutableMap<String, SelectableTaxLot> selectableTaxLots = dataState.getSelectableTaxLots();
        if (selectableTaxLots == null || (immutableCollection = (ImmutableCollection) selectableTaxLots.values()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableCollection, 10));
            for (SelectableTaxLot selectableTaxLot : immutableCollection) {
                String id = selectableTaxLot.getId();
                double dDoubleValue = selectableTaxLot.getNumberOfShares().doubleValue();
                Double doubleOrNull = StringsKt.toDoubleOrNull(selectableTaxLot.getTaxLot().getAvailable_shares());
                listEmptyList.add(new TaxLotSelection(id, dDoubleValue, doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d, null, null, 24, null));
            }
        }
        return new TaxLotsContext(listEmptyList, null, null, null, 0.0d, 0.0d, 0.0d, null, null, 510, null);
    }

    public final TaxLotsTableViewState buildTableViewState$lib_tax_lots_externalDebug(ViewLotsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getSelectableTaxLots() == null || dataState.getOrderId() == null || dataState.getInstrumentId() == null || dataState.getAccountNumber() == null) {
            return TaxLotsTableViewState.Loading.INSTANCE;
        }
        return new TaxLotsTableViewState.Loaded(TaxLotsTableHelpers5.tableDataV2FromTaxLots(TaxLotSort.DATE, TaxLotSortDirection.DESCENDING, true, CollectionsKt.toList(dataState.getSelectableTaxLots().values()), new Function1() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsStateProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewLotsStateProvider.buildTableViewState$lambda$1((TaxLotSort) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsStateProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ViewLotsStateProvider.buildTableViewState$lambda$2((SelectableTaxLot) obj, (BigDecimal) obj2);
            }
        }, dataState.getOrderId(), dataState.getAccountNumber(), dataState.getInstrumentId(), 0, dataState.getMaxGainAndLoss(), dataState.getMaxCostPerShare(), 30), dataState.getSelectableTaxLots().size() >= dataState.getNextPageRequestSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildTableViewState$lambda$1(TaxLotSort it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildTableViewState$lambda$2(SelectableTaxLot selectableTaxLot, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(selectableTaxLot, "<unused var>");
        Intrinsics.checkNotNullParameter(bigDecimal, "<unused var>");
        throw new IllegalStateException("should not be called in the view lots context");
    }
}
