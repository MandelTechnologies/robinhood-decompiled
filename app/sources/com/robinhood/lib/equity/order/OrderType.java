package com.robinhood.lib.equity.order;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;
import kotlinx.serialization.json.JsonAnnotations2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/lib/equity/order/OrderType;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "MARKET", "LIMIT", "Companion", "lib-equity-store"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes27.dex */
public final class OrderType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;

    @JsonAnnotations2(names = {"MARKET", "market"})
    public static final OrderType MARKET = new OrderType("MARKET", 0, "market");

    @JsonAnnotations2(names = {"LIMIT", "limit"})
    public static final OrderType LIMIT = new OrderType("LIMIT", 1, "limit");

    private static final /* synthetic */ OrderType[] $values() {
        return new OrderType[]{MARKET, LIMIT};
    }

    public static EnumEntries<OrderType> getEntries() {
        return $ENTRIES;
    }

    public static OrderType valueOf(String str) {
        return (OrderType) Enum.valueOf(OrderType.class, str);
    }

    public static OrderType[] values() {
        return (OrderType[]) $VALUES.clone();
    }

    private OrderType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        OrderType[] orderTypeArr$values = $values();
        $VALUES = orderTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.robinhood.lib.equity.order.OrderType.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                final String[] strArr = {"MARKET", "market"};
                final String[] strArr2 = {"LIMIT", "limit"};
                return Enums4.createAnnotatedEnumSerializer("com.robinhood.lib.equity.order.OrderType", OrderType.values(), new String[]{null, null}, new Annotation[][]{new Annotation[]{new JsonAnnotations2(strArr) { // from class: com.robinhood.lib.equity.order.OrderType$Companion$annotationImpl$kotlinx_serialization_json_JsonNames$0
                    private final /* synthetic */ String[] names;

                    {
                        Intrinsics.checkNotNullParameter(strArr, "names");
                        this.names = strArr;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return JsonAnnotations2.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj) {
                        return (obj instanceof JsonAnnotations2) && Arrays.equals(names(), ((JsonAnnotations2) obj).names());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return Arrays.hashCode(this.names) ^ 397397176;
                    }

                    @Override // kotlinx.serialization.json.JsonAnnotations2
                    public final /* synthetic */ String[] names() {
                        return this.names;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonNames(names=" + Arrays.toString(this.names) + ")";
                    }
                }}, new Annotation[]{new JsonAnnotations2(strArr2) { // from class: com.robinhood.lib.equity.order.OrderType$Companion$annotationImpl$kotlinx_serialization_json_JsonNames$0
                    private final /* synthetic */ String[] names;

                    {
                        Intrinsics.checkNotNullParameter(strArr2, "names");
                        this.names = strArr2;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return JsonAnnotations2.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj) {
                        return (obj instanceof JsonAnnotations2) && Arrays.equals(names(), ((JsonAnnotations2) obj).names());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return Arrays.hashCode(this.names) ^ 397397176;
                    }

                    @Override // kotlinx.serialization.json.JsonAnnotations2
                    public final /* synthetic */ String[] names() {
                        return this.names;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonNames(names=" + Arrays.toString(this.names) + ")";
                    }
                }}}, null);
            }
        });
    }

    /* compiled from: OrderType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/lib/equity/order/OrderType$Companion;", "", "()V", "fromServerValue", "Lcom/robinhood/lib/equity/order/OrderType;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "lib-equity-store"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) OrderType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OrderType> serializer() {
            return get$cachedSerializer();
        }

        public final OrderType fromServerValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            OrderType[] orderTypeArrValues = OrderType.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(orderTypeArrValues.length), 16));
            for (OrderType orderType : orderTypeArrValues) {
                linkedHashMap.put(orderType.getServerValue(), orderType);
            }
            return (OrderType) linkedHashMap.get(value);
        }
    }
}
