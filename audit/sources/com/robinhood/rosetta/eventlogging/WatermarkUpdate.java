package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: WatermarkUpdate.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&BU\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ[\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001aR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\"\u0010!R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WatermarkUpdate;", "Lcom/squareup/wire/Message;", "", "", "table_name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "watermark_utc", "published_at_utc", "", "publisher_metadata", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/Map;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/Map;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/WatermarkUpdate;", "Ljava/lang/String;", "getTable_name", "Lj$/time/Instant;", "getWatermark_utc", "()Lj$/time/Instant;", "getPublished_at_utc", "Ljava/util/Map;", "getPublisher_metadata", "()Ljava/util/Map;", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class WatermarkUpdate extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "publishedAtUtc", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant published_at_utc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "publisherMetadata", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final Map<String, String> publisher_metadata;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tableName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String table_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "watermarkUtc", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant watermark_utc;

    @JvmField
    public static final ProtoAdapter<WatermarkUpdate> ADAPTER = new WatermarkUpdate2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(WatermarkUpdate.class), Syntax.PROTO_3);

    public WatermarkUpdate() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24605newBuilder();
    }

    public final String getTable_name() {
        return this.table_name;
    }

    public /* synthetic */ WatermarkUpdate(String str, Instant instant, Instant instant2, Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getWatermark_utc() {
        return this.watermark_utc;
    }

    public final Instant getPublished_at_utc() {
        return this.published_at_utc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatermarkUpdate(String table_name, Instant instant, Instant instant2, Map<String, String> publisher_metadata, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(table_name, "table_name");
        Intrinsics.checkNotNullParameter(publisher_metadata, "publisher_metadata");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.table_name = table_name;
        this.watermark_utc = instant;
        this.published_at_utc = instant2;
        this.publisher_metadata = Internal.immutableCopyOf("publisher_metadata", publisher_metadata);
    }

    public final Map<String, String> getPublisher_metadata() {
        return this.publisher_metadata;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24605newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WatermarkUpdate)) {
            return false;
        }
        WatermarkUpdate watermarkUpdate = (WatermarkUpdate) other;
        return Intrinsics.areEqual(unknownFields(), watermarkUpdate.unknownFields()) && Intrinsics.areEqual(this.table_name, watermarkUpdate.table_name) && Intrinsics.areEqual(this.watermark_utc, watermarkUpdate.watermark_utc) && Intrinsics.areEqual(this.published_at_utc, watermarkUpdate.published_at_utc) && Intrinsics.areEqual(this.publisher_metadata, watermarkUpdate.publisher_metadata);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.table_name.hashCode()) * 37;
        Instant instant = this.watermark_utc;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.published_at_utc;
        int iHashCode3 = ((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.publisher_metadata.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("table_name=" + Internal.sanitize(this.table_name));
        Instant instant = this.watermark_utc;
        if (instant != null) {
            arrayList.add("watermark_utc=" + instant);
        }
        Instant instant2 = this.published_at_utc;
        if (instant2 != null) {
            arrayList.add("published_at_utc=" + instant2);
        }
        if (!this.publisher_metadata.isEmpty()) {
            arrayList.add("publisher_metadata=" + this.publisher_metadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WatermarkUpdate{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ WatermarkUpdate copy$default(WatermarkUpdate watermarkUpdate, String str, Instant instant, Instant instant2, Map map, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watermarkUpdate.table_name;
        }
        if ((i & 2) != 0) {
            instant = watermarkUpdate.watermark_utc;
        }
        if ((i & 4) != 0) {
            instant2 = watermarkUpdate.published_at_utc;
        }
        if ((i & 8) != 0) {
            map = watermarkUpdate.publisher_metadata;
        }
        if ((i & 16) != 0) {
            byteString = watermarkUpdate.unknownFields();
        }
        ByteString byteString2 = byteString;
        Instant instant3 = instant2;
        return watermarkUpdate.copy(str, instant, instant3, map, byteString2);
    }

    public final WatermarkUpdate copy(String table_name, Instant watermark_utc, Instant published_at_utc, Map<String, String> publisher_metadata, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(table_name, "table_name");
        Intrinsics.checkNotNullParameter(publisher_metadata, "publisher_metadata");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new WatermarkUpdate(table_name, watermark_utc, published_at_utc, publisher_metadata, unknownFields);
    }
}
