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
/* compiled from: OrderEntryPoint.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001b"}, m3636d2 = {"Lrosetta/order/OrderEntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_ENTRY_POINT_UNSPECIFIED", "ORDER_ENTRY_POINT_EMPTY", "ORDER_ENTRY_POINT_MOBILE_CHARTS", "ORDER_ENTRY_POINT_STOCK_DETAIL_PAGE", "ORDER_ENTRY_POINT_SWIPE_TO_TRADE", "ORDER_ENTRY_POINT_HISTORY_DETAIL", "ORDER_ENTRY_POINT_TRADING_TRENDS", "ORDER_ENTRY_POINT_RESEARCH_REPORT", "ORDER_ENTRY_POINT_L2_MARKET_DATA", "ORDER_ENTRY_POINT_LADDER_FLATTEN", "ORDER_ENTRY_POINT_LADDER", "ORDER_ENTRY_POINT_CHARTS", "ORDER_ENTRY_POINT_CHARTS_FLATTEN", "ORDER_ENTRY_POINT_CHARTS_FLATTEN_HOTKEY", "ORDER_ENTRY_POINT_CHARTS_HOTKEY", "ORDER_ENTRY_POINT_LADDER_FLATTEN_HOTKEY", "ORDER_ENTRY_POINT_LADDER_HOTKEY", "Companion", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class OrderEntryPoint implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderEntryPoint[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OrderEntryPoint> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_CHARTS;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_CHARTS_FLATTEN;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_CHARTS_FLATTEN_HOTKEY;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_CHARTS_HOTKEY;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_EMPTY;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_HISTORY_DETAIL;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_L2_MARKET_DATA;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_LADDER;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_LADDER_FLATTEN;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_LADDER_FLATTEN_HOTKEY;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_LADDER_HOTKEY;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_MOBILE_CHARTS;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_RESEARCH_REPORT;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_STOCK_DETAIL_PAGE;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_SWIPE_TO_TRADE;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_TRADING_TRENDS;
    public static final OrderEntryPoint ORDER_ENTRY_POINT_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ OrderEntryPoint[] $values() {
        return new OrderEntryPoint[]{ORDER_ENTRY_POINT_UNSPECIFIED, ORDER_ENTRY_POINT_EMPTY, ORDER_ENTRY_POINT_MOBILE_CHARTS, ORDER_ENTRY_POINT_STOCK_DETAIL_PAGE, ORDER_ENTRY_POINT_SWIPE_TO_TRADE, ORDER_ENTRY_POINT_HISTORY_DETAIL, ORDER_ENTRY_POINT_TRADING_TRENDS, ORDER_ENTRY_POINT_RESEARCH_REPORT, ORDER_ENTRY_POINT_L2_MARKET_DATA, ORDER_ENTRY_POINT_LADDER_FLATTEN, ORDER_ENTRY_POINT_LADDER, ORDER_ENTRY_POINT_CHARTS, ORDER_ENTRY_POINT_CHARTS_FLATTEN, ORDER_ENTRY_POINT_CHARTS_FLATTEN_HOTKEY, ORDER_ENTRY_POINT_CHARTS_HOTKEY, ORDER_ENTRY_POINT_LADDER_FLATTEN_HOTKEY, ORDER_ENTRY_POINT_LADDER_HOTKEY};
    }

    @JvmStatic
    public static final OrderEntryPoint fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OrderEntryPoint> getEntries() {
        return $ENTRIES;
    }

    private OrderEntryPoint(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OrderEntryPoint orderEntryPoint = new OrderEntryPoint("ORDER_ENTRY_POINT_UNSPECIFIED", 0, 0);
        ORDER_ENTRY_POINT_UNSPECIFIED = orderEntryPoint;
        ORDER_ENTRY_POINT_EMPTY = new OrderEntryPoint("ORDER_ENTRY_POINT_EMPTY", 1, 0);
        ORDER_ENTRY_POINT_MOBILE_CHARTS = new OrderEntryPoint("ORDER_ENTRY_POINT_MOBILE_CHARTS", 2, 1);
        ORDER_ENTRY_POINT_STOCK_DETAIL_PAGE = new OrderEntryPoint("ORDER_ENTRY_POINT_STOCK_DETAIL_PAGE", 3, 2);
        ORDER_ENTRY_POINT_SWIPE_TO_TRADE = new OrderEntryPoint("ORDER_ENTRY_POINT_SWIPE_TO_TRADE", 4, 3);
        ORDER_ENTRY_POINT_HISTORY_DETAIL = new OrderEntryPoint("ORDER_ENTRY_POINT_HISTORY_DETAIL", 5, 4);
        ORDER_ENTRY_POINT_TRADING_TRENDS = new OrderEntryPoint("ORDER_ENTRY_POINT_TRADING_TRENDS", 6, 5);
        ORDER_ENTRY_POINT_RESEARCH_REPORT = new OrderEntryPoint("ORDER_ENTRY_POINT_RESEARCH_REPORT", 7, 6);
        ORDER_ENTRY_POINT_L2_MARKET_DATA = new OrderEntryPoint("ORDER_ENTRY_POINT_L2_MARKET_DATA", 8, 7);
        ORDER_ENTRY_POINT_LADDER_FLATTEN = new OrderEntryPoint("ORDER_ENTRY_POINT_LADDER_FLATTEN", 9, 8);
        ORDER_ENTRY_POINT_LADDER = new OrderEntryPoint("ORDER_ENTRY_POINT_LADDER", 10, 9);
        ORDER_ENTRY_POINT_CHARTS = new OrderEntryPoint("ORDER_ENTRY_POINT_CHARTS", 11, 10);
        ORDER_ENTRY_POINT_CHARTS_FLATTEN = new OrderEntryPoint("ORDER_ENTRY_POINT_CHARTS_FLATTEN", 12, 11);
        ORDER_ENTRY_POINT_CHARTS_FLATTEN_HOTKEY = new OrderEntryPoint("ORDER_ENTRY_POINT_CHARTS_FLATTEN_HOTKEY", 13, 12);
        ORDER_ENTRY_POINT_CHARTS_HOTKEY = new OrderEntryPoint("ORDER_ENTRY_POINT_CHARTS_HOTKEY", 14, 13);
        ORDER_ENTRY_POINT_LADDER_FLATTEN_HOTKEY = new OrderEntryPoint("ORDER_ENTRY_POINT_LADDER_FLATTEN_HOTKEY", 15, 14);
        ORDER_ENTRY_POINT_LADDER_HOTKEY = new OrderEntryPoint("ORDER_ENTRY_POINT_LADDER_HOTKEY", 16, 15);
        OrderEntryPoint[] orderEntryPointArr$values = $values();
        $VALUES = orderEntryPointArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderEntryPointArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderEntryPoint.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OrderEntryPoint>(orCreateKotlinClass, syntax, orderEntryPoint) { // from class: rosetta.order.OrderEntryPoint$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OrderEntryPoint fromValue(int value) {
                return OrderEntryPoint.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OrderEntryPoint.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/OrderEntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/OrderEntryPoint;", "fromValue", "value", "", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderEntryPoint fromValue(int value) {
            switch (value) {
                case 0:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_UNSPECIFIED;
                case 1:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_MOBILE_CHARTS;
                case 2:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_STOCK_DETAIL_PAGE;
                case 3:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_SWIPE_TO_TRADE;
                case 4:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_HISTORY_DETAIL;
                case 5:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_TRADING_TRENDS;
                case 6:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_RESEARCH_REPORT;
                case 7:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_L2_MARKET_DATA;
                case 8:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_LADDER_FLATTEN;
                case 9:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_LADDER;
                case 10:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_CHARTS;
                case 11:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_CHARTS_FLATTEN;
                case 12:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_CHARTS_FLATTEN_HOTKEY;
                case 13:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_CHARTS_HOTKEY;
                case 14:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_LADDER_FLATTEN_HOTKEY;
                case 15:
                    return OrderEntryPoint.ORDER_ENTRY_POINT_LADDER_HOTKEY;
                default:
                    return null;
            }
        }
    }

    public static OrderEntryPoint valueOf(String str) {
        return (OrderEntryPoint) Enum.valueOf(OrderEntryPoint.class, str);
    }

    public static OrderEntryPoint[] values() {
        return (OrderEntryPoint[]) $VALUES.clone();
    }
}
