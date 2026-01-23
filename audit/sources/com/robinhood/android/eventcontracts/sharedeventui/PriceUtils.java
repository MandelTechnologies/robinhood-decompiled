package com.robinhood.android.eventcontracts.sharedeventui;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.utils.BigDecimals2;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PriceUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0007"}, m3636d2 = {"formatEcPrice", "", "showAsPercent", "", "appendSuffix", "suffix", "Ljava/math/BigDecimal;", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.PriceUtilsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class PriceUtils {
    public static final String formatEcPrice(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (z) {
            return appendSuffix(str, "%");
        }
        return appendSuffix(str, "¢");
    }

    private static final String appendSuffix(String str, String str2) {
        return str + str2;
    }

    public static final String formatEcPrice(BigDecimal bigDecimal, boolean z) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        if (z) {
            return Formats.getPercentFormat().format(bigDecimal);
        }
        return BigDecimals2.priceInCents(bigDecimal);
    }
}
