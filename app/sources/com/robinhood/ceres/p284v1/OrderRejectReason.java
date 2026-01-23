package com.robinhood.ceres.p284v1;

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
/* compiled from: OrderRejectReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderRejectReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE", "ORDER_REJECT_REASON_INSUFFICIENT_BUYING_POWER", "ORDER_REJECT_REASON_MARGIN_MIN_EQUITY", "ORDER_REJECT_REASON_UNKNOWN_CHECK_FUTURES_ORDER_EXCEPTION", "ORDER_REJECT_REASON_INSTANT_ABUSE", "ORDER_REJECT_REASON_INVALID_ARGUMENT", "ORDER_REJECT_REASON_RESOURCE_EXHAUSTED", "ORDER_REJECT_REASON_UNKNOWN_PLACE_ORDER_EXCEPTION", "ORDER_REJECT_REASON_INVALID_PRICE", "ORDER_REJECT_REASON_RATE_LIMITED", "ORDER_REJECT_REASON_NO_ROUTABLE_VENUE", "ORDER_REJECT_REASON_UNSPECIFIED", "ORDER_REJECT_REASON_VENUE_ERROR", "ORDER_REJECT_REASON_INVALID_TIME_WINDOW", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class OrderRejectReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderRejectReason[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OrderRejectReason> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OrderRejectReason ORDER_REJECT_REASON_INSTANT_ABUSE;
    public static final OrderRejectReason ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE;
    public static final OrderRejectReason ORDER_REJECT_REASON_INSUFFICIENT_BUYING_POWER;
    public static final OrderRejectReason ORDER_REJECT_REASON_INVALID_ARGUMENT;
    public static final OrderRejectReason ORDER_REJECT_REASON_INVALID_PRICE;
    public static final OrderRejectReason ORDER_REJECT_REASON_INVALID_TIME_WINDOW;
    public static final OrderRejectReason ORDER_REJECT_REASON_MARGIN_MIN_EQUITY;
    public static final OrderRejectReason ORDER_REJECT_REASON_NO_ROUTABLE_VENUE;
    public static final OrderRejectReason ORDER_REJECT_REASON_RATE_LIMITED;
    public static final OrderRejectReason ORDER_REJECT_REASON_RESOURCE_EXHAUSTED;
    public static final OrderRejectReason ORDER_REJECT_REASON_UNKNOWN_CHECK_FUTURES_ORDER_EXCEPTION;
    public static final OrderRejectReason ORDER_REJECT_REASON_UNKNOWN_PLACE_ORDER_EXCEPTION;
    public static final OrderRejectReason ORDER_REJECT_REASON_UNSPECIFIED;
    public static final OrderRejectReason ORDER_REJECT_REASON_VENUE_ERROR;
    private final int value;

    private static final /* synthetic */ OrderRejectReason[] $values() {
        return new OrderRejectReason[]{ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE, ORDER_REJECT_REASON_INSUFFICIENT_BUYING_POWER, ORDER_REJECT_REASON_MARGIN_MIN_EQUITY, ORDER_REJECT_REASON_UNKNOWN_CHECK_FUTURES_ORDER_EXCEPTION, ORDER_REJECT_REASON_INSTANT_ABUSE, ORDER_REJECT_REASON_INVALID_ARGUMENT, ORDER_REJECT_REASON_RESOURCE_EXHAUSTED, ORDER_REJECT_REASON_UNKNOWN_PLACE_ORDER_EXCEPTION, ORDER_REJECT_REASON_INVALID_PRICE, ORDER_REJECT_REASON_RATE_LIMITED, ORDER_REJECT_REASON_NO_ROUTABLE_VENUE, ORDER_REJECT_REASON_UNSPECIFIED, ORDER_REJECT_REASON_VENUE_ERROR, ORDER_REJECT_REASON_INVALID_TIME_WINDOW};
    }

    @JvmStatic
    public static final OrderRejectReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OrderRejectReason> getEntries() {
        return $ENTRIES;
    }

    private OrderRejectReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OrderRejectReason orderRejectReason = new OrderRejectReason("ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE", 0, 0);
        ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE = orderRejectReason;
        ORDER_REJECT_REASON_INSUFFICIENT_BUYING_POWER = new OrderRejectReason("ORDER_REJECT_REASON_INSUFFICIENT_BUYING_POWER", 1, 1);
        ORDER_REJECT_REASON_MARGIN_MIN_EQUITY = new OrderRejectReason("ORDER_REJECT_REASON_MARGIN_MIN_EQUITY", 2, 2);
        ORDER_REJECT_REASON_UNKNOWN_CHECK_FUTURES_ORDER_EXCEPTION = new OrderRejectReason("ORDER_REJECT_REASON_UNKNOWN_CHECK_FUTURES_ORDER_EXCEPTION", 3, 3);
        ORDER_REJECT_REASON_INSTANT_ABUSE = new OrderRejectReason("ORDER_REJECT_REASON_INSTANT_ABUSE", 4, 4);
        ORDER_REJECT_REASON_INVALID_ARGUMENT = new OrderRejectReason("ORDER_REJECT_REASON_INVALID_ARGUMENT", 5, 5);
        ORDER_REJECT_REASON_RESOURCE_EXHAUSTED = new OrderRejectReason("ORDER_REJECT_REASON_RESOURCE_EXHAUSTED", 6, 6);
        ORDER_REJECT_REASON_UNKNOWN_PLACE_ORDER_EXCEPTION = new OrderRejectReason("ORDER_REJECT_REASON_UNKNOWN_PLACE_ORDER_EXCEPTION", 7, 7);
        ORDER_REJECT_REASON_INVALID_PRICE = new OrderRejectReason("ORDER_REJECT_REASON_INVALID_PRICE", 8, 8);
        ORDER_REJECT_REASON_RATE_LIMITED = new OrderRejectReason("ORDER_REJECT_REASON_RATE_LIMITED", 9, 9);
        ORDER_REJECT_REASON_NO_ROUTABLE_VENUE = new OrderRejectReason("ORDER_REJECT_REASON_NO_ROUTABLE_VENUE", 10, 10);
        ORDER_REJECT_REASON_UNSPECIFIED = new OrderRejectReason("ORDER_REJECT_REASON_UNSPECIFIED", 11, 11);
        ORDER_REJECT_REASON_VENUE_ERROR = new OrderRejectReason("ORDER_REJECT_REASON_VENUE_ERROR", 12, 12);
        ORDER_REJECT_REASON_INVALID_TIME_WINDOW = new OrderRejectReason("ORDER_REJECT_REASON_INVALID_TIME_WINDOW", 13, 13);
        OrderRejectReason[] orderRejectReasonArr$values = $values();
        $VALUES = orderRejectReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderRejectReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderRejectReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OrderRejectReason>(orCreateKotlinClass, syntax, orderRejectReason) { // from class: com.robinhood.ceres.v1.OrderRejectReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OrderRejectReason fromValue(int value) {
                return OrderRejectReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OrderRejectReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderRejectReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/OrderRejectReason;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderRejectReason fromValue(int value) {
            switch (value) {
                case 0:
                    return OrderRejectReason.ORDER_REJECT_REASON_INSUFFICIENT_ACCOUNT_VALUE;
                case 1:
                    return OrderRejectReason.ORDER_REJECT_REASON_INSUFFICIENT_BUYING_POWER;
                case 2:
                    return OrderRejectReason.ORDER_REJECT_REASON_MARGIN_MIN_EQUITY;
                case 3:
                    return OrderRejectReason.ORDER_REJECT_REASON_UNKNOWN_CHECK_FUTURES_ORDER_EXCEPTION;
                case 4:
                    return OrderRejectReason.ORDER_REJECT_REASON_INSTANT_ABUSE;
                case 5:
                    return OrderRejectReason.ORDER_REJECT_REASON_INVALID_ARGUMENT;
                case 6:
                    return OrderRejectReason.ORDER_REJECT_REASON_RESOURCE_EXHAUSTED;
                case 7:
                    return OrderRejectReason.ORDER_REJECT_REASON_UNKNOWN_PLACE_ORDER_EXCEPTION;
                case 8:
                    return OrderRejectReason.ORDER_REJECT_REASON_INVALID_PRICE;
                case 9:
                    return OrderRejectReason.ORDER_REJECT_REASON_RATE_LIMITED;
                case 10:
                    return OrderRejectReason.ORDER_REJECT_REASON_NO_ROUTABLE_VENUE;
                case 11:
                    return OrderRejectReason.ORDER_REJECT_REASON_UNSPECIFIED;
                case 12:
                    return OrderRejectReason.ORDER_REJECT_REASON_VENUE_ERROR;
                case 13:
                    return OrderRejectReason.ORDER_REJECT_REASON_INVALID_TIME_WINDOW;
                default:
                    return null;
            }
        }
    }

    public static OrderRejectReason valueOf(String str) {
        return (OrderRejectReason) Enum.valueOf(OrderRejectReason.class, str);
    }

    public static OrderRejectReason[] values() {
        return (OrderRejectReason[]) $VALUES.clone();
    }
}
