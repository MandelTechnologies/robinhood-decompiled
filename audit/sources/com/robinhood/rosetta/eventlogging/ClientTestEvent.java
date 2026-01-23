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

/* compiled from: ClientTestEvent.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B}\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u0083\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010#R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b.\u0010#R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b/\u0010#R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b6\u0010#R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b\u0014\u0010;¨\u0006="}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "name", "class_name", "module", "", "duration", "Lcom/robinhood/rosetta/eventlogging/ClientTestResult;", "result", "test_suite_id", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;", "test_type", "", "is_flaky", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/robinhood/rosetta/eventlogging/ClientTestResult;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;ZLokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/robinhood/rosetta/eventlogging/ClientTestResult;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;ZLokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientTestEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Ljava/lang/String;", "getName", "getClass_name", "getModule", "F", "getDuration", "()F", "Lcom/robinhood/rosetta/eventlogging/ClientTestResult;", "getResult", "()Lcom/robinhood/rosetta/eventlogging/ClientTestResult;", "getTest_suite_id", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;", "getTest_type", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;", "Z", "()Z", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientTestEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientTestEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "className", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String class_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final float duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isFlaky", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final boolean is_flaky;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String module;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String name;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientTestResult#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final ClientTestResult result;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "testSuiteId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String test_suite_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientTestSuiteType#ADAPTER", jsonName = "testType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final ClientTestSuiteType test_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    public ClientTestEvent() {
        this(null, null, null, null, null, 0.0f, null, null, null, false, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24115newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientTestEvent(ClientPlatform clientPlatform, Instant instant, String str, String str2, String str3, float f, ClientTestResult clientTestResult, String str4, ClientTestSuiteType clientTestSuiteType, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? 0.0f : f, (i & 64) != 0 ? ClientTestResult.DEFAULT_TEST_RESULT : clientTestResult, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? ClientTestSuiteType.DEFAULT_TEST_TYPE : clientTestSuiteType, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getName() {
        return this.name;
    }

    public final String getClass_name() {
        return this.class_name;
    }

    public final String getModule() {
        return this.module;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final ClientTestResult getResult() {
        return this.result;
    }

    public final String getTest_suite_id() {
        return this.test_suite_id;
    }

    public final ClientTestSuiteType getTest_type() {
        return this.test_type;
    }

    /* renamed from: is_flaky, reason: from getter */
    public final boolean getIs_flaky() {
        return this.is_flaky;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientTestEvent(ClientPlatform platform, Instant instant, String name, String class_name, String module, float f, ClientTestResult result, String test_suite_id, ClientTestSuiteType test_type, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(class_name, "class_name");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(test_suite_id, "test_suite_id");
        Intrinsics.checkNotNullParameter(test_type, "test_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.name = name;
        this.class_name = class_name;
        this.module = module;
        this.duration = f;
        this.result = result;
        this.test_suite_id = test_suite_id;
        this.test_type = test_type;
        this.is_flaky = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24115newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientTestEvent)) {
            return false;
        }
        ClientTestEvent clientTestEvent = (ClientTestEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientTestEvent.unknownFields()) && this.platform == clientTestEvent.platform && Intrinsics.areEqual(this.timestamp, clientTestEvent.timestamp) && Intrinsics.areEqual(this.name, clientTestEvent.name) && Intrinsics.areEqual(this.class_name, clientTestEvent.class_name) && Intrinsics.areEqual(this.module, clientTestEvent.module) && this.duration == clientTestEvent.duration && this.result == clientTestEvent.result && Intrinsics.areEqual(this.test_suite_id, clientTestEvent.test_suite_id) && this.test_type == clientTestEvent.test_type && this.is_flaky == clientTestEvent.is_flaky;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.name.hashCode()) * 37) + this.class_name.hashCode()) * 37) + this.module.hashCode()) * 37) + Float.hashCode(this.duration)) * 37) + this.result.hashCode()) * 37) + this.test_suite_id.hashCode()) * 37) + this.test_type.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_flaky);
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
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("class_name=" + Internal.sanitize(this.class_name));
        arrayList.add("module=" + Internal.sanitize(this.module));
        arrayList.add("duration=" + this.duration);
        arrayList.add("result=" + this.result);
        arrayList.add("test_suite_id=" + Internal.sanitize(this.test_suite_id));
        arrayList.add("test_type=" + this.test_type);
        arrayList.add("is_flaky=" + this.is_flaky);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientTestEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientTestEvent copy$default(ClientTestEvent clientTestEvent, ClientPlatform clientPlatform, Instant instant, String str, String str2, String str3, float f, ClientTestResult clientTestResult, String str4, ClientTestSuiteType clientTestSuiteType, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            clientPlatform = clientTestEvent.platform;
        }
        if ((i & 2) != 0) {
            instant = clientTestEvent.timestamp;
        }
        if ((i & 4) != 0) {
            str = clientTestEvent.name;
        }
        if ((i & 8) != 0) {
            str2 = clientTestEvent.class_name;
        }
        if ((i & 16) != 0) {
            str3 = clientTestEvent.module;
        }
        if ((i & 32) != 0) {
            f = clientTestEvent.duration;
        }
        if ((i & 64) != 0) {
            clientTestResult = clientTestEvent.result;
        }
        if ((i & 128) != 0) {
            str4 = clientTestEvent.test_suite_id;
        }
        if ((i & 256) != 0) {
            clientTestSuiteType = clientTestEvent.test_type;
        }
        if ((i & 512) != 0) {
            z = clientTestEvent.is_flaky;
        }
        if ((i & 1024) != 0) {
            byteString = clientTestEvent.unknownFields();
        }
        boolean z2 = z;
        ByteString byteString2 = byteString;
        String str5 = str4;
        ClientTestSuiteType clientTestSuiteType2 = clientTestSuiteType;
        float f2 = f;
        ClientTestResult clientTestResult2 = clientTestResult;
        String str6 = str3;
        String str7 = str;
        return clientTestEvent.copy(clientPlatform, instant, str7, str2, str6, f2, clientTestResult2, str5, clientTestSuiteType2, z2, byteString2);
    }

    public final ClientTestEvent copy(ClientPlatform platform, Instant timestamp, String name, String class_name, String module, float duration, ClientTestResult result, String test_suite_id, ClientTestSuiteType test_type, boolean is_flaky, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(class_name, "class_name");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(test_suite_id, "test_suite_id");
        Intrinsics.checkNotNullParameter(test_type, "test_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientTestEvent(platform, timestamp, name, class_name, module, duration, result, test_suite_id, test_type, is_flaky, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientTestEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientTestEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientTestEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientTestEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getName());
                }
                if (!Intrinsics.areEqual(value.getClass_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getClass_name());
                }
                if (!Intrinsics.areEqual(value.getModule(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getModule());
                }
                if (!Float.valueOf(value.getDuration()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.getDuration()));
                }
                if (value.getResult() != ClientTestResult.DEFAULT_TEST_RESULT) {
                    size += ClientTestResult.ADAPTER.encodedSizeWithTag(7, value.getResult());
                }
                if (!Intrinsics.areEqual(value.getTest_suite_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getTest_suite_id());
                }
                if (value.getTest_type() != ClientTestSuiteType.DEFAULT_TEST_TYPE) {
                    size += ClientTestSuiteType.ADAPTER.encodedSizeWithTag(9, value.getTest_type());
                }
                return value.getIs_flaky() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(10, java.lang.Boolean.valueOf(value.getIs_flaky())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientTestEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getClass_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getClass_name());
                }
                if (!Intrinsics.areEqual(value.getModule(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getModule());
                }
                if (!Float.valueOf(value.getDuration()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 6, (int) Float.valueOf(value.getDuration()));
                }
                if (value.getResult() != ClientTestResult.DEFAULT_TEST_RESULT) {
                    ClientTestResult.ADAPTER.encodeWithTag(writer, 7, (int) value.getResult());
                }
                if (!Intrinsics.areEqual(value.getTest_suite_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getTest_suite_id());
                }
                if (value.getTest_type() != ClientTestSuiteType.DEFAULT_TEST_TYPE) {
                    ClientTestSuiteType.ADAPTER.encodeWithTag(writer, 9, (int) value.getTest_type());
                }
                if (value.getIs_flaky()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) java.lang.Boolean.valueOf(value.getIs_flaky()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientTestEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_flaky()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) java.lang.Boolean.valueOf(value.getIs_flaky()));
                }
                if (value.getTest_type() != ClientTestSuiteType.DEFAULT_TEST_TYPE) {
                    ClientTestSuiteType.ADAPTER.encodeWithTag(writer, 9, (int) value.getTest_type());
                }
                if (!Intrinsics.areEqual(value.getTest_suite_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getTest_suite_id());
                }
                if (value.getResult() != ClientTestResult.DEFAULT_TEST_RESULT) {
                    ClientTestResult.ADAPTER.encodeWithTag(writer, 7, (int) value.getResult());
                }
                if (!Float.valueOf(value.getDuration()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 6, (int) Float.valueOf(value.getDuration()));
                }
                if (!Intrinsics.areEqual(value.getModule(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getModule());
                }
                if (!Intrinsics.areEqual(value.getClass_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getClass_name());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
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
            public ClientTestEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                ClientTestResult clientTestResult = ClientTestResult.DEFAULT_TEST_RESULT;
                ClientTestSuiteType clientTestSuiteType = ClientTestSuiteType.DEFAULT_TEST_TYPE;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                float fFloatValue = 0.0f;
                boolean zBooleanValue = false;
                Instant instantDecode = null;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                ClientTestSuiteType clientTestSuiteTypeDecode = clientTestSuiteType;
                ClientTestResult clientTestResultDecode = clientTestResult;
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
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    break;
                                case 7:
                                    try {
                                        clientTestResultDecode = ClientTestResult.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 8:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 9:
                                    try {
                                        clientTestSuiteTypeDecode = ClientTestSuiteType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 10:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ClientTestEvent(clientPlatform, instantDecode, strDecode3, strDecode4, strDecode, fFloatValue, clientTestResultDecode, strDecode2, clientTestSuiteTypeDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientTestEvent redact(ClientTestEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return ClientTestEvent.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, 0.0f, null, null, null, false, ByteString.EMPTY, 1021, null);
            }
        };
    }
}
