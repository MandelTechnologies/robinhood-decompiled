package com.robinhood.android.event.gamedetail.components;

import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailPrepacks.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/PrepackOptionState;", "", "contractElement", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "contractColumnType", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;", "isSelected", "", "displayQuote", "", "<init>", "(Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;ZLjava/lang/String;)V", "getContractElement", "()Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "getContractColumnType", "()Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;", "()Z", "getDisplayQuote", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PrepackOptionState {
    public static final int $stable = 0;
    private final ContractGroup3 contractColumnType;
    private final ContractElement contractElement;
    private final String displayQuote;
    private final boolean isSelected;

    public static /* synthetic */ PrepackOptionState copy$default(PrepackOptionState prepackOptionState, ContractElement contractElement, ContractGroup3 contractGroup3, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            contractElement = prepackOptionState.contractElement;
        }
        if ((i & 2) != 0) {
            contractGroup3 = prepackOptionState.contractColumnType;
        }
        if ((i & 4) != 0) {
            z = prepackOptionState.isSelected;
        }
        if ((i & 8) != 0) {
            str = prepackOptionState.displayQuote;
        }
        return prepackOptionState.copy(contractElement, contractGroup3, z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ContractElement getContractElement() {
        return this.contractElement;
    }

    /* renamed from: component2, reason: from getter */
    public final ContractGroup3 getContractColumnType() {
        return this.contractColumnType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisplayQuote() {
        return this.displayQuote;
    }

    public final PrepackOptionState copy(ContractElement contractElement, ContractGroup3 contractColumnType, boolean isSelected, String displayQuote) {
        Intrinsics.checkNotNullParameter(contractElement, "contractElement");
        Intrinsics.checkNotNullParameter(contractColumnType, "contractColumnType");
        Intrinsics.checkNotNullParameter(displayQuote, "displayQuote");
        return new PrepackOptionState(contractElement, contractColumnType, isSelected, displayQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrepackOptionState)) {
            return false;
        }
        PrepackOptionState prepackOptionState = (PrepackOptionState) other;
        return Intrinsics.areEqual(this.contractElement, prepackOptionState.contractElement) && this.contractColumnType == prepackOptionState.contractColumnType && this.isSelected == prepackOptionState.isSelected && Intrinsics.areEqual(this.displayQuote, prepackOptionState.displayQuote);
    }

    public int hashCode() {
        return (((((this.contractElement.hashCode() * 31) + this.contractColumnType.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.displayQuote.hashCode();
    }

    public String toString() {
        return "PrepackOptionState(contractElement=" + this.contractElement + ", contractColumnType=" + this.contractColumnType + ", isSelected=" + this.isSelected + ", displayQuote=" + this.displayQuote + ")";
    }

    public PrepackOptionState(ContractElement contractElement, ContractGroup3 contractColumnType, boolean z, String displayQuote) {
        Intrinsics.checkNotNullParameter(contractElement, "contractElement");
        Intrinsics.checkNotNullParameter(contractColumnType, "contractColumnType");
        Intrinsics.checkNotNullParameter(displayQuote, "displayQuote");
        this.contractElement = contractElement;
        this.contractColumnType = contractColumnType;
        this.isSelected = z;
        this.displayQuote = displayQuote;
    }

    public final ContractElement getContractElement() {
        return this.contractElement;
    }

    public final ContractGroup3 getContractColumnType() {
        return this.contractColumnType;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final String getDisplayQuote() {
        return this.displayQuote;
    }
}
