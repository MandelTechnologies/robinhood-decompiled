package com.robinhood.android.supportchat;

import com.robinhood.android.supportchat.SupportChatListDataState;
import com.robinhood.android.supportchat.SupportChatListViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportChatListStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/supportchat/SupportChatListDataState;", "Lcom/robinhood/android/supportchat/SupportChatListViewState;", "<init>", "()V", "reduce", "dataState", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SupportChatListStateProvider implements StateProvider<SupportChatListDataState, SupportChatListViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SupportChatListViewState reduce(SupportChatListDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        SupportChatListDataState.SupportChatListLoadStatus loadingState = dataState.getLoadingState();
        if (loadingState instanceof SupportChatListDataState.SupportChatListLoadStatus.Loading) {
            return SupportChatListViewState.Loading.INSTANCE;
        }
        if (loadingState instanceof SupportChatListDataState.SupportChatListLoadStatus.Failed) {
            return SupportChatListViewState.Failed.INSTANCE;
        }
        if (!(loadingState instanceof SupportChatListDataState.SupportChatListLoadStatus.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        return new SupportChatListViewState.Success(SupportChatListStateProvider2.toDisplayChatList(((SupportChatListDataState.SupportChatListLoadStatus.Success) loadingState).getChatIssues(), dataState.getAgentChatToPreviewMessages(), dataState.getAgentChatToUnreadMessageCount(), dataState.isInitialPreviewLoadingComplete(), dataState.getPreviewMessageLoadingFailed()));
    }
}
