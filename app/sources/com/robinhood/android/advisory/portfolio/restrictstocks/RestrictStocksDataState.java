package com.robinhood.android.advisory.portfolio.restrictstocks;

import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioAsset;
import com.robinhood.models.advisory.p304db.portfolio.RestrictedAsset;
import com.robinhood.models.advisory.p304db.portfolio.RestrictedStocksResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestrictStocksDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDataState;", "", "restrictedStocksResponse", "Lcom/robinhood/models/advisory/db/portfolio/RestrictedStocksResponse;", "searchRestrictableAssets", "", "Lcom/robinhood/models/advisory/db/portfolio/RestrictedAsset;", "managedPortfolioAssets", "Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioAsset;", "currentSearchQuery", "", "isUpdatingAssetId", "<init>", "(Lcom/robinhood/models/advisory/db/portfolio/RestrictedStocksResponse;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getRestrictedStocksResponse", "()Lcom/robinhood/models/advisory/db/portfolio/RestrictedStocksResponse;", "getSearchRestrictableAssets", "()Ljava/util/List;", "getManagedPortfolioAssets", "getCurrentSearchQuery", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RestrictStocksDataState {
    public static final int $stable = 8;
    private final String currentSearchQuery;
    private final String isUpdatingAssetId;
    private final List<ManagedPortfolioAsset> managedPortfolioAssets;
    private final RestrictedStocksResponse restrictedStocksResponse;
    private final List<RestrictedAsset> searchRestrictableAssets;

    public RestrictStocksDataState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ RestrictStocksDataState copy$default(RestrictStocksDataState restrictStocksDataState, RestrictedStocksResponse restrictedStocksResponse, List list, List list2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            restrictedStocksResponse = restrictStocksDataState.restrictedStocksResponse;
        }
        if ((i & 2) != 0) {
            list = restrictStocksDataState.searchRestrictableAssets;
        }
        if ((i & 4) != 0) {
            list2 = restrictStocksDataState.managedPortfolioAssets;
        }
        if ((i & 8) != 0) {
            str = restrictStocksDataState.currentSearchQuery;
        }
        if ((i & 16) != 0) {
            str2 = restrictStocksDataState.isUpdatingAssetId;
        }
        String str3 = str2;
        List list3 = list2;
        return restrictStocksDataState.copy(restrictedStocksResponse, list, list3, str, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final RestrictedStocksResponse getRestrictedStocksResponse() {
        return this.restrictedStocksResponse;
    }

    public final List<RestrictedAsset> component2() {
        return this.searchRestrictableAssets;
    }

    public final List<ManagedPortfolioAsset> component3() {
        return this.managedPortfolioAssets;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCurrentSearchQuery() {
        return this.currentSearchQuery;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIsUpdatingAssetId() {
        return this.isUpdatingAssetId;
    }

    public final RestrictStocksDataState copy(RestrictedStocksResponse restrictedStocksResponse, List<RestrictedAsset> searchRestrictableAssets, List<ManagedPortfolioAsset> managedPortfolioAssets, String currentSearchQuery, String isUpdatingAssetId) {
        Intrinsics.checkNotNullParameter(searchRestrictableAssets, "searchRestrictableAssets");
        Intrinsics.checkNotNullParameter(managedPortfolioAssets, "managedPortfolioAssets");
        Intrinsics.checkNotNullParameter(currentSearchQuery, "currentSearchQuery");
        return new RestrictStocksDataState(restrictedStocksResponse, searchRestrictableAssets, managedPortfolioAssets, currentSearchQuery, isUpdatingAssetId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictStocksDataState)) {
            return false;
        }
        RestrictStocksDataState restrictStocksDataState = (RestrictStocksDataState) other;
        return Intrinsics.areEqual(this.restrictedStocksResponse, restrictStocksDataState.restrictedStocksResponse) && Intrinsics.areEqual(this.searchRestrictableAssets, restrictStocksDataState.searchRestrictableAssets) && Intrinsics.areEqual(this.managedPortfolioAssets, restrictStocksDataState.managedPortfolioAssets) && Intrinsics.areEqual(this.currentSearchQuery, restrictStocksDataState.currentSearchQuery) && Intrinsics.areEqual(this.isUpdatingAssetId, restrictStocksDataState.isUpdatingAssetId);
    }

    public int hashCode() {
        RestrictedStocksResponse restrictedStocksResponse = this.restrictedStocksResponse;
        int iHashCode = (((((((restrictedStocksResponse == null ? 0 : restrictedStocksResponse.hashCode()) * 31) + this.searchRestrictableAssets.hashCode()) * 31) + this.managedPortfolioAssets.hashCode()) * 31) + this.currentSearchQuery.hashCode()) * 31;
        String str = this.isUpdatingAssetId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "RestrictStocksDataState(restrictedStocksResponse=" + this.restrictedStocksResponse + ", searchRestrictableAssets=" + this.searchRestrictableAssets + ", managedPortfolioAssets=" + this.managedPortfolioAssets + ", currentSearchQuery=" + this.currentSearchQuery + ", isUpdatingAssetId=" + this.isUpdatingAssetId + ")";
    }

    public RestrictStocksDataState(RestrictedStocksResponse restrictedStocksResponse, List<RestrictedAsset> searchRestrictableAssets, List<ManagedPortfolioAsset> managedPortfolioAssets, String currentSearchQuery, String str) {
        Intrinsics.checkNotNullParameter(searchRestrictableAssets, "searchRestrictableAssets");
        Intrinsics.checkNotNullParameter(managedPortfolioAssets, "managedPortfolioAssets");
        Intrinsics.checkNotNullParameter(currentSearchQuery, "currentSearchQuery");
        this.restrictedStocksResponse = restrictedStocksResponse;
        this.searchRestrictableAssets = searchRestrictableAssets;
        this.managedPortfolioAssets = managedPortfolioAssets;
        this.currentSearchQuery = currentSearchQuery;
        this.isUpdatingAssetId = str;
    }

    public final RestrictedStocksResponse getRestrictedStocksResponse() {
        return this.restrictedStocksResponse;
    }

    public /* synthetic */ RestrictStocksDataState(RestrictedStocksResponse restrictedStocksResponse, List list, List list2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : restrictedStocksResponse, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : str2);
    }

    public final List<RestrictedAsset> getSearchRestrictableAssets() {
        return this.searchRestrictableAssets;
    }

    public final List<ManagedPortfolioAsset> getManagedPortfolioAssets() {
        return this.managedPortfolioAssets;
    }

    public final String getCurrentSearchQuery() {
        return this.currentSearchQuery;
    }

    public final String isUpdatingAssetId() {
        return this.isUpdatingAssetId;
    }
}
