package com.robinhood.android.eventcontracts.sharedeventui.util;

import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewListParams;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BuildHistoryPreviewFilterForEvent.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a,\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"buildHistoryPreviewFilterForEvent", "Lcom/robinhood/android/eventcontracts/sharedeventui/util/EventContractHistoryFilterState;", "swapsAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "eventId", "Ljava/util/UUID;", "buildUpcomingActivityPreviewFilterForEvent", "buildOrdersPreviewFilterForEvent", "filterState", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "showLoadingItems", "", "buildStaticFilterForEvent", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "individualAccountNumber", "", "swapsSubAccountId", "EVENT_DETAIL_HISTORY_PREVIEW_ROW_DISPLAY_COUNT", "", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.util.BuildHistoryPreviewFilterForEventKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildHistoryPreviewFilterForEvent {
    private static final int EVENT_DETAIL_HISTORY_PREVIEW_ROW_DISPLAY_COUNT = 4;

    public static final EventContractHistoryFilterState buildHistoryPreviewFilterForEvent(FuturesAccount futuresAccount, UUID eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return buildOrdersPreviewFilterForEvent(HistoryEvent.State.SETTLED, futuresAccount, eventId, true);
    }

    public static final EventContractHistoryFilterState buildUpcomingActivityPreviewFilterForEvent(FuturesAccount futuresAccount, UUID eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return buildOrdersPreviewFilterForEvent(HistoryEvent.State.PENDING, futuresAccount, eventId, false);
    }

    private static final EventContractHistoryFilterState buildOrdersPreviewFilterForEvent(HistoryEvent.State state, FuturesAccount futuresAccount, UUID uuid, boolean z) {
        String rhsAccountNumber = futuresAccount != null ? futuresAccount.getRhsAccountNumber() : null;
        if (rhsAccountNumber == null) {
            return null;
        }
        return new EventContractHistoryFilterState(new HistoryPreviewListParams(buildStaticFilterForEvent(rhsAccountNumber, futuresAccount.getId(), uuid), state, extensions2.persistentSetOf(HistoryTransactionType.EVENT_ORDER), 4, z), new AccountsHistoryContract.Key(AccountsHistoryAccountTypeFilter.RHS, AccountsHistoryTransactionTypeFilter.EVENT_CONTRACTS, new AccountsHistoryContract.InstrumentFilter(uuid, AccountsHistoryContract.InstrumentFilterType.EVENT), null, true, null, 40, null));
    }

    private static final HistoryStaticFilter buildStaticFilterForEvent(String str, UUID uuid, UUID uuid2) {
        return new HistoryStaticFilter(new HistoryStaticFilter.InstrumentFilter(uuid2, HistoryStaticFilter.InstrumentFilterType.EVENT), null, null, null, uuid, null, null, null, true, extensions2.persistentSetOf(new HistoryStaticFilter.RhsAccountContext(str, BrokerageAccountType.INDIVIDUAL)), null, 1262, null);
    }
}
