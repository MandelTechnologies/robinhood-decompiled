package com.robinhood.android.supportchat;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.p355ui.SimpleChatIssue;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatMode;
import com.robinhood.models.supportchat.api.ApiSocketChatMessage3;
import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import com.robinhood.models.supportchat.p353db.SocketChatMessage3;
import com.robinhood.models.supportchat.p353db.SocketChatMessageAttributes;
import com.robinhood.shared.support.supportchat.ChatListItem;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import p479j$.time.Instant;

/* compiled from: SupportChatListStateProvider.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a_\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000f\u001a\u00020\u000e*\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u00012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0015\u001a\u0004\u0018\u00010\u0004*\u00020\u00142\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0017\u001a\u00020\u0006*\u00020\u00142\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\" \u0010\u001d\u001a\u00020\u0011*\u0004\u0018\u00010\u00048@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m3636d2 = {"", "Lcom/robinhood/models/ui/SimpleChatIssue;", "", "", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "agentChatToPreviewMessages", "", "agentChatToUnreadMessageCount", "", "isInitialPreviewLoadingComplete", "previewMessageLoadingFailed", "Lcom/robinhood/shared/support/supportchat/ChatListItem;", "toDisplayChatList", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ZZ)Ljava/util/List;", "j$/time/Instant", "getUpdatedAt", "(Lcom/robinhood/models/ui/SimpleChatIssue;Ljava/util/Map;)Lj$/time/Instant;", "Lcom/robinhood/utils/resource/StringResource;", "getPreviewMessage", "(Lcom/robinhood/models/ui/SimpleChatIssue;Ljava/util/Map;ZZ)Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "toPreviewMessage", "(Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Ljava/util/Map;)Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "toUnreadMessageCount", "(Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Ljava/util/Map;)J", "getPreview", "(Lcom/robinhood/models/supportchat/db/SocketChatMessage;)Lcom/robinhood/utils/resource/StringResource;", "getPreview$annotations", "(Lcom/robinhood/models/supportchat/db/SocketChatMessage;)V", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "feature-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.supportchat.SupportChatListStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class SupportChatListStateProvider2 {

    /* compiled from: SupportChatListStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.supportchat.SupportChatListStateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiSocketChatMessage3.values().length];
            try {
                iArr[ApiSocketChatMessage3.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSocketChatMessage3.ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiSocketChatMessage3.UPLOAD_RECEIPT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiSocketChatMessage3.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiSocketChatMessage3.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiSocketChatMessage3.IMAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiSocketChatMessage3.SELECTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiSocketChatMessage3.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getPreview$annotations(SocketChatMessage socketChatMessage) {
    }

    public static /* synthetic */ List toDisplayChatList$default(List list, Map map, Map map2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i & 2) != 0) {
            map2 = MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return toDisplayChatList(list, map, map2, z, z2);
    }

    public static final List<ChatListItem> toDisplayChatList(List<SimpleChatIssue> list, final Map<String, SocketChatMessage> agentChatToPreviewMessages, final Map<String, Long> agentChatToUnreadMessageCount, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(agentChatToPreviewMessages, "agentChatToPreviewMessages");
        Intrinsics.checkNotNullParameter(agentChatToUnreadMessageCount, "agentChatToUnreadMessageCount");
        return SequencesKt.toList(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.android.supportchat.SupportChatListStateProviderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportChatListStateProvider2.toDisplayChatList$lambda$0(agentChatToPreviewMessages, z, z2, agentChatToUnreadMessageCount, (SimpleChatIssue) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatListItem toDisplayChatList$lambda$0(Map map, boolean z, boolean z2, Map map2, SimpleChatIssue chat) {
        Intrinsics.checkNotNullParameter(chat, "chat");
        return new ChatListItem(chat.getId(), chat.isActive(), chat.getCreated(), getUpdatedAt(chat, map), chat.getChatMode(), StringResource.INSTANCE.invoke(chat.getChatTitle()), chat.getChatAvatarColor(), getPreviewMessage(chat, map, z, z2), toUnreadMessageCount(chat.getChatMode(), map2), false, chat.getHasImpression(), chat.getCanLogImpression());
    }

    public static final Instant getUpdatedAt(SimpleChatIssue simpleChatIssue, Map<String, SocketChatMessage> agentChatToPreviewMessages) {
        Intrinsics.checkNotNullParameter(simpleChatIssue, "<this>");
        Intrinsics.checkNotNullParameter(agentChatToPreviewMessages, "agentChatToPreviewMessages");
        SocketChatMessage previewMessage = toPreviewMessage(simpleChatIssue.getChatMode(), agentChatToPreviewMessages);
        Instant dateCreated = previewMessage != null ? previewMessage.getDateCreated() : null;
        if (dateCreated == null) {
            return simpleChatIssue.getLastRelevantUpdated();
        }
        return dateCreated.compareTo(simpleChatIssue.getLastRelevantUpdated()) > 0 ? dateCreated : simpleChatIssue.getLastRelevantUpdated();
    }

    public static /* synthetic */ StringResource getPreviewMessage$default(SimpleChatIssue simpleChatIssue, Map map, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return getPreviewMessage(simpleChatIssue, map, z, z2);
    }

    public static final StringResource getPreviewMessage(SimpleChatIssue simpleChatIssue, Map<String, SocketChatMessage> agentChatToPreviewMessages, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(simpleChatIssue, "<this>");
        Intrinsics.checkNotNullParameter(agentChatToPreviewMessages, "agentChatToPreviewMessages");
        if (!simpleChatIssue.getUseSocketMessagePreview()) {
            String chatPreview = simpleChatIssue.getChatPreview();
            if (chatPreview != null) {
                return StringResource.INSTANCE.invoke(chatPreview);
            }
            return null;
        }
        if (!z) {
            return StringResource.INSTANCE.invoke(C29104R.string.support_chat_list_static_preview_loading, new Object[0]);
        }
        if (z2) {
            return StringResource.INSTANCE.invoke(C29104R.string.support_chat_list_static_preview_error, new Object[0]);
        }
        return getPreview(toPreviewMessage(simpleChatIssue.getChatMode(), agentChatToPreviewMessages));
    }

    private static final SocketChatMessage toPreviewMessage(ChatMode chatMode, Map<String, SocketChatMessage> map) {
        if (chatMode instanceof ChatMode.ChatbotChat) {
            return null;
        }
        if (chatMode instanceof ChatMode.AgentChat.SalesforceChat) {
            UUID conversationId = ((ChatMode.AgentChat.SalesforceChat) chatMode).getConversationId();
            if (conversationId != null) {
                return map.get(conversationId.toString());
            }
            return null;
        }
        if (!(chatMode instanceof ChatMode.AgentChat.TwilioChat)) {
            throw new NoWhenBranchMatchedException();
        }
        String conversationSid = ((ChatMode.AgentChat.TwilioChat) chatMode).getConversationSid();
        if (conversationSid != null) {
            return map.get(conversationSid);
        }
        return null;
    }

    private static final long toUnreadMessageCount(ChatMode chatMode, Map<String, Long> map) {
        String conversationSid;
        Long l;
        Long l2;
        if (chatMode instanceof ChatMode.AgentChat.SalesforceChat) {
            UUID conversationId = ((ChatMode.AgentChat.SalesforceChat) chatMode).getConversationId();
            if (conversationId == null || (l2 = map.get(conversationId.toString())) == null) {
                return 0L;
            }
            return l2.longValue();
        }
        if (!(chatMode instanceof ChatMode.AgentChat.TwilioChat) || (conversationSid = ((ChatMode.AgentChat.TwilioChat) chatMode).getConversationSid()) == null || (l = map.get(conversationSid)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static final StringResource getPreview(SocketChatMessage socketChatMessage) {
        SocketChatMessageAttributes attributes;
        SocketChatMessage3 data;
        ApiSocketChatMessage3 type2 = (socketChatMessage == null || (attributes = socketChatMessage.getAttributes()) == null || (data = attributes.getData()) == null) ? null : data.getType();
        switch (type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case -1:
                return StringResource.INSTANCE.invoke(C29104R.string.support_chat_list_static_preview_empty, new Object[0]);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
                return StringResource.INSTANCE.invoke(socketChatMessage.getBody());
            case 5:
                StringResource.Companion companion = StringResource.INSTANCE;
                int i = C29104R.string.support_chat_list_static_preview_link;
                SocketChatMessage3 data2 = socketChatMessage.getAttributes().getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type com.robinhood.models.supportchat.db.SocketChatMessageData.Link");
                return companion.invoke(i, ((SocketChatMessage3.Link) data2).getExtraInfo().getTitle());
            case 6:
                return StringResource.INSTANCE.invoke(C29104R.string.support_chat_list_static_preview_image, new Object[0]);
            case 7:
            case 8:
                return StringResource.INSTANCE.invoke(C29104R.string.support_chat_list_static_preview_error, new Object[0]);
        }
    }
}
