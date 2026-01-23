package com.robinhood.android.event.detail.builders;

import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.animation.Delta;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildMultiContractList.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003JU\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010'\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001e¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/event/detail/builders/ContractSelectorRowTreatmentViewState;", "", "contractId", "Ljava/util/UUID;", "contractName", "", "openInterestDisplayText", "contractColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "openInterestDelta", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;", "leftButtonState", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "rightButtonState", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;)V", "getContractId", "()Ljava/util/UUID;", "getContractName", "()Ljava/lang/String;", "getOpenInterestDisplayText", "getContractColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "getOpenInterestDelta", "()Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;", "getLeftButtonState", "()Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "getRightButtonState", "isOpenInterestDeltaPositive", "", "()Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContractSelectorRowTreatmentViewState {
    public static final int $stable = 8;
    private final DayNightColor contractColor;
    private final UUID contractId;
    private final String contractName;
    private final ContractSelectorButtonViewState leftButtonState;
    private final Delta openInterestDelta;
    private final String openInterestDisplayText;
    private final ContractSelectorButtonViewState rightButtonState;

    public static /* synthetic */ ContractSelectorRowTreatmentViewState copy$default(ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewState, UUID uuid, String str, String str2, DayNightColor dayNightColor, Delta delta, ContractSelectorButtonViewState contractSelectorButtonViewState, ContractSelectorButtonViewState contractSelectorButtonViewState2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = contractSelectorRowTreatmentViewState.contractId;
        }
        if ((i & 2) != 0) {
            str = contractSelectorRowTreatmentViewState.contractName;
        }
        if ((i & 4) != 0) {
            str2 = contractSelectorRowTreatmentViewState.openInterestDisplayText;
        }
        if ((i & 8) != 0) {
            dayNightColor = contractSelectorRowTreatmentViewState.contractColor;
        }
        if ((i & 16) != 0) {
            delta = contractSelectorRowTreatmentViewState.openInterestDelta;
        }
        if ((i & 32) != 0) {
            contractSelectorButtonViewState = contractSelectorRowTreatmentViewState.leftButtonState;
        }
        if ((i & 64) != 0) {
            contractSelectorButtonViewState2 = contractSelectorRowTreatmentViewState.rightButtonState;
        }
        ContractSelectorButtonViewState contractSelectorButtonViewState3 = contractSelectorButtonViewState;
        ContractSelectorButtonViewState contractSelectorButtonViewState4 = contractSelectorButtonViewState2;
        Delta delta2 = delta;
        String str3 = str2;
        return contractSelectorRowTreatmentViewState.copy(uuid, str, str3, dayNightColor, delta2, contractSelectorButtonViewState3, contractSelectorButtonViewState4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getContractId() {
        return this.contractId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContractName() {
        return this.contractName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOpenInterestDisplayText() {
        return this.openInterestDisplayText;
    }

    /* renamed from: component4, reason: from getter */
    public final DayNightColor getContractColor() {
        return this.contractColor;
    }

    /* renamed from: component5, reason: from getter */
    public final Delta getOpenInterestDelta() {
        return this.openInterestDelta;
    }

    /* renamed from: component6, reason: from getter */
    public final ContractSelectorButtonViewState getLeftButtonState() {
        return this.leftButtonState;
    }

    /* renamed from: component7, reason: from getter */
    public final ContractSelectorButtonViewState getRightButtonState() {
        return this.rightButtonState;
    }

    public final ContractSelectorRowTreatmentViewState copy(UUID contractId, String contractName, String openInterestDisplayText, DayNightColor contractColor, Delta openInterestDelta, ContractSelectorButtonViewState leftButtonState, ContractSelectorButtonViewState rightButtonState) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(contractName, "contractName");
        Intrinsics.checkNotNullParameter(leftButtonState, "leftButtonState");
        Intrinsics.checkNotNullParameter(rightButtonState, "rightButtonState");
        return new ContractSelectorRowTreatmentViewState(contractId, contractName, openInterestDisplayText, contractColor, openInterestDelta, leftButtonState, rightButtonState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContractSelectorRowTreatmentViewState)) {
            return false;
        }
        ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewState = (ContractSelectorRowTreatmentViewState) other;
        return Intrinsics.areEqual(this.contractId, contractSelectorRowTreatmentViewState.contractId) && Intrinsics.areEqual(this.contractName, contractSelectorRowTreatmentViewState.contractName) && Intrinsics.areEqual(this.openInterestDisplayText, contractSelectorRowTreatmentViewState.openInterestDisplayText) && Intrinsics.areEqual(this.contractColor, contractSelectorRowTreatmentViewState.contractColor) && Intrinsics.areEqual(this.openInterestDelta, contractSelectorRowTreatmentViewState.openInterestDelta) && Intrinsics.areEqual(this.leftButtonState, contractSelectorRowTreatmentViewState.leftButtonState) && Intrinsics.areEqual(this.rightButtonState, contractSelectorRowTreatmentViewState.rightButtonState);
    }

    public int hashCode() {
        int iHashCode = ((this.contractId.hashCode() * 31) + this.contractName.hashCode()) * 31;
        String str = this.openInterestDisplayText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DayNightColor dayNightColor = this.contractColor;
        int iHashCode3 = (iHashCode2 + (dayNightColor == null ? 0 : dayNightColor.hashCode())) * 31;
        Delta delta = this.openInterestDelta;
        return ((((iHashCode3 + (delta != null ? delta.hashCode() : 0)) * 31) + this.leftButtonState.hashCode()) * 31) + this.rightButtonState.hashCode();
    }

    public String toString() {
        return "ContractSelectorRowTreatmentViewState(contractId=" + this.contractId + ", contractName=" + this.contractName + ", openInterestDisplayText=" + this.openInterestDisplayText + ", contractColor=" + this.contractColor + ", openInterestDelta=" + this.openInterestDelta + ", leftButtonState=" + this.leftButtonState + ", rightButtonState=" + this.rightButtonState + ")";
    }

    public ContractSelectorRowTreatmentViewState(UUID contractId, String contractName, String str, DayNightColor dayNightColor, Delta delta, ContractSelectorButtonViewState leftButtonState, ContractSelectorButtonViewState rightButtonState) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(contractName, "contractName");
        Intrinsics.checkNotNullParameter(leftButtonState, "leftButtonState");
        Intrinsics.checkNotNullParameter(rightButtonState, "rightButtonState");
        this.contractId = contractId;
        this.contractName = contractName;
        this.openInterestDisplayText = str;
        this.contractColor = dayNightColor;
        this.openInterestDelta = delta;
        this.leftButtonState = leftButtonState;
        this.rightButtonState = rightButtonState;
    }

    public final UUID getContractId() {
        return this.contractId;
    }

    public final String getContractName() {
        return this.contractName;
    }

    public final String getOpenInterestDisplayText() {
        return this.openInterestDisplayText;
    }

    public final DayNightColor getContractColor() {
        return this.contractColor;
    }

    public final Delta getOpenInterestDelta() {
        return this.openInterestDelta;
    }

    public final ContractSelectorButtonViewState getLeftButtonState() {
        return this.leftButtonState;
    }

    public final ContractSelectorButtonViewState getRightButtonState() {
        return this.rightButtonState;
    }

    public final Boolean isOpenInterestDeltaPositive() {
        Delta delta = this.openInterestDelta;
        if (delta != null) {
            if (delta.getSignedValue() > 0) {
                return Boolean.TRUE;
            }
            if (delta.getSignedValue() < 0) {
                return Boolean.FALSE;
            }
        }
        return null;
    }
}
