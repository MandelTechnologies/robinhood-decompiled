package com.robinhood.android.event.trade.explainer;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.event.trade.explainer.PriceExplainerDuxo4;
import com.robinhood.staticcontent.model.OtherMarkdown;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: PriceExplainer.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/event/trade/explainer/ViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.explainer.ViewStateParameterProvider, reason: use source file name */
/* loaded from: classes3.dex */
final class PriceExplainer3 implements PreviewParameterProvider<PriceExplainerDuxo4> {
    private final Sequence<PriceExplainerDuxo4> values = SequencesKt.sequenceOf(PriceExplainerDuxo4.Loading.INSTANCE, PriceExplainerDuxo4.Error.INSTANCE, new PriceExplainerDuxo4.Loaded(new OtherMarkdown("Bid and Ask\n", "To trade a contract, a Yes position must match with a No position. The price of the two sides must total $1 which is equal to the $1 payout.\n\nTo open a position, the price is the Ask. To close your position, the price is the Bid.")));

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<PriceExplainerDuxo4> getValues() {
        return this.values;
    }
}
