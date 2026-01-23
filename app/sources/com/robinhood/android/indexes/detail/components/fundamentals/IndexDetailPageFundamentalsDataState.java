package com.robinhood.android.indexes.detail.components.fundamentals;

import com.robinhood.android.indexes.models.p159db.IndexFundamentals;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndexDetailPageFundamentalsDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/fundamentals/IndexDetailPageFundamentalsDataState;", "", "fundamentals", "Lcom/robinhood/android/indexes/models/db/IndexFundamentals;", "<init>", "(Lcom/robinhood/android/indexes/models/db/IndexFundamentals;)V", "getFundamentals", "()Lcom/robinhood/android/indexes/models/db/IndexFundamentals;", "hasStatToShow", "", "getHasStatToShow", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class IndexDetailPageFundamentalsDataState {
    public static final int $stable = 8;
    private final IndexFundamentals fundamentals;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexDetailPageFundamentalsDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IndexDetailPageFundamentalsDataState copy$default(IndexDetailPageFundamentalsDataState indexDetailPageFundamentalsDataState, IndexFundamentals indexFundamentals, int i, Object obj) {
        if ((i & 1) != 0) {
            indexFundamentals = indexDetailPageFundamentalsDataState.fundamentals;
        }
        return indexDetailPageFundamentalsDataState.copy(indexFundamentals);
    }

    /* renamed from: component1, reason: from getter */
    public final IndexFundamentals getFundamentals() {
        return this.fundamentals;
    }

    public final IndexDetailPageFundamentalsDataState copy(IndexFundamentals fundamentals) {
        return new IndexDetailPageFundamentalsDataState(fundamentals);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IndexDetailPageFundamentalsDataState) && Intrinsics.areEqual(this.fundamentals, ((IndexDetailPageFundamentalsDataState) other).fundamentals);
    }

    public int hashCode() {
        IndexFundamentals indexFundamentals = this.fundamentals;
        if (indexFundamentals == null) {
            return 0;
        }
        return indexFundamentals.hashCode();
    }

    public String toString() {
        return "IndexDetailPageFundamentalsDataState(fundamentals=" + this.fundamentals + ")";
    }

    public IndexDetailPageFundamentalsDataState(IndexFundamentals indexFundamentals) {
        this.fundamentals = indexFundamentals;
    }

    public /* synthetic */ IndexDetailPageFundamentalsDataState(IndexFundamentals indexFundamentals, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : indexFundamentals);
    }

    public final IndexFundamentals getFundamentals() {
        return this.fundamentals;
    }

    public final boolean getHasStatToShow() {
        IndexFundamentals indexFundamentals = this.fundamentals;
        if (indexFundamentals != null) {
            List listListOf = CollectionsKt.listOf((Object[]) new BigDecimal[]{indexFundamentals.getHigh52Weeks(), indexFundamentals.getLow52Weeks(), indexFundamentals.getPeRatio(), indexFundamentals.getHigh(), indexFundamentals.getLow(), indexFundamentals.getOpen(), indexFundamentals.getPreviousClose()});
            if ((listListOf instanceof Collection) && listListOf.isEmpty()) {
                return false;
            }
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                if (((BigDecimal) it.next()) != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
