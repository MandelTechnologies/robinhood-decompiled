package contracts.perpetuals.proto.p433v1;

import contracts.perpetuals.proto.p433v1.PerpetualsButtonsService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PerpetualsButtonsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto;", "request", "Lcontracts/perpetuals/proto/v1/GetButtonsRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "contracts.perpetuals.proto.v1.PerpetualsButtonsService_Adapter$GetButtonsEndpoint$call$1", m3645f = "PerpetualsButtonsService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: contracts.perpetuals.proto.v1.PerpetualsButtonsService_Adapter$GetButtonsEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class PerpetualsButtonsService_Adapter2 extends ContinuationImpl7 implements Function2<GetButtonsRequestDto, Continuation<? super GetButtonsResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PerpetualsButtonsService_Adapter.GetButtonsEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerpetualsButtonsService_Adapter2(PerpetualsButtonsService_Adapter.GetButtonsEndpoint getButtonsEndpoint, Continuation<? super PerpetualsButtonsService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getButtonsEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerpetualsButtonsService_Adapter2 perpetualsButtonsService_Adapter2 = new PerpetualsButtonsService_Adapter2(this.this$0, continuation);
        perpetualsButtonsService_Adapter2.L$0 = obj;
        return perpetualsButtonsService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetButtonsRequestDto getButtonsRequestDto, Continuation<? super GetButtonsResponseDto> continuation) {
        return ((PerpetualsButtonsService_Adapter2) create(getButtonsRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetButtonsRequestDto getButtonsRequestDto = (GetButtonsRequestDto) this.L$0;
        PerpetualsButtonsService perpetualsButtonsService = this.this$0.service;
        this.label = 1;
        Object objGetButtons = perpetualsButtonsService.GetButtons(getButtonsRequestDto, this);
        return objGetButtons == coroutine_suspended ? coroutine_suspended : objGetButtons;
    }
}
