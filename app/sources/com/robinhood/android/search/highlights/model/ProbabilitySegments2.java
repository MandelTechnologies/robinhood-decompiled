package com.robinhood.android.search.highlights.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ProbabilitySegments.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"MIN_SEGMENT_FRACTION", "", "applyMinFractionRule", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/search/highlights/model/ProbabilitySegment;", "rawProbabilitySegments", "", "minSegmentFraction", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.model.ProbabilitySegmentsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ProbabilitySegments2 {
    private static final float MIN_SEGMENT_FRACTION = 0.04f;

    public static /* synthetic */ ImmutableList applyMinFractionRule$default(List list, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = MIN_SEGMENT_FRACTION;
        }
        return applyMinFractionRule(list, f);
    }

    public static final ImmutableList<ProbabilitySegment> applyMinFractionRule(List<ProbabilitySegment> rawProbabilitySegments, float f) {
        Intrinsics.checkNotNullParameter(rawProbabilitySegments, "rawProbabilitySegments");
        if (rawProbabilitySegments.isEmpty()) {
            return extensions2.persistentListOf();
        }
        List<ProbabilitySegment> list = rawProbabilitySegments;
        Iterator<T> it = list.iterator();
        float fraction = 0.0f;
        while (it.hasNext()) {
            fraction += ((ProbabilitySegment) it.next()).getFraction();
        }
        if (fraction < 0.99f || fraction > 1.01f) {
            rawProbabilitySegments = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ProbabilitySegment probabilitySegment : list) {
                rawProbabilitySegments.add(ProbabilitySegment.copy$default(probabilitySegment, probabilitySegment.getFraction() / fraction, null, 2, null));
            }
        }
        Iterator<Integer> it2 = CollectionsKt.getIndices(rawProbabilitySegments).iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        PrimitiveIterators6 primitiveIterators6 = (PrimitiveIterators6) it2;
        int iNextInt = primitiveIterators6.nextInt();
        if (it2.hasNext()) {
            float fraction2 = rawProbabilitySegments.get(iNextInt).getFraction();
            do {
                int iNextInt2 = primitiveIterators6.nextInt();
                float fraction3 = rawProbabilitySegments.get(iNextInt2).getFraction();
                if (Float.compare(fraction2, fraction3) < 0) {
                    iNextInt = iNextInt2;
                    fraction2 = fraction3;
                }
            } while (it2.hasNext());
        }
        List<ProbabilitySegment> list2 = rawProbabilitySegments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        float fCoerceAtLeast = 0.0f;
        for (ProbabilitySegment probabilitySegmentCopy$default : list2) {
            if (probabilitySegmentCopy$default.getFraction() < f) {
                fCoerceAtLeast += RangesKt.coerceAtLeast(f - probabilitySegmentCopy$default.getFraction(), 0.0f);
                probabilitySegmentCopy$default = ProbabilitySegment.copy$default(probabilitySegmentCopy$default, f, null, 2, null);
            }
            arrayList.add(probabilitySegmentCopy$default);
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        mutableList.set(iNextInt, ProbabilitySegment.copy$default((ProbabilitySegment) mutableList.get(iNextInt), ((ProbabilitySegment) mutableList.get(iNextInt)).getFraction() - fCoerceAtLeast, null, 2, null));
        return extensions2.toPersistentList(mutableList);
    }
}
