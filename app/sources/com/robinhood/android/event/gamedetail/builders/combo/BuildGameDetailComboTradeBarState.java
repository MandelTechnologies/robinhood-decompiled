package com.robinhood.android.event.gamedetail.builders.combo;

import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.event.gamedetail.builders.BuildOrderFormAction;
import com.robinhood.android.event.gamedetail.builders.BuildOrderFormAction2;
import com.robinhood.android.event.gamedetail.builders.tradebottomsheet.BuildBottomSheetBuyButton;
import com.robinhood.android.event.gamedetail.builders.tradebottomsheet.BuildTradeButton;
import com.robinhood.android.event.gamedetail.builders.tradebottomsheet.TradeButton;
import com.robinhood.android.event.gamedetail.combostates.GameDetailComboBottomSheetContentViewState;
import com.robinhood.android.event.gamedetail.components.ComboPickerContractRowState;
import com.robinhood.android.event.gamedetail.p130ui.combo.GameDetailComboTradeBarState;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3;
import com.robinhood.android.eventcontracts.sharedeventui.util.PendingOrderUtils;
import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventContractTradability;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.event.p186db.order.EventOrderSide2;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup5;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractSideExtensions;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesAccount2;
import com.robinhood.store.event.ProposalData;
import com.robinhood.utils.Optional;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: BuildGameDetailComboTradeBarState.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n\u001a\u0080\u0001\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002\u001a\b\u0010\u001f\u001a\u00020\u0001H\u0002\u001a\u0080\u0001\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001a\u001a\u0010#\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001a\b\u0010$\u001a\u00020\u0001H\u0002\u001aB\u0010%\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+H\u0002\u001ab\u0010,\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010-\u001a\u0004\u0018\u00010\f2\b\u0010.\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002\u001a^\u00100\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a\u0018\u00102\u001a\u0002032\u0006\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\u000bH\u0002¨\u00064"}, m3636d2 = {"buildGameDetailComboTradeBarState", "Lcom/robinhood/android/event/gamedetail/ui/combo/GameDetailComboTradeBarState;", "optionalSwapsAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "uiEvent", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "sheetState", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;", "positions", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "contractIdToEventQuote", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "pendingOrders", "", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "isMarketOpen", "", "comboQuoteResult", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;", "allContractIdsToEventContract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "buildComboTradeSlipTradeBarState", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState$TradeSlip;", "createOrderFormAction", "Lcom/robinhood/android/event/gamedetail/builders/BuildOrderFormAction;", "contractIdToEventContract", "isPco", "needsOnboarding", "buildWheelPickerButtons", "buildSingleContractTradeSlipButtons", "contractIdWithSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "buildComboQuoteButtons", "buildPriceUnavailableState", "buildComboPositionTradeBarButtons", "contractId", "enableClosePositionButton", "hasEqualAmountOfPendingOrderToClosePosition", "hasYesPosition", "contractSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "buildPositionTradeBarState", "position", "quote", "contract", "buildDefaultTradeBarState", "goToOnboarding", "buildCloseLoggingIdentifier", "", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.builders.combo.BuildGameDetailComboTradeBarStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildGameDetailComboTradeBarState {
    public static final GameDetailComboTradeBarState buildGameDetailComboTradeBarState(Optional<FuturesAccount> optional, UiEcEvent uiEcEvent, GameDetailComboBottomSheetContentViewState sheetState, Map<UUID, UiEventContractPosition> map, Map<UUID, EventQuote> map2, Map<UUID, ? extends List<UiEventOrder>> pendingOrders, boolean z, StreamComboQuoteUseCase3 streamComboQuoteUseCase3, Map<UUID, EventContract> map3) {
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        if (optional == null) {
            TradeButton.Companion companion = TradeButton.INSTANCE;
            return new GameDetailComboTradeBarState(extensions2.persistentListOf(companion.getLoading(), companion.getLoading()), null, 2, null);
        }
        BuildOrderFormAction buildOrderFormActionCreateOpenOrderFormAction = BuildOrderFormAction2.createOpenOrderFormAction(optional, uiEcEvent);
        boolean zIsPco = FuturesAccount2.isPco(optional);
        boolean zNeedsOnboarding = FuturesAccount2.needsOnboarding(optional);
        if (sheetState instanceof GameDetailComboBottomSheetContentViewState.Empty) {
            return buildDefaultTradeBarState(uiEcEvent, map, map2, buildOrderFormActionCreateOpenOrderFormAction, zIsPco, zNeedsOnboarding, z);
        }
        if (sheetState instanceof GameDetailComboBottomSheetContentViewState.Position) {
            UUID contractId = ((GameDetailComboBottomSheetContentViewState.Position) sheetState).getContractId();
            return buildPositionTradeBarState(buildOrderFormActionCreateOpenOrderFormAction, map != null ? map.get(contractId) : null, map2 != null ? map2.get(contractId) : null, zIsPco, map3 != null ? map3.get(contractId) : null, z, pendingOrders, streamComboQuoteUseCase3);
        }
        if (!(sheetState instanceof GameDetailComboBottomSheetContentViewState.TradeSlip)) {
            throw new NoWhenBranchMatchedException();
        }
        return buildComboTradeSlipTradeBarState((GameDetailComboBottomSheetContentViewState.TradeSlip) sheetState, buildOrderFormActionCreateOpenOrderFormAction, uiEcEvent != null ? uiEcEvent.getContractIdToEventContract() : null, map, pendingOrders, zIsPco, z, zNeedsOnboarding, streamComboQuoteUseCase3);
    }

    private static final GameDetailComboTradeBarState buildComboTradeSlipTradeBarState(GameDetailComboBottomSheetContentViewState.TradeSlip tradeSlip, BuildOrderFormAction buildOrderFormAction, Map<UUID, EventContract> map, Map<UUID, UiEventContractPosition> map2, Map<UUID, ? extends List<UiEventOrder>> map3, boolean z, boolean z2, boolean z3, StreamComboQuoteUseCase3 streamComboQuoteUseCase3) {
        if (tradeSlip.getPickerState() != null) {
            return buildWheelPickerButtons();
        }
        if (tradeSlip.getRows().size() == 1) {
            return buildSingleContractTradeSlipButtons(((ComboPickerContractRowState) CollectionsKt.first((List) tradeSlip.getRows())).getContractIdWithSide(), map2, map, map3, z, z2, z3, streamComboQuoteUseCase3, buildOrderFormAction);
        }
        return buildComboQuoteButtons(streamComboQuoteUseCase3, buildOrderFormAction);
    }

    private static final GameDetailComboTradeBarState buildWheelPickerButtons() {
        StringResource.Companion companion = StringResource.INSTANCE;
        return new GameDetailComboTradeBarState(extensions2.persistentListOf(new TradeButton(companion.invoke(C16283R.string.cancel_label, new Object[0]), true, TradeButton.Style.Secondary.INSTANCE, TradeButton.Action.DismissWheelPicker.INSTANCE, false, null, 48, null), new TradeButton(companion.invoke(C16283R.string.confirm_label, new Object[0]), true, TradeButton.Style.Primary.INSTANCE, TradeButton.Action.ConfirmWheelPickerSelection.INSTANCE, false, null, 48, null)), null, 2, null);
    }

    private static final GameDetailComboTradeBarState buildSingleContractTradeSlipButtons(ContractIdWithSide contractIdWithSide, Map<UUID, UiEventContractPosition> map, Map<UUID, EventContract> map2, Map<UUID, ? extends List<UiEventOrder>> map3, boolean z, boolean z2, boolean z3, StreamComboQuoteUseCase3 streamComboQuoteUseCase3, BuildOrderFormAction buildOrderFormAction) {
        BigDecimal quantity;
        EventContractTradability tradability;
        ContractSide contractSide;
        GameDetailComboTradeBarState.ErrorState errorState = null;
        UiEventContractPosition uiEventContractPosition = map != null ? map.get(contractIdWithSide.getContractId()) : null;
        EventContract eventContract = map2 != null ? map2.get(contractIdWithSide.getContractId()) : null;
        boolean z4 = true;
        boolean z5 = (uiEventContractPosition == null || (contractSide = ContractGroup5.getContractSide(uiEventContractPosition)) == null || !ContractSideExtensions.isOpposite(contractSide, contractIdWithSide.getSide())) ? false : true;
        List<UiEventOrder> listEmptyList = map3.get(contractIdWithSide.getContractId());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (uiEventContractPosition == null || (quantity = uiEventContractPosition.getQuantity()) == null) {
            quantity = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(quantity);
        EventOrderSide eventOrderSideSideWithPendingOrdersWhenNoHolding = PendingOrderUtils.sideWithPendingOrdersWhenNoHolding(listEmptyList, quantity);
        boolean z6 = eventOrderSideSideWithPendingOrdersWhenNoHolding != null && ContractSideExtensions.isOpposite(EventOrderSide2.toContractSide(eventOrderSideSideWithPendingOrdersWhenNoHolding), contractIdWithSide.getSide());
        if ((z5 || z6 || z || ((eventContract != null && (tradability = eventContract.getTradability()) != null && !tradability.getCanOpenPosition()) || !z2)) && !z3) {
            z4 = false;
        }
        StreamComboQuoteUseCase3.Quote quote = streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Quote ? (StreamComboQuoteUseCase3.Quote) streamComboQuoteUseCase3 : null;
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new TradeButton(BuildBottomSheetBuyButton.buildBuyButtonLabel(quote != null ? quote.getData() : null, contractIdWithSide.getSide(), null, false), z4, TradeButton.Style.Primary.INSTANCE, buildOrderFormAction.build(new EventTradeOrderContext(contractIdWithSide.getContractId(), ContractSideExtensions.toOrderSide(contractIdWithSide.getSide()), PositionEffectDto.OPEN)), false, "gdp-bottom-sheet-buy-" + contractIdWithSide.getSide().getServerValue() + "-" + contractIdWithSide.getContractId(), 16, null));
        if (z5) {
            errorState = new GameDetailComboTradeBarState.ErrorState(StringResource.INSTANCE.invoke(C16283R.string.trade_button_disabled_label, new Object[0]), false);
        } else if (z6) {
            errorState = new GameDetailComboTradeBarState.ErrorState(StringResource.INSTANCE.invoke(C16283R.string.trade_button_disabled_pending_order_label, new Object[0]), false);
        }
        return new GameDetailComboTradeBarState(immutableList3PersistentListOf, errorState);
    }

    private static final GameDetailComboTradeBarState buildComboQuoteButtons(StreamComboQuoteUseCase3 streamComboQuoteUseCase3, BuildOrderFormAction buildOrderFormAction) {
        if (streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Error) {
            return new GameDetailComboTradeBarState(extensions2.persistentListOf(TradeButton.INSTANCE.getUnavailable()), new GameDetailComboTradeBarState.ErrorState(StringResource.INSTANCE.invoke(((StreamComboQuoteUseCase3.Error) streamComboQuoteUseCase3).getMessage()), true));
        }
        if (streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Timeout) {
            return buildPriceUnavailableState();
        }
        if (streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Proposals) {
            StreamComboQuoteUseCase3.Proposals proposals = (StreamComboQuoteUseCase3.Proposals) streamComboQuoteUseCase3;
            ProposalData data = proposals.getData();
            BigDecimal buyMorePrice = data != null ? data.getBuyMorePrice() : null;
            if (data == null) {
                return new GameDetailComboTradeBarState(extensions2.persistentListOf(TradeButton.INSTANCE.gettingPriceLoading(StringResource.INSTANCE.invoke(C16283R.string.combo_bottom_sheet_trade_button_getting_price_loading_label, new Object[0]))), null, 2, null);
            }
            if (buyMorePrice == null) {
                return buildPriceUnavailableState();
            }
            return new GameDetailComboTradeBarState(extensions2.persistentListOf(new TradeButton(StringResource.INSTANCE.invoke(C16283R.string.trade_cta_label, BigDecimals2.priceInCents(buyMorePrice)), true, TradeButton.Style.Primary.INSTANCE, buildOrderFormAction.build(new EventTradeOrderContext(proposals.getRfq().getComboInstrumentId(), SideDto.BUY, PositionEffectDto.OPEN)), false, null, 48, null)), null, 2, null);
        }
        if (!(streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Quote) && streamComboQuoteUseCase3 != null) {
            throw new NoWhenBranchMatchedException();
        }
        return new GameDetailComboTradeBarState(extensions2.persistentListOf(TradeButton.INSTANCE.gettingPriceLoading(StringResource.INSTANCE.invoke(C16283R.string.combo_bottom_sheet_trade_button_getting_price_loading_label, new Object[0]))), null, 2, null);
    }

    private static final GameDetailComboTradeBarState buildPriceUnavailableState() {
        return new GameDetailComboTradeBarState(extensions2.persistentListOf(TradeButton.INSTANCE.getUnavailable()), new GameDetailComboTradeBarState.ErrorState(StringResource.INSTANCE.invoke(C16283R.string.combo_bottom_sheet_trade_error_message_no_price_available, new Object[0]), true));
    }

    private static final GameDetailComboTradeBarState buildComboPositionTradeBarButtons(StreamComboQuoteUseCase3 streamComboQuoteUseCase3, BuildOrderFormAction buildOrderFormAction, UUID uuid, boolean z, boolean z2, boolean z3, ContractSide contractSide) {
        SideDto sideDto;
        if (streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Error) {
            return new GameDetailComboTradeBarState(extensions2.persistentListOf(TradeButton.INSTANCE.getUnavailable()), new GameDetailComboTradeBarState.ErrorState(StringResource.INSTANCE.invoke(((StreamComboQuoteUseCase3.Error) streamComboQuoteUseCase3).getMessage()), true));
        }
        if (streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Timeout) {
            return buildPriceUnavailableState();
        }
        if (streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Proposals) {
            ProposalData data = ((StreamComboQuoteUseCase3.Proposals) streamComboQuoteUseCase3).getData();
            BigDecimal closePrice = data != null ? data.getClosePrice() : null;
            if (data == null) {
                return new GameDetailComboTradeBarState(extensions2.persistentListOf(TradeButton.INSTANCE.gettingPriceLoading(StringResource.INSTANCE.invoke(C16283R.string.combo_bottom_sheet_trade_button_getting_price_loading_label, new Object[0]))), null, 2, null);
            }
            if (closePrice == null) {
                return buildPriceUnavailableState();
            }
            StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C16283R.string.close_label, BigDecimals2.priceInCents(closePrice));
            boolean z4 = z && !z2;
            TradeButton.Style.Primary primary = TradeButton.Style.Primary.INSTANCE;
            if (z3) {
                sideDto = SideDto.SELL;
            } else {
                sideDto = SideDto.BUY;
            }
            return new GameDetailComboTradeBarState(extensions2.persistentListOf(new TradeButton(stringResourceInvoke, z4, primary, buildOrderFormAction.build(new EventTradeOrderContext(uuid, sideDto, PositionEffectDto.CLOSE)), false, buildCloseLoggingIdentifier(contractSide, uuid), 16, null)), null, 2, null);
        }
        if (!(streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Quote) && streamComboQuoteUseCase3 != null) {
            throw new NoWhenBranchMatchedException();
        }
        return new GameDetailComboTradeBarState(extensions2.persistentListOf(TradeButton.INSTANCE.gettingPriceLoading(StringResource.INSTANCE.invoke(C16283R.string.combo_bottom_sheet_trade_button_getting_price_loading_label, new Object[0]))), null, 2, null);
    }

    private static final GameDetailComboTradeBarState buildPositionTradeBarState(BuildOrderFormAction buildOrderFormAction, UiEventContractPosition uiEventContractPosition, EventQuote eventQuote, boolean z, EventContract eventContract, boolean z2, Map<UUID, ? extends List<UiEventOrder>> map, StreamComboQuoteUseCase3 streamComboQuoteUseCase3) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        SideDto sideDto;
        SideDto sideDto2;
        if (uiEventContractPosition == null || eventContract == null) {
            TradeButton.Companion companion = TradeButton.INSTANCE;
            return new GameDetailComboTradeBarState(extensions2.persistentListOf(companion.getLoading(), companion.getLoading()), null, 2, null);
        }
        List<UiEventOrder> list = map.get(eventContract.getContractId());
        boolean zHasEnoughAmountOfPendingOrderToClosePosition = list != null ? PendingOrderUtils.hasEnoughAmountOfPendingOrderToClosePosition(list, uiEventContractPosition.getQuantity()) : false;
        boolean z6 = true;
        boolean z7 = !z && eventContract.getTradability().getCanOpenPosition();
        boolean canClosePosition = eventContract.getTradability().getCanClosePosition();
        boolean z8 = z7 && z2;
        if (canClosePosition && z2) {
            z3 = false;
            z4 = zHasEnoughAmountOfPendingOrderToClosePosition;
            z5 = true;
        } else {
            z3 = false;
            z4 = zHasEnoughAmountOfPendingOrderToClosePosition;
            z5 = false;
        }
        if (ContractGroup5.getContractSide(uiEventContractPosition) == ContractSide.CONTRACT_SIDE_YES) {
            i = 1;
        } else {
            i = 1;
            z6 = z3;
        }
        if (eventContract.isComboContract()) {
            return buildComboPositionTradeBarButtons(streamComboQuoteUseCase3, buildOrderFormAction, eventContract.getContractId(), z5, z4, z6, ContractGroup5.getContractSide(uiEventContractPosition));
        }
        boolean z9 = z6;
        boolean z10 = z5;
        String strPriceInCentsWithNullFallback$default = BigDecimals2.priceInCentsWithNullFallback$default(eventQuote != null ? eventQuote.getAskPriceWithContractSide(ContractGroup5.getContractSide(uiEventContractPosition)) : null, null, i, null);
        String strPriceInCentsWithNullFallback$default2 = BigDecimals2.priceInCentsWithNullFallback$default(eventQuote != null ? eventQuote.getBidPriceWithContractSide(ContractGroup5.getContractSide(uiEventContractPosition)) : null, null, i, null);
        StringResource.Companion companion2 = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion2.invoke(C16283R.string.buy_more_label, strPriceInCentsWithNullFallback$default);
        TradeButton.Style.Primary primary = TradeButton.Style.Primary.INSTANCE;
        UUID contractId = eventContract.getContractId();
        if (z9) {
            sideDto = SideDto.BUY;
        } else {
            sideDto = SideDto.SELL;
        }
        TradeButton tradeButton = new TradeButton(stringResourceInvoke, z8, primary, buildOrderFormAction.build(new EventTradeOrderContext(contractId, sideDto, PositionEffectDto.OPEN)), false, "gdp-bottom-sheet-buy-more-" + ContractGroup5.getContractSide(uiEventContractPosition).getServerValue() + "-" + eventContract.getContractId(), 16, null);
        StringResource stringResourceInvoke2 = companion2.invoke(C16283R.string.close_label, strPriceInCentsWithNullFallback$default2);
        boolean z11 = z10 && !z4;
        UUID contractId2 = eventContract.getContractId();
        if (z9) {
            sideDto2 = SideDto.SELL;
        } else {
            sideDto2 = SideDto.BUY;
        }
        return new GameDetailComboTradeBarState(extensions2.persistentListOf(tradeButton, new TradeButton(stringResourceInvoke2, z11, primary, buildOrderFormAction.build(new EventTradeOrderContext(contractId2, sideDto2, PositionEffectDto.CLOSE)), false, "gdp-bottom-sheet-close-" + ContractGroup5.getContractSide(uiEventContractPosition).getServerValue() + "-" + eventContract.getContractId(), 16, null)), null, 2, null);
    }

    private static final GameDetailComboTradeBarState buildDefaultTradeBarState(UiEcEvent uiEcEvent, Map<UUID, UiEventContractPosition> map, Map<UUID, EventQuote> map2, BuildOrderFormAction buildOrderFormAction, boolean z, boolean z2, boolean z3) {
        UiEventContractPosition uiEventContractPosition;
        UiEventContractPosition uiEventContractPosition2;
        BigDecimal quantity;
        BigDecimal quantity2;
        SortedMap<Integer, EventContract> orderedContracts;
        SortedMap<Integer, EventContract> orderedContracts2;
        boolean zIsNegative = false;
        EventContract eventContract = (uiEcEvent == null || (orderedContracts2 = uiEcEvent.getOrderedContracts()) == null) ? null : orderedContracts2.get(0);
        EventContract eventContract2 = (uiEcEvent == null || (orderedContracts = uiEcEvent.getOrderedContracts()) == null) ? null : orderedContracts.get(1);
        if (map != null) {
            uiEventContractPosition = map.get(eventContract != null ? eventContract.getContractId() : null);
        } else {
            uiEventContractPosition = null;
        }
        if (map != null) {
            uiEventContractPosition2 = map.get(eventContract2 != null ? eventContract2.getContractId() : null);
        } else {
            uiEventContractPosition2 = null;
        }
        boolean zIsNegative2 = (uiEventContractPosition == null || (quantity2 = uiEventContractPosition.getQuantity()) == null) ? false : BigDecimals7.isNegative(quantity2);
        if (uiEventContractPosition2 != null && (quantity = uiEventContractPosition2.getQuantity()) != null) {
            zIsNegative = BigDecimals7.isNegative(quantity);
        }
        return new GameDetailComboTradeBarState(extensions2.persistentListOf(BuildTradeButton.createDefaultTradeButtonForContract(eventContract, map2, buildOrderFormAction, z, z2, z3, zIsNegative2), BuildTradeButton.createDefaultTradeButtonForContract(eventContract2, map2, buildOrderFormAction, z, z2, z3, zIsNegative)), null, 2, null);
    }

    private static final String buildCloseLoggingIdentifier(ContractSide contractSide, UUID uuid) {
        return "gdp-bottom-sheet-close-" + contractSide.getServerValue() + "-" + uuid;
    }
}
