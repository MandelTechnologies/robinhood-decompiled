package com.robinhood.android.inbox.p156ui.messages;

import com.robinhood.android.inbox.p156ui.messages.ThreadListViewState;
import com.robinhood.android.inbox.p156ui.messages.ThreadListViewState2;
import com.robinhood.android.inbox.p156ui.messages.ThreadListViewState4;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.support.supportchat.ChatListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadListStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/ThreadListStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/inbox/ui/messages/ThreadListDataState;", "Lcom/robinhood/android/inbox/ui/messages/ThreadListViewState;", "<init>", "()V", "reduce", "dataState", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ThreadListStateProvider implements StateProvider<ThreadListDataState, ThreadListViewState> {
    @Override // com.robinhood.android.udf.StateProvider
    public ThreadListViewState reduce(ThreadListDataState dataState) {
        List<MessageThread> listEmptyList;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        boolean z = (dataState.getInboxThreadsStatus() instanceof ThreadListViewState2.Loading) || (dataState.getSupportChatThreadStatus() instanceof ThreadListViewState4.Loading);
        boolean z2 = (dataState.getInboxThreadsStatus() instanceof ThreadListViewState2.Failed) && ((dataState.getSupportChatThreadStatus() instanceof ThreadListViewState4.Unsupported) || (dataState.getSupportChatThreadStatus() instanceof ThreadListViewState4.Failed));
        boolean z3 = (z || z2) ? false : true;
        ThreadListViewState2 inboxThreadsStatus = dataState.getInboxThreadsStatus();
        ThreadListViewState.InfoBannerType infoBannerType = null;
        ThreadListViewState2.Success success = inboxThreadsStatus instanceof ThreadListViewState2.Success ? (ThreadListViewState2.Success) inboxThreadsStatus : null;
        if (success == null || (listEmptyList = success.createInboxThreads(dataState.getSelectedThreads())) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<MessageThread> list = listEmptyList;
        ThreadListViewState4 supportChatThreadStatus = dataState.getSupportChatThreadStatus();
        ThreadListViewState4.Success success2 = supportChatThreadStatus instanceof ThreadListViewState4.Success ? (ThreadListViewState4.Success) supportChatThreadStatus : null;
        ChatListItem chatListItemCreateSupportChatItem = success2 != null ? success2.createSupportChatItem(dataState.getUnreadSupportChatMessageCount()) : null;
        boolean z4 = !dataState.getSelectedThreads().isEmpty();
        if ((dataState.getInboxThreadsStatus() instanceof ThreadListViewState2.Failed) && (dataState.getSupportChatThreadStatus() instanceof ThreadListViewState4.Success)) {
            infoBannerType = ThreadListViewState.InfoBannerType.NOTIFICATIONS_LOAD_FAIL;
        } else if ((dataState.getInboxThreadsStatus() instanceof ThreadListViewState2.Success) && (dataState.getSupportChatThreadStatus() instanceof ThreadListViewState4.Failed)) {
            infoBannerType = ThreadListViewState.InfoBannerType.SUPPORT_CASE_LOAD_FAIL;
        }
        return new ThreadListViewState(z, z2, z3, list, chatListItemCreateSupportChatItem, z4, infoBannerType);
    }
}
