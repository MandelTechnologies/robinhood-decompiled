package microgram.contracts.service_incentives_wonka.proto.p504v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.service_incentives_wonka.proto.p504v1.IncentivesWonkaService_Adapter;

/* compiled from: IncentivesWonkaService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/ContinueTransferResponseDto;", "request", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/ContinueTransferRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.service_incentives_wonka.proto.v1.IncentivesWonkaService_Adapter$ContinueTransferEndpoint$call$1", m3645f = "IncentivesWonkaService_Adapter.kt", m3646l = {84}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.service_incentives_wonka.proto.v1.IncentivesWonkaService_Adapter$ContinueTransferEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class IncentivesWonkaService_Adapter2 extends ContinuationImpl7 implements Function2<ContinueTransferRequestDto, Continuation<? super ContinueTransferResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IncentivesWonkaService_Adapter.ContinueTransferEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IncentivesWonkaService_Adapter2(IncentivesWonkaService_Adapter.ContinueTransferEndpoint continueTransferEndpoint, Continuation<? super IncentivesWonkaService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = continueTransferEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IncentivesWonkaService_Adapter2 incentivesWonkaService_Adapter2 = new IncentivesWonkaService_Adapter2(this.this$0, continuation);
        incentivesWonkaService_Adapter2.L$0 = obj;
        return incentivesWonkaService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ContinueTransferRequestDto continueTransferRequestDto, Continuation<? super ContinueTransferResponseDto> continuation) {
        return ((IncentivesWonkaService_Adapter2) create(continueTransferRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ContinueTransferRequestDto continueTransferRequestDto = (ContinueTransferRequestDto) this.L$0;
        IncentivesWonkaService incentivesWonkaService = this.this$0.service;
        this.label = 1;
        Object objContinueTransfer = incentivesWonkaService.ContinueTransfer(continueTransferRequestDto, this);
        return objContinueTransfer == coroutine_suspended ? coroutine_suspended : objContinueTransfer;
    }
}
