package com.robinhood.store.isa;

import bonfire.proto.idl.windsor.p041v1.GetTransfersResponseDto;
import bonfire.proto.idl.windsor.p041v1.TransferDto;
import com.robinhood.android.isa.models.isa.p163db.dao.IsaTransferDao;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaTransfer2;
import java.util.ArrayList;
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

/* compiled from: IsaTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lbonfire/proto/idl/windsor/v1/GetTransfersResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.isa.IsaTransferStore$listTransferEndpoint$4", m3645f = "IsaTransferStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.isa.IsaTransferStore$listTransferEndpoint$4, reason: use source file name */
/* loaded from: classes12.dex */
final class IsaTransferStore5 extends ContinuationImpl7 implements Function2<GetTransfersResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IsaTransferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IsaTransferStore5(IsaTransferStore isaTransferStore, Continuation<? super IsaTransferStore5> continuation) {
        super(2, continuation);
        this.this$0 = isaTransferStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IsaTransferStore5 isaTransferStore5 = new IsaTransferStore5(this.this$0, continuation);
        isaTransferStore5.L$0 = obj;
        return isaTransferStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetTransfersResponseDto getTransfersResponseDto, Continuation<? super Unit> continuation) {
        return ((IsaTransferStore5) create(getTransfersResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            GetTransfersResponseDto getTransfersResponseDto = (GetTransfersResponseDto) this.L$0;
            IsaTransferDao isaTransferDao = this.this$0.isaTransferDao;
            List<TransferDto> transfers = getTransfersResponseDto.getTransfers();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(transfers, 10));
            Iterator<T> it = transfers.iterator();
            while (it.hasNext()) {
                arrayList.add(IsaTransfer2.toDbModel((TransferDto) it.next()));
            }
            isaTransferDao.insert(arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
