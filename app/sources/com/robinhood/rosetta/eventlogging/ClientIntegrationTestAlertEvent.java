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
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: ClientIntegrationTestAlertEvent.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013BU\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ[\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u001fR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertType;", "alert_type", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;", "test_type", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContext;", "context", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertType;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContext;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertType;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContext;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertType;", "getAlert_type", "()Lcom/robinhood/rosetta/eventlogging/ClientIntegrationTestAlertType;", "Ljava/lang/String;", "getDetails", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;", "getTest_type", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContext;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContext;", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientIntegrationTestAlertEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientIntegrationTestAlertEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientIntegrationTestAlertType#ADAPTER", jsonName = "alertType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ClientIntegrationTestAlertType alert_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientTestSuiteContext#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final ClientTestSuiteContext context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String details;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientTestSuiteType#ADAPTER", jsonName = "testType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final ClientTestSuiteType test_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    public ClientIntegrationTestAlertEvent() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24103newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientIntegrationTestAlertEvent(ClientPlatform clientPlatform, Instant instant, ClientIntegrationTestAlertType clientIntegrationTestAlertType, String str, ClientTestSuiteType clientTestSuiteType, ClientTestSuiteContext clientTestSuiteContext, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? ClientIntegrationTestAlertType.DEFAULT_INTEGRATION_TEST_ALERT_TYPE : clientIntegrationTestAlertType, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ClientTestSuiteType.DEFAULT_TEST_TYPE : clientTestSuiteType, (i & 32) != 0 ? ClientTestSuiteContext.DEFAULT_TEST_SUITE_CONTEXT : clientTestSuiteContext, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final ClientIntegrationTestAlertType getAlert_type() {
        return this.alert_type;
    }

    public final String getDetails() {
        return this.details;
    }

    public final ClientTestSuiteType getTest_type() {
        return this.test_type;
    }

    public final ClientTestSuiteContext getContext() {
        return this.context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientIntegrationTestAlertEvent(ClientPlatform platform, Instant instant, ClientIntegrationTestAlertType alert_type, String details, ClientTestSuiteType test_type, ClientTestSuiteContext context, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(alert_type, "alert_type");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(test_type, "test_type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.alert_type = alert_type;
        this.details = details;
        this.test_type = test_type;
        this.context = context;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24103newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientIntegrationTestAlertEvent)) {
            return false;
        }
        ClientIntegrationTestAlertEvent clientIntegrationTestAlertEvent = (ClientIntegrationTestAlertEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientIntegrationTestAlertEvent.unknownFields()) && this.platform == clientIntegrationTestAlertEvent.platform && Intrinsics.areEqual(this.timestamp, clientIntegrationTestAlertEvent.timestamp) && this.alert_type == clientIntegrationTestAlertEvent.alert_type && Intrinsics.areEqual(this.details, clientIntegrationTestAlertEvent.details) && this.test_type == clientIntegrationTestAlertEvent.test_type && this.context == clientIntegrationTestAlertEvent.context;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.alert_type.hashCode()) * 37) + this.details.hashCode()) * 37) + this.test_type.hashCode()) * 37) + this.context.hashCode();
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
        arrayList.add("alert_type=" + this.alert_type);
        arrayList.add("details=" + Internal.sanitize(this.details));
        arrayList.add("test_type=" + this.test_type);
        arrayList.add("context=" + this.context);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientIntegrationTestAlertEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientIntegrationTestAlertEvent copy$default(ClientIntegrationTestAlertEvent clientIntegrationTestAlertEvent, ClientPlatform clientPlatform, Instant instant, ClientIntegrationTestAlertType clientIntegrationTestAlertType, String str, ClientTestSuiteType clientTestSuiteType, ClientTestSuiteContext clientTestSuiteContext, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            clientPlatform = clientIntegrationTestAlertEvent.platform;
        }
        if ((i & 2) != 0) {
            instant = clientIntegrationTestAlertEvent.timestamp;
        }
        if ((i & 4) != 0) {
            clientIntegrationTestAlertType = clientIntegrationTestAlertEvent.alert_type;
        }
        if ((i & 8) != 0) {
            str = clientIntegrationTestAlertEvent.details;
        }
        if ((i & 16) != 0) {
            clientTestSuiteType = clientIntegrationTestAlertEvent.test_type;
        }
        if ((i & 32) != 0) {
            clientTestSuiteContext = clientIntegrationTestAlertEvent.context;
        }
        if ((i & 64) != 0) {
            byteString = clientIntegrationTestAlertEvent.unknownFields();
        }
        ClientTestSuiteContext clientTestSuiteContext2 = clientTestSuiteContext;
        ByteString byteString2 = byteString;
        ClientTestSuiteType clientTestSuiteType2 = clientTestSuiteType;
        ClientIntegrationTestAlertType clientIntegrationTestAlertType2 = clientIntegrationTestAlertType;
        return clientIntegrationTestAlertEvent.copy(clientPlatform, instant, clientIntegrationTestAlertType2, str, clientTestSuiteType2, clientTestSuiteContext2, byteString2);
    }

    public final ClientIntegrationTestAlertEvent copy(ClientPlatform platform, Instant timestamp, ClientIntegrationTestAlertType alert_type, String details, ClientTestSuiteType test_type, ClientTestSuiteContext context, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(alert_type, "alert_type");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(test_type, "test_type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientIntegrationTestAlertEvent(platform, timestamp, alert_type, details, test_type, context, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientIntegrationTestAlertEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientIntegrationTestAlertEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientIntegrationTestAlertEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientIntegrationTestAlertEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (value.getAlert_type() != ClientIntegrationTestAlertType.DEFAULT_INTEGRATION_TEST_ALERT_TYPE) {
                    size += ClientIntegrationTestAlertType.ADAPTER.encodedSizeWithTag(3, value.getAlert_type());
                }
                if (!Intrinsics.areEqual(value.getDetails(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDetails());
                }
                if (value.getTest_type() != ClientTestSuiteType.DEFAULT_TEST_TYPE) {
                    size += ClientTestSuiteType.ADAPTER.encodedSizeWithTag(5, value.getTest_type());
                }
                return value.getContext() != ClientTestSuiteContext.DEFAULT_TEST_SUITE_CONTEXT ? size + ClientTestSuiteContext.ADAPTER.encodedSizeWithTag(6, value.getContext()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientIntegrationTestAlertEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (value.getAlert_type() != ClientIntegrationTestAlertType.DEFAULT_INTEGRATION_TEST_ALERT_TYPE) {
                    ClientIntegrationTestAlertType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAlert_type());
                }
                if (!Intrinsics.areEqual(value.getDetails(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDetails());
                }
                if (value.getTest_type() != ClientTestSuiteType.DEFAULT_TEST_TYPE) {
                    ClientTestSuiteType.ADAPTER.encodeWithTag(writer, 5, (int) value.getTest_type());
                }
                if (value.getContext() != ClientTestSuiteContext.DEFAULT_TEST_SUITE_CONTEXT) {
                    ClientTestSuiteContext.ADAPTER.encodeWithTag(writer, 6, (int) value.getContext());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientIntegrationTestAlertEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getContext() != ClientTestSuiteContext.DEFAULT_TEST_SUITE_CONTEXT) {
                    ClientTestSuiteContext.ADAPTER.encodeWithTag(writer, 6, (int) value.getContext());
                }
                if (value.getTest_type() != ClientTestSuiteType.DEFAULT_TEST_TYPE) {
                    ClientTestSuiteType.ADAPTER.encodeWithTag(writer, 5, (int) value.getTest_type());
                }
                if (!Intrinsics.areEqual(value.getDetails(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDetails());
                }
                if (value.getAlert_type() != ClientIntegrationTestAlertType.DEFAULT_INTEGRATION_TEST_ALERT_TYPE) {
                    ClientIntegrationTestAlertType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAlert_type());
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
            public ClientIntegrationTestAlertEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                ClientIntegrationTestAlertType clientIntegrationTestAlertType = ClientIntegrationTestAlertType.DEFAULT_INTEGRATION_TEST_ALERT_TYPE;
                ClientTestSuiteType clientTestSuiteType = ClientTestSuiteType.DEFAULT_TEST_TYPE;
                ClientTestSuiteContext clientTestSuiteContext = ClientTestSuiteContext.DEFAULT_TEST_SUITE_CONTEXT;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                ClientTestSuiteContext clientTestSuiteContextDecode = clientTestSuiteContext;
                ClientTestSuiteType clientTestSuiteTypeDecode = clientTestSuiteType;
                ClientIntegrationTestAlertType clientIntegrationTestAlertTypeDecode = clientIntegrationTestAlertType;
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
                                    try {
                                        clientIntegrationTestAlertTypeDecode = ClientIntegrationTestAlertType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    try {
                                        clientTestSuiteTypeDecode = ClientTestSuiteType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 6:
                                    try {
                                        clientTestSuiteContextDecode = ClientTestSuiteContext.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ClientIntegrationTestAlertEvent(clientPlatform, instantDecode, clientIntegrationTestAlertTypeDecode, strDecode, clientTestSuiteTypeDecode, clientTestSuiteContextDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientIntegrationTestAlertEvent redact(ClientIntegrationTestAlertEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return ClientIntegrationTestAlertEvent.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, null, ByteString.EMPTY, 61, null);
            }
        };
    }
}
