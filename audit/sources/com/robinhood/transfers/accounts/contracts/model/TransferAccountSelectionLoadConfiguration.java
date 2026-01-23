package com.robinhood.transfers.accounts.contracts.model;

import com.robinhood.lib.transfers.contracts.models.TransferAccountType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TransferAccountSelectionLoadConfiguration.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\nHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountSelectionLoadConfiguration;", "", "preselectedAccountId", "", "skipAccountTypes", "", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/Set;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPreselectedAccountId", "()Ljava/lang/String;", "getSkipAccountTypes", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class TransferAccountSelectionLoadConfiguration {
    private final String preselectedAccountId;
    private final Set<TransferAccountType> skipAccountTypes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, new LinkedHashSetSerializer(TransferAccountType.INSTANCE.serializer())};

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransferAccountSelectionLoadConfiguration copy$default(TransferAccountSelectionLoadConfiguration transferAccountSelectionLoadConfiguration, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferAccountSelectionLoadConfiguration.preselectedAccountId;
        }
        if ((i & 2) != 0) {
            set = transferAccountSelectionLoadConfiguration.skipAccountTypes;
        }
        return transferAccountSelectionLoadConfiguration.copy(str, set);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPreselectedAccountId() {
        return this.preselectedAccountId;
    }

    public final Set<TransferAccountType> component2() {
        return this.skipAccountTypes;
    }

    public final TransferAccountSelectionLoadConfiguration copy(String preselectedAccountId, Set<? extends TransferAccountType> skipAccountTypes) {
        return new TransferAccountSelectionLoadConfiguration(preselectedAccountId, skipAccountTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferAccountSelectionLoadConfiguration)) {
            return false;
        }
        TransferAccountSelectionLoadConfiguration transferAccountSelectionLoadConfiguration = (TransferAccountSelectionLoadConfiguration) other;
        return Intrinsics.areEqual(this.preselectedAccountId, transferAccountSelectionLoadConfiguration.preselectedAccountId) && Intrinsics.areEqual(this.skipAccountTypes, transferAccountSelectionLoadConfiguration.skipAccountTypes);
    }

    public int hashCode() {
        String str = this.preselectedAccountId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Set<TransferAccountType> set = this.skipAccountTypes;
        return iHashCode + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TransferAccountSelectionLoadConfiguration(preselectedAccountId=" + this.preselectedAccountId + ", skipAccountTypes=" + this.skipAccountTypes + ")";
    }

    /* compiled from: TransferAccountSelectionLoadConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountSelectionLoadConfiguration$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountSelectionLoadConfiguration;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransferAccountSelectionLoadConfiguration> serializer() {
            return TransferAccountSelectionLoadConfiguration2.INSTANCE;
        }
    }

    public /* synthetic */ TransferAccountSelectionLoadConfiguration(int i, String str, Set set, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, TransferAccountSelectionLoadConfiguration2.INSTANCE.getDescriptor());
        }
        this.preselectedAccountId = str;
        this.skipAccountTypes = set;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(TransferAccountSelectionLoadConfiguration self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.preselectedAccountId);
        output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.skipAccountTypes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransferAccountSelectionLoadConfiguration(String str, Set<? extends TransferAccountType> set) {
        this.preselectedAccountId = str;
        this.skipAccountTypes = set;
    }

    public final String getPreselectedAccountId() {
        return this.preselectedAccountId;
    }

    public final Set<TransferAccountType> getSkipAccountTypes() {
        return this.skipAccountTypes;
    }
}
