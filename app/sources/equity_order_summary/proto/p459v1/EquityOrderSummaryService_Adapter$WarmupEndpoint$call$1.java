package equity_order_summary.proto.p459v1;

import equity_order_summary.proto.p459v1.EquityOrderSummaryService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityOrderSummaryService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lequity_order_summary/proto/v1/WarmupResponseDto;", "request", "Lequity_order_summary/proto/v1/WarmupRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "equity_order_summary.proto.v1.EquityOrderSummaryService_Adapter$WarmupEndpoint$call$1", m3645f = "EquityOrderSummaryService_Adapter.kt", m3646l = {114}, m3647m = "invokeSuspend")
/* loaded from: classes18.dex */
final class EquityOrderSummaryService_Adapter$WarmupEndpoint$call$1 extends ContinuationImpl7 implements Function2<WarmupRequestDto, Continuation<? super WarmupResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquityOrderSummaryService_Adapter.WarmupEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityOrderSummaryService_Adapter$WarmupEndpoint$call$1(EquityOrderSummaryService_Adapter.WarmupEndpoint warmupEndpoint, Continuation<? super EquityOrderSummaryService_Adapter$WarmupEndpoint$call$1> continuation) {
        super(2, continuation);
        this.this$0 = warmupEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityOrderSummaryService_Adapter$WarmupEndpoint$call$1 equityOrderSummaryService_Adapter$WarmupEndpoint$call$1 = new EquityOrderSummaryService_Adapter$WarmupEndpoint$call$1(this.this$0, continuation);
        equityOrderSummaryService_Adapter$WarmupEndpoint$call$1.L$0 = obj;
        return equityOrderSummaryService_Adapter$WarmupEndpoint$call$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WarmupRequestDto warmupRequestDto, Continuation<? super WarmupResponseDto> continuation) {
        return ((EquityOrderSummaryService_Adapter$WarmupEndpoint$call$1) create(warmupRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        WarmupRequestDto warmupRequestDto = (WarmupRequestDto) this.L$0;
        EquityOrderSummaryService equityOrderSummaryService = this.this$0.service;
        this.label = 1;
        Object objWarmup = equityOrderSummaryService.Warmup(warmupRequestDto, this);
        return objWarmup == coroutine_suspended ? coroutine_suspended : objWarmup;
    }
}
