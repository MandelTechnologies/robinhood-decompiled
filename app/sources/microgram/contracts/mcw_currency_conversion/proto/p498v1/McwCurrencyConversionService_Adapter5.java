package microgram.contracts.mcw_currency_conversion.proto.p498v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.McwCurrencyConversionService_Adapter;

/* compiled from: McwCurrencyConversionService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/PerformQuickConversionResponseDto;", "request", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/PerformQuickConversionRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.mcw_currency_conversion.proto.v1.McwCurrencyConversionService_Adapter$PerformQuickConversionEndpoint$call$1", m3645f = "McwCurrencyConversionService_Adapter.kt", m3646l = {112}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.mcw_currency_conversion.proto.v1.McwCurrencyConversionService_Adapter$PerformQuickConversionEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class McwCurrencyConversionService_Adapter5 extends ContinuationImpl7 implements Function2<PerformQuickConversionRequestDto, Continuation<? super PerformQuickConversionResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ McwCurrencyConversionService_Adapter.PerformQuickConversionEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    McwCurrencyConversionService_Adapter5(McwCurrencyConversionService_Adapter.PerformQuickConversionEndpoint performQuickConversionEndpoint, Continuation<? super McwCurrencyConversionService_Adapter5> continuation) {
        super(2, continuation);
        this.this$0 = performQuickConversionEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        McwCurrencyConversionService_Adapter5 mcwCurrencyConversionService_Adapter5 = new McwCurrencyConversionService_Adapter5(this.this$0, continuation);
        mcwCurrencyConversionService_Adapter5.L$0 = obj;
        return mcwCurrencyConversionService_Adapter5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PerformQuickConversionRequestDto performQuickConversionRequestDto, Continuation<? super PerformQuickConversionResponseDto> continuation) {
        return ((McwCurrencyConversionService_Adapter5) create(performQuickConversionRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        PerformQuickConversionRequestDto performQuickConversionRequestDto = (PerformQuickConversionRequestDto) this.L$0;
        McwCurrencyConversionService mcwCurrencyConversionService = this.this$0.service;
        this.label = 1;
        Object objPerformQuickConversion = mcwCurrencyConversionService.PerformQuickConversion(performQuickConversionRequestDto, this);
        return objPerformQuickConversion == coroutine_suspended ? coroutine_suspended : objPerformQuickConversion;
    }
}
