package com.robinhood.shared.common.lib.formats.currency;

import android.view.KeyEvent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.g11n.Locales2;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatModel;
import com.robinhood.shared.common.lib.formats.currency.InputAmount;
import com.robinhood.utils.extensions.KeyEvents2;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CurrencyInputHelper.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007JL\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0012H\u0016JL\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u0012J\\\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u0012H\u0002JF\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputHelper;", "", "currencyInputInfo", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputInfo;", "locale", "Ljava/util/Locale;", "<init>", "(Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputInfo;Ljava/util/Locale;)V", "getLocale", "()Ljava/util/Locale;", "processKeyEvent", "Lkotlin/Pair;", "", "Ljava/math/BigDecimal;", "keyEvent", "Landroid/view/KeyEvent;", "oldString", "isSpaced", "", "showCurrencySymbol", "forceCurrencyFormatter", "allowEmpty", "processAmount", "amount", "roundingMode", "Ljava/math/RoundingMode;", "forceHideDecimalSeparator", "formatInputString", "oldText", "format", "inputAmount", "Lcom/robinhood/shared/common/lib/formats/currency/InputAmount;", "lib-formats-currency_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public class CurrencyInputHelper {
    private final CurrencyInputInfo currencyInputInfo;
    private final Locale locale;

    public CurrencyInputHelper(CurrencyInputInfo currencyInputInfo, Locale locale) {
        Intrinsics.checkNotNullParameter(currencyInputInfo, "currencyInputInfo");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.currencyInputInfo = currencyInputInfo;
        this.locale = locale;
    }

    public /* synthetic */ CurrencyInputHelper(CurrencyInputInfo currencyInputInfo, Locale locale, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(currencyInputInfo, (i & 2) != 0 ? CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale() : locale);
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public static /* synthetic */ Tuples2 processKeyEvent$default(CurrencyInputHelper currencyInputHelper, KeyEvent keyEvent, String str, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processKeyEvent");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        return currencyInputHelper.processKeyEvent(keyEvent, str, z, z2, z3, z4);
    }

    public Tuples2<String, BigDecimal> processKeyEvent(KeyEvent keyEvent, String oldString, boolean isSpaced, boolean showCurrencySymbol, boolean forceCurrencyFormatter, boolean allowEmpty) {
        String str;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Intrinsics.checkNotNullParameter(oldString, "oldString");
        String string2 = StringsKt.trim(StringsKt.replace$default(oldString, this.currencyInputInfo.getDisplaySymbol(), "", false, 4, (Object) null)).toString();
        boolean zIsDecimalSeparator = KeyEvents.isDecimalSeparator(keyEvent, this.locale);
        char monetaryDecimalSeparator = Locales2.getMonetaryDecimalSeparator(this.locale);
        char monetaryGroupingSeparator = Locales2.getMonetaryGroupingSeparator(this.locale);
        if (zIsDecimalSeparator && StringsKt.contains$default((CharSequence) string2, monetaryDecimalSeparator, false, 2, (Object) null)) {
            str = string2;
        } else {
            if (allowEmpty && KeyEvents2.isDelete(keyEvent) && string2.length() <= 1) {
                return new Tuples2<>("", BigDecimal.ZERO);
            }
            if (KeyEvents2.isDelete(keyEvent) && string2.length() <= 1) {
                str = "";
            } else {
                if (KeyEvents2.isDelete(keyEvent)) {
                    string2 = StringsKt.dropLast(string2, 1);
                } else if (KeyEvents2.isDigit(keyEvent) || zIsDecimalSeparator) {
                    string2 = string2 + keyEvent.getNumber();
                } else {
                    throw new IllegalStateException(("ProcessKeyEvent - Old String: " + oldString + "; KeyEvent: " + keyEvent.getNumber() + "(" + keyEvent.getUnicodeChar() + "); Symbol: " + this.currencyInputInfo + "; decimal sep: " + monetaryDecimalSeparator + "(" + ((int) monetaryDecimalSeparator) + "); grouping sep: " + monetaryGroupingSeparator + "(" + ((int) monetaryGroupingSeparator) + ")").toString());
                }
                str = string2;
            }
        }
        return formatInputString$default(this, str, this.currencyInputInfo, null, isSpaced, showCurrencySymbol, null, forceCurrencyFormatter, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, null);
    }

    public static /* synthetic */ Tuples2 processAmount$default(CurrencyInputHelper currencyInputHelper, BigDecimal bigDecimal, RoundingMode roundingMode, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processAmount");
        }
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        boolean z5 = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        return currencyInputHelper.processAmount(bigDecimal, roundingMode2, z5, z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }

    public final Tuples2<String, BigDecimal> processAmount(BigDecimal amount, RoundingMode roundingMode, boolean isSpaced, boolean showCurrencySymbol, boolean forceCurrencyFormatter, boolean forceHideDecimalSeparator) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        String plainString = amount.toPlainString();
        Intrinsics.checkNotNull(plainString);
        CurrencyInputInfo currencyInputInfo = this.currencyInputInfo;
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        return formatInputString(plainString, currencyInputInfo, roundingMode, isSpaced, showCurrencySymbol, US, forceCurrencyFormatter, forceHideDecimalSeparator);
    }

    static /* synthetic */ Tuples2 formatInputString$default(CurrencyInputHelper currencyInputHelper, String str, CurrencyInputInfo currencyInputInfo, RoundingMode roundingMode, boolean z, boolean z2, Locale locale, boolean z3, boolean z4, int i, Object obj) {
        boolean z5;
        CurrencyInputHelper currencyInputHelper2;
        String str2;
        CurrencyInputInfo currencyInputInfo2;
        boolean z6;
        boolean z7;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatInputString");
        }
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        Locale cryptoLocale = (i & 32) != 0 ? CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale() : locale;
        boolean z8 = (i & 64) != 0 ? false : z3;
        if ((i & 128) != 0) {
            z5 = false;
            currencyInputHelper2 = currencyInputHelper;
            currencyInputInfo2 = currencyInputInfo;
            z6 = z;
            z7 = z2;
            str2 = str;
        } else {
            z5 = z4;
            currencyInputHelper2 = currencyInputHelper;
            str2 = str;
            currencyInputInfo2 = currencyInputInfo;
            z6 = z;
            z7 = z2;
        }
        return currencyInputHelper2.formatInputString(str2, currencyInputInfo2, roundingMode2, z6, z7, cryptoLocale, z8, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Tuples2<String, BigDecimal> formatInputString(String oldText, CurrencyInputInfo currencyInputInfo, RoundingMode roundingMode, boolean isSpaced, boolean showCurrencySymbol, Locale locale, boolean forceCurrencyFormatter, boolean forceHideDecimalSeparator) {
        BigDecimal amount;
        InputAmount currencyText = CurrencyFormatParser.parseCurrencyText(oldText, new InputAmount(null, InputAmount.Type.ZERO, 1, 0 == true ? 1 : 0), locale);
        String str = format(currencyText, currencyInputInfo, roundingMode, isSpaced, showCurrencySymbol, forceCurrencyFormatter, forceHideDecimalSeparator);
        if (currencyText.getAmount().scale() > currencyInputInfo.getDecimalScale()) {
            amount = currencyText.getAmount().setScale(currencyInputInfo.getDecimalScale(), RoundingMode.DOWN);
        } else {
            amount = currencyText.getAmount();
        }
        return new Tuples2<>(str, amount);
    }

    static /* synthetic */ String format$default(CurrencyInputHelper currencyInputHelper, InputAmount inputAmount, CurrencyInputInfo currencyInputInfo, RoundingMode roundingMode, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        boolean z5;
        CurrencyInputHelper currencyInputHelper2;
        InputAmount inputAmount2;
        CurrencyInputInfo currencyInputInfo2;
        boolean z6;
        boolean z7;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: format");
        }
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        boolean z8 = (i & 32) != 0 ? false : z3;
        if ((i & 64) != 0) {
            z5 = false;
            inputAmount2 = inputAmount;
            currencyInputInfo2 = currencyInputInfo;
            z6 = z;
            z7 = z2;
            currencyInputHelper2 = currencyInputHelper;
        } else {
            z5 = z4;
            currencyInputHelper2 = currencyInputHelper;
            inputAmount2 = inputAmount;
            currencyInputInfo2 = currencyInputInfo;
            z6 = z;
            z7 = z2;
        }
        return currencyInputHelper2.format(inputAmount2, currencyInputInfo2, roundingMode2, z6, z7, z8, z5);
    }

    private final String format(InputAmount inputAmount, CurrencyInputInfo currencyInputInfo, RoundingMode roundingMode, boolean isSpaced, boolean showCurrencySymbol, boolean forceCurrencyFormatter, boolean forceHideDecimalSeparator) {
        return inputAmount.format(CurrencyFormatModel.Companion.create$default(CurrencyFormatModel.INSTANCE, currencyInputInfo.getDisplaySymbol(), currencyInputInfo.isFiatCurrency(), inputAmount.getAmount(), showCurrencySymbol, false, 0, currencyInputInfo.getDecimalScale(), isSpaced, inputAmount.isFractional(), roundingMode, null, forceCurrencyFormatter, forceHideDecimalSeparator, 1072, null));
    }
}
