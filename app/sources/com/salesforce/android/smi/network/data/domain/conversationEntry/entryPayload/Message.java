package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.ChoicesFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.ChoicesResponseFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.FormFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.FormResponseFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.StaticContentFormat;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Message.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006%&'()*R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0005\"\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0018X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0005\"\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\u0004\u0018\u00010!X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$\u0082\u0001\u0006+,-./0¨\u00061"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "", "id", "", "getId", "()Ljava/lang/String;", "inReplyToMessageId", "getInReplyToMessageId", "messageType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "getMessageType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "content", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat;", "getContent", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat;", "reply", "getReply", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "channelAddressIdentifier", "getChannelAddressIdentifier", "setChannelAddressIdentifier", "(Ljava/lang/String;)V", "routingAttributes", "", "getRoutingAttributes", "()Ljava/util/Map;", "setRoutingAttributes", "(Ljava/util/Map;)V", "language", "getLanguage", "setLanguage", "isNewMessagingSession", "", "()Ljava/lang/Boolean;", "setNewMessagingSession", "(Ljava/lang/Boolean;)V", "ConversationEntryMessageType", "StaticContentMessage", "ChoicesMessage", "ChoicesResponseMessage", "FormMessage", "FormResponseMessage", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$MessagePayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ChoicesMessage;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ChoicesResponseMessage;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$FormMessage;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$FormResponseMessage;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$StaticContentMessage;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface Message {
    String getChannelAddressIdentifier();

    MessageFormat getContent();

    String getId();

    String getInReplyToMessageId();

    String getLanguage();

    ConversationEntryMessageType getMessageType();

    Message getReply();

    Map<String, Object> getRoutingAttributes();

    /* renamed from: isNewMessagingSession */
    Boolean getIsNewMessagingSession();

    void setChannelAddressIdentifier(String str);

    void setLanguage(String str);

    void setNewMessagingSession(Boolean bool);

    void setRoutingAttributes(Map<String, ? extends Object> map);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Message.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "", "<init>", "(Ljava/lang/String;I)V", "StaticContentMessage", "ChoicesMessage", "ChoicesResponseMessage", "FormMessage", "FormResponseMessage", "StreamingToken", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ConversationEntryMessageType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConversationEntryMessageType[] $VALUES;
        public static final ConversationEntryMessageType StaticContentMessage = new ConversationEntryMessageType("StaticContentMessage", 0);
        public static final ConversationEntryMessageType ChoicesMessage = new ConversationEntryMessageType("ChoicesMessage", 1);
        public static final ConversationEntryMessageType ChoicesResponseMessage = new ConversationEntryMessageType("ChoicesResponseMessage", 2);
        public static final ConversationEntryMessageType FormMessage = new ConversationEntryMessageType("FormMessage", 3);
        public static final ConversationEntryMessageType FormResponseMessage = new ConversationEntryMessageType("FormResponseMessage", 4);
        public static final ConversationEntryMessageType StreamingToken = new ConversationEntryMessageType("StreamingToken", 5);

        private static final /* synthetic */ ConversationEntryMessageType[] $values() {
            return new ConversationEntryMessageType[]{StaticContentMessage, ChoicesMessage, ChoicesResponseMessage, FormMessage, FormResponseMessage, StreamingToken};
        }

        public static EnumEntries<ConversationEntryMessageType> getEntries() {
            return $ENTRIES;
        }

        private ConversationEntryMessageType(String str, int i) {
        }

        static {
            ConversationEntryMessageType[] conversationEntryMessageTypeArr$values = $values();
            $VALUES = conversationEntryMessageTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(conversationEntryMessageTypeArr$values);
        }

        public static ConversationEntryMessageType valueOf(String str) {
            return (ConversationEntryMessageType) Enum.valueOf(ConversationEntryMessageType.class, str);
        }

        public static ConversationEntryMessageType[] values() {
            return (ConversationEntryMessageType[]) $VALUES.clone();
        }
    }

    /* compiled from: Message.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0018R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010#\u001a\u0004\u0018\u00010$X\u0096\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$StaticContentMessage;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "id", "", "inReplyToMessageId", "content", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat;", "reply", "channelAddressIdentifier", "routingAttributes", "", "", "language", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getInReplyToMessageId", "getContent", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat;", "getReply", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "getChannelAddressIdentifier", "setChannelAddressIdentifier", "(Ljava/lang/String;)V", "getRoutingAttributes", "()Ljava/util/Map;", "setRoutingAttributes", "(Ljava/util/Map;)V", "getLanguage", "setLanguage", "messageType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "getMessageType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "isNewMessagingSession", "", "()Ljava/lang/Boolean;", "setNewMessagingSession", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class StaticContentMessage implements Message {
        private String channelAddressIdentifier;
        private final StaticContentFormat content;
        private final String id;
        private final String inReplyToMessageId;
        private Boolean isNewMessagingSession;
        private String language;
        private final ConversationEntryMessageType messageType;
        private final transient Message reply;
        private Map<String, ? extends Object> routingAttributes;

        public StaticContentMessage(String id, String str, @Json(name = "staticContent") StaticContentFormat content, Message message, String str2, Map<String, ? extends Object> map, String str3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            this.id = id;
            this.inReplyToMessageId = str;
            this.content = content;
            this.reply = message;
            this.channelAddressIdentifier = str2;
            this.routingAttributes = map;
            this.language = str3;
            this.messageType = ConversationEntryMessageType.StaticContentMessage;
            this.isNewMessagingSession = Boolean.FALSE;
        }

        public /* synthetic */ StaticContentMessage(String str, String str2, StaticContentFormat staticContentFormat, Message message, String str3, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, staticContentFormat, (i & 8) != 0 ? null : message, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : str4);
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message, com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getInReplyToMessageId() {
            return this.inReplyToMessageId;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public StaticContentFormat getContent() {
            return this.content;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public Message getReply() {
            return this.reply;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getChannelAddressIdentifier() {
            return this.channelAddressIdentifier;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setChannelAddressIdentifier(String str) {
            this.channelAddressIdentifier = str;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public Map<String, Object> getRoutingAttributes() {
            return this.routingAttributes;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setRoutingAttributes(Map<String, ? extends Object> map) {
            this.routingAttributes = map;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getLanguage() {
            return this.language;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setLanguage(String str) {
            this.language = str;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public ConversationEntryMessageType getMessageType() {
            return this.messageType;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        /* renamed from: isNewMessagingSession, reason: from getter */
        public Boolean getIsNewMessagingSession() {
            return this.isNewMessagingSession;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setNewMessagingSession(Boolean bool) {
            this.isNewMessagingSession = bool;
        }
    }

    /* compiled from: Message.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0018R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010#\u001a\u0004\u0018\u00010$X\u0096\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ChoicesMessage;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "id", "", "inReplyToMessageId", "content", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat;", "reply", "channelAddressIdentifier", "routingAttributes", "", "", "language", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getInReplyToMessageId", "getContent", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesFormat;", "getReply", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "getChannelAddressIdentifier", "setChannelAddressIdentifier", "(Ljava/lang/String;)V", "getRoutingAttributes", "()Ljava/util/Map;", "setRoutingAttributes", "(Ljava/util/Map;)V", "getLanguage", "setLanguage", "messageType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "getMessageType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "isNewMessagingSession", "", "()Ljava/lang/Boolean;", "setNewMessagingSession", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ChoicesMessage implements Message {
        private String channelAddressIdentifier;
        private final ChoicesFormat content;
        private final String id;
        private final String inReplyToMessageId;
        private Boolean isNewMessagingSession;
        private String language;
        private final ConversationEntryMessageType messageType;
        private final transient Message reply;
        private Map<String, ? extends Object> routingAttributes;

        public ChoicesMessage(String id, String str, @Json(name = InquiryField.ChoicesField.TYPE) ChoicesFormat content, Message message, String str2, Map<String, ? extends Object> map, String str3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            this.id = id;
            this.inReplyToMessageId = str;
            this.content = content;
            this.reply = message;
            this.channelAddressIdentifier = str2;
            this.routingAttributes = map;
            this.language = str3;
            this.messageType = ConversationEntryMessageType.ChoicesMessage;
            this.isNewMessagingSession = Boolean.FALSE;
        }

        public /* synthetic */ ChoicesMessage(String str, String str2, ChoicesFormat choicesFormat, Message message, String str3, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, choicesFormat, (i & 8) != 0 ? null : message, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : str4);
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message, com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getInReplyToMessageId() {
            return this.inReplyToMessageId;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public ChoicesFormat getContent() {
            return this.content;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public Message getReply() {
            return this.reply;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getChannelAddressIdentifier() {
            return this.channelAddressIdentifier;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setChannelAddressIdentifier(String str) {
            this.channelAddressIdentifier = str;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public Map<String, Object> getRoutingAttributes() {
            return this.routingAttributes;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setRoutingAttributes(Map<String, ? extends Object> map) {
            this.routingAttributes = map;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getLanguage() {
            return this.language;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setLanguage(String str) {
            this.language = str;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public ConversationEntryMessageType getMessageType() {
            return this.messageType;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        /* renamed from: isNewMessagingSession, reason: from getter */
        public Boolean getIsNewMessagingSession() {
            return this.isNewMessagingSession;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setNewMessagingSession(Boolean bool) {
            this.isNewMessagingSession = bool;
        }
    }

    /* compiled from: Message.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0018R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010#\u001a\u0004\u0018\u00010$X\u0096\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ChoicesResponseMessage;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "id", "", "inReplyToMessageId", "content", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat;", "reply", "channelAddressIdentifier", "routingAttributes", "", "", "language", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getInReplyToMessageId", "getContent", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ChoicesResponseFormat;", "getReply", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "getChannelAddressIdentifier", "setChannelAddressIdentifier", "(Ljava/lang/String;)V", "getRoutingAttributes", "()Ljava/util/Map;", "setRoutingAttributes", "(Ljava/util/Map;)V", "getLanguage", "setLanguage", "messageType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "getMessageType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "isNewMessagingSession", "", "()Ljava/lang/Boolean;", "setNewMessagingSession", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ChoicesResponseMessage implements Message {
        private String channelAddressIdentifier;
        private final ChoicesResponseFormat content;
        private final String id;
        private final String inReplyToMessageId;
        private Boolean isNewMessagingSession;
        private String language;
        private final ConversationEntryMessageType messageType;
        private final transient Message reply;
        private Map<String, ? extends Object> routingAttributes;

        public ChoicesResponseMessage(String id, String str, @Json(name = "choicesResponse") ChoicesResponseFormat content, Message message, String str2, Map<String, ? extends Object> map, String str3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            this.id = id;
            this.inReplyToMessageId = str;
            this.content = content;
            this.reply = message;
            this.channelAddressIdentifier = str2;
            this.routingAttributes = map;
            this.language = str3;
            this.messageType = ConversationEntryMessageType.ChoicesResponseMessage;
            this.isNewMessagingSession = Boolean.FALSE;
        }

        public /* synthetic */ ChoicesResponseMessage(String str, String str2, ChoicesResponseFormat choicesResponseFormat, Message message, String str3, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, choicesResponseFormat, (i & 8) != 0 ? null : message, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : str4);
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message, com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getInReplyToMessageId() {
            return this.inReplyToMessageId;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public ChoicesResponseFormat getContent() {
            return this.content;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public Message getReply() {
            return this.reply;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getChannelAddressIdentifier() {
            return this.channelAddressIdentifier;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setChannelAddressIdentifier(String str) {
            this.channelAddressIdentifier = str;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public Map<String, Object> getRoutingAttributes() {
            return this.routingAttributes;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setRoutingAttributes(Map<String, ? extends Object> map) {
            this.routingAttributes = map;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getLanguage() {
            return this.language;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setLanguage(String str) {
            this.language = str;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public ConversationEntryMessageType getMessageType() {
            return this.messageType;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        /* renamed from: isNewMessagingSession, reason: from getter */
        public Boolean getIsNewMessagingSession() {
            return this.isNewMessagingSession;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setNewMessagingSession(Boolean bool) {
            this.isNewMessagingSession = bool;
        }
    }

    /* compiled from: Message.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0018R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010#\u001a\u0004\u0018\u00010$X\u0096\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$FormMessage;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "id", "", "inReplyToMessageId", "content", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat;", "reply", "channelAddressIdentifier", "routingAttributes", "", "", "language", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getInReplyToMessageId", "getContent", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormFormat;", "getReply", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "getChannelAddressIdentifier", "setChannelAddressIdentifier", "(Ljava/lang/String;)V", "getRoutingAttributes", "()Ljava/util/Map;", "setRoutingAttributes", "(Ljava/util/Map;)V", "getLanguage", "setLanguage", "messageType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "getMessageType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "isNewMessagingSession", "", "()Ljava/lang/Boolean;", "setNewMessagingSession", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class FormMessage implements Message {
        private String channelAddressIdentifier;
        private final FormFormat content;
        private final String id;
        private final String inReplyToMessageId;
        private Boolean isNewMessagingSession;
        private String language;
        private final ConversationEntryMessageType messageType;
        private final transient Message reply;
        private Map<String, ? extends Object> routingAttributes;

        public FormMessage(String id, String str, @Json(name = "form") FormFormat content, Message message, String str2, Map<String, ? extends Object> map, String str3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            this.id = id;
            this.inReplyToMessageId = str;
            this.content = content;
            this.reply = message;
            this.channelAddressIdentifier = str2;
            this.routingAttributes = map;
            this.language = str3;
            this.messageType = ConversationEntryMessageType.FormMessage;
            this.isNewMessagingSession = Boolean.FALSE;
        }

        public /* synthetic */ FormMessage(String str, String str2, FormFormat formFormat, Message message, String str3, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, formFormat, (i & 8) != 0 ? null : message, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : str4);
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message, com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getInReplyToMessageId() {
            return this.inReplyToMessageId;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public FormFormat getContent() {
            return this.content;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public Message getReply() {
            return this.reply;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getChannelAddressIdentifier() {
            return this.channelAddressIdentifier;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setChannelAddressIdentifier(String str) {
            this.channelAddressIdentifier = str;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public Map<String, Object> getRoutingAttributes() {
            return this.routingAttributes;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setRoutingAttributes(Map<String, ? extends Object> map) {
            this.routingAttributes = map;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getLanguage() {
            return this.language;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setLanguage(String str) {
            this.language = str;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public ConversationEntryMessageType getMessageType() {
            return this.messageType;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        /* renamed from: isNewMessagingSession, reason: from getter */
        public Boolean getIsNewMessagingSession() {
            return this.isNewMessagingSession;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setNewMessagingSession(Boolean bool) {
            this.isNewMessagingSession = bool;
        }
    }

    /* compiled from: Message.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0018R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010#\u001a\u0004\u0018\u00010$X\u0096\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$FormResponseMessage;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "id", "", "inReplyToMessageId", "content", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormResponseFormat;", "reply", "channelAddressIdentifier", "routingAttributes", "", "", "language", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormResponseFormat;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getInReplyToMessageId", "getContent", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/FormResponseFormat;", "getReply", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "getChannelAddressIdentifier", "setChannelAddressIdentifier", "(Ljava/lang/String;)V", "getRoutingAttributes", "()Ljava/util/Map;", "setRoutingAttributes", "(Ljava/util/Map;)V", "getLanguage", "setLanguage", "messageType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "getMessageType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "isNewMessagingSession", "", "()Ljava/lang/Boolean;", "setNewMessagingSession", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class FormResponseMessage implements Message {
        private String channelAddressIdentifier;
        private final FormResponseFormat content;
        private final String id;
        private final String inReplyToMessageId;
        private Boolean isNewMessagingSession;
        private String language;
        private final ConversationEntryMessageType messageType;
        private final transient Message reply;
        private Map<String, ? extends Object> routingAttributes;

        public FormResponseMessage(String id, String str, @Json(name = "formResponse") FormResponseFormat content, Message message, String str2, Map<String, ? extends Object> map, String str3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            this.id = id;
            this.inReplyToMessageId = str;
            this.content = content;
            this.reply = message;
            this.channelAddressIdentifier = str2;
            this.routingAttributes = map;
            this.language = str3;
            this.messageType = ConversationEntryMessageType.FormResponseMessage;
            this.isNewMessagingSession = Boolean.FALSE;
        }

        public /* synthetic */ FormResponseMessage(String str, String str2, FormResponseFormat formResponseFormat, Message message, String str3, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, formResponseFormat, (i & 8) != 0 ? null : message, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : str4);
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message, com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getInReplyToMessageId() {
            return this.inReplyToMessageId;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public FormResponseFormat getContent() {
            return this.content;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public Message getReply() {
            return this.reply;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getChannelAddressIdentifier() {
            return this.channelAddressIdentifier;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setChannelAddressIdentifier(String str) {
            this.channelAddressIdentifier = str;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public Map<String, Object> getRoutingAttributes() {
            return this.routingAttributes;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setRoutingAttributes(Map<String, ? extends Object> map) {
            this.routingAttributes = map;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getLanguage() {
            return this.language;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setLanguage(String str) {
            this.language = str;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public ConversationEntryMessageType getMessageType() {
            return this.messageType;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        /* renamed from: isNewMessagingSession, reason: from getter */
        public Boolean getIsNewMessagingSession() {
            return this.isNewMessagingSession;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setNewMessagingSession(Boolean bool) {
            this.isNewMessagingSession = bool;
        }
    }
}
