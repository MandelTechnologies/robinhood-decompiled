package com.robinhood.android.portfolio.pnl.fixtures;

import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossRealized;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.serverdriven.experimental.extensions.Format2;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.common.CurrencyDto;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import rosetta.portfolio.p541v1.AssetClassDto;
import rosetta.portfolio.p541v1.GetRealizedPerformanceSummaryResponseDto;
import rosetta.portfolio.p541v1.RealizedGainDto;
import rosetta.portfolio.p541v1.SpanDto;

/* compiled from: ProfitAndLossRealizedFixtures.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/fixtures/ProfitAndLossRealizedFixtures;", "", "<init>", "()V", "realizedDto", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryResponseDto;", "getRealizedDto", "()Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryResponseDto;", "realized", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossRealized;", "getRealized", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossRealized;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProfitAndLossRealizedFixtures {
    public static final ProfitAndLossRealizedFixtures INSTANCE = new ProfitAndLossRealizedFixtures();
    private static final ProfitAndLossRealized realized;
    private static final GetRealizedPerformanceSummaryResponseDto realizedDto;

    private ProfitAndLossRealizedFixtures() {
    }

    static {
        SpanDto spanDto = SpanDto.SPAN_1M;
        AssetClassDto assetClassDto = AssetClassDto.ASSET_CLASS_EQUITY;
        RealizedGainDto realizedGainDto = new RealizedGainDto(spanDto, assetClassDto, new IdlDecimal("-50.00"));
        AssetClassDto assetClassDto2 = AssetClassDto.ASSET_CLASS_OPTION;
        RealizedGainDto realizedGainDto2 = new RealizedGainDto(spanDto, assetClassDto2, new IdlDecimal("-50.00"));
        SpanDto spanDto2 = SpanDto.SPAN_YTD;
        realizedDto = new GetRealizedPerformanceSummaryResponseDto("123456", CollectionsKt.listOf((Object[]) new RealizedGainDto[]{realizedGainDto, realizedGainDto2, new RealizedGainDto(spanDto2, assetClassDto, new IdlDecimal("500.00")), new RealizedGainDto(spanDto2, assetClassDto2, new IdlDecimal("500.00"))}), CurrencyDto.USD);
        UUID uuidFromString = UUID.fromString("1072fc76-1862-41ab-82c2-485837590762");
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        Money money = Format2.toMoney(new com.robinhood.models.serverdriven.experimental.api.Money("USD", uuidFromString, new BigDecimal("-100.00")));
        UUID uuidFromString2 = UUID.fromString("1072fc76-1862-41ab-82c2-485837590762");
        Intrinsics.checkNotNullExpressionValue(uuidFromString2, "fromString(...)");
        Money money2 = Format2.toMoney(new com.robinhood.models.serverdriven.experimental.api.Money("USD", uuidFromString2, new BigDecimal("1000.00")));
        Instant instantOfEpochSecond = Instant.ofEpochSecond(1650484943L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        realized = new ProfitAndLossRealized("123456", money, money2, instantOfEpochSecond, Currency.USD);
    }

    public final GetRealizedPerformanceSummaryResponseDto getRealizedDto() {
        return realizedDto;
    }

    public final ProfitAndLossRealized getRealized() {
        return realized;
    }
}
