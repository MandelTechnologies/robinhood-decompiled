package com.robinhood.android.p148fx.tooltip;

import com.robinhood.android.p148fx.tooltip.FxQuoteState;
import com.robinhood.android.p148fx.tooltip.FxState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p325fx.p326db.FxRate;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: FxStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/FxStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/fx/tooltip/FxDataState;", "Lcom/robinhood/android/fx/tooltip/FxViewState;", "<init>", "()V", "reduce", "dataState", "lib-fx-tooltip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class FxStateProvider implements StateProvider<FxDataState, FxViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public FxViewState reduce(FxDataState dataState) {
        FxState success;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        FxQuoteState fxQuoteState = dataState.getFxQuoteState();
        if (fxQuoteState instanceof FxQuoteState.Success) {
            FxQuoteState.Success success2 = (FxQuoteState.Success) fxQuoteState;
            BigDecimal offerOutrightRate = success2.getFxQuote().getOfferOutrightRate();
            Instant validUntilTime = success2.getFxQuote().getValidUntilTime();
            Money usdAmount = dataState.getUsdAmount();
            if (usdAmount == null) {
                success = FxState.Error.NullUsdAmount;
            } else {
                success = new FxState.Success(usdAmount, new FxRate(Currencies.GBP, offerOutrightRate), Instant.now().isAfter(validUntilTime));
            }
        } else if (Intrinsics.areEqual(fxQuoteState, FxQuoteState.Loading.INSTANCE) || fxQuoteState == null) {
            success = FxState.Loading.INSTANCE;
        } else {
            if (!Intrinsics.areEqual(fxQuoteState, FxQuoteState.Error.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            success = FxState.Error.NullQuote;
        }
        return new FxViewState(success);
    }
}
