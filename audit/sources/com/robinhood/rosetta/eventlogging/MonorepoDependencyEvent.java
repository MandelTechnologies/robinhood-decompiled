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

/* compiled from: MonorepoDependencyEvent.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0087\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u008d\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b$\u0010\u001fR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b(\u0010\u001fR\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b)\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b-\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b.\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b/\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b0\u0010\u001f¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEvent;", "Lcom/squareup/wire/Message;", "", "", "path", "name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "current_version", "latest_version", "", "major_version_diff", "minor_version_diff", "patch_version_diff", "days_since_latest_stable_release", "service_name", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEvent;", "Ljava/lang/String;", "getPath", "getName", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getCurrent_version", "getLatest_version", "Ljava/lang/Integer;", "getMajor_version_diff", "()Ljava/lang/Integer;", "getMinor_version_diff", "getPatch_version_diff", "getDays_since_latest_stable_release", "getService_name", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class MonorepoDependencyEvent extends Message {

    @JvmField
    public static final ProtoAdapter<MonorepoDependencyEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currentVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String current_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32_VALUE", jsonName = "daysSinceLatestStableRelease", schemaIndex = 8, tag = 9)
    private final Integer days_since_latest_stable_release;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "latestVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String latest_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32_VALUE", jsonName = "majorVersionDiff", schemaIndex = 5, tag = 6)
    private final Integer major_version_diff;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32_VALUE", jsonName = "minorVersionDiff", schemaIndex = 6, tag = 7)
    private final Integer minor_version_diff;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32_VALUE", jsonName = "patchVersionDiff", schemaIndex = 7, tag = 8)
    private final Integer patch_version_diff;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String path;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING_VALUE", jsonName = "serviceName", schemaIndex = 9, tag = 10)
    private final String service_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant timestamp;

    public MonorepoDependencyEvent() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ MonorepoDependencyEvent(String str, String str2, Instant instant, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24385newBuilder();
    }

    public final String getPath() {
        return this.path;
    }

    public final String getName() {
        return this.name;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getCurrent_version() {
        return this.current_version;
    }

    public final String getLatest_version() {
        return this.latest_version;
    }

    public final Integer getMajor_version_diff() {
        return this.major_version_diff;
    }

    public final Integer getMinor_version_diff() {
        return this.minor_version_diff;
    }

    public final Integer getPatch_version_diff() {
        return this.patch_version_diff;
    }

    public final Integer getDays_since_latest_stable_release() {
        return this.days_since_latest_stable_release;
    }

    public final String getService_name() {
        return this.service_name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonorepoDependencyEvent(String path, String name, Instant instant, String current_version, String latest_version, Integer num, Integer num2, Integer num3, Integer num4, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(current_version, "current_version");
        Intrinsics.checkNotNullParameter(latest_version, "latest_version");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.path = path;
        this.name = name;
        this.timestamp = instant;
        this.current_version = current_version;
        this.latest_version = latest_version;
        this.major_version_diff = num;
        this.minor_version_diff = num2;
        this.patch_version_diff = num3;
        this.days_since_latest_stable_release = num4;
        this.service_name = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24385newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MonorepoDependencyEvent)) {
            return false;
        }
        MonorepoDependencyEvent monorepoDependencyEvent = (MonorepoDependencyEvent) other;
        return Intrinsics.areEqual(unknownFields(), monorepoDependencyEvent.unknownFields()) && Intrinsics.areEqual(this.path, monorepoDependencyEvent.path) && Intrinsics.areEqual(this.name, monorepoDependencyEvent.name) && Intrinsics.areEqual(this.timestamp, monorepoDependencyEvent.timestamp) && Intrinsics.areEqual(this.current_version, monorepoDependencyEvent.current_version) && Intrinsics.areEqual(this.latest_version, monorepoDependencyEvent.latest_version) && Intrinsics.areEqual(this.major_version_diff, monorepoDependencyEvent.major_version_diff) && Intrinsics.areEqual(this.minor_version_diff, monorepoDependencyEvent.minor_version_diff) && Intrinsics.areEqual(this.patch_version_diff, monorepoDependencyEvent.patch_version_diff) && Intrinsics.areEqual(this.days_since_latest_stable_release, monorepoDependencyEvent.days_since_latest_stable_release) && Intrinsics.areEqual(this.service_name, monorepoDependencyEvent.service_name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.path.hashCode()) * 37) + this.name.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.current_version.hashCode()) * 37) + this.latest_version.hashCode()) * 37;
        Integer num = this.major_version_diff;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.minor_version_diff;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.patch_version_diff;
        int iHashCode5 = (iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.days_since_latest_stable_release;
        int iHashCode6 = (iHashCode5 + (num4 != null ? num4.hashCode() : 0)) * 37;
        String str = this.service_name;
        int iHashCode7 = iHashCode6 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("path=" + Internal.sanitize(this.path));
        arrayList.add("name=" + Internal.sanitize(this.name));
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("current_version=" + Internal.sanitize(this.current_version));
        arrayList.add("latest_version=" + Internal.sanitize(this.latest_version));
        Integer num = this.major_version_diff;
        if (num != null) {
            arrayList.add("major_version_diff=" + num);
        }
        Integer num2 = this.minor_version_diff;
        if (num2 != null) {
            arrayList.add("minor_version_diff=" + num2);
        }
        Integer num3 = this.patch_version_diff;
        if (num3 != null) {
            arrayList.add("patch_version_diff=" + num3);
        }
        Integer num4 = this.days_since_latest_stable_release;
        if (num4 != null) {
            arrayList.add("days_since_latest_stable_release=" + num4);
        }
        String str = this.service_name;
        if (str != null) {
            arrayList.add("service_name=" + str);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MonorepoDependencyEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MonorepoDependencyEvent copy$default(MonorepoDependencyEvent monorepoDependencyEvent, String str, String str2, Instant instant, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = monorepoDependencyEvent.path;
        }
        if ((i & 2) != 0) {
            str2 = monorepoDependencyEvent.name;
        }
        if ((i & 4) != 0) {
            instant = monorepoDependencyEvent.timestamp;
        }
        if ((i & 8) != 0) {
            str3 = monorepoDependencyEvent.current_version;
        }
        if ((i & 16) != 0) {
            str4 = monorepoDependencyEvent.latest_version;
        }
        if ((i & 32) != 0) {
            num = monorepoDependencyEvent.major_version_diff;
        }
        if ((i & 64) != 0) {
            num2 = monorepoDependencyEvent.minor_version_diff;
        }
        if ((i & 128) != 0) {
            num3 = monorepoDependencyEvent.patch_version_diff;
        }
        if ((i & 256) != 0) {
            num4 = monorepoDependencyEvent.days_since_latest_stable_release;
        }
        if ((i & 512) != 0) {
            str5 = monorepoDependencyEvent.service_name;
        }
        if ((i & 1024) != 0) {
            byteString = monorepoDependencyEvent.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        Integer num5 = num3;
        Integer num6 = num4;
        Integer num7 = num;
        Integer num8 = num2;
        String str7 = str4;
        Instant instant2 = instant;
        return monorepoDependencyEvent.copy(str, str2, instant2, str3, str7, num7, num8, num5, num6, str6, byteString2);
    }

    public final MonorepoDependencyEvent copy(String path, String name, Instant timestamp, String current_version, String latest_version, Integer major_version_diff, Integer minor_version_diff, Integer patch_version_diff, Integer days_since_latest_stable_release, String service_name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(current_version, "current_version");
        Intrinsics.checkNotNullParameter(latest_version, "latest_version");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MonorepoDependencyEvent(path, name, timestamp, current_version, latest_version, major_version_diff, minor_version_diff, patch_version_diff, days_since_latest_stable_release, service_name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MonorepoDependencyEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MonorepoDependencyEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MonorepoDependencyEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MonorepoDependencyEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPath(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPath());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getCurrent_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCurrent_version());
                }
                if (!Intrinsics.areEqual(value.getLatest_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLatest_version());
                }
                if (value.getMajor_version_diff() != null) {
                    size += ProtoAdapter.UINT32_VALUE.encodedSizeWithTag(6, value.getMajor_version_diff());
                }
                if (value.getMinor_version_diff() != null) {
                    size += ProtoAdapter.UINT32_VALUE.encodedSizeWithTag(7, value.getMinor_version_diff());
                }
                if (value.getPatch_version_diff() != null) {
                    size += ProtoAdapter.UINT32_VALUE.encodedSizeWithTag(8, value.getPatch_version_diff());
                }
                if (value.getDays_since_latest_stable_release() != null) {
                    size += ProtoAdapter.UINT32_VALUE.encodedSizeWithTag(9, value.getDays_since_latest_stable_release());
                }
                return value.getService_name() != null ? size + ProtoAdapter.STRING_VALUE.encodedSizeWithTag(10, value.getService_name()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MonorepoDependencyEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPath(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPath());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getCurrent_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCurrent_version());
                }
                if (!Intrinsics.areEqual(value.getLatest_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLatest_version());
                }
                if (value.getMajor_version_diff() != null) {
                    ProtoAdapter.UINT32_VALUE.encodeWithTag(writer, 6, (int) value.getMajor_version_diff());
                }
                if (value.getMinor_version_diff() != null) {
                    ProtoAdapter.UINT32_VALUE.encodeWithTag(writer, 7, (int) value.getMinor_version_diff());
                }
                if (value.getPatch_version_diff() != null) {
                    ProtoAdapter.UINT32_VALUE.encodeWithTag(writer, 8, (int) value.getPatch_version_diff());
                }
                if (value.getDays_since_latest_stable_release() != null) {
                    ProtoAdapter.UINT32_VALUE.encodeWithTag(writer, 9, (int) value.getDays_since_latest_stable_release());
                }
                if (value.getService_name() != null) {
                    ProtoAdapter.STRING_VALUE.encodeWithTag(writer, 10, (int) value.getService_name());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MonorepoDependencyEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getService_name() != null) {
                    ProtoAdapter.STRING_VALUE.encodeWithTag(writer, 10, (int) value.getService_name());
                }
                if (value.getDays_since_latest_stable_release() != null) {
                    ProtoAdapter.UINT32_VALUE.encodeWithTag(writer, 9, (int) value.getDays_since_latest_stable_release());
                }
                if (value.getPatch_version_diff() != null) {
                    ProtoAdapter.UINT32_VALUE.encodeWithTag(writer, 8, (int) value.getPatch_version_diff());
                }
                if (value.getMinor_version_diff() != null) {
                    ProtoAdapter.UINT32_VALUE.encodeWithTag(writer, 7, (int) value.getMinor_version_diff());
                }
                if (value.getMajor_version_diff() != null) {
                    ProtoAdapter.UINT32_VALUE.encodeWithTag(writer, 6, (int) value.getMajor_version_diff());
                }
                if (!Intrinsics.areEqual(value.getLatest_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLatest_version());
                }
                if (!Intrinsics.areEqual(value.getCurrent_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCurrent_version());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (Intrinsics.areEqual(value.getPath(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPath());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MonorepoDependencyEvent redact(MonorepoDependencyEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
                Integer major_version_diff = value.getMajor_version_diff();
                Integer numRedact = major_version_diff != null ? ProtoAdapter.UINT32_VALUE.redact(major_version_diff) : null;
                Integer minor_version_diff = value.getMinor_version_diff();
                Integer numRedact2 = minor_version_diff != null ? ProtoAdapter.UINT32_VALUE.redact(minor_version_diff) : null;
                Integer patch_version_diff = value.getPatch_version_diff();
                Integer numRedact3 = patch_version_diff != null ? ProtoAdapter.UINT32_VALUE.redact(patch_version_diff) : null;
                Integer days_since_latest_stable_release = value.getDays_since_latest_stable_release();
                Integer numRedact4 = days_since_latest_stable_release != null ? ProtoAdapter.UINT32_VALUE.redact(days_since_latest_stable_release) : null;
                String service_name = value.getService_name();
                return MonorepoDependencyEvent.copy$default(value, null, null, instantRedact, null, null, numRedact, numRedact2, numRedact3, numRedact4, service_name != null ? ProtoAdapter.STRING_VALUE.redact(service_name) : null, ByteString.EMPTY, 27, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MonorepoDependencyEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                Instant instantDecode = null;
                Integer numDecode = null;
                Integer numDecode2 = null;
                Integer numDecode3 = null;
                Integer numDecode4 = null;
                String strDecode4 = null;
                String strDecode5 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                numDecode = ProtoAdapter.UINT32_VALUE.decode(reader);
                                break;
                            case 7:
                                numDecode2 = ProtoAdapter.UINT32_VALUE.decode(reader);
                                break;
                            case 8:
                                numDecode3 = ProtoAdapter.UINT32_VALUE.decode(reader);
                                break;
                            case 9:
                                numDecode4 = ProtoAdapter.UINT32_VALUE.decode(reader);
                                break;
                            case 10:
                                strDecode4 = ProtoAdapter.STRING_VALUE.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new MonorepoDependencyEvent(strDecode, strDecode5, instantDecode, strDecode2, strDecode3, numDecode, numDecode2, numDecode3, numDecode4, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
