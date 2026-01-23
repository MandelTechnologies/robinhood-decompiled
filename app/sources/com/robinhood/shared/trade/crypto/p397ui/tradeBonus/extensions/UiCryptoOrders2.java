package com.robinhood.shared.trade.crypto.p397ui.tradeBonus.extensions;

import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.shared.crypto.contracts.CryptoTradeBonusBottomSheetFragmentKey;
import com.robinhood.utils.math.BigDecimals7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiCryptoOrders.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"tradeBonusBottomSheetOrderExecutionState", "Lcom/robinhood/shared/crypto/contracts/CryptoTradeBonusBottomSheetFragmentKey$OrderExecutionState;", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "isEstimate", "", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.tradeBonus.extensions.UiCryptoOrdersKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class UiCryptoOrders2 {
    public static final CryptoTradeBonusBottomSheetFragmentKey.OrderExecutionState tradeBonusBottomSheetOrderExecutionState(UiCryptoOrder uiCryptoOrder, boolean z) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        if (BigDecimals7.isZero(uiCryptoOrder.getCryptoOrder().getCumulativeQuantity())) {
            return CryptoTradeBonusBottomSheetFragmentKey.OrderExecutionState.NoExecutions.INSTANCE;
        }
        if (z) {
            return new CryptoTradeBonusBottomSheetFragmentKey.OrderExecutionState.Executions(CryptoTradeBonusBottomSheetFragmentKey.OrderExecutionState.Executions.BonusStatus.PENDING);
        }
        return new CryptoTradeBonusBottomSheetFragmentKey.OrderExecutionState.Executions(CryptoTradeBonusBottomSheetFragmentKey.OrderExecutionState.Executions.BonusStatus.FINALIZED);
    }
}
