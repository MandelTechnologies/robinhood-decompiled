package com.robinhood.android.supportchat;

import com.robinhood.shared.support.supportchat.ChatListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportChatListViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListViewState;", "", "Loading", "Success", "Failed", "Lcom/robinhood/android/supportchat/SupportChatListViewState$Failed;", "Lcom/robinhood/android/supportchat/SupportChatListViewState$Loading;", "Lcom/robinhood/android/supportchat/SupportChatListViewState$Success;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface SupportChatListViewState {

    /* compiled from: SupportChatListViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListViewState$Loading;", "Lcom/robinhood/android/supportchat/SupportChatListViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements SupportChatListViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1813598352;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: SupportChatListViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListViewState$Success;", "Lcom/robinhood/android/supportchat/SupportChatListViewState;", "displayChatList", "", "Lcom/robinhood/shared/support/supportchat/ChatListItem;", "<init>", "(Ljava/util/List;)V", "getDisplayChatList", "()Ljava/util/List;", "showEmptyState", "", "getShowEmptyState", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements SupportChatListViewState {
        public static final int $stable = 8;
        private final List<ChatListItem> displayChatList;
        private final boolean showEmptyState;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = success.displayChatList;
            }
            return success.copy(list);
        }

        public final List<ChatListItem> component1() {
            return this.displayChatList;
        }

        public final Success copy(List<ChatListItem> displayChatList) {
            Intrinsics.checkNotNullParameter(displayChatList, "displayChatList");
            return new Success(displayChatList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.displayChatList, ((Success) other).displayChatList);
        }

        public int hashCode() {
            return this.displayChatList.hashCode();
        }

        public String toString() {
            return "Success(displayChatList=" + this.displayChatList + ")";
        }

        public Success(List<ChatListItem> displayChatList) {
            Intrinsics.checkNotNullParameter(displayChatList, "displayChatList");
            this.displayChatList = displayChatList;
            this.showEmptyState = displayChatList.isEmpty();
        }

        public final List<ChatListItem> getDisplayChatList() {
            return this.displayChatList;
        }

        public final boolean getShowEmptyState() {
            return this.showEmptyState;
        }
    }

    /* compiled from: SupportChatListViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListViewState$Failed;", "Lcom/robinhood/android/supportchat/SupportChatListViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failed implements SupportChatListViewState {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object other) {
            return this == other || (other instanceof Failed);
        }

        public int hashCode() {
            return -1351340151;
        }

        public String toString() {
            return "Failed";
        }

        private Failed() {
        }
    }
}
