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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: MessageWithSuggestedResponse.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J,\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageWithSuggestedResponse;", "Lcom/squareup/wire/Message;", "", "message", "Lcom/robinhood/chatbot/proto/v1/Message;", "suggested_responses", "", "Lcom/robinhood/chatbot/proto/v1/SuggestedResponse;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/Message;Ljava/util/List;Lokio/ByteString;)V", "getMessage", "()Lcom/robinhood/chatbot/proto/v1/Message;", "getSuggested_responses", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class MessageWithSuggestedResponse extends Message {

    @JvmField
    public static final ProtoAdapter<MessageWithSuggestedResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.Message#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Message message;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.SuggestedResponse#ADAPTER", jsonName = "suggestedResponses", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<SuggestedResponse> suggested_responses;

    public MessageWithSuggestedResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20526newBuilder();
    }

    public final Message getMessage() {
        return this.message;
    }

    public /* synthetic */ MessageWithSuggestedResponse(Message message, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : message, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageWithSuggestedResponse(Message message, List<SuggestedResponse> suggested_responses, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(suggested_responses, "suggested_responses");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.message = message;
        this.suggested_responses = Internal.immutableCopyOf("suggested_responses", suggested_responses);
    }

    public final List<SuggestedResponse> getSuggested_responses() {
        return this.suggested_responses;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20526newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MessageWithSuggestedResponse)) {
            return false;
        }
        MessageWithSuggestedResponse messageWithSuggestedResponse = (MessageWithSuggestedResponse) other;
        return Intrinsics.areEqual(unknownFields(), messageWithSuggestedResponse.unknownFields()) && Intrinsics.areEqual(this.message, messageWithSuggestedResponse.message) && Intrinsics.areEqual(this.suggested_responses, messageWithSuggestedResponse.suggested_responses);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Message message = this.message;
        int iHashCode2 = ((iHashCode + (message != null ? message.hashCode() : 0)) * 37) + this.suggested_responses.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Message message = this.message;
        if (message != null) {
            arrayList.add("message=" + message);
        }
        if (!this.suggested_responses.isEmpty()) {
            arrayList.add("suggested_responses=" + this.suggested_responses);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MessageWithSuggestedResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageWithSuggestedResponse copy$default(MessageWithSuggestedResponse messageWithSuggestedResponse, Message message, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            message = messageWithSuggestedResponse.message;
        }
        if ((i & 2) != 0) {
            list = messageWithSuggestedResponse.suggested_responses;
        }
        if ((i & 4) != 0) {
            byteString = messageWithSuggestedResponse.unknownFields();
        }
        return messageWithSuggestedResponse.copy(message, list, byteString);
    }

    public final MessageWithSuggestedResponse copy(Message message, List<SuggestedResponse> suggested_responses, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(suggested_responses, "suggested_responses");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MessageWithSuggestedResponse(message, suggested_responses, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MessageWithSuggestedResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MessageWithSuggestedResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.MessageWithSuggestedResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MessageWithSuggestedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMessage() != null) {
                    size += Message.ADAPTER.encodedSizeWithTag(1, value.getMessage());
                }
                return size + SuggestedResponse.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getSuggested_responses());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MessageWithSuggestedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMessage() != null) {
                    Message.ADAPTER.encodeWithTag(writer, 1, (int) value.getMessage());
                }
                SuggestedResponse.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSuggested_responses());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MessageWithSuggestedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SuggestedResponse.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSuggested_responses());
                if (value.getMessage() != null) {
                    Message.ADAPTER.encodeWithTag(writer, 1, (int) value.getMessage());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MessageWithSuggestedResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                Message messageDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MessageWithSuggestedResponse(messageDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        messageDecode = Message.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(SuggestedResponse.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MessageWithSuggestedResponse redact(MessageWithSuggestedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Message message = value.getMessage();
                return value.copy(message != null ? Message.ADAPTER.redact(message) : null, Internal.m26823redactElements(value.getSuggested_responses(), SuggestedResponse.ADAPTER), ByteString.EMPTY);
            }
        };
    }
}
