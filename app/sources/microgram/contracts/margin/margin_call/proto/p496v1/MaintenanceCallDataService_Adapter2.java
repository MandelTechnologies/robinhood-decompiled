package microgram.contracts.margin.margin_call.proto.p496v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.margin.margin_call.proto.p496v1.MaintenanceCallDataService_Adapter;

/* compiled from: MaintenanceCallDataService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto;", "request", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.margin.margin_call.proto.v1.MaintenanceCallDataService_Adapter$GetMaintenanceCallDataEndpoint$call$1", m3645f = "MaintenanceCallDataService_Adapter.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.margin.margin_call.proto.v1.MaintenanceCallDataService_Adapter$GetMaintenanceCallDataEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class MaintenanceCallDataService_Adapter2 extends ContinuationImpl7 implements Function2<GetMaintenanceCallDataRequestDto, Continuation<? super GetMaintenanceCallDataResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MaintenanceCallDataService_Adapter.GetMaintenanceCallDataEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MaintenanceCallDataService_Adapter2(MaintenanceCallDataService_Adapter.GetMaintenanceCallDataEndpoint getMaintenanceCallDataEndpoint, Continuation<? super MaintenanceCallDataService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getMaintenanceCallDataEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MaintenanceCallDataService_Adapter2 maintenanceCallDataService_Adapter2 = new MaintenanceCallDataService_Adapter2(this.this$0, continuation);
        maintenanceCallDataService_Adapter2.L$0 = obj;
        return maintenanceCallDataService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetMaintenanceCallDataRequestDto getMaintenanceCallDataRequestDto, Continuation<? super GetMaintenanceCallDataResponseDto> continuation) {
        return ((MaintenanceCallDataService_Adapter2) create(getMaintenanceCallDataRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetMaintenanceCallDataRequestDto getMaintenanceCallDataRequestDto = (GetMaintenanceCallDataRequestDto) this.L$0;
        MaintenanceCallDataService maintenanceCallDataService = this.this$0.service;
        this.label = 1;
        Object objGetMaintenanceCallData = maintenanceCallDataService.GetMaintenanceCallData(getMaintenanceCallDataRequestDto, this);
        return objGetMaintenanceCallData == coroutine_suspended ? coroutine_suspended : objGetMaintenanceCallData;
    }
}
