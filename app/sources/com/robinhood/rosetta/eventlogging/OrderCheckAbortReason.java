package com.robinhood.rosetta.eventlogging;

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
/* compiled from: OrderCheckAbortReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OrderCheckAbortReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TIMEOUT", "HTTP_ERROR", "UNRECOGNIZED_ACTION", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class OrderCheckAbortReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderCheckAbortReason[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OrderCheckAbortReason> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OrderCheckAbortReason HTTP_ERROR;
    public static final OrderCheckAbortReason TIMEOUT;
    public static final OrderCheckAbortReason UNRECOGNIZED_ACTION;
    private final int value;

    private static final /* synthetic */ OrderCheckAbortReason[] $values() {
        return new OrderCheckAbortReason[]{TIMEOUT, HTTP_ERROR, UNRECOGNIZED_ACTION};
    }

    @JvmStatic
    public static final OrderCheckAbortReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OrderCheckAbortReason> getEntries() {
        return $ENTRIES;
    }

    private OrderCheckAbortReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OrderCheckAbortReason orderCheckAbortReason = new OrderCheckAbortReason("TIMEOUT", 0, 0);
        TIMEOUT = orderCheckAbortReason;
        HTTP_ERROR = new OrderCheckAbortReason("HTTP_ERROR", 1, 1);
        UNRECOGNIZED_ACTION = new OrderCheckAbortReason("UNRECOGNIZED_ACTION", 2, 2);
        OrderCheckAbortReason[] orderCheckAbortReasonArr$values = $values();
        $VALUES = orderCheckAbortReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderCheckAbortReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderCheckAbortReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OrderCheckAbortReason>(orCreateKotlinClass, syntax, orderCheckAbortReason) { // from class: com.robinhood.rosetta.eventlogging.OrderCheckAbortReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OrderCheckAbortReason fromValue(int value) {
                return OrderCheckAbortReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OrderCheckAbortReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OrderCheckAbortReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/OrderCheckAbortReason;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderCheckAbortReason fromValue(int value) {
            if (value == 0) {
                return OrderCheckAbortReason.TIMEOUT;
            }
            if (value == 1) {
                return OrderCheckAbortReason.HTTP_ERROR;
            }
            if (value != 2) {
                return null;
            }
            return OrderCheckAbortReason.UNRECOGNIZED_ACTION;
        }
    }

    public static OrderCheckAbortReason valueOf(String str) {
        return (OrderCheckAbortReason) Enum.valueOf(OrderCheckAbortReason.class, str);
    }

    public static OrderCheckAbortReason[] values() {
        return (OrderCheckAbortReason[]) $VALUES.clone();
    }
}
