package com.robinhood.android.equityscreener.filters;

import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicatorGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityScreenerFilterViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterDataState;", "", "indicatorGroups", "", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerIndicatorGroup;", "subtitle", "", "isLoading", "", "screener", "Lcom/robinhood/equityscreener/models/db/Screener;", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLcom/robinhood/equityscreener/models/db/Screener;)V", "getIndicatorGroups", "()Ljava/util/List;", "getSubtitle", "()Ljava/lang/String;", "()Z", "getScreener", "()Lcom/robinhood/equityscreener/models/db/Screener;", "selectedFilterKeys", "", "getSelectedFilterKeys", "()Ljava/util/Set;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class EquityScreenerFilterDataState {
    public static final int $stable = 8;
    private final List<ScreenerIndicatorGroup> indicatorGroups;
    private final boolean isLoading;
    private final Screener screener;
    private final Set<String> selectedFilterKeys;
    private final String subtitle;

    public EquityScreenerFilterDataState() {
        this(null, null, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EquityScreenerFilterDataState copy$default(EquityScreenerFilterDataState equityScreenerFilterDataState, List list, String str, boolean z, Screener screener, int i, Object obj) {
        if ((i & 1) != 0) {
            list = equityScreenerFilterDataState.indicatorGroups;
        }
        if ((i & 2) != 0) {
            str = equityScreenerFilterDataState.subtitle;
        }
        if ((i & 4) != 0) {
            z = equityScreenerFilterDataState.isLoading;
        }
        if ((i & 8) != 0) {
            screener = equityScreenerFilterDataState.screener;
        }
        return equityScreenerFilterDataState.copy(list, str, z, screener);
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

    /* renamed from: component4, reason: from getter */
    public final Screener getScreener() {
        return this.screener;
    }

    public final EquityScreenerFilterDataState copy(List<ScreenerIndicatorGroup> indicatorGroups, String subtitle, boolean isLoading, Screener screener) {
        Intrinsics.checkNotNullParameter(indicatorGroups, "indicatorGroups");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new EquityScreenerFilterDataState(indicatorGroups, subtitle, isLoading, screener);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityScreenerFilterDataState)) {
            return false;
        }
        EquityScreenerFilterDataState equityScreenerFilterDataState = (EquityScreenerFilterDataState) other;
        return Intrinsics.areEqual(this.indicatorGroups, equityScreenerFilterDataState.indicatorGroups) && Intrinsics.areEqual(this.subtitle, equityScreenerFilterDataState.subtitle) && this.isLoading == equityScreenerFilterDataState.isLoading && Intrinsics.areEqual(this.screener, equityScreenerFilterDataState.screener);
    }

    public int hashCode() {
        int iHashCode = ((((this.indicatorGroups.hashCode() * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        Screener screener = this.screener;
        return iHashCode + (screener == null ? 0 : screener.hashCode());
    }

    public String toString() {
        return "EquityScreenerFilterDataState(indicatorGroups=" + this.indicatorGroups + ", subtitle=" + this.subtitle + ", isLoading=" + this.isLoading + ", screener=" + this.screener + ")";
    }

    public EquityScreenerFilterDataState(List<ScreenerIndicatorGroup> indicatorGroups, String subtitle, boolean z, Screener screener) {
        Intrinsics.checkNotNullParameter(indicatorGroups, "indicatorGroups");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.indicatorGroups = indicatorGroups;
        this.subtitle = subtitle;
        this.isLoading = z;
        this.screener = screener;
        List<Screener.Filter> filters = screener != null ? screener.getFilters() : null;
        filters = filters == null ? CollectionsKt.emptyList() : filters;
        ArrayList arrayList = new ArrayList();
        for (Object obj : filters) {
            Screener.Filter filter = (Screener.Filter) obj;
            if (!filter.isHidden() && filter.getFilter() != null) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((Screener.Filter) it.next()).getKey());
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        this.selectedFilterKeys = setUnmodifiableSet;
    }

    public /* synthetic */ EquityScreenerFilterDataState(List list, String str, boolean z, Screener screener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : screener);
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

    public final Screener getScreener() {
        return this.screener;
    }

    public final Set<String> getSelectedFilterKeys() {
        return this.selectedFilterKeys;
    }
}
