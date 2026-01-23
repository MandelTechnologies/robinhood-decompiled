package com.robinhood.shared.support.supportchat.extensions;

import android.net.Uri;
import com.robinhood.models.p355ui.p356v2.ChatbotAction;
import com.robinhood.models.p355ui.p356v2.ChatbotMessage;
import com.robinhood.shared.models.chat.common.Renderable;
import com.robinhood.shared.support.supportchat.UiChatMessages;
import com.robinhood.shared.support.supportchat.format.ChatTimestampFormatter;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import p479j$.time.Instant;

/* compiled from: ChatbotMessages.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0014\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"", "Lcom/robinhood/models/ui/v2/ChatbotMessage;", "", "showTypingIndicator", "", "lastAgentReadMessageIndex", "j$/time/Instant", "lastAgentReadMessageTimestamp", "Lcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;", "chatTimestampFormatter", "", "uploadingActionId", "canBeEscalated", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage;", "toUiChatMessages", "(Ljava/util/List;ZJLj$/time/Instant;Lcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;Ljava/lang/String;Z)Ljava/util/List;", "endOfMessageBlock", "showAvatar", "Lcom/robinhood/shared/support/supportchat/ui/models/MessageMetadata$Timestamp;", "timestampMetadata", "transform", "(Lcom/robinhood/models/ui/v2/ChatbotMessage;ZZLcom/robinhood/shared/support/supportchat/ui/models/MessageMetadata$Timestamp;Ljava/lang/String;Z)Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage;", "lib-support-chat_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.support.supportchat.extensions.ChatbotMessagesKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ChatbotMessages {
    public static final List<UiChatMessage> toUiChatMessages(List<? extends ChatbotMessage> list, boolean z, long j, Instant lastAgentReadMessageTimestamp, ChatTimestampFormatter chatTimestampFormatter, final String str, final boolean z2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lastAgentReadMessageTimestamp, "lastAgentReadMessageTimestamp");
        Intrinsics.checkNotNullParameter(chatTimestampFormatter, "chatTimestampFormatter");
        return UiChatMessages.transform(list, z, j, lastAgentReadMessageTimestamp, chatTimestampFormatter, new Function4() { // from class: com.robinhood.shared.support.supportchat.extensions.ChatbotMessagesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ChatbotMessages.toUiChatMessages$lambda$0(str, z2, (Renderable) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (UiChatMessage2.Timestamp) obj4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiChatMessage toUiChatMessages$lambda$0(String str, boolean z, Renderable transform, boolean z2, boolean z3, UiChatMessage2.Timestamp timestamp) {
        Intrinsics.checkNotNullParameter(transform, "$this$transform");
        return transform((ChatbotMessage) transform, z2, z3, timestamp, str, z);
    }

    public static final UiChatMessage transform(ChatbotMessage chatbotMessage, boolean z, boolean z2, UiChatMessage2.Timestamp timestamp, String str, boolean z3) {
        boolean z4;
        Intrinsics.checkNotNullParameter(chatbotMessage, "<this>");
        if (chatbotMessage instanceof ChatbotMessage.MediaYouTube) {
            ChatbotMessage.MediaYouTube mediaYouTube = (ChatbotMessage.MediaYouTube) chatbotMessage;
            return new UiChatMessage.Regular.MediaYouTube(chatbotMessage.getMessageSid(), chatbotMessage.getSenderType(), z2, z, Uri.parse(mediaYouTube.getAttributes().getTarget()), mediaYouTube.getAttributes().getVideoId(), mediaYouTube.getAttributes().getThumbnailUrl(), timestamp, chatbotMessage.getIndex(), chatbotMessage.getDateCreated());
        }
        if (chatbotMessage instanceof ChatbotMessage.Text) {
            return new UiChatMessage.Regular.Text(chatbotMessage.getMessageSid(), null, chatbotMessage.getIndex(), chatbotMessage.getSenderType(), z2, z, chatbotMessage.getDateCreated(), timestamp, ((ChatbotMessage.Text) chatbotMessage).getAttributes().getBody());
        }
        if (chatbotMessage instanceof ChatbotMessage.Action) {
            ChatbotMessage.Action action = (ChatbotMessage.Action) chatbotMessage;
            List<ChatbotAction> actions = action.getAttributes().getActions();
            int size = actions.size();
            ArrayList arrayList = new ArrayList(size);
            int i = 0;
            int i2 = 0;
            while (true) {
                boolean z5 = true;
                if (i2 >= size) {
                    break;
                }
                String str2 = action.getId() + "_" + i2;
                if (str == null || !Intrinsics.areEqual(str2, str)) {
                    z5 = false;
                }
                arrayList.add(Tuples4.m3642to(str2, Boolean.valueOf(z5)));
                i2++;
            }
            if (arrayList.isEmpty()) {
                z4 = false;
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Boolean) ((Tuples2) it.next()).component2()).booleanValue()) {
                        z4 = true;
                        break;
                    }
                }
                z4 = false;
            }
            List<ChatbotAction> list = actions;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Object obj : list) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ChatbotAction chatbotAction = (ChatbotAction) obj;
                Tuples2 tuples2 = (Tuples2) arrayList.get(i);
                arrayList2.add(ChatbotActions.toUiChatAction(chatbotAction, (String) tuples2.component1(), ((Boolean) tuples2.component2()).booleanValue(), chatbotAction.getSelected(), z4, z3));
                i = i3;
            }
            List listFilterNotNull = CollectionsKt.filterNotNull(arrayList2);
            if (listFilterNotNull.isEmpty()) {
                return null;
            }
            return new UiChatMessage.Regular.Action(chatbotMessage.getMessageSid(), chatbotMessage.getIndex(), chatbotMessage.getSenderType(), z2, z, chatbotMessage.getDateCreated(), timestamp, action.getAttributes().getBody(), listFilterNotNull, action.getAttributes().getStyle(), action.getAttributes().getFooter(), action.getAttributes().getImgUrl());
        }
        if (chatbotMessage instanceof ChatbotMessage.Link) {
            ChatbotMessage.Link link = (ChatbotMessage.Link) chatbotMessage;
            return new UiChatMessage.Regular.Link(chatbotMessage.getMessageSid(), chatbotMessage.getIndex(), chatbotMessage.getSenderType(), z2, z, chatbotMessage.getDateCreated(), timestamp, HttpUrl.INSTANCE.get(link.getAttributes().getTarget()), link.getAttributes().getText(), link.getAttributes().getDescription());
        }
        if (chatbotMessage instanceof ChatbotMessage.Markdown) {
            return new UiChatMessage.Regular.Markdown(chatbotMessage.getMessageSid(), chatbotMessage.getIndex(), chatbotMessage.getSenderType(), z2, z, chatbotMessage.getDateCreated(), timestamp, ((ChatbotMessage.Markdown) chatbotMessage).getAttributes().getBody());
        }
        if (chatbotMessage instanceof ChatbotMessage.Disclaimer) {
            return new UiChatMessage.Metadata.Disclaimer(chatbotMessage.getMessageSid(), chatbotMessage.getIndex(), chatbotMessage.getSenderType(), chatbotMessage.getDateCreated(), ((ChatbotMessage.Disclaimer) chatbotMessage).getAttributes().getBody());
        }
        if (chatbotMessage instanceof ChatbotMessage.Info) {
            return new UiChatMessage.Metadata.SystemInfo(chatbotMessage.getMessageSid(), chatbotMessage.getIndex(), chatbotMessage.getSenderType(), chatbotMessage.getDateCreated(), ((ChatbotMessage.Info) chatbotMessage).getAttributes().getBody());
        }
        if (chatbotMessage instanceof ChatbotMessage.Selection) {
            ChatbotMessage.Selection selection = (ChatbotMessage.Selection) chatbotMessage;
            return new UiChatMessage.Regular.SelectionMessage(chatbotMessage.getMessageSid(), chatbotMessage.getIndex(), chatbotMessage.getSenderType(), z2, true, chatbotMessage.getDateCreated(), timestamp, selection.getAttributes().getTitle(), selection.getAttributes().getSubtitle(), selection.getAttributes().getTrailingContent(), selection.getAttributes().getIconUrl(), null);
        }
        if (!(chatbotMessage instanceof ChatbotMessage.Unknown)) {
            throw new NoWhenBranchMatchedException();
        }
        return new UiChatMessage.Unknown(chatbotMessage.getMessageSid(), chatbotMessage.getIndex(), chatbotMessage.getSenderType(), chatbotMessage.getDateCreated());
    }
}
