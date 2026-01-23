package com.robinhood.android.event.detail.builders;

import com.robinhood.android.event.detail.C16095R;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.android.event.detail.p129ui.dialog.EventTradeOverlayDialogData;
import com.robinhood.android.eventcontracts.sharedeventui.maths.EventMathsUtils;
import com.robinhood.android.eventcontracts.sharedeventui.util.PendingOrderUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.event.p186db.arsenal.EventViewMode;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: BuildEventTradeOverlayDialogData.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\f"}, m3636d2 = {"buildEventTradeOverlayDialog", "Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;", "contractData", "Lcom/robinhood/android/event/detail/builders/ContractListData;", "buttonViewState", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "anchorYPx", "", "viewMode", "Lcom/robinhood/android/models/event/db/arsenal/EventViewMode;", "buildSelectedQuoteText", "Lcom/robinhood/utils/resource/StringResource;", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.builders.BuildEventTradeOverlayDialogDataKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildEventTradeOverlayDialogData {
    public static final EventTradeOverlayDialogData buildEventTradeOverlayDialog(ContractListData contractListData, ContractSelectorButtonViewState buttonViewState, int i, EventViewMode eventViewMode) {
        BigDecimal quantity;
        Tuples2 tuples2M3642to;
        ContractSelectorButtonViewState.Metadata metadata;
        Intrinsics.checkNotNullParameter(buttonViewState, "buttonViewState");
        ContractSelectorButtonViewState.Metadata metadata2 = null;
        if (contractListData == null) {
            return null;
        }
        UiEventContractPosition position = contractListData.getPosition();
        boolean zIsPositive = BigDecimals7.isPositive(position != null ? position.getQuantity() : null);
        UiEventContractPosition position2 = contractListData.getPosition();
        if (position2 == null || (quantity = position2.getQuantity()) == null) {
            quantity = BigDecimal.ZERO;
        }
        List<UiEventOrder> pendingOrders = contractListData.getPendingOrders();
        Intrinsics.checkNotNull(quantity);
        boolean zHasEnoughAmountOfPendingOrderToClosePosition = PendingOrderUtils.hasEnoughAmountOfPendingOrderToClosePosition(pendingOrders, quantity);
        if (zIsPositive) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i2 = C16095R.string.event_detail_trade_bar_buy_more_label;
            EventQuote quote = contractListData.getQuote();
            StringResource stringResourceInvoke = companion.invoke(i2, BuildMultiContractList.getPriceInCents(quote != null ? quote.getYesAskPrice() : null));
            int i3 = C16095R.string.event_detail_trade_bar_close_label;
            EventQuote quote2 = contractListData.getQuote();
            tuples2M3642to = Tuples4.m3642to(stringResourceInvoke, companion.invoke(i3, BuildMultiContractList.getPriceInCents(quote2 != null ? quote2.getYesBidPrice() : null)));
        } else {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            int i4 = C16095R.string.event_detail_trade_bar_buy_more_label;
            EventQuote quote3 = contractListData.getQuote();
            StringResource stringResourceInvoke2 = companion2.invoke(i4, BuildMultiContractList.getPriceInCents(quote3 != null ? quote3.getNoAskPrice() : null));
            int i5 = C16095R.string.event_detail_trade_bar_close_label;
            EventQuote quote4 = contractListData.getQuote();
            tuples2M3642to = Tuples4.m3642to(stringResourceInvoke2, companion2.invoke(i5, BuildMultiContractList.getPriceInCents(quote4 != null ? quote4.getNoBidPrice() : null)));
        }
        StringResource stringResource = (StringResource) tuples2M3642to.component1();
        StringResource stringResource2 = (StringResource) tuples2M3642to.component2();
        if (zIsPositive) {
            metadata = new ContractSelectorButtonViewState.Metadata(contractListData.getContract().getContractId(), SideDto.BUY, PositionEffectDto.OPEN);
        } else {
            metadata = new ContractSelectorButtonViewState.Metadata(contractListData.getContract().getContractId(), SideDto.SELL, PositionEffectDto.OPEN);
        }
        ContractSelectorButtonViewState.Metadata metadata3 = metadata;
        if (!zHasEnoughAmountOfPendingOrderToClosePosition) {
            if (zIsPositive) {
                metadata2 = new ContractSelectorButtonViewState.Metadata(contractListData.getContract().getContractId(), SideDto.SELL, PositionEffectDto.CLOSE);
            } else {
                metadata2 = new ContractSelectorButtonViewState.Metadata(contractListData.getContract().getContractId(), SideDto.BUY, PositionEffectDto.CLOSE);
            }
        }
        ContractSelectorButtonViewState.Metadata metadata4 = metadata2;
        StringResource stringResourceBuildSelectedQuoteText = buildSelectedQuoteText(contractListData);
        Tuples2<Integer, Double> positionLoggingInfo = buttonViewState.getPositionLoggingInfo();
        return new EventTradeOverlayDialogData(contractListData.getContract().getDisplayShortName(), stringResourceBuildSelectedQuoteText, stringResource, stringResource2, metadata3, metadata4, buttonViewState.getSide(), i, eventViewMode, positionLoggingInfo.component1().intValue(), positionLoggingInfo.component2().doubleValue());
    }

    private static final StringResource buildSelectedQuoteText(ContractListData contractListData) {
        BigDecimal bigDecimalAbs;
        String str;
        BigDecimal bigDecimalAbs2;
        String str2;
        UiEventContractPosition position = contractListData.getPosition();
        BigDecimal quantity = position != null ? position.getQuantity() : null;
        UiEventContractPosition position2 = contractListData.getPosition();
        String str3 = "-";
        if (position2 != null) {
            if (BigDecimals7.isPositive(position2.getQuantity())) {
                StringResource.Companion companion = StringResource.INSTANCE;
                int i = C16095R.string.event_trade_overlay_dialog_quote_text;
                StringResource stringResourceInvoke = companion.invoke(C16095R.string.multi_contract_selector_header_yes_label, new Object[0]);
                if (quantity != null && (bigDecimalAbs2 = quantity.abs()) != null && (str2 = Formats.getIntegerFormat().format(bigDecimalAbs2)) != null) {
                    str3 = str2;
                }
                return companion.invoke(i, stringResourceInvoke, str3, Formats.getPriceFormat().format(EventMathsUtils.getAvgPriceWithRounding(position2)));
            }
            if (BigDecimals7.isNegative(position2.getQuantity())) {
                StringResource.Companion companion2 = StringResource.INSTANCE;
                int i2 = C16095R.string.event_trade_overlay_dialog_quote_text;
                StringResource stringResourceInvoke2 = companion2.invoke(C16095R.string.multi_contract_selector_header_no_label, new Object[0]);
                if (quantity != null && (bigDecimalAbs = quantity.abs()) != null && (str = Formats.getIntegerFormat().format(bigDecimalAbs)) != null) {
                    str3 = str;
                }
                return companion2.invoke(i2, stringResourceInvoke2, str3, Formats.getPriceFormat().format(EventMathsUtils.getAvgPriceWithRounding(position2)));
            }
        }
        return StringResource.INSTANCE.invoke("-");
    }
}
