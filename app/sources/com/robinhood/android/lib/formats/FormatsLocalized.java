package com.robinhood.android.lib.formats;

import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.NumberFormat;
import com.robinhood.g11n.CurrencyFormatterLocale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: FormatsLocalized.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R!\u0010\u0004\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR!\u0010\u000b\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\bR!\u0010\u0012\u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\n\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0018\u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\n\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u001a\u0010\u0016R!\u0010\u001c\u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\n\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001e\u0010\u0016R!\u0010 \u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b#\u0010\n\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\"\u0010\u0016R!\u0010$\u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b'\u0010\n\u0012\u0004\b%\u0010\u0003\u001a\u0004\b&\u0010\u0016R!\u0010(\u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b+\u0010\n\u0012\u0004\b)\u0010\u0003\u001a\u0004\b*\u0010\u0016R!\u0010,\u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b/\u0010\n\u0012\u0004\b-\u0010\u0003\u001a\u0004\b.\u0010\u0016R!\u00100\u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b3\u0010\n\u0012\u0004\b1\u0010\u0003\u001a\u0004\b2\u0010\u0016R!\u00104\u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b7\u0010\n\u0012\u0004\b5\u0010\u0003\u001a\u0004\b6\u0010\u0016R!\u00108\u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b;\u0010\n\u0012\u0004\b9\u0010\u0003\u001a\u0004\b:\u0010\u0016¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/FormatsLocalized;", "", "<init>", "()V", "currencyFormat", "Landroid/icu/text/NumberFormat;", "getCurrencyFormat$annotations", "getCurrencyFormat", "()Landroid/icu/text/NumberFormat;", "currencyFormat$delegate", "Ljava/lang/ThreadLocal;", "signedCurrencyFormat", "getSignedCurrencyFormat$annotations", "getSignedCurrencyFormat", "signedCurrencyFormat$delegate", "fallbackCryptoAmountFormat", "currencyCode", "", "percentFormat", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getPercentFormat$annotations", "getPercentFormat", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "percentFormat$delegate", "hundredthPercentFormat", "getHundredthPercentFormat$annotations", "getHundredthPercentFormat", "hundredthPercentFormat$delegate", "signedHundredthPercentFormat", "getSignedHundredthPercentFormat$annotations", "getSignedHundredthPercentFormat", "signedHundredthPercentFormat$delegate", "signedTenThousandthPercentFormat", "getSignedTenThousandthPercentFormat$annotations", "getSignedTenThousandthPercentFormat", "signedTenThousandthPercentFormat$delegate", "signedPercentFormat", "getSignedPercentFormat$annotations", "getSignedPercentFormat", "signedPercentFormat$delegate", "wholeNumberPercentFormat", "getWholeNumberPercentFormat$annotations", "getWholeNumberPercentFormat", "wholeNumberPercentFormat$delegate", "integerFormat", "getIntegerFormat$annotations", "getIntegerFormat", "integerFormat$delegate", "integerDeltaFormat", "getIntegerDeltaFormat$annotations", "getIntegerDeltaFormat", "integerDeltaFormat$delegate", "shareQuantityFormat", "getShareQuantityFormat$annotations", "getShareQuantityFormat", "shareQuantityFormat$delegate", "largePrecisionFormat", "getLargePrecisionFormat$annotations", "getLargePrecisionFormat", "largePrecisionFormat$delegate", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class FormatsLocalized {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    public static final FormatsLocalized INSTANCE;

    /* renamed from: currencyFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal currencyFormat;

    /* renamed from: hundredthPercentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal hundredthPercentFormat;

    /* renamed from: integerDeltaFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal integerDeltaFormat;

    /* renamed from: integerFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal integerFormat;

    /* renamed from: largePrecisionFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal largePrecisionFormat;

    /* renamed from: percentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal percentFormat;

    /* renamed from: shareQuantityFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal shareQuantityFormat;

    /* renamed from: signedCurrencyFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal signedCurrencyFormat;

    /* renamed from: signedHundredthPercentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal signedHundredthPercentFormat;

    /* renamed from: signedPercentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal signedPercentFormat;

    /* renamed from: signedTenThousandthPercentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal signedTenThousandthPercentFormat;

    /* renamed from: wholeNumberPercentFormat$delegate, reason: from kotlin metadata */
    private static final ThreadLocal wholeNumberPercentFormat;

    @JvmStatic
    public static /* synthetic */ void getCurrencyFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getHundredthPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getIntegerDeltaFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getIntegerFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getLargePrecisionFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getShareQuantityFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getSignedCurrencyFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getSignedHundredthPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getSignedPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getSignedTenThousandthPercentFormat$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getWholeNumberPercentFormat$annotations() {
    }

    private FormatsLocalized() {
    }

    static {
        FormatsLocalized formatsLocalized = INSTANCE;
        final boolean z = true;
        $$delegatedProperties = new KProperty[]{Reflection.property0(new PropertyReference0Impl(formatsLocalized, FormatsLocalized.class, "currencyFormat", "getCurrencyFormat()Landroid/icu/text/NumberFormat;", 0)), Reflection.property0(new PropertyReference0Impl(formatsLocalized, FormatsLocalized.class, "signedCurrencyFormat", "getSignedCurrencyFormat()Landroid/icu/text/NumberFormat;", 0)), Reflection.property0(new PropertyReference0Impl(formatsLocalized, FormatsLocalized.class, "percentFormat", "getPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formatsLocalized, FormatsLocalized.class, "hundredthPercentFormat", "getHundredthPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formatsLocalized, FormatsLocalized.class, "signedHundredthPercentFormat", "getSignedHundredthPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formatsLocalized, FormatsLocalized.class, "signedTenThousandthPercentFormat", "getSignedTenThousandthPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formatsLocalized, FormatsLocalized.class, "signedPercentFormat", "getSignedPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formatsLocalized, FormatsLocalized.class, "wholeNumberPercentFormat", "getWholeNumberPercentFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formatsLocalized, FormatsLocalized.class, "integerFormat", "getIntegerFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formatsLocalized, FormatsLocalized.class, "integerDeltaFormat", "getIntegerDeltaFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formatsLocalized, FormatsLocalized.class, "shareQuantityFormat", "getShareQuantityFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0)), Reflection.property0(new PropertyReference0Impl(formatsLocalized, FormatsLocalized.class, "largePrecisionFormat", "getLargePrecisionFormat()Lcom/robinhood/android/lib/formats/NumberFormatter;", 0))};
        INSTANCE = new FormatsLocalized();
        ThreadLocals threadLocals = ThreadLocals.INSTANCE;
        currencyFormat = new ThreadLocal<IcuSmallAmountFormatter>() { // from class: com.robinhood.android.lib.formats.FormatsLocalized$special$$inlined$localizedWrappedNumberFormat$1
            @Override // java.lang.ThreadLocal
            protected IcuSmallAmountFormatter initialValue() {
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
                currencyInstance.setMinimumFractionDigits(2);
                return new IcuSmallAmountFormatter(currencyInstance, z, z);
            }
        };
        signedCurrencyFormat = new ThreadLocal<IcuSmallAmountFormatter>() { // from class: com.robinhood.android.lib.formats.FormatsLocalized$special$$inlined$localizedWrappedNumberFormat$2
            @Override // java.lang.ThreadLocal
            protected IcuSmallAmountFormatter initialValue() {
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
                currencyInstance.setMinimumFractionDigits(2);
                if (currencyInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
                    decimalFormat.setPositivePrefix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPlusSign()));
                }
                return new IcuSmallAmountFormatter(currencyInstance, z, z);
            }
        };
        percentFormat = new ThreadLocal<IcuNumberFormatter>() { // from class: com.robinhood.android.lib.formats.FormatsLocalized$special$$inlined$localizedNumberFormat$1
            @Override // java.lang.ThreadLocal
            protected IcuNumberFormatter initialValue() {
                NumberFormat percentInstance = NumberFormat.getPercentInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
                percentInstance.setMaximumFractionDigits(2);
                if (percentInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) percentInstance;
                    decimalFormat.setPositiveSuffix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPercent()));
                    decimalFormat.setNegativeSuffix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPercent()));
                }
                return new IcuNumberFormatter(percentInstance);
            }
        };
        hundredthPercentFormat = new ThreadLocal<IcuNumberFormatter>() { // from class: com.robinhood.android.lib.formats.FormatsLocalized$special$$inlined$localizedNumberFormat$2
            @Override // java.lang.ThreadLocal
            protected IcuNumberFormatter initialValue() {
                NumberFormat percentInstance = NumberFormat.getPercentInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
                percentInstance.setMinimumFractionDigits(2);
                percentInstance.setMaximumFractionDigits(2);
                if (percentInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) percentInstance;
                    decimalFormat.setPositiveSuffix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPercent()));
                    decimalFormat.setNegativeSuffix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPercent()));
                }
                return new IcuNumberFormatter(percentInstance);
            }
        };
        signedHundredthPercentFormat = new ThreadLocal<IcuNumberFormatter>() { // from class: com.robinhood.android.lib.formats.FormatsLocalized$special$$inlined$localizedNumberFormat$3
            @Override // java.lang.ThreadLocal
            protected IcuNumberFormatter initialValue() {
                NumberFormat percentInstance = NumberFormat.getPercentInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
                percentInstance.setMinimumFractionDigits(2);
                percentInstance.setMaximumFractionDigits(2);
                if (percentInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) percentInstance;
                    decimalFormat.setPositivePrefix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPlusSign()));
                    decimalFormat.setPositiveSuffix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPercent()));
                    decimalFormat.setNegativePrefix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getMinusSign()));
                    decimalFormat.setNegativeSuffix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPercent()));
                }
                return new IcuNumberFormatter(percentInstance);
            }
        };
        signedTenThousandthPercentFormat = new ThreadLocal<IcuNumberFormatter>() { // from class: com.robinhood.android.lib.formats.FormatsLocalized$special$$inlined$localizedNumberFormat$4
            @Override // java.lang.ThreadLocal
            protected IcuNumberFormatter initialValue() {
                NumberFormat percentInstance = NumberFormat.getPercentInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
                percentInstance.setMinimumFractionDigits(4);
                percentInstance.setMaximumFractionDigits(4);
                if (percentInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) percentInstance;
                    decimalFormat.setPositivePrefix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPlusSign()));
                    decimalFormat.setPositiveSuffix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPercent()));
                    decimalFormat.setNegativePrefix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getMinusSign()));
                    decimalFormat.setNegativeSuffix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPercent()));
                }
                return new IcuNumberFormatter(percentInstance);
            }
        };
        signedPercentFormat = new ThreadLocal<IcuNumberFormatter>() { // from class: com.robinhood.android.lib.formats.FormatsLocalized$special$$inlined$localizedNumberFormat$5
            @Override // java.lang.ThreadLocal
            protected IcuNumberFormatter initialValue() {
                NumberFormat percentInstance = NumberFormat.getPercentInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
                percentInstance.setMaximumFractionDigits(2);
                if (percentInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) percentInstance;
                    decimalFormat.setPositivePrefix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPlusSign()));
                    decimalFormat.setPositiveSuffix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPercent()));
                    decimalFormat.setNegativePrefix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getMinusSign()));
                    decimalFormat.setNegativeSuffix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPercent()));
                }
                return new IcuNumberFormatter(percentInstance);
            }
        };
        wholeNumberPercentFormat = new ThreadLocal<IcuNumberFormatter>() { // from class: com.robinhood.android.lib.formats.FormatsLocalized$special$$inlined$localizedNumberFormat$6
            @Override // java.lang.ThreadLocal
            protected IcuNumberFormatter initialValue() {
                NumberFormat percentInstance = NumberFormat.getPercentInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
                percentInstance.setRoundingMode(4);
                percentInstance.setMaximumFractionDigits(0);
                if (percentInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) percentInstance;
                    decimalFormat.setPositiveSuffix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPercent()));
                    decimalFormat.setNegativeSuffix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPercent()));
                }
                return new IcuNumberFormatter(percentInstance);
            }
        };
        integerFormat = new ThreadLocal<IcuNumberFormatter>() { // from class: com.robinhood.android.lib.formats.FormatsLocalized$special$$inlined$localizedNumberFormat$7
            @Override // java.lang.ThreadLocal
            protected IcuNumberFormatter initialValue() {
                NumberFormat numberInstance = NumberFormat.getNumberInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
                numberInstance.setMaximumFractionDigits(0);
                return new IcuNumberFormatter(numberInstance);
            }
        };
        integerDeltaFormat = new ThreadLocal<IcuNumberFormatter>() { // from class: com.robinhood.android.lib.formats.FormatsLocalized$special$$inlined$localizedNumberFormat$8
            @Override // java.lang.ThreadLocal
            protected IcuNumberFormatter initialValue() {
                NumberFormat numberInstance = NumberFormat.getNumberInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
                numberInstance.setMaximumFractionDigits(0);
                if (numberInstance instanceof DecimalFormat) {
                    DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
                    decimalFormat.setPositivePrefix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getPlusSign()));
                    decimalFormat.setNegativePrefix(String.valueOf(decimalFormat.getDecimalFormatSymbols().getMinusSign()));
                }
                return new IcuNumberFormatter(numberInstance);
            }
        };
        shareQuantityFormat = new ThreadLocal<IcuNumberFormatter>() { // from class: com.robinhood.android.lib.formats.FormatsLocalized$special$$inlined$localizedNumberFormat$9
            @Override // java.lang.ThreadLocal
            protected IcuNumberFormatter initialValue() {
                NumberFormat numberInstance = NumberFormat.getNumberInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
                numberInstance.setMinimumFractionDigits(0);
                numberInstance.setMaximumFractionDigits(6);
                numberInstance.setRoundingMode(1);
                return new IcuNumberFormatter(numberInstance);
            }
        };
        largePrecisionFormat = new ThreadLocal<IcuNumberFormatter>() { // from class: com.robinhood.android.lib.formats.FormatsLocalized$special$$inlined$localizedNumberFormat$10
            @Override // java.lang.ThreadLocal
            protected IcuNumberFormatter initialValue() {
                NumberFormat numberInstance = NumberFormat.getNumberInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
                numberInstance.setMaximumFractionDigits(20);
                return new IcuNumberFormatter(numberInstance);
            }
        };
    }

    public static final NumberFormat getCurrencyFormat() {
        return (NumberFormat) ThreadLocalsKt.getValue(currencyFormat, INSTANCE, $$delegatedProperties[0]);
    }

    public static final NumberFormat getSignedCurrencyFormat() {
        return (NumberFormat) ThreadLocalsKt.getValue(signedCurrencyFormat, INSTANCE, $$delegatedProperties[1]);
    }

    public static final NumberFormatter getPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(percentFormat, INSTANCE, $$delegatedProperties[2]);
    }

    public static final NumberFormatter getHundredthPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(hundredthPercentFormat, INSTANCE, $$delegatedProperties[3]);
    }

    public static final NumberFormatter getSignedHundredthPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(signedHundredthPercentFormat, INSTANCE, $$delegatedProperties[4]);
    }

    public static final NumberFormatter getSignedTenThousandthPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(signedTenThousandthPercentFormat, INSTANCE, $$delegatedProperties[5]);
    }

    public static final NumberFormatter getSignedPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(signedPercentFormat, INSTANCE, $$delegatedProperties[6]);
    }

    public static final NumberFormatter getWholeNumberPercentFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(wholeNumberPercentFormat, INSTANCE, $$delegatedProperties[7]);
    }

    public static final NumberFormatter getIntegerFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(integerFormat, INSTANCE, $$delegatedProperties[8]);
    }

    public static final NumberFormatter getIntegerDeltaFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(integerDeltaFormat, INSTANCE, $$delegatedProperties[9]);
    }

    public static final NumberFormatter getShareQuantityFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(shareQuantityFormat, INSTANCE, $$delegatedProperties[10]);
    }

    public static final NumberFormatter getLargePrecisionFormat() {
        return (NumberFormatter) ThreadLocalsKt.getValue(largePrecisionFormat, INSTANCE, $$delegatedProperties[11]);
    }

    @JvmStatic
    public static final NumberFormat fallbackCryptoAmountFormat(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        NumberFormat numberInstance = NumberFormat.getNumberInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getNumberFormatterLocale());
        numberInstance.setMinimumFractionDigits(2);
        if (numberInstance instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol(currencyCode);
            decimalFormatSymbols.setInternationalCurrencySymbol(currencyCode);
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            String pattern = decimalFormat.toPattern();
            Intrinsics.checkNotNullExpressionValue(pattern, "toPattern(...)");
            decimalFormat.applyPattern(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(pattern, "¤ ", "", false, 4, (Object) null), "¤ ", "", false, 4, (Object) null), "¤", "", false, 4, (Object) null) + " ¤");
        }
        return new IcuSmallAmountFormatter(numberInstance, true, true);
    }
}
