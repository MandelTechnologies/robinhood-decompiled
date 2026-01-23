package com.robinhood.android.portfolio.pnl.fixtures;

import com.robinhood.android.portfolio.pnl.api.ProfitAndLossTradeListApi;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetRealizedGainLossItemsRequestDto;
import wormhole.service.p554v1.GetRealizedGainLossItemsResponseDto;
import wormhole.service.p554v1.RealizedGainLossItemDto;

/* compiled from: FakeProfitAndLossTradeListApi.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/fixtures/FakeProfitAndLossTradeListApi;", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossTradeListApi;", "<init>", "()V", "getTradeItems", "Lwormhole/service/v1/GetRealizedGainLossItemsResponseDto;", "requestDto", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "pageSize", "", "(Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class FakeProfitAndLossTradeListApi implements ProfitAndLossTradeListApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<RealizedGainLossItemDto> MOCK_TRADE_ITEMS_BACKEND_DB;

    @Override // com.robinhood.android.portfolio.pnl.api.ProfitAndLossTradeListApi
    public Object getTradeItems(GetRealizedGainLossItemsRequestDto getRealizedGainLossItemsRequestDto, int i, Continuation<? super GetRealizedGainLossItemsResponseDto> continuation) {
        Integer intOrNull;
        String next_cursor = getRealizedGainLossItemsRequestDto.getNext_cursor();
        int iIntValue = (next_cursor == null || (intOrNull = StringsKt.toIntOrNull(next_cursor)) == null) ? 0 : intOrNull.intValue();
        List<RealizedGainLossItemDto> list = MOCK_TRADE_ITEMS_BACKEND_DB;
        int iCoerceAtMost = RangesKt.coerceAtMost((i + iIntValue) - 1, CollectionsKt.getLastIndex(list));
        String strValueOf = iCoerceAtMost == CollectionsKt.getLastIndex(list) ? null : String.valueOf(iCoerceAtMost + 1);
        List listSlice = CollectionsKt.slice(list, new PrimitiveRanges2(iIntValue, iCoerceAtMost));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSlice, 10));
        Iterator it = listSlice.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.getDisplayName$lib_models_profit_and_loss_hub_externalDebug((RealizedGainLossItemDto) it.next(), getRealizedGainLossItemsRequestDto));
        }
        return new GetRealizedGainLossItemsResponseDto(arrayList, strValueOf);
    }

    /* compiled from: FakeProfitAndLossTradeListApi.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/fixtures/FakeProfitAndLossTradeListApi$Companion;", "", "<init>", "()V", "getDisplayName", "Lwormhole/service/v1/RealizedGainLossItemDto;", "requestDto", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "getDisplayName$lib_models_profit_and_loss_hub_externalDebug", "MOCK_TRADE_ITEMS_BACKEND_DB", "", "getMOCK_TRADE_ITEMS_BACKEND_DB", "()Ljava/util/List;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RealizedGainLossItemDto getDisplayName$lib_models_profit_and_loss_hub_externalDebug(RealizedGainLossItemDto realizedGainLossItemDto, GetRealizedGainLossItemsRequestDto requestDto) {
            Intrinsics.checkNotNullParameter(realizedGainLossItemDto, "<this>");
            Intrinsics.checkNotNullParameter(requestDto, "requestDto");
            String symbol = requestDto.getSymbol();
            if (symbol == null) {
                return realizedGainLossItemDto.copy((30703 & 1) != 0 ? realizedGainLossItemDto.surrogate.getId() : null, (30703 & 2) != 0 ? realizedGainLossItemDto.surrogate.getAsset_class() : null, (30703 & 4) != 0 ? realizedGainLossItemDto.surrogate.getSymbol() : null, (30703 & 8) != 0 ? realizedGainLossItemDto.surrogate.getClose_timestamp() : null, (30703 & 16) != 0 ? realizedGainLossItemDto.surrogate.getDisplay_name() : realizedGainLossItemDto.getSymbol() + " Call Credit Spread", (30703 & 32) != 0 ? realizedGainLossItemDto.surrogate.getRealized_return() : null, (30703 & 64) != 0 ? realizedGainLossItemDto.surrogate.getRealized_return_percentage() : null, (30703 & 128) != 0 ? realizedGainLossItemDto.surrogate.getFirst_execution_timestamp() : null, (30703 & 256) != 0 ? realizedGainLossItemDto.surrogate.getQuantity() : null, (30703 & 512) != 0 ? realizedGainLossItemDto.surrogate.getOpen_average_price() : null, (30703 & 1024) != 0 ? realizedGainLossItemDto.surrogate.getClose_average_price() : null, (30703 & 2048) != 0 ? realizedGainLossItemDto.surrogate.getDetail_display_name() : realizedGainLossItemDto.getSymbol() + " Call Credit Spread", (30703 & 4096) != 0 ? realizedGainLossItemDto.surrogate.getOpening_amount() : null, (30703 & 8192) != 0 ? realizedGainLossItemDto.surrogate.getClosing_amount() : null, (30703 & 16384) != 0 ? realizedGainLossItemDto.getOrder_details() : null);
            }
            return realizedGainLossItemDto.copy((30703 & 1) != 0 ? realizedGainLossItemDto.surrogate.getId() : null, (30703 & 2) != 0 ? realizedGainLossItemDto.surrogate.getAsset_class() : null, (30703 & 4) != 0 ? realizedGainLossItemDto.surrogate.getSymbol() : symbol, (30703 & 8) != 0 ? realizedGainLossItemDto.surrogate.getClose_timestamp() : null, (30703 & 16) != 0 ? realizedGainLossItemDto.surrogate.getDisplay_name() : "Call Credit Spread", (30703 & 32) != 0 ? realizedGainLossItemDto.surrogate.getRealized_return() : null, (30703 & 64) != 0 ? realizedGainLossItemDto.surrogate.getRealized_return_percentage() : null, (30703 & 128) != 0 ? realizedGainLossItemDto.surrogate.getFirst_execution_timestamp() : null, (30703 & 256) != 0 ? realizedGainLossItemDto.surrogate.getQuantity() : null, (30703 & 512) != 0 ? realizedGainLossItemDto.surrogate.getOpen_average_price() : null, (30703 & 1024) != 0 ? realizedGainLossItemDto.surrogate.getClose_average_price() : null, (30703 & 2048) != 0 ? realizedGainLossItemDto.surrogate.getDetail_display_name() : symbol + " Call Credit Spread", (30703 & 4096) != 0 ? realizedGainLossItemDto.surrogate.getOpening_amount() : null, (30703 & 8192) != 0 ? realizedGainLossItemDto.surrogate.getClosing_amount() : null, (30703 & 16384) != 0 ? realizedGainLossItemDto.getOrder_details() : null);
        }

        public final List<RealizedGainLossItemDto> getMOCK_TRADE_ITEMS_BACKEND_DB() {
            return FakeProfitAndLossTradeListApi.MOCK_TRADE_ITEMS_BACKEND_DB;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i = 100;
        PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(0, 100);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2, 10));
        Iterator<Integer> it = primitiveRanges2.iterator();
        while (it.hasNext()) {
            int iNextInt = ((PrimitiveIterators6) it).nextInt();
            AssetClassDto assetClassDto = AssetClassDto.ASSET_CLASS_OPTION;
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            CurrencyDto currencyDto = CurrencyDto.USD;
            arrayList.add(new RealizedGainLossItemDto(string2, assetClassDto, "AAPL", null, null, new MoneyDto(new IdlDecimal(String.valueOf(iNextInt)), currencyDto), new IdlDecimal(String.valueOf(iNextInt / 100)), null, new IdlDecimal("1.00"), new MoneyDto(new IdlDecimal(String.valueOf(iNextInt)), currencyDto), new MoneyDto(new IdlDecimal(String.valueOf(iNextInt)), currencyDto), null, null, null, new RealizedGainLossItemDto.OrderDetailsDto.OptionOrderDetails(new RealizedGainLossItemDto.OptionOrderDetailsDto(i, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0)), 14488, null));
        }
        MOCK_TRADE_ITEMS_BACKEND_DB = arrayList;
    }
}
