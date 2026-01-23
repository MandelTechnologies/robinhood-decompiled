package com.robinhood.android.futures.ladder.states;

import com.robinhood.android.futures.ladder.C17286R;
import com.robinhood.android.futures.ladder.FuturesGenericLadderDataState;
import com.robinhood.android.futures.ladder.states.TopBarState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosesRange;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesCostBasis;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.shared.tradeladder.extensions.Moneys4;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.PostTradeLadderFtuxState;
import com.robinhood.store.futures.FuturesPnLHelper;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TopBarState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"getTopBarState", "Lcom/robinhood/android/futures/ladder/states/TopBarState;", "Lcom/robinhood/android/futures/ladder/FuturesGenericLadderDataState;", "NUM_DECIMAL_FOR_AVERAGE_PRICE", "", "lib-futures-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.ladder.states.TopBarStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TopBarState2 {
    private static final int NUM_DECIMAL_FOR_AVERAGE_PRICE = 2;

    public static final TopBarState getTopBarState(FuturesGenericLadderDataState futuresGenericLadderDataState) {
        StringResource stringResourceInvoke;
        BigDecimal bigDecimalSubtract;
        StringResource stringResourceInvoke2;
        String displaySymbol;
        List<UiFuturesOrder> pendingOrders;
        Intrinsics.checkNotNullParameter(futuresGenericLadderDataState, "<this>");
        boolean z = (futuresGenericLadderDataState.getPnlCostBasis() == null || BigDecimals7.isZero(futuresGenericLadderDataState.getPnlCostBasis().getSignedQuantity())) ? false : true;
        if (!z) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C17286R.string.futures_ladder_no_position, new Object[0]);
        } else {
            if (futuresGenericLadderDataState.getPnlCostBasis() == null) {
                throw new IllegalStateException("pnlCostBasis cannot be null here");
            }
            stringResourceInvoke = StringResource.INSTANCE.invoke(C17286R.string.futures_ladder_positions_format, Formats.getIntegerDeltaFormat().format(futuresGenericLadderDataState.getPnlCostBasis().getSignedQuantity()), FuturesProduct5.format(futuresGenericLadderDataState.getProduct(), futuresGenericLadderDataState.getPnlCostBasis().getAvgTradePrice(), 2));
        }
        StringResource stringResource = stringResourceInvoke;
        BigDecimal lastTradePrice = futuresGenericLadderDataState.getLadderPriceData().getLastTradePrice();
        FuturesClosesRange effectiveClosesRange = futuresGenericLadderDataState.getEffectiveClosesRange();
        BigDecimal closePrice = effectiveClosesRange != null ? effectiveClosesRange.getClosePrice() : null;
        if (lastTradePrice == null || closePrice == null) {
            bigDecimalSubtract = null;
        } else {
            bigDecimalSubtract = lastTradePrice.subtract(closePrice);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        }
        BigDecimal bigDecimalSafeDivide = bigDecimalSubtract != null ? BigDecimals7.safeDivide(bigDecimalSubtract, closePrice) : null;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke3 = companion.invoke(C17286R.string.futures_ladder_day_delta_label, Moneys4.formatNoSignAmount$default(bigDecimalSubtract, null, 1, null), Moneys4.formatNoSignPercent$default(bigDecimalSafeDivide, null, 1, null));
        boolean z2 = z || !((pendingOrders = futuresGenericLadderDataState.getPendingOrders()) == null || pendingOrders.isEmpty());
        Boolean boolIsInTradingSession = futuresGenericLadderDataState.isInTradingSession();
        Boolean bool = Boolean.TRUE;
        boolean zAreEqual = Intrinsics.areEqual(boolIsInTradingSession, bool);
        Integer numValueOf = null;
        UUID contractId = futuresGenericLadderDataState.getContractId();
        FuturesAccount account = futuresGenericLadderDataState.getAccount();
        UUID id = account != null ? account.getId() : null;
        FuturesContract contract = futuresGenericLadderDataState.getContract();
        if (contract == null || (displaySymbol = contract.getDisplaySymbol()) == null || (stringResourceInvoke2 = companion.invoke(displaySymbol)) == null) {
            stringResourceInvoke2 = companion.invoke(C17286R.string.futures_ladder_loading, new Object[0]);
        }
        FuturesContract contract2 = futuresGenericLadderDataState.getContract();
        BigDecimal multiplier = contract2 != null ? contract2.getMultiplier() : null;
        FuturesCostBasis pnlCostBasis = futuresGenericLadderDataState.getPnlCostBasis();
        BigDecimal dayPnlCostBasis = pnlCostBasis != null ? pnlCostBasis.getDayPnlCostBasis() : null;
        BigDecimal lastTradePrice2 = futuresGenericLadderDataState.getLadderPriceData().getLastTradePrice();
        FuturesCostBasis pnlCostBasis2 = futuresGenericLadderDataState.getPnlCostBasis();
        BigDecimal bigDecimalComputePnl = FuturesPnLHelper.computePnl(multiplier, dayPnlCostBasis, lastTradePrice2, pnlCostBasis2 != null ? pnlCostBasis2.getSignedQuantity() : null);
        if (bigDecimalComputePnl == null) {
            bigDecimalComputePnl = BigDecimal.ZERO;
        }
        FuturesContract contract3 = futuresGenericLadderDataState.getContract();
        BigDecimal multiplier2 = contract3 != null ? contract3.getMultiplier() : null;
        FuturesCostBasis pnlCostBasis3 = futuresGenericLadderDataState.getPnlCostBasis();
        BigDecimal openPnlCostBasis = pnlCostBasis3 != null ? pnlCostBasis3.getOpenPnlCostBasis() : null;
        BigDecimal lastTradePrice3 = futuresGenericLadderDataState.getLadderPriceData().getLastTradePrice();
        FuturesCostBasis pnlCostBasis4 = futuresGenericLadderDataState.getPnlCostBasis();
        BigDecimal bigDecimalComputePnl2 = FuturesPnLHelper.computePnl(multiplier2, openPnlCostBasis, lastTradePrice3, pnlCostBasis4 != null ? pnlCostBasis4.getSignedQuantity() : null);
        if (bigDecimalComputePnl2 == null) {
            bigDecimalComputePnl2 = BigDecimal.ZERO;
        }
        FuturesCostBasis pnlCostBasis5 = futuresGenericLadderDataState.getPnlCostBasis();
        boolean z3 = !BigDecimals7.isZero(pnlCostBasis5 != null ? pnlCostBasis5.getSignedQuantity() : null);
        List<UiFuturesOrder> pendingOrders2 = futuresGenericLadderDataState.getPendingOrders();
        if (pendingOrders2 != null) {
            numValueOf = Integer.valueOf(pendingOrders2.size());
        }
        return new TopBarState(contractId, id, stringResourceInvoke2, bigDecimalComputePnl, bigDecimalComputePnl2, z3, stringResource, numValueOf, new TopBarState.FlattenButtonData(z2, zAreEqual, futuresGenericLadderDataState.getPostTradeLadderFtuxProgressState() == PostTradeLadderFtuxState.SHOW_FLATTEN_ORDERS_TOOLTIP), futuresGenericLadderDataState.getPostTradeLadderFtuxProgressState() == PostTradeLadderFtuxState.SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP, Intrinsics.areEqual(futuresGenericLadderDataState.getHasOrdersForContract(), bool), stringResourceInvoke3, !BigDecimals7.isNegative(bigDecimalSubtract));
    }
}
