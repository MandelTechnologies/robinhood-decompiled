package com.truelayer.payments.p419ui.components;

import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.truelayer.payments.p419ui.models.QueryState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SearchableItems.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B5\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0003JA\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/truelayer/payments/ui/components/SearchOptions;", "T", "", ApiRenderablePlatforms.VERSIONS_ALL, "", "recommendations", "indexedItems", "", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAll", "()Ljava/util/List;", "getIndexedItems", "getRecommendations", "component1", "component2", "component3", "copy", "equals", "", "other", "filter", "query", "Lcom/truelayer/payments/ui/models/QueryState;", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class SearchOptions<T> {
    public static final int $stable = 8;
    private final List<T> all;
    private final List<Character> indexedItems;
    private final List<T> recommendations;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchOptions copy$default(SearchOptions searchOptions, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchOptions.all;
        }
        if ((i & 2) != 0) {
            list2 = searchOptions.recommendations;
        }
        if ((i & 4) != 0) {
            list3 = searchOptions.indexedItems;
        }
        return searchOptions.copy(list, list2, list3);
    }

    public final List<T> component1() {
        return this.all;
    }

    public final List<T> component2() {
        return this.recommendations;
    }

    public final List<Character> component3() {
        return this.indexedItems;
    }

    public final SearchOptions<T> copy(List<? extends T> all, List<? extends T> recommendations, List<Character> indexedItems) {
        Intrinsics.checkNotNullParameter(all, "all");
        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
        Intrinsics.checkNotNullParameter(indexedItems, "indexedItems");
        return new SearchOptions<>(all, recommendations, indexedItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchOptions)) {
            return false;
        }
        SearchOptions searchOptions = (SearchOptions) other;
        return Intrinsics.areEqual(this.all, searchOptions.all) && Intrinsics.areEqual(this.recommendations, searchOptions.recommendations) && Intrinsics.areEqual(this.indexedItems, searchOptions.indexedItems);
    }

    public int hashCode() {
        return (((this.all.hashCode() * 31) + this.recommendations.hashCode()) * 31) + this.indexedItems.hashCode();
    }

    public String toString() {
        return "SearchOptions(all=" + this.all + ", recommendations=" + this.recommendations + ", indexedItems=" + this.indexedItems + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchOptions(List<? extends T> all, List<? extends T> recommendations, List<Character> indexedItems) {
        Intrinsics.checkNotNullParameter(all, "all");
        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
        Intrinsics.checkNotNullParameter(indexedItems, "indexedItems");
        this.all = all;
        this.recommendations = recommendations;
        this.indexedItems = indexedItems;
    }

    public final List<T> getAll() {
        return this.all;
    }

    public /* synthetic */ SearchOptions(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? new ArrayList() : list3);
    }

    public final List<T> getRecommendations() {
        return this.recommendations;
    }

    public final List<Character> getIndexedItems() {
        return this.indexedItems;
    }

    public final List<T> filter(QueryState query) {
        Intrinsics.checkNotNullParameter(query, "query");
        ArrayList arrayList = this.all;
        if (query.getInner().length() == 0 && !this.recommendations.isEmpty()) {
            List<T> list = this.all;
            arrayList = new ArrayList();
            for (T t : list) {
                if (!this.recommendations.contains(t)) {
                    arrayList.add(t);
                }
            }
        }
        return arrayList;
    }
}
