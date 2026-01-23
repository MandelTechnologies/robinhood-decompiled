package com.robinhood.android.event.detail.builders;

import com.robinhood.android.event.detail.C16095R;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButton2;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.android.event.detail.p129ui.bottomsheets.EventDetailDisplayDataBottomSheet;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor2;
import com.robinhood.android.eventcontracts.sharedeventui.animation.Delta;
import com.robinhood.android.eventcontracts.sharedeventui.maths.EventMathsUtils;
import com.robinhood.android.eventcontracts.sharedeventui.util.PendingOrderUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventContractTradability;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.futures.p189db.C22067R;
import com.robinhood.store.futures.FuturesPnLHelper;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: BuildMultiContractList.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001aI\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\u000e\u001ax\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0000\u001a\u000e\u0010!\u001a\u00020\u0018*\u0004\u0018\u00010\"H\u0000\u001a,\u0010#\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010$\u001a\u00020%H\u0002¨\u0006&"}, m3636d2 = {"buildContractSelectorRowControlViewState", "Lcom/robinhood/android/event/detail/builders/ContractSelectorRowControlViewState;", "contractListData", "Lcom/robinhood/android/event/detail/builders/ContractListData;", "buildContractSelectorRowTreatmentViewState", "Lcom/robinhood/android/event/detail/builders/ContractSelectorRowTreatmentViewState;", "showContractColors", "", "hideOptionLabelInQuoteText", "openInterest", "", "openInterestDelta", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;", "isTradeEnabled", "(Lcom/robinhood/android/event/detail/builders/ContractListData;ZZLjava/lang/Integer;Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;Z)Lcom/robinhood/android/event/detail/builders/ContractSelectorRowTreatmentViewState;", "buildContractSelectorRowButtonViewState", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "contract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "side", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonOrderSide;", "quote", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "leftButtonPositionDisplayText", "", "rightButtonPositionDisplayText", "position", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "identifier", "hasEqualAmountOfPendingOrderToClosePosition", "sideWithPendingOrdersWhenNoHolding", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "shouldUseAchromaticTheme", "getPriceInCents", "Ljava/math/BigDecimal;", "buildContractMetadata", "displayMode", "Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.builders.BuildMultiContractListKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildMultiContractList {

    /* compiled from: BuildMultiContractList.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.detail.builders.BuildMultiContractListKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ContractSelectorButton2.values().length];
            try {
                iArr[ContractSelectorButton2.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContractSelectorButton2.f4140NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EventDetailDisplayDataBottomSheet.values().length];
            try {
                iArr2[EventDetailDisplayDataBottomSheet.LAST_YES_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EventDetailDisplayDataBottomSheet.OPEN_PNL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final ContractSelectorRowControlViewState buildContractSelectorRowControlViewState(ContractListData contractListData) {
        Intrinsics.checkNotNullParameter(contractListData, "contractListData");
        EventContract contract = contractListData.getContract();
        String displayLongName = contractListData.getContract().getDisplayLongName();
        UiEventContractPosition position = contractListData.getPosition();
        StringResource stringResourceInvoke = null;
        if (position != null) {
            if (BigDecimals7.isPositive(position.getQuantity())) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C22067R.string.futures_position_display_yes, Formats.getIntegerFormat().format(position.getQuantity()), Formats.getPriceFormat().format(EventMathsUtils.getAvgPriceWithRounding(position)));
            } else if (BigDecimals7.isNegative(position.getQuantity())) {
                StringResource.Companion companion = StringResource.INSTANCE;
                int i = C22067R.string.futures_position_display_no;
                NumberFormatter integerFormat = Formats.getIntegerFormat();
                BigDecimal bigDecimalAbs = position.getQuantity().abs();
                Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
                stringResourceInvoke = companion.invoke(i, integerFormat.format(bigDecimalAbs), Formats.getPriceFormat().format(EventMathsUtils.getAvgPriceWithRounding(position)));
            }
        }
        return new ContractSelectorRowControlViewState(contract, displayLongName, stringResourceInvoke, buildContractMetadata(contractListData.getContract(), contractListData.getQuote(), contractListData.getPosition(), contractListData.getDisplayMode()), contractListData.getContract().getTradability() != EventContractTradability.UNTRADABLE);
    }

    public static /* synthetic */ ContractSelectorRowTreatmentViewState buildContractSelectorRowTreatmentViewState$default(ContractListData contractListData, boolean z, boolean z2, Integer num, Delta delta, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            delta = null;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        return buildContractSelectorRowTreatmentViewState(contractListData, z, z2, num, delta, z3);
    }

    public static final ContractSelectorRowTreatmentViewState buildContractSelectorRowTreatmentViewState(ContractListData contractListData, boolean z, boolean z2, Integer num, Delta delta, boolean z3) {
        BigDecimal quantity;
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(contractListData, "contractListData");
        UiEventContractPosition position = contractListData.getPosition();
        if (position == null || (quantity = position.getQuantity()) == null) {
            quantity = BigDecimal.ZERO;
        }
        boolean zIsPositive = BigDecimals7.isPositive(quantity);
        boolean zIsNegative = BigDecimals7.isNegative(quantity);
        List<UiEventOrder> pendingOrders = contractListData.getPendingOrders();
        Intrinsics.checkNotNull(quantity);
        boolean zHasEnoughAmountOfPendingOrderToClosePosition = PendingOrderUtils.hasEnoughAmountOfPendingOrderToClosePosition(pendingOrders, quantity);
        EventOrderSide eventOrderSideSideWithPendingOrdersWhenNoHolding = PendingOrderUtils.sideWithPendingOrdersWhenNoHolding(contractListData.getPendingOrders(), quantity);
        UiEventContractPosition position2 = contractListData.getPosition();
        if (position2 != null) {
            if (zIsPositive) {
                NumberFormatter integerFormat = Formats.getIntegerFormat();
                BigDecimal bigDecimalAbs = position2.getQuantity().abs();
                Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
                str4 = integerFormat.format(bigDecimalAbs);
            } else {
                str4 = null;
            }
            str = str4;
        } else {
            str = null;
        }
        UiEventContractPosition position3 = contractListData.getPosition();
        if (position3 != null) {
            if (zIsNegative) {
                NumberFormatter integerFormat2 = Formats.getIntegerFormat();
                BigDecimal bigDecimalAbs2 = position3.getQuantity().abs();
                Intrinsics.checkNotNullExpressionValue(bigDecimalAbs2, "abs(...)");
                str3 = integerFormat2.format(bigDecimalAbs2);
            } else {
                str3 = null;
            }
            str2 = str3;
        } else {
            str2 = null;
        }
        String str5 = num != null ? Formats.getIntegerFormat().format(num) : null;
        UUID contractId = contractListData.getContract().getContractId();
        return new ContractSelectorRowTreatmentViewState(contractId, contractListData.getContract().getDisplayShortName(), str5, z ? DayNightColor2.getDayNightColor(contractListData.getContract()) : null, delta, buildContractSelectorRowButtonViewState$default(contractListData.getContract(), ContractSelectorButton2.YES, contractListData.getQuote(), str, str2, contractListData.getPosition(), "contract-selector-yes-" + contractId, zHasEnoughAmountOfPendingOrderToClosePosition, eventOrderSideSideWithPendingOrdersWhenNoHolding, z2, false, z3, 1024, null), buildContractSelectorRowButtonViewState$default(contractListData.getContract(), ContractSelectorButton2.f4140NO, contractListData.getQuote(), str, str2, contractListData.getPosition(), "contract-selector-no-" + contractId, zHasEnoughAmountOfPendingOrderToClosePosition, eventOrderSideSideWithPendingOrdersWhenNoHolding, z2, false, z3, 1024, null));
    }

    public static /* synthetic */ ContractSelectorButtonViewState buildContractSelectorRowButtonViewState$default(EventContract eventContract, ContractSelectorButton2 contractSelectorButton2, EventQuote eventQuote, String str, String str2, UiEventContractPosition uiEventContractPosition, String str3, boolean z, EventOrderSide eventOrderSide, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 512) != 0) {
            z2 = false;
        }
        if ((i & 1024) != 0) {
            z3 = false;
        }
        if ((i & 2048) != 0) {
            z4 = false;
        }
        return buildContractSelectorRowButtonViewState(eventContract, contractSelectorButton2, eventQuote, str, str2, uiEventContractPosition, str3, z, eventOrderSide, z2, z3, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ContractSelectorButtonViewState buildContractSelectorRowButtonViewState(EventContract contract, ContractSelectorButton2 side, EventQuote eventQuote, String str, String str2, UiEventContractPosition uiEventContractPosition, String identifier, boolean z, EventOrderSide eventOrderSide, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        StringResource stringResourceInvoke3;
        StringResource stringResourceInvoke4;
        BigDecimal averagePrice;
        BigDecimal quantity;
        StringResource stringResourceInvoke5;
        BigDecimal averagePrice2;
        BigDecimal quantity2;
        StringResource stringResourceInvoke6;
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Object[] objArr = contract.getTradability() != EventContractTradability.UNTRADABLE;
        ContractSelectorButtonViewState.Metadata metadata = null;
        dValueOf = null;
        Double dValueOf = null;
        dValueOf = null;
        Double dValueOf2 = null;
        metadata = null;
        ContractSelectorButtonViewState.Metadata metadata2 = null;
        metadata = null;
        if (str != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z2) {
                    stringResourceInvoke6 = StringResource.INSTANCE.invoke(getPriceInCents(eventQuote != null ? eventQuote.getNoAskPrice() : null));
                } else {
                    stringResourceInvoke6 = StringResource.INSTANCE.invoke(C16095R.string.event_detail_contract_selector_no_label, getPriceInCents(eventQuote != null ? eventQuote.getNoAskPrice() : null));
                }
                return new ContractSelectorButtonViewState(side, stringResourceInvoke6, new ContractSelectorButtonViewState.PositionState.WithoutPosition(null), identifier, z3, z4);
            }
            if (z2) {
                stringResourceInvoke5 = StringResource.INSTANCE.invoke(getPriceInCents(eventQuote != null ? eventQuote.getYesAskPrice() : null));
            } else {
                stringResourceInvoke5 = StringResource.INSTANCE.invoke(C16095R.string.event_detail_contract_selector_yes_label, getPriceInCents(eventQuote != null ? eventQuote.getYesAskPrice() : null));
            }
            StringResource stringResource = stringResourceInvoke5;
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke7 = companion.invoke(str);
            ContractSelectorButtonViewState.Metadata metadata3 = new ContractSelectorButtonViewState.Metadata(contract.getContractId(), SideDto.BUY, PositionEffectDto.OPEN);
            ContractSelectorButtonViewState.Metadata metadata4 = !z ? new ContractSelectorButtonViewState.Metadata(contract.getContractId(), SideDto.SELL, PositionEffectDto.CLOSE) : null;
            StringResource stringResourceInvoke8 = companion.invoke(C16095R.string.event_detail_trade_bar_buy_more_label, getPriceInCents(eventQuote != null ? eventQuote.getYesAskPrice() : null));
            StringResource stringResourceInvoke9 = companion.invoke(C16095R.string.event_detail_trade_bar_close_label, getPriceInCents(eventQuote != null ? eventQuote.getYesBidPrice() : null));
            Integer numValueOf = (uiEventContractPosition == null || (quantity2 = uiEventContractPosition.getQuantity()) == null) ? null : Integer.valueOf(BigDecimals7.toIntRounded(quantity2));
            if (uiEventContractPosition != null && (averagePrice2 = uiEventContractPosition.getAveragePrice()) != null) {
                dValueOf = Double.valueOf(averagePrice2.doubleValue());
            }
            return new ContractSelectorButtonViewState(side, stringResource, new ContractSelectorButtonViewState.PositionState.WithPosition(stringResourceInvoke7, stringResourceInvoke8, stringResourceInvoke9, metadata3, metadata4, numValueOf, dValueOf), identifier, z3, z4);
        }
        if (str2 != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
            if (i2 == 1) {
                if (z2) {
                    stringResourceInvoke3 = StringResource.INSTANCE.invoke(getPriceInCents(eventQuote != null ? eventQuote.getYesAskPrice() : null));
                } else {
                    stringResourceInvoke3 = StringResource.INSTANCE.invoke(C16095R.string.event_detail_contract_selector_yes_label, getPriceInCents(eventQuote != null ? eventQuote.getYesAskPrice() : null));
                }
                return new ContractSelectorButtonViewState(side, stringResourceInvoke3, new ContractSelectorButtonViewState.PositionState.WithoutPosition(null), identifier, z3, z4);
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (z2) {
                stringResourceInvoke4 = StringResource.INSTANCE.invoke(getPriceInCents(eventQuote != null ? eventQuote.getNoAskPrice() : null));
            } else {
                stringResourceInvoke4 = StringResource.INSTANCE.invoke(C16095R.string.event_detail_contract_selector_no_label, getPriceInCents(eventQuote != null ? eventQuote.getNoAskPrice() : null));
            }
            StringResource stringResource2 = stringResourceInvoke4;
            StringResource.Companion companion2 = StringResource.INSTANCE;
            StringResource stringResourceInvoke10 = companion2.invoke(str2);
            StringResource stringResourceInvoke11 = companion2.invoke(C16095R.string.event_detail_trade_bar_buy_more_label, getPriceInCents(eventQuote != null ? eventQuote.getNoAskPrice() : null));
            StringResource stringResourceInvoke12 = companion2.invoke(C16095R.string.event_detail_trade_bar_close_label, getPriceInCents(eventQuote != null ? eventQuote.getNoBidPrice() : null));
            ContractSelectorButtonViewState.Metadata metadata5 = new ContractSelectorButtonViewState.Metadata(contract.getContractId(), SideDto.SELL, PositionEffectDto.OPEN);
            ContractSelectorButtonViewState.Metadata metadata6 = !z ? new ContractSelectorButtonViewState.Metadata(contract.getContractId(), SideDto.BUY, PositionEffectDto.CLOSE) : null;
            Integer numValueOf2 = (uiEventContractPosition == null || (quantity = uiEventContractPosition.getQuantity()) == null) ? null : Integer.valueOf(BigDecimals7.toIntRounded(quantity));
            if (uiEventContractPosition != null && (averagePrice = uiEventContractPosition.getAveragePrice()) != null) {
                dValueOf2 = Double.valueOf(averagePrice.doubleValue());
            }
            return new ContractSelectorButtonViewState(side, stringResource2, new ContractSelectorButtonViewState.PositionState.WithPosition(stringResourceInvoke10, stringResourceInvoke11, stringResourceInvoke12, metadata5, metadata6, numValueOf2, dValueOf2), identifier, z3, z4);
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i3 == 1) {
            z5 = eventOrderSide == EventOrderSide.SELL;
            if (z2) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(getPriceInCents(eventQuote != null ? eventQuote.getYesAskPrice() : null));
            } else {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C16095R.string.event_detail_contract_selector_yes_label, getPriceInCents(eventQuote != null ? eventQuote.getYesAskPrice() : null));
            }
            StringResource stringResource3 = stringResourceInvoke;
            boolean z6 = z5;
            if (objArr != false && !z6) {
                metadata = new ContractSelectorButtonViewState.Metadata(contract.getContractId(), SideDto.BUY, PositionEffectDto.OPEN);
            }
            return new ContractSelectorButtonViewState(side, stringResource3, new ContractSelectorButtonViewState.PositionState.WithoutPosition(metadata), identifier, z3, z4);
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        z5 = eventOrderSide == EventOrderSide.BUY;
        if (z2) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(getPriceInCents(eventQuote != null ? eventQuote.getNoAskPrice() : null));
        } else {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C16095R.string.event_detail_contract_selector_no_label, getPriceInCents(eventQuote != null ? eventQuote.getNoAskPrice() : null));
        }
        StringResource stringResource4 = stringResourceInvoke2;
        boolean z7 = z5;
        if (objArr != false && !z7) {
            metadata2 = new ContractSelectorButtonViewState.Metadata(contract.getContractId(), SideDto.SELL, PositionEffectDto.OPEN);
        }
        return new ContractSelectorButtonViewState(side, stringResource4, new ContractSelectorButtonViewState.PositionState.WithoutPosition(metadata2), identifier, z3, z4);
    }

    public static final String getPriceInCents(BigDecimal bigDecimal) {
        String strPriceInCents;
        return (bigDecimal == null || (strPriceInCents = BigDecimals2.priceInCents(bigDecimal)) == null) ? "-" : strPriceInCents;
    }

    private static final String buildContractMetadata(EventContract eventContract, EventQuote eventQuote, UiEventContractPosition uiEventContractPosition, EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet) {
        BigDecimal lastTradePrice;
        String strPriceInCents;
        BigDecimal bigDecimalComputePnl;
        String str;
        int i = WhenMappings.$EnumSwitchMapping$1[eventDetailDisplayDataBottomSheet.ordinal()];
        if (i == 1) {
            return (eventQuote == null || (lastTradePrice = eventQuote.getLastTradePrice()) == null || (strPriceInCents = BigDecimals2.priceInCents(lastTradePrice)) == null) ? "-" : strPriceInCents;
        }
        if (i == 2) {
            return (uiEventContractPosition == null || eventQuote == null || (bigDecimalComputePnl = FuturesPnLHelper.computePnl(eventContract.getMultiplier(), uiEventContractPosition.getCostBasis(), eventQuote.getLastTradePrice(), uiEventContractPosition.getQuantity())) == null || (str = Formats.getCurrencyDeltaFormat().format(bigDecimalComputePnl)) == null) ? "-" : str;
        }
        throw new NoWhenBranchMatchedException();
    }
}
