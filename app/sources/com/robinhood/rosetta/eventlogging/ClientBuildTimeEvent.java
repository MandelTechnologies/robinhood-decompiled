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

/* compiled from: ClientBuildTimeEvent.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b%\u0018\u0000 H2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001HB§\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u00ad\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R\"\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b9\u0010(R\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b:\u0010(R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0014\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\bA\u0010@R\u001a\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\bB\u00102R\u001a\u0010\u0016\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\bC\u00102R\u001a\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\bG\u0010(¨\u0006I"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEvent;", "Lcom/squareup/wire/Message;", "", "", "id", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "", "duration", "Lcom/robinhood/rosetta/eventlogging/Environment;", "environment", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "goal", "user", "Lcom/robinhood/rosetta/eventlogging/BuildLocation;", "location", "", "configuration_cache_enabled", "configuration_cache_hit", "configuration_cache_load_time", "configuration_cache_store_time", "", "configuration_cache_size", "tz_identifier", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientPlatform;FLcom/robinhood/rosetta/eventlogging/Environment;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BuildLocation;ZZFFDLjava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientPlatform;FLcom/robinhood/rosetta/eventlogging/Environment;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BuildLocation;ZZFFDLjava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEvent;", "Ljava/lang/String;", "getId", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "F", "getDuration", "()F", "Lcom/robinhood/rosetta/eventlogging/Environment;", "getEnvironment", "()Lcom/robinhood/rosetta/eventlogging/Environment;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getGoal", "getUser", "Lcom/robinhood/rosetta/eventlogging/BuildLocation;", "getLocation", "()Lcom/robinhood/rosetta/eventlogging/BuildLocation;", "Z", "getConfiguration_cache_enabled", "()Z", "getConfiguration_cache_hit", "getConfiguration_cache_load_time", "getConfiguration_cache_store_time", "D", "getConfiguration_cache_size", "()D", "getTz_identifier", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientBuildTimeEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientBuildTimeEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "configurationCacheEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final boolean configuration_cache_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "configurationCacheHit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final boolean configuration_cache_hit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "configurationCacheLoadTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final float configuration_cache_load_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "configurationCacheSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final double configuration_cache_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "configurationCacheStoreTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final float configuration_cache_store_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
    private final float duration;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Environment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final Environment environment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 5)
    private final String goal;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 8)
    private final String id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.BuildLocation#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 7)
    private final BuildLocation location;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tzIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String tz_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 6)
    private final String user;

    public ClientBuildTimeEvent() {
        this(null, null, 0.0f, null, null, null, null, null, false, false, 0.0f, 0.0f, 0.0d, null, null, 32767, null);
    }

    public /* synthetic */ ClientBuildTimeEvent(String str, ClientPlatform clientPlatform, float f, Environment environment, Instant instant, String str2, String str3, BuildLocation buildLocation, boolean z, boolean z2, float f2, float f3, double d, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? null : environment, (i & 16) == 0 ? instant : null, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? BuildLocation.DEFAULT_LOCATION : buildLocation, (i & 256) != 0 ? false : z, (i & 512) == 0 ? z2 : false, (i & 1024) != 0 ? 0.0f : f2, (i & 2048) == 0 ? f3 : 0.0f, (i & 4096) != 0 ? 0.0d : d, (i & 8192) == 0 ? str4 : "", (i & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24086newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getGoal() {
        return this.goal;
    }

    public final String getUser() {
        return this.user;
    }

    public final BuildLocation getLocation() {
        return this.location;
    }

    public final boolean getConfiguration_cache_enabled() {
        return this.configuration_cache_enabled;
    }

    public final boolean getConfiguration_cache_hit() {
        return this.configuration_cache_hit;
    }

    public final float getConfiguration_cache_load_time() {
        return this.configuration_cache_load_time;
    }

    public final float getConfiguration_cache_store_time() {
        return this.configuration_cache_store_time;
    }

    public final double getConfiguration_cache_size() {
        return this.configuration_cache_size;
    }

    public final String getTz_identifier() {
        return this.tz_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientBuildTimeEvent(String id, ClientPlatform platform, float f, Environment environment, Instant instant, String goal, String user, BuildLocation location, boolean z, boolean z2, float f2, float f3, double d, String tz_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(goal, "goal");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(tz_identifier, "tz_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.platform = platform;
        this.duration = f;
        this.environment = environment;
        this.timestamp = instant;
        this.goal = goal;
        this.user = user;
        this.location = location;
        this.configuration_cache_enabled = z;
        this.configuration_cache_hit = z2;
        this.configuration_cache_load_time = f2;
        this.configuration_cache_store_time = f3;
        this.configuration_cache_size = d;
        this.tz_identifier = tz_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24086newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientBuildTimeEvent)) {
            return false;
        }
        ClientBuildTimeEvent clientBuildTimeEvent = (ClientBuildTimeEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientBuildTimeEvent.unknownFields()) && Intrinsics.areEqual(this.id, clientBuildTimeEvent.id) && this.platform == clientBuildTimeEvent.platform && this.duration == clientBuildTimeEvent.duration && Intrinsics.areEqual(this.environment, clientBuildTimeEvent.environment) && Intrinsics.areEqual(this.timestamp, clientBuildTimeEvent.timestamp) && Intrinsics.areEqual(this.goal, clientBuildTimeEvent.goal) && Intrinsics.areEqual(this.user, clientBuildTimeEvent.user) && this.location == clientBuildTimeEvent.location && this.configuration_cache_enabled == clientBuildTimeEvent.configuration_cache_enabled && this.configuration_cache_hit == clientBuildTimeEvent.configuration_cache_hit && this.configuration_cache_load_time == clientBuildTimeEvent.configuration_cache_load_time && this.configuration_cache_store_time == clientBuildTimeEvent.configuration_cache_store_time && this.configuration_cache_size == clientBuildTimeEvent.configuration_cache_size && Intrinsics.areEqual(this.tz_identifier, clientBuildTimeEvent.tz_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.platform.hashCode()) * 37) + Float.hashCode(this.duration)) * 37;
        Environment environment = this.environment;
        int iHashCode2 = (iHashCode + (environment != null ? environment.hashCode() : 0)) * 37;
        Instant instant = this.timestamp;
        int iHashCode3 = ((((((((((((((((((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37) + this.goal.hashCode()) * 37) + this.user.hashCode()) * 37) + this.location.hashCode()) * 37) + java.lang.Boolean.hashCode(this.configuration_cache_enabled)) * 37) + java.lang.Boolean.hashCode(this.configuration_cache_hit)) * 37) + Float.hashCode(this.configuration_cache_load_time)) * 37) + Float.hashCode(this.configuration_cache_store_time)) * 37) + Double.hashCode(this.configuration_cache_size)) * 37) + this.tz_identifier.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("platform=" + this.platform);
        arrayList.add("duration=" + this.duration);
        Environment environment = this.environment;
        if (environment != null) {
            arrayList.add("environment=" + environment);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("goal=" + Internal.sanitize(this.goal));
        arrayList.add("user=" + Internal.sanitize(this.user));
        arrayList.add("location=" + this.location);
        arrayList.add("configuration_cache_enabled=" + this.configuration_cache_enabled);
        arrayList.add("configuration_cache_hit=" + this.configuration_cache_hit);
        arrayList.add("configuration_cache_load_time=" + this.configuration_cache_load_time);
        arrayList.add("configuration_cache_store_time=" + this.configuration_cache_store_time);
        arrayList.add("configuration_cache_size=" + this.configuration_cache_size);
        arrayList.add("tz_identifier=" + Internal.sanitize(this.tz_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientBuildTimeEvent{", "}", 0, null, null, 56, null);
    }

    public final ClientBuildTimeEvent copy(String id, ClientPlatform platform, float duration, Environment environment, Instant timestamp, String goal, String user, BuildLocation location, boolean configuration_cache_enabled, boolean configuration_cache_hit, float configuration_cache_load_time, float configuration_cache_store_time, double configuration_cache_size, String tz_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(goal, "goal");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(tz_identifier, "tz_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientBuildTimeEvent(id, platform, duration, environment, timestamp, goal, user, location, configuration_cache_enabled, configuration_cache_hit, configuration_cache_load_time, configuration_cache_store_time, configuration_cache_size, tz_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientBuildTimeEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientBuildTimeEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientBuildTimeEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientBuildTimeEvent value) {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getId());
                }
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (!Float.valueOf(value.getDuration()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getDuration()));
                }
                if (value.getEnvironment() != null) {
                    size += Environment.ADAPTER.encodedSizeWithTag(3, value.getEnvironment());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getGoal(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getGoal());
                }
                if (!Intrinsics.areEqual(value.getUser(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getUser());
                }
                if (value.getLocation() != BuildLocation.DEFAULT_LOCATION) {
                    size += BuildLocation.ADAPTER.encodedSizeWithTag(7, value.getLocation());
                }
                if (value.getConfiguration_cache_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(9, java.lang.Boolean.valueOf(value.getConfiguration_cache_enabled()));
                }
                if (value.getConfiguration_cache_hit()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(10, java.lang.Boolean.valueOf(value.getConfiguration_cache_hit()));
                }
                if (!Float.valueOf(value.getConfiguration_cache_load_time()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(11, Float.valueOf(value.getConfiguration_cache_load_time()));
                }
                if (!Float.valueOf(value.getConfiguration_cache_store_time()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(12, Float.valueOf(value.getConfiguration_cache_store_time()));
                }
                if (!Double.valueOf(value.getConfiguration_cache_size()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(13, Double.valueOf(value.getConfiguration_cache_size()));
                }
                return !Intrinsics.areEqual(value.getTz_identifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(14, value.getTz_identifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientBuildTimeEvent value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getId());
                }
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (!Float.valueOf(value.getDuration()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getDuration()));
                }
                if (value.getEnvironment() != null) {
                    Environment.ADAPTER.encodeWithTag(writer, 3, (int) value.getEnvironment());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getGoal(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getGoal());
                }
                if (!Intrinsics.areEqual(value.getUser(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getUser());
                }
                if (value.getLocation() != BuildLocation.DEFAULT_LOCATION) {
                    BuildLocation.ADAPTER.encodeWithTag(writer, 7, (int) value.getLocation());
                }
                if (value.getConfiguration_cache_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) java.lang.Boolean.valueOf(value.getConfiguration_cache_enabled()));
                }
                if (value.getConfiguration_cache_hit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) java.lang.Boolean.valueOf(value.getConfiguration_cache_hit()));
                }
                if (!Float.valueOf(value.getConfiguration_cache_load_time()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 11, (int) Float.valueOf(value.getConfiguration_cache_load_time()));
                }
                if (!Float.valueOf(value.getConfiguration_cache_store_time()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 12, (int) Float.valueOf(value.getConfiguration_cache_store_time()));
                }
                if (!Double.valueOf(value.getConfiguration_cache_size()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 13, (int) Double.valueOf(value.getConfiguration_cache_size()));
                }
                if (!Intrinsics.areEqual(value.getTz_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getTz_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientBuildTimeEvent value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTz_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getTz_identifier());
                }
                if (!Double.valueOf(value.getConfiguration_cache_size()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 13, (int) Double.valueOf(value.getConfiguration_cache_size()));
                }
                if (!Float.valueOf(value.getConfiguration_cache_store_time()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 12, (int) Float.valueOf(value.getConfiguration_cache_store_time()));
                }
                if (!Float.valueOf(value.getConfiguration_cache_load_time()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 11, (int) Float.valueOf(value.getConfiguration_cache_load_time()));
                }
                if (value.getConfiguration_cache_hit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) java.lang.Boolean.valueOf(value.getConfiguration_cache_hit()));
                }
                if (value.getConfiguration_cache_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) java.lang.Boolean.valueOf(value.getConfiguration_cache_enabled()));
                }
                if (value.getLocation() != BuildLocation.DEFAULT_LOCATION) {
                    BuildLocation.ADAPTER.encodeWithTag(writer, 7, (int) value.getLocation());
                }
                if (!Intrinsics.areEqual(value.getUser(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getUser());
                }
                if (!Intrinsics.areEqual(value.getGoal(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getGoal());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getTimestamp());
                }
                if (value.getEnvironment() != null) {
                    Environment.ADAPTER.encodeWithTag(writer, 3, (int) value.getEnvironment());
                }
                if (!Float.valueOf(value.getDuration()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getDuration()));
                }
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ClientBuildTimeEvent decode(ProtoReader reader) throws IOException {
                BuildLocation buildLocation;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatform = ClientPlatform.DEFAULT_PLATFORM;
                BuildLocation buildLocation2 = BuildLocation.DEFAULT_LOCATION;
                long jBeginMessage = reader.beginMessage();
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                float fFloatValue3 = 0.0f;
                Instant instantDecode = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                double dDoubleValue = 0.0d;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                Environment environmentDecode = null;
                BuildLocation buildLocationDecode = buildLocation2;
                ClientPlatform clientPlatformDecode = clientPlatform;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                buildLocation = buildLocationDecode;
                                str = strDecode;
                                try {
                                    clientPlatformDecode = ClientPlatform.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str2 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                strDecode = str;
                                buildLocationDecode = buildLocation;
                                break;
                            case 2:
                                fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 3:
                                environmentDecode = Environment.ADAPTER.decode(reader);
                                break;
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                try {
                                    buildLocationDecode = BuildLocation.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    buildLocation = buildLocationDecode;
                                    str = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 8:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 10:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 11:
                                fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 12:
                                fFloatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 13:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 14:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                buildLocation = buildLocationDecode;
                                str = strDecode;
                                str2 = strDecode2;
                                strDecode2 = str2;
                                strDecode = str;
                                buildLocationDecode = buildLocation;
                                break;
                        }
                    } else {
                        return new ClientBuildTimeEvent(strDecode, clientPlatformDecode, fFloatValue, environmentDecode, instantDecode, strDecode2, strDecode3, buildLocationDecode, zBooleanValue, zBooleanValue2, fFloatValue2, fFloatValue3, dDoubleValue, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientBuildTimeEvent redact(ClientBuildTimeEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Environment environment = value.getEnvironment();
                Environment environmentRedact = environment != null ? Environment.ADAPTER.redact(environment) : null;
                Instant timestamp = value.getTimestamp();
                return value.copy((16359 & 1) != 0 ? value.id : null, (16359 & 2) != 0 ? value.platform : null, (16359 & 4) != 0 ? value.duration : 0.0f, (16359 & 8) != 0 ? value.environment : environmentRedact, (16359 & 16) != 0 ? value.timestamp : timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, (16359 & 32) != 0 ? value.goal : null, (16359 & 64) != 0 ? value.user : null, (16359 & 128) != 0 ? value.location : null, (16359 & 256) != 0 ? value.configuration_cache_enabled : false, (16359 & 512) != 0 ? value.configuration_cache_hit : false, (16359 & 1024) != 0 ? value.configuration_cache_load_time : 0.0f, (16359 & 2048) != 0 ? value.configuration_cache_store_time : 0.0f, (16359 & 4096) != 0 ? value.configuration_cache_size : 0.0d, (16359 & 8192) != 0 ? value.tz_identifier : null, (16359 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
