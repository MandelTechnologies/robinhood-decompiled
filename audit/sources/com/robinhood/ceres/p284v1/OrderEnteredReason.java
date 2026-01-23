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
/* compiled from: OrderEnteredReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderEnteredReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_ENTERED_REASON_UNSPECIFIED", "ORDER_ENTERED_REASON_SELLOUT_MARGIN_CALL", "ORDER_ENTERED_REASON_EXPIRATION_PHYSICAL_SETTLEMENT", "ORDER_ENTERED_REASON_SELLOUT_INTRADAY_RISK", "ORDER_ENTERED_REASON_BROKER_ASSISTED", "ORDER_ENTERED_REASON_FLATTEN", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class OrderEnteredReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderEnteredReason[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OrderEnteredReason> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OrderEnteredReason ORDER_ENTERED_REASON_BROKER_ASSISTED;
    public static final OrderEnteredReason ORDER_ENTERED_REASON_EXPIRATION_PHYSICAL_SETTLEMENT;
    public static final OrderEnteredReason ORDER_ENTERED_REASON_FLATTEN;
    public static final OrderEnteredReason ORDER_ENTERED_REASON_SELLOUT_INTRADAY_RISK;
    public static final OrderEnteredReason ORDER_ENTERED_REASON_SELLOUT_MARGIN_CALL;
    public static final OrderEnteredReason ORDER_ENTERED_REASON_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ OrderEnteredReason[] $values() {
        return new OrderEnteredReason[]{ORDER_ENTERED_REASON_UNSPECIFIED, ORDER_ENTERED_REASON_SELLOUT_MARGIN_CALL, ORDER_ENTERED_REASON_EXPIRATION_PHYSICAL_SETTLEMENT, ORDER_ENTERED_REASON_SELLOUT_INTRADAY_RISK, ORDER_ENTERED_REASON_BROKER_ASSISTED, ORDER_ENTERED_REASON_FLATTEN};
    }

    @JvmStatic
    public static final OrderEnteredReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OrderEnteredReason> getEntries() {
        return $ENTRIES;
    }

    private OrderEnteredReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OrderEnteredReason orderEnteredReason = new OrderEnteredReason("ORDER_ENTERED_REASON_UNSPECIFIED", 0, 0);
        ORDER_ENTERED_REASON_UNSPECIFIED = orderEnteredReason;
        ORDER_ENTERED_REASON_SELLOUT_MARGIN_CALL = new OrderEnteredReason("ORDER_ENTERED_REASON_SELLOUT_MARGIN_CALL", 1, 1);
        ORDER_ENTERED_REASON_EXPIRATION_PHYSICAL_SETTLEMENT = new OrderEnteredReason("ORDER_ENTERED_REASON_EXPIRATION_PHYSICAL_SETTLEMENT", 2, 2);
        ORDER_ENTERED_REASON_SELLOUT_INTRADAY_RISK = new OrderEnteredReason("ORDER_ENTERED_REASON_SELLOUT_INTRADAY_RISK", 3, 3);
        ORDER_ENTERED_REASON_BROKER_ASSISTED = new OrderEnteredReason("ORDER_ENTERED_REASON_BROKER_ASSISTED", 4, 4);
        ORDER_ENTERED_REASON_FLATTEN = new OrderEnteredReason("ORDER_ENTERED_REASON_FLATTEN", 5, 5);
        OrderEnteredReason[] orderEnteredReasonArr$values = $values();
        $VALUES = orderEnteredReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderEnteredReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderEnteredReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OrderEnteredReason>(orCreateKotlinClass, syntax, orderEnteredReason) { // from class: com.robinhood.ceres.v1.OrderEnteredReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OrderEnteredReason fromValue(int value) {
                return OrderEnteredReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OrderEnteredReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderEnteredReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/OrderEnteredReason;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderEnteredReason fromValue(int value) {
            if (value == 0) {
                return OrderEnteredReason.ORDER_ENTERED_REASON_UNSPECIFIED;
            }
            if (value == 1) {
                return OrderEnteredReason.ORDER_ENTERED_REASON_SELLOUT_MARGIN_CALL;
            }
            if (value == 2) {
                return OrderEnteredReason.ORDER_ENTERED_REASON_EXPIRATION_PHYSICAL_SETTLEMENT;
            }
            if (value == 3) {
                return OrderEnteredReason.ORDER_ENTERED_REASON_SELLOUT_INTRADAY_RISK;
            }
            if (value == 4) {
                return OrderEnteredReason.ORDER_ENTERED_REASON_BROKER_ASSISTED;
            }
            if (value != 5) {
                return null;
            }
            return OrderEnteredReason.ORDER_ENTERED_REASON_FLATTEN;
        }
    }

    public static OrderEnteredReason valueOf(String str) {
        return (OrderEnteredReason) Enum.valueOf(OrderEnteredReason.class, str);
    }

    public static OrderEnteredReason[] values() {
        return (OrderEnteredReason[]) $VALUES.clone();
    }
}
