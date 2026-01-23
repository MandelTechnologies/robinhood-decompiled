package com.robinhood.android.common.detail.component.topbaraction;

import com.robinhood.models.p320db.Security;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailPageAddToWatchlistActionViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/detail/component/topbaraction/DetailPageAddToWatchlistActionViewState;", "", "watchlistSecurity", "Lcom/robinhood/models/db/Security;", "addedToWatchlist", "", "<init>", "(Lcom/robinhood/models/db/Security;Z)V", "getWatchlistSecurity", "()Lcom/robinhood/models/db/Security;", "getAddedToWatchlist", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-detail-component_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DetailPageAddToWatchlistActionViewState {
    public static final int $stable = 8;
    private final boolean addedToWatchlist;
    private final Security watchlistSecurity;

    public static /* synthetic */ DetailPageAddToWatchlistActionViewState copy$default(DetailPageAddToWatchlistActionViewState detailPageAddToWatchlistActionViewState, Security security, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            security = detailPageAddToWatchlistActionViewState.watchlistSecurity;
        }
        if ((i & 2) != 0) {
            z = detailPageAddToWatchlistActionViewState.addedToWatchlist;
        }
        return detailPageAddToWatchlistActionViewState.copy(security, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Security getWatchlistSecurity() {
        return this.watchlistSecurity;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAddedToWatchlist() {
        return this.addedToWatchlist;
    }

    public final DetailPageAddToWatchlistActionViewState copy(Security watchlistSecurity, boolean addedToWatchlist) {
        return new DetailPageAddToWatchlistActionViewState(watchlistSecurity, addedToWatchlist);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailPageAddToWatchlistActionViewState)) {
            return false;
        }
        DetailPageAddToWatchlistActionViewState detailPageAddToWatchlistActionViewState = (DetailPageAddToWatchlistActionViewState) other;
        return Intrinsics.areEqual(this.watchlistSecurity, detailPageAddToWatchlistActionViewState.watchlistSecurity) && this.addedToWatchlist == detailPageAddToWatchlistActionViewState.addedToWatchlist;
    }

    public int hashCode() {
        Security security = this.watchlistSecurity;
        return ((security == null ? 0 : security.hashCode()) * 31) + Boolean.hashCode(this.addedToWatchlist);
    }

    public String toString() {
        return "DetailPageAddToWatchlistActionViewState(watchlistSecurity=" + this.watchlistSecurity + ", addedToWatchlist=" + this.addedToWatchlist + ")";
    }

    public DetailPageAddToWatchlistActionViewState(Security security, boolean z) {
        this.watchlistSecurity = security;
        this.addedToWatchlist = z;
    }

    public final Security getWatchlistSecurity() {
        return this.watchlistSecurity;
    }

    public final boolean getAddedToWatchlist() {
        return this.addedToWatchlist;
    }
}
