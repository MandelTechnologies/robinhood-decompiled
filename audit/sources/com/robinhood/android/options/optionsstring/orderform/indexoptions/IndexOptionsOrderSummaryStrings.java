package com.robinhood.android.options.optionsstring.orderform.indexoptions;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.common.OptionInstrumentDetails2;
import com.robinhood.android.options.optionsstring.common.OptionInstruments;
import com.robinhood.android.options.optionsstring.datetime.DateStrings2;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: IndexOptionsOrderSummaryStrings.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001au\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001ac\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001c\u0010\u001d\u001au\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0015\u001aY\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Landroid/content/res/Resources;", "res", "Lcom/robinhood/models/db/OptionInstrument;", "optionInstrument", "Lcom/robinhood/models/db/OrderSide;", "orderSide", "Lcom/robinhood/models/db/OrderPositionEffect;", "positionEffect", "Ljava/math/BigDecimal;", "quantity", "", "settleOnOpen", "j$/time/LocalDate", "today", "totalCostWithoutFee", "tradeValueMultiplier", "isReplacedOrderPartiallyFilled", "isSG", "shouldShortenBuyToOpen", "", "getIndexOptionsLimitOrderSummaryStr", "(Landroid/content/res/Resources;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/db/OrderPositionEffect;Ljava/math/BigDecimal;ZLj$/time/LocalDate;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;ZZ)Ljava/lang/String;", "getFeesDetailDisplayString", "(Landroid/content/res/Resources;Z)Ljava/lang/String;", "limitPrice", "stopPrice", "Lcom/robinhood/models/db/OrderTimeInForce;", "timeInForce", "getIndexOptionsStopLimitOrderSummaryStr", "(Landroid/content/res/Resources;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OrderSide;Ljava/math/BigDecimal;ZLjava/math/BigDecimal;Lcom/robinhood/models/db/OrderTimeInForce;Lj$/time/LocalDate;Ljava/lang/Boolean;)Ljava/lang/String;", "getIndexOptionsMarketOrderSummaryStr", "getIndexOptionsStopMarketOrderSummaryStr", "(Landroid/content/res/Resources;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/db/OrderPositionEffect;Ljava/math/BigDecimal;ZLjava/math/BigDecimal;Lj$/time/LocalDate;Ljava/lang/Boolean;)Ljava/lang/String;", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.optionsstring.orderform.indexoptions.IndexOptionsOrderSummaryStringsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class IndexOptionsOrderSummaryStrings {

    /* compiled from: IndexOptionsOrderSummaryStrings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.optionsstring.orderform.indexoptions.IndexOptionsOrderSummaryStringsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OptionContractType.values().length];
            try {
                iArr[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderTimeInForce.values().length];
            try {
                iArr2[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OrderSide.values().length];
            try {
                iArr3[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static /* synthetic */ String getIndexOptionsLimitOrderSummaryStr$default(Resources resources, OptionInstrument optionInstrument, OrderSide orderSide, OrderPositionEffect orderPositionEffect, BigDecimal bigDecimal, boolean z, LocalDate localDate, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Boolean bool, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1024) != 0) {
            z2 = false;
        }
        if ((i & 2048) != 0) {
            z3 = false;
        }
        return getIndexOptionsLimitOrderSummaryStr(resources, optionInstrument, orderSide, orderPositionEffect, bigDecimal, z, localDate, bigDecimal2, bigDecimal3, bool, z2, z3);
    }

    public static final String getIndexOptionsLimitOrderSummaryStr(Resources res, OptionInstrument optionInstrument, OrderSide orderSide, OrderPositionEffect positionEffect, BigDecimal quantity, boolean z, LocalDate today, BigDecimal bigDecimal, BigDecimal tradeValueMultiplier, Boolean bool, boolean z2, boolean z3) throws Resources.NotFoundException {
        String string2;
        String string3;
        String string4;
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(today, "today");
        Intrinsics.checkNotNullParameter(tradeValueMultiplier, "tradeValueMultiplier");
        OptionContractType contractType = optionInstrument.getContractType();
        BigDecimal strikePrice = optionInstrument.getStrikePrice();
        LocalDate expirationDate = optionInstrument.getExpirationDate();
        String nullable$default = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), bigDecimal != null ? bigDecimal.abs() : null, null, 2, null);
        if (z) {
            string2 = res.getString(C23386R.string.index_options_am_expiration_time, DateStrings2.formatTo24HourTime$default(9, 30, null, 4, null));
        } else {
            string2 = res.getString(C23386R.string.index_options_pm_expiration_time, DateStrings2.formatTo24HourTime$default(16, 0, null, 4, null));
        }
        Intrinsics.checkNotNull(string2);
        String expirationDateStr = DateStrings2.getExpirationDateStr(expirationDate, today);
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            string3 = res.getString(C23386R.string.cancel_new_replace_order_partially_filled_text);
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            string3 = res.getString(C23386R.string.cancel_new_replace_order_non_partially_filled_text);
        } else {
            if (bool != null) {
                throw new NoWhenBranchMatchedException();
            }
            string3 = "";
        }
        Intrinsics.checkNotNull(string3);
        int i = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
        if (i == 1) {
            string4 = res.getString(C23386R.string.settlement_value_compare_to_strike_for_call_to_take_profit);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string4 = res.getString(C23386R.string.settlement_value_compare_to_strike_for_put_to_take_profit);
        }
        Intrinsics.checkNotNull(string4);
        String feesDetailDisplayString = getFeesDetailDisplayString(res, z2);
        OrderSide orderSide2 = OrderSide.BUY;
        if (orderSide == orderSide2 && positionEffect == OrderPositionEffect.OPEN) {
            String formattedTitleString = OptionInstrumentDetails2.getFormattedTitleString(optionInstrument, res, OptionChain.UnderlyingType.INDEX);
            if (z3) {
                return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C23386R.plurals.index_options_limit_order_buy_to_open_shorten, quantity, nullable$default, quantity, formattedTitleString, string2, expirationDateStr, string3, string4, Formats.getStrikeValueFormat().format(strikePrice), feesDetailDisplayString);
            }
            return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C23386R.plurals.index_options_limit_order_buy_to_open, quantity, nullable$default, quantity, formattedTitleString, string2, expirationDateStr, string3, string4, Formats.getStrikeValueFormat().format(strikePrice), Formats.getShareQuantityFormat().format(tradeValueMultiplier), feesDetailDisplayString);
        }
        String str = string2;
        OrderSide orderSide3 = OrderSide.SELL;
        if (orderSide == orderSide3 && positionEffect == OrderPositionEffect.OPEN) {
            return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C23386R.plurals.index_options_limit_order_sell_to_open, quantity, quantity, OptionInstrumentDetails2.getFormattedTitleString(optionInstrument, res, OptionChain.UnderlyingType.INDEX), str, expirationDateStr, string4, Formats.getStrikeValueFormat().format(strikePrice), nullable$default, string3, feesDetailDisplayString);
        }
        String str2 = string3;
        if (orderSide == orderSide2 && positionEffect == OrderPositionEffect.CLOSE) {
            return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C23386R.plurals.index_options_limit_order_buy_to_close, quantity, nullable$default, quantity, OptionInstruments.getTitleStringWithExpiration(optionInstrument, res, OptionChain.UnderlyingType.INDEX, z), str2, feesDetailDisplayString);
        }
        if (orderSide == orderSide3 && positionEffect == OrderPositionEffect.CLOSE) {
            return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C23386R.plurals.index_options_limit_order_sell_to_close, quantity, quantity, OptionInstruments.getTitleStringWithExpiration(optionInstrument, res, OptionChain.UnderlyingType.INDEX, z), nullable$default, str2, feesDetailDisplayString);
        }
        throw new IllegalStateException(("Not possible combination: " + orderSide + ", " + positionEffect + ".").toString());
    }

    private static final String getFeesDetailDisplayString(Resources resources, boolean z) throws Resources.NotFoundException {
        if (z) {
            String string2 = resources.getString(C23386R.string.gated_regulatory_fees_display_sg);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = resources.getString(C23386R.string.index_options_fees_display);
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    public static final String getIndexOptionsStopLimitOrderSummaryStr(Resources res, BigDecimal bigDecimal, OptionInstrument optionInstrument, OrderSide orderSide, BigDecimal quantity, boolean z, BigDecimal bigDecimal2, OrderTimeInForce timeInForce, LocalDate today, Boolean bool) throws Resources.NotFoundException {
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(today, "today");
        LocalDate expirationDate = optionInstrument.getExpirationDate();
        int i = WhenMappings.$EnumSwitchMapping$1[timeInForce.ordinal()];
        String string4 = "";
        if (i == 1) {
            string2 = res.getString(C23386R.string.index_options_stop_limit_good_for_day);
        } else {
            string2 = i != 2 ? "" : res.getString(C23386R.string.index_options_stop_limit_good_till_canceled);
        }
        Intrinsics.checkNotNull(string2);
        if (z) {
            string3 = res.getString(C23386R.string.index_options_am_expiration_time, DateStrings2.formatTo24HourTime$default(9, 30, null, 4, null));
        } else {
            string3 = res.getString(C23386R.string.index_options_pm_expiration_time, DateStrings2.formatTo24HourTime$default(16, 0, null, 4, null));
        }
        Intrinsics.checkNotNull(string3);
        String expirationDateStr = DateStrings2.getExpirationDateStr(expirationDate, today);
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            string4 = res.getString(C23386R.string.cancel_new_replace_order_partially_filled_text);
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            string4 = res.getString(C23386R.string.cancel_new_replace_order_non_partially_filled_text);
        } else if (bool != null) {
            throw new NoWhenBranchMatchedException();
        }
        String str = string4;
        Intrinsics.checkNotNull(str);
        String formattedTitleString = OptionInstrumentDetails2.getFormattedTitleString(optionInstrument, res, OptionChain.UnderlyingType.INDEX);
        int i2 = WhenMappings.$EnumSwitchMapping$2[orderSide.ordinal()];
        if (i2 == 1) {
            return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C23386R.plurals.index_options_stop_limit_order_buy, quantity, string2, quantity, formattedTitleString, string3, expirationDateStr, str, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), bigDecimal2, null, 2, null), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), bigDecimal, null, 2, null));
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C23386R.plurals.index_options_stop_limit_order_sell, quantity, string2, quantity, formattedTitleString, string3, expirationDateStr, str, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), bigDecimal2, null, 2, null), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), bigDecimal, null, 2, null));
    }

    public static /* synthetic */ String getIndexOptionsMarketOrderSummaryStr$default(Resources resources, OptionInstrument optionInstrument, OrderSide orderSide, OrderPositionEffect orderPositionEffect, BigDecimal bigDecimal, boolean z, LocalDate localDate, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Boolean bool, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1024) != 0) {
            z2 = false;
        }
        if ((i & 2048) != 0) {
            z3 = false;
        }
        return getIndexOptionsMarketOrderSummaryStr(resources, optionInstrument, orderSide, orderPositionEffect, bigDecimal, z, localDate, bigDecimal2, bigDecimal3, bool, z2, z3);
    }

    public static final String getIndexOptionsMarketOrderSummaryStr(Resources res, OptionInstrument optionInstrument, OrderSide orderSide, OrderPositionEffect positionEffect, BigDecimal quantity, boolean z, LocalDate today, BigDecimal bigDecimal, BigDecimal tradeValueMultiplier, Boolean bool, boolean z2, boolean z3) throws Resources.NotFoundException {
        String string2;
        String string3;
        String string4;
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(today, "today");
        Intrinsics.checkNotNullParameter(tradeValueMultiplier, "tradeValueMultiplier");
        OptionContractType contractType = optionInstrument.getContractType();
        BigDecimal strikePrice = optionInstrument.getStrikePrice();
        LocalDate expirationDate = optionInstrument.getExpirationDate();
        String nullable$default = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), bigDecimal != null ? bigDecimal.abs() : null, null, 2, null);
        if (z) {
            string2 = res.getString(C23386R.string.index_options_am_expiration_time, DateStrings2.formatTo24HourTime$default(9, 30, null, 4, null));
        } else {
            string2 = res.getString(C23386R.string.index_options_pm_expiration_time, DateStrings2.formatTo24HourTime$default(16, 0, null, 4, null));
        }
        Intrinsics.checkNotNull(string2);
        String expirationDateStr = DateStrings2.getExpirationDateStr(expirationDate, today);
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            string3 = res.getString(C23386R.string.cancel_new_replace_order_partially_filled_text);
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            string3 = res.getString(C23386R.string.cancel_new_replace_order_non_partially_filled_text);
        } else {
            if (bool != null) {
                throw new NoWhenBranchMatchedException();
            }
            string3 = "";
        }
        Intrinsics.checkNotNull(string3);
        int i = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
        if (i == 1) {
            string4 = res.getString(C23386R.string.settlement_value_compare_to_strike_for_call_to_take_profit);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string4 = res.getString(C23386R.string.settlement_value_compare_to_strike_for_put_to_take_profit);
        }
        Intrinsics.checkNotNull(string4);
        String feesDetailDisplayString = getFeesDetailDisplayString(res, z2);
        OrderSide orderSide2 = OrderSide.BUY;
        if (orderSide == orderSide2 && positionEffect == OrderPositionEffect.OPEN) {
            String formattedTitleString = OptionInstrumentDetails2.getFormattedTitleString(optionInstrument, res, OptionChain.UnderlyingType.INDEX);
            if (z3) {
                return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C23386R.plurals.index_options_market_order_buy_to_open_shorten, quantity, nullable$default, quantity, formattedTitleString, string2, expirationDateStr, string3, string4, Formats.getStrikeValueFormat().format(strikePrice), feesDetailDisplayString);
            }
            return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C23386R.plurals.index_options_market_order_buy_to_open, quantity, nullable$default, quantity, formattedTitleString, string2, expirationDateStr, string3, string4, Formats.getStrikeValueFormat().format(strikePrice), Formats.getShareQuantityFormat().format(tradeValueMultiplier), feesDetailDisplayString);
        }
        String str = string2;
        OrderSide orderSide3 = OrderSide.SELL;
        if (orderSide == orderSide3 && positionEffect == OrderPositionEffect.OPEN) {
            return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C23386R.plurals.index_options_market_order_sell_to_open, quantity, quantity, OptionInstrumentDetails2.getFormattedTitleString(optionInstrument, res, OptionChain.UnderlyingType.INDEX), str, expirationDateStr, string4, Formats.getStrikeValueFormat().format(strikePrice), nullable$default, string3, feesDetailDisplayString);
        }
        String str2 = string3;
        if (orderSide == orderSide2 && positionEffect == OrderPositionEffect.CLOSE) {
            return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C23386R.plurals.index_options_market_order_buy_to_close, quantity, nullable$default, quantity, OptionInstruments.getTitleStringWithExpiration(optionInstrument, res, OptionChain.UnderlyingType.INDEX, z), str2, feesDetailDisplayString);
        }
        if (orderSide == orderSide3 && positionEffect == OrderPositionEffect.CLOSE) {
            return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C23386R.plurals.index_options_market_order_sell_to_close, quantity, quantity, OptionInstruments.getTitleStringWithExpiration(optionInstrument, res, OptionChain.UnderlyingType.INDEX, z), nullable$default, str2, feesDetailDisplayString);
        }
        throw new IllegalStateException(("Not possible combination: " + orderSide + ", " + positionEffect + ".").toString());
    }

    public static final String getIndexOptionsStopMarketOrderSummaryStr(Resources res, OptionInstrument optionInstrument, OrderSide orderSide, OrderPositionEffect positionEffect, BigDecimal quantity, boolean z, BigDecimal bigDecimal, LocalDate today, Boolean bool) throws Resources.NotFoundException {
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(today, "today");
        if (positionEffect == OrderPositionEffect.CLOSE) {
            OrderSide orderSide2 = OrderSide.SELL;
        }
        LocalDate expirationDate = optionInstrument.getExpirationDate();
        if (z) {
            string2 = res.getString(C23386R.string.index_options_am_expiration_time, DateStrings2.formatTo24HourTime$default(9, 30, null, 4, null));
        } else {
            string2 = res.getString(C23386R.string.index_options_pm_expiration_time, DateStrings2.formatTo24HourTime$default(16, 0, null, 4, null));
        }
        Intrinsics.checkNotNull(string2);
        String expirationDateStr = DateStrings2.getExpirationDateStr(expirationDate, today);
        String string4 = "";
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            string3 = res.getString(C23386R.string.cancel_new_replace_order_partially_filled_text);
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            string3 = res.getString(C23386R.string.cancel_new_replace_order_non_partially_filled_text);
        } else {
            if (bool != null) {
                throw new NoWhenBranchMatchedException();
            }
            string3 = "";
        }
        Intrinsics.checkNotNull(string3);
        if (bool != null) {
            string4 = res.getString(C23386R.string.cancel_new_optional_new_string);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        }
        String str = string4;
        String formattedTitleString = OptionInstrumentDetails2.getFormattedTitleString(optionInstrument, res, OptionChain.UnderlyingType.INDEX);
        return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C23386R.plurals.index_options_stop_market_order_summary, quantity, quantity, formattedTitleString, string2, expirationDateStr, string3, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), bigDecimal, null, 2, null), str);
    }
}
