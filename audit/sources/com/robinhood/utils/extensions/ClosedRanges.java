package com.robinhood.utils.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: ClosedRanges.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, m3636d2 = {"intersect", "Lkotlin/ranges/IntRange;", "other", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.ClosedRangesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ClosedRanges {
    public static final PrimitiveRanges2 intersect(PrimitiveRanges2 primitiveRanges2, PrimitiveRanges2 other) {
        Intrinsics.checkNotNullParameter(primitiveRanges2, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new PrimitiveRanges2(Math.max(primitiveRanges2.getFirst(), other.getFirst()), Math.min(primitiveRanges2.getLast(), other.getLast()));
    }
}
