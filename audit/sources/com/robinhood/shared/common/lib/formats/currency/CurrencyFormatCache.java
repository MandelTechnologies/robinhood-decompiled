package com.robinhood.shared.common.lib.formats.currency;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.NumberFormat;
import android.os.Build;
import com.robinhood.android.lib.formats.IcuLowPrecisionUnitFormatter;
import com.robinhood.android.lib.formats.IcuNumberFormatter;
import com.robinhood.android.lib.formats.IcuSmallAmountFormatter;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatModel;
import java.math.MathContext;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CurrencyFormatCache.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"CURRENCY_CACHE", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel;", "Landroid/icu/text/DecimalFormat;", "getDecimalFormatSymbols", "Landroid/icu/text/DecimalFormatSymbols;", "model", "getCurrencyFormat", "Lcom/robinhood/android/lib/formats/IcuNumberFormatter;", "useSignedIfAbsent", "", "sign", "", "prefixString", "lib-formats-currency_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.lib.formats.currency.CurrencyFormatCacheKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class CurrencyFormatCache {
    private static final ConcurrentHashMap<CurrencyFormatModel, DecimalFormat> CURRENCY_CACHE = new ConcurrentHashMap<>();

    /* compiled from: CurrencyFormatCache.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.lib.formats.currency.CurrencyFormatCacheKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurrencyFormatModel.CurrencySymbolPosition.values().length];
            try {
                iArr[CurrencyFormatModel.CurrencySymbolPosition.RIGHT_SPACED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurrencyFormatModel.CurrencySymbolPosition.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final DecimalFormatSymbols getDecimalFormatSymbols(CurrencyFormatModel model) {
        String symbol;
        String symbol2;
        Intrinsics.checkNotNullParameter(model, "model");
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(model.getLocale());
        String str = "";
        decimalFormatSymbols.setPatternForCurrencySpacing(2, true, "");
        decimalFormatSymbols.setPatternForCurrencySpacing(2, false, "");
        CurrencyFormatModel.SymbolFormatModel symbolFormatModel = model.getSymbolFormatModel();
        if (symbolFormatModel == null || (symbol = symbolFormatModel.getSymbol()) == null) {
            symbol = "";
        }
        decimalFormatSymbols.setCurrencySymbol(symbol);
        CurrencyFormatModel.SymbolFormatModel symbolFormatModel2 = model.getSymbolFormatModel();
        if (symbolFormatModel2 != null && (symbol2 = symbolFormatModel2.getSymbol()) != null) {
            str = symbol2;
        }
        decimalFormatSymbols.setInternationalCurrencySymbol(str);
        Intrinsics.checkNotNullExpressionValue(decimalFormatSymbols, "apply(...)");
        return decimalFormatSymbols;
    }

    public static final IcuNumberFormatter getCurrencyFormat(CurrencyFormatModel model) {
        String symbol;
        String symbol2;
        String symbol3;
        Intrinsics.checkNotNullParameter(model, "model");
        ConcurrentHashMap<CurrencyFormatModel, DecimalFormat> concurrentHashMap = CURRENCY_CACHE;
        DecimalFormat decimalFormat = concurrentHashMap.get(model);
        String str = "";
        if (decimalFormat == null) {
            NumberFormat numberInstance = (!model.getForceCurrencyFormatter() && model.getSymbolFormatModel() == null) ? NumberFormat.getNumberInstance(model.getLocale()) : NumberFormat.getCurrencyInstance(model.getLocale());
            Intrinsics.checkNotNull(numberInstance, "null cannot be cast to non-null type android.icu.text.DecimalFormat");
            decimalFormat = (DecimalFormat) numberInstance;
            DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(model.getLocale());
            decimalFormatSymbols.setPatternForCurrencySpacing(2, true, "");
            decimalFormatSymbols.setPatternForCurrencySpacing(2, false, "");
            CurrencyFormatModel.SymbolFormatModel symbolFormatModel = model.getSymbolFormatModel();
            if (symbolFormatModel == null || (symbol2 = symbolFormatModel.getSymbol()) == null) {
                symbol2 = "";
            }
            decimalFormatSymbols.setCurrencySymbol(symbol2);
            CurrencyFormatModel.SymbolFormatModel symbolFormatModel2 = model.getSymbolFormatModel();
            if (symbolFormatModel2 == null || (symbol3 = symbolFormatModel2.getSymbol()) == null) {
                symbol3 = "";
            }
            decimalFormatSymbols.setInternationalCurrencySymbol(symbol3);
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            decimalFormat.setParseBigDecimal(true);
            decimalFormat.setDecimalPatternMatchRequired(false);
            decimalFormat.setMathContext(new MathContext(decimalFormat.getMathContext().getPrecision(), model.getRoundingMode()));
            decimalFormat.setDecimalSeparatorAlwaysShown(model.isDecimalSeparatorAlwaysShown());
            decimalFormat.setGroupingUsed(model.isGroupingUsed());
            decimalFormat.setMinimumFractionDigits(model.getMinimumFractionDigits());
            decimalFormat.setMaximumFractionDigits(model.getMaximumFractionDigits());
            decimalFormat.setMinimumIntegerDigits(model.getMinimumIntegerDigits());
            Boolean boolIsSignedAlwaysShown = model.isSignedAlwaysShown();
            if (boolIsSignedAlwaysShown != null) {
                boolean zBooleanValue = boolIsSignedAlwaysShown.booleanValue();
                if (Build.VERSION.SDK_INT >= 31 && model.getShowPlusSign() && model.getShowMinusSign()) {
                    decimalFormat.setSignAlwaysShown(zBooleanValue);
                } else {
                    if (model.getShowPlusSign()) {
                        char plusSign = decimalFormat.getDecimalFormatSymbols().getPlusSign();
                        String positivePrefix = decimalFormat.getPositivePrefix();
                        Intrinsics.checkNotNullExpressionValue(positivePrefix, "getPositivePrefix(...)");
                        decimalFormat.setPositivePrefix(useSignedIfAbsent(plusSign, positivePrefix));
                    }
                    if (model.getShowMinusSign()) {
                        char minusSign = decimalFormat.getDecimalFormatSymbols().getMinusSign();
                        String negativePrefix = decimalFormat.getNegativePrefix();
                        Intrinsics.checkNotNullExpressionValue(negativePrefix, "getNegativePrefix(...)");
                        decimalFormat.setNegativePrefix(useSignedIfAbsent(minusSign, negativePrefix));
                    }
                }
            }
            CurrencyFormatModel.SymbolFormatModel symbolFormatModel3 = model.getSymbolFormatModel();
            CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition = symbolFormatModel3 != null ? symbolFormatModel3.getCurrencySymbolPosition() : null;
            int i = currencySymbolPosition == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currencySymbolPosition.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    decimalFormat.setPositivePrefix("");
                    decimalFormat.setNegativePrefix("");
                    decimalFormat.setPositiveSuffix(" " + decimalFormat.getDecimalFormatSymbols().getCurrencySymbol());
                    decimalFormat.setNegativeSuffix(" " + decimalFormat.getDecimalFormatSymbols().getCurrencySymbol());
                } else if (i == 2) {
                    decimalFormat.setPositivePrefix("");
                    decimalFormat.setNegativePrefix("");
                    decimalFormat.setPositiveSuffix(decimalFormat.getDecimalFormatSymbols().getCurrencySymbol());
                    decimalFormat.setNegativeSuffix(decimalFormat.getDecimalFormatSymbols().getCurrencySymbol());
                }
            } else if (model.getForceCurrencyFormatter()) {
                decimalFormat.setPositivePrefix("");
                decimalFormat.setNegativePrefix("");
                decimalFormat.setPositiveSuffix("");
                decimalFormat.setNegativeSuffix("");
            }
            DecimalFormat decimalFormatPutIfAbsent = concurrentHashMap.putIfAbsent(model, decimalFormat);
            if (decimalFormatPutIfAbsent != null) {
                decimalFormat = decimalFormatPutIfAbsent;
            }
        }
        DecimalFormat decimalFormat2 = decimalFormat;
        if (model.getLowPrecision()) {
            CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance(model.getLocale(), CompactDecimalFormat.CompactStyle.SHORT);
            compactDecimalFormat.setMinimumSignificantDigits(1);
            compactDecimalFormat.setMaximumSignificantDigits(5);
            Intrinsics.checkNotNull(compactDecimalFormat);
            Intrinsics.checkNotNull(decimalFormat2);
            CurrencyFormatModel.SymbolFormatModel symbolFormatModel4 = model.getSymbolFormatModel();
            if (symbolFormatModel4 != null && (symbol = symbolFormatModel4.getSymbol()) != null) {
                str = symbol;
            }
            return new IcuLowPrecisionUnitFormatter(compactDecimalFormat, decimalFormat2, str, model.getLocale());
        }
        if (model.getSmallAmountFormatter()) {
            Intrinsics.checkNotNull(decimalFormat2);
            return new IcuNumberFormatter(new IcuSmallAmountFormatter(decimalFormat2, true, false));
        }
        Intrinsics.checkNotNull(decimalFormat2);
        return new IcuNumberFormatter(decimalFormat2);
    }

    private static final String useSignedIfAbsent(char c, String str) {
        if (StringsKt.contains$default((CharSequence) str, c, false, 2, (Object) null)) {
            return str;
        }
        return c + str;
    }
}
