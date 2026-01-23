package com.robinhood.internalassettransfers.data.store;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import nimbus.service.p511v1.AssetTransferRecordDto;
import nimbus.service.p511v1.CancelAssetTransferRequestDto;
import nimbus.service.p511v1.CancelAssetTransferResponseDto;
import nimbus.service.p511v1.NimbusService;

/* compiled from: InternalAssetTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lnimbus/service/v1/AssetTransferRecordDto;", "assetTransferUuid", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$1", m3645f = "InternalAssetTransfersStore.kt", m3646l = {102}, m3647m = "invokeSuspend")
/* loaded from: classes15.dex */
final class InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$1 extends ContinuationImpl7 implements Function2<String, Continuation<? super AssetTransferRecordDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalAssetTransfersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$1(InternalAssetTransfersStore internalAssetTransfersStore, Continuation<? super InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = internalAssetTransfersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$1 internalAssetTransfersStore$cancelAssetTransferRecordEndpoint$1 = new InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$1(this.this$0, continuation);
        internalAssetTransfersStore$cancelAssetTransferRecordEndpoint$1.L$0 = obj;
        return internalAssetTransfersStore$cancelAssetTransferRecordEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super AssetTransferRecordDto> continuation) {
        return ((InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CancelAssetTransferRequestDto cancelAssetTransferRequestDto = new CancelAssetTransferRequestDto((String) this.L$0);
            NimbusService nimbusService = this.this$0.nimbusService;
            this.label = 1;
            obj = nimbusService.CancelAssetTransfer(cancelAssetTransferRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AssetTransferRecordDto asset_transfer_record = ((CancelAssetTransferResponseDto) obj).getAsset_transfer_record();
        if (asset_transfer_record != null) {
            return asset_transfer_record;
        }
        throw new IllegalStateException("Expected non-null value from backend");
    }
}
