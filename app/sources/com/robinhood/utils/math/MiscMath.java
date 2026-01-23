package com.robinhood.utils.math;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.UStrings;

/* compiled from: MiscMath.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"nonNegativeRem", "", "divisor", "toIntUnsignedOrNull", "", "", "radix", "(Ljava/lang/String;I)Ljava/lang/Integer;", "lib-utils-math"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.math.MiscMathKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class MiscMath {
    public static final float nonNegativeRem(float f, float f2) {
        return ((f % f2) + f2) % f2;
    }

    public static final Integer toIntUnsignedOrNull(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = UStrings.toUIntOrNull(str, i);
        if (uIntOrNull != null) {
            return Integer.valueOf(uIntOrNull.getData());
        }
        return null;
    }
}
