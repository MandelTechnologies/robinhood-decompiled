package com.robinhood.android.trade.equity.p261ui.configuration.trailingstop;

import com.robinhood.android.trade.equity.p261ui.configuration.trailingstop.TrailingStopViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrailingStopStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopDataState;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState;", "<init>", "()V", "reduce", "dataState", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TrailingStopStateProvider implements StateProvider<TrailingStopDataState, TrailingStopViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public TrailingStopViewState reduce(TrailingStopDataState dataState) {
        String plainString;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Instrument instrument = dataState.getInstrument();
        Quote quote = dataState.getQuote();
        OrderTrailingPeg trailingPeg = dataState.getTrailingPeg();
        UiEvent<Unit> clearInputEvent = dataState.getClearInputEvent();
        UiEvent<TrailingStopViewState.ValidationResult> validationResult = dataState.getValidationResult();
        Money lastTradePrice = dataState.getLastTradePrice();
        String str = lastTradePrice != null ? Money.format$default(lastTradePrice, null, true, null, false, 0, null, false, null, false, false, 1021, null) : null;
        StringResource.Companion companion = StringResource.INSTANCE;
        BigDecimal trailingStopPrice = dataState.getTrailingStopPrice();
        if (trailingStopPrice == null || (plainString = trailingStopPrice.toPlainString()) == null) {
            plainString = "";
        }
        return new TrailingStopViewState(instrument, quote, trailingPeg, clearInputEvent, validationResult, str, companion.invoke(plainString));
    }
}
