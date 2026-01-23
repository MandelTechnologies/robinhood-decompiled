package com.robinhood.android.lib.store.mcw;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.store.mcw.data.PerformQuickConversionRequest;
import com.robinhood.android.lib.store.mcw.data.PerformQuickConversionRequest2;
import com.robinhood.android.lib.store.mcw.data.PerformQuickConversionResponse;
import com.robinhood.android.lib.store.mcw.data.PerformQuickConversionResponse2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.McwCurrencyConversionService;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.PerformQuickConversionRequestDto;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.PerformQuickConversionResponseDto;

/* compiled from: McwStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/store/mcw/data/PerformQuickConversionResponse;", "request", "Lcom/robinhood/android/lib/store/mcw/data/PerformQuickConversionRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.mcw.McwStore$performQuickConversionEndpoint$1", m3645f = "McwStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class McwStore$performQuickConversionEndpoint$1 extends ContinuationImpl7 implements Function2<PerformQuickConversionRequest, Continuation<? super PerformQuickConversionResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ McwStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    McwStore$performQuickConversionEndpoint$1(McwStore mcwStore, Continuation<? super McwStore$performQuickConversionEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = mcwStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        McwStore$performQuickConversionEndpoint$1 mcwStore$performQuickConversionEndpoint$1 = new McwStore$performQuickConversionEndpoint$1(this.this$0, continuation);
        mcwStore$performQuickConversionEndpoint$1.L$0 = obj;
        return mcwStore$performQuickConversionEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PerformQuickConversionRequest performQuickConversionRequest, Continuation<? super PerformQuickConversionResponse> continuation) {
        return ((McwStore$performQuickConversionEndpoint$1) create(performQuickConversionRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PerformQuickConversionRequest performQuickConversionRequest = (PerformQuickConversionRequest) this.L$0;
            McwCurrencyConversionService mcwCurrencyConversionService = this.this$0.currencyConversionService;
            PerformQuickConversionRequestDto performQuickConversionRequestDto = PerformQuickConversionRequest2.toPerformQuickConversionRequestDto(performQuickConversionRequest);
            this.label = 1;
            obj = mcwCurrencyConversionService.PerformQuickConversion(performQuickConversionRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return PerformQuickConversionResponse2.toPerformQuickConversionResponse((PerformQuickConversionResponseDto) obj);
    }
}
