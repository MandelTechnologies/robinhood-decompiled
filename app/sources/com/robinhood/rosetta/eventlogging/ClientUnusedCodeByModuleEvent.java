package com.robinhood.rosetta.eventlogging;

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

/* compiled from: ClientUnusedCodeByModuleEvent.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u001bR\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b&\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientUnusedCodeByModuleEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "scheme", "module", "", "unused_code_line_count", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;ILokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;ILokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientUnusedCodeByModuleEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Ljava/lang/String;", "getScheme", "getModule", "I", "getUnused_code_line_count", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientUnusedCodeByModuleEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientUnusedCodeByModuleEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String module;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String scheme;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "unusedCodeLineCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int unused_code_line_count;

    public ClientUnusedCodeByModuleEvent() {
        this(null, null, null, null, 0, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24121newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientUnusedCodeByModuleEvent(ClientPlatform clientPlatform, Instant instant, String str, String str2, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i2 & 2) != 0 ? null : instant, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final String getModule() {
        return this.module;
    }

    public final int getUnused_code_line_count() {
        return this.unused_code_line_count;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientUnusedCodeByModuleEvent(ClientPlatform platform, Instant instant, String scheme, String module, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.scheme = scheme;
        this.module = module;
        this.unused_code_line_count = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24121newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientUnusedCodeByModuleEvent)) {
            return false;
        }
        ClientUnusedCodeByModuleEvent clientUnusedCodeByModuleEvent = (ClientUnusedCodeByModuleEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientUnusedCodeByModuleEvent.unknownFields()) && this.platform == clientUnusedCodeByModuleEvent.platform && Intrinsics.areEqual(this.timestamp, clientUnusedCodeByModuleEvent.timestamp) && Intrinsics.areEqual(this.scheme, clientUnusedCodeByModuleEvent.scheme) && Intrinsics.areEqual(this.module, clientUnusedCodeByModuleEvent.module) && this.unused_code_line_count == clientUnusedCodeByModuleEvent.unused_code_line_count;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.scheme.hashCode()) * 37) + this.module.hashCode()) * 37) + Integer.hashCode(this.unused_code_line_count);
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
        arrayList.add("scheme=" + Internal.sanitize(this.scheme));
        arrayList.add("module=" + Internal.sanitize(this.module));
        arrayList.add("unused_code_line_count=" + this.unused_code_line_count);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientUnusedCodeByModuleEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientUnusedCodeByModuleEvent copy$default(ClientUnusedCodeByModuleEvent clientUnusedCodeByModuleEvent, ClientPlatform clientPlatform, Instant instant, String str, String str2, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            clientPlatform = clientUnusedCodeByModuleEvent.platform;
        }
        if ((i2 & 2) != 0) {
            instant = clientUnusedCodeByModuleEvent.timestamp;
        }
        if ((i2 & 4) != 0) {
            str = clientUnusedCodeByModuleEvent.scheme;
        }
        if ((i2 & 8) != 0) {
            str2 = clientUnusedCodeByModuleEvent.module;
        }
        if ((i2 & 16) != 0) {
            i = clientUnusedCodeByModuleEvent.unused_code_line_count;
        }
        if ((i2 & 32) != 0) {
            byteString = clientUnusedCodeByModuleEvent.unknownFields();
        }
        int i3 = i;
        ByteString byteString2 = byteString;
        return clientUnusedCodeByModuleEvent.copy(clientPlatform, instant, str, str2, i3, byteString2);
    }

    public final ClientUnusedCodeByModuleEvent copy(ClientPlatform platform, Instant timestamp, String scheme, String module, int unused_code_line_count, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientUnusedCodeByModuleEvent(platform, timestamp, scheme, module, unused_code_line_count, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientUnusedCodeByModuleEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientUnusedCodeByModuleEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientUnusedCodeByModuleEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientUnusedCodeByModuleEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getScheme(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getScheme());
                }
                if (!Intrinsics.areEqual(value.getModule(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getModule());
                }
                return value.getUnused_code_line_count() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getUnused_code_line_count())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientUnusedCodeByModuleEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getScheme(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getScheme());
                }
                if (!Intrinsics.areEqual(value.getModule(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getModule());
                }
                if (value.getUnused_code_line_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getUnused_code_line_count()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientUnusedCodeByModuleEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUnused_code_line_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getUnused_code_line_count()));
                }
                if (!Intrinsics.areEqual(value.getModule(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getModule());
                }
                if (!Intrinsics.areEqual(value.getScheme(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getScheme());
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
            public ClientUnusedCodeByModuleEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                Instant instantDecode = null;
                String strDecode2 = strDecode;
                while (true) {
                    ClientPlatform clientPlatform = clientPlatformDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ClientUnusedCodeByModuleEvent(clientPlatform, instantDecode, strDecode2, strDecode, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                clientPlatformDecode = ClientPlatform.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientUnusedCodeByModuleEvent redact(ClientUnusedCodeByModuleEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return ClientUnusedCodeByModuleEvent.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, 0, ByteString.EMPTY, 29, null);
            }
        };
    }
}
