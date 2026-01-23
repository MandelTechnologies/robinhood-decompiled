package com.robinhood.android.portfolio.pnl;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import wormhole.service.p554v1.GetRealizedGainLossGroupsRequestDto;
import wormhole.service.p554v1.GetRealizedGainLossGroupsResponseDto;
import wormhole.service.p554v1.PNLService;

/* compiled from: ProfitAndLossTradeListStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lwormhole/service/v1/GetRealizedGainLossGroupsResponseDto;", "requestDto", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListStore$tradeSymbolListEndpoint$1", m3645f = "ProfitAndLossTradeListStore.kt", m3646l = {73}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListStore$tradeSymbolListEndpoint$1, reason: use source file name */
/* loaded from: classes11.dex */
final class ProfitAndLossTradeListStore2 extends ContinuationImpl7 implements Function2<GetRealizedGainLossGroupsRequestDto, Continuation<? super GetRealizedGainLossGroupsResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProfitAndLossTradeListStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfitAndLossTradeListStore2(ProfitAndLossTradeListStore profitAndLossTradeListStore, Continuation<? super ProfitAndLossTradeListStore2> continuation) {
        super(2, continuation);
        this.this$0 = profitAndLossTradeListStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfitAndLossTradeListStore2 profitAndLossTradeListStore2 = new ProfitAndLossTradeListStore2(this.this$0, continuation);
        profitAndLossTradeListStore2.L$0 = obj;
        return profitAndLossTradeListStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetRealizedGainLossGroupsRequestDto getRealizedGainLossGroupsRequestDto, Continuation<? super GetRealizedGainLossGroupsResponseDto> continuation) {
        return ((ProfitAndLossTradeListStore2) create(getRealizedGainLossGroupsRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetRealizedGainLossGroupsRequestDto getRealizedGainLossGroupsRequestDto = (GetRealizedGainLossGroupsRequestDto) this.L$0;
        PNLService pNLService = this.this$0.pnlService;
        this.label = 1;
        Object objGetRealizedGainLossGroups = pNLService.GetRealizedGainLossGroups(getRealizedGainLossGroupsRequestDto, this);
        return objGetRealizedGainLossGroups == coroutine_suspended ? coroutine_suspended : objGetRealizedGainLossGroups;
    }
}
