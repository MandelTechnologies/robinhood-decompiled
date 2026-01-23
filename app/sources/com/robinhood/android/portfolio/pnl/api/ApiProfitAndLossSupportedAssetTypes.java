package com.robinhood.android.portfolio.pnl.api;

import com.robinhood.android.models.portfolio.api.AssetClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiProfitAndLossSupportedAssetTypes.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/api/ApiProfitAndLossSupportedAssetTypes;", "", "account_number", "", "asset_types", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "asset_types_with_data", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAccount_number", "()Ljava/lang/String;", "getAsset_types", "()Ljava/util/List;", "getAsset_types_with_data", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApiProfitAndLossSupportedAssetTypes {
    private final String account_number;
    private final List<AssetClass> asset_types;
    private final List<AssetClass> asset_types_with_data;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiProfitAndLossSupportedAssetTypes copy$default(ApiProfitAndLossSupportedAssetTypes apiProfitAndLossSupportedAssetTypes, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiProfitAndLossSupportedAssetTypes.account_number;
        }
        if ((i & 2) != 0) {
            list = apiProfitAndLossSupportedAssetTypes.asset_types;
        }
        if ((i & 4) != 0) {
            list2 = apiProfitAndLossSupportedAssetTypes.asset_types_with_data;
        }
        return apiProfitAndLossSupportedAssetTypes.copy(str, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccount_number() {
        return this.account_number;
    }

    public final List<AssetClass> component2() {
        return this.asset_types;
    }

    public final List<AssetClass> component3() {
        return this.asset_types_with_data;
    }

    public final ApiProfitAndLossSupportedAssetTypes copy(String account_number, List<? extends AssetClass> asset_types, List<? extends AssetClass> asset_types_with_data) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(asset_types, "asset_types");
        Intrinsics.checkNotNullParameter(asset_types_with_data, "asset_types_with_data");
        return new ApiProfitAndLossSupportedAssetTypes(account_number, asset_types, asset_types_with_data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiProfitAndLossSupportedAssetTypes)) {
            return false;
        }
        ApiProfitAndLossSupportedAssetTypes apiProfitAndLossSupportedAssetTypes = (ApiProfitAndLossSupportedAssetTypes) other;
        return Intrinsics.areEqual(this.account_number, apiProfitAndLossSupportedAssetTypes.account_number) && Intrinsics.areEqual(this.asset_types, apiProfitAndLossSupportedAssetTypes.asset_types) && Intrinsics.areEqual(this.asset_types_with_data, apiProfitAndLossSupportedAssetTypes.asset_types_with_data);
    }

    public int hashCode() {
        return (((this.account_number.hashCode() * 31) + this.asset_types.hashCode()) * 31) + this.asset_types_with_data.hashCode();
    }

    public String toString() {
        return "ApiProfitAndLossSupportedAssetTypes(account_number=" + this.account_number + ", asset_types=" + this.asset_types + ", asset_types_with_data=" + this.asset_types_with_data + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApiProfitAndLossSupportedAssetTypes(String account_number, List<? extends AssetClass> asset_types, List<? extends AssetClass> asset_types_with_data) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(asset_types, "asset_types");
        Intrinsics.checkNotNullParameter(asset_types_with_data, "asset_types_with_data");
        this.account_number = account_number;
        this.asset_types = asset_types;
        this.asset_types_with_data = asset_types_with_data;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final List<AssetClass> getAsset_types() {
        return this.asset_types;
    }

    public final List<AssetClass> getAsset_types_with_data() {
        return this.asset_types_with_data;
    }
}
