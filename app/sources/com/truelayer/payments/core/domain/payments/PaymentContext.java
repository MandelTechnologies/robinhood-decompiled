package com.truelayer.payments.core.domain.payments;

import com.truelayer.payments.analytics.utils.ResourceType;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.Enums4;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: PaymentContext.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0003-./BA\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003J=\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J&\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÁ\u0001¢\u0006\u0002\b,R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015¨\u00060"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/PaymentContext;", "", "seen1", "", "paymentId", "", "resourceToken", "redirectUri", "paymentType", "Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "idempotencyKey", "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;Ljava/util/UUID;)V", "getIdempotencyKey$annotations", "()V", "getIdempotencyKey", "()Ljava/util/UUID;", "getPaymentId", "()Ljava/lang/String;", "getPaymentType", "()Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;", "getRedirectUri", "getResourceToken", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "PaymentType", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class PaymentContext {
    private final UUID idempotencyKey;
    private final String paymentId;
    private final PaymentType paymentType;
    private final String redirectUri;
    private final String resourceToken;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, Enums4.createSimpleEnumSerializer("com.truelayer.payments.core.domain.payments.PaymentContext.PaymentType", PaymentType.values())};

    public static /* synthetic */ PaymentContext copy$default(PaymentContext paymentContext, String str, String str2, String str3, PaymentType paymentType, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentContext.paymentId;
        }
        if ((i & 2) != 0) {
            str2 = paymentContext.resourceToken;
        }
        if ((i & 4) != 0) {
            str3 = paymentContext.redirectUri;
        }
        if ((i & 8) != 0) {
            paymentType = paymentContext.paymentType;
        }
        if ((i & 16) != 0) {
            uuid = paymentContext.idempotencyKey;
        }
        UUID uuid2 = uuid;
        String str4 = str3;
        return paymentContext.copy(str, str2, str4, paymentType, uuid2);
    }

    public static /* synthetic */ void getIdempotencyKey$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getResourceToken() {
        return this.resourceToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRedirectUri() {
        return this.redirectUri;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentType getPaymentType() {
        return this.paymentType;
    }

    /* renamed from: component5, reason: from getter */
    public final UUID getIdempotencyKey() {
        return this.idempotencyKey;
    }

    public final PaymentContext copy(String paymentId, String resourceToken, String redirectUri, PaymentType paymentType, UUID idempotencyKey) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        return new PaymentContext(paymentId, resourceToken, redirectUri, paymentType, idempotencyKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentContext)) {
            return false;
        }
        PaymentContext paymentContext = (PaymentContext) other;
        return Intrinsics.areEqual(this.paymentId, paymentContext.paymentId) && Intrinsics.areEqual(this.resourceToken, paymentContext.resourceToken) && Intrinsics.areEqual(this.redirectUri, paymentContext.redirectUri) && this.paymentType == paymentContext.paymentType && Intrinsics.areEqual(this.idempotencyKey, paymentContext.idempotencyKey);
    }

    public int hashCode() {
        int iHashCode = ((((((this.paymentId.hashCode() * 31) + this.resourceToken.hashCode()) * 31) + this.redirectUri.hashCode()) * 31) + this.paymentType.hashCode()) * 31;
        UUID uuid = this.idempotencyKey;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        return "PaymentContext(paymentId=" + this.paymentId + ", resourceToken=" + this.resourceToken + ", redirectUri=" + this.redirectUri + ", paymentType=" + this.paymentType + ", idempotencyKey=" + this.idempotencyKey + ")";
    }

    @Deprecated
    public /* synthetic */ PaymentContext(int i, String str, String str2, String str3, PaymentType paymentType, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptions.throwMissingFieldException(i, 15, PaymentContext2.INSTANCE.getDescriptor());
        }
        this.paymentId = str;
        this.resourceToken = str2;
        this.redirectUri = str3;
        this.paymentType = paymentType;
        this.idempotencyKey = null;
    }

    public PaymentContext(String paymentId, String resourceToken, String redirectUri, PaymentType paymentType, UUID uuid) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        this.paymentId = paymentId;
        this.resourceToken = resourceToken;
        this.redirectUri = redirectUri;
        this.paymentType = paymentType;
        this.idempotencyKey = uuid;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(PaymentContext self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.paymentId);
        output.encodeStringElement(serialDesc, 1, self.resourceToken);
        output.encodeStringElement(serialDesc, 2, self.redirectUri);
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.paymentType);
    }

    public /* synthetic */ PaymentContext(String str, String str2, String str3, PaymentType paymentType, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, paymentType, (i & 16) != 0 ? null : uuid);
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getResourceToken() {
        return this.resourceToken;
    }

    public final String getRedirectUri() {
        return this.redirectUri;
    }

    public final PaymentType getPaymentType() {
        return this.paymentType;
    }

    public final UUID getIdempotencyKey() {
        return this.idempotencyKey;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;", "", "(Ljava/lang/String;I)V", "intoAnalyticsType", "Lcom/truelayer/payments/analytics/utils/ResourceType;", "SinglePayment", "Mandate", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class PaymentType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PaymentType[] $VALUES;
        public static final PaymentType SinglePayment = new PaymentType("SinglePayment", 0);
        public static final PaymentType Mandate = new PaymentType("Mandate", 1);

        /* compiled from: PaymentContext.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PaymentType.values().length];
                try {
                    iArr[PaymentType.SinglePayment.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PaymentType.Mandate.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ PaymentType[] $values() {
            return new PaymentType[]{SinglePayment, Mandate};
        }

        public static EnumEntries<PaymentType> getEntries() {
            return $ENTRIES;
        }

        public static PaymentType valueOf(String str) {
            return (PaymentType) Enum.valueOf(PaymentType.class, str);
        }

        public static PaymentType[] values() {
            return (PaymentType[]) $VALUES.clone();
        }

        private PaymentType(String str, int i) {
        }

        static {
            PaymentType[] paymentTypeArr$values = $values();
            $VALUES = paymentTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(paymentTypeArr$values);
        }

        public final ResourceType intoAnalyticsType() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return ResourceType.PAYMENT;
            }
            if (i == 2) {
                return ResourceType.MANDATE;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: PaymentContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/PaymentContext$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/domain/payments/PaymentContext;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PaymentContext> serializer() {
            return PaymentContext2.INSTANCE;
        }
    }
}
