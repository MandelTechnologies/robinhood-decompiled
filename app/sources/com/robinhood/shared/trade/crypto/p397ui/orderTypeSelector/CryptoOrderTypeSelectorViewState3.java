package com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector;

import com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.CryptoOrderTypeSelectorViewState2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTypeSelectorViewState.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, m3636d2 = {"toLogType", "", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$RowViewState;", "toLogComponentIdentifier", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorViewStateKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderTypeSelectorViewState3 {
    public static final String toLogType(CryptoOrderTypeSelectorViewState2.RowViewState rowViewState) {
        Intrinsics.checkNotNullParameter(rowViewState, "<this>");
        if (rowViewState instanceof CryptoOrderTypeSelectorViewState2.RowViewState.MarketQuote) {
            return "market-quote";
        }
        if (rowViewState instanceof CryptoOrderTypeSelectorViewState2.RowViewState.MarketAmount) {
            return "market-asset";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String toLogComponentIdentifier(CryptoOrderTypeSelectorViewState2.RowViewState rowViewState) {
        Intrinsics.checkNotNullParameter(rowViewState, "<this>");
        return rowViewState instanceof CryptoOrderTypeSelectorViewState2.RowViewState.MarketAmount ? "coin" : rowViewState instanceof CryptoOrderTypeSelectorViewState2.RowViewState.MarketQuote ? rowViewState.getUiCurrencyPair().getQuoteCurrency().getCode() : "";
    }
}
