package microgram.contracts.helm.proto.p492v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.helm.proto.p492v1.HelmService_Adapter;

/* compiled from: HelmService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/helm/proto/v1/StartFlowResponseDto;", "request", "Lmicrogram/contracts/helm/proto/v1/StartFlowRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.helm.proto.v1.HelmService_Adapter$StartFlowEndpoint$call$1", m3645f = "HelmService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.helm.proto.v1.HelmService_Adapter$StartFlowEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class HelmService_Adapter2 extends ContinuationImpl7 implements Function2<StartFlowRequestDto, Continuation<? super StartFlowResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HelmService_Adapter.StartFlowEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelmService_Adapter2(HelmService_Adapter.StartFlowEndpoint startFlowEndpoint, Continuation<? super HelmService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = startFlowEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HelmService_Adapter2 helmService_Adapter2 = new HelmService_Adapter2(this.this$0, continuation);
        helmService_Adapter2.L$0 = obj;
        return helmService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(StartFlowRequestDto startFlowRequestDto, Continuation<? super StartFlowResponseDto> continuation) {
        return ((HelmService_Adapter2) create(startFlowRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        StartFlowRequestDto startFlowRequestDto = (StartFlowRequestDto) this.L$0;
        HelmService helmService = this.this$0.service;
        this.label = 1;
        Object objStartFlow = helmService.StartFlow(startFlowRequestDto, this);
        return objStartFlow == coroutine_suspended ? coroutine_suspended : objStartFlow;
    }
}
