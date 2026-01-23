package com.robinhood.android.portfolio.pnl.p214db;

import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetRealizedGainLossItemsResponseDto;
import wormhole.service.p554v1.RealizedGainLossItemDto;

/* compiled from: ProfitAndLossTradeItem.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u001e\u0010\u0006\u001a\u00020\u0002*\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u001a\n\u0010\u0006\u001a\u00020\t*\u00020\n\u001a\f\u0010\u0006\u001a\u00020\u000b*\u00020\fH\u0000\u001a\f\u0010\u0006\u001a\u00020\r*\u00020\u000eH\u0000¨\u0006\u000f"}, m3636d2 = {"getTradeItemDbModels", "", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "Lwormhole/service/v1/GetRealizedGainLossItemsResponseDto;", "requestSymbol", "", "toDbModel", "Lwormhole/service/v1/RealizedGainLossItemDto;", "nextCursor", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "Lwormhole/service/v1/AssetClassDto;", "Lcom/robinhood/models/util/Money;", "Lcom/robinhood/rosetta/common/MoneyDto;", "Ljava/util/Currency;", "Lcom/robinhood/rosetta/common/CurrencyDto;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnl.db.ProfitAndLossTradeItemKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ProfitAndLossTradeItem2 {

    /* compiled from: ProfitAndLossTradeItem.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnl.db.ProfitAndLossTradeItemKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AssetClassDto.values().length];
            try {
                iArr[AssetClassDto.ASSET_CLASS_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetClassDto.ASSET_CLASS_EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetClassDto.ASSET_CLASS_OPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AssetClassDto.ASSET_CLASS_CRYPTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CurrencyDto.values().length];
            try {
                iArr2[CurrencyDto.CURRENCY_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CurrencyDto.CURRENCY_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CurrencyDto.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CurrencyDto.GBP.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CurrencyDto.EUR.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CurrencyDto.SGD.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final List<ProfitAndLossTradeItem> getTradeItemDbModels(GetRealizedGainLossItemsResponseDto getRealizedGainLossItemsResponseDto, String str) {
        Intrinsics.checkNotNullParameter(getRealizedGainLossItemsResponseDto, "<this>");
        List<RealizedGainLossItemDto> results = getRealizedGainLossItemsResponseDto.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(toDbModel((RealizedGainLossItemDto) it.next(), str, getRealizedGainLossItemsResponseDto.getNext_cursor()));
        }
        return arrayList;
    }

    public static final ProfitAndLossTradeItem toDbModel(RealizedGainLossItemDto realizedGainLossItemDto, String str, String str2) {
        Intrinsics.checkNotNullParameter(realizedGainLossItemDto, "<this>");
        AssetClass dbModel = toDbModel(realizedGainLossItemDto.getAsset_class());
        UUID uuidFromString = UUID.fromString(realizedGainLossItemDto.getId());
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        String symbol = realizedGainLossItemDto.getSymbol();
        Instant close_timestamp = realizedGainLossItemDto.getClose_timestamp();
        if (close_timestamp == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String display_name = realizedGainLossItemDto.getDisplay_name();
        MoneyDto realized_return = realizedGainLossItemDto.getRealized_return();
        Money dbModel2 = realized_return != null ? toDbModel(realized_return) : null;
        BigDecimal bigDecimalOrThrow = realizedGainLossItemDto.getRealized_return_percentage().toBigDecimalOrThrow();
        Instant first_execution_timestamp = realizedGainLossItemDto.getFirst_execution_timestamp();
        if (first_execution_timestamp == null) {
            throw new IllegalStateException("Required value was null.");
        }
        BigDecimal bigDecimalOrThrow2 = realizedGainLossItemDto.getQuantity().toBigDecimalOrThrow();
        MoneyDto opening_amount = realizedGainLossItemDto.getOpening_amount();
        Money dbModel3 = opening_amount != null ? toDbModel(opening_amount) : null;
        MoneyDto closing_amount = realizedGainLossItemDto.getClosing_amount();
        if (closing_amount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Money dbModel4 = toDbModel(closing_amount);
        MoneyDto open_average_price = realizedGainLossItemDto.getOpen_average_price();
        Money dbModel5 = open_average_price != null ? toDbModel(open_average_price) : null;
        MoneyDto close_average_price = realizedGainLossItemDto.getClose_average_price();
        if (close_average_price == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Money dbModel6 = toDbModel(close_average_price);
        String detail_display_name = realizedGainLossItemDto.getDetail_display_name();
        RealizedGainLossItemDto.OrderDetailsDto order_details = realizedGainLossItemDto.getOrder_details();
        return new ProfitAndLossTradeItem(uuidFromString, dbModel, symbol, close_timestamp, display_name, dbModel2, bigDecimalOrThrow, first_execution_timestamp, bigDecimalOrThrow2, dbModel3, dbModel4, dbModel5, dbModel6, detail_display_name, order_details != null ? ProfitAndLossOrderDetails2.toDbModel(order_details, realizedGainLossItemDto.getSymbol()) : null, str, str2);
    }

    public static final AssetClass toDbModel(AssetClassDto assetClassDto) {
        Intrinsics.checkNotNullParameter(assetClassDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[assetClassDto.ordinal()];
        if (i == 1) {
            return AssetClass.UNKNOWN;
        }
        if (i == 2) {
            return AssetClass.EQUITY;
        }
        if (i == 3) {
            return AssetClass.OPTION;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return AssetClass.CRYPTO;
    }

    public static final Money toDbModel(MoneyDto moneyDto) {
        Intrinsics.checkNotNullParameter(moneyDto, "<this>");
        return Money3.toMoney(moneyDto.getAmount().toBigDecimalOrThrow(), toDbModel(moneyDto.getCurrency()));
    }

    public static final Currency toDbModel(CurrencyDto currencyDto) {
        Intrinsics.checkNotNullParameter(currencyDto, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[currencyDto.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return Currencies.USD;
            case 4:
                return Currencies.GBP;
            case 5:
                return Currencies.EUR;
            case 6:
                throw new IllegalStateException(("SGD currency has not been mapped yet: " + currencyDto).toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
