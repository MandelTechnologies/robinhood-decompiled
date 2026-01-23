package com.robinhood.android.equities.orderstatus;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.format.paragraph.Paragraph4;
import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.util.Money;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderConfirmationDescription.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002\u001a\u0012\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0002\u001a0\u0010\u000b\u001a\u00020\u0007*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0007*\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u001a\u001a\u0010\u0015\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f\u001a\u0012\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0017\u001a\u00020\u0007*\u00020\u0002\u001a(\u0010\u0018\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u001a\u001e\u0010\u001d\u001a\u00020\u000f*\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0002\u001a\f\u0010!\u001a\u00020\u0007*\u00020\u0002H\u0000\u001a\u001c\u0010\"\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u001b\u0010#\u001a\u0004\u0018\u00010$*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010%\u001a(\u0010&\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u001a\u001b\u0010'\u001a\u0004\u0018\u00010$*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010%\u001a\u0013\u0010(\u001a\u0004\u0018\u00010$*\u00020\u0002H\u0003¢\u0006\u0002\u0010)\u001a\u001b\u0010*\u001a\u0004\u0018\u00010$*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010%\u001a\"\u0010+\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0002H\u0000\u001a\f\u0010.\u001a\u00020$*\u00020\u0002H\u0003\u001a\u0010\u0010/\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u0012\u00100\u001a\u0004\u0018\u00010\u00072\u0006\u0010-\u001a\u00020\u0002H\u0002\u001a\f\u00101\u001a\u00020$*\u00020\u000fH\u0002¨\u00062"}, m3636d2 = {"getOrderConfirmationAmount", "", "Lcom/robinhood/models/db/Order;", "res", "Landroid/content/res/Resources;", "getOrderConfirmationAmountLabel", "getOrderConfirmationSharesLabel", "Lcom/robinhood/utils/resource/StringResource;", "getOrderConfirmationShares", "getOrderConfirmationAveragePrice", "getOrderConfirmationPendingShares", "getOrderConfirmationEstimatedCostString", "quote", "Lcom/robinhood/models/db/Quote;", "quantity", "Ljava/math/BigDecimal;", "estimatedTotalFees", "estimatedWithholdingAmount", "Lcom/robinhood/models/util/Money$Adjustment;", "getOrderConfirmationTotalCostCreditString", "withholdingAmount", "getOrderConfirmationPendingCostCreditString", "estimatedRemainingFees", "getOrderConfirmationSharesAsSubtotal", "getOrderConfirmationDescriptionString", "symbol", "isPreIpo", "", "replacedOrder", "roundedEstimatedAmount", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "isQuantityWhole", "getOrderConfirmationOrderTypeString", "getOrderConfirmationDollarDescriptionString", "dollarDescriptionResId", "", "(Lcom/robinhood/models/db/Order;Z)Ljava/lang/Integer;", "getOrderConfirmationSharesDescriptionString", "getNewOrderConfirmationSharesBuyToOpenDescriptionString", "getNewOrderConfirmationSharesBuyToCloseDescriptionString", "(Lcom/robinhood/models/db/Order;)Ljava/lang/Integer;", "getNewOrderConfirmationSharesDescriptionString", "replacementOrderDescription", "newOrder", "oldOrder", "baseStringRes", "remainingSharesSentence", "replacedOrderSentence", "toPluralQuantity", "lib-order-status_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.orderstatus.OrderConfirmationDescriptionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class OrderConfirmationDescription {

    /* compiled from: OrderConfirmationDescription.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.orderstatus.OrderConfirmationDescriptionKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[EquityOrderState.values().length];
            try {
                iArr[EquityOrderState.PARTIALLY_FILLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderState.FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderState.QUEUED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EquityOrderState.UNCONFIRMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EquityOrderState.CONFIRMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EquityOrderState.TRIGGERED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EquityOrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EquityOrderState.REJECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EquityOrderState.PENDING_CANCELLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EquityOrderState.CANCELED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EquityOrderState.FAILED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EquityOrderState.VOIDED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EquityOrderState.NEW.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EquityOrderState.LOCATE_FAILED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EquityOrderState.LOCATING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EquityOrderSide.values().length];
            try {
                iArr2[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[EquityOrderSide.SELL_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[EquityOrderSide.SELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Order.Configuration.values().length];
            try {
                iArr3[Order.Configuration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[Order.Configuration.LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[Order.Configuration.STOP_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[Order.Configuration.STOP_LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[Order.Configuration.TRAILING_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OrderPositionEffect.values().length];
            try {
                iArr4[OrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[OrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final String getOrderConfirmationAmount(Order order, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Money dollarBasedAmount = order.getDollarBasedAmount();
        if (dollarBasedAmount == null) {
            throw new IllegalStateException("Dollar based amount is null.");
        }
        Money executedNotional = order.getExecutedNotional();
        if (executedNotional == null) {
            Currency currency = Currencies.USD;
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            executedNotional = new Money(currency, ZERO);
        }
        String str = Money.format$default(dollarBasedAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        String str2 = Money.format$default(executedNotional, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        if (Intrinsics.areEqual(str, str2)) {
            return str;
        }
        String string2 = res.getString(C14743R.string.order_confirmation_partial_fill_amount, str2, str);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return WhenMappings.$EnumSwitchMapping$0[order.getState().ordinal()] != 2 ? string2 : str2;
    }

    public static final String getOrderConfirmationAmountLabel(Order order, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        int i = WhenMappings.$EnumSwitchMapping$1[order.getSide().ordinal()];
        if (i == 1) {
            String string2 = res.getString(C14743R.string.order_confirmation_buy_amount_label);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = res.getString(C14743R.string.order_confirmation_sell_amount_label);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public static final StringResource getOrderConfirmationSharesLabel(Order order) {
        int i;
        Intrinsics.checkNotNullParameter(order, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$1[order.getSide().ordinal()];
        if (i2 == 1) {
            i = C14743R.string.order_confirmation_buy_quantity_label;
        } else if (i2 == 2) {
            i = C14743R.string.order_confirmation_sell_short_quantity_label;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C14743R.string.order_confirmation_sell_quantity_label;
        }
        return companion.invoke(i, new Object[0]);
    }

    public static final String getOrderConfirmationShares(Order order, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        BigDecimal cumulativeQuantity = order.getCumulativeQuantity();
        if (cumulativeQuantity == null || BigDecimals7.isZero(cumulativeQuantity)) {
            String string2 = res.getString(C41827R.string.general_label_n_a);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        return Formats.getShareQuantityFormat().format(cumulativeQuantity);
    }

    public static final String getOrderConfirmationAveragePrice(Order order, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        BigDecimal averagePrice = order.getAveragePrice();
        if (averagePrice != null) {
            return Formats.getPriceFormat().format(averagePrice);
        }
        String string2 = res.getString(C41827R.string.general_label_n_a);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getOrderConfirmationPendingShares(Order order) {
        Intrinsics.checkNotNullParameter(order, "<this>");
        return Formats.getShareQuantityFormat().format(order.getRemainingQuantity());
    }

    public static final StringResource getOrderConfirmationEstimatedCostString(Order order, Quote quote, BigDecimal bigDecimal, BigDecimal estimatedTotalFees, Money.Adjustment adjustment) {
        int i;
        BigDecimal decimalValue;
        Money amount;
        BigDecimal decimalValue2;
        Money amount2;
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(estimatedTotalFees, "estimatedTotalFees");
        Money dollarBasedAmount = order.getDollarBasedAmount();
        if (order.isDollarBased() && dollarBasedAmount != null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            NumberFormatter amountFormat = Formats.getAmountFormat();
            BigDecimal decimalValue3 = dollarBasedAmount.getDecimalValue();
            if (adjustment == null || (amount2 = adjustment.getAmount()) == null || (decimalValue2 = amount2.getDecimalValue()) == null) {
                decimalValue2 = BigDecimal.ZERO;
            }
            Intrinsics.checkNotNull(decimalValue2);
            BigDecimal bigDecimalSubtract = decimalValue3.subtract(decimalValue2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            return companion.invoke(amountFormat.format(roundedEstimatedAmount(bigDecimalSubtract, order.getSide(), bigDecimal != null ? BigDecimals7.isInteger(bigDecimal) : false)));
        }
        BigDecimal estimatedCost = Order.INSTANCE.getEstimatedCost(order, quote);
        if (estimatedCost == null) {
            return StringResource.INSTANCE.invoke(C41827R.string.general_label_n_a, new Object[0]);
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[order.getSide().ordinal()];
        if (i2 == 1) {
            i = 1;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = -1;
        }
        BigDecimal bigDecimalTimes = BigDecimals7.times(estimatedTotalFees, i);
        BigDecimal bigDecimalMultiply = estimatedCost.multiply(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalAdd = BigDecimals7.scaleWithNonzeroMinimum$default(bigDecimalMultiply, Currencies.USD.getDefaultFractionDigits(), null, null, 6, null).add(bigDecimalTimes);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        if (adjustment == null || (amount = adjustment.getAmount()) == null || (decimalValue = amount.getDecimalValue()) == null) {
            decimalValue = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(decimalValue);
        BigDecimal bigDecimalSubtract2 = bigDecimalAdd.subtract(decimalValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        return StringResource.INSTANCE.invoke(Formats.getAmountFormat().format(roundedEstimatedAmount(bigDecimalSubtract2, order.getSide(), bigDecimal != null ? BigDecimals7.isInteger(bigDecimal) : true)));
    }

    public static final StringResource getOrderConfirmationTotalCostCreditString(Order order, Money.Adjustment adjustment) {
        BigDecimal decimalValue;
        BigDecimal decimalValue2;
        Money amount;
        Intrinsics.checkNotNullParameter(order, "<this>");
        Money totalCostOrCredit = order.getTotalCostOrCredit();
        if (totalCostOrCredit == null || (decimalValue = totalCostOrCredit.getDecimalValue()) == null) {
            Money executedNotional = order.getExecutedNotional();
            decimalValue = executedNotional != null ? executedNotional.getDecimalValue() : null;
        }
        if (decimalValue == null) {
            return StringResource.INSTANCE.invoke(C41827R.string.general_label_n_a, new Object[0]);
        }
        if (adjustment == null || (amount = adjustment.getAmount()) == null || (decimalValue2 = amount.getDecimalValue()) == null) {
            decimalValue2 = BigDecimal.ZERO;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        NumberFormatter amountFormat = Formats.getAmountFormat();
        Intrinsics.checkNotNull(decimalValue2);
        BigDecimal bigDecimalSubtract = decimalValue.subtract(decimalValue2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return companion.invoke(amountFormat.format(bigDecimalSubtract));
    }

    public static final StringResource getOrderConfirmationPendingCostCreditString(Order order, Quote quote, BigDecimal estimatedRemainingFees) {
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(estimatedRemainingFees, "estimatedRemainingFees");
        BigDecimal estimatedCost = Order.INSTANCE.getEstimatedCost(order, quote);
        if (estimatedCost == null) {
            return StringResource.INSTANCE.invoke(C41827R.string.general_label_n_a, new Object[0]);
        }
        BigDecimal bigDecimalMultiply = estimatedCost.multiply(order.getRemainingQuantity());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalAdd = BigDecimals7.scaleWithNonzeroMinimum$default(bigDecimalMultiply, Currencies.USD.getDefaultFractionDigits(), null, null, 6, null).add(estimatedRemainingFees);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return StringResource.INSTANCE.invoke(Formats.getAmountFormat().format(bigDecimalAdd));
    }

    public static final String getOrderConfirmationSharesAsSubtotal(Order order, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        CharSequence text = getOrderConfirmationSharesAsSubtotal(order).getText(res);
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
        return (String) text;
    }

    public static final StringResource getOrderConfirmationSharesAsSubtotal(Order order) {
        Intrinsics.checkNotNullParameter(order, "<this>");
        BigDecimal quantity = order.getQuantity();
        if (quantity == null) {
            return StringResource.INSTANCE.invoke(C41827R.string.general_label_n_a, new Object[0]);
        }
        String str = Formats.getShareQuantityFormat().format(quantity);
        BigDecimal cumulativeQuantity = order.getCumulativeQuantity();
        if (cumulativeQuantity == null) {
            cumulativeQuantity = BigDecimal.ZERO;
        }
        NumberFormatter shareQuantityFormat = Formats.getShareQuantityFormat();
        Intrinsics.checkNotNull(cumulativeQuantity);
        return StringResource.INSTANCE.invoke(C14743R.string.order_confirmation_partial_fill_quantity, shareQuantityFormat.format(cumulativeQuantity), str);
    }

    public static /* synthetic */ StringResource getOrderConfirmationDescriptionString$default(Order order, String str, boolean z, Order order2, int i, Object obj) {
        if ((i & 4) != 0) {
            order2 = null;
        }
        return getOrderConfirmationDescriptionString(order, str, z, order2);
    }

    public static final StringResource getOrderConfirmationDescriptionString(Order order, String symbol, boolean z, Order order2) {
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (order.isDollarBased()) {
            return getOrderConfirmationDollarDescriptionString(order, symbol, z);
        }
        return getOrderConfirmationSharesDescriptionString(order, symbol, z, order2);
    }

    private static final BigDecimal roundedEstimatedAmount(BigDecimal bigDecimal, EquityOrderSide equityOrderSide, boolean z) {
        RoundingMode roundingMode;
        if (z) {
            roundingMode = RoundingMode.HALF_UP;
        } else {
            int i = equityOrderSide == null ? -1 : WhenMappings.$EnumSwitchMapping$1[equityOrderSide.ordinal()];
            if (i == -1) {
                roundingMode = RoundingMode.HALF_UP;
            } else if (i == 1) {
                roundingMode = RoundingMode.UP;
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                roundingMode = RoundingMode.DOWN;
            }
        }
        return BigDecimals7.scaleWithNonzeroMinimum$default(bigDecimal, Currencies.USD.getDefaultFractionDigits(), null, roundingMode, 2, null);
    }

    public static final StringResource getOrderConfirmationOrderTypeString(Order order) {
        int i;
        Intrinsics.checkNotNullParameter(order, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        switch (WhenMappings.$EnumSwitchMapping$2[order.getConfiguration().ordinal()]) {
            case 1:
                i = C14743R.string.f4116x5a69335f;
                break;
            case 2:
            case 3:
                i = C14743R.string.order_confirmation_description_order_type_limit;
                break;
            case 4:
                i = C14743R.string.order_confirmation_description_order_type_stop_loss;
                break;
            case 5:
                i = C14743R.string.order_confirmation_description_order_type_stop_limit;
                break;
            case 6:
                i = C14743R.string.order_confirmation_description_order_type_trailing_stop;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return companion.invoke(i, new Object[0]);
    }

    public static final StringResource getOrderConfirmationDollarDescriptionString(Order order, String symbol, boolean z) {
        BigDecimal decimalValue;
        BigDecimal decimalValue2;
        BigDecimal bigDecimalSubtract;
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Money dollarBasedAmount = order.getDollarBasedAmount();
        if (dollarBasedAmount != null && (decimalValue = dollarBasedAmount.getDecimalValue()) != null) {
            Money executedNotional = order.getExecutedNotional();
            if (executedNotional == null || (decimalValue2 = executedNotional.getDecimalValue()) == null) {
                decimalValue2 = decimalValue;
            }
            String str = Formats.getAmountFormat().format(decimalValue);
            int i = WhenMappings.$EnumSwitchMapping$1[order.getSide().ordinal()];
            if (i == 1) {
                bigDecimalSubtract = decimalValue.subtract(decimalValue2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            } else {
                if (i == 2) {
                    throw new IllegalStateException("dollar short orders not supported");
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bigDecimalSubtract = decimalValue2.subtract(decimalValue);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            }
            NumberFormatter amountFormat = Formats.getAmountFormat();
            BigDecimal bigDecimalAbs = bigDecimalSubtract.abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
            String str2 = amountFormat.format(bigDecimalAbs);
            StringResource orderConfirmationOrderTypeString = getOrderConfirmationOrderTypeString(order);
            Integer numDollarDescriptionResId = dollarDescriptionResId(order, z);
            if (numDollarDescriptionResId != null) {
                return StringResource.INSTANCE.invoke(numDollarDescriptionResId.intValue(), orderConfirmationOrderTypeString, str, symbol, str2);
            }
        }
        return null;
    }

    private static final Integer dollarDescriptionResId(Order order, boolean z) {
        int i;
        int i2;
        int i3 = WhenMappings.$EnumSwitchMapping$1[order.getSide().ordinal()];
        if (i3 == 1) {
            switch (WhenMappings.$EnumSwitchMapping$0[order.getState().ordinal()]) {
                case 1:
                    return Integer.valueOf(C14743R.string.order_confirmation_dollar_buy_partially_filled_description);
                case 2:
                case 7:
                    return Integer.valueOf(C14743R.string.order_confirmation_dollar_buy_filled_description);
                case 3:
                    if (z) {
                        i = C14743R.string.order_confirmation_dollar_buy_queued_description_pre_ipo;
                    } else {
                        i = C14743R.string.f4117xd9d64a86;
                    }
                    return Integer.valueOf(i);
                case 4:
                    return Integer.valueOf(C14743R.string.order_confirmation_dollar_buy_unconfirmed_description);
                case 5:
                case 6:
                    return Integer.valueOf(C14743R.string.order_confirmation_dollar_buy_confirmed_description);
                case 8:
                    return Integer.valueOf(C14743R.string.order_confirmation_dollar_buy_rejected_description);
                case 9:
                case 10:
                    return Integer.valueOf(C14743R.string.order_confirmation_dollar_buy_canceled_description);
                case 11:
                case 12:
                    return Integer.valueOf(C14743R.string.order_confirmation_dollar_buy_failed_description);
                case 13:
                    return null;
                case 14:
                    throw new IllegalStateException("Locates not required for buy orders");
                case 15:
                    throw new IllegalStateException("Locates not required for buy orders");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (i3 == 2) {
            throw new IllegalStateException("dollar based order confirmation not implemented for short orders");
        }
        if (i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        switch (WhenMappings.$EnumSwitchMapping$0[order.getState().ordinal()]) {
            case 1:
                return Integer.valueOf(C14743R.string.order_confirmation_dollar_sell_partially_filled_description);
            case 2:
            case 7:
                return Integer.valueOf(C14743R.string.order_confirmation_dollar_sell_filled_description);
            case 3:
                if (z) {
                    i2 = C14743R.string.order_confirmation_dollar_sell_queued_description_pre_ipo;
                } else {
                    i2 = C14743R.string.f4118xa5277fa6;
                }
                return Integer.valueOf(i2);
            case 4:
                return Integer.valueOf(C14743R.string.order_confirmation_dollar_sell_unconfirmed_description);
            case 5:
            case 6:
                return Integer.valueOf(C14743R.string.order_confirmation_dollar_sell_confirmed_description);
            case 8:
                return Integer.valueOf(C14743R.string.order_confirmation_dollar_sell_rejected_description);
            case 9:
            case 10:
                return Integer.valueOf(C14743R.string.order_confirmation_dollar_sell_canceled_description);
            case 11:
            case 12:
                return Integer.valueOf(C14743R.string.order_confirmation_dollar_sell_failed_description);
            case 13:
                return null;
            case 14:
                throw new IllegalStateException("dollar based order confirmation not implemented for short orders");
            case 15:
                throw new IllegalStateException("dollar based order confirmation not implemented for short orders");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ StringResource getOrderConfirmationSharesDescriptionString$default(Order order, String str, boolean z, Order order2, int i, Object obj) {
        if ((i & 4) != 0) {
            order2 = null;
        }
        return getOrderConfirmationSharesDescriptionString(order, str, z, order2);
    }

    public static final StringResource getOrderConfirmationSharesDescriptionString(Order order, String symbol, boolean z, Order order2) {
        StringResource stringResourceReplacementOrderDescription;
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        BigDecimal quantity = order.getQuantity();
        if (quantity == null) {
            return null;
        }
        String str = Formats.getShareQuantityFormat().format(quantity);
        String str2 = Formats.getShareQuantityFormat().format(order.getRemainingQuantity());
        StringResource orderConfirmationOrderTypeString = getOrderConfirmationOrderTypeString(order);
        if (order2 != null && (stringResourceReplacementOrderDescription = replacementOrderDescription(symbol, order, order2)) != null) {
            return stringResourceReplacementOrderDescription;
        }
        Integer newOrderConfirmationSharesDescriptionString = getNewOrderConfirmationSharesDescriptionString(order, z);
        if (newOrderConfirmationSharesDescriptionString != null) {
            return StringResource.INSTANCE.invoke(newOrderConfirmationSharesDescriptionString.intValue(), orderConfirmationOrderTypeString, str, symbol, str2);
        }
        return null;
    }

    private static final Integer getNewOrderConfirmationSharesBuyToOpenDescriptionString(Order order, boolean z) {
        int i;
        switch (WhenMappings.$EnumSwitchMapping$0[order.getState().ordinal()]) {
            case 1:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_partially_filled_description);
            case 2:
            case 7:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_filled_description);
            case 3:
                if (z) {
                    i = C14743R.string.order_confirmation_shares_buy_queued_description_pre_ipo;
                } else {
                    i = C14743R.string.f4119x32c6b5ce;
                }
                return Integer.valueOf(i);
            case 4:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_unconfirmed_description);
            case 5:
            case 6:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_confirmed_description);
            case 8:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_rejected_description);
            case 9:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_pending_cancel_description);
            case 10:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_canceled_description);
            case 11:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_failed_description);
            case 12:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_voided_description);
            case 13:
            case 14:
            case 15:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final Integer getNewOrderConfirmationSharesBuyToCloseDescriptionString(Order order) {
        switch (WhenMappings.$EnumSwitchMapping$0[order.getState().ordinal()]) {
            case 1:
                return Integer.valueOf(C14743R.string.f4120x54d7f370);
            case 2:
            case 7:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_to_close_filled_description);
            case 3:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_to_close_queued_description);
            case 4:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_to_close_unconfirmed_description);
            case 5:
            case 6:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_to_close_confirmed_description);
            case 8:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_to_close_rejected_description);
            case 9:
                return Integer.valueOf(C14743R.string.f4121xa9ce831f);
            case 10:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_to_close_canceled_description);
            case 11:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_to_close_failed_description);
            case 12:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_buy_to_close_voided_description);
            case 13:
            case 14:
            case 15:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final Integer getNewOrderConfirmationSharesDescriptionString(Order order, boolean z) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$1[order.getSide().ordinal()];
        if (i2 == 1) {
            OrderPositionEffect positionEffect = order.getPositionEffect();
            int i3 = positionEffect == null ? -1 : WhenMappings.$EnumSwitchMapping$3[positionEffect.ordinal()];
            if (i3 == -1 || i3 == 1) {
                return getNewOrderConfirmationSharesBuyToOpenDescriptionString(order, z);
            }
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return getNewOrderConfirmationSharesBuyToCloseDescriptionString(order);
        }
        if (i2 == 2) {
            switch (WhenMappings.$EnumSwitchMapping$0[order.getState().ordinal()]) {
                case 1:
                    return Integer.valueOf(C14743R.string.f4123xbb5325ae);
                case 2:
                case 7:
                    return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_short_filled_description);
                case 3:
                    return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_short_queued_description);
                case 4:
                    return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_short_unconfirmed_description);
                case 5:
                case 6:
                    return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_short_confirmed_description);
                case 8:
                    return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_short_rejected_description);
                case 9:
                    return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_short_pending_cancel_description);
                case 10:
                    return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_short_canceled_description);
                case 11:
                    return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_short_failed_description);
                case 12:
                    return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_short_voided_description);
                case 13:
                    return null;
                case 14:
                    return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_short_locate_failed_description);
                case 15:
                    return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_short_locating_description);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        switch (WhenMappings.$EnumSwitchMapping$0[order.getState().ordinal()]) {
            case 1:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_partially_filled_description);
            case 2:
            case 7:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_filled_description);
            case 3:
                if (z) {
                    i = C14743R.string.order_confirmation_shares_sell_queued_description_pre_ipo;
                } else {
                    i = C14743R.string.f4122x6a447d5e;
                }
                return Integer.valueOf(i);
            case 4:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_unconfirmed_description);
            case 5:
            case 6:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_confirmed_description);
            case 8:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_rejected_description);
            case 9:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_pending_cancel_description);
            case 10:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_canceled_description);
            case 11:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_failed_description);
            case 12:
                return Integer.valueOf(C14743R.string.order_confirmation_shares_sell_voided_description);
            case 13:
            case 14:
            case 15:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final StringResource replacementOrderDescription(String symbol, Order newOrder, Order oldOrder) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(newOrder, "newOrder");
        Intrinsics.checkNotNullParameter(oldOrder, "oldOrder");
        BigDecimal quantity = newOrder.getQuantity();
        if (quantity == null) {
            return null;
        }
        return Paragraph4.joinToParagraph(CollectionsKt.listOfNotNull((Object[]) new StringResource[]{StringResource.INSTANCE.invoke(new StringResource.PluralsResource(baseStringRes(newOrder), toPluralQuantity(quantity)), getOrderConfirmationOrderTypeString(newOrder), Formats.getShareQuantityFormat().format(quantity), symbol), newOrder.getState() == EquityOrderState.PARTIALLY_FILLED ? remainingSharesSentence(newOrder.getRemainingQuantity()) : null, replacedOrderSentence(oldOrder)}));
    }

    private static final int baseStringRes(Order order) {
        EquityOrderSide side = order.getSide();
        EquityOrderSide equityOrderSide = EquityOrderSide.BUY;
        if (side == equityOrderSide && order.getPositionEffect() == OrderPositionEffect.CLOSE) {
            switch (WhenMappings.$EnumSwitchMapping$0[order.getState().ordinal()]) {
                case 1:
                    return C14743R.plurals.replace_order_new_partially_filled_buy_to_close;
                case 2:
                case 7:
                    return C14743R.plurals.replace_order_new_filled_buy_to_close;
                case 3:
                case 13:
                    return C14743R.plurals.replace_order_new_queued_buy_to_close;
                case 4:
                    return C14743R.plurals.replace_order_new_unconfirmed_buy_to_close;
                case 5:
                case 6:
                    return C14743R.plurals.replace_order_new_confirmed_buy_to_close;
                case 8:
                    return C14743R.plurals.replace_order_new_rejected_buy_to_close;
                case 9:
                    return C14743R.plurals.replace_order_new_pending_cancel_buy_to_close;
                case 10:
                    return C14743R.plurals.replace_order_new_canceled_buy_to_close;
                case 11:
                    return C14743R.plurals.replace_order_new_failed_buy_to_close;
                case 12:
                    return C14743R.plurals.replace_order_new_voided_buy_to_close;
                case 14:
                    throw new IllegalStateException("Locates not required for buy orders");
                case 15:
                    throw new IllegalStateException("Locates not required for buy orders");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (order.getSide() == equityOrderSide && order.getPositionEffect() == OrderPositionEffect.OPEN) {
            switch (WhenMappings.$EnumSwitchMapping$0[order.getState().ordinal()]) {
                case 1:
                    return C14743R.plurals.replace_order_new_partially_filled_buy;
                case 2:
                case 7:
                    return C14743R.plurals.replace_order_new_filled_buy;
                case 3:
                case 13:
                    return C14743R.plurals.replace_order_new_queued_buy;
                case 4:
                    return C14743R.plurals.replace_order_new_unconfirmed_buy;
                case 5:
                case 6:
                    return C14743R.plurals.replace_order_new_confirmed_buy;
                case 8:
                    return C14743R.plurals.replace_order_new_rejected_buy;
                case 9:
                    return C14743R.plurals.replace_order_new_pending_cancel_buy;
                case 10:
                    return C14743R.plurals.replace_order_new_canceled_buy;
                case 11:
                    return C14743R.plurals.replace_order_new_failed_buy;
                case 12:
                    return C14743R.plurals.replace_order_new_voided_buy;
                case 14:
                    throw new IllegalStateException("Locates not required for buy orders");
                case 15:
                    throw new IllegalStateException("Locates not required for buy orders");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (order.getSide() == EquityOrderSide.SELL) {
            switch (WhenMappings.$EnumSwitchMapping$0[order.getState().ordinal()]) {
                case 1:
                    return C14743R.plurals.replace_order_new_partially_filled_sell;
                case 2:
                case 7:
                    return C14743R.plurals.replace_order_new_filled_sell;
                case 3:
                case 13:
                    return C14743R.plurals.replace_order_new_queued_sell;
                case 4:
                    return C14743R.plurals.replace_order_new_unconfirmed_sell;
                case 5:
                case 6:
                    return C14743R.plurals.replace_order_new_confirmed_sell;
                case 8:
                    return C14743R.plurals.replace_order_new_rejected_sell;
                case 9:
                    return C14743R.plurals.replace_order_new_pending_cancel_sell;
                case 10:
                    return C14743R.plurals.replace_order_new_canceled_sell;
                case 11:
                    return C14743R.plurals.replace_order_new_failed_sell;
                case 12:
                    return C14743R.plurals.replace_order_new_voided_sell;
                case 14:
                    throw new IllegalStateException("locates not required for sell to close orders");
                case 15:
                    throw new IllegalStateException("locates not required for sell to close orders");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (order.getSide() == EquityOrderSide.SELL_SHORT) {
            switch (WhenMappings.$EnumSwitchMapping$0[order.getState().ordinal()]) {
                case 1:
                    return C14743R.plurals.replace_order_new_partially_filled_sell_short;
                case 2:
                case 7:
                    return C14743R.plurals.replace_order_new_filled_sell_short;
                case 3:
                case 13:
                    return C14743R.plurals.replace_order_new_queued_sell_short;
                case 4:
                    return C14743R.plurals.replace_order_new_unconfirmed_sell_short;
                case 5:
                case 6:
                    return C14743R.plurals.replace_order_new_confirmed_sell_short;
                case 8:
                    return C14743R.plurals.replace_order_new_rejected_sell_short;
                case 9:
                    return C14743R.plurals.replace_order_new_pending_cancel_sell_short;
                case 10:
                    return C14743R.plurals.replace_order_new_canceled_sell_short;
                case 11:
                    return C14743R.plurals.replace_order_new_failed_sell_short;
                case 12:
                    return C14743R.plurals.replace_order_new_voided_sell_short;
                case 14:
                    return C14743R.plurals.replace_order_new_locate_failed_sell_short;
                case 15:
                    return C14743R.plurals.replace_order_new_locating_sell_short;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        throw new IllegalStateException(("Unsupported order side/position effect: " + order.getSide() + "/" + order.getPositionEffect()).toString());
    }

    private static final StringResource remainingSharesSentence(BigDecimal bigDecimal) {
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C14743R.plurals.replace_order_remaining, toPluralQuantity(bigDecimal)), Formats.getShareQuantityFormat().format(bigDecimal));
    }

    private static final StringResource replacedOrderSentence(Order order) {
        int i = WhenMappings.$EnumSwitchMapping$0[order.getState().ordinal()];
        if (i == 4 || i == 7) {
            return null;
        }
        if (i == 9) {
            return StringResource.INSTANCE.invoke(C14743R.string.replace_order_old_pending_cancel, new Object[0]);
        }
        if (i == 10) {
            return StringResource.INSTANCE.invoke(C14743R.string.replace_order_old_canceled, new Object[0]);
        }
        CrashReporter.INSTANCE.reportNonFatal(new IllegalStateException("Unexpected old order state: " + order.getState()), false, new EventMetadata(SentryTeam.EQUITIES, null, MapsKt.mapOf(Tuples4.m3642to("oldOrderState", order.getState().getServerValue())), 2, null));
        return null;
    }

    private static final int toPluralQuantity(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            return 0;
        }
        return bigDecimal.compareTo(BigDecimal.ONE) == 0 ? 1 : 2;
    }
}
