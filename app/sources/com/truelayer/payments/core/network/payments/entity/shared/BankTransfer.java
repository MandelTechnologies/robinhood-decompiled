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

/* compiled from: PaymentMethod.kt */
@SerialName("bank_transfer")
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002&'B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÁ\u0001¢\u0006\u0002\b%R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/BankTransfer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "seen1", "", "providerSelection", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection;", "beneficiary", "Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection;Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection;Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary;)V", "getBeneficiary$annotations", "()V", "getBeneficiary", "()Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary;", "getProviderSelection$annotations", "getProviderSelection", "()Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "paymentReference", "", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class BankTransfer implements PaymentMethod {
    private final Beneficiary beneficiary;
    private final ProviderSelection providerSelection;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {ProviderSelection.INSTANCE.serializer(), new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.Beneficiary", Reflection.getOrCreateKotlinClass(Beneficiary.class), new KClass[]{Reflection.getOrCreateKotlinClass(Beneficiary.ExternalAccount.class), Reflection.getOrCreateKotlinClass(Beneficiary.MerchantAccount.class)}, new KSerializer[]{Beneficiary$ExternalAccount$$serializer.INSTANCE, Beneficiary$MerchantAccount$$serializer.INSTANCE}, new Annotation[0])};

    public static /* synthetic */ BankTransfer copy$default(BankTransfer bankTransfer, ProviderSelection providerSelection, Beneficiary beneficiary, int i, Object obj) {
        if ((i & 1) != 0) {
            providerSelection = bankTransfer.providerSelection;
        }
        if ((i & 2) != 0) {
            beneficiary = bankTransfer.beneficiary;
        }
        return bankTransfer.copy(providerSelection, beneficiary);
    }

    @SerialName("beneficiary")
    public static /* synthetic */ void getBeneficiary$annotations() {
    }

    @SerialName("provider_selection")
    public static /* synthetic */ void getProviderSelection$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final ProviderSelection getProviderSelection() {
        return this.providerSelection;
    }

    /* renamed from: component2, reason: from getter */
    public final Beneficiary getBeneficiary() {
        return this.beneficiary;
    }

    public final BankTransfer copy(ProviderSelection providerSelection, Beneficiary beneficiary) {
        Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
        return new BankTransfer(providerSelection, beneficiary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankTransfer)) {
            return false;
        }
        BankTransfer bankTransfer = (BankTransfer) other;
        return Intrinsics.areEqual(this.providerSelection, bankTransfer.providerSelection) && Intrinsics.areEqual(this.beneficiary, bankTransfer.beneficiary);
    }

    public int hashCode() {
        int iHashCode = this.providerSelection.hashCode() * 31;
        Beneficiary beneficiary = this.beneficiary;
        return iHashCode + (beneficiary == null ? 0 : beneficiary.hashCode());
    }

    public String toString() {
        return "BankTransfer(providerSelection=" + this.providerSelection + ", beneficiary=" + this.beneficiary + ")";
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/BankTransfer$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/BankTransfer;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BankTransfer> serializer() {
            return PaymentMethod3.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ BankTransfer(int i, @SerialName("provider_selection") ProviderSelection providerSelection, @SerialName("beneficiary") Beneficiary beneficiary, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, PaymentMethod3.INSTANCE.getDescriptor());
        }
        this.providerSelection = providerSelection;
        if ((i & 2) == 0) {
            this.beneficiary = null;
        } else {
            this.beneficiary = beneficiary;
        }
    }

    public BankTransfer(ProviderSelection providerSelection, Beneficiary beneficiary) {
        Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
        this.providerSelection = providerSelection;
        this.beneficiary = beneficiary;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(BankTransfer self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.getProviderSelection());
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.getBeneficiary() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.getBeneficiary());
    }

    public /* synthetic */ BankTransfer(ProviderSelection providerSelection, Beneficiary beneficiary, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(providerSelection, (i & 2) != 0 ? null : beneficiary);
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
        if (getBeneficiary() instanceof Beneficiary.ExternalAccount) {
            return ((Beneficiary.ExternalAccount) getBeneficiary()).getReference();
        }
        return null;
    }
}
