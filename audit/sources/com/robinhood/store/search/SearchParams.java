package com.robinhood.store.search;

import com.robinhood.models.CommaSeparatedList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchStore.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/store/search/SearchParams;", "", "query", "", "contentTypes", "Lcom/robinhood/models/CommaSeparatedList;", "queryContext", "searchSource", "Lcom/robinhood/store/search/SearchSource;", "additionalParams", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/CommaSeparatedList;Ljava/lang/String;Lcom/robinhood/store/search/SearchSource;Ljava/util/Map;)V", "getQuery", "()Ljava/lang/String;", "getContentTypes", "()Lcom/robinhood/models/CommaSeparatedList;", "getQueryContext", "getSearchSource", "()Lcom/robinhood/store/search/SearchSource;", "getAdditionalParams", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchParams {
    private final Map<String, String> additionalParams;
    private final CommaSeparatedList<String> contentTypes;
    private final String query;
    private final String queryContext;
    private final SearchStore4 searchSource;

    public static /* synthetic */ SearchParams copy$default(SearchParams searchParams, String str, CommaSeparatedList commaSeparatedList, String str2, SearchStore4 searchStore4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchParams.query;
        }
        if ((i & 2) != 0) {
            commaSeparatedList = searchParams.contentTypes;
        }
        if ((i & 4) != 0) {
            str2 = searchParams.queryContext;
        }
        if ((i & 8) != 0) {
            searchStore4 = searchParams.searchSource;
        }
        if ((i & 16) != 0) {
            map = searchParams.additionalParams;
        }
        Map map2 = map;
        String str3 = str2;
        return searchParams.copy(str, commaSeparatedList, str3, searchStore4, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final CommaSeparatedList<String> component2() {
        return this.contentTypes;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQueryContext() {
        return this.queryContext;
    }

    /* renamed from: component4, reason: from getter */
    public final SearchStore4 getSearchSource() {
        return this.searchSource;
    }

    public final Map<String, String> component5() {
        return this.additionalParams;
    }

    public final SearchParams copy(String query, CommaSeparatedList<String> contentTypes, String queryContext, SearchStore4 searchSource, Map<String, String> additionalParams) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(contentTypes, "contentTypes");
        Intrinsics.checkNotNullParameter(queryContext, "queryContext");
        Intrinsics.checkNotNullParameter(searchSource, "searchSource");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        return new SearchParams(query, contentTypes, queryContext, searchSource, additionalParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchParams)) {
            return false;
        }
        SearchParams searchParams = (SearchParams) other;
        return Intrinsics.areEqual(this.query, searchParams.query) && Intrinsics.areEqual(this.contentTypes, searchParams.contentTypes) && Intrinsics.areEqual(this.queryContext, searchParams.queryContext) && this.searchSource == searchParams.searchSource && Intrinsics.areEqual(this.additionalParams, searchParams.additionalParams);
    }

    public int hashCode() {
        return (((((((this.query.hashCode() * 31) + this.contentTypes.hashCode()) * 31) + this.queryContext.hashCode()) * 31) + this.searchSource.hashCode()) * 31) + this.additionalParams.hashCode();
    }

    public String toString() {
        return "SearchParams(query=" + this.query + ", contentTypes=" + this.contentTypes + ", queryContext=" + this.queryContext + ", searchSource=" + this.searchSource + ", additionalParams=" + this.additionalParams + ")";
    }

    public SearchParams(String query, CommaSeparatedList<String> contentTypes, String queryContext, SearchStore4 searchSource, Map<String, String> additionalParams) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(contentTypes, "contentTypes");
        Intrinsics.checkNotNullParameter(queryContext, "queryContext");
        Intrinsics.checkNotNullParameter(searchSource, "searchSource");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        this.query = query;
        this.contentTypes = contentTypes;
        this.queryContext = queryContext;
        this.searchSource = searchSource;
        this.additionalParams = additionalParams;
    }

    public final String getQuery() {
        return this.query;
    }

    public final CommaSeparatedList<String> getContentTypes() {
        return this.contentTypes;
    }

    public final String getQueryContext() {
        return this.queryContext;
    }

    public final SearchStore4 getSearchSource() {
        return this.searchSource;
    }

    public /* synthetic */ SearchParams(String str, CommaSeparatedList commaSeparatedList, String str2, SearchStore4 searchStore4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, commaSeparatedList, str2, searchStore4, (i & 16) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<String, String> getAdditionalParams() {
        return this.additionalParams;
    }
}
