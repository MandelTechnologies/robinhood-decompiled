package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.Event;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: Event.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\"\u001a\u00020\u0002H\u0017J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020\tH\u0016J\b\u0010(\u001a\u00020\u0006H\u0016Jj\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Event;", "Lcom/squareup/wire/Message;", "", "schema_type", "Lcom/robinhood/rosetta/eventlogging/Event$Type;", "schema_name", "", "property", "created_at", "", WebsocketGatewayConstants.TOPIC_KEY, "size", WebsocketGatewayConstants.DATA_KEY, "Lokio/ByteString;", "uuid", "authenticated", "Lcom/robinhood/rosetta/eventlogging/Authentication;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Event$Type;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILokio/ByteString;Lokio/ByteString;Lcom/robinhood/rosetta/eventlogging/Authentication;Lokio/ByteString;)V", "getSchema_type", "()Lcom/robinhood/rosetta/eventlogging/Event$Type;", "getSchema_name", "()Ljava/lang/String;", "getProperty", "getCreated_at", "()I", "getTopic", "getSize", "getData", "()Lokio/ByteString;", "getUuid", "getAuthenticated", "()Lcom/robinhood/rosetta/eventlogging/Authentication;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "Type", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Event extends Message {

    @JvmField
    public static final ProtoAdapter<Event> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Authentication#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Authentication authenticated;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final ByteString data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String property;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "schemaName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String schema_name;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Event$Type#ADAPTER", jsonName = "schemaType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Type schema_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String topic;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final ByteString uuid;

    public Event() {
        this(null, null, null, 0, null, 0, null, null, null, null, 1023, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24257newBuilder();
    }

    public final Type getSchema_type() {
        return this.schema_type;
    }

    public /* synthetic */ Event(Type type2, String str, String str2, int i, String str3, int i2, ByteString byteString, ByteString byteString2, Authentication authentication, ByteString byteString3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Type.DEFAULT_TYPE : type2, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? ByteString.EMPTY : byteString, (i3 & 128) != 0 ? ByteString.EMPTY : byteString2, (i3 & 256) != 0 ? Authentication.DEFAULT_AUTH : authentication, (i3 & 512) != 0 ? ByteString.EMPTY : byteString3);
    }

    public final String getSchema_name() {
        return this.schema_name;
    }

    public final String getProperty() {
        return this.property;
    }

    public final int getCreated_at() {
        return this.created_at;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final int getSize() {
        return this.size;
    }

    public final ByteString getData() {
        return this.data;
    }

    public final ByteString getUuid() {
        return this.uuid;
    }

    public final Authentication getAuthenticated() {
        return this.authenticated;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Event(Type schema_type, String schema_name, String property, int i, String topic, int i2, ByteString data, ByteString uuid, Authentication authenticated, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(schema_type, "schema_type");
        Intrinsics.checkNotNullParameter(schema_name, "schema_name");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(authenticated, "authenticated");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.schema_type = schema_type;
        this.schema_name = schema_name;
        this.property = property;
        this.created_at = i;
        this.topic = topic;
        this.size = i2;
        this.data = data;
        this.uuid = uuid;
        this.authenticated = authenticated;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24257newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Event)) {
            return false;
        }
        Event event = (Event) other;
        return Intrinsics.areEqual(unknownFields(), event.unknownFields()) && this.schema_type == event.schema_type && Intrinsics.areEqual(this.schema_name, event.schema_name) && Intrinsics.areEqual(this.property, event.property) && this.created_at == event.created_at && Intrinsics.areEqual(this.topic, event.topic) && this.size == event.size && Intrinsics.areEqual(this.data, event.data) && Intrinsics.areEqual(this.uuid, event.uuid) && this.authenticated == event.authenticated;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((unknownFields().hashCode() * 37) + this.schema_type.hashCode()) * 37) + this.schema_name.hashCode()) * 37) + this.property.hashCode()) * 37) + Integer.hashCode(this.created_at)) * 37) + this.topic.hashCode()) * 37) + Integer.hashCode(this.size)) * 37) + this.data.hashCode()) * 37) + this.uuid.hashCode()) * 37) + this.authenticated.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("schema_type=" + this.schema_type);
        arrayList.add("schema_name=" + Internal.sanitize(this.schema_name));
        arrayList.add("property=" + Internal.sanitize(this.property));
        arrayList.add("created_at=" + this.created_at);
        arrayList.add("topic=" + Internal.sanitize(this.topic));
        arrayList.add("size=" + this.size);
        arrayList.add("data=" + this.data);
        arrayList.add("uuid=" + this.uuid);
        arrayList.add("authenticated=" + this.authenticated);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Event{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Event copy$default(Event event, Type type2, String str, String str2, int i, String str3, int i2, ByteString byteString, ByteString byteString2, Authentication authentication, ByteString byteString3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            type2 = event.schema_type;
        }
        if ((i3 & 2) != 0) {
            str = event.schema_name;
        }
        if ((i3 & 4) != 0) {
            str2 = event.property;
        }
        if ((i3 & 8) != 0) {
            i = event.created_at;
        }
        if ((i3 & 16) != 0) {
            str3 = event.topic;
        }
        if ((i3 & 32) != 0) {
            i2 = event.size;
        }
        if ((i3 & 64) != 0) {
            byteString = event.data;
        }
        if ((i3 & 128) != 0) {
            byteString2 = event.uuid;
        }
        if ((i3 & 256) != 0) {
            authentication = event.authenticated;
        }
        if ((i3 & 512) != 0) {
            byteString3 = event.unknownFields();
        }
        Authentication authentication2 = authentication;
        ByteString byteString4 = byteString3;
        ByteString byteString5 = byteString;
        ByteString byteString6 = byteString2;
        String str4 = str3;
        int i4 = i2;
        return event.copy(type2, str, str2, i, str4, i4, byteString5, byteString6, authentication2, byteString4);
    }

    public final Event copy(Type schema_type, String schema_name, String property, int created_at, String topic, int size, ByteString data, ByteString uuid, Authentication authenticated, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(schema_type, "schema_type");
        Intrinsics.checkNotNullParameter(schema_name, "schema_name");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(authenticated, "authenticated");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Event(schema_type, schema_name, property, created_at, topic, size, data, uuid, authenticated, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Event.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Event>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.Event$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Event value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSchema_type() != Event.Type.DEFAULT_TYPE) {
                    size += Event.Type.ADAPTER.encodedSizeWithTag(1, value.getSchema_type());
                }
                if (!Intrinsics.areEqual(value.getSchema_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSchema_name());
                }
                if (!Intrinsics.areEqual(value.getProperty(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getProperty());
                }
                if (value.getCreated_at() != 0) {
                    size += ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.getCreated_at()));
                }
                if (!Intrinsics.areEqual(value.getTopic(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getTopic());
                }
                if (value.getSize() != 0) {
                    size += ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.getSize()));
                }
                ByteString data = value.getData();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(data, byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(7, value.getData());
                }
                if (!Intrinsics.areEqual(value.getUuid(), byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(8, value.getUuid());
                }
                return value.getAuthenticated() != Authentication.DEFAULT_AUTH ? size + Authentication.ADAPTER.encodedSizeWithTag(9, value.getAuthenticated()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Event value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSchema_type() != Event.Type.DEFAULT_TYPE) {
                    Event.Type.ADAPTER.encodeWithTag(writer, 1, (int) value.getSchema_type());
                }
                if (!Intrinsics.areEqual(value.getSchema_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSchema_name());
                }
                if (!Intrinsics.areEqual(value.getProperty(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getProperty());
                }
                if (value.getCreated_at() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getCreated_at()));
                }
                if (!Intrinsics.areEqual(value.getTopic(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTopic());
                }
                if (value.getSize() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getSize()));
                }
                ByteString data = value.getData();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(data, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 7, (int) value.getData());
                }
                if (!Intrinsics.areEqual(value.getUuid(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 8, (int) value.getUuid());
                }
                if (value.getAuthenticated() != Authentication.DEFAULT_AUTH) {
                    Authentication.ADAPTER.encodeWithTag(writer, 9, (int) value.getAuthenticated());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Event value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAuthenticated() != Authentication.DEFAULT_AUTH) {
                    Authentication.ADAPTER.encodeWithTag(writer, 9, (int) value.getAuthenticated());
                }
                ByteString uuid = value.getUuid();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(uuid, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 8, (int) value.getUuid());
                }
                if (!Intrinsics.areEqual(value.getData(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 7, (int) value.getData());
                }
                if (value.getSize() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getSize()));
                }
                if (!Intrinsics.areEqual(value.getTopic(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTopic());
                }
                if (value.getCreated_at() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getCreated_at()));
                }
                if (!Intrinsics.areEqual(value.getProperty(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getProperty());
                }
                if (!Intrinsics.areEqual(value.getSchema_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSchema_name());
                }
                if (value.getSchema_type() != Event.Type.DEFAULT_TYPE) {
                    Event.Type.ADAPTER.encodeWithTag(writer, 1, (int) value.getSchema_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Event decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Event.Type type2 = Event.Type.DEFAULT_TYPE;
                ByteString byteString = ByteString.EMPTY;
                Authentication authentication = Authentication.DEFAULT_AUTH;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                int iIntValue = 0;
                int iIntValue2 = 0;
                ByteString byteStringDecode = byteString;
                Authentication authenticationDecode = authentication;
                Event.Type typeDecode = type2;
                ByteString byteStringDecode2 = byteStringDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    typeDecode = Event.Type.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                                break;
                            case 7:
                                byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 8:
                                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 9:
                                try {
                                    authenticationDecode = Authentication.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new Event(typeDecode, strDecode, strDecode2, iIntValue, strDecode3, iIntValue2, byteStringDecode2, byteStringDecode, authenticationDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Event redact(Event value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Event.copy$default(value, null, null, null, 0, null, 0, null, null, null, ByteString.EMPTY, 511, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Event.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Event$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT_TYPE", "PROTOBUF", "JSON", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Type> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type DEFAULT_TYPE;
        public static final Type JSON;
        public static final Type PROTOBUF;
        private final int value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{DEFAULT_TYPE, PROTOBUF, JSON};
        }

        @JvmStatic
        public static final Type fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Type type2 = new Type("DEFAULT_TYPE", 0, 0);
            DEFAULT_TYPE = type2;
            PROTOBUF = new Type("PROTOBUF", 1, 1);
            JSON = new Type("JSON", 2, 2);
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: com.robinhood.rosetta.eventlogging.Event$Type$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Event.Type fromValue(int value) {
                    return Event.Type.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Event.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Event$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/Event$Type;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Type fromValue(int value) {
                if (value == 0) {
                    return Type.DEFAULT_TYPE;
                }
                if (value == 1) {
                    return Type.PROTOBUF;
                }
                if (value != 2) {
                    return null;
                }
                return Type.JSON;
            }
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}
