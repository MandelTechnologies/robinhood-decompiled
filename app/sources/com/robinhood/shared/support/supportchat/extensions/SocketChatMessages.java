package com.robinhood.shared.support.supportchat.extensions;

import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import com.robinhood.models.supportchat.p353db.SocketChatMessage3;
import com.robinhood.models.supportchat.p353db.SupportChatAction;
import com.robinhood.shared.models.chat.common.Renderable;
import com.robinhood.shared.models.chat.common.api.ParticipantType;
import com.robinhood.shared.support.supportchat.UiChatMessages;
import com.robinhood.shared.support.supportchat.format.ChatTimestampFormatter;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage2;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: SocketChatMessages.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u0011\u001a\u00020\n*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "", "showTypingIndicator", "", "lastAgentReadMessageIndex", "j$/time/Instant", "lastAgentReadMessageTimestamp", "Lcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;", "chatTimestampFormatter", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage;", "toUiChatMessage", "(Ljava/util/List;ZJLj$/time/Instant;Lcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;)Ljava/util/List;", "endOfMessageBlock", "showAvatar", "Lcom/robinhood/shared/support/supportchat/ui/models/MessageMetadata$Timestamp;", "timestampMetadata", "transform", "(Lcom/robinhood/models/supportchat/db/SocketChatMessage;ZZLcom/robinhood/shared/support/supportchat/ui/models/MessageMetadata$Timestamp;)Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage;", "lib-support-chat_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.support.supportchat.extensions.SocketChatMessagesKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SocketChatMessages {
    public static final List<UiChatMessage> toUiChatMessage(List<SocketChatMessage> list, boolean z, long j, Instant lastAgentReadMessageTimestamp, ChatTimestampFormatter chatTimestampFormatter) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lastAgentReadMessageTimestamp, "lastAgentReadMessageTimestamp");
        Intrinsics.checkNotNullParameter(chatTimestampFormatter, "chatTimestampFormatter");
        return UiChatMessages.transform(list, z, j, lastAgentReadMessageTimestamp, chatTimestampFormatter, new Function4() { // from class: com.robinhood.shared.support.supportchat.extensions.SocketChatMessagesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SocketChatMessages.toUiChatMessage$lambda$0((Renderable) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (UiChatMessage2.Timestamp) obj4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiChatMessage toUiChatMessage$lambda$0(Renderable transform, boolean z, boolean z2, UiChatMessage2.Timestamp timestamp) {
        Intrinsics.checkNotNullParameter(transform, "$this$transform");
        return transform((SocketChatMessage) transform, z, z2, timestamp);
    }

    public static final UiChatMessage transform(SocketChatMessage socketChatMessage, boolean z, boolean z2, UiChatMessage2.Timestamp timestamp) {
        Intrinsics.checkNotNullParameter(socketChatMessage, "<this>");
        SocketChatMessage3 data = socketChatMessage.getAttributes().getData();
        if (data instanceof SocketChatMessage3.Text) {
            String messageSid = socketChatMessage.getMessageSid();
            SocketChatMessage3.Text text = (SocketChatMessage3.Text) data;
            UUID localSid = text.getLocalSid();
            return new UiChatMessage.Regular.Text(messageSid, localSid != null ? localSid.toString() : null, socketChatMessage.getIndex(), text.getSenderType(), z2, z, socketChatMessage.getDateCreated(), timestamp, socketChatMessage.getBody());
        }
        if (data instanceof SocketChatMessage3.Action) {
            String messageSid2 = socketChatMessage.getMessageSid();
            long index = socketChatMessage.getIndex();
            SocketChatMessage3.Action action = (SocketChatMessage3.Action) data;
            ParticipantType senderType = action.getSenderType();
            String body = socketChatMessage.getBody();
            List<SupportChatAction> actions = action.getExtraInfo().getActions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(actions, 10));
            int i = 0;
            for (Object obj : actions) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(SupportChatActions.toUiChatAction((SupportChatAction) obj, socketChatMessage.getMessageSid() + "_" + i));
                i = i2;
            }
            return new UiChatMessage.Regular.Action(messageSid2, index, senderType, z2, z, socketChatMessage.getDateCreated(), timestamp, body, CollectionsKt.filterNotNull(arrayList), null, null, null, 3584, null);
        }
        if (data instanceof SocketChatMessage3.SystemInfo) {
            return new UiChatMessage.Metadata.SystemInfo(socketChatMessage.getMessageSid(), socketChatMessage.getIndex(), ((SocketChatMessage3.SystemInfo) data).getSenderType(), socketChatMessage.getDateCreated(), socketChatMessage.getBody());
        }
        if (data instanceof SocketChatMessage3.SystemUploadReceipt) {
            SocketChatMessage3.SystemUploadReceipt systemUploadReceipt = (SocketChatMessage3.SystemUploadReceipt) data;
            return new UiChatMessage.Metadata.SystemUploadReceipt(socketChatMessage.getMessageSid(), socketChatMessage.getIndex(), systemUploadReceipt.getSenderType(), socketChatMessage.getDateCreated(), socketChatMessage.getBody(), systemUploadReceipt.getExtraInfo().getDocumentId(), systemUploadReceipt.getExtraInfo().getDocumentType());
        }
        if (data instanceof SocketChatMessage3.Link) {
            SocketChatMessage3.Link link = (SocketChatMessage3.Link) data;
            return new UiChatMessage.Regular.Link(socketChatMessage.getMessageSid(), socketChatMessage.getIndex(), link.getSenderType(), z2, z, socketChatMessage.getDateCreated(), timestamp, link.getExtraInfo().getUrl(), link.getExtraInfo().getTitle(), null);
        }
        if (data instanceof SocketChatMessage3.Image) {
            String messageSid3 = socketChatMessage.getMessageSid();
            SocketChatMessage3.Image image = (SocketChatMessage3.Image) data;
            UUID localSid2 = image.getLocalSid();
            return new UiChatMessage.Regular.Image(messageSid3, localSid2 != null ? localSid2.toString() : null, socketChatMessage.getIndex(), image.getSenderType(), z2, z, socketChatMessage.getDateCreated(), timestamp, image.getExtraInfo().getDocumentId(), image.getExtraInfo().getOriginalWidth(), image.getExtraInfo().getOriginalHeight(), image.getExtraInfo().getDocumentUri());
        }
        if (!(data instanceof SocketChatMessage3.Selection) && !(data instanceof SocketChatMessage3.Unknown)) {
            throw new NoWhenBranchMatchedException();
        }
        return new UiChatMessage.Unknown(socketChatMessage.getMessageSid(), socketChatMessage.getIndex(), data.getSenderType(), socketChatMessage.getDateCreated());
    }
}
