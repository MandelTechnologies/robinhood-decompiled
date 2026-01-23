package com.robinhood.android.event.gamedetail.combostates;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailSelectionState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/combostates/ContractSelection;", "Landroid/os/Parcelable;", "key", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "currentContractIdWithSide", "contractColumnType", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;", "<init>", "(Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;)V", "getKey", "()Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "getCurrentContractIdWithSide", "getContractColumnType", "()Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContractSelection implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ContractSelection> CREATOR = new Creator();
    private final ContractGroup3 contractColumnType;
    private final ContractIdWithSide currentContractIdWithSide;
    private final ContractIdWithSide key;

    /* compiled from: GameDetailSelectionState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ContractSelection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractSelection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContractSelection((ContractIdWithSide) parcel.readParcelable(ContractSelection.class.getClassLoader()), (ContractIdWithSide) parcel.readParcelable(ContractSelection.class.getClassLoader()), ContractGroup3.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractSelection[] newArray(int i) {
            return new ContractSelection[i];
        }
    }

    public static /* synthetic */ ContractSelection copy$default(ContractSelection contractSelection, ContractIdWithSide contractIdWithSide, ContractIdWithSide contractIdWithSide2, ContractGroup3 contractGroup3, int i, Object obj) {
        if ((i & 1) != 0) {
            contractIdWithSide = contractSelection.key;
        }
        if ((i & 2) != 0) {
            contractIdWithSide2 = contractSelection.currentContractIdWithSide;
        }
        if ((i & 4) != 0) {
            contractGroup3 = contractSelection.contractColumnType;
        }
        return contractSelection.copy(contractIdWithSide, contractIdWithSide2, contractGroup3);
    }

    /* renamed from: component1, reason: from getter */
    public final ContractIdWithSide getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final ContractIdWithSide getCurrentContractIdWithSide() {
        return this.currentContractIdWithSide;
    }

    /* renamed from: component3, reason: from getter */
    public final ContractGroup3 getContractColumnType() {
        return this.contractColumnType;
    }

    public final ContractSelection copy(ContractIdWithSide key, ContractIdWithSide currentContractIdWithSide, ContractGroup3 contractColumnType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(currentContractIdWithSide, "currentContractIdWithSide");
        Intrinsics.checkNotNullParameter(contractColumnType, "contractColumnType");
        return new ContractSelection(key, currentContractIdWithSide, contractColumnType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContractSelection)) {
            return false;
        }
        ContractSelection contractSelection = (ContractSelection) other;
        return Intrinsics.areEqual(this.key, contractSelection.key) && Intrinsics.areEqual(this.currentContractIdWithSide, contractSelection.currentContractIdWithSide) && this.contractColumnType == contractSelection.contractColumnType;
    }

    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.currentContractIdWithSide.hashCode()) * 31) + this.contractColumnType.hashCode();
    }

    public String toString() {
        return "ContractSelection(key=" + this.key + ", currentContractIdWithSide=" + this.currentContractIdWithSide + ", contractColumnType=" + this.contractColumnType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.key, flags);
        dest.writeParcelable(this.currentContractIdWithSide, flags);
        dest.writeString(this.contractColumnType.name());
    }

    public ContractSelection(ContractIdWithSide key, ContractIdWithSide currentContractIdWithSide, ContractGroup3 contractColumnType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(currentContractIdWithSide, "currentContractIdWithSide");
        Intrinsics.checkNotNullParameter(contractColumnType, "contractColumnType");
        this.key = key;
        this.currentContractIdWithSide = currentContractIdWithSide;
        this.contractColumnType = contractColumnType;
    }

    public final ContractIdWithSide getKey() {
        return this.key;
    }

    public final ContractIdWithSide getCurrentContractIdWithSide() {
        return this.currentContractIdWithSide;
    }

    public final ContractGroup3 getContractColumnType() {
        return this.contractColumnType;
    }
}
