package com.robinhood.internalassettransfers.data.store;

import com.robinhood.android.models.internalassettransfers.p193db.AssetTransferRecord;
import com.robinhood.models.internalassettransfer.p328db.dao.InternalAssetTransferDao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import nimbus.service.p511v1.AssetTransferRecordDto;
import nimbus.service.p511v1.GetAssetTransferListResponseDto;

/* compiled from: InternalAssetTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lnimbus/service/v1/GetAssetTransferListResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$4", m3645f = "InternalAssetTransfersStore.kt", m3646l = {73}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes15.dex */
final class InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$4 extends ContinuationImpl7 implements Function2<GetAssetTransferListResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InternalAssetTransfersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$4(InternalAssetTransfersStore internalAssetTransfersStore, Continuation<? super InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$4> continuation) {
        super(2, continuation);
        this.this$0 = internalAssetTransfersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$4 internalAssetTransfersStore$getAssetTransferRecordListEndpoint$4 = new InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$4(this.this$0, continuation);
        internalAssetTransfersStore$getAssetTransferRecordListEndpoint$4.L$0 = obj;
        return internalAssetTransfersStore$getAssetTransferRecordListEndpoint$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetAssetTransferListResponseDto getAssetTransferListResponseDto, Continuation<? super Unit> continuation) {
        return ((InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$4) create(getAssetTransferListResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0072 -> B:15:0x0073). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InternalAssetTransfersStore internalAssetTransfersStore;
        InternalAssetTransferDao internalAssetTransferDao;
        Collection arrayList;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GetAssetTransferListResponseDto getAssetTransferListResponseDto = (GetAssetTransferListResponseDto) this.L$0;
            InternalAssetTransferDao internalAssetTransferDao2 = this.this$0.internalAssetTransferDao;
            List<AssetTransferRecordDto> asset_transfer_record = getAssetTransferListResponseDto.getAsset_transfer_record();
            InternalAssetTransfersStore internalAssetTransfersStore2 = this.this$0;
            internalAssetTransfersStore = internalAssetTransfersStore2;
            internalAssetTransferDao = internalAssetTransferDao2;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asset_transfer_record, 10));
            it = asset_transfer_record.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (Collection) this.L$4;
            internalAssetTransferDao = (InternalAssetTransferDao) this.L$3;
            it = (Iterator) this.L$2;
            Collection collection = (Collection) this.L$1;
            internalAssetTransfersStore = (InternalAssetTransfersStore) this.L$0;
            ResultKt.throwOnFailure(obj);
            arrayList.add(InternalAssetTransfersStoreKt.toDbModel((AssetTransferRecord) obj));
            arrayList = collection;
            if (it.hasNext()) {
                AssetTransferRecordDto assetTransferRecordDto = (AssetTransferRecordDto) it.next();
                this.L$0 = internalAssetTransfersStore;
                this.L$1 = arrayList;
                this.L$2 = it;
                this.L$3 = internalAssetTransferDao;
                this.L$4 = arrayList;
                this.label = 1;
                obj = internalAssetTransfersStore.internalToDomainModel(assetTransferRecordDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                collection = arrayList;
                arrayList.add(InternalAssetTransfersStoreKt.toDbModel((AssetTransferRecord) obj));
                arrayList = collection;
                if (it.hasNext()) {
                    internalAssetTransferDao.insert((List) arrayList);
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
