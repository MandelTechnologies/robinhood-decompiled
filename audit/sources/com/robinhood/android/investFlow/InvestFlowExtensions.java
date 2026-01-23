package com.robinhood.android.investFlow;

import com.robinhood.android.common.search.SearchItem;
import com.robinhood.android.investFlow.core.InvestFlowBasketItem;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.models.p320db.Instrument;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestFlowExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, m3636d2 = {"toInvestFlowLoggingString", "", "", "", "feature-invest-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investFlow.InvestFlowExtensionsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestFlowExtensions {
    public static final String toInvestFlowLoggingString(List<? extends Object> list) {
        String asset_symbol;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<? extends Object> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Object obj : list2) {
            if (obj instanceof InvestFlowBasketItem) {
                asset_symbol = ((InvestFlowBasketItem) obj).getSymbol();
            } else if (obj instanceof Instrument) {
                asset_symbol = ((Instrument) obj).getSymbol();
            } else if (obj instanceof SearchItem.InstrumentResult) {
                asset_symbol = ((SearchItem.InstrumentResult) obj).getInstrument().getSymbol();
            } else {
                asset_symbol = obj instanceof ApiAssetAllocation ? ((ApiAssetAllocation) obj).getAsset().getAsset_symbol() : "";
            }
            arrayList.add(asset_symbol);
        }
        return arrayList.toString();
    }
}
