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
/* compiled from: OrderListContingencyType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrosetta/order/OrderListContingencyType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_LIST_CONTINGENCY_UNSPECIFIED", "OCO", "OTO", "CONVERSION_AT_TRADE", "Companion", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class OrderListContingencyType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderListContingencyType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OrderListContingencyType> ADAPTER;
    public static final OrderListContingencyType CONVERSION_AT_TRADE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OrderListContingencyType OCO;
    public static final OrderListContingencyType ORDER_LIST_CONTINGENCY_UNSPECIFIED;
    public static final OrderListContingencyType OTO;
    private final int value;

    private static final /* synthetic */ OrderListContingencyType[] $values() {
        return new OrderListContingencyType[]{ORDER_LIST_CONTINGENCY_UNSPECIFIED, OCO, OTO, CONVERSION_AT_TRADE};
    }

    @JvmStatic
    public static final OrderListContingencyType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OrderListContingencyType> getEntries() {
        return $ENTRIES;
    }

    private OrderListContingencyType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OrderListContingencyType orderListContingencyType = new OrderListContingencyType("ORDER_LIST_CONTINGENCY_UNSPECIFIED", 0, 0);
        ORDER_LIST_CONTINGENCY_UNSPECIFIED = orderListContingencyType;
        OCO = new OrderListContingencyType("OCO", 1, 1);
        OTO = new OrderListContingencyType("OTO", 2, 2);
        CONVERSION_AT_TRADE = new OrderListContingencyType("CONVERSION_AT_TRADE", 3, 3);
        OrderListContingencyType[] orderListContingencyTypeArr$values = $values();
        $VALUES = orderListContingencyTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderListContingencyTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderListContingencyType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OrderListContingencyType>(orCreateKotlinClass, syntax, orderListContingencyType) { // from class: rosetta.order.OrderListContingencyType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OrderListContingencyType fromValue(int value) {
                return OrderListContingencyType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OrderListContingencyType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/OrderListContingencyType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/OrderListContingencyType;", "fromValue", "value", "", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderListContingencyType fromValue(int value) {
            if (value == 0) {
                return OrderListContingencyType.ORDER_LIST_CONTINGENCY_UNSPECIFIED;
            }
            if (value == 1) {
                return OrderListContingencyType.OCO;
            }
            if (value == 2) {
                return OrderListContingencyType.OTO;
            }
            if (value != 3) {
                return null;
            }
            return OrderListContingencyType.CONVERSION_AT_TRADE;
        }
    }

    public static OrderListContingencyType valueOf(String str) {
        return (OrderListContingencyType) Enum.valueOf(OrderListContingencyType.class, str);
    }

    public static OrderListContingencyType[] values() {
        return (OrderListContingencyType[]) $VALUES.clone();
    }
}
