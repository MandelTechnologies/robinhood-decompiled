package microgram.p507ui.p508v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.p507ui.p508v1.LaunchService_Adapter;

/* compiled from: LaunchService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/ui/v1/LaunchRouterResponseDto;", "request", "Lmicrogram/ui/v1/LaunchRouterRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.ui.v1.LaunchService_Adapter$LaunchRouterEndpoint$call$1", m3645f = "LaunchService_Adapter.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* renamed from: microgram.ui.v1.LaunchService_Adapter$LaunchRouterEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class LaunchService_Adapter2 extends ContinuationImpl7 implements Function2<LaunchRouterRequestDto, Continuation<? super LaunchRouterResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LaunchService_Adapter.LaunchRouterEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LaunchService_Adapter2(LaunchService_Adapter.LaunchRouterEndpoint launchRouterEndpoint, Continuation<? super LaunchService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = launchRouterEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LaunchService_Adapter2 launchService_Adapter2 = new LaunchService_Adapter2(this.this$0, continuation);
        launchService_Adapter2.L$0 = obj;
        return launchService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LaunchRouterRequestDto launchRouterRequestDto, Continuation<? super LaunchRouterResponseDto> continuation) {
        return ((LaunchService_Adapter2) create(launchRouterRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        LaunchRouterRequestDto launchRouterRequestDto = (LaunchRouterRequestDto) this.L$0;
        LaunchService launchService = this.this$0.service;
        this.label = 1;
        Object objLaunchRouter = launchService.LaunchRouter(launchRouterRequestDto, this);
        return objLaunchRouter == coroutine_suspended ? coroutine_suspended : objLaunchRouter;
    }
}
