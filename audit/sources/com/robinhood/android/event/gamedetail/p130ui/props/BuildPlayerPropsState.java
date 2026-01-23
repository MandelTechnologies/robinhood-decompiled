package com.robinhood.android.event.gamedetail.p130ui.props;

import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.event.gamedetail.builders.ContractElementExt;
import com.robinhood.android.event.gamedetail.builders.sixbox.BuildAmericanOdds;
import com.robinhood.android.event.gamedetail.combostates.ContractSelection;
import com.robinhood.android.event.gamedetail.components.ContractOptionData;
import com.robinhood.android.event.gamedetail.components.ContractRowState;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.sharedeventui.PriceUtils;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractColumn;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroupSectionWithContractGroup;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BuildPlayerPropsState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a~\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\n2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0003H\u0000\u001aB\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\nH\u0002\u001a\u001e\u0010\u0018\u001a\u00020\u00192\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¨\u0006\u001c"}, m3636d2 = {"buildPlayerPropsState", "Lcom/robinhood/android/event/gamedetail/ui/props/PlayerPropsState;", "props", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroupSectionWithContractGroup;", "selectedIndex", "", "selectedContractOptionData", "Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;", "contractIdToQuote", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "expansionState", "", "showAmericanOdds", "contractIdToEstimatedFees", "Ljava/math/BigDecimal;", "comboSelection", "Lcom/robinhood/android/event/gamedetail/combostates/ContractSelection;", "getPropsSubText", "", "contractElement", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "buildPropsSelectionBarState", "Lcom/robinhood/android/event/gamedetail/ui/props/PropsSelectionBarState;", "buildEmptyContractRowsState", "propsSelectionBarState", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.ui.props.BuildPlayerPropsStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildPlayerPropsState {
    public static /* synthetic */ PlayerPropsState buildPlayerPropsState$default(List list, int i, ContractOptionData contractOptionData, Map map, Map map2, boolean z, Map map3, List list2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            map2 = MapsKt.emptyMap();
        }
        return buildPlayerPropsState(list, i, contractOptionData, map, map2, z, map3, list2);
    }

    public static final PlayerPropsState buildPlayerPropsState(List<ContractGroupSectionWithContractGroup> props, int i, ContractOptionData contractOptionData, Map<UUID, EventQuote> map, Map<Integer, Boolean> expansionState, boolean z, Map<UUID, ? extends BigDecimal> contractIdToEstimatedFees, List<ContractSelection> list) {
        boolean z2;
        ContractGroupSectionWithContractGroup contractGroupSectionWithContractGroup;
        boolean z3;
        String str;
        ContractRowState.ContractOptionState contractOptionState;
        boolean z4;
        ContractIdWithSide strikeContract;
        Map<UUID, EventQuote> contractIdToQuote = map;
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(contractIdToQuote, "contractIdToQuote");
        Intrinsics.checkNotNullParameter(expansionState, "expansionState");
        Intrinsics.checkNotNullParameter(contractIdToEstimatedFees, "contractIdToEstimatedFees");
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C16283R.string.player_props_header_label, new Object[0]);
        PropsSelectionBarState propsSelectionBarStateBuildPropsSelectionBarState = buildPropsSelectionBarState(props, i);
        ContractGroupSectionWithContractGroup contractGroupSectionWithContractGroup2 = props.get(i);
        ContractGroup contractGroup = contractGroupSectionWithContractGroup2.getContractGroup();
        if (contractGroup == null) {
            return buildEmptyContractRowsState(propsSelectionBarStateBuildPropsSelectionBarState);
        }
        Boolean bool = expansionState.get(Integer.valueOf(i));
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        UUID contractId = (contractOptionData == null || (strikeContract = contractOptionData.getStrikeContract()) == null) ? null : strikeContract.getContractId();
        List<String> rowNames = contractGroup.getRowNames();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : rowNames) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            List<ContractColumn> contractColumns = contractGroup.getContractColumns();
            ArrayList arrayList2 = new ArrayList();
            for (ContractColumn contractColumn : contractColumns) {
                ContractElement contractElement = (ContractElement) CollectionsKt.getOrNull(contractColumn.getContractElements(), i2);
                if (contractElement == null) {
                    z2 = zBooleanValue;
                    contractGroupSectionWithContractGroup = contractGroupSectionWithContractGroup2;
                    contractOptionState = null;
                } else {
                    z2 = zBooleanValue;
                    UUID contractId2 = contractElement.getContractId();
                    if (list != null) {
                        List<ContractSelection> list2 = list;
                        contractGroupSectionWithContractGroup = contractGroupSectionWithContractGroup2;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            z4 = false;
                            z3 = z4;
                        } else {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                Iterator it2 = it;
                                if (Intrinsics.areEqual(ContractElementExt.toContractIdWithSide(contractElement), ((ContractSelection) it.next()).getKey())) {
                                    z4 = true;
                                    break;
                                }
                                it = it2;
                            }
                            z4 = false;
                            z3 = z4;
                        }
                    } else {
                        contractGroupSectionWithContractGroup = contractGroupSectionWithContractGroup2;
                        z3 = Intrinsics.areEqual(contractId2, contractId) && contractElement.getContractSide() == contractOptionData.getStrikeContract().getSide();
                    }
                    String contractDisplayText = contractElement.getContractDisplayText();
                    if (contractDisplayText == null) {
                        contractDisplayText = "—";
                    }
                    if (contractElement.getDisableContractElement() && contractElement.getContractDisplayText() == null) {
                        str = null;
                    } else {
                        String propsSubText = getPropsSubText(z, contractIdToQuote, contractElement, contractIdToEstimatedFees);
                        str = propsSubText == null ? "—" : propsSubText;
                    }
                    contractOptionState = new ContractRowState.ContractOptionState(contractElement, StringResource.INSTANCE.invoke(contractDisplayText), str, z3, !contractElement.getDisableContractElement(), contractColumn.getContractColumnType());
                }
                if (contractOptionState != null) {
                    arrayList2.add(contractOptionState);
                }
                contractIdToQuote = map;
                zBooleanValue = z2;
                contractGroupSectionWithContractGroup2 = contractGroupSectionWithContractGroup;
            }
            arrayList.add(new ContractRowState(str2, extensions2.toPersistentList(arrayList2)));
            contractIdToQuote = map;
            zBooleanValue = zBooleanValue;
            i2 = i3;
            contractGroupSectionWithContractGroup2 = contractGroupSectionWithContractGroup2;
        }
        boolean z5 = zBooleanValue;
        ContractGroupSectionWithContractGroup contractGroupSectionWithContractGroup3 = contractGroupSectionWithContractGroup2;
        List persistentList = extensions2.toPersistentList(arrayList);
        int size = persistentList.size();
        if (!z5 && size > 5) {
            persistentList = CollectionsKt.take(persistentList, 5);
        }
        extensions2.toPersistentList(contractGroupSectionWithContractGroup3.getContractGroupSection().getFilterSet());
        return new PlayerPropsState(new PropsTitleState(stringResourceInvoke), propsSelectionBarStateBuildPropsSelectionBarState, extensions2.toPersistentList(persistentList), z5, size, persistentList.size());
    }

    private static final String getPropsSubText(boolean z, Map<UUID, EventQuote> map, ContractElement contractElement, Map<UUID, ? extends BigDecimal> map2) {
        BigDecimal yesAskPrice;
        UUID contractId = contractElement.getContractId();
        if (z) {
            return BuildAmericanOdds.getAmericanOddsDisplayText(map, contractId, contractElement.getContractSide(), true, map2.get(contractId));
        }
        EventQuote eventQuote = map.get(contractId);
        if (eventQuote == null || (yesAskPrice = eventQuote.getYesAskPrice()) == null) {
            return null;
        }
        return PriceUtils.formatEcPrice(yesAskPrice, true);
    }

    private static final PropsSelectionBarState buildPropsSelectionBarState(List<ContractGroupSectionWithContractGroup> list, int i) {
        List<ContractGroupSectionWithContractGroup> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new PropsOption(((ContractGroupSectionWithContractGroup) obj).getContractGroupSection().getTitle(), i == i2));
            i2 = i3;
        }
        return new PropsSelectionBarState(extensions2.toPersistentList(arrayList));
    }

    private static final PlayerPropsState buildEmptyContractRowsState(PropsSelectionBarState propsSelectionBarState) {
        return new PlayerPropsState(new PropsTitleState(StringResource.INSTANCE.invoke(C16283R.string.player_props_header_label, new Object[0])), propsSelectionBarState, extensions2.persistentListOf(), false, 0, 0);
    }
}
