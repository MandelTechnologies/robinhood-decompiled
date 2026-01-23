package rosetta.order.p539v2;

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
/* compiled from: OrderSessionType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lrosetta/order/v2/OrderSessionType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_SESSION_TYPE_UNSPECIFIED", "ORDER_SESSION_TYPE_SELL_SHORT", "Companion", "rosetta.order.v2_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class OrderSessionType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderSessionType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OrderSessionType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OrderSessionType ORDER_SESSION_TYPE_SELL_SHORT;
    public static final OrderSessionType ORDER_SESSION_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ OrderSessionType[] $values() {
        return new OrderSessionType[]{ORDER_SESSION_TYPE_UNSPECIFIED, ORDER_SESSION_TYPE_SELL_SHORT};
    }

    @JvmStatic
    public static final OrderSessionType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OrderSessionType> getEntries() {
        return $ENTRIES;
    }

    private OrderSessionType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OrderSessionType orderSessionType = new OrderSessionType("ORDER_SESSION_TYPE_UNSPECIFIED", 0, 0);
        ORDER_SESSION_TYPE_UNSPECIFIED = orderSessionType;
        ORDER_SESSION_TYPE_SELL_SHORT = new OrderSessionType("ORDER_SESSION_TYPE_SELL_SHORT", 1, 1);
        OrderSessionType[] orderSessionTypeArr$values = $values();
        $VALUES = orderSessionTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderSessionTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderSessionType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OrderSessionType>(orCreateKotlinClass, syntax, orderSessionType) { // from class: rosetta.order.v2.OrderSessionType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OrderSessionType fromValue(int value) {
                return OrderSessionType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OrderSessionType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/v2/OrderSessionType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/v2/OrderSessionType;", "fromValue", "value", "", "rosetta.order.v2_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderSessionType fromValue(int value) {
            if (value == 0) {
                return OrderSessionType.ORDER_SESSION_TYPE_UNSPECIFIED;
            }
            if (value != 1) {
                return null;
            }
            return OrderSessionType.ORDER_SESSION_TYPE_SELL_SHORT;
        }
    }

    public static OrderSessionType valueOf(String str) {
        return (OrderSessionType) Enum.valueOf(OrderSessionType.class, str);
    }

    public static OrderSessionType[] values() {
        return (OrderSessionType[]) $VALUES.clone();
    }
}
