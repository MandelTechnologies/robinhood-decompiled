package com.stripe.android;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.uicore.format.CurrencyFormatter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PayWithGoogleUtils.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/PayWithGoogleUtils;", "", "<init>", "()V", "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/util/Currency;", "currency", "", "getPriceString", "(JLjava/util/Currency;)Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PayWithGoogleUtils {
    public static final PayWithGoogleUtils INSTANCE = new PayWithGoogleUtils();

    private PayWithGoogleUtils() {
    }

    @JvmStatic
    public static final String getPriceString(long price, Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        int defaultDecimalDigits = CurrencyFormatter.INSTANCE.getDefaultDecimalDigits(currency);
        int length = String.valueOf(price).length();
        StringBuilder sb = new StringBuilder();
        if (defaultDecimalDigits == 0) {
            for (int i = 0; i < length; i++) {
                sb.append('#');
            }
            DecimalFormat decimalFormat = new DecimalFormat(sb.toString(), DecimalFormatSymbols.getInstance(Locale.ROOT));
            decimalFormat.setCurrency(currency);
            decimalFormat.setGroupingUsed(false);
            String str = decimalFormat.format(price);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        int i2 = length - defaultDecimalDigits;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append('#');
        }
        if (length <= defaultDecimalDigits) {
            sb.append('0');
        }
        sb.append('.');
        for (int i4 = 0; i4 < defaultDecimalDigits; i4++) {
            sb.append('0');
        }
        double dPow = price / Math.pow(10.0d, defaultDecimalDigits);
        DecimalFormat decimalFormat2 = new DecimalFormat(sb.toString(), DecimalFormatSymbols.getInstance(Locale.ROOT));
        decimalFormat2.setCurrency(currency);
        decimalFormat2.setGroupingUsed(false);
        String str2 = decimalFormat2.format(dPow);
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }
}
