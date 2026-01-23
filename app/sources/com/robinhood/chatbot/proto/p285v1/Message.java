package com.robinhood.chatbot.proto.p285v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: Message.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b,\u0018\u0000 S2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001SB«\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0017¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010,J±\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010,R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b1\u0010,R\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u00104R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u00107R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010M\u001a\u0004\bN\u0010OR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010P\u001a\u0004\bQ\u0010R¨\u0006T"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/Message;", "Lcom/squareup/wire/Message;", "", "", "id", "conversation_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "Lcom/robinhood/chatbot/proto/v1/SenderType;", "sender", "Lcom/robinhood/chatbot/proto/v1/MessageType;", "type", "Lcom/robinhood/chatbot/proto/v1/TextMessageAttributes;", "text_message_attributes", "Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributes;", "action_message_attributes", "Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributes;", "disclaimer_message_attributes", "Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributes;", "link_message_attributes", "Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributes;", "markdown_message_attributes", "Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributes;", "info_message_attributes", "Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributes;", "selection_message_attributes", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributes;", "media_message_attributes", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/chatbot/proto/v1/SenderType;Lcom/robinhood/chatbot/proto/v1/MessageType;Lcom/robinhood/chatbot/proto/v1/TextMessageAttributes;Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributes;Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributes;Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributes;Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributes;Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributes;Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributes;Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributes;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/chatbot/proto/v1/SenderType;Lcom/robinhood/chatbot/proto/v1/MessageType;Lcom/robinhood/chatbot/proto/v1/TextMessageAttributes;Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributes;Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributes;Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributes;Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributes;Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributes;Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributes;Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributes;Lokio/ByteString;)Lcom/robinhood/chatbot/proto/v1/Message;", "Ljava/lang/String;", "getId", "getConversation_id", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "Lcom/robinhood/chatbot/proto/v1/SenderType;", "getSender", "()Lcom/robinhood/chatbot/proto/v1/SenderType;", "Lcom/robinhood/chatbot/proto/v1/MessageType;", "getType", "()Lcom/robinhood/chatbot/proto/v1/MessageType;", "Lcom/robinhood/chatbot/proto/v1/TextMessageAttributes;", "getText_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/TextMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributes;", "getAction_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributes;", "getDisclaimer_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributes;", "getLink_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributes;", "getMarkdown_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributes;", "getInfo_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributes;", "getSelection_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributes;", "getMedia_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributes;", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class Message extends com.squareup.wire.Message {

    @JvmField
    public static final ProtoAdapter<Message> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.ActionMessageAttributes#ADAPTER", jsonName = "actionMessageAttributes", oneofName = "attributes", schemaIndex = 6, tag = 21)
    private final ActionMessageAttributes action_message_attributes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "conversationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String conversation_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant created_at;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.DisclaimerMessageAttributes#ADAPTER", jsonName = "disclaimerMessageAttributes", oneofName = "attributes", schemaIndex = 7, tag = 22)
    private final DisclaimerMessageAttributes disclaimer_message_attributes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.InfoMessageAttributes#ADAPTER", jsonName = "infoMessageAttributes", oneofName = "attributes", schemaIndex = 10, tag = 25)
    private final InfoMessageAttributes info_message_attributes;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.LinkMessageAttributes#ADAPTER", jsonName = "linkMessageAttributes", oneofName = "attributes", schemaIndex = 8, tag = 23)
    private final LinkMessageAttributes link_message_attributes;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.MarkdownMessageAttributes#ADAPTER", jsonName = "markdownMessageAttributes", oneofName = "attributes", schemaIndex = 9, tag = 24)
    private final MarkdownMessageAttributes markdown_message_attributes;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.MediaMessageAttributes#ADAPTER", jsonName = "mediaMessageAttributes", oneofName = "attributes", schemaIndex = 12, tag = 27)
    private final MediaMessageAttributes media_message_attributes;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.SelectionMessageAttributes#ADAPTER", jsonName = "selectionMessageAttributes", oneofName = "attributes", schemaIndex = 11, tag = 26)
    private final SelectionMessageAttributes selection_message_attributes;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.SenderType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final SenderType sender;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.TextMessageAttributes#ADAPTER", jsonName = "textMessageAttributes", oneofName = "attributes", schemaIndex = 5, tag = 20)
    private final TextMessageAttributes text_message_attributes;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.MessageType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final MessageType type;

    public Message() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public /* synthetic */ Message(String str, String str2, Instant instant, SenderType senderType, MessageType messageType, TextMessageAttributes textMessageAttributes, ActionMessageAttributes actionMessageAttributes, DisclaimerMessageAttributes disclaimerMessageAttributes, LinkMessageAttributes linkMessageAttributes, MarkdownMessageAttributes markdownMessageAttributes, InfoMessageAttributes infoMessageAttributes, SelectionMessageAttributes selectionMessageAttributes, MediaMessageAttributes mediaMessageAttributes, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : instant, (i & 8) != 0 ? SenderType.SENDER_TYPE_UNSPECIFIED : senderType, (i & 16) != 0 ? MessageType.MESSAGE_TYPE_UNSPECIFIED : messageType, (i & 32) != 0 ? null : textMessageAttributes, (i & 64) != 0 ? null : actionMessageAttributes, (i & 128) != 0 ? null : disclaimerMessageAttributes, (i & 256) != 0 ? null : linkMessageAttributes, (i & 512) != 0 ? null : markdownMessageAttributes, (i & 1024) != 0 ? null : infoMessageAttributes, (i & 2048) != 0 ? null : selectionMessageAttributes, (i & 4096) == 0 ? mediaMessageAttributes : null, (i & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20522newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getConversation_id() {
        return this.conversation_id;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final SenderType getSender() {
        return this.sender;
    }

    public final MessageType getType() {
        return this.type;
    }

    public final TextMessageAttributes getText_message_attributes() {
        return this.text_message_attributes;
    }

    public final ActionMessageAttributes getAction_message_attributes() {
        return this.action_message_attributes;
    }

    public final DisclaimerMessageAttributes getDisclaimer_message_attributes() {
        return this.disclaimer_message_attributes;
    }

    public final LinkMessageAttributes getLink_message_attributes() {
        return this.link_message_attributes;
    }

    public final MarkdownMessageAttributes getMarkdown_message_attributes() {
        return this.markdown_message_attributes;
    }

    public final InfoMessageAttributes getInfo_message_attributes() {
        return this.info_message_attributes;
    }

    public final SelectionMessageAttributes getSelection_message_attributes() {
        return this.selection_message_attributes;
    }

    public final MediaMessageAttributes getMedia_message_attributes() {
        return this.media_message_attributes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Message(String id, String conversation_id, Instant instant, SenderType sender, MessageType type2, TextMessageAttributes textMessageAttributes, ActionMessageAttributes actionMessageAttributes, DisclaimerMessageAttributes disclaimerMessageAttributes, LinkMessageAttributes linkMessageAttributes, MarkdownMessageAttributes markdownMessageAttributes, InfoMessageAttributes infoMessageAttributes, SelectionMessageAttributes selectionMessageAttributes, MediaMessageAttributes mediaMessageAttributes, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.conversation_id = conversation_id;
        this.created_at = instant;
        this.sender = sender;
        this.type = type2;
        this.text_message_attributes = textMessageAttributes;
        this.action_message_attributes = actionMessageAttributes;
        this.disclaimer_message_attributes = disclaimerMessageAttributes;
        this.link_message_attributes = linkMessageAttributes;
        this.markdown_message_attributes = markdownMessageAttributes;
        this.info_message_attributes = infoMessageAttributes;
        this.selection_message_attributes = selectionMessageAttributes;
        this.media_message_attributes = mediaMessageAttributes;
        if (Internal.countNonNull(textMessageAttributes, actionMessageAttributes, disclaimerMessageAttributes, linkMessageAttributes, markdownMessageAttributes, infoMessageAttributes, selectionMessageAttributes, mediaMessageAttributes) > 1) {
            throw new IllegalArgumentException("At most one of text_message_attributes, action_message_attributes, disclaimer_message_attributes, link_message_attributes, markdown_message_attributes, info_message_attributes, selection_message_attributes, media_message_attributes may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20522newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        return Intrinsics.areEqual(unknownFields(), message.unknownFields()) && Intrinsics.areEqual(this.id, message.id) && Intrinsics.areEqual(this.conversation_id, message.conversation_id) && Intrinsics.areEqual(this.created_at, message.created_at) && this.sender == message.sender && this.type == message.type && Intrinsics.areEqual(this.text_message_attributes, message.text_message_attributes) && Intrinsics.areEqual(this.action_message_attributes, message.action_message_attributes) && Intrinsics.areEqual(this.disclaimer_message_attributes, message.disclaimer_message_attributes) && Intrinsics.areEqual(this.link_message_attributes, message.link_message_attributes) && Intrinsics.areEqual(this.markdown_message_attributes, message.markdown_message_attributes) && Intrinsics.areEqual(this.info_message_attributes, message.info_message_attributes) && Intrinsics.areEqual(this.selection_message_attributes, message.selection_message_attributes) && Intrinsics.areEqual(this.media_message_attributes, message.media_message_attributes);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.conversation_id.hashCode()) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = (((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.sender.hashCode()) * 37) + this.type.hashCode()) * 37;
        TextMessageAttributes textMessageAttributes = this.text_message_attributes;
        int iHashCode3 = (iHashCode2 + (textMessageAttributes != null ? textMessageAttributes.hashCode() : 0)) * 37;
        ActionMessageAttributes actionMessageAttributes = this.action_message_attributes;
        int iHashCode4 = (iHashCode3 + (actionMessageAttributes != null ? actionMessageAttributes.hashCode() : 0)) * 37;
        DisclaimerMessageAttributes disclaimerMessageAttributes = this.disclaimer_message_attributes;
        int iHashCode5 = (iHashCode4 + (disclaimerMessageAttributes != null ? disclaimerMessageAttributes.hashCode() : 0)) * 37;
        LinkMessageAttributes linkMessageAttributes = this.link_message_attributes;
        int iHashCode6 = (iHashCode5 + (linkMessageAttributes != null ? linkMessageAttributes.hashCode() : 0)) * 37;
        MarkdownMessageAttributes markdownMessageAttributes = this.markdown_message_attributes;
        int iHashCode7 = (iHashCode6 + (markdownMessageAttributes != null ? markdownMessageAttributes.hashCode() : 0)) * 37;
        InfoMessageAttributes infoMessageAttributes = this.info_message_attributes;
        int iHashCode8 = (iHashCode7 + (infoMessageAttributes != null ? infoMessageAttributes.hashCode() : 0)) * 37;
        SelectionMessageAttributes selectionMessageAttributes = this.selection_message_attributes;
        int iHashCode9 = (iHashCode8 + (selectionMessageAttributes != null ? selectionMessageAttributes.hashCode() : 0)) * 37;
        MediaMessageAttributes mediaMessageAttributes = this.media_message_attributes;
        int iHashCode10 = iHashCode9 + (mediaMessageAttributes != null ? mediaMessageAttributes.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("conversation_id=" + Internal.sanitize(this.conversation_id));
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        arrayList.add("sender=" + this.sender);
        arrayList.add("type=" + this.type);
        TextMessageAttributes textMessageAttributes = this.text_message_attributes;
        if (textMessageAttributes != null) {
            arrayList.add("text_message_attributes=" + textMessageAttributes);
        }
        ActionMessageAttributes actionMessageAttributes = this.action_message_attributes;
        if (actionMessageAttributes != null) {
            arrayList.add("action_message_attributes=" + actionMessageAttributes);
        }
        DisclaimerMessageAttributes disclaimerMessageAttributes = this.disclaimer_message_attributes;
        if (disclaimerMessageAttributes != null) {
            arrayList.add("disclaimer_message_attributes=" + disclaimerMessageAttributes);
        }
        LinkMessageAttributes linkMessageAttributes = this.link_message_attributes;
        if (linkMessageAttributes != null) {
            arrayList.add("link_message_attributes=" + linkMessageAttributes);
        }
        MarkdownMessageAttributes markdownMessageAttributes = this.markdown_message_attributes;
        if (markdownMessageAttributes != null) {
            arrayList.add("markdown_message_attributes=" + markdownMessageAttributes);
        }
        InfoMessageAttributes infoMessageAttributes = this.info_message_attributes;
        if (infoMessageAttributes != null) {
            arrayList.add("info_message_attributes=" + infoMessageAttributes);
        }
        SelectionMessageAttributes selectionMessageAttributes = this.selection_message_attributes;
        if (selectionMessageAttributes != null) {
            arrayList.add("selection_message_attributes=" + selectionMessageAttributes);
        }
        MediaMessageAttributes mediaMessageAttributes = this.media_message_attributes;
        if (mediaMessageAttributes != null) {
            arrayList.add("media_message_attributes=" + mediaMessageAttributes);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Message{", "}", 0, null, null, 56, null);
    }

    public final Message copy(String id, String conversation_id, Instant created_at, SenderType sender, MessageType type2, TextMessageAttributes text_message_attributes, ActionMessageAttributes action_message_attributes, DisclaimerMessageAttributes disclaimer_message_attributes, LinkMessageAttributes link_message_attributes, MarkdownMessageAttributes markdown_message_attributes, InfoMessageAttributes info_message_attributes, SelectionMessageAttributes selection_message_attributes, MediaMessageAttributes media_message_attributes, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Message(id, conversation_id, created_at, sender, type2, text_message_attributes, action_message_attributes, disclaimer_message_attributes, link_message_attributes, markdown_message_attributes, info_message_attributes, selection_message_attributes, media_message_attributes, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Message.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Message>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.Message$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Message value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getConversation_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getConversation_id());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getCreated_at());
                }
                if (value.getSender() != SenderType.SENDER_TYPE_UNSPECIFIED) {
                    size += SenderType.ADAPTER.encodedSizeWithTag(4, value.getSender());
                }
                if (value.getType() != MessageType.MESSAGE_TYPE_UNSPECIFIED) {
                    size += MessageType.ADAPTER.encodedSizeWithTag(5, value.getType());
                }
                return size + TextMessageAttributes.ADAPTER.encodedSizeWithTag(20, value.getText_message_attributes()) + ActionMessageAttributes.ADAPTER.encodedSizeWithTag(21, value.getAction_message_attributes()) + DisclaimerMessageAttributes.ADAPTER.encodedSizeWithTag(22, value.getDisclaimer_message_attributes()) + LinkMessageAttributes.ADAPTER.encodedSizeWithTag(23, value.getLink_message_attributes()) + MarkdownMessageAttributes.ADAPTER.encodedSizeWithTag(24, value.getMarkdown_message_attributes()) + InfoMessageAttributes.ADAPTER.encodedSizeWithTag(25, value.getInfo_message_attributes()) + SelectionMessageAttributes.ADAPTER.encodedSizeWithTag(26, value.getSelection_message_attributes()) + MediaMessageAttributes.ADAPTER.encodedSizeWithTag(27, value.getMedia_message_attributes());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Message value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getConversation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getConversation_id());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getCreated_at());
                }
                if (value.getSender() != SenderType.SENDER_TYPE_UNSPECIFIED) {
                    SenderType.ADAPTER.encodeWithTag(writer, 4, (int) value.getSender());
                }
                if (value.getType() != MessageType.MESSAGE_TYPE_UNSPECIFIED) {
                    MessageType.ADAPTER.encodeWithTag(writer, 5, (int) value.getType());
                }
                TextMessageAttributes.ADAPTER.encodeWithTag(writer, 20, (int) value.getText_message_attributes());
                ActionMessageAttributes.ADAPTER.encodeWithTag(writer, 21, (int) value.getAction_message_attributes());
                DisclaimerMessageAttributes.ADAPTER.encodeWithTag(writer, 22, (int) value.getDisclaimer_message_attributes());
                LinkMessageAttributes.ADAPTER.encodeWithTag(writer, 23, (int) value.getLink_message_attributes());
                MarkdownMessageAttributes.ADAPTER.encodeWithTag(writer, 24, (int) value.getMarkdown_message_attributes());
                InfoMessageAttributes.ADAPTER.encodeWithTag(writer, 25, (int) value.getInfo_message_attributes());
                SelectionMessageAttributes.ADAPTER.encodeWithTag(writer, 26, (int) value.getSelection_message_attributes());
                MediaMessageAttributes.ADAPTER.encodeWithTag(writer, 27, (int) value.getMedia_message_attributes());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Message value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                MediaMessageAttributes.ADAPTER.encodeWithTag(writer, 27, (int) value.getMedia_message_attributes());
                SelectionMessageAttributes.ADAPTER.encodeWithTag(writer, 26, (int) value.getSelection_message_attributes());
                InfoMessageAttributes.ADAPTER.encodeWithTag(writer, 25, (int) value.getInfo_message_attributes());
                MarkdownMessageAttributes.ADAPTER.encodeWithTag(writer, 24, (int) value.getMarkdown_message_attributes());
                LinkMessageAttributes.ADAPTER.encodeWithTag(writer, 23, (int) value.getLink_message_attributes());
                DisclaimerMessageAttributes.ADAPTER.encodeWithTag(writer, 22, (int) value.getDisclaimer_message_attributes());
                ActionMessageAttributes.ADAPTER.encodeWithTag(writer, 21, (int) value.getAction_message_attributes());
                TextMessageAttributes.ADAPTER.encodeWithTag(writer, 20, (int) value.getText_message_attributes());
                if (value.getType() != MessageType.MESSAGE_TYPE_UNSPECIFIED) {
                    MessageType.ADAPTER.encodeWithTag(writer, 5, (int) value.getType());
                }
                if (value.getSender() != SenderType.SENDER_TYPE_UNSPECIFIED) {
                    SenderType.ADAPTER.encodeWithTag(writer, 4, (int) value.getSender());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getConversation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getConversation_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Message decode(ProtoReader reader) throws IOException {
                MessageType messageType;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                SenderType senderType = SenderType.SENDER_TYPE_UNSPECIFIED;
                MessageType messageType2 = MessageType.MESSAGE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                SenderType senderTypeDecode = senderType;
                String strDecode = "";
                Instant instantDecode = null;
                TextMessageAttributes textMessageAttributesDecode = null;
                ActionMessageAttributes actionMessageAttributesDecode = null;
                DisclaimerMessageAttributes disclaimerMessageAttributesDecode = null;
                LinkMessageAttributes linkMessageAttributesDecode = null;
                MarkdownMessageAttributes markdownMessageAttributesDecode = null;
                InfoMessageAttributes infoMessageAttributesDecode = null;
                SelectionMessageAttributes selectionMessageAttributesDecode = null;
                MediaMessageAttributes mediaMessageAttributesDecode = null;
                MessageType messageTypeDecode = messageType2;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Message(strDecode2, strDecode, instantDecode, senderTypeDecode, messageTypeDecode, textMessageAttributesDecode, actionMessageAttributesDecode, disclaimerMessageAttributesDecode, linkMessageAttributesDecode, markdownMessageAttributesDecode, infoMessageAttributesDecode, selectionMessageAttributesDecode, mediaMessageAttributesDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 3) {
                        if (iNextTag == 4) {
                            messageType = messageTypeDecode;
                            str = strDecode2;
                            str2 = strDecode;
                            try {
                                senderTypeDecode = SenderType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 5) {
                            try {
                                messageTypeDecode = MessageType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                messageType = messageTypeDecode;
                                str = strDecode2;
                                str2 = strDecode;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else {
                            switch (iNextTag) {
                                case 20:
                                    textMessageAttributesDecode = TextMessageAttributes.ADAPTER.decode(reader);
                                    continue;
                                case 21:
                                    actionMessageAttributesDecode = ActionMessageAttributes.ADAPTER.decode(reader);
                                    continue;
                                case 22:
                                    disclaimerMessageAttributesDecode = DisclaimerMessageAttributes.ADAPTER.decode(reader);
                                    continue;
                                case 23:
                                    linkMessageAttributesDecode = LinkMessageAttributes.ADAPTER.decode(reader);
                                    continue;
                                case 24:
                                    markdownMessageAttributesDecode = MarkdownMessageAttributes.ADAPTER.decode(reader);
                                    continue;
                                case 25:
                                    infoMessageAttributesDecode = InfoMessageAttributes.ADAPTER.decode(reader);
                                    continue;
                                case 26:
                                    selectionMessageAttributesDecode = SelectionMessageAttributes.ADAPTER.decode(reader);
                                    continue;
                                case 27:
                                    mediaMessageAttributesDecode = MediaMessageAttributes.ADAPTER.decode(reader);
                                    continue;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    messageType = messageTypeDecode;
                                    str = strDecode2;
                                    str2 = strDecode;
                                    break;
                            }
                        }
                        messageTypeDecode = messageType;
                        strDecode2 = str;
                        strDecode = str2;
                    } else {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Message redact(Message value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                TextMessageAttributes text_message_attributes = value.getText_message_attributes();
                TextMessageAttributes textMessageAttributesRedact = text_message_attributes != null ? TextMessageAttributes.ADAPTER.redact(text_message_attributes) : null;
                ActionMessageAttributes action_message_attributes = value.getAction_message_attributes();
                ActionMessageAttributes actionMessageAttributesRedact = action_message_attributes != null ? ActionMessageAttributes.ADAPTER.redact(action_message_attributes) : null;
                DisclaimerMessageAttributes disclaimer_message_attributes = value.getDisclaimer_message_attributes();
                DisclaimerMessageAttributes disclaimerMessageAttributesRedact = disclaimer_message_attributes != null ? DisclaimerMessageAttributes.ADAPTER.redact(disclaimer_message_attributes) : null;
                LinkMessageAttributes link_message_attributes = value.getLink_message_attributes();
                LinkMessageAttributes linkMessageAttributesRedact = link_message_attributes != null ? LinkMessageAttributes.ADAPTER.redact(link_message_attributes) : null;
                MarkdownMessageAttributes markdown_message_attributes = value.getMarkdown_message_attributes();
                MarkdownMessageAttributes markdownMessageAttributesRedact = markdown_message_attributes != null ? MarkdownMessageAttributes.ADAPTER.redact(markdown_message_attributes) : null;
                InfoMessageAttributes info_message_attributes = value.getInfo_message_attributes();
                InfoMessageAttributes infoMessageAttributesRedact = info_message_attributes != null ? InfoMessageAttributes.ADAPTER.redact(info_message_attributes) : null;
                SelectionMessageAttributes selection_message_attributes = value.getSelection_message_attributes();
                SelectionMessageAttributes selectionMessageAttributesRedact = selection_message_attributes != null ? SelectionMessageAttributes.ADAPTER.redact(selection_message_attributes) : null;
                MediaMessageAttributes media_message_attributes = value.getMedia_message_attributes();
                return value.copy((27 & 1) != 0 ? value.id : null, (27 & 2) != 0 ? value.conversation_id : null, (27 & 4) != 0 ? value.created_at : instantRedact, (27 & 8) != 0 ? value.sender : null, (27 & 16) != 0 ? value.type : null, (27 & 32) != 0 ? value.text_message_attributes : textMessageAttributesRedact, (27 & 64) != 0 ? value.action_message_attributes : actionMessageAttributesRedact, (27 & 128) != 0 ? value.disclaimer_message_attributes : disclaimerMessageAttributesRedact, (27 & 256) != 0 ? value.link_message_attributes : linkMessageAttributesRedact, (27 & 512) != 0 ? value.markdown_message_attributes : markdownMessageAttributesRedact, (27 & 1024) != 0 ? value.info_message_attributes : infoMessageAttributesRedact, (27 & 2048) != 0 ? value.selection_message_attributes : selectionMessageAttributesRedact, (27 & 4096) != 0 ? value.media_message_attributes : media_message_attributes != null ? MediaMessageAttributes.ADAPTER.redact(media_message_attributes) : null, (27 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
