package com.robinhood.android.common.util.extensions;

import android.content.res.Resources;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Resources.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0004¨\u0006\r"}, m3636d2 = {"getBigDecimalQuantityString", "", "Landroid/content/res/Resources;", "id", "", "quantity", "Ljava/math/BigDecimal;", "args", "", "", "(Landroid/content/res/Resources;ILjava/math/BigDecimal;[Ljava/lang/Object;)Ljava/lang/String;", "getResourceNameOrNull", "resId", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.extensions.ResourcesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Resources {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[PHI: r1
      0x0037: PHI (r1v5 int) = (r1v3 int), (r1v4 int) binds: [B:11:0x0035, B:14:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getBigDecimalQuantityString(android.content.res.Resources resources, int i, BigDecimal quantity, Object... args) throws Resources.NotFoundException {
        int intRoundUp;
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(args, "args");
        BigDecimal bigDecimal = BigDecimal.ONE;
        if (Intrinsics.areEqual(quantity, bigDecimal)) {
            intRoundUp = 1;
        } else if (quantity.compareTo(BigDecimal.ZERO) < 0 || quantity.compareTo(bigDecimal) >= 0) {
            int i2 = Integer.MAX_VALUE;
            if (quantity.compareTo(new BigDecimal(Integer.MAX_VALUE)) >= 0) {
                intRoundUp = i2;
            } else {
                i2 = Integer.MIN_VALUE;
                if (quantity.compareTo(new BigDecimal(Integer.MIN_VALUE)) > 0) {
                    intRoundUp = BigDecimals7.toIntRoundUp(quantity);
                }
            }
        } else {
            intRoundUp = 0;
        }
        String quantityString = resources.getQuantityString(i, intRoundUp, Arrays.copyOf(args, args.length));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    public static final String getResourceNameOrNull(android.content.res.Resources resources, int i) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        try {
            return resources.getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
