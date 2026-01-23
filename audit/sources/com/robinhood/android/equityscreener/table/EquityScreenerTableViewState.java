package com.robinhood.android.equityscreener.table;

import android.content.res.Resources;
import com.robinhood.android.brokeragecontent.BrokerageDisclosure;
import com.robinhood.android.brokeragecontent.BrokerageResource2;
import com.robinhood.android.equityscreener.C15652R;
import com.robinhood.android.equityscreener.table.data.RowClasses;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.lib.screener.ScreenTableCells;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.equityscreener.models.p294db.ScanResultResponse;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicator;
import com.robinhood.time.android.format.DurationFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import p479j$.time.Duration;
import p479j$.time.OffsetDateTime;

/* compiled from: EquityScreenerTableViewState.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001:\u0001RB½\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u000204J\u000e\u0010>\u001a\u00020\u00132\u0006\u00103\u001a\u000204J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\bHÂ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÂ\u0003J\t\u0010C\u001a\u00020\rHÆ\u0003J\t\u0010D\u001a\u00020\rHÆ\u0003J\t\u0010E\u001a\u00020\rHÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010I\u001a\u00020\rHÆ\u0003J\t\u0010J\u001a\u00020\rHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003J¿\u0001\u0010M\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0001J\u0013\u0010N\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020;HÖ\u0001J\t\u0010Q\u001a\u00020\u0013HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0015\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010#R\u0011\u0010\u0016\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010#R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001a\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b06X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010:\u001a\u00020;¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=¨\u0006S"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/EquityScreenerTableViewState;", "", "showCreateDialog", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "", "screener", "Lcom/robinhood/equityscreener/models/db/Screener;", "scanResults", "Lcom/robinhood/equityscreener/models/db/ScanResultResponse;", "indicators", "", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerIndicator;", "draft", "", "savable", "hasBeenSaved", "watchlistNavigationEvent", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableViewState$WatchlistToggleEvent;", "iconUrl", "", "iconEmoji", "isScanResultsLoading", "isScanResultsEmpty", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "genericTableData", "Lcom/robinhood/android/generic/table/GenericTableData;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells;", "<init>", "(Lcom/robinhood/compose/duxo/ComposeUiEvent;Lcom/robinhood/equityscreener/models/db/Screener;Lcom/robinhood/equityscreener/models/db/ScanResultResponse;Ljava/util/List;ZZZLcom/robinhood/compose/duxo/ComposeUiEvent;Ljava/lang/String;Ljava/lang/String;ZZLcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/android/generic/table/GenericTableData;)V", "getShowCreateDialog", "()Lcom/robinhood/compose/duxo/ComposeUiEvent;", "getScreener", "()Lcom/robinhood/equityscreener/models/db/Screener;", "getDraft", "()Z", "getSavable", "getHasBeenSaved", "getWatchlistNavigationEvent", "getIconUrl", "()Ljava/lang/String;", "getIconEmoji", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getGenericTableData", "()Lcom/robinhood/android/generic/table/GenericTableData;", "disclosureRow", "Lcom/robinhood/android/equityscreener/table/data/DisclosureRow;", "getDisclosureRow", "()Lcom/robinhood/android/equityscreener/table/data/DisclosureRow;", "getDisplayName", "resources", "Landroid/content/res/Resources;", "indicatorsMap", "", "selectedIndicators", "getSelectedIndicators", "()Ljava/util/List;", "saveButtonResId", "", "getSaveButtonResId", "()I", "getUpdatedAtSubheader", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "WatchlistToggleEvent", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class EquityScreenerTableViewState {
    public static final int $stable = 8;
    private final RowClasses disclosureRow;
    private final boolean draft;
    private final GenericTableData<ScreenTableCells> genericTableData;
    private final boolean hasBeenSaved;
    private final String iconEmoji;
    private final String iconUrl;
    private final List<ScreenerIndicator> indicators;
    private final Map<String, ScreenerIndicator> indicatorsMap;
    private final boolean isScanResultsEmpty;
    private final boolean isScanResultsLoading;
    private final CountryCode.Supported locality;
    private final boolean savable;
    private final int saveButtonResId;
    private final ScanResultResponse scanResults;
    private final Screener screener;
    private final List<ScreenerIndicator> selectedIndicators;
    private final ComposeUiEvent<Unit> showCreateDialog;
    private final ComposeUiEvent<WatchlistToggleEvent> watchlistNavigationEvent;

    public EquityScreenerTableViewState() {
        this(null, null, null, null, false, false, false, null, null, null, false, false, null, null, 16383, null);
    }

    /* renamed from: component3, reason: from getter */
    private final ScanResultResponse getScanResults() {
        return this.scanResults;
    }

    private final List<ScreenerIndicator> component4() {
        return this.indicators;
    }

    public final ComposeUiEvent<Unit> component1() {
        return this.showCreateDialog;
    }

    /* renamed from: component10, reason: from getter */
    public final String getIconEmoji() {
        return this.iconEmoji;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsScanResultsLoading() {
        return this.isScanResultsLoading;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsScanResultsEmpty() {
        return this.isScanResultsEmpty;
    }

    /* renamed from: component13, reason: from getter */
    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final GenericTableData<ScreenTableCells> component14() {
        return this.genericTableData;
    }

    /* renamed from: component2, reason: from getter */
    public final Screener getScreener() {
        return this.screener;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDraft() {
        return this.draft;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSavable() {
        return this.savable;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHasBeenSaved() {
        return this.hasBeenSaved;
    }

    public final ComposeUiEvent<WatchlistToggleEvent> component8() {
        return this.watchlistNavigationEvent;
    }

    /* renamed from: component9, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final EquityScreenerTableViewState copy(ComposeUiEvent<Unit> showCreateDialog, Screener screener, ScanResultResponse scanResults, List<ScreenerIndicator> indicators, boolean draft, boolean savable, boolean hasBeenSaved, ComposeUiEvent<WatchlistToggleEvent> watchlistNavigationEvent, String iconUrl, String iconEmoji, boolean isScanResultsLoading, boolean isScanResultsEmpty, CountryCode.Supported locality, GenericTableData<ScreenTableCells> genericTableData) {
        return new EquityScreenerTableViewState(showCreateDialog, screener, scanResults, indicators, draft, savable, hasBeenSaved, watchlistNavigationEvent, iconUrl, iconEmoji, isScanResultsLoading, isScanResultsEmpty, locality, genericTableData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityScreenerTableViewState)) {
            return false;
        }
        EquityScreenerTableViewState equityScreenerTableViewState = (EquityScreenerTableViewState) other;
        return Intrinsics.areEqual(this.showCreateDialog, equityScreenerTableViewState.showCreateDialog) && Intrinsics.areEqual(this.screener, equityScreenerTableViewState.screener) && Intrinsics.areEqual(this.scanResults, equityScreenerTableViewState.scanResults) && Intrinsics.areEqual(this.indicators, equityScreenerTableViewState.indicators) && this.draft == equityScreenerTableViewState.draft && this.savable == equityScreenerTableViewState.savable && this.hasBeenSaved == equityScreenerTableViewState.hasBeenSaved && Intrinsics.areEqual(this.watchlistNavigationEvent, equityScreenerTableViewState.watchlistNavigationEvent) && Intrinsics.areEqual(this.iconUrl, equityScreenerTableViewState.iconUrl) && Intrinsics.areEqual(this.iconEmoji, equityScreenerTableViewState.iconEmoji) && this.isScanResultsLoading == equityScreenerTableViewState.isScanResultsLoading && this.isScanResultsEmpty == equityScreenerTableViewState.isScanResultsEmpty && Intrinsics.areEqual(this.locality, equityScreenerTableViewState.locality) && Intrinsics.areEqual(this.genericTableData, equityScreenerTableViewState.genericTableData);
    }

    public int hashCode() {
        ComposeUiEvent<Unit> composeUiEvent = this.showCreateDialog;
        int iHashCode = (composeUiEvent == null ? 0 : composeUiEvent.hashCode()) * 31;
        Screener screener = this.screener;
        int iHashCode2 = (iHashCode + (screener == null ? 0 : screener.hashCode())) * 31;
        ScanResultResponse scanResultResponse = this.scanResults;
        int iHashCode3 = (iHashCode2 + (scanResultResponse == null ? 0 : scanResultResponse.hashCode())) * 31;
        List<ScreenerIndicator> list = this.indicators;
        int iHashCode4 = (((((((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.draft)) * 31) + Boolean.hashCode(this.savable)) * 31) + Boolean.hashCode(this.hasBeenSaved)) * 31;
        ComposeUiEvent<WatchlistToggleEvent> composeUiEvent2 = this.watchlistNavigationEvent;
        int iHashCode5 = (iHashCode4 + (composeUiEvent2 == null ? 0 : composeUiEvent2.hashCode())) * 31;
        String str = this.iconUrl;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconEmoji;
        int iHashCode7 = (((((iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isScanResultsLoading)) * 31) + Boolean.hashCode(this.isScanResultsEmpty)) * 31;
        CountryCode.Supported supported = this.locality;
        int iHashCode8 = (iHashCode7 + (supported == null ? 0 : supported.hashCode())) * 31;
        GenericTableData<ScreenTableCells> genericTableData = this.genericTableData;
        return iHashCode8 + (genericTableData != null ? genericTableData.hashCode() : 0);
    }

    public String toString() {
        return "EquityScreenerTableViewState(showCreateDialog=" + this.showCreateDialog + ", screener=" + this.screener + ", scanResults=" + this.scanResults + ", indicators=" + this.indicators + ", draft=" + this.draft + ", savable=" + this.savable + ", hasBeenSaved=" + this.hasBeenSaved + ", watchlistNavigationEvent=" + this.watchlistNavigationEvent + ", iconUrl=" + this.iconUrl + ", iconEmoji=" + this.iconEmoji + ", isScanResultsLoading=" + this.isScanResultsLoading + ", isScanResultsEmpty=" + this.isScanResultsEmpty + ", locality=" + this.locality + ", genericTableData=" + this.genericTableData + ")";
    }

    public EquityScreenerTableViewState(ComposeUiEvent<Unit> composeUiEvent, Screener screener, ScanResultResponse scanResultResponse, List<ScreenerIndicator> list, boolean z, boolean z2, boolean z3, ComposeUiEvent<WatchlistToggleEvent> composeUiEvent2, String str, String str2, boolean z4, boolean z5, CountryCode.Supported supported, GenericTableData<ScreenTableCells> genericTableData) {
        int i;
        this.showCreateDialog = composeUiEvent;
        this.screener = screener;
        this.scanResults = scanResultResponse;
        this.indicators = list;
        this.draft = z;
        this.savable = z2;
        this.hasBeenSaved = z3;
        this.watchlistNavigationEvent = composeUiEvent2;
        this.iconUrl = str;
        this.iconEmoji = str2;
        this.isScanResultsLoading = z4;
        this.isScanResultsEmpty = z5;
        this.locality = supported;
        this.genericTableData = genericTableData;
        this.disclosureRow = supported == null ? null : new RowClasses(BrokerageResource2.getContentfulId(BrokerageDisclosure.SCREENERS, supported), null, null, 6, null);
        List<ScreenerIndicator> listEmptyList = list == null ? CollectionsKt.emptyList() : list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10)), 16));
        for (Object obj : listEmptyList) {
            linkedHashMap.put(((ScreenerIndicator) obj).getKey(), obj);
        }
        this.indicatorsMap = linkedHashMap;
        Screener screener2 = this.screener;
        List<Screener.Filter> filters = screener2 != null ? screener2.getFilters() : null;
        filters = filters == null ? CollectionsKt.emptyList() : filters;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : filters) {
            Screener.Filter filter = (Screener.Filter) obj2;
            if (!filter.isHidden() && filter.getFilter() != null) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ScreenerIndicator screenerIndicator = this.indicatorsMap.get(((Screener.Filter) it.next()).getKey());
            if (screenerIndicator != null) {
                arrayList2.add(screenerIndicator);
            }
        }
        this.selectedIndicators = arrayList2;
        if (this.hasBeenSaved && !this.savable) {
            i = C15652R.string.screener_table_saved;
        } else {
            i = C15652R.string.screener_table_save;
        }
        this.saveButtonResId = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EquityScreenerTableViewState(ComposeUiEvent composeUiEvent, Screener screener, ScanResultResponse scanResultResponse, List list, boolean z, boolean z2, boolean z3, ComposeUiEvent composeUiEvent2, String str, String str2, boolean z4, boolean z5, CountryCode.Supported supported, GenericTableData genericTableData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ComposeUiEvent composeUiEvent3 = (i & 1) != 0 ? null : composeUiEvent;
        Screener screener2 = (i & 2) != 0 ? null : screener;
        ScanResultResponse scanResultResponse2 = (i & 4) != 0 ? null : scanResultResponse;
        this(composeUiEvent3, screener2, scanResultResponse2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : composeUiEvent2, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? scanResultResponse2 == null : z4, (i & 2048) == 0 ? z5 : false, (i & 4096) != 0 ? null : supported, (i & 8192) != 0 ? null : genericTableData);
    }

    public final ComposeUiEvent<Unit> getShowCreateDialog() {
        return this.showCreateDialog;
    }

    public final Screener getScreener() {
        return this.screener;
    }

    public final boolean getDraft() {
        return this.draft;
    }

    public final boolean getSavable() {
        return this.savable;
    }

    public final boolean getHasBeenSaved() {
        return this.hasBeenSaved;
    }

    public final ComposeUiEvent<WatchlistToggleEvent> getWatchlistNavigationEvent() {
        return this.watchlistNavigationEvent;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getIconEmoji() {
        return this.iconEmoji;
    }

    public final boolean isScanResultsLoading() {
        return this.isScanResultsLoading;
    }

    public final boolean isScanResultsEmpty() {
        return this.isScanResultsEmpty;
    }

    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final GenericTableData<ScreenTableCells> getGenericTableData() {
        return this.genericTableData;
    }

    public final RowClasses getDisclosureRow() {
        return this.disclosureRow;
    }

    public final String getDisplayName(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Screener screener = this.screener;
        String displayName = screener != null ? screener.getDisplayName() : null;
        if (displayName == null || StringsKt.isBlank(displayName)) {
            displayName = resources.getString(C15652R.string.screener_default_name);
        }
        Intrinsics.checkNotNullExpressionValue(displayName, "run(...)");
        return displayName;
    }

    public final List<ScreenerIndicator> getSelectedIndicators() {
        return this.selectedIndicators;
    }

    public final int getSaveButtonResId() {
        return this.saveButtonResId;
    }

    public final String getUpdatedAtSubheader(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        ScanResultResponse scanResultResponse = this.scanResults;
        if (scanResultResponse == null) {
            return "";
        }
        Duration durationOfSeconds = Duration.ofSeconds(OffsetDateTime.now().toEpochSecond() - OffsetDateTime.parse(scanResultResponse.getLastUpdatedTimestamp()).toEpochSecond());
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        String narrow = DurationFormatter.formatNarrow(resources, durationOfSeconds, true);
        int size = this.scanResults.getRows().size() > 1 ? this.scanResults.getRows().size() - 1 : 0;
        String quantityString = resources.getQuantityString(C15652R.plurals.screener_table_updated_subheader, size, Integer.valueOf(size), narrow);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    /* compiled from: EquityScreenerTableViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/EquityScreenerTableViewState$WatchlistToggleEvent;", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "isMember", "", "<init>", "(Lcom/robinhood/models/db/Instrument;Z)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "()Z", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class WatchlistToggleEvent {
        public static final int $stable = 8;
        private final Instrument instrument;
        private final boolean isMember;

        public WatchlistToggleEvent(Instrument instrument, boolean z) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.instrument = instrument;
            this.isMember = z;
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        /* renamed from: isMember, reason: from getter */
        public final boolean getIsMember() {
            return this.isMember;
        }
    }
}
