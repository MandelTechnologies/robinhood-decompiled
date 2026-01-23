package com.salesforce.android.smi.core.internal.util;

import com.salesforce.android.smi.network.data.domain.conversationEntry.CoreConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.ConversationEntryType;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.StaticContentFormat;
import com.salesforce.android.smi.network.data.domain.participant.CoreParticipant;
import com.salesforce.android.smi.network.data.domain.participant.ParticipantRoleType;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConversationEntryFactory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJM\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/util/ConversationEntryFactory;", "", "", "channelId", "<init>", "(Ljava/lang/String;)V", "requestId", "Ljava/util/UUID;", "conversationId", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "message", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/CoreConversationEntry;", "createConversationEntry", "(Ljava/lang/String;Ljava/util/UUID;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;)Lcom/salesforce/android/smi/network/data/domain/conversationEntry/CoreConversationEntry;", "text", "inReplyToMessageId", "", "routingAttributes", "language", "createStaticContentTextMessage", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/salesforce/android/smi/network/data/domain/conversationEntry/CoreConversationEntry;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat;", "messageFormat", "createAttachment", "(Ljava/util/UUID;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat;Ljava/lang/String;)Lcom/salesforce/android/smi/network/data/domain/conversationEntry/CoreConversationEntry;", "Ljava/lang/String;", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ConversationEntryFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String channelId;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationEntryFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ConversationEntryFactory(String str) {
        this.channelId = str;
    }

    public /* synthetic */ ConversationEntryFactory(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoreConversationEntry createStaticContentTextMessage$default(ConversationEntryFactory conversationEntryFactory, UUID uuid, String str, String str2, Map map, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        return conversationEntryFactory.createStaticContentTextMessage(uuid, str, str2, map, str3);
    }

    public final CoreConversationEntry createStaticContentTextMessage(UUID conversationId, String text, String inReplyToMessageId, Map<String, ? extends Object> routingAttributes, String language) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(text, "text");
        Message.StaticContentMessage staticContentMessage = new Message.StaticContentMessage(INSTANCE.generateRequestId(), inReplyToMessageId, new StaticContentFormat.TextFormat(text, null, 2, null), null, this.channelId, routingAttributes, language);
        return createConversationEntry(staticContentMessage.getId(), conversationId, staticContentMessage);
    }

    public static /* synthetic */ CoreConversationEntry createAttachment$default(ConversationEntryFactory conversationEntryFactory, UUID uuid, StaticContentFormat staticContentFormat, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return conversationEntryFactory.createAttachment(uuid, staticContentFormat, str);
    }

    public final CoreConversationEntry createAttachment(UUID conversationId, StaticContentFormat messageFormat, String inReplyToMessageId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(messageFormat, "messageFormat");
        Message.StaticContentMessage staticContentMessage = new Message.StaticContentMessage(INSTANCE.generateRequestId(), inReplyToMessageId, messageFormat, null, this.channelId, null, null, 96, null);
        return createConversationEntry(staticContentMessage.getId(), conversationId, staticContentMessage);
    }

    private final CoreConversationEntry createConversationEntry(String requestId, UUID conversationId, Message message) {
        return new CoreConversationEntry("Guest", conversationId, new CoreParticipant(CoreParticipant.INSTANCE.getLocalSubject(), false, null, ParticipantRoleType.EndUser, null, null, null, 118, null), new EntryPayload.MessagePayload(requestId, message, null, null, null, 28, null), ConversationEntryType.Message, requestId, null, 0L, null, null, 448, null);
    }

    /* compiled from: ConversationEntryFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/util/ConversationEntryFactory$Companion;", "", "<init>", "()V", "generateRequestId", "", "SENDER_DISPLAY_NAME", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String generateRequestId() {
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
    }
}
