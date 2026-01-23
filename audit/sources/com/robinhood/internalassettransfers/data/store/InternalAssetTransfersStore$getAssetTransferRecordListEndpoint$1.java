package com.robinhood.internalassettransfers.data.store;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import nimbus.service.p511v1.GetAssetTransferListRequestDto;
import nimbus.service.p511v1.GetAssetTransferListResponseDto;
import nimbus.service.p511v1.NimbusService;

/* compiled from: InternalAssetTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lnimbus/service/v1/GetAssetTransferListResponseDto;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$1", m3645f = "InternalAssetTransfersStore.kt", m3646l = {70}, m3647m = "invokeSuspend")
/* loaded from: classes15.dex */
final class InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Unit, ? extends IdlPaginationCursor>, Continuation<? super GetAssetTransferListResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalAssetTransfersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$1(InternalAssetTransfersStore internalAssetTransfersStore, Continuation<? super InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = internalAssetTransfersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$1 internalAssetTransfersStore$getAssetTransferRecordListEndpoint$1 = new InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$1(this.this$0, continuation);
        internalAssetTransfersStore$getAssetTransferRecordListEndpoint$1.L$0 = obj;
        return internalAssetTransfersStore$getAssetTransferRecordListEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Unit, ? extends IdlPaginationCursor> tuples2, Continuation<? super GetAssetTransferListResponseDto> continuation) {
        return invoke2((Tuples2<Unit, IdlPaginationCursor>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<Unit, IdlPaginationCursor> tuples2, Continuation<? super GetAssetTransferListResponseDto> continuation) {
        return ((InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String value;
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
        IdlPaginationCursor idlPaginationCursor = (IdlPaginationCursor) ((Tuples2) this.L$0).component2();
        NimbusService nimbusService = this.this$0.nimbusService;
        if (idlPaginationCursor == null || (value = idlPaginationCursor.getValue()) == null) {
            value = "";
        }
        GetAssetTransferListRequestDto getAssetTransferListRequestDto = new GetAssetTransferListRequestDto(value, 0, 2, null);
        this.label = 1;
        Object objGetAssetTransferList = nimbusService.GetAssetTransferList(getAssetTransferListRequestDto, this);
        return objGetAssetTransferList == coroutine_suspended ? coroutine_suspended : objGetAssetTransferList;
    }
}
