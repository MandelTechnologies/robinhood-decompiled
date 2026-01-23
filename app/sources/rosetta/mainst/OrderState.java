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
/* compiled from: OrderState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, m3636d2 = {"Lrosetta/mainst/OrderState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_STATE_UNSPECIFIED", "QUEUED", "UNCONFIRMED", "CONFIRMED", "PARTIALLY_FILLED", "FILLED", "REJECTED", "CANCELLED", "FAILED", "PENDING_CANCELLED", "VOIDED", "PARTIALLY_FILLED_REST_CANCELLED", "INACTIVE", "NEW", "LOCATE_COMPLETED", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class OrderState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OrderState> ADAPTER;
    public static final OrderState CANCELLED;
    public static final OrderState CONFIRMED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OrderState FAILED;
    public static final OrderState FILLED;
    public static final OrderState INACTIVE;
    public static final OrderState LOCATE_COMPLETED;
    public static final OrderState NEW;
    public static final OrderState ORDER_STATE_UNSPECIFIED;
    public static final OrderState PARTIALLY_FILLED;
    public static final OrderState PARTIALLY_FILLED_REST_CANCELLED;
    public static final OrderState PENDING_CANCELLED;
    public static final OrderState QUEUED;
    public static final OrderState REJECTED;
    public static final OrderState UNCONFIRMED;
    public static final OrderState VOIDED;
    private final int value;

    private static final /* synthetic */ OrderState[] $values() {
        return new OrderState[]{ORDER_STATE_UNSPECIFIED, QUEUED, UNCONFIRMED, CONFIRMED, PARTIALLY_FILLED, FILLED, REJECTED, CANCELLED, FAILED, PENDING_CANCELLED, VOIDED, PARTIALLY_FILLED_REST_CANCELLED, INACTIVE, NEW, LOCATE_COMPLETED};
    }

    @JvmStatic
    public static final OrderState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OrderState> getEntries() {
        return $ENTRIES;
    }

    private OrderState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OrderState orderState = new OrderState("ORDER_STATE_UNSPECIFIED", 0, 0);
        ORDER_STATE_UNSPECIFIED = orderState;
        QUEUED = new OrderState("QUEUED", 1, 1);
        UNCONFIRMED = new OrderState("UNCONFIRMED", 2, 2);
        CONFIRMED = new OrderState("CONFIRMED", 3, 3);
        PARTIALLY_FILLED = new OrderState("PARTIALLY_FILLED", 4, 4);
        FILLED = new OrderState("FILLED", 5, 5);
        REJECTED = new OrderState("REJECTED", 6, 6);
        CANCELLED = new OrderState("CANCELLED", 7, 7);
        FAILED = new OrderState("FAILED", 8, 8);
        PENDING_CANCELLED = new OrderState("PENDING_CANCELLED", 9, 9);
        VOIDED = new OrderState("VOIDED", 10, 10);
        PARTIALLY_FILLED_REST_CANCELLED = new OrderState("PARTIALLY_FILLED_REST_CANCELLED", 11, 11);
        INACTIVE = new OrderState("INACTIVE", 12, 12);
        NEW = new OrderState("NEW", 13, 13);
        LOCATE_COMPLETED = new OrderState("LOCATE_COMPLETED", 14, 14);
        OrderState[] orderStateArr$values = $values();
        $VALUES = orderStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OrderState>(orCreateKotlinClass, syntax, orderState) { // from class: rosetta.mainst.OrderState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OrderState fromValue(int value) {
                return OrderState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OrderState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/mainst/OrderState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/mainst/OrderState;", "fromValue", "value", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderState fromValue(int value) {
            switch (value) {
                case 0:
                    return OrderState.ORDER_STATE_UNSPECIFIED;
                case 1:
                    return OrderState.QUEUED;
                case 2:
                    return OrderState.UNCONFIRMED;
                case 3:
                    return OrderState.CONFIRMED;
                case 4:
                    return OrderState.PARTIALLY_FILLED;
                case 5:
                    return OrderState.FILLED;
                case 6:
                    return OrderState.REJECTED;
                case 7:
                    return OrderState.CANCELLED;
                case 8:
                    return OrderState.FAILED;
                case 9:
                    return OrderState.PENDING_CANCELLED;
                case 10:
                    return OrderState.VOIDED;
                case 11:
                    return OrderState.PARTIALLY_FILLED_REST_CANCELLED;
                case 12:
                    return OrderState.INACTIVE;
                case 13:
                    return OrderState.NEW;
                case 14:
                    return OrderState.LOCATE_COMPLETED;
                default:
                    return null;
            }
        }
    }

    public static OrderState valueOf(String str) {
        return (OrderState) Enum.valueOf(OrderState.class, str);
    }

    public static OrderState[] values() {
        return (OrderState[]) $VALUES.clone();
    }
}
