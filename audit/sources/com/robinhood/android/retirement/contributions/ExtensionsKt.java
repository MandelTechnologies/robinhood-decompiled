package com.robinhood.android.retirement.contributions;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.models.retirement.api.contributions.ContributionYear;
import com.robinhood.models.util.Money;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Extensions.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\n\u001a\u00020\u000b*\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\u0006\u001a\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006\"\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, m3636d2 = {"coerceForLottie", "", "realMinimum", "getContributionPercent", "Lcom/robinhood/android/models/retirement/api/contributions/ContributionYear;", "amount", "Ljava/math/BigDecimal;", "amountRemainingUntilLimit", "getAmountRemainingUntilLimit", "(Lcom/robinhood/android/models/retirement/api/contributions/ContributionYear;)Ljava/math/BigDecimal;", "getDeltaUntilMaxText", "", "formatForContributionRing", "calculateMatchString", "matchRate", "lib-retirement-contributions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ExtensionsKt {
    public static /* synthetic */ float coerceForLottie$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = 0.01f;
        }
        return coerceForLottie(f, f2);
    }

    public static final float coerceForLottie(float f, float f2) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return RangesKt.coerceAtLeast(((float) Math.floor(f * r0)) / 100, f2);
    }

    public static final float getContributionPercent(ContributionYear contributionYear, BigDecimal amount) {
        BigDecimal decimalValue;
        Money contributionLimit;
        BigDecimal decimalValue2;
        Money amountContributed;
        Intrinsics.checkNotNullParameter(amount, "amount");
        if (contributionYear == null || (amountContributed = contributionYear.getAmountContributed()) == null || (decimalValue = amountContributed.getDecimalValue()) == null) {
            decimalValue = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(decimalValue);
        BigDecimal bigDecimalAdd = amount.add(decimalValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return coerceForLottie$default(RangesKt.coerceAtMost(bigDecimalAdd.floatValue() / ((contributionYear == null || (contributionLimit = contributionYear.getContributionLimit()) == null || (decimalValue2 = contributionLimit.getDecimalValue()) == null) ? 1.0f : decimalValue2.floatValue()), 1.0f), 0.0f, 1, null);
    }

    public static final BigDecimal getAmountRemainingUntilLimit(ContributionYear contributionYear) {
        Intrinsics.checkNotNullParameter(contributionYear, "<this>");
        BigDecimal bigDecimalSubtract = contributionYear.getContributionLimit().getDecimalValue().subtract(contributionYear.getAmountContributed().getDecimalValue());
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    public static final String getDeltaUntilMaxText(ContributionYear contributionYear, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        if (contributionYear == null) {
            return "";
        }
        Currency currency = Currencies.USD;
        BigDecimal bigDecimalSubtract = getAmountRemainingUntilLimit(contributionYear).subtract(amount);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return Money.format$default(new Money(currency, bigDecimalSubtract), null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public static final String formatForContributionRing(BigDecimal bigDecimal) {
        NumberFormatter amountFormat;
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        if (BigDecimals7.isInteger(bigDecimal)) {
            amountFormat = Formats.getWholeNumberAmountFormat();
        } else {
            amountFormat = Formats.getAmountFormat();
        }
        return amountFormat.format(bigDecimal);
    }

    public static final String calculateMatchString(BigDecimal amount, BigDecimal matchRate) {
        NumberFormatter amountFormat;
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(matchRate, "matchRate");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalMultiply = matchRate.divide(bigDecimalValueOf).multiply(amount);
        Intrinsics.checkNotNull(bigDecimalMultiply);
        BigDecimal bigDecimalRoundToInterval = BigDecimals7.roundToInterval(bigDecimalMultiply, new BigDecimal(String.valueOf(0.01d)), RoundingMode.FLOOR);
        if (BigDecimals7.isInteger(bigDecimalRoundToInterval)) {
            amountFormat = Formats.getWholeNumberAmountFormat();
        } else {
            amountFormat = Formats.getAmountFormat();
        }
        return amountFormat.format(bigDecimalRoundToInterval);
    }
}
