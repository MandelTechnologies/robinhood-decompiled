package com.robinhood.android.advisory.portfolio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: Normalization.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"MinSizeForTapInteraction", "", "normalizeValuesForUiAccessibility", "Lkotlinx/collections/immutable/ImmutableList;", "values", "lib-advisory_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.NormalizationKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Normalization {
    private static final float MinSizeForTapInteraction = 0.02f;

    public static final ImmutableList<Float> normalizeValuesForUiAccessibility(ImmutableList<Float> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        float fSumOfFloat = 1.0f - CollectionsKt.sumOfFloat(values);
        ArrayList arrayList = new ArrayList();
        for (Float f : values) {
            if (f.floatValue() < MinSizeForTapInteraction) {
                arrayList.add(f);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Float.valueOf(MinSizeForTapInteraction - ((Number) it.next()).floatValue()));
        }
        float fSumOfFloat2 = CollectionsKt.sumOfFloat(arrayList2);
        List listSortedDescending = CollectionsKt.sortedDescending(values);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedDescending, 10));
        int i = 0;
        for (Object obj : listSortedDescending) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((Number) obj).floatValue();
            if (i == 0) {
                fFloatValue = (fFloatValue - fSumOfFloat2) + fSumOfFloat;
            } else if (fFloatValue < MinSizeForTapInteraction) {
                fFloatValue = 0.02f;
            }
            arrayList3.add(Float.valueOf(fFloatValue));
            i = i2;
        }
        return extensions2.toPersistentList(arrayList3);
    }
}
