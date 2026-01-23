package com.robinhood.android.mcw.currencyconverter;

import com.robinhood.android.lib.store.mcw.McwStore;
import com.robinhood.android.lib.store.mcw.data.ConversionFxRate;
import com.robinhood.android.lib.store.mcw.data.ConvertCurrencyResponse;
import com.robinhood.android.lib.store.mcw.data.ConvertibleCurrency;
import com.robinhood.android.mcw.contracts.CurrencyConverterKey;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterDataState;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterEvent;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterInternalError;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.util.Money;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyConverterDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$convertCurrency$1$3", m3645f = "CurrencyConverterDuxo.kt", m3646l = {434}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class CurrencyConverterDuxo$convertCurrency$1$3 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ ConvertibleCurrency $fromCurrency;
    final /* synthetic */ BigDecimal $fromValue;
    final /* synthetic */ ConversionFxRate $fxRate;
    final /* synthetic */ ConvertibleCurrency $toCurrency;
    final /* synthetic */ BigDecimal $toValue;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CurrencyConverterDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyConverterDuxo$convertCurrency$1$3(CurrencyConverterDuxo currencyConverterDuxo, String str, ConversionFxRate conversionFxRate, BigDecimal bigDecimal, ConvertibleCurrency convertibleCurrency, ConvertibleCurrency convertibleCurrency2, BigDecimal bigDecimal2, Continuation<? super CurrencyConverterDuxo$convertCurrency$1$3> continuation) {
        super(2, continuation);
        this.this$0 = currencyConverterDuxo;
        this.$accountNumber = str;
        this.$fxRate = conversionFxRate;
        this.$fromValue = bigDecimal;
        this.$fromCurrency = convertibleCurrency;
        this.$toCurrency = convertibleCurrency2;
        this.$toValue = bigDecimal2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CurrencyConverterDuxo$convertCurrency$1$3 currencyConverterDuxo$convertCurrency$1$3 = new CurrencyConverterDuxo$convertCurrency$1$3(this.this$0, this.$accountNumber, this.$fxRate, this.$fromValue, this.$fromCurrency, this.$toCurrency, this.$toValue, continuation);
        currencyConverterDuxo$convertCurrency$1$3.L$0 = obj;
        return currencyConverterDuxo$convertCurrency$1$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
        return ((CurrencyConverterDuxo$convertCurrency$1$3) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        CurrencyConverterDataState currencyConverterDataState;
        Object objConvertCurrency;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CurrencyConverterDataState currencyConverterDataState2 = (CurrencyConverterDataState) this.L$0;
            try {
                McwStore mcwStore = this.this$0.mcwStore;
                String str = this.$accountNumber;
                String symbolId = this.$fxRate.getSymbolId();
                BigDecimal bigDecimal = this.$fromValue;
                Currency currency = this.$fromCurrency.getCurrency();
                Currency currency2 = this.$toCurrency.getCurrency();
                this.L$0 = currencyConverterDataState2;
                this.label = 1;
                objConvertCurrency = mcwStore.convertCurrency(str, symbolId, bigDecimal, currency, currency2, this);
                if (objConvertCurrency == coroutine_suspended) {
                    return coroutine_suspended;
                }
                currencyConverterDataState = currencyConverterDataState2;
            } catch (Throwable th2) {
                th = th2;
                currencyConverterDataState = currencyConverterDataState2;
                if (!Throwables.isNetworkRelated(th)) {
                }
                CurrencyConverterDataState currencyConverterDataState3 = currencyConverterDataState;
                return currencyConverterDataState3.copy((24323 & 1) != 0 ? currencyConverterDataState3.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState3.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState3.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState3.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState3.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState3.targetField : null, (24323 & 64) != 0 ? currencyConverterDataState3.prevAmount : null, (24323 & 128) != 0 ? currencyConverterDataState3.nextAmount : null, (24323 & 256) != 0 ? currencyConverterDataState3.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState3.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState3.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState3.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState3.internalError : CurrencyConverterInternalError.NonFatal.INSTANCE, (24323 & 8192) != 0 ? currencyConverterDataState3.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState3.isFxFeeEnabled : null);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objConvertCurrency = obj;
            } catch (Throwable th3) {
                th = th3;
                if (!Throwables.isNetworkRelated(th)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                }
                CurrencyConverterDataState currencyConverterDataState32 = currencyConverterDataState;
                return currencyConverterDataState32.copy((24323 & 1) != 0 ? currencyConverterDataState32.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState32.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState32.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState32.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState32.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState32.targetField : null, (24323 & 64) != 0 ? currencyConverterDataState32.prevAmount : null, (24323 & 128) != 0 ? currencyConverterDataState32.nextAmount : null, (24323 & 256) != 0 ? currencyConverterDataState32.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState32.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState32.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState32.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState32.internalError : CurrencyConverterInternalError.NonFatal.INSTANCE, (24323 & 8192) != 0 ? currencyConverterDataState32.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState32.isFxFeeEnabled : null);
            }
        }
        ConvertCurrencyResponse convertCurrencyResponse = (ConvertCurrencyResponse) objConvertCurrency;
        CurrencyConverterDuxo currencyConverterDuxo = this.this$0;
        String str2 = this.$accountNumber;
        Money money = new Money(this.$fromCurrency.getCurrency(), this.$fromValue);
        Money money2 = new Money(this.$toCurrency.getCurrency(), this.$toValue);
        String plainString = this.$fxRate.getBidPrice().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        Currency currency3 = this.$toCurrency.getCurrency();
        BigDecimal bigDecimalAdd = this.$toCurrency.getBalance().add(this.$toValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        currencyConverterDuxo.submit(new CurrencyConverterEvent.ConversionCompleted(str2, money, money2, plainString, new Money(currency3, bigDecimalAdd), convertCurrencyResponse.getOrderId(), ((CurrencyConverterKey) CurrencyConverterDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getSource()));
        return currencyConverterDataState;
    }
}
