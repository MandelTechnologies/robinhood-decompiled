package com.robinhood.android.optionschain.sbschain.table.util;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: IndexRangeUtil.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¨\u0006\u0005"}, m3636d2 = {"getIndexRange", "Lkotlin/ranges/IntRange;", "indexList", "", "", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.table.util.IndexRangeUtilKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class IndexRangeUtil {
    public static final PrimitiveRanges2 getIndexRange(List<Integer> indexList) {
        Intrinsics.checkNotNullParameter(indexList, "indexList");
        if (indexList.size() <= 1) {
            return null;
        }
        int iIntValue = indexList.get(0).intValue();
        int iIntValue2 = indexList.get(0).intValue();
        Iterator<Integer> it = indexList.iterator();
        while (it.hasNext()) {
            int iIntValue3 = it.next().intValue();
            if (iIntValue3 < iIntValue) {
                iIntValue = iIntValue3;
            }
            if (iIntValue3 > iIntValue2) {
                iIntValue2 = iIntValue3;
            }
        }
        return new PrimitiveRanges2(iIntValue, iIntValue2);
    }
}
