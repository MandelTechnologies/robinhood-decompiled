package com.robinhood.android.search.highlights.p249ui.sportherocarousel;

import com.robinhood.android.search.highlights.p249ui.sportherocarousel.delta.FloatingOpenInterestDelta;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: DeltaCalculationHelper.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Ljava/math/BigDecimal;", "previous", "current", "j$/time/Instant", "now", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/delta/FloatingOpenInterestDelta;", "calculateOpenInterestDelta", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lj$/time/Instant;)Lcom/robinhood/android/search/highlights/ui/sportherocarousel/delta/FloatingOpenInterestDelta;", "", "deltas", "removeExpiredDeltas", "(Ljava/util/List;Lj$/time/Instant;)Ljava/util/List;", "", "MIN_OPEN_INTEREST_DELTA_THRESHOLD", "I", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.sportherocarousel.DeltaCalculationHelperKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class DeltaCalculationHelper {
    private static final int MIN_OPEN_INTEREST_DELTA_THRESHOLD = 10;

    public static final FloatingOpenInterestDelta calculateOpenInterestDelta(BigDecimal bigDecimal, BigDecimal bigDecimal2, Instant now) {
        Intrinsics.checkNotNullParameter(now, "now");
        if (bigDecimal == null || bigDecimal2 == null) {
            return null;
        }
        BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        if (bigDecimalSubtract.abs().compareTo(new BigDecimal(10)) < 0) {
            return null;
        }
        return new FloatingOpenInterestDelta(bigDecimalSubtract, now);
    }

    public static final List<FloatingOpenInterestDelta> removeExpiredDeltas(List<FloatingOpenInterestDelta> deltas, Instant now) {
        Intrinsics.checkNotNullParameter(deltas, "deltas");
        Intrinsics.checkNotNullParameter(now, "now");
        ArrayList arrayList = new ArrayList();
        for (Object obj : deltas) {
            if (!((FloatingOpenInterestDelta) obj).isComplete(now)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
