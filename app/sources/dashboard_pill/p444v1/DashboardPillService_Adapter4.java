package dashboard_pill.p444v1;

import dashboard_pill.p444v1.DashboardPillService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DashboardPillService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Ldashboard_pill/v1/SetVisibleLocationResponseDto;", "request", "Ldashboard_pill/v1/SetVisibleLocationRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "dashboard_pill.v1.DashboardPillService_Adapter$SetVisibleLocationEndpoint$call$1", m3645f = "DashboardPillService_Adapter.kt", m3646l = {116}, m3647m = "invokeSuspend")
/* renamed from: dashboard_pill.v1.DashboardPillService_Adapter$SetVisibleLocationEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class DashboardPillService_Adapter4 extends ContinuationImpl7 implements Function2<SetVisibleLocationRequestDto, Continuation<? super SetVisibleLocationResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DashboardPillService_Adapter.SetVisibleLocationEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DashboardPillService_Adapter4(DashboardPillService_Adapter.SetVisibleLocationEndpoint setVisibleLocationEndpoint, Continuation<? super DashboardPillService_Adapter4> continuation) {
        super(2, continuation);
        this.this$0 = setVisibleLocationEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DashboardPillService_Adapter4 dashboardPillService_Adapter4 = new DashboardPillService_Adapter4(this.this$0, continuation);
        dashboardPillService_Adapter4.L$0 = obj;
        return dashboardPillService_Adapter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SetVisibleLocationRequestDto setVisibleLocationRequestDto, Continuation<? super SetVisibleLocationResponseDto> continuation) {
        return ((DashboardPillService_Adapter4) create(setVisibleLocationRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        SetVisibleLocationRequestDto setVisibleLocationRequestDto = (SetVisibleLocationRequestDto) this.L$0;
        DashboardPillService dashboardPillService = this.this$0.service;
        this.label = 1;
        Object objSetVisibleLocation = dashboardPillService.SetVisibleLocation(setVisibleLocationRequestDto, this);
        return objSetVisibleLocation == coroutine_suspended ? coroutine_suspended : objSetVisibleLocation;
    }
}
