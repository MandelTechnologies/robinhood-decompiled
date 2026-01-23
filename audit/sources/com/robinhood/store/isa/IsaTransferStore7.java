package com.robinhood.store.isa;

import bonfire.proto.idl.windsor.p041v1.GetTransferDetailResponseDto;
import bonfire.proto.idl.windsor.p041v1.TransferDto;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaTransfer2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IsaTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lbonfire/proto/idl/windsor/v1/GetTransferDetailResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.isa.IsaTransferStore$singleTransferEndpoint$2", m3645f = "IsaTransferStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.isa.IsaTransferStore$singleTransferEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class IsaTransferStore7 extends ContinuationImpl7 implements Function2<GetTransferDetailResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IsaTransferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IsaTransferStore7(IsaTransferStore isaTransferStore, Continuation<? super IsaTransferStore7> continuation) {
        super(2, continuation);
        this.this$0 = isaTransferStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IsaTransferStore7 isaTransferStore7 = new IsaTransferStore7(this.this$0, continuation);
        isaTransferStore7.L$0 = obj;
        return isaTransferStore7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetTransferDetailResponseDto getTransferDetailResponseDto, Continuation<? super Unit> continuation) {
        return ((IsaTransferStore7) create(getTransferDetailResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TransferDto transfer = ((GetTransferDetailResponseDto) this.L$0).getTransfer();
        if (transfer != null) {
            this.this$0.isaTransferDao.insert(CollectionsKt.listOf(IsaTransfer2.toDbModel(transfer)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("transfer cannot be null");
    }
}
