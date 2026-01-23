package com.robinhood.android.inbox.p156ui.messages;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.shared.support.supportchat.ChatListItem;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadListViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/ThreadListViewState;", "", "showLoadingView", "", "showErrorView", "showContent", "inboxThreads", "", "Lcom/robinhood/android/inbox/ui/messages/MessageThread;", "displaySupportChatItem", "Lcom/robinhood/shared/support/supportchat/ChatListItem;", "isInSelectionMode", "infoBannerType", "Lcom/robinhood/android/inbox/ui/messages/ThreadListViewState$InfoBannerType;", "<init>", "(ZZZLjava/util/List;Lcom/robinhood/shared/support/supportchat/ChatListItem;ZLcom/robinhood/android/inbox/ui/messages/ThreadListViewState$InfoBannerType;)V", "getShowLoadingView", "()Z", "getShowErrorView", "getShowContent", "getInboxThreads", "()Ljava/util/List;", "getDisplaySupportChatItem", "()Lcom/robinhood/shared/support/supportchat/ChatListItem;", "getInfoBannerType", "()Lcom/robinhood/android/inbox/ui/messages/ThreadListViewState$InfoBannerType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "InfoBannerType", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ThreadListViewState {
    private final ChatListItem displaySupportChatItem;
    private final List<MessageThread> inboxThreads;
    private final InfoBannerType infoBannerType;
    private final boolean isInSelectionMode;
    private final boolean showContent;
    private final boolean showErrorView;
    private final boolean showLoadingView;

    public ThreadListViewState() {
        this(false, false, false, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ ThreadListViewState copy$default(ThreadListViewState threadListViewState, boolean z, boolean z2, boolean z3, List list, ChatListItem chatListItem, boolean z4, InfoBannerType infoBannerType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = threadListViewState.showLoadingView;
        }
        if ((i & 2) != 0) {
            z2 = threadListViewState.showErrorView;
        }
        if ((i & 4) != 0) {
            z3 = threadListViewState.showContent;
        }
        if ((i & 8) != 0) {
            list = threadListViewState.inboxThreads;
        }
        if ((i & 16) != 0) {
            chatListItem = threadListViewState.displaySupportChatItem;
        }
        if ((i & 32) != 0) {
            z4 = threadListViewState.isInSelectionMode;
        }
        if ((i & 64) != 0) {
            infoBannerType = threadListViewState.infoBannerType;
        }
        boolean z5 = z4;
        InfoBannerType infoBannerType2 = infoBannerType;
        ChatListItem chatListItem2 = chatListItem;
        boolean z6 = z3;
        return threadListViewState.copy(z, z2, z6, list, chatListItem2, z5, infoBannerType2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowErrorView() {
        return this.showErrorView;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowContent() {
        return this.showContent;
    }

    public final List<MessageThread> component4() {
        return this.inboxThreads;
    }

    /* renamed from: component5, reason: from getter */
    public final ChatListItem getDisplaySupportChatItem() {
        return this.displaySupportChatItem;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsInSelectionMode() {
        return this.isInSelectionMode;
    }

    /* renamed from: component7, reason: from getter */
    public final InfoBannerType getInfoBannerType() {
        return this.infoBannerType;
    }

    public final ThreadListViewState copy(boolean showLoadingView, boolean showErrorView, boolean showContent, List<MessageThread> inboxThreads, ChatListItem displaySupportChatItem, boolean isInSelectionMode, InfoBannerType infoBannerType) {
        Intrinsics.checkNotNullParameter(inboxThreads, "inboxThreads");
        return new ThreadListViewState(showLoadingView, showErrorView, showContent, inboxThreads, displaySupportChatItem, isInSelectionMode, infoBannerType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadListViewState)) {
            return false;
        }
        ThreadListViewState threadListViewState = (ThreadListViewState) other;
        return this.showLoadingView == threadListViewState.showLoadingView && this.showErrorView == threadListViewState.showErrorView && this.showContent == threadListViewState.showContent && Intrinsics.areEqual(this.inboxThreads, threadListViewState.inboxThreads) && Intrinsics.areEqual(this.displaySupportChatItem, threadListViewState.displaySupportChatItem) && this.isInSelectionMode == threadListViewState.isInSelectionMode && this.infoBannerType == threadListViewState.infoBannerType;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.showLoadingView) * 31) + Boolean.hashCode(this.showErrorView)) * 31) + Boolean.hashCode(this.showContent)) * 31) + this.inboxThreads.hashCode()) * 31;
        ChatListItem chatListItem = this.displaySupportChatItem;
        int iHashCode2 = (((iHashCode + (chatListItem == null ? 0 : chatListItem.hashCode())) * 31) + Boolean.hashCode(this.isInSelectionMode)) * 31;
        InfoBannerType infoBannerType = this.infoBannerType;
        return iHashCode2 + (infoBannerType != null ? infoBannerType.hashCode() : 0);
    }

    public String toString() {
        return "ThreadListViewState(showLoadingView=" + this.showLoadingView + ", showErrorView=" + this.showErrorView + ", showContent=" + this.showContent + ", inboxThreads=" + this.inboxThreads + ", displaySupportChatItem=" + this.displaySupportChatItem + ", isInSelectionMode=" + this.isInSelectionMode + ", infoBannerType=" + this.infoBannerType + ")";
    }

    public ThreadListViewState(boolean z, boolean z2, boolean z3, List<MessageThread> inboxThreads, ChatListItem chatListItem, boolean z4, InfoBannerType infoBannerType) {
        Intrinsics.checkNotNullParameter(inboxThreads, "inboxThreads");
        this.showLoadingView = z;
        this.showErrorView = z2;
        this.showContent = z3;
        this.inboxThreads = inboxThreads;
        this.displaySupportChatItem = chatListItem;
        this.isInSelectionMode = z4;
        this.infoBannerType = infoBannerType;
    }

    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    public final boolean getShowErrorView() {
        return this.showErrorView;
    }

    public final boolean getShowContent() {
        return this.showContent;
    }

    public /* synthetic */ ThreadListViewState(boolean z, boolean z2, boolean z3, List list, ChatListItem chatListItem, boolean z4, InfoBannerType infoBannerType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? null : chatListItem, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? null : infoBannerType);
    }

    public final List<MessageThread> getInboxThreads() {
        return this.inboxThreads;
    }

    public final ChatListItem getDisplaySupportChatItem() {
        return this.displaySupportChatItem;
    }

    public final boolean isInSelectionMode() {
        return this.isInSelectionMode;
    }

    public final InfoBannerType getInfoBannerType() {
        return this.infoBannerType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ThreadListViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/ThreadListViewState$InfoBannerType;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "analyticsType", "Lcom/robinhood/rosetta/eventlogging/CXIssue$InboxLoadFail;", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/resource/StringResource;Lcom/robinhood/rosetta/eventlogging/CXIssue$InboxLoadFail;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getAnalyticsType", "()Lcom/robinhood/rosetta/eventlogging/CXIssue$InboxLoadFail;", "NOTIFICATIONS_LOAD_FAIL", "SUPPORT_CASE_LOAD_FAIL", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InfoBannerType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InfoBannerType[] $VALUES;
        public static final InfoBannerType NOTIFICATIONS_LOAD_FAIL;
        public static final InfoBannerType SUPPORT_CASE_LOAD_FAIL;
        private final CXIssue.InboxLoadFail analyticsType;
        private final StringResource text;

        private static final /* synthetic */ InfoBannerType[] $values() {
            return new InfoBannerType[]{NOTIFICATIONS_LOAD_FAIL, SUPPORT_CASE_LOAD_FAIL};
        }

        public static EnumEntries<InfoBannerType> getEntries() {
            return $ENTRIES;
        }

        private InfoBannerType(String str, int i, StringResource stringResource, CXIssue.InboxLoadFail inboxLoadFail) {
            this.text = stringResource;
            this.analyticsType = inboxLoadFail;
        }

        public final CXIssue.InboxLoadFail getAnalyticsType() {
            return this.analyticsType;
        }

        public final StringResource getText() {
            return this.text;
        }

        static {
            StringResource.Companion companion = StringResource.INSTANCE;
            NOTIFICATIONS_LOAD_FAIL = new InfoBannerType("NOTIFICATIONS_LOAD_FAIL", 0, companion.invoke(C18721R.string.info_banner_inbox_failed_text, new Object[0]), CXIssue.InboxLoadFail.NOTIFICATIONS);
            SUPPORT_CASE_LOAD_FAIL = new InfoBannerType("SUPPORT_CASE_LOAD_FAIL", 1, companion.invoke(C18721R.string.info_banner_support_chat_failed_text, new Object[0]), CXIssue.InboxLoadFail.SUPPORT_CASE);
            InfoBannerType[] infoBannerTypeArr$values = $values();
            $VALUES = infoBannerTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(infoBannerTypeArr$values);
        }

        public static InfoBannerType valueOf(String str) {
            return (InfoBannerType) Enum.valueOf(InfoBannerType.class, str);
        }

        public static InfoBannerType[] values() {
            return (InfoBannerType[]) $VALUES.clone();
        }
    }
}
