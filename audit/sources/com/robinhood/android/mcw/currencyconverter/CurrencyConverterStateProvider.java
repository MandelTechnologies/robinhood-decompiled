package com.robinhood.android.mcw.currencyconverter;

import com.robinhood.android.lib.store.mcw.data.ConversionFxRate;
import com.robinhood.android.lib.store.mcw.data.ConvertibleCurrency;
import com.robinhood.android.mcw.currencyconverter.models.ConversionField;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterDataState;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterInternalError;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterViewState;
import com.robinhood.android.mcw.currencyconverter.models.DisplayCurrency;
import com.robinhood.android.mcw.currencyconverter.models.TriggerAction;
import com.robinhood.android.mcw.currencyconverter.util.Calculators;
import com.robinhood.android.mcw.currencyconverter.util.Converters2;
import com.robinhood.android.mcw.currencyconverter.util.Formatters;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.compose.bento.util.BentoCurrency;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.ZonedDateTimeFormatter;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: CurrencyConverterStateProvider.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterViewState;", "<init>", "()V", "checkError", "Lcom/robinhood/utils/resource/StringResource;", "bidPrice", "Ljava/math/BigDecimal;", "toDisplayCurrency", "Lcom/robinhood/android/mcw/currencyconverter/models/DisplayCurrency;", "Lcom/robinhood/android/lib/store/mcw/data/ConvertibleCurrency;", "reduce", "dataState", "feature-mcw-currency-converter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CurrencyConverterStateProvider implements StateProvider<CurrencyConverterDataState, CurrencyConverterViewState> {
    public static final int $stable = 0;

    /* compiled from: CurrencyConverterStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TriggerAction.values().length];
            try {
                iArr[TriggerAction.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TriggerAction.SWAP_CURRENCIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TriggerAction.SWITCH_CURRENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConversionField.values().length];
            try {
                iArr2[ConversionField.FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ConversionField.f4551TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final StringResource checkError(CurrencyConverterDataState currencyConverterDataState, BigDecimal bigDecimal) {
        ConvertibleCurrency targetCurrency = currencyConverterDataState.getTargetCurrency();
        if (targetCurrency == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ConvertibleCurrency fromCurrency = currencyConverterDataState.getFromCurrency();
        if (fromCurrency == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        BigDecimal bigDecimal2 = new BigDecimal(currencyConverterDataState.getNextAmount());
        BigDecimal bigDecimalConvertedTo = currencyConverterDataState.getTargetField() == ConversionField.f4551TO ? Calculators.convertedTo(bigDecimal2, ConversionField.FROM, bigDecimal) : bigDecimal2;
        if (BigDecimals7.isZero(bigDecimal2)) {
            return null;
        }
        if (bigDecimalConvertedTo.compareTo(fromCurrency.getBalance()) > 0) {
            return StringResource.INSTANCE.invoke(C21706R.string.over_balance_error, fromCurrency.getCurrency().getCurrencyCode());
        }
        if (bigDecimal2.compareTo(targetCurrency.getTransactionMax()) > 0) {
            return StringResource.INSTANCE.invoke(C21706R.string.over_current_max_error, targetCurrency.getCurrency().getCurrencyCode(), Money.formatCompact$default(Money3.toMoney(targetCurrency.getTransactionMax(), targetCurrency.getCurrency()), null, null, 0, 3, null));
        }
        if (bigDecimal2.compareTo(targetCurrency.getTransactionMin()) < 0) {
            return StringResource.INSTANCE.invoke(C21706R.string.under_current_min_error, targetCurrency.getCurrency().getCurrencyCode(), Money.formatCompact$default(Money3.toMoney(targetCurrency.getTransactionMin(), targetCurrency.getCurrency()), null, null, 0, 3, null));
        }
        return null;
    }

    private final DisplayCurrency toDisplayCurrency(ConvertibleCurrency convertibleCurrency) {
        BentoCurrency bentoCurrency = Converters2.toBentoCurrency(convertibleCurrency.getCurrency());
        if (bentoCurrency == null) {
            return null;
        }
        return new DisplayCurrency(bentoCurrency, Money.format$default(Money3.toMoney(convertibleCurrency.getBalance(), convertibleCurrency.getCurrency()), null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    @Override // com.robinhood.android.udf.StateProvider
    public CurrencyConverterViewState reduce(CurrencyConverterDataState dataState) {
        boolean z;
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getAccountNumber() == null || dataState.isFxFeeEnabled() == null || dataState.getConvertibleCurrencies().isEmpty() || dataState.m16506getFxRatexLWZpok() == null || dataState.getFromCurrency() == null || dataState.getToCurrency() == null || dataState.getPrevAmount() == null || dataState.getMarketHours() == null || dataState.getCurrentTime() == null) {
            return new CurrencyConverterViewState.Loading(dataState.getInternalError());
        }
        CurrencyConverterViewState.Loading loading = new CurrencyConverterViewState.Loading(CurrencyConverterInternalError.Fatal.INSTANCE);
        List<ConvertibleCurrency> convertibleCurrencies = dataState.getConvertibleCurrencies();
        ArrayList arrayList = new ArrayList(convertibleCurrencies.size());
        int size = convertibleCurrencies.size();
        for (int i = 0; i < size; i++) {
            ConvertibleCurrency convertibleCurrency = convertibleCurrencies.get(i);
            DisplayCurrency displayCurrency = toDisplayCurrency(convertibleCurrency);
            if (displayCurrency == null) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Cannot convert " + convertibleCurrency.getCurrency() + " to DisplayCurrency"), false, null, 6, null);
                return loading;
            }
            arrayList.add(displayCurrency);
        }
        DisplayCurrency displayCurrency2 = toDisplayCurrency(dataState.getFromCurrency());
        if (displayCurrency2 == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Cannot convert " + dataState.getFromCurrency() + " to DisplayCurrency"), false, null, 6, null);
            return loading;
        }
        DisplayCurrency displayCurrency3 = toDisplayCurrency(dataState.getToCurrency());
        if (displayCurrency3 == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Cannot convert " + dataState.getToCurrency() + " to DisplayCurrency"), false, null, 6, null);
            return loading;
        }
        Instant fxNextOpenHours = dataState.getMarketHours().getFxNextOpenHours();
        CurrencyConverterInternalError.MarketsClosed marketsClosed = (fxNextOpenHours == null || dataState.getMarketHours().isOpenFx(dataState.getCurrentTime())) ? null : new CurrencyConverterInternalError.MarketsClosed(ZonedDateTimeFormatter.WEEKDAY_DATE_TIME_AM_PM_WITH_ZONE.format((ZonedDateTimeFormatter) Instants.toZonedDateTime$default(fxNextOpenHours, null, 1, null)));
        int i2 = WhenMappings.$EnumSwitchMapping$0[dataState.getTriggerAction().ordinal()];
        if (i2 == 1) {
            z = true;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        boolean z2 = arrayList.size() > 2;
        ConversionField targetField = dataState.getTargetField();
        boolean conversionInProgress = dataState.getConversionInProgress();
        Boolean boolIsFxFeeEnabled = dataState.isFxFeeEnabled();
        CurrencyConverterInternalError internalError = dataState.getInternalError();
        CurrencyConverterViewState.Loaded loaded = new CurrencyConverterViewState.Loaded(arrayList, displayCurrency2, displayCurrency3, "0", "0", null, false, z2, targetField, null, conversionInProgress, boolIsFxFeeEnabled.booleanValue(), null, z, internalError == null ? marketsClosed : internalError);
        Object value = dataState.m16506getFxRatexLWZpok().getValue();
        if (Result.m28555isFailureimpl(value)) {
            value = null;
        }
        ConversionFxRate conversionFxRate = (ConversionFxRate) value;
        if (conversionFxRate != null) {
            try {
                StringResource stringResourceCheckError = checkError(dataState, conversionFxRate.getBidPrice());
                String nextAmount = stringResourceCheckError == null ? dataState.getNextAmount() : dataState.getPrevAmount();
                String strWithGroupSeparators = Formatters.withGroupSeparators(nextAmount);
                BigDecimal bigDecimalConvertedTo = Calculators.convertedTo(new BigDecimal(nextAmount), dataState.getTargetField().getOther(), conversionFxRate.getBidPrice());
                ConvertibleCurrency otherCurrency = dataState.getOtherCurrency();
                if (otherCurrency == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String str = Money.format$default(Money3.toMoney(bigDecimalConvertedTo, otherCurrency.getCurrency()), null, false, null, false, 2, 2, false, null, false, false, 967, null);
                int i3 = WhenMappings.$EnumSwitchMapping$1[dataState.getTargetField().ordinal()];
                if (i3 == 1) {
                    tuples2M3642to = Tuples4.m3642to(strWithGroupSeparators, str);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tuples2M3642to = Tuples4.m3642to(str, strWithGroupSeparators);
                }
                String str2 = (String) tuples2M3642to.component1();
                String str3 = (String) tuples2M3642to.component2();
                String plainString = conversionFxRate.getBidPrice().toPlainString();
                boolean zAreEqual = Intrinsics.areEqual(nextAmount, "0");
                StringResource submissionError = dataState.getSubmissionError();
                CurrencyConverterViewState.Loaded loadedCopy = loaded.copy((28039 & 1) != 0 ? loaded.displayCurrencies : null, (28039 & 2) != 0 ? loaded.fromCurrency : null, (28039 & 4) != 0 ? loaded.toCurrency : null, (28039 & 8) != 0 ? loaded.fromAmount : str2, (28039 & 16) != 0 ? loaded.toAmount : str3, (28039 & 32) != 0 ? loaded.forwardRate : plainString, (28039 & 64) != 0 ? loaded.showConvenienceActions : zAreEqual, (28039 & 128) != 0 ? loaded.enableCurrencyPicker : false, (28039 & 256) != 0 ? loaded.targetField : null, (28039 & 512) != 0 ? loaded.fieldError : submissionError == null ? stringResourceCheckError : submissionError, (28039 & 1024) != 0 ? loaded.conversionInProgress : false, (28039 & 2048) != 0 ? loaded.showFxRateFee : false, (28039 & 4096) != 0 ? loaded.fxRateFeePercent : conversionFxRate.getFeePercent().toPlainString(), (28039 & 8192) != 0 ? loaded.userInteractionEnabled : false, (28039 & 16384) != 0 ? loaded.internalError : null);
                if (loadedCopy != null) {
                    return loadedCopy;
                }
            } catch (IllegalArgumentException e) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
                return loading;
            }
        }
        return loaded;
    }
}
