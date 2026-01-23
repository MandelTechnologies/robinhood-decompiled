package com.robinhood.android.common.history.p082ui.lazyList;

import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;

/* compiled from: HistoryPreviewListParams.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JC\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;", "", "staticFilter", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "historyEventState", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "transactionTypes", "Lkotlinx/collections/immutable/ImmutableSet;", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "count", "", "showLoadingItems", "", "<init>", "(Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;Lkotlinx/collections/immutable/ImmutableSet;IZ)V", "getStaticFilter", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "getHistoryEventState", "()Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "getTransactionTypes", "()Lkotlinx/collections/immutable/ImmutableSet;", "getCount", "()I", "getShowLoadingItems", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HistoryPreviewListParams {
    public static final int $stable = 8;
    private final int count;
    private final HistoryEvent.State historyEventState;
    private final boolean showLoadingItems;
    private final HistoryStaticFilter staticFilter;
    private final ImmutableSet<HistoryTransactionType> transactionTypes;

    public static /* synthetic */ HistoryPreviewListParams copy$default(HistoryPreviewListParams historyPreviewListParams, HistoryStaticFilter historyStaticFilter, HistoryEvent.State state, ImmutableSet immutableSet, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            historyStaticFilter = historyPreviewListParams.staticFilter;
        }
        if ((i2 & 2) != 0) {
            state = historyPreviewListParams.historyEventState;
        }
        if ((i2 & 4) != 0) {
            immutableSet = historyPreviewListParams.transactionTypes;
        }
        if ((i2 & 8) != 0) {
            i = historyPreviewListParams.count;
        }
        if ((i2 & 16) != 0) {
            z = historyPreviewListParams.showLoadingItems;
        }
        boolean z2 = z;
        ImmutableSet immutableSet2 = immutableSet;
        return historyPreviewListParams.copy(historyStaticFilter, state, immutableSet2, i, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final HistoryStaticFilter getStaticFilter() {
        return this.staticFilter;
    }

    /* renamed from: component2, reason: from getter */
    public final HistoryEvent.State getHistoryEventState() {
        return this.historyEventState;
    }

    public final ImmutableSet<HistoryTransactionType> component3() {
        return this.transactionTypes;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowLoadingItems() {
        return this.showLoadingItems;
    }

    public final HistoryPreviewListParams copy(HistoryStaticFilter staticFilter, HistoryEvent.State historyEventState, ImmutableSet<? extends HistoryTransactionType> transactionTypes, int count, boolean showLoadingItems) {
        Intrinsics.checkNotNullParameter(staticFilter, "staticFilter");
        Intrinsics.checkNotNullParameter(transactionTypes, "transactionTypes");
        return new HistoryPreviewListParams(staticFilter, historyEventState, transactionTypes, count, showLoadingItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryPreviewListParams)) {
            return false;
        }
        HistoryPreviewListParams historyPreviewListParams = (HistoryPreviewListParams) other;
        return Intrinsics.areEqual(this.staticFilter, historyPreviewListParams.staticFilter) && this.historyEventState == historyPreviewListParams.historyEventState && Intrinsics.areEqual(this.transactionTypes, historyPreviewListParams.transactionTypes) && this.count == historyPreviewListParams.count && this.showLoadingItems == historyPreviewListParams.showLoadingItems;
    }

    public int hashCode() {
        int iHashCode = this.staticFilter.hashCode() * 31;
        HistoryEvent.State state = this.historyEventState;
        return ((((((iHashCode + (state == null ? 0 : state.hashCode())) * 31) + this.transactionTypes.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + Boolean.hashCode(this.showLoadingItems);
    }

    public String toString() {
        return "HistoryPreviewListParams(staticFilter=" + this.staticFilter + ", historyEventState=" + this.historyEventState + ", transactionTypes=" + this.transactionTypes + ", count=" + this.count + ", showLoadingItems=" + this.showLoadingItems + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryPreviewListParams(HistoryStaticFilter staticFilter, HistoryEvent.State state, ImmutableSet<? extends HistoryTransactionType> transactionTypes, int i, boolean z) {
        Intrinsics.checkNotNullParameter(staticFilter, "staticFilter");
        Intrinsics.checkNotNullParameter(transactionTypes, "transactionTypes");
        this.staticFilter = staticFilter;
        this.historyEventState = state;
        this.transactionTypes = transactionTypes;
        this.count = i;
        this.showLoadingItems = z;
    }

    public final HistoryStaticFilter getStaticFilter() {
        return this.staticFilter;
    }

    public final HistoryEvent.State getHistoryEventState() {
        return this.historyEventState;
    }

    public final ImmutableSet<HistoryTransactionType> getTransactionTypes() {
        return this.transactionTypes;
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean getShowLoadingItems() {
        return this.showLoadingItems;
    }
}
