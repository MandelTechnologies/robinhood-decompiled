package com.robinhood.android.inbox.p156ui.messages;

import com.robinhood.android.inbox.p156ui.messages.ThreadListViewState2;
import com.robinhood.android.inbox.p156ui.messages.ThreadListViewState4;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadListDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/ThreadListDataState;", "", "inboxThreadsStatus", "Lcom/robinhood/android/inbox/ui/messages/InboxThreadsStatus;", "supportChatThreadStatus", "Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus;", "selectedThreads", "", "", "unreadSupportChatMessageCount", "", "<init>", "(Lcom/robinhood/android/inbox/ui/messages/InboxThreadsStatus;Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus;Ljava/util/Set;J)V", "getInboxThreadsStatus", "()Lcom/robinhood/android/inbox/ui/messages/InboxThreadsStatus;", "getSupportChatThreadStatus", "()Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus;", "getSelectedThreads", "()Ljava/util/Set;", "getUnreadSupportChatMessageCount", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ThreadListDataState {
    private final ThreadListViewState2 inboxThreadsStatus;
    private final Set<String> selectedThreads;
    private final ThreadListViewState4 supportChatThreadStatus;
    private final long unreadSupportChatMessageCount;

    public ThreadListDataState() {
        this(null, null, null, 0L, 15, null);
    }

    public static /* synthetic */ ThreadListDataState copy$default(ThreadListDataState threadListDataState, ThreadListViewState2 threadListViewState2, ThreadListViewState4 threadListViewState4, Set set, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            threadListViewState2 = threadListDataState.inboxThreadsStatus;
        }
        if ((i & 2) != 0) {
            threadListViewState4 = threadListDataState.supportChatThreadStatus;
        }
        if ((i & 4) != 0) {
            set = threadListDataState.selectedThreads;
        }
        if ((i & 8) != 0) {
            j = threadListDataState.unreadSupportChatMessageCount;
        }
        Set set2 = set;
        return threadListDataState.copy(threadListViewState2, threadListViewState4, set2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final ThreadListViewState2 getInboxThreadsStatus() {
        return this.inboxThreadsStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final ThreadListViewState4 getSupportChatThreadStatus() {
        return this.supportChatThreadStatus;
    }

    public final Set<String> component3() {
        return this.selectedThreads;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUnreadSupportChatMessageCount() {
        return this.unreadSupportChatMessageCount;
    }

    public final ThreadListDataState copy(ThreadListViewState2 inboxThreadsStatus, ThreadListViewState4 supportChatThreadStatus, Set<String> selectedThreads, long unreadSupportChatMessageCount) {
        Intrinsics.checkNotNullParameter(inboxThreadsStatus, "inboxThreadsStatus");
        Intrinsics.checkNotNullParameter(supportChatThreadStatus, "supportChatThreadStatus");
        Intrinsics.checkNotNullParameter(selectedThreads, "selectedThreads");
        return new ThreadListDataState(inboxThreadsStatus, supportChatThreadStatus, selectedThreads, unreadSupportChatMessageCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadListDataState)) {
            return false;
        }
        ThreadListDataState threadListDataState = (ThreadListDataState) other;
        return Intrinsics.areEqual(this.inboxThreadsStatus, threadListDataState.inboxThreadsStatus) && Intrinsics.areEqual(this.supportChatThreadStatus, threadListDataState.supportChatThreadStatus) && Intrinsics.areEqual(this.selectedThreads, threadListDataState.selectedThreads) && this.unreadSupportChatMessageCount == threadListDataState.unreadSupportChatMessageCount;
    }

    public int hashCode() {
        return (((((this.inboxThreadsStatus.hashCode() * 31) + this.supportChatThreadStatus.hashCode()) * 31) + this.selectedThreads.hashCode()) * 31) + Long.hashCode(this.unreadSupportChatMessageCount);
    }

    public String toString() {
        return "ThreadListDataState(inboxThreadsStatus=" + this.inboxThreadsStatus + ", supportChatThreadStatus=" + this.supportChatThreadStatus + ", selectedThreads=" + this.selectedThreads + ", unreadSupportChatMessageCount=" + this.unreadSupportChatMessageCount + ")";
    }

    public ThreadListDataState(ThreadListViewState2 inboxThreadsStatus, ThreadListViewState4 supportChatThreadStatus, Set<String> selectedThreads, long j) {
        Intrinsics.checkNotNullParameter(inboxThreadsStatus, "inboxThreadsStatus");
        Intrinsics.checkNotNullParameter(supportChatThreadStatus, "supportChatThreadStatus");
        Intrinsics.checkNotNullParameter(selectedThreads, "selectedThreads");
        this.inboxThreadsStatus = inboxThreadsStatus;
        this.supportChatThreadStatus = supportChatThreadStatus;
        this.selectedThreads = selectedThreads;
        this.unreadSupportChatMessageCount = j;
    }

    public /* synthetic */ ThreadListDataState(ThreadListViewState2 threadListViewState2, ThreadListViewState4 threadListViewState4, Set set, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ThreadListViewState2.Loading.INSTANCE : threadListViewState2, (i & 2) != 0 ? ThreadListViewState4.Loading.INSTANCE : threadListViewState4, (i & 4) != 0 ? SetsKt.emptySet() : set, (i & 8) != 0 ? 0L : j);
    }

    public final ThreadListViewState2 getInboxThreadsStatus() {
        return this.inboxThreadsStatus;
    }

    public final ThreadListViewState4 getSupportChatThreadStatus() {
        return this.supportChatThreadStatus;
    }

    public final Set<String> getSelectedThreads() {
        return this.selectedThreads;
    }

    public final long getUnreadSupportChatMessageCount() {
        return this.unreadSupportChatMessageCount;
    }
}
