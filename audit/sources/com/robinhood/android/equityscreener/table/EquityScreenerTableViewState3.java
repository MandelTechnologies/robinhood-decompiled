package com.robinhood.android.equityscreener.table;

import com.robinhood.android.equityscreener.table.EquityScreenerTableViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.equityscreener.models.p294db.ScanResultResponse;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.equityscreener.models.p294db.ScreenerTableRow;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicator;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: EquityScreenerTableViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/EquityScreenerTableStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableDataState;", "Lcom/robinhood/android/equityscreener/table/EquityScreenerTableViewState;", "<init>", "()V", "reduce", "dataState", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.table.EquityScreenerTableStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityScreenerTableViewState3 implements StateProvider<EquityScreenerTableDataState, EquityScreenerTableViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public EquityScreenerTableViewState reduce(EquityScreenerTableDataState dataState) {
        boolean z;
        boolean z2;
        Map<String, Map<String, String>> assetUrls;
        Map<String, String> map;
        Screener screener;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ComposeUiEvent<Unit> showCreateDialog = dataState.getShowCreateDialog();
        Screener screener2 = dataState.getScreener();
        ScanResultResponse scanResults = dataState.getScanResults();
        List<ScreenerIndicator> indicators = dataState.getIndicators();
        Boolean hasChanges = dataState.getHasChanges();
        Boolean bool = Boolean.TRUE;
        boolean zAreEqual = Intrinsics.areEqual(hasChanges, bool);
        boolean z3 = false;
        if (Intrinsics.areEqual(dataState.getHasChanges(), bool) || ((screener = dataState.getScreener()) != null && screener.isPreset())) {
            z = false;
            z3 = true;
        } else {
            z = false;
        }
        ComposeUiEvent<EquityScreenerTableViewState.WatchlistToggleEvent> watchlistNavigationEvent = dataState.getWatchlistNavigationEvent();
        Screener screener3 = dataState.getScreener();
        boolean z4 = (screener3 == null || screener3.isPreset() || StringsKt.isBlank(dataState.getScreener().getId())) ? z : true;
        Screener screener4 = dataState.getScreener();
        String str = null;
        String str2 = (screener4 == null || (assetUrls = screener4.getAssetUrls()) == null || (map = assetUrls.get("48x64")) == null) ? null : map.get("svg");
        Screener screener5 = dataState.getScreener();
        if (screener5 == null || !screener5.isPreset()) {
            str2 = null;
        }
        Screener screener6 = dataState.getScreener();
        String iconEmoji = screener6 != null ? screener6.getIconEmoji() : null;
        Screener screener7 = dataState.getScreener();
        if (screener7 != null && !screener7.isPreset()) {
            str = iconEmoji;
        }
        if (dataState.getScanResults() == null) {
            z2 = z;
            break;
        }
        List<ScreenerTableRow> rows = dataState.getScanResults().getRows();
        if (!(rows instanceof Collection) || !rows.isEmpty()) {
            Iterator<T> it = rows.iterator();
            while (it.hasNext()) {
                if (((ScreenerTableRow) it.next()).getInstrumentId().length() > 0) {
                    z2 = z;
                    break;
                }
            }
        }
        z2 = true;
        if (dataState.getScanResults() == null) {
            z = true;
        }
        return new EquityScreenerTableViewState(showCreateDialog, screener2, scanResults, indicators, zAreEqual, z3, z4, watchlistNavigationEvent, str2, str, z, z2, dataState.getLocality(), dataState.getGenericTableDataV2());
    }
}
