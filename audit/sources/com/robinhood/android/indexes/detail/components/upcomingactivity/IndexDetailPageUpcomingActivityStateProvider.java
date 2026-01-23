package com.robinhood.android.indexes.detail.components.upcomingactivity;

import android.content.res.Resources;
import com.robinhood.android.common.detail.component.C11117R;
import com.robinhood.android.common.detail.component.history.DetailPageHistoryViewState;
import com.robinhood.android.indexes.detail.IndexDetailPageStates2;
import com.robinhood.android.indexes.detail.components.history.IndexDetailPageHistoryStateProvider2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageUpcomingActivityStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/upcomingactivity/IndexDetailPageUpcomingActivityStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/indexes/detail/components/upcomingactivity/IndexDetailPageUpcomingActivityDataState;", "Lcom/robinhood/android/common/detail/component/history/DetailPageHistoryViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDetailPageUpcomingActivityStateProvider implements StateProvider<IndexDetailPageUpcomingActivityDataState, DetailPageHistoryViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public IndexDetailPageUpcomingActivityStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public DetailPageHistoryViewState reduce(IndexDetailPageUpcomingActivityDataState dataState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Account currentAccount = dataState.getCurrentAccount();
        UUID indexId = dataState.getIndexId();
        List<StatefulHistoryEvent<HistoryEvent>> historyEvents = dataState.getHistoryEvents();
        String string2 = this.resources.getString(C11117R.string.detail_page_upcoming_activity_section_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return IndexDetailPageHistoryStateProvider2.getDetailPageHistoryViewState(currentAccount, indexId, historyEvents, string2, IndexDetailPageStates2.IDP_UPCOMING_ACTIVITY_DUXO_KEY_PREFIX);
    }
}
