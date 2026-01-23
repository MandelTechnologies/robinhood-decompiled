package com.truelayer.payments.core.domain.payments;

import com.robinhood.models.card.p311db.Card;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ProviderConfig.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.BM\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J&\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÁ\u0001¢\u0006\u0002\b,R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006/"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/ProviderConfig;", "", "seen1", "", "id", "", Card.Icon.ORDER, "", "hasUserPriming", "", "branches", "", "Lcom/truelayer/payments/core/domain/payments/Branch;", "iconExtended", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;FZLjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;FZLjava/util/List;Ljava/lang/String;)V", "getBranches", "()Ljava/util/List;", "getHasUserPriming", "()Z", "getIconExtended", "()Ljava/lang/String;", "getId", "getOrder", "()F", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class ProviderConfig {
    private final List<Branch> branches;
    private final boolean hasUserPriming;
    private final String iconExtended;
    private final String id;
    private final float order;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(Branch2.INSTANCE), null};

    public static /* synthetic */ ProviderConfig copy$default(ProviderConfig providerConfig, String str, float f, boolean z, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = providerConfig.id;
        }
        if ((i & 2) != 0) {
            f = providerConfig.order;
        }
        if ((i & 4) != 0) {
            z = providerConfig.hasUserPriming;
        }
        if ((i & 8) != 0) {
            list = providerConfig.branches;
        }
        if ((i & 16) != 0) {
            str2 = providerConfig.iconExtended;
        }
        String str3 = str2;
        boolean z2 = z;
        return providerConfig.copy(str, f, z2, list, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final float getOrder() {
        return this.order;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasUserPriming() {
        return this.hasUserPriming;
    }

    public final List<Branch> component4() {
        return this.branches;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIconExtended() {
        return this.iconExtended;
    }

    public final ProviderConfig copy(String id, float order, boolean hasUserPriming, List<Branch> branches, String iconExtended) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(branches, "branches");
        return new ProviderConfig(id, order, hasUserPriming, branches, iconExtended);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProviderConfig)) {
            return false;
        }
        ProviderConfig providerConfig = (ProviderConfig) other;
        return Intrinsics.areEqual(this.id, providerConfig.id) && Float.compare(this.order, providerConfig.order) == 0 && this.hasUserPriming == providerConfig.hasUserPriming && Intrinsics.areEqual(this.branches, providerConfig.branches) && Intrinsics.areEqual(this.iconExtended, providerConfig.iconExtended);
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + Float.hashCode(this.order)) * 31) + Boolean.hashCode(this.hasUserPriming)) * 31) + this.branches.hashCode()) * 31;
        String str = this.iconExtended;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ProviderConfig(id=" + this.id + ", order=" + this.order + ", hasUserPriming=" + this.hasUserPriming + ", branches=" + this.branches + ", iconExtended=" + this.iconExtended + ")";
    }

    /* compiled from: ProviderConfig.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/ProviderConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/domain/payments/ProviderConfig;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ProviderConfig> serializer() {
            return ProviderConfig2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ ProviderConfig(int i, String str, float f, boolean z, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (27 != (i & 27)) {
            PluginExceptions.throwMissingFieldException(i, 27, ProviderConfig2.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.order = f;
        if ((i & 4) == 0) {
            this.hasUserPriming = false;
        } else {
            this.hasUserPriming = z;
        }
        this.branches = list;
        this.iconExtended = str2;
    }

    public ProviderConfig(String id, float f, boolean z, List<Branch> branches, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(branches, "branches");
        this.id = id;
        this.order = f;
        this.hasUserPriming = z;
        this.branches = branches;
        this.iconExtended = str;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(ProviderConfig self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeFloatElement(serialDesc, 1, self.order);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.hasUserPriming) {
            output.encodeBooleanElement(serialDesc, 2, self.hasUserPriming);
        }
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.branches);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.iconExtended);
    }

    public /* synthetic */ ProviderConfig(String str, float f, boolean z, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, (i & 4) != 0 ? false : z, list, str2);
    }

    public final String getId() {
        return this.id;
    }

    public final float getOrder() {
        return this.order;
    }

    public final boolean getHasUserPriming() {
        return this.hasUserPriming;
    }

    public final List<Branch> getBranches() {
        return this.branches;
    }

    public final String getIconExtended() {
        return this.iconExtended;
    }
}
