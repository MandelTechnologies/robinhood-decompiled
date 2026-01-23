package com.robinhood.android.indexes.detail.components.history;

import com.robinhood.android.common.detail.component.history.DetailPageHistoryViewState;
import com.robinhood.android.common.detail.component.history.HistoryItemWithDuxoKeyPrefix;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.history.contracts.AllHistoryFragmentKey;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: IndexDetailPageHistoryStateProvider.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a<\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u000f"}, m3636d2 = {"getIndexDetailPageHistoryShowAllKey", "Lcom/robinhood/shared/history/contracts/AllHistoryFragmentKey;", "indexId", "Ljava/util/UUID;", "currentAccount", "Lcom/robinhood/models/db/Account;", "getDetailPageHistoryViewState", "Lcom/robinhood/android/common/detail/component/history/DetailPageHistoryViewState;", "historyEvents", "", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "title", "", "duxoKeyPrefix", "feature-index-detail-page_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.indexes.detail.components.history.IndexDetailPageHistoryStateProviderKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IndexDetailPageHistoryStateProvider2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final AllHistoryFragmentKey getIndexDetailPageHistoryShowAllKey(UUID indexId, Account currentAccount) {
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Intrinsics.checkNotNullParameter(currentAccount, "currentAccount");
        EnumSet enumSetOf = EnumSet.of(AllHistoryFragmentKey.Filter.ALL);
        Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
        HistoryStaticFilter.NummusAccountContext nummusAccountContext = null;
        UUID uuid = null;
        UUID uuid2 = null;
        UUID uuid3 = null;
        UUID uuid4 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        boolean z = false;
        boolean z2 = false;
        return new AllHistoryFragmentKey(enumSetOf, null, null, new HistoryStaticFilter(new HistoryStaticFilter.InstrumentFilter(indexId, HistoryStaticFilter.InstrumentFilterType.INDEX), new HistoryStaticFilter.RhsAccountContext(currentAccount.getAccountNumber(), currentAccount.getBrokerageAccountType()), nummusAccountContext, uuid, uuid2, uuid3, uuid4, bool, Boolean.TRUE, bool2, 764, null), false, 0 == true ? 1 : 0, z, z2, 118, 0 == true ? 1 : 0);
    }

    public static final DetailPageHistoryViewState getDetailPageHistoryViewState(Account account, UUID indexId, List<? extends StatefulHistoryEvent<? extends HistoryEvent>> historyEvents, String title, String duxoKeyPrefix) {
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Intrinsics.checkNotNullParameter(historyEvents, "historyEvents");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(duxoKeyPrefix, "duxoKeyPrefix");
        List<? extends StatefulHistoryEvent<? extends HistoryEvent>> listSubList = historyEvents.subList(0, Math.min(historyEvents.size(), 4));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(new HistoryItemWithDuxoKeyPrefix((StatefulHistoryEvent) it.next(), duxoKeyPrefix));
        }
        return new DetailPageHistoryViewState(title, extensions2.toImmutableList(arrayList), account != null ? getIndexDetailPageHistoryShowAllKey(indexId, account) : null, !historyEvents.isEmpty(), historyEvents.size() > 4);
    }
}
