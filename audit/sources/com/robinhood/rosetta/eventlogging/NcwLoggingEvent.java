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

/* compiled from: NcwLoggingEvent.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B\u0093\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010/\u001a\u00020\u0002H\u0017J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u00020\u0012H\u0016J\b\u00105\u001a\u00020\nH\u0016J\u0092\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0016\u0010\u0016\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwLoggingEvent;", "Lcom/squareup/wire/Message;", "", "device", "Lcom/robinhood/rosetta/eventlogging/Device;", "app", "Lcom/robinhood/rosetta/eventlogging/Application;", "event", "Lcom/robinhood/rosetta/eventlogging/NcwAppEvent;", "timestamp", "", "client_ip", "event_hash", "geoip", "Lcom/robinhood/rosetta/eventlogging/GeoIP;", "authenticated", "Lcom/robinhood/rosetta/eventlogging/Authentication;", "created_at", "", "network_connection", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", "veritas_device_id", "wallet_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Device;Lcom/robinhood/rosetta/eventlogging/Application;Lcom/robinhood/rosetta/eventlogging/NcwAppEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/GeoIP;Lcom/robinhood/rosetta/eventlogging/Authentication;ILcom/robinhood/rosetta/eventlogging/NetworkConnection;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getDevice", "()Lcom/robinhood/rosetta/eventlogging/Device;", "getApp", "()Lcom/robinhood/rosetta/eventlogging/Application;", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/NcwAppEvent;", "getTimestamp", "()Ljava/lang/String;", "getClient_ip", "getEvent_hash", "getGeoip", "()Lcom/robinhood/rosetta/eventlogging/GeoIP;", "getAuthenticated", "()Lcom/robinhood/rosetta/eventlogging/Authentication;", "getCreated_at", "()I", "getNetwork_connection", "()Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", "getVeritas_device_id", "getWallet_id", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NcwLoggingEvent extends Message {

    @JvmField
    public static final ProtoAdapter<NcwLoggingEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Application#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Application app;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Authentication#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Authentication authenticated;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clientIp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String client_ip;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final int created_at;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Device#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Device device;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NcwAppEvent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final NcwAppEvent event;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventHash", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String event_hash;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.GeoIP#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final GeoIP geoip;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NetworkConnection#ADAPTER", jsonName = "networkConnection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final NetworkConnection network_connection;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "veritasDeviceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String veritas_device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "walletId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String wallet_id;

    public NcwLoggingEvent() {
        this(null, null, null, null, null, null, null, null, 0, null, null, null, null, 8191, null);
    }

    public /* synthetic */ NcwLoggingEvent(Device device, Application application, NcwAppEvent ncwAppEvent, String str, String str2, String str3, GeoIP geoIP, Authentication authentication, int i, NetworkConnection networkConnection, String str4, String str5, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : device, (i2 & 2) != 0 ? null : application, (i2 & 4) != 0 ? null : ncwAppEvent, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? null : geoIP, (i2 & 128) != 0 ? Authentication.DEFAULT_AUTH : authentication, (i2 & 256) != 0 ? 0 : i, (i2 & 512) == 0 ? networkConnection : null, (i2 & 1024) != 0 ? "" : str4, (i2 & 2048) == 0 ? str5 : "", (i2 & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24395newBuilder();
    }

    public final Device getDevice() {
        return this.device;
    }

    public final Application getApp() {
        return this.app;
    }

    public final NcwAppEvent getEvent() {
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

    public final String getVeritas_device_id() {
        return this.veritas_device_id;
    }

    public final String getWallet_id() {
        return this.wallet_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NcwLoggingEvent(Device device, Application application, NcwAppEvent ncwAppEvent, String timestamp, String client_ip, String event_hash, GeoIP geoIP, Authentication authenticated, int i, NetworkConnection networkConnection, String veritas_device_id, String wallet_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(client_ip, "client_ip");
        Intrinsics.checkNotNullParameter(event_hash, "event_hash");
        Intrinsics.checkNotNullParameter(authenticated, "authenticated");
        Intrinsics.checkNotNullParameter(veritas_device_id, "veritas_device_id");
        Intrinsics.checkNotNullParameter(wallet_id, "wallet_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.device = device;
        this.app = application;
        this.event = ncwAppEvent;
        this.timestamp = timestamp;
        this.client_ip = client_ip;
        this.event_hash = event_hash;
        this.geoip = geoIP;
        this.authenticated = authenticated;
        this.created_at = i;
        this.network_connection = networkConnection;
        this.veritas_device_id = veritas_device_id;
        this.wallet_id = wallet_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24395newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NcwLoggingEvent)) {
            return false;
        }
        NcwLoggingEvent ncwLoggingEvent = (NcwLoggingEvent) other;
        return Intrinsics.areEqual(unknownFields(), ncwLoggingEvent.unknownFields()) && Intrinsics.areEqual(this.device, ncwLoggingEvent.device) && Intrinsics.areEqual(this.app, ncwLoggingEvent.app) && Intrinsics.areEqual(this.event, ncwLoggingEvent.event) && Intrinsics.areEqual(this.timestamp, ncwLoggingEvent.timestamp) && Intrinsics.areEqual(this.client_ip, ncwLoggingEvent.client_ip) && Intrinsics.areEqual(this.event_hash, ncwLoggingEvent.event_hash) && Intrinsics.areEqual(this.geoip, ncwLoggingEvent.geoip) && this.authenticated == ncwLoggingEvent.authenticated && this.created_at == ncwLoggingEvent.created_at && Intrinsics.areEqual(this.network_connection, ncwLoggingEvent.network_connection) && Intrinsics.areEqual(this.veritas_device_id, ncwLoggingEvent.veritas_device_id) && Intrinsics.areEqual(this.wallet_id, ncwLoggingEvent.wallet_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Device device = this.device;
        int iHashCode2 = (iHashCode + (device != null ? device.hashCode() : 0)) * 37;
        Application application = this.app;
        int iHashCode3 = (iHashCode2 + (application != null ? application.hashCode() : 0)) * 37;
        NcwAppEvent ncwAppEvent = this.event;
        int iHashCode4 = (((((((iHashCode3 + (ncwAppEvent != null ? ncwAppEvent.hashCode() : 0)) * 37) + this.timestamp.hashCode()) * 37) + this.client_ip.hashCode()) * 37) + this.event_hash.hashCode()) * 37;
        GeoIP geoIP = this.geoip;
        int iHashCode5 = (((((iHashCode4 + (geoIP != null ? geoIP.hashCode() : 0)) * 37) + this.authenticated.hashCode()) * 37) + Integer.hashCode(this.created_at)) * 37;
        NetworkConnection networkConnection = this.network_connection;
        int iHashCode6 = ((((iHashCode5 + (networkConnection != null ? networkConnection.hashCode() : 0)) * 37) + this.veritas_device_id.hashCode()) * 37) + this.wallet_id.hashCode();
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Device device = this.device;
        if (device != null) {
            arrayList.add("device=" + device);
        }
        Application application = this.app;
        if (application != null) {
            arrayList.add("app=" + application);
        }
        NcwAppEvent ncwAppEvent = this.event;
        if (ncwAppEvent != null) {
            arrayList.add("event=" + ncwAppEvent);
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
        arrayList.add("veritas_device_id=" + Internal.sanitize(this.veritas_device_id));
        arrayList.add("wallet_id=" + Internal.sanitize(this.wallet_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "NcwLoggingEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NcwLoggingEvent copy$default(NcwLoggingEvent ncwLoggingEvent, Device device, Application application, NcwAppEvent ncwAppEvent, String str, String str2, String str3, GeoIP geoIP, Authentication authentication, int i, NetworkConnection networkConnection, String str4, String str5, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            device = ncwLoggingEvent.device;
        }
        return ncwLoggingEvent.copy(device, (i2 & 2) != 0 ? ncwLoggingEvent.app : application, (i2 & 4) != 0 ? ncwLoggingEvent.event : ncwAppEvent, (i2 & 8) != 0 ? ncwLoggingEvent.timestamp : str, (i2 & 16) != 0 ? ncwLoggingEvent.client_ip : str2, (i2 & 32) != 0 ? ncwLoggingEvent.event_hash : str3, (i2 & 64) != 0 ? ncwLoggingEvent.geoip : geoIP, (i2 & 128) != 0 ? ncwLoggingEvent.authenticated : authentication, (i2 & 256) != 0 ? ncwLoggingEvent.created_at : i, (i2 & 512) != 0 ? ncwLoggingEvent.network_connection : networkConnection, (i2 & 1024) != 0 ? ncwLoggingEvent.veritas_device_id : str4, (i2 & 2048) != 0 ? ncwLoggingEvent.wallet_id : str5, (i2 & 4096) != 0 ? ncwLoggingEvent.unknownFields() : byteString);
    }

    public final NcwLoggingEvent copy(Device device, Application app, NcwAppEvent event, String timestamp, String client_ip, String event_hash, GeoIP geoip, Authentication authenticated, int created_at, NetworkConnection network_connection, String veritas_device_id, String wallet_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(client_ip, "client_ip");
        Intrinsics.checkNotNullParameter(event_hash, "event_hash");
        Intrinsics.checkNotNullParameter(authenticated, "authenticated");
        Intrinsics.checkNotNullParameter(veritas_device_id, "veritas_device_id");
        Intrinsics.checkNotNullParameter(wallet_id, "wallet_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NcwLoggingEvent(device, app, event, timestamp, client_ip, event_hash, geoip, authenticated, created_at, network_connection, veritas_device_id, wallet_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NcwLoggingEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NcwLoggingEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.NcwLoggingEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NcwLoggingEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDevice() != null) {
                    size += Device.ADAPTER.encodedSizeWithTag(1, value.getDevice());
                }
                if (value.getApp() != null) {
                    size += Application.ADAPTER.encodedSizeWithTag(2, value.getApp());
                }
                if (value.getEvent() != null) {
                    size += NcwAppEvent.ADAPTER.encodedSizeWithTag(3, value.getEvent());
                }
                if (!Intrinsics.areEqual(value.getTimestamp(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getClient_ip(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getClient_ip());
                }
                if (!Intrinsics.areEqual(value.getEvent_hash(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getEvent_hash());
                }
                if (value.getGeoip() != null) {
                    size += GeoIP.ADAPTER.encodedSizeWithTag(7, value.getGeoip());
                }
                if (value.getAuthenticated() != Authentication.DEFAULT_AUTH) {
                    size += Authentication.ADAPTER.encodedSizeWithTag(8, value.getAuthenticated());
                }
                if (value.getCreated_at() != 0) {
                    size += ProtoAdapter.UINT32.encodedSizeWithTag(9, Integer.valueOf(value.getCreated_at()));
                }
                if (value.getNetwork_connection() != null) {
                    size += NetworkConnection.ADAPTER.encodedSizeWithTag(10, value.getNetwork_connection());
                }
                if (!Intrinsics.areEqual(value.getVeritas_device_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getVeritas_device_id());
                }
                return !Intrinsics.areEqual(value.getWallet_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(12, value.getWallet_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NcwLoggingEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDevice() != null) {
                    Device.ADAPTER.encodeWithTag(writer, 1, (int) value.getDevice());
                }
                if (value.getApp() != null) {
                    Application.ADAPTER.encodeWithTag(writer, 2, (int) value.getApp());
                }
                if (value.getEvent() != null) {
                    NcwAppEvent.ADAPTER.encodeWithTag(writer, 3, (int) value.getEvent());
                }
                if (!Intrinsics.areEqual(value.getTimestamp(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getClient_ip(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getClient_ip());
                }
                if (!Intrinsics.areEqual(value.getEvent_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getEvent_hash());
                }
                if (value.getGeoip() != null) {
                    GeoIP.ADAPTER.encodeWithTag(writer, 7, (int) value.getGeoip());
                }
                if (value.getAuthenticated() != Authentication.DEFAULT_AUTH) {
                    Authentication.ADAPTER.encodeWithTag(writer, 8, (int) value.getAuthenticated());
                }
                if (value.getCreated_at() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getCreated_at()));
                }
                if (value.getNetwork_connection() != null) {
                    NetworkConnection.ADAPTER.encodeWithTag(writer, 10, (int) value.getNetwork_connection());
                }
                if (!Intrinsics.areEqual(value.getVeritas_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getVeritas_device_id());
                }
                if (!Intrinsics.areEqual(value.getWallet_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getWallet_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NcwLoggingEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getWallet_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getWallet_id());
                }
                if (!Intrinsics.areEqual(value.getVeritas_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getVeritas_device_id());
                }
                if (value.getNetwork_connection() != null) {
                    NetworkConnection.ADAPTER.encodeWithTag(writer, 10, (int) value.getNetwork_connection());
                }
                if (value.getCreated_at() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getCreated_at()));
                }
                if (value.getAuthenticated() != Authentication.DEFAULT_AUTH) {
                    Authentication.ADAPTER.encodeWithTag(writer, 8, (int) value.getAuthenticated());
                }
                if (value.getGeoip() != null) {
                    GeoIP.ADAPTER.encodeWithTag(writer, 7, (int) value.getGeoip());
                }
                if (!Intrinsics.areEqual(value.getEvent_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getEvent_hash());
                }
                if (!Intrinsics.areEqual(value.getClient_ip(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getClient_ip());
                }
                if (!Intrinsics.areEqual(value.getTimestamp(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTimestamp());
                }
                if (value.getEvent() != null) {
                    NcwAppEvent.ADAPTER.encodeWithTag(writer, 3, (int) value.getEvent());
                }
                if (value.getApp() != null) {
                    Application.ADAPTER.encodeWithTag(writer, 2, (int) value.getApp());
                }
                if (value.getDevice() != null) {
                    Device.ADAPTER.encodeWithTag(writer, 1, (int) value.getDevice());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NcwLoggingEvent decode(ProtoReader reader) throws IOException {
                Authentication authentication;
                Device device;
                Application application;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Authentication authentication2 = Authentication.DEFAULT_AUTH;
                long jBeginMessage = reader.beginMessage();
                NcwAppEvent ncwAppEventDecode = null;
                GeoIP geoIPDecode = null;
                NetworkConnection networkConnectionDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                int iIntValue = 0;
                Authentication authenticationDecode = authentication2;
                Device deviceDecode = null;
                Application applicationDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                deviceDecode = Device.ADAPTER.decode(reader);
                                continue;
                            case 2:
                                applicationDecode = Application.ADAPTER.decode(reader);
                                continue;
                            case 3:
                                ncwAppEventDecode = NcwAppEvent.ADAPTER.decode(reader);
                                continue;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                geoIPDecode = GeoIP.ADAPTER.decode(reader);
                                continue;
                            case 8:
                                try {
                                    authenticationDecode = Authentication.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    authentication = authenticationDecode;
                                    device = deviceDecode;
                                    application = applicationDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 9:
                                iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                                continue;
                            case 10:
                                networkConnectionDecode = NetworkConnection.ADAPTER.decode(reader);
                                continue;
                            case 11:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 12:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                authentication = authenticationDecode;
                                device = deviceDecode;
                                application = applicationDecode;
                                break;
                        }
                        authenticationDecode = authentication;
                        deviceDecode = device;
                        applicationDecode = application;
                    } else {
                        return new NcwLoggingEvent(deviceDecode, applicationDecode, ncwAppEventDecode, strDecode, strDecode2, strDecode3, geoIPDecode, authenticationDecode, iIntValue, networkConnectionDecode, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NcwLoggingEvent redact(NcwLoggingEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Device device = value.getDevice();
                Device deviceRedact = device != null ? Device.ADAPTER.redact(device) : null;
                Application app = value.getApp();
                Application applicationRedact = app != null ? Application.ADAPTER.redact(app) : null;
                NcwAppEvent event = value.getEvent();
                NcwAppEvent ncwAppEventRedact = event != null ? NcwAppEvent.ADAPTER.redact(event) : null;
                GeoIP geoip = value.getGeoip();
                GeoIP geoIPRedact = geoip != null ? GeoIP.ADAPTER.redact(geoip) : null;
                NetworkConnection network_connection = value.getNetwork_connection();
                return NcwLoggingEvent.copy$default(value, deviceRedact, applicationRedact, ncwAppEventRedact, null, null, null, geoIPRedact, null, 0, network_connection != null ? NetworkConnection.ADAPTER.redact(network_connection) : null, null, null, ByteString.EMPTY, 3512, null);
            }
        };
    }
}
