package com.robinhood.android.eventcontracts.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventContractsNavigationKeys.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0007\bR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contracts/EventCashSettlementDetailFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "ByCashSettlementId", "ByContractId", "Lcom/robinhood/android/eventcontracts/contracts/EventCashSettlementDetailFragmentKey$ByCashSettlementId;", "Lcom/robinhood/android/eventcontracts/contracts/EventCashSettlementDetailFragmentKey$ByContractId;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EventCashSettlementDetailFragmentKey extends FragmentKey, TabFragmentKey {
    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    FragmentTab getDefaultTab();

    /* compiled from: EventContractsNavigationKeys.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contracts/EventCashSettlementDetailFragmentKey$ByCashSettlementId;", "Lcom/robinhood/android/eventcontracts/contracts/EventCashSettlementDetailFragmentKey;", "id", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ByCashSettlementId implements EventCashSettlementDetailFragmentKey {
        public static final Parcelable.Creator<ByCashSettlementId> CREATOR = new Creator();
        private final UUID id;

        /* compiled from: EventContractsNavigationKeys.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ByCashSettlementId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ByCashSettlementId createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByCashSettlementId((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ByCashSettlementId[] newArray(int i) {
                return new ByCashSettlementId[i];
            }
        }

        public static /* synthetic */ ByCashSettlementId copy$default(ByCashSettlementId byCashSettlementId, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = byCashSettlementId.id;
            }
            return byCashSettlementId.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        public final ByCashSettlementId copy(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new ByCashSettlementId(id);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ByCashSettlementId) && Intrinsics.areEqual(this.id, ((ByCashSettlementId) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "ByCashSettlementId(id=" + this.id + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
        }

        @Override // com.robinhood.android.eventcontracts.contracts.EventCashSettlementDetailFragmentKey, com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return DefaultImpls.getDefaultTab(this);
        }

        public ByCashSettlementId(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public final UUID getId() {
            return this.id;
        }
    }

    /* compiled from: EventContractsNavigationKeys.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contracts/EventCashSettlementDetailFragmentKey$ByContractId;", "Lcom/robinhood/android/eventcontracts/contracts/EventCashSettlementDetailFragmentKey;", "contractId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getContractId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ByContractId implements EventCashSettlementDetailFragmentKey {
        public static final Parcelable.Creator<ByContractId> CREATOR = new Creator();
        private final UUID contractId;

        /* compiled from: EventContractsNavigationKeys.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ByContractId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ByContractId createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByContractId((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ByContractId[] newArray(int i) {
                return new ByContractId[i];
            }
        }

        public static /* synthetic */ ByContractId copy$default(ByContractId byContractId, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = byContractId.contractId;
            }
            return byContractId.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        public final ByContractId copy(UUID contractId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            return new ByContractId(contractId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ByContractId) && Intrinsics.areEqual(this.contractId, ((ByContractId) other).contractId);
        }

        public int hashCode() {
            return this.contractId.hashCode();
        }

        public String toString() {
            return "ByContractId(contractId=" + this.contractId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.contractId);
        }

        @Override // com.robinhood.android.eventcontracts.contracts.EventCashSettlementDetailFragmentKey, com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return DefaultImpls.getDefaultTab(this);
        }

        public ByContractId(UUID contractId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            this.contractId = contractId;
        }

        public final UUID getContractId() {
            return this.contractId;
        }
    }

    /* compiled from: EventContractsNavigationKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static FragmentTab getDefaultTab(EventCashSettlementDetailFragmentKey eventCashSettlementDetailFragmentKey) {
            return FragmentTab.HOME;
        }
    }
}
