package ventures.trailer.proto.p551v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import ventures.trailer.proto.p551v1.VenturesTrailerService_Adapter;

/* compiled from: VenturesTrailerService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lventures/trailer/proto/v1/GetTrailerResponseDto;", "request", "Lventures/trailer/proto/v1/GetTrailerRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "ventures.trailer.proto.v1.VenturesTrailerService_Adapter$GetTrailerEndpoint$call$1", m3645f = "VenturesTrailerService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: ventures.trailer.proto.v1.VenturesTrailerService_Adapter$GetTrailerEndpoint$call$1, reason: use source file name */
/* loaded from: classes28.dex */
final class VenturesTrailerService_Adapter2 extends ContinuationImpl7 implements Function2<GetTrailerRequestDto, Continuation<? super GetTrailerResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VenturesTrailerService_Adapter.GetTrailerEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VenturesTrailerService_Adapter2(VenturesTrailerService_Adapter.GetTrailerEndpoint getTrailerEndpoint, Continuation<? super VenturesTrailerService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getTrailerEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VenturesTrailerService_Adapter2 venturesTrailerService_Adapter2 = new VenturesTrailerService_Adapter2(this.this$0, continuation);
        venturesTrailerService_Adapter2.L$0 = obj;
        return venturesTrailerService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetTrailerRequestDto getTrailerRequestDto, Continuation<? super GetTrailerResponseDto> continuation) {
        return ((VenturesTrailerService_Adapter2) create(getTrailerRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetTrailerRequestDto getTrailerRequestDto = (GetTrailerRequestDto) this.L$0;
        VenturesTrailerService venturesTrailerService = this.this$0.service;
        this.label = 1;
        Object objGetTrailer = venturesTrailerService.GetTrailer(getTrailerRequestDto, this);
        return objGetTrailer == coroutine_suspended ? coroutine_suspended : objGetTrailer;
    }
}
