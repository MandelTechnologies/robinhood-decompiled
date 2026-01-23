package com.robinhood.shared.crypto.p375ui.feeTiers;

import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.lib.formats.NumberFormatter;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FormatFeeRate.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"formatFeeRate", "", "Ljava/math/BigDecimal;", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.feeTiers.FormatFeeRateKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class FormatFeeRate {
    public static final String formatFeeRate(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        NumberFormatter hundredthPercentFormat = FormatsLocalized.getHundredthPercentFormat();
        hundredthPercentFormat.setMaximumFractionalDigits(3);
        return hundredthPercentFormat.format(bigDecimal);
    }
}
