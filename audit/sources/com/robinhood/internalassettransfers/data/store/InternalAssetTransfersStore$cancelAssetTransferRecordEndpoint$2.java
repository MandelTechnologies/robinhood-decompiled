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

/* compiled from: InternalAssetTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lnimbus/service/v1/AssetTransferRecordDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$2", m3645f = "InternalAssetTransfersStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes15.dex */
final class InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$2 extends ContinuationImpl7 implements Function2<AssetTransferRecordDto, Continuation<? super Unit>, Object> {
    int label;

    InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$2(Continuation<? super InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AssetTransferRecordDto assetTransferRecordDto, Continuation<? super Unit> continuation) {
        return ((InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$2) create(assetTransferRecordDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
