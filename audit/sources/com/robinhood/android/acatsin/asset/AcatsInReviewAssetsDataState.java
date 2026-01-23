package com.robinhood.android.acatsin.asset;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInReviewAssetsDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsDataState;", "", "assets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "assetFilterType", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "inAcatsRejectedImprovementsExperiment", "", "<init>", "(Ljava/util/List;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;Z)V", "getAssets", "()Ljava/util/List;", "getAssetFilterType", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "getInAcatsRejectedImprovementsExperiment", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInReviewAssetsDataState {
    public static final int $stable = 8;
    private final ApiAcatsTransfer.Asset.AssetType assetFilterType;
    private final List<UiAcatsAsset> assets;
    private final boolean inAcatsRejectedImprovementsExperiment;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AcatsInReviewAssetsDataState copy$default(AcatsInReviewAssetsDataState acatsInReviewAssetsDataState, List list, ApiAcatsTransfer.Asset.AssetType assetType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = acatsInReviewAssetsDataState.assets;
        }
        if ((i & 2) != 0) {
            assetType = acatsInReviewAssetsDataState.assetFilterType;
        }
        if ((i & 4) != 0) {
            z = acatsInReviewAssetsDataState.inAcatsRejectedImprovementsExperiment;
        }
        return acatsInReviewAssetsDataState.copy(list, assetType, z);
    }

    public final List<UiAcatsAsset> component1() {
        return this.assets;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiAcatsTransfer.Asset.AssetType getAssetFilterType() {
        return this.assetFilterType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInAcatsRejectedImprovementsExperiment() {
        return this.inAcatsRejectedImprovementsExperiment;
    }

    public final AcatsInReviewAssetsDataState copy(List<? extends UiAcatsAsset> assets, ApiAcatsTransfer.Asset.AssetType assetFilterType, boolean inAcatsRejectedImprovementsExperiment) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        return new AcatsInReviewAssetsDataState(assets, assetFilterType, inAcatsRejectedImprovementsExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInReviewAssetsDataState)) {
            return false;
        }
        AcatsInReviewAssetsDataState acatsInReviewAssetsDataState = (AcatsInReviewAssetsDataState) other;
        return Intrinsics.areEqual(this.assets, acatsInReviewAssetsDataState.assets) && this.assetFilterType == acatsInReviewAssetsDataState.assetFilterType && this.inAcatsRejectedImprovementsExperiment == acatsInReviewAssetsDataState.inAcatsRejectedImprovementsExperiment;
    }

    public int hashCode() {
        int iHashCode = this.assets.hashCode() * 31;
        ApiAcatsTransfer.Asset.AssetType assetType = this.assetFilterType;
        return ((iHashCode + (assetType == null ? 0 : assetType.hashCode())) * 31) + Boolean.hashCode(this.inAcatsRejectedImprovementsExperiment);
    }

    public String toString() {
        return "AcatsInReviewAssetsDataState(assets=" + this.assets + ", assetFilterType=" + this.assetFilterType + ", inAcatsRejectedImprovementsExperiment=" + this.inAcatsRejectedImprovementsExperiment + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsInReviewAssetsDataState(List<? extends UiAcatsAsset> assets, ApiAcatsTransfer.Asset.AssetType assetType, boolean z) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.assets = assets;
        this.assetFilterType = assetType;
        this.inAcatsRejectedImprovementsExperiment = z;
    }

    public /* synthetic */ AcatsInReviewAssetsDataState(List list, ApiAcatsTransfer.Asset.AssetType assetType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : assetType, (i & 4) != 0 ? false : z);
    }

    public final List<UiAcatsAsset> getAssets() {
        return this.assets;
    }

    public final ApiAcatsTransfer.Asset.AssetType getAssetFilterType() {
        return this.assetFilterType;
    }

    public final boolean getInAcatsRejectedImprovementsExperiment() {
        return this.inAcatsRejectedImprovementsExperiment;
    }
}
