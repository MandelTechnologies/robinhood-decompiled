package com.robinhood.android.event.gamedetail.builders;

import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.event.gamedetail.builders.sixbox.BuildAmericanOdds;
import com.robinhood.android.event.gamedetail.combostates.ContractSelection;
import com.robinhood.android.event.gamedetail.components.ContractOptionData;
import com.robinhood.android.event.gamedetail.components.PrepackOptionState;
import com.robinhood.android.event.gamedetail.components.PrepacksState;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BuildPrepacksState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ab\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\u00062\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003H\u0000\u001a>\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\u0006H\u0002¨\u0006\u0017"}, m3636d2 = {"buildPrepacksState", "Lcom/robinhood/android/event/gamedetail/components/PrepacksState;", "prepacks", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroup;", "contractIdToQuotes", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "selectedContractOptionData", "Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;", "showAmericanOdds", "", "contractIdToEstimatedFees", "Ljava/math/BigDecimal;", "comboSelection", "Lcom/robinhood/android/event/gamedetail/combostates/ContractSelection;", "getDisplayQuote", "", "eventQuote", "contractSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "contractId", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.builders.BuildPrepacksStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildPrepacksState {
    public static /* synthetic */ PrepacksState buildPrepacksState$default(List list, Map map, ContractOptionData contractOptionData, boolean z, Map map2, List list2, int i, Object obj) {
        if ((i & 32) != 0) {
            list2 = null;
        }
        return buildPrepacksState(list, map, contractOptionData, z, map2, list2);
    }

    public static final PrepacksState buildPrepacksState(List<ContractGroup> prepacks, Map<UUID, EventQuote> contractIdToQuotes, ContractOptionData contractOptionData, boolean z, Map<UUID, ? extends BigDecimal> contractIdToEstimatedFees, List<ContractSelection> list) {
        ContractIdWithSide strikeContract;
        Intrinsics.checkNotNullParameter(prepacks, "prepacks");
        Intrinsics.checkNotNullParameter(contractIdToQuotes, "contractIdToQuotes");
        Intrinsics.checkNotNullParameter(contractIdToEstimatedFees, "contractIdToEstimatedFees");
        if (list != null && list.size() == 1) {
            strikeContract = ((ContractSelection) CollectionsKt.single((List) list)).getKey();
        } else {
            strikeContract = contractOptionData != null ? contractOptionData.getStrikeContract() : null;
        }
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C16283R.string.combos_header_label, new Object[0]);
        ArrayList<ContractElement> arrayList = new ArrayList();
        Iterator<T> it = prepacks.iterator();
        while (it.hasNext()) {
            List<ContractColumn> contractColumns = ((ContractGroup) it.next()).getContractColumns();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = contractColumns.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList2, ((ContractColumn) it2.next()).getContractElements());
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (ContractElement contractElement : arrayList) {
            arrayList3.add(new PrepackOptionState(contractElement, ContractGroup3.CONTRACT_COLUMN_TYPE_PREPACK, Intrinsics.areEqual(ContractElementExt.toContractIdWithSide(contractElement), strikeContract), getDisplayQuote(contractIdToQuotes.get(contractElement.getContractId()), contractElement.getContractSide(), z, contractElement.getContractId(), contractIdToEstimatedFees)));
        }
        return new PrepacksState(stringResourceInvoke, arrayList3);
    }

    private static final String getDisplayQuote(EventQuote eventQuote, ContractSide contractSide, boolean z, UUID uuid, Map<UUID, ? extends BigDecimal> map) {
        String ecPrice;
        BigDecimal askPriceWithContractSide = eventQuote != null ? eventQuote.getAskPriceWithContractSide(contractSide) : null;
        if (z) {
            return BuildAmericanOdds.getContractOptionDisplayTextWithAmericanOdds(askPriceWithContractSide, map.get(uuid));
        }
        return (askPriceWithContractSide == null || (ecPrice = PriceUtils.formatEcPrice(askPriceWithContractSide, true)) == null) ? "-" : ecPrice;
    }
}
