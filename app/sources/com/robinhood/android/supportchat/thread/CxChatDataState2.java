package com.robinhood.android.supportchat.thread;

import com.robinhood.android.supportchat.thread.CxChatDataState;
import com.robinhood.models.api.pathfinder.messaging.ChatCurrentType;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CxChatDataState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toInitialChatType", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialChatType;", "Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;", "feature-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.supportchat.thread.CxChatDataStateKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CxChatDataState2 {
    public static final CxChatDataState.InitialChatType toInitialChatType(SupportChat supportChat) {
        Intrinsics.checkNotNullParameter(supportChat, "<this>");
        return supportChat.getCurrentType() == ChatCurrentType.CHATBOT_CHAT ? CxChatDataState.InitialChatType.CHATBOT_CHAT : (supportChat.getCurrentType() == ChatCurrentType.AGENT_CHAT && supportChat.getChatbotChat() == null) ? CxChatDataState.InitialChatType.AGENT_CHAT : CxChatDataState.InitialChatType.ESCALATED_CHAT;
    }
}
