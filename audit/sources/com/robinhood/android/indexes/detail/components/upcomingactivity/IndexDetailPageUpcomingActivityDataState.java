package com.robinhood.android.indexes.detail.components.upcomingactivity;

import com.robinhood.models.p320db.Account;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageUpcomingActivityDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/upcomingactivity/IndexDetailPageUpcomingActivityDataState;", "", "currentAccount", "Lcom/robinhood/models/db/Account;", "indexId", "Ljava/util/UUID;", "historyEvents", "", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "<init>", "(Lcom/robinhood/models/db/Account;Ljava/util/UUID;Ljava/util/List;)V", "getCurrentAccount", "()Lcom/robinhood/models/db/Account;", "getIndexId", "()Ljava/util/UUID;", "getHistoryEvents", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexDetailPageUpcomingActivityDataState {
    public static final int $stable = 8;
    private final Account currentAccount;
    private final List<StatefulHistoryEvent<HistoryEvent>> historyEvents;
    private final UUID indexId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndexDetailPageUpcomingActivityDataState copy$default(IndexDetailPageUpcomingActivityDataState indexDetailPageUpcomingActivityDataState, Account account, UUID uuid, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            account = indexDetailPageUpcomingActivityDataState.currentAccount;
        }
        if ((i & 2) != 0) {
            uuid = indexDetailPageUpcomingActivityDataState.indexId;
        }
        if ((i & 4) != 0) {
            list = indexDetailPageUpcomingActivityDataState.historyEvents;
        }
        return indexDetailPageUpcomingActivityDataState.copy(account, uuid, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getCurrentAccount() {
        return this.currentAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getIndexId() {
        return this.indexId;
    }

    public final List<StatefulHistoryEvent<HistoryEvent>> component3() {
        return this.historyEvents;
    }

    public final IndexDetailPageUpcomingActivityDataState copy(Account currentAccount, UUID indexId, List<? extends StatefulHistoryEvent<? extends HistoryEvent>> historyEvents) {
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Intrinsics.checkNotNullParameter(historyEvents, "historyEvents");
        return new IndexDetailPageUpcomingActivityDataState(currentAccount, indexId, historyEvents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexDetailPageUpcomingActivityDataState)) {
            return false;
        }
        IndexDetailPageUpcomingActivityDataState indexDetailPageUpcomingActivityDataState = (IndexDetailPageUpcomingActivityDataState) other;
        return Intrinsics.areEqual(this.currentAccount, indexDetailPageUpcomingActivityDataState.currentAccount) && Intrinsics.areEqual(this.indexId, indexDetailPageUpcomingActivityDataState.indexId) && Intrinsics.areEqual(this.historyEvents, indexDetailPageUpcomingActivityDataState.historyEvents);
    }

    public int hashCode() {
        Account account = this.currentAccount;
        return ((((account == null ? 0 : account.hashCode()) * 31) + this.indexId.hashCode()) * 31) + this.historyEvents.hashCode();
    }

    public String toString() {
        return "IndexDetailPageUpcomingActivityDataState(currentAccount=" + this.currentAccount + ", indexId=" + this.indexId + ", historyEvents=" + this.historyEvents + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IndexDetailPageUpcomingActivityDataState(Account account, UUID indexId, List<? extends StatefulHistoryEvent<? extends HistoryEvent>> historyEvents) {
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Intrinsics.checkNotNullParameter(historyEvents, "historyEvents");
        this.currentAccount = account;
        this.indexId = indexId;
        this.historyEvents = historyEvents;
    }

    public final Account getCurrentAccount() {
        return this.currentAccount;
    }

    public final UUID getIndexId() {
        return this.indexId;
    }

    public /* synthetic */ IndexDetailPageUpcomingActivityDataState(Account account, UUID uuid, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, uuid, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<StatefulHistoryEvent<HistoryEvent>> getHistoryEvents() {
        return this.historyEvents;
    }
}
