package com.robinhood.android.mcw.currencyconverter;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.store.mcw.data.ConvertibleCurrency;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterDataState;
import com.robinhood.android.mcw.currencyconverter.models.TriggerAction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: CurrencyConverterDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$swapCurrencies$1$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class CurrencyConverterDuxo$swapCurrencies$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConvertibleCurrency $oldFromCurrency;
    final /* synthetic */ ConvertibleCurrency $oldToCurrency;
    int label;
    final /* synthetic */ CurrencyConverterDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyConverterDuxo$swapCurrencies$1$1(CurrencyConverterDuxo currencyConverterDuxo, ConvertibleCurrency convertibleCurrency, ConvertibleCurrency convertibleCurrency2, Continuation<? super CurrencyConverterDuxo$swapCurrencies$1$1> continuation) {
        super(2, continuation);
        this.this$0 = currencyConverterDuxo;
        this.$oldToCurrency = convertibleCurrency;
        this.$oldFromCurrency = convertibleCurrency2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurrencyConverterDuxo$swapCurrencies$1$1(this.this$0, this.$oldToCurrency, this.$oldFromCurrency, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CurrencyConverterDuxo$swapCurrencies$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: CurrencyConverterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$swapCurrencies$1$1$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$swapCurrencies$1$1$1 */
    static final class C217001 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C217001(Continuation<? super C217001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217001 c217001 = new C217001(continuation);
            c217001.L$0 = obj;
            return c217001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
            return ((C217001) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
            return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState.targetField : null, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : null, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : null, (24323 & 256) != 0 ? currencyConverterDataState.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : null, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : TriggerAction.SWAP_CURRENCIES, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C217001(null));
            StateFlow2 stateFlow2 = this.this$0.fxDirectionFlow;
            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$oldToCurrency, this.$oldFromCurrency);
            this.label = 1;
            if (stateFlow2.emit(tuples2M3642to, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
