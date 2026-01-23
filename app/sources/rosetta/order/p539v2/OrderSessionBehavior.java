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
/* compiled from: OrderSessionBehavior.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrosetta/order/v2/OrderSessionBehavior;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_SESSION_BEHAVIOR_UNSPECIFIED", "ORDER_SESSION_BEHAVIOR_QUEUED", "ORDER_SESSION_BEHAVIOR_ACTIVE", "ORDER_SESSION_BEHAVIOR_DISALLOWED", "Companion", "rosetta.order.v2_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class OrderSessionBehavior implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderSessionBehavior[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OrderSessionBehavior> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OrderSessionBehavior ORDER_SESSION_BEHAVIOR_ACTIVE;
    public static final OrderSessionBehavior ORDER_SESSION_BEHAVIOR_DISALLOWED;
    public static final OrderSessionBehavior ORDER_SESSION_BEHAVIOR_QUEUED;
    public static final OrderSessionBehavior ORDER_SESSION_BEHAVIOR_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ OrderSessionBehavior[] $values() {
        return new OrderSessionBehavior[]{ORDER_SESSION_BEHAVIOR_UNSPECIFIED, ORDER_SESSION_BEHAVIOR_QUEUED, ORDER_SESSION_BEHAVIOR_ACTIVE, ORDER_SESSION_BEHAVIOR_DISALLOWED};
    }

    @JvmStatic
    public static final OrderSessionBehavior fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OrderSessionBehavior> getEntries() {
        return $ENTRIES;
    }

    private OrderSessionBehavior(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OrderSessionBehavior orderSessionBehavior = new OrderSessionBehavior("ORDER_SESSION_BEHAVIOR_UNSPECIFIED", 0, 0);
        ORDER_SESSION_BEHAVIOR_UNSPECIFIED = orderSessionBehavior;
        ORDER_SESSION_BEHAVIOR_QUEUED = new OrderSessionBehavior("ORDER_SESSION_BEHAVIOR_QUEUED", 1, 1);
        ORDER_SESSION_BEHAVIOR_ACTIVE = new OrderSessionBehavior("ORDER_SESSION_BEHAVIOR_ACTIVE", 2, 2);
        ORDER_SESSION_BEHAVIOR_DISALLOWED = new OrderSessionBehavior("ORDER_SESSION_BEHAVIOR_DISALLOWED", 3, 3);
        OrderSessionBehavior[] orderSessionBehaviorArr$values = $values();
        $VALUES = orderSessionBehaviorArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderSessionBehaviorArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderSessionBehavior.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OrderSessionBehavior>(orCreateKotlinClass, syntax, orderSessionBehavior) { // from class: rosetta.order.v2.OrderSessionBehavior$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OrderSessionBehavior fromValue(int value) {
                return OrderSessionBehavior.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OrderSessionBehavior.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/v2/OrderSessionBehavior$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/v2/OrderSessionBehavior;", "fromValue", "value", "", "rosetta.order.v2_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderSessionBehavior fromValue(int value) {
            if (value == 0) {
                return OrderSessionBehavior.ORDER_SESSION_BEHAVIOR_UNSPECIFIED;
            }
            if (value == 1) {
                return OrderSessionBehavior.ORDER_SESSION_BEHAVIOR_QUEUED;
            }
            if (value == 2) {
                return OrderSessionBehavior.ORDER_SESSION_BEHAVIOR_ACTIVE;
            }
            if (value != 3) {
                return null;
            }
            return OrderSessionBehavior.ORDER_SESSION_BEHAVIOR_DISALLOWED;
        }
    }

    public static OrderSessionBehavior valueOf(String str) {
        return (OrderSessionBehavior) Enum.valueOf(OrderSessionBehavior.class, str);
    }

    public static OrderSessionBehavior[] values() {
        return (OrderSessionBehavior[]) $VALUES.clone();
    }
}
