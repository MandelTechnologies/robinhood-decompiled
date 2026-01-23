package com.robinhood.android.equities.taxlots;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.equities.taxlots.table.SelectableTaxLot;
import com.robinhood.android.equities.taxlots.table.TaxLotsTableKt;
import com.robinhood.android.portfolio.pnl.fixtures.ProfitAndLossTradeItemFixtures;
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
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SelectLotsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/ViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/equities/taxlots/SelectLotsViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
final class ViewStateParameterProvider implements PreviewParameterProvider<SelectLotsViewState> {
    private final Sequence<SelectLotsViewState> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public ViewStateParameterProvider() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        UUID uuidRandomUUID2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
        SelectLotsViewState selectLotsViewState = new SelectLotsViewState(uuidRandomUUID, false, uuidRandomUUID2, 30, false, null, false, false, false, null, null, "123456789", null, null, 0, null, null, null, null, null, null, null, null, null, 16775152, null);
        UUID uuid = new UUID(0L, 20L);
        TaxLotSort taxLotSort = TaxLotSort.DATE;
        TaxLotSortDirection taxLotSortDirection = TaxLotSortDirection.DESCENDING;
        ImmutableList immutableList = extensions2.toImmutableList(TaxLotsTableKt.getMockLaxLotData());
        UUID uuidRandomUUID3 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID3, "randomUUID(...)");
        this.values = SequencesKt.sequenceOf(selectLotsViewState, new SelectLotsViewState(uuid, false, uuidRandomUUID3, 30, false, ProfitAndLossTradeItemFixtures.REQUEST_SYMBOL, false, false, false, extensions2.persistentListOf(), null, "123456789", null, null, 0, null, immutableList, null, taxLotSort, taxLotSortDirection, new Function1() { // from class: com.robinhood.android.equities.taxlots.ViewStateParameterProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewStateParameterProvider.values$lambda$0((TaxLotSort) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.equities.taxlots.ViewStateParameterProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ViewStateParameterProvider.values$lambda$1((SelectableTaxLot) obj, (BigDecimal) obj2);
            }
        }, null, null, 12775616, null));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<SelectLotsViewState> getValues() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit values$lambda$0(TaxLotSort it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit values$lambda$1(SelectableTaxLot selectableTaxLot, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(selectableTaxLot, "<unused var>");
        Intrinsics.checkNotNullParameter(bigDecimal, "<unused var>");
        return Unit.INSTANCE;
    }
}
