package com.robinhood.android.acatsin.partials.search;

import com.robinhood.store.search.SearchStore3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInSearchEquityViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityViewState;", "", "searchResult", "Lcom/robinhood/store/search/SearchResult;", "<init>", "(Lcom/robinhood/store/search/SearchResult;)V", "getSearchResult", "()Lcom/robinhood/store/search/SearchResult;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInSearchEquityViewState {
    public static final int $stable = 8;
    private final SearchStore3 searchResult;

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsInSearchEquityViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AcatsInSearchEquityViewState copy$default(AcatsInSearchEquityViewState acatsInSearchEquityViewState, SearchStore3 searchStore3, int i, Object obj) {
        if ((i & 1) != 0) {
            searchStore3 = acatsInSearchEquityViewState.searchResult;
        }
        return acatsInSearchEquityViewState.copy(searchStore3);
    }

    /* renamed from: component1, reason: from getter */
    public final SearchStore3 getSearchResult() {
        return this.searchResult;
    }

    public final AcatsInSearchEquityViewState copy(SearchStore3 searchResult) {
        return new AcatsInSearchEquityViewState(searchResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AcatsInSearchEquityViewState) && Intrinsics.areEqual(this.searchResult, ((AcatsInSearchEquityViewState) other).searchResult);
    }

    public int hashCode() {
        SearchStore3 searchStore3 = this.searchResult;
        if (searchStore3 == null) {
            return 0;
        }
        return searchStore3.hashCode();
    }

    public String toString() {
        return "AcatsInSearchEquityViewState(searchResult=" + this.searchResult + ")";
    }

    public AcatsInSearchEquityViewState(SearchStore3 searchStore3) {
        this.searchResult = searchStore3;
    }

    public /* synthetic */ AcatsInSearchEquityViewState(SearchStore3 searchStore3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchStore3);
    }

    public final SearchStore3 getSearchResult() {
        return this.searchResult;
    }
}
