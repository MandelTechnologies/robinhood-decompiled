package com.robinhood.rosetta.eventlogging;

import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.rosetta.eventlogging.Event;
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

/* compiled from: RhGlobalLoggingEvent.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B\u009f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00105\u001a\u00020\u0002H\u0017J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0096\u0002J\b\u0010:\u001a\u00020\u0014H\u0016J\b\u0010;\u001a\u00020\fH\u0016J\u009e\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u001bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0019\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010'¨\u0006>"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RhGlobalLoggingEvent;", "Lcom/squareup/wire/Message;", "", "user", "Lcom/robinhood/rosetta/eventlogging/User;", "device", "Lcom/robinhood/rosetta/eventlogging/Device;", "app", "Lcom/robinhood/rosetta/eventlogging/Application;", "event", "Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEvent;", "timestamp", "", "client_ip", "event_hash", "geoip", "Lcom/robinhood/rosetta/eventlogging/GeoIP;", "authenticated", "Lcom/robinhood/rosetta/eventlogging/Authentication;", "created_at", "", "network_connection", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", "event_schema_type", "Lcom/robinhood/rosetta/eventlogging/Event$Type;", "masked_client_ip", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/User;Lcom/robinhood/rosetta/eventlogging/Device;Lcom/robinhood/rosetta/eventlogging/Application;Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/GeoIP;Lcom/robinhood/rosetta/eventlogging/Authentication;ILcom/robinhood/rosetta/eventlogging/NetworkConnection;Lcom/robinhood/rosetta/eventlogging/Event$Type;Ljava/lang/String;Lokio/ByteString;)V", "getUser", "()Lcom/robinhood/rosetta/eventlogging/User;", "getDevice", "()Lcom/robinhood/rosetta/eventlogging/Device;", "getApp", "()Lcom/robinhood/rosetta/eventlogging/Application;", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEvent;", "getTimestamp", "()Ljava/lang/String;", "getClient_ip", "getEvent_hash", "getGeoip", "()Lcom/robinhood/rosetta/eventlogging/GeoIP;", "getAuthenticated", "()Lcom/robinhood/rosetta/eventlogging/Authentication;", "getCreated_at", "()I", "getNetwork_connection", "()Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", "getEvent_schema_type", "()Lcom/robinhood/rosetta/eventlogging/Event$Type;", "getMasked_client_ip", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class RhGlobalLoggingEvent extends Message {

    @JvmField
    public static final ProtoAdapter<RhGlobalLoggingEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Application#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Application app;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Authentication#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Authentication authenticated;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clientIp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String client_ip;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final int created_at;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Device#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Device device;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RhGlobalAppEvent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final RhGlobalAppEvent event;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventHash", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String event_hash;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Event$Type#ADAPTER", jsonName = "eventSchemaType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Event.Type event_schema_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.GeoIP#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final GeoIP geoip;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedClientIp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = ErrorCodes.SSL_HANDSHAKE_EXCEPTION)
    private final String masked_client_ip;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NetworkConnection#ADAPTER", jsonName = "networkConnection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final NetworkConnection network_connection;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String timestamp;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.User#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final User user;

    public RhGlobalLoggingEvent() {
        this(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, 16383, null);
    }

    public /* synthetic */ RhGlobalLoggingEvent(User user, Device device, Application application, RhGlobalAppEvent rhGlobalAppEvent, String str, String str2, String str3, GeoIP geoIP, Authentication authentication, int i, NetworkConnection networkConnection, Event.Type type2, String str4, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : user, (i2 & 2) != 0 ? null : device, (i2 & 4) != 0 ? null : application, (i2 & 8) != 0 ? null : rhGlobalAppEvent, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? "" : str3, (i2 & 128) != 0 ? null : geoIP, (i2 & 256) != 0 ? Authentication.DEFAULT_AUTH : authentication, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) == 0 ? networkConnection : null, (i2 & 2048) != 0 ? Event.Type.DEFAULT_TYPE : type2, (i2 & 4096) == 0 ? str4 : "", (i2 & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24543newBuilder();
    }

    public final User getUser() {
        return this.user;
    }

    public final Device getDevice() {
        return this.device;
    }

    public final Application getApp() {
        return this.app;
    }

    public final RhGlobalAppEvent getEvent() {
        return this.event;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getClient_ip() {
        return this.client_ip;
    }

    public final String getEvent_hash() {
        return this.event_hash;
    }

    public final GeoIP getGeoip() {
        return this.geoip;
    }

    public final Authentication getAuthenticated() {
        return this.authenticated;
    }

    public final int getCreated_at() {
        return this.created_at;
    }

    public final NetworkConnection getNetwork_connection() {
        return this.network_connection;
    }

    public final Event.Type getEvent_schema_type() {
        return this.event_schema_type;
    }

    public final String getMasked_client_ip() {
        return this.masked_client_ip;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhGlobalLoggingEvent(User user, Device device, Application application, RhGlobalAppEvent rhGlobalAppEvent, String timestamp, String client_ip, String event_hash, GeoIP geoIP, Authentication authenticated, int i, NetworkConnection networkConnection, Event.Type event_schema_type, String masked_client_ip, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(client_ip, "client_ip");
        Intrinsics.checkNotNullParameter(event_hash, "event_hash");
        Intrinsics.checkNotNullParameter(authenticated, "authenticated");
        Intrinsics.checkNotNullParameter(event_schema_type, "event_schema_type");
        Intrinsics.checkNotNullParameter(masked_client_ip, "masked_client_ip");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user = user;
        this.device = device;
        this.app = application;
        this.event = rhGlobalAppEvent;
        this.timestamp = timestamp;
        this.client_ip = client_ip;
        this.event_hash = event_hash;
        this.geoip = geoIP;
        this.authenticated = authenticated;
        this.created_at = i;
        this.network_connection = networkConnection;
        this.event_schema_type = event_schema_type;
        this.masked_client_ip = masked_client_ip;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24543newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RhGlobalLoggingEvent)) {
            return false;
        }
        RhGlobalLoggingEvent rhGlobalLoggingEvent = (RhGlobalLoggingEvent) other;
        return Intrinsics.areEqual(unknownFields(), rhGlobalLoggingEvent.unknownFields()) && Intrinsics.areEqual(this.user, rhGlobalLoggingEvent.user) && Intrinsics.areEqual(this.device, rhGlobalLoggingEvent.device) && Intrinsics.areEqual(this.app, rhGlobalLoggingEvent.app) && Intrinsics.areEqual(this.event, rhGlobalLoggingEvent.event) && Intrinsics.areEqual(this.timestamp, rhGlobalLoggingEvent.timestamp) && Intrinsics.areEqual(this.client_ip, rhGlobalLoggingEvent.client_ip) && Intrinsics.areEqual(this.event_hash, rhGlobalLoggingEvent.event_hash) && Intrinsics.areEqual(this.geoip, rhGlobalLoggingEvent.geoip) && this.authenticated == rhGlobalLoggingEvent.authenticated && this.created_at == rhGlobalLoggingEvent.created_at && Intrinsics.areEqual(this.network_connection, rhGlobalLoggingEvent.network_connection) && this.event_schema_type == rhGlobalLoggingEvent.event_schema_type && Intrinsics.areEqual(this.masked_client_ip, rhGlobalLoggingEvent.masked_client_ip);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        User user = this.user;
        int iHashCode2 = (iHashCode + (user != null ? user.hashCode() : 0)) * 37;
        Device device = this.device;
        int iHashCode3 = (iHashCode2 + (device != null ? device.hashCode() : 0)) * 37;
        Application application = this.app;
        int iHashCode4 = (iHashCode3 + (application != null ? application.hashCode() : 0)) * 37;
        RhGlobalAppEvent rhGlobalAppEvent = this.event;
        int iHashCode5 = (((((((iHashCode4 + (rhGlobalAppEvent != null ? rhGlobalAppEvent.hashCode() : 0)) * 37) + this.timestamp.hashCode()) * 37) + this.client_ip.hashCode()) * 37) + this.event_hash.hashCode()) * 37;
        GeoIP geoIP = this.geoip;
        int iHashCode6 = (((((iHashCode5 + (geoIP != null ? geoIP.hashCode() : 0)) * 37) + this.authenticated.hashCode()) * 37) + Integer.hashCode(this.created_at)) * 37;
        NetworkConnection networkConnection = this.network_connection;
        int iHashCode7 = ((((iHashCode6 + (networkConnection != null ? networkConnection.hashCode() : 0)) * 37) + this.event_schema_type.hashCode()) * 37) + this.masked_client_ip.hashCode();
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        User user = this.user;
        if (user != null) {
            arrayList.add("user=" + user);
        }
        Device device = this.device;
        if (device != null) {
            arrayList.add("device=" + device);
        }
        Application application = this.app;
        if (application != null) {
            arrayList.add("app=" + application);
        }
        RhGlobalAppEvent rhGlobalAppEvent = this.event;
        if (rhGlobalAppEvent != null) {
            arrayList.add("event=" + rhGlobalAppEvent);
        }
        arrayList.add("timestamp=" + Internal.sanitize(this.timestamp));
        arrayList.add("client_ip=" + Internal.sanitize(this.client_ip));
        arrayList.add("event_hash=" + Internal.sanitize(this.event_hash));
        GeoIP geoIP = this.geoip;
        if (geoIP != null) {
            arrayList.add("geoip=" + geoIP);
        }
        arrayList.add("authenticated=" + this.authenticated);
        arrayList.add("created_at=" + this.created_at);
        NetworkConnection networkConnection = this.network_connection;
        if (networkConnection != null) {
            arrayList.add("network_connection=" + networkConnection);
        }
        arrayList.add("event_schema_type=" + this.event_schema_type);
        arrayList.add("masked_client_ip=" + Internal.sanitize(this.masked_client_ip));
        return CollectionsKt.joinToString$default(arrayList, ", ", "RhGlobalLoggingEvent{", "}", 0, null, null, 56, null);
    }

    public final RhGlobalLoggingEvent copy(User user, Device device, Application app, RhGlobalAppEvent event, String timestamp, String client_ip, String event_hash, GeoIP geoip, Authentication authenticated, int created_at, NetworkConnection network_connection, Event.Type event_schema_type, String masked_client_ip, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(client_ip, "client_ip");
        Intrinsics.checkNotNullParameter(event_hash, "event_hash");
        Intrinsics.checkNotNullParameter(authenticated, "authenticated");
        Intrinsics.checkNotNullParameter(event_schema_type, "event_schema_type");
        Intrinsics.checkNotNullParameter(masked_client_ip, "masked_client_ip");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RhGlobalLoggingEvent(user, device, app, event, timestamp, client_ip, event_hash, geoip, authenticated, created_at, network_connection, event_schema_type, masked_client_ip, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RhGlobalLoggingEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RhGlobalLoggingEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.RhGlobalLoggingEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RhGlobalLoggingEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getUser() != null) {
                    size += User.ADAPTER.encodedSizeWithTag(1, value.getUser());
                }
                if (value.getDevice() != null) {
                    size += Device.ADAPTER.encodedSizeWithTag(2, value.getDevice());
                }
                if (value.getApp() != null) {
                    size += Application.ADAPTER.encodedSizeWithTag(3, value.getApp());
                }
                if (value.getEvent() != null) {
                    size += RhGlobalAppEvent.ADAPTER.encodedSizeWithTag(4, value.getEvent());
                }
                if (!Intrinsics.areEqual(value.getTimestamp(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getClient_ip(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getClient_ip());
                }
                if (!Intrinsics.areEqual(value.getEvent_hash(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getEvent_hash());
                }
                if (value.getGeoip() != null) {
                    size += GeoIP.ADAPTER.encodedSizeWithTag(8, value.getGeoip());
                }
                if (value.getAuthenticated() != Authentication.DEFAULT_AUTH) {
                    size += Authentication.ADAPTER.encodedSizeWithTag(9, value.getAuthenticated());
                }
                if (value.getCreated_at() != 0) {
                    size += ProtoAdapter.UINT32.encodedSizeWithTag(10, Integer.valueOf(value.getCreated_at()));
                }
                if (value.getNetwork_connection() != null) {
                    size += NetworkConnection.ADAPTER.encodedSizeWithTag(11, value.getNetwork_connection());
                }
                if (value.getEvent_schema_type() != Event.Type.DEFAULT_TYPE) {
                    size += Event.Type.ADAPTER.encodedSizeWithTag(12, value.getEvent_schema_type());
                }
                return !Intrinsics.areEqual(value.getMasked_client_ip(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(ErrorCodes.SSL_HANDSHAKE_EXCEPTION, value.getMasked_client_ip()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RhGlobalLoggingEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getUser() != null) {
                    User.ADAPTER.encodeWithTag(writer, 1, (int) value.getUser());
                }
                if (value.getDevice() != null) {
                    Device.ADAPTER.encodeWithTag(writer, 2, (int) value.getDevice());
                }
                if (value.getApp() != null) {
                    Application.ADAPTER.encodeWithTag(writer, 3, (int) value.getApp());
                }
                if (value.getEvent() != null) {
                    RhGlobalAppEvent.ADAPTER.encodeWithTag(writer, 4, (int) value.getEvent());
                }
                if (!Intrinsics.areEqual(value.getTimestamp(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getClient_ip(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getClient_ip());
                }
                if (!Intrinsics.areEqual(value.getEvent_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getEvent_hash());
                }
                if (value.getGeoip() != null) {
                    GeoIP.ADAPTER.encodeWithTag(writer, 8, (int) value.getGeoip());
                }
                if (value.getAuthenticated() != Authentication.DEFAULT_AUTH) {
                    Authentication.ADAPTER.encodeWithTag(writer, 9, (int) value.getAuthenticated());
                }
                if (value.getCreated_at() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 10, (int) Integer.valueOf(value.getCreated_at()));
                }
                if (value.getNetwork_connection() != null) {
                    NetworkConnection.ADAPTER.encodeWithTag(writer, 11, (int) value.getNetwork_connection());
                }
                if (value.getEvent_schema_type() != Event.Type.DEFAULT_TYPE) {
                    Event.Type.ADAPTER.encodeWithTag(writer, 12, (int) value.getEvent_schema_type());
                }
                if (!Intrinsics.areEqual(value.getMasked_client_ip(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, (int) value.getMasked_client_ip());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RhGlobalLoggingEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMasked_client_ip(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, (int) value.getMasked_client_ip());
                }
                if (value.getEvent_schema_type() != Event.Type.DEFAULT_TYPE) {
                    Event.Type.ADAPTER.encodeWithTag(writer, 12, (int) value.getEvent_schema_type());
                }
                if (value.getNetwork_connection() != null) {
                    NetworkConnection.ADAPTER.encodeWithTag(writer, 11, (int) value.getNetwork_connection());
                }
                if (value.getCreated_at() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 10, (int) Integer.valueOf(value.getCreated_at()));
                }
                if (value.getAuthenticated() != Authentication.DEFAULT_AUTH) {
                    Authentication.ADAPTER.encodeWithTag(writer, 9, (int) value.getAuthenticated());
                }
                if (value.getGeoip() != null) {
                    GeoIP.ADAPTER.encodeWithTag(writer, 8, (int) value.getGeoip());
                }
                if (!Intrinsics.areEqual(value.getEvent_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getEvent_hash());
                }
                if (!Intrinsics.areEqual(value.getClient_ip(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getClient_ip());
                }
                if (!Intrinsics.areEqual(value.getTimestamp(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTimestamp());
                }
                if (value.getEvent() != null) {
                    RhGlobalAppEvent.ADAPTER.encodeWithTag(writer, 4, (int) value.getEvent());
                }
                if (value.getApp() != null) {
                    Application.ADAPTER.encodeWithTag(writer, 3, (int) value.getApp());
                }
                if (value.getDevice() != null) {
                    Device.ADAPTER.encodeWithTag(writer, 2, (int) value.getDevice());
                }
                if (value.getUser() != null) {
                    User.ADAPTER.encodeWithTag(writer, 1, (int) value.getUser());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RhGlobalLoggingEvent decode(ProtoReader reader) throws IOException {
                Event.Type type2;
                User user;
                Device device;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Authentication authentication = Authentication.DEFAULT_AUTH;
                Event.Type type3 = Event.Type.DEFAULT_TYPE;
                long jBeginMessage = reader.beginMessage();
                Authentication authenticationDecode = authentication;
                Application applicationDecode = null;
                RhGlobalAppEvent rhGlobalAppEventDecode = null;
                GeoIP geoIPDecode = null;
                NetworkConnection networkConnectionDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                int iIntValue = 0;
                Event.Type typeDecode = type3;
                User userDecode = null;
                Device deviceDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RhGlobalLoggingEvent(userDecode, deviceDecode, applicationDecode, rhGlobalAppEventDecode, strDecode, strDecode2, strDecode3, geoIPDecode, authenticationDecode, iIntValue, networkConnectionDecode, typeDecode, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag != 1006) {
                        switch (iNextTag) {
                            case 1:
                                userDecode = User.ADAPTER.decode(reader);
                                continue;
                            case 2:
                                deviceDecode = Device.ADAPTER.decode(reader);
                                continue;
                            case 3:
                                applicationDecode = Application.ADAPTER.decode(reader);
                                continue;
                            case 4:
                                rhGlobalAppEventDecode = RhGlobalAppEvent.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                geoIPDecode = GeoIP.ADAPTER.decode(reader);
                                continue;
                            case 9:
                                type2 = typeDecode;
                                user = userDecode;
                                device = deviceDecode;
                                try {
                                    authenticationDecode = Authentication.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 10:
                                iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                                continue;
                            case 11:
                                networkConnectionDecode = NetworkConnection.ADAPTER.decode(reader);
                                continue;
                            case 12:
                                try {
                                    typeDecode = Event.Type.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    type2 = typeDecode;
                                    user = userDecode;
                                    device = deviceDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                type2 = typeDecode;
                                user = userDecode;
                                device = deviceDecode;
                                break;
                        }
                        typeDecode = type2;
                        userDecode = user;
                        deviceDecode = device;
                    } else {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RhGlobalLoggingEvent redact(RhGlobalLoggingEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                User user = value.getUser();
                User userRedact = user != null ? User.ADAPTER.redact(user) : null;
                Device device = value.getDevice();
                Device deviceRedact = device != null ? Device.ADAPTER.redact(device) : null;
                Application app = value.getApp();
                Application applicationRedact = app != null ? Application.ADAPTER.redact(app) : null;
                RhGlobalAppEvent event = value.getEvent();
                RhGlobalAppEvent rhGlobalAppEventRedact = event != null ? RhGlobalAppEvent.ADAPTER.redact(event) : null;
                GeoIP geoip = value.getGeoip();
                GeoIP geoIPRedact = geoip != null ? GeoIP.ADAPTER.redact(geoip) : null;
                NetworkConnection network_connection = value.getNetwork_connection();
                return value.copy((7024 & 1) != 0 ? value.user : userRedact, (7024 & 2) != 0 ? value.device : deviceRedact, (7024 & 4) != 0 ? value.app : applicationRedact, (7024 & 8) != 0 ? value.event : rhGlobalAppEventRedact, (7024 & 16) != 0 ? value.timestamp : null, (7024 & 32) != 0 ? value.client_ip : null, (7024 & 64) != 0 ? value.event_hash : null, (7024 & 128) != 0 ? value.geoip : geoIPRedact, (7024 & 256) != 0 ? value.authenticated : null, (7024 & 512) != 0 ? value.created_at : 0, (7024 & 1024) != 0 ? value.network_connection : network_connection != null ? NetworkConnection.ADAPTER.redact(network_connection) : null, (7024 & 2048) != 0 ? value.event_schema_type : null, (7024 & 4096) != 0 ? value.masked_client_ip : null, (7024 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
