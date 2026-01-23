package com.robinhood.chatbot.proto.p285v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MESSAGE_TYPE_UNSPECIFIED", "TEXT", "DISCLAIMER", "MARKDOWN", "LINK", "ACTION", "SUGGESTED_RESPONSES", "INFO", "CTA_ACTION", "SELECTION", "MEDIA", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class MessageType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MessageType[] $VALUES;
    public static final MessageType ACTION;

    @JvmField
    public static final ProtoAdapter<MessageType> ADAPTER;
    public static final MessageType CTA_ACTION;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MessageType DISCLAIMER;
    public static final MessageType INFO;
    public static final MessageType LINK;
    public static final MessageType MARKDOWN;
    public static final MessageType MEDIA;
    public static final MessageType MESSAGE_TYPE_UNSPECIFIED;
    public static final MessageType SELECTION;
    public static final MessageType SUGGESTED_RESPONSES;
    public static final MessageType TEXT;
    private final int value;

    private static final /* synthetic */ MessageType[] $values() {
        return new MessageType[]{MESSAGE_TYPE_UNSPECIFIED, TEXT, DISCLAIMER, MARKDOWN, LINK, ACTION, SUGGESTED_RESPONSES, INFO, CTA_ACTION, SELECTION, MEDIA};
    }

    @JvmStatic
    public static final MessageType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<MessageType> getEntries() {
        return $ENTRIES;
    }

    private MessageType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final MessageType messageType = new MessageType("MESSAGE_TYPE_UNSPECIFIED", 0, 0);
        MESSAGE_TYPE_UNSPECIFIED = messageType;
        TEXT = new MessageType("TEXT", 1, 1);
        DISCLAIMER = new MessageType("DISCLAIMER", 2, 2);
        MARKDOWN = new MessageType("MARKDOWN", 3, 3);
        LINK = new MessageType("LINK", 4, 4);
        ACTION = new MessageType("ACTION", 5, 5);
        SUGGESTED_RESPONSES = new MessageType("SUGGESTED_RESPONSES", 6, 6);
        INFO = new MessageType("INFO", 7, 7);
        CTA_ACTION = new MessageType("CTA_ACTION", 8, 8);
        SELECTION = new MessageType("SELECTION", 9, 9);
        MEDIA = new MessageType("MEDIA", 10, 10);
        MessageType[] messageTypeArr$values = $values();
        $VALUES = messageTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(messageTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MessageType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<MessageType>(orCreateKotlinClass, syntax, messageType) { // from class: com.robinhood.chatbot.proto.v1.MessageType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public MessageType fromValue(int value) {
                return MessageType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: MessageType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/chatbot/proto/v1/MessageType;", "fromValue", "value", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MessageType fromValue(int value) {
            switch (value) {
                case 0:
                    return MessageType.MESSAGE_TYPE_UNSPECIFIED;
                case 1:
                    return MessageType.TEXT;
                case 2:
                    return MessageType.DISCLAIMER;
                case 3:
                    return MessageType.MARKDOWN;
                case 4:
                    return MessageType.LINK;
                case 5:
                    return MessageType.ACTION;
                case 6:
                    return MessageType.SUGGESTED_RESPONSES;
                case 7:
                    return MessageType.INFO;
                case 8:
                    return MessageType.CTA_ACTION;
                case 9:
                    return MessageType.SELECTION;
                case 10:
                    return MessageType.MEDIA;
                default:
                    return null;
            }
        }
    }

    public static MessageType valueOf(String str) {
        return (MessageType) Enum.valueOf(MessageType.class, str);
    }

    public static MessageType[] values() {
        return (MessageType[]) $VALUES.clone();
    }
}
