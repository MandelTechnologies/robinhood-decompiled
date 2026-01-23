package com.robinhood.android.portfolio.pnl.fixtures;

import com.robinhood.idl.IdlDecimal;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import com.singular.sdk.internal.Constants;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetRealizedGainLossItemsRequestDto;
import wormhole.service.p554v1.GetRealizedGainLossItemsResponseDto;
import wormhole.service.p554v1.RealizedGainLossItemDto;
import wormhole.service.p554v1.SpanDto;

/* compiled from: GetRealizedGainLossItemsFixtures.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/fixtures/GetRealizedGainLossItemsFixtures;", "", "<init>", "()V", "REQUEST_DTO", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "getREQUEST_DTO", "()Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "RESPONSE_DTO", "Lwormhole/service/v1/GetRealizedGainLossItemsResponseDto;", "getRESPONSE_DTO", "()Lwormhole/service/v1/GetRealizedGainLossItemsResponseDto;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class GetRealizedGainLossItemsFixtures {
    public static final GetRealizedGainLossItemsFixtures INSTANCE = new GetRealizedGainLossItemsFixtures();
    private static final GetRealizedGainLossItemsRequestDto REQUEST_DTO = new GetRealizedGainLossItemsRequestDto("acc", SpanDto.SPAN_UNSPECIFIED, CollectionsKt.emptyList(), null, null, null, null, 64, null);
    private static final GetRealizedGainLossItemsResponseDto RESPONSE_DTO;

    private GetRealizedGainLossItemsFixtures() {
    }

    static {
        AssetClassDto assetClassDto = AssetClassDto.ASSET_CLASS_OPTION;
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Instant instant = Instant.EPOCH;
        CurrencyDto currencyDto = CurrencyDto.USD;
        RESPONSE_DTO = new GetRealizedGainLossItemsResponseDto((List<RealizedGainLossItemDto>) CollectionsKt.listOf(new RealizedGainLossItemDto(string2, assetClassDto, "AAPL", instant, null, new MoneyDto(new IdlDecimal("10.00"), currencyDto), new IdlDecimal("20.00"), instant, new IdlDecimal("1.00"), null, new MoneyDto(new IdlDecimal("100.00"), currencyDto), null, null, new MoneyDto(new IdlDecimal("10000.00"), currencyDto), null, 23056, null)), Constants.SdidMigrationStatusCodes.ALREADY_SDID);
    }

    public final GetRealizedGainLossItemsRequestDto getREQUEST_DTO() {
        return REQUEST_DTO;
    }

    public final GetRealizedGainLossItemsResponseDto getRESPONSE_DTO() {
        return RESPONSE_DTO;
    }
}
