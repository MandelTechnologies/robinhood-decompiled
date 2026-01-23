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
/* compiled from: OrderInputFormat.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lrosetta/order/OrderInputFormat;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_INPUT_FORMAT_UNSPECIFIED", "ORDER_INPUT_FORMAT_EMPTY", "ORDER_INPUT_FORMAT_DOLLARS", "ORDER_INPUT_FORMAT_SHARES", "ORDER_INPUT_FORMAT_CHARTS", "ORDER_INPUT_FORMAT_LADDER", "Companion", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class OrderInputFormat implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderInputFormat[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OrderInputFormat> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OrderInputFormat ORDER_INPUT_FORMAT_CHARTS;
    public static final OrderInputFormat ORDER_INPUT_FORMAT_DOLLARS;
    public static final OrderInputFormat ORDER_INPUT_FORMAT_EMPTY;
    public static final OrderInputFormat ORDER_INPUT_FORMAT_LADDER;
    public static final OrderInputFormat ORDER_INPUT_FORMAT_SHARES;
    public static final OrderInputFormat ORDER_INPUT_FORMAT_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ OrderInputFormat[] $values() {
        return new OrderInputFormat[]{ORDER_INPUT_FORMAT_UNSPECIFIED, ORDER_INPUT_FORMAT_EMPTY, ORDER_INPUT_FORMAT_DOLLARS, ORDER_INPUT_FORMAT_SHARES, ORDER_INPUT_FORMAT_CHARTS, ORDER_INPUT_FORMAT_LADDER};
    }

    @JvmStatic
    public static final OrderInputFormat fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OrderInputFormat> getEntries() {
        return $ENTRIES;
    }

    private OrderInputFormat(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OrderInputFormat orderInputFormat = new OrderInputFormat("ORDER_INPUT_FORMAT_UNSPECIFIED", 0, 0);
        ORDER_INPUT_FORMAT_UNSPECIFIED = orderInputFormat;
        ORDER_INPUT_FORMAT_EMPTY = new OrderInputFormat("ORDER_INPUT_FORMAT_EMPTY", 1, 0);
        ORDER_INPUT_FORMAT_DOLLARS = new OrderInputFormat("ORDER_INPUT_FORMAT_DOLLARS", 2, 1);
        ORDER_INPUT_FORMAT_SHARES = new OrderInputFormat("ORDER_INPUT_FORMAT_SHARES", 3, 2);
        ORDER_INPUT_FORMAT_CHARTS = new OrderInputFormat("ORDER_INPUT_FORMAT_CHARTS", 4, 3);
        ORDER_INPUT_FORMAT_LADDER = new OrderInputFormat("ORDER_INPUT_FORMAT_LADDER", 5, 4);
        OrderInputFormat[] orderInputFormatArr$values = $values();
        $VALUES = orderInputFormatArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderInputFormatArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderInputFormat.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OrderInputFormat>(orCreateKotlinClass, syntax, orderInputFormat) { // from class: rosetta.order.OrderInputFormat$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OrderInputFormat fromValue(int value) {
                return OrderInputFormat.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OrderInputFormat.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/OrderInputFormat$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/OrderInputFormat;", "fromValue", "value", "", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderInputFormat fromValue(int value) {
            if (value == 0) {
                return OrderInputFormat.ORDER_INPUT_FORMAT_UNSPECIFIED;
            }
            if (value == 1) {
                return OrderInputFormat.ORDER_INPUT_FORMAT_DOLLARS;
            }
            if (value == 2) {
                return OrderInputFormat.ORDER_INPUT_FORMAT_SHARES;
            }
            if (value == 3) {
                return OrderInputFormat.ORDER_INPUT_FORMAT_CHARTS;
            }
            if (value != 4) {
                return null;
            }
            return OrderInputFormat.ORDER_INPUT_FORMAT_LADDER;
        }
    }

    public static OrderInputFormat valueOf(String str) {
        return (OrderInputFormat) Enum.valueOf(OrderInputFormat.class, str);
    }

    public static OrderInputFormat[] values() {
        return (OrderInputFormat[]) $VALUES.clone();
    }
}
