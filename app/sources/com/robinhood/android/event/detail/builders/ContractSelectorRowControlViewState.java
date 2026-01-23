package com.robinhood.android.event.detail.builders;

import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildMultiContractList.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/event/detail/builders/ContractSelectorRowControlViewState;", "", "contract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "name", "", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "metadata", "enabled", "", "<init>", "(Lcom/robinhood/android/models/event/db/arsenal/EventContract;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Z)V", "getContract", "()Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "getName", "()Ljava/lang/String;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getMetadata", "getEnabled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContractSelectorRowControlViewState {
    public static final int $stable = 8;
    private final EventContract contract;
    private final boolean enabled;
    private final String metadata;
    private final String name;
    private final StringResource subtitle;

    public static /* synthetic */ ContractSelectorRowControlViewState copy$default(ContractSelectorRowControlViewState contractSelectorRowControlViewState, EventContract eventContract, String str, StringResource stringResource, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            eventContract = contractSelectorRowControlViewState.contract;
        }
        if ((i & 2) != 0) {
            str = contractSelectorRowControlViewState.name;
        }
        if ((i & 4) != 0) {
            stringResource = contractSelectorRowControlViewState.subtitle;
        }
        if ((i & 8) != 0) {
            str2 = contractSelectorRowControlViewState.metadata;
        }
        if ((i & 16) != 0) {
            z = contractSelectorRowControlViewState.enabled;
        }
        boolean z2 = z;
        StringResource stringResource2 = stringResource;
        return contractSelectorRowControlViewState.copy(eventContract, str, stringResource2, str2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final EventContract getContract() {
        return this.contract;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ContractSelectorRowControlViewState copy(EventContract contract, String name, StringResource subtitle, String metadata, boolean enabled) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new ContractSelectorRowControlViewState(contract, name, subtitle, metadata, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContractSelectorRowControlViewState)) {
            return false;
        }
        ContractSelectorRowControlViewState contractSelectorRowControlViewState = (ContractSelectorRowControlViewState) other;
        return Intrinsics.areEqual(this.contract, contractSelectorRowControlViewState.contract) && Intrinsics.areEqual(this.name, contractSelectorRowControlViewState.name) && Intrinsics.areEqual(this.subtitle, contractSelectorRowControlViewState.subtitle) && Intrinsics.areEqual(this.metadata, contractSelectorRowControlViewState.metadata) && this.enabled == contractSelectorRowControlViewState.enabled;
    }

    public int hashCode() {
        int iHashCode = ((this.contract.hashCode() * 31) + this.name.hashCode()) * 31;
        StringResource stringResource = this.subtitle;
        return ((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.metadata.hashCode()) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "ContractSelectorRowControlViewState(contract=" + this.contract + ", name=" + this.name + ", subtitle=" + this.subtitle + ", metadata=" + this.metadata + ", enabled=" + this.enabled + ")";
    }

    public ContractSelectorRowControlViewState(EventContract contract, String name, StringResource stringResource, String metadata, boolean z) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.contract = contract;
        this.name = name;
        this.subtitle = stringResource;
        this.metadata = metadata;
        this.enabled = z;
    }

    public final EventContract getContract() {
        return this.contract;
    }

    public final String getName() {
        return this.name;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
