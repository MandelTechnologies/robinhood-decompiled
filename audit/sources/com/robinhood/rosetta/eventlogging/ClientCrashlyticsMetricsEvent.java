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

/* compiled from: ClientCrashlyticsMetricsEvent.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00012Bi\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJo\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u001dR\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b*\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b+\u0010\u001dR\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b,\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u0010\u001f¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "crashed_users", "total_users", "crashed_sessions", "total_sessions", "Lcom/robinhood/rosetta/eventlogging/ClientApp;", "app", "", "source", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;IIIILcom/robinhood/rosetta/eventlogging/ClientApp;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;IIIILcom/robinhood/rosetta/eventlogging/ClientApp;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "I", "getCrashed_users", "getTotal_users", "getCrashed_sessions", "getTotal_sessions", "Lcom/robinhood/rosetta/eventlogging/ClientApp;", "getApp", "()Lcom/robinhood/rosetta/eventlogging/ClientApp;", "Ljava/lang/String;", "getSource", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientCrashlyticsMetricsEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientCrashlyticsMetricsEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientApp#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final ClientApp app;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "crashedSessions", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int crashed_sessions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "crashedUsers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int crashed_users;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalSessions", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int total_sessions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalUsers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int total_users;

    public ClientCrashlyticsMetricsEvent() {
        this(null, null, 0, 0, 0, 0, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24096newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientCrashlyticsMetricsEvent(ClientPlatform clientPlatform, Instant instant, int i, int i2, int i3, int i4, ClientApp clientApp, String str, ByteString byteString, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i5 & 2) != 0 ? null : instant, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4, (i5 & 64) != 0 ? ClientApp.CLIENT_APP_UNDEFINED : clientApp, (i5 & 128) != 0 ? "" : str, (i5 & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final int getCrashed_users() {
        return this.crashed_users;
    }

    public final int getTotal_users() {
        return this.total_users;
    }

    public final int getCrashed_sessions() {
        return this.crashed_sessions;
    }

    public final int getTotal_sessions() {
        return this.total_sessions;
    }

    public final ClientApp getApp() {
        return this.app;
    }

    public final String getSource() {
        return this.source;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientCrashlyticsMetricsEvent(ClientPlatform platform, Instant instant, int i, int i2, int i3, int i4, ClientApp app, String source, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.crashed_users = i;
        this.total_users = i2;
        this.crashed_sessions = i3;
        this.total_sessions = i4;
        this.app = app;
        this.source = source;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24096newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientCrashlyticsMetricsEvent)) {
            return false;
        }
        ClientCrashlyticsMetricsEvent clientCrashlyticsMetricsEvent = (ClientCrashlyticsMetricsEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientCrashlyticsMetricsEvent.unknownFields()) && this.platform == clientCrashlyticsMetricsEvent.platform && Intrinsics.areEqual(this.timestamp, clientCrashlyticsMetricsEvent.timestamp) && this.crashed_users == clientCrashlyticsMetricsEvent.crashed_users && this.total_users == clientCrashlyticsMetricsEvent.total_users && this.crashed_sessions == clientCrashlyticsMetricsEvent.crashed_sessions && this.total_sessions == clientCrashlyticsMetricsEvent.total_sessions && this.app == clientCrashlyticsMetricsEvent.app && Intrinsics.areEqual(this.source, clientCrashlyticsMetricsEvent.source);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + Integer.hashCode(this.crashed_users)) * 37) + Integer.hashCode(this.total_users)) * 37) + Integer.hashCode(this.crashed_sessions)) * 37) + Integer.hashCode(this.total_sessions)) * 37) + this.app.hashCode()) * 37) + this.source.hashCode();
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
        arrayList.add("crashed_users=" + this.crashed_users);
        arrayList.add("total_users=" + this.total_users);
        arrayList.add("crashed_sessions=" + this.crashed_sessions);
        arrayList.add("total_sessions=" + this.total_sessions);
        arrayList.add("app=" + this.app);
        arrayList.add("source=" + Internal.sanitize(this.source));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientCrashlyticsMetricsEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientCrashlyticsMetricsEvent copy$default(ClientCrashlyticsMetricsEvent clientCrashlyticsMetricsEvent, ClientPlatform clientPlatform, Instant instant, int i, int i2, int i3, int i4, ClientApp clientApp, String str, ByteString byteString, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            clientPlatform = clientCrashlyticsMetricsEvent.platform;
        }
        if ((i5 & 2) != 0) {
            instant = clientCrashlyticsMetricsEvent.timestamp;
        }
        if ((i5 & 4) != 0) {
            i = clientCrashlyticsMetricsEvent.crashed_users;
        }
        if ((i5 & 8) != 0) {
            i2 = clientCrashlyticsMetricsEvent.total_users;
        }
        if ((i5 & 16) != 0) {
            i3 = clientCrashlyticsMetricsEvent.crashed_sessions;
        }
        if ((i5 & 32) != 0) {
            i4 = clientCrashlyticsMetricsEvent.total_sessions;
        }
        if ((i5 & 64) != 0) {
            clientApp = clientCrashlyticsMetricsEvent.app;
        }
        if ((i5 & 128) != 0) {
            str = clientCrashlyticsMetricsEvent.source;
        }
        if ((i5 & 256) != 0) {
            byteString = clientCrashlyticsMetricsEvent.unknownFields();
        }
        String str2 = str;
        ByteString byteString2 = byteString;
        int i6 = i4;
        ClientApp clientApp2 = clientApp;
        int i7 = i3;
        int i8 = i;
        return clientCrashlyticsMetricsEvent.copy(clientPlatform, instant, i8, i2, i7, i6, clientApp2, str2, byteString2);
    }

    public final ClientCrashlyticsMetricsEvent copy(ClientPlatform platform, Instant timestamp, int crashed_users, int total_users, int crashed_sessions, int total_sessions, ClientApp app, String source, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientCrashlyticsMetricsEvent(platform, timestamp, crashed_users, total_users, crashed_sessions, total_sessions, app, source, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientCrashlyticsMetricsEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientCrashlyticsMetricsEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientCrashlyticsMetricsEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientCrashlyticsMetricsEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (value.getCrashed_users() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getCrashed_users()));
                }
                if (value.getTotal_users() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getTotal_users()));
                }
                if (value.getCrashed_sessions() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getCrashed_sessions()));
                }
                if (value.getTotal_sessions() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getTotal_sessions()));
                }
                if (value.getApp() != ClientApp.CLIENT_APP_UNDEFINED) {
                    size += ClientApp.ADAPTER.encodedSizeWithTag(7, value.getApp());
                }
                return !Intrinsics.areEqual(value.getSource(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(8, value.getSource()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientCrashlyticsMetricsEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (value.getCrashed_users() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getCrashed_users()));
                }
                if (value.getTotal_users() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getTotal_users()));
                }
                if (value.getCrashed_sessions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getCrashed_sessions()));
                }
                if (value.getTotal_sessions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getTotal_sessions()));
                }
                if (value.getApp() != ClientApp.CLIENT_APP_UNDEFINED) {
                    ClientApp.ADAPTER.encodeWithTag(writer, 7, (int) value.getApp());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getSource());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientCrashlyticsMetricsEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getSource());
                }
                if (value.getApp() != ClientApp.CLIENT_APP_UNDEFINED) {
                    ClientApp.ADAPTER.encodeWithTag(writer, 7, (int) value.getApp());
                }
                if (value.getTotal_sessions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getTotal_sessions()));
                }
                if (value.getCrashed_sessions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getCrashed_sessions()));
                }
                if (value.getTotal_users() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getTotal_users()));
                }
                if (value.getCrashed_users() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getCrashed_users()));
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
            public ClientCrashlyticsMetricsEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                ClientApp clientApp = ClientApp.CLIENT_APP_UNDEFINED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                int iIntValue4 = 0;
                Instant instantDecode = null;
                ClientApp clientAppDecode = clientApp;
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
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 4:
                                    iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 5:
                                    iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 6:
                                    iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 7:
                                    try {
                                        clientAppDecode = ClientApp.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 8:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ClientCrashlyticsMetricsEvent(clientPlatform, instantDecode, iIntValue, iIntValue2, iIntValue3, iIntValue4, clientAppDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientCrashlyticsMetricsEvent redact(ClientCrashlyticsMetricsEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return ClientCrashlyticsMetricsEvent.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, 0, 0, 0, 0, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
            }
        };
    }
}
