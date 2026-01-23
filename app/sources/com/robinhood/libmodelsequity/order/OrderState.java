package com.robinhood.libmodelsequity.order;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/libmodelsequity/order/OrderState;", "", "(Ljava/lang/String;I)V", "QUEUED", "NEW", "UNCONFIRMED", "CONFIRMED", "TRIGGERED", "PARTIALLY_FILLED", "FILLED", "REJECTED", "PARTIALLY_FILLED_REST_CANCELLED", "PENDING_CANCELLED", "CANCELED", "FAILED", "VOIDED", "Companion", "lib-models-equity"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes10.dex */
public final class OrderState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderState[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName("queued")
    public static final OrderState QUEUED = new OrderState("QUEUED", 0);

    @SerialName("new")
    public static final OrderState NEW = new OrderState("NEW", 1);

    @SerialName("unconfirmed")
    public static final OrderState UNCONFIRMED = new OrderState("UNCONFIRMED", 2);

    @SerialName("confirmed")
    public static final OrderState CONFIRMED = new OrderState("CONFIRMED", 3);

    @SerialName("triggered")
    public static final OrderState TRIGGERED = new OrderState("TRIGGERED", 4);

    @SerialName("partially_filled")
    public static final OrderState PARTIALLY_FILLED = new OrderState("PARTIALLY_FILLED", 5);

    @SerialName("filled")
    public static final OrderState FILLED = new OrderState("FILLED", 6);

    @SerialName("rejected")
    public static final OrderState REJECTED = new OrderState("REJECTED", 7);

    @SerialName("partially_filled_rest_cancelled")
    public static final OrderState PARTIALLY_FILLED_REST_CANCELLED = new OrderState("PARTIALLY_FILLED_REST_CANCELLED", 8);

    @SerialName("pending_cancelled")
    public static final OrderState PENDING_CANCELLED = new OrderState("PENDING_CANCELLED", 9);

    @SerialName("canceled")
    public static final OrderState CANCELED = new OrderState("CANCELED", 10);

    @SerialName("failed")
    public static final OrderState FAILED = new OrderState("FAILED", 11);

    @SerialName("voided")
    public static final OrderState VOIDED = new OrderState("VOIDED", 12);

    private static final /* synthetic */ OrderState[] $values() {
        return new OrderState[]{QUEUED, NEW, UNCONFIRMED, CONFIRMED, TRIGGERED, PARTIALLY_FILLED, FILLED, REJECTED, PARTIALLY_FILLED_REST_CANCELLED, PENDING_CANCELLED, CANCELED, FAILED, VOIDED};
    }

    public static EnumEntries<OrderState> getEntries() {
        return $ENTRIES;
    }

    public static OrderState valueOf(String str) {
        return (OrderState) Enum.valueOf(OrderState.class, str);
    }

    public static OrderState[] values() {
        return (OrderState[]) $VALUES.clone();
    }

    /* compiled from: OrderState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libmodelsequity/order/OrderState$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libmodelsequity/order/OrderState;", "lib-models-equity"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) OrderState.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OrderState> serializer() {
            return get$cachedSerializer();
        }
    }

    private OrderState(String str, int i) {
    }

    static {
        OrderState[] orderStateArr$values = $values();
        $VALUES = orderStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderStateArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.robinhood.libmodelsequity.order.OrderState.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("com.robinhood.libmodelsequity.order.OrderState", OrderState.values(), new String[]{"queued", "new", "unconfirmed", "confirmed", "triggered", "partially_filled", "filled", "rejected", "partially_filled_rest_cancelled", "pending_cancelled", "canceled", "failed", "voided"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
            }
        });
    }
}
