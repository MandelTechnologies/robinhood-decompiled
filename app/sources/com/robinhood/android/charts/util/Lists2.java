package com.robinhood.android.charts.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: Lists.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"downSample", "", "T", "threshold", "", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.util.ListsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Lists2 {
    public static /* synthetic */ List downSample$default(List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 100;
        }
        return downSample(list, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> downSample(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() <= i) {
            return list;
        }
        float size = list.size() / i;
        PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, i);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
        Iterator<Integer> it = primitiveRanges2Until.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get((int) (((PrimitiveIterators6) it).nextInt() * size)));
        }
        return arrayList;
    }
}
