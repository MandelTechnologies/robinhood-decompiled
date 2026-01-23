package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.event.entries.ParticipantChangedEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.progressIndicators.ProgressIndicator;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.StreamingToken;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.StreamingTokenMessageFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.StreamingTokenValidationResult;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.routing.EstimatedWaitTime;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.routing.RoutingFailureType;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.routing.RoutingWorkType;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EntryPayload.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\f\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "", "id", "", "getId", "()Ljava/lang/String;", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "MessagePayload", "TypingIndicatorPayload", "TypingStartedIndicatorPayload", "TypingStoppedIndicatorPayload", "ProgressIndicatorPayload", "StreamingTokenPayload", "ParticipantChangedPayload", "RoutingResultPayload", "RoutingWorkResultPayload", "AcknowledgeDeliveryPayload", "AcknowledgeReadPayload", "UnknownEntryPayload", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$AcknowledgeDeliveryPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$AcknowledgeReadPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$MessagePayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$ParticipantChangedPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$ProgressIndicatorPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$RoutingResultPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$RoutingWorkResultPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$StreamingTokenPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$TypingIndicatorPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$TypingStartedIndicatorPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$TypingStoppedIndicatorPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$UnknownEntryPayload;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface EntryPayload {
    ConversationEntryType getEntryType();

    String getId();

    /* compiled from: EntryPayload.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010%\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0010R(\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0004@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010+R@\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020-\u0018\u00010,2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020-\u0018\u00010,@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u00103\u001a\u0004\u0018\u00010\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0004@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000e\"\u0004\b5\u0010+R*\u00106\u001a\u0004\u0018\u00010\n2\b\u0010'\u001a\u0004\u0018\u00010\n@VX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b6\u0010\u0015\"\u0004\b7\u00108¨\u00069"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$MessagePayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "id", "", "abstractMessage", "messageReason", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/MessageReason;", "identifier", "wasRevised", "", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/MessageReason;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getAbstractMessage", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "getMessageReason", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/MessageReason;", "getIdentifier", "getWasRevised", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "inReplyToMessageId", "getInReplyToMessageId", "messageType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "getMessageType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message$ConversationEntryMessageType;", "content", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat;", "getContent", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat;", "reply", "getReply", "value", "channelAddressIdentifier", "getChannelAddressIdentifier", "setChannelAddressIdentifier", "(Ljava/lang/String;)V", "", "", "routingAttributes", "getRoutingAttributes", "()Ljava/util/Map;", "setRoutingAttributes", "(Ljava/util/Map;)V", "language", "getLanguage", "setLanguage", "isNewMessagingSession", "setNewMessagingSession", "(Ljava/lang/Boolean;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class MessagePayload implements Message, EntryPayload {
        private final Message abstractMessage;
        private transient String channelAddressIdentifier;
        private final transient MessageFormat content;
        private final ConversationEntryType entryType;
        private final String id;
        private final transient String identifier;
        private final transient String inReplyToMessageId;
        private transient Boolean isNewMessagingSession;
        private transient String language;
        private final MessageReason messageReason;
        private final transient Message.ConversationEntryMessageType messageType;
        private final transient Message reply;
        private transient Map<String, ? extends Object> routingAttributes;
        private final Boolean wasRevised;

        public MessagePayload(String id, Message abstractMessage, MessageReason messageReason, String identifier, Boolean bool) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(abstractMessage, "abstractMessage");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.id = id;
            this.abstractMessage = abstractMessage;
            this.messageReason = messageReason;
            this.identifier = identifier;
            this.wasRevised = bool;
            this.entryType = ConversationEntryType.Message;
            this.inReplyToMessageId = abstractMessage.getInReplyToMessageId();
            this.messageType = abstractMessage.getMessageType();
            this.content = abstractMessage.getContent();
            this.reply = abstractMessage.getReply();
            this.channelAddressIdentifier = abstractMessage.getChannelAddressIdentifier();
            this.routingAttributes = abstractMessage.getRoutingAttributes();
            this.language = abstractMessage.getLanguage();
            this.isNewMessagingSession = abstractMessage.getIsNewMessagingSession();
        }

        public /* synthetic */ MessagePayload(String str, Message message, MessageReason messageReason, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, message, (i & 4) != 0 ? null : messageReason, (i & 8) != 0 ? str : str2, (i & 16) != 0 ? null : bool);
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message, com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        public final Message getAbstractMessage() {
            return this.abstractMessage;
        }

        public final MessageReason getMessageReason() {
            return this.messageReason;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final Boolean getWasRevised() {
            return this.wasRevised;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public ConversationEntryType getEntryType() {
            return this.entryType;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getInReplyToMessageId() {
            return this.inReplyToMessageId;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public Message.ConversationEntryMessageType getMessageType() {
            return this.messageType;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public MessageFormat getContent() {
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
            this.abstractMessage.setChannelAddressIdentifier(str);
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public Map<String, Object> getRoutingAttributes() {
            return this.routingAttributes;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setRoutingAttributes(Map<String, ? extends Object> map) {
            this.routingAttributes = map;
            this.abstractMessage.setRoutingAttributes(map);
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public String getLanguage() {
            return this.language;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setLanguage(String str) {
            this.language = str;
            this.abstractMessage.setLanguage(str);
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        /* renamed from: isNewMessagingSession, reason: from getter */
        public Boolean getIsNewMessagingSession() {
            return this.isNewMessagingSession;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message
        public void setNewMessagingSession(Boolean bool) {
            this.isNewMessagingSession = bool;
            this.abstractMessage.setNewMessagingSession(bool);
        }
    }

    /* compiled from: EntryPayload.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$TypingIndicatorPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "id", "", "startedTimestamp", "", "<init>", "(Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getStartedTimestamp", "()J", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "setEntryType", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class TypingIndicatorPayload implements EntryPayload {
        private ConversationEntryType entryType;
        private final String id;
        private final long startedTimestamp;

        public TypingIndicatorPayload(String id, long j) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.startedTimestamp = j;
            this.entryType = ConversationEntryType.TypingIndicator;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        public final long getStartedTimestamp() {
            return this.startedTimestamp;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public ConversationEntryType getEntryType() {
            return this.entryType;
        }

        public void setEntryType(ConversationEntryType conversationEntryType) {
            Intrinsics.checkNotNullParameter(conversationEntryType, "<set-?>");
            this.entryType = conversationEntryType;
        }
    }

    /* compiled from: EntryPayload.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$TypingStartedIndicatorPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "id", "", "timestamp", "", "<init>", "(Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "setEntryType", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class TypingStartedIndicatorPayload implements EntryPayload {
        private ConversationEntryType entryType;
        private final String id;
        private final long timestamp;

        public TypingStartedIndicatorPayload(String id, long j) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.timestamp = j;
            this.entryType = ConversationEntryType.TypingStartedIndicator;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public ConversationEntryType getEntryType() {
            return this.entryType;
        }

        public void setEntryType(ConversationEntryType conversationEntryType) {
            Intrinsics.checkNotNullParameter(conversationEntryType, "<set-?>");
            this.entryType = conversationEntryType;
        }
    }

    /* compiled from: EntryPayload.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$TypingStoppedIndicatorPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "id", "", "timestamp", "", "<init>", "(Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "setEntryType", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class TypingStoppedIndicatorPayload implements EntryPayload {
        private ConversationEntryType entryType;
        private final String id;
        private final long timestamp;

        public TypingStoppedIndicatorPayload(String id, long j) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.timestamp = j;
            this.entryType = ConversationEntryType.TypingStoppedIndicator;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public ConversationEntryType getEntryType() {
            return this.entryType;
        }

        public void setEntryType(ConversationEntryType conversationEntryType) {
            Intrinsics.checkNotNullParameter(conversationEntryType, "<set-?>");
            this.entryType = conversationEntryType;
        }
    }

    /* compiled from: EntryPayload.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$ProgressIndicatorPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "id", "", "progressIndicator", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/progressIndicators/ProgressIndicator;", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/progressIndicators/ProgressIndicator;)V", "getId", "()Ljava/lang/String;", "getProgressIndicator", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/progressIndicators/ProgressIndicator;", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ProgressIndicatorPayload implements EntryPayload {
        private final ConversationEntryType entryType;
        private final String id;
        private final ProgressIndicator progressIndicator;

        public ProgressIndicatorPayload(String id, ProgressIndicator progressIndicator) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(progressIndicator, "progressIndicator");
            this.id = id;
            this.progressIndicator = progressIndicator;
            this.entryType = ConversationEntryType.ProgressIndicator;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        public final ProgressIndicator getProgressIndicator() {
            return this.progressIndicator;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public ConversationEntryType getEntryType() {
            return this.entryType;
        }
    }

    /* compiled from: EntryPayload.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$StreamingTokenPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "id", "", "streamingToken", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingToken;", "relatedStreamingTokens", "", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingToken;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getStreamingToken", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingToken;", "getRelatedStreamingTokens", "()Ljava/util/List;", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "setEntryType", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;)V", "text", "getText$annotations", "()V", "getText", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class StreamingTokenPayload implements EntryPayload {
        private ConversationEntryType entryType;
        private final String id;
        private final transient List<StreamingToken> relatedStreamingTokens;
        private final StreamingToken streamingToken;

        @Json(ignore = true)
        public static /* synthetic */ void getText$annotations() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StreamingTokenPayload(String id, StreamingToken streamingToken, List<? extends StreamingToken> list) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(streamingToken, "streamingToken");
            this.id = id;
            this.streamingToken = streamingToken;
            this.relatedStreamingTokens = list;
            this.entryType = ConversationEntryType.StreamingToken;
        }

        public /* synthetic */ StreamingTokenPayload(String str, StreamingToken streamingToken, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, streamingToken, (i & 4) != 0 ? null : list);
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        public final StreamingToken getStreamingToken() {
            return this.streamingToken;
        }

        public final List<StreamingToken> getRelatedStreamingTokens() {
            return this.relatedStreamingTokens;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public ConversationEntryType getEntryType() {
            return this.entryType;
        }

        public void setEntryType(ConversationEntryType conversationEntryType) {
            Intrinsics.checkNotNullParameter(conversationEntryType, "<set-?>");
            this.entryType = conversationEntryType;
        }

        public final String getText() {
            List listSortedWith;
            StreamingTokenValidationResult result;
            List<StreamingToken> list = this.relatedStreamingTokens;
            if (list == null || (listSortedWith = CollectionsKt.sortedWith(list, new Comparator() { // from class: com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload$StreamingTokenPayload$special$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((StreamingToken) t).getSequenceNumber()), Integer.valueOf(((StreamingToken) t2).getSequenceNumber()));
                }
            })) == null) {
                return null;
            }
            List list2 = listSortedWith;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof StreamingToken.StreamingTokenValidation) {
                    arrayList.add(obj);
                }
            }
            StreamingToken.StreamingTokenValidation streamingTokenValidation = (StreamingToken.StreamingTokenValidation) CollectionsKt.firstOrNull((List) arrayList);
            if (Intrinsics.areEqual((streamingTokenValidation == null || (result = streamingTokenValidation.getResult()) == null) ? null : Boolean.valueOf(result.getValid()), Boolean.FALSE)) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof StreamingToken.MessageStreamingToken) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                StreamingTokenMessageFormat token = ((StreamingToken.MessageStreamingToken) it.next()).getToken();
                StreamingTokenMessageFormat.StreamingTextFormat streamingTextFormat = token instanceof StreamingTokenMessageFormat.StreamingTextFormat ? (StreamingTokenMessageFormat.StreamingTextFormat) token : null;
                String text = streamingTextFormat != null ? streamingTextFormat.getText() : null;
                if (text != null) {
                    arrayList3.add(text);
                }
            }
            return CollectionsKt.joinToString$default(arrayList3, "", null, null, 0, null, null, 62, null);
        }
    }

    /* compiled from: EntryPayload.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$ParticipantChangedPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "id", "", "entries", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/entries/ParticipantChangedEntry;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getEntries", "()Ljava/util/List;", "setEntries", "(Ljava/util/List;)V", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "setEntryType", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ParticipantChangedPayload implements EntryPayload {
        private List<ParticipantChangedEntry> entries;
        private ConversationEntryType entryType;
        private final String id;

        public ParticipantChangedPayload(String id, List<ParticipantChangedEntry> entries) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(entries, "entries");
            this.id = id;
            this.entries = entries;
            this.entryType = ConversationEntryType.ParticipantChanged;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        public final List<ParticipantChangedEntry> getEntries() {
            return this.entries;
        }

        public final void setEntries(List<ParticipantChangedEntry> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.entries = list;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public ConversationEntryType getEntryType() {
            return this.entryType;
        }

        public void setEntryType(ConversationEntryType conversationEntryType) {
            Intrinsics.checkNotNullParameter(conversationEntryType, "<set-?>");
            this.entryType = conversationEntryType;
        }
    }

    /* compiled from: EntryPayload.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$RoutingResultPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "id", "", "recordId", "failureType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/routing/RoutingFailureType;", "routingType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/RoutingType;", "failureReason", "estimatedWaitTime", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/routing/EstimatedWaitTime;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/routing/RoutingFailureType;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/RoutingType;Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/routing/EstimatedWaitTime;)V", "getId", "()Ljava/lang/String;", "getRecordId", "getFailureType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/routing/RoutingFailureType;", "getRoutingType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/RoutingType;", "getFailureReason", "getEstimatedWaitTime", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/routing/EstimatedWaitTime;", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "setEntryType", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;)V", "isEwtAvailable", "", "()Z", "setEwtAvailable", "(Z)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class RoutingResultPayload implements EntryPayload {
        private ConversationEntryType entryType;
        private final EstimatedWaitTime estimatedWaitTime;
        private final String failureReason;
        private final RoutingFailureType failureType;
        private final String id;
        private boolean isEwtAvailable;
        private final String recordId;
        private final RoutingType routingType;

        public RoutingResultPayload(String id, String str, RoutingFailureType failureType, RoutingType routingType, String str2, EstimatedWaitTime estimatedWaitTime) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(failureType, "failureType");
            Intrinsics.checkNotNullParameter(routingType, "routingType");
            this.id = id;
            this.recordId = str;
            this.failureType = failureType;
            this.routingType = routingType;
            this.failureReason = str2;
            this.estimatedWaitTime = estimatedWaitTime;
            this.entryType = ConversationEntryType.RoutingResult;
            boolean z = false;
            if ((estimatedWaitTime != null ? Intrinsics.areEqual(estimatedWaitTime.isEWTRequested(), Boolean.TRUE) : false) && estimatedWaitTime.getEstimatedWaitTimeInSeconds() != null && estimatedWaitTime.getEstimatedWaitTimeInSeconds().intValue() >= 0) {
                z = true;
            }
            this.isEwtAvailable = z;
        }

        public /* synthetic */ RoutingResultPayload(String str, String str2, RoutingFailureType routingFailureType, RoutingType routingType, String str3, EstimatedWaitTime estimatedWaitTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, routingFailureType, routingType, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : estimatedWaitTime);
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        public final String getRecordId() {
            return this.recordId;
        }

        public final RoutingFailureType getFailureType() {
            return this.failureType;
        }

        public final RoutingType getRoutingType() {
            return this.routingType;
        }

        public final String getFailureReason() {
            return this.failureReason;
        }

        public final EstimatedWaitTime getEstimatedWaitTime() {
            return this.estimatedWaitTime;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public ConversationEntryType getEntryType() {
            return this.entryType;
        }

        public void setEntryType(ConversationEntryType conversationEntryType) {
            Intrinsics.checkNotNullParameter(conversationEntryType, "<set-?>");
            this.entryType = conversationEntryType;
        }

        /* renamed from: isEwtAvailable, reason: from getter */
        public final boolean getIsEwtAvailable() {
            return this.isEwtAvailable;
        }

        public final void setEwtAvailable(boolean z) {
            this.isEwtAvailable = z;
        }
    }

    /* compiled from: EntryPayload.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$RoutingWorkResultPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "id", "", "workType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/routing/RoutingWorkType;", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/routing/RoutingWorkType;)V", "getId", "()Ljava/lang/String;", "getWorkType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/routing/RoutingWorkType;", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "setEntryType", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class RoutingWorkResultPayload implements EntryPayload {
        private ConversationEntryType entryType;
        private final String id;
        private final RoutingWorkType workType;

        public RoutingWorkResultPayload(String id, RoutingWorkType workType) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(workType, "workType");
            this.id = id;
            this.workType = workType;
            this.entryType = ConversationEntryType.RoutingWorkResult;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        public final RoutingWorkType getWorkType() {
            return this.workType;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public ConversationEntryType getEntryType() {
            return this.entryType;
        }

        public void setEntryType(ConversationEntryType conversationEntryType) {
            Intrinsics.checkNotNullParameter(conversationEntryType, "<set-?>");
            this.entryType = conversationEntryType;
        }
    }

    /* compiled from: EntryPayload.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$AcknowledgeDeliveryPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "id", "", "acknowledgedConversationEntryIdentifier", "acknowledgementTimestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getAcknowledgedConversationEntryIdentifier", "getAcknowledgementTimestamp", "()J", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "setEntryType", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class AcknowledgeDeliveryPayload implements EntryPayload {
        private final String acknowledgedConversationEntryIdentifier;
        private final long acknowledgementTimestamp;
        private ConversationEntryType entryType;
        private final String id;

        public AcknowledgeDeliveryPayload(String id, String acknowledgedConversationEntryIdentifier, long j) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(acknowledgedConversationEntryIdentifier, "acknowledgedConversationEntryIdentifier");
            this.id = id;
            this.acknowledgedConversationEntryIdentifier = acknowledgedConversationEntryIdentifier;
            this.acknowledgementTimestamp = j;
            this.entryType = ConversationEntryType.DeliveryAcknowledgement;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        public final String getAcknowledgedConversationEntryIdentifier() {
            return this.acknowledgedConversationEntryIdentifier;
        }

        public final long getAcknowledgementTimestamp() {
            return this.acknowledgementTimestamp;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public ConversationEntryType getEntryType() {
            return this.entryType;
        }

        public void setEntryType(ConversationEntryType conversationEntryType) {
            Intrinsics.checkNotNullParameter(conversationEntryType, "<set-?>");
            this.entryType = conversationEntryType;
        }
    }

    /* compiled from: EntryPayload.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$AcknowledgeReadPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "id", "", "acknowledgedConversationEntryIdentifier", "acknowledgementTimestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getAcknowledgedConversationEntryIdentifier", "getAcknowledgementTimestamp", "()J", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "setEntryType", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class AcknowledgeReadPayload implements EntryPayload {
        private final String acknowledgedConversationEntryIdentifier;
        private final long acknowledgementTimestamp;
        private ConversationEntryType entryType;
        private final String id;

        public AcknowledgeReadPayload(String id, String acknowledgedConversationEntryIdentifier, long j) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(acknowledgedConversationEntryIdentifier, "acknowledgedConversationEntryIdentifier");
            this.id = id;
            this.acknowledgedConversationEntryIdentifier = acknowledgedConversationEntryIdentifier;
            this.acknowledgementTimestamp = j;
            this.entryType = ConversationEntryType.ReadAcknowledgement;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        public final String getAcknowledgedConversationEntryIdentifier() {
            return this.acknowledgedConversationEntryIdentifier;
        }

        public final long getAcknowledgementTimestamp() {
            return this.acknowledgementTimestamp;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public ConversationEntryType getEntryType() {
            return this.entryType;
        }

        public void setEntryType(ConversationEntryType conversationEntryType) {
            Intrinsics.checkNotNullParameter(conversationEntryType, "<set-?>");
            this.entryType = conversationEntryType;
        }
    }

    /* compiled from: EntryPayload.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$UnknownEntryPayload;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "setEntryType", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class UnknownEntryPayload implements EntryPayload {
        private transient ConversationEntryType entryType;
        private final String id;

        public UnknownEntryPayload(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.entryType = ConversationEntryType.UnknownEntry;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public String getId() {
            return this.id;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload
        public ConversationEntryType getEntryType() {
            return this.entryType;
        }

        public void setEntryType(ConversationEntryType conversationEntryType) {
            Intrinsics.checkNotNullParameter(conversationEntryType, "<set-?>");
            this.entryType = conversationEntryType;
        }
    }
}
