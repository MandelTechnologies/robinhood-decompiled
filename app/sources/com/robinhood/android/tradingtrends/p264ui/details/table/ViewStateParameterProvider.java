package com.robinhood.android.tradingtrends.p264ui.details.table;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.tradingtrends.p264ui.details.table.TradingTrendsTableViewState;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: TradingTrendsTableComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/table/ViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
final class ViewStateParameterProvider implements PreviewParameterProvider<TradingTrendsTableViewState> {
    private final Sequence<TradingTrendsTableViewState> values = SequencesKt.sequenceOf(new TradingTrendsTableViewState(null, TradingTrendsTableViewState.TradingTrendsTableState.Loading.INSTANCE), new TradingTrendsTableViewState(null, new TradingTrendsTableViewState.TradingTrendsTableState.Loaded("idk", null, null, CollectionsKt.listOf((Object[]) new String[]{"x", "y", "z"}), null, null)));

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<TradingTrendsTableViewState> getValues() {
        return this.values;
    }
}
