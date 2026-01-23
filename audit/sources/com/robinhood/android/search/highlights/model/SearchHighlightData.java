package com.robinhood.android.search.highlights.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;
import search_coprocessor.p542v1.GetSearchHighlightsResponseDto;
import search_coprocessor.p542v1.GetSearchSubpageContentResponseDto;

/* compiled from: SearchHighlightData.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JP\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0012R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b%\u0010\u0012R\u0019\u0010*\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/model/SearchHighlightData;", "", "Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;", "highlightsResponse", "Lkotlinx/datetime/Instant;", "highlightsFetchedAt", "", "", "Lsearch_coprocessor/v1/GetSearchSubpageContentResponseDto;", "subPageContents", "subPageLastFetchedCache", "<init>", "(Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;Lkotlinx/datetime/Instant;Ljava/util/Map;Ljava/util/Map;)V", "component1", "()Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;", "component2", "()Lkotlinx/datetime/Instant;", "component3", "()Ljava/util/Map;", "component4", "copy", "(Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;Lkotlinx/datetime/Instant;Ljava/util/Map;Ljava/util/Map;)Lcom/robinhood/android/search/highlights/model/SearchHighlightData;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;", "getHighlightsResponse", "Lkotlinx/datetime/Instant;", "getHighlightsFetchedAt", "Ljava/util/Map;", "getSubPageContents", "getSubPageLastFetchedCache", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "getHighlightNextRefreshAt", "()Lj$/time/Instant;", "highlightNextRefreshAt", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SearchHighlightData {
    public static final int $stable = 8;
    private final Instant highlightsFetchedAt;
    private final GetSearchHighlightsResponseDto highlightsResponse;
    private final Map<String, GetSearchSubpageContentResponseDto> subPageContents;
    private final Map<String, Instant> subPageLastFetchedCache;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchHighlightData copy$default(SearchHighlightData searchHighlightData, GetSearchHighlightsResponseDto getSearchHighlightsResponseDto, Instant instant, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            getSearchHighlightsResponseDto = searchHighlightData.highlightsResponse;
        }
        if ((i & 2) != 0) {
            instant = searchHighlightData.highlightsFetchedAt;
        }
        if ((i & 4) != 0) {
            map = searchHighlightData.subPageContents;
        }
        if ((i & 8) != 0) {
            map2 = searchHighlightData.subPageLastFetchedCache;
        }
        return searchHighlightData.copy(getSearchHighlightsResponseDto, instant, map, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final GetSearchHighlightsResponseDto getHighlightsResponse() {
        return this.highlightsResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final Instant getHighlightsFetchedAt() {
        return this.highlightsFetchedAt;
    }

    public final Map<String, GetSearchSubpageContentResponseDto> component3() {
        return this.subPageContents;
    }

    public final Map<String, Instant> component4() {
        return this.subPageLastFetchedCache;
    }

    public final SearchHighlightData copy(GetSearchHighlightsResponseDto highlightsResponse, Instant highlightsFetchedAt, Map<String, GetSearchSubpageContentResponseDto> subPageContents, Map<String, Instant> subPageLastFetchedCache) {
        Intrinsics.checkNotNullParameter(highlightsResponse, "highlightsResponse");
        Intrinsics.checkNotNullParameter(highlightsFetchedAt, "highlightsFetchedAt");
        Intrinsics.checkNotNullParameter(subPageContents, "subPageContents");
        Intrinsics.checkNotNullParameter(subPageLastFetchedCache, "subPageLastFetchedCache");
        return new SearchHighlightData(highlightsResponse, highlightsFetchedAt, subPageContents, subPageLastFetchedCache);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHighlightData)) {
            return false;
        }
        SearchHighlightData searchHighlightData = (SearchHighlightData) other;
        return Intrinsics.areEqual(this.highlightsResponse, searchHighlightData.highlightsResponse) && Intrinsics.areEqual(this.highlightsFetchedAt, searchHighlightData.highlightsFetchedAt) && Intrinsics.areEqual(this.subPageContents, searchHighlightData.subPageContents) && Intrinsics.areEqual(this.subPageLastFetchedCache, searchHighlightData.subPageLastFetchedCache);
    }

    public int hashCode() {
        return (((((this.highlightsResponse.hashCode() * 31) + this.highlightsFetchedAt.hashCode()) * 31) + this.subPageContents.hashCode()) * 31) + this.subPageLastFetchedCache.hashCode();
    }

    public String toString() {
        return "SearchHighlightData(highlightsResponse=" + this.highlightsResponse + ", highlightsFetchedAt=" + this.highlightsFetchedAt + ", subPageContents=" + this.subPageContents + ", subPageLastFetchedCache=" + this.subPageLastFetchedCache + ")";
    }

    public SearchHighlightData(GetSearchHighlightsResponseDto highlightsResponse, Instant highlightsFetchedAt, Map<String, GetSearchSubpageContentResponseDto> subPageContents, Map<String, Instant> subPageLastFetchedCache) {
        Intrinsics.checkNotNullParameter(highlightsResponse, "highlightsResponse");
        Intrinsics.checkNotNullParameter(highlightsFetchedAt, "highlightsFetchedAt");
        Intrinsics.checkNotNullParameter(subPageContents, "subPageContents");
        Intrinsics.checkNotNullParameter(subPageLastFetchedCache, "subPageLastFetchedCache");
        this.highlightsResponse = highlightsResponse;
        this.highlightsFetchedAt = highlightsFetchedAt;
        this.subPageContents = subPageContents;
        this.subPageLastFetchedCache = subPageLastFetchedCache;
    }

    public final GetSearchHighlightsResponseDto getHighlightsResponse() {
        return this.highlightsResponse;
    }

    public final Instant getHighlightsFetchedAt() {
        return this.highlightsFetchedAt;
    }

    public /* synthetic */ SearchHighlightData(GetSearchHighlightsResponseDto getSearchHighlightsResponseDto, Instant instant, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(getSearchHighlightsResponseDto, instant, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? MapsKt.emptyMap() : map2);
    }

    public final Map<String, GetSearchSubpageContentResponseDto> getSubPageContents() {
        return this.subPageContents;
    }

    public final Map<String, Instant> getSubPageLastFetchedCache() {
        return this.subPageLastFetchedCache;
    }

    public final p479j$.time.Instant getHighlightNextRefreshAt() {
        return this.highlightsResponse.getNext_refresh_at();
    }
}
