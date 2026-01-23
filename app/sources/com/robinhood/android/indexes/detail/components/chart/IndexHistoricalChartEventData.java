package com.robinhood.android.indexes.detail.components.chart;

import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexHistoricalChartStates.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartEventData;", "", "indexId", "Ljava/util/UUID;", "entryPointIdentifier", "", "displaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "showCandlesticks", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Z)V", "getIndexId", "()Ljava/util/UUID;", "getEntryPointIdentifier", "()Ljava/lang/String;", "getDisplaySpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getShowCandlesticks", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexHistoricalChartEventData {
    public static final int $stable = 8;
    private final DisplaySpan displaySpan;
    private final String entryPointIdentifier;
    private final UUID indexId;
    private final boolean showCandlesticks;

    public static /* synthetic */ IndexHistoricalChartEventData copy$default(IndexHistoricalChartEventData indexHistoricalChartEventData, UUID uuid, String str, DisplaySpan displaySpan, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = indexHistoricalChartEventData.indexId;
        }
        if ((i & 2) != 0) {
            str = indexHistoricalChartEventData.entryPointIdentifier;
        }
        if ((i & 4) != 0) {
            displaySpan = indexHistoricalChartEventData.displaySpan;
        }
        if ((i & 8) != 0) {
            z = indexHistoricalChartEventData.showCandlesticks;
        }
        return indexHistoricalChartEventData.copy(uuid, str, displaySpan, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getIndexId() {
        return this.indexId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    /* renamed from: component3, reason: from getter */
    public final DisplaySpan getDisplaySpan() {
        return this.displaySpan;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowCandlesticks() {
        return this.showCandlesticks;
    }

    public final IndexHistoricalChartEventData copy(UUID indexId, String entryPointIdentifier, DisplaySpan displaySpan, boolean showCandlesticks) {
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        return new IndexHistoricalChartEventData(indexId, entryPointIdentifier, displaySpan, showCandlesticks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexHistoricalChartEventData)) {
            return false;
        }
        IndexHistoricalChartEventData indexHistoricalChartEventData = (IndexHistoricalChartEventData) other;
        return Intrinsics.areEqual(this.indexId, indexHistoricalChartEventData.indexId) && Intrinsics.areEqual(this.entryPointIdentifier, indexHistoricalChartEventData.entryPointIdentifier) && this.displaySpan == indexHistoricalChartEventData.displaySpan && this.showCandlesticks == indexHistoricalChartEventData.showCandlesticks;
    }

    public int hashCode() {
        return (((((this.indexId.hashCode() * 31) + this.entryPointIdentifier.hashCode()) * 31) + this.displaySpan.hashCode()) * 31) + Boolean.hashCode(this.showCandlesticks);
    }

    public String toString() {
        return "IndexHistoricalChartEventData(indexId=" + this.indexId + ", entryPointIdentifier=" + this.entryPointIdentifier + ", displaySpan=" + this.displaySpan + ", showCandlesticks=" + this.showCandlesticks + ")";
    }

    public IndexHistoricalChartEventData(UUID indexId, String entryPointIdentifier, DisplaySpan displaySpan, boolean z) {
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        this.indexId = indexId;
        this.entryPointIdentifier = entryPointIdentifier;
        this.displaySpan = displaySpan;
        this.showCandlesticks = z;
    }

    public final UUID getIndexId() {
        return this.indexId;
    }

    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    public final DisplaySpan getDisplaySpan() {
        return this.displaySpan;
    }

    public final boolean getShowCandlesticks() {
        return this.showCandlesticks;
    }
}
