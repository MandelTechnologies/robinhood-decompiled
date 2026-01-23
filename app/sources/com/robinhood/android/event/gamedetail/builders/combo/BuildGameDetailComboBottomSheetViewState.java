package com.robinhood.android.event.gamedetail.builders.combo;

import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.event.gamedetail.builders.CommonFormats;
import com.robinhood.android.event.gamedetail.builders.ContractElementExt;
import com.robinhood.android.event.gamedetail.combostates.ContractSelection;
import com.robinhood.android.event.gamedetail.combostates.GameDetailComboBottomSheetContentViewState;
import com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionState;
import com.robinhood.android.event.gamedetail.components.ComboPickerContractRow3;
import com.robinhood.android.event.gamedetail.components.ComboPickerContractRowState;
import com.robinhood.android.event.gamedetail.components.bottomsheet.PositionContractDetailRowState;
import com.robinhood.android.event.gamedetail.p130ui.DayNightImageUrl;
import com.robinhood.android.event.gamedetail.p130ui.DayNightImageUrl2;
import com.robinhood.android.event.gamedetail.p130ui.DeltaDirection;
import com.robinhood.android.event.gamedetail.p130ui.combo.StrikePickerState;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.eventcontracts.sharedeventui.maths.EventMathsUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup5;
import com.robinhood.android.models.event.p186db.predictionmarkets.StrikeContract;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: BuildGameDetailComboBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a`\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u0005\u001aN\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u0011\u001a\u00020\t2\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0002\u001aN\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u0005H\u0002\u001aX\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001a@\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001a,\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001a\u001a\u0010 \u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002\u001a,\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001a&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0002\u001a\u00020\u00152\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u0005H\u0002\u001a\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010\u001e\u001a\u0004\u0018\u00010\n¨\u0006("}, m3636d2 = {"buildGameDetailComboBottomSheetContentViewState", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;", "selectionState", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;", "displayDetails", "", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;", "contractIdToQuote", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "contractIdToPositions", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "contractIdToStrikeContract", "Lcom/robinhood/android/models/event/db/predictionmarkets/StrikeContract;", "buildPositionContentState", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState$Position;", "selectedPositionContractId", "buildTradeSlipContentState", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState$TradeSlip;", "selectState", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState$ContractSideSelections;", "buildComboPickerContractRow", "Lcom/robinhood/android/event/gamedetail/components/ComboPickerContractRowState;", "selection", "Lcom/robinhood/android/event/gamedetail/combostates/ContractSelection;", "showQuote", "", "buildSpreadsAndTotalsRow", ErrorBundle.DETAIL_ENTRY, "quote", "buildPropsRow", "buildPrepacksRow", "buildMoneylineRow", "buildPickerState", "Lcom/robinhood/android/event/gamedetail/ui/combo/StrikePickerState;", "buildBottomSheetQuotePriceInPercentage", "", "contractSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.builders.combo.BuildGameDetailComboBottomSheetViewStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildGameDetailComboBottomSheetViewState {

    /* compiled from: BuildGameDetailComboBottomSheetViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.gamedetail.builders.combo.BuildGameDetailComboBottomSheetViewStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContractGroup3.values().length];
            try {
                iArr[ContractGroup3.CONTRACT_COLUMN_TYPE_ALTERNATE_STRIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContractGroup3.CONTRACT_COLUMN_TYPE_PROPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContractGroup3.CONTRACT_COLUMN_TYPE_PREPACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContractGroup3.CONTRACT_COLUMN_TYPE_BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ContractGroup3.CONTRACT_COLUMN_TYPE_UNSPECIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final GameDetailComboBottomSheetContentViewState buildGameDetailComboBottomSheetContentViewState(GameDetailSelectionState selectionState, Map<ContractIdWithSide, ContractDisplayDetails> displayDetails, Map<UUID, EventQuote> contractIdToQuote, Map<UUID, UiEventContractPosition> contractIdToPositions, Map<ContractIdWithSide, StrikeContract> contractIdToStrikeContract) {
        Intrinsics.checkNotNullParameter(selectionState, "selectionState");
        Intrinsics.checkNotNullParameter(displayDetails, "displayDetails");
        Intrinsics.checkNotNullParameter(contractIdToQuote, "contractIdToQuote");
        Intrinsics.checkNotNullParameter(contractIdToPositions, "contractIdToPositions");
        Intrinsics.checkNotNullParameter(contractIdToStrikeContract, "contractIdToStrikeContract");
        if (selectionState instanceof GameDetailSelectionState.ContractSideSelections) {
            GameDetailSelectionState.ContractSideSelections contractSideSelections = (GameDetailSelectionState.ContractSideSelections) selectionState;
            ContractSelection contractSelection = (ContractSelection) CollectionsKt.singleOrNull((List) contractSideSelections.getSelections());
            if ((contractSelection != null ? contractSelection.getContractColumnType() : null) == ContractGroup3.CONTRACT_COLUMN_TYPE_BINARY && contractIdToPositions.containsKey(contractSelection.getKey().getContractId())) {
                return buildPositionContentState(contractIdToPositions, contractIdToQuote, contractSelection.getKey().getContractId(), displayDetails);
            }
            return buildTradeSlipContentState(contractSideSelections, displayDetails, contractIdToQuote, contractIdToStrikeContract);
        }
        if (selectionState instanceof GameDetailSelectionState.Empty) {
            GameDetailSelectionState lastSelection = ((GameDetailSelectionState.Empty) selectionState).getLastSelection();
            return new GameDetailComboBottomSheetContentViewState.Empty(lastSelection != null ? buildGameDetailComboBottomSheetContentViewState(lastSelection, displayDetails, contractIdToQuote, contractIdToPositions, contractIdToStrikeContract) : null);
        }
        if (!(selectionState instanceof GameDetailSelectionState.Position)) {
            throw new NoWhenBranchMatchedException();
        }
        return buildPositionContentState(contractIdToPositions, contractIdToQuote, ((GameDetailSelectionState.Position) selectionState).getContractId(), displayDetails);
    }

    private static final GameDetailComboBottomSheetContentViewState.Position buildPositionContentState(Map<UUID, UiEventContractPosition> map, Map<UUID, EventQuote> map2, UUID uuid, Map<ContractIdWithSide, ContractDisplayDetails> map3) {
        BigDecimal bigDecimalComputeEventOpenPnl;
        DeltaDirection deltaDirection;
        ImmutableList3 immutableList3PersistentListOf;
        String combosBottomSheetPositionContractSecondaryText;
        StringResource stringResource;
        UiEventContractPosition uiEventContractPosition = map.get(uuid);
        ContractSide contractSide = uiEventContractPosition != null ? ContractGroup5.getContractSide(uiEventContractPosition) : null;
        ContractDisplayDetails contractDisplayDetails = map3.get(uiEventContractPosition != null ? uiEventContractPosition.getContractIdWithSide() : null);
        List<ContractDisplayDetails> selectedLegsDetails = contractDisplayDetails != null ? contractDisplayDetails.getSelectedLegsDetails() : null;
        boolean z = selectedLegsDetails != null && selectedLegsDetails.size() > 1;
        ContractIdWithSide contractIdWithSide = contractSide != null ? new ContractIdWithSide(uuid, contractSide) : null;
        ContractDisplayDetails contractDisplayDetails2 = contractIdWithSide != null ? map3.get(contractIdWithSide) : null;
        EventQuote eventQuote = !z ? map2.get(uuid) : null;
        if (z) {
            bigDecimalComputeEventOpenPnl = null;
        } else {
            bigDecimalComputeEventOpenPnl = EventMathsUtils.computeEventOpenPnl(eventQuote != null ? eventQuote.getLastTradePrice() : null, uiEventContractPosition);
        }
        if (bigDecimalComputeEventOpenPnl == null || !BigDecimals7.isNegative(bigDecimalComputeEventOpenPnl)) {
            deltaDirection = DeltaDirection.POSITIVE;
        } else {
            deltaDirection = DeltaDirection.NEGATIVE;
        }
        DeltaDirection deltaDirection2 = deltaDirection;
        if (z) {
            List<ContractDisplayDetails> list = selectedLegsDetails;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ContractDisplayDetails contractDisplayDetails3 : list) {
                String str = uuid + "." + contractDisplayDetails3.getContractId() + "." + contractDisplayDetails3.getSide();
                DayNightImageUrl dayNightImageUrlImageUrl = DayNightImageUrl2.imageUrl(contractDisplayDetails3);
                String contractTitleName = contractDisplayDetails3.getContractTitleName();
                String combosBottomSheetPositionContractSecondaryText2 = contractDisplayDetails3.getCombosBottomSheetPositionContractSecondaryText();
                arrayList.add(new PositionContractDetailRowState(str, dayNightImageUrlImageUrl, contractTitleName, combosBottomSheetPositionContractSecondaryText2 != null ? StringResource.INSTANCE.invoke(combosBottomSheetPositionContractSecondaryText2) : null));
            }
            immutableList3PersistentListOf = extensions2.toPersistentList(arrayList);
        } else {
            immutableList3PersistentListOf = extensions2.persistentListOf(new PositionContractDetailRowState(Uuids.safeToString(uuid), DayNightImageUrl2.imageUrl(contractDisplayDetails2), contractDisplayDetails2 != null ? contractDisplayDetails2.getContractTitleName() : null, (contractDisplayDetails2 == null || (combosBottomSheetPositionContractSecondaryText = contractDisplayDetails2.getCombosBottomSheetPositionContractSecondaryText()) == null) ? null : StringResource.INSTANCE.invoke(combosBottomSheetPositionContractSecondaryText)));
        }
        ImmutableList3 immutableList3 = immutableList3PersistentListOf;
        StringResource positionQuantityWithPrice = uiEventContractPosition != null ? CommonFormats.formatPositionQuantityWithPrice(uiEventContractPosition) : null;
        if (!z) {
            stringResource = positionQuantityWithPrice;
        } else if (contractDisplayDetails2 == null) {
            stringResource = null;
        } else {
            positionQuantityWithPrice = StringResource.INSTANCE.invoke(C16283R.string.combo_bottom_sheet_positions_title, contractDisplayDetails2.getContractTitleName(), positionQuantityWithPrice);
            stringResource = positionQuantityWithPrice;
        }
        return new GameDetailComboBottomSheetContentViewState.Position(uuid, stringResource, bigDecimalComputeEventOpenPnl != null ? Formats.getCurrencyDeltaFormat().format(bigDecimalComputeEventOpenPnl) : null, deltaDirection2, immutableList3);
    }

    private static final GameDetailComboBottomSheetContentViewState.TradeSlip buildTradeSlipContentState(GameDetailSelectionState.ContractSideSelections contractSideSelections, Map<ContractIdWithSide, ContractDisplayDetails> map, Map<UUID, EventQuote> map2, Map<ContractIdWithSide, StrikeContract> map3) {
        StringResource stringResourceInvoke;
        int size = contractSideSelections.getSelections().size();
        boolean z = size <= 1;
        if (size <= 1) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C16283R.string.combo_bottom_sheet_title_single_pick, new Object[0]);
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C16283R.string.combo_bottom_sheet_title_multi_leg, Integer.valueOf(size));
        }
        List<ContractSelection> selections = contractSideSelections.getSelections();
        ArrayList arrayList = new ArrayList();
        for (Object obj : selections) {
            ContractSelection contractSelection = (ContractSelection) obj;
            if (contractSideSelections.getOpenStrikePickerKey() == null || Intrinsics.areEqual(contractSideSelections.getOpenStrikePickerKey(), contractSelection.getKey())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ComboPickerContractRowState comboPickerContractRowStateBuildComboPickerContractRow = buildComboPickerContractRow((ContractSelection) it.next(), map, map2, map3, z);
            if (comboPickerContractRowStateBuildComboPickerContractRow != null) {
                arrayList2.add(comboPickerContractRowStateBuildComboPickerContractRow);
            }
        }
        return new GameDetailComboBottomSheetContentViewState.TradeSlip(stringResourceInvoke, extensions2.toPersistentList(arrayList2), buildPickerState(contractSideSelections, map3));
    }

    private static final ComboPickerContractRowState buildComboPickerContractRow(ContractSelection contractSelection, Map<ContractIdWithSide, ContractDisplayDetails> map, Map<UUID, EventQuote> map2, Map<ContractIdWithSide, StrikeContract> map3, boolean z) {
        ContractIdWithSide currentContractIdWithSide = contractSelection.getCurrentContractIdWithSide();
        ContractDisplayDetails contractDisplayDetails = map.get(currentContractIdWithSide);
        EventQuote eventQuote = map2.get(currentContractIdWithSide.getContractId());
        int i = WhenMappings.$EnumSwitchMapping$0[contractSelection.getContractColumnType().ordinal()];
        if (i == 1) {
            return buildSpreadsAndTotalsRow(contractSelection, contractDisplayDetails, eventQuote, map3, z);
        }
        if (i == 2) {
            return buildPropsRow(contractSelection, contractDisplayDetails, eventQuote, z);
        }
        if (i == 3) {
            return buildPrepacksRow(contractSelection, contractDisplayDetails);
        }
        if (i == 4) {
            return buildMoneylineRow(contractSelection, contractDisplayDetails, eventQuote, z);
        }
        if (i == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final ComboPickerContractRowState buildSpreadsAndTotalsRow(ContractSelection contractSelection, ContractDisplayDetails contractDisplayDetails, EventQuote eventQuote, Map<ContractIdWithSide, StrikeContract> map, boolean z) {
        ContractElement contractElement;
        List<ContractElement> contracts2;
        Object next;
        ContractIdWithSide currentContractIdWithSide = contractSelection.getCurrentContractIdWithSide();
        StrikeContract strikeContract = map.get(contractSelection.getKey());
        if (strikeContract == null || (contracts2 = strikeContract.getContracts()) == null) {
            contractElement = null;
        } else {
            Iterator<T> it = contracts2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(ContractElementExt.toContractIdWithSide((ContractElement) next), contractSelection.getCurrentContractIdWithSide())) {
                    break;
                }
            }
            contractElement = (ContractElement) next;
        }
        String contractDisplayText = contractElement != null ? contractElement.getContractDisplayText() : null;
        ContractIdWithSide key = contractSelection.getKey();
        DayNightImageUrl dayNightImageUrlImageUrl = DayNightImageUrl2.imageUrl(contractDisplayDetails);
        String contractPrefix = contractDisplayDetails != null ? contractDisplayDetails.getContractPrefix() : null;
        UUID contractId = currentContractIdWithSide.getContractId();
        if (contractDisplayText == null) {
            contractDisplayText = "-";
        }
        return new ComboPickerContractRowState(key, currentContractIdWithSide, dayNightImageUrlImageUrl, contractPrefix, null, new ComboPickerContractRow3.StrikePriceButtonState(contractId, contractDisplayText), z ? StringResource.INSTANCE.invoke(buildBottomSheetQuotePriceInPercentage(currentContractIdWithSide.getSide(), eventQuote)) : null);
    }

    private static final ComboPickerContractRowState buildPropsRow(ContractSelection contractSelection, ContractDisplayDetails contractDisplayDetails, EventQuote eventQuote, boolean z) {
        ContractIdWithSide currentContractIdWithSide = contractSelection.getCurrentContractIdWithSide();
        ContractSide contractSide = ContractSide.CONTRACT_SIDE_YES;
        ContractSide contractSide2 = ContractSide.CONTRACT_SIDE_NO;
        ContractIdWithSide key = contractSelection.getKey();
        DayNightImageUrl dayNightImageUrlImageUrl = DayNightImageUrl2.imageUrl(contractDisplayDetails);
        String contractPrefix = contractDisplayDetails != null ? contractDisplayDetails.getContractPrefix() : null;
        UUID contractId = currentContractIdWithSide.getContractId();
        StringResource.Companion companion = StringResource.INSTANCE;
        ComboPickerContractRow3.ToggleButtonState toggleButtonState = new ComboPickerContractRow3.ToggleButtonState(contractId, new ComboPickerContractRow3.ToggleButtonState.ToggleOption(companion.invoke(C16283R.string.trade_yes_label, new Object[0]), currentContractIdWithSide.getSide() == contractSide, contractSide), new ComboPickerContractRow3.ToggleButtonState.ToggleOption(companion.invoke(C16283R.string.trade_no_label, new Object[0]), currentContractIdWithSide.getSide() == contractSide2, contractSide2));
        StringResource stringResourceInvoke = z ? companion.invoke(buildBottomSheetQuotePriceInPercentage(currentContractIdWithSide.getSide(), eventQuote)) : null;
        String propName = contractDisplayDetails != null ? contractDisplayDetails.getPropName() : null;
        return new ComboPickerContractRowState(key, currentContractIdWithSide, dayNightImageUrlImageUrl, contractPrefix, propName == null || StringsKt.isBlank(propName) ? null : propName, toggleButtonState, stringResourceInvoke);
    }

    private static final ComboPickerContractRowState buildPrepacksRow(ContractSelection contractSelection, ContractDisplayDetails contractDisplayDetails) {
        ContractIdWithSide currentContractIdWithSide = contractSelection.getCurrentContractIdWithSide();
        ContractSide contractSide = ContractSide.CONTRACT_SIDE_YES;
        ContractSide contractSide2 = ContractSide.CONTRACT_SIDE_NO;
        ContractIdWithSide key = contractSelection.getKey();
        DayNightImageUrl dayNightImageUrlImageUrl = DayNightImageUrl2.imageUrl(contractDisplayDetails);
        String contractPrefix = contractDisplayDetails != null ? contractDisplayDetails.getContractPrefix() : null;
        UUID contractId = currentContractIdWithSide.getContractId();
        StringResource.Companion companion = StringResource.INSTANCE;
        return new ComboPickerContractRowState(key, currentContractIdWithSide, dayNightImageUrlImageUrl, contractPrefix, null, new ComboPickerContractRow3.ToggleButtonState(contractId, new ComboPickerContractRow3.ToggleButtonState.ToggleOption(companion.invoke(C16283R.string.trade_yes_label, new Object[0]), currentContractIdWithSide.getSide() == contractSide, contractSide), new ComboPickerContractRow3.ToggleButtonState.ToggleOption(companion.invoke(C16283R.string.trade_no_label, new Object[0]), currentContractIdWithSide.getSide() == contractSide2, contractSide2)), null);
    }

    private static final ComboPickerContractRowState buildMoneylineRow(ContractSelection contractSelection, ContractDisplayDetails contractDisplayDetails, EventQuote eventQuote, boolean z) {
        ContractIdWithSide currentContractIdWithSide = contractSelection.getCurrentContractIdWithSide();
        ContractSide contractSide = ContractSide.CONTRACT_SIDE_YES;
        ContractSide contractSide2 = ContractSide.CONTRACT_SIDE_NO;
        ContractIdWithSide key = contractSelection.getKey();
        DayNightImageUrl dayNightImageUrlImageUrl = DayNightImageUrl2.imageUrl(contractDisplayDetails);
        String contractTitleName = contractDisplayDetails != null ? contractDisplayDetails.getContractTitleName() : null;
        UUID contractId = currentContractIdWithSide.getContractId();
        StringResource.Companion companion = StringResource.INSTANCE;
        return new ComboPickerContractRowState(key, currentContractIdWithSide, dayNightImageUrlImageUrl, contractTitleName, null, new ComboPickerContractRow3.ToggleButtonState(contractId, new ComboPickerContractRow3.ToggleButtonState.ToggleOption(companion.invoke(C16283R.string.trade_yes_label, new Object[0]), currentContractIdWithSide.getSide() == contractSide, contractSide), new ComboPickerContractRow3.ToggleButtonState.ToggleOption(companion.invoke(C16283R.string.trade_no_label, new Object[0]), currentContractIdWithSide.getSide() == contractSide2, contractSide2)), z ? companion.invoke(buildBottomSheetQuotePriceInPercentage(currentContractIdWithSide.getSide(), eventQuote)) : null);
    }

    private static final StrikePickerState buildPickerState(GameDetailSelectionState.ContractSideSelections contractSideSelections, Map<ContractIdWithSide, StrikeContract> map) {
        Object next;
        ContractIdWithSide openStrikePickerKey = contractSideSelections.getOpenStrikePickerKey();
        if (openStrikePickerKey == null) {
            return null;
        }
        StrikeContract strikeContract = map.get(openStrikePickerKey);
        int defaultIndex = 0;
        if (strikeContract != null) {
            Iterator<T> it = contractSideSelections.getSelections().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((ContractSelection) next).getKey(), openStrikePickerKey)) {
                    break;
                }
            }
            ContractSelection contractSelection = (ContractSelection) next;
            ContractIdWithSide currentContractIdWithSide = contractSelection != null ? contractSelection.getCurrentContractIdWithSide() : null;
            List<ContractElement> contracts2 = strikeContract.getContracts();
            Iterator<ContractElement> it2 = contracts2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    defaultIndex = -1;
                    break;
                }
                if (Intrinsics.areEqual(ContractElementExt.toContractIdWithSide(it2.next()), currentContractIdWithSide)) {
                    break;
                }
                defaultIndex++;
            }
            if (defaultIndex < 0) {
                defaultIndex = strikeContract.getDefaultIndex();
            }
            return new StrikePickerState(openStrikePickerKey, extensions2.toPersistentList(contracts2), defaultIndex);
        }
        return new StrikePickerState(openStrikePickerKey, extensions2.persistentListOf(), 0);
    }

    public static final String buildBottomSheetQuotePriceInPercentage(ContractSide contractSide, EventQuote eventQuote) {
        Intrinsics.checkNotNullParameter(contractSide, "contractSide");
        return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getWholeNumberPercentFormat(), eventQuote != null ? eventQuote.getAskPriceWithContractSide(contractSide) : null, null, 2, null);
    }
}
