package com.robinhood.android.acatsin.brokeragesearch;

import com.robinhood.android.acatsin.brokeragesearch.SearchState;
import com.robinhood.models.p320db.IacInfoBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInBrokerageSearchDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDataState;", "", "searchState", "Lcom/robinhood/android/acatsin/brokeragesearch/SearchState;", "iacInfoBanner", "Lcom/robinhood/models/db/IacInfoBanner;", "isCheckingAccountEligibility", "", "<init>", "(Lcom/robinhood/android/acatsin/brokeragesearch/SearchState;Lcom/robinhood/models/db/IacInfoBanner;Z)V", "getSearchState", "()Lcom/robinhood/android/acatsin/brokeragesearch/SearchState;", "getIacInfoBanner", "()Lcom/robinhood/models/db/IacInfoBanner;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInBrokerageSearchDataState {
    public static final int $stable = 8;
    private final IacInfoBanner iacInfoBanner;
    private final boolean isCheckingAccountEligibility;
    private final SearchState searchState;

    public AcatsInBrokerageSearchDataState() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ AcatsInBrokerageSearchDataState copy$default(AcatsInBrokerageSearchDataState acatsInBrokerageSearchDataState, SearchState searchState, IacInfoBanner iacInfoBanner, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            searchState = acatsInBrokerageSearchDataState.searchState;
        }
        if ((i & 2) != 0) {
            iacInfoBanner = acatsInBrokerageSearchDataState.iacInfoBanner;
        }
        if ((i & 4) != 0) {
            z = acatsInBrokerageSearchDataState.isCheckingAccountEligibility;
        }
        return acatsInBrokerageSearchDataState.copy(searchState, iacInfoBanner, z);
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

    public final AcatsInBrokerageSearchDataState copy(SearchState searchState, IacInfoBanner iacInfoBanner, boolean isCheckingAccountEligibility) {
        Intrinsics.checkNotNullParameter(searchState, "searchState");
        return new AcatsInBrokerageSearchDataState(searchState, iacInfoBanner, isCheckingAccountEligibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInBrokerageSearchDataState)) {
            return false;
        }
        AcatsInBrokerageSearchDataState acatsInBrokerageSearchDataState = (AcatsInBrokerageSearchDataState) other;
        return Intrinsics.areEqual(this.searchState, acatsInBrokerageSearchDataState.searchState) && Intrinsics.areEqual(this.iacInfoBanner, acatsInBrokerageSearchDataState.iacInfoBanner) && this.isCheckingAccountEligibility == acatsInBrokerageSearchDataState.isCheckingAccountEligibility;
    }

    public int hashCode() {
        int iHashCode = this.searchState.hashCode() * 31;
        IacInfoBanner iacInfoBanner = this.iacInfoBanner;
        return ((iHashCode + (iacInfoBanner == null ? 0 : iacInfoBanner.hashCode())) * 31) + Boolean.hashCode(this.isCheckingAccountEligibility);
    }

    public String toString() {
        return "AcatsInBrokerageSearchDataState(searchState=" + this.searchState + ", iacInfoBanner=" + this.iacInfoBanner + ", isCheckingAccountEligibility=" + this.isCheckingAccountEligibility + ")";
    }

    public AcatsInBrokerageSearchDataState(SearchState searchState, IacInfoBanner iacInfoBanner, boolean z) {
        Intrinsics.checkNotNullParameter(searchState, "searchState");
        this.searchState = searchState;
        this.iacInfoBanner = iacInfoBanner;
        this.isCheckingAccountEligibility = z;
    }

    public /* synthetic */ AcatsInBrokerageSearchDataState(SearchState searchState, IacInfoBanner iacInfoBanner, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
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
}
