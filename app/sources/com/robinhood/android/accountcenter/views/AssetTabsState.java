package com.robinhood.android.accountcenter.views;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AssetTabsState;", "", "items", "", "Lcom/robinhood/android/accountcenter/views/AssetTabItem;", "selectedAssetId", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getSelectedAssetId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AssetTabsState {
    public static final int $stable = 8;
    private final List<AssetTabItem> items;
    private final String selectedAssetId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetTabsState copy$default(AssetTabsState assetTabsState, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = assetTabsState.items;
        }
        if ((i & 2) != 0) {
            str = assetTabsState.selectedAssetId;
        }
        return assetTabsState.copy(list, str);
    }

    public final List<AssetTabItem> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedAssetId() {
        return this.selectedAssetId;
    }

    public final AssetTabsState copy(List<AssetTabItem> items, String selectedAssetId) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new AssetTabsState(items, selectedAssetId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetTabsState)) {
            return false;
        }
        AssetTabsState assetTabsState = (AssetTabsState) other;
        return Intrinsics.areEqual(this.items, assetTabsState.items) && Intrinsics.areEqual(this.selectedAssetId, assetTabsState.selectedAssetId);
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        String str = this.selectedAssetId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AssetTabsState(items=" + this.items + ", selectedAssetId=" + this.selectedAssetId + ")";
    }

    public AssetTabsState(List<AssetTabItem> items, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.selectedAssetId = str;
    }

    public final List<AssetTabItem> getItems() {
        return this.items;
    }

    public final String getSelectedAssetId() {
        return this.selectedAssetId;
    }
}
