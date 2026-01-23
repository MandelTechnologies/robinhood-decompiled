package com.robinhood.android.indexes.detail.components.about;

import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageAboutDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/about/IndexDetailPageAboutDataState;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/indexes/models/db/Index;", "<init>", "(Lcom/robinhood/android/indexes/models/db/Index;)V", "getIndex", "()Lcom/robinhood/android/indexes/models/db/Index;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexDetailPageAboutDataState {
    public static final int $stable = 8;
    private final Index index;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexDetailPageAboutDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IndexDetailPageAboutDataState copy$default(IndexDetailPageAboutDataState indexDetailPageAboutDataState, Index index, int i, Object obj) {
        if ((i & 1) != 0) {
            index = indexDetailPageAboutDataState.index;
        }
        return indexDetailPageAboutDataState.copy(index);
    }

    /* renamed from: component1, reason: from getter */
    public final Index getIndex() {
        return this.index;
    }

    public final IndexDetailPageAboutDataState copy(Index index) {
        return new IndexDetailPageAboutDataState(index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IndexDetailPageAboutDataState) && Intrinsics.areEqual(this.index, ((IndexDetailPageAboutDataState) other).index);
    }

    public int hashCode() {
        Index index = this.index;
        if (index == null) {
            return 0;
        }
        return index.hashCode();
    }

    public String toString() {
        return "IndexDetailPageAboutDataState(index=" + this.index + ")";
    }

    public IndexDetailPageAboutDataState(Index index) {
        this.index = index;
    }

    public /* synthetic */ IndexDetailPageAboutDataState(Index index, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : index);
    }

    public final Index getIndex() {
        return this.index;
    }
}
