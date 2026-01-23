package com.robinhood.shared.common.lib.formats.currency;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.g11n.Locales2;
import com.robinhood.shared.common.lib.formats.currency.InputAmount;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.MatchResult2;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: CurrencyFormatParser.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\"\u000e\u0010\n\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"parseCurrencyText", "Lcom/robinhood/shared/common/lib/formats/currency/InputAmount;", "currencyText", "", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "locale", "Ljava/util/Locale;", "parseCleanedText", "Ljava/math/BigDecimal;", "cleanText", "US_DECIMAL_SEPARATOR", "lib-formats-currency_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.lib.formats.currency.CurrencyFormatParserKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class CurrencyFormatParser {
    private static final String US_DECIMAL_SEPARATOR = ".";

    public static /* synthetic */ InputAmount parseCurrencyText$default(String str, InputAmount inputAmount, Locale locale, int i, Object obj) {
        if ((i & 4) != 0) {
            locale = CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale();
        }
        return parseCurrencyText(str, inputAmount, locale);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InputAmount parseCurrencyText(String str, InputAmount inputAmount, Locale locale) {
        String strReplace$default;
        MatchResult2 groups;
        MatchGroup matchGroup;
        String value;
        String strReplace$default2;
        Intrinsics.checkNotNullParameter(inputAmount, "default");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str == null || str.length() == 0) {
            return inputAmount;
        }
        String strValueOf = String.valueOf(Locales2.getMonetaryDecimalSeparator(locale));
        int i = 1;
        BigDecimal bigDecimal = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if (str.contentEquals(strValueOf)) {
            return new InputAmount(bigDecimal, InputAmount.Type.ZERO_AND_SEPARATOR, i, objArr7 == true ? 1 : 0);
        }
        String strValueOf2 = String.valueOf(Locales2.getMonetaryGroupingSeparator(locale));
        boolean zContains$default = StringsKt.contains$default((CharSequence) str, (CharSequence) strValueOf, false, 2, (Object) null);
        MatchResult matchResultMatchEntire = new Regex("([^0-9" + strValueOf + strValueOf2 + "]+)*([0-9" + strValueOf + strValueOf2 + "]+)*([^0-9" + strValueOf + strValueOf2 + "]+)*([0-9" + strValueOf + strValueOf2 + "]+)*([^0-9" + strValueOf + strValueOf2 + "]+)*([0-9" + strValueOf + strValueOf2 + "]+)*([^0-9" + strValueOf + strValueOf2 + "]+)*([0-9" + strValueOf + strValueOf2 + "]+)*").matchEntire(str);
        if (matchResultMatchEntire == null || (groups = matchResultMatchEntire.getGroups()) == null || (matchGroup = groups.get(2)) == null || (value = matchGroup.getValue()) == null || (strReplace$default2 = StringsKt.replace$default(value, strValueOf2, "", false, 4, (Object) null)) == null || (strReplace$default = StringsKt.replace$default(strReplace$default2, strValueOf, US_DECIMAL_SEPARATOR, false, 4, (Object) null)) == null) {
            strReplace$default = null;
        } else {
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strReplace$default, US_DECIMAL_SEPARATOR, 0, false, 6, (Object) null);
            if (iIndexOf$default != -1) {
                int i2 = iIndexOf$default + 1;
                String strSubstring = strReplace$default.substring(0, i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = strReplace$default.substring(i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                strReplace$default = strSubstring + StringsKt.replace$default(strSubstring2, US_DECIMAL_SEPARATOR, "", false, 4, (Object) null);
            }
        }
        if (strReplace$default == null || strReplace$default.length() == 0) {
            return inputAmount;
        }
        if (strReplace$default.contentEquals(US_DECIMAL_SEPARATOR)) {
            return new InputAmount(objArr6 == true ? 1 : 0, InputAmount.Type.ZERO_AND_SEPARATOR, i, objArr5 == true ? 1 : 0);
        }
        BigDecimal cleanedText = parseCleanedText(strReplace$default, str, inputAmount);
        if (Intrinsics.areEqual(cleanedText, BigDecimal.ZERO)) {
            if (zContains$default) {
                return new InputAmount(objArr4 == true ? 1 : 0, InputAmount.Type.ZERO_AND_SEPARATOR, i, objArr3 == true ? 1 : 0);
            }
            return new InputAmount(objArr2 == true ? 1 : 0, InputAmount.Type.ZERO, i, objArr == true ? 1 : 0);
        }
        if (zContains$default) {
            return new InputAmount(cleanedText, InputAmount.Type.FRACTIONAL_AMOUNT);
        }
        return new InputAmount(cleanedText, InputAmount.Type.INTEGER_AMOUNT);
    }

    public static final BigDecimal parseCleanedText(String cleanText, String str, InputAmount inputAmount) throws Throwable {
        Intrinsics.checkNotNullParameter(cleanText, "cleanText");
        Intrinsics.checkNotNullParameter(inputAmount, "default");
        try {
            return new BigDecimal(cleanText);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("input string: " + cleanText + " | raw string: " + str + " | input amount: " + inputAmount).initCause(e);
        }
    }
}
