package com.robinhood.android.acatsin.util;

import com.robinhood.android.lib.formats.Formats;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PositionAmountFormatting.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\b"}, m3636d2 = {"formatAmountForPosition", "", "amount", "isShortPosition", "", "formatQuantityForDisplay", "", "quantity", "lib-acats-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.util.PositionAmountFormattingKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class PositionAmountFormatting {
    public static final int formatQuantityForDisplay(int i, boolean z) {
        return z ? -i : i;
    }

    public static final String formatAmountForPosition(String amount, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        if (amount.length() == 0) {
            return "";
        }
        String strRemovePrefix = StringsKt.removePrefix(amount, "-");
        if (strRemovePrefix.length() == 0) {
            return "";
        }
        if (StringsKt.endsWith$default(strRemovePrefix, ".", false, 2, (Object) null) || !z) {
            if (!z) {
                return strRemovePrefix;
            }
            return "-" + strRemovePrefix;
        }
        BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(strRemovePrefix);
        if (bigDecimalOrNull != null) {
            BigDecimal bigDecimalAbs = bigDecimalOrNull.abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
            BigDecimal bigDecimalNegate = bigDecimalAbs.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
            String str = Formats.getShareQuantityFormat().format(bigDecimalNegate);
            if (str != null) {
                return str;
            }
        }
        if (!z) {
            return strRemovePrefix;
        }
        return "-" + strRemovePrefix;
    }
}
