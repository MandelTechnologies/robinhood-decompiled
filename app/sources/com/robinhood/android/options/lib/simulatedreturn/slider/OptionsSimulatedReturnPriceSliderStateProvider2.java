package com.robinhood.android.options.lib.simulatedreturn.slider;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnPriceSliderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"NUM_OF_FRACTIONAL_DIGITS_IN_PRICE_TEXT", "", "getSliderDisplayPrice", "Ljava/math/BigDecimal;", "", "lib-options-simulated-return_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderStateProviderKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnPriceSliderStateProvider2 {
    private static final int NUM_OF_FRACTIONAL_DIGITS_IN_PRICE_TEXT = 2;

    public static final BigDecimal getSliderDisplayPrice(double d) {
        String str = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new BigDecimal(str);
    }
}
