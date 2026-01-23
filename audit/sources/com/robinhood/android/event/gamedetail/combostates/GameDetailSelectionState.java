package com.robinhood.android.event.gamedetail.combostates;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailSelectionState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;", "Landroid/os/Parcelable;", "Position", "ContractSideSelections", "Empty", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState$ContractSideSelections;", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState$Empty;", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState$Position;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface GameDetailSelectionState extends Parcelable {

    /* compiled from: GameDetailSelectionState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState$Position;", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;", "contractId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getContractId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Position implements GameDetailSelectionState {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Position> CREATOR = new Creator();
        private final UUID contractId;

        /* compiled from: GameDetailSelectionState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Position> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Position createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Position((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Position[] newArray(int i) {
                return new Position[i];
            }
        }

        public static /* synthetic */ Position copy$default(Position position, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = position.contractId;
            }
            return position.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        public final Position copy(UUID contractId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            return new Position(contractId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Position) && Intrinsics.areEqual(this.contractId, ((Position) other).contractId);
        }

        public int hashCode() {
            return this.contractId.hashCode();
        }

        public String toString() {
            return "Position(contractId=" + this.contractId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.contractId);
        }

        public Position(UUID contractId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            this.contractId = contractId;
        }

        public final UUID getContractId() {
            return this.contractId;
        }
    }

    /* compiled from: GameDetailSelectionState.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState$ContractSideSelections;", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;", "selections", "", "Lcom/robinhood/android/event/gamedetail/combostates/ContractSelection;", "openStrikePickerKey", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "<init>", "(Ljava/util/List;Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;)V", "getSelections", "()Ljava/util/List;", "getOpenStrikePickerKey", "()Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContractSideSelections implements GameDetailSelectionState {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ContractSideSelections> CREATOR = new Creator();
        private final ContractIdWithSide openStrikePickerKey;
        private final List<ContractSelection> selections;

        /* compiled from: GameDetailSelectionState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ContractSideSelections> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ContractSideSelections createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ContractSelection.CREATOR.createFromParcel(parcel));
                }
                return new ContractSideSelections(arrayList, (ContractIdWithSide) parcel.readParcelable(ContractSideSelections.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ContractSideSelections[] newArray(int i) {
                return new ContractSideSelections[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ContractSideSelections copy$default(ContractSideSelections contractSideSelections, List list, ContractIdWithSide contractIdWithSide, int i, Object obj) {
            if ((i & 1) != 0) {
                list = contractSideSelections.selections;
            }
            if ((i & 2) != 0) {
                contractIdWithSide = contractSideSelections.openStrikePickerKey;
            }
            return contractSideSelections.copy(list, contractIdWithSide);
        }

        public final List<ContractSelection> component1() {
            return this.selections;
        }

        /* renamed from: component2, reason: from getter */
        public final ContractIdWithSide getOpenStrikePickerKey() {
            return this.openStrikePickerKey;
        }

        public final ContractSideSelections copy(List<ContractSelection> selections, ContractIdWithSide openStrikePickerKey) {
            Intrinsics.checkNotNullParameter(selections, "selections");
            return new ContractSideSelections(selections, openStrikePickerKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContractSideSelections)) {
                return false;
            }
            ContractSideSelections contractSideSelections = (ContractSideSelections) other;
            return Intrinsics.areEqual(this.selections, contractSideSelections.selections) && Intrinsics.areEqual(this.openStrikePickerKey, contractSideSelections.openStrikePickerKey);
        }

        public int hashCode() {
            int iHashCode = this.selections.hashCode() * 31;
            ContractIdWithSide contractIdWithSide = this.openStrikePickerKey;
            return iHashCode + (contractIdWithSide == null ? 0 : contractIdWithSide.hashCode());
        }

        public String toString() {
            return "ContractSideSelections(selections=" + this.selections + ", openStrikePickerKey=" + this.openStrikePickerKey + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<ContractSelection> list = this.selections;
            dest.writeInt(list.size());
            Iterator<ContractSelection> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.openStrikePickerKey, flags);
        }

        public ContractSideSelections(List<ContractSelection> selections, ContractIdWithSide contractIdWithSide) {
            Intrinsics.checkNotNullParameter(selections, "selections");
            this.selections = selections;
            this.openStrikePickerKey = contractIdWithSide;
        }

        public /* synthetic */ ContractSideSelections(List list, ContractIdWithSide contractIdWithSide, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : contractIdWithSide);
        }

        public final List<ContractSelection> getSelections() {
            return this.selections;
        }

        public final ContractIdWithSide getOpenStrikePickerKey() {
            return this.openStrikePickerKey;
        }
    }

    /* compiled from: GameDetailSelectionState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState$Empty;", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;", "lastSelection", "<init>", "(Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;)V", "getLastSelection", "()Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Empty implements GameDetailSelectionState {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Empty> CREATOR = new Creator();
        private final GameDetailSelectionState lastSelection;

        /* compiled from: GameDetailSelectionState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Empty> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Empty createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Empty((GameDetailSelectionState) parcel.readParcelable(Empty.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Empty[] newArray(int i) {
                return new Empty[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Empty() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Empty copy$default(Empty empty, GameDetailSelectionState gameDetailSelectionState, int i, Object obj) {
            if ((i & 1) != 0) {
                gameDetailSelectionState = empty.lastSelection;
            }
            return empty.copy(gameDetailSelectionState);
        }

        /* renamed from: component1, reason: from getter */
        public final GameDetailSelectionState getLastSelection() {
            return this.lastSelection;
        }

        public final Empty copy(GameDetailSelectionState lastSelection) {
            return new Empty(lastSelection);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Empty) && Intrinsics.areEqual(this.lastSelection, ((Empty) other).lastSelection);
        }

        public int hashCode() {
            GameDetailSelectionState gameDetailSelectionState = this.lastSelection;
            if (gameDetailSelectionState == null) {
                return 0;
            }
            return gameDetailSelectionState.hashCode();
        }

        public String toString() {
            return "Empty(lastSelection=" + this.lastSelection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.lastSelection, flags);
        }

        public Empty(GameDetailSelectionState gameDetailSelectionState) {
            this.lastSelection = gameDetailSelectionState;
        }

        public /* synthetic */ Empty(GameDetailSelectionState gameDetailSelectionState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : gameDetailSelectionState);
        }

        public final GameDetailSelectionState getLastSelection() {
            return this.lastSelection;
        }
    }
}
