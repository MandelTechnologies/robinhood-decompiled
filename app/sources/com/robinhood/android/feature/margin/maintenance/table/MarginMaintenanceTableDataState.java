package com.robinhood.android.feature.margin.maintenance.table;

import com.robinhood.android.lib.margin.hub.p168db.models.MarginMaintenanceTableView;
import com.robinhood.rosetta.eventlogging.MarginHealthStateDto;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginMaintenanceTableState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u0019\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fHÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableDataState;", "", "tableView", "Lcom/robinhood/android/lib/margin/hub/db/models/MarginMaintenanceTableView;", "isRowExpanded", "", "", "", "marginHealthState", "Lcom/robinhood/rosetta/eventlogging/MarginHealthStateDto;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Lcom/robinhood/android/lib/margin/hub/db/models/MarginMaintenanceTableView;Ljava/util/Map;Lcom/robinhood/rosetta/eventlogging/MarginHealthStateDto;Ljava/lang/Exception;)V", "getTableView", "()Lcom/robinhood/android/lib/margin/hub/db/models/MarginMaintenanceTableView;", "()Ljava/util/Map;", "getMarginHealthState", "()Lcom/robinhood/rosetta/eventlogging/MarginHealthStateDto;", "getError", "()Ljava/lang/Exception;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-margin-maintenance-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarginMaintenanceTableDataState {
    public static final int $stable = 8;
    private final Exception error;
    private final Map<String, Boolean> isRowExpanded;
    private final MarginHealthStateDto marginHealthState;
    private final MarginMaintenanceTableView tableView;

    public MarginMaintenanceTableDataState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarginMaintenanceTableDataState copy$default(MarginMaintenanceTableDataState marginMaintenanceTableDataState, MarginMaintenanceTableView marginMaintenanceTableView, Map map, MarginHealthStateDto marginHealthStateDto, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            marginMaintenanceTableView = marginMaintenanceTableDataState.tableView;
        }
        if ((i & 2) != 0) {
            map = marginMaintenanceTableDataState.isRowExpanded;
        }
        if ((i & 4) != 0) {
            marginHealthStateDto = marginMaintenanceTableDataState.marginHealthState;
        }
        if ((i & 8) != 0) {
            exc = marginMaintenanceTableDataState.error;
        }
        return marginMaintenanceTableDataState.copy(marginMaintenanceTableView, map, marginHealthStateDto, exc);
    }

    /* renamed from: component1, reason: from getter */
    public final MarginMaintenanceTableView getTableView() {
        return this.tableView;
    }

    public final Map<String, Boolean> component2() {
        return this.isRowExpanded;
    }

    /* renamed from: component3, reason: from getter */
    public final MarginHealthStateDto getMarginHealthState() {
        return this.marginHealthState;
    }

    /* renamed from: component4, reason: from getter */
    public final Exception getError() {
        return this.error;
    }

    public final MarginMaintenanceTableDataState copy(MarginMaintenanceTableView tableView, Map<String, Boolean> isRowExpanded, MarginHealthStateDto marginHealthState, Exception error) {
        return new MarginMaintenanceTableDataState(tableView, isRowExpanded, marginHealthState, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginMaintenanceTableDataState)) {
            return false;
        }
        MarginMaintenanceTableDataState marginMaintenanceTableDataState = (MarginMaintenanceTableDataState) other;
        return Intrinsics.areEqual(this.tableView, marginMaintenanceTableDataState.tableView) && Intrinsics.areEqual(this.isRowExpanded, marginMaintenanceTableDataState.isRowExpanded) && this.marginHealthState == marginMaintenanceTableDataState.marginHealthState && Intrinsics.areEqual(this.error, marginMaintenanceTableDataState.error);
    }

    public int hashCode() {
        MarginMaintenanceTableView marginMaintenanceTableView = this.tableView;
        int iHashCode = (marginMaintenanceTableView == null ? 0 : marginMaintenanceTableView.hashCode()) * 31;
        Map<String, Boolean> map = this.isRowExpanded;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        MarginHealthStateDto marginHealthStateDto = this.marginHealthState;
        int iHashCode3 = (iHashCode2 + (marginHealthStateDto == null ? 0 : marginHealthStateDto.hashCode())) * 31;
        Exception exc = this.error;
        return iHashCode3 + (exc != null ? exc.hashCode() : 0);
    }

    public String toString() {
        return "MarginMaintenanceTableDataState(tableView=" + this.tableView + ", isRowExpanded=" + this.isRowExpanded + ", marginHealthState=" + this.marginHealthState + ", error=" + this.error + ")";
    }

    public MarginMaintenanceTableDataState(MarginMaintenanceTableView marginMaintenanceTableView, Map<String, Boolean> map, MarginHealthStateDto marginHealthStateDto, Exception exc) {
        this.tableView = marginMaintenanceTableView;
        this.isRowExpanded = map;
        this.marginHealthState = marginHealthStateDto;
        this.error = exc;
    }

    public /* synthetic */ MarginMaintenanceTableDataState(MarginMaintenanceTableView marginMaintenanceTableView, Map map, MarginHealthStateDto marginHealthStateDto, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : marginMaintenanceTableView, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : marginHealthStateDto, (i & 8) != 0 ? null : exc);
    }

    public final MarginMaintenanceTableView getTableView() {
        return this.tableView;
    }

    public final Map<String, Boolean> isRowExpanded() {
        return this.isRowExpanded;
    }

    public final MarginHealthStateDto getMarginHealthState() {
        return this.marginHealthState;
    }

    public final Exception getError() {
        return this.error;
    }
}
