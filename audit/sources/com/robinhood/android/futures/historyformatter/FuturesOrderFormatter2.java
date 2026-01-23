package com.robinhood.android.futures.historyformatter;

import com.robinhood.android.models.futures.p189db.FuturesOrderLeg;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getOrderDisplayStringWithSymbol", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "symbol", "", "lib-futures-history-formatter_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.historyformatter.FuturesOrderFormatterKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesOrderFormatter2 {

    /* compiled from: FuturesOrderFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.historyformatter.FuturesOrderFormatterKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Order.Configuration.values().length];
            try {
                iArr[Order.Configuration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Order.Configuration.LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Order.Configuration.STOP_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Order.Configuration.STOP_LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Order.Configuration.TRAILING_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final StringResource getOrderDisplayStringWithSymbol(UiFuturesOrder uiFuturesOrder, String symbol) {
        int i;
        Intrinsics.checkNotNullParameter(uiFuturesOrder, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Order.Configuration configuration$default = Order.Configuration.Companion.getConfiguration$default(Order.Configuration.INSTANCE, uiFuturesOrder.getOrder().getOrderType().toCommonOrderType(), uiFuturesOrder.getOrder().getOrderTrigger().toCommonOrderTrigger(), null, null, 12, null);
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$1[((FuturesOrderLeg) CollectionsKt.single((List) uiFuturesOrder.getLegs())).getOrderSide().toCommonSide().ordinal()];
        if (i2 == 1) {
            switch (WhenMappings.$EnumSwitchMapping$0[configuration$default.ordinal()]) {
                case 1:
                    i = C17283R.string.order_description_market_buy_with_symbol;
                    break;
                case 2:
                case 3:
                    i = C17283R.string.order_description_limit_buy_with_symbol;
                    break;
                case 4:
                    i = C17283R.string.order_description_stop_loss_buy_with_symbol;
                    break;
                case 5:
                    i = C17283R.string.order_description_stop_limit_buy_with_symbol;
                    break;
                case 6:
                    i = C17283R.string.order_description_trailing_stop_buy_with_symbol;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            switch (WhenMappings.$EnumSwitchMapping$0[configuration$default.ordinal()]) {
                case 1:
                    i = C17283R.string.order_description_market_sell_with_symbol;
                    break;
                case 2:
                case 3:
                    i = C17283R.string.order_description_limit_sell_with_symbol;
                    break;
                case 4:
                    i = C17283R.string.order_description_stop_loss_sell_with_symbol;
                    break;
                case 5:
                    i = C17283R.string.order_description_stop_limit_sell_with_symbol;
                    break;
                case 6:
                    i = C17283R.string.order_description_trailing_stop_sell_with_symbol;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return companion.invoke(i, symbol);
    }
}
