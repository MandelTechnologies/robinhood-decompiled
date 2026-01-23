package microgram.contracts.helm.proto.p492v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.helm.proto.p492v1.HelmClientService_Adapter;

/* compiled from: HelmClientService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/helm/proto/v1/StartNativeSubflowResponseDto;", "request", "Lmicrogram/contracts/helm/proto/v1/StartNativeSubflowRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.helm.proto.v1.HelmClientService_Adapter$StartNativeSubflowEndpoint$call$1", m3645f = "HelmClientService_Adapter.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.helm.proto.v1.HelmClientService_Adapter$StartNativeSubflowEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class HelmClientService_Adapter4 extends ContinuationImpl7 implements Function2<StartNativeSubflowRequestDto, Continuation<? super StartNativeSubflowResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HelmClientService_Adapter.StartNativeSubflowEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelmClientService_Adapter4(HelmClientService_Adapter.StartNativeSubflowEndpoint startNativeSubflowEndpoint, Continuation<? super HelmClientService_Adapter4> continuation) {
        super(2, continuation);
        this.this$0 = startNativeSubflowEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HelmClientService_Adapter4 helmClientService_Adapter4 = new HelmClientService_Adapter4(this.this$0, continuation);
        helmClientService_Adapter4.L$0 = obj;
        return helmClientService_Adapter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(StartNativeSubflowRequestDto startNativeSubflowRequestDto, Continuation<? super StartNativeSubflowResponseDto> continuation) {
        return ((HelmClientService_Adapter4) create(startNativeSubflowRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        StartNativeSubflowRequestDto startNativeSubflowRequestDto = (StartNativeSubflowRequestDto) this.L$0;
        HelmClientService helmClientService = this.this$0.service;
        this.label = 1;
        Object objStartNativeSubflow = helmClientService.StartNativeSubflow(startNativeSubflowRequestDto, this);
        return objStartNativeSubflow == coroutine_suspended ? coroutine_suspended : objStartNativeSubflow;
    }
}
