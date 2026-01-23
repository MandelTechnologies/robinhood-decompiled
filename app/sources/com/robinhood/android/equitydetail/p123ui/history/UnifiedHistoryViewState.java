package com.robinhood.android.equitydetail.p123ui.history;

import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: UnifiedHistoryComposableDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryViewState;", "", "historyEvents", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "displayShowAll", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Z)V", "getHistoryEvents", "()Lkotlinx/collections/immutable/ImmutableList;", "getDisplayShowAll", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UnifiedHistoryViewState {
    public static final int $stable = 8;
    private final boolean displayShowAll;
    private final ImmutableList<StatefulHistoryEvent<HistoryEvent>> historyEvents;

    /* JADX WARN: Multi-variable type inference failed */
    public UnifiedHistoryViewState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnifiedHistoryViewState copy$default(UnifiedHistoryViewState unifiedHistoryViewState, ImmutableList immutableList, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = unifiedHistoryViewState.historyEvents;
        }
        if ((i & 2) != 0) {
            z = unifiedHistoryViewState.displayShowAll;
        }
        return unifiedHistoryViewState.copy(immutableList, z);
    }

    public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> component1() {
        return this.historyEvents;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDisplayShowAll() {
        return this.displayShowAll;
    }

    public final UnifiedHistoryViewState copy(ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>> historyEvents, boolean displayShowAll) {
        Intrinsics.checkNotNullParameter(historyEvents, "historyEvents");
        return new UnifiedHistoryViewState(historyEvents, displayShowAll);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedHistoryViewState)) {
            return false;
        }
        UnifiedHistoryViewState unifiedHistoryViewState = (UnifiedHistoryViewState) other;
        return Intrinsics.areEqual(this.historyEvents, unifiedHistoryViewState.historyEvents) && this.displayShowAll == unifiedHistoryViewState.displayShowAll;
    }

    public int hashCode() {
        return (this.historyEvents.hashCode() * 31) + Boolean.hashCode(this.displayShowAll);
    }

    public String toString() {
        return "UnifiedHistoryViewState(historyEvents=" + this.historyEvents + ", displayShowAll=" + this.displayShowAll + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnifiedHistoryViewState(ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>> historyEvents, boolean z) {
        Intrinsics.checkNotNullParameter(historyEvents, "historyEvents");
        this.historyEvents = historyEvents;
        this.displayShowAll = z;
    }

    public /* synthetic */ UnifiedHistoryViewState(ImmutableList immutableList, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? extensions2.persistentListOf() : immutableList, (i & 2) != 0 ? false : z);
    }

    public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> getHistoryEvents() {
        return this.historyEvents;
    }

    public final boolean getDisplayShowAll() {
        return this.displayShowAll;
    }
}
