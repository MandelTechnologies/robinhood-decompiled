package com.robinhood.android.waitlist.util;

import com.robinhood.utils.math.Quaternion;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuaternionExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"yawFormat", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "normalizedYaw", "", "Lcom/robinhood/utils/math/Quaternion;", "feature-waitlist_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.waitlist.util.QuaternionExtensionsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class QuaternionExtensions {
    private static final NumberFormat yawFormat;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        numberFormat.setMaximumFractionDigits(2);
        yawFormat = numberFormat;
    }

    public static final float normalizedYaw(Quaternion quaternion) {
        Intrinsics.checkNotNullParameter(quaternion, "<this>");
        String str = yawFormat.format(Float.valueOf(quaternion.normalized().getYaw()));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return Float.parseFloat(str);
    }
}
