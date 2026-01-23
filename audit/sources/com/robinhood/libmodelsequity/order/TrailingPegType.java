package com.robinhood.libmodelsequity.order;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
/* compiled from: TrailingPegType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/libmodelsequity/order/TrailingPegType;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "PRICE", "PERCENTAGE", "Companion", "lib-models-equity"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes10.dex */
public final class TrailingPegType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TrailingPegType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;

    @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE, "PRICE"})
    public static final TrailingPegType PRICE = new TrailingPegType("PRICE", 0, AnalyticsStrings.TAG_SORT_ORDER_PRICE);

    @JsonAnnotations2(names = {"percentage", "PERCENTAGE"})
    public static final TrailingPegType PERCENTAGE = new TrailingPegType("PERCENTAGE", 1, "percentage");

    private static final /* synthetic */ TrailingPegType[] $values() {
        return new TrailingPegType[]{PRICE, PERCENTAGE};
    }

    public static EnumEntries<TrailingPegType> getEntries() {
        return $ENTRIES;
    }

    public static TrailingPegType valueOf(String str) {
        return (TrailingPegType) Enum.valueOf(TrailingPegType.class, str);
    }

    public static TrailingPegType[] values() {
        return (TrailingPegType[]) $VALUES.clone();
    }

    private TrailingPegType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        TrailingPegType[] trailingPegTypeArr$values = $values();
        $VALUES = trailingPegTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(trailingPegTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.robinhood.libmodelsequity.order.TrailingPegType.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                final String[] strArr = {AnalyticsStrings.TAG_SORT_ORDER_PRICE, "PRICE"};
                final String[] strArr2 = {"percentage", "PERCENTAGE"};
                return Enums4.createAnnotatedEnumSerializer("com.robinhood.libmodelsequity.order.TrailingPegType", TrailingPegType.values(), new String[]{null, null}, new Annotation[][]{new Annotation[]{new JsonAnnotations2(strArr) { // from class: com.robinhood.libmodelsequity.order.TrailingPegType$Companion$annotationImpl$kotlinx_serialization_json_JsonNames$0
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
                }}, new Annotation[]{new JsonAnnotations2(strArr2) { // from class: com.robinhood.libmodelsequity.order.TrailingPegType$Companion$annotationImpl$kotlinx_serialization_json_JsonNames$0
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

    /* compiled from: TrailingPegType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/libmodelsequity/order/TrailingPegType$Companion;", "", "()V", "fromServerValue", "Lcom/robinhood/libmodelsequity/order/TrailingPegType;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "lib-models-equity"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) TrailingPegType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TrailingPegType> serializer() {
            return get$cachedSerializer();
        }

        public final TrailingPegType fromServerValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            TrailingPegType[] trailingPegTypeArrValues = TrailingPegType.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(trailingPegTypeArrValues.length), 16));
            for (TrailingPegType trailingPegType : trailingPegTypeArrValues) {
                linkedHashMap.put(trailingPegType.getServerValue(), trailingPegType);
            }
            return (TrailingPegType) linkedHashMap.get(value);
        }
    }
}
