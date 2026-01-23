package com.robinhood.android.lib.utils;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.utils.android.C41827R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BigDecimals.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a0\u0010\n\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u001a\u001c\u0010\u0014\u001a\u00020\u000b*\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000b\u001a&\u0010\u0014\u001a\u00020\u000b*\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u0018\u001a\u00020\u0011\u001a\u0016\u0010\u0019\u001a\u00020\u000b*\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u001a\n\u0010\u001a\u001a\u00020\u000b*\u00020\u0006\u001a\u0016\u0010\u001b\u001a\u00020\u000b*\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"TRILLIONS_ABBREVIATION", "", "BILLIONS_ABBREVIATION", "MILLIONS_ABBREVIATION", "THOUSANDS_ABBREVIATION", "ONE_TRILLION", "Ljava/math/BigDecimal;", "ONE_BILLION", "ONE_MILLION", "ONE_THOUSAND", "truncateLarge", "", "numberFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "truncateThousands", "", "scale", "", "abbreviations", "Lcom/robinhood/android/lib/utils/LowPrecisionAbbreviations;", "truncateLargeOrNotAvailable", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "context", "Landroid/content/Context;", "defaultStrRes", "formatCurrencyWithOptionalDecimal", "priceInCents", "priceInCentsWithNullFallback", "fallback", "lib-formats_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.utils.BigDecimalsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class BigDecimals2 {
    private static final char BILLIONS_ABBREVIATION = 'B';
    private static final char MILLIONS_ABBREVIATION = 'M';
    private static final char THOUSANDS_ABBREVIATION = 'K';
    private static final char TRILLIONS_ABBREVIATION = 'T';
    private static final BigDecimal ONE_TRILLION = new BigDecimal("1000000000000");
    private static final BigDecimal ONE_BILLION = new BigDecimal("1000000000");
    private static final BigDecimal ONE_MILLION = new BigDecimal("1000000");
    private static final BigDecimal ONE_THOUSAND = new BigDecimal("1000");

    public static /* synthetic */ String truncateLarge$default(BigDecimal bigDecimal, NumberFormatter numberFormatter, boolean z, int i, LowPrecisionAbbreviations lowPrecisionAbbreviations, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 3;
        }
        if ((i2 & 8) != 0) {
            lowPrecisionAbbreviations = new LowPrecisionAbbreviations(null, null, null, null, false, 31, null);
        }
        return truncateLarge(bigDecimal, numberFormatter, z, i, lowPrecisionAbbreviations);
    }

    public static final String truncateLarge(BigDecimal bigDecimal, NumberFormatter numberFormatter, boolean z, int i, LowPrecisionAbbreviations abbreviations) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(numberFormatter, "numberFormatter");
        Intrinsics.checkNotNullParameter(abbreviations, "abbreviations");
        BigDecimal bigDecimal2 = ONE_TRILLION;
        int i2 = i + 3;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, i2, roundingMode);
        BigDecimal bigDecimal3 = ONE_BILLION;
        BigDecimal bigDecimalDivide2 = bigDecimal.divide(bigDecimal3, i2, roundingMode);
        BigDecimal bigDecimal4 = ONE_MILLION;
        BigDecimal bigDecimalDivide3 = bigDecimal.divide(bigDecimal4, i2, roundingMode);
        BigDecimal bigDecimal5 = ONE_THOUSAND;
        BigDecimal bigDecimalDivide4 = bigDecimal.divide(bigDecimal5, i2, roundingMode);
        BigDecimal bigDecimal6 = BigDecimal.ONE;
        if (bigDecimalDivide.compareTo(bigDecimal6) >= 0) {
            BigDecimal bigDecimalDivide5 = bigDecimal.divide(bigDecimal2, i, roundingMode);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide5, "divide(...)");
            return numberFormatter.format(bigDecimalDivide5) + abbreviations.trillions();
        }
        if (bigDecimalDivide2.compareTo(bigDecimal6) >= 0) {
            BigDecimal bigDecimalDivide6 = bigDecimal.divide(bigDecimal3, i, roundingMode);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide6, "divide(...)");
            return numberFormatter.format(bigDecimalDivide6) + abbreviations.billions();
        }
        if (bigDecimalDivide3.compareTo(bigDecimal6) >= 0) {
            BigDecimal bigDecimalDivide7 = bigDecimal.divide(bigDecimal4, i, roundingMode);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide7, "divide(...)");
            return numberFormatter.format(bigDecimalDivide7) + abbreviations.millions();
        }
        if (z && bigDecimalDivide4.compareTo(bigDecimal6) >= 0) {
            BigDecimal bigDecimalDivide8 = bigDecimal.divide(bigDecimal5, i, roundingMode);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide8, "divide(...)");
            return numberFormatter.format(bigDecimalDivide8) + abbreviations.thousands();
        }
        return numberFormatter.format(bigDecimal);
    }

    public static final String truncateLargeOrNotAvailable(BigDecimal bigDecimal, NumberFormatter numberFormatter, String str) {
        String strTruncateLarge$default;
        Intrinsics.checkNotNullParameter(numberFormatter, "numberFormatter");
        Intrinsics.checkNotNullParameter(str, "default");
        return (bigDecimal == null || (strTruncateLarge$default = truncateLarge$default(bigDecimal, numberFormatter, false, 0, null, 14, null)) == null) ? str : strTruncateLarge$default;
    }

    public static /* synthetic */ String truncateLargeOrNotAvailable$default(BigDecimal bigDecimal, Context context, NumberFormatter numberFormatter, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = C41827R.string.general_label_n_a;
        }
        return truncateLargeOrNotAvailable(bigDecimal, context, numberFormatter, i);
    }

    public static final String truncateLargeOrNotAvailable(BigDecimal bigDecimal, Context context, NumberFormatter numberFormatter, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(numberFormatter, "numberFormatter");
        String string2 = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return truncateLargeOrNotAvailable(bigDecimal, numberFormatter, string2);
    }

    public static /* synthetic */ String formatCurrencyWithOptionalDecimal$default(BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "-";
        }
        return formatCurrencyWithOptionalDecimal(bigDecimal, str);
    }

    public static final String formatCurrencyWithOptionalDecimal(BigDecimal bigDecimal, String str) {
        Intrinsics.checkNotNullParameter(str, "default");
        if (bigDecimal == null) {
            return str;
        }
        if (bigDecimal.scale() == 0) {
            return Formats.getWholeNumberCurrencyFormat().format(bigDecimal);
        }
        return Formats.getCurrencyFormat().format(bigDecimal);
    }

    public static final String priceInCents(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        NumberFormatter priceInCentsFormat = Formats.getPriceInCentsFormat();
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return priceInCentsFormat.format(bigDecimalMultiply);
    }

    public static final String priceInCentsWithNullFallback(BigDecimal bigDecimal, String fallback) {
        String strPriceInCents;
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        return (bigDecimal == null || (strPriceInCents = priceInCents(bigDecimal)) == null) ? fallback : strPriceInCents;
    }

    public static /* synthetic */ String priceInCentsWithNullFallback$default(BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "-";
        }
        return priceInCentsWithNullFallback(bigDecimal, str);
    }
}
