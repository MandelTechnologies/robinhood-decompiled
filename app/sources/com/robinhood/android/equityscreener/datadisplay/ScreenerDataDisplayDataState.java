package com.robinhood.android.equityscreener.datadisplay;

import com.robinhood.equityscreener.models.api.ColumnInformation;
import com.robinhood.equityscreener.models.p294db.ScanResultResponse;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.equityscreener.models.p294db.ScreenerTableColumn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: ScreenerDataDisplayViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDataState;", "", "screener", "Lcom/robinhood/equityscreener/models/db/Screener;", "columns", "", "Lcom/robinhood/equityscreener/models/api/ColumnInformation;", "hasSaved", "", "isLoading", "scanResultResponse", "Lcom/robinhood/equityscreener/models/db/ScanResultResponse;", "<init>", "(Lcom/robinhood/equityscreener/models/db/Screener;Ljava/util/List;ZZLcom/robinhood/equityscreener/models/db/ScanResultResponse;)V", "getScreener", "()Lcom/robinhood/equityscreener/models/db/Screener;", "getColumns", "()Ljava/util/List;", "getHasSaved", "()Z", "getScanResultResponse", "()Lcom/robinhood/equityscreener/models/db/ScanResultResponse;", "isLoaded", "allColumnsMap", "", "", "currentScreenerKeys", "visibleIndicators", "getVisibleIndicators", "unselectedIndicators", "getUnselectedIndicators", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class ScreenerDataDisplayDataState {
    public static final int $stable = 8;
    private final Map<String, ColumnInformation> allColumnsMap;
    private final List<ColumnInformation> columns;
    private final List<String> currentScreenerKeys;
    private final boolean hasSaved;
    private final boolean isLoaded;
    private final boolean isLoading;
    private final ScanResultResponse scanResultResponse;
    private final Screener screener;
    private final List<ColumnInformation> unselectedIndicators;
    private final List<ColumnInformation> visibleIndicators;

    public ScreenerDataDisplayDataState() {
        this(null, null, false, false, null, 31, null);
    }

    public static /* synthetic */ ScreenerDataDisplayDataState copy$default(ScreenerDataDisplayDataState screenerDataDisplayDataState, Screener screener, List list, boolean z, boolean z2, ScanResultResponse scanResultResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            screener = screenerDataDisplayDataState.screener;
        }
        if ((i & 2) != 0) {
            list = screenerDataDisplayDataState.columns;
        }
        if ((i & 4) != 0) {
            z = screenerDataDisplayDataState.hasSaved;
        }
        if ((i & 8) != 0) {
            z2 = screenerDataDisplayDataState.isLoading;
        }
        if ((i & 16) != 0) {
            scanResultResponse = screenerDataDisplayDataState.scanResultResponse;
        }
        ScanResultResponse scanResultResponse2 = scanResultResponse;
        boolean z3 = z;
        return screenerDataDisplayDataState.copy(screener, list, z3, z2, scanResultResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final Screener getScreener() {
        return this.screener;
    }

    public final List<ColumnInformation> component2() {
        return this.columns;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasSaved() {
        return this.hasSaved;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final ScanResultResponse getScanResultResponse() {
        return this.scanResultResponse;
    }

    public final ScreenerDataDisplayDataState copy(Screener screener, List<ColumnInformation> columns, boolean hasSaved, boolean isLoading, ScanResultResponse scanResultResponse) {
        return new ScreenerDataDisplayDataState(screener, columns, hasSaved, isLoading, scanResultResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenerDataDisplayDataState)) {
            return false;
        }
        ScreenerDataDisplayDataState screenerDataDisplayDataState = (ScreenerDataDisplayDataState) other;
        return Intrinsics.areEqual(this.screener, screenerDataDisplayDataState.screener) && Intrinsics.areEqual(this.columns, screenerDataDisplayDataState.columns) && this.hasSaved == screenerDataDisplayDataState.hasSaved && this.isLoading == screenerDataDisplayDataState.isLoading && Intrinsics.areEqual(this.scanResultResponse, screenerDataDisplayDataState.scanResultResponse);
    }

    public int hashCode() {
        Screener screener = this.screener;
        int iHashCode = (screener == null ? 0 : screener.hashCode()) * 31;
        List<ColumnInformation> list = this.columns;
        int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.hasSaved)) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        ScanResultResponse scanResultResponse = this.scanResultResponse;
        return iHashCode2 + (scanResultResponse != null ? scanResultResponse.hashCode() : 0);
    }

    public String toString() {
        return "ScreenerDataDisplayDataState(screener=" + this.screener + ", columns=" + this.columns + ", hasSaved=" + this.hasSaved + ", isLoading=" + this.isLoading + ", scanResultResponse=" + this.scanResultResponse + ")";
    }

    public ScreenerDataDisplayDataState(Screener screener, List<ColumnInformation> list, boolean z, boolean z2, ScanResultResponse scanResultResponse) {
        this.screener = screener;
        this.columns = list;
        this.hasSaved = z;
        this.isLoading = z2;
        this.scanResultResponse = scanResultResponse;
        this.isLoaded = (z2 && (screener == null || list == null)) ? false : true;
        List<ColumnInformation> listEmptyList = list == null ? CollectionsKt.emptyList() : list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10)), 16));
        for (Object obj : listEmptyList) {
            linkedHashMap.put(((ColumnInformation) obj).getKey(), obj);
        }
        this.allColumnsMap = linkedHashMap;
        Screener screener2 = this.screener;
        List<String> columns = screener2 != null ? screener2.getColumns() : null;
        List<String> listEmptyList2 = columns == null ? CollectionsKt.emptyList() : columns;
        if (listEmptyList2.isEmpty()) {
            ScanResultResponse scanResultResponse2 = this.scanResultResponse;
            List<ScreenerTableColumn> columns2 = scanResultResponse2 != null ? scanResultResponse2.getColumns() : null;
            columns2 = columns2 == null ? CollectionsKt.emptyList() : columns2;
            listEmptyList2 = new ArrayList<>();
            Iterator<T> it = columns2.iterator();
            while (it.hasNext()) {
                String backendIndicatorId = ((ScreenerTableColumn) it.next()).getBackendIndicatorId();
                if (backendIndicatorId != null) {
                    listEmptyList2.add(backendIndicatorId);
                }
            }
        }
        List<String> list2 = listEmptyList2;
        this.currentScreenerKeys = list2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            ColumnInformation columnInformation = this.allColumnsMap.get((String) it2.next());
            if (columnInformation != null) {
                arrayList.add(columnInformation);
            }
        }
        this.visibleIndicators = arrayList;
        List<String> list3 = this.currentScreenerKeys;
        Map<String, ColumnInformation> mapMinus = this.allColumnsMap;
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            mapMinus = MapsKt.minus(mapMinus, (String) it3.next());
        }
        this.unselectedIndicators = CollectionsKt.toList(mapMinus.values());
    }

    public /* synthetic */ ScreenerDataDisplayDataState(Screener screener, List list, boolean z, boolean z2, ScanResultResponse scanResultResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : screener, (i & 2) != 0 ? null : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : scanResultResponse);
    }

    public final Screener getScreener() {
        return this.screener;
    }

    public final List<ColumnInformation> getColumns() {
        return this.columns;
    }

    public final boolean getHasSaved() {
        return this.hasSaved;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final ScanResultResponse getScanResultResponse() {
        return this.scanResultResponse;
    }

    /* renamed from: isLoaded, reason: from getter */
    public final boolean getIsLoaded() {
        return this.isLoaded;
    }

    public final List<ColumnInformation> getVisibleIndicators() {
        return this.visibleIndicators;
    }

    public final List<ColumnInformation> getUnselectedIndicators() {
        return this.unselectedIndicators;
    }
}
