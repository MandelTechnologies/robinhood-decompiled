package com.robinhood.android.trade.equity.util;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.p320db.Quote;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderStringsHelper.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u000e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/util/OrderStringsHelper;", "", "<init>", "()V", "getTrailingStopExecutionString", "Lcom/robinhood/utils/resource/StringResource;", "equityOrderContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "getTrailingStopExecutionString$feature_trade_equity_externalDebug", "initialStopPriceString", "", "getPriceLabel", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "NO_VALUE_DASH", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderStringsHelper {
    public static final int $stable = 0;
    public static final OrderStringsHelper INSTANCE = new OrderStringsHelper();
    private static final String NO_VALUE_DASH = "-";

    /* compiled from: OrderStringsHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    private OrderStringsHelper() {
    }

    /* renamed from: getTrailingStopExecutionString$feature_trade_equity_externalDebug */
    public final StringResource m2499x78e40d41(EquityOrderContext equityOrderContext) {
        Intrinsics.checkNotNullParameter(equityOrderContext, "equityOrderContext");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C29365R.string.order_create_trailing_stop_amount_execution;
        String strInitialStopPriceString = initialStopPriceString(equityOrderContext);
        if (strInitialStopPriceString.length() <= 0) {
            strInitialStopPriceString = null;
        }
        if (strInitialStopPriceString == null) {
            strInitialStopPriceString = "";
        }
        return companion.invoke(i, strInitialStopPriceString);
    }

    private final String initialStopPriceString(EquityOrderContext equityOrderContext) {
        EquityOrderSide side = equityOrderContext.getSide();
        Quote quote = equityOrderContext.getRequestContext().getQuote();
        if (quote == null) {
            return "-";
        }
        BigDecimal decimalValue = quote.getLastTradePrice().getDecimalValue();
        OrderTrailingPeg trailingPeg = equityOrderContext.getTrailingPeg();
        if (trailingPeg == null) {
            return "";
        }
        BigDecimal bigDecimalCalculateStopPrice = trailingPeg.calculateStopPrice(side, decimalValue);
        return bigDecimalCalculateStopPrice != null ? Formats.getCurrencyFormat().format(bigDecimalCalculateStopPrice) : "-";
    }

    public final StringResource getPriceLabel(Order.Configuration configuration) {
        int i;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        StringResource.Companion companion = StringResource.INSTANCE;
        switch (WhenMappings.$EnumSwitchMapping$0[configuration.ordinal()]) {
            case 1:
            case 2:
                i = C11048R.string.general_label_market_price;
                break;
            case 3:
                i = C11048R.string.general_label_limit_price;
                break;
            case 4:
                i = C20649R.string.general_label_stop_price;
                break;
            case 5:
                i = C11048R.string.general_label_limit_price;
                break;
            case 6:
                i = C11048R.string.general_label_market_price;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return companion.invoke(i, new Object[0]);
    }
}
