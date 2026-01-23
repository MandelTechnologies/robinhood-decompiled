package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartViewState;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.models.futures.api.arsenal.FuturesContractTradability;
import com.robinhood.android.portfolio.pnl.fixtures.ProfitAndLossTradeItemFixtures;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.store.futures.ChartType;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FuturesDetailScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/OptionsParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/futures/detail/ui/PreviewOptions;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
final class OptionsParameterProvider implements PreviewParameterProvider<PreviewOptions> {
    private final Sequence<PreviewOptions> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public OptionsParameterProvider() {
        UUID uuid = new UUID(0L, 0L);
        StringResource.Companion companion = StringResource.INSTANCE;
        this.values = SequencesKt.sequenceOf(new PreviewOptions(new FuturesDetailViewState(uuid, null, null, null, companion.invoke("Something"), null, false, false, false, companion.invoke("Who knows"), companion.invoke("Take your best guess"), FuturesDetailViewState.TopBarData.FtuxTopBarData.INSTANCE, extensions2.persistentListOf(), new FuturesDetailViewState.TradeBarData(false, true, true, true, new FuturesDetailViewState.TradeBarData.TradeBarOverviewContent.MarginRequired(companion.invoke("$0.00")), false, FuturesContractTradability.TRADABLE), null, Boolean.FALSE, new FuturesDetailViewState.LoggingData(0, 0, null, new UUID(0L, 0L), null)), new FuturesDetailChartViewState(new UUID(0L, 0L), ProfitAndLossTradeItemFixtures.REQUEST_SYMBOL, null, null, true, null, ChartType.LINE, true, true, DisplaySpan.DAY, false, true, false)));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<PreviewOptions> getValues() {
        return this.values;
    }
}
