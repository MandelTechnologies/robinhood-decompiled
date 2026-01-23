package com.robinhood.libmodelsequity.order;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: OrderTrailingPeg.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB!\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J0\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÁ\u0001¢\u0006\u0002\b'R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, m3636d2 = {"Lcom/robinhood/libmodelsequity/order/OrderTrailingPeg;", "", "seen1", "", "percentage", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "", "type", "Lcom/robinhood/libmodelsequity/order/TrailingPegType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/Double;Lcom/robinhood/libmodelsequity/order/TrailingPegType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;Ljava/lang/Double;Lcom/robinhood/libmodelsequity/order/TrailingPegType;)V", "getPercentage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getType", "()Lcom/robinhood/libmodelsequity/order/TrailingPegType;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Double;Lcom/robinhood/libmodelsequity/order/TrailingPegType;)Lcom/robinhood/libmodelsequity/order/OrderTrailingPeg;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lib_models_equity", "$serializer", "Companion", "lib-models-equity"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes10.dex */
public final /* data */ class OrderTrailingPeg {
    private final Integer percentage;
    private final Double price;
    private final TrailingPegType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, TrailingPegType.INSTANCE.serializer()};

    public static /* synthetic */ OrderTrailingPeg copy$default(OrderTrailingPeg orderTrailingPeg, Integer num, Double d, TrailingPegType trailingPegType, int i, Object obj) {
        if ((i & 1) != 0) {
            num = orderTrailingPeg.percentage;
        }
        if ((i & 2) != 0) {
            d = orderTrailingPeg.price;
        }
        if ((i & 4) != 0) {
            trailingPegType = orderTrailingPeg.type;
        }
        return orderTrailingPeg.copy(num, d, trailingPegType);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getPercentage() {
        return this.percentage;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    /* renamed from: component3, reason: from getter */
    public final TrailingPegType getType() {
        return this.type;
    }

    public final OrderTrailingPeg copy(Integer percentage, Double price, TrailingPegType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return new OrderTrailingPeg(percentage, price, type2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTrailingPeg)) {
            return false;
        }
        OrderTrailingPeg orderTrailingPeg = (OrderTrailingPeg) other;
        return Intrinsics.areEqual(this.percentage, orderTrailingPeg.percentage) && Intrinsics.areEqual((Object) this.price, (Object) orderTrailingPeg.price) && this.type == orderTrailingPeg.type;
    }

    public int hashCode() {
        Integer num = this.percentage;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d = this.price;
        return ((iHashCode + (d != null ? d.hashCode() : 0)) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "OrderTrailingPeg(percentage=" + this.percentage + ", price=" + this.price + ", type=" + this.type + ")";
    }

    /* compiled from: OrderTrailingPeg.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libmodelsequity/order/OrderTrailingPeg$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libmodelsequity/order/OrderTrailingPeg;", "lib-models-equity"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderTrailingPeg> serializer() {
            return OrderTrailingPeg3.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ OrderTrailingPeg(int i, Integer num, Double d, TrailingPegType trailingPegType, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, OrderTrailingPeg3.INSTANCE.getDescriptor());
        }
        this.percentage = num;
        this.price = d;
        this.type = trailingPegType;
    }

    public OrderTrailingPeg(Integer num, Double d, TrailingPegType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.percentage = num;
        this.price = d;
        this.type = type2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$lib_models_equity(OrderTrailingPeg self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.percentage);
        output.encodeNullableSerializableElement(serialDesc, 1, DoubleSerializer.INSTANCE, self.price);
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.type);
    }

    public final Integer getPercentage() {
        return this.percentage;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final TrailingPegType getType() {
        return this.type;
    }
}
