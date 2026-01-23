package crypto_perpetuals.order.p438v1;

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
/* compiled from: OrderStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_STATUS_UNSPECIFIED", "NEW", "PENDING", "PARTIALLY_FILLED", "FILLED", "CANCELLED", "REJECTED", "EXPIRED", "FAILED", "UNCONFIRMED", "CONFIRMED", "PENDING_CANCEL", "Companion", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderStatus[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OrderStatus> ADAPTER;
    public static final OrderStatus CANCELLED;
    public static final OrderStatus CONFIRMED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OrderStatus EXPIRED;
    public static final OrderStatus FAILED;
    public static final OrderStatus FILLED;
    public static final OrderStatus NEW;
    public static final OrderStatus ORDER_STATUS_UNSPECIFIED;
    public static final OrderStatus PARTIALLY_FILLED;
    public static final OrderStatus PENDING;
    public static final OrderStatus PENDING_CANCEL;
    public static final OrderStatus REJECTED;
    public static final OrderStatus UNCONFIRMED;
    private final int value;

    private static final /* synthetic */ OrderStatus[] $values() {
        return new OrderStatus[]{ORDER_STATUS_UNSPECIFIED, NEW, PENDING, PARTIALLY_FILLED, FILLED, CANCELLED, REJECTED, EXPIRED, FAILED, UNCONFIRMED, CONFIRMED, PENDING_CANCEL};
    }

    @JvmStatic
    public static final OrderStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OrderStatus> getEntries() {
        return $ENTRIES;
    }

    private OrderStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OrderStatus orderStatus = new OrderStatus("ORDER_STATUS_UNSPECIFIED", 0, 0);
        ORDER_STATUS_UNSPECIFIED = orderStatus;
        NEW = new OrderStatus("NEW", 1, 1);
        PENDING = new OrderStatus("PENDING", 2, 2);
        PARTIALLY_FILLED = new OrderStatus("PARTIALLY_FILLED", 3, 3);
        FILLED = new OrderStatus("FILLED", 4, 4);
        CANCELLED = new OrderStatus("CANCELLED", 5, 5);
        REJECTED = new OrderStatus("REJECTED", 6, 6);
        EXPIRED = new OrderStatus("EXPIRED", 7, 7);
        FAILED = new OrderStatus("FAILED", 8, 8);
        UNCONFIRMED = new OrderStatus("UNCONFIRMED", 9, 9);
        CONFIRMED = new OrderStatus("CONFIRMED", 10, 10);
        PENDING_CANCEL = new OrderStatus("PENDING_CANCEL", 11, 11);
        OrderStatus[] orderStatusArr$values = $values();
        $VALUES = orderStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OrderStatus>(orCreateKotlinClass, syntax, orderStatus) { // from class: crypto_perpetuals.order.v1.OrderStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OrderStatus fromValue(int value) {
                return OrderStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OrderStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto_perpetuals/order/v1/OrderStatus;", "fromValue", "value", "", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderStatus fromValue(int value) {
            switch (value) {
                case 0:
                    return OrderStatus.ORDER_STATUS_UNSPECIFIED;
                case 1:
                    return OrderStatus.NEW;
                case 2:
                    return OrderStatus.PENDING;
                case 3:
                    return OrderStatus.PARTIALLY_FILLED;
                case 4:
                    return OrderStatus.FILLED;
                case 5:
                    return OrderStatus.CANCELLED;
                case 6:
                    return OrderStatus.REJECTED;
                case 7:
                    return OrderStatus.EXPIRED;
                case 8:
                    return OrderStatus.FAILED;
                case 9:
                    return OrderStatus.UNCONFIRMED;
                case 10:
                    return OrderStatus.CONFIRMED;
                case 11:
                    return OrderStatus.PENDING_CANCEL;
                default:
                    return null;
            }
        }
    }

    public static OrderStatus valueOf(String str) {
        return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
    }

    public static OrderStatus[] values() {
        return (OrderStatus[]) $VALUES.clone();
    }
}
