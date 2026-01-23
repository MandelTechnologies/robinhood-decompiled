package com.robinhood.android.mcw.mcwcurrencyconverterreceipt;

import com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyConverterReceiptStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptDataState;", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState;", "<init>", "()V", "reduce", "dataState", "feature-mcw-currency-converter-receipt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CurrencyConverterReceiptStateProvider implements StateProvider<CurrencyConverterReceiptDataState, CurrencyConverterReceiptViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CurrencyConverterReceiptViewState reduce(CurrencyConverterReceiptDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getFxOrder() == null || dataState.getToBalance() == null) {
            return CurrencyConverterReceiptViewState.Loading.INSTANCE;
        }
        if (dataState.getFxOrder().getState().isPending()) {
            return new CurrencyConverterReceiptViewState.Pending(dataState.getFxOrder().getAmountFrom());
        }
        Money amountFrom = dataState.getFxOrder().getAmountFrom();
        Money amountTo = dataState.getFxOrder().getAmountTo();
        BigDecimal scale = dataState.getFxOrder().getWeightedAvgConversionRate().setScale(4, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return new CurrencyConverterReceiptViewState.Complete(amountFrom, amountTo, scale, dataState.getToBalance());
    }
}
