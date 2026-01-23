package com.robinhood.android.trade.equity.p261ui.configuration.price;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.trade.equity.p261ui.configuration.price.validation.OrderPriceStep;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderPriceScreenType.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceScreenType;", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "promptRes", "priceLabelRes", "<init>", "(Ljava/lang/String;IIII)V", "getTitleRes", "()I", "getPromptRes", "getPriceLabelRes", "BUY_LIMIT", "BUY_STOP_LIMIT", "BUY_STOP_LOSS", "SELL_LIMIT", "SELL_STOP_LIMIT", "SELL_STOP_LOSS", "SELL_SHORT_STOP_LOSS", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "step", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceStep;", "getStep", "()Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceStep;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OrderPriceScreenType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderPriceScreenType[] $VALUES;
    private final int priceLabelRes;
    private final int promptRes;
    private final int titleRes;
    public static final OrderPriceScreenType BUY_LIMIT = new OrderPriceScreenType("BUY_LIMIT", 0, C11048R.string.general_label_limit_price_set, C20649R.string.order_create_advanced_equity_limit_price_buy_prompt, C11048R.string.general_label_limit_price);
    public static final OrderPriceScreenType BUY_STOP_LIMIT = new OrderPriceScreenType("BUY_STOP_LIMIT", 1, C20649R.string.order_create_advanced_stop_price_label, C20649R.string.order_create_advanced_equity_stop_limit_buy_prompt, C20649R.string.general_label_stop_price);
    public static final OrderPriceScreenType BUY_STOP_LOSS = new OrderPriceScreenType("BUY_STOP_LOSS", 2, C20649R.string.order_create_advanced_stop_price_label, C20649R.string.f4268xbb40b012, C20649R.string.general_label_stop_price);
    public static final OrderPriceScreenType SELL_LIMIT = new OrderPriceScreenType("SELL_LIMIT", 3, C11048R.string.general_label_limit_price_set, C20649R.string.order_create_advanced_equity_limit_price_sell_prompt, C11048R.string.general_label_limit_price);
    public static final OrderPriceScreenType SELL_STOP_LIMIT = new OrderPriceScreenType("SELL_STOP_LIMIT", 4, C20649R.string.order_create_advanced_stop_price_label, C20649R.string.order_create_advanced_equity_stop_limit_sell_prompt, C20649R.string.general_label_stop_price);
    public static final OrderPriceScreenType SELL_STOP_LOSS = new OrderPriceScreenType("SELL_STOP_LOSS", 5, C20649R.string.order_create_advanced_stop_price_label, C20649R.string.f4270x23cf50a6, C20649R.string.general_label_stop_price);
    public static final OrderPriceScreenType SELL_SHORT_STOP_LOSS = new OrderPriceScreenType("SELL_SHORT_STOP_LOSS", 6, C20649R.string.order_create_advanced_stop_price_label, C20649R.string.order_create_advanced_equity_stop_price_sell_short, C20649R.string.general_label_stop_price);

    /* compiled from: OrderPriceScreenType.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderPriceScreenType.values().length];
            try {
                iArr[OrderPriceScreenType.BUY_LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderPriceScreenType.BUY_STOP_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderPriceScreenType.BUY_STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderPriceScreenType.SELL_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderPriceScreenType.SELL_STOP_LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderPriceScreenType.SELL_STOP_LOSS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OrderPriceScreenType.SELL_SHORT_STOP_LOSS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ OrderPriceScreenType[] $values() {
        return new OrderPriceScreenType[]{BUY_LIMIT, BUY_STOP_LIMIT, BUY_STOP_LOSS, SELL_LIMIT, SELL_STOP_LIMIT, SELL_STOP_LOSS, SELL_SHORT_STOP_LOSS};
    }

    public static EnumEntries<OrderPriceScreenType> getEntries() {
        return $ENTRIES;
    }

    private OrderPriceScreenType(String str, int i, int i2, int i3, int i4) {
        this.titleRes = i2;
        this.promptRes = i3;
        this.priceLabelRes = i4;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final int getPromptRes() {
        return this.promptRes;
    }

    public final int getPriceLabelRes() {
        return this.priceLabelRes;
    }

    static {
        OrderPriceScreenType[] orderPriceScreenTypeArr$values = $values();
        $VALUES = orderPriceScreenTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderPriceScreenTypeArr$values);
    }

    public final EquityOrderSide getSide() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
                return EquityOrderSide.BUY;
            case 4:
            case 5:
            case 6:
            case 7:
                return EquityOrderSide.SELL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final OrderPriceStep getStep() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 4:
                return OrderPriceStep.LIMIT_PRICE;
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                return OrderPriceStep.STOP_PRICE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static OrderPriceScreenType valueOf(String str) {
        return (OrderPriceScreenType) Enum.valueOf(OrderPriceScreenType.class, str);
    }

    public static OrderPriceScreenType[] values() {
        return (OrderPriceScreenType[]) $VALUES.clone();
    }
}
