package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.redesigninvesting.investingmonitor.modes.InvestingMonitorViewMode;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p355ui.CuratedListEligible;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestingMonitorDataState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006HÆ\u0003J!\u0010%\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\t0\bHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\rHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010)\u001a\u00020\u0013HÆ\u0003J\u008d\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R)\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDataState;", "", "isUpdating", "", "isLoading", "tableData", "Lcom/robinhood/android/generic/table/GenericTableData;", "curatedListInfoPairs", "", "Lkotlin/Pair;", "Lcom/robinhood/models/db/CuratedList;", "Lcom/robinhood/models/ui/CuratedListEligible;", "recentlyCreatedCuratedListItems", "", "curatedListRenameInProgress", "", "sortingInProgressListId", "Ljava/util/UUID;", "viewMode", "Lcom/robinhood/android/redesigninvesting/investingmonitor/modes/InvestingMonitorViewMode;", "<init>", "(ZZLcom/robinhood/android/generic/table/GenericTableData;Ljava/util/List;Ljava/util/List;Lkotlin/Pair;Ljava/util/UUID;Lcom/robinhood/android/redesigninvesting/investingmonitor/modes/InvestingMonitorViewMode;)V", "()Z", "getTableData", "()Lcom/robinhood/android/generic/table/GenericTableData;", "getCuratedListInfoPairs", "()Ljava/util/List;", "getRecentlyCreatedCuratedListItems", "getCuratedListRenameInProgress", "()Lkotlin/Pair;", "getSortingInProgressListId", "()Ljava/util/UUID;", "getViewMode", "()Lcom/robinhood/android/redesigninvesting/investingmonitor/modes/InvestingMonitorViewMode;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InvestingMonitorDataState {
    public static final int $stable = 8;
    private final List<Tuples2<CuratedList, List<CuratedListEligible>>> curatedListInfoPairs;
    private final Tuples2<CuratedList, String> curatedListRenameInProgress;
    private final boolean isLoading;
    private final boolean isUpdating;
    private final List<CuratedList> recentlyCreatedCuratedListItems;
    private final UUID sortingInProgressListId;
    private final GenericTableData<?> tableData;
    private final InvestingMonitorViewMode viewMode;

    public InvestingMonitorDataState() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ InvestingMonitorDataState copy$default(InvestingMonitorDataState investingMonitorDataState, boolean z, boolean z2, GenericTableData genericTableData, List list, List list2, Tuples2 tuples2, UUID uuid, InvestingMonitorViewMode investingMonitorViewMode, int i, Object obj) {
        if ((i & 1) != 0) {
            z = investingMonitorDataState.isUpdating;
        }
        if ((i & 2) != 0) {
            z2 = investingMonitorDataState.isLoading;
        }
        if ((i & 4) != 0) {
            genericTableData = investingMonitorDataState.tableData;
        }
        if ((i & 8) != 0) {
            list = investingMonitorDataState.curatedListInfoPairs;
        }
        if ((i & 16) != 0) {
            list2 = investingMonitorDataState.recentlyCreatedCuratedListItems;
        }
        if ((i & 32) != 0) {
            tuples2 = investingMonitorDataState.curatedListRenameInProgress;
        }
        if ((i & 64) != 0) {
            uuid = investingMonitorDataState.sortingInProgressListId;
        }
        if ((i & 128) != 0) {
            investingMonitorViewMode = investingMonitorDataState.viewMode;
        }
        UUID uuid2 = uuid;
        InvestingMonitorViewMode investingMonitorViewMode2 = investingMonitorViewMode;
        List list3 = list2;
        Tuples2 tuples22 = tuples2;
        return investingMonitorDataState.copy(z, z2, genericTableData, list, list3, tuples22, uuid2, investingMonitorViewMode2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsUpdating() {
        return this.isUpdating;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final GenericTableData<?> component3() {
        return this.tableData;
    }

    public final List<Tuples2<CuratedList, List<CuratedListEligible>>> component4() {
        return this.curatedListInfoPairs;
    }

    public final List<CuratedList> component5() {
        return this.recentlyCreatedCuratedListItems;
    }

    public final Tuples2<CuratedList, String> component6() {
        return this.curatedListRenameInProgress;
    }

    /* renamed from: component7, reason: from getter */
    public final UUID getSortingInProgressListId() {
        return this.sortingInProgressListId;
    }

    /* renamed from: component8, reason: from getter */
    public final InvestingMonitorViewMode getViewMode() {
        return this.viewMode;
    }

    public final InvestingMonitorDataState copy(boolean isUpdating, boolean isLoading, GenericTableData<?> tableData, List<? extends Tuples2<CuratedList, ? extends List<? extends CuratedListEligible>>> curatedListInfoPairs, List<CuratedList> recentlyCreatedCuratedListItems, Tuples2<CuratedList, String> curatedListRenameInProgress, UUID sortingInProgressListId, InvestingMonitorViewMode viewMode) {
        Intrinsics.checkNotNullParameter(curatedListInfoPairs, "curatedListInfoPairs");
        Intrinsics.checkNotNullParameter(recentlyCreatedCuratedListItems, "recentlyCreatedCuratedListItems");
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        return new InvestingMonitorDataState(isUpdating, isLoading, tableData, curatedListInfoPairs, recentlyCreatedCuratedListItems, curatedListRenameInProgress, sortingInProgressListId, viewMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestingMonitorDataState)) {
            return false;
        }
        InvestingMonitorDataState investingMonitorDataState = (InvestingMonitorDataState) other;
        return this.isUpdating == investingMonitorDataState.isUpdating && this.isLoading == investingMonitorDataState.isLoading && Intrinsics.areEqual(this.tableData, investingMonitorDataState.tableData) && Intrinsics.areEqual(this.curatedListInfoPairs, investingMonitorDataState.curatedListInfoPairs) && Intrinsics.areEqual(this.recentlyCreatedCuratedListItems, investingMonitorDataState.recentlyCreatedCuratedListItems) && Intrinsics.areEqual(this.curatedListRenameInProgress, investingMonitorDataState.curatedListRenameInProgress) && Intrinsics.areEqual(this.sortingInProgressListId, investingMonitorDataState.sortingInProgressListId) && this.viewMode == investingMonitorDataState.viewMode;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isUpdating) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        GenericTableData<?> genericTableData = this.tableData;
        int iHashCode2 = (((((iHashCode + (genericTableData == null ? 0 : genericTableData.hashCode())) * 31) + this.curatedListInfoPairs.hashCode()) * 31) + this.recentlyCreatedCuratedListItems.hashCode()) * 31;
        Tuples2<CuratedList, String> tuples2 = this.curatedListRenameInProgress;
        int iHashCode3 = (iHashCode2 + (tuples2 == null ? 0 : tuples2.hashCode())) * 31;
        UUID uuid = this.sortingInProgressListId;
        return ((iHashCode3 + (uuid != null ? uuid.hashCode() : 0)) * 31) + this.viewMode.hashCode();
    }

    public String toString() {
        return "InvestingMonitorDataState(isUpdating=" + this.isUpdating + ", isLoading=" + this.isLoading + ", tableData=" + this.tableData + ", curatedListInfoPairs=" + this.curatedListInfoPairs + ", recentlyCreatedCuratedListItems=" + this.recentlyCreatedCuratedListItems + ", curatedListRenameInProgress=" + this.curatedListRenameInProgress + ", sortingInProgressListId=" + this.sortingInProgressListId + ", viewMode=" + this.viewMode + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvestingMonitorDataState(boolean z, boolean z2, GenericTableData<?> genericTableData, List<? extends Tuples2<CuratedList, ? extends List<? extends CuratedListEligible>>> curatedListInfoPairs, List<CuratedList> recentlyCreatedCuratedListItems, Tuples2<CuratedList, String> tuples2, UUID uuid, InvestingMonitorViewMode viewMode) {
        Intrinsics.checkNotNullParameter(curatedListInfoPairs, "curatedListInfoPairs");
        Intrinsics.checkNotNullParameter(recentlyCreatedCuratedListItems, "recentlyCreatedCuratedListItems");
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        this.isUpdating = z;
        this.isLoading = z2;
        this.tableData = genericTableData;
        this.curatedListInfoPairs = curatedListInfoPairs;
        this.recentlyCreatedCuratedListItems = recentlyCreatedCuratedListItems;
        this.curatedListRenameInProgress = tuples2;
        this.sortingInProgressListId = uuid;
        this.viewMode = viewMode;
    }

    public final boolean isUpdating() {
        return this.isUpdating;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final GenericTableData<?> getTableData() {
        return this.tableData;
    }

    public /* synthetic */ InvestingMonitorDataState(boolean z, boolean z2, GenericTableData genericTableData, List list, List list2, Tuples2 tuples2, UUID uuid, InvestingMonitorViewMode investingMonitorViewMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : genericTableData, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? new ArrayList() : list2, (i & 32) != 0 ? null : tuples2, (i & 64) != 0 ? null : uuid, (i & 128) != 0 ? InvestingMonitorViewMode.LIST : investingMonitorViewMode);
    }

    public final List<Tuples2<CuratedList, List<CuratedListEligible>>> getCuratedListInfoPairs() {
        return this.curatedListInfoPairs;
    }

    public final List<CuratedList> getRecentlyCreatedCuratedListItems() {
        return this.recentlyCreatedCuratedListItems;
    }

    public final Tuples2<CuratedList, String> getCuratedListRenameInProgress() {
        return this.curatedListRenameInProgress;
    }

    public final UUID getSortingInProgressListId() {
        return this.sortingInProgressListId;
    }

    public final InvestingMonitorViewMode getViewMode() {
        return this.viewMode;
    }
}
