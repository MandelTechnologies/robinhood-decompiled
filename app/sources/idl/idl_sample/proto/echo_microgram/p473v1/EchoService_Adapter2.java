package idl.idl_sample.proto.echo_microgram.p473v1;

import idl.idl_sample.proto.echo_microgram.p473v1.EchoService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EchoService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lidl/idl_sample/proto/echo_microgram/v1/EchoStringResponseDto;", "request", "Lidl/idl_sample/proto/echo_microgram/v1/EchoStringRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "idl.idl_sample.proto.echo_microgram.v1.EchoService_Adapter$EchoStringEndpoint$call$1", m3645f = "EchoService_Adapter.kt", m3646l = {67}, m3647m = "invokeSuspend")
/* renamed from: idl.idl_sample.proto.echo_microgram.v1.EchoService_Adapter$EchoStringEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class EchoService_Adapter2 extends ContinuationImpl7 implements Function2<EchoStringRequestDto, Continuation<? super EchoStringResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EchoService_Adapter.EchoStringEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EchoService_Adapter2(EchoService_Adapter.EchoStringEndpoint echoStringEndpoint, Continuation<? super EchoService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = echoStringEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EchoService_Adapter2 echoService_Adapter2 = new EchoService_Adapter2(this.this$0, continuation);
        echoService_Adapter2.L$0 = obj;
        return echoService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EchoStringRequestDto echoStringRequestDto, Continuation<? super EchoStringResponseDto> continuation) {
        return ((EchoService_Adapter2) create(echoStringRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        EchoStringRequestDto echoStringRequestDto = (EchoStringRequestDto) this.L$0;
        EchoService echoService = this.this$0.service;
        this.label = 1;
        Object objEchoString = echoService.EchoString(echoStringRequestDto, this);
        return objEchoString == coroutine_suspended ? coroutine_suspended : objEchoString;
    }
}
