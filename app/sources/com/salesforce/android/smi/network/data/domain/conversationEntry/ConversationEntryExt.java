package com.salesforce.android.smi.network.data.domain.conversationEntry;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.StreamingToken;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationEntryExt.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\t\u001a\u0004\u0018\u0001H\n\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u000b*\u00020\u0002H\u0086\b¢\u0006\u0002\u0010\f\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m3636d2 = {"message", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "getMessage", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;)Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "streamingToken", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingToken;", "getStreamingToken", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;)Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingToken;", "messageContent", "T", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat;", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;)Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat;", "data_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntryExtKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ConversationEntryExt {
    public static final Message getMessage(ConversationEntry conversationEntry) {
        Intrinsics.checkNotNullParameter(conversationEntry, "<this>");
        EntryPayload payload = conversationEntry.getPayload();
        EntryPayload.MessagePayload messagePayload = payload instanceof EntryPayload.MessagePayload ? (EntryPayload.MessagePayload) payload : null;
        if (messagePayload != null) {
            return messagePayload.getAbstractMessage();
        }
        return null;
    }

    public static final StreamingToken getStreamingToken(ConversationEntry conversationEntry) {
        Intrinsics.checkNotNullParameter(conversationEntry, "<this>");
        EntryPayload payload = conversationEntry.getPayload();
        EntryPayload.StreamingTokenPayload streamingTokenPayload = payload instanceof EntryPayload.StreamingTokenPayload ? (EntryPayload.StreamingTokenPayload) payload : null;
        if (streamingTokenPayload != null) {
            return streamingTokenPayload.getStreamingToken();
        }
        return null;
    }

    public static final /* synthetic */ <T extends MessageFormat> T messageContent(ConversationEntry conversationEntry) {
        Intrinsics.checkNotNullParameter(conversationEntry, "<this>");
        EntryPayload payload = conversationEntry.getPayload();
        T t = null;
        if (payload instanceof EntryPayload.MessagePayload) {
            Message message = getMessage(conversationEntry);
            if (message != null) {
                t = (T) message.getContent();
            }
            Intrinsics.reifiedOperationMarker(2, "T");
            return t;
        }
        if (!(payload instanceof EntryPayload.StreamingTokenPayload)) {
            return null;
        }
        StreamingToken streamingToken = getStreamingToken(conversationEntry);
        StreamingToken.MessageStreamingToken messageStreamingToken = streamingToken instanceof StreamingToken.MessageStreamingToken ? (StreamingToken.MessageStreamingToken) streamingToken : null;
        if (messageStreamingToken != null) {
            t = (T) messageStreamingToken.getToken();
        }
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }
}
