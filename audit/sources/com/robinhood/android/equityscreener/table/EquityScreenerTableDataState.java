package com.robinhood.android.equityscreener.table;

import androidx.compose.p011ui.unit.C2002Dp;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equityscreener.C15652R;
import com.robinhood.android.equityscreener.table.EquityScreenerTableViewState;
import com.robinhood.android.generic.table.GenericRow;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.lib.screener.ScreenTableCells;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.equityscreener.models.api.ColumnAlignment;
import com.robinhood.equityscreener.models.p294db.ScanResultResponse;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.equityscreener.models.p294db.ScreenerTableColumn;
import com.robinhood.equityscreener.models.p294db.ScreenerTableRow;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicator;
import com.robinhood.models.serverdriven.experimental.api.TableColumnHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EquityScreenerTableViewState.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010 J\u0015\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u008a\u0001\u00105\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/EquityScreenerTableDataState;", "", "showCreateDialog", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "", "screener", "Lcom/robinhood/equityscreener/models/db/Screener;", "scanResults", "Lcom/robinhood/equityscreener/models/db/ScanResultResponse;", "indicators", "", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerIndicator;", "hasChanges", "", "instrumentIsWatchedStates", "", "Ljava/util/UUID;", "watchlistNavigationEvent", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableViewState$WatchlistToggleEvent;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Lcom/robinhood/compose/duxo/ComposeUiEvent;Lcom/robinhood/equityscreener/models/db/Screener;Lcom/robinhood/equityscreener/models/db/ScanResultResponse;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;Lcom/robinhood/compose/duxo/ComposeUiEvent;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getShowCreateDialog", "()Lcom/robinhood/compose/duxo/ComposeUiEvent;", "getScreener", "()Lcom/robinhood/equityscreener/models/db/Screener;", "getScanResults", "()Lcom/robinhood/equityscreener/models/db/ScanResultResponse;", "getIndicators", "()Ljava/util/List;", "getHasChanges", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInstrumentIsWatchedStates", "()Ljava/util/Map;", "getWatchlistNavigationEvent", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "genericTableDataV2", "Lcom/robinhood/android/generic/table/GenericTableData;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells;", "getGenericTableDataV2", "()Lcom/robinhood/android/generic/table/GenericTableData;", "buildGenericTableDataV2", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/robinhood/compose/duxo/ComposeUiEvent;Lcom/robinhood/equityscreener/models/db/Screener;Lcom/robinhood/equityscreener/models/db/ScanResultResponse;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;Lcom/robinhood/compose/duxo/ComposeUiEvent;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)Lcom/robinhood/android/equityscreener/table/EquityScreenerTableDataState;", "equals", "other", "hashCode", "", "toString", "", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class EquityScreenerTableDataState {
    public static final int $stable = 8;
    private final GenericTableData<ScreenTableCells> genericTableDataV2;
    private final Boolean hasChanges;
    private final List<ScreenerIndicator> indicators;
    private final Map<UUID, Boolean> instrumentIsWatchedStates;
    private final CountryCode.Supported locality;
    private final ScanResultResponse scanResults;
    private final Screener screener;
    private final ComposeUiEvent<Unit> showCreateDialog;
    private final ComposeUiEvent<EquityScreenerTableViewState.WatchlistToggleEvent> watchlistNavigationEvent;

    public EquityScreenerTableDataState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ EquityScreenerTableDataState copy$default(EquityScreenerTableDataState equityScreenerTableDataState, ComposeUiEvent composeUiEvent, Screener screener, ScanResultResponse scanResultResponse, List list, Boolean bool, Map map, ComposeUiEvent composeUiEvent2, CountryCode.Supported supported, int i, Object obj) {
        if ((i & 1) != 0) {
            composeUiEvent = equityScreenerTableDataState.showCreateDialog;
        }
        if ((i & 2) != 0) {
            screener = equityScreenerTableDataState.screener;
        }
        if ((i & 4) != 0) {
            scanResultResponse = equityScreenerTableDataState.scanResults;
        }
        if ((i & 8) != 0) {
            list = equityScreenerTableDataState.indicators;
        }
        if ((i & 16) != 0) {
            bool = equityScreenerTableDataState.hasChanges;
        }
        if ((i & 32) != 0) {
            map = equityScreenerTableDataState.instrumentIsWatchedStates;
        }
        if ((i & 64) != 0) {
            composeUiEvent2 = equityScreenerTableDataState.watchlistNavigationEvent;
        }
        if ((i & 128) != 0) {
            supported = equityScreenerTableDataState.locality;
        }
        ComposeUiEvent composeUiEvent3 = composeUiEvent2;
        CountryCode.Supported supported2 = supported;
        Boolean bool2 = bool;
        Map map2 = map;
        return equityScreenerTableDataState.copy(composeUiEvent, screener, scanResultResponse, list, bool2, map2, composeUiEvent3, supported2);
    }

    public final ComposeUiEvent<Unit> component1() {
        return this.showCreateDialog;
    }

    /* renamed from: component2, reason: from getter */
    public final Screener getScreener() {
        return this.screener;
    }

    /* renamed from: component3, reason: from getter */
    public final ScanResultResponse getScanResults() {
        return this.scanResults;
    }

    public final List<ScreenerIndicator> component4() {
        return this.indicators;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getHasChanges() {
        return this.hasChanges;
    }

    public final Map<UUID, Boolean> component6() {
        return this.instrumentIsWatchedStates;
    }

    public final ComposeUiEvent<EquityScreenerTableViewState.WatchlistToggleEvent> component7() {
        return this.watchlistNavigationEvent;
    }

    /* renamed from: component8, reason: from getter */
    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final EquityScreenerTableDataState copy(ComposeUiEvent<Unit> showCreateDialog, Screener screener, ScanResultResponse scanResults, List<ScreenerIndicator> indicators, Boolean hasChanges, Map<UUID, Boolean> instrumentIsWatchedStates, ComposeUiEvent<EquityScreenerTableViewState.WatchlistToggleEvent> watchlistNavigationEvent, CountryCode.Supported locality) {
        Intrinsics.checkNotNullParameter(instrumentIsWatchedStates, "instrumentIsWatchedStates");
        return new EquityScreenerTableDataState(showCreateDialog, screener, scanResults, indicators, hasChanges, instrumentIsWatchedStates, watchlistNavigationEvent, locality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityScreenerTableDataState)) {
            return false;
        }
        EquityScreenerTableDataState equityScreenerTableDataState = (EquityScreenerTableDataState) other;
        return Intrinsics.areEqual(this.showCreateDialog, equityScreenerTableDataState.showCreateDialog) && Intrinsics.areEqual(this.screener, equityScreenerTableDataState.screener) && Intrinsics.areEqual(this.scanResults, equityScreenerTableDataState.scanResults) && Intrinsics.areEqual(this.indicators, equityScreenerTableDataState.indicators) && Intrinsics.areEqual(this.hasChanges, equityScreenerTableDataState.hasChanges) && Intrinsics.areEqual(this.instrumentIsWatchedStates, equityScreenerTableDataState.instrumentIsWatchedStates) && Intrinsics.areEqual(this.watchlistNavigationEvent, equityScreenerTableDataState.watchlistNavigationEvent) && Intrinsics.areEqual(this.locality, equityScreenerTableDataState.locality);
    }

    public int hashCode() {
        ComposeUiEvent<Unit> composeUiEvent = this.showCreateDialog;
        int iHashCode = (composeUiEvent == null ? 0 : composeUiEvent.hashCode()) * 31;
        Screener screener = this.screener;
        int iHashCode2 = (iHashCode + (screener == null ? 0 : screener.hashCode())) * 31;
        ScanResultResponse scanResultResponse = this.scanResults;
        int iHashCode3 = (iHashCode2 + (scanResultResponse == null ? 0 : scanResultResponse.hashCode())) * 31;
        List<ScreenerIndicator> list = this.indicators;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.hasChanges;
        int iHashCode5 = (((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31) + this.instrumentIsWatchedStates.hashCode()) * 31;
        ComposeUiEvent<EquityScreenerTableViewState.WatchlistToggleEvent> composeUiEvent2 = this.watchlistNavigationEvent;
        int iHashCode6 = (iHashCode5 + (composeUiEvent2 == null ? 0 : composeUiEvent2.hashCode())) * 31;
        CountryCode.Supported supported = this.locality;
        return iHashCode6 + (supported != null ? supported.hashCode() : 0);
    }

    public String toString() {
        return "EquityScreenerTableDataState(showCreateDialog=" + this.showCreateDialog + ", screener=" + this.screener + ", scanResults=" + this.scanResults + ", indicators=" + this.indicators + ", hasChanges=" + this.hasChanges + ", instrumentIsWatchedStates=" + this.instrumentIsWatchedStates + ", watchlistNavigationEvent=" + this.watchlistNavigationEvent + ", locality=" + this.locality + ")";
    }

    public EquityScreenerTableDataState(ComposeUiEvent<Unit> composeUiEvent, Screener screener, ScanResultResponse scanResultResponse, List<ScreenerIndicator> list, Boolean bool, Map<UUID, Boolean> instrumentIsWatchedStates, ComposeUiEvent<EquityScreenerTableViewState.WatchlistToggleEvent> composeUiEvent2, CountryCode.Supported supported) {
        Intrinsics.checkNotNullParameter(instrumentIsWatchedStates, "instrumentIsWatchedStates");
        this.showCreateDialog = composeUiEvent;
        this.screener = screener;
        this.scanResults = scanResultResponse;
        this.indicators = list;
        this.hasChanges = bool;
        this.instrumentIsWatchedStates = instrumentIsWatchedStates;
        this.watchlistNavigationEvent = composeUiEvent2;
        this.locality = supported;
        this.genericTableDataV2 = buildGenericTableDataV2();
    }

    public final ComposeUiEvent<Unit> getShowCreateDialog() {
        return this.showCreateDialog;
    }

    public final Screener getScreener() {
        return this.screener;
    }

    public final ScanResultResponse getScanResults() {
        return this.scanResults;
    }

    public final List<ScreenerIndicator> getIndicators() {
        return this.indicators;
    }

    public final Boolean getHasChanges() {
        return this.hasChanges;
    }

    public /* synthetic */ EquityScreenerTableDataState(ComposeUiEvent composeUiEvent, Screener screener, ScanResultResponse scanResultResponse, List list, Boolean bool, Map map, ComposeUiEvent composeUiEvent2, CountryCode.Supported supported, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : composeUiEvent, (i & 2) != 0 ? null : screener, (i & 4) != 0 ? null : scanResultResponse, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? MapsKt.emptyMap() : map, (i & 64) != 0 ? null : composeUiEvent2, (i & 128) != 0 ? null : supported);
    }

    public final Map<UUID, Boolean> getInstrumentIsWatchedStates() {
        return this.instrumentIsWatchedStates;
    }

    public final ComposeUiEvent<EquityScreenerTableViewState.WatchlistToggleEvent> getWatchlistNavigationEvent() {
        return this.watchlistNavigationEvent;
    }

    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final GenericTableData<ScreenTableCells> getGenericTableDataV2() {
        return this.genericTableDataV2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final GenericTableData<ScreenTableCells> buildGenericTableDataV2() {
        ImmutableList immutableListPersistentListOf;
        ImmutableList immutableListPersistentListOf2;
        List<ScreenerTableRow> rows;
        List listDrop;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        List<ScreenerTableRow> rows2;
        ScreenerTableRow screenerTableRow;
        ScanResultResponse scanResultResponse = this.scanResults;
        int i = 10;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (scanResultResponse == null || (rows2 = scanResultResponse.getRows()) == null || (screenerTableRow = (ScreenerTableRow) CollectionsKt.firstOrNull((List) rows2)) == null) {
            immutableListPersistentListOf = extensions2.persistentListOf();
        } else {
            List listListOf = CollectionsKt.listOf(new ScreenTableCells.Icon(screenerTableRow.getInstrumentId(), new BentoIcon4.Size24(ServerToBentoAssetMapper2.EDIT_SURFACE_24), Integer.valueOf(C15652R.string.screener_table_data_display), false, 8, null));
            List<ScreenerTableRow.ScreenerTableItem> items = screenerTableRow.getItems();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
            int i2 = 0;
            for (Object obj : items) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ScreenerTableColumn screenerTableColumn = this.scanResults.getColumns().get(i2);
                ColumnAlignment alignment = screenerTableColumn.getAlignment();
                arrayList.add(new ScreenTableCells.Sdui(((ScreenerTableRow.ScreenerTableItem) obj).getComponent(), alignment, screenerTableColumn.getWidth() != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(r7.intValue())) : null, defaultConstructorMarker));
                i2 = i3;
            }
            List listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList), (Iterable) CollectionsKt.listOf(new ScreenTableCells.Sdui(new TableColumnHeader("Watch", null, null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), ColumnAlignment.CENTER, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0)));
            if (listPlus == null || (immutableListPersistentListOf = extensions2.toImmutableList(listPlus)) == null) {
            }
        }
        ScanResultResponse scanResultResponse2 = this.scanResults;
        if (scanResultResponse2 == null || (rows = scanResultResponse2.getRows()) == null || (listDrop = CollectionsKt.drop(rows, 1)) == null) {
            immutableListPersistentListOf2 = extensions2.persistentListOf();
        } else {
            List list = listDrop;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i4 = 0;
            for (Object obj2 : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ScreenerTableRow screenerTableRow2 = (ScreenerTableRow) obj2;
                String instrumentId = screenerTableRow2.getInstrumentId();
                List listListOf2 = CollectionsKt.listOf(new ScreenTableCells.Index(screenerTableRow2.getInstrumentId(), i4));
                List<ScreenerTableRow.ScreenerTableItem> items2 = screenerTableRow2.getItems();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(items2, i));
                int i6 = 0;
                for (Object obj3 : items2) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ScreenerTableColumn screenerTableColumn2 = this.scanResults.getColumns().get(i6);
                    ColumnAlignment alignment2 = screenerTableColumn2.getAlignment();
                    arrayList3.add(new ScreenTableCells.Sdui(((ScreenerTableRow.ScreenerTableItem) obj3).getComponent(), alignment2, screenerTableColumn2.getWidth() != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(r2.intValue())) : null, objArr == true ? 1 : 0));
                    i6 = i7;
                }
                List listPlus2 = CollectionsKt.plus((Collection) listListOf2, (Iterable) arrayList3);
                String instrumentId2 = screenerTableRow2.getInstrumentId();
                Map<UUID, Boolean> map = this.instrumentIsWatchedStates;
                UUID uuidFromString = UUID.fromString(screenerTableRow2.getInstrumentId());
                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                boolean zBooleanValue = map.getOrDefault(uuidFromString, Boolean.FALSE).booleanValue();
                if (zBooleanValue) {
                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.BUBBLE_CHECKED_24;
                } else {
                    if (zBooleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.BUBBLE_PLUS_24;
                }
                arrayList2.add(new GenericRow(instrumentId, CollectionsKt.plus((Collection) listPlus2, (Iterable) CollectionsKt.listOf(new ScreenTableCells.Icon(instrumentId2, new BentoIcon4.Size24(serverToBentoAssetMapper2), Integer.valueOf(C15652R.string.toggle_watchlist), false, 8, null))), false, null, null, 28, null));
                i4 = i5;
                i = 10;
            }
            immutableListPersistentListOf2 = extensions2.toImmutableList(arrayList2);
            if (immutableListPersistentListOf2 == null) {
            }
        }
        return new GenericTableData<>(immutableListPersistentListOf, immutableListPersistentListOf2);
    }
}
