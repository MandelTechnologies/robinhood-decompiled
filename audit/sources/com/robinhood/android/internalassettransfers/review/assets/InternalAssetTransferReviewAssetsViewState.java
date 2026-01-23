package com.robinhood.android.internalassettransfers.review.assets;

import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferReviewAssetsViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/assets/InternalAssetTransferReviewAssetsViewState;", "", "assets", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "fromHistory", "", "<init>", "(Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Z)V", "getAssets", "()Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "getFromHistory", "()Z", "isMarginBalance", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferReviewAssetsViewState {
    public static final int $stable = 8;
    private final UiAssets assets;
    private final boolean fromHistory;
    private final boolean isMarginBalance;

    public static /* synthetic */ InternalAssetTransferReviewAssetsViewState copy$default(InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState, UiAssets uiAssets, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uiAssets = internalAssetTransferReviewAssetsViewState.assets;
        }
        if ((i & 2) != 0) {
            z = internalAssetTransferReviewAssetsViewState.fromHistory;
        }
        return internalAssetTransferReviewAssetsViewState.copy(uiAssets, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UiAssets getAssets() {
        return this.assets;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFromHistory() {
        return this.fromHistory;
    }

    public final InternalAssetTransferReviewAssetsViewState copy(UiAssets assets, boolean fromHistory) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        return new InternalAssetTransferReviewAssetsViewState(assets, fromHistory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferReviewAssetsViewState)) {
            return false;
        }
        InternalAssetTransferReviewAssetsViewState internalAssetTransferReviewAssetsViewState = (InternalAssetTransferReviewAssetsViewState) other;
        return Intrinsics.areEqual(this.assets, internalAssetTransferReviewAssetsViewState.assets) && this.fromHistory == internalAssetTransferReviewAssetsViewState.fromHistory;
    }

    public int hashCode() {
        return (this.assets.hashCode() * 31) + Boolean.hashCode(this.fromHistory);
    }

    public String toString() {
        return "InternalAssetTransferReviewAssetsViewState(assets=" + this.assets + ", fromHistory=" + this.fromHistory + ")";
    }

    public InternalAssetTransferReviewAssetsViewState(UiAssets assets, boolean z) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.assets = assets;
        this.fromHistory = z;
        this.isMarginBalance = assets.getCash().compareTo(BigDecimal.ZERO) < 0;
    }

    public final UiAssets getAssets() {
        return this.assets;
    }

    public final boolean getFromHistory() {
        return this.fromHistory;
    }

    /* renamed from: isMarginBalance, reason: from getter */
    public final boolean getIsMarginBalance() {
        return this.isMarginBalance;
    }
}
