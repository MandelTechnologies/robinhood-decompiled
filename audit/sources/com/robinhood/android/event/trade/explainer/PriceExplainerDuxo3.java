package com.robinhood.android.event.trade.explainer;

import com.robinhood.android.event.trade.explainer.PriceExplainerDuxo4;
import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.staticcontent.model.OtherMarkdown;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PriceExplainerDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/event/trade/explainer/PriceExplainerStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerDataState;", "Lcom/robinhood/android/event/trade/explainer/PriceExplainerViewState;", "<init>", "()V", "reduce", "dataState", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.explainer.PriceExplainerStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
final class PriceExplainerDuxo3 implements StateProvider<PriceExplainerDataState, PriceExplainerDuxo4> {
    public static final PriceExplainerDuxo3 INSTANCE = new PriceExplainerDuxo3();

    private PriceExplainerDuxo3() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public PriceExplainerDuxo4 reduce(PriceExplainerDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getExchangeSource() == null || dataState.getExchangeSource() == ExchangeSource.UNKNOWN || dataState.m14282getContentResultxLWZpok() == null) {
            return PriceExplainerDuxo4.Loading.INSTANCE;
        }
        Object value = dataState.m14282getContentResultxLWZpok().getValue();
        if (Result.m28555isFailureimpl(value)) {
            value = null;
        }
        OtherMarkdown otherMarkdown = (OtherMarkdown) value;
        if (otherMarkdown != null) {
            return new PriceExplainerDuxo4.Loaded(otherMarkdown);
        }
        return PriceExplainerDuxo4.Error.INSTANCE;
    }
}
