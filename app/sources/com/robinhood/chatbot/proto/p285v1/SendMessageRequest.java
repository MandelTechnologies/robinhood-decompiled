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

/* compiled from: SendMessageRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SendMessageRequest;", "Lcom/squareup/wire/Message;", "", "conversation_id", "", "type", "Lcom/robinhood/chatbot/proto/v1/MessageType;", "attributes", "Lcom/robinhood/chatbot/proto/v1/SendMessageRequestAttributes;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/MessageType;Lcom/robinhood/chatbot/proto/v1/SendMessageRequestAttributes;Lokio/ByteString;)V", "getConversation_id", "()Ljava/lang/String;", "getType", "()Lcom/robinhood/chatbot/proto/v1/MessageType;", "getAttributes", "()Lcom/robinhood/chatbot/proto/v1/SendMessageRequestAttributes;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SendMessageRequest extends Message {

    @JvmField
    public static final ProtoAdapter<SendMessageRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.SendMessageRequestAttributes#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final SendMessageRequestAttributes attributes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "conversationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String conversation_id;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.MessageType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final MessageType type;

    public SendMessageRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20547newBuilder();
    }

    public final String getConversation_id() {
        return this.conversation_id;
    }

    public /* synthetic */ SendMessageRequest(String str, MessageType messageType, SendMessageRequestAttributes sendMessageRequestAttributes, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MessageType.MESSAGE_TYPE_UNSPECIFIED : messageType, (i & 4) != 0 ? null : sendMessageRequestAttributes, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final MessageType getType() {
        return this.type;
    }

    public final SendMessageRequestAttributes getAttributes() {
        return this.attributes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMessageRequest(String conversation_id, MessageType type2, SendMessageRequestAttributes sendMessageRequestAttributes, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.conversation_id = conversation_id;
        this.type = type2;
        this.attributes = sendMessageRequestAttributes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20547newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SendMessageRequest)) {
            return false;
        }
        SendMessageRequest sendMessageRequest = (SendMessageRequest) other;
        return Intrinsics.areEqual(unknownFields(), sendMessageRequest.unknownFields()) && Intrinsics.areEqual(this.conversation_id, sendMessageRequest.conversation_id) && this.type == sendMessageRequest.type && Intrinsics.areEqual(this.attributes, sendMessageRequest.attributes);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.conversation_id.hashCode()) * 37) + this.type.hashCode()) * 37;
        SendMessageRequestAttributes sendMessageRequestAttributes = this.attributes;
        int iHashCode2 = iHashCode + (sendMessageRequestAttributes != null ? sendMessageRequestAttributes.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("conversation_id=" + Internal.sanitize(this.conversation_id));
        arrayList.add("type=" + this.type);
        SendMessageRequestAttributes sendMessageRequestAttributes = this.attributes;
        if (sendMessageRequestAttributes != null) {
            arrayList.add("attributes=" + sendMessageRequestAttributes);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SendMessageRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SendMessageRequest copy$default(SendMessageRequest sendMessageRequest, String str, MessageType messageType, SendMessageRequestAttributes sendMessageRequestAttributes, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendMessageRequest.conversation_id;
        }
        if ((i & 2) != 0) {
            messageType = sendMessageRequest.type;
        }
        if ((i & 4) != 0) {
            sendMessageRequestAttributes = sendMessageRequest.attributes;
        }
        if ((i & 8) != 0) {
            byteString = sendMessageRequest.unknownFields();
        }
        return sendMessageRequest.copy(str, messageType, sendMessageRequestAttributes, byteString);
    }

    public final SendMessageRequest copy(String conversation_id, MessageType type2, SendMessageRequestAttributes attributes, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SendMessageRequest(conversation_id, type2, attributes, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SendMessageRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SendMessageRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.SendMessageRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SendMessageRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getConversation_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getConversation_id());
                }
                if (value.getType() != MessageType.MESSAGE_TYPE_UNSPECIFIED) {
                    size += MessageType.ADAPTER.encodedSizeWithTag(2, value.getType());
                }
                return value.getAttributes() != null ? size + SendMessageRequestAttributes.ADAPTER.encodedSizeWithTag(3, value.getAttributes()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SendMessageRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getConversation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getConversation_id());
                }
                if (value.getType() != MessageType.MESSAGE_TYPE_UNSPECIFIED) {
                    MessageType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (value.getAttributes() != null) {
                    SendMessageRequestAttributes.ADAPTER.encodeWithTag(writer, 3, (int) value.getAttributes());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SendMessageRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAttributes() != null) {
                    SendMessageRequestAttributes.ADAPTER.encodeWithTag(writer, 3, (int) value.getAttributes());
                }
                if (value.getType() != MessageType.MESSAGE_TYPE_UNSPECIFIED) {
                    MessageType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (Intrinsics.areEqual(value.getConversation_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getConversation_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SendMessageRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MessageType messageTypeDecode = MessageType.MESSAGE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                SendMessageRequestAttributes sendMessageRequestAttributesDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SendMessageRequest(strDecode, messageTypeDecode, sendMessageRequestAttributesDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            messageTypeDecode = MessageType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        sendMessageRequestAttributesDecode = SendMessageRequestAttributes.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SendMessageRequest redact(SendMessageRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SendMessageRequestAttributes attributes = value.getAttributes();
                return SendMessageRequest.copy$default(value, null, null, attributes != null ? SendMessageRequestAttributes.ADAPTER.redact(attributes) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
