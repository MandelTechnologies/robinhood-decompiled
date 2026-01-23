package com.robinhood.android.investFlow.utils;

import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentAsset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AssetAllocationUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, m3636d2 = {"mapToApiAssetAllocations", "", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "", "Lcom/robinhood/models/db/Instrument;", "Lcom/robinhood/models/util/Money;", "isCrypto", "", "feature-invest-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investFlow.utils.AssetAllocationUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AssetAllocationUtils {
    public static final List<ApiAssetAllocation> mapToApiAssetAllocations(Map<Instrument, Money> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Instrument, Money> entry : map.entrySet()) {
            Instrument key = entry.getKey();
            arrayList.add(new ApiAssetAllocation(new ApiInvestmentAsset(key.getId(), key.getSymbol(), z ? ApiAssetType.CRYPTO : ApiAssetType.EQUITY), entry.getValue(), null));
        }
        return arrayList;
    }
}
