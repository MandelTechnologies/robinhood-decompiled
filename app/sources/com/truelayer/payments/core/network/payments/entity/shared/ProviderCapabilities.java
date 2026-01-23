package com.truelayer.payments.core.network.payments.entity.shared;

import com.truelayer.payments.core.domain.payments.PaymentContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: ProviderCapabilities.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0004-./0B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J!\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J&\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÁ\u0001¢\u0006\u0002\b,R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u00061"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities;", "", "seen1", "", "payments", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities;", "mandates", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities;Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities;Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities;)V", "getMandates$annotations", "()V", "getMandates", "()Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities;", "getPayments$annotations", "getPayments", "()Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities;", "schemes", "", "Lcom/truelayer/payments/core/domain/payments/ProviderScheme;", "getSchemes", "()Ljava/util/List;", "availability", "Lcom/truelayer/payments/core/domain/payments/ProviderAvailability;", "paymentType", "Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "MandateCapabilities", "PaymentCapabilities", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class ProviderCapabilities {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final MandateCapabilities mandates;
    private final PaymentCapabilities payments;

    /* compiled from: ProviderCapabilities.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentContext.PaymentType.values().length];
            try {
                iArr[PaymentContext.PaymentType.SinglePayment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentContext.PaymentType.Mandate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProviderCapabilities() {
        this((PaymentCapabilities) null, (MandateCapabilities) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ ProviderCapabilities copy$default(ProviderCapabilities providerCapabilities, PaymentCapabilities paymentCapabilities, MandateCapabilities mandateCapabilities, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentCapabilities = providerCapabilities.payments;
        }
        if ((i & 2) != 0) {
            mandateCapabilities = providerCapabilities.mandates;
        }
        return providerCapabilities.copy(paymentCapabilities, mandateCapabilities);
    }

    @SerialName("mandates")
    public static /* synthetic */ void getMandates$annotations() {
    }

    @SerialName("payments")
    public static /* synthetic */ void getPayments$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentCapabilities getPayments() {
        return this.payments;
    }

    /* renamed from: component2, reason: from getter */
    public final MandateCapabilities getMandates() {
        return this.mandates;
    }

    public final ProviderCapabilities copy(PaymentCapabilities payments, MandateCapabilities mandates) {
        return new ProviderCapabilities(payments, mandates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProviderCapabilities)) {
            return false;
        }
        ProviderCapabilities providerCapabilities = (ProviderCapabilities) other;
        return Intrinsics.areEqual(this.payments, providerCapabilities.payments) && Intrinsics.areEqual(this.mandates, providerCapabilities.mandates);
    }

    public int hashCode() {
        PaymentCapabilities paymentCapabilities = this.payments;
        int iHashCode = (paymentCapabilities == null ? 0 : paymentCapabilities.hashCode()) * 31;
        MandateCapabilities mandateCapabilities = this.mandates;
        return iHashCode + (mandateCapabilities != null ? mandateCapabilities.hashCode() : 0);
    }

    public String toString() {
        return "ProviderCapabilities(payments=" + this.payments + ", mandates=" + this.mandates + ")";
    }

    /* compiled from: ProviderCapabilities.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ProviderCapabilities> serializer() {
            return ProviderCapabilities2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ ProviderCapabilities(int i, @SerialName("payments") PaymentCapabilities paymentCapabilities, @SerialName("mandates") MandateCapabilities mandateCapabilities, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.payments = null;
        } else {
            this.payments = paymentCapabilities;
        }
        if ((i & 2) == 0) {
            this.mandates = null;
        } else {
            this.mandates = mandateCapabilities;
        }
    }

    public ProviderCapabilities(PaymentCapabilities paymentCapabilities, MandateCapabilities mandateCapabilities) {
        this.payments = paymentCapabilities;
        this.mandates = mandateCapabilities;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(ProviderCapabilities self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.payments != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, ProviderCapabilities5.INSTANCE, self.payments);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.mandates == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, ProviderCapabilities3.INSTANCE, self.mandates);
    }

    public /* synthetic */ ProviderCapabilities(PaymentCapabilities paymentCapabilities, MandateCapabilities mandateCapabilities, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentCapabilities, (i & 2) != 0 ? null : mandateCapabilities);
    }

    public final PaymentCapabilities getPayments() {
        return this.payments;
    }

    public final MandateCapabilities getMandates() {
        return this.mandates;
    }

    public final List<com.truelayer.payments.core.domain.payments.ProviderScheme> getSchemes() {
        PaymentCapabilities.BankTransferCapability bankTransfer;
        List<ProviderScheme> schemes;
        PaymentCapabilities paymentCapabilities = this.payments;
        if (paymentCapabilities == null || (bankTransfer = paymentCapabilities.getBankTransfer()) == null || (schemes = bankTransfer.getSchemes()) == null) {
            return null;
        }
        List<ProviderScheme> list = schemes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProviderScheme) it.next()).intoDomain2());
        }
        return arrayList;
    }

    public final com.truelayer.payments.core.domain.payments.ProviderAvailability availability(PaymentContext.PaymentType paymentType) {
        PaymentCapabilities.BankTransferCapability bankTransfer;
        ProviderAvailability availability;
        MandateCapabilities.VRPCapability vrpSweeping;
        ProviderAvailability availability2;
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        int i = WhenMappings.$EnumSwitchMapping$0[paymentType.ordinal()];
        if (i == 1) {
            PaymentCapabilities paymentCapabilities = this.payments;
            if (paymentCapabilities == null || (bankTransfer = paymentCapabilities.getBankTransfer()) == null || (availability = bankTransfer.getAvailability()) == null) {
                return null;
            }
            return availability.intoDomain2();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        MandateCapabilities mandateCapabilities = this.mandates;
        if (mandateCapabilities == null || (vrpSweeping = mandateCapabilities.getVrpSweeping()) == null || (availability2 = vrpSweeping.getAvailability()) == null) {
            return null;
        }
        return availability2.intoDomain2();
    }

    /* compiled from: ProviderCapabilities.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0003\u001e\u001f B%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006!"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities;", "", "seen1", "", "bankTransfer", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities$BankTransferCapability;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities$BankTransferCapability;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities$BankTransferCapability;)V", "getBankTransfer$annotations", "()V", "getBankTransfer", "()Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities$BankTransferCapability;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "BankTransferCapability", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class PaymentCapabilities {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BankTransferCapability bankTransfer;

        /* JADX WARN: Multi-variable type inference failed */
        public PaymentCapabilities() {
            this((BankTransferCapability) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ PaymentCapabilities copy$default(PaymentCapabilities paymentCapabilities, BankTransferCapability bankTransferCapability, int i, Object obj) {
            if ((i & 1) != 0) {
                bankTransferCapability = paymentCapabilities.bankTransfer;
            }
            return paymentCapabilities.copy(bankTransferCapability);
        }

        @SerialName("bank_transfer")
        public static /* synthetic */ void getBankTransfer$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final BankTransferCapability getBankTransfer() {
            return this.bankTransfer;
        }

        public final PaymentCapabilities copy(BankTransferCapability bankTransfer) {
            return new PaymentCapabilities(bankTransfer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentCapabilities) && Intrinsics.areEqual(this.bankTransfer, ((PaymentCapabilities) other).bankTransfer);
        }

        public int hashCode() {
            BankTransferCapability bankTransferCapability = this.bankTransfer;
            if (bankTransferCapability == null) {
                return 0;
            }
            return bankTransferCapability.hashCode();
        }

        public String toString() {
            return "PaymentCapabilities(bankTransfer=" + this.bankTransfer + ")";
        }

        /* compiled from: ProviderCapabilities.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PaymentCapabilities> serializer() {
                return ProviderCapabilities5.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ PaymentCapabilities(int i, @SerialName("bank_transfer") BankTransferCapability bankTransferCapability, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.bankTransfer = null;
            } else {
                this.bankTransfer = bankTransferCapability;
            }
        }

        public PaymentCapabilities(BankTransferCapability bankTransferCapability) {
            this.bankTransfer = bankTransferCapability;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(PaymentCapabilities self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.bankTransfer == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 0, ProviderCapabilities6.INSTANCE, self.bankTransfer);
        }

        public /* synthetic */ PaymentCapabilities(BankTransferCapability bankTransferCapability, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bankTransferCapability);
        }

        public final BankTransferCapability getBankTransfer() {
            return this.bankTransfer;
        }

        /* compiled from: ProviderCapabilities.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002*+BC\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J&\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÁ\u0001¢\u0006\u0002\b)R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R$\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities$BankTransferCapability;", "", "seen1", "", "releaseChannel", "", "availability", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderAvailability;", "schemes", "", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderScheme;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderAvailability;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderAvailability;Ljava/util/List;)V", "getAvailability$annotations", "()V", "getAvailability", "()Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderAvailability;", "getReleaseChannel$annotations", "getReleaseChannel", "()Ljava/lang/String;", "getSchemes$annotations", "getSchemes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class BankTransferCapability {
            private final ProviderAvailability availability;
            private final String releaseChannel;
            private final List<ProviderScheme> schemes;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(ProviderScheme4.INSTANCE)};

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ BankTransferCapability copy$default(BankTransferCapability bankTransferCapability, String str, ProviderAvailability providerAvailability, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bankTransferCapability.releaseChannel;
                }
                if ((i & 2) != 0) {
                    providerAvailability = bankTransferCapability.availability;
                }
                if ((i & 4) != 0) {
                    list = bankTransferCapability.schemes;
                }
                return bankTransferCapability.copy(str, providerAvailability, list);
            }

            @SerialName("availability")
            public static /* synthetic */ void getAvailability$annotations() {
            }

            @SerialName("release_channel")
            public static /* synthetic */ void getReleaseChannel$annotations() {
            }

            @SerialName("schemes")
            public static /* synthetic */ void getSchemes$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getReleaseChannel() {
                return this.releaseChannel;
            }

            /* renamed from: component2, reason: from getter */
            public final ProviderAvailability getAvailability() {
                return this.availability;
            }

            public final List<ProviderScheme> component3() {
                return this.schemes;
            }

            public final BankTransferCapability copy(String releaseChannel, ProviderAvailability availability, List<ProviderScheme> schemes) {
                Intrinsics.checkNotNullParameter(releaseChannel, "releaseChannel");
                return new BankTransferCapability(releaseChannel, availability, schemes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BankTransferCapability)) {
                    return false;
                }
                BankTransferCapability bankTransferCapability = (BankTransferCapability) other;
                return Intrinsics.areEqual(this.releaseChannel, bankTransferCapability.releaseChannel) && Intrinsics.areEqual(this.availability, bankTransferCapability.availability) && Intrinsics.areEqual(this.schemes, bankTransferCapability.schemes);
            }

            public int hashCode() {
                int iHashCode = this.releaseChannel.hashCode() * 31;
                ProviderAvailability providerAvailability = this.availability;
                int iHashCode2 = (iHashCode + (providerAvailability == null ? 0 : providerAvailability.hashCode())) * 31;
                List<ProviderScheme> list = this.schemes;
                return iHashCode2 + (list != null ? list.hashCode() : 0);
            }

            public String toString() {
                return "BankTransferCapability(releaseChannel=" + this.releaseChannel + ", availability=" + this.availability + ", schemes=" + this.schemes + ")";
            }

            /* compiled from: ProviderCapabilities.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities$BankTransferCapability$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities$BankTransferCapability;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<BankTransferCapability> serializer() {
                    return ProviderCapabilities6.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ BankTransferCapability(int i, @SerialName("release_channel") String str, @SerialName("availability") ProviderAvailability providerAvailability, @SerialName("schemes") List list, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, ProviderCapabilities6.INSTANCE.getDescriptor());
                }
                this.releaseChannel = str;
                if ((i & 2) == 0) {
                    this.availability = null;
                } else {
                    this.availability = providerAvailability;
                }
                if ((i & 4) == 0) {
                    this.schemes = null;
                } else {
                    this.schemes = list;
                }
            }

            public BankTransferCapability(String releaseChannel, ProviderAvailability providerAvailability, List<ProviderScheme> list) {
                Intrinsics.checkNotNullParameter(releaseChannel, "releaseChannel");
                this.releaseChannel = releaseChannel;
                this.availability = providerAvailability;
                this.schemes = list;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_core_release(BankTransferCapability self, Encoding3 output, SerialDescriptor serialDesc) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                output.encodeStringElement(serialDesc, 0, self.releaseChannel);
                if (output.shouldEncodeElementDefault(serialDesc, 1) || self.availability != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, ProviderAvailability4.INSTANCE, self.availability);
                }
                if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.schemes == null) {
                    return;
                }
                output.encodeNullableSerializableElement(serialDesc, 2, kSerializerArr[2], self.schemes);
            }

            public /* synthetic */ BankTransferCapability(String str, ProviderAvailability providerAvailability, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : providerAvailability, (i & 4) != 0 ? null : list);
            }

            public final String getReleaseChannel() {
                return this.releaseChannel;
            }

            public final ProviderAvailability getAvailability() {
                return this.availability;
            }

            public final List<ProviderScheme> getSchemes() {
                return this.schemes;
            }
        }
    }

    /* compiled from: ProviderCapabilities.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0003\"#$B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006%"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities;", "", "seen1", "", "vrpSweeping", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities$VRPCapability;", "vrpCommercial", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities$VRPCapability;Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities$VRPCapability;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities$VRPCapability;Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities$VRPCapability;)V", "getVrpCommercial$annotations", "()V", "getVrpCommercial", "()Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities$VRPCapability;", "getVrpSweeping$annotations", "getVrpSweeping", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "VRPCapability", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class MandateCapabilities {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final VRPCapability vrpCommercial;
        private final VRPCapability vrpSweeping;

        /* JADX WARN: Multi-variable type inference failed */
        public MandateCapabilities() {
            this((VRPCapability) null, (VRPCapability) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ MandateCapabilities copy$default(MandateCapabilities mandateCapabilities, VRPCapability vRPCapability, VRPCapability vRPCapability2, int i, Object obj) {
            if ((i & 1) != 0) {
                vRPCapability = mandateCapabilities.vrpSweeping;
            }
            if ((i & 2) != 0) {
                vRPCapability2 = mandateCapabilities.vrpCommercial;
            }
            return mandateCapabilities.copy(vRPCapability, vRPCapability2);
        }

        @SerialName("vrp_commercial")
        public static /* synthetic */ void getVrpCommercial$annotations() {
        }

        @SerialName("vrp_sweeping")
        public static /* synthetic */ void getVrpSweeping$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final VRPCapability getVrpSweeping() {
            return this.vrpSweeping;
        }

        /* renamed from: component2, reason: from getter */
        public final VRPCapability getVrpCommercial() {
            return this.vrpCommercial;
        }

        public final MandateCapabilities copy(VRPCapability vrpSweeping, VRPCapability vrpCommercial) {
            return new MandateCapabilities(vrpSweeping, vrpCommercial);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MandateCapabilities)) {
                return false;
            }
            MandateCapabilities mandateCapabilities = (MandateCapabilities) other;
            return Intrinsics.areEqual(this.vrpSweeping, mandateCapabilities.vrpSweeping) && Intrinsics.areEqual(this.vrpCommercial, mandateCapabilities.vrpCommercial);
        }

        public int hashCode() {
            VRPCapability vRPCapability = this.vrpSweeping;
            int iHashCode = (vRPCapability == null ? 0 : vRPCapability.hashCode()) * 31;
            VRPCapability vRPCapability2 = this.vrpCommercial;
            return iHashCode + (vRPCapability2 != null ? vRPCapability2.hashCode() : 0);
        }

        public String toString() {
            return "MandateCapabilities(vrpSweeping=" + this.vrpSweeping + ", vrpCommercial=" + this.vrpCommercial + ")";
        }

        /* compiled from: ProviderCapabilities.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MandateCapabilities> serializer() {
                return ProviderCapabilities3.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ MandateCapabilities(int i, @SerialName("vrp_sweeping") VRPCapability vRPCapability, @SerialName("vrp_commercial") VRPCapability vRPCapability2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.vrpSweeping = null;
            } else {
                this.vrpSweeping = vRPCapability;
            }
            if ((i & 2) == 0) {
                this.vrpCommercial = null;
            } else {
                this.vrpCommercial = vRPCapability2;
            }
        }

        public MandateCapabilities(VRPCapability vRPCapability, VRPCapability vRPCapability2) {
            this.vrpSweeping = vRPCapability;
            this.vrpCommercial = vRPCapability2;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(MandateCapabilities self, Encoding3 output, SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.vrpSweeping != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ProviderCapabilities4.INSTANCE, self.vrpSweeping);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.vrpCommercial == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, ProviderCapabilities4.INSTANCE, self.vrpCommercial);
        }

        public /* synthetic */ MandateCapabilities(VRPCapability vRPCapability, VRPCapability vRPCapability2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : vRPCapability, (i & 2) != 0 ? null : vRPCapability2);
        }

        public final VRPCapability getVrpSweeping() {
            return this.vrpSweeping;
        }

        public final VRPCapability getVrpCommercial() {
            return this.vrpCommercial;
        }

        /* compiled from: ProviderCapabilities.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002#$B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities$VRPCapability;", "", "seen1", "", "releaseChannel", "", "availability", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderAvailability;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderAvailability;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderAvailability;)V", "getAvailability$annotations", "()V", "getAvailability", "()Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderAvailability;", "getReleaseChannel$annotations", "getReleaseChannel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class VRPCapability {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final ProviderAvailability availability;
            private final String releaseChannel;

            public static /* synthetic */ VRPCapability copy$default(VRPCapability vRPCapability, String str, ProviderAvailability providerAvailability, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = vRPCapability.releaseChannel;
                }
                if ((i & 2) != 0) {
                    providerAvailability = vRPCapability.availability;
                }
                return vRPCapability.copy(str, providerAvailability);
            }

            @SerialName("availability")
            public static /* synthetic */ void getAvailability$annotations() {
            }

            @SerialName("release_channel")
            public static /* synthetic */ void getReleaseChannel$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getReleaseChannel() {
                return this.releaseChannel;
            }

            /* renamed from: component2, reason: from getter */
            public final ProviderAvailability getAvailability() {
                return this.availability;
            }

            public final VRPCapability copy(String releaseChannel, ProviderAvailability availability) {
                Intrinsics.checkNotNullParameter(releaseChannel, "releaseChannel");
                return new VRPCapability(releaseChannel, availability);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VRPCapability)) {
                    return false;
                }
                VRPCapability vRPCapability = (VRPCapability) other;
                return Intrinsics.areEqual(this.releaseChannel, vRPCapability.releaseChannel) && Intrinsics.areEqual(this.availability, vRPCapability.availability);
            }

            public int hashCode() {
                int iHashCode = this.releaseChannel.hashCode() * 31;
                ProviderAvailability providerAvailability = this.availability;
                return iHashCode + (providerAvailability == null ? 0 : providerAvailability.hashCode());
            }

            public String toString() {
                return "VRPCapability(releaseChannel=" + this.releaseChannel + ", availability=" + this.availability + ")";
            }

            /* compiled from: ProviderCapabilities.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities$VRPCapability$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$MandateCapabilities$VRPCapability;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<VRPCapability> serializer() {
                    return ProviderCapabilities4.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ VRPCapability(int i, @SerialName("release_channel") String str, @SerialName("availability") ProviderAvailability providerAvailability, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, ProviderCapabilities4.INSTANCE.getDescriptor());
                }
                this.releaseChannel = str;
                if ((i & 2) == 0) {
                    this.availability = null;
                } else {
                    this.availability = providerAvailability;
                }
            }

            public VRPCapability(String releaseChannel, ProviderAvailability providerAvailability) {
                Intrinsics.checkNotNullParameter(releaseChannel, "releaseChannel");
                this.releaseChannel = releaseChannel;
                this.availability = providerAvailability;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_core_release(VRPCapability self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.releaseChannel);
                if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.availability == null) {
                    return;
                }
                output.encodeNullableSerializableElement(serialDesc, 1, ProviderAvailability4.INSTANCE, self.availability);
            }

            public /* synthetic */ VRPCapability(String str, ProviderAvailability providerAvailability, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : providerAvailability);
            }

            public final String getReleaseChannel() {
                return this.releaseChannel;
            }

            public final ProviderAvailability getAvailability() {
                return this.availability;
            }
        }
    }
}
