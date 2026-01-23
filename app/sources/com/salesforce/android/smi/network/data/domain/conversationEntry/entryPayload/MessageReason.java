package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageReason.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/MessageReason;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AutomatedResponse", "Consent", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class MessageReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MessageReason[] $VALUES;
    public static final MessageReason AutomatedResponse = new MessageReason("AutomatedResponse", 0, "AutomatedResponse");
    public static final MessageReason Consent = new MessageReason("Consent", 1, "Consent");
    private final String value;

    private static final /* synthetic */ MessageReason[] $values() {
        return new MessageReason[]{AutomatedResponse, Consent};
    }

    public static EnumEntries<MessageReason> getEntries() {
        return $ENTRIES;
    }

    private MessageReason(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        MessageReason[] messageReasonArr$values = $values();
        $VALUES = messageReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(messageReasonArr$values);
    }

    public static MessageReason valueOf(String str) {
        return (MessageReason) Enum.valueOf(MessageReason.class, str);
    }

    public static MessageReason[] values() {
        return (MessageReason[]) $VALUES.clone();
    }
}
