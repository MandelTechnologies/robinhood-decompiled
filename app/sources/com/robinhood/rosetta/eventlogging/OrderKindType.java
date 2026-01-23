package com.robinhood.rosetta.eventlogging;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderKindType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OrderKindType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "RECURRING", "lib-rosetta_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class OrderKindType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderKindType[] $VALUES;
    public static final OrderKindType RECURRING = new OrderKindType("RECURRING", 0, "recurring_investment");
    private final String value;

    private static final /* synthetic */ OrderKindType[] $values() {
        return new OrderKindType[]{RECURRING};
    }

    public static EnumEntries<OrderKindType> getEntries() {
        return $ENTRIES;
    }

    private OrderKindType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        OrderKindType[] orderKindTypeArr$values = $values();
        $VALUES = orderKindTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderKindTypeArr$values);
    }

    public static OrderKindType valueOf(String str) {
        return (OrderKindType) Enum.valueOf(OrderKindType.class, str);
    }

    public static OrderKindType[] values() {
        return (OrderKindType[]) $VALUES.clone();
    }
}
