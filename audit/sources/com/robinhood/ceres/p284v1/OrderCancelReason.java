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
/* compiled from: OrderCancelReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderCancelReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_CANCEL_REASON_UNSPECIFIED", "ORDER_CANCEL_REASON_BROKER_ASSISTED", "ORDER_CANCEL_REASON_GENERAL_INTRADAY_RISK", "ORDER_CANCEL_REASON_EXPIRATION_PHYSICAL_SETTLEMENT_ATC", "ORDER_CANCEL_REASON_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT", "ORDER_CANCEL_REASON_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT", "ORDER_CANCEL_REASON_FLATTEN", "ORDER_CANCEL_REASON_TIME_IN_FORCE_EXPIRED", "ORDER_CANCEL_REASON_INVALID_PRICE", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class OrderCancelReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderCancelReason[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OrderCancelReason> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OrderCancelReason ORDER_CANCEL_REASON_BROKER_ASSISTED;
    public static final OrderCancelReason ORDER_CANCEL_REASON_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT;
    public static final OrderCancelReason ORDER_CANCEL_REASON_EXPIRATION_PHYSICAL_SETTLEMENT_ATC;
    public static final OrderCancelReason ORDER_CANCEL_REASON_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT;
    public static final OrderCancelReason ORDER_CANCEL_REASON_FLATTEN;
    public static final OrderCancelReason ORDER_CANCEL_REASON_GENERAL_INTRADAY_RISK;
    public static final OrderCancelReason ORDER_CANCEL_REASON_INVALID_PRICE;
    public static final OrderCancelReason ORDER_CANCEL_REASON_TIME_IN_FORCE_EXPIRED;
    public static final OrderCancelReason ORDER_CANCEL_REASON_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ OrderCancelReason[] $values() {
        return new OrderCancelReason[]{ORDER_CANCEL_REASON_UNSPECIFIED, ORDER_CANCEL_REASON_BROKER_ASSISTED, ORDER_CANCEL_REASON_GENERAL_INTRADAY_RISK, ORDER_CANCEL_REASON_EXPIRATION_PHYSICAL_SETTLEMENT_ATC, ORDER_CANCEL_REASON_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT, ORDER_CANCEL_REASON_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT, ORDER_CANCEL_REASON_FLATTEN, ORDER_CANCEL_REASON_TIME_IN_FORCE_EXPIRED, ORDER_CANCEL_REASON_INVALID_PRICE};
    }

    @JvmStatic
    public static final OrderCancelReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OrderCancelReason> getEntries() {
        return $ENTRIES;
    }

    private OrderCancelReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OrderCancelReason orderCancelReason = new OrderCancelReason("ORDER_CANCEL_REASON_UNSPECIFIED", 0, 0);
        ORDER_CANCEL_REASON_UNSPECIFIED = orderCancelReason;
        ORDER_CANCEL_REASON_BROKER_ASSISTED = new OrderCancelReason("ORDER_CANCEL_REASON_BROKER_ASSISTED", 1, 1);
        ORDER_CANCEL_REASON_GENERAL_INTRADAY_RISK = new OrderCancelReason("ORDER_CANCEL_REASON_GENERAL_INTRADAY_RISK", 2, 2);
        ORDER_CANCEL_REASON_EXPIRATION_PHYSICAL_SETTLEMENT_ATC = new OrderCancelReason("ORDER_CANCEL_REASON_EXPIRATION_PHYSICAL_SETTLEMENT_ATC", 3, 3);
        ORDER_CANCEL_REASON_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT = new OrderCancelReason("ORDER_CANCEL_REASON_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT", 4, 4);
        ORDER_CANCEL_REASON_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT = new OrderCancelReason("ORDER_CANCEL_REASON_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT", 5, 5);
        ORDER_CANCEL_REASON_FLATTEN = new OrderCancelReason("ORDER_CANCEL_REASON_FLATTEN", 6, 6);
        ORDER_CANCEL_REASON_TIME_IN_FORCE_EXPIRED = new OrderCancelReason("ORDER_CANCEL_REASON_TIME_IN_FORCE_EXPIRED", 7, 7);
        ORDER_CANCEL_REASON_INVALID_PRICE = new OrderCancelReason("ORDER_CANCEL_REASON_INVALID_PRICE", 8, 8);
        OrderCancelReason[] orderCancelReasonArr$values = $values();
        $VALUES = orderCancelReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderCancelReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderCancelReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OrderCancelReason>(orCreateKotlinClass, syntax, orderCancelReason) { // from class: com.robinhood.ceres.v1.OrderCancelReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OrderCancelReason fromValue(int value) {
                return OrderCancelReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OrderCancelReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderCancelReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/OrderCancelReason;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderCancelReason fromValue(int value) {
            switch (value) {
                case 0:
                    return OrderCancelReason.ORDER_CANCEL_REASON_UNSPECIFIED;
                case 1:
                    return OrderCancelReason.ORDER_CANCEL_REASON_BROKER_ASSISTED;
                case 2:
                    return OrderCancelReason.ORDER_CANCEL_REASON_GENERAL_INTRADAY_RISK;
                case 3:
                    return OrderCancelReason.ORDER_CANCEL_REASON_EXPIRATION_PHYSICAL_SETTLEMENT_ATC;
                case 4:
                    return OrderCancelReason.ORDER_CANCEL_REASON_EXPIRATION_PHYSICAL_SETTLEMENT_LDTT;
                case 5:
                    return OrderCancelReason.ORDER_CANCEL_REASON_EXPIRATION_FINANCIAL_SETTLEMENT_LDTT;
                case 6:
                    return OrderCancelReason.ORDER_CANCEL_REASON_FLATTEN;
                case 7:
                    return OrderCancelReason.ORDER_CANCEL_REASON_TIME_IN_FORCE_EXPIRED;
                case 8:
                    return OrderCancelReason.ORDER_CANCEL_REASON_INVALID_PRICE;
                default:
                    return null;
            }
        }
    }

    public static OrderCancelReason valueOf(String str) {
        return (OrderCancelReason) Enum.valueOf(OrderCancelReason.class, str);
    }

    public static OrderCancelReason[] values() {
        return (OrderCancelReason[]) $VALUES.clone();
    }
}
