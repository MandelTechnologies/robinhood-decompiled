package com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts;

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

/* compiled from: ResurrectionLoggingModel.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006$"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingModel;", "", "upsellIdentifier", "", "experimentName", "experimentVariant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUpsellIdentifier", "()Ljava/lang/String;", "getExperimentName", "getExperimentVariant", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes22.dex */
public final /* data */ class ResurrectionUpsellLoggingModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String experimentName;
    private final String experimentVariant;
    private final String upsellIdentifier;

    public static /* synthetic */ ResurrectionUpsellLoggingModel copy$default(ResurrectionUpsellLoggingModel resurrectionUpsellLoggingModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resurrectionUpsellLoggingModel.upsellIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = resurrectionUpsellLoggingModel.experimentName;
        }
        if ((i & 4) != 0) {
            str3 = resurrectionUpsellLoggingModel.experimentVariant;
        }
        return resurrectionUpsellLoggingModel.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUpsellIdentifier() {
        return this.upsellIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExperimentName() {
        return this.experimentName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExperimentVariant() {
        return this.experimentVariant;
    }

    public final ResurrectionUpsellLoggingModel copy(String upsellIdentifier, String experimentName, String experimentVariant) {
        return new ResurrectionUpsellLoggingModel(upsellIdentifier, experimentName, experimentVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResurrectionUpsellLoggingModel)) {
            return false;
        }
        ResurrectionUpsellLoggingModel resurrectionUpsellLoggingModel = (ResurrectionUpsellLoggingModel) other;
        return Intrinsics.areEqual(this.upsellIdentifier, resurrectionUpsellLoggingModel.upsellIdentifier) && Intrinsics.areEqual(this.experimentName, resurrectionUpsellLoggingModel.experimentName) && Intrinsics.areEqual(this.experimentVariant, resurrectionUpsellLoggingModel.experimentVariant);
    }

    public int hashCode() {
        String str = this.upsellIdentifier;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.experimentName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.experimentVariant;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ResurrectionUpsellLoggingModel(upsellIdentifier=" + this.upsellIdentifier + ", experimentName=" + this.experimentName + ", experimentVariant=" + this.experimentVariant + ")";
    }

    /* compiled from: ResurrectionLoggingModel.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingModel;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ResurrectionUpsellLoggingModel> serializer() {
            return ResurrectionLoggingModel2.INSTANCE;
        }
    }

    public /* synthetic */ ResurrectionUpsellLoggingModel(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, ResurrectionLoggingModel2.INSTANCE.getDescriptor());
        }
        this.upsellIdentifier = str;
        if ((i & 2) == 0) {
            this.experimentName = null;
        } else {
            this.experimentName = str2;
        }
        if ((i & 4) == 0) {
            this.experimentVariant = null;
        } else {
            this.experimentVariant = str3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(ResurrectionUpsellLoggingModel self, Encoding3 output, SerialDescriptor serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.upsellIdentifier);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.experimentName != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.experimentName);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.experimentVariant == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.experimentVariant);
    }

    public ResurrectionUpsellLoggingModel(String str, String str2, String str3) {
        this.upsellIdentifier = str;
        this.experimentName = str2;
        this.experimentVariant = str3;
    }

    public /* synthetic */ ResurrectionUpsellLoggingModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final String getUpsellIdentifier() {
        return this.upsellIdentifier;
    }

    public final String getExperimentName() {
        return this.experimentName;
    }

    public final String getExperimentVariant() {
        return this.experimentVariant;
    }
}
