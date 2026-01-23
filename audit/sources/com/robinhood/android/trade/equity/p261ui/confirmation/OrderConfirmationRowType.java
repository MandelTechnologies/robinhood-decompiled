package com.robinhood.android.trade.equity.p261ui.confirmation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderConfirmationRowType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationRowType;", "", "<init>", "(Ljava/lang/String;I)V", "AMOUNT", "TOTAL_SHARES", "TOTAL_SHARES_AS_SUBTOTAL", "ESTIMATED_SHARES", "PENDING_SHARES", "TOTAL_COST_CREDIT", "ESTIMATED_COST_CREDIT", "PENDING_COST_CREDIT", "AVERAGE_PRICE", "ESTIMATED_WITHHOLDING_AMOUNT", "WITHHOLDING_AMOUNT", "TAX_LOTS", "TAX_LOTS_M1", "ACCOUNT_LABEL", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OrderConfirmationRowType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderConfirmationRowType[] $VALUES;
    public static final OrderConfirmationRowType AMOUNT = new OrderConfirmationRowType("AMOUNT", 0);
    public static final OrderConfirmationRowType TOTAL_SHARES = new OrderConfirmationRowType("TOTAL_SHARES", 1);
    public static final OrderConfirmationRowType TOTAL_SHARES_AS_SUBTOTAL = new OrderConfirmationRowType("TOTAL_SHARES_AS_SUBTOTAL", 2);
    public static final OrderConfirmationRowType ESTIMATED_SHARES = new OrderConfirmationRowType("ESTIMATED_SHARES", 3);
    public static final OrderConfirmationRowType PENDING_SHARES = new OrderConfirmationRowType("PENDING_SHARES", 4);
    public static final OrderConfirmationRowType TOTAL_COST_CREDIT = new OrderConfirmationRowType("TOTAL_COST_CREDIT", 5);
    public static final OrderConfirmationRowType ESTIMATED_COST_CREDIT = new OrderConfirmationRowType("ESTIMATED_COST_CREDIT", 6);
    public static final OrderConfirmationRowType PENDING_COST_CREDIT = new OrderConfirmationRowType("PENDING_COST_CREDIT", 7);
    public static final OrderConfirmationRowType AVERAGE_PRICE = new OrderConfirmationRowType("AVERAGE_PRICE", 8);
    public static final OrderConfirmationRowType ESTIMATED_WITHHOLDING_AMOUNT = new OrderConfirmationRowType("ESTIMATED_WITHHOLDING_AMOUNT", 9);
    public static final OrderConfirmationRowType WITHHOLDING_AMOUNT = new OrderConfirmationRowType("WITHHOLDING_AMOUNT", 10);
    public static final OrderConfirmationRowType TAX_LOTS = new OrderConfirmationRowType("TAX_LOTS", 11);
    public static final OrderConfirmationRowType TAX_LOTS_M1 = new OrderConfirmationRowType("TAX_LOTS_M1", 12);
    public static final OrderConfirmationRowType ACCOUNT_LABEL = new OrderConfirmationRowType("ACCOUNT_LABEL", 13);

    private static final /* synthetic */ OrderConfirmationRowType[] $values() {
        return new OrderConfirmationRowType[]{AMOUNT, TOTAL_SHARES, TOTAL_SHARES_AS_SUBTOTAL, ESTIMATED_SHARES, PENDING_SHARES, TOTAL_COST_CREDIT, ESTIMATED_COST_CREDIT, PENDING_COST_CREDIT, AVERAGE_PRICE, ESTIMATED_WITHHOLDING_AMOUNT, WITHHOLDING_AMOUNT, TAX_LOTS, TAX_LOTS_M1, ACCOUNT_LABEL};
    }

    public static EnumEntries<OrderConfirmationRowType> getEntries() {
        return $ENTRIES;
    }

    private OrderConfirmationRowType(String str, int i) {
    }

    static {
        OrderConfirmationRowType[] orderConfirmationRowTypeArr$values = $values();
        $VALUES = orderConfirmationRowTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderConfirmationRowTypeArr$values);
    }

    public static OrderConfirmationRowType valueOf(String str) {
        return (OrderConfirmationRowType) Enum.valueOf(OrderConfirmationRowType.class, str);
    }

    public static OrderConfirmationRowType[] values() {
        return (OrderConfirmationRowType[]) $VALUES.clone();
    }
}
