package com.robinhood.store.isa;

import bonfire.proto.idl.windsor.p041v1.GetTransfersRequestDto;
import bonfire.proto.idl.windsor.p041v1.GetTransfersResponseDto;
import bonfire.proto.idl.windsor.p041v1.WindsorService;
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

/* compiled from: IsaTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lbonfire/proto/idl/windsor/v1/GetTransfersResponseDto;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.isa.IsaTransferStore$listTransferEndpoint$1", m3645f = "IsaTransferStore.kt", m3646l = {73}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.isa.IsaTransferStore$listTransferEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class IsaTransferStore4 extends ContinuationImpl7 implements Function2<Tuples2<? extends Unit, ? extends IdlPaginationCursor>, Continuation<? super GetTransfersResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IsaTransferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IsaTransferStore4(IsaTransferStore isaTransferStore, Continuation<? super IsaTransferStore4> continuation) {
        super(2, continuation);
        this.this$0 = isaTransferStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IsaTransferStore4 isaTransferStore4 = new IsaTransferStore4(this.this$0, continuation);
        isaTransferStore4.L$0 = obj;
        return isaTransferStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Unit, ? extends IdlPaginationCursor> tuples2, Continuation<? super GetTransfersResponseDto> continuation) {
        return invoke2((Tuples2<Unit, IdlPaginationCursor>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<Unit, IdlPaginationCursor> tuples2, Continuation<? super GetTransfersResponseDto> continuation) {
        return ((IsaTransferStore4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        IdlPaginationCursor idlPaginationCursor = (IdlPaginationCursor) ((Tuples2) this.L$0).component2();
        WindsorService windsorService = this.this$0.windsor;
        String value = idlPaginationCursor != null ? idlPaginationCursor.getValue() : null;
        if (value == null) {
            value = "";
        }
        GetTransfersRequestDto getTransfersRequestDto = new GetTransfersRequestDto(null, 0, value, 3, null);
        this.label = 1;
        Object objGetTransfers = windsorService.GetTransfers(getTransfersRequestDto, this);
        return objGetTransfers == coroutine_suspended ? coroutine_suspended : objGetTransfers;
    }
}
