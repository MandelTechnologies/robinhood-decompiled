package com.robinhood.android.internalassettransfers.customselection.equity;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferEquityEditViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditViewState;", "", "selectionType", "Lcom/robinhood/android/internalassettransfers/customselection/equity/SelectionType;", "showAmountInput", "", "isConfirmEnabled", "isUserCurrentlyEditing", "inputDisplayString", "", "inputErrorMessage", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InputErrorMessage;", "<init>", "(Lcom/robinhood/android/internalassettransfers/customselection/equity/SelectionType;ZZZLjava/lang/String;Lcom/robinhood/android/internalassettransfers/customselection/equity/InputErrorMessage;)V", "getSelectionType", "()Lcom/robinhood/android/internalassettransfers/customselection/equity/SelectionType;", "getShowAmountInput", "()Z", "getInputDisplayString", "()Ljava/lang/String;", "getInputErrorMessage", "()Lcom/robinhood/android/internalassettransfers/customselection/equity/InputErrorMessage;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferEquityEditViewState {
    public static final int $stable = StringResource.$stable;
    private final String inputDisplayString;
    private final InputErrorMessage inputErrorMessage;
    private final boolean isConfirmEnabled;
    private final boolean isUserCurrentlyEditing;
    private final ShareSelection2 selectionType;
    private final boolean showAmountInput;

    public static /* synthetic */ InternalAssetTransferEquityEditViewState copy$default(InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState, ShareSelection2 shareSelection2, boolean z, boolean z2, boolean z3, String str, InputErrorMessage inputErrorMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            shareSelection2 = internalAssetTransferEquityEditViewState.selectionType;
        }
        if ((i & 2) != 0) {
            z = internalAssetTransferEquityEditViewState.showAmountInput;
        }
        if ((i & 4) != 0) {
            z2 = internalAssetTransferEquityEditViewState.isConfirmEnabled;
        }
        if ((i & 8) != 0) {
            z3 = internalAssetTransferEquityEditViewState.isUserCurrentlyEditing;
        }
        if ((i & 16) != 0) {
            str = internalAssetTransferEquityEditViewState.inputDisplayString;
        }
        if ((i & 32) != 0) {
            inputErrorMessage = internalAssetTransferEquityEditViewState.inputErrorMessage;
        }
        String str2 = str;
        InputErrorMessage inputErrorMessage2 = inputErrorMessage;
        return internalAssetTransferEquityEditViewState.copy(shareSelection2, z, z2, z3, str2, inputErrorMessage2);
    }

    /* renamed from: component1, reason: from getter */
    public final ShareSelection2 getSelectionType() {
        return this.selectionType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowAmountInput() {
        return this.showAmountInput;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsConfirmEnabled() {
        return this.isConfirmEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsUserCurrentlyEditing() {
        return this.isUserCurrentlyEditing;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInputDisplayString() {
        return this.inputDisplayString;
    }

    /* renamed from: component6, reason: from getter */
    public final InputErrorMessage getInputErrorMessage() {
        return this.inputErrorMessage;
    }

    public final InternalAssetTransferEquityEditViewState copy(ShareSelection2 selectionType, boolean showAmountInput, boolean isConfirmEnabled, boolean isUserCurrentlyEditing, String inputDisplayString, InputErrorMessage inputErrorMessage) {
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(inputDisplayString, "inputDisplayString");
        return new InternalAssetTransferEquityEditViewState(selectionType, showAmountInput, isConfirmEnabled, isUserCurrentlyEditing, inputDisplayString, inputErrorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferEquityEditViewState)) {
            return false;
        }
        InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState = (InternalAssetTransferEquityEditViewState) other;
        return this.selectionType == internalAssetTransferEquityEditViewState.selectionType && this.showAmountInput == internalAssetTransferEquityEditViewState.showAmountInput && this.isConfirmEnabled == internalAssetTransferEquityEditViewState.isConfirmEnabled && this.isUserCurrentlyEditing == internalAssetTransferEquityEditViewState.isUserCurrentlyEditing && Intrinsics.areEqual(this.inputDisplayString, internalAssetTransferEquityEditViewState.inputDisplayString) && Intrinsics.areEqual(this.inputErrorMessage, internalAssetTransferEquityEditViewState.inputErrorMessage);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.selectionType.hashCode() * 31) + Boolean.hashCode(this.showAmountInput)) * 31) + Boolean.hashCode(this.isConfirmEnabled)) * 31) + Boolean.hashCode(this.isUserCurrentlyEditing)) * 31) + this.inputDisplayString.hashCode()) * 31;
        InputErrorMessage inputErrorMessage = this.inputErrorMessage;
        return iHashCode + (inputErrorMessage == null ? 0 : inputErrorMessage.hashCode());
    }

    public String toString() {
        return "InternalAssetTransferEquityEditViewState(selectionType=" + this.selectionType + ", showAmountInput=" + this.showAmountInput + ", isConfirmEnabled=" + this.isConfirmEnabled + ", isUserCurrentlyEditing=" + this.isUserCurrentlyEditing + ", inputDisplayString=" + this.inputDisplayString + ", inputErrorMessage=" + this.inputErrorMessage + ")";
    }

    public InternalAssetTransferEquityEditViewState(ShareSelection2 selectionType, boolean z, boolean z2, boolean z3, String inputDisplayString, InputErrorMessage inputErrorMessage) {
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(inputDisplayString, "inputDisplayString");
        this.selectionType = selectionType;
        this.showAmountInput = z;
        this.isConfirmEnabled = z2;
        this.isUserCurrentlyEditing = z3;
        this.inputDisplayString = inputDisplayString;
        this.inputErrorMessage = inputErrorMessage;
    }

    public final ShareSelection2 getSelectionType() {
        return this.selectionType;
    }

    public final boolean getShowAmountInput() {
        return this.showAmountInput;
    }

    public final boolean isConfirmEnabled() {
        return this.isConfirmEnabled;
    }

    public final boolean isUserCurrentlyEditing() {
        return this.isUserCurrentlyEditing;
    }

    public final String getInputDisplayString() {
        return this.inputDisplayString;
    }

    public final InputErrorMessage getInputErrorMessage() {
        return this.inputErrorMessage;
    }
}
