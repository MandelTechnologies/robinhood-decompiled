package com.robinhood.store.futures;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.ceres.p284v1.GetCurrentPositionsResponseDto;
import com.robinhood.idl.Response;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: FuturesPositionStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "result", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesPositionStore$allPositionsEndpoint$4", m3645f = "FuturesPositionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.futures.FuturesPositionStore$allPositionsEndpoint$4, reason: use source file name */
/* loaded from: classes12.dex */
final class FuturesPositionStore3 extends ContinuationImpl7 implements Function3<Tuples2<? extends UUID, ? extends IdlPaginationCursor>, Response<? extends GetCurrentPositionsResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesPositionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesPositionStore3(FuturesPositionStore futuresPositionStore, Continuation<? super FuturesPositionStore3> continuation) {
        super(3, continuation);
        this.this$0 = futuresPositionStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends IdlPaginationCursor> tuples2, Response<? extends GetCurrentPositionsResponseDto> response, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<UUID, IdlPaginationCursor>) tuples2, (Response<GetCurrentPositionsResponseDto>) response, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, IdlPaginationCursor> tuples2, Response<GetCurrentPositionsResponseDto> response, Continuation<? super Unit> continuation) {
        FuturesPositionStore3 futuresPositionStore3 = new FuturesPositionStore3(this.this$0, continuation);
        futuresPositionStore3.L$0 = response;
        return futuresPositionStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.futuresPositionDao.insertPaginated((GetCurrentPositionsResponseDto) ((Response) this.L$0).getData());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
