package com.robinhood.android.search.search;

import com.robinhood.rosetta.eventlogging.SearchResultItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchItem.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchResultEventData;", "", "contentType", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "query", "", "itemPosition", "", "itemCount", "<init>", "(Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;Ljava/lang/String;II)V", "getContentType", "()Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "getQuery", "()Ljava/lang/String;", "getItemPosition", "()I", "getItemCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SearchResultEventData {
    public static final int $stable = 0;
    private final SearchResultItem.ContentType contentType;
    private final int itemCount;
    private final int itemPosition;
    private final String query;

    public static /* synthetic */ SearchResultEventData copy$default(SearchResultEventData searchResultEventData, SearchResultItem.ContentType contentType, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            contentType = searchResultEventData.contentType;
        }
        if ((i3 & 2) != 0) {
            str = searchResultEventData.query;
        }
        if ((i3 & 4) != 0) {
            i = searchResultEventData.itemPosition;
        }
        if ((i3 & 8) != 0) {
            i2 = searchResultEventData.itemCount;
        }
        return searchResultEventData.copy(contentType, str, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final SearchResultItem.ContentType getContentType() {
        return this.contentType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component3, reason: from getter */
    public final int getItemPosition() {
        return this.itemPosition;
    }

    /* renamed from: component4, reason: from getter */
    public final int getItemCount() {
        return this.itemCount;
    }

    public final SearchResultEventData copy(SearchResultItem.ContentType contentType, String query, int itemPosition, int itemCount) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(query, "query");
        return new SearchResultEventData(contentType, query, itemPosition, itemCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultEventData)) {
            return false;
        }
        SearchResultEventData searchResultEventData = (SearchResultEventData) other;
        return this.contentType == searchResultEventData.contentType && Intrinsics.areEqual(this.query, searchResultEventData.query) && this.itemPosition == searchResultEventData.itemPosition && this.itemCount == searchResultEventData.itemCount;
    }

    public int hashCode() {
        return (((((this.contentType.hashCode() * 31) + this.query.hashCode()) * 31) + Integer.hashCode(this.itemPosition)) * 31) + Integer.hashCode(this.itemCount);
    }

    public String toString() {
        return "SearchResultEventData(contentType=" + this.contentType + ", query=" + this.query + ", itemPosition=" + this.itemPosition + ", itemCount=" + this.itemCount + ")";
    }

    public SearchResultEventData(SearchResultItem.ContentType contentType, String query, int i, int i2) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(query, "query");
        this.contentType = contentType;
        this.query = query;
        this.itemPosition = i;
        this.itemCount = i2;
    }

    public final SearchResultItem.ContentType getContentType() {
        return this.contentType;
    }

    public final String getQuery() {
        return this.query;
    }

    public final int getItemPosition() {
        return this.itemPosition;
    }

    public final int getItemCount() {
        return this.itemCount;
    }
}
