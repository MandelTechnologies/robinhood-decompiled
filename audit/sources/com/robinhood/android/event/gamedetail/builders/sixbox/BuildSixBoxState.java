package com.robinhood.android.event.gamedetail.builders.sixbox;

import com.robinhood.android.event.gamedetail.GameDetailViewState;
import com.robinhood.android.event.gamedetail.builders.ContractElementExt;
import com.robinhood.android.event.gamedetail.combostates.ContractSelection;
import com.robinhood.android.event.gamedetail.components.ContractOptionData;
import com.robinhood.android.event.gamedetail.components.ContractRowHeaderState;
import com.robinhood.android.event.gamedetail.components.ContractRowState;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.eventcontracts.sharedeventui.PriceUtils;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractColumn;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
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

/* compiled from: BuildSixBoxState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a^\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u0005H\u0000\u001a\b\u0010\u0011\u001a\u00020\u0012H\u0002\u001a.\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¨\u0006\u0018"}, m3636d2 = {"buildSixBoxState", "Lcom/robinhood/android/event/gamedetail/GameDetailViewState$SixBoxState;", "contractGroup", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroup;", "contractIdToQuote", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "selectedContractOptionData", "Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;", "comboSelection", "", "Lcom/robinhood/android/event/gamedetail/combostates/ContractSelection;", "showAmericanOdds", "", "contractIdToEstimatedFees", "Ljava/math/BigDecimal;", "emptySixBoxContractOptionState", "Lcom/robinhood/android/event/gamedetail/components/ContractRowState$ContractOptionState;", "getContractOptionDisplayText", "Lcom/robinhood/utils/resource/StringResource;", "contractDisplayText", "", "contractId", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.builders.sixbox.BuildSixBoxStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildSixBoxState {

    /* compiled from: BuildSixBoxState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.gamedetail.builders.sixbox.BuildSixBoxStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContractGroup3.values().length];
            try {
                iArr[ContractGroup3.CONTRACT_COLUMN_TYPE_BINARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContractGroup3.CONTRACT_COLUMN_TYPE_ALTERNATE_STRIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ GameDetailViewState.SixBoxState buildSixBoxState$default(ContractGroup contractGroup, Map map, ContractOptionData contractOptionData, List list, boolean z, Map map2, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            map2 = MapsKt.emptyMap();
        }
        return buildSixBoxState(contractGroup, map, contractOptionData, list, z2, map2);
    }

    public static final GameDetailViewState.SixBoxState buildSixBoxState(ContractGroup contractGroup, Map<UUID, EventQuote> map, ContractOptionData contractOptionData, List<ContractSelection> list, boolean z, Map<UUID, ? extends BigDecimal> map2) {
        boolean z2;
        ContractRowState.ContractOptionState contractOptionState;
        StringResource stringResourceInvoke;
        boolean z3;
        ContractIdWithSide strikeContract;
        Map<UUID, EventQuote> contractIdToQuote = map;
        Map<UUID, ? extends BigDecimal> contractIdToEstimatedFees = map2;
        ContractGroup contractGroup2 = contractGroup;
        Intrinsics.checkNotNullParameter(contractGroup2, "contractGroup");
        Intrinsics.checkNotNullParameter(contractIdToQuote, "contractIdToQuote");
        Intrinsics.checkNotNullParameter(contractIdToEstimatedFees, "contractIdToEstimatedFees");
        String title = contractGroup2.getTitle();
        List<ContractColumn> contractColumns = contractGroup2.getContractColumns();
        int i = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractColumns, 10));
        Iterator<T> it = contractColumns.iterator();
        while (it.hasNext()) {
            arrayList.add(((ContractColumn) it.next()).getName());
        }
        ContractRowHeaderState contractRowHeaderState = new ContractRowHeaderState(title, extensions2.toPersistentList(arrayList));
        UUID contractId = (contractOptionData == null || (strikeContract = contractOptionData.getStrikeContract()) == null) ? null : strikeContract.getContractId();
        List<String> rowNames = contractGroup2.getRowNames();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(rowNames, 10));
        int i2 = 0;
        for (Object obj : rowNames) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            List<ContractColumn> contractColumns2 = contractGroup2.getContractColumns();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractColumns2, i));
            for (ContractColumn contractColumn : contractColumns2) {
                ContractElement contractElement = (ContractElement) CollectionsKt.getOrNull(contractColumn.getContractElements(), i2);
                if (contractElement == null) {
                    contractOptionState = emptySixBoxContractOptionState();
                } else {
                    UUID contractId2 = contractElement.getContractId();
                    if (list != null) {
                        List<ContractSelection> list2 = list;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            z3 = false;
                            z2 = z3;
                        } else {
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (Intrinsics.areEqual(ContractElementExt.toContractIdWithSide(contractElement), ((ContractSelection) it2.next()).getKey())) {
                                    z3 = true;
                                    break;
                                }
                            }
                            z3 = false;
                            z2 = z3;
                        }
                    } else {
                        z2 = Intrinsics.areEqual(contractId2, contractId) && contractElement.getContractSide() == contractOptionData.getStrikeContract().getSide();
                    }
                    StringResource contractOptionDisplayText = getContractOptionDisplayText(contractIdToQuote, contractElement.getContractDisplayText(), contractId2);
                    String americanOddsDisplayText = BuildAmericanOdds.getAmericanOddsDisplayText(contractIdToQuote, contractId2, contractElement.getContractSide(), z, contractIdToEstimatedFees.get(contractId2));
                    ContractGroup3 contractColumnType = contractColumn.getContractColumnType();
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    contractOptionState = new ContractRowState.ContractOptionState(contractElement, (iArr[contractColumnType.ordinal()] != 1 || americanOddsDisplayText == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(americanOddsDisplayText)) == null) ? contractOptionDisplayText : stringResourceInvoke, iArr[contractColumn.getContractColumnType().ordinal()] == 2 ? americanOddsDisplayText : null, z2, true, contractColumn.getContractColumnType());
                }
                arrayList3.add(contractOptionState);
                contractIdToQuote = map;
                contractIdToEstimatedFees = map2;
            }
            arrayList2.add(new ContractRowState(str, extensions2.toPersistentList(arrayList3)));
            contractGroup2 = contractGroup;
            contractIdToQuote = map;
            contractIdToEstimatedFees = map2;
            i2 = i3;
            i = 10;
        }
        return new GameDetailViewState.SixBoxState(contractRowHeaderState, extensions2.toPersistentList(arrayList2));
    }

    private static final ContractRowState.ContractOptionState emptySixBoxContractOptionState() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return new ContractRowState.ContractOptionState(new ContractElement(uuidRandomUUID, null, ContractSide.CONTRACT_SIDE_UNSPECIFIED, true), StringResource.INSTANCE.invoke("—"), null, false, false, ContractGroup3.CONTRACT_COLUMN_TYPE_UNSPECIFIED);
    }

    private static final StringResource getContractOptionDisplayText(Map<UUID, EventQuote> map, String str, UUID uuid) {
        BigDecimal yesAskPrice;
        if (str == null) {
            EventQuote eventQuote = map.get(uuid);
            str = (eventQuote == null || (yesAskPrice = eventQuote.getYesAskPrice()) == null) ? null : PriceUtils.formatEcPrice(yesAskPrice, true);
            if (str == null) {
                str = "-";
            }
        }
        return StringResource.INSTANCE.invoke(str);
    }
}
