package com.robinhood.android.portfolio.pnl.p214db;

import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossOrderDetails;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.utils.extensions.StringsKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wormhole.service.p554v1.RealizedGainLossItemComponentDto;
import wormhole.service.p554v1.RealizedGainLossItemDto;
import wormhole.service.p554v1.UnderlyingTypeDto;

/* compiled from: ProfitAndLossOrderDetails.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"toDbModel", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails;", "Lwormhole/service/v1/RealizedGainLossItemDto$OrderDetailsDto;", "symbol", "", "dbModel", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$CryptoOrderDetails$RealizedGainLossItemComponent;", "Lwormhole/service/v1/RealizedGainLossItemComponentDto;", "getDbModel", "(Lwormhole/service/v1/RealizedGainLossItemComponentDto;)Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$CryptoOrderDetails$RealizedGainLossItemComponent;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnl.db.ProfitAndLossOrderDetailsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ProfitAndLossOrderDetails2 {

    /* compiled from: ProfitAndLossOrderDetails.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnl.db.ProfitAndLossOrderDetailsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UnderlyingTypeDto.values().length];
            try {
                iArr[UnderlyingTypeDto.UNDERLYING_TYPE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UnderlyingTypeDto.UNDERLYING_TYPE_EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UnderlyingTypeDto.UNDERLYING_TYPE_INDEX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ProfitAndLossOrderDetails toDbModel(RealizedGainLossItemDto.OrderDetailsDto orderDetailsDto, String symbol) {
        ProfitAndLossOrderDetails.Instrument.Type type2;
        Intrinsics.checkNotNullParameter(orderDetailsDto, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (orderDetailsDto instanceof RealizedGainLossItemDto.OrderDetailsDto.EquityOrderDetails) {
            return new ProfitAndLossOrderDetails.EquityOrderDetails(StringsKt.toUuid(((RealizedGainLossItemDto.OrderDetailsDto.EquityOrderDetails) orderDetailsDto).getValue().getInstrument_id()));
        }
        if (orderDetailsDto instanceof RealizedGainLossItemDto.OrderDetailsDto.OptionOrderDetails) {
            RealizedGainLossItemDto.OrderDetailsDto.OptionOrderDetails optionOrderDetails = (RealizedGainLossItemDto.OrderDetailsDto.OptionOrderDetails) orderDetailsDto;
            int trade_value_multiplier = optionOrderDetails.getValue().getTrade_value_multiplier();
            List<RealizedGainLossItemDto.OptionOrderDetailsDto.UnderlyingDto> underlyings = optionOrderDetails.getValue().getUnderlyings();
            ArrayList arrayList = new ArrayList();
            for (RealizedGainLossItemDto.OptionOrderDetailsDto.UnderlyingDto underlyingDto : underlyings) {
                int i = WhenMappings.$EnumSwitchMapping$0[underlyingDto.getType().ordinal()];
                if (i == 1) {
                    type2 = null;
                } else if (i == 2) {
                    type2 = ProfitAndLossOrderDetails.Instrument.Type.EQUITY;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    type2 = ProfitAndLossOrderDetails.Instrument.Type.INDEX;
                }
                ProfitAndLossOrderDetails.Instrument instrument = type2 != null ? new ProfitAndLossOrderDetails.Instrument(StringsKt.toUuid(underlyingDto.getId()), type2, underlyingDto.getSymbol()) : null;
                if (instrument != null) {
                    arrayList.add(instrument);
                }
            }
            return new ProfitAndLossOrderDetails.OptionOrderDetails(trade_value_multiplier, arrayList);
        }
        if (!(orderDetailsDto instanceof RealizedGainLossItemDto.OrderDetailsDto.CryptoOrderDetails)) {
            throw new NoWhenBranchMatchedException();
        }
        RealizedGainLossItemDto.OrderDetailsDto.CryptoOrderDetails cryptoOrderDetails = (RealizedGainLossItemDto.OrderDetailsDto.CryptoOrderDetails) orderDetailsDto;
        UUID uuid = StringsKt.toUuid(cryptoOrderDetails.getValue().getCurrency_pair_id());
        RealizedGainLossItemComponentDto acquired = cryptoOrderDetails.getValue().getAcquired();
        ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent dbModel = acquired != null ? getDbModel(acquired) : null;
        RealizedGainLossItemComponentDto transferred = cryptoOrderDetails.getValue().getTransferred();
        return new ProfitAndLossOrderDetails.CryptoOrderDetails(uuid, symbol, dbModel, transferred != null ? getDbModel(transferred) : null);
    }

    private static final ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent getDbModel(RealizedGainLossItemComponentDto realizedGainLossItemComponentDto) {
        BigDecimal bigDecimalOrThrow = realizedGainLossItemComponentDto.getQuantity().toBigDecimalOrThrow();
        MoneyDto average_open_price = realizedGainLossItemComponentDto.getAverage_open_price();
        Money money = average_open_price != null ? Money3.toMoney(average_open_price) : null;
        MoneyDto average_close_price = realizedGainLossItemComponentDto.getAverage_close_price();
        if (average_close_price == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Money money2 = Money3.toMoney(average_close_price);
        MoneyDto opening_amount = realizedGainLossItemComponentDto.getOpening_amount();
        Money money3 = opening_amount != null ? Money3.toMoney(opening_amount) : null;
        MoneyDto closing_amount = realizedGainLossItemComponentDto.getClosing_amount();
        if (closing_amount == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Money money4 = Money3.toMoney(closing_amount);
        MoneyDto realized_return = realizedGainLossItemComponentDto.getRealized_return();
        return new ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent(bigDecimalOrThrow, money, money2, money3, money4, realized_return != null ? Money3.toMoney(realized_return) : null, realizedGainLossItemComponentDto.getRealized_return_percentage().toBigDecimalOrNull());
    }
}
