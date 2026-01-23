package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.ClientToolchainEvent;
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
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: ClientToolchainEvent.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003=>?Bu\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J{\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010#R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b7\u0010#R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010!R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<¨\u0006@"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/Environment;", "environment", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventLocation;", "location", "", "name", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventResult;", "result", ErrorBundle.DETAIL_ENTRY, "", "count", "", "magnitude", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/Environment;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventLocation;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventResult;Ljava/lang/String;IFLokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/Environment;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventLocation;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventResult;Ljava/lang/String;IFLokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Lcom/robinhood/rosetta/eventlogging/Environment;", "getEnvironment", "()Lcom/robinhood/rosetta/eventlogging/Environment;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventLocation;", "getLocation", "()Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventLocation;", "Ljava/lang/String;", "getName", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventResult;", "getResult", "()Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventResult;", "getDetails", "I", "getCount", "F", "getMagnitude", "()F", "Companion", "ToolchainEventResult", "ToolchainEventLocation", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientToolchainEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientToolchainEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final int count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String details;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Environment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Environment environment;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientToolchainEvent$ToolchainEventLocation#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ToolchainEventLocation location;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final float magnitude;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String name;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientToolchainEvent$ToolchainEventResult#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final ToolchainEventResult result;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    public ClientToolchainEvent() {
        this(null, null, null, null, null, null, null, 0, 0.0f, null, 1023, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24120newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientToolchainEvent(ClientPlatform clientPlatform, Instant instant, Environment environment, ToolchainEventLocation toolchainEventLocation, String str, ToolchainEventResult toolchainEventResult, String str2, int i, float f, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i2 & 2) != 0 ? null : instant, (i2 & 4) != 0 ? null : environment, (i2 & 8) != 0 ? ToolchainEventLocation.DEFAULT_LOCATION : toolchainEventLocation, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? ToolchainEventResult.TOOLCHAIN_RESULT_UNSPECIFIED : toolchainEventResult, (i2 & 64) != 0 ? "" : str2, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? 0.0f : f, (i2 & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final ToolchainEventLocation getLocation() {
        return this.location;
    }

    public final String getName() {
        return this.name;
    }

    public final ToolchainEventResult getResult() {
        return this.result;
    }

    public final String getDetails() {
        return this.details;
    }

    public final int getCount() {
        return this.count;
    }

    public final float getMagnitude() {
        return this.magnitude;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientToolchainEvent(ClientPlatform platform, Instant instant, Environment environment, ToolchainEventLocation location, String name, ToolchainEventResult result, String details, int i, float f, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.environment = environment;
        this.location = location;
        this.name = name;
        this.result = result;
        this.details = details;
        this.count = i;
        this.magnitude = f;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24120newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientToolchainEvent)) {
            return false;
        }
        ClientToolchainEvent clientToolchainEvent = (ClientToolchainEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientToolchainEvent.unknownFields()) && this.platform == clientToolchainEvent.platform && Intrinsics.areEqual(this.timestamp, clientToolchainEvent.timestamp) && Intrinsics.areEqual(this.environment, clientToolchainEvent.environment) && this.location == clientToolchainEvent.location && Intrinsics.areEqual(this.name, clientToolchainEvent.name) && this.result == clientToolchainEvent.result && Intrinsics.areEqual(this.details, clientToolchainEvent.details) && this.count == clientToolchainEvent.count && this.magnitude == clientToolchainEvent.magnitude;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Environment environment = this.environment;
        int iHashCode3 = ((((((((((((iHashCode2 + (environment != null ? environment.hashCode() : 0)) * 37) + this.location.hashCode()) * 37) + this.name.hashCode()) * 37) + this.result.hashCode()) * 37) + this.details.hashCode()) * 37) + Integer.hashCode(this.count)) * 37) + Float.hashCode(this.magnitude);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("platform=" + this.platform);
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Environment environment = this.environment;
        if (environment != null) {
            arrayList.add("environment=" + environment);
        }
        arrayList.add("location=" + this.location);
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("result=" + this.result);
        arrayList.add("details=" + Internal.sanitize(this.details));
        arrayList.add("count=" + this.count);
        arrayList.add("magnitude=" + this.magnitude);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientToolchainEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientToolchainEvent copy$default(ClientToolchainEvent clientToolchainEvent, ClientPlatform clientPlatform, Instant instant, Environment environment, ToolchainEventLocation toolchainEventLocation, String str, ToolchainEventResult toolchainEventResult, String str2, int i, float f, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            clientPlatform = clientToolchainEvent.platform;
        }
        if ((i2 & 2) != 0) {
            instant = clientToolchainEvent.timestamp;
        }
        if ((i2 & 4) != 0) {
            environment = clientToolchainEvent.environment;
        }
        if ((i2 & 8) != 0) {
            toolchainEventLocation = clientToolchainEvent.location;
        }
        if ((i2 & 16) != 0) {
            str = clientToolchainEvent.name;
        }
        if ((i2 & 32) != 0) {
            toolchainEventResult = clientToolchainEvent.result;
        }
        if ((i2 & 64) != 0) {
            str2 = clientToolchainEvent.details;
        }
        if ((i2 & 128) != 0) {
            i = clientToolchainEvent.count;
        }
        if ((i2 & 256) != 0) {
            f = clientToolchainEvent.magnitude;
        }
        if ((i2 & 512) != 0) {
            byteString = clientToolchainEvent.unknownFields();
        }
        float f2 = f;
        ByteString byteString2 = byteString;
        String str3 = str2;
        int i3 = i;
        String str4 = str;
        ToolchainEventResult toolchainEventResult2 = toolchainEventResult;
        return clientToolchainEvent.copy(clientPlatform, instant, environment, toolchainEventLocation, str4, toolchainEventResult2, str3, i3, f2, byteString2);
    }

    public final ClientToolchainEvent copy(ClientPlatform platform, Instant timestamp, Environment environment, ToolchainEventLocation location, String name, ToolchainEventResult result, String details, int count, float magnitude, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientToolchainEvent(platform, timestamp, environment, location, name, result, details, count, magnitude, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientToolchainEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientToolchainEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientToolchainEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientToolchainEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (value.getEnvironment() != null) {
                    size += Environment.ADAPTER.encodedSizeWithTag(3, value.getEnvironment());
                }
                if (value.getLocation() != ClientToolchainEvent.ToolchainEventLocation.DEFAULT_LOCATION) {
                    size += ClientToolchainEvent.ToolchainEventLocation.ADAPTER.encodedSizeWithTag(4, value.getLocation());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getName());
                }
                if (value.getResult() != ClientToolchainEvent.ToolchainEventResult.TOOLCHAIN_RESULT_UNSPECIFIED) {
                    size += ClientToolchainEvent.ToolchainEventResult.ADAPTER.encodedSizeWithTag(6, value.getResult());
                }
                if (!Intrinsics.areEqual(value.getDetails(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getDetails());
                }
                if (value.getCount() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(8, Integer.valueOf(value.getCount()));
                }
                return !Float.valueOf(value.getMagnitude()).equals(Float.valueOf(0.0f)) ? size + ProtoAdapter.FLOAT.encodedSizeWithTag(9, Float.valueOf(value.getMagnitude())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientToolchainEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (value.getEnvironment() != null) {
                    Environment.ADAPTER.encodeWithTag(writer, 3, (int) value.getEnvironment());
                }
                if (value.getLocation() != ClientToolchainEvent.ToolchainEventLocation.DEFAULT_LOCATION) {
                    ClientToolchainEvent.ToolchainEventLocation.ADAPTER.encodeWithTag(writer, 4, (int) value.getLocation());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getName());
                }
                if (value.getResult() != ClientToolchainEvent.ToolchainEventResult.TOOLCHAIN_RESULT_UNSPECIFIED) {
                    ClientToolchainEvent.ToolchainEventResult.ADAPTER.encodeWithTag(writer, 6, (int) value.getResult());
                }
                if (!Intrinsics.areEqual(value.getDetails(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getDetails());
                }
                if (value.getCount() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getCount()));
                }
                if (!Float.valueOf(value.getMagnitude()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 9, (int) Float.valueOf(value.getMagnitude()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientToolchainEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Float.valueOf(value.getMagnitude()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 9, (int) Float.valueOf(value.getMagnitude()));
                }
                if (value.getCount() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getCount()));
                }
                if (!Intrinsics.areEqual(value.getDetails(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getDetails());
                }
                if (value.getResult() != ClientToolchainEvent.ToolchainEventResult.TOOLCHAIN_RESULT_UNSPECIFIED) {
                    ClientToolchainEvent.ToolchainEventResult.ADAPTER.encodeWithTag(writer, 6, (int) value.getResult());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getName());
                }
                if (value.getLocation() != ClientToolchainEvent.ToolchainEventLocation.DEFAULT_LOCATION) {
                    ClientToolchainEvent.ToolchainEventLocation.ADAPTER.encodeWithTag(writer, 4, (int) value.getLocation());
                }
                if (value.getEnvironment() != null) {
                    Environment.ADAPTER.encodeWithTag(writer, 3, (int) value.getEnvironment());
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
            public ClientToolchainEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                ClientToolchainEvent.ToolchainEventLocation toolchainEventLocation = ClientToolchainEvent.ToolchainEventLocation.DEFAULT_LOCATION;
                ClientToolchainEvent.ToolchainEventResult toolchainEventResult = ClientToolchainEvent.ToolchainEventResult.TOOLCHAIN_RESULT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                float fFloatValue = 0.0f;
                Instant instantDecode = null;
                Environment environmentDecode = null;
                String strDecode2 = strDecode;
                ClientToolchainEvent.ToolchainEventResult toolchainEventResultDecode = toolchainEventResult;
                ClientToolchainEvent.ToolchainEventLocation toolchainEventLocationDecode = toolchainEventLocation;
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
                                    environmentDecode = Environment.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    try {
                                        toolchainEventLocationDecode = ClientToolchainEvent.ToolchainEventLocation.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 5:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    try {
                                        toolchainEventResultDecode = ClientToolchainEvent.ToolchainEventResult.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 7:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 8:
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 9:
                                    fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ClientToolchainEvent(clientPlatform, instantDecode, environmentDecode, toolchainEventLocationDecode, strDecode2, toolchainEventResultDecode, strDecode, iIntValue, fFloatValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientToolchainEvent redact(ClientToolchainEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
                Environment environment = value.getEnvironment();
                return ClientToolchainEvent.copy$default(value, null, instantRedact, environment != null ? Environment.ADAPTER.redact(environment) : null, null, null, null, null, 0, 0.0f, ByteString.EMPTY, 505, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClientToolchainEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventResult;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TOOLCHAIN_RESULT_UNSPECIFIED", "TOOLCHAIN_EVENT_SUCCESS", "TOOLCHAIN_EVENT_FAILURE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class ToolchainEventResult implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ToolchainEventResult[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ToolchainEventResult> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ToolchainEventResult TOOLCHAIN_EVENT_FAILURE;
        public static final ToolchainEventResult TOOLCHAIN_EVENT_SUCCESS;
        public static final ToolchainEventResult TOOLCHAIN_RESULT_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ ToolchainEventResult[] $values() {
            return new ToolchainEventResult[]{TOOLCHAIN_RESULT_UNSPECIFIED, TOOLCHAIN_EVENT_SUCCESS, TOOLCHAIN_EVENT_FAILURE};
        }

        @JvmStatic
        public static final ToolchainEventResult fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ToolchainEventResult> getEntries() {
            return $ENTRIES;
        }

        private ToolchainEventResult(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ToolchainEventResult toolchainEventResult = new ToolchainEventResult("TOOLCHAIN_RESULT_UNSPECIFIED", 0, 0);
            TOOLCHAIN_RESULT_UNSPECIFIED = toolchainEventResult;
            TOOLCHAIN_EVENT_SUCCESS = new ToolchainEventResult("TOOLCHAIN_EVENT_SUCCESS", 1, 1);
            TOOLCHAIN_EVENT_FAILURE = new ToolchainEventResult("TOOLCHAIN_EVENT_FAILURE", 2, 2);
            ToolchainEventResult[] toolchainEventResultArr$values = $values();
            $VALUES = toolchainEventResultArr$values;
            $ENTRIES = EnumEntries2.enumEntries(toolchainEventResultArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ToolchainEventResult.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ToolchainEventResult>(orCreateKotlinClass, syntax, toolchainEventResult) { // from class: com.robinhood.rosetta.eventlogging.ClientToolchainEvent$ToolchainEventResult$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ClientToolchainEvent.ToolchainEventResult fromValue(int value) {
                    return ClientToolchainEvent.ToolchainEventResult.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ClientToolchainEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventResult$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventResult;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ToolchainEventResult fromValue(int value) {
                if (value == 0) {
                    return ToolchainEventResult.TOOLCHAIN_RESULT_UNSPECIFIED;
                }
                if (value == 1) {
                    return ToolchainEventResult.TOOLCHAIN_EVENT_SUCCESS;
                }
                if (value != 2) {
                    return null;
                }
                return ToolchainEventResult.TOOLCHAIN_EVENT_FAILURE;
            }
        }

        public static ToolchainEventResult valueOf(String str) {
            return (ToolchainEventResult) Enum.valueOf(ToolchainEventResult.class, str);
        }

        public static ToolchainEventResult[] values() {
            return (ToolchainEventResult[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClientToolchainEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventLocation;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT_LOCATION", "LOCAL", "CI", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class ToolchainEventLocation implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ToolchainEventLocation[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ToolchainEventLocation> ADAPTER;

        /* renamed from: CI */
        public static final ToolchainEventLocation f5972CI;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ToolchainEventLocation DEFAULT_LOCATION;
        public static final ToolchainEventLocation LOCAL;
        private final int value;

        private static final /* synthetic */ ToolchainEventLocation[] $values() {
            return new ToolchainEventLocation[]{DEFAULT_LOCATION, LOCAL, f5972CI};
        }

        @JvmStatic
        public static final ToolchainEventLocation fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ToolchainEventLocation> getEntries() {
            return $ENTRIES;
        }

        private ToolchainEventLocation(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ToolchainEventLocation toolchainEventLocation = new ToolchainEventLocation("DEFAULT_LOCATION", 0, 0);
            DEFAULT_LOCATION = toolchainEventLocation;
            LOCAL = new ToolchainEventLocation("LOCAL", 1, 1);
            f5972CI = new ToolchainEventLocation("CI", 2, 2);
            ToolchainEventLocation[] toolchainEventLocationArr$values = $values();
            $VALUES = toolchainEventLocationArr$values;
            $ENTRIES = EnumEntries2.enumEntries(toolchainEventLocationArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ToolchainEventLocation.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ToolchainEventLocation>(orCreateKotlinClass, syntax, toolchainEventLocation) { // from class: com.robinhood.rosetta.eventlogging.ClientToolchainEvent$ToolchainEventLocation$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ClientToolchainEvent.ToolchainEventLocation fromValue(int value) {
                    return ClientToolchainEvent.ToolchainEventLocation.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ClientToolchainEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventLocation$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventLocation;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ToolchainEventLocation fromValue(int value) {
                if (value == 0) {
                    return ToolchainEventLocation.DEFAULT_LOCATION;
                }
                if (value == 1) {
                    return ToolchainEventLocation.LOCAL;
                }
                if (value != 2) {
                    return null;
                }
                return ToolchainEventLocation.f5972CI;
            }
        }

        public static ToolchainEventLocation valueOf(String str) {
            return (ToolchainEventLocation) Enum.valueOf(ToolchainEventLocation.class, str);
        }

        public static ToolchainEventLocation[] values() {
            return (ToolchainEventLocation[]) $VALUES.clone();
        }
    }
}
