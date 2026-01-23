package com.robinhood.shared.trade.crypto.p397ui.quoteOrder;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.shared.common.lib.formats.currency.InputAmount;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.CryptoQuoteOrderViewState;
import com.robinhood.utils.resource.StringResource;
import contracts.crypto.trade.proto.p431v1.CalculateCryptoMarketOrderPillsResponseDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoQuoteOrderTradePills.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¨\u0006\u0006"}, m3636d2 = {"tradeButtonsToQuickTrade", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$OrderContextViewState;", "quickTradeButtons", "Lkotlinx/collections/immutable/ImmutableList;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto;", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderTradePillsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoQuoteOrderTradePills {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.robinhood.shared.trade.crypto.ui.quoteOrder.ActionViewState$QuickTrade$AmountQuote] */
    public static final ActionViewState tradeButtonsToQuickTrade(CryptoQuoteOrderViewState.OrderContextViewState orderContextViewState, ImmutableList<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> quickTradeButtons) {
        Intrinsics.checkNotNullParameter(orderContextViewState, "<this>");
        Intrinsics.checkNotNullParameter(quickTradeButtons, "quickTradeButtons");
        ArrayList arrayList = new ArrayList();
        Iterator<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> it = quickTradeButtons.iterator();
        int i = 0;
        while (true) {
            ActionViewState.QuickTrade.SellAll sellAll = null;
            if (!it.hasNext()) {
                return arrayList.size() == 3 ? new ActionViewState.QuickTrades(arrayList, false, 2, null) : (arrayList.size() == 1 && (arrayList.get(0) instanceof ActionViewState.QuickTrade.SellAll)) ? ActionViewState.SellAll.INSTANCE : orderContextViewState.getIsRecurringOrder() ? new ActionViewState.Continue(true, false) : new ActionViewState.Review(false);
            }
            CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto.TypeDto type2 = next.getType();
            if (type2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (type2 instanceof CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto.TypeDto.QuoteAmount) {
                Currency quoteCurrency = orderContextViewState.getInput().getUiCurrencyPair$feature_trade_crypto_externalDebug().getQuoteCurrency();
                BigDecimal ONE = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto.TypeDto.QuoteAmount quoteAmount = (CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto.TypeDto.QuoteAmount) type2;
                sellAll = new ActionViewState.QuickTrade.AmountQuote(Currency.copy$default(quoteCurrency, null, null, null, ONE, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null), InputAmount.INSTANCE.fromAmount(quoteAmount.getValue().getAmount().toBigDecimalOrThrow()), StringResource.INSTANCE.invoke(quoteAmount.getValue().getFormatted_amount()), orderContextViewState.getIsRecurringOrder(), i2);
            } else if (type2 instanceof CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto.TypeDto.SellAll) {
                sellAll = new ActionViewState.QuickTrade.SellAll(i2);
            }
            if (sellAll != null) {
                arrayList.add(sellAll);
            }
            i = i2;
        }
    }
}
