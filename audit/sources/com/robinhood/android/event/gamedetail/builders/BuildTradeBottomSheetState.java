package com.robinhood.android.event.gamedetail.builders;

import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.event.gamedetail.components.ComboPickerContractRow3;
import com.robinhood.android.event.gamedetail.components.ComboPickerContractRowState;
import com.robinhood.android.event.gamedetail.components.ContractOptionData;
import com.robinhood.android.event.gamedetail.components.WheelPickerState;
import com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetState;
import com.robinhood.android.event.gamedetail.p130ui.DayNightImageUrl;
import com.robinhood.android.event.gamedetail.p130ui.DayNightImageUrl2;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.eventcontracts.sharedeventui.PriceUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import com.robinhood.android.models.event.p186db.predictionmarkets.StrikeContract;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BuildTradeBottomSheetState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\\\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0000\u001aF\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002\u001a6\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0002\u001a.\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005H\u0002\u001a0\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¨\u0006\u001f"}, m3636d2 = {"buildTradeSlipBottomSheetState", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailTradeBottomSheetState;", "selectedContractOption", "Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;", "contractIdToEventContract", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "contractIdToEventQuote", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "contractIdToStrikeContract", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "Lcom/robinhood/android/models/event/db/predictionmarkets/StrikeContract;", "bottomSheetDisplayDetails", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;", "buildSpreadsAndTotalsBottomSheet", "getDisplayQuote", "", "activeContractId", "activeSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "showPriceAsPercent", "", "buildWheelPickerState", "Lcom/robinhood/android/event/gamedetail/components/WheelPickerState;", "selectedContractIdWithSide", "strikeContract", "buildMoneyLineTradeSlipBottomSheet", "contractIdWithSide", "eventContract", "buildPropsAndPrepacksBottomSheet", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.builders.BuildTradeBottomSheetStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildTradeBottomSheetState {
    public static final GameDetailTradeBottomSheetState buildTradeSlipBottomSheetState(ContractOptionData selectedContractOption, Map<UUID, EventContract> map, Map<UUID, EventQuote> map2, Map<ContractIdWithSide, StrikeContract> contractIdToStrikeContract, ContractDisplayDetails contractDisplayDetails) {
        Intrinsics.checkNotNullParameter(selectedContractOption, "selectedContractOption");
        Intrinsics.checkNotNullParameter(contractIdToStrikeContract, "contractIdToStrikeContract");
        EventContract eventContract = map != null ? map.get(selectedContractOption.getStrikeContract().getContractId()) : null;
        ContractGroup3 contractColumnType = selectedContractOption.getContractColumnType();
        if (contractColumnType == ContractGroup3.CONTRACT_COLUMN_TYPE_BINARY && eventContract != null) {
            return buildMoneyLineTradeSlipBottomSheet(selectedContractOption.getSelectedContract(), eventContract, map2);
        }
        if (contractColumnType == ContractGroup3.CONTRACT_COLUMN_TYPE_ALTERNATE_STRIKE) {
            return buildSpreadsAndTotalsBottomSheet(selectedContractOption, map2, contractIdToStrikeContract, contractDisplayDetails);
        }
        if (contractColumnType == ContractGroup3.CONTRACT_COLUMN_TYPE_PREPACK || contractColumnType == ContractGroup3.CONTRACT_COLUMN_TYPE_PROPS) {
            return buildPropsAndPrepacksBottomSheet(selectedContractOption, map2, contractDisplayDetails);
        }
        return null;
    }

    private static final GameDetailTradeBottomSheetState buildSpreadsAndTotalsBottomSheet(ContractOptionData contractOptionData, Map<UUID, EventQuote> map, Map<ContractIdWithSide, StrikeContract> map2, ContractDisplayDetails contractDisplayDetails) {
        LinkedHashMap linkedHashMap;
        ContractElement contractElement;
        List<ContractElement> contracts2;
        String displayQuote = getDisplayQuote(contractOptionData.getSelectedContract().getContractId(), contractOptionData.getSelectedContract().getSide(), map, false);
        ContractIdWithSide selectedContract = contractOptionData.getSelectedContract();
        StrikeContract strikeContract = map2.get(contractOptionData.getStrikeContract());
        if (strikeContract == null || (contracts2 = strikeContract.getContracts()) == null) {
            linkedHashMap = null;
        } else {
            List<ContractElement> list = contracts2;
            linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                ContractElement contractElement2 = (ContractElement) obj;
                linkedHashMap.put(Tuples4.m3642to(contractElement2.getContractId(), contractElement2.getContractSide()), obj);
            }
        }
        String contractDisplayText = (linkedHashMap == null || (contractElement = (ContractElement) linkedHashMap.get(Tuples4.m3642to(selectedContract.getContractId(), selectedContract.getSide()))) == null) ? null : contractElement.getContractDisplayText();
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C16283R.string.trade_bottom_sheet_title_label, new Object[0]);
        DayNightImageUrl dayNightImageUrlImageUrl = DayNightImageUrl2.imageUrl(contractDisplayDetails);
        String contractPrefix = contractDisplayDetails != null ? contractDisplayDetails.getContractPrefix() : null;
        UUID contractId = contractOptionData.getSelectedContract().getContractId();
        if (contractDisplayText == null) {
            contractDisplayText = "-";
        }
        return new GameDetailTradeBottomSheetState(stringResourceInvoke, extensions2.persistentListOf(new ComboPickerContractRowState(selectedContract, selectedContract, dayNightImageUrlImageUrl, contractPrefix, null, new ComboPickerContractRow3.StrikePriceButtonState(contractId, contractDisplayText), companion.invoke(displayQuote))), contractOptionData.getCurrentWheelPickerContract() != null, buildWheelPickerState(contractOptionData.getSelectedContract(), strikeContract));
    }

    private static final String getDisplayQuote(UUID uuid, ContractSide contractSide, Map<UUID, EventQuote> map, boolean z) {
        EventQuote eventQuote;
        String ecPrice;
        if (map != null && (eventQuote = map.get(uuid)) != null) {
            BigDecimal askPriceWithContractSide = eventQuote.getAskPriceWithContractSide(contractSide);
            if (askPriceWithContractSide == null) {
                ecPrice = null;
            } else if (z) {
                ecPrice = PriceUtils.formatEcPrice(askPriceWithContractSide, true);
            } else {
                ecPrice = Formats.getCurrencyFormat().format(askPriceWithContractSide);
            }
            return ecPrice == null ? "-" : ecPrice;
        }
        return "-";
    }

    private static final WheelPickerState buildWheelPickerState(ContractIdWithSide contractIdWithSide, StrikeContract strikeContract) {
        if (contractIdWithSide == null || strikeContract == null) {
            return null;
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(strikeContract.getContracts());
        List<ContractElement> contracts2 = strikeContract.getContracts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contracts2, 10));
        Iterator<T> it = contracts2.iterator();
        while (it.hasNext()) {
            arrayList.add(ContractElementExt.toContractIdWithSide((ContractElement) it.next()));
        }
        return new WheelPickerState(persistentList, arrayList.indexOf(contractIdWithSide));
    }

    private static final GameDetailTradeBottomSheetState buildMoneyLineTradeSlipBottomSheet(ContractIdWithSide contractIdWithSide, EventContract eventContract, Map<UUID, EventQuote> map) {
        String str;
        EventQuote eventQuote;
        BigDecimal askPriceWithContractSide;
        if (map == null || (eventQuote = map.get(contractIdWithSide.getContractId())) == null || (askPriceWithContractSide = eventQuote.getAskPriceWithContractSide(contractIdWithSide.getSide())) == null || (str = Formats.getCurrencyFormat().format(askPriceWithContractSide)) == null) {
            str = "-";
        }
        ContractSide contractSide = ContractSide.CONTRACT_SIDE_YES;
        ContractSide contractSide2 = ContractSide.CONTRACT_SIDE_NO;
        String imageUrl = eventContract.getImageUrl();
        StringResource.Companion companion = StringResource.INSTANCE;
        return new GameDetailTradeBottomSheetState(companion.invoke(C16283R.string.trade_bottom_sheet_title_label, new Object[0]), extensions2.persistentListOf(new ComboPickerContractRowState(contractIdWithSide, contractIdWithSide, new DayNightImageUrl(imageUrl), eventContract.getDisplayShortName(), null, new ComboPickerContractRow3.ToggleButtonState(contractIdWithSide.getContractId(), new ComboPickerContractRow3.ToggleButtonState.ToggleOption(companion.invoke(C16283R.string.trade_yes_label, new Object[0]), contractIdWithSide.getSide() == contractSide, contractSide), new ComboPickerContractRow3.ToggleButtonState.ToggleOption(companion.invoke(C16283R.string.trade_no_label, new Object[0]), contractIdWithSide.getSide() == contractSide2, contractSide2)), companion.invoke(str))), false, null);
    }

    private static final GameDetailTradeBottomSheetState buildPropsAndPrepacksBottomSheet(ContractOptionData contractOptionData, Map<UUID, EventQuote> map, ContractDisplayDetails contractDisplayDetails) {
        String displayQuote = contractOptionData.getContractColumnType() == ContractGroup3.CONTRACT_COLUMN_TYPE_PROPS ? getDisplayQuote(contractOptionData.getSelectedContract().getContractId(), contractOptionData.getSelectedContract().getSide(), map, true) : null;
        ContractIdWithSide selectedContract = contractOptionData.getSelectedContract();
        ContractSide contractSide = ContractSide.CONTRACT_SIDE_YES;
        ContractSide contractSide2 = ContractSide.CONTRACT_SIDE_NO;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C16283R.string.trade_bottom_sheet_title_label, new Object[0]);
        DayNightImageUrl dayNightImageUrlImageUrl = DayNightImageUrl2.imageUrl(contractDisplayDetails);
        String contractPrefix = contractDisplayDetails != null ? contractDisplayDetails.getContractPrefix() : null;
        ComboPickerContractRow3.ToggleButtonState toggleButtonState = new ComboPickerContractRow3.ToggleButtonState(selectedContract.getContractId(), new ComboPickerContractRow3.ToggleButtonState.ToggleOption(companion.invoke(C16283R.string.trade_yes_label, new Object[0]), selectedContract.getSide() == contractSide, contractSide), new ComboPickerContractRow3.ToggleButtonState.ToggleOption(companion.invoke(C16283R.string.trade_no_label, new Object[0]), selectedContract.getSide() == contractSide2, contractSide2));
        StringResource stringResourceInvoke2 = displayQuote != null ? companion.invoke(displayQuote) : null;
        String propName = contractDisplayDetails != null ? contractDisplayDetails.getPropName() : null;
        return new GameDetailTradeBottomSheetState(stringResourceInvoke, extensions2.persistentListOf(new ComboPickerContractRowState(selectedContract, selectedContract, dayNightImageUrlImageUrl, contractPrefix, (propName == null || propName.length() == 0) ? null : contractDisplayDetails.getPropName(), toggleButtonState, stringResourceInvoke2)), false, null);
    }
}
