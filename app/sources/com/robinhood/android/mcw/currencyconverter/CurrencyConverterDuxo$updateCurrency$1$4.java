package com.robinhood.android.mcw.currencyconverter;

import com.robinhood.android.lib.store.mcw.data.ConvertibleCurrency;
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
@DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$updateCurrency$1$4", m3645f = "CurrencyConverterDuxo.kt", m3646l = {367}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class CurrencyConverterDuxo$updateCurrency$1$4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConvertibleCurrency $newFromCurrency;
    final /* synthetic */ ConvertibleCurrency $newToCurrency;
    int label;
    final /* synthetic */ CurrencyConverterDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyConverterDuxo$updateCurrency$1$4(CurrencyConverterDuxo currencyConverterDuxo, ConvertibleCurrency convertibleCurrency, ConvertibleCurrency convertibleCurrency2, Continuation<? super CurrencyConverterDuxo$updateCurrency$1$4> continuation) {
        super(2, continuation);
        this.this$0 = currencyConverterDuxo;
        this.$newFromCurrency = convertibleCurrency;
        this.$newToCurrency = convertibleCurrency2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurrencyConverterDuxo$updateCurrency$1$4(this.this$0, this.$newFromCurrency, this.$newToCurrency, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CurrencyConverterDuxo$updateCurrency$1$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow2 stateFlow2 = this.this$0.fxDirectionFlow;
            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$newFromCurrency, this.$newToCurrency);
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
