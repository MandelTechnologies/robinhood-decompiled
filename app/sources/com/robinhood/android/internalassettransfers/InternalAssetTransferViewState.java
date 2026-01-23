package com.robinhood.android.internalassettransfers;

import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferViewState;", "", "accountSelection", "Lcom/robinhood/android/internalassettransfers/AccountSelection;", "sourceEligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "assetSelection", "Lcom/robinhood/android/internalassettransfers/AssetSelection;", "isFullTransfer", "", "<init>", "(Lcom/robinhood/android/internalassettransfers/AccountSelection;Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;Lcom/robinhood/android/internalassettransfers/AssetSelection;Z)V", "getAccountSelection", "()Lcom/robinhood/android/internalassettransfers/AccountSelection;", "getSourceEligibleAssets", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "getAssetSelection", "()Lcom/robinhood/android/internalassettransfers/AssetSelection;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferViewState {
    public static final int $stable = 8;
    private final AccountSelection accountSelection;
    private final AssetSelection assetSelection;
    private final boolean isFullTransfer;
    private final EligibleAssets sourceEligibleAssets;

    public InternalAssetTransferViewState() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ InternalAssetTransferViewState copy$default(InternalAssetTransferViewState internalAssetTransferViewState, AccountSelection accountSelection, EligibleAssets eligibleAssets, AssetSelection assetSelection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            accountSelection = internalAssetTransferViewState.accountSelection;
        }
        if ((i & 2) != 0) {
            eligibleAssets = internalAssetTransferViewState.sourceEligibleAssets;
        }
        if ((i & 4) != 0) {
            assetSelection = internalAssetTransferViewState.assetSelection;
        }
        if ((i & 8) != 0) {
            z = internalAssetTransferViewState.isFullTransfer;
        }
        return internalAssetTransferViewState.copy(accountSelection, eligibleAssets, assetSelection, z);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountSelection getAccountSelection() {
        return this.accountSelection;
    }

    /* renamed from: component2, reason: from getter */
    public final EligibleAssets getSourceEligibleAssets() {
        return this.sourceEligibleAssets;
    }

    /* renamed from: component3, reason: from getter */
    public final AssetSelection getAssetSelection() {
        return this.assetSelection;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFullTransfer() {
        return this.isFullTransfer;
    }

    public final InternalAssetTransferViewState copy(AccountSelection accountSelection, EligibleAssets sourceEligibleAssets, AssetSelection assetSelection, boolean isFullTransfer) {
        Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
        return new InternalAssetTransferViewState(accountSelection, sourceEligibleAssets, assetSelection, isFullTransfer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferViewState)) {
            return false;
        }
        InternalAssetTransferViewState internalAssetTransferViewState = (InternalAssetTransferViewState) other;
        return Intrinsics.areEqual(this.accountSelection, internalAssetTransferViewState.accountSelection) && Intrinsics.areEqual(this.sourceEligibleAssets, internalAssetTransferViewState.sourceEligibleAssets) && Intrinsics.areEqual(this.assetSelection, internalAssetTransferViewState.assetSelection) && this.isFullTransfer == internalAssetTransferViewState.isFullTransfer;
    }

    public int hashCode() {
        AccountSelection accountSelection = this.accountSelection;
        int iHashCode = (accountSelection == null ? 0 : accountSelection.hashCode()) * 31;
        EligibleAssets eligibleAssets = this.sourceEligibleAssets;
        return ((((iHashCode + (eligibleAssets != null ? eligibleAssets.hashCode() : 0)) * 31) + this.assetSelection.hashCode()) * 31) + Boolean.hashCode(this.isFullTransfer);
    }

    public String toString() {
        return "InternalAssetTransferViewState(accountSelection=" + this.accountSelection + ", sourceEligibleAssets=" + this.sourceEligibleAssets + ", assetSelection=" + this.assetSelection + ", isFullTransfer=" + this.isFullTransfer + ")";
    }

    public InternalAssetTransferViewState(AccountSelection accountSelection, EligibleAssets eligibleAssets, AssetSelection assetSelection, boolean z) {
        Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
        this.accountSelection = accountSelection;
        this.sourceEligibleAssets = eligibleAssets;
        this.assetSelection = assetSelection;
        this.isFullTransfer = z;
    }

    public final AccountSelection getAccountSelection() {
        return this.accountSelection;
    }

    public final EligibleAssets getSourceEligibleAssets() {
        return this.sourceEligibleAssets;
    }

    public /* synthetic */ InternalAssetTransferViewState(AccountSelection accountSelection, EligibleAssets eligibleAssets, AssetSelection assetSelection, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accountSelection, (i & 2) != 0 ? null : eligibleAssets, (i & 4) != 0 ? new AssetSelection(null, null, 3, null) : assetSelection, (i & 8) != 0 ? false : z);
    }

    public final AssetSelection getAssetSelection() {
        return this.assetSelection;
    }

    public final boolean isFullTransfer() {
        return this.isFullTransfer;
    }
}
