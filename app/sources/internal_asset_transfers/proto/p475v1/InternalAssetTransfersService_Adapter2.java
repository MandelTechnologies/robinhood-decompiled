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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Linternal_asset_transfers/proto/v1/GetEligibleAccountsResponseDto;", "request", "Linternal_asset_transfers/proto/v1/GetEligibleAccountsRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "internal_asset_transfers.proto.v1.InternalAssetTransfersService_Adapter$GetEligibleAccountsEndpoint$call$1", m3645f = "InternalAssetTransfersService_Adapter.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* renamed from: internal_asset_transfers.proto.v1.InternalAssetTransfersService_Adapter$GetEligibleAccountsEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class InternalAssetTransfersService_Adapter2 extends ContinuationImpl7 implements Function2<GetEligibleAccountsRequestDto, Continuation<? super GetEligibleAccountsResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalAssetTransfersService_Adapter.GetEligibleAccountsEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAssetTransfersService_Adapter2(InternalAssetTransfersService_Adapter.GetEligibleAccountsEndpoint getEligibleAccountsEndpoint, Continuation<? super InternalAssetTransfersService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getEligibleAccountsEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalAssetTransfersService_Adapter2 internalAssetTransfersService_Adapter2 = new InternalAssetTransfersService_Adapter2(this.this$0, continuation);
        internalAssetTransfersService_Adapter2.L$0 = obj;
        return internalAssetTransfersService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetEligibleAccountsRequestDto getEligibleAccountsRequestDto, Continuation<? super GetEligibleAccountsResponseDto> continuation) {
        return ((InternalAssetTransfersService_Adapter2) create(getEligibleAccountsRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetEligibleAccountsRequestDto getEligibleAccountsRequestDto = (GetEligibleAccountsRequestDto) this.L$0;
        InternalAssetTransfersService internalAssetTransfersService = this.this$0.service;
        this.label = 1;
        Object objGetEligibleAccounts = internalAssetTransfersService.GetEligibleAccounts(getEligibleAccountsRequestDto, this);
        return objGetEligibleAccounts == coroutine_suspended ? coroutine_suspended : objGetEligibleAccounts;
    }
}
