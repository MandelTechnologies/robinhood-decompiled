package com.robinhood.android.equityscreener.indicators;

import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.models.serverdriven.experimental.api.SliderValueTruncationMode;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: utils.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a0\u0010\b\u001a\u00020\t*\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"BILLIONS_ABBREVIATION", "", "MILLIONS_ABBREVIATION", "THOUSANDS_ABBREVIATION", "ONE_BILLION", "Ljava/math/BigDecimal;", "ONE_MILLION", "ONE_THOUSAND", "truncateValue", "", "numberFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "truncation", "Lcom/robinhood/models/serverdriven/experimental/api/SliderValueTruncationMode;", "scale", "", "step", "", "feature-equity-screener_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt {
    private static final char BILLIONS_ABBREVIATION = 'B';
    private static final char MILLIONS_ABBREVIATION = 'M';
    private static final BigDecimal ONE_BILLION = new BigDecimal("1000000000");
    private static final BigDecimal ONE_MILLION = new BigDecimal("1000000");
    private static final BigDecimal ONE_THOUSAND = new BigDecimal("1000");
    private static final char THOUSANDS_ABBREVIATION = 'K';

    /* compiled from: utils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SliderValueTruncationMode.values().length];
            try {
                iArr[SliderValueTruncationMode.BILLIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SliderValueTruncationMode.MILLIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SliderValueTruncationMode.THOUSANDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ String truncateValue$default(BigDecimal bigDecimal, NumberFormatter numberFormatter, SliderValueTruncationMode sliderValueTruncationMode, int i, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 3;
        }
        if ((i2 & 8) != 0) {
            f = 1.0f;
        }
        return truncateValue(bigDecimal, numberFormatter, sliderValueTruncationMode, i, f);
    }

    public static final String truncateValue(BigDecimal bigDecimal, NumberFormatter numberFormatter, SliderValueTruncationMode sliderValueTruncationMode, int i, float f) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(numberFormatter, "numberFormatter");
        int i2 = sliderValueTruncationMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sliderValueTruncationMode.ordinal()];
        if (i2 == 1) {
            BigDecimal bigDecimalDivide = bigDecimal.divide(ONE_BILLION, i, RoundingMode.HALF_UP);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
            return numberFormatter.format(bigDecimalDivide) + "B";
        }
        if (i2 == 2) {
            BigDecimal bigDecimalDivide2 = bigDecimal.divide(ONE_MILLION, i, RoundingMode.HALF_UP);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "divide(...)");
            return numberFormatter.format(bigDecimalDivide2) + "M";
        }
        if (i2 == 3) {
            BigDecimal bigDecimalDivide3 = bigDecimal.divide(ONE_THOUSAND, i, RoundingMode.HALF_UP);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide3, "divide(...)");
            return numberFormatter.format(bigDecimalDivide3) + "K";
        }
        BigDecimal scale = bigDecimal.setScale(zzah$$ExternalSyntheticBackportWithForwarding0.m822m(new BigDecimal(String.valueOf(f))).scale(), RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return numberFormatter.format(scale);
    }
}
