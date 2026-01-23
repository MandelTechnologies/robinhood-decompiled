package com.truelayer.payments.core.network.mandates.entity.shared;

import com.truelayer.payments.core.domain.payments.ProviderAvailability;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.Enums4;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: ProviderAvailability.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003)*+B1\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\t\u0010\u001f\u001a\u00020 HÖ\u0001J&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÁ\u0001¢\u0006\u0002\b(R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014¨\u0006,"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderAvailability;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/ProviderAvailability;", "seen1", "", "recommendedStatus", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderAvailability$Status;", "errorRate", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/truelayer/payments/core/network/mandates/entity/shared/ProviderAvailability$Status;Ljava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderAvailability$Status;Ljava/lang/Float;)V", "getErrorRate$annotations", "()V", "getErrorRate", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getRecommendedStatus$annotations", "getRecommendedStatus", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderAvailability$Status;", "component1", "component2", "copy", "(Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderAvailability$Status;Ljava/lang/Float;)Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderAvailability;", "equals", "", "other", "", "hashCode", "intoDomain", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "Status", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class ProviderAvailability implements IntoDomain<com.truelayer.payments.core.domain.payments.ProviderAvailability> {
    private final Float errorRate;
    private final Status recommendedStatus;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {Status.INSTANCE.serializer(), null};

    /* compiled from: ProviderAvailability.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.Healthy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.Unhealthy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ ProviderAvailability copy$default(ProviderAvailability providerAvailability, Status status, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            status = providerAvailability.recommendedStatus;
        }
        if ((i & 2) != 0) {
            f = providerAvailability.errorRate;
        }
        return providerAvailability.copy(status, f);
    }

    @SerialName("error_rate")
    public static /* synthetic */ void getErrorRate$annotations() {
    }

    @SerialName("recommended_status")
    public static /* synthetic */ void getRecommendedStatus$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Status getRecommendedStatus() {
        return this.recommendedStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final Float getErrorRate() {
        return this.errorRate;
    }

    public final ProviderAvailability copy(Status recommendedStatus, Float errorRate) {
        Intrinsics.checkNotNullParameter(recommendedStatus, "recommendedStatus");
        return new ProviderAvailability(recommendedStatus, errorRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProviderAvailability)) {
            return false;
        }
        ProviderAvailability providerAvailability = (ProviderAvailability) other;
        return this.recommendedStatus == providerAvailability.recommendedStatus && Intrinsics.areEqual((Object) this.errorRate, (Object) providerAvailability.errorRate);
    }

    public int hashCode() {
        int iHashCode = this.recommendedStatus.hashCode() * 31;
        Float f = this.errorRate;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }

    public String toString() {
        return "ProviderAvailability(recommendedStatus=" + this.recommendedStatus + ", errorRate=" + this.errorRate + ")";
    }

    /* compiled from: ProviderAvailability.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderAvailability$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderAvailability;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ProviderAvailability> serializer() {
            return ProviderAvailability3.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ ProviderAvailability(int i, @SerialName("recommended_status") Status status, @SerialName("error_rate") Float f, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, ProviderAvailability3.INSTANCE.getDescriptor());
        }
        this.recommendedStatus = status;
        if ((i & 2) == 0) {
            this.errorRate = null;
        } else {
            this.errorRate = f;
        }
    }

    public ProviderAvailability(Status recommendedStatus, Float f) {
        Intrinsics.checkNotNullParameter(recommendedStatus, "recommendedStatus");
        this.recommendedStatus = recommendedStatus;
        this.errorRate = f;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(ProviderAvailability self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.recommendedStatus);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.errorRate == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, FloatSerializer.INSTANCE, self.errorRate);
    }

    public /* synthetic */ ProviderAvailability(Status status, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, (i & 2) != 0 ? null : f);
    }

    public final Status getRecommendedStatus() {
        return this.recommendedStatus;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProviderAvailability.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderAvailability$Status;", "", "(Ljava/lang/String;I)V", "Healthy", "Unhealthy", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @SerialName("healthy")
        public static final Status Healthy = new Status("Healthy", 0);

        @SerialName("unhealthy")
        public static final Status Unhealthy = new Status("Unhealthy", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{Healthy, Unhealthy};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        /* compiled from: ProviderAvailability.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderAvailability$Status$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/ProviderAvailability$Status;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Status.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Status> serializer() {
                return get$cachedSerializer();
            }
        }

        private Status(String str, int i) {
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.mandates.entity.shared.ProviderAvailability.Status.Companion.1
                @Override // kotlin.jvm.functions.Function0
                public final KSerializer<Object> invoke() {
                    return Enums4.createAnnotatedEnumSerializer("com.truelayer.payments.core.network.mandates.entity.shared.ProviderAvailability.Status", Status.values(), new String[]{"healthy", "unhealthy"}, new Annotation[][]{null, null}, null);
                }
            });
        }
    }

    public final Float getErrorRate() {
        return this.errorRate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public com.truelayer.payments.core.domain.payments.ProviderAvailability intoDomain2() {
        ProviderAvailability.Status status;
        int i = WhenMappings.$EnumSwitchMapping$0[this.recommendedStatus.ordinal()];
        if (i == 1) {
            status = ProviderAvailability.Status.Healthy;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            status = ProviderAvailability.Status.Unhealthy;
        }
        return new com.truelayer.payments.core.domain.payments.ProviderAvailability(status, this.errorRate);
    }
}
