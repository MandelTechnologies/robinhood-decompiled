package com.robinhood.android.indexes.detail.utils;

import com.robinhood.android.common.util.extensions.NumberFormats;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormatsUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0001¨\u0006\u0005"}, m3636d2 = {"formatDecimal", "", "any", "", "emptyStateString", "feature-index-detail-page_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.indexes.detail.utils.FormatsUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class FormatsUtils {
    public static /* synthetic */ String formatDecimal$default(Object obj, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "—";
        }
        return formatDecimal(obj, str);
    }

    public static final String formatDecimal(Object obj, String emptyStateString) {
        Intrinsics.checkNotNullParameter(emptyStateString, "emptyStateString");
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.getDefault(Locale.Category.FORMAT));
        numberInstance.setMinimumFractionDigits(2);
        numberInstance.setMaximumFractionDigits(2);
        numberInstance.setRoundingMode(RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(numberInstance, "apply(...)");
        return NumberFormats.formatNullable(numberInstance, obj, emptyStateString);
    }
}
