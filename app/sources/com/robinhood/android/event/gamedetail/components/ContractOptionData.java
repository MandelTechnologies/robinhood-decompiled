package com.robinhood.android.event.gamedetail.components;

import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContractRow.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;", "", "strikeContract", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "selectedContract", "currentWheelPickerContract", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "contractColumnType", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;", "<init>", "(Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;)V", "getStrikeContract", "()Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "getSelectedContract", "getCurrentWheelPickerContract", "()Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "getContractColumnType", "()Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContractOptionData {
    public static final int $stable = 8;
    private final ContractGroup3 contractColumnType;
    private final ContractElement currentWheelPickerContract;
    private final ContractIdWithSide selectedContract;
    private final ContractIdWithSide strikeContract;

    public static /* synthetic */ ContractOptionData copy$default(ContractOptionData contractOptionData, ContractIdWithSide contractIdWithSide, ContractIdWithSide contractIdWithSide2, ContractElement contractElement, ContractGroup3 contractGroup3, int i, Object obj) {
        if ((i & 1) != 0) {
            contractIdWithSide = contractOptionData.strikeContract;
        }
        if ((i & 2) != 0) {
            contractIdWithSide2 = contractOptionData.selectedContract;
        }
        if ((i & 4) != 0) {
            contractElement = contractOptionData.currentWheelPickerContract;
        }
        if ((i & 8) != 0) {
            contractGroup3 = contractOptionData.contractColumnType;
        }
        return contractOptionData.copy(contractIdWithSide, contractIdWithSide2, contractElement, contractGroup3);
    }

    /* renamed from: component1, reason: from getter */
    public final ContractIdWithSide getStrikeContract() {
        return this.strikeContract;
    }

    /* renamed from: component2, reason: from getter */
    public final ContractIdWithSide getSelectedContract() {
        return this.selectedContract;
    }

    /* renamed from: component3, reason: from getter */
    public final ContractElement getCurrentWheelPickerContract() {
        return this.currentWheelPickerContract;
    }

    /* renamed from: component4, reason: from getter */
    public final ContractGroup3 getContractColumnType() {
        return this.contractColumnType;
    }

    public final ContractOptionData copy(ContractIdWithSide strikeContract, ContractIdWithSide selectedContract, ContractElement currentWheelPickerContract, ContractGroup3 contractColumnType) {
        Intrinsics.checkNotNullParameter(strikeContract, "strikeContract");
        Intrinsics.checkNotNullParameter(selectedContract, "selectedContract");
        Intrinsics.checkNotNullParameter(contractColumnType, "contractColumnType");
        return new ContractOptionData(strikeContract, selectedContract, currentWheelPickerContract, contractColumnType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContractOptionData)) {
            return false;
        }
        ContractOptionData contractOptionData = (ContractOptionData) other;
        return Intrinsics.areEqual(this.strikeContract, contractOptionData.strikeContract) && Intrinsics.areEqual(this.selectedContract, contractOptionData.selectedContract) && Intrinsics.areEqual(this.currentWheelPickerContract, contractOptionData.currentWheelPickerContract) && this.contractColumnType == contractOptionData.contractColumnType;
    }

    public int hashCode() {
        int iHashCode = ((this.strikeContract.hashCode() * 31) + this.selectedContract.hashCode()) * 31;
        ContractElement contractElement = this.currentWheelPickerContract;
        return ((iHashCode + (contractElement == null ? 0 : contractElement.hashCode())) * 31) + this.contractColumnType.hashCode();
    }

    public String toString() {
        return "ContractOptionData(strikeContract=" + this.strikeContract + ", selectedContract=" + this.selectedContract + ", currentWheelPickerContract=" + this.currentWheelPickerContract + ", contractColumnType=" + this.contractColumnType + ")";
    }

    public ContractOptionData(ContractIdWithSide strikeContract, ContractIdWithSide selectedContract, ContractElement contractElement, ContractGroup3 contractColumnType) {
        Intrinsics.checkNotNullParameter(strikeContract, "strikeContract");
        Intrinsics.checkNotNullParameter(selectedContract, "selectedContract");
        Intrinsics.checkNotNullParameter(contractColumnType, "contractColumnType");
        this.strikeContract = strikeContract;
        this.selectedContract = selectedContract;
        this.currentWheelPickerContract = contractElement;
        this.contractColumnType = contractColumnType;
    }

    public final ContractIdWithSide getStrikeContract() {
        return this.strikeContract;
    }

    public final ContractIdWithSide getSelectedContract() {
        return this.selectedContract;
    }

    public final ContractElement getCurrentWheelPickerContract() {
        return this.currentWheelPickerContract;
    }

    public final ContractGroup3 getContractColumnType() {
        return this.contractColumnType;
    }
}
