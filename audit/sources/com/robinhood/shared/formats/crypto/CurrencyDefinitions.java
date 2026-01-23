package com.robinhood.shared.formats.crypto;

import android.icu.number.Notation;
import android.icu.number.NumberFormatter;
import android.icu.number.Precision;
import android.os.Build;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.models.crypto.CurrencyDefinition;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatCache;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatModel;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: CurrencyDefinitions.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u007f\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0002\u0010\u0012\u001a&\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0012\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0001\"\u0015\u0010\u0016\u001a\u00020\u0017*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u001a\u001a\u00020\u0017*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019\"\u0015\u0010\u001c\u001a\u00020\u0017*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019\"\u0015\u0010\u001e\u001a\u00020\u001f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0015\u0010\"\u001a\u00020\u000b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0016\u0010%\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b&\u0010'¨\u0006("}, m3636d2 = {"formatCurrency", "", "Lcom/robinhood/models/crypto/CurrencyDefinition;", "amount", "Ljava/math/BigDecimal;", "isWithCurrencySymbol", "", "isDecimalSeparatorAlwaysShown", "roundingMode", "Ljava/math/RoundingMode;", "minimumFractionDigits", "", "maximumFractionDigitsOverride", "isSignedAlwaysShown", "showPlusSign", "showMinusSign", "lowPrecision", "smallAmountFormatter", "(Lcom/robinhood/models/crypto/CurrencyDefinition;Ljava/math/BigDecimal;ZZLjava/math/RoundingMode;ILjava/lang/Integer;Ljava/lang/Boolean;ZZZZ)Ljava/lang/String;", "formatCurrencyWithLowPrecision", "formatAmountStringWithCurrency", "amountInString", "cryptoFiatPriceFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getCryptoFiatPriceFormatter", "(Lcom/robinhood/models/crypto/CurrencyDefinition;)Lcom/robinhood/android/lib/formats/NumberFormatter;", "cryptoFiatPriceDeltaFormatter", "getCryptoFiatPriceDeltaFormatter", "cryptoFiatPriceFormatterForTicker", "getCryptoFiatPriceFormatterForTicker", "currencySymbolPosition", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "getCurrencySymbolPosition", "(Lcom/robinhood/models/crypto/CurrencyDefinition;)Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "minFractionDigitsForCurrency", "getMinFractionDigitsForCurrency", "(Lcom/robinhood/models/crypto/CurrencyDefinition;)I", "DEFAULT_MIN_FRACTIONAL_DIGITS", "getDEFAULT_MIN_FRACTIONAL_DIGITS$annotations", "()V", "lib-formats-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.formats.crypto.CurrencyDefinitionsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CurrencyDefinitions {
    public static final int DEFAULT_MIN_FRACTIONAL_DIGITS = 2;

    public static /* synthetic */ void getDEFAULT_MIN_FRACTIONAL_DIGITS$annotations() {
    }

    public static /* synthetic */ String formatCurrency$default(CurrencyDefinition currencyDefinition, BigDecimal bigDecimal, boolean z, boolean z2, RoundingMode roundingMode, int i, Integer num, Boolean bool, boolean z3, boolean z4, boolean z5, boolean z6, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            roundingMode = RoundingMode.HALF_DOWN;
        }
        if ((i2 & 16) != 0) {
            i = 2;
        }
        if ((i2 & 32) != 0) {
            num = null;
        }
        if ((i2 & 64) != 0) {
            bool = null;
        }
        if ((i2 & 128) != 0) {
            z3 = false;
        }
        if ((i2 & 256) != 0) {
            z4 = false;
        }
        if ((i2 & 512) != 0) {
            z5 = false;
        }
        if ((i2 & 1024) != 0) {
            z6 = false;
        }
        return formatCurrency(currencyDefinition, bigDecimal, z, z2, roundingMode, i, num, bool, z3, z4, z5, z6);
    }

    public static final String formatCurrency(CurrencyDefinition currencyDefinition, BigDecimal amount, boolean z, boolean z2, RoundingMode roundingMode, int i, Integer num, Boolean bool, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(currencyDefinition, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        return CurrencyFormatCache.getCurrencyFormat(CurrencyFormatModel.Companion.fromCurrencyAmount$default(CurrencyFormatModel.INSTANCE, currencyDefinition, amount, z, false, i, RangesKt.coerceAtLeast(num != null ? num.intValue() : currencyDefinition.getDecimalScale(), i), false, z2, roundingMode, null, false, bool, z3, z4, z5, z6, 1608, null)).format(amount);
    }

    public static /* synthetic */ String formatCurrencyWithLowPrecision$default(CurrencyDefinition currencyDefinition, BigDecimal bigDecimal, boolean z, RoundingMode roundingMode, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.HALF_DOWN;
        }
        return formatCurrencyWithLowPrecision(currencyDefinition, bigDecimal, z, roundingMode);
    }

    public static final String formatCurrencyWithLowPrecision(CurrencyDefinition currencyDefinition, BigDecimal amount, boolean z, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(currencyDefinition, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        int i = Build.VERSION.SDK_INT;
        boolean z2 = false;
        CurrencyFormatModel currencyFormatModelFromCurrencyAmount$default = CurrencyFormatModel.Companion.fromCurrencyAmount$default(CurrencyFormatModel.INSTANCE, currencyDefinition, amount, z, false, 0, 0, false, false, roundingMode, null, false, null, false, false, i < 30, false, 48888, null);
        if (i >= 30) {
            Object objNotation = CurrencyDefinitionsKt$$ExternalSyntheticApiModelOutline3.m2817m(NumberFormatter.withLocale(currencyFormatModelFromCurrencyAmount$default.getLocale()).symbols(CurrencyFormatCache.getDecimalFormatSymbols(currencyFormatModelFromCurrencyAmount$default))).notation(CurrencyDefinitionsKt$$ExternalSyntheticApiModelOutline11.m2813m(Notation.compactShort()));
            if (z && currencyDefinition.toIsoCurrencyOrNull() != null) {
                objNotation = CurrencyDefinitionsKt$$ExternalSyntheticApiModelOutline3.m2817m(CurrencyDefinitionsKt$$ExternalSyntheticApiModelOutline3.m2817m(objNotation).unit(currencyDefinition));
            }
            if (currencyDefinition.isOverridingCurrencySymbol(currencyFormatModelFromCurrencyAmount$default.getLocale())) {
                objNotation = CurrencyDefinitionsKt$$ExternalSyntheticApiModelOutline3.m2817m(CurrencyDefinitionsKt$$ExternalSyntheticApiModelOutline3.m2817m(objNotation).unitWidth(NumberFormatter.UnitWidth.NARROW));
            }
            String string2 = CurrencyDefinitionsKt$$ExternalSyntheticApiModelOutline3.m2817m(CurrencyDefinitionsKt$$ExternalSyntheticApiModelOutline3.m2817m(CurrencyDefinitionsKt$$ExternalSyntheticApiModelOutline3.m2817m(objNotation).precision(Precision.minMaxSignificantDigits(1, 5))).roundingMode(roundingMode)).format(amount).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            if (z && currencyDefinition.toIsoCurrencyOrNull() == null) {
                z2 = true;
            }
            if (!z2) {
                return string2;
            }
            return string2 + " " + currencyDefinition.getCode();
        }
        return CurrencyFormatCache.getCurrencyFormat(currencyFormatModelFromCurrencyAmount$default).format(amount);
    }

    public static final String formatAmountStringWithCurrency(CurrencyDefinition currencyDefinition, String amountInString) {
        Intrinsics.checkNotNullParameter(currencyDefinition, "<this>");
        Intrinsics.checkNotNullParameter(amountInString, "amountInString");
        return amountInString + PlaceholderUtils.XXShortPlaceholderText + currencyDefinition.getCode();
    }

    public static final com.robinhood.android.lib.formats.NumberFormatter getCryptoFiatPriceFormatter(CurrencyDefinition currencyDefinition) {
        Intrinsics.checkNotNullParameter(currencyDefinition, "<this>");
        return CurrencyFormatCache.getCurrencyFormat(CurrencyFormatModel.Companion.fromCurrencyForFiatPriceFormat$default(CurrencyFormatModel.INSTANCE, currencyDefinition, 2, true, false, true, 8, null));
    }

    public static final com.robinhood.android.lib.formats.NumberFormatter getCryptoFiatPriceDeltaFormatter(CurrencyDefinition currencyDefinition) {
        Intrinsics.checkNotNullParameter(currencyDefinition, "<this>");
        return CurrencyFormatCache.getCurrencyFormat(CurrencyFormatModel.INSTANCE.fromCurrencyForFiatPriceFormat(currencyDefinition, 2, true, true, true));
    }

    public static final com.robinhood.android.lib.formats.NumberFormatter getCryptoFiatPriceFormatterForTicker(CurrencyDefinition currencyDefinition) {
        Intrinsics.checkNotNullParameter(currencyDefinition, "<this>");
        return CurrencyFormatCache.getCurrencyFormat(CurrencyFormatModel.Companion.fromCurrencyForFiatPriceFormat$default(CurrencyFormatModel.INSTANCE, currencyDefinition, currencyDefinition.getDecimalScale(), true, false, true, 8, null));
    }

    public static final CurrencyFormatModel.CurrencySymbolPosition getCurrencySymbolPosition(CurrencyDefinition currencyDefinition) {
        Intrinsics.checkNotNullParameter(currencyDefinition, "<this>");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        String currency$default = formatCurrency$default(currencyDefinition, ZERO, false, false, null, 0, null, null, false, false, false, false, 2046, null);
        int length = CurrencyDefinition.getCurrencySymbol$default(currencyDefinition, null, 1, null).length();
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) currency$default, CurrencyDefinition.getCurrencySymbol$default(currencyDefinition, null, 1, null), 0, false, 6, (Object) null);
        if (iIndexOf$default == (StringsKt.getLastIndex(currency$default) - length) + 1) {
            if (iIndexOf$default - length >= 0 && CharsKt.isWhitespace(currency$default.charAt(iIndexOf$default - 1))) {
                return CurrencyFormatModel.CurrencySymbolPosition.RIGHT_SPACED;
            }
            return CurrencyFormatModel.CurrencySymbolPosition.RIGHT;
        }
        return CurrencyFormatModel.CurrencySymbolPosition.LEFT;
    }

    public static final int getMinFractionDigitsForCurrency(CurrencyDefinition currencyDefinition) {
        Intrinsics.checkNotNullParameter(currencyDefinition, "<this>");
        return Math.min(2, currencyDefinition.getDecimalScale());
    }
}
