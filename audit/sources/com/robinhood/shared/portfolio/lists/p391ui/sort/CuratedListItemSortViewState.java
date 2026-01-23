package com.robinhood.shared.portfolio.lists.p391ui.sort;

import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p355ui.SortOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListItemSortViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÂ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListItemSortViewState;", "", "currentSortOrder", "Lcom/robinhood/models/api/ApiCuratedList$SortOrder;", "currentSortDirection", "Lcom/robinhood/models/api/ApiCuratedList$SortDirection;", "isFuturesOnlyList", "", "<init>", "(Lcom/robinhood/models/api/ApiCuratedList$SortOrder;Lcom/robinhood/models/api/ApiCuratedList$SortDirection;Z)V", "supportedSortOrders", "", "sortOptions", "Lcom/robinhood/models/ui/SortOption;", "getSortOptions", "()Ljava/util/List;", "optionWatchlistSortOptions", "getOptionWatchlistSortOptions", "currentSortOption", "getCurrentSortOption", "()Lcom/robinhood/models/ui/SortOption;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class CuratedListItemSortViewState {
    private static final List<ApiCuratedList.SortOrder> defaultSupportedSortOrders;
    private static final List<ApiCuratedList.SortOrder> futuresSupportedSortOrders;
    private static final List<ApiCuratedList.SortOrder> optionWatchlistSupportedSortOrders;
    private final ApiCuratedList.SortDirection currentSortDirection;
    private final ApiCuratedList.SortOrder currentSortOrder;
    private final boolean isFuturesOnlyList;
    private final List<ApiCuratedList.SortOrder> supportedSortOrders;
    public static final int $stable = 8;

    public CuratedListItemSortViewState() {
        this(null, null, false, 7, null);
    }

    /* renamed from: component1, reason: from getter */
    private final ApiCuratedList.SortOrder getCurrentSortOrder() {
        return this.currentSortOrder;
    }

    /* renamed from: component2, reason: from getter */
    private final ApiCuratedList.SortDirection getCurrentSortDirection() {
        return this.currentSortDirection;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getIsFuturesOnlyList() {
        return this.isFuturesOnlyList;
    }

    public static /* synthetic */ CuratedListItemSortViewState copy$default(CuratedListItemSortViewState curatedListItemSortViewState, ApiCuratedList.SortOrder sortOrder, ApiCuratedList.SortDirection sortDirection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            sortOrder = curatedListItemSortViewState.currentSortOrder;
        }
        if ((i & 2) != 0) {
            sortDirection = curatedListItemSortViewState.currentSortDirection;
        }
        if ((i & 4) != 0) {
            z = curatedListItemSortViewState.isFuturesOnlyList;
        }
        return curatedListItemSortViewState.copy(sortOrder, sortDirection, z);
    }

    public final CuratedListItemSortViewState copy(ApiCuratedList.SortOrder currentSortOrder, ApiCuratedList.SortDirection currentSortDirection, boolean isFuturesOnlyList) {
        Intrinsics.checkNotNullParameter(currentSortOrder, "currentSortOrder");
        Intrinsics.checkNotNullParameter(currentSortDirection, "currentSortDirection");
        return new CuratedListItemSortViewState(currentSortOrder, currentSortDirection, isFuturesOnlyList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CuratedListItemSortViewState)) {
            return false;
        }
        CuratedListItemSortViewState curatedListItemSortViewState = (CuratedListItemSortViewState) other;
        return this.currentSortOrder == curatedListItemSortViewState.currentSortOrder && this.currentSortDirection == curatedListItemSortViewState.currentSortDirection && this.isFuturesOnlyList == curatedListItemSortViewState.isFuturesOnlyList;
    }

    public int hashCode() {
        return (((this.currentSortOrder.hashCode() * 31) + this.currentSortDirection.hashCode()) * 31) + Boolean.hashCode(this.isFuturesOnlyList);
    }

    public String toString() {
        return "CuratedListItemSortViewState(currentSortOrder=" + this.currentSortOrder + ", currentSortDirection=" + this.currentSortDirection + ", isFuturesOnlyList=" + this.isFuturesOnlyList + ")";
    }

    public CuratedListItemSortViewState(ApiCuratedList.SortOrder currentSortOrder, ApiCuratedList.SortDirection currentSortDirection, boolean z) {
        List<ApiCuratedList.SortOrder> list;
        Intrinsics.checkNotNullParameter(currentSortOrder, "currentSortOrder");
        Intrinsics.checkNotNullParameter(currentSortDirection, "currentSortDirection");
        this.currentSortOrder = currentSortOrder;
        this.currentSortDirection = currentSortDirection;
        this.isFuturesOnlyList = z;
        if (z) {
            list = futuresSupportedSortOrders;
        } else {
            list = defaultSupportedSortOrders;
        }
        this.supportedSortOrders = list;
    }

    public /* synthetic */ CuratedListItemSortViewState(ApiCuratedList.SortOrder sortOrder, ApiCuratedList.SortDirection sortDirection, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ApiCuratedList.SortOrder.UNKNOWN : sortOrder, (i & 2) != 0 ? ApiCuratedList.SortDirection.EMPTY : sortDirection, (i & 4) != 0 ? false : z);
    }

    public final List<SortOption> getSortOptions() {
        ApiCuratedList.SortDirection sortDirection;
        List<ApiCuratedList.SortOrder> list = this.supportedSortOrders;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ApiCuratedList.SortOrder sortOrder : list) {
            if (sortOrder == this.currentSortOrder) {
                sortDirection = this.currentSortDirection;
            } else {
                sortDirection = ApiCuratedList.SortDirection.EMPTY;
            }
            arrayList.add(new SortOption(sortOrder, sortDirection));
        }
        return arrayList;
    }

    public final List<SortOption> getOptionWatchlistSortOptions() {
        ApiCuratedList.SortDirection sortDirection;
        List<ApiCuratedList.SortOrder> list = optionWatchlistSupportedSortOrders;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ApiCuratedList.SortOrder sortOrder : list) {
            if (sortOrder == this.currentSortOrder) {
                sortDirection = this.currentSortDirection;
            } else {
                sortDirection = ApiCuratedList.SortDirection.EMPTY;
            }
            arrayList.add(new SortOption(sortOrder, sortDirection));
        }
        return arrayList;
    }

    public final SortOption getCurrentSortOption() {
        return new SortOption(this.currentSortOrder, this.currentSortDirection);
    }

    static {
        ApiCuratedList.SortOrder sortOrder = ApiCuratedList.SortOrder.SYMBOL;
        ApiCuratedList.SortOrder sortOrder2 = ApiCuratedList.SortOrder.PRICE;
        ApiCuratedList.SortOrder sortOrder3 = ApiCuratedList.SortOrder.ONE_DAY_PERCENT_CHANGE;
        defaultSupportedSortOrders = CollectionsKt.listOf((Object[]) new ApiCuratedList.SortOrder[]{sortOrder, sortOrder2, sortOrder3});
        futuresSupportedSortOrders = CollectionsKt.listOf((Object[]) new ApiCuratedList.SortOrder[]{sortOrder, sortOrder3, ApiCuratedList.SortOrder.FUTURES_MARGIN_REQUIREMENT});
        optionWatchlistSupportedSortOrders = CollectionsKt.listOf((Object[]) new ApiCuratedList.SortOrder[]{sortOrder, ApiCuratedList.SortOrder.EXPIRATION_DATE, sortOrder2, ApiCuratedList.SortOrder.TOTAL_RETURN_PERCENTAGE});
    }
}
