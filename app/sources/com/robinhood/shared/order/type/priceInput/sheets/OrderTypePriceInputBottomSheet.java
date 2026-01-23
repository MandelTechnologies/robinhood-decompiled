package com.robinhood.shared.order.type.priceInput.sheets;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderTypePriceInputBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/sheets/OrderTypePriceInputBottomSheet;", "", "<init>", "(Ljava/lang/String;I)V", "BID_ASK_PRICE_INFO_SHEET", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class OrderTypePriceInputBottomSheet {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderTypePriceInputBottomSheet[] $VALUES;
    public static final OrderTypePriceInputBottomSheet BID_ASK_PRICE_INFO_SHEET = new OrderTypePriceInputBottomSheet("BID_ASK_PRICE_INFO_SHEET", 0);

    private static final /* synthetic */ OrderTypePriceInputBottomSheet[] $values() {
        return new OrderTypePriceInputBottomSheet[]{BID_ASK_PRICE_INFO_SHEET};
    }

    public static EnumEntries<OrderTypePriceInputBottomSheet> getEntries() {
        return $ENTRIES;
    }

    private OrderTypePriceInputBottomSheet(String str, int i) {
    }

    static {
        OrderTypePriceInputBottomSheet[] orderTypePriceInputBottomSheetArr$values = $values();
        $VALUES = orderTypePriceInputBottomSheetArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderTypePriceInputBottomSheetArr$values);
    }

    public static OrderTypePriceInputBottomSheet valueOf(String str) {
        return (OrderTypePriceInputBottomSheet) Enum.valueOf(OrderTypePriceInputBottomSheet.class, str);
    }

    public static OrderTypePriceInputBottomSheet[] values() {
        return (OrderTypePriceInputBottomSheet[]) $VALUES.clone();
    }
}
