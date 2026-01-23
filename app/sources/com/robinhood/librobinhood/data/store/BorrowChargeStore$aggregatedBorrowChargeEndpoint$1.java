package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.equities.p034v1.AggregatedBorrowChargeDto;
import bonfire.proto.idl.equities.p034v1.EquitiesService;
import bonfire.proto.idl.equities.p034v1.GetAggregatedBorrowChartHistoryRequestDto;
import bonfire.proto.idl.equities.p034v1.GetAggregatedBorrowChartHistoryResponseDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BorrowChargeStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BorrowChargeStore$aggregatedBorrowChargeEndpoint$1", m3645f = "BorrowChargeStore.kt", m3646l = {52}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class BorrowChargeStore$aggregatedBorrowChargeEndpoint$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super List<? extends AggregatedBorrowChargeDto>>, Object> {
    int label;
    final /* synthetic */ BorrowChargeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BorrowChargeStore$aggregatedBorrowChargeEndpoint$1(BorrowChargeStore borrowChargeStore, Continuation<? super BorrowChargeStore$aggregatedBorrowChargeEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = borrowChargeStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BorrowChargeStore$aggregatedBorrowChargeEndpoint$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super List<? extends AggregatedBorrowChargeDto>> continuation) {
        return invoke2(unit, (Continuation<? super List<AggregatedBorrowChargeDto>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, Continuation<? super List<AggregatedBorrowChargeDto>> continuation) {
        return ((BorrowChargeStore$aggregatedBorrowChargeEndpoint$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EquitiesService equitiesService = this.this$0.equitiesService;
            GetAggregatedBorrowChartHistoryRequestDto getAggregatedBorrowChartHistoryRequestDto = new GetAggregatedBorrowChartHistoryRequestDto();
            this.label = 1;
            obj = equitiesService.GetAggregatedBorrowChartHistory(getAggregatedBorrowChartHistoryRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((GetAggregatedBorrowChartHistoryResponseDto) obj).getResults();
    }
}
