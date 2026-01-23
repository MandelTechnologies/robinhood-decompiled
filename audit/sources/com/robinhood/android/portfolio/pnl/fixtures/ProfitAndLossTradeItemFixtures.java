package com.robinhood.android.portfolio.pnl.fixtures;

import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossOrderDetails;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.RealizedGainLossItemDto;
import wormhole.service.p554v1.UnderlyingTypeDto;

/* compiled from: ProfitAndLossTradeItemFixtures.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/fixtures/ProfitAndLossTradeItemFixtures;", "", "<init>", "()V", "uuid", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "underlyingUuid", "SYMBOL", "", "DISPLAY_NAME", "DETAIL_DISPLAY_NAME", "TRADE_VALUE_MULTIPLIER", "", "FLATTENED_TRADE_ITEM_DISPLAY_NAME", "REQUEST_SYMBOL", "profitAndLossTradeItem", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "getProfitAndLossTradeItem", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "realizedGainLossItemDto", "Lwormhole/service/v1/RealizedGainLossItemDto;", "getRealizedGainLossItemDto", "()Lwormhole/service/v1/RealizedGainLossItemDto;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProfitAndLossTradeItemFixtures {
    private static final String DETAIL_DISPLAY_NAME = "$10/$12 Put Credit Spread 7/4";
    private static final String DISPLAY_NAME = "Put Credit Spread Jan 21, 2024";
    public static final String FLATTENED_TRADE_ITEM_DISPLAY_NAME = "MEOW Put Credit Spread Jan 21, 2024";
    public static final ProfitAndLossTradeItemFixtures INSTANCE = new ProfitAndLossTradeItemFixtures();
    public static final String REQUEST_SYMBOL = "MEOW";
    private static final String SYMBOL = "MEOW";
    private static final int TRADE_VALUE_MULTIPLIER = 100;
    private static final ProfitAndLossTradeItem profitAndLossTradeItem;
    private static final RealizedGainLossItemDto realizedGainLossItemDto;
    private static final UUID underlyingUuid;
    private static final UUID uuid;

    private ProfitAndLossTradeItemFixtures() {
    }

    static {
        UUID uuid2 = UUID.randomUUID();
        uuid = uuid2;
        UUID underlyingUuid2 = UUID.randomUUID();
        underlyingUuid = underlyingUuid2;
        AssetClass assetClass = AssetClass.EQUITY;
        Intrinsics.checkNotNullExpressionValue(uuid2, "uuid");
        Instant EPOCH = Instant.EPOCH;
        Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
        BigDecimal bigDecimal = new BigDecimal("100.00");
        Currency currency = Currencies.USD;
        Money money = new Money(currency, bigDecimal);
        BigDecimal bigDecimal2 = new BigDecimal("10.00");
        Instant instantPlusSeconds = EPOCH.plusSeconds(1L);
        Intrinsics.checkNotNullExpressionValue(instantPlusSeconds, "plusSeconds(...)");
        BigDecimal bigDecimal3 = new BigDecimal("10.00");
        Money money2 = new Money(currency, new BigDecimal("100.00"));
        Money money3 = new Money(currency, new BigDecimal("200.00"));
        Money money4 = new Money(currency, new BigDecimal("10.00"));
        Money money5 = new Money(currency, new BigDecimal("20.00"));
        Intrinsics.checkNotNullExpressionValue(underlyingUuid2, "underlyingUuid");
        profitAndLossTradeItem = new ProfitAndLossTradeItem(uuid2, assetClass, "MEOW", EPOCH, DISPLAY_NAME, money, bigDecimal2, instantPlusSeconds, bigDecimal3, money2, money3, money4, money5, DETAIL_DISPLAY_NAME, new ProfitAndLossOrderDetails.OptionOrderDetails(100, CollectionsKt.listOf(new ProfitAndLossOrderDetails.Instrument(underlyingUuid2, ProfitAndLossOrderDetails.Instrument.Type.EQUITY, null))), "MEOW", "nextCursor");
        AssetClassDto assetClassDto = AssetClassDto.ASSET_CLASS_EQUITY;
        String string2 = uuid2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        IdlDecimal idlDecimal = new IdlDecimal("100.00");
        CurrencyDto currencyDto = CurrencyDto.USD;
        MoneyDto moneyDto = new MoneyDto(idlDecimal, currencyDto);
        IdlDecimal idlDecimal2 = new IdlDecimal("10.00");
        Instant instantPlusSeconds2 = EPOCH.plusSeconds(1L);
        IdlDecimal idlDecimal3 = new IdlDecimal("10.00");
        MoneyDto moneyDto2 = new MoneyDto(new IdlDecimal("100.00"), currencyDto);
        MoneyDto moneyDto3 = new MoneyDto(new IdlDecimal("200.00"), currencyDto);
        MoneyDto moneyDto4 = new MoneyDto(new IdlDecimal("10.00"), currencyDto);
        MoneyDto moneyDto5 = new MoneyDto(new IdlDecimal("20.00"), currencyDto);
        String string3 = underlyingUuid2.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        realizedGainLossItemDto = new RealizedGainLossItemDto(string2, assetClassDto, "MEOW", EPOCH, DISPLAY_NAME, moneyDto, idlDecimal2, instantPlusSeconds2, idlDecimal3, moneyDto4, moneyDto5, DETAIL_DISPLAY_NAME, moneyDto2, moneyDto3, new RealizedGainLossItemDto.OrderDetailsDto.OptionOrderDetails(new RealizedGainLossItemDto.OptionOrderDetailsDto(100, (List<RealizedGainLossItemDto.OptionOrderDetailsDto.UnderlyingDto>) CollectionsKt.listOf(new RealizedGainLossItemDto.OptionOrderDetailsDto.UnderlyingDto(string3, UnderlyingTypeDto.UNDERLYING_TYPE_EQUITY, null)))));
    }

    public final ProfitAndLossTradeItem getProfitAndLossTradeItem() {
        return profitAndLossTradeItem;
    }

    public final RealizedGainLossItemDto getRealizedGainLossItemDto() {
        return realizedGainLossItemDto;
    }
}
