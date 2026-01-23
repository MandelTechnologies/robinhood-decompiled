package com.robinhood.android.acatsin.assets;

import com.robinhood.models.acats.p299db.bonfire.AcatsListPageResponse;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAssetListViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/acatsin/assets/AcatsInAssetListDataState;", "", "assetListPageResponse", "Lcom/robinhood/models/acats/db/bonfire/AcatsListPageResponse;", "selectedAssetType", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "<init>", "(Lcom/robinhood/models/acats/db/bonfire/AcatsListPageResponse;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;)V", "getAssetListPageResponse", "()Lcom/robinhood/models/acats/db/bonfire/AcatsListPageResponse;", "getSelectedAssetType", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInAssetListDataState {
    public static final int $stable = 8;
    private final AcatsListPageResponse assetListPageResponse;
    private final ApiAcatsTransfer.Asset.AssetType selectedAssetType;

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsInAssetListDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AcatsInAssetListDataState copy$default(AcatsInAssetListDataState acatsInAssetListDataState, AcatsListPageResponse acatsListPageResponse, ApiAcatsTransfer.Asset.AssetType assetType, int i, Object obj) {
        if ((i & 1) != 0) {
            acatsListPageResponse = acatsInAssetListDataState.assetListPageResponse;
        }
        if ((i & 2) != 0) {
            assetType = acatsInAssetListDataState.selectedAssetType;
        }
        return acatsInAssetListDataState.copy(acatsListPageResponse, assetType);
    }

    /* renamed from: component1, reason: from getter */
    public final AcatsListPageResponse getAssetListPageResponse() {
        return this.assetListPageResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiAcatsTransfer.Asset.AssetType getSelectedAssetType() {
        return this.selectedAssetType;
    }

    public final AcatsInAssetListDataState copy(AcatsListPageResponse assetListPageResponse, ApiAcatsTransfer.Asset.AssetType selectedAssetType) {
        return new AcatsInAssetListDataState(assetListPageResponse, selectedAssetType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInAssetListDataState)) {
            return false;
        }
        AcatsInAssetListDataState acatsInAssetListDataState = (AcatsInAssetListDataState) other;
        return Intrinsics.areEqual(this.assetListPageResponse, acatsInAssetListDataState.assetListPageResponse) && this.selectedAssetType == acatsInAssetListDataState.selectedAssetType;
    }

    public int hashCode() {
        AcatsListPageResponse acatsListPageResponse = this.assetListPageResponse;
        int iHashCode = (acatsListPageResponse == null ? 0 : acatsListPageResponse.hashCode()) * 31;
        ApiAcatsTransfer.Asset.AssetType assetType = this.selectedAssetType;
        return iHashCode + (assetType != null ? assetType.hashCode() : 0);
    }

    public String toString() {
        return "AcatsInAssetListDataState(assetListPageResponse=" + this.assetListPageResponse + ", selectedAssetType=" + this.selectedAssetType + ")";
    }

    public AcatsInAssetListDataState(AcatsListPageResponse acatsListPageResponse, ApiAcatsTransfer.Asset.AssetType assetType) {
        this.assetListPageResponse = acatsListPageResponse;
        this.selectedAssetType = assetType;
    }

    public /* synthetic */ AcatsInAssetListDataState(AcatsListPageResponse acatsListPageResponse, ApiAcatsTransfer.Asset.AssetType assetType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : acatsListPageResponse, (i & 2) != 0 ? null : assetType);
    }

    public final AcatsListPageResponse getAssetListPageResponse() {
        return this.assetListPageResponse;
    }

    public final ApiAcatsTransfer.Asset.AssetType getSelectedAssetType() {
        return this.selectedAssetType;
    }
}
