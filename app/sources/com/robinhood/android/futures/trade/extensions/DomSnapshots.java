package com.robinhood.android.futures.trade.extensions;

import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.websocket.p410dx.models.BigDecimalWithNaN;
import com.robinhood.websocket.p410dx.models.DxResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DomSnapshots.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004\u001a$\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\b"}, m3636d2 = {"getOrderedBids", "", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "", "Lcom/robinhood/websocket/dx/models/DxResponse$DomSnapshot;", "numResults", "getOrderedAsks", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.extensions.DomSnapshotsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class DomSnapshots {
    public static final List<Tuples2<BigDecimal, Integer>> getOrderedBids(DxResponse.DomSnapshot domSnapshot, int i) {
        Tuples2 tuples2M3642to;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Intrinsics.checkNotNullParameter(domSnapshot, "<this>");
        List<DxResponse.DomSnapshot.PriceAndSize> bids = domSnapshot.getBids();
        ArrayList arrayList = new ArrayList();
        for (DxResponse.DomSnapshot.PriceAndSize priceAndSize : bids) {
            BigDecimalWithNaN price = priceAndSize.getPrice();
            if (price == null || (bigDecimal = price.getBigDecimal()) == null) {
                tuples2M3642to = null;
            } else {
                BigDecimalWithNaN size = priceAndSize.getSize();
                tuples2M3642to = Tuples4.m3642to(bigDecimal, Integer.valueOf((size == null || (bigDecimal2 = size.getBigDecimal()) == null) ? 0 : BigDecimals7.toIntRoundDown(bigDecimal2)));
            }
            if (tuples2M3642to != null) {
                arrayList.add(tuples2M3642to);
            }
        }
        return CollectionsKt.take(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.futures.trade.extensions.DomSnapshotsKt$getOrderedBids$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((BigDecimal) ((Tuples2) t2).getFirst(), (BigDecimal) ((Tuples2) t).getFirst());
            }
        }), i);
    }

    public static final List<Tuples2<BigDecimal, Integer>> getOrderedAsks(DxResponse.DomSnapshot domSnapshot, int i) {
        Tuples2 tuples2M3642to;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Intrinsics.checkNotNullParameter(domSnapshot, "<this>");
        List<DxResponse.DomSnapshot.PriceAndSize> asks = domSnapshot.getAsks();
        ArrayList arrayList = new ArrayList();
        for (DxResponse.DomSnapshot.PriceAndSize priceAndSize : asks) {
            BigDecimalWithNaN price = priceAndSize.getPrice();
            if (price == null || (bigDecimal = price.getBigDecimal()) == null) {
                tuples2M3642to = null;
            } else {
                BigDecimalWithNaN size = priceAndSize.getSize();
                tuples2M3642to = Tuples4.m3642to(bigDecimal, Integer.valueOf((size == null || (bigDecimal2 = size.getBigDecimal()) == null) ? 0 : BigDecimals7.toIntRoundDown(bigDecimal2)));
            }
            if (tuples2M3642to != null) {
                arrayList.add(tuples2M3642to);
            }
        }
        return CollectionsKt.take(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.futures.trade.extensions.DomSnapshotsKt$getOrderedAsks$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((BigDecimal) ((Tuples2) t).getFirst(), (BigDecimal) ((Tuples2) t2).getFirst());
            }
        }), i);
    }
}
