package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BigDecimals.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"inputStringFormat", "", "Ljava/math/BigDecimal;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.v2.BigDecimalsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class BigDecimals5 {
    public static final String inputStringFormat(BigDecimal bigDecimal) {
        NumberFormatter amountFormat;
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        if (BigDecimals7.isInteger(bigDecimal)) {
            amountFormat = Formats.getWholeNumberAmountFormat();
        } else {
            amountFormat = Formats.getAmountFormat();
        }
        return amountFormat.format(bigDecimal);
    }
}
