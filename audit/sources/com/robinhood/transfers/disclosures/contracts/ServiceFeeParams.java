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

/* compiled from: ServiceFeeParams.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\""}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/ServiceFeeParams;", "", "pull", "Lcom/robinhood/transfers/disclosures/contracts/ServiceFee;", "push", "<init>", "(Lcom/robinhood/transfers/disclosures/contracts/ServiceFee;Lcom/robinhood/transfers/disclosures/contracts/ServiceFee;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/transfers/disclosures/contracts/ServiceFee;Lcom/robinhood/transfers/disclosures/contracts/ServiceFee;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPull", "()Lcom/robinhood/transfers/disclosures/contracts/ServiceFee;", "getPush", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class ServiceFeeParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ServiceFee pull;
    private final ServiceFee push;

    public static /* synthetic */ ServiceFeeParams copy$default(ServiceFeeParams serviceFeeParams, ServiceFee serviceFee, ServiceFee serviceFee2, int i, Object obj) {
        if ((i & 1) != 0) {
            serviceFee = serviceFeeParams.pull;
        }
        if ((i & 2) != 0) {
            serviceFee2 = serviceFeeParams.push;
        }
        return serviceFeeParams.copy(serviceFee, serviceFee2);
    }

    /* renamed from: component1, reason: from getter */
    public final ServiceFee getPull() {
        return this.pull;
    }

    /* renamed from: component2, reason: from getter */
    public final ServiceFee getPush() {
        return this.push;
    }

    public final ServiceFeeParams copy(ServiceFee pull, ServiceFee push) {
        Intrinsics.checkNotNullParameter(pull, "pull");
        Intrinsics.checkNotNullParameter(push, "push");
        return new ServiceFeeParams(pull, push);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceFeeParams)) {
            return false;
        }
        ServiceFeeParams serviceFeeParams = (ServiceFeeParams) other;
        return Intrinsics.areEqual(this.pull, serviceFeeParams.pull) && Intrinsics.areEqual(this.push, serviceFeeParams.push);
    }

    public int hashCode() {
        return (this.pull.hashCode() * 31) + this.push.hashCode();
    }

    public String toString() {
        return "ServiceFeeParams(pull=" + this.pull + ", push=" + this.push + ")";
    }

    /* compiled from: ServiceFeeParams.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/ServiceFeeParams$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/disclosures/contracts/ServiceFeeParams;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ServiceFeeParams> serializer() {
            return ServiceFeeParams2.INSTANCE;
        }
    }

    public /* synthetic */ ServiceFeeParams(int i, ServiceFee serviceFee, ServiceFee serviceFee2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, ServiceFeeParams2.INSTANCE.getDescriptor());
        }
        this.pull = serviceFee;
        this.push = serviceFee2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(ServiceFeeParams self, Encoding3 output, SerialDescriptor serialDesc) {
        ServiceFee2 serviceFee2 = ServiceFee2.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, serviceFee2, self.pull);
        output.encodeSerializableElement(serialDesc, 1, serviceFee2, self.push);
    }

    public ServiceFeeParams(ServiceFee pull, ServiceFee push) {
        Intrinsics.checkNotNullParameter(pull, "pull");
        Intrinsics.checkNotNullParameter(push, "push");
        this.pull = pull;
        this.push = push;
    }

    public final ServiceFee getPull() {
        return this.pull;
    }

    public final ServiceFee getPush() {
        return this.push;
    }
}
