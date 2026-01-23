package com.robinhood.android.common.history.p082ui.section;

import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: HistorySectionDataState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\b\u0002\u0010\u0004\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0014\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0017J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J#\u0010\u001c\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\t\u0010\u001f\u001a\u00020\rHÂ\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\"\b\u0002\u0010\u0004\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\rHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0004\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/section/HistorySectionDataState;", "", "showFooter", "", "items", "Lkotlinx/collections/immutable/ImmutableMap;", "Ljava/util/UUID;", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "forceHide", "currentId", "displayCount", "", "<init>", "(ZLkotlinx/collections/immutable/ImmutableMap;ZLjava/util/UUID;I)V", "getShowFooter", "()Z", "getItems", "()Lkotlinx/collections/immutable/ImmutableMap;", "updateHistoryItemsForId", "id", "list", "", "historyItems", "getHistoryItems", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class HistorySectionDataState {
    public static final int $stable = 8;
    private final UUID currentId;
    private final int displayCount;
    private final boolean forceHide;
    private final ImmutableMap<UUID, ImmutableList<StatefulHistoryEvent<HistoryEvent>>> items;
    private final boolean showFooter;

    /* renamed from: component3, reason: from getter */
    private final boolean getForceHide() {
        return this.forceHide;
    }

    /* renamed from: component4, reason: from getter */
    private final UUID getCurrentId() {
        return this.currentId;
    }

    /* renamed from: component5, reason: from getter */
    private final int getDisplayCount() {
        return this.displayCount;
    }

    public static /* synthetic */ HistorySectionDataState copy$default(HistorySectionDataState historySectionDataState, boolean z, ImmutableMap immutableMap, boolean z2, UUID uuid, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = historySectionDataState.showFooter;
        }
        if ((i2 & 2) != 0) {
            immutableMap = historySectionDataState.items;
        }
        if ((i2 & 4) != 0) {
            z2 = historySectionDataState.forceHide;
        }
        if ((i2 & 8) != 0) {
            uuid = historySectionDataState.currentId;
        }
        if ((i2 & 16) != 0) {
            i = historySectionDataState.displayCount;
        }
        int i3 = i;
        boolean z3 = z2;
        return historySectionDataState.copy(z, immutableMap, z3, uuid, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowFooter() {
        return this.showFooter;
    }

    public final ImmutableMap<UUID, ImmutableList<StatefulHistoryEvent<HistoryEvent>>> component2() {
        return this.items;
    }

    public final HistorySectionDataState copy(boolean showFooter, ImmutableMap<UUID, ? extends ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>>> items, boolean forceHide, UUID currentId, int displayCount) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new HistorySectionDataState(showFooter, items, forceHide, currentId, displayCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistorySectionDataState)) {
            return false;
        }
        HistorySectionDataState historySectionDataState = (HistorySectionDataState) other;
        return this.showFooter == historySectionDataState.showFooter && Intrinsics.areEqual(this.items, historySectionDataState.items) && this.forceHide == historySectionDataState.forceHide && Intrinsics.areEqual(this.currentId, historySectionDataState.currentId) && this.displayCount == historySectionDataState.displayCount;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.showFooter) * 31) + this.items.hashCode()) * 31) + Boolean.hashCode(this.forceHide)) * 31;
        UUID uuid = this.currentId;
        return ((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + Integer.hashCode(this.displayCount);
    }

    public String toString() {
        return "HistorySectionDataState(showFooter=" + this.showFooter + ", items=" + this.items + ", forceHide=" + this.forceHide + ", currentId=" + this.currentId + ", displayCount=" + this.displayCount + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistorySectionDataState(boolean z, ImmutableMap<UUID, ? extends ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>>> items, boolean z2, UUID uuid, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.showFooter = z;
        this.items = items;
        this.forceHide = z2;
        this.currentId = uuid;
        this.displayCount = i;
    }

    public final boolean getShowFooter() {
        return this.showFooter;
    }

    public /* synthetic */ HistorySectionDataState(boolean z, ImmutableMap immutableMap, boolean z2, UUID uuid, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? extensions2.persistentMapOf() : immutableMap, z2, uuid, i);
    }

    public final ImmutableMap<UUID, ImmutableList<StatefulHistoryEvent<HistoryEvent>>> getItems() {
        return this.items;
    }

    public final ImmutableMap<UUID, ImmutableList<StatefulHistoryEvent<HistoryEvent>>> updateHistoryItemsForId(UUID id, List<? extends StatefulHistoryEvent<? extends HistoryEvent>> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<? extends StatefulHistoryEvent<? extends HistoryEvent>> list2 = list;
        ImmutableList<StatefulHistoryEvent<HistoryEvent>> immutableListEmptyList = this.items.get(id);
        if (immutableListEmptyList == null) {
            immutableListEmptyList = CollectionsKt.emptyList();
        }
        List listPlus = CollectionsKt.plus((Collection) list2, immutableListEmptyList);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listPlus) {
            if (hashSet.add(((StatefulHistoryEvent) obj).getHistoryEvent().getTransactionReference())) {
                arrayList.add(obj);
            }
        }
        return extensions2.toPersistentMap(MapsKt.plus(this.items, Tuples4.m3642to(id, extensions2.toPersistentList(arrayList))));
    }

    public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> getHistoryItems() {
        if (this.forceHide) {
            return extensions2.persistentListOf();
        }
        ImmutableList<StatefulHistoryEvent<HistoryEvent>> immutableListEmptyList = this.items.get(this.currentId);
        if (immutableListEmptyList == null) {
            immutableListEmptyList = CollectionsKt.emptyList();
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : immutableListEmptyList) {
            if (hashSet.add(((StatefulHistoryEvent) obj).getHistoryEvent().getTransactionReference())) {
                arrayList.add(obj);
            }
        }
        return extensions2.toImmutableList(CollectionsKt.take(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.common.history.ui.section.HistorySectionDataState$special$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((StatefulHistoryEvent) t2).getHistoryEvent().getInitiatedAt(), ((StatefulHistoryEvent) t).getHistoryEvent().getInitiatedAt());
            }
        }), this.displayCount));
    }
}
