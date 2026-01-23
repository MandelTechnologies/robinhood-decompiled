package com.robinhood.shared.trade.crypto.p397ui.quoteOrder;

import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.CryptoQuoteOrderViewState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuoteOrderViewStates.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¨\u0006\b"}, m3636d2 = {"rhcActionViewState", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$OrderContextViewState;", "hasMinHoldingForQuickSell", "", "inputAmountIsZero", "sellingPowerIsZero", "isRecurring", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderViewStatesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoQuoteOrderViewStates {

    /* compiled from: CryptoQuoteOrderViewStates.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderViewStatesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ActionViewState rhcActionViewState(CryptoQuoteOrderViewState.OrderContextViewState orderContextViewState, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(orderContextViewState, "<this>");
        if (!orderContextViewState.getCryptoOrderContext().isMonetizationModelDataLoaded()) {
            return new ActionViewState.Continue(false, false);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[orderContextViewState.getInput().getOrderSide$feature_trade_crypto_externalDebug().ordinal()];
        if (i == 1) {
            if (z2) {
                return orderContextViewState.getQuickTradeBuy$feature_trade_crypto_externalDebug();
            }
            return new ActionViewState.Continue(z4, false, 2, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z2 || z3) {
            return new ActionViewState.Continue(false, !z3);
        }
        if (z) {
            return orderContextViewState.getQuickTradeSell$feature_trade_crypto_externalDebug();
        }
        return ActionViewState.SellAll.INSTANCE;
    }
}
