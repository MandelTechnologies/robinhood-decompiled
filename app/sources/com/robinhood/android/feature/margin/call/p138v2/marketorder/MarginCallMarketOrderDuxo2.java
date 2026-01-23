package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderDataState2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallDataResponseDto;
import microgram.contracts.margin.margin_call.proto.p496v1.GetMaintenanceCallSummaryFromDataResponseDto;

/* compiled from: MarginCallMarketOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$loadMaintenanceCallData$1$3$1", m3645f = "MarginCallMarketOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderDuxo$loadMaintenanceCallData$1$3$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MarginCallMarketOrderDuxo2 extends ContinuationImpl7 implements Function2<MarginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState>, Object> {
    final /* synthetic */ GetMaintenanceCallDataResponseDto $maintenanceCallData;
    final /* synthetic */ GetMaintenanceCallSummaryFromDataResponseDto $summaryModel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginCallMarketOrderDuxo2(GetMaintenanceCallSummaryFromDataResponseDto getMaintenanceCallSummaryFromDataResponseDto, GetMaintenanceCallDataResponseDto getMaintenanceCallDataResponseDto, Continuation<? super MarginCallMarketOrderDuxo2> continuation) {
        super(2, continuation);
        this.$summaryModel = getMaintenanceCallSummaryFromDataResponseDto;
        this.$maintenanceCallData = getMaintenanceCallDataResponseDto;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginCallMarketOrderDuxo2 marginCallMarketOrderDuxo2 = new MarginCallMarketOrderDuxo2(this.$summaryModel, this.$maintenanceCallData, continuation);
        marginCallMarketOrderDuxo2.L$0 = obj;
        return marginCallMarketOrderDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarginCallMarketOrderDataState marginCallMarketOrderDataState, Continuation<? super MarginCallMarketOrderDataState> continuation) {
        return ((MarginCallMarketOrderDuxo2) create(marginCallMarketOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MarginCallMarketOrderDataState.copy$default((MarginCallMarketOrderDataState) this.L$0, new MarginCallMarketOrderDataState2.Loaded(this.$summaryModel), null, null, null, this.$maintenanceCallData, 14, null);
    }
}
