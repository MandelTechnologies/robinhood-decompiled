package com.truelayer.payments.core.network.mandates.entity.shared;

import com.truelayer.payments.core.domain.utils.IntoDomain;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;
import kotlinx.datetime.serializers.InstantSerializers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: MandateConstraints.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000212BG\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB-\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J5\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\b\u0010&\u001a\u00020\u0002H\u0016J\t\u0010'\u001a\u00020(HÖ\u0001J&\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÁ\u0001¢\u0006\u0002\b0R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0019¨\u00063"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/MandateConstraints;", "seen1", "", "validFrom", "Lkotlinx/datetime/Instant;", "validTo", "maximumIndividualAmount", "", "periodicLimits", "Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/datetime/Instant;Lkotlinx/datetime/Instant;JLcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lkotlinx/datetime/Instant;Lkotlinx/datetime/Instant;JLcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits;)V", "getMaximumIndividualAmount$annotations", "()V", "getMaximumIndividualAmount", "()J", "getPeriodicLimits$annotations", "getPeriodicLimits", "()Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits;", "getValidFrom$annotations", "getValidFrom", "()Lkotlinx/datetime/Instant;", "getValidTo$annotations", "getValidTo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class MandateConstraints implements IntoDomain<com.truelayer.payments.core.domain.payments.MandateConstraints> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long maximumIndividualAmount;
    private final PeriodicLimits periodicLimits;
    private final Instant validFrom;
    private final Instant validTo;

    public static /* synthetic */ MandateConstraints copy$default(MandateConstraints mandateConstraints, Instant instant, Instant instant2, long j, PeriodicLimits periodicLimits, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = mandateConstraints.validFrom;
        }
        if ((i & 2) != 0) {
            instant2 = mandateConstraints.validTo;
        }
        if ((i & 4) != 0) {
            j = mandateConstraints.maximumIndividualAmount;
        }
        if ((i & 8) != 0) {
            periodicLimits = mandateConstraints.periodicLimits;
        }
        PeriodicLimits periodicLimits2 = periodicLimits;
        return mandateConstraints.copy(instant, instant2, j, periodicLimits2);
    }

    @SerialName("maximum_individual_amount")
    public static /* synthetic */ void getMaximumIndividualAmount$annotations() {
    }

    @SerialName("periodic_limits")
    public static /* synthetic */ void getPeriodicLimits$annotations() {
    }

    @SerialName("valid_from")
    public static /* synthetic */ void getValidFrom$annotations() {
    }

    @SerialName("valid_to")
    public static /* synthetic */ void getValidTo$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Instant getValidFrom() {
        return this.validFrom;
    }

    /* renamed from: component2, reason: from getter */
    public final Instant getValidTo() {
        return this.validTo;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMaximumIndividualAmount() {
        return this.maximumIndividualAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final PeriodicLimits getPeriodicLimits() {
        return this.periodicLimits;
    }

    public final MandateConstraints copy(Instant validFrom, Instant validTo, long maximumIndividualAmount, PeriodicLimits periodicLimits) {
        Intrinsics.checkNotNullParameter(periodicLimits, "periodicLimits");
        return new MandateConstraints(validFrom, validTo, maximumIndividualAmount, periodicLimits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MandateConstraints)) {
            return false;
        }
        MandateConstraints mandateConstraints = (MandateConstraints) other;
        return Intrinsics.areEqual(this.validFrom, mandateConstraints.validFrom) && Intrinsics.areEqual(this.validTo, mandateConstraints.validTo) && this.maximumIndividualAmount == mandateConstraints.maximumIndividualAmount && Intrinsics.areEqual(this.periodicLimits, mandateConstraints.periodicLimits);
    }

    public int hashCode() {
        Instant instant = this.validFrom;
        int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
        Instant instant2 = this.validTo;
        return ((((iHashCode + (instant2 != null ? instant2.hashCode() : 0)) * 31) + Long.hashCode(this.maximumIndividualAmount)) * 31) + this.periodicLimits.hashCode();
    }

    public String toString() {
        return "MandateConstraints(validFrom=" + this.validFrom + ", validTo=" + this.validTo + ", maximumIndividualAmount=" + this.maximumIndividualAmount + ", periodicLimits=" + this.periodicLimits + ")";
    }

    /* compiled from: MandateConstraints.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MandateConstraints> serializer() {
            return MandateConstraints3.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ MandateConstraints(int i, @SerialName("valid_from") Instant instant, @SerialName("valid_to") Instant instant2, @SerialName("maximum_individual_amount") long j, @SerialName("periodic_limits") PeriodicLimits periodicLimits, SerializationConstructorMarker serializationConstructorMarker) {
        if (12 != (i & 12)) {
            PluginExceptions.throwMissingFieldException(i, 12, MandateConstraints3.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.validFrom = null;
        } else {
            this.validFrom = instant;
        }
        if ((i & 2) == 0) {
            this.validTo = null;
        } else {
            this.validTo = instant2;
        }
        this.maximumIndividualAmount = j;
        this.periodicLimits = periodicLimits;
    }

    public MandateConstraints(Instant instant, Instant instant2, long j, PeriodicLimits periodicLimits) {
        Intrinsics.checkNotNullParameter(periodicLimits, "periodicLimits");
        this.validFrom = instant;
        this.validTo = instant2;
        this.maximumIndividualAmount = j;
        this.periodicLimits = periodicLimits;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(MandateConstraints self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.validFrom != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, InstantSerializers.INSTANCE, self.validFrom);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.validTo != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, InstantSerializers.INSTANCE, self.validTo);
        }
        output.encodeLongElement(serialDesc, 2, self.maximumIndividualAmount);
        output.encodeSerializableElement(serialDesc, 3, MandateConstraints5.INSTANCE, self.periodicLimits);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MandateConstraints(Instant instant, Instant instant2, long j, PeriodicLimits periodicLimits, int i, DefaultConstructorMarker defaultConstructorMarker) {
        PeriodicLimits periodicLimits2;
        long j2;
        Instant instant3;
        instant = (i & 1) != 0 ? null : instant;
        if ((i & 2) != 0) {
            periodicLimits2 = periodicLimits;
            j2 = j;
            instant3 = null;
        } else {
            periodicLimits2 = periodicLimits;
            j2 = j;
            instant3 = instant2;
        }
        this(instant, instant3, j2, periodicLimits2);
    }

    public final Instant getValidFrom() {
        return this.validFrom;
    }

    public final Instant getValidTo() {
        return this.validTo;
    }

    public final long getMaximumIndividualAmount() {
        return this.maximumIndividualAmount;
    }

    public final PeriodicLimits getPeriodicLimits() {
        return this.periodicLimits;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public com.truelayer.payments.core.domain.payments.MandateConstraints intoDomain2() {
        return new com.truelayer.payments.core.domain.payments.MandateConstraints(this.validFrom, this.validTo, this.maximumIndividualAmount, this.periodicLimits.intoDomain2());
    }
}
