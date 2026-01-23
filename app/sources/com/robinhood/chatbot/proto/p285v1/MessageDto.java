package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.chatbot.proto.p285v1.ActionMessageAttributesDto;
import com.robinhood.chatbot.proto.p285v1.DisclaimerMessageAttributesDto;
import com.robinhood.chatbot.proto.p285v1.InfoMessageAttributesDto;
import com.robinhood.chatbot.proto.p285v1.LinkMessageAttributesDto;
import com.robinhood.chatbot.proto.p285v1.MarkdownMessageAttributesDto;
import com.robinhood.chatbot.proto.p285v1.MediaMessageAttributesDto;
import com.robinhood.chatbot.proto.p285v1.MessageTypeDto;
import com.robinhood.chatbot.proto.p285v1.SelectionMessageAttributesDto;
import com.robinhood.chatbot.proto.p285v1.SenderTypeDto;
import com.robinhood.chatbot.proto.p285v1.TextMessageAttributesDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: MessageDto.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 U2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005VUWXYB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0006\u0010\u0014JS\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0019\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u00108\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010<\u001a\u0004\u0018\u0001098F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0013\u0010@\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0013\u0010D\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010H\u001a\u0004\u0018\u00010E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0013\u0010L\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010P\u001a\u0004\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0013\u0010T\u001a\u0004\u0018\u00010Q8F¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/Message;", "Landroid/os/Parcelable;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/chatbot/proto/v1/MessageDto$Surrogate;)V", "", "id", "conversation_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "Lcom/robinhood/chatbot/proto/v1/SenderTypeDto;", "sender", "Lcom/robinhood/chatbot/proto/v1/MessageTypeDto;", "type", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto;", "attributes", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/chatbot/proto/v1/SenderTypeDto;Lcom/robinhood/chatbot/proto/v1/MessageTypeDto;Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/chatbot/proto/v1/SenderTypeDto;Lcom/robinhood/chatbot/proto/v1/MessageTypeDto;Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto;)Lcom/robinhood/chatbot/proto/v1/MessageDto;", "toProto", "()Lcom/robinhood/chatbot/proto/v1/Message;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/chatbot/proto/v1/MessageDto$Surrogate;", "getId", "getConversation_id", "getCreated_at", "()Lj$/time/Instant;", "getSender", "()Lcom/robinhood/chatbot/proto/v1/SenderTypeDto;", "getType", "()Lcom/robinhood/chatbot/proto/v1/MessageTypeDto;", "getAttributes", "()Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto;", "Lcom/robinhood/chatbot/proto/v1/TextMessageAttributesDto;", "getText_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/TextMessageAttributesDto;", "text_message_attributes", "Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;", "getAction_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;", "action_message_attributes", "Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributesDto;", "getDisclaimer_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributesDto;", "disclaimer_message_attributes", "Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributesDto;", "getLink_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributesDto;", "link_message_attributes", "Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributesDto;", "getMarkdown_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributesDto;", "markdown_message_attributes", "Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributesDto;", "getInfo_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributesDto;", "info_message_attributes", "Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributesDto;", "getSelection_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributesDto;", "selection_message_attributes", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;", "getMedia_message_attributes", "()Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;", "media_message_attributes", "Companion", "Surrogate", "AttributesDto", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public final class MessageDto implements Dto3<Message>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MessageDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MessageDto, Message>> binaryBase64Serializer$delegate;
    private static final MessageDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MessageDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MessageDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getConversation_id() {
        return this.surrogate.getConversation_id();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final SenderTypeDto getSender() {
        return this.surrogate.getSender();
    }

    public final MessageTypeDto getType() {
        return this.surrogate.getType();
    }

    public final AttributesDto getAttributes() {
        if (this.surrogate.getText_message_attributes() != null) {
            return new AttributesDto.TextMessageAttributes(this.surrogate.getText_message_attributes());
        }
        if (this.surrogate.getAction_message_attributes() != null) {
            return new AttributesDto.ActionMessageAttributes(this.surrogate.getAction_message_attributes());
        }
        if (this.surrogate.getDisclaimer_message_attributes() != null) {
            return new AttributesDto.DisclaimerMessageAttributes(this.surrogate.getDisclaimer_message_attributes());
        }
        if (this.surrogate.getLink_message_attributes() != null) {
            return new AttributesDto.LinkMessageAttributes(this.surrogate.getLink_message_attributes());
        }
        if (this.surrogate.getMarkdown_message_attributes() != null) {
            return new AttributesDto.MarkdownMessageAttributes(this.surrogate.getMarkdown_message_attributes());
        }
        if (this.surrogate.getInfo_message_attributes() != null) {
            return new AttributesDto.InfoMessageAttributes(this.surrogate.getInfo_message_attributes());
        }
        if (this.surrogate.getSelection_message_attributes() != null) {
            return new AttributesDto.SelectionMessageAttributes(this.surrogate.getSelection_message_attributes());
        }
        if (this.surrogate.getMedia_message_attributes() != null) {
            return new AttributesDto.MediaMessageAttributes(this.surrogate.getMedia_message_attributes());
        }
        return null;
    }

    public final TextMessageAttributesDto getText_message_attributes() {
        return this.surrogate.getText_message_attributes();
    }

    public final ActionMessageAttributesDto getAction_message_attributes() {
        return this.surrogate.getAction_message_attributes();
    }

    public final DisclaimerMessageAttributesDto getDisclaimer_message_attributes() {
        return this.surrogate.getDisclaimer_message_attributes();
    }

    public final LinkMessageAttributesDto getLink_message_attributes() {
        return this.surrogate.getLink_message_attributes();
    }

    public final MarkdownMessageAttributesDto getMarkdown_message_attributes() {
        return this.surrogate.getMarkdown_message_attributes();
    }

    public final InfoMessageAttributesDto getInfo_message_attributes() {
        return this.surrogate.getInfo_message_attributes();
    }

    public final SelectionMessageAttributesDto getSelection_message_attributes() {
        return this.surrogate.getSelection_message_attributes();
    }

    public final MediaMessageAttributesDto getMedia_message_attributes() {
        return this.surrogate.getMedia_message_attributes();
    }

    public /* synthetic */ MessageDto(String str, String str2, Instant instant, SenderTypeDto senderTypeDto, MessageTypeDto messageTypeDto, AttributesDto attributesDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? SenderTypeDto.INSTANCE.getZeroValue() : senderTypeDto, (i & 16) != 0 ? MessageTypeDto.INSTANCE.getZeroValue() : messageTypeDto, (i & 32) != 0 ? null : attributesDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageDto(String id, String conversation_id, Instant instant, SenderTypeDto sender, MessageTypeDto type2, AttributesDto attributesDto) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(type2, "type");
        AttributesDto.TextMessageAttributes textMessageAttributes = attributesDto instanceof AttributesDto.TextMessageAttributes ? (AttributesDto.TextMessageAttributes) attributesDto : null;
        TextMessageAttributesDto value = textMessageAttributes != null ? textMessageAttributes.getValue() : null;
        AttributesDto.ActionMessageAttributes actionMessageAttributes = attributesDto instanceof AttributesDto.ActionMessageAttributes ? (AttributesDto.ActionMessageAttributes) attributesDto : null;
        ActionMessageAttributesDto value2 = actionMessageAttributes != null ? actionMessageAttributes.getValue() : null;
        AttributesDto.DisclaimerMessageAttributes disclaimerMessageAttributes = attributesDto instanceof AttributesDto.DisclaimerMessageAttributes ? (AttributesDto.DisclaimerMessageAttributes) attributesDto : null;
        DisclaimerMessageAttributesDto value3 = disclaimerMessageAttributes != null ? disclaimerMessageAttributes.getValue() : null;
        AttributesDto.LinkMessageAttributes linkMessageAttributes = attributesDto instanceof AttributesDto.LinkMessageAttributes ? (AttributesDto.LinkMessageAttributes) attributesDto : null;
        LinkMessageAttributesDto value4 = linkMessageAttributes != null ? linkMessageAttributes.getValue() : null;
        AttributesDto.MarkdownMessageAttributes markdownMessageAttributes = attributesDto instanceof AttributesDto.MarkdownMessageAttributes ? (AttributesDto.MarkdownMessageAttributes) attributesDto : null;
        MarkdownMessageAttributesDto value5 = markdownMessageAttributes != null ? markdownMessageAttributes.getValue() : null;
        AttributesDto.InfoMessageAttributes infoMessageAttributes = attributesDto instanceof AttributesDto.InfoMessageAttributes ? (AttributesDto.InfoMessageAttributes) attributesDto : null;
        InfoMessageAttributesDto value6 = infoMessageAttributes != null ? infoMessageAttributes.getValue() : null;
        AttributesDto.SelectionMessageAttributes selectionMessageAttributes = attributesDto instanceof AttributesDto.SelectionMessageAttributes ? (AttributesDto.SelectionMessageAttributes) attributesDto : null;
        SelectionMessageAttributesDto value7 = selectionMessageAttributes != null ? selectionMessageAttributes.getValue() : null;
        AttributesDto.MediaMessageAttributes mediaMessageAttributes = attributesDto instanceof AttributesDto.MediaMessageAttributes ? (AttributesDto.MediaMessageAttributes) attributesDto : null;
        this(new Surrogate(id, conversation_id, instant, sender, type2, value, value2, value3, value4, value5, value6, value7, mediaMessageAttributes != null ? mediaMessageAttributes.getValue() : null));
    }

    public static /* synthetic */ MessageDto copy$default(MessageDto messageDto, String str, String str2, Instant instant, SenderTypeDto senderTypeDto, MessageTypeDto messageTypeDto, AttributesDto attributesDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            str2 = messageDto.surrogate.getConversation_id();
        }
        if ((i & 4) != 0) {
            instant = messageDto.surrogate.getCreated_at();
        }
        if ((i & 8) != 0) {
            senderTypeDto = messageDto.surrogate.getSender();
        }
        if ((i & 16) != 0) {
            messageTypeDto = messageDto.surrogate.getType();
        }
        if ((i & 32) != 0) {
            attributesDto = messageDto.getAttributes();
        }
        MessageTypeDto messageTypeDto2 = messageTypeDto;
        AttributesDto attributesDto2 = attributesDto;
        return messageDto.copy(str, str2, instant, senderTypeDto, messageTypeDto2, attributesDto2);
    }

    public final MessageDto copy(String id, String conversation_id, Instant created_at, SenderTypeDto sender, MessageTypeDto type2, AttributesDto attributes) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(type2, "type");
        AttributesDto.TextMessageAttributes textMessageAttributes = attributes instanceof AttributesDto.TextMessageAttributes ? (AttributesDto.TextMessageAttributes) attributes : null;
        TextMessageAttributesDto value = textMessageAttributes != null ? textMessageAttributes.getValue() : null;
        AttributesDto.ActionMessageAttributes actionMessageAttributes = attributes instanceof AttributesDto.ActionMessageAttributes ? (AttributesDto.ActionMessageAttributes) attributes : null;
        ActionMessageAttributesDto value2 = actionMessageAttributes != null ? actionMessageAttributes.getValue() : null;
        AttributesDto.DisclaimerMessageAttributes disclaimerMessageAttributes = attributes instanceof AttributesDto.DisclaimerMessageAttributes ? (AttributesDto.DisclaimerMessageAttributes) attributes : null;
        DisclaimerMessageAttributesDto value3 = disclaimerMessageAttributes != null ? disclaimerMessageAttributes.getValue() : null;
        AttributesDto.LinkMessageAttributes linkMessageAttributes = attributes instanceof AttributesDto.LinkMessageAttributes ? (AttributesDto.LinkMessageAttributes) attributes : null;
        LinkMessageAttributesDto value4 = linkMessageAttributes != null ? linkMessageAttributes.getValue() : null;
        AttributesDto.MarkdownMessageAttributes markdownMessageAttributes = attributes instanceof AttributesDto.MarkdownMessageAttributes ? (AttributesDto.MarkdownMessageAttributes) attributes : null;
        MarkdownMessageAttributesDto value5 = markdownMessageAttributes != null ? markdownMessageAttributes.getValue() : null;
        AttributesDto.InfoMessageAttributes infoMessageAttributes = attributes instanceof AttributesDto.InfoMessageAttributes ? (AttributesDto.InfoMessageAttributes) attributes : null;
        InfoMessageAttributesDto value6 = infoMessageAttributes != null ? infoMessageAttributes.getValue() : null;
        AttributesDto.SelectionMessageAttributes selectionMessageAttributes = attributes instanceof AttributesDto.SelectionMessageAttributes ? (AttributesDto.SelectionMessageAttributes) attributes : null;
        SelectionMessageAttributesDto value7 = selectionMessageAttributes != null ? selectionMessageAttributes.getValue() : null;
        AttributesDto.MediaMessageAttributes mediaMessageAttributes = attributes instanceof AttributesDto.MediaMessageAttributes ? (AttributesDto.MediaMessageAttributes) attributes : null;
        return new MessageDto(new Surrogate(id, conversation_id, created_at, sender, type2, value, value2, value3, value4, value5, value6, value7, mediaMessageAttributes != null ? mediaMessageAttributes.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Message toProto() {
        String id = this.surrogate.getId();
        String conversation_id = this.surrogate.getConversation_id();
        Instant created_at = this.surrogate.getCreated_at();
        SenderType senderType = (SenderType) this.surrogate.getSender().toProto();
        MessageType messageType = (MessageType) this.surrogate.getType().toProto();
        TextMessageAttributesDto text_message_attributes = this.surrogate.getText_message_attributes();
        TextMessageAttributes proto = text_message_attributes != null ? text_message_attributes.toProto() : null;
        ActionMessageAttributesDto action_message_attributes = this.surrogate.getAction_message_attributes();
        ActionMessageAttributes proto2 = action_message_attributes != null ? action_message_attributes.toProto() : null;
        DisclaimerMessageAttributesDto disclaimer_message_attributes = this.surrogate.getDisclaimer_message_attributes();
        DisclaimerMessageAttributes proto3 = disclaimer_message_attributes != null ? disclaimer_message_attributes.toProto() : null;
        LinkMessageAttributesDto link_message_attributes = this.surrogate.getLink_message_attributes();
        LinkMessageAttributes proto4 = link_message_attributes != null ? link_message_attributes.toProto() : null;
        MarkdownMessageAttributesDto markdown_message_attributes = this.surrogate.getMarkdown_message_attributes();
        MarkdownMessageAttributes proto5 = markdown_message_attributes != null ? markdown_message_attributes.toProto() : null;
        InfoMessageAttributesDto info_message_attributes = this.surrogate.getInfo_message_attributes();
        InfoMessageAttributes proto6 = info_message_attributes != null ? info_message_attributes.toProto() : null;
        SelectionMessageAttributesDto selection_message_attributes = this.surrogate.getSelection_message_attributes();
        SelectionMessageAttributes proto7 = selection_message_attributes != null ? selection_message_attributes.toProto() : null;
        MediaMessageAttributesDto media_message_attributes = this.surrogate.getMedia_message_attributes();
        return new Message(id, conversation_id, created_at, senderType, messageType, proto, proto2, proto3, proto4, proto5, proto6, proto7, media_message_attributes != null ? media_message_attributes.toProto() : null, null, 8192, null);
    }

    public String toString() {
        return "[MessageDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MessageDto) && Intrinsics.areEqual(((MessageDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MessageDto.kt */
    @Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b,\b\u0083\b\u0018\u0000 x2\u00020\u0001:\u0002yxB¿\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 B\u009d\u0001\b\u0010\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u001f\u0010%J'\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u00100J6\u00102\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bF\u0010GJÈ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bJ\u00100J\u0010\u0010K\u001a\u00020!HÖ\u0001¢\u0006\u0004\bK\u0010LJ\u001a\u0010O\u001a\u00020N2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bO\u0010PR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010Q\u0012\u0004\bS\u0010T\u001a\u0004\bR\u00100R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010Q\u0012\u0004\bV\u0010T\u001a\u0004\bU\u00100RF\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010W\u0012\u0004\bY\u0010T\u001a\u0004\bX\u00103R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010Z\u0012\u0004\b\\\u0010T\u001a\u0004\b[\u00105R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010]\u0012\u0004\b_\u0010T\u001a\u0004\b^\u00107R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010`\u0012\u0004\bb\u0010T\u001a\u0004\ba\u00109R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010c\u0012\u0004\be\u0010T\u001a\u0004\bd\u0010;R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010f\u0012\u0004\bh\u0010T\u001a\u0004\bg\u0010=R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010i\u0012\u0004\bk\u0010T\u001a\u0004\bj\u0010?R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010l\u0012\u0004\bn\u0010T\u001a\u0004\bm\u0010AR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010o\u0012\u0004\bq\u0010T\u001a\u0004\bp\u0010CR\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010r\u0012\u0004\bt\u0010T\u001a\u0004\bs\u0010ER\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010u\u0012\u0004\bw\u0010T\u001a\u0004\bv\u0010G¨\u0006z"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$Surrogate;", "", "", "id", "conversation_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "Lcom/robinhood/chatbot/proto/v1/SenderTypeDto;", "sender", "Lcom/robinhood/chatbot/proto/v1/MessageTypeDto;", "type", "Lcom/robinhood/chatbot/proto/v1/TextMessageAttributesDto;", "text_message_attributes", "Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;", "action_message_attributes", "Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributesDto;", "disclaimer_message_attributes", "Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributesDto;", "link_message_attributes", "Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributesDto;", "markdown_message_attributes", "Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributesDto;", "info_message_attributes", "Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributesDto;", "selection_message_attributes", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;", "media_message_attributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/chatbot/proto/v1/SenderTypeDto;Lcom/robinhood/chatbot/proto/v1/MessageTypeDto;Lcom/robinhood/chatbot/proto/v1/TextMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/chatbot/proto/v1/SenderTypeDto;Lcom/robinhood/chatbot/proto/v1/MessageTypeDto;Lcom/robinhood/chatbot/proto/v1/TextMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$chatbot_v1_externalRelease", "(Lcom/robinhood/chatbot/proto/v1/MessageDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lj$/time/Instant;", "component4", "()Lcom/robinhood/chatbot/proto/v1/SenderTypeDto;", "component5", "()Lcom/robinhood/chatbot/proto/v1/MessageTypeDto;", "component6", "()Lcom/robinhood/chatbot/proto/v1/TextMessageAttributesDto;", "component7", "()Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;", "component8", "()Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributesDto;", "component9", "()Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributesDto;", "component10", "()Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributesDto;", "component11", "()Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributesDto;", "component12", "()Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributesDto;", "component13", "()Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/chatbot/proto/v1/SenderTypeDto;Lcom/robinhood/chatbot/proto/v1/MessageTypeDto;Lcom/robinhood/chatbot/proto/v1/TextMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributesDto;Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;)Lcom/robinhood/chatbot/proto/v1/MessageDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getConversation_id", "getConversation_id$annotations", "Lj$/time/Instant;", "getCreated_at", "getCreated_at$annotations", "Lcom/robinhood/chatbot/proto/v1/SenderTypeDto;", "getSender", "getSender$annotations", "Lcom/robinhood/chatbot/proto/v1/MessageTypeDto;", "getType", "getType$annotations", "Lcom/robinhood/chatbot/proto/v1/TextMessageAttributesDto;", "getText_message_attributes", "getText_message_attributes$annotations", "Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;", "getAction_message_attributes", "getAction_message_attributes$annotations", "Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributesDto;", "getDisclaimer_message_attributes", "getDisclaimer_message_attributes$annotations", "Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributesDto;", "getLink_message_attributes", "getLink_message_attributes$annotations", "Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributesDto;", "getMarkdown_message_attributes", "getMarkdown_message_attributes$annotations", "Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributesDto;", "getInfo_message_attributes", "getInfo_message_attributes$annotations", "Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributesDto;", "getSelection_message_attributes", "getSelection_message_attributes$annotations", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;", "getMedia_message_attributes", "getMedia_message_attributes$annotations", "Companion", "$serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ActionMessageAttributesDto action_message_attributes;
        private final String conversation_id;
        private final Instant created_at;
        private final DisclaimerMessageAttributesDto disclaimer_message_attributes;
        private final String id;
        private final InfoMessageAttributesDto info_message_attributes;
        private final LinkMessageAttributesDto link_message_attributes;
        private final MarkdownMessageAttributesDto markdown_message_attributes;
        private final MediaMessageAttributesDto media_message_attributes;
        private final SelectionMessageAttributesDto selection_message_attributes;
        private final SenderTypeDto sender;
        private final TextMessageAttributesDto text_message_attributes;
        private final MessageTypeDto type;

        public Surrogate() {
            this((String) null, (String) null, (Instant) null, (SenderTypeDto) null, (MessageTypeDto) null, (TextMessageAttributesDto) null, (ActionMessageAttributesDto) null, (DisclaimerMessageAttributesDto) null, (LinkMessageAttributesDto) null, (MarkdownMessageAttributesDto) null, (InfoMessageAttributesDto) null, (SelectionMessageAttributesDto) null, (MediaMessageAttributesDto) null, 8191, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, Instant instant, SenderTypeDto senderTypeDto, MessageTypeDto messageTypeDto, TextMessageAttributesDto textMessageAttributesDto, ActionMessageAttributesDto actionMessageAttributesDto, DisclaimerMessageAttributesDto disclaimerMessageAttributesDto, LinkMessageAttributesDto linkMessageAttributesDto, MarkdownMessageAttributesDto markdownMessageAttributesDto, InfoMessageAttributesDto infoMessageAttributesDto, SelectionMessageAttributesDto selectionMessageAttributesDto, MediaMessageAttributesDto mediaMessageAttributesDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            return surrogate.copy(str, (i & 2) != 0 ? surrogate.conversation_id : str2, (i & 4) != 0 ? surrogate.created_at : instant, (i & 8) != 0 ? surrogate.sender : senderTypeDto, (i & 16) != 0 ? surrogate.type : messageTypeDto, (i & 32) != 0 ? surrogate.text_message_attributes : textMessageAttributesDto, (i & 64) != 0 ? surrogate.action_message_attributes : actionMessageAttributesDto, (i & 128) != 0 ? surrogate.disclaimer_message_attributes : disclaimerMessageAttributesDto, (i & 256) != 0 ? surrogate.link_message_attributes : linkMessageAttributesDto, (i & 512) != 0 ? surrogate.markdown_message_attributes : markdownMessageAttributesDto, (i & 1024) != 0 ? surrogate.info_message_attributes : infoMessageAttributesDto, (i & 2048) != 0 ? surrogate.selection_message_attributes : selectionMessageAttributesDto, (i & 4096) != 0 ? surrogate.media_message_attributes : mediaMessageAttributesDto);
        }

        @SerialName("actionMessageAttributes")
        @JsonAnnotations2(names = {"action_message_attributes"})
        public static /* synthetic */ void getAction_message_attributes$annotations() {
        }

        @SerialName("conversationId")
        @JsonAnnotations2(names = {"conversation_id"})
        public static /* synthetic */ void getConversation_id$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("disclaimerMessageAttributes")
        @JsonAnnotations2(names = {"disclaimer_message_attributes"})
        public static /* synthetic */ void getDisclaimer_message_attributes$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("infoMessageAttributes")
        @JsonAnnotations2(names = {"info_message_attributes"})
        public static /* synthetic */ void getInfo_message_attributes$annotations() {
        }

        @SerialName("linkMessageAttributes")
        @JsonAnnotations2(names = {"link_message_attributes"})
        public static /* synthetic */ void getLink_message_attributes$annotations() {
        }

        @SerialName("markdownMessageAttributes")
        @JsonAnnotations2(names = {"markdown_message_attributes"})
        public static /* synthetic */ void getMarkdown_message_attributes$annotations() {
        }

        @SerialName("mediaMessageAttributes")
        @JsonAnnotations2(names = {"media_message_attributes"})
        public static /* synthetic */ void getMedia_message_attributes$annotations() {
        }

        @SerialName("selectionMessageAttributes")
        @JsonAnnotations2(names = {"selection_message_attributes"})
        public static /* synthetic */ void getSelection_message_attributes$annotations() {
        }

        @SerialName("sender")
        @JsonAnnotations2(names = {"sender"})
        public static /* synthetic */ void getSender$annotations() {
        }

        @SerialName("textMessageAttributes")
        @JsonAnnotations2(names = {"text_message_attributes"})
        public static /* synthetic */ void getText_message_attributes$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final MarkdownMessageAttributesDto getMarkdown_message_attributes() {
            return this.markdown_message_attributes;
        }

        /* renamed from: component11, reason: from getter */
        public final InfoMessageAttributesDto getInfo_message_attributes() {
            return this.info_message_attributes;
        }

        /* renamed from: component12, reason: from getter */
        public final SelectionMessageAttributesDto getSelection_message_attributes() {
            return this.selection_message_attributes;
        }

        /* renamed from: component13, reason: from getter */
        public final MediaMessageAttributesDto getMedia_message_attributes() {
            return this.media_message_attributes;
        }

        /* renamed from: component2, reason: from getter */
        public final String getConversation_id() {
            return this.conversation_id;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component4, reason: from getter */
        public final SenderTypeDto getSender() {
            return this.sender;
        }

        /* renamed from: component5, reason: from getter */
        public final MessageTypeDto getType() {
            return this.type;
        }

        /* renamed from: component6, reason: from getter */
        public final TextMessageAttributesDto getText_message_attributes() {
            return this.text_message_attributes;
        }

        /* renamed from: component7, reason: from getter */
        public final ActionMessageAttributesDto getAction_message_attributes() {
            return this.action_message_attributes;
        }

        /* renamed from: component8, reason: from getter */
        public final DisclaimerMessageAttributesDto getDisclaimer_message_attributes() {
            return this.disclaimer_message_attributes;
        }

        /* renamed from: component9, reason: from getter */
        public final LinkMessageAttributesDto getLink_message_attributes() {
            return this.link_message_attributes;
        }

        public final Surrogate copy(String id, String conversation_id, Instant created_at, SenderTypeDto sender, MessageTypeDto type2, TextMessageAttributesDto text_message_attributes, ActionMessageAttributesDto action_message_attributes, DisclaimerMessageAttributesDto disclaimer_message_attributes, LinkMessageAttributesDto link_message_attributes, MarkdownMessageAttributesDto markdown_message_attributes, InfoMessageAttributesDto info_message_attributes, SelectionMessageAttributesDto selection_message_attributes, MediaMessageAttributesDto media_message_attributes) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
            Intrinsics.checkNotNullParameter(sender, "sender");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new Surrogate(id, conversation_id, created_at, sender, type2, text_message_attributes, action_message_attributes, disclaimer_message_attributes, link_message_attributes, markdown_message_attributes, info_message_attributes, selection_message_attributes, media_message_attributes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.conversation_id, surrogate.conversation_id) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && this.sender == surrogate.sender && this.type == surrogate.type && Intrinsics.areEqual(this.text_message_attributes, surrogate.text_message_attributes) && Intrinsics.areEqual(this.action_message_attributes, surrogate.action_message_attributes) && Intrinsics.areEqual(this.disclaimer_message_attributes, surrogate.disclaimer_message_attributes) && Intrinsics.areEqual(this.link_message_attributes, surrogate.link_message_attributes) && Intrinsics.areEqual(this.markdown_message_attributes, surrogate.markdown_message_attributes) && Intrinsics.areEqual(this.info_message_attributes, surrogate.info_message_attributes) && Intrinsics.areEqual(this.selection_message_attributes, surrogate.selection_message_attributes) && Intrinsics.areEqual(this.media_message_attributes, surrogate.media_message_attributes);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.conversation_id.hashCode()) * 31;
            Instant instant = this.created_at;
            int iHashCode2 = (((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.sender.hashCode()) * 31) + this.type.hashCode()) * 31;
            TextMessageAttributesDto textMessageAttributesDto = this.text_message_attributes;
            int iHashCode3 = (iHashCode2 + (textMessageAttributesDto == null ? 0 : textMessageAttributesDto.hashCode())) * 31;
            ActionMessageAttributesDto actionMessageAttributesDto = this.action_message_attributes;
            int iHashCode4 = (iHashCode3 + (actionMessageAttributesDto == null ? 0 : actionMessageAttributesDto.hashCode())) * 31;
            DisclaimerMessageAttributesDto disclaimerMessageAttributesDto = this.disclaimer_message_attributes;
            int iHashCode5 = (iHashCode4 + (disclaimerMessageAttributesDto == null ? 0 : disclaimerMessageAttributesDto.hashCode())) * 31;
            LinkMessageAttributesDto linkMessageAttributesDto = this.link_message_attributes;
            int iHashCode6 = (iHashCode5 + (linkMessageAttributesDto == null ? 0 : linkMessageAttributesDto.hashCode())) * 31;
            MarkdownMessageAttributesDto markdownMessageAttributesDto = this.markdown_message_attributes;
            int iHashCode7 = (iHashCode6 + (markdownMessageAttributesDto == null ? 0 : markdownMessageAttributesDto.hashCode())) * 31;
            InfoMessageAttributesDto infoMessageAttributesDto = this.info_message_attributes;
            int iHashCode8 = (iHashCode7 + (infoMessageAttributesDto == null ? 0 : infoMessageAttributesDto.hashCode())) * 31;
            SelectionMessageAttributesDto selectionMessageAttributesDto = this.selection_message_attributes;
            int iHashCode9 = (iHashCode8 + (selectionMessageAttributesDto == null ? 0 : selectionMessageAttributesDto.hashCode())) * 31;
            MediaMessageAttributesDto mediaMessageAttributesDto = this.media_message_attributes;
            return iHashCode9 + (mediaMessageAttributesDto != null ? mediaMessageAttributesDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", conversation_id=" + this.conversation_id + ", created_at=" + this.created_at + ", sender=" + this.sender + ", type=" + this.type + ", text_message_attributes=" + this.text_message_attributes + ", action_message_attributes=" + this.action_message_attributes + ", disclaimer_message_attributes=" + this.disclaimer_message_attributes + ", link_message_attributes=" + this.link_message_attributes + ", markdown_message_attributes=" + this.markdown_message_attributes + ", info_message_attributes=" + this.info_message_attributes + ", selection_message_attributes=" + this.selection_message_attributes + ", media_message_attributes=" + this.media_message_attributes + ")";
        }

        /* compiled from: MessageDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MessageDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Instant instant, SenderTypeDto senderTypeDto, MessageTypeDto messageTypeDto, TextMessageAttributesDto textMessageAttributesDto, ActionMessageAttributesDto actionMessageAttributesDto, DisclaimerMessageAttributesDto disclaimerMessageAttributesDto, LinkMessageAttributesDto linkMessageAttributesDto, MarkdownMessageAttributesDto markdownMessageAttributesDto, InfoMessageAttributesDto infoMessageAttributesDto, SelectionMessageAttributesDto selectionMessageAttributesDto, MediaMessageAttributesDto mediaMessageAttributesDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.conversation_id = "";
            } else {
                this.conversation_id = str2;
            }
            if ((i & 4) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 8) == 0) {
                this.sender = SenderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.sender = senderTypeDto;
            }
            if ((i & 16) == 0) {
                this.type = MessageTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = messageTypeDto;
            }
            if ((i & 32) == 0) {
                this.text_message_attributes = null;
            } else {
                this.text_message_attributes = textMessageAttributesDto;
            }
            if ((i & 64) == 0) {
                this.action_message_attributes = null;
            } else {
                this.action_message_attributes = actionMessageAttributesDto;
            }
            if ((i & 128) == 0) {
                this.disclaimer_message_attributes = null;
            } else {
                this.disclaimer_message_attributes = disclaimerMessageAttributesDto;
            }
            if ((i & 256) == 0) {
                this.link_message_attributes = null;
            } else {
                this.link_message_attributes = linkMessageAttributesDto;
            }
            if ((i & 512) == 0) {
                this.markdown_message_attributes = null;
            } else {
                this.markdown_message_attributes = markdownMessageAttributesDto;
            }
            if ((i & 1024) == 0) {
                this.info_message_attributes = null;
            } else {
                this.info_message_attributes = infoMessageAttributesDto;
            }
            if ((i & 2048) == 0) {
                this.selection_message_attributes = null;
            } else {
                this.selection_message_attributes = selectionMessageAttributesDto;
            }
            if ((i & 4096) == 0) {
                this.media_message_attributes = null;
            } else {
                this.media_message_attributes = mediaMessageAttributesDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.conversation_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.conversation_id);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.sender != SenderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, SenderTypeDto.Serializer.INSTANCE, self.sender);
            }
            if (self.type != MessageTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, MessageTypeDto.Serializer.INSTANCE, self.type);
            }
            TextMessageAttributesDto textMessageAttributesDto = self.text_message_attributes;
            if (textMessageAttributesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, TextMessageAttributesDto.Serializer.INSTANCE, textMessageAttributesDto);
            }
            ActionMessageAttributesDto actionMessageAttributesDto = self.action_message_attributes;
            if (actionMessageAttributesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ActionMessageAttributesDto.Serializer.INSTANCE, actionMessageAttributesDto);
            }
            DisclaimerMessageAttributesDto disclaimerMessageAttributesDto = self.disclaimer_message_attributes;
            if (disclaimerMessageAttributesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, DisclaimerMessageAttributesDto.Serializer.INSTANCE, disclaimerMessageAttributesDto);
            }
            LinkMessageAttributesDto linkMessageAttributesDto = self.link_message_attributes;
            if (linkMessageAttributesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, LinkMessageAttributesDto.Serializer.INSTANCE, linkMessageAttributesDto);
            }
            MarkdownMessageAttributesDto markdownMessageAttributesDto = self.markdown_message_attributes;
            if (markdownMessageAttributesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, MarkdownMessageAttributesDto.Serializer.INSTANCE, markdownMessageAttributesDto);
            }
            InfoMessageAttributesDto infoMessageAttributesDto = self.info_message_attributes;
            if (infoMessageAttributesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, InfoMessageAttributesDto.Serializer.INSTANCE, infoMessageAttributesDto);
            }
            SelectionMessageAttributesDto selectionMessageAttributesDto = self.selection_message_attributes;
            if (selectionMessageAttributesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, SelectionMessageAttributesDto.Serializer.INSTANCE, selectionMessageAttributesDto);
            }
            MediaMessageAttributesDto mediaMessageAttributesDto = self.media_message_attributes;
            if (mediaMessageAttributesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, MediaMessageAttributesDto.Serializer.INSTANCE, mediaMessageAttributesDto);
            }
        }

        public Surrogate(String id, String conversation_id, Instant instant, SenderTypeDto sender, MessageTypeDto type2, TextMessageAttributesDto textMessageAttributesDto, ActionMessageAttributesDto actionMessageAttributesDto, DisclaimerMessageAttributesDto disclaimerMessageAttributesDto, LinkMessageAttributesDto linkMessageAttributesDto, MarkdownMessageAttributesDto markdownMessageAttributesDto, InfoMessageAttributesDto infoMessageAttributesDto, SelectionMessageAttributesDto selectionMessageAttributesDto, MediaMessageAttributesDto mediaMessageAttributesDto) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
            Intrinsics.checkNotNullParameter(sender, "sender");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.id = id;
            this.conversation_id = conversation_id;
            this.created_at = instant;
            this.sender = sender;
            this.type = type2;
            this.text_message_attributes = textMessageAttributesDto;
            this.action_message_attributes = actionMessageAttributesDto;
            this.disclaimer_message_attributes = disclaimerMessageAttributesDto;
            this.link_message_attributes = linkMessageAttributesDto;
            this.markdown_message_attributes = markdownMessageAttributesDto;
            this.info_message_attributes = infoMessageAttributesDto;
            this.selection_message_attributes = selectionMessageAttributesDto;
            this.media_message_attributes = mediaMessageAttributesDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, Instant instant, SenderTypeDto senderTypeDto, MessageTypeDto messageTypeDto, TextMessageAttributesDto textMessageAttributesDto, ActionMessageAttributesDto actionMessageAttributesDto, DisclaimerMessageAttributesDto disclaimerMessageAttributesDto, LinkMessageAttributesDto linkMessageAttributesDto, MarkdownMessageAttributesDto markdownMessageAttributesDto, InfoMessageAttributesDto infoMessageAttributesDto, SelectionMessageAttributesDto selectionMessageAttributesDto, MediaMessageAttributesDto mediaMessageAttributesDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : instant, (i & 8) != 0 ? SenderTypeDto.INSTANCE.getZeroValue() : senderTypeDto, (i & 16) != 0 ? MessageTypeDto.INSTANCE.getZeroValue() : messageTypeDto, (i & 32) != 0 ? null : textMessageAttributesDto, (i & 64) != 0 ? null : actionMessageAttributesDto, (i & 128) != 0 ? null : disclaimerMessageAttributesDto, (i & 256) != 0 ? null : linkMessageAttributesDto, (i & 512) != 0 ? null : markdownMessageAttributesDto, (i & 1024) != 0 ? null : infoMessageAttributesDto, (i & 2048) != 0 ? null : selectionMessageAttributesDto, (i & 4096) != 0 ? null : mediaMessageAttributesDto);
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

        public final SenderTypeDto getSender() {
            return this.sender;
        }

        public final MessageTypeDto getType() {
            return this.type;
        }

        public final TextMessageAttributesDto getText_message_attributes() {
            return this.text_message_attributes;
        }

        public final ActionMessageAttributesDto getAction_message_attributes() {
            return this.action_message_attributes;
        }

        public final DisclaimerMessageAttributesDto getDisclaimer_message_attributes() {
            return this.disclaimer_message_attributes;
        }

        public final LinkMessageAttributesDto getLink_message_attributes() {
            return this.link_message_attributes;
        }

        public final MarkdownMessageAttributesDto getMarkdown_message_attributes() {
            return this.markdown_message_attributes;
        }

        public final InfoMessageAttributesDto getInfo_message_attributes() {
            return this.info_message_attributes;
        }

        public final SelectionMessageAttributesDto getSelection_message_attributes() {
            return this.selection_message_attributes;
        }

        public final MediaMessageAttributesDto getMedia_message_attributes() {
            return this.media_message_attributes;
        }
    }

    /* compiled from: MessageDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/Message;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/MessageDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MessageDto, Message> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MessageDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MessageDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MessageDto> getBinaryBase64Serializer() {
            return (KSerializer) MessageDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Message> getProtoAdapter() {
            return Message.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MessageDto getZeroValue() {
            return MessageDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MessageDto fromProto(Message proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String conversation_id = proto.getConversation_id();
            Instant created_at = proto.getCreated_at();
            SenderTypeDto senderTypeDtoFromProto = SenderTypeDto.INSTANCE.fromProto(proto.getSender());
            MessageTypeDto messageTypeDtoFromProto = MessageTypeDto.INSTANCE.fromProto(proto.getType());
            TextMessageAttributes text_message_attributes = proto.getText_message_attributes();
            DefaultConstructorMarker defaultConstructorMarker = null;
            TextMessageAttributesDto textMessageAttributesDtoFromProto = text_message_attributes != null ? TextMessageAttributesDto.INSTANCE.fromProto(text_message_attributes) : null;
            ActionMessageAttributes action_message_attributes = proto.getAction_message_attributes();
            ActionMessageAttributesDto actionMessageAttributesDtoFromProto = action_message_attributes != null ? ActionMessageAttributesDto.INSTANCE.fromProto(action_message_attributes) : null;
            DisclaimerMessageAttributes disclaimer_message_attributes = proto.getDisclaimer_message_attributes();
            DisclaimerMessageAttributesDto disclaimerMessageAttributesDtoFromProto = disclaimer_message_attributes != null ? DisclaimerMessageAttributesDto.INSTANCE.fromProto(disclaimer_message_attributes) : null;
            LinkMessageAttributes link_message_attributes = proto.getLink_message_attributes();
            LinkMessageAttributesDto linkMessageAttributesDtoFromProto = link_message_attributes != null ? LinkMessageAttributesDto.INSTANCE.fromProto(link_message_attributes) : null;
            MarkdownMessageAttributes markdown_message_attributes = proto.getMarkdown_message_attributes();
            MarkdownMessageAttributesDto markdownMessageAttributesDtoFromProto = markdown_message_attributes != null ? MarkdownMessageAttributesDto.INSTANCE.fromProto(markdown_message_attributes) : null;
            InfoMessageAttributes info_message_attributes = proto.getInfo_message_attributes();
            InfoMessageAttributesDto infoMessageAttributesDtoFromProto = info_message_attributes != null ? InfoMessageAttributesDto.INSTANCE.fromProto(info_message_attributes) : null;
            SelectionMessageAttributes selection_message_attributes = proto.getSelection_message_attributes();
            SelectionMessageAttributesDto selectionMessageAttributesDtoFromProto = selection_message_attributes != null ? SelectionMessageAttributesDto.INSTANCE.fromProto(selection_message_attributes) : null;
            MediaMessageAttributes media_message_attributes = proto.getMedia_message_attributes();
            return new MessageDto(new Surrogate(id, conversation_id, created_at, senderTypeDtoFromProto, messageTypeDtoFromProto, textMessageAttributesDtoFromProto, actionMessageAttributesDtoFromProto, disclaimerMessageAttributesDtoFromProto, linkMessageAttributesDtoFromProto, markdownMessageAttributesDtoFromProto, infoMessageAttributesDtoFromProto, selectionMessageAttributesDtoFromProto, media_message_attributes != null ? MediaMessageAttributesDto.INSTANCE.fromProto(media_message_attributes) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.MessageDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MessageDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MessageDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MessageDto.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "TextMessageAttributes", "ActionMessageAttributes", "DisclaimerMessageAttributes", "LinkMessageAttributes", "MarkdownMessageAttributes", "InfoMessageAttributes", "SelectionMessageAttributes", "MediaMessageAttributes", "Companion", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$ActionMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$DisclaimerMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$InfoMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$LinkMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$MarkdownMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$MediaMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$SelectionMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$TextMessageAttributes;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class AttributesDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ AttributesDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AttributesDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: MessageDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$TextMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto;", "value", "Lcom/robinhood/chatbot/proto/v1/TextMessageAttributesDto;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/TextMessageAttributesDto;)V", "getValue", "()Lcom/robinhood/chatbot/proto/v1/TextMessageAttributesDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TextMessageAttributes extends AttributesDto {
            private final TextMessageAttributesDto value;

            public static /* synthetic */ TextMessageAttributes copy$default(TextMessageAttributes textMessageAttributes, TextMessageAttributesDto textMessageAttributesDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    textMessageAttributesDto = textMessageAttributes.value;
                }
                return textMessageAttributes.copy(textMessageAttributesDto);
            }

            /* renamed from: component1, reason: from getter */
            public final TextMessageAttributesDto getValue() {
                return this.value;
            }

            public final TextMessageAttributes copy(TextMessageAttributesDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new TextMessageAttributes(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TextMessageAttributes) && Intrinsics.areEqual(this.value, ((TextMessageAttributes) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TextMessageAttributes(value=" + this.value + ")";
            }

            public final TextMessageAttributesDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextMessageAttributes(TextMessageAttributesDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MessageDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$ActionMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto;", "value", "Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;)V", "getValue", "()Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributesDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ActionMessageAttributes extends AttributesDto {
            private final ActionMessageAttributesDto value;

            public static /* synthetic */ ActionMessageAttributes copy$default(ActionMessageAttributes actionMessageAttributes, ActionMessageAttributesDto actionMessageAttributesDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    actionMessageAttributesDto = actionMessageAttributes.value;
                }
                return actionMessageAttributes.copy(actionMessageAttributesDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ActionMessageAttributesDto getValue() {
                return this.value;
            }

            public final ActionMessageAttributes copy(ActionMessageAttributesDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new ActionMessageAttributes(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ActionMessageAttributes) && Intrinsics.areEqual(this.value, ((ActionMessageAttributes) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ActionMessageAttributes(value=" + this.value + ")";
            }

            public final ActionMessageAttributesDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionMessageAttributes(ActionMessageAttributesDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MessageDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$DisclaimerMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto;", "value", "Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributesDto;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributesDto;)V", "getValue", "()Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributesDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DisclaimerMessageAttributes extends AttributesDto {
            private final DisclaimerMessageAttributesDto value;

            public static /* synthetic */ DisclaimerMessageAttributes copy$default(DisclaimerMessageAttributes disclaimerMessageAttributes, DisclaimerMessageAttributesDto disclaimerMessageAttributesDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    disclaimerMessageAttributesDto = disclaimerMessageAttributes.value;
                }
                return disclaimerMessageAttributes.copy(disclaimerMessageAttributesDto);
            }

            /* renamed from: component1, reason: from getter */
            public final DisclaimerMessageAttributesDto getValue() {
                return this.value;
            }

            public final DisclaimerMessageAttributes copy(DisclaimerMessageAttributesDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new DisclaimerMessageAttributes(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisclaimerMessageAttributes) && Intrinsics.areEqual(this.value, ((DisclaimerMessageAttributes) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DisclaimerMessageAttributes(value=" + this.value + ")";
            }

            public final DisclaimerMessageAttributesDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DisclaimerMessageAttributes(DisclaimerMessageAttributesDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MessageDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$LinkMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto;", "value", "Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributesDto;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributesDto;)V", "getValue", "()Lcom/robinhood/chatbot/proto/v1/LinkMessageAttributesDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LinkMessageAttributes extends AttributesDto {
            private final LinkMessageAttributesDto value;

            public static /* synthetic */ LinkMessageAttributes copy$default(LinkMessageAttributes linkMessageAttributes, LinkMessageAttributesDto linkMessageAttributesDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    linkMessageAttributesDto = linkMessageAttributes.value;
                }
                return linkMessageAttributes.copy(linkMessageAttributesDto);
            }

            /* renamed from: component1, reason: from getter */
            public final LinkMessageAttributesDto getValue() {
                return this.value;
            }

            public final LinkMessageAttributes copy(LinkMessageAttributesDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new LinkMessageAttributes(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LinkMessageAttributes) && Intrinsics.areEqual(this.value, ((LinkMessageAttributes) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "LinkMessageAttributes(value=" + this.value + ")";
            }

            public final LinkMessageAttributesDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LinkMessageAttributes(LinkMessageAttributesDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MessageDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$MarkdownMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto;", "value", "Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributesDto;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributesDto;)V", "getValue", "()Lcom/robinhood/chatbot/proto/v1/MarkdownMessageAttributesDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MarkdownMessageAttributes extends AttributesDto {
            private final MarkdownMessageAttributesDto value;

            public static /* synthetic */ MarkdownMessageAttributes copy$default(MarkdownMessageAttributes markdownMessageAttributes, MarkdownMessageAttributesDto markdownMessageAttributesDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    markdownMessageAttributesDto = markdownMessageAttributes.value;
                }
                return markdownMessageAttributes.copy(markdownMessageAttributesDto);
            }

            /* renamed from: component1, reason: from getter */
            public final MarkdownMessageAttributesDto getValue() {
                return this.value;
            }

            public final MarkdownMessageAttributes copy(MarkdownMessageAttributesDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new MarkdownMessageAttributes(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MarkdownMessageAttributes) && Intrinsics.areEqual(this.value, ((MarkdownMessageAttributes) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MarkdownMessageAttributes(value=" + this.value + ")";
            }

            public final MarkdownMessageAttributesDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarkdownMessageAttributes(MarkdownMessageAttributesDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MessageDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$InfoMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto;", "value", "Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributesDto;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributesDto;)V", "getValue", "()Lcom/robinhood/chatbot/proto/v1/InfoMessageAttributesDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InfoMessageAttributes extends AttributesDto {
            private final InfoMessageAttributesDto value;

            public static /* synthetic */ InfoMessageAttributes copy$default(InfoMessageAttributes infoMessageAttributes, InfoMessageAttributesDto infoMessageAttributesDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    infoMessageAttributesDto = infoMessageAttributes.value;
                }
                return infoMessageAttributes.copy(infoMessageAttributesDto);
            }

            /* renamed from: component1, reason: from getter */
            public final InfoMessageAttributesDto getValue() {
                return this.value;
            }

            public final InfoMessageAttributes copy(InfoMessageAttributesDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new InfoMessageAttributes(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InfoMessageAttributes) && Intrinsics.areEqual(this.value, ((InfoMessageAttributes) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InfoMessageAttributes(value=" + this.value + ")";
            }

            public final InfoMessageAttributesDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InfoMessageAttributes(InfoMessageAttributesDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MessageDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$SelectionMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto;", "value", "Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributesDto;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributesDto;)V", "getValue", "()Lcom/robinhood/chatbot/proto/v1/SelectionMessageAttributesDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final /* data */ class SelectionMessageAttributes extends AttributesDto {
            private final SelectionMessageAttributesDto value;

            public static /* synthetic */ SelectionMessageAttributes copy$default(SelectionMessageAttributes selectionMessageAttributes, SelectionMessageAttributesDto selectionMessageAttributesDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    selectionMessageAttributesDto = selectionMessageAttributes.value;
                }
                return selectionMessageAttributes.copy(selectionMessageAttributesDto);
            }

            /* renamed from: component1, reason: from getter */
            public final SelectionMessageAttributesDto getValue() {
                return this.value;
            }

            public final SelectionMessageAttributes copy(SelectionMessageAttributesDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new SelectionMessageAttributes(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectionMessageAttributes) && Intrinsics.areEqual(this.value, ((SelectionMessageAttributes) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SelectionMessageAttributes(value=" + this.value + ")";
            }

            public final SelectionMessageAttributesDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectionMessageAttributes(SelectionMessageAttributesDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MessageDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$MediaMessageAttributes;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto;", "value", "Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;)V", "getValue", "()Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributesDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final /* data */ class MediaMessageAttributes extends AttributesDto {
            private final MediaMessageAttributesDto value;

            public static /* synthetic */ MediaMessageAttributes copy$default(MediaMessageAttributes mediaMessageAttributes, MediaMessageAttributesDto mediaMessageAttributesDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    mediaMessageAttributesDto = mediaMessageAttributes.value;
                }
                return mediaMessageAttributes.copy(mediaMessageAttributesDto);
            }

            /* renamed from: component1, reason: from getter */
            public final MediaMessageAttributesDto getValue() {
                return this.value;
            }

            public final MediaMessageAttributes copy(MediaMessageAttributesDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new MediaMessageAttributes(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MediaMessageAttributes) && Intrinsics.areEqual(this.value, ((MediaMessageAttributes) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MediaMessageAttributes(value=" + this.value + ")";
            }

            public final MediaMessageAttributesDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MediaMessageAttributes(MediaMessageAttributesDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MessageDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/MessageDto$AttributesDto;", "Lcom/robinhood/chatbot/proto/v1/Message;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion implements Dto4.Creator<AttributesDto, Message> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Message> getProtoAdapter() {
                return Message.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AttributesDto fromProto(Message proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getText_message_attributes() != null) {
                    return new TextMessageAttributes(TextMessageAttributesDto.INSTANCE.fromProto(proto.getText_message_attributes()));
                }
                if (proto.getAction_message_attributes() != null) {
                    return new ActionMessageAttributes(ActionMessageAttributesDto.INSTANCE.fromProto(proto.getAction_message_attributes()));
                }
                if (proto.getDisclaimer_message_attributes() != null) {
                    return new DisclaimerMessageAttributes(DisclaimerMessageAttributesDto.INSTANCE.fromProto(proto.getDisclaimer_message_attributes()));
                }
                if (proto.getLink_message_attributes() != null) {
                    return new LinkMessageAttributes(LinkMessageAttributesDto.INSTANCE.fromProto(proto.getLink_message_attributes()));
                }
                if (proto.getMarkdown_message_attributes() != null) {
                    return new MarkdownMessageAttributes(MarkdownMessageAttributesDto.INSTANCE.fromProto(proto.getMarkdown_message_attributes()));
                }
                if (proto.getInfo_message_attributes() != null) {
                    return new InfoMessageAttributes(InfoMessageAttributesDto.INSTANCE.fromProto(proto.getInfo_message_attributes()));
                }
                if (proto.getSelection_message_attributes() != null) {
                    return new SelectionMessageAttributes(SelectionMessageAttributesDto.INSTANCE.fromProto(proto.getSelection_message_attributes()));
                }
                if (proto.getMedia_message_attributes() != null) {
                    return new MediaMessageAttributes(MediaMessageAttributesDto.INSTANCE.fromProto(proto.getMedia_message_attributes()));
                }
                return null;
            }
        }
    }

    /* compiled from: MessageDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/MessageDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/MessageDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MessageDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.Message", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MessageDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MessageDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MessageDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MessageDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.MessageDto";
        }
    }
}
