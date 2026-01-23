package accounts.onboarding.proto.p006v1;

import accounts.onboarding.proto.p006v1.ManagementStyleSelectionService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ManagementStyleSelectionService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Laccounts/onboarding/proto/v1/GetManagementStyleSelectionResponseDto;", "request", "Laccounts/onboarding/proto/v1/GetManagementStyleSelectionRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "accounts.onboarding.proto.v1.ManagementStyleSelectionService_Adapter$GetManagementStyleSelectionEndpoint$call$1", m3645f = "ManagementStyleSelectionService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: accounts.onboarding.proto.v1.ManagementStyleSelectionService_Adapter$GetManagementStyleSelectionEndpoint$call$1, reason: use source file name */
/* loaded from: classes23.dex */
final class ManagementStyleSelectionService_Adapter2 extends ContinuationImpl7 implements Function2<GetManagementStyleSelectionRequestDto, Continuation<? super GetManagementStyleSelectionResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ManagementStyleSelectionService_Adapter.GetManagementStyleSelectionEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManagementStyleSelectionService_Adapter2(ManagementStyleSelectionService_Adapter.GetManagementStyleSelectionEndpoint getManagementStyleSelectionEndpoint, Continuation<? super ManagementStyleSelectionService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getManagementStyleSelectionEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ManagementStyleSelectionService_Adapter2 managementStyleSelectionService_Adapter2 = new ManagementStyleSelectionService_Adapter2(this.this$0, continuation);
        managementStyleSelectionService_Adapter2.L$0 = obj;
        return managementStyleSelectionService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetManagementStyleSelectionRequestDto getManagementStyleSelectionRequestDto, Continuation<? super GetManagementStyleSelectionResponseDto> continuation) {
        return ((ManagementStyleSelectionService_Adapter2) create(getManagementStyleSelectionRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetManagementStyleSelectionRequestDto getManagementStyleSelectionRequestDto = (GetManagementStyleSelectionRequestDto) this.L$0;
        ManagementStyleSelectionService managementStyleSelectionService = this.this$0.service;
        this.label = 1;
        Object objGetManagementStyleSelection = managementStyleSelectionService.GetManagementStyleSelection(getManagementStyleSelectionRequestDto, this);
        return objGetManagementStyleSelection == coroutine_suspended ? coroutine_suspended : objGetManagementStyleSelection;
    }
}
