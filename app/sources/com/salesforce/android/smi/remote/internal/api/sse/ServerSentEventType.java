package com.salesforce.android.smi.remote.internal.api.sse;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServerSentEventType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/sse/ServerSentEventType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "Ping", "ConversationMessage", "ChoicesResponseMessage", "ConversationTypingStartedIndicator", "ConversationTypingStoppedIndicator", "ConversationTypingIndicator", "ConversationParticipantChanged", "ConversationDeliveryAcknowledgement", "ConversationReadAcknowledgement", "ConversationRoutingResult", "ConversationRoutingWorkResult", "ConversationProgressIndicator", "ConversationStreamingToken", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ServerSentEventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ServerSentEventType[] $VALUES;
    private final String type;
    public static final ServerSentEventType Ping = new ServerSentEventType("Ping", 0, "ping");
    public static final ServerSentEventType ConversationMessage = new ServerSentEventType("ConversationMessage", 1, "CONVERSATION_MESSAGE");
    public static final ServerSentEventType ChoicesResponseMessage = new ServerSentEventType("ChoicesResponseMessage", 2, "CHOICES_RESPONSE_MESSAGE");
    public static final ServerSentEventType ConversationTypingStartedIndicator = new ServerSentEventType("ConversationTypingStartedIndicator", 3, "CONVERSATION_TYPING_STARTED_INDICATOR");
    public static final ServerSentEventType ConversationTypingStoppedIndicator = new ServerSentEventType("ConversationTypingStoppedIndicator", 4, "CONVERSATION_TYPING_STOPPED_INDICATOR");
    public static final ServerSentEventType ConversationTypingIndicator = new ServerSentEventType("ConversationTypingIndicator", 5, "CONVERSATION_TYPING_INDICATOR");
    public static final ServerSentEventType ConversationParticipantChanged = new ServerSentEventType("ConversationParticipantChanged", 6, "CONVERSATION_PARTICIPANT_CHANGED");
    public static final ServerSentEventType ConversationDeliveryAcknowledgement = new ServerSentEventType("ConversationDeliveryAcknowledgement", 7, "CONVERSATION_DELIVERY_ACKNOWLEDGEMENT");
    public static final ServerSentEventType ConversationReadAcknowledgement = new ServerSentEventType("ConversationReadAcknowledgement", 8, "CONVERSATION_READ_ACKNOWLEDGEMENT");
    public static final ServerSentEventType ConversationRoutingResult = new ServerSentEventType("ConversationRoutingResult", 9, "CONVERSATION_ROUTING_RESULT");
    public static final ServerSentEventType ConversationRoutingWorkResult = new ServerSentEventType("ConversationRoutingWorkResult", 10, "CONVERSATION_ROUTING_WORK_RESULT");
    public static final ServerSentEventType ConversationProgressIndicator = new ServerSentEventType("ConversationProgressIndicator", 11, "CONVERSATION_PROGRESS_INDICATOR");
    public static final ServerSentEventType ConversationStreamingToken = new ServerSentEventType("ConversationStreamingToken", 12, "CONVERSATION_STREAMING_TOKEN");

    private static final /* synthetic */ ServerSentEventType[] $values() {
        return new ServerSentEventType[]{Ping, ConversationMessage, ChoicesResponseMessage, ConversationTypingStartedIndicator, ConversationTypingStoppedIndicator, ConversationTypingIndicator, ConversationParticipantChanged, ConversationDeliveryAcknowledgement, ConversationReadAcknowledgement, ConversationRoutingResult, ConversationRoutingWorkResult, ConversationProgressIndicator, ConversationStreamingToken};
    }

    public static EnumEntries<ServerSentEventType> getEntries() {
        return $ENTRIES;
    }

    private ServerSentEventType(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        return this.type;
    }

    static {
        ServerSentEventType[] serverSentEventTypeArr$values = $values();
        $VALUES = serverSentEventTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(serverSentEventTypeArr$values);
    }

    public static ServerSentEventType valueOf(String str) {
        return (ServerSentEventType) Enum.valueOf(ServerSentEventType.class, str);
    }

    public static ServerSentEventType[] values() {
        return (ServerSentEventType[]) $VALUES.clone();
    }
}
