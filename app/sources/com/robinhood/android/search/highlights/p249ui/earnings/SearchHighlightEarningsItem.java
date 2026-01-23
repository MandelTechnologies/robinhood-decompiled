package com.robinhood.android.search.highlights.p249ui.earnings;

import com.robinhood.android.redesign.model.AssetQuote;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Earning;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchHighlightEarningsItem.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightEarningsItem;", "", "call", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Call;", "eps", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Eps;", "report", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Report;", "assetQuote", "Lcom/robinhood/android/redesign/model/AssetQuote;", "<init>", "(Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Call;Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Eps;Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Report;Lcom/robinhood/android/redesign/model/AssetQuote;)V", "getCall", "()Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Call;", "getEps", "()Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Eps;", "getReport", "()Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Report;", "getAssetQuote", "()Lcom/robinhood/android/redesign/model/AssetQuote;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SearchHighlightEarningsItem {
    public static final int $stable = 8;
    private final AssetQuote assetQuote;
    private final Earning.Call call;
    private final Earning.Eps eps;
    private final Earning.Report report;

    public static /* synthetic */ SearchHighlightEarningsItem copy$default(SearchHighlightEarningsItem searchHighlightEarningsItem, Earning.Call call, Earning.Eps eps, Earning.Report report, AssetQuote assetQuote, int i, Object obj) {
        if ((i & 1) != 0) {
            call = searchHighlightEarningsItem.call;
        }
        if ((i & 2) != 0) {
            eps = searchHighlightEarningsItem.eps;
        }
        if ((i & 4) != 0) {
            report = searchHighlightEarningsItem.report;
        }
        if ((i & 8) != 0) {
            assetQuote = searchHighlightEarningsItem.assetQuote;
        }
        return searchHighlightEarningsItem.copy(call, eps, report, assetQuote);
    }

    /* renamed from: component1, reason: from getter */
    public final Earning.Call getCall() {
        return this.call;
    }

    /* renamed from: component2, reason: from getter */
    public final Earning.Eps getEps() {
        return this.eps;
    }

    /* renamed from: component3, reason: from getter */
    public final Earning.Report getReport() {
        return this.report;
    }

    /* renamed from: component4, reason: from getter */
    public final AssetQuote getAssetQuote() {
        return this.assetQuote;
    }

    public final SearchHighlightEarningsItem copy(Earning.Call call, Earning.Eps eps, Earning.Report report, AssetQuote assetQuote) {
        Intrinsics.checkNotNullParameter(assetQuote, "assetQuote");
        return new SearchHighlightEarningsItem(call, eps, report, assetQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHighlightEarningsItem)) {
            return false;
        }
        SearchHighlightEarningsItem searchHighlightEarningsItem = (SearchHighlightEarningsItem) other;
        return Intrinsics.areEqual(this.call, searchHighlightEarningsItem.call) && Intrinsics.areEqual(this.eps, searchHighlightEarningsItem.eps) && Intrinsics.areEqual(this.report, searchHighlightEarningsItem.report) && Intrinsics.areEqual(this.assetQuote, searchHighlightEarningsItem.assetQuote);
    }

    public int hashCode() {
        Earning.Call call = this.call;
        int iHashCode = (call == null ? 0 : call.hashCode()) * 31;
        Earning.Eps eps = this.eps;
        int iHashCode2 = (iHashCode + (eps == null ? 0 : eps.hashCode())) * 31;
        Earning.Report report = this.report;
        return ((iHashCode2 + (report != null ? report.hashCode() : 0)) * 31) + this.assetQuote.hashCode();
    }

    public String toString() {
        return "SearchHighlightEarningsItem(call=" + this.call + ", eps=" + this.eps + ", report=" + this.report + ", assetQuote=" + this.assetQuote + ")";
    }

    public SearchHighlightEarningsItem(Earning.Call call, Earning.Eps eps, Earning.Report report, AssetQuote assetQuote) {
        Intrinsics.checkNotNullParameter(assetQuote, "assetQuote");
        this.call = call;
        this.eps = eps;
        this.report = report;
        this.assetQuote = assetQuote;
    }

    public final Earning.Call getCall() {
        return this.call;
    }

    public final Earning.Eps getEps() {
        return this.eps;
    }

    public final Earning.Report getReport() {
        return this.report;
    }

    public final AssetQuote getAssetQuote() {
        return this.assetQuote;
    }
}
