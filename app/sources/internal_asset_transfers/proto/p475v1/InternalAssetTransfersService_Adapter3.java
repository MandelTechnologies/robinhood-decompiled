package internal_asset_transfers.proto.p475v1;

import internal_asset_transfers.proto.p475v1.InternalAssetTransfersService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InternalAssetTransfersService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Linternal_asset_transfers/proto/v1/GetInvestorProfileConfirmationResponseDto;", "request", "Linternal_asset_transfers/proto/v1/GetInvestorProfileConfirmationRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "internal_asset_transfers.proto.v1.InternalAssetTransfersService_Adapter$GetInvestorProfileConfirmationEndpoint$call$1", m3645f = "InternalAssetTransfersService_Adapter.kt", m3646l = {84}, m3647m = "invokeSuspend")
/* renamed from: internal_asset_transfers.proto.v1.InternalAssetTransfersService_Adapter$GetInvestorProfileConfirmationEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class InternalAssetTransfersService_Adapter3 extends ContinuationImpl7 implements Function2<GetInvestorProfileConfirmationRequestDto, Continuation<? super GetInvestorProfileConfirmationResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalAssetTransfersService_Adapter.GetInvestorProfileConfirmationEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAssetTransfersService_Adapter3(InternalAssetTransfersService_Adapter.GetInvestorProfileConfirmationEndpoint getInvestorProfileConfirmationEndpoint, Continuation<? super InternalAssetTransfersService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = getInvestorProfileConfirmationEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalAssetTransfersService_Adapter3 internalAssetTransfersService_Adapter3 = new InternalAssetTransfersService_Adapter3(this.this$0, continuation);
        internalAssetTransfersService_Adapter3.L$0 = obj;
        return internalAssetTransfersService_Adapter3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetInvestorProfileConfirmationRequestDto getInvestorProfileConfirmationRequestDto, Continuation<? super GetInvestorProfileConfirmationResponseDto> continuation) {
        return ((InternalAssetTransfersService_Adapter3) create(getInvestorProfileConfirmationRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetInvestorProfileConfirmationRequestDto getInvestorProfileConfirmationRequestDto = (GetInvestorProfileConfirmationRequestDto) this.L$0;
        InternalAssetTransfersService internalAssetTransfersService = this.this$0.service;
        this.label = 1;
        Object objGetInvestorProfileConfirmation = internalAssetTransfersService.GetInvestorProfileConfirmation(getInvestorProfileConfirmationRequestDto, this);
        return objGetInvestorProfileConfirmation == coroutine_suspended ? coroutine_suspended : objGetInvestorProfileConfirmation;
    }
}
