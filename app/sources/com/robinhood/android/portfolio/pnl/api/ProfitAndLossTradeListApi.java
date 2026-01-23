package com.robinhood.android.portfolio.pnl.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import wormhole.service.p554v1.GetRealizedGainLossItemsRequestDto;
import wormhole.service.p554v1.GetRealizedGainLossItemsResponseDto;

/* compiled from: ProfitAndLossTradeListApi.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossTradeListApi;", "", "getTradeItems", "Lwormhole/service/v1/GetRealizedGainLossItemsResponseDto;", "requestDto", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "pageSize", "", "(Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface ProfitAndLossTradeListApi {
    Object getTradeItems(GetRealizedGainLossItemsRequestDto getRealizedGainLossItemsRequestDto, int i, Continuation<? super GetRealizedGainLossItemsResponseDto> continuation);
}
