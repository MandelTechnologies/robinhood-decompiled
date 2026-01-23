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

/* compiled from: ClientBazelSpawnExecEvent.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001d\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00014Bi\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJo\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u001fR\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b*\u0010\u001fR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b3\u0010\u001f¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "mnemonic", "target_label", "", "total_time_in_seconds", "", "cache_hit", "", "exit_code", "pipeline_slug", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;FZILjava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;FZILjava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Ljava/lang/String;", "getMnemonic", "getTarget_label", "F", "getTotal_time_in_seconds", "()F", "Z", "getCache_hit", "()Z", "I", "getExit_code", "getPipeline_slug", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ClientBazelSpawnExecEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientBazelSpawnExecEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "cacheHit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean cache_hit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "exitCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int exit_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String mnemonic;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pipelineSlug", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String pipeline_slug;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "targetLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String target_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "totalTimeInSeconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final float total_time_in_seconds;

    public ClientBazelSpawnExecEvent() {
        this(null, null, null, null, 0.0f, false, 0, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24075newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientBazelSpawnExecEvent(ClientPlatform clientPlatform, Instant instant, String str, String str2, float f, boolean z, int i, String str3, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i2 & 2) != 0 ? null : instant, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? 0.0f : f, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? "" : str3, (i2 & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getMnemonic() {
        return this.mnemonic;
    }

    public final String getTarget_label() {
        return this.target_label;
    }

    public final float getTotal_time_in_seconds() {
        return this.total_time_in_seconds;
    }

    public final boolean getCache_hit() {
        return this.cache_hit;
    }

    public final int getExit_code() {
        return this.exit_code;
    }

    public final String getPipeline_slug() {
        return this.pipeline_slug;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientBazelSpawnExecEvent(ClientPlatform platform, Instant instant, String mnemonic, String target_label, float f, boolean z, int i, String pipeline_slug, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(mnemonic, "mnemonic");
        Intrinsics.checkNotNullParameter(target_label, "target_label");
        Intrinsics.checkNotNullParameter(pipeline_slug, "pipeline_slug");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.mnemonic = mnemonic;
        this.target_label = target_label;
        this.total_time_in_seconds = f;
        this.cache_hit = z;
        this.exit_code = i;
        this.pipeline_slug = pipeline_slug;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24075newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientBazelSpawnExecEvent)) {
            return false;
        }
        ClientBazelSpawnExecEvent clientBazelSpawnExecEvent = (ClientBazelSpawnExecEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientBazelSpawnExecEvent.unknownFields()) && this.platform == clientBazelSpawnExecEvent.platform && Intrinsics.areEqual(this.timestamp, clientBazelSpawnExecEvent.timestamp) && Intrinsics.areEqual(this.mnemonic, clientBazelSpawnExecEvent.mnemonic) && Intrinsics.areEqual(this.target_label, clientBazelSpawnExecEvent.target_label) && this.total_time_in_seconds == clientBazelSpawnExecEvent.total_time_in_seconds && this.cache_hit == clientBazelSpawnExecEvent.cache_hit && this.exit_code == clientBazelSpawnExecEvent.exit_code && Intrinsics.areEqual(this.pipeline_slug, clientBazelSpawnExecEvent.pipeline_slug);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.mnemonic.hashCode()) * 37) + this.target_label.hashCode()) * 37) + Float.hashCode(this.total_time_in_seconds)) * 37) + java.lang.Boolean.hashCode(this.cache_hit)) * 37) + Integer.hashCode(this.exit_code)) * 37) + this.pipeline_slug.hashCode();
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
        arrayList.add("mnemonic=" + Internal.sanitize(this.mnemonic));
        arrayList.add("target_label=" + Internal.sanitize(this.target_label));
        arrayList.add("total_time_in_seconds=" + this.total_time_in_seconds);
        arrayList.add("cache_hit=" + this.cache_hit);
        arrayList.add("exit_code=" + this.exit_code);
        arrayList.add("pipeline_slug=" + Internal.sanitize(this.pipeline_slug));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientBazelSpawnExecEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientBazelSpawnExecEvent copy$default(ClientBazelSpawnExecEvent clientBazelSpawnExecEvent, ClientPlatform clientPlatform, Instant instant, String str, String str2, float f, boolean z, int i, String str3, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            clientPlatform = clientBazelSpawnExecEvent.platform;
        }
        if ((i2 & 2) != 0) {
            instant = clientBazelSpawnExecEvent.timestamp;
        }
        if ((i2 & 4) != 0) {
            str = clientBazelSpawnExecEvent.mnemonic;
        }
        if ((i2 & 8) != 0) {
            str2 = clientBazelSpawnExecEvent.target_label;
        }
        if ((i2 & 16) != 0) {
            f = clientBazelSpawnExecEvent.total_time_in_seconds;
        }
        if ((i2 & 32) != 0) {
            z = clientBazelSpawnExecEvent.cache_hit;
        }
        if ((i2 & 64) != 0) {
            i = clientBazelSpawnExecEvent.exit_code;
        }
        if ((i2 & 128) != 0) {
            str3 = clientBazelSpawnExecEvent.pipeline_slug;
        }
        if ((i2 & 256) != 0) {
            byteString = clientBazelSpawnExecEvent.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        boolean z2 = z;
        int i3 = i;
        float f2 = f;
        String str5 = str;
        return clientBazelSpawnExecEvent.copy(clientPlatform, instant, str5, str2, f2, z2, i3, str4, byteString2);
    }

    public final ClientBazelSpawnExecEvent copy(ClientPlatform platform, Instant timestamp, String mnemonic, String target_label, float total_time_in_seconds, boolean cache_hit, int exit_code, String pipeline_slug, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(mnemonic, "mnemonic");
        Intrinsics.checkNotNullParameter(target_label, "target_label");
        Intrinsics.checkNotNullParameter(pipeline_slug, "pipeline_slug");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientBazelSpawnExecEvent(platform, timestamp, mnemonic, target_label, total_time_in_seconds, cache_hit, exit_code, pipeline_slug, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientBazelSpawnExecEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientBazelSpawnExecEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientBazelSpawnExecEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientBazelSpawnExecEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getMnemonic(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getMnemonic());
                }
                if (!Intrinsics.areEqual(value.getTarget_label(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTarget_label());
                }
                if (!Float.valueOf(value.getTotal_time_in_seconds()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(5, Float.valueOf(value.getTotal_time_in_seconds()));
                }
                if (value.getCache_hit()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, java.lang.Boolean.valueOf(value.getCache_hit()));
                }
                if (value.getExit_code() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getExit_code()));
                }
                return !Intrinsics.areEqual(value.getPipeline_slug(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(8, value.getPipeline_slug()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientBazelSpawnExecEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getMnemonic(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMnemonic());
                }
                if (!Intrinsics.areEqual(value.getTarget_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTarget_label());
                }
                if (!Float.valueOf(value.getTotal_time_in_seconds()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 5, (int) Float.valueOf(value.getTotal_time_in_seconds()));
                }
                if (value.getCache_hit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) java.lang.Boolean.valueOf(value.getCache_hit()));
                }
                if (value.getExit_code() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getExit_code()));
                }
                if (!Intrinsics.areEqual(value.getPipeline_slug(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPipeline_slug());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientBazelSpawnExecEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPipeline_slug(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPipeline_slug());
                }
                if (value.getExit_code() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getExit_code()));
                }
                if (value.getCache_hit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) java.lang.Boolean.valueOf(value.getCache_hit()));
                }
                if (!Float.valueOf(value.getTotal_time_in_seconds()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 5, (int) Float.valueOf(value.getTotal_time_in_seconds()));
                }
                if (!Intrinsics.areEqual(value.getTarget_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTarget_label());
                }
                if (!Intrinsics.areEqual(value.getMnemonic(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMnemonic());
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
            public ClientBazelSpawnExecEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                float fFloatValue = 0.0f;
                boolean zBooleanValue = false;
                int iIntValue = 0;
                Instant instantDecode = null;
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
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
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    break;
                                case 6:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 7:
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 8:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ClientBazelSpawnExecEvent(clientPlatform, instantDecode, strDecode2, strDecode3, fFloatValue, zBooleanValue, iIntValue, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientBazelSpawnExecEvent redact(ClientBazelSpawnExecEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return ClientBazelSpawnExecEvent.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, 0.0f, false, 0, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
            }
        };
    }
}
