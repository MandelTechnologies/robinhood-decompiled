package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
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
import p479j$.time.Instant;

/* compiled from: Conversation.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/Bk\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJq\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u001eR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b&\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b'\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b+\u0010\u001eR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/Conversation;", "Lcom/squareup/wire/Message;", "", "", "id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", MatchaQrCodeDuxo6.USER_ID_KEY, "state", "Lcom/robinhood/chatbot/proto/v1/ResponseMode;", "response_mode", "", "annotations", "locality", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/ResponseMode;Ljava/util/Map;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/ResponseMode;Ljava/util/Map;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/chatbot/proto/v1/Conversation;", "Ljava/lang/String;", "getId", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getUser_id", "getState", "Lcom/robinhood/chatbot/proto/v1/ResponseMode;", "getResponse_mode", "()Lcom/robinhood/chatbot/proto/v1/ResponseMode;", "getLocality", "Ljava/util/Map;", "getAnnotations", "()Ljava/util/Map;", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class Conversation extends Message {

    @JvmField
    public static final ProtoAdapter<Conversation> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Map<String, ?> annotations;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String locality;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.ResponseMode#ADAPTER", jsonName = "responseMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final ResponseMode response_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String user_id;

    public Conversation() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ Conversation(String str, Instant instant, String str2, String str3, ResponseMode responseMode, Map map, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ResponseMode.RESPONSE_MODE_UNSPECIFIED : responseMode, (i & 32) != 0 ? null : map, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20470newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final String getState() {
        return this.state;
    }

    public final ResponseMode getResponse_mode() {
        return this.response_mode;
    }

    public final String getLocality() {
        return this.locality;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Conversation(String id, Instant instant, String user_id, String state, ResponseMode response_mode, Map<String, ?> map, String locality, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(response_mode, "response_mode");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.created_at = instant;
        this.user_id = user_id;
        this.state = state;
        this.response_mode = response_mode;
        this.locality = locality;
        this.annotations = (Map) Internal.immutableCopyOfStruct("annotations", map);
    }

    public final Map<String, ?> getAnnotations() {
        return this.annotations;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20470newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) other;
        return Intrinsics.areEqual(unknownFields(), conversation.unknownFields()) && Intrinsics.areEqual(this.id, conversation.id) && Intrinsics.areEqual(this.created_at, conversation.created_at) && Intrinsics.areEqual(this.user_id, conversation.user_id) && Intrinsics.areEqual(this.state, conversation.state) && this.response_mode == conversation.response_mode && Intrinsics.areEqual(this.annotations, conversation.annotations) && Intrinsics.areEqual(this.locality, conversation.locality);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = (((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.user_id.hashCode()) * 37) + this.state.hashCode()) * 37) + this.response_mode.hashCode()) * 37;
        Map<String, ?> map = this.annotations;
        int iHashCode3 = ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 37) + this.locality.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        arrayList.add("user_id=" + Internal.sanitize(this.user_id));
        arrayList.add("state=" + Internal.sanitize(this.state));
        arrayList.add("response_mode=" + this.response_mode);
        Map<String, ?> map = this.annotations;
        if (map != null) {
            arrayList.add("annotations=" + map);
        }
        arrayList.add("locality=" + Internal.sanitize(this.locality));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Conversation{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, Instant instant, String str2, String str3, ResponseMode responseMode, Map map, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversation.id;
        }
        if ((i & 2) != 0) {
            instant = conversation.created_at;
        }
        if ((i & 4) != 0) {
            str2 = conversation.user_id;
        }
        if ((i & 8) != 0) {
            str3 = conversation.state;
        }
        if ((i & 16) != 0) {
            responseMode = conversation.response_mode;
        }
        if ((i & 32) != 0) {
            map = conversation.annotations;
        }
        if ((i & 64) != 0) {
            str4 = conversation.locality;
        }
        if ((i & 128) != 0) {
            byteString = conversation.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        ResponseMode responseMode2 = responseMode;
        Map map2 = map;
        return conversation.copy(str, instant, str2, str3, responseMode2, map2, str5, byteString2);
    }

    public final Conversation copy(String id, Instant created_at, String user_id, String state, ResponseMode response_mode, Map<String, ?> annotations, String locality, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(response_mode, "response_mode");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Conversation(id, created_at, user_id, state, response_mode, annotations, locality, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Conversation.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Conversation>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.Conversation$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Conversation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getUser_id());
                }
                if (!Intrinsics.areEqual(value.getState(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getState());
                }
                if (value.getResponse_mode() != ResponseMode.RESPONSE_MODE_UNSPECIFIED) {
                    size += ResponseMode.ADAPTER.encodedSizeWithTag(5, value.getResponse_mode());
                }
                if (value.getAnnotations() != null) {
                    size += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(6, value.getAnnotations());
                }
                return !Intrinsics.areEqual(value.getLocality(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getLocality()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Conversation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUser_id());
                }
                if (!Intrinsics.areEqual(value.getState(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getState());
                }
                if (value.getResponse_mode() != ResponseMode.RESPONSE_MODE_UNSPECIFIED) {
                    ResponseMode.ADAPTER.encodeWithTag(writer, 5, (int) value.getResponse_mode());
                }
                if (value.getAnnotations() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 6, (int) value.getAnnotations());
                }
                if (!Intrinsics.areEqual(value.getLocality(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getLocality());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Conversation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLocality(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getLocality());
                }
                if (value.getAnnotations() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 6, (int) value.getAnnotations());
                }
                if (value.getResponse_mode() != ResponseMode.RESPONSE_MODE_UNSPECIFIED) {
                    ResponseMode.ADAPTER.encodeWithTag(writer, 5, (int) value.getResponse_mode());
                }
                if (!Intrinsics.areEqual(value.getState(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUser_id());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getCreated_at());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Conversation decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ResponseMode responseMode = ResponseMode.RESPONSE_MODE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                Instant instantDecode = null;
                Map<String, ?> mapDecode = null;
                ResponseMode responseModeDecode = responseMode;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                try {
                                    responseModeDecode = ResponseMode.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 6:
                                mapDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new Conversation(strDecode4, instantDecode, strDecode, strDecode2, responseModeDecode, mapDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Conversation redact(Conversation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Map<String, ?> annotations = value.getAnnotations();
                return Conversation.copy$default(value, null, instantRedact, null, null, null, annotations != null ? ProtoAdapter.STRUCT_MAP.redact(annotations) : null, null, ByteString.EMPTY, 93, null);
            }
        };
    }
}
