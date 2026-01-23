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

/* compiled from: CodeCoverageByOwnerEvent.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B_\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJe\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u001dR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b%\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010\u001bR\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b+\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b,\u0010\u001d¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageByOwnerEvent;", "Lcom/squareup/wire/Message;", "", "", "owner", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "metric_name", "", "percentage", "", "lines_total", "lines_covered", "uuid", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;FIILjava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;FIILjava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/CodeCoverageByOwnerEvent;", "Ljava/lang/String;", "getOwner", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getMetric_name", "F", "getPercentage", "()F", "I", "getLines_total", "getLines_covered", "getUuid", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CodeCoverageByOwnerEvent extends Message {

    @JvmField
    public static final ProtoAdapter<CodeCoverageByOwnerEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "linesCovered", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int lines_covered;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "linesTotal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int lines_total;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "metricName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String metric_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String owner;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final float percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String uuid;

    public CodeCoverageByOwnerEvent() {
        this(null, null, null, 0.0f, 0, 0, null, null, 255, null);
    }

    public /* synthetic */ CodeCoverageByOwnerEvent(String str, Instant instant, String str2, float f, int i, int i2, String str3, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : instant, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str3, (i3 & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24125newBuilder();
    }

    public final String getOwner() {
        return this.owner;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getMetric_name() {
        return this.metric_name;
    }

    public final float getPercentage() {
        return this.percentage;
    }

    public final int getLines_total() {
        return this.lines_total;
    }

    public final int getLines_covered() {
        return this.lines_covered;
    }

    public final String getUuid() {
        return this.uuid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeCoverageByOwnerEvent(String owner, Instant instant, String metric_name, float f, int i, int i2, String uuid, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(metric_name, "metric_name");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.owner = owner;
        this.timestamp = instant;
        this.metric_name = metric_name;
        this.percentage = f;
        this.lines_total = i;
        this.lines_covered = i2;
        this.uuid = uuid;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24125newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CodeCoverageByOwnerEvent)) {
            return false;
        }
        CodeCoverageByOwnerEvent codeCoverageByOwnerEvent = (CodeCoverageByOwnerEvent) other;
        return Intrinsics.areEqual(unknownFields(), codeCoverageByOwnerEvent.unknownFields()) && Intrinsics.areEqual(this.owner, codeCoverageByOwnerEvent.owner) && Intrinsics.areEqual(this.timestamp, codeCoverageByOwnerEvent.timestamp) && Intrinsics.areEqual(this.metric_name, codeCoverageByOwnerEvent.metric_name) && this.percentage == codeCoverageByOwnerEvent.percentage && this.lines_total == codeCoverageByOwnerEvent.lines_total && this.lines_covered == codeCoverageByOwnerEvent.lines_covered && Intrinsics.areEqual(this.uuid, codeCoverageByOwnerEvent.uuid);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.owner.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.metric_name.hashCode()) * 37) + Float.hashCode(this.percentage)) * 37) + Integer.hashCode(this.lines_total)) * 37) + Integer.hashCode(this.lines_covered)) * 37) + this.uuid.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("owner=" + Internal.sanitize(this.owner));
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("metric_name=" + Internal.sanitize(this.metric_name));
        arrayList.add("percentage=" + this.percentage);
        arrayList.add("lines_total=" + this.lines_total);
        arrayList.add("lines_covered=" + this.lines_covered);
        arrayList.add("uuid=" + Internal.sanitize(this.uuid));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CodeCoverageByOwnerEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CodeCoverageByOwnerEvent copy$default(CodeCoverageByOwnerEvent codeCoverageByOwnerEvent, String str, Instant instant, String str2, float f, int i, int i2, String str3, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = codeCoverageByOwnerEvent.owner;
        }
        if ((i3 & 2) != 0) {
            instant = codeCoverageByOwnerEvent.timestamp;
        }
        if ((i3 & 4) != 0) {
            str2 = codeCoverageByOwnerEvent.metric_name;
        }
        if ((i3 & 8) != 0) {
            f = codeCoverageByOwnerEvent.percentage;
        }
        if ((i3 & 16) != 0) {
            i = codeCoverageByOwnerEvent.lines_total;
        }
        if ((i3 & 32) != 0) {
            i2 = codeCoverageByOwnerEvent.lines_covered;
        }
        if ((i3 & 64) != 0) {
            str3 = codeCoverageByOwnerEvent.uuid;
        }
        if ((i3 & 128) != 0) {
            byteString = codeCoverageByOwnerEvent.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        int i4 = i;
        int i5 = i2;
        return codeCoverageByOwnerEvent.copy(str, instant, str2, f, i4, i5, str4, byteString2);
    }

    public final CodeCoverageByOwnerEvent copy(String owner, Instant timestamp, String metric_name, float percentage, int lines_total, int lines_covered, String uuid, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(metric_name, "metric_name");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CodeCoverageByOwnerEvent(owner, timestamp, metric_name, percentage, lines_total, lines_covered, uuid, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CodeCoverageByOwnerEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CodeCoverageByOwnerEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CodeCoverageByOwnerEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CodeCoverageByOwnerEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOwner(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOwner());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getMetric_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getMetric_name());
                }
                if (!Float.valueOf(value.getPercentage()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getPercentage()));
                }
                if (value.getLines_total() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getLines_total()));
                }
                if (value.getLines_covered() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getLines_covered()));
                }
                return !Intrinsics.areEqual(value.getUuid(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getUuid()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CodeCoverageByOwnerEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOwner(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOwner());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getMetric_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMetric_name());
                }
                if (!Float.valueOf(value.getPercentage()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getPercentage()));
                }
                if (value.getLines_total() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getLines_total()));
                }
                if (value.getLines_covered() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getLines_covered()));
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getUuid());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CodeCoverageByOwnerEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getUuid());
                }
                if (value.getLines_covered() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getLines_covered()));
                }
                if (value.getLines_total() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getLines_total()));
                }
                if (!Float.valueOf(value.getPercentage()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getPercentage()));
                }
                if (!Intrinsics.areEqual(value.getMetric_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMetric_name());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (Intrinsics.areEqual(value.getOwner(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOwner());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CodeCoverageByOwnerEvent redact(CodeCoverageByOwnerEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return CodeCoverageByOwnerEvent.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, 0.0f, 0, 0, null, ByteString.EMPTY, 125, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CodeCoverageByOwnerEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                float fFloatValue = 0.0f;
                int iIntValue = 0;
                int iIntValue2 = 0;
                String strDecode2 = "";
                Instant instantDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 5:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 6:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 7:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CodeCoverageByOwnerEvent(strDecode, instantDecode, strDecode3, fFloatValue, iIntValue, iIntValue2, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
