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
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/InitializeGoldEarningsCalculatorResponse;", "", "seen1", "", "enabled", "", "placeholder", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZLjava/lang/String;)V", "getEnabled", "()Z", "getPlaceholder", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes22.dex */
public final /* data */ class InitializeGoldEarningsCalculatorResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean enabled;
    private final String placeholder;

    public static /* synthetic */ InitializeGoldEarningsCalculatorResponse copy$default(InitializeGoldEarningsCalculatorResponse initializeGoldEarningsCalculatorResponse, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = initializeGoldEarningsCalculatorResponse.enabled;
        }
        if ((i & 2) != 0) {
            str = initializeGoldEarningsCalculatorResponse.placeholder;
        }
        return initializeGoldEarningsCalculatorResponse.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final InitializeGoldEarningsCalculatorResponse copy(boolean enabled, String placeholder) {
        return new InitializeGoldEarningsCalculatorResponse(enabled, placeholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializeGoldEarningsCalculatorResponse)) {
            return false;
        }
        InitializeGoldEarningsCalculatorResponse initializeGoldEarningsCalculatorResponse = (InitializeGoldEarningsCalculatorResponse) other;
        return this.enabled == initializeGoldEarningsCalculatorResponse.enabled && Intrinsics.areEqual(this.placeholder, initializeGoldEarningsCalculatorResponse.placeholder);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        String str = this.placeholder;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InitializeGoldEarningsCalculatorResponse(enabled=" + this.enabled + ", placeholder=" + this.placeholder + ")";
    }

    /* compiled from: GoldEarningsModel.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/InitializeGoldEarningsCalculatorResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/goldearningspotential/contracts/InitializeGoldEarningsCalculatorResponse;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InitializeGoldEarningsCalculatorResponse> serializer() {
            return InitializeGoldEarningsCalculatorResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ InitializeGoldEarningsCalculatorResponse(int i, boolean z, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, InitializeGoldEarningsCalculatorResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.enabled = z;
        this.placeholder = str;
    }

    public InitializeGoldEarningsCalculatorResponse(boolean z, String str) {
        this.enabled = z;
        this.placeholder = str;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(InitializeGoldEarningsCalculatorResponse self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.enabled);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.placeholder);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }
}
