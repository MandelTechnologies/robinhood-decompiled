package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.android.car.result.CarResultComposable2;
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

/* compiled from: MessageInput.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageInput;", "Lcom/squareup/wire/Message;", "", CarResultComposable2.BODY, "", "sender", "Lcom/robinhood/chatbot/proto/v1/SenderType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/SenderType;Lokio/ByteString;)V", "getBody", "()Ljava/lang/String;", "getSender", "()Lcom/robinhood/chatbot/proto/v1/SenderType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class MessageInput extends Message {

    @JvmField
    public static final ProtoAdapter<MessageInput> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String body;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.SenderType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final SenderType sender;

    public MessageInput() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20525newBuilder();
    }

    public final String getBody() {
        return this.body;
    }

    public /* synthetic */ MessageInput(String str, SenderType senderType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SenderType.SENDER_TYPE_UNSPECIFIED : senderType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final SenderType getSender() {
        return this.sender;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageInput(String body, SenderType sender, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.body = body;
        this.sender = sender;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20525newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MessageInput)) {
            return false;
        }
        MessageInput messageInput = (MessageInput) other;
        return Intrinsics.areEqual(unknownFields(), messageInput.unknownFields()) && Intrinsics.areEqual(this.body, messageInput.body) && this.sender == messageInput.sender;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.body.hashCode()) * 37) + this.sender.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("body=" + Internal.sanitize(this.body));
        arrayList.add("sender=" + this.sender);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MessageInput{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MessageInput copy$default(MessageInput messageInput, String str, SenderType senderType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageInput.body;
        }
        if ((i & 2) != 0) {
            senderType = messageInput.sender;
        }
        if ((i & 4) != 0) {
            byteString = messageInput.unknownFields();
        }
        return messageInput.copy(str, senderType, byteString);
    }

    public final MessageInput copy(String body, SenderType sender, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MessageInput(body, sender, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MessageInput.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MessageInput>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.MessageInput$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MessageInput value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBody());
                }
                return value.getSender() != SenderType.SENDER_TYPE_UNSPECIFIED ? size + SenderType.ADAPTER.encodedSizeWithTag(2, value.getSender()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MessageInput value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBody());
                }
                if (value.getSender() != SenderType.SENDER_TYPE_UNSPECIFIED) {
                    SenderType.ADAPTER.encodeWithTag(writer, 2, (int) value.getSender());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MessageInput value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSender() != SenderType.SENDER_TYPE_UNSPECIFIED) {
                    SenderType.ADAPTER.encodeWithTag(writer, 2, (int) value.getSender());
                }
                if (Intrinsics.areEqual(value.getBody(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBody());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MessageInput decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SenderType senderTypeDecode = SenderType.SENDER_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MessageInput(strDecode, senderTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            senderTypeDecode = SenderType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MessageInput redact(MessageInput value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MessageInput.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
