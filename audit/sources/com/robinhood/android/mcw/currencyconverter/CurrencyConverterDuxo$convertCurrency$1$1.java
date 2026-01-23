package com.robinhood.android.mcw.currencyconverter;

import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterDataState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CurrencyConverterDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$convertCurrency$1$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class CurrencyConverterDuxo$convertCurrency$1$1 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
    final /* synthetic */ StringResource $errorMessage;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyConverterDuxo$convertCurrency$1$1(StringResource stringResource, Continuation<? super CurrencyConverterDuxo$convertCurrency$1$1> continuation) {
        super(2, continuation);
        this.$errorMessage = stringResource;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CurrencyConverterDuxo$convertCurrency$1$1 currencyConverterDuxo$convertCurrency$1$1 = new CurrencyConverterDuxo$convertCurrency$1$1(this.$errorMessage, continuation);
        currencyConverterDuxo$convertCurrency$1$1.L$0 = obj;
        return currencyConverterDuxo$convertCurrency$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
        return ((CurrencyConverterDuxo$convertCurrency$1$1) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
        return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState.targetField : null, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : null, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : null, (24323 & 256) != 0 ? currencyConverterDataState.submissionError : this.$errorMessage, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : null, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : null);
    }
}
