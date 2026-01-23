package com.robinhood.android.event.detail.builders;

import com.robinhood.android.event.detail.C16095R;
import com.robinhood.android.event.detail.multi.MultiTradeBarUiState;
import com.robinhood.android.eventcontracts.sharedeventui.util.PendingOrderUtils;
import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventContractTradability;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesAccount2;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: BuildMultiTradeBarData.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aL\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000\u001aL\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002¨\u0006\u001c"}, m3636d2 = {"buildMultiTradeBarData", "Lcom/robinhood/android/event/detail/multi/MultiTradeBarUiState;", "isMarketOpen", "", "optionalFuturesAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "uiEvent", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "eventContract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "eventQuote", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "position", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "pendingOrders", "", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "buildMultiEventTradeBarButtonUiState", "Lcom/robinhood/android/event/detail/multi/MultiTradeBarUiState$ButtonState;", "contract", "canTradeBasedOnMarket", "hasYesPosition", "hasNoPosition", "side", "Lcom/robinhood/android/event/detail/builders/Side;", "hasEqualAmountOfPendingOrderToClosePosition", "sideWithPendingOrdersWhenNoHolding", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.builders.BuildMultiTradeBarDataKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildMultiTradeBarData {

    /* compiled from: BuildMultiTradeBarData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.detail.builders.BuildMultiTradeBarDataKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BuildMultiTradeBarData2.values().length];
            try {
                iArr[BuildMultiTradeBarData2.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BuildMultiTradeBarData2.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MultiTradeBarUiState buildMultiTradeBarData(boolean z, FuturesAccount futuresAccount, UiEcEvent uiEvent, EventContract eventContract, EventQuote eventQuote, UiEventContractPosition uiEventContractPosition, List<UiEventOrder> pendingOrders) {
        BigDecimal quantity;
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        Intrinsics.checkNotNullParameter(eventContract, "eventContract");
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        if (uiEventContractPosition == null || (quantity = uiEventContractPosition.getQuantity()) == null) {
            quantity = BigDecimal.ZERO;
        }
        boolean zIsPositive = BigDecimals7.isPositive(quantity);
        boolean zIsNegative = BigDecimals7.isNegative(quantity);
        Intrinsics.checkNotNull(quantity);
        boolean zHasEnoughAmountOfPendingOrderToClosePosition = PendingOrderUtils.hasEnoughAmountOfPendingOrderToClosePosition(pendingOrders, quantity);
        boolean z2 = true;
        if (!z && futuresAccount != null && FuturesAccount2.signedAttestation(futuresAccount, uiEvent.getEvent().getAttestation())) {
            z2 = false;
        }
        boolean z3 = z2;
        EventOrderSide eventOrderSideSideWithPendingOrdersWhenNoHolding = PendingOrderUtils.sideWithPendingOrdersWhenNoHolding(pendingOrders, quantity);
        return new MultiTradeBarUiState(buildMultiEventTradeBarButtonUiState(eventContract, z3, zIsPositive, zIsNegative, eventQuote, BuildMultiTradeBarData2.LEFT, zHasEnoughAmountOfPendingOrderToClosePosition, eventOrderSideSideWithPendingOrdersWhenNoHolding), buildMultiEventTradeBarButtonUiState(eventContract, z3, zIsPositive, zIsNegative, eventQuote, BuildMultiTradeBarData2.RIGHT, zHasEnoughAmountOfPendingOrderToClosePosition, eventOrderSideSideWithPendingOrdersWhenNoHolding));
    }

    private static final MultiTradeBarUiState.ButtonState buildMultiEventTradeBarButtonUiState(EventContract eventContract, boolean z, boolean z2, boolean z3, EventQuote eventQuote, BuildMultiTradeBarData2 buildMultiTradeBarData2, boolean z4, EventOrderSide eventOrderSide) {
        MultiTradeBarUiState.ButtonState buttonState;
        BigDecimal yesAskPrice;
        String strPriceInCents;
        BigDecimal noAskPrice;
        String strPriceInCents2;
        BigDecimal noAskPrice2;
        String strPriceInCents3;
        BigDecimal noBidPrice;
        String strPriceInCents4;
        BigDecimal yesAskPrice2;
        String strPriceInCents5;
        BigDecimal yesBidPrice;
        String strPriceInCents6;
        String str = "-";
        boolean z5 = false;
        if (z2) {
            int i = WhenMappings.$EnumSwitchMapping$0[buildMultiTradeBarData2.ordinal()];
            if (i == 1) {
                UUID contractId = eventContract.getContractId();
                if (z && eventContract.getTradability() != EventContractTradability.UNTRADABLE) {
                    z5 = true;
                }
                StringResource.Companion companion = StringResource.INSTANCE;
                int i2 = C16095R.string.event_detail_trade_bar_buy_more_label;
                if (eventQuote != null && (yesAskPrice2 = eventQuote.getYesAskPrice()) != null && (strPriceInCents5 = BigDecimals2.priceInCents(yesAskPrice2)) != null) {
                    str = strPriceInCents5;
                }
                buttonState = new MultiTradeBarUiState.ButtonState(contractId, companion.invoke(i2, str), SideDto.BUY, PositionEffectDto.OPEN, z5);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                UUID contractId2 = eventContract.getContractId();
                if (!z4 && z && eventContract.getTradability() != EventContractTradability.UNTRADABLE) {
                    z5 = true;
                }
                StringResource.Companion companion2 = StringResource.INSTANCE;
                int i3 = C16095R.string.event_detail_trade_bar_close_label;
                if (eventQuote != null && (yesBidPrice = eventQuote.getYesBidPrice()) != null && (strPriceInCents6 = BigDecimals2.priceInCents(yesBidPrice)) != null) {
                    str = strPriceInCents6;
                }
                buttonState = new MultiTradeBarUiState.ButtonState(contractId2, companion2.invoke(i3, str), SideDto.SELL, PositionEffectDto.CLOSE, z5);
            }
        } else if (z3) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[buildMultiTradeBarData2.ordinal()];
            if (i4 == 1) {
                UUID contractId3 = eventContract.getContractId();
                if (z && eventContract.getTradability() != EventContractTradability.UNTRADABLE) {
                    z5 = true;
                }
                StringResource.Companion companion3 = StringResource.INSTANCE;
                int i5 = C16095R.string.event_detail_trade_bar_buy_more_label;
                if (eventQuote != null && (noAskPrice2 = eventQuote.getNoAskPrice()) != null && (strPriceInCents3 = BigDecimals2.priceInCents(noAskPrice2)) != null) {
                    str = strPriceInCents3;
                }
                buttonState = new MultiTradeBarUiState.ButtonState(contractId3, companion3.invoke(i5, str), SideDto.SELL, PositionEffectDto.OPEN, z5);
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                UUID contractId4 = eventContract.getContractId();
                if (!z4 && z && eventContract.getTradability() != EventContractTradability.UNTRADABLE) {
                    z5 = true;
                }
                StringResource.Companion companion4 = StringResource.INSTANCE;
                int i6 = C16095R.string.event_detail_trade_bar_close_label;
                if (eventQuote != null && (noBidPrice = eventQuote.getNoBidPrice()) != null && (strPriceInCents4 = BigDecimals2.priceInCents(noBidPrice)) != null) {
                    str = strPriceInCents4;
                }
                buttonState = new MultiTradeBarUiState.ButtonState(contractId4, companion4.invoke(i6, str), SideDto.BUY, PositionEffectDto.CLOSE, z5);
            }
        } else {
            int i7 = WhenMappings.$EnumSwitchMapping$0[buildMultiTradeBarData2.ordinal()];
            if (i7 == 1) {
                boolean z6 = eventOrderSide == EventOrderSide.SELL;
                UUID contractId5 = eventContract.getContractId();
                if (!z6 && z && eventContract.getTradability() != EventContractTradability.UNTRADABLE) {
                    z5 = true;
                }
                StringResource.Companion companion5 = StringResource.INSTANCE;
                int i8 = C16095R.string.event_detail_trade_bar_yes_label;
                if (eventQuote != null && (yesAskPrice = eventQuote.getYesAskPrice()) != null && (strPriceInCents = BigDecimals2.priceInCents(yesAskPrice)) != null) {
                    str = strPriceInCents;
                }
                buttonState = new MultiTradeBarUiState.ButtonState(contractId5, companion5.invoke(i8, str), SideDto.BUY, PositionEffectDto.OPEN, z5);
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z7 = eventOrderSide == EventOrderSide.BUY;
                UUID contractId6 = eventContract.getContractId();
                if (!z7 && z && eventContract.getTradability() != EventContractTradability.UNTRADABLE) {
                    z5 = true;
                }
                StringResource.Companion companion6 = StringResource.INSTANCE;
                int i9 = C16095R.string.event_detail_trade_bar_no_label;
                if (eventQuote != null && (noAskPrice = eventQuote.getNoAskPrice()) != null && (strPriceInCents2 = BigDecimals2.priceInCents(noAskPrice)) != null) {
                    str = strPriceInCents2;
                }
                buttonState = new MultiTradeBarUiState.ButtonState(contractId6, companion6.invoke(i9, str), SideDto.SELL, PositionEffectDto.OPEN, z5);
            }
        }
        return buttonState;
    }
}
