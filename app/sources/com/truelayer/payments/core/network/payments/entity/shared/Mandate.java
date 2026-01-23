package com.truelayer.payments.core.network.payments.entity.shared;

import com.truelayer.payments.core.network.payments.entity.shared.Beneficiary;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PaymentMethod.kt */
@SerialName("mandate")
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 02\u00020\u0001:\u0002/0BI\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J7\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\n\u0010%\u001a\u0004\u0018\u00010\u0005H\u0016J\t\u0010&\u001a\u00020\u0005HÖ\u0001J&\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-HÁ\u0001¢\u0006\u0002\b.R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0015¨\u00061"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/Mandate;", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "seen1", "", "mandateId", "", "reference", "providerSelection", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection;", "beneficiary", "Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection;Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection;Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary;)V", "getBeneficiary$annotations", "()V", "getBeneficiary", "()Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary;", "getMandateId$annotations", "getMandateId", "()Ljava/lang/String;", "getProviderSelection$annotations", "getProviderSelection", "()Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection;", "getReference$annotations", "getReference", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "paymentReference", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class Mandate implements PaymentMethod {
    private final Beneficiary beneficiary;
    private final String mandateId;
    private final ProviderSelection providerSelection;
    private final String reference;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, ProviderSelection.INSTANCE.serializer(), new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.Beneficiary", Reflection.getOrCreateKotlinClass(Beneficiary.class), new KClass[]{Reflection.getOrCreateKotlinClass(Beneficiary.ExternalAccount.class), Reflection.getOrCreateKotlinClass(Beneficiary.MerchantAccount.class)}, new KSerializer[]{Beneficiary$ExternalAccount$$serializer.INSTANCE, Beneficiary$MerchantAccount$$serializer.INSTANCE}, new Annotation[0])};

    public static /* synthetic */ Mandate copy$default(Mandate mandate, String str, String str2, ProviderSelection providerSelection, Beneficiary beneficiary, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mandate.mandateId;
        }
        if ((i & 2) != 0) {
            str2 = mandate.reference;
        }
        if ((i & 4) != 0) {
            providerSelection = mandate.providerSelection;
        }
        if ((i & 8) != 0) {
            beneficiary = mandate.beneficiary;
        }
        return mandate.copy(str, str2, providerSelection, beneficiary);
    }

    @SerialName("beneficiary")
    public static /* synthetic */ void getBeneficiary$annotations() {
    }

    @SerialName("mandate_id")
    public static /* synthetic */ void getMandateId$annotations() {
    }

    @SerialName("provider_selection")
    public static /* synthetic */ void getProviderSelection$annotations() {
    }

    @SerialName("reference")
    public static /* synthetic */ void getReference$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getMandateId() {
        return this.mandateId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    /* renamed from: component3, reason: from getter */
    public final ProviderSelection getProviderSelection() {
        return this.providerSelection;
    }

    /* renamed from: component4, reason: from getter */
    public final Beneficiary getBeneficiary() {
        return this.beneficiary;
    }

    public final Mandate copy(String mandateId, String reference, ProviderSelection providerSelection, Beneficiary beneficiary) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        return new Mandate(mandateId, reference, providerSelection, beneficiary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Mandate)) {
            return false;
        }
        Mandate mandate = (Mandate) other;
        return Intrinsics.areEqual(this.mandateId, mandate.mandateId) && Intrinsics.areEqual(this.reference, mandate.reference) && Intrinsics.areEqual(this.providerSelection, mandate.providerSelection) && Intrinsics.areEqual(this.beneficiary, mandate.beneficiary);
    }

    public int hashCode() {
        int iHashCode = this.mandateId.hashCode() * 31;
        String str = this.reference;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ProviderSelection providerSelection = this.providerSelection;
        int iHashCode3 = (iHashCode2 + (providerSelection == null ? 0 : providerSelection.hashCode())) * 31;
        Beneficiary beneficiary = this.beneficiary;
        return iHashCode3 + (beneficiary != null ? beneficiary.hashCode() : 0);
    }

    public String toString() {
        return "Mandate(mandateId=" + this.mandateId + ", reference=" + this.reference + ", providerSelection=" + this.providerSelection + ", beneficiary=" + this.beneficiary + ")";
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/Mandate$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/Mandate;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Mandate> serializer() {
            return PaymentMethod5.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ Mandate(int i, @SerialName("mandate_id") String str, @SerialName("reference") String str2, @SerialName("provider_selection") ProviderSelection providerSelection, @SerialName("beneficiary") Beneficiary beneficiary, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, PaymentMethod5.INSTANCE.getDescriptor());
        }
        this.mandateId = str;
        if ((i & 2) == 0) {
            this.reference = null;
        } else {
            this.reference = str2;
        }
        if ((i & 4) == 0) {
            this.providerSelection = null;
        } else {
            this.providerSelection = providerSelection;
        }
        if ((i & 8) == 0) {
            this.beneficiary = null;
        } else {
            this.beneficiary = beneficiary;
        }
    }

    public Mandate(String mandateId, String str, ProviderSelection providerSelection, Beneficiary beneficiary) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        this.mandateId = mandateId;
        this.reference = str;
        this.providerSelection = providerSelection;
        this.beneficiary = beneficiary;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(Mandate self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.mandateId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.reference != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.reference);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.getProviderSelection() != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, kSerializerArr[2], self.getProviderSelection());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.getBeneficiary() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.getBeneficiary());
    }

    public /* synthetic */ Mandate(String str, String str2, ProviderSelection providerSelection, Beneficiary beneficiary, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : providerSelection, (i & 8) != 0 ? null : beneficiary);
    }

    public final String getMandateId() {
        return this.mandateId;
    }

    public final String getReference() {
        return this.reference;
    }

    @Override // com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod
    public ProviderSelection getProviderSelection() {
        return this.providerSelection;
    }

    @Override // com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod
    public Beneficiary getBeneficiary() {
        return this.beneficiary;
    }

    @Override // com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod
    public String paymentReference() {
        return this.reference;
    }
}
