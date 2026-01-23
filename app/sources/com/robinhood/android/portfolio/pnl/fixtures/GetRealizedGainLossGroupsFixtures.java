package com.robinhood.android.portfolio.pnl.fixtures;

import com.robinhood.idl.IdlDecimal;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import wormhole.service.p554v1.GetRealizedGainLossGroupsRequestDto;
import wormhole.service.p554v1.GetRealizedGainLossGroupsResponseDto;
import wormhole.service.p554v1.GroupTypeDto;
import wormhole.service.p554v1.RealizedGainLossGroupDto;
import wormhole.service.p554v1.SpanDto;

/* compiled from: GetRealizedGainLossGroupsFixtures.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/fixtures/GetRealizedGainLossGroupsFixtures;", "", "<init>", "()V", "REQUEST_DTO", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;", "getREQUEST_DTO", "()Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;", "RESPONSE_DTO", "Lwormhole/service/v1/GetRealizedGainLossGroupsResponseDto;", "getRESPONSE_DTO", "()Lwormhole/service/v1/GetRealizedGainLossGroupsResponseDto;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class GetRealizedGainLossGroupsFixtures {
    public static final GetRealizedGainLossGroupsFixtures INSTANCE = new GetRealizedGainLossGroupsFixtures();
    private static final GetRealizedGainLossGroupsRequestDto REQUEST_DTO = new GetRealizedGainLossGroupsRequestDto(GroupTypeDto.GROUP_TYPE_SYMBOL, "acc", SpanDto.SPAN_UNSPECIFIED, CollectionsKt.emptyList(), null, null);
    private static final GetRealizedGainLossGroupsResponseDto RESPONSE_DTO;

    private GetRealizedGainLossGroupsFixtures() {
    }

    static {
        IdlDecimal idlDecimal = new IdlDecimal("100");
        CurrencyDto currencyDto = CurrencyDto.USD;
        RESPONSE_DTO = new GetRealizedGainLossGroupsResponseDto((List<RealizedGainLossGroupDto>) CollectionsKt.listOf((Object[]) new RealizedGainLossGroupDto[]{new RealizedGainLossGroupDto("aaplId", "AAPL", 20, new MoneyDto(idlDecimal, currencyDto), new IdlDecimal("10"), false, null, 96, null), new RealizedGainLossGroupDto("meowId", ProfitAndLossTradeItemFixtures.REQUEST_SYMBOL, 2, new MoneyDto(new IdlDecimal("100"), currencyDto), new IdlDecimal("10"), false, null, 96, null)}));
    }

    public final GetRealizedGainLossGroupsRequestDto getREQUEST_DTO() {
        return REQUEST_DTO;
    }

    public final GetRealizedGainLossGroupsResponseDto getRESPONSE_DTO() {
        return RESPONSE_DTO;
    }
}
