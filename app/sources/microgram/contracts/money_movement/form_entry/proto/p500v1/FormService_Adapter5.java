package microgram.contracts.money_movement.form_entry.proto.p500v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormService_Adapter;

/* compiled from: FormService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireInformationForServerResponseDto;", "request", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireInformationForServerRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.money_movement.form_entry.proto.v1.FormService_Adapter$GetWireInformationForServerEndpoint$call$1", m3645f = "FormService_Adapter.kt", m3646l = {131}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.money_movement.form_entry.proto.v1.FormService_Adapter$GetWireInformationForServerEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class FormService_Adapter5 extends ContinuationImpl7 implements Function2<GetWireInformationForServerRequestDto, Continuation<? super GetWireInformationForServerResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FormService_Adapter.GetWireInformationForServerEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormService_Adapter5(FormService_Adapter.GetWireInformationForServerEndpoint getWireInformationForServerEndpoint, Continuation<? super FormService_Adapter5> continuation) {
        super(2, continuation);
        this.this$0 = getWireInformationForServerEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FormService_Adapter5 formService_Adapter5 = new FormService_Adapter5(this.this$0, continuation);
        formService_Adapter5.L$0 = obj;
        return formService_Adapter5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetWireInformationForServerRequestDto getWireInformationForServerRequestDto, Continuation<? super GetWireInformationForServerResponseDto> continuation) {
        return ((FormService_Adapter5) create(getWireInformationForServerRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetWireInformationForServerRequestDto getWireInformationForServerRequestDto = (GetWireInformationForServerRequestDto) this.L$0;
        FormService formService = this.this$0.service;
        this.label = 1;
        Object objGetWireInformationForServer = formService.GetWireInformationForServer(getWireInformationForServerRequestDto, this);
        return objGetWireInformationForServer == coroutine_suspended ? coroutine_suspended : objGetWireInformationForServer;
    }
}
