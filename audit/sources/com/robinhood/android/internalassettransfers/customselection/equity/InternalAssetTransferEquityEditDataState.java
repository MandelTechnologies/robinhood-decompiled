package com.robinhood.android.internalassettransfers.customselection.equity;

import com.robinhood.android.models.internalassettransfers.p193db.EligibleAsset;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: InternalAssetTransferEquityEditDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditDataState;", "", "asset", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAsset;", "selectionType", "Lcom/robinhood/android/internalassettransfers/customselection/equity/SelectionType;", "shareInput", "", "isUserCurrentlyEditing", "", "<init>", "(Lcom/robinhood/android/models/internalassettransfers/db/EligibleAsset;Lcom/robinhood/android/internalassettransfers/customselection/equity/SelectionType;Ljava/lang/String;Z)V", "getAsset", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAsset;", "getSelectionType", "()Lcom/robinhood/android/internalassettransfers/customselection/equity/SelectionType;", "getShareInput", "()Ljava/lang/String;", "()Z", "shareInputAsBigDecimal", "Ljava/math/BigDecimal;", "getShareInputAsBigDecimal", "()Ljava/math/BigDecimal;", "shareInputMoreThanAvailable", "getShareInputMoreThanAvailable", "shareInputFractionalWhenNotAllowed", "getShareInputFractionalWhenNotAllowed", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferEquityEditDataState {
    public static final int $stable = 8;
    private final EligibleAsset asset;
    private final boolean isUserCurrentlyEditing;
    private final ShareSelection2 selectionType;
    private final String shareInput;
    private final BigDecimal shareInputAsBigDecimal;
    private final boolean shareInputFractionalWhenNotAllowed;
    private final boolean shareInputMoreThanAvailable;

    public static /* synthetic */ InternalAssetTransferEquityEditDataState copy$default(InternalAssetTransferEquityEditDataState internalAssetTransferEquityEditDataState, EligibleAsset eligibleAsset, ShareSelection2 shareSelection2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            eligibleAsset = internalAssetTransferEquityEditDataState.asset;
        }
        if ((i & 2) != 0) {
            shareSelection2 = internalAssetTransferEquityEditDataState.selectionType;
        }
        if ((i & 4) != 0) {
            str = internalAssetTransferEquityEditDataState.shareInput;
        }
        if ((i & 8) != 0) {
            z = internalAssetTransferEquityEditDataState.isUserCurrentlyEditing;
        }
        return internalAssetTransferEquityEditDataState.copy(eligibleAsset, shareSelection2, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final EligibleAsset getAsset() {
        return this.asset;
    }

    /* renamed from: component2, reason: from getter */
    public final ShareSelection2 getSelectionType() {
        return this.selectionType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getShareInput() {
        return this.shareInput;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsUserCurrentlyEditing() {
        return this.isUserCurrentlyEditing;
    }

    public final InternalAssetTransferEquityEditDataState copy(EligibleAsset asset, ShareSelection2 selectionType, String shareInput, boolean isUserCurrentlyEditing) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(shareInput, "shareInput");
        return new InternalAssetTransferEquityEditDataState(asset, selectionType, shareInput, isUserCurrentlyEditing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferEquityEditDataState)) {
            return false;
        }
        InternalAssetTransferEquityEditDataState internalAssetTransferEquityEditDataState = (InternalAssetTransferEquityEditDataState) other;
        return Intrinsics.areEqual(this.asset, internalAssetTransferEquityEditDataState.asset) && this.selectionType == internalAssetTransferEquityEditDataState.selectionType && Intrinsics.areEqual(this.shareInput, internalAssetTransferEquityEditDataState.shareInput) && this.isUserCurrentlyEditing == internalAssetTransferEquityEditDataState.isUserCurrentlyEditing;
    }

    public int hashCode() {
        return (((((this.asset.hashCode() * 31) + this.selectionType.hashCode()) * 31) + this.shareInput.hashCode()) * 31) + Boolean.hashCode(this.isUserCurrentlyEditing);
    }

    public String toString() {
        return "InternalAssetTransferEquityEditDataState(asset=" + this.asset + ", selectionType=" + this.selectionType + ", shareInput=" + this.shareInput + ", isUserCurrentlyEditing=" + this.isUserCurrentlyEditing + ")";
    }

    public InternalAssetTransferEquityEditDataState(EligibleAsset asset, ShareSelection2 selectionType, String shareInput, boolean z) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(shareInput, "shareInput");
        this.asset = asset;
        this.selectionType = selectionType;
        this.shareInput = shareInput;
        this.isUserCurrentlyEditing = z;
        BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(shareInput);
        this.shareInputAsBigDecimal = bigDecimalOrNull;
        this.shareInputMoreThanAvailable = bigDecimalOrNull != null && bigDecimalOrNull.compareTo(asset.getAvailableShares()) > 0;
        this.shareInputFractionalWhenNotAllowed = StringsKt.contains$default((CharSequence) shareInput, (CharSequence) ".", false, 2, (Object) null) && !asset.getSupportFractionalTransfers();
    }

    public final EligibleAsset getAsset() {
        return this.asset;
    }

    public final ShareSelection2 getSelectionType() {
        return this.selectionType;
    }

    public /* synthetic */ InternalAssetTransferEquityEditDataState(EligibleAsset eligibleAsset, ShareSelection2 shareSelection2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eligibleAsset, shareSelection2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z);
    }

    public final String getShareInput() {
        return this.shareInput;
    }

    public final boolean isUserCurrentlyEditing() {
        return this.isUserCurrentlyEditing;
    }

    public final BigDecimal getShareInputAsBigDecimal() {
        return this.shareInputAsBigDecimal;
    }

    public final boolean getShareInputMoreThanAvailable() {
        return this.shareInputMoreThanAvailable;
    }

    public final boolean getShareInputFractionalWhenNotAllowed() {
        return this.shareInputFractionalWhenNotAllowed;
    }
}
