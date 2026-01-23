package com.robinhood.android.common.investflow.allocationprovider;

import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import io.reactivex.Single;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: InvestFlowZeroDefaultProvider.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/investflow/allocationprovider/InvestFlowZeroDefaultProvider;", "Lcom/robinhood/android/common/investflow/allocationprovider/InvestFlowAllocationProvider;", "<init>", "()V", "getSplit", "Lio/reactivex/Single;", "", "Lcom/robinhood/models/db/Instrument;", "Lcom/robinhood/models/util/Money;", "totalAmount", "instruments", "", "feature-lib-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InvestFlowZeroDefaultProvider implements InvestFlowAllocationProvider {
    @Override // com.robinhood.android.common.investflow.allocationprovider.InvestFlowAllocationProvider
    public Single<Map<Instrument, Money>> getSplit(Money totalAmount, List<Instrument> instruments) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        List<Instrument> list = instruments;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            linkedHashMap.put(obj, Money3.toMoney$default(ZERO, null, 1, null));
        }
        Single<Map<Instrument, Money>> singleJust = Single.just(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
        return singleJust;
    }
}
