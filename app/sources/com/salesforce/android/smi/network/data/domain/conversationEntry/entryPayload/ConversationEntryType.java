package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConversationEntryType.kt */
@JsonClass(generateAdapter = false)
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "", "<init>", "(Ljava/lang/String;I)V", "Message", "ParticipantChanged", "TypingIndicator", "TypingStartedIndicator", "TypingStoppedIndicator", "ProgressIndicator", "DeliveryAcknowledgement", "ReadAcknowledgement", "RoutingResult", "RoutingWorkResult", "StreamingToken", "UnknownEntry", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ConversationEntryType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConversationEntryType[] $VALUES;
    public static final ConversationEntryType Message = new ConversationEntryType("Message", 0);
    public static final ConversationEntryType ParticipantChanged = new ConversationEntryType("ParticipantChanged", 1);
    public static final ConversationEntryType TypingIndicator = new ConversationEntryType("TypingIndicator", 2);
    public static final ConversationEntryType TypingStartedIndicator = new ConversationEntryType("TypingStartedIndicator", 3);
    public static final ConversationEntryType TypingStoppedIndicator = new ConversationEntryType("TypingStoppedIndicator", 4);
    public static final ConversationEntryType ProgressIndicator = new ConversationEntryType("ProgressIndicator", 5);
    public static final ConversationEntryType DeliveryAcknowledgement = new ConversationEntryType("DeliveryAcknowledgement", 6);
    public static final ConversationEntryType ReadAcknowledgement = new ConversationEntryType("ReadAcknowledgement", 7);
    public static final ConversationEntryType RoutingResult = new ConversationEntryType("RoutingResult", 8);
    public static final ConversationEntryType RoutingWorkResult = new ConversationEntryType("RoutingWorkResult", 9);
    public static final ConversationEntryType StreamingToken = new ConversationEntryType("StreamingToken", 10);
    public static final ConversationEntryType UnknownEntry = new ConversationEntryType("UnknownEntry", 11);

    private static final /* synthetic */ ConversationEntryType[] $values() {
        return new ConversationEntryType[]{Message, ParticipantChanged, TypingIndicator, TypingStartedIndicator, TypingStoppedIndicator, ProgressIndicator, DeliveryAcknowledgement, ReadAcknowledgement, RoutingResult, RoutingWorkResult, StreamingToken, UnknownEntry};
    }

    public static EnumEntries<ConversationEntryType> getEntries() {
        return $ENTRIES;
    }

    private ConversationEntryType(String str, int i) {
    }

    static {
        ConversationEntryType[] conversationEntryTypeArr$values = $values();
        $VALUES = conversationEntryTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(conversationEntryTypeArr$values);
    }

    public static ConversationEntryType valueOf(String str) {
        return (ConversationEntryType) Enum.valueOf(ConversationEntryType.class, str);
    }

    public static ConversationEntryType[] values() {
        return (ConversationEntryType[]) $VALUES.clone();
    }
}
