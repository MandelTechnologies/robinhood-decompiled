package com.robinhood.android.acats.plaid.transfer.partial.edit;

import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDataState;", "", "editAsset", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "adjustedAmount", "", "selectedRow", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditSelectedRow;", "userFinishedEditing", "", "showBorrowingFeeTooltip", "<init>", "(Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;Ljava/lang/String;Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditSelectedRow;ZZ)V", "getEditAsset", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "getAdjustedAmount", "()Ljava/lang/String;", "getSelectedRow", "()Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditSelectedRow;", "getUserFinishedEditing", "()Z", "getShowBorrowingFeeTooltip", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsPlaidPartialTransferEditDataState {
    public static final int $stable = 0;
    private final String adjustedAmount;
    private final AcatsPlaidPartialTransferAssetRowData editAsset;
    private final AcatsPlaidPartialTransferEditDuxo4 selectedRow;
    private final boolean showBorrowingFeeTooltip;
    private final boolean userFinishedEditing;

    public AcatsPlaidPartialTransferEditDataState() {
        this(null, null, null, false, false, 31, null);
    }

    public static /* synthetic */ AcatsPlaidPartialTransferEditDataState copy$default(AcatsPlaidPartialTransferEditDataState acatsPlaidPartialTransferEditDataState, AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, String str, AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo4, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            acatsPlaidPartialTransferAssetRowData = acatsPlaidPartialTransferEditDataState.editAsset;
        }
        if ((i & 2) != 0) {
            str = acatsPlaidPartialTransferEditDataState.adjustedAmount;
        }
        if ((i & 4) != 0) {
            acatsPlaidPartialTransferEditDuxo4 = acatsPlaidPartialTransferEditDataState.selectedRow;
        }
        if ((i & 8) != 0) {
            z = acatsPlaidPartialTransferEditDataState.userFinishedEditing;
        }
        if ((i & 16) != 0) {
            z2 = acatsPlaidPartialTransferEditDataState.showBorrowingFeeTooltip;
        }
        boolean z3 = z2;
        AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo42 = acatsPlaidPartialTransferEditDuxo4;
        return acatsPlaidPartialTransferEditDataState.copy(acatsPlaidPartialTransferAssetRowData, str, acatsPlaidPartialTransferEditDuxo42, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final AcatsPlaidPartialTransferAssetRowData getEditAsset() {
        return this.editAsset;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAdjustedAmount() {
        return this.adjustedAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final AcatsPlaidPartialTransferEditDuxo4 getSelectedRow() {
        return this.selectedRow;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUserFinishedEditing() {
        return this.userFinishedEditing;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowBorrowingFeeTooltip() {
        return this.showBorrowingFeeTooltip;
    }

    public final AcatsPlaidPartialTransferEditDataState copy(AcatsPlaidPartialTransferAssetRowData editAsset, String adjustedAmount, AcatsPlaidPartialTransferEditDuxo4 selectedRow, boolean userFinishedEditing, boolean showBorrowingFeeTooltip) {
        Intrinsics.checkNotNullParameter(adjustedAmount, "adjustedAmount");
        Intrinsics.checkNotNullParameter(selectedRow, "selectedRow");
        return new AcatsPlaidPartialTransferEditDataState(editAsset, adjustedAmount, selectedRow, userFinishedEditing, showBorrowingFeeTooltip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsPlaidPartialTransferEditDataState)) {
            return false;
        }
        AcatsPlaidPartialTransferEditDataState acatsPlaidPartialTransferEditDataState = (AcatsPlaidPartialTransferEditDataState) other;
        return Intrinsics.areEqual(this.editAsset, acatsPlaidPartialTransferEditDataState.editAsset) && Intrinsics.areEqual(this.adjustedAmount, acatsPlaidPartialTransferEditDataState.adjustedAmount) && this.selectedRow == acatsPlaidPartialTransferEditDataState.selectedRow && this.userFinishedEditing == acatsPlaidPartialTransferEditDataState.userFinishedEditing && this.showBorrowingFeeTooltip == acatsPlaidPartialTransferEditDataState.showBorrowingFeeTooltip;
    }

    public int hashCode() {
        AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData = this.editAsset;
        return ((((((((acatsPlaidPartialTransferAssetRowData == null ? 0 : acatsPlaidPartialTransferAssetRowData.hashCode()) * 31) + this.adjustedAmount.hashCode()) * 31) + this.selectedRow.hashCode()) * 31) + Boolean.hashCode(this.userFinishedEditing)) * 31) + Boolean.hashCode(this.showBorrowingFeeTooltip);
    }

    public String toString() {
        return "AcatsPlaidPartialTransferEditDataState(editAsset=" + this.editAsset + ", adjustedAmount=" + this.adjustedAmount + ", selectedRow=" + this.selectedRow + ", userFinishedEditing=" + this.userFinishedEditing + ", showBorrowingFeeTooltip=" + this.showBorrowingFeeTooltip + ")";
    }

    public AcatsPlaidPartialTransferEditDataState(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, String adjustedAmount, AcatsPlaidPartialTransferEditDuxo4 selectedRow, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adjustedAmount, "adjustedAmount");
        Intrinsics.checkNotNullParameter(selectedRow, "selectedRow");
        this.editAsset = acatsPlaidPartialTransferAssetRowData;
        this.adjustedAmount = adjustedAmount;
        this.selectedRow = selectedRow;
        this.userFinishedEditing = z;
        this.showBorrowingFeeTooltip = z2;
    }

    public final AcatsPlaidPartialTransferAssetRowData getEditAsset() {
        return this.editAsset;
    }

    public /* synthetic */ AcatsPlaidPartialTransferEditDataState(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, String str, AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo4, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : acatsPlaidPartialTransferAssetRowData, (i & 2) != 0 ? "0" : str, (i & 4) != 0 ? AcatsPlaidPartialTransferEditDuxo4.ALL : acatsPlaidPartialTransferEditDuxo4, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2);
    }

    public final String getAdjustedAmount() {
        return this.adjustedAmount;
    }

    public final AcatsPlaidPartialTransferEditDuxo4 getSelectedRow() {
        return this.selectedRow;
    }

    public final boolean getUserFinishedEditing() {
        return this.userFinishedEditing;
    }

    public final boolean getShowBorrowingFeeTooltip() {
        return this.showBorrowingFeeTooltip;
    }
}
