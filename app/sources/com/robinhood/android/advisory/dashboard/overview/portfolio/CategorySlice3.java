package com.robinhood.android.advisory.dashboard.overview.portfolio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CategorySlice.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0010\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00070\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\n\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"summarize", "", "", "maximumSize", "", "MIN_CATEGORIES_FOR_DESCRIPTION", "defaultDescription", "Lcom/robinhood/android/advisory/dashboard/overview/portfolio/CategorySlice;", "toFloatForUi", "", "Ljava/math/BigDecimal;", "lib-advisory-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.portfolio.CategorySliceKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class CategorySlice3 {
    private static final int MIN_CATEGORIES_FOR_DESCRIPTION = 3;

    public static /* synthetic */ String summarize$default(List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = list.size();
        }
        return summarize(list, i);
    }

    public static final String summarize(List<String> list, int i) {
        String str;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List listTake = CollectionsKt.take(list, 2);
        int size = i - listTake.size();
        if (size > 0) {
            str = " +" + size;
        } else {
            str = "";
        }
        return CollectionsKt.joinToString$default(listTake, null, null, null, 0, null, null, 63, null) + str;
    }

    public static final String defaultDescription(List<CategorySlice> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<CategorySlice> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((CategorySlice) it.next()).getDetails().getShortName());
        }
        List listTake = CollectionsKt.take(arrayList, 3);
        int size = list.size() - listTake.size();
        String strJoinToString$default = CollectionsKt.joinToString$default(listTake, null, null, null, 0, null, null, 63, null);
        if (size <= 0) {
            return strJoinToString$default;
        }
        return strJoinToString$default + " +" + size;
    }

    public static final float toFloatForUi(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.setScale(6, RoundingMode.HALF_DOWN).floatValue();
    }
}
