package com.robinhood.shared.tradeladder.p398ui.ladder.extensions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Bins.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aD\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"bucketValues", "", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", WebsocketGatewayConstants.DATA_KEY, "", "interval", "sortAscending", "", "calculateBucket", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.extensions.BinsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Bins {
    public static /* synthetic */ List bucketValues$default(List list, Number number, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return bucketValues(list, number, z);
    }

    public static final List<Tuples2<BigDecimal, BigDecimal>> bucketValues(List<? extends Tuples2<? extends Number, ? extends BigDecimal>> data, Number interval, boolean z) {
        List listSortedWith;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(interval, "interval");
        if (BigDecimals7.toBigDecimal(interval).compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Tuples2<? extends Number, ? extends BigDecimal> tuples2 : data) {
            Number numberComponent1 = tuples2.component1();
            BigDecimal bigDecimalComponent2 = tuples2.component2();
            BigDecimal bigDecimalCalculateBucket = calculateBucket(numberComponent1, interval);
            BigDecimal bigDecimal = (BigDecimal) linkedHashMap.get(bigDecimalCalculateBucket);
            if (bigDecimal == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            Intrinsics.checkNotNull(bigDecimal);
            BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimalComponent2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            linkedHashMap.put(bigDecimalCalculateBucket, bigDecimalAdd);
        }
        if (z) {
            listSortedWith = CollectionsKt.sortedWith(linkedHashMap.entrySet(), new Comparator() { // from class: com.robinhood.shared.tradeladder.ui.ladder.extensions.BinsKt$bucketValues$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((BigDecimal) ((Map.Entry) t).getKey(), (BigDecimal) ((Map.Entry) t2).getKey());
                }
            });
        } else {
            listSortedWith = CollectionsKt.sortedWith(linkedHashMap.entrySet(), new Comparator() { // from class: com.robinhood.shared.tradeladder.ui.ladder.extensions.BinsKt$bucketValues$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((BigDecimal) ((Map.Entry) t2).getKey(), (BigDecimal) ((Map.Entry) t).getKey());
                }
            });
        }
        List<Map.Entry> list = listSortedWith;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Map.Entry entry : list) {
            arrayList.add(Tuples4.m3642to(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public static final BigDecimal calculateBucket(Number price, Number interval) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(interval, "interval");
        BigDecimal bigDecimal = BigDecimals7.toBigDecimal(price);
        BigDecimal bigDecimal2 = BigDecimals7.toBigDecimal(interval);
        if (bigDecimal2.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        BigDecimal scale = bigDecimal.divide(bigDecimal2, 0, RoundingMode.FLOOR).multiply(bigDecimal2).setScale(2, RoundingMode.UNNECESSARY);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }
}
