package com.robinhood.android.search.highlights.p249ui.market;

import android.os.Parcelable;
import com.robinhood.android.onedaycharts.OneDayMiniChartDetails;
import com.robinhood.android.redesign.model.AssetQuote;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import search_coprocessor.p542v1.AssetTypeDto;

/* compiled from: SearchHighlightChartData.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\r\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003J\u0015\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\rHÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\rHÆ\u0003J\t\u0010?\u001a\u00020\u0017HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u001dHÆ\u0003J¿\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\r2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001J\u0013\u0010D\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightChartData;", "", "displayName", "", "subtitle", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "displayData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "colorDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "lines", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "fills", "Lcom/robinhood/models/serverdriven/experimental/api/ChartFill;", "overlays", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "legendList", "Lcom/robinhood/models/serverdriven/experimental/api/ChartLegendItem;", "loading", "", "assetQuote", "Lcom/robinhood/android/redesign/model/AssetQuote;", "assetType", "Lsearch_coprocessor/v1/AssetTypeDto;", "oneDayMiniChartDetails", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Chart;Lcom/robinhood/models/serverdriven/experimental/api/CursorData;Lcom/robinhood/compose/bento/theme/Direction;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/android/redesign/model/AssetQuote;Lsearch_coprocessor/v1/AssetTypeDto;Lcom/robinhood/android/onedaycharts/OneDayMiniChartDetails;)V", "getDisplayName", "()Ljava/lang/String;", "getSubtitle", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "getDisplayData", "()Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "getColorDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "getLines", "()Lkotlinx/collections/immutable/ImmutableList;", "getFills", "getOverlays", "getLegendList", "getLoading", "()Z", "getAssetQuote", "()Lcom/robinhood/android/redesign/model/AssetQuote;", "getAssetType", "()Lsearch_coprocessor/v1/AssetTypeDto;", "getOneDayMiniChartDetails", "()Lcom/robinhood/android/onedaycharts/OneDayMiniChartDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SearchHighlightChartData {
    public static final int $stable = 8;
    private final AssetQuote assetQuote;
    private final AssetTypeDto assetType;
    private final Chart<Parcelable> chart;
    private final BentoTheme4 colorDirection;
    private final CursorData displayData;
    private final String displayName;
    private final ImmutableList<ChartFill> fills;
    private final ImmutableList<ChartLegendItem> legendList;
    private final ImmutableList<Line> lines;
    private final boolean loading;
    private final OneDayMiniChartDetails oneDayMiniChartDetails;
    private final ImmutableList<UIComponent<GenericAction>> overlays;
    private final String subtitle;

    public static /* synthetic */ SearchHighlightChartData copy$default(SearchHighlightChartData searchHighlightChartData, String str, String str2, Chart chart, CursorData cursorData, BentoTheme4 bentoTheme4, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, boolean z, AssetQuote assetQuote, AssetTypeDto assetTypeDto, OneDayMiniChartDetails oneDayMiniChartDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchHighlightChartData.displayName;
        }
        return searchHighlightChartData.copy(str, (i & 2) != 0 ? searchHighlightChartData.subtitle : str2, (i & 4) != 0 ? searchHighlightChartData.chart : chart, (i & 8) != 0 ? searchHighlightChartData.displayData : cursorData, (i & 16) != 0 ? searchHighlightChartData.colorDirection : bentoTheme4, (i & 32) != 0 ? searchHighlightChartData.lines : immutableList, (i & 64) != 0 ? searchHighlightChartData.fills : immutableList2, (i & 128) != 0 ? searchHighlightChartData.overlays : immutableList3, (i & 256) != 0 ? searchHighlightChartData.legendList : immutableList4, (i & 512) != 0 ? searchHighlightChartData.loading : z, (i & 1024) != 0 ? searchHighlightChartData.assetQuote : assetQuote, (i & 2048) != 0 ? searchHighlightChartData.assetType : assetTypeDto, (i & 4096) != 0 ? searchHighlightChartData.oneDayMiniChartDetails : oneDayMiniChartDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component11, reason: from getter */
    public final AssetQuote getAssetQuote() {
        return this.assetQuote;
    }

    /* renamed from: component12, reason: from getter */
    public final AssetTypeDto getAssetType() {
        return this.assetType;
    }

    /* renamed from: component13, reason: from getter */
    public final OneDayMiniChartDetails getOneDayMiniChartDetails() {
        return this.oneDayMiniChartDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Chart<Parcelable> component3() {
        return this.chart;
    }

    /* renamed from: component4, reason: from getter */
    public final CursorData getDisplayData() {
        return this.displayData;
    }

    /* renamed from: component5, reason: from getter */
    public final BentoTheme4 getColorDirection() {
        return this.colorDirection;
    }

    public final ImmutableList<Line> component6() {
        return this.lines;
    }

    public final ImmutableList<ChartFill> component7() {
        return this.fills;
    }

    public final ImmutableList<UIComponent<GenericAction>> component8() {
        return this.overlays;
    }

    public final ImmutableList<ChartLegendItem> component9() {
        return this.legendList;
    }

    public final SearchHighlightChartData copy(String displayName, String subtitle, Chart<? extends Parcelable> chart, CursorData displayData, BentoTheme4 colorDirection, ImmutableList<Line> lines, ImmutableList<ChartFill> fills, ImmutableList<? extends UIComponent<? extends GenericAction>> overlays, ImmutableList<ChartLegendItem> legendList, boolean loading, AssetQuote assetQuote, AssetTypeDto assetType, OneDayMiniChartDetails oneDayMiniChartDetails) {
        Intrinsics.checkNotNullParameter(colorDirection, "colorDirection");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(fills, "fills");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
        return new SearchHighlightChartData(displayName, subtitle, chart, displayData, colorDirection, lines, fills, overlays, legendList, loading, assetQuote, assetType, oneDayMiniChartDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHighlightChartData)) {
            return false;
        }
        SearchHighlightChartData searchHighlightChartData = (SearchHighlightChartData) other;
        return Intrinsics.areEqual(this.displayName, searchHighlightChartData.displayName) && Intrinsics.areEqual(this.subtitle, searchHighlightChartData.subtitle) && Intrinsics.areEqual(this.chart, searchHighlightChartData.chart) && Intrinsics.areEqual(this.displayData, searchHighlightChartData.displayData) && this.colorDirection == searchHighlightChartData.colorDirection && Intrinsics.areEqual(this.lines, searchHighlightChartData.lines) && Intrinsics.areEqual(this.fills, searchHighlightChartData.fills) && Intrinsics.areEqual(this.overlays, searchHighlightChartData.overlays) && Intrinsics.areEqual(this.legendList, searchHighlightChartData.legendList) && this.loading == searchHighlightChartData.loading && Intrinsics.areEqual(this.assetQuote, searchHighlightChartData.assetQuote) && this.assetType == searchHighlightChartData.assetType && Intrinsics.areEqual(this.oneDayMiniChartDetails, searchHighlightChartData.oneDayMiniChartDetails);
    }

    public int hashCode() {
        String str = this.displayName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Chart<Parcelable> chart = this.chart;
        int iHashCode3 = (iHashCode2 + (chart == null ? 0 : chart.hashCode())) * 31;
        CursorData cursorData = this.displayData;
        int iHashCode4 = (((((((((iHashCode3 + (cursorData == null ? 0 : cursorData.hashCode())) * 31) + this.colorDirection.hashCode()) * 31) + this.lines.hashCode()) * 31) + this.fills.hashCode()) * 31) + this.overlays.hashCode()) * 31;
        ImmutableList<ChartLegendItem> immutableList = this.legendList;
        int iHashCode5 = (((iHashCode4 + (immutableList == null ? 0 : immutableList.hashCode())) * 31) + Boolean.hashCode(this.loading)) * 31;
        AssetQuote assetQuote = this.assetQuote;
        int iHashCode6 = (iHashCode5 + (assetQuote == null ? 0 : assetQuote.hashCode())) * 31;
        AssetTypeDto assetTypeDto = this.assetType;
        int iHashCode7 = (iHashCode6 + (assetTypeDto == null ? 0 : assetTypeDto.hashCode())) * 31;
        OneDayMiniChartDetails oneDayMiniChartDetails = this.oneDayMiniChartDetails;
        return iHashCode7 + (oneDayMiniChartDetails != null ? oneDayMiniChartDetails.hashCode() : 0);
    }

    public String toString() {
        return "SearchHighlightChartData(displayName=" + this.displayName + ", subtitle=" + this.subtitle + ", chart=" + this.chart + ", displayData=" + this.displayData + ", colorDirection=" + this.colorDirection + ", lines=" + this.lines + ", fills=" + this.fills + ", overlays=" + this.overlays + ", legendList=" + this.legendList + ", loading=" + this.loading + ", assetQuote=" + this.assetQuote + ", assetType=" + this.assetType + ", oneDayMiniChartDetails=" + this.oneDayMiniChartDetails + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchHighlightChartData(String str, String str2, Chart<? extends Parcelable> chart, CursorData cursorData, BentoTheme4 colorDirection, ImmutableList<Line> lines, ImmutableList<ChartFill> fills, ImmutableList<? extends UIComponent<? extends GenericAction>> overlays, ImmutableList<ChartLegendItem> immutableList, boolean z, AssetQuote assetQuote, AssetTypeDto assetTypeDto, OneDayMiniChartDetails oneDayMiniChartDetails) {
        Intrinsics.checkNotNullParameter(colorDirection, "colorDirection");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(fills, "fills");
        Intrinsics.checkNotNullParameter(overlays, "overlays");
        this.displayName = str;
        this.subtitle = str2;
        this.chart = chart;
        this.displayData = cursorData;
        this.colorDirection = colorDirection;
        this.lines = lines;
        this.fills = fills;
        this.overlays = overlays;
        this.legendList = immutableList;
        this.loading = z;
        this.assetQuote = assetQuote;
        this.assetType = assetTypeDto;
        this.oneDayMiniChartDetails = oneDayMiniChartDetails;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Chart<Parcelable> getChart() {
        return this.chart;
    }

    public final CursorData getDisplayData() {
        return this.displayData;
    }

    public /* synthetic */ SearchHighlightChartData(String str, String str2, Chart chart, CursorData cursorData, BentoTheme4 bentoTheme4, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, boolean z, AssetQuote assetQuote, AssetTypeDto assetTypeDto, OneDayMiniChartDetails oneDayMiniChartDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : chart, (i & 8) != 0 ? null : cursorData, (i & 16) != 0 ? BentoTheme4.POSITIVE : bentoTheme4, (i & 32) != 0 ? extensions2.toImmutableList(CollectionsKt.emptyList()) : immutableList, (i & 64) != 0 ? extensions2.toImmutableList(CollectionsKt.emptyList()) : immutableList2, (i & 128) != 0 ? extensions2.toImmutableList(CollectionsKt.emptyList()) : immutableList3, (i & 256) != 0 ? null : immutableList4, z, (i & 1024) != 0 ? null : assetQuote, (i & 2048) != 0 ? null : assetTypeDto, (i & 4096) != 0 ? null : oneDayMiniChartDetails);
    }

    public final BentoTheme4 getColorDirection() {
        return this.colorDirection;
    }

    public final ImmutableList<Line> getLines() {
        return this.lines;
    }

    public final ImmutableList<ChartFill> getFills() {
        return this.fills;
    }

    public final ImmutableList<UIComponent<GenericAction>> getOverlays() {
        return this.overlays;
    }

    public final ImmutableList<ChartLegendItem> getLegendList() {
        return this.legendList;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final AssetQuote getAssetQuote() {
        return this.assetQuote;
    }

    public final AssetTypeDto getAssetType() {
        return this.assetType;
    }

    public final OneDayMiniChartDetails getOneDayMiniChartDetails() {
        return this.oneDayMiniChartDetails;
    }
}
