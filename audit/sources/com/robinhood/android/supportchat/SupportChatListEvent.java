package com.robinhood.android.supportchat;

import kotlin.Metadata;

/* compiled from: SupportChatListEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListEvent;", "", "ManualChatListRefreshComplete", "Lcom/robinhood/android/supportchat/SupportChatListEvent$ManualChatListRefreshComplete;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface SupportChatListEvent {

    /* compiled from: SupportChatListEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListEvent$ManualChatListRefreshComplete;", "Lcom/robinhood/android/supportchat/SupportChatListEvent;", "<init>", "()V", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ManualChatListRefreshComplete implements SupportChatListEvent {
        public static final int $stable = 0;
        public static final ManualChatListRefreshComplete INSTANCE = new ManualChatListRefreshComplete();

        private ManualChatListRefreshComplete() {
        }
    }
}
