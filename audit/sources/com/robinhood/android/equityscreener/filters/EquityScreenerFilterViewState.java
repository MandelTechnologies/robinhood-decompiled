package com.robinhood.android.equityscreener.filters;

import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicatorGroup;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityScreenerFilterViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\nHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterViewState;", "", "indicatorGroups", "", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerIndicatorGroup;", "subtitle", "", "isLoading", "", "selectedColumns", "", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLjava/util/Set;)V", "getIndicatorGroups", "()Ljava/util/List;", "getSubtitle", "()Ljava/lang/String;", "()Z", "getSelectedColumns", "()Ljava/util/Set;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityScreenerFilterViewState {
    public static final int $stable = 8;
    private final List<ScreenerIndicatorGroup> indicatorGroups;
    private final boolean isLoading;
    private final Set<String> selectedColumns;
    private final String subtitle;

    public EquityScreenerFilterViewState() {
        this(null, null, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EquityScreenerFilterViewState copy$default(EquityScreenerFilterViewState equityScreenerFilterViewState, List list, String str, boolean z, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            list = equityScreenerFilterViewState.indicatorGroups;
        }
        if ((i & 2) != 0) {
            str = equityScreenerFilterViewState.subtitle;
        }
        if ((i & 4) != 0) {
            z = equityScreenerFilterViewState.isLoading;
        }
        if ((i & 8) != 0) {
            set = equityScreenerFilterViewState.selectedColumns;
        }
        return equityScreenerFilterViewState.copy(list, str, z, set);
    }

    public final List<ScreenerIndicatorGroup> component1() {
        return this.indicatorGroups;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final Set<String> component4() {
        return this.selectedColumns;
    }

    public final EquityScreenerFilterViewState copy(List<ScreenerIndicatorGroup> indicatorGroups, String subtitle, boolean isLoading, Set<String> selectedColumns) {
        Intrinsics.checkNotNullParameter(indicatorGroups, "indicatorGroups");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(selectedColumns, "selectedColumns");
        return new EquityScreenerFilterViewState(indicatorGroups, subtitle, isLoading, selectedColumns);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityScreenerFilterViewState)) {
            return false;
        }
        EquityScreenerFilterViewState equityScreenerFilterViewState = (EquityScreenerFilterViewState) other;
        return Intrinsics.areEqual(this.indicatorGroups, equityScreenerFilterViewState.indicatorGroups) && Intrinsics.areEqual(this.subtitle, equityScreenerFilterViewState.subtitle) && this.isLoading == equityScreenerFilterViewState.isLoading && Intrinsics.areEqual(this.selectedColumns, equityScreenerFilterViewState.selectedColumns);
    }

    public int hashCode() {
        return (((((this.indicatorGroups.hashCode() * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.selectedColumns.hashCode();
    }

    public String toString() {
        return "EquityScreenerFilterViewState(indicatorGroups=" + this.indicatorGroups + ", subtitle=" + this.subtitle + ", isLoading=" + this.isLoading + ", selectedColumns=" + this.selectedColumns + ")";
    }

    public EquityScreenerFilterViewState(List<ScreenerIndicatorGroup> indicatorGroups, String subtitle, boolean z, Set<String> selectedColumns) {
        Intrinsics.checkNotNullParameter(indicatorGroups, "indicatorGroups");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(selectedColumns, "selectedColumns");
        this.indicatorGroups = indicatorGroups;
        this.subtitle = subtitle;
        this.isLoading = z;
        this.selectedColumns = selectedColumns;
    }

    public /* synthetic */ EquityScreenerFilterViewState(List list, String str, boolean z, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? SetsKt.emptySet() : set);
    }

    public final List<ScreenerIndicatorGroup> getIndicatorGroups() {
        return this.indicatorGroups;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final Set<String> getSelectedColumns() {
        return this.selectedColumns;
    }
}
