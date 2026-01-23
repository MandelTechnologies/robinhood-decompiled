package com.robinhood.shared.trading.tradeflow;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderForm.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "", "<init>", "(Ljava/lang/String;I)V", "EDITING", "REVIEWING", "SUBMITTING", "SUBMITTED", "CONFIRMATION", "previous", "getPrevious", "()Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "lib-trade-flow-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trading.tradeflow.OrderFormState, reason: use source file name */
/* loaded from: classes12.dex */
public final class OrderForm6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderForm6[] $VALUES;
    public static final OrderForm6 EDITING = new OrderForm6("EDITING", 0);
    public static final OrderForm6 REVIEWING = new OrderForm6("REVIEWING", 1);
    public static final OrderForm6 SUBMITTING = new OrderForm6("SUBMITTING", 2);
    public static final OrderForm6 SUBMITTED = new OrderForm6("SUBMITTED", 3);
    public static final OrderForm6 CONFIRMATION = new OrderForm6("CONFIRMATION", 4);

    /* compiled from: OrderForm.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trading.tradeflow.OrderFormState$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderForm6.values().length];
            try {
                iArr[OrderForm6.EDITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderForm6.REVIEWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderForm6.SUBMITTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderForm6.SUBMITTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderForm6.CONFIRMATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ OrderForm6[] $values() {
        return new OrderForm6[]{EDITING, REVIEWING, SUBMITTING, SUBMITTED, CONFIRMATION};
    }

    public static EnumEntries<OrderForm6> getEntries() {
        return $ENTRIES;
    }

    private OrderForm6(String str, int i) {
    }

    static {
        OrderForm6[] orderForm6Arr$values = $values();
        $VALUES = orderForm6Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderForm6Arr$values);
    }

    public final OrderForm6 getPrevious() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return EDITING;
        }
        if (i == 3) {
            return REVIEWING;
        }
        if (i == 4) {
            return SUBMITTING;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return SUBMITTED;
    }

    public static OrderForm6 valueOf(String str) {
        return (OrderForm6) Enum.valueOf(OrderForm6.class, str);
    }

    public static OrderForm6[] values() {
        return (OrderForm6[]) $VALUES.clone();
    }
}
