package com.robinhood.android.equityadvancedorder.utils;

import com.robinhood.android.equityadvancedorder.C15237R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.trade.configuration.C29312R;
import com.robinhood.android.trading.contracts.configuration.DirectOrder5;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.util.Money;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderCreateDescriptionTextUtil.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J`\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017JM\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0001¢\u0006\u0002\b\u0019J-\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0002\b\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0002\b\u001dJ#\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0001¢\u0006\u0002\b\u001fJ'\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0002\b!J-\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0002\b$¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/utils/OrderCreateDescriptionTextUtil;", "", "<init>", "()V", "getDescriptionText", "Lcom/robinhood/utils/resource/StringResource;", "position", "Lcom/robinhood/models/db/Position;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "showMultipleAccountsExperience", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "instrumentBuyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "account", "Lcom/robinhood/models/db/Account;", "instrument", "Lcom/robinhood/models/db/Instrument;", "orderPendingReplacement", "Lcom/robinhood/models/db/Order;", "getAvailableText", "getAvailableText$lib_equity_advanced_order_externalDebug", "getAvailableTextForBuy", "getAvailableTextForBuy$lib_equity_advanced_order_externalDebug", "getAvailableTextForSellShort", "getAvailableTextForSellShort$lib_equity_advanced_order_externalDebug", "availableTextForSell", "availableTextForSell$lib_equity_advanced_order_externalDebug", "availableSharesForBuyShortPositionStringResource", "availableSharesForBuyShortPositionStringResource$lib_equity_advanced_order_externalDebug", "buyingPower", "Ljava/math/BigDecimal;", "buyingPower$lib_equity_advanced_order_externalDebug", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderCreateDescriptionTextUtil {
    public static final int $stable = 0;
    public static final OrderCreateDescriptionTextUtil INSTANCE = new OrderCreateDescriptionTextUtil();

    /* compiled from: OrderCreateDescriptionTextUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityOrderSide.values().length];
            try {
                iArr[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private OrderCreateDescriptionTextUtil() {
    }

    public static /* synthetic */ StringResource getDescriptionText$default(OrderCreateDescriptionTextUtil orderCreateDescriptionTextUtil, Position position, EquityOrderSide equityOrderSide, OrderPositionEffect orderPositionEffect, boolean z, EquityOrderConfiguration equityOrderConfiguration, InstrumentBuyingPower instrumentBuyingPower, Account account, Instrument instrument, Order order, int i, Object obj) {
        if ((i & 1) != 0) {
            position = null;
        }
        return orderCreateDescriptionTextUtil.getDescriptionText(position, equityOrderSide, orderPositionEffect, z, equityOrderConfiguration, instrumentBuyingPower, account, instrument, order);
    }

    public final StringResource getDescriptionText(Position position, EquityOrderSide side, OrderPositionEffect positionEffect, boolean showMultipleAccountsExperience, EquityOrderConfiguration configuration, InstrumentBuyingPower instrumentBuyingPower, Account account, Instrument instrument, Order orderPendingReplacement) {
        StringResource stringResourceInvoke;
        BigDecimal quantity;
        Intrinsics.checkNotNullParameter(side, "side");
        if (side == EquityOrderSide.SELL_SHORT) {
            return m1967x3f8e50d7(instrumentBuyingPower);
        }
        if (side == EquityOrderSide.BUY && positionEffect == OrderPositionEffect.CLOSE && position != null && Position5.isShortPosition(position)) {
            BigDecimal sharesAvailableForClosingShortPositionDisplay = Position5.getSharesAvailableForClosingShortPositionDisplay(position);
            if (sharesAvailableForClosingShortPositionDisplay == null) {
                sharesAvailableForClosingShortPositionDisplay = BigDecimal.ZERO;
            }
            if (orderPendingReplacement == null || (quantity = orderPendingReplacement.getQuantity()) == null) {
                quantity = BigDecimal.ZERO;
            }
            Intrinsics.checkNotNull(sharesAvailableForClosingShortPositionDisplay);
            Intrinsics.checkNotNull(quantity);
            BigDecimal bigDecimalSubtract = sharesAvailableForClosingShortPositionDisplay.subtract(quantity);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C15237R.plurals.order_create_available_shares, BigDecimals7.toIntRoundUp(bigDecimalSubtract)), Formats.getShareQuantityFormat().format(bigDecimalSubtract));
        }
        StringResource stringResourceM1966xafa56260 = m1966xafa56260(position, side);
        if (stringResourceM1966xafa56260 != null) {
            return stringResourceM1966xafa56260;
        }
        if (!(configuration != null ? configuration.isBuySellOrder() : false)) {
            if (showMultipleAccountsExperience) {
                return null;
            }
            return getAvailableText$lib_equity_advanced_order_externalDebug(position, instrumentBuyingPower, account, instrument, side, orderPendingReplacement);
        }
        StringResource availableText$lib_equity_advanced_order_externalDebug = showMultipleAccountsExperience ? null : getAvailableText$lib_equity_advanced_order_externalDebug(position, instrumentBuyingPower, account, instrument, side, orderPendingReplacement);
        if (configuration instanceof DirectOrder5) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C29312R.string.order_type_limit_title, new Object[0]);
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C29312R.string.order_type_market_title, new Object[0]);
        }
        return new StringResource.Join(CollectionsKt.listOfNotNull((Object[]) new StringResource[]{availableText$lib_equity_advanced_order_externalDebug, stringResourceInvoke}), " • ");
    }

    public static /* synthetic */ StringResource getAvailableText$lib_equity_advanced_order_externalDebug$default(OrderCreateDescriptionTextUtil orderCreateDescriptionTextUtil, Position position, InstrumentBuyingPower instrumentBuyingPower, Account account, Instrument instrument, EquityOrderSide equityOrderSide, Order order, int i, Object obj) {
        if ((i & 2) != 0) {
            instrumentBuyingPower = null;
        }
        return orderCreateDescriptionTextUtil.getAvailableText$lib_equity_advanced_order_externalDebug(position, instrumentBuyingPower, account, instrument, equityOrderSide, order);
    }

    public final StringResource getAvailableText$lib_equity_advanced_order_externalDebug(Position position, InstrumentBuyingPower instrumentBuyingPower, Account account, Instrument instrument, EquityOrderSide side, Order orderPendingReplacement) {
        if (side == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            return getAvailableTextForBuy$lib_equity_advanced_order_externalDebug(instrumentBuyingPower, account, instrument);
        }
        if (i == 2) {
            return availableTextForSell$lib_equity_advanced_order_externalDebug(position, orderPendingReplacement);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return m1967x3f8e50d7(instrumentBuyingPower);
    }

    public final StringResource getAvailableTextForBuy$lib_equity_advanced_order_externalDebug(InstrumentBuyingPower instrumentBuyingPower, Account account, Instrument instrument) {
        BigDecimal bigDecimalBuyingPower$lib_equity_advanced_order_externalDebug = buyingPower$lib_equity_advanced_order_externalDebug(instrumentBuyingPower, account, instrument);
        if (BigDecimals7.isNegative(bigDecimalBuyingPower$lib_equity_advanced_order_externalDebug)) {
            return StringResource.INSTANCE.invoke(C20649R.string.order_create_negative_buying_power, new Object[0]);
        }
        if (bigDecimalBuyingPower$lib_equity_advanced_order_externalDebug != null) {
            return StringResource.INSTANCE.invoke(C20649R.string.order_create_available_buying_power, Formats.getPriceFormat().format(bigDecimalBuyingPower$lib_equity_advanced_order_externalDebug));
        }
        return null;
    }

    /* renamed from: getAvailableTextForSellShort$lib_equity_advanced_order_externalDebug */
    public final StringResource m1967x3f8e50d7(InstrumentBuyingPower instrumentBuyingPower) {
        Money shortSellingPower;
        BigDecimal decimalValue;
        if (instrumentBuyingPower == null || (shortSellingPower = instrumentBuyingPower.getShortSellingPower()) == null || (decimalValue = shortSellingPower.getDecimalValue()) == null) {
            return null;
        }
        if (BigDecimals7.isNegative(decimalValue)) {
            return StringResource.INSTANCE.invoke(C20649R.string.order_create_negative_buying_power, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C20649R.string.order_create_available_buying_power, Formats.getPriceFormat().format(decimalValue));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[PHI: r0
      0x0043: PHI (r0v7 int) = (r0v5 int), (r0v6 int) binds: [B:17:0x0041, B:20:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StringResource availableTextForSell$lib_equity_advanced_order_externalDebug(Position position, Order orderPendingReplacement) {
        int intRoundUp;
        if (position == null) {
            return null;
        }
        BigDecimal bigDecimalAdd = position.getClosableQuantity().add(BigDecimals7.orZero(orderPendingReplacement != null ? orderPendingReplacement.getQuantity() : null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        BigDecimal bigDecimal = BigDecimal.ONE;
        if (Intrinsics.areEqual(bigDecimalAdd, bigDecimal)) {
            intRoundUp = 1;
        } else if (bigDecimalAdd.compareTo(BigDecimal.ZERO) < 0 || bigDecimalAdd.compareTo(bigDecimal) >= 0) {
            int i = Integer.MAX_VALUE;
            if (bigDecimalAdd.compareTo(new BigDecimal(Integer.MAX_VALUE)) >= 0) {
                intRoundUp = i;
            } else {
                i = Integer.MIN_VALUE;
                if (bigDecimalAdd.compareTo(new BigDecimal(Integer.MIN_VALUE)) > 0) {
                    intRoundUp = BigDecimals7.toIntRoundUp(bigDecimalAdd);
                }
            }
        } else {
            intRoundUp = 0;
        }
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C15237R.plurals.order_create_available_shares, intRoundUp), Formats.getShareQuantityFormat().format(bigDecimalAdd));
    }

    /* renamed from: availableSharesForBuyShortPositionStringResource$lib_equity_advanced_order_externalDebug$default */
    public static /* synthetic */ StringResource m1965xfe8b27fd(OrderCreateDescriptionTextUtil orderCreateDescriptionTextUtil, Position position, EquityOrderSide equityOrderSide, int i, Object obj) {
        if ((i & 1) != 0) {
            position = null;
        }
        if ((i & 2) != 0) {
            equityOrderSide = null;
        }
        return orderCreateDescriptionTextUtil.m1966xafa56260(position, equityOrderSide);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[PHI: r1
      0x004e: PHI (r1v5 int) = (r1v3 int), (r1v4 int) binds: [B:18:0x004c, B:21:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: availableSharesForBuyShortPositionStringResource$lib_equity_advanced_order_externalDebug */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StringResource m1966xafa56260(Position position, EquityOrderSide side) {
        int intRoundUp;
        if (!Position5.isShortPosition(position) || side != EquityOrderSide.BUY || position == null) {
            return null;
        }
        if (BigDecimals7.isZero(position.getPendingQuantityForClosingShortPosition())) {
            BigDecimal quantity = position.getQuantity();
            BigDecimal bigDecimal = BigDecimal.ONE;
            if (Intrinsics.areEqual(quantity, bigDecimal)) {
                intRoundUp = 1;
            } else if (position.getQuantity().compareTo(BigDecimal.ZERO) < 0 || position.getQuantity().compareTo(bigDecimal) >= 0) {
                int i = Integer.MAX_VALUE;
                if (position.getQuantity().compareTo(new BigDecimal(Integer.MAX_VALUE)) >= 0) {
                    intRoundUp = i;
                } else {
                    i = Integer.MIN_VALUE;
                    if (position.getQuantity().compareTo(new BigDecimal(Integer.MIN_VALUE)) > 0) {
                        intRoundUp = BigDecimals7.toIntRoundUp(position.getQuantity());
                    }
                }
            } else {
                intRoundUp = 0;
            }
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C15237R.plurals.order_create_up_to_shares, intRoundUp), Formats.getShareQuantityFormat().format(position.getQuantity()));
        }
        return StringResource.INSTANCE.invoke(C15237R.string.order_create_up_to_shares_with_pending, Formats.getShareQuantityFormat().format(position.getQuantity()), Formats.getShareQuantityFormat().format(position.getPendingQuantityForClosingShortPosition()));
    }

    public final BigDecimal buyingPower$lib_equity_advanced_order_externalDebug(InstrumentBuyingPower instrumentBuyingPower, Account account, Instrument instrument) {
        Account.Balances balances;
        Money buyingPowerAmount;
        BigDecimal decimalValue;
        if (instrumentBuyingPower != null && (buyingPowerAmount = instrumentBuyingPower.getBuyingPowerAmount()) != null && (decimalValue = buyingPowerAmount.getDecimalValue()) != null) {
            return decimalValue;
        }
        if (instrument == null || account == null || (balances = account.getBalances()) == null) {
            return null;
        }
        return balances.getBuyingPowerForInstrument(instrument);
    }
}
