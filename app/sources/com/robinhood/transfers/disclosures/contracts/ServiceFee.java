package com.robinhood.transfers.disclosures.contracts;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: ServiceFee.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006$"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/ServiceFee;", "", "fee_rate", "", "max_fee", "min_fee", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFee_rate", "()Ljava/lang/String;", "getMax_fee", "getMin_fee", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class ServiceFee {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String fee_rate;
    private final String max_fee;
    private final String min_fee;

    public static /* synthetic */ ServiceFee copy$default(ServiceFee serviceFee, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceFee.fee_rate;
        }
        if ((i & 2) != 0) {
            str2 = serviceFee.max_fee;
        }
        if ((i & 4) != 0) {
            str3 = serviceFee.min_fee;
        }
        return serviceFee.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFee_rate() {
        return this.fee_rate;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMax_fee() {
        return this.max_fee;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMin_fee() {
        return this.min_fee;
    }

    public final ServiceFee copy(String fee_rate, String max_fee, String min_fee) {
        Intrinsics.checkNotNullParameter(fee_rate, "fee_rate");
        Intrinsics.checkNotNullParameter(max_fee, "max_fee");
        Intrinsics.checkNotNullParameter(min_fee, "min_fee");
        return new ServiceFee(fee_rate, max_fee, min_fee);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceFee)) {
            return false;
        }
        ServiceFee serviceFee = (ServiceFee) other;
        return Intrinsics.areEqual(this.fee_rate, serviceFee.fee_rate) && Intrinsics.areEqual(this.max_fee, serviceFee.max_fee) && Intrinsics.areEqual(this.min_fee, serviceFee.min_fee);
    }

    public int hashCode() {
        return (((this.fee_rate.hashCode() * 31) + this.max_fee.hashCode()) * 31) + this.min_fee.hashCode();
    }

    public String toString() {
        return "ServiceFee(fee_rate=" + this.fee_rate + ", max_fee=" + this.max_fee + ", min_fee=" + this.min_fee + ")";
    }

    /* compiled from: ServiceFee.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/ServiceFee$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/disclosures/contracts/ServiceFee;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ServiceFee> serializer() {
            return ServiceFee2.INSTANCE;
        }
    }

    public /* synthetic */ ServiceFee(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, ServiceFee2.INSTANCE.getDescriptor());
        }
        this.fee_rate = str;
        this.max_fee = str2;
        this.min_fee = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(ServiceFee self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.fee_rate);
        output.encodeStringElement(serialDesc, 1, self.max_fee);
        output.encodeStringElement(serialDesc, 2, self.min_fee);
    }

    public ServiceFee(String fee_rate, String max_fee, String min_fee) {
        Intrinsics.checkNotNullParameter(fee_rate, "fee_rate");
        Intrinsics.checkNotNullParameter(max_fee, "max_fee");
        Intrinsics.checkNotNullParameter(min_fee, "min_fee");
        this.fee_rate = fee_rate;
        this.max_fee = max_fee;
        this.min_fee = min_fee;
    }

    public final String getFee_rate() {
        return this.fee_rate;
    }

    public final String getMax_fee() {
        return this.max_fee;
    }

    public final String getMin_fee() {
        return this.min_fee;
    }
}
