package com.robinhood.onboarding.goldearningspotential.contracts;

import kotlin.Deprecated;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GoldEarningsModel.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B5\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldYGEarningsInFirstDepositExperimentConfig;", "", "seen1", "", "placeholder", "", "remoteImageUrl", "enabled", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getEnabled", "()Z", "getPlaceholder", "()Ljava/lang/String;", "getRemoteImageUrl", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes22.dex */
public final /* data */ class GoldYGEarningsInFirstDepositExperimentConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean enabled;
    private final String placeholder;
    private final String remoteImageUrl;

    public static /* synthetic */ GoldYGEarningsInFirstDepositExperimentConfig copy$default(GoldYGEarningsInFirstDepositExperimentConfig goldYGEarningsInFirstDepositExperimentConfig, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldYGEarningsInFirstDepositExperimentConfig.placeholder;
        }
        if ((i & 2) != 0) {
            str2 = goldYGEarningsInFirstDepositExperimentConfig.remoteImageUrl;
        }
        if ((i & 4) != 0) {
            z = goldYGEarningsInFirstDepositExperimentConfig.enabled;
        }
        return goldYGEarningsInFirstDepositExperimentConfig.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRemoteImageUrl() {
        return this.remoteImageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final GoldYGEarningsInFirstDepositExperimentConfig copy(String placeholder, String remoteImageUrl, boolean enabled) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        return new GoldYGEarningsInFirstDepositExperimentConfig(placeholder, remoteImageUrl, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldYGEarningsInFirstDepositExperimentConfig)) {
            return false;
        }
        GoldYGEarningsInFirstDepositExperimentConfig goldYGEarningsInFirstDepositExperimentConfig = (GoldYGEarningsInFirstDepositExperimentConfig) other;
        return Intrinsics.areEqual(this.placeholder, goldYGEarningsInFirstDepositExperimentConfig.placeholder) && Intrinsics.areEqual(this.remoteImageUrl, goldYGEarningsInFirstDepositExperimentConfig.remoteImageUrl) && this.enabled == goldYGEarningsInFirstDepositExperimentConfig.enabled;
    }

    public int hashCode() {
        int iHashCode = this.placeholder.hashCode() * 31;
        String str = this.remoteImageUrl;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "GoldYGEarningsInFirstDepositExperimentConfig(placeholder=" + this.placeholder + ", remoteImageUrl=" + this.remoteImageUrl + ", enabled=" + this.enabled + ")";
    }

    /* compiled from: GoldEarningsModel.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldYGEarningsInFirstDepositExperimentConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldYGEarningsInFirstDepositExperimentConfig;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GoldYGEarningsInFirstDepositExperimentConfig> serializer() {
            return GoldYGEarningsInFirstDepositExperimentConfig$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ GoldYGEarningsInFirstDepositExperimentConfig(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, GoldYGEarningsInFirstDepositExperimentConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.placeholder = str;
        this.remoteImageUrl = str2;
        this.enabled = z;
    }

    public GoldYGEarningsInFirstDepositExperimentConfig(String placeholder, String str, boolean z) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        this.placeholder = placeholder;
        this.remoteImageUrl = str;
        this.enabled = z;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(GoldYGEarningsInFirstDepositExperimentConfig self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.placeholder);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.remoteImageUrl);
        output.encodeBooleanElement(serialDesc, 2, self.enabled);
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getRemoteImageUrl() {
        return this.remoteImageUrl;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
