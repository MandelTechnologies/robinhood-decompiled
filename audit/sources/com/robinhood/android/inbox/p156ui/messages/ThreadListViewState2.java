package com.robinhood.android.inbox.p156ui.messages;

import com.robinhood.models.p320db.InboxThread;
import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: ThreadListViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/InboxThreadsStatus;", "", "<init>", "()V", "Loading", "Success", "Failed", "Lcom/robinhood/android/inbox/ui/messages/InboxThreadsStatus$Failed;", "Lcom/robinhood/android/inbox/ui/messages/InboxThreadsStatus$Loading;", "Lcom/robinhood/android/inbox/ui/messages/InboxThreadsStatus$Success;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.inbox.ui.messages.InboxThreadsStatus, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class ThreadListViewState2 {
    public /* synthetic */ ThreadListViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ThreadListViewState2() {
    }

    /* compiled from: ThreadListViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/InboxThreadsStatus$Loading;", "Lcom/robinhood/android/inbox/ui/messages/InboxThreadsStatus;", "<init>", "()V", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.messages.InboxThreadsStatus$Loading */
    public static final class Loading extends ThreadListViewState2 {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: ThreadListViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u001a\u0010\f\u001a\u00020\b*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/InboxThreadsStatus$Success;", "Lcom/robinhood/android/inbox/ui/messages/InboxThreadsStatus;", "inboxThreads", "", "Lcom/robinhood/models/db/InboxThread;", "<init>", "(Ljava/util/List;)V", "createInboxThreads", "Lcom/robinhood/android/inbox/ui/messages/MessageThread;", "selectedThreads", "", "", "toMessageThread", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.inbox.ui.messages.InboxThreadsStatus$Success */
    public static final class Success extends ThreadListViewState2 {
        private final List<InboxThread> inboxThreads;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(List<InboxThread> inboxThreads) {
            super(null);
            Intrinsics.checkNotNullParameter(inboxThreads, "inboxThreads");
            this.inboxThreads = inboxThreads;
        }

        public final List<MessageThread> createInboxThreads(Set<String> selectedThreads) {
            Intrinsics.checkNotNullParameter(selectedThreads, "selectedThreads");
            List<InboxThread> list = this.inboxThreads;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toMessageThread((InboxThread) it.next(), selectedThreads));
            }
            return arrayList;
        }

        private final MessageThread toMessageThread(InboxThread inboxThread, Set<String> set) {
            String id = inboxThread.getId();
            String displayName = inboxThread.getDisplayName();
            String shortDisplayName = inboxThread.getShortDisplayName();
            HttpUrl avatarUrl = inboxThread.getAvatarUrl();
            String avatarColor = inboxThread.getAvatarColor();
            RichText previewText = inboxThread.getPreviewText();
            String text = previewText != null ? previewText.getText() : null;
            if (text == null) {
                text = "";
            }
            return new MessageThread(id, displayName, shortDisplayName, avatarUrl, avatarColor, text, inboxThread.isCritical(), !inboxThread.isRead(), inboxThread.getLastMessageSentAt(), set.contains(inboxThread.getId()));
        }
    }

    /* compiled from: ThreadListViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/InboxThreadsStatus$Failed;", "Lcom/robinhood/android/inbox/ui/messages/InboxThreadsStatus;", "<init>", "()V", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.messages.InboxThreadsStatus$Failed */
    public static final class Failed extends ThreadListViewState2 {
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }
    }
}
