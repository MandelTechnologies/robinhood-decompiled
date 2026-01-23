package com.robinhood.android.event.gamedetail.builders.tradebottomsheet;

import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.event.gamedetail.builders.BuildOrderFormAction;
import com.robinhood.android.event.gamedetail.builders.tradebottomsheet.TradeButton;
import com.robinhood.android.event.gamedetail.components.ContractOptionData;
import com.robinhood.android.event.gamedetail.components.GameDetailTradeBarState;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor2;
import com.robinhood.android.eventcontracts.sharedeventui.util.PendingOrderUtils;
import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventContractTradability;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup5;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractSideExtensions;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesAccount2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: BuildTradeButton.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aº\u0001\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\b\u001a\u0094\u0001\u0010\u001c\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\t2\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b2\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\bH\u0002\u001a\u008c\u0001\u0010 \u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u001aP\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0000¨\u0006&"}, m3636d2 = {"buildTradeBar", "Lcom/robinhood/android/event/gamedetail/components/GameDetailTradeBarState;", "optionalSwapsAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "uiEvent", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "contractIdToEventContract", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "selectedContractOptionData", "Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;", "selectedPositionContractId", "contractIdToEventQuote", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "positions", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "estimatedFeesPerQuantity", "Ljava/math/BigDecimal;", "showPricePayout", "", "isMarketOpen", "overrideWithPositionBottomSheet", "showDisabledTradeButtonMessage", "pendingOrders", "", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "createSelectedPositionTradeBar", "createOrderFormAction", "Lcom/robinhood/android/event/gamedetail/builders/BuildOrderFormAction;", "goToOnboarding", "createSelectedContractTradeBar", "createDefaultTradeButtonForContract", "Lcom/robinhood/android/event/gamedetail/builders/tradebottomsheet/TradeButton;", "contract", "isPco", "hasNegativePosition", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.builders.tradebottomsheet.BuildTradeButtonKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildTradeButton {
    public static final GameDetailTradeBarState buildTradeBar(final Optional<FuturesAccount> optional, final UiEcEvent uiEcEvent, Map<UUID, EventContract> map, ContractOptionData contractOptionData, UUID uuid, Map<UUID, EventQuote> map2, Map<UUID, UiEventContractPosition> map3, BigDecimal bigDecimal, boolean z, boolean z2, boolean z3, boolean z4, Map<UUID, ? extends List<UiEventOrder>> pendingOrders) {
        UiEventContractPosition uiEventContractPosition;
        BigDecimal quantity;
        BigDecimal quantity2;
        SortedMap<Integer, EventContract> orderedContracts;
        SortedMap<Integer, EventContract> orderedContracts2;
        Event event;
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        if (optional == null) {
            TradeButton.Companion companion = TradeButton.INSTANCE;
            return new GameDetailTradeBarState(false, false, extensions2.persistentListOf(companion.getLoading(), companion.getLoading()));
        }
        final boolean zNeedsOnboarding = FuturesAccount2.needsOnboarding(optional);
        UiEventContractPosition uiEventContractPosition2 = null;
        final String attestation = (uiEcEvent == null || (event = uiEcEvent.getEvent()) == null) ? null : event.getAttestation();
        BuildOrderFormAction buildOrderFormAction = new BuildOrderFormAction() { // from class: com.robinhood.android.event.gamedetail.builders.tradebottomsheet.BuildTradeButtonKt$buildTradeBar$createOrderFormAction$1
            @Override // com.robinhood.android.event.gamedetail.builders.BuildOrderFormAction
            public final TradeButton.Action build(EventTradeOrderContext context) {
                Event event2;
                Intrinsics.checkNotNullParameter(context, "context");
                if (zNeedsOnboarding) {
                    UiEcEvent uiEcEvent2 = uiEcEvent;
                    return new TradeButton.Action.StartOnboarding((uiEcEvent2 == null || (event2 = uiEcEvent2.getEvent()) == null) ? null : event2.getEventId());
                }
                if (attestation != null && !FuturesAccount2.signedAttestation(optional.getOrNull(), attestation)) {
                    return new TradeButton.Action.SignAttestation(attestation, context);
                }
                return new TradeButton.Action.OpenOrderForm(context);
            }
        };
        if (uuid != null) {
            return createSelectedPositionTradeBar(uuid, optional, map, map3, buildOrderFormAction, zNeedsOnboarding, z2, map2, pendingOrders);
        }
        if (z3 && contractOptionData != null) {
            return createSelectedPositionTradeBar(contractOptionData.getSelectedContract().getContractId(), optional, map, map3, buildOrderFormAction, zNeedsOnboarding, z2, map2, pendingOrders);
        }
        if (contractOptionData != null) {
            return createSelectedContractTradeBar(optional, map, contractOptionData, map2, map3, bigDecimal, z, buildOrderFormAction, zNeedsOnboarding, z2);
        }
        EventContract eventContract = (uiEcEvent == null || (orderedContracts2 = uiEcEvent.getOrderedContracts()) == null) ? null : orderedContracts2.get(0);
        boolean z5 = true;
        EventContract eventContract2 = (uiEcEvent == null || (orderedContracts = uiEcEvent.getOrderedContracts()) == null) ? null : orderedContracts.get(1);
        if (map3 != null) {
            uiEventContractPosition = map3.get(eventContract != null ? eventContract.getContractId() : null);
        } else {
            uiEventContractPosition = null;
        }
        if (map3 != null) {
            uiEventContractPosition2 = map3.get(eventContract2 != null ? eventContract2.getContractId() : null);
        }
        boolean zIsNegative = (uiEventContractPosition == null || (quantity2 = uiEventContractPosition.getQuantity()) == null) ? false : BigDecimals7.isNegative(quantity2);
        boolean zIsNegative2 = (uiEventContractPosition2 == null || (quantity = uiEventContractPosition2.getQuantity()) == null) ? false : BigDecimals7.isNegative(quantity);
        boolean zIsPco = FuturesAccount2.isPco(optional);
        TradeButton tradeButtonCreateDefaultTradeButtonForContract = createDefaultTradeButtonForContract(eventContract, map2, buildOrderFormAction, zIsPco, zNeedsOnboarding, z2, zIsNegative);
        EventContract eventContract3 = eventContract2;
        boolean z6 = zIsNegative;
        boolean z7 = zIsNegative2;
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(tradeButtonCreateDefaultTradeButtonForContract, createDefaultTradeButtonForContract(eventContract3, map2, buildOrderFormAction, zIsPco, zNeedsOnboarding, z2, z7));
        if (!z4 || (!z6 && !z7)) {
            z5 = false;
        }
        return new GameDetailTradeBarState(z5, false, immutableList3PersistentListOf);
    }

    private static final GameDetailTradeBarState createSelectedPositionTradeBar(UUID uuid, Optional<FuturesAccount> optional, Map<UUID, EventContract> map, Map<UUID, UiEventContractPosition> map2, BuildOrderFormAction buildOrderFormAction, boolean z, boolean z2, Map<UUID, EventQuote> map3, Map<UUID, ? extends List<UiEventOrder>> map4) {
        SideDto sideDto;
        SideDto sideDto2;
        BigDecimal bidPriceWithContractSide;
        BigDecimal askPriceWithContractSide;
        String strPriceInCents = null;
        EventContract eventContract = map != null ? map.get(uuid) : null;
        UiEventContractPosition uiEventContractPosition = map2 != null ? map2.get(uuid) : null;
        if (eventContract == null || uiEventContractPosition == null) {
            TradeButton.Companion companion = TradeButton.INSTANCE;
            return new GameDetailTradeBarState(false, false, extensions2.persistentListOf(companion.getLoading(), companion.getLoading()));
        }
        List<UiEventOrder> list = map4.get(eventContract.getContractId());
        boolean zHasEnoughAmountOfPendingOrderToClosePosition = list != null ? PendingOrderUtils.hasEnoughAmountOfPendingOrderToClosePosition(list, uiEventContractPosition.getQuantity()) : false;
        boolean z3 = !FuturesAccount2.isPco(optional) && eventContract.getTradability().getCanOpenPosition();
        boolean canClosePosition = eventContract.getTradability().getCanClosePosition();
        boolean z4 = (z3 && z2) || z;
        boolean z5 = (canClosePosition && z2) || z;
        boolean zIsPositive = BigDecimals7.isPositive(uiEventContractPosition.getQuantity());
        EventQuote eventQuote = map3 != null ? map3.get(uuid) : null;
        String strPriceInCents2 = (eventQuote == null || (askPriceWithContractSide = eventQuote.getAskPriceWithContractSide(ContractGroup5.getContractSide(uiEventContractPosition))) == null) ? null : BigDecimals2.priceInCents(askPriceWithContractSide);
        if (eventQuote != null && (bidPriceWithContractSide = eventQuote.getBidPriceWithContractSide(ContractGroup5.getContractSide(uiEventContractPosition))) != null) {
            strPriceInCents = BigDecimals2.priceInCents(bidPriceWithContractSide);
        }
        String str = strPriceInCents2;
        StringResource.Companion companion2 = StringResource.INSTANCE;
        int i = C16283R.string.buy_more_label;
        if (str == null) {
            str = "-";
        }
        StringResource stringResourceInvoke = companion2.invoke(i, str);
        TradeButton.Style.Primary primary = TradeButton.Style.Primary.INSTANCE;
        if (zIsPositive) {
            sideDto = SideDto.BUY;
        } else {
            sideDto = SideDto.SELL;
        }
        TradeButton.Action actionBuild = buildOrderFormAction.build(new EventTradeOrderContext(uuid, sideDto, PositionEffectDto.OPEN));
        String serverValue = ContractGroup5.getContractSide(uiEventContractPosition).getServerValue();
        StringBuilder sb = new StringBuilder();
        boolean z6 = z5;
        sb.append("gdp-bottom-sheet-buy-more-");
        sb.append(serverValue);
        sb.append("-");
        sb.append(uuid);
        TradeButton tradeButton = new TradeButton(stringResourceInvoke, z4, primary, actionBuild, false, sb.toString(), 16, null);
        int i2 = C16283R.string.close_label;
        if (strPriceInCents == null) {
            strPriceInCents = "-";
        }
        StringResource stringResourceInvoke2 = companion2.invoke(i2, strPriceInCents);
        boolean z7 = z6 && !zHasEnoughAmountOfPendingOrderToClosePosition;
        if (zIsPositive) {
            sideDto2 = SideDto.SELL;
        } else {
            sideDto2 = SideDto.BUY;
        }
        return new GameDetailTradeBarState(false, false, extensions2.persistentListOf(tradeButton, new TradeButton(stringResourceInvoke2, z7, primary, buildOrderFormAction.build(new EventTradeOrderContext(uuid, sideDto2, PositionEffectDto.CLOSE)), false, "gdp-bottom-sheet-close-" + ContractGroup5.getContractSide(uiEventContractPosition).getServerValue() + "-" + uuid, 16, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final GameDetailTradeBarState createSelectedContractTradeBar(Optional<FuturesAccount> optional, Map<UUID, EventContract> map, ContractOptionData contractOptionData, Map<UUID, EventQuote> map2, Map<UUID, UiEventContractPosition> map3, BigDecimal bigDecimal, boolean z, BuildOrderFormAction buildOrderFormAction, boolean z2, boolean z3) {
        EventContractTradability tradability;
        if (contractOptionData.getCurrentWheelPickerContract() != null) {
            UiEventContractPosition uiEventContractPosition = map3 != null ? map3.get(contractOptionData.getCurrentWheelPickerContract().getContractId()) : null;
            boolean z4 = uiEventContractPosition == null || (!BigDecimals7.isPositive(uiEventContractPosition.getQuantity()) ? contractOptionData.getCurrentWheelPickerContract().getContractSide() != ContractSide.CONTRACT_SIDE_NO : contractOptionData.getCurrentWheelPickerContract().getContractSide() != ContractSide.CONTRACT_SIDE_YES);
            StringResource.Companion companion = StringResource.INSTANCE;
            TradeButton tradeButton = new TradeButton(companion.invoke(C16283R.string.cancel_label, new Object[0]), true, TradeButton.Style.Secondary.INSTANCE, TradeButton.Action.DismissWheelPicker.INSTANCE, false, null, 48, null);
            StringResource stringResourceInvoke = companion.invoke(C16283R.string.confirm_label, new Object[0]);
            TradeButton.Style.Primary primary = TradeButton.Style.Primary.INSTANCE;
            TradeButton.Action.SelectContract selectContract = new TradeButton.Action.SelectContract(contractOptionData.getCurrentWheelPickerContract().getContractId(), contractOptionData.getCurrentWheelPickerContract().getContractSide());
            boolean z5 = z4;
            return new GameDetailTradeBarState(!z5, true, extensions2.persistentListOf(tradeButton, new TradeButton(stringResourceInvoke, z5, primary, selectContract, false, null, 48, null)));
        }
        EventContract eventContract = map != null ? map.get(contractOptionData.getSelectedContract().getContractId()) : null;
        UiEventContractPosition uiEventContractPosition2 = map3 != null ? map3.get(contractOptionData.getSelectedContract().getContractId()) : null;
        boolean z6 = uiEventContractPosition2 == null || (!BigDecimals7.isPositive(uiEventContractPosition2.getQuantity()) ? contractOptionData.getSelectedContract().getSide() != ContractSide.CONTRACT_SIDE_NO : contractOptionData.getSelectedContract().getSide() != ContractSide.CONTRACT_SIDE_YES);
        Object[] objArr = z6 && !FuturesAccount2.isPco(optional) && (eventContract == null || (tradability = eventContract.getTradability()) == null || tradability.getCanOpenPosition());
        return new GameDetailTradeBarState(!z6, false, extensions2.persistentListOf(new TradeButton(BuildBottomSheetBuyButton.buildBuyButtonLabel(map2 != null ? map2.get(contractOptionData.getSelectedContract().getContractId()) : null, contractOptionData.getSelectedContract().getSide(), bigDecimal, z), (objArr == true && z3) || z2, TradeButton.Style.Primary.INSTANCE, buildOrderFormAction.build(new EventTradeOrderContext(contractOptionData.getSelectedContract().getContractId(), ContractSideExtensions.toOrderSide(contractOptionData.getSelectedContract().getSide()), PositionEffectDto.OPEN)), false, "gdp-bottom-sheet-buy-" + contractOptionData.getSelectedContract().getSide().getServerValue() + "-" + contractOptionData.getSelectedContract().getContractId(), 16, null)));
    }

    public static final TradeButton createDefaultTradeButtonForContract(EventContract eventContract, Map<UUID, EventQuote> map, BuildOrderFormAction createOrderFormAction, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(createOrderFormAction, "createOrderFormAction");
        if (eventContract == null) {
            return TradeButton.INSTANCE.getLoading();
        }
        boolean z5 = (z || !eventContract.getTradability().getCanOpenPosition() || z4) ? false : true;
        EventQuote eventQuote = map != null ? map.get(eventContract.getContractId()) : null;
        return new TradeButton(StringResource.INSTANCE.invoke(C16283R.string.game_detail_trade_bar_team_buy_yes_label, eventContract.getDisplayShortName(), BigDecimals2.priceInCentsWithNullFallback$default(eventQuote != null ? eventQuote.getYesAskPrice() : null, null, 1, null)), (z5 && z3) || z2, new TradeButton.Style.ContractBasedStyle(DayNightColor2.getDayNightColor(eventContract)), createOrderFormAction.build(new EventTradeOrderContext(eventContract.getContractId(), SideDto.BUY, PositionEffectDto.OPEN)), false, "gdp-trade-bar-" + eventContract.getContractId(), 16, null);
    }
}
