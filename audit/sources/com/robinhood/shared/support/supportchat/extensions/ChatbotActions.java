package com.robinhood.shared.support.supportchat.extensions;

import com.robinhood.models.p355ui.p356v2.ChatbotAction;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatbotActions.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a6\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¨\u0006\n"}, m3636d2 = {"toUiChatAction", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatAction;", "Lcom/robinhood/models/ui/v2/ChatbotAction;", "localId", "", "isLoading", "", "isSelected", "forceDisable", "canBeEscalated", "lib-support-chat_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.support.supportchat.extensions.ChatbotActionsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ChatbotActions {
    public static final UiChatAction toUiChatAction(ChatbotAction chatbotAction, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(chatbotAction, "<this>");
        boolean z5 = (chatbotAction.getDisabled() || z3 || (!z4 && chatbotAction.getDisableAfterEscalation())) ? false : true;
        if (chatbotAction instanceof ChatbotAction.Deeplink) {
            ChatbotAction.Deeplink deeplink = (ChatbotAction.Deeplink) chatbotAction;
            return new UiChatAction.Deeplink(str, deeplink.getTitle(), deeplink.getSubtitle(), deeplink.getIcon(), deeplink.getButtonStyle(), z5, z, deeplink.getData().getDeeplink());
        }
        if (chatbotAction instanceof ChatbotAction.Cta) {
            ChatbotAction.Cta cta = (ChatbotAction.Cta) chatbotAction;
            return new UiChatAction.Cta(str, cta.getTitle(), cta.getSubtitle(), cta.getIcon(), cta.getButtonStyle(), z5, z, z2, cta.getId());
        }
        if (chatbotAction instanceof ChatbotAction.Escalate) {
            ChatbotAction.Escalate escalate = (ChatbotAction.Escalate) chatbotAction;
            return new UiChatAction.Escalate(str, escalate.getTitle(), escalate.getSubtitle(), escalate.getIcon(), escalate.getButtonStyle(), z5, z, z2);
        }
        if (Intrinsics.areEqual(chatbotAction, ChatbotAction.Unknown.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
