package rosetta.order;

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
/* compiled from: OrderType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrosetta/order/OrderType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_TYPE_UNSPECIFIED", "LIMIT", "MARKET", "STOP_LOSS", "STOP_LIMIT", "Companion", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class OrderType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OrderType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OrderType LIMIT;
    public static final OrderType MARKET;
    public static final OrderType ORDER_TYPE_UNSPECIFIED;
    public static final OrderType STOP_LIMIT;
    public static final OrderType STOP_LOSS;
    private final int value;

    private static final /* synthetic */ OrderType[] $values() {
        return new OrderType[]{ORDER_TYPE_UNSPECIFIED, LIMIT, MARKET, STOP_LOSS, STOP_LIMIT};
    }

    @JvmStatic
    public static final OrderType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OrderType> getEntries() {
        return $ENTRIES;
    }

    private OrderType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OrderType orderType = new OrderType("ORDER_TYPE_UNSPECIFIED", 0, 0);
        ORDER_TYPE_UNSPECIFIED = orderType;
        LIMIT = new OrderType("LIMIT", 1, 1);
        MARKET = new OrderType("MARKET", 2, 2);
        STOP_LOSS = new OrderType("STOP_LOSS", 3, 3);
        STOP_LIMIT = new OrderType("STOP_LIMIT", 4, 4);
        OrderType[] orderTypeArr$values = $values();
        $VALUES = orderTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OrderType>(orCreateKotlinClass, syntax, orderType) { // from class: rosetta.order.OrderType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OrderType fromValue(int value) {
                return OrderType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OrderType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/OrderType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/OrderType;", "fromValue", "value", "", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderType fromValue(int value) {
            if (value == 0) {
                return OrderType.ORDER_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return OrderType.LIMIT;
            }
            if (value == 2) {
                return OrderType.MARKET;
            }
            if (value == 3) {
                return OrderType.STOP_LOSS;
            }
            if (value != 4) {
                return null;
            }
            return OrderType.STOP_LIMIT;
        }
    }

    public static OrderType valueOf(String str) {
        return (OrderType) Enum.valueOf(OrderType.class, str);
    }

    public static OrderType[] values() {
        return (OrderType[]) $VALUES.clone();
    }
}
