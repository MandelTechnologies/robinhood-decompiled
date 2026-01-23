package rosetta.mainst;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderTrigger.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lrosetta/mainst/OrderTrigger;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_TRIGGER_UNSPECIFIED", "ORDER_TRIGGER_EMPTY", "IMMEDIATE", "STOP", "ON_CLOSE", "STOP_TAKE_PROFIT", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class OrderTrigger implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderTrigger[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OrderTrigger> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OrderTrigger IMMEDIATE;
    public static final OrderTrigger ON_CLOSE;
    public static final OrderTrigger ORDER_TRIGGER_EMPTY;
    public static final OrderTrigger ORDER_TRIGGER_UNSPECIFIED;
    public static final OrderTrigger STOP;
    public static final OrderTrigger STOP_TAKE_PROFIT;
    private final int value;

    private static final /* synthetic */ OrderTrigger[] $values() {
        return new OrderTrigger[]{ORDER_TRIGGER_UNSPECIFIED, ORDER_TRIGGER_EMPTY, IMMEDIATE, STOP, ON_CLOSE, STOP_TAKE_PROFIT};
    }

    @JvmStatic
    public static final OrderTrigger fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OrderTrigger> getEntries() {
        return $ENTRIES;
    }

    private OrderTrigger(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OrderTrigger orderTrigger = new OrderTrigger("ORDER_TRIGGER_UNSPECIFIED", 0, 0);
        ORDER_TRIGGER_UNSPECIFIED = orderTrigger;
        ORDER_TRIGGER_EMPTY = new OrderTrigger("ORDER_TRIGGER_EMPTY", 1, 0);
        IMMEDIATE = new OrderTrigger("IMMEDIATE", 2, 1);
        STOP = new OrderTrigger("STOP", 3, 2);
        ON_CLOSE = new OrderTrigger("ON_CLOSE", 4, 3);
        STOP_TAKE_PROFIT = new OrderTrigger("STOP_TAKE_PROFIT", 5, 4);
        OrderTrigger[] orderTriggerArr$values = $values();
        $VALUES = orderTriggerArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderTriggerArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderTrigger.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OrderTrigger>(orCreateKotlinClass, syntax, orderTrigger) { // from class: rosetta.mainst.OrderTrigger$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OrderTrigger fromValue(int value) {
                return OrderTrigger.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OrderTrigger.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/mainst/OrderTrigger$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/mainst/OrderTrigger;", "fromValue", "value", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderTrigger fromValue(int value) {
            if (value == 0) {
                return OrderTrigger.ORDER_TRIGGER_UNSPECIFIED;
            }
            if (value == 1) {
                return OrderTrigger.IMMEDIATE;
            }
            if (value == 2) {
                return OrderTrigger.STOP;
            }
            if (value == 3) {
                return OrderTrigger.ON_CLOSE;
            }
            if (value != 4) {
                return null;
            }
            return OrderTrigger.STOP_TAKE_PROFIT;
        }
    }

    public static OrderTrigger valueOf(String str) {
        return (OrderTrigger) Enum.valueOf(OrderTrigger.class, str);
    }

    public static OrderTrigger[] values() {
        return (OrderTrigger[]) $VALUES.clone();
    }
}
