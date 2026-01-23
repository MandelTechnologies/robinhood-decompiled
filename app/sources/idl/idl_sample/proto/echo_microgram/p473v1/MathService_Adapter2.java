package idl.idl_sample.proto.echo_microgram.p473v1;

import idl.idl_sample.proto.echo_microgram.p473v1.MathService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MathService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lidl/idl_sample/proto/echo_microgram/v1/Int32SumResponseDto;", "request", "Lidl/idl_sample/proto/echo_microgram/v1/Int32SumRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "idl.idl_sample.proto.echo_microgram.v1.MathService_Adapter$Int32SumEndpoint$call$1", m3645f = "MathService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: idl.idl_sample.proto.echo_microgram.v1.MathService_Adapter$Int32SumEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class MathService_Adapter2 extends ContinuationImpl7 implements Function2<Int32SumRequestDto, Continuation<? super Int32SumResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MathService_Adapter.Int32SumEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MathService_Adapter2(MathService_Adapter.Int32SumEndpoint int32SumEndpoint, Continuation<? super MathService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = int32SumEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MathService_Adapter2 mathService_Adapter2 = new MathService_Adapter2(this.this$0, continuation);
        mathService_Adapter2.L$0 = obj;
        return mathService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Int32SumRequestDto int32SumRequestDto, Continuation<? super Int32SumResponseDto> continuation) {
        return ((MathService_Adapter2) create(int32SumRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Int32SumRequestDto int32SumRequestDto = (Int32SumRequestDto) this.L$0;
        MathService mathService = this.this$0.service;
        this.label = 1;
        Object objInt32Sum = mathService.Int32Sum(int32SumRequestDto, this);
        return objInt32Sum == coroutine_suspended ? coroutine_suspended : objInt32Sum;
    }
}
