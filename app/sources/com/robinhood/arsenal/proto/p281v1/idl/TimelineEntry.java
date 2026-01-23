package com.robinhood.arsenal.proto.p281v1.idl;

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

/* compiled from: TimelineEntry.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*Be\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJk\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\u001cR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010$R\"\u0010\n\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b&\u0010$R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntry;", "Lcom/squareup/wire/Message;", "", "", "title", "description", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "expected_at", "actual_at", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryType;", "type", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryType;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryType;Lokio/ByteString;)Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntry;", "Ljava/lang/String;", "getTitle", "getDescription", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getExpected_at", "getActual_at", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryType;", "getType", "()Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryType;", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TimelineEntry extends Message {

    @JvmField
    public static final ProtoAdapter<TimelineEntry> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "actualAt", schemaIndex = 4, tag = 6)
    private final Instant actual_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "expectedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final Instant expected_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.TimelineEntryType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 4)
    private final TimelineEntryType type;

    public TimelineEntry() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ TimelineEntry(String str, String str2, Instant instant, Instant instant2, Instant instant3, TimelineEntryType timelineEntryType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? null : instant3, (i & 32) != 0 ? TimelineEntryType.TIMELINE_ENTRY_TYPE_UNSPECIFIED : timelineEntryType, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20211newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final Instant getExpected_at() {
        return this.expected_at;
    }

    public final Instant getActual_at() {
        return this.actual_at;
    }

    public final TimelineEntryType getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineEntry(String title, String description, Instant instant, Instant instant2, Instant instant3, TimelineEntryType type2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description = description;
        this.timestamp = instant;
        this.expected_at = instant2;
        this.actual_at = instant3;
        this.type = type2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20211newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TimelineEntry)) {
            return false;
        }
        TimelineEntry timelineEntry = (TimelineEntry) other;
        return Intrinsics.areEqual(unknownFields(), timelineEntry.unknownFields()) && Intrinsics.areEqual(this.title, timelineEntry.title) && Intrinsics.areEqual(this.description, timelineEntry.description) && Intrinsics.areEqual(this.timestamp, timelineEntry.timestamp) && Intrinsics.areEqual(this.expected_at, timelineEntry.expected_at) && Intrinsics.areEqual(this.actual_at, timelineEntry.actual_at) && this.type == timelineEntry.type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.expected_at;
        int iHashCode3 = (iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Instant instant3 = this.actual_at;
        int iHashCode4 = ((iHashCode3 + (instant3 != null ? instant3.hashCode() : 0)) * 37) + this.type.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Instant instant2 = this.expected_at;
        if (instant2 != null) {
            arrayList.add("expected_at=" + instant2);
        }
        Instant instant3 = this.actual_at;
        if (instant3 != null) {
            arrayList.add("actual_at=" + instant3);
        }
        arrayList.add("type=" + this.type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimelineEntry{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TimelineEntry copy$default(TimelineEntry timelineEntry, String str, String str2, Instant instant, Instant instant2, Instant instant3, TimelineEntryType timelineEntryType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timelineEntry.title;
        }
        if ((i & 2) != 0) {
            str2 = timelineEntry.description;
        }
        if ((i & 4) != 0) {
            instant = timelineEntry.timestamp;
        }
        if ((i & 8) != 0) {
            instant2 = timelineEntry.expected_at;
        }
        if ((i & 16) != 0) {
            instant3 = timelineEntry.actual_at;
        }
        if ((i & 32) != 0) {
            timelineEntryType = timelineEntry.type;
        }
        if ((i & 64) != 0) {
            byteString = timelineEntry.unknownFields();
        }
        TimelineEntryType timelineEntryType2 = timelineEntryType;
        ByteString byteString2 = byteString;
        Instant instant4 = instant3;
        Instant instant5 = instant;
        return timelineEntry.copy(str, str2, instant5, instant2, instant4, timelineEntryType2, byteString2);
    }

    public final TimelineEntry copy(String title, String description, Instant timestamp, Instant expected_at, Instant actual_at, TimelineEntryType type2, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TimelineEntry(title, description, timestamp, expected_at, actual_at, type2, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TimelineEntry.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TimelineEntry>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.TimelineEntry$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TimelineEntry value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getTimestamp());
                }
                if (value.getExpected_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getExpected_at());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getActual_at());
                return value.getType() != TimelineEntryType.TIMELINE_ENTRY_TYPE_UNSPECIFIED ? iEncodedSizeWithTag + TimelineEntryType.ADAPTER.encodedSizeWithTag(4, value.getType()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TimelineEntry value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (value.getExpected_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getExpected_at());
                }
                ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getActual_at());
                if (value.getType() != TimelineEntryType.TIMELINE_ENTRY_TYPE_UNSPECIFIED) {
                    TimelineEntryType.ADAPTER.encodeWithTag(writer, 4, (int) value.getType());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TimelineEntry value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getType() != TimelineEntryType.TIMELINE_ENTRY_TYPE_UNSPECIFIED) {
                    TimelineEntryType.ADAPTER.encodeWithTag(writer, 4, (int) value.getType());
                }
                ProtoAdapter<Instant> protoAdapter = ProtoAdapter.INSTANT;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getActual_at());
                if (value.getExpected_at() != null) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getExpected_at());
                }
                if (value.getTimestamp() != null) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TimelineEntry decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TimelineEntryType timelineEntryType = TimelineEntryType.TIMELINE_ENTRY_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Instant instantDecode3 = null;
                TimelineEntryType timelineEntryTypeDecode = timelineEntryType;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 4:
                                try {
                                    timelineEntryTypeDecode = TimelineEntryType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 6:
                                instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new TimelineEntry(strDecode2, strDecode, instantDecode, instantDecode2, instantDecode3, timelineEntryTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TimelineEntry redact(TimelineEntry value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
                Instant expected_at = value.getExpected_at();
                Instant instantRedact2 = expected_at != null ? ProtoAdapter.INSTANT.redact(expected_at) : null;
                Instant actual_at = value.getActual_at();
                return TimelineEntry.copy$default(value, null, null, instantRedact, instantRedact2, actual_at != null ? ProtoAdapter.INSTANT.redact(actual_at) : null, null, ByteString.EMPTY, 35, null);
            }
        };
    }
}
