package com.robinhood.android.equitydetail.p123ui.chartIntervals;

import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FlexChunk.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¨\u0006\u0007"}, m3636d2 = {"flexChunk", "Lkotlinx/collections/immutable/ImmutableList;", "Lkotlin/ranges/IntRange;", Constants.RequestParamsKeys.APP_NAME_KEY, "", "minRow", "maxRow", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.chartIntervals.FlexChunkKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FlexChunk {
    public static final ImmutableList<PrimitiveRanges2> flexChunk(int i, int i2, int i3) {
        if (i2 <= 0) {
            throw new IllegalStateException("minRow must be greater than 0");
        }
        if (i3 <= i2) {
            throw new IllegalStateException("maxRow must be greater than minRow");
        }
        int i4 = i3 - i2;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        int i8 = (1 > i6 || i6 >= i2) ? 0 : i2 - i6;
        int iMin = Math.min(i8, i4 * i5);
        int i9 = i5 > 0 ? iMin / i5 : 0;
        int i10 = i5 > 0 ? iMin % i5 : 0;
        ArrayList arrayList = new ArrayList();
        if (i8 > 0 && i5 > 0) {
            arrayList.add(new PrimitiveRanges2(0, i2 - 1));
        } else if (i6 > 0) {
            arrayList.add(new PrimitiveRanges2(0, i6 - 1));
            i2 = i6;
        } else {
            i2 = 0;
        }
        while (i7 < i5) {
            int i11 = (i3 - (i7 < i10 ? i9 + 1 : i9)) + i2;
            arrayList.add(new PrimitiveRanges2(i2, i11 - 1));
            i7++;
            i2 = i11;
        }
        return extensions2.toImmutableList(arrayList);
    }
}
