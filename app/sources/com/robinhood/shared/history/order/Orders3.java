package com.robinhood.shared.history.order;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.util.Money;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: Orders.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\f\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u000b\u001a\u00020\b*\u00020\u00022\u0006\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u000e\u001a\u00020\b*\u00020\u00022\u0006\u0010\f\u001a\u00020\r\u001a\f\u0010\u000f\u001a\u0004\u0018\u00010\b*\u00020\u0002\u001a\f\u0010\u0010\u001a\u0004\u0018\u00010\b*\u00020\u0002\u001a\u0014\u0010\u0011\u001a\u0004\u0018\u00010\b*\u00020\u00022\u0006\u0010\f\u001a\u00020\r¨\u0006\u0012"}, m3636d2 = {"getOrderStateString", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/db/Order;", "fromDetail", "", "getOrderDisplayString", "getOrderDisplayStringWithSymbol", "symbol", "", "getTotalNotional", "getEnteredInString", "getOrderLimitPrice", "res", "Landroid/content/res/Resources;", "getStopPrice", "getFilledDate", "getRegulatoryFees", "getFilledDescription", "lib-order-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.history.order.OrdersKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class Orders3 {

    /* compiled from: Orders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.order.OrdersKt$WhenMappings */
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
            int[] iArr2 = new int[EquityOrderSide.values().length];
            try {
                iArr2[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ StringResource getOrderStateString$default(Order order, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getOrderStateString(order, z);
    }

    public static final StringResource getOrderStateString(Order order, boolean z) {
        int labelResId;
        Intrinsics.checkNotNullParameter(order, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        if (order.isIpoAccessOrder() && order.getState() == EquityOrderState.CONFIRMED) {
            labelResId = C32428R.string.order_state_queued;
        } else if (order.isCancelledIpoAccessNoAllocation()) {
            labelResId = C32428R.string.order_state_unable_to_fill;
        } else {
            labelResId = EquityOrderStates.getLabelResId(order.getState(), z);
        }
        return companion.invoke(labelResId, new Object[0]);
    }

    public static final StringResource getOrderDisplayString(Order order) {
        int i;
        Intrinsics.checkNotNullParameter(order, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$1[order.getSide().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                switch (WhenMappings.$EnumSwitchMapping$0[order.getConfiguration().ordinal()]) {
                    case 1:
                        i = C32428R.string.order_description_market_sell;
                        break;
                    case 2:
                    case 3:
                        i = C32428R.string.order_description_limit_sell;
                        break;
                    case 4:
                        i = C32428R.string.order_description_stop_loss_sell;
                        break;
                    case 5:
                        i = C32428R.string.order_description_stop_limit_sell;
                        break;
                    case 6:
                        i = C32428R.string.order_description_trailing_stop_sell;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                switch (WhenMappings.$EnumSwitchMapping$0[order.getConfiguration().ordinal()]) {
                    case 1:
                        i = C32428R.string.order_description_market_short_sell;
                        break;
                    case 2:
                        throw new IllegalStateException("simple limit not supported for sell short");
                    case 3:
                        i = C32428R.string.order_description_limit_short_sell;
                        break;
                    case 4:
                        i = C32428R.string.order_description_stop_loss_short_sell;
                        break;
                    case 5:
                        throw new IllegalStateException("stop limit not supported for sell short");
                    case 6:
                        throw new IllegalStateException("trailing stop not supported for sell short");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        } else if (order.getPositionEffect() == OrderPositionEffect.CLOSE) {
            switch (WhenMappings.$EnumSwitchMapping$0[order.getConfiguration().ordinal()]) {
                case 1:
                    i = C32428R.string.order_description_market_buy_to_close;
                    break;
                case 2:
                case 3:
                    i = C32428R.string.order_description_limit_buy_to_close;
                    break;
                case 4:
                    i = C32428R.string.order_description_stop_loss_buy_to_close;
                    break;
                case 5:
                    i = C32428R.string.order_description_stop_limit_buy_to_close;
                    break;
                case 6:
                    i = C32428R.string.order_description_trailing_stop_buy_to_close;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            switch (WhenMappings.$EnumSwitchMapping$0[order.getConfiguration().ordinal()]) {
                case 1:
                    i = C32428R.string.order_description_market_buy;
                    break;
                case 2:
                case 3:
                    if (order.isIpoAccessOrder()) {
                        i = C32428R.string.order_description_limit_ipo_buy;
                        break;
                    } else {
                        i = C32428R.string.order_description_limit_buy;
                        break;
                    }
                case 4:
                    i = C32428R.string.order_description_stop_loss_buy;
                    break;
                case 5:
                    i = C32428R.string.order_description_stop_limit_buy;
                    break;
                case 6:
                    i = C32428R.string.order_description_trailing_stop_buy;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return companion.invoke(i, new Object[0]);
    }

    public static final StringResource getOrderDisplayStringWithSymbol(Order order, String symbol) {
        int i;
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$1[order.getSide().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                switch (WhenMappings.$EnumSwitchMapping$0[order.getConfiguration().ordinal()]) {
                    case 1:
                        i = C39008R.string.order_description_market_sell_with_symbol;
                        break;
                    case 2:
                    case 3:
                        i = C39008R.string.order_description_limit_sell_with_symbol;
                        break;
                    case 4:
                        i = C39008R.string.order_description_stop_loss_sell_with_symbol;
                        break;
                    case 5:
                        i = C39008R.string.order_description_stop_limit_sell_with_symbol;
                        break;
                    case 6:
                        i = C39008R.string.order_description_trailing_stop_sell_with_symbol;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                switch (WhenMappings.$EnumSwitchMapping$0[order.getConfiguration().ordinal()]) {
                    case 1:
                        i = C39008R.string.order_description_market_short_sell_with_symbol;
                        break;
                    case 2:
                        throw new IllegalStateException("simple limit not supported for sell short");
                    case 3:
                        i = C39008R.string.order_description_limit_short_sell_with_symbol;
                        break;
                    case 4:
                        i = C39008R.string.order_description_stop_loss_short_sell_with_symbol;
                        break;
                    case 5:
                        throw new IllegalStateException("stop limit not supported for sell short");
                    case 6:
                        throw new IllegalStateException("trailing stop not supported for sell short");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        } else if (order.getPositionEffect() != OrderPositionEffect.CLOSE) {
            switch (WhenMappings.$EnumSwitchMapping$0[order.getConfiguration().ordinal()]) {
                case 1:
                    i = C39008R.string.order_description_market_buy_with_symbol;
                    break;
                case 2:
                case 3:
                    if (order.isIpoAccessOrder()) {
                        i = C39008R.string.order_description_limit_ipo_buy_with_symbol;
                        break;
                    } else {
                        i = C39008R.string.order_description_limit_buy_with_symbol;
                        break;
                    }
                case 4:
                    i = C39008R.string.order_description_stop_loss_buy_with_symbol;
                    break;
                case 5:
                    i = C39008R.string.order_description_stop_limit_buy_with_symbol;
                    break;
                case 6:
                    i = C39008R.string.order_description_trailing_stop_buy_with_symbol;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            switch (WhenMappings.$EnumSwitchMapping$0[order.getConfiguration().ordinal()]) {
                case 1:
                    i = C39008R.string.order_description_market_buy_to_close_with_symbol;
                    break;
                case 2:
                case 3:
                    i = C39008R.string.order_description_limit_buy_to_close_with_symbol;
                    break;
                case 4:
                    i = C39008R.string.order_description_stop_loss_buy_to_close_with_symbol;
                    break;
                case 5:
                    i = C39008R.string.order_description_stop_limit_buy_to_close_with_symbol;
                    break;
                case 6:
                    i = C39008R.string.order_description_trailing_stop_buy_to_close_with_symbol;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return companion.invoke(i, symbol);
    }

    public static final String getTotalNotional(Order order) {
        BigDecimal decimalValue;
        Intrinsics.checkNotNullParameter(order, "<this>");
        Money executedNotional = order.getExecutedNotional();
        if (executedNotional == null || (decimalValue = executedNotional.getDecimalValue()) == null) {
            return null;
        }
        return Formats.getAmountFormat().format(decimalValue);
    }

    public static final StringResource getEnteredInString(Order order) {
        int i;
        Intrinsics.checkNotNullParameter(order, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        if (order.isDollarBased()) {
            i = C32428R.string.order_detail_entered_in_dollars;
        } else {
            i = C32428R.string.order_detail_entered_in_shares;
        }
        return companion.invoke(i, new Object[0]);
    }

    public static final String getOrderLimitPrice(Order order, Resources res) throws Resources.NotFoundException {
        String str;
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        BigDecimal price = order.getPrice();
        if (price != null && (str = Formats.getPriceFormat().format(price)) != null) {
            return str;
        }
        String string2 = res.getString(C11048R.string.general_label_emdash);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getStopPrice(Order order, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        BigDecimal stopPrice = order.getStopPrice();
        if (stopPrice != null) {
            return Formats.getPriceFormat().format(stopPrice);
        }
        String string2 = res.getString(C41827R.string.general_label_n_a);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public static final String getFilledDate(Order order) {
        Intrinsics.checkNotNullParameter(order, "<this>");
        Instant lastExecutionDate = order.getLastExecutionDate();
        if (lastExecutionDate == null) {
            return null;
        }
        return InstantFormatter.LONG_TIMESTAMP_IN_SYSTEM_ZONE.format(lastExecutionDate);
    }

    public static final String getRegulatoryFees(Order order) {
        Intrinsics.checkNotNullParameter(order, "<this>");
        if (BigDecimals7.isPositive(order.getFees())) {
            return Formats.getCurrencyFormat().format(order.getFees());
        }
        return null;
    }

    public static final String getFilledDescription(Order order, Resources res) {
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        BigDecimal cumulativeQuantity = order.getCumulativeQuantity();
        BigDecimal averagePrice = order.getAveragePrice();
        if (cumulativeQuantity == null || averagePrice == null) {
            return null;
        }
        return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C32428R.plurals.order_detail_filled_quantity_message, cumulativeQuantity, Formats.getShareQuantityFormat().format(cumulativeQuantity), Formats.getPriceFormat().format(averagePrice));
    }
}
