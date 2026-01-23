package com.robinhood.android.inbox.p156ui.thread;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import com.robinhood.models.p320db.InboxMessageType;
import com.robinhood.models.p320db.InboxThread;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDataState;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailViewState;", "<init>", "()V", "reduce", "dataState", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ThreadDetailStateProvider implements StateProvider<ThreadDetailDataState, ThreadDetailViewState> {
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ThreadDetailViewState reduce(ThreadDetailDataState dataState) {
        boolean z;
        InboxThread.Options options;
        InboxThread.Options options2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UUID userId = dataState.getUserId();
        InboxThread thread = dataState.getThread();
        List<ThreadDetailViewState4> listConvert = new ThreadDetailStateProvider2(userId, thread != null ? thread.getEntityUrl() : null).convert(dataState.getInboxMessages(), dataState.getLocalInboxMessages(), dataState.getHasFetchedAllPreviousMessages(), dataState.isLoadingPreviousMessages());
        InboxThread thread2 = dataState.getThread();
        boolean z2 = (thread2 == null || (options2 = thread2.getOptions()) == null || !options2.getAllowsFreeText()) ? false : true;
        InboxThread thread3 = dataState.getThread();
        if (thread3 == null || (options = thread3.getOptions()) == null || !options.getHasSettings()) {
            z = false;
        } else {
            ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem = dataState.getApiNotificationThreadSettingsItem();
            if ((apiNotificationThreadSettingsItem != null ? apiNotificationThreadSettingsItem.getToggle_item() : null) != null) {
                z = true;
            }
        }
        InboxThread thread4 = dataState.getThread();
        String displayName = thread4 != null ? thread4.getDisplayName() : null;
        InboxMessageType.Message message = (InboxMessageType.Message) CollectionsKt.firstOrNull((List) dataState.getInboxMessages());
        return new ThreadDetailViewState(listConvert, dataState.getImagesToSend(), z2, z, displayName, message != null ? message.getId() : null, !dataState.getImagesToSend().isEmpty(), z2 && dataState.getUploadMediaEnabled() && dataState.getImagesToSend().isEmpty(), dataState.getSavedUserInput(), dataState.getHasFetchedAllPreviousMessages(), dataState.isLoadingPreviousMessages(), dataState.isUploadingMedia(), dataState.getApiNotificationThreadSettingsItem());
    }
}
