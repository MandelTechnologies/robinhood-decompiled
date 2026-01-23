package com.robinhood.android.acatsin.brokeragesearch;

import com.robinhood.android.acatsin.brokeragesearch.SearchState;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.p320db.IacInfoBanner;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInBrokerageSearchViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J)\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchViewState;", "", "searchState", "Lcom/robinhood/android/acatsin/brokeragesearch/SearchState;", "iacInfoBanner", "Lcom/robinhood/models/db/IacInfoBanner;", "isCheckingAccountEligibility", "", "<init>", "(Lcom/robinhood/android/acatsin/brokeragesearch/SearchState;Lcom/robinhood/models/db/IacInfoBanner;Z)V", "getSearchState", "()Lcom/robinhood/android/acatsin/brokeragesearch/SearchState;", "getIacInfoBanner", "()Lcom/robinhood/models/db/IacInfoBanner;", "()Z", "loadingViewIsVisible", "getLoadingViewIsVisible", "recyclerViewIsVisible", "getRecyclerViewIsVisible", "brokerageList", "", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "getBrokerageList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInBrokerageSearchViewState {
    public static final int $stable = 8;
    private final IacInfoBanner iacInfoBanner;
    private final boolean isCheckingAccountEligibility;
    private final SearchState searchState;

    public AcatsInBrokerageSearchViewState() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ AcatsInBrokerageSearchViewState copy$default(AcatsInBrokerageSearchViewState acatsInBrokerageSearchViewState, SearchState searchState, IacInfoBanner iacInfoBanner, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            searchState = acatsInBrokerageSearchViewState.searchState;
        }
        if ((i & 2) != 0) {
            iacInfoBanner = acatsInBrokerageSearchViewState.iacInfoBanner;
        }
        if ((i & 4) != 0) {
            z = acatsInBrokerageSearchViewState.isCheckingAccountEligibility;
        }
        return acatsInBrokerageSearchViewState.copy(searchState, iacInfoBanner, z);
    }

    /* renamed from: component1, reason: from getter */
    public final SearchState getSearchState() {
        return this.searchState;
    }

    /* renamed from: component2, reason: from getter */
    public final IacInfoBanner getIacInfoBanner() {
        return this.iacInfoBanner;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCheckingAccountEligibility() {
        return this.isCheckingAccountEligibility;
    }

    public final AcatsInBrokerageSearchViewState copy(SearchState searchState, IacInfoBanner iacInfoBanner, boolean isCheckingAccountEligibility) {
        Intrinsics.checkNotNullParameter(searchState, "searchState");
        return new AcatsInBrokerageSearchViewState(searchState, iacInfoBanner, isCheckingAccountEligibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInBrokerageSearchViewState)) {
            return false;
        }
        AcatsInBrokerageSearchViewState acatsInBrokerageSearchViewState = (AcatsInBrokerageSearchViewState) other;
        return Intrinsics.areEqual(this.searchState, acatsInBrokerageSearchViewState.searchState) && Intrinsics.areEqual(this.iacInfoBanner, acatsInBrokerageSearchViewState.iacInfoBanner) && this.isCheckingAccountEligibility == acatsInBrokerageSearchViewState.isCheckingAccountEligibility;
    }

    public int hashCode() {
        int iHashCode = this.searchState.hashCode() * 31;
        IacInfoBanner iacInfoBanner = this.iacInfoBanner;
        return ((iHashCode + (iacInfoBanner == null ? 0 : iacInfoBanner.hashCode())) * 31) + Boolean.hashCode(this.isCheckingAccountEligibility);
    }

    public String toString() {
        return "AcatsInBrokerageSearchViewState(searchState=" + this.searchState + ", iacInfoBanner=" + this.iacInfoBanner + ", isCheckingAccountEligibility=" + this.isCheckingAccountEligibility + ")";
    }

    public AcatsInBrokerageSearchViewState(SearchState searchState, IacInfoBanner iacInfoBanner, boolean z) {
        Intrinsics.checkNotNullParameter(searchState, "searchState");
        this.searchState = searchState;
        this.iacInfoBanner = iacInfoBanner;
        this.isCheckingAccountEligibility = z;
    }

    public /* synthetic */ AcatsInBrokerageSearchViewState(SearchState searchState, IacInfoBanner iacInfoBanner, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SearchState.Loading.INSTANCE : searchState, (i & 2) != 0 ? null : iacInfoBanner, (i & 4) != 0 ? false : z);
    }

    public final SearchState getSearchState() {
        return this.searchState;
    }

    public final IacInfoBanner getIacInfoBanner() {
        return this.iacInfoBanner;
    }

    public final boolean isCheckingAccountEligibility() {
        return this.isCheckingAccountEligibility;
    }

    public final boolean getLoadingViewIsVisible() {
        SearchState searchState = this.searchState;
        if (Intrinsics.areEqual(searchState, SearchState.Loading.INSTANCE)) {
            return true;
        }
        if ((searchState instanceof SearchState.Error) || (searchState instanceof SearchState.Success)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getRecyclerViewIsVisible() {
        SearchState searchState = this.searchState;
        if (Intrinsics.areEqual(searchState, SearchState.Loading.INSTANCE)) {
            return false;
        }
        if ((searchState instanceof SearchState.Error) || (searchState instanceof SearchState.Success)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List<ApiBrokerage> getBrokerageList() {
        List<ApiBrokerage> results;
        SearchState searchState = this.searchState;
        SearchState.Success success = searchState instanceof SearchState.Success ? (SearchState.Success) searchState : null;
        return (success == null || (results = success.getResults()) == null) ? CollectionsKt.emptyList() : results;
    }
}
