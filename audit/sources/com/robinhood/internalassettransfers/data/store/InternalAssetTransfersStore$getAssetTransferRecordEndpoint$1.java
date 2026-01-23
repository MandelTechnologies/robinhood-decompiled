package com.robinhood.internalassettransfers.data.store;

import com.robinhood.android.models.internalassettransfers.p193db.AssetTransferRecord;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import nimbus.service.p511v1.AssetTransferRecordDto;
import nimbus.service.p511v1.GetAssetTransferDetailsRequestDto;
import nimbus.service.p511v1.GetAssetTransferDetailsResponseDto;
import nimbus.service.p511v1.NimbusService;

/* compiled from: InternalAssetTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/internalassettransfers/db/AssetTransferRecord;", "assetTransferUuid", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$getAssetTransferRecordEndpoint$1", m3645f = "InternalAssetTransfersStore.kt", m3646l = {89, 90}, m3647m = "invokeSuspend")
/* loaded from: classes15.dex */
final class InternalAssetTransfersStore$getAssetTransferRecordEndpoint$1 extends ContinuationImpl7 implements Function2<String, Continuation<? super AssetTransferRecord>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalAssetTransfersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAssetTransfersStore$getAssetTransferRecordEndpoint$1(InternalAssetTransfersStore internalAssetTransfersStore, Continuation<? super InternalAssetTransfersStore$getAssetTransferRecordEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = internalAssetTransfersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalAssetTransfersStore$getAssetTransferRecordEndpoint$1 internalAssetTransfersStore$getAssetTransferRecordEndpoint$1 = new InternalAssetTransfersStore$getAssetTransferRecordEndpoint$1(this.this$0, continuation);
        internalAssetTransfersStore$getAssetTransferRecordEndpoint$1.L$0 = obj;
        return internalAssetTransfersStore$getAssetTransferRecordEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super AssetTransferRecord> continuation) {
        return ((InternalAssetTransfersStore$getAssetTransferRecordEndpoint$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GetAssetTransferDetailsRequestDto getAssetTransferDetailsRequestDto = new GetAssetTransferDetailsRequestDto((String) this.L$0);
            NimbusService nimbusService = this.this$0.nimbusService;
            this.label = 1;
            obj = nimbusService.GetAssetTransferDetails(getAssetTransferDetailsRequestDto, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetTransferRecord assetTransferRecord = (AssetTransferRecord) obj;
            if (assetTransferRecord != null) {
                return assetTransferRecord;
            }
            throw new IllegalStateException("Expected non-null value from backend");
        }
        ResultKt.throwOnFailure(obj);
        AssetTransferRecordDto asset_transfer_record = ((GetAssetTransferDetailsResponseDto) obj).getAsset_transfer_record();
        if (asset_transfer_record != null) {
            InternalAssetTransfersStore internalAssetTransfersStore = this.this$0;
            this.label = 2;
            obj = internalAssetTransfersStore.internalToDomainModel(asset_transfer_record, this);
        }
        throw new IllegalStateException("Expected non-null value from backend");
    }
}
