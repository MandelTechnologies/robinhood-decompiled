package com.robinhood.transfers.hub.contracts;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: TransferHubDisplayLogicContainer.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\nHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006&"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;", "", "showTransferAccountsIn", "", "isInRetirementTransferExperiment", "showGoldDepositBoostMaxAwareness", "showTransferBetweenAccounts", "<init>", "(ZZZZ)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getShowTransferAccountsIn", "()Z", "getShowGoldDepositBoostMaxAwareness", "getShowTransferBetweenAccounts", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class TransferHubDisplayLogicContainer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isInRetirementTransferExperiment;
    private final boolean showGoldDepositBoostMaxAwareness;
    private final boolean showTransferAccountsIn;
    private final boolean showTransferBetweenAccounts;

    public static /* synthetic */ TransferHubDisplayLogicContainer copy$default(TransferHubDisplayLogicContainer transferHubDisplayLogicContainer, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = transferHubDisplayLogicContainer.showTransferAccountsIn;
        }
        if ((i & 2) != 0) {
            z2 = transferHubDisplayLogicContainer.isInRetirementTransferExperiment;
        }
        if ((i & 4) != 0) {
            z3 = transferHubDisplayLogicContainer.showGoldDepositBoostMaxAwareness;
        }
        if ((i & 8) != 0) {
            z4 = transferHubDisplayLogicContainer.showTransferBetweenAccounts;
        }
        return transferHubDisplayLogicContainer.copy(z, z2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowTransferAccountsIn() {
        return this.showTransferAccountsIn;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsInRetirementTransferExperiment() {
        return this.isInRetirementTransferExperiment;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowGoldDepositBoostMaxAwareness() {
        return this.showGoldDepositBoostMaxAwareness;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowTransferBetweenAccounts() {
        return this.showTransferBetweenAccounts;
    }

    public final TransferHubDisplayLogicContainer copy(boolean showTransferAccountsIn, boolean isInRetirementTransferExperiment, boolean showGoldDepositBoostMaxAwareness, boolean showTransferBetweenAccounts) {
        return new TransferHubDisplayLogicContainer(showTransferAccountsIn, isInRetirementTransferExperiment, showGoldDepositBoostMaxAwareness, showTransferBetweenAccounts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferHubDisplayLogicContainer)) {
            return false;
        }
        TransferHubDisplayLogicContainer transferHubDisplayLogicContainer = (TransferHubDisplayLogicContainer) other;
        return this.showTransferAccountsIn == transferHubDisplayLogicContainer.showTransferAccountsIn && this.isInRetirementTransferExperiment == transferHubDisplayLogicContainer.isInRetirementTransferExperiment && this.showGoldDepositBoostMaxAwareness == transferHubDisplayLogicContainer.showGoldDepositBoostMaxAwareness && this.showTransferBetweenAccounts == transferHubDisplayLogicContainer.showTransferBetweenAccounts;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.showTransferAccountsIn) * 31) + Boolean.hashCode(this.isInRetirementTransferExperiment)) * 31) + Boolean.hashCode(this.showGoldDepositBoostMaxAwareness)) * 31) + Boolean.hashCode(this.showTransferBetweenAccounts);
    }

    public String toString() {
        return "TransferHubDisplayLogicContainer(showTransferAccountsIn=" + this.showTransferAccountsIn + ", isInRetirementTransferExperiment=" + this.isInRetirementTransferExperiment + ", showGoldDepositBoostMaxAwareness=" + this.showGoldDepositBoostMaxAwareness + ", showTransferBetweenAccounts=" + this.showTransferBetweenAccounts + ")";
    }

    /* compiled from: TransferHubDisplayLogicContainer.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransferHubDisplayLogicContainer> serializer() {
            return TransferHubDisplayLogicContainer2.INSTANCE;
        }
    }

    public /* synthetic */ TransferHubDisplayLogicContainer(int i, boolean z, boolean z2, boolean z3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, TransferHubDisplayLogicContainer2.INSTANCE.getDescriptor());
        }
        this.showTransferAccountsIn = z;
        this.isInRetirementTransferExperiment = z2;
        if ((i & 4) == 0) {
            this.showGoldDepositBoostMaxAwareness = false;
        } else {
            this.showGoldDepositBoostMaxAwareness = z3;
        }
        if ((i & 8) == 0) {
            this.showTransferBetweenAccounts = true;
        } else {
            this.showTransferBetweenAccounts = z4;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(TransferHubDisplayLogicContainer self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.showTransferAccountsIn);
        output.encodeBooleanElement(serialDesc, 1, self.isInRetirementTransferExperiment);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.showGoldDepositBoostMaxAwareness) {
            output.encodeBooleanElement(serialDesc, 2, self.showGoldDepositBoostMaxAwareness);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.showTransferBetweenAccounts) {
            return;
        }
        output.encodeBooleanElement(serialDesc, 3, self.showTransferBetweenAccounts);
    }

    public TransferHubDisplayLogicContainer(boolean z, boolean z2, boolean z3, boolean z4) {
        this.showTransferAccountsIn = z;
        this.isInRetirementTransferExperiment = z2;
        this.showGoldDepositBoostMaxAwareness = z3;
        this.showTransferBetweenAccounts = z4;
    }

    public /* synthetic */ TransferHubDisplayLogicContainer(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? true : z4);
    }

    public final boolean getShowTransferAccountsIn() {
        return this.showTransferAccountsIn;
    }

    public final boolean isInRetirementTransferExperiment() {
        return this.isInRetirementTransferExperiment;
    }

    public final boolean getShowGoldDepositBoostMaxAwareness() {
        return this.showGoldDepositBoostMaxAwareness;
    }

    public final boolean getShowTransferBetweenAccounts() {
        return this.showTransferBetweenAccounts;
    }
}
