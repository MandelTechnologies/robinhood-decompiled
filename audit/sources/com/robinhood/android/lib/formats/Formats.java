package com.robinhood.android.lib.formats;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Currency;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: Formats.kt */
@Metadata(m3635d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0003\b\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0007J\b\u0010d\u001a\u00020\u0005H\u0007J\u001c\u0010e\u001a\u00020\u00052\b\b\u0002\u0010f\u001a\u00020/2\b\b\u0002\u0010,\u001a\u00020-H\u0007J\u001e\u0010\u008b\u0001\u001a\u00020\u00052\t\b\u0002\u0010\u008c\u0001\u001a\u00020/2\b\b\u0002\u0010,\u001a\u00020-H\u0007J\u0013\u0010\u009d\u0001\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020-H\u0007J\u0013\u0010º\u0001\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020-H\u0007JK\u0010Ç\u0001\u001a\n\u0012\u0005\u0012\u00030É\u00010È\u00012\u0017\b\u0004\u0010Ê\u0001\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0005\u0012\u00030Ì\u00010Ë\u00012\u001e\b\u0004\u0010Í\u0001\u001a\u0017\u0012\u0005\u0012\u00030Ì\u0001\u0012\u0005\u0012\u00030Î\u00010Ë\u0001¢\u0006\u0003\bÏ\u0001H\u0082\bJc\u0010Ð\u0001\u001a\n\u0012\u0005\u0012\u00030É\u00010È\u00012\u0017\b\u0004\u0010Ê\u0001\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0005\u0012\u00030Ì\u00010Ë\u00012\n\b\u0002\u0010Ñ\u0001\u001a\u00030Ò\u00012\n\b\u0002\u0010Ó\u0001\u001a\u00030Ò\u00012\u001e\b\u0004\u0010Í\u0001\u001a\u0017\u0012\u0005\u0012\u00030Ì\u0001\u0012\u0005\u0012\u00030Î\u00010Ë\u0001¢\u0006\u0003\bÏ\u0001H\u0082\bJ,\u0010Ô\u0001\u001a\u00030É\u00012\b\u0010Õ\u0001\u001a\u00030Ì\u00012\n\b\u0002\u0010Ñ\u0001\u001a\u00030Ò\u00012\n\b\u0002\u0010Ó\u0001\u001a\u00030Ò\u0001H\u0002R!\u0010\u0004\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR!\u0010\u000b\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\bR!\u0010\u000f\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\bR!\u0010\u0013\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\n\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\bR!\u0010\u0017\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\n\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0019\u0010\bR!\u0010\u001b\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\n\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001d\u0010\bR!\u0010\u001f\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\"\u0010\n\u0012\u0004\b \u0010\u0003\u001a\u0004\b!\u0010\bR!\u0010#\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b&\u0010\n\u0012\u0004\b$\u0010\u0003\u001a\u0004\b%\u0010\bR!\u0010'\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b*\u0010\n\u0012\u0004\b(\u0010\u0003\u001a\u0004\b)\u0010\bR!\u00100\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b3\u0010\n\u0012\u0004\b1\u0010\u0003\u001a\u0004\b2\u0010\bR!\u00104\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b7\u0010\n\u0012\u0004\b5\u0010\u0003\u001a\u0004\b6\u0010\bR!\u00108\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b;\u0010\n\u0012\u0004\b9\u0010\u0003\u001a\u0004\b:\u0010\bR!\u0010<\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b?\u0010\n\u0012\u0004\b=\u0010\u0003\u001a\u0004\b>\u0010\bR!\u0010@\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bC\u0010\n\u0012\u0004\bA\u0010\u0003\u001a\u0004\bB\u0010\bR!\u0010D\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bG\u0010\n\u0012\u0004\bE\u0010\u0003\u001a\u0004\bF\u0010\bR!\u0010H\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bK\u0010\n\u0012\u0004\bI\u0010\u0003\u001a\u0004\bJ\u0010\bR!\u0010L\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bO\u0010\n\u0012\u0004\bM\u0010\u0003\u001a\u0004\bN\u0010\bR!\u0010P\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bS\u0010\n\u0012\u0004\bQ\u0010\u0003\u001a\u0004\bR\u0010\bR!\u0010T\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bW\u0010\n\u0012\u0004\bU\u0010\u0003\u001a\u0004\bV\u0010\bR!\u0010X\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b[\u0010\n\u0012\u0004\bY\u0010\u0003\u001a\u0004\bZ\u0010\bR!\u0010\\\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b_\u0010\n\u0012\u0004\b]\u0010\u0003\u001a\u0004\b^\u0010\bR!\u0010`\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bc\u0010\n\u0012\u0004\ba\u0010\u0003\u001a\u0004\bb\u0010\bR!\u0010g\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bj\u0010\n\u0012\u0004\bh\u0010\u0003\u001a\u0004\bi\u0010\bR!\u0010k\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bn\u0010\n\u0012\u0004\bl\u0010\u0003\u001a\u0004\bm\u0010\bR!\u0010o\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\br\u0010\n\u0012\u0004\bp\u0010\u0003\u001a\u0004\bq\u0010\bR!\u0010s\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bv\u0010\n\u0012\u0004\bt\u0010\u0003\u001a\u0004\bu\u0010\bR!\u0010w\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bz\u0010\n\u0012\u0004\bx\u0010\u0003\u001a\u0004\by\u0010\bR!\u0010{\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b~\u0010\n\u0012\u0004\b|\u0010\u0003\u001a\u0004\b}\u0010\bR$\u0010\u007f\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010\n\u0012\u0005\b\u0080\u0001\u0010\u0003\u001a\u0005\b\u0081\u0001\u0010\bR%\u0010\u0083\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010\n\u0012\u0005\b\u0084\u0001\u0010\u0003\u001a\u0005\b\u0085\u0001\u0010\bR%\u0010\u0087\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010\n\u0012\u0005\b\u0088\u0001\u0010\u0003\u001a\u0005\b\u0089\u0001\u0010\bR%\u0010\u008d\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010\n\u0012\u0005\b\u008e\u0001\u0010\u0003\u001a\u0005\b\u008f\u0001\u0010\bR%\u0010\u0091\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010\n\u0012\u0005\b\u0092\u0001\u0010\u0003\u001a\u0005\b\u0093\u0001\u0010\bR%\u0010\u0095\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010\n\u0012\u0005\b\u0096\u0001\u0010\u0003\u001a\u0005\b\u0097\u0001\u0010\bR%\u0010\u0099\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010\n\u0012\u0005\b\u009a\u0001\u0010\u0003\u001a\u0005\b\u009b\u0001\u0010\bR%\u0010\u009e\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b¡\u0001\u0010\n\u0012\u0005\b\u009f\u0001\u0010\u0003\u001a\u0005\b \u0001\u0010\bR%\u0010¢\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b¥\u0001\u0010\n\u0012\u0005\b£\u0001\u0010\u0003\u001a\u0005\b¤\u0001\u0010\bR%\u0010¦\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b©\u0001\u0010\n\u0012\u0005\b§\u0001\u0010\u0003\u001a\u0005\b¨\u0001\u0010\bR%\u0010ª\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b\u00ad\u0001\u0010\n\u0012\u0005\b«\u0001\u0010\u0003\u001a\u0005\b¬\u0001\u0010\bR%\u0010®\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b±\u0001\u0010\n\u0012\u0005\b¯\u0001\u0010\u0003\u001a\u0005\b°\u0001\u0010\bR%\u0010²\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\bµ\u0001\u0010\n\u0012\u0005\b³\u0001\u0010\u0003\u001a\u0005\b´\u0001\u0010\bR%\u0010¶\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b¹\u0001\u0010\n\u0012\u0005\b·\u0001\u0010\u0003\u001a\u0005\b¸\u0001\u0010\bR%\u0010»\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\b¾\u0001\u0010\n\u0012\u0005\b¼\u0001\u0010\u0003\u001a\u0005\b½\u0001\u0010\bR%\u0010¿\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\bÂ\u0001\u0010\n\u0012\u0005\bÀ\u0001\u0010\u0003\u001a\u0005\bÁ\u0001\u0010\bR%\u0010Ã\u0001\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0015\n\u0005\bÆ\u0001\u0010\n\u0012\u0005\bÄ\u0001\u0010\u0003\u001a\u0005\bÅ\u0001\u0010\b¨\u0006Ö\u0001"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/Formats;", "", "<init>", "()V", "strikePriceFormat", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getStrikePriceFormat$annotations", "getStrikePriceFormat", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "strikePriceFormat$delegate", "Ljava/lang/ThreadLocal;", "strikeValueFormat", "getStrikeValueFormat$annotations", "getStrikeValueFormat", "strikeValueFormat$delegate", "priceFormat", "getPriceFormat$annotations", "getPriceFormat", "priceFormat$delegate", "priceInCentsFormat", "getPriceInCentsFormat$annotations", "getPriceInCentsFormat", "priceInCentsFormat$delegate", "valueFormat", "getValueFormat$annotations", "getValueFormat", "valueFormat$delegate", "amountFormat", "getAmountFormat$annotations", "getAmountFormat", "amountFormat$delegate", "wholeNumberAmountFormat", "getWholeNumberAmountFormat$annotations", "getWholeNumberAmountFormat", "wholeNumberAmountFormat$delegate", "shareQuantityFormat", "getShareQuantityFormat$annotations", "getShareQuantityFormat", "shareQuantityFormat$delegate", "shareQuantityWithSignFormat", "getShareQuantityWithSignFormat$annotations", "getShareQuantityWithSignFormat", "shareQuantityWithSignFormat$delegate", "getNotionalShareQuantityFormat", "locale", "Ljava/util/Locale;", "maximumDigits", "", "lowPrecisionUnitFormat", "getLowPrecisionUnitFormat$annotations", "getLowPrecisionUnitFormat", "lowPrecisionUnitFormat$delegate", "fallbackCryptoPriceFormat", "getFallbackCryptoPriceFormat$annotations", "getFallbackCryptoPriceFormat", "fallbackCryptoPriceFormat$delegate", "priceDeltaFormat", "getPriceDeltaFormat$annotations", "getPriceDeltaFormat", "priceDeltaFormat$delegate", "priceDeltaWithHundredthDecimalFormat", "getPriceDeltaWithHundredthDecimalFormat$annotations", "getPriceDeltaWithHundredthDecimalFormat", "priceDeltaWithHundredthDecimalFormat$delegate", "fallbackCryptoPriceDeltaFormat", "getFallbackCryptoPriceDeltaFormat$annotations", "getFallbackCryptoPriceDeltaFormat", "fallbackCryptoPriceDeltaFormat$delegate", "noSignPriceFormat", "getNoSignPriceFormat$annotations", "getNoSignPriceFormat", "noSignPriceFormat$delegate", "currencyFormat", "getCurrencyFormat$annotations", "getCurrencyFormat", "currencyFormat$delegate", "currencyFormatNoDecimals", "getCurrencyFormatNoDecimals$annotations", "getCurrencyFormatNoDecimals", "currencyFormatNoDecimals$delegate", "noCurrencyFormat", "getNoCurrencyFormat$annotations", "getNoCurrencyFormat", "noCurrencyFormat$delegate", "noSymbolCurrencyFormat", "getNoSymbolCurrencyFormat$annotations", "getNoSymbolCurrencyFormat", "noSymbolCurrencyFormat$delegate", "wholeNumberCurrencyFormat", "getWholeNumberCurrencyFormat$annotations", "getWholeNumberCurrencyFormat", "wholeNumberCurrencyFormat$delegate", "lowPrecisionCurrencyFormat", "getLowPrecisionCurrencyFormat$annotations", "getLowPrecisionCurrencyFormat", "lowPrecisionCurrencyFormat$delegate", "currencyDeltaFormat", "getCurrencyDeltaFormat$annotations", "getCurrencyDeltaFormat", "currencyDeltaFormat$delegate", "getWholeNumberCurrencyDeltaFormat", "currencyDeltaFourMaxFractionalDigitsFormat", "minimumFractionalDigits", "wholeNumberPercentFormat", "getWholeNumberPercentFormat$annotations", "getWholeNumberPercentFormat", "wholeNumberPercentFormat$delegate", "userInputCurrencyFormat", "getUserInputCurrencyFormat$annotations", "getUserInputCurrencyFormat", "userInputCurrencyFormat$delegate", "interestRateFormat", "getInterestRateFormat$annotations", "getInterestRateFormat", "interestRateFormat$delegate", "interestRateFormatShort", "getInterestRateFormatShort$annotations", "getInterestRateFormatShort", "interestRateFormatShort$delegate", "interestRateFormatShortWithPercentage", "getInterestRateFormatShortWithPercentage$annotations", "getInterestRateFormatShortWithPercentage", "interestRateFormatShortWithPercentage$delegate", "interestRateFormatLongWithPercentage", "getInterestRateFormatLongWithPercentage$annotations", "getInterestRateFormatLongWithPercentage", "interestRateFormatLongWithPercentage$delegate", "tenthPercentFormat", "getTenthPercentFormat$annotations", "getTenthPercentFormat", "tenthPercentFormat$delegate", "hundredthPercentFormat", "getHundredthPercentFormat$annotations", "getHundredthPercentFormat", "hundredthPercentFormat$delegate", "percentFormat", "getPercentFormat$annotations", "getPercentFormat", "percentFormat$delegate", "getDecimalPercentageWithoutTrailingZeroFormat", "maximumFractionalDigits", "noSymbolPercentFormat", "getNoSymbolPercentFormat$annotations", "getNoSymbolPercentFormat", "noSymbolPercentFormat$delegate", "noSymbolWithHundredthDecimalPercentFormat", "getNoSymbolWithHundredthDecimalPercentFormat$annotations", "getNoSymbolWithHundredthDecimalPercentFormat", "noSymbolWithHundredthDecimalPercentFormat$delegate", "percentDeltaFormat", "getPercentDeltaFormat$annotations", "getPercentDeltaFormat", "percentDeltaFormat$delegate", "percentDeltaWithHundredthDecimalFormat", "getPercentDeltaWithHundredthDecimalFormat$annotations", "getPercentDeltaWithHundredthDecimalFormat", "percentDeltaWithHundredthDecimalFormat$delegate", "getPercentDeltaWithHundredthDecimalWithoutZeroPrefixFormat", "absPercentDeltaFormat", "getAbsPercentDeltaFormat$annotations", "getAbsPercentDeltaFormat", "absPercentDeltaFormat$delegate", "noSignWithHundredthDecimalPercentFormat", "getNoSignWithHundredthDecimalPercentFormat$annotations", "getNoSignWithHundredthDecimalPercentFormat", "noSignWithHundredthDecimalPercentFormat$delegate", "hundredthDecimalPercentFormat", "getHundredthDecimalPercentFormat$annotations", "getHundredthDecimalPercentFormat", "hundredthDecimalPercentFormat$delegate", "noSignPercentFormat", "getNoSignPercentFormat$annotations", "getNoSignPercentFormat", "noSignPercentFormat$delegate", "leadingZeroesHundredthPercentFormat", "getLeadingZeroesHundredthPercentFormat$annotations", "getLeadingZeroesHundredthPercentFormat", "leadingZeroesHundredthPercentFormat$delegate", "wholeNumberWithPercentageSuffixFormat", "getWholeNumberWithPercentageSuffixFormat$annotations", "getWholeNumberWithPercentageSuffixFormat", "wholeNumberWithPercentageSuffixFormat$delegate", "integerFormat", "getIntegerFormat$annotations", "getIntegerFormat", "integerFormat$delegate", "getIntegerWithoutGroupingFormat", "integerDeltaFormat", "getIntegerDeltaFormat$annotations", "getIntegerDeltaFormat", "integerDeltaFormat$delegate", "integerDeltaWithoutGroupingFormat", "getIntegerDeltaWithoutGroupingFormat$annotations", "getIntegerDeltaWithoutGroupingFormat", "integerDeltaWithoutGroupingFormat$delegate", "sensitivityFormat", "getSensitivityFormat$annotations", "getSensitivityFormat", "sensitivityFormat$delegate", "defaultNumberFormat", "Ljava/lang/ThreadLocal;", "Lcom/robinhood/android/lib/formats/DefaultNumberFormatter;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lkotlin/Function1;", "Ljava/text/NumberFormat;", "init", "", "Lkotlin/ExtensionFunctionType;", "wrappedNumberFormat", "enableSubPennyFormatting", "", "forceSubPennyTrailingZeros", "wrapNumberFormatForDecimalPlaces", "format", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Formats {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    public static final Formats INSTANCE;

    /* renamed from: absPercentDeltaFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal absPercentDeltaFormat;

    /* renamed from: amountFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal amountFormat;

    /* renamed from: currencyDeltaFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal currencyDeltaFormat;

    /* renamed from: currencyFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal currencyFormat;

    /* renamed from: currencyFormatNoDecimals$delegate, reason: from kotlin metadata */
    private static final ThreadLocal currencyFormatNoDecimals;

    /* renamed from: fallbackCryptoPriceDeltaFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal fallbackCryptoPriceDeltaFormat;

    /* renamed from: fallbackCryptoPriceFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal fallbackCryptoPriceFormat;

    /* renamed from: hundredthDecimalPercentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal hundredthDecimalPercentFormat;

    /* renamed from: hundredthPercentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal hundredthPercentFormat;

    /* renamed from: integerDeltaFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal integerDeltaFormat;

    /* renamed from: integerDeltaWithoutGroupingFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal integerDeltaWithoutGroupingFormat;

    /* renamed from: integerFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal integerFormat;

    /* renamed from: interestRateFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal interestRateFormat;

    /* renamed from: interestRateFormatLongWithPercentage$delegate, reason: from kotlin metadata */
    private static final ThreadLocal interestRateFormatLongWithPercentage;

    /* renamed from: interestRateFormatShort$delegate, reason: from kotlin metadata */
    private static final ThreadLocal interestRateFormatShort;

    /* renamed from: interestRateFormatShortWithPercentage$delegate, reason: from kotlin metadata */
    private static final ThreadLocal interestRateFormatShortWithPercentage;

    /* renamed from: leadingZeroesHundredthPercentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal leadingZeroesHundredthPercentFormat;

    /* renamed from: lowPrecisionCurrencyFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal lowPrecisionCurrencyFormat;

    /* renamed from: lowPrecisionUnitFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal lowPrecisionUnitFormat;

    /* renamed from: noCurrencyFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal noCurrencyFormat;

    /* renamed from: noSignPercentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal noSignPercentFormat;

    /* renamed from: noSignPriceFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal noSignPriceFormat;

    /* renamed from: noSignWithHundredthDecimalPercentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal noSignWithHundredthDecimalPercentFormat;

    /* renamed from: noSymbolCurrencyFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal noSymbolCurrencyFormat;

    /* renamed from: noSymbolPercentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal noSymbolPercentFormat;

    /* renamed from: noSymbolWithHundredthDecimalPercentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal noSymbolWithHundredthDecimalPercentFormat;

    /* renamed from: percentDeltaFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal percentDeltaFormat;

    /* renamed from: percentDeltaWithHundredthDecimalFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal percentDeltaWithHundredthDecimalFormat;

    /* renamed from: percentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal percentFormat;

    /* renamed from: priceDeltaFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal priceDeltaFormat;

    /* renamed from: priceDeltaWithHundredthDecimalFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal priceDeltaWithHundredthDecimalFormat;

    /* renamed from: priceFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal priceFormat;

    /* renamed from: priceInCentsFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal priceInCentsFormat;

    /* renamed from: sensitivityFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal sensitivityFormat;

    /* renamed from: shareQuantityFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal shareQuantityFormat;

    /* renamed from: shareQuantityWithSignFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal shareQuantityWithSignFormat;

    /* renamed from: strikePriceFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal strikePriceFormat;

    /* renamed from: strikeValueFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal strikeValueFormat;

    /* renamed from: tenthPercentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal tenthPercentFormat;

    /* renamed from: userInputCurrencyFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal userInputCurrencyFormat;

    /* renamed from: valueFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal valueFormat;

    /* renamed from: wholeNumberAmountFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal wholeNumberAmountFormat;

    /* renamed from: wholeNumberCurrencyFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal wholeNumberCurrencyFormat;

    /* renamed from: wholeNumberPercentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal wholeNumberPercentFormat;

    /* renamed from: wholeNumberWithPercentageSuffixFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal wholeNumberWithPercentageSuffixFormat;

    @JvmStatic
    public static /* synthetic */ void getAbsPercentDeltaFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getAmountFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getCurrencyDeltaFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getCurrencyFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getCurrencyFormatNoDecimals$annotations() {
    }

    @Deprecated
    @JvmStatic
    public static /* synthetic */ void getFallbackCryptoPriceDeltaFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getFallbackCryptoPriceFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getHundredthDecimalPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getHundredthPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getIntegerDeltaFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getIntegerDeltaWithoutGroupingFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getIntegerFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getInterestRateFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getInterestRateFormatLongWithPercentage$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getInterestRateFormatShort$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getInterestRateFormatShortWithPercentage$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getLeadingZeroesHundredthPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getLowPrecisionCurrencyFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getLowPrecisionUnitFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getNoCurrencyFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getNoSignPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getNoSignPriceFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getNoSignWithHundredthDecimalPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getNoSymbolCurrencyFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getNoSymbolPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getNoSymbolWithHundredthDecimalPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getPercentDeltaFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getPercentDeltaWithHundredthDecimalFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getPriceDeltaFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getPriceDeltaWithHundredthDecimalFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getPriceFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getPriceInCentsFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getSensitivityFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getShareQuantityFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getShareQuantityWithSignFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getStrikePriceFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getStrikeValueFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getTenthPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getUserInputCurrencyFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getValueFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getWholeNumberAmountFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getWholeNumberCurrencyFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getWholeNumberPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getWholeNumberWithPercentageSuffixFormat$annotations() {
    }

    private Formats() {
    }

    static {
        Formats formats = INSTANCE;
        final boolean z = false;
        final boolean z2 = true;
        $$delegatedProperties = new KProperty[]{Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "strikePriceFormat", "getStrikePriceFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "strikeValueFormat", "getStrikeValueFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "priceFormat", "getPriceFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "priceInCentsFormat", "getPriceInCentsFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "valueFormat", "getValueFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "amountFormat", "getAmountFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "wholeNumberAmountFormat", "getWholeNumberAmountFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "shareQuantityFormat", "getShareQuantityFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "shareQuantityWithSignFormat", "getShareQuantityWithSignFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "lowPrecisionUnitFormat", "getLowPrecisionUnitFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "fallbackCryptoPriceFormat", "getFallbackCryptoPriceFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "priceDeltaFormat", "getPriceDeltaFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "priceDeltaWithHundredthDecimalFormat", "getPriceDeltaWithHundredthDecimalFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "fallbackCryptoPriceDeltaFormat", "getFallbackCryptoPriceDeltaFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "noSignPriceFormat", "getNoSignPriceFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "currencyFormat", "getCurrencyFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "currencyFormatNoDecimals", "getCurrencyFormatNoDecimals()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "noCurrencyFormat", "getNoCurrencyFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "noSymbolCurrencyFormat", "getNoSymbolCurrencyFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "wholeNumberCurrencyFormat", "getWholeNumberCurrencyFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "lowPrecisionCurrencyFormat", "getLowPrecisionCurrencyFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "currencyDeltaFormat", "getCurrencyDeltaFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "wholeNumberPercentFormat", "getWholeNumberPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "userInputCurrencyFormat", "getUserInputCurrencyFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "interestRateFormat", "getInterestRateFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "interestRateFormatShort", "getInterestRateFormatShort()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "interestRateFormatShortWithPercentage", "getInterestRateFormatShortWithPercentage()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "interestRateFormatLongWithPercentage", "getInterestRateFormatLongWithPercentage()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "tenthPercentFormat", "getTenthPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "hundredthPercentFormat", "getHundredthPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "percentFormat", "getPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "noSymbolPercentFormat", "getNoSymbolPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "noSymbolWithHundredthDecimalPercentFormat", "getNoSymbolWithHundredthDecimalPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "percentDeltaFormat", "getPercentDeltaFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "percentDeltaWithHundredthDecimalFormat", "getPercentDeltaWithHundredthDecimalFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "absPercentDeltaFormat", "getAbsPercentDeltaFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "noSignWithHundredthDecimalPercentFormat", "getNoSignWithHundredthDecimalPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "hundredthDecimalPercentFormat", "getHundredthDecimalPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "noSignPercentFormat", "getNoSignPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "leadingZeroesHundredthPercentFormat", "getLeadingZeroesHundredthPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "wholeNumberWithPercentageSuffixFormat", "getWholeNumberWithPercentageSuffixFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "integerFormat", "getIntegerFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "integerDeltaFormat", "getIntegerDeltaFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "integerDeltaWithoutGroupingFormat", "getIntegerDeltaWithoutGroupingFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formats, Formats.class, "sensitivityFormat", "getSensitivityFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0))};
        INSTANCE = new Formats();
        ThreadLocals threadLocals = ThreadLocals.INSTANCE;
        strikePriceFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$default$1
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(US);
                currencyInstance.setMinimumIntegerDigits(1);
                currencyInstance.setMinimumFractionDigits(0);
                currencyInstance.setMaximumFractionDigits(2);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    Currency currency = decimalFormat.getCurrency();
                    if (currency == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    decimalFormat.setNegativePrefix("-" + currency.getSymbol(US));
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(currencyInstance, z, z);
            }
        };
        strikeValueFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$default$2
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberFormat = NumberFormat.getInstance(US);
                numberFormat.setMinimumIntegerDigits(1);
                numberFormat.setMinimumFractionDigits(0);
                numberFormat.setMaximumFractionDigits(2);
                if (numberFormat instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                    decimalFormat.setNegativePrefix("-");
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(numberFormat, z, z);
            }
        };
        priceFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$default$3
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(US);
                currencyInstance.setMinimumFractionDigits(2);
                currencyInstance.setMaximumFractionDigits(4);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    Currency currency = decimalFormat.getCurrency();
                    if (currency == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    decimalFormat.setNegativePrefix("-" + currency.getSymbol(US));
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(currencyInstance, z, z);
            }
        };
        priceInCentsFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$1
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberInstance = NumberFormat.getNumberInstance(US);
                numberInstance.setMinimumFractionDigits(0);
                numberInstance.setMaximumFractionDigits(4);
                numberInstance.setRoundingMode(RoundingMode.HALF_UP);
                if (numberInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
                    decimalFormat.setNegativePrefix("-");
                    decimalFormat.setPositiveSuffix("¢");
                    decimalFormat.setNegativeSuffix("¢");
                }
                return new DefaultNumberFormatter(numberInstance);
            }
        };
        valueFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$default$4
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberFormat = NumberFormat.getInstance(US);
                numberFormat.setMinimumFractionDigits(2);
                numberFormat.setMaximumFractionDigits(4);
                if (numberFormat instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                    decimalFormat.setNegativePrefix("-");
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(numberFormat, z, z);
            }
        };
        amountFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$2
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(US);
                currencyInstance.setMinimumFractionDigits(2);
                currencyInstance.setMaximumFractionDigits(2);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                    Currency currency = decimalFormat.getCurrency();
                    if (currency == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    decimalFormat.setNegativePrefix("-" + currency.getSymbol(US));
                    decimalFormat.setNegativeSuffix("");
                }
                return new DefaultNumberFormatter(currencyInstance);
            }
        };
        wholeNumberAmountFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$default$5
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(US);
                currencyInstance.setMaximumFractionDigits(0);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                    Currency currency = decimalFormat.getCurrency();
                    if (currency == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    decimalFormat.setNegativePrefix("-" + currency.getSymbol(US));
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(currencyInstance, z, z);
            }
        };
        shareQuantityFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$3
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberFormat = NumberFormat.getInstance(US);
                numberFormat.setMinimumFractionDigits(0);
                numberFormat.setMaximumFractionDigits(6);
                return new DefaultNumberFormatter(numberFormat);
            }
        };
        shareQuantityWithSignFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$4
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberFormat = NumberFormat.getInstance(US);
                numberFormat.setMinimumFractionDigits(0);
                numberFormat.setMaximumFractionDigits(6);
                if (numberFormat instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                    decimalFormat.setPositivePrefix("+");
                    decimalFormat.setNegativePrefix("-");
                }
                return new DefaultNumberFormatter(numberFormat);
            }
        };
        lowPrecisionUnitFormat = new ThreadLocal<LowPrecisionUnitFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$lazy$1
            @Override // java.lang.ThreadLocal
            protected LowPrecisionUnitFormatter initialValue() {
                return new LowPrecisionUnitFormatter(null, false, 3, null);
            }
        };
        fallbackCryptoPriceFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$1
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(US);
                currencyInstance.setMinimumFractionDigits(2);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    Currency currency = decimalFormat.getCurrency();
                    if (currency == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    decimalFormat.setNegativePrefix("-" + currency.getSymbol(US));
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(currencyInstance, z2, z2);
            }
        };
        priceDeltaFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$default$6
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(US);
                currencyInstance.setMinimumFractionDigits(2);
                currencyInstance.setMaximumFractionDigits(4);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    Currency currency = decimalFormat.getCurrency();
                    if (currency == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    decimalFormat.setPositivePrefix("+" + currency.getSymbol(US));
                    decimalFormat.setPositiveSuffix("");
                    decimalFormat.setNegativePrefix("-" + currency.getSymbol(US));
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(currencyInstance, z, z);
            }
        };
        priceDeltaWithHundredthDecimalFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$5
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(US);
                currencyInstance.setMinimumFractionDigits(2);
                currencyInstance.setMaximumFractionDigits(2);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                    Currency currency = decimalFormat.getCurrency();
                    if (currency == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    decimalFormat.setPositivePrefix("+" + currency.getSymbol(US));
                    decimalFormat.setPositiveSuffix("");
                    decimalFormat.setNegativePrefix("-" + currency.getSymbol(US));
                    decimalFormat.setNegativeSuffix("");
                }
                return new DefaultNumberFormatter(currencyInstance);
            }
        };
        fallbackCryptoPriceDeltaFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$2
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(US);
                currencyInstance.setMinimumFractionDigits(2);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    Currency currency = decimalFormat.getCurrency();
                    if (currency == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    decimalFormat.setPositivePrefix("+" + currency.getSymbol(US));
                    decimalFormat.setPositiveSuffix("");
                    decimalFormat.setNegativePrefix("-" + currency.getSymbol(US));
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(currencyInstance, z2, z2);
            }
        };
        noSignPriceFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$default$7
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(US);
                currencyInstance.setMinimumFractionDigits(2);
                currencyInstance.setMaximumFractionDigits(4);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    Currency currency = decimalFormat.getCurrency();
                    if (currency == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    decimalFormat.setNegativePrefix(currency.getSymbol(US));
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(currencyInstance, z, z);
            }
        };
        currencyFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$default$8
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(US);
                currencyInstance.setMinimumFractionDigits(2);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    Currency currency = decimalFormat.getCurrency();
                    if (currency == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    decimalFormat.setNegativePrefix("-" + currency.getSymbol(US));
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(currencyInstance, z2, z);
            }
        };
        currencyFormatNoDecimals = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$default$9
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(US);
                currencyInstance.setMinimumFractionDigits(0);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    Currency currency = decimalFormat.getCurrency();
                    if (currency == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    decimalFormat.setNegativePrefix("-" + currency.getSymbol(US));
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(currencyInstance, z2, z);
            }
        };
        noCurrencyFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$default$10
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberInstance = NumberFormat.getNumberInstance(US);
                numberInstance.setMinimumFractionDigits(2);
                if (numberInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
                    decimalFormat.setNegativePrefix("-");
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(numberInstance, z2, z);
            }
        };
        noSymbolCurrencyFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$default$11
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(US);
                currencyInstance.setMinimumFractionDigits(2);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    decimalFormat.setPositivePrefix("");
                    decimalFormat.setPositiveSuffix("");
                    decimalFormat.setNegativePrefix("");
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(currencyInstance, z2, z);
            }
        };
        wholeNumberCurrencyFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$default$12
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(US);
                currencyInstance.setMaximumFractionDigits(0);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    Currency currency = decimalFormat.getCurrency();
                    if (currency == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    decimalFormat.setNegativePrefix("-" + currency.getSymbol(US));
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(currencyInstance, z, z);
            }
        };
        lowPrecisionCurrencyFormat = new ThreadLocal<LowPrecisionUnitFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$lazy$2
            @Override // java.lang.ThreadLocal
            protected LowPrecisionUnitFormatter initialValue() {
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
                Intrinsics.checkNotNullExpressionValue(currencyInstance, "getCurrencyInstance(...)");
                return new LowPrecisionUnitFormatter(currencyInstance, true);
            }
        };
        currencyDeltaFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$wrappedNumberFormat$default$13
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Formats formats2 = Formats.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(US);
                Intrinsics.checkNotNullExpressionValue(currencyInstance, "getCurrencyInstance(...)");
                currencyInstance.setMinimumFractionDigits(2);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    Currency currency = decimalFormat.getCurrency();
                    if (currency == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    decimalFormat.setPositivePrefix("+" + currency.getSymbol(US));
                    decimalFormat.setPositiveSuffix("");
                    decimalFormat.setNegativePrefix("-" + currency.getSymbol(US));
                    decimalFormat.setNegativeSuffix("");
                }
                return formats2.wrapNumberFormatForDecimalPlaces(currencyInstance, z2, z);
            }
        };
        wholeNumberPercentFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$6
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat percentInstance = NumberFormat.getPercentInstance(US);
                percentInstance.setRoundingMode(RoundingMode.HALF_UP);
                percentInstance.setMaximumFractionDigits(0);
                return new DefaultNumberFormatter(percentInstance);
            }
        };
        userInputCurrencyFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$lazy$3
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
                numberInstance.setGroupingUsed(true);
                if (numberInstance instanceof DecimalFormat) {
                    ((DecimalFormat) numberInstance).setParseBigDecimal(true);
                }
                Intrinsics.checkNotNullExpressionValue(numberInstance, "apply(...)");
                return new DefaultNumberFormatter(numberInstance);
            }
        };
        interestRateFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$7
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberFormat = NumberFormat.getInstance(US);
                numberFormat.setMinimumFractionDigits(2);
                return new DefaultNumberFormatter(numberFormat);
            }
        };
        interestRateFormatShort = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$8
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberFormat = NumberFormat.getInstance(US);
                numberFormat.setMinimumFractionDigits(0);
                numberFormat.setMaximumFractionDigits(2);
                return new DefaultNumberFormatter(numberFormat);
            }
        };
        interestRateFormatShortWithPercentage = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$9
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberFormat = NumberFormat.getInstance(US);
                numberFormat.setMinimumFractionDigits(0);
                numberFormat.setMaximumFractionDigits(2);
                if (numberFormat instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                    decimalFormat.setPositiveSuffix("%");
                    decimalFormat.setNegativeSuffix("%");
                }
                return new DefaultNumberFormatter(numberFormat);
            }
        };
        interestRateFormatLongWithPercentage = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$10
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberFormat = NumberFormat.getInstance(US);
                numberFormat.setMinimumFractionDigits(0);
                numberFormat.setMaximumFractionDigits(4);
                if (numberFormat instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                    decimalFormat.setPositiveSuffix("%");
                    decimalFormat.setNegativeSuffix("%");
                }
                return new DefaultNumberFormatter(numberFormat);
            }
        };
        tenthPercentFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$11
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat percentInstance = NumberFormat.getPercentInstance(US);
                percentInstance.setRoundingMode(RoundingMode.HALF_UP);
                percentInstance.setMinimumFractionDigits(1);
                percentInstance.setMaximumFractionDigits(1);
                return new DefaultNumberFormatter(percentInstance);
            }
        };
        hundredthPercentFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$12
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat percentInstance = NumberFormat.getPercentInstance(US);
                percentInstance.setRoundingMode(RoundingMode.HALF_UP);
                percentInstance.setMinimumFractionDigits(2);
                percentInstance.setMaximumFractionDigits(2);
                return new DefaultNumberFormatter(percentInstance);
            }
        };
        percentFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$13
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat percentInstance = NumberFormat.getPercentInstance(US);
                percentInstance.setMaximumFractionDigits(2);
                return new DefaultNumberFormatter(percentInstance);
            }
        };
        noSymbolPercentFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$14
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberFormat = NumberFormat.getInstance(US);
                numberFormat.setMaximumFractionDigits(2);
                return new DefaultNumberFormatter(numberFormat);
            }
        };
        noSymbolWithHundredthDecimalPercentFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$15
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberFormat = NumberFormat.getInstance(US);
                numberFormat.setMaximumFractionDigits(2);
                numberFormat.setMinimumFractionDigits(2);
                return new DefaultNumberFormatter(numberFormat);
            }
        };
        percentDeltaFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$16
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat percentInstance = NumberFormat.getPercentInstance(US);
                percentInstance.setMaximumFractionDigits(2);
                if (percentInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) percentInstance;
                    decimalFormat.setPositivePrefix("+");
                    decimalFormat.setPositiveSuffix("%");
                    decimalFormat.setNegativePrefix("-");
                    decimalFormat.setNegativeSuffix("%");
                }
                return new DefaultNumberFormatter(percentInstance);
            }
        };
        percentDeltaWithHundredthDecimalFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$17
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat percentInstance = NumberFormat.getPercentInstance(US);
                percentInstance.setMaximumFractionDigits(2);
                percentInstance.setMinimumFractionDigits(2);
                if (percentInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) percentInstance;
                    decimalFormat.setPositivePrefix("+");
                    decimalFormat.setPositiveSuffix("%");
                    decimalFormat.setNegativePrefix("-");
                    decimalFormat.setNegativeSuffix("%");
                }
                return new DefaultNumberFormatter(percentInstance);
            }
        };
        absPercentDeltaFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$18
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat percentInstance = NumberFormat.getPercentInstance(US);
                percentInstance.setMaximumFractionDigits(2);
                if (percentInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) percentInstance;
                    decimalFormat.setPositivePrefix("");
                    decimalFormat.setPositiveSuffix("%");
                    decimalFormat.setNegativePrefix("-");
                    decimalFormat.setNegativeSuffix("%");
                }
                return new DefaultNumberFormatter(percentInstance);
            }
        };
        noSignWithHundredthDecimalPercentFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$19
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat percentInstance = NumberFormat.getPercentInstance(US);
                percentInstance.setMinimumFractionDigits(2);
                percentInstance.setMaximumFractionDigits(2);
                percentInstance.setRoundingMode(RoundingMode.HALF_UP);
                if (percentInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) percentInstance;
                    decimalFormat.setPositivePrefix("");
                    decimalFormat.setPositiveSuffix("%");
                    decimalFormat.setNegativePrefix("");
                    decimalFormat.setNegativeSuffix("%");
                }
                return new DefaultNumberFormatter(percentInstance);
            }
        };
        hundredthDecimalPercentFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$20
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat percentInstance = NumberFormat.getPercentInstance(US);
                percentInstance.setMinimumFractionDigits(2);
                percentInstance.setMaximumFractionDigits(2);
                percentInstance.setRoundingMode(RoundingMode.HALF_UP);
                if (percentInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) percentInstance;
                    decimalFormat.setPositivePrefix("");
                    decimalFormat.setPositiveSuffix("%");
                    decimalFormat.setNegativePrefix("-");
                    decimalFormat.setNegativeSuffix("%");
                }
                return new DefaultNumberFormatter(percentInstance);
            }
        };
        noSignPercentFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$21
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat percentInstance = NumberFormat.getPercentInstance(US);
                percentInstance.setMaximumFractionDigits(2);
                if (percentInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) percentInstance;
                    decimalFormat.setPositivePrefix("");
                    decimalFormat.setPositiveSuffix("%");
                    decimalFormat.setNegativePrefix("");
                    decimalFormat.setNegativeSuffix("%");
                }
                return new DefaultNumberFormatter(percentInstance);
            }
        };
        leadingZeroesHundredthPercentFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$22
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberInstance = NumberFormat.getNumberInstance(US);
                numberInstance.setMinimumFractionDigits(2);
                numberInstance.setMaximumFractionDigits(2);
                numberInstance.setMinimumIntegerDigits(1);
                if (numberInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
                    decimalFormat.setPositiveSuffix("%");
                    decimalFormat.setNegativeSuffix("%");
                }
                return new DefaultNumberFormatter(numberInstance);
            }
        };
        wholeNumberWithPercentageSuffixFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$23
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberInstance = NumberFormat.getNumberInstance(US);
                numberInstance.setMaximumFractionDigits(0);
                if (numberInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
                    decimalFormat.setPositiveSuffix("%");
                    decimalFormat.setNegativeSuffix("%");
                }
                return new DefaultNumberFormatter(numberInstance);
            }
        };
        integerFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$24
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberInstance = NumberFormat.getNumberInstance(US);
                numberInstance.setMaximumFractionDigits(0);
                return new DefaultNumberFormatter(numberInstance);
            }
        };
        integerDeltaFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$25
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberInstance = NumberFormat.getNumberInstance(US);
                numberInstance.setMaximumFractionDigits(0);
                if (numberInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
                    decimalFormat.setPositivePrefix("+");
                    decimalFormat.setNegativePrefix("-");
                }
                return new DefaultNumberFormatter(numberInstance);
            }
        };
        integerDeltaWithoutGroupingFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$26
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberInstance = NumberFormat.getNumberInstance(US);
                numberInstance.setMaximumFractionDigits(0);
                numberInstance.setGroupingUsed(false);
                if (numberInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
                    decimalFormat.setPositivePrefix("+");
                    decimalFormat.setNegativePrefix("-");
                }
                return new DefaultNumberFormatter(numberInstance);
            }
        };
        sensitivityFormat = new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$special$$inlined$defaultNumberFormat$27
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                NumberFormat numberInstance = NumberFormat.getNumberInstance(US);
                numberInstance.setMaximumFractionDigits(4);
                numberInstance.setMinimumFractionDigits(4);
                numberInstance.setMinimumIntegerDigits(1);
                return new DefaultNumberFormatter(numberInstance);
            }
        };
    }

    public static final NumberFormatter getStrikePriceFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(strikePriceFormat, INSTANCE, $$delegatedProperties[0]);
    }

    public static final NumberFormatter getStrikeValueFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(strikeValueFormat, INSTANCE, $$delegatedProperties[1]);
    }

    public static final NumberFormatter getPriceFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(priceFormat, INSTANCE, $$delegatedProperties[2]);
    }

    public static final NumberFormatter getPriceInCentsFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(priceInCentsFormat, INSTANCE, $$delegatedProperties[3]);
    }

    public static final NumberFormatter getValueFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(valueFormat, INSTANCE, $$delegatedProperties[4]);
    }

    public static final NumberFormatter getAmountFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(amountFormat, INSTANCE, $$delegatedProperties[5]);
    }

    public static final NumberFormatter getWholeNumberAmountFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(wholeNumberAmountFormat, INSTANCE, $$delegatedProperties[6]);
    }

    public static final NumberFormatter getShareQuantityFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(shareQuantityFormat, INSTANCE, $$delegatedProperties[7]);
    }

    public static final NumberFormatter getShareQuantityWithSignFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(shareQuantityWithSignFormat, INSTANCE, $$delegatedProperties[8]);
    }

    public static /* synthetic */ NumberFormatter getNotionalShareQuantityFormat$default(Locale locale, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            locale = Locale.US;
        }
        return getNotionalShareQuantityFormat(locale, i);
    }

    @JvmStatic
    public static final NumberFormatter getNotionalShareQuantityFormat(Locale locale, int maximumDigits) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.setMinimumFractionDigits(0);
        numberFormat.setMaximumFractionDigits(maximumDigits);
        numberFormat.setRoundingMode(RoundingMode.FLOOR);
        Intrinsics.checkNotNullExpressionValue(numberFormat, "apply(...)");
        return new DefaultNumberFormatter(numberFormat);
    }

    public static final NumberFormatter getLowPrecisionUnitFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(lowPrecisionUnitFormat, INSTANCE, $$delegatedProperties[9]);
    }

    public static final NumberFormatter getFallbackCryptoPriceFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(fallbackCryptoPriceFormat, INSTANCE, $$delegatedProperties[10]);
    }

    public static final NumberFormatter getPriceDeltaFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(priceDeltaFormat, INSTANCE, $$delegatedProperties[11]);
    }

    public static final NumberFormatter getPriceDeltaWithHundredthDecimalFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(priceDeltaWithHundredthDecimalFormat, INSTANCE, $$delegatedProperties[12]);
    }

    public static final NumberFormatter getFallbackCryptoPriceDeltaFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(fallbackCryptoPriceDeltaFormat, INSTANCE, $$delegatedProperties[13]);
    }

    public static final NumberFormatter getNoSignPriceFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(noSignPriceFormat, INSTANCE, $$delegatedProperties[14]);
    }

    public static final NumberFormatter getCurrencyFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(currencyFormat, INSTANCE, $$delegatedProperties[15]);
    }

    public static final NumberFormatter getCurrencyFormatNoDecimals() {
        return (NumberFormatter) ThreadLocalsKt.getValue(currencyFormatNoDecimals, INSTANCE, $$delegatedProperties[16]);
    }

    public static final NumberFormatter getNoCurrencyFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(noCurrencyFormat, INSTANCE, $$delegatedProperties[17]);
    }

    public static final NumberFormatter getNoSymbolCurrencyFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(noSymbolCurrencyFormat, INSTANCE, $$delegatedProperties[18]);
    }

    public static final NumberFormatter getWholeNumberCurrencyFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(wholeNumberCurrencyFormat, INSTANCE, $$delegatedProperties[19]);
    }

    public static final NumberFormatter getLowPrecisionCurrencyFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(lowPrecisionCurrencyFormat, INSTANCE, $$delegatedProperties[20]);
    }

    public static final NumberFormatter getCurrencyDeltaFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(currencyDeltaFormat, INSTANCE, $$delegatedProperties[21]);
    }

    @JvmStatic
    public static final NumberFormatter getWholeNumberCurrencyDeltaFormat() {
        Locale locale = Locale.US;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setRoundingMode(RoundingMode.HALF_UP);
        currencyInstance.setMaximumFractionDigits(0);
        if (currencyInstance instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
            Currency currency = decimalFormat.getCurrency();
            if (currency == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            decimalFormat.setNegativePrefix("-" + currency.getSymbol(locale));
            decimalFormat.setNegativeSuffix("");
            decimalFormat.setPositivePrefix("+" + currency.getSymbol(locale));
            decimalFormat.setPositiveSuffix("");
        }
        return new DefaultNumberFormatter(currencyInstance) { // from class: com.robinhood.android.lib.formats.Formats.getWholeNumberCurrencyDeltaFormat.1
            final /* synthetic */ NumberFormat $formatter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(currencyInstance);
                this.$formatter = currencyInstance;
                Intrinsics.checkNotNull(currencyInstance);
            }

            @Override // com.robinhood.android.lib.formats.DefaultNumberFormatter, com.robinhood.android.lib.formats.NumberFormatter
            public String format(Number number) {
                Intrinsics.checkNotNullParameter(number, "number");
                String str = this.$formatter.format(number);
                Currency currency2 = this.$formatter.getCurrency();
                if (currency2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String symbol = currency2.getSymbol(Locale.US);
                if (BigDecimals7.toBigDecimal(number).signum() == 0) {
                    return symbol + "0";
                }
                if (Intrinsics.areEqual(str, "+" + symbol + "0")) {
                    return symbol + "0";
                }
                if (!Intrinsics.areEqual(str, "-" + symbol + "0")) {
                    Intrinsics.checkNotNull(str);
                    return str;
                }
                return symbol + "0";
            }
        };
    }

    public static /* synthetic */ NumberFormatter currencyDeltaFourMaxFractionalDigitsFormat$default(int i, Locale locale, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            locale = Locale.US;
        }
        return currencyDeltaFourMaxFractionalDigitsFormat(i, locale);
    }

    @JvmStatic
    public static final NumberFormatter currencyDeltaFourMaxFractionalDigitsFormat(int minimumFractionalDigits, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        if (currencyInstance instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            Currency currency = decimalFormat.getCurrency();
            if (currency == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            decimalFormat.setPositivePrefix("+" + currency.getSymbol(locale));
            decimalFormat.setPositiveSuffix("");
            decimalFormat.setNegativePrefix("-" + currency.getSymbol(locale));
            decimalFormat.setNegativeSuffix("");
        }
        return new DefaultNumberFormatter(minimumFractionalDigits, currencyInstance) { // from class: com.robinhood.android.lib.formats.Formats.currencyDeltaFourMaxFractionalDigitsFormat.1
            final /* synthetic */ NumberFormat $formatter;
            private int minimumFractionDigits;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(currencyInstance);
                this.$formatter = currencyInstance;
                Intrinsics.checkNotNull(currencyInstance);
                this.minimumFractionDigits = minimumFractionalDigits;
            }

            @Override // com.robinhood.android.lib.formats.DefaultNumberFormatter, com.robinhood.android.lib.formats.NumberFormatter
            public int getMinimumFractionDigits() {
                return this.minimumFractionDigits;
            }

            @Override // com.robinhood.android.lib.formats.DefaultNumberFormatter, com.robinhood.android.lib.formats.NumberFormatter
            public void setMinimumFractionDigits(int i) {
                this.minimumFractionDigits = i;
            }

            @Override // com.robinhood.android.lib.formats.DefaultNumberFormatter, com.robinhood.android.lib.formats.NumberFormatter
            public String format(Number number) {
                double dDoubleValue;
                Intrinsics.checkNotNullParameter(number, "number");
                BigDecimal bigDecimal = BigDecimals7.toBigDecimal(number);
                boolean z = bigDecimal.signum() == -1;
                BigDecimal currencyScale = BigDecimals7.setCurrencyScale(bigDecimal, RoundingMode.HALF_UP, true);
                setMaximumFractionalDigits(currencyScale.scale());
                if (z && BigDecimals7.m2977eq(currencyScale, BigDecimal.ZERO)) {
                    dDoubleValue = -currencyScale.doubleValue();
                } else {
                    dDoubleValue = currencyScale.doubleValue();
                }
                String str = this.$formatter.format(dDoubleValue);
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            }
        };
    }

    public static final NumberFormatter getWholeNumberPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(wholeNumberPercentFormat, INSTANCE, $$delegatedProperties[22]);
    }

    public static final NumberFormatter getUserInputCurrencyFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(userInputCurrencyFormat, INSTANCE, $$delegatedProperties[23]);
    }

    public static final NumberFormatter getInterestRateFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(interestRateFormat, INSTANCE, $$delegatedProperties[24]);
    }

    public static final NumberFormatter getInterestRateFormatShort() {
        return (NumberFormatter) ThreadLocalsKt.getValue(interestRateFormatShort, INSTANCE, $$delegatedProperties[25]);
    }

    public static final NumberFormatter getInterestRateFormatShortWithPercentage() {
        return (NumberFormatter) ThreadLocalsKt.getValue(interestRateFormatShortWithPercentage, INSTANCE, $$delegatedProperties[26]);
    }

    public static final NumberFormatter getInterestRateFormatLongWithPercentage() {
        return (NumberFormatter) ThreadLocalsKt.getValue(interestRateFormatLongWithPercentage, INSTANCE, $$delegatedProperties[27]);
    }

    public static final NumberFormatter getTenthPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(tenthPercentFormat, INSTANCE, $$delegatedProperties[28]);
    }

    public static final NumberFormatter getHundredthPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(hundredthPercentFormat, INSTANCE, $$delegatedProperties[29]);
    }

    public static final NumberFormatter getPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(percentFormat, INSTANCE, $$delegatedProperties[30]);
    }

    public static /* synthetic */ NumberFormatter getDecimalPercentageWithoutTrailingZeroFormat$default(int i, Locale locale, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            locale = Locale.US;
        }
        return getDecimalPercentageWithoutTrailingZeroFormat(i, locale);
    }

    @JvmStatic
    public static final NumberFormatter getDecimalPercentageWithoutTrailingZeroFormat(int maximumFractionalDigits, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        NumberFormat percentInstance = NumberFormat.getPercentInstance(locale);
        percentInstance.setMinimumFractionDigits(0);
        percentInstance.setMaximumFractionDigits(maximumFractionalDigits);
        percentInstance.setRoundingMode(RoundingMode.HALF_UP);
        return new DefaultNumberFormatter(maximumFractionalDigits, percentInstance) { // from class: com.robinhood.android.lib.formats.Formats.getDecimalPercentageWithoutTrailingZeroFormat.1
            final /* synthetic */ NumberFormat $formatter;
            final /* synthetic */ int $maximumFractionalDigits;
            private int maximumFractionalDigits;
            private int minimumFractionDigits;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(percentInstance);
                this.$maximumFractionalDigits = maximumFractionalDigits;
                this.$formatter = percentInstance;
                Intrinsics.checkNotNull(percentInstance);
                this.maximumFractionalDigits = maximumFractionalDigits;
            }

            @Override // com.robinhood.android.lib.formats.DefaultNumberFormatter, com.robinhood.android.lib.formats.NumberFormatter
            public int getMaximumFractionalDigits() {
                return this.maximumFractionalDigits;
            }

            @Override // com.robinhood.android.lib.formats.DefaultNumberFormatter, com.robinhood.android.lib.formats.NumberFormatter
            public void setMaximumFractionalDigits(int i) {
                this.maximumFractionalDigits = i;
            }

            @Override // com.robinhood.android.lib.formats.DefaultNumberFormatter, com.robinhood.android.lib.formats.NumberFormatter
            public int getMinimumFractionDigits() {
                return this.minimumFractionDigits;
            }

            @Override // com.robinhood.android.lib.formats.DefaultNumberFormatter, com.robinhood.android.lib.formats.NumberFormatter
            public void setMinimumFractionDigits(int i) {
                this.minimumFractionDigits = i;
            }

            @Override // com.robinhood.android.lib.formats.DefaultNumberFormatter, com.robinhood.android.lib.formats.NumberFormatter
            public String format(Number number) {
                Intrinsics.checkNotNullParameter(number, "number");
                String str = this.$formatter.format(number);
                if (BigDecimals7.toBigDecimal(number).signum() == 0) {
                    return "0%";
                }
                if (Intrinsics.areEqual(str, "-0%")) {
                    return "-0." + StringsKt.repeat("0", this.$maximumFractionalDigits) + "%";
                }
                if (!Intrinsics.areEqual(str, "0%")) {
                    Intrinsics.checkNotNull(str);
                    return str;
                }
                return "0." + StringsKt.repeat("0", this.$maximumFractionalDigits) + "%";
            }
        };
    }

    public static final NumberFormatter getNoSymbolPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(noSymbolPercentFormat, INSTANCE, $$delegatedProperties[31]);
    }

    public static final NumberFormatter getNoSymbolWithHundredthDecimalPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(noSymbolWithHundredthDecimalPercentFormat, INSTANCE, $$delegatedProperties[32]);
    }

    public static final NumberFormatter getPercentDeltaFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(percentDeltaFormat, INSTANCE, $$delegatedProperties[33]);
    }

    public static final NumberFormatter getPercentDeltaWithHundredthDecimalFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(percentDeltaWithHundredthDecimalFormat, INSTANCE, $$delegatedProperties[34]);
    }

    /* renamed from: getPercentDeltaWithHundredthDecimalWithoutZeroPrefixFormat$default */
    public static /* synthetic */ NumberFormatter m2149x4a8e6258(Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.US;
        }
        return getPercentDeltaWithHundredthDecimalWithoutZeroPrefixFormat(locale);
    }

    @JvmStatic
    public static final NumberFormatter getPercentDeltaWithHundredthDecimalWithoutZeroPrefixFormat(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        NumberFormat percentInstance = NumberFormat.getPercentInstance(locale);
        percentInstance.setMinimumFractionDigits(2);
        percentInstance.setMaximumFractionDigits(2);
        percentInstance.setRoundingMode(RoundingMode.HALF_UP);
        if (percentInstance instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) percentInstance;
            decimalFormat.setPositivePrefix("+");
            decimalFormat.setPositiveSuffix("%");
            decimalFormat.setNegativePrefix("-");
            decimalFormat.setNegativeSuffix("%");
        }
        return new DefaultNumberFormatter(percentInstance) { // from class: com.robinhood.android.lib.formats.Formats.getPercentDeltaWithHundredthDecimalWithoutZeroPrefixFormat.1
            final /* synthetic */ NumberFormat $formatter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(percentInstance);
                this.$formatter = percentInstance;
                Intrinsics.checkNotNull(percentInstance);
            }

            @Override // com.robinhood.android.lib.formats.DefaultNumberFormatter, com.robinhood.android.lib.formats.NumberFormatter
            public String format(Number number) {
                Intrinsics.checkNotNullParameter(number, "number");
                if (BigDecimals7.toBigDecimal(number).signum() == 0) {
                    return "0.00%";
                }
                String str = this.$formatter.format(number);
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            }
        };
    }

    public static final NumberFormatter getAbsPercentDeltaFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(absPercentDeltaFormat, INSTANCE, $$delegatedProperties[35]);
    }

    public static final NumberFormatter getNoSignWithHundredthDecimalPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(noSignWithHundredthDecimalPercentFormat, INSTANCE, $$delegatedProperties[36]);
    }

    public static final NumberFormatter getHundredthDecimalPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(hundredthDecimalPercentFormat, INSTANCE, $$delegatedProperties[37]);
    }

    public static final NumberFormatter getNoSignPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(noSignPercentFormat, INSTANCE, $$delegatedProperties[38]);
    }

    public static final NumberFormatter getLeadingZeroesHundredthPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(leadingZeroesHundredthPercentFormat, INSTANCE, $$delegatedProperties[39]);
    }

    public static final NumberFormatter getWholeNumberWithPercentageSuffixFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(wholeNumberWithPercentageSuffixFormat, INSTANCE, $$delegatedProperties[40]);
    }

    public static final NumberFormatter getIntegerFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(integerFormat, INSTANCE, $$delegatedProperties[41]);
    }

    public static /* synthetic */ NumberFormatter getIntegerWithoutGroupingFormat$default(Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.US;
        }
        return getIntegerWithoutGroupingFormat(locale);
    }

    @JvmStatic
    public static final NumberFormatter getIntegerWithoutGroupingFormat(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        numberInstance.setMaximumFractionDigits(0);
        numberInstance.setGroupingUsed(false);
        return new DefaultNumberFormatter(numberInstance) { // from class: com.robinhood.android.lib.formats.Formats.getIntegerWithoutGroupingFormat.1
            final /* synthetic */ NumberFormat $formatter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(numberInstance);
                this.$formatter = numberInstance;
                Intrinsics.checkNotNull(numberInstance);
            }

            @Override // com.robinhood.android.lib.formats.DefaultNumberFormatter, com.robinhood.android.lib.formats.NumberFormatter
            public String format(Number number) {
                Intrinsics.checkNotNullParameter(number, "number");
                BigDecimal scale = BigDecimals7.toBigDecimal(number).setScale(0, RoundingMode.HALF_DOWN);
                if (scale.signum() == 0) {
                    String str = this.$formatter.format(scale);
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    return str;
                }
                String str2 = this.$formatter.format(number);
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                return str2;
            }
        };
    }

    public static final NumberFormatter getIntegerDeltaFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(integerDeltaFormat, INSTANCE, $$delegatedProperties[42]);
    }

    public static final NumberFormatter getIntegerDeltaWithoutGroupingFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(integerDeltaWithoutGroupingFormat, INSTANCE, $$delegatedProperties[43]);
    }

    public static final NumberFormatter getSensitivityFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(sensitivityFormat, INSTANCE, $$delegatedProperties[44]);
    }

    private final ThreadLocal<DefaultNumberFormatter> defaultNumberFormat(final Function1<? super Locale, ? extends NumberFormat> create, final Function1<? super NumberFormat, Unit> init) {
        ThreadLocals threadLocals = ThreadLocals.INSTANCE;
        return new ThreadLocal<DefaultNumberFormatter>() { // from class: com.robinhood.android.lib.formats.Formats$defaultNumberFormat$$inlined$lazy$1
            @Override // java.lang.ThreadLocal
            protected DefaultNumberFormatter initialValue() {
                Function1 function1 = create;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                Object objInvoke = function1.invoke(US);
                init.invoke(objInvoke);
                return new DefaultNumberFormatter((NumberFormat) objInvoke);
            }
        };
    }

    private final ThreadLocal<DefaultNumberFormatter> wrappedNumberFormat(Function1<? super Locale, ? extends NumberFormat> create, boolean enableSubPennyFormatting, boolean forceSubPennyTrailingZeros, Function1<? super NumberFormat, Unit> init) {
        ThreadLocals threadLocals = ThreadLocals.INSTANCE;
        return new Formats$wrappedNumberFormat$$inlined$lazy$1(create, init, enableSubPennyFormatting, forceSubPennyTrailingZeros);
    }

    static /* synthetic */ ThreadLocal wrappedNumberFormat$default(Formats formats, Function1 function1, boolean z, boolean z2, Function1 function12, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        ThreadLocals threadLocals = ThreadLocals.INSTANCE;
        return new Formats$wrappedNumberFormat$$inlined$lazy$1(function1, function12, z, z2);
    }

    static /* synthetic */ DefaultNumberFormatter wrapNumberFormatForDecimalPlaces$default(Formats formats, NumberFormat numberFormat, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return formats.wrapNumberFormatForDecimalPlaces(numberFormat, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DefaultNumberFormatter wrapNumberFormatForDecimalPlaces(final NumberFormat format2, final boolean enableSubPennyFormatting, final boolean forceSubPennyTrailingZeros) {
        return new DefaultNumberFormatter(new NumberFormat() { // from class: com.robinhood.android.lib.formats.Formats$wrapNumberFormatForDecimalPlaces$wrappedFormatter$1
            @Override // java.text.NumberFormat
            public StringBuffer format(double value, StringBuffer buffer, FieldPosition field) {
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                Intrinsics.checkNotNullParameter(field, "field");
                if (enableSubPennyFormatting && value <= 1.0d && value >= -1.0d) {
                    format2.setMaximumFractionDigits(6);
                    if (forceSubPennyTrailingZeros) {
                        format2.setMinimumFractionDigits(6);
                    }
                } else if (value <= 1.0d && value >= -1.0d) {
                    format2.setMaximumFractionDigits(4);
                } else {
                    format2.setMaximumFractionDigits(2);
                }
                StringBuffer stringBuffer = format2.format(value, buffer, field);
                Intrinsics.checkNotNullExpressionValue(stringBuffer, "format(...)");
                return stringBuffer;
            }

            @Override // java.text.NumberFormat
            public StringBuffer format(long value, StringBuffer buffer, FieldPosition field) {
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                Intrinsics.checkNotNullParameter(field, "field");
                if (enableSubPennyFormatting && value <= 1 && value >= -1) {
                    format2.setMaximumFractionDigits(6);
                    if (forceSubPennyTrailingZeros) {
                        format2.setMinimumFractionDigits(6);
                    }
                } else if (value <= 1 && value >= -1) {
                    format2.setMaximumFractionDigits(4);
                } else {
                    format2.setMaximumFractionDigits(2);
                }
                StringBuffer stringBuffer = format2.format(value, buffer, field);
                Intrinsics.checkNotNullExpressionValue(stringBuffer, "format(...)");
                return stringBuffer;
            }

            @Override // java.text.NumberFormat
            public Number parse(String string2, ParsePosition position) {
                Intrinsics.checkNotNullParameter(string2, "string");
                Intrinsics.checkNotNullParameter(position, "position");
                return format2.parse(string2, position);
            }
        });
    }
}
