package com.robinhood.android.common.investflow.allocationprovider;

import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.util.Money;
import com.robinhood.utils.math.BigDecimals7;
import io.reactivex.Single;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: InvestFlowEqualSplitAllocationProvider.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/investflow/allocationprovider/InvestFlowEqualSplitAllocationProvider;", "Lcom/robinhood/android/common/investflow/allocationprovider/InvestFlowAllocationProvider;", "<init>", "()V", "getSplit", "Lio/reactivex/Single;", "", "Lcom/robinhood/models/db/Instrument;", "Lcom/robinhood/models/util/Money;", "totalAmount", "instruments", "", "feature-lib-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InvestFlowEqualSplitAllocationProvider implements InvestFlowAllocationProvider {
    @Override // com.robinhood.android.common.investflow.allocationprovider.InvestFlowAllocationProvider
    public Single<Map<Instrument, Money>> getSplit(Money totalAmount, List<Instrument> instruments) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        if (totalAmount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        BigDecimal decimalValue = totalAmount.getDecimalValue();
        BigDecimal currencyScale = BigDecimals7.setCurrencyScale(decimalValue.divide(new BigDecimal(instruments.size()), 2, RoundingMode.HALF_DOWN));
        BigDecimal bigDecimalMultiply = currencyScale.multiply(new BigDecimal(instruments.size() - 1));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalSubtract = decimalValue.subtract(bigDecimalMultiply);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to(instruments.get(0), new Money(totalAmount.getCurrency(), bigDecimalSubtract)));
        List<Instrument> listSubList = instruments.subList(1, instruments.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listSubList, 10)), 16));
        for (Object obj : listSubList) {
            linkedHashMap.put(obj, new Money(totalAmount.getCurrency(), currencyScale));
        }
        Single<Map<Instrument, Money>> singleJust = Single.just(MapsKt.plus(mapMapOf, linkedHashMap));
        Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
        return singleJust;
    }
}
