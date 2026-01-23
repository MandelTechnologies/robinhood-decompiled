package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: ClientCodeOccurenceEvent.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00012Bi\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJo\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b/\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b0\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b1\u0010\u001f¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "identifier", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceType;", "codeType", "", "count", "module_name", "group_id", "variant_name", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceType;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceType;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Ljava/lang/String;", "getIdentifier", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceType;", "getCodeType", "()Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceType;", "I", "getCount", "getModule_name", "getGroup_id", "getVariant_name", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientCodeOccurenceEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientCodeOccurenceEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientCodeOccurenceType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ClientCodeOccurenceType codeType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "groupId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String group_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "moduleName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String module_name;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "variantName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String variant_name;

    public ClientCodeOccurenceEvent() {
        this(null, null, null, null, 0, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24093newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientCodeOccurenceEvent(ClientPlatform clientPlatform, Instant instant, String str, ClientCodeOccurenceType clientCodeOccurenceType, int i, String str2, String str3, String str4, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i2 & 2) != 0 ? null : instant, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? ClientCodeOccurenceType.DEFAULT_TYPE : clientCodeOccurenceType, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? "" : str3, (i2 & 128) != 0 ? "" : str4, (i2 & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final ClientCodeOccurenceType getCodeType() {
        return this.codeType;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getModule_name() {
        return this.module_name;
    }

    public final String getGroup_id() {
        return this.group_id;
    }

    public final String getVariant_name() {
        return this.variant_name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientCodeOccurenceEvent(ClientPlatform platform, Instant instant, String identifier, ClientCodeOccurenceType codeType, int i, String module_name, String group_id, String variant_name, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        Intrinsics.checkNotNullParameter(module_name, "module_name");
        Intrinsics.checkNotNullParameter(group_id, "group_id");
        Intrinsics.checkNotNullParameter(variant_name, "variant_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.identifier = identifier;
        this.codeType = codeType;
        this.count = i;
        this.module_name = module_name;
        this.group_id = group_id;
        this.variant_name = variant_name;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24093newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientCodeOccurenceEvent)) {
            return false;
        }
        ClientCodeOccurenceEvent clientCodeOccurenceEvent = (ClientCodeOccurenceEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientCodeOccurenceEvent.unknownFields()) && this.platform == clientCodeOccurenceEvent.platform && Intrinsics.areEqual(this.timestamp, clientCodeOccurenceEvent.timestamp) && Intrinsics.areEqual(this.identifier, clientCodeOccurenceEvent.identifier) && this.codeType == clientCodeOccurenceEvent.codeType && this.count == clientCodeOccurenceEvent.count && Intrinsics.areEqual(this.module_name, clientCodeOccurenceEvent.module_name) && Intrinsics.areEqual(this.group_id, clientCodeOccurenceEvent.group_id) && Intrinsics.areEqual(this.variant_name, clientCodeOccurenceEvent.variant_name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.identifier.hashCode()) * 37) + this.codeType.hashCode()) * 37) + Integer.hashCode(this.count)) * 37) + this.module_name.hashCode()) * 37) + this.group_id.hashCode()) * 37) + this.variant_name.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("platform=" + this.platform);
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        arrayList.add("codeType=" + this.codeType);
        arrayList.add("count=" + this.count);
        arrayList.add("module_name=" + Internal.sanitize(this.module_name));
        arrayList.add("group_id=" + Internal.sanitize(this.group_id));
        arrayList.add("variant_name=" + Internal.sanitize(this.variant_name));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientCodeOccurenceEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientCodeOccurenceEvent copy$default(ClientCodeOccurenceEvent clientCodeOccurenceEvent, ClientPlatform clientPlatform, Instant instant, String str, ClientCodeOccurenceType clientCodeOccurenceType, int i, String str2, String str3, String str4, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            clientPlatform = clientCodeOccurenceEvent.platform;
        }
        if ((i2 & 2) != 0) {
            instant = clientCodeOccurenceEvent.timestamp;
        }
        if ((i2 & 4) != 0) {
            str = clientCodeOccurenceEvent.identifier;
        }
        if ((i2 & 8) != 0) {
            clientCodeOccurenceType = clientCodeOccurenceEvent.codeType;
        }
        if ((i2 & 16) != 0) {
            i = clientCodeOccurenceEvent.count;
        }
        if ((i2 & 32) != 0) {
            str2 = clientCodeOccurenceEvent.module_name;
        }
        if ((i2 & 64) != 0) {
            str3 = clientCodeOccurenceEvent.group_id;
        }
        if ((i2 & 128) != 0) {
            str4 = clientCodeOccurenceEvent.variant_name;
        }
        if ((i2 & 256) != 0) {
            byteString = clientCodeOccurenceEvent.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        String str6 = str2;
        String str7 = str3;
        int i3 = i;
        String str8 = str;
        return clientCodeOccurenceEvent.copy(clientPlatform, instant, str8, clientCodeOccurenceType, i3, str6, str7, str5, byteString2);
    }

    public final ClientCodeOccurenceEvent copy(ClientPlatform platform, Instant timestamp, String identifier, ClientCodeOccurenceType codeType, int count, String module_name, String group_id, String variant_name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        Intrinsics.checkNotNullParameter(module_name, "module_name");
        Intrinsics.checkNotNullParameter(group_id, "group_id");
        Intrinsics.checkNotNullParameter(variant_name, "variant_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientCodeOccurenceEvent(platform, timestamp, identifier, codeType, count, module_name, group_id, variant_name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientCodeOccurenceEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientCodeOccurenceEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientCodeOccurenceEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientCodeOccurenceEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getIdentifier());
                }
                if (value.getCodeType() != ClientCodeOccurenceType.DEFAULT_TYPE) {
                    size += ClientCodeOccurenceType.ADAPTER.encodedSizeWithTag(4, value.getCodeType());
                }
                if (value.getCount() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getCount()));
                }
                if (!Intrinsics.areEqual(value.getModule_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getModule_name());
                }
                if (!Intrinsics.areEqual(value.getGroup_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getGroup_id());
                }
                return !Intrinsics.areEqual(value.getVariant_name(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(8, value.getVariant_name()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientCodeOccurenceEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIdentifier());
                }
                if (value.getCodeType() != ClientCodeOccurenceType.DEFAULT_TYPE) {
                    ClientCodeOccurenceType.ADAPTER.encodeWithTag(writer, 4, (int) value.getCodeType());
                }
                if (value.getCount() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getCount()));
                }
                if (!Intrinsics.areEqual(value.getModule_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getModule_name());
                }
                if (!Intrinsics.areEqual(value.getGroup_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getGroup_id());
                }
                if (!Intrinsics.areEqual(value.getVariant_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getVariant_name());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientCodeOccurenceEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getVariant_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getVariant_name());
                }
                if (!Intrinsics.areEqual(value.getGroup_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getGroup_id());
                }
                if (!Intrinsics.areEqual(value.getModule_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getModule_name());
                }
                if (value.getCount() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getCount()));
                }
                if (value.getCodeType() != ClientCodeOccurenceType.DEFAULT_TYPE) {
                    ClientCodeOccurenceType.ADAPTER.encodeWithTag(writer, 4, (int) value.getCodeType());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIdentifier());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ClientCodeOccurenceEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                ClientCodeOccurenceType clientCodeOccurenceType = ClientCodeOccurenceType.DEFAULT_TYPE;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                int iIntValue = 0;
                Instant instantDecode = null;
                String strDecode4 = strDecode3;
                ClientCodeOccurenceType clientCodeOccurenceTypeDecode = clientCodeOccurenceType;
                while (true) {
                    ClientPlatform clientPlatform = clientPlatformDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        clientPlatformDecode = ClientPlatform.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                case 3:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    try {
                                        clientCodeOccurenceTypeDecode = ClientCodeOccurenceType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 5:
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 6:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 8:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ClientCodeOccurenceEvent(clientPlatform, instantDecode, strDecode4, clientCodeOccurenceTypeDecode, iIntValue, strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientCodeOccurenceEvent redact(ClientCodeOccurenceEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return ClientCodeOccurenceEvent.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, 0, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
            }
        };
    }
}
