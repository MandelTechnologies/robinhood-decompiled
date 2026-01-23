package com.robinhood.android.equities.taxlots.viewLots;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.equities.taxlots.table.SelectableTaxLot;
import com.robinhood.android.equities.taxlots.table.TaxLotsTableHelpers5;
import com.robinhood.android.equities.taxlots.table.TaxLotsTableKt;
import com.robinhood.android.equities.taxlots.table.TaxLotsTableViewState;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: ViewLotsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/viewLots/ViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewStateParameterProvider, reason: use source file name */
/* loaded from: classes3.dex */
final class ViewLotsComposable5 implements PreviewParameterProvider<ViewLotsViewState> {
    private final Sequence<ViewLotsViewState> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public ViewLotsComposable5() {
        ViewLotsViewState viewLotsViewState = new ViewLotsViewState(TaxLotsTableViewState.Loading.INSTANCE, new TaxLotsContext(null, null, null, null, 0.0d, 0.0d, 0.0d, null, null, 511, null));
        UUID uuid = new UUID(10L, 0L);
        UUID uuid2 = new UUID(0L, 20L);
        this.values = SequencesKt.sequenceOf(viewLotsViewState, new ViewLotsViewState(new TaxLotsTableViewState.Loaded(TaxLotsTableHelpers5.tableDataV2FromTaxLots(TaxLotSort.DATE, TaxLotSortDirection.DESCENDING, false, TaxLotsTableKt.getMockLaxLotData(), new Function1() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewStateParameterProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewLotsComposable5.values$lambda$0((TaxLotSort) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewStateParameterProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ViewLotsComposable5.values$lambda$1((SelectableTaxLot) obj, (BigDecimal) obj2);
            }
        }, uuid2, "123456789", uuid, 0, null, null, 30), false), new TaxLotsContext(null, null, null, null, 0.0d, 0.0d, 0.0d, null, null, 511, null)));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<ViewLotsViewState> getValues() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit values$lambda$1(SelectableTaxLot selectableTaxLot, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(selectableTaxLot, "<unused var>");
        Intrinsics.checkNotNullParameter(bigDecimal, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit values$lambda$0(TaxLotSort it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
