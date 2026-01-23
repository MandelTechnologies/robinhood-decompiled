package com.robinhood.android.inbox.p156ui.messages;

import com.robinhood.android.inbox.C18721R;
import com.robinhood.models.p355ui.SimpleChatIssue;
import com.robinhood.shared.support.supportchat.ChatListItem;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadListViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus;", "", "<init>", "()V", "Loading", "Success", "Failed", "Unsupported", "Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus$Failed;", "Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus$Loading;", "Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus$Success;", "Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus$Unsupported;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.inbox.ui.messages.SupportChatThreadStatus, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class ThreadListViewState4 {
    public /* synthetic */ ThreadListViewState4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ThreadListViewState4() {
    }

    /* compiled from: ThreadListViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus$Loading;", "Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus;", "<init>", "()V", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.messages.SupportChatThreadStatus$Loading */
    public static final class Loading extends ThreadListViewState4 {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: ThreadListViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0002J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus$Success;", "Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus;", "supportChatItem", "Lcom/robinhood/models/ui/SimpleChatIssue;", "<init>", "(Lcom/robinhood/models/ui/SimpleChatIssue;)V", "createSupportChatItem", "Lcom/robinhood/shared/support/supportchat/ChatListItem;", "unreadMessageCount", "", "getSupportChatPreviewText", "Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.messages.SupportChatThreadStatus$Success, reason: from toString */
    public static final /* data */ class Success extends ThreadListViewState4 {
        private final SimpleChatIssue supportChatItem;

        /* renamed from: component1, reason: from getter */
        private final SimpleChatIssue getSupportChatItem() {
            return this.supportChatItem;
        }

        public static /* synthetic */ Success copy$default(Success success, SimpleChatIssue simpleChatIssue, int i, Object obj) {
            if ((i & 1) != 0) {
                simpleChatIssue = success.supportChatItem;
            }
            return success.copy(simpleChatIssue);
        }

        public final Success copy(SimpleChatIssue supportChatItem) {
            return new Success(supportChatItem);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.supportChatItem, ((Success) other).supportChatItem);
        }

        public int hashCode() {
            SimpleChatIssue simpleChatIssue = this.supportChatItem;
            if (simpleChatIssue == null) {
                return 0;
            }
            return simpleChatIssue.hashCode();
        }

        public String toString() {
            return "Success(supportChatItem=" + this.supportChatItem + ")";
        }

        public Success(SimpleChatIssue simpleChatIssue) {
            super(null);
            this.supportChatItem = simpleChatIssue;
        }

        public final ChatListItem createSupportChatItem(long unreadMessageCount) {
            SimpleChatIssue simpleChatIssue = this.supportChatItem;
            if (simpleChatIssue == null) {
                return null;
            }
            return new ChatListItem(simpleChatIssue.getId(), simpleChatIssue.isActive(), simpleChatIssue.getCreated(), simpleChatIssue.getLastRelevantUpdated(), simpleChatIssue.getChatMode(), StringResource.INSTANCE.invoke(C18721R.string.support_chat_row_title, new Object[0]), simpleChatIssue.getChatAvatarColor(), getSupportChatPreviewText(simpleChatIssue, unreadMessageCount), unreadMessageCount, true, simpleChatIssue.getHasImpression(), simpleChatIssue.getCanLogImpression());
        }

        private final StringResource getSupportChatPreviewText(SimpleChatIssue simpleChatIssue, long j) {
            if (!simpleChatIssue.isActive()) {
                return StringResource.INSTANCE.invoke(C18721R.string.support_chat_row_subtitle_closed, new Object[0]);
            }
            if (j > 0) {
                return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C18721R.plurals.support_chat_row_subtitle_with_unread_message, (int) j), Long.valueOf(j));
            }
            return StringResource.INSTANCE.invoke(C18721R.string.support_chat_row_subtitle_active, new Object[0]);
        }
    }

    /* compiled from: ThreadListViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus$Failed;", "Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus;", "<init>", "()V", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.messages.SupportChatThreadStatus$Failed */
    public static final class Failed extends ThreadListViewState4 {
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }
    }

    /* compiled from: ThreadListViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus$Unsupported;", "Lcom/robinhood/android/inbox/ui/messages/SupportChatThreadStatus;", "<init>", "()V", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.messages.SupportChatThreadStatus$Unsupported */
    public static final class Unsupported extends ThreadListViewState4 {
        public static final Unsupported INSTANCE = new Unsupported();

        private Unsupported() {
            super(null);
        }
    }
}
