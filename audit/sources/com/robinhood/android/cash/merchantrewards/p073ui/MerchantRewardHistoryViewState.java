package com.robinhood.android.cash.merchantrewards.p073ui;

import androidx.paging.PagedList;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardHistoryViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0018\u00010\u0003HÆ\u0003J%\u0010\f\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardHistoryViewState;", "", "historyEvents", "Landroidx/paging/PagedList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "<init>", "(Landroidx/paging/PagedList;)V", "getHistoryEvents", "()Landroidx/paging/PagedList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MerchantRewardHistoryViewState {
    public static final int $stable = 8;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> historyEvents;

    /* JADX WARN: Multi-variable type inference failed */
    public MerchantRewardHistoryViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MerchantRewardHistoryViewState copy$default(MerchantRewardHistoryViewState merchantRewardHistoryViewState, PagedList pagedList, int i, Object obj) {
        if ((i & 1) != 0) {
            pagedList = merchantRewardHistoryViewState.historyEvents;
        }
        return merchantRewardHistoryViewState.copy(pagedList);
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component1() {
        return this.historyEvents;
    }

    public final MerchantRewardHistoryViewState copy(PagedList<StatefulHistoryEvent<HistoryEvent>> historyEvents) {
        return new MerchantRewardHistoryViewState(historyEvents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MerchantRewardHistoryViewState) && Intrinsics.areEqual(this.historyEvents, ((MerchantRewardHistoryViewState) other).historyEvents);
    }

    public int hashCode() {
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList = this.historyEvents;
        if (pagedList == null) {
            return 0;
        }
        return pagedList.hashCode();
    }

    public String toString() {
        return "MerchantRewardHistoryViewState(historyEvents=" + this.historyEvents + ")";
    }

    public MerchantRewardHistoryViewState(PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList) {
        this.historyEvents = pagedList;
    }

    public /* synthetic */ MerchantRewardHistoryViewState(PagedList pagedList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pagedList);
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getHistoryEvents() {
        return this.historyEvents;
    }
}
