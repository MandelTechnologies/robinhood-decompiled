package com.robinhood.android.lib.store.mcw;

import com.robinhood.android.lib.store.mcw.data.ConvertCurrencyRequest;
import com.robinhood.android.lib.store.mcw.data.ConvertCurrencyRequest2;
import com.robinhood.android.lib.store.mcw.data.ConvertCurrencyResponse;
import com.robinhood.android.lib.store.mcw.data.ConvertCurrencyResponse2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.ConvertCurrencyRequestDto;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.ConvertCurrencyResponseDto;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.McwCurrencyConversionService;

/* compiled from: McwStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/store/mcw/data/ConvertCurrencyResponse;", "request", "Lcom/robinhood/android/lib/store/mcw/data/ConvertCurrencyRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.mcw.McwStore$convertCurrencyEndpoint$1", m3645f = "McwStore.kt", m3646l = {128}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class McwStore$convertCurrencyEndpoint$1 extends ContinuationImpl7 implements Function2<ConvertCurrencyRequest, Continuation<? super ConvertCurrencyResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ McwStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    McwStore$convertCurrencyEndpoint$1(McwStore mcwStore, Continuation<? super McwStore$convertCurrencyEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = mcwStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        McwStore$convertCurrencyEndpoint$1 mcwStore$convertCurrencyEndpoint$1 = new McwStore$convertCurrencyEndpoint$1(this.this$0, continuation);
        mcwStore$convertCurrencyEndpoint$1.L$0 = obj;
        return mcwStore$convertCurrencyEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ConvertCurrencyRequest convertCurrencyRequest, Continuation<? super ConvertCurrencyResponse> continuation) {
        return ((McwStore$convertCurrencyEndpoint$1) create(convertCurrencyRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ConvertCurrencyRequest convertCurrencyRequest = (ConvertCurrencyRequest) this.L$0;
            McwCurrencyConversionService mcwCurrencyConversionService = this.this$0.currencyConversionService;
            ConvertCurrencyRequestDto convertCurrencyRequestDto = ConvertCurrencyRequest2.toConvertCurrencyRequestDto(convertCurrencyRequest);
            this.label = 1;
            obj = mcwCurrencyConversionService.ConvertCurrency(convertCurrencyRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ConvertCurrencyResponse2.toConvertCurrencyResponse((ConvertCurrencyResponseDto) obj);
    }
}
