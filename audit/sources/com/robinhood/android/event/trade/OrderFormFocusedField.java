package com.robinhood.android.event.trade;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderFormFocusedField.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/event/trade/OrderFormFocusedField;", "", "<init>", "(Ljava/lang/String;I)V", "QUANTITY", "LIMIT_PRICE", "NOTIONAL_AMOUNT", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class OrderFormFocusedField {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderFormFocusedField[] $VALUES;
    public static final OrderFormFocusedField QUANTITY = new OrderFormFocusedField("QUANTITY", 0);
    public static final OrderFormFocusedField LIMIT_PRICE = new OrderFormFocusedField("LIMIT_PRICE", 1);
    public static final OrderFormFocusedField NOTIONAL_AMOUNT = new OrderFormFocusedField("NOTIONAL_AMOUNT", 2);

    private static final /* synthetic */ OrderFormFocusedField[] $values() {
        return new OrderFormFocusedField[]{QUANTITY, LIMIT_PRICE, NOTIONAL_AMOUNT};
    }

    public static EnumEntries<OrderFormFocusedField> getEntries() {
        return $ENTRIES;
    }

    private OrderFormFocusedField(String str, int i) {
    }

    static {
        OrderFormFocusedField[] orderFormFocusedFieldArr$values = $values();
        $VALUES = orderFormFocusedFieldArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderFormFocusedFieldArr$values);
    }

    public static OrderFormFocusedField valueOf(String str) {
        return (OrderFormFocusedField) Enum.valueOf(OrderFormFocusedField.class, str);
    }

    public static OrderFormFocusedField[] values() {
        return (OrderFormFocusedField[]) $VALUES.clone();
    }
}
