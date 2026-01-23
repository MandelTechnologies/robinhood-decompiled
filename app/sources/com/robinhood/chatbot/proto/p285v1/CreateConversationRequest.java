package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
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
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: CreateConversationRequest.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016JT\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateConversationRequest;", "Lcom/squareup/wire/Message;", "", MatchaQrCodeDuxo6.USER_ID_KEY, "", NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "", "Lcom/robinhood/chatbot/proto/v1/MessageInput;", "response_mode", "Lcom/robinhood/chatbot/proto/v1/ResponseMode;", "annotations", "", "locality", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/chatbot/proto/v1/ResponseMode;Ljava/util/Map;Ljava/lang/String;Lokio/ByteString;)V", "getUser_id", "()Ljava/lang/String;", "getResponse_mode", "()Lcom/robinhood/chatbot/proto/v1/ResponseMode;", "getLocality", "getMessages", "()Ljava/util/List;", "getAnnotations", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CreateConversationRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreateConversationRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Map<String, ?> annotations;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String locality;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.MessageInput#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<MessageInput> messages;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.ResponseMode#ADAPTER", jsonName = "responseMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ResponseMode response_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String user_id;

    public CreateConversationRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ CreateConversationRequest(String str, List list, ResponseMode responseMode, Map map, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ResponseMode.RESPONSE_MODE_UNSPECIFIED : responseMode, (i & 8) != 0 ? null : map, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20476newBuilder();
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final ResponseMode getResponse_mode() {
        return this.response_mode;
    }

    public final String getLocality() {
        return this.locality;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateConversationRequest(String user_id, List<MessageInput> messages, ResponseMode response_mode, Map<String, ?> map, String locality, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(response_mode, "response_mode");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_id = user_id;
        this.response_mode = response_mode;
        this.locality = locality;
        this.messages = Internal.immutableCopyOf(NotificationSettings4FragmentKey.SETTINGS_MESSAGES, messages);
        this.annotations = (Map) Internal.immutableCopyOfStruct("annotations", map);
    }

    public final List<MessageInput> getMessages() {
        return this.messages;
    }

    public final Map<String, ?> getAnnotations() {
        return this.annotations;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20476newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateConversationRequest)) {
            return false;
        }
        CreateConversationRequest createConversationRequest = (CreateConversationRequest) other;
        return Intrinsics.areEqual(unknownFields(), createConversationRequest.unknownFields()) && Intrinsics.areEqual(this.user_id, createConversationRequest.user_id) && Intrinsics.areEqual(this.messages, createConversationRequest.messages) && this.response_mode == createConversationRequest.response_mode && Intrinsics.areEqual(this.annotations, createConversationRequest.annotations) && Intrinsics.areEqual(this.locality, createConversationRequest.locality);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.user_id.hashCode()) * 37) + this.messages.hashCode()) * 37) + this.response_mode.hashCode()) * 37;
        Map<String, ?> map = this.annotations;
        int iHashCode2 = ((iHashCode + (map != null ? map.hashCode() : 0)) * 37) + this.locality.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("user_id=" + Internal.sanitize(this.user_id));
        if (!this.messages.isEmpty()) {
            arrayList.add("messages=" + this.messages);
        }
        arrayList.add("response_mode=" + this.response_mode);
        Map<String, ?> map = this.annotations;
        if (map != null) {
            arrayList.add("annotations=" + map);
        }
        arrayList.add("locality=" + Internal.sanitize(this.locality));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateConversationRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateConversationRequest copy$default(CreateConversationRequest createConversationRequest, String str, List list, ResponseMode responseMode, Map map, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createConversationRequest.user_id;
        }
        if ((i & 2) != 0) {
            list = createConversationRequest.messages;
        }
        if ((i & 4) != 0) {
            responseMode = createConversationRequest.response_mode;
        }
        if ((i & 8) != 0) {
            map = createConversationRequest.annotations;
        }
        if ((i & 16) != 0) {
            str2 = createConversationRequest.locality;
        }
        if ((i & 32) != 0) {
            byteString = createConversationRequest.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        return createConversationRequest.copy(str, list, responseMode, map, str3, byteString2);
    }

    public final CreateConversationRequest copy(String user_id, List<MessageInput> messages, ResponseMode response_mode, Map<String, ?> annotations, String locality, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(response_mode, "response_mode");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateConversationRequest(user_id, messages, response_mode, annotations, locality, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateConversationRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateConversationRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.CreateConversationRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateConversationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUser_id());
                }
                int iEncodedSizeWithTag = size + MessageInput.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getMessages());
                if (value.getResponse_mode() != ResponseMode.RESPONSE_MODE_UNSPECIFIED) {
                    iEncodedSizeWithTag += ResponseMode.ADAPTER.encodedSizeWithTag(3, value.getResponse_mode());
                }
                if (value.getAnnotations() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(4, value.getAnnotations());
                }
                return !Intrinsics.areEqual(value.getLocality(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLocality()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateConversationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_id());
                }
                MessageInput.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getMessages());
                if (value.getResponse_mode() != ResponseMode.RESPONSE_MODE_UNSPECIFIED) {
                    ResponseMode.ADAPTER.encodeWithTag(writer, 3, (int) value.getResponse_mode());
                }
                if (value.getAnnotations() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 4, (int) value.getAnnotations());
                }
                if (!Intrinsics.areEqual(value.getLocality(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLocality());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateConversationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLocality(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLocality());
                }
                if (value.getAnnotations() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 4, (int) value.getAnnotations());
                }
                if (value.getResponse_mode() != ResponseMode.RESPONSE_MODE_UNSPECIFIED) {
                    ResponseMode.ADAPTER.encodeWithTag(writer, 3, (int) value.getResponse_mode());
                }
                MessageInput.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getMessages());
                if (Intrinsics.areEqual(value.getUser_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateConversationRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ResponseMode responseMode = ResponseMode.RESPONSE_MODE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Map<String, ?> mapDecode = null;
                ResponseMode responseModeDecode = responseMode;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CreateConversationRequest(strDecode2, arrayList, responseModeDecode, mapDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(MessageInput.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        try {
                            responseModeDecode = ResponseMode.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 4) {
                        mapDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateConversationRequest redact(CreateConversationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getMessages(), MessageInput.ADAPTER);
                Map<String, ?> annotations = value.getAnnotations();
                return CreateConversationRequest.copy$default(value, null, listM26823redactElements, null, annotations != null ? ProtoAdapter.STRUCT_MAP.redact(annotations) : null, null, ByteString.EMPTY, 21, null);
            }
        };
    }
}
