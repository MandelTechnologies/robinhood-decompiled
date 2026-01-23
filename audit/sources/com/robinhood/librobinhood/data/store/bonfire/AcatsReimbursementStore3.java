package com.robinhood.librobinhood.data.store.bonfire;

import acats_aggregation.service.p001v1.AcatsAggregationService;
import acats_aggregation.service.p001v1.FeeReimbursementsHistoryRequestDto;
import acats_aggregation.service.p001v1.FeeReimbursementsHistoryResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsReimbursementStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryResponseDto;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementStore$acatsReimbursementsListEndpoint$1", m3645f = "AcatsReimbursementStore.kt", m3646l = {49}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementStore$acatsReimbursementsListEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AcatsReimbursementStore3 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super FeeReimbursementsHistoryResponseDto>, Object> {
    int label;
    final /* synthetic */ AcatsReimbursementStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsReimbursementStore3(AcatsReimbursementStore acatsReimbursementStore, Continuation<? super AcatsReimbursementStore3> continuation) {
        super(2, continuation);
        this.this$0 = acatsReimbursementStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsReimbursementStore3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super FeeReimbursementsHistoryResponseDto> continuation) {
        return ((AcatsReimbursementStore3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        AcatsAggregationService acatsAggregationService = this.this$0.acatsAggregationService;
        FeeReimbursementsHistoryRequestDto feeReimbursementsHistoryRequestDto = new FeeReimbursementsHistoryRequestDto();
        this.label = 1;
        Object objFeeReimbursementsHistory = acatsAggregationService.FeeReimbursementsHistory(feeReimbursementsHistoryRequestDto, this);
        return objFeeReimbursementsHistory == coroutine_suspended ? coroutine_suspended : objFeeReimbursementsHistory;
    }
}
