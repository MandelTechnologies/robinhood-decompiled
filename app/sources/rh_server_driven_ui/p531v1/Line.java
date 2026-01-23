package rh_server_driven_ui.p531v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: Line.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016JQ\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010$R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m3636d2 = {"Lrh_server_driven_ui/v1/Line;", "Lcom/squareup/wire/Message;", "", "identifier", "", "segments", "", "Lrh_server_driven_ui/v1/Segment;", "direction", "Lrh_server_driven_ui/v1/Direction;", "is_primary", "", "draw_layer", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lrh_server_driven_ui/v1/Direction;ZLjava/lang/Float;Lokio/ByteString;)V", "getIdentifier", "()Ljava/lang/String;", "getDirection", "()Lrh_server_driven_ui/v1/Direction;", "()Z", "getDraw_layer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getSegments", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/util/List;Lrh_server_driven_ui/v1/Direction;ZLjava/lang/Float;Lokio/ByteString;)Lrh_server_driven_ui/v1/Line;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Line extends Message {

    @JvmField
    public static final ProtoAdapter<Line> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Direction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Direction direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "drawLayer", schemaIndex = 4, tag = 5)
    private final Float draw_layer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPrimary", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_primary;

    @WireField(adapter = "rh_server_driven_ui.v1.Segment#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<Segment> segments;

    public Line() {
        this(null, null, null, false, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29768newBuilder();
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public /* synthetic */ Line(String str, List list, Direction direction, boolean z, Float f, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? Direction.DIRECTION_UNSPECIFIED : direction, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : f, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Direction getDirection() {
        return this.direction;
    }

    /* renamed from: is_primary, reason: from getter */
    public final boolean getIs_primary() {
        return this.is_primary;
    }

    public final Float getDraw_layer() {
        return this.draw_layer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Line(String str, List<Segment> segments, Direction direction, boolean z, Float f, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.identifier = str;
        this.direction = direction;
        this.is_primary = z;
        this.draw_layer = f;
        this.segments = Internal.immutableCopyOf("segments", segments);
    }

    public final List<Segment> getSegments() {
        return this.segments;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29768newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Line)) {
            return false;
        }
        Line line = (Line) other;
        return Intrinsics.areEqual(unknownFields(), line.unknownFields()) && Intrinsics.areEqual(this.identifier, line.identifier) && Intrinsics.areEqual(this.segments, line.segments) && this.direction == line.direction && this.is_primary == line.is_primary && Intrinsics.areEqual(this.draw_layer, line.draw_layer);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.identifier;
        int iHashCode2 = (((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.segments.hashCode()) * 37) + this.direction.hashCode()) * 37) + Boolean.hashCode(this.is_primary)) * 37;
        Float f = this.draw_layer;
        int iHashCode3 = iHashCode2 + (f != null ? f.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.identifier;
        if (str != null) {
            arrayList.add("identifier=" + Internal.sanitize(str));
        }
        if (!this.segments.isEmpty()) {
            arrayList.add("segments=" + this.segments);
        }
        arrayList.add("direction=" + this.direction);
        arrayList.add("is_primary=" + this.is_primary);
        Float f = this.draw_layer;
        if (f != null) {
            arrayList.add("draw_layer=" + f);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Line{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Line copy$default(Line line, String str, List list, Direction direction, boolean z, Float f, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = line.identifier;
        }
        if ((i & 2) != 0) {
            list = line.segments;
        }
        if ((i & 4) != 0) {
            direction = line.direction;
        }
        if ((i & 8) != 0) {
            z = line.is_primary;
        }
        if ((i & 16) != 0) {
            f = line.draw_layer;
        }
        if ((i & 32) != 0) {
            byteString = line.unknownFields();
        }
        Float f2 = f;
        ByteString byteString2 = byteString;
        return line.copy(str, list, direction, z, f2, byteString2);
    }

    public final Line copy(String identifier, List<Segment> segments, Direction direction, boolean is_primary, Float draw_layer, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Line(identifier, segments, direction, is_primary, draw_layer, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Line.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Line>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Line$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Line value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getIdentifier()) + Segment.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getSegments());
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    size += Direction.ADAPTER.encodedSizeWithTag(3, value.getDirection());
                }
                if (value.getIs_primary()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_primary()));
                }
                return size + ProtoAdapter.FLOAT.encodedSizeWithTag(5, value.getDraw_layer());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Line value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
                Segment.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSegments());
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    Direction.ADAPTER.encodeWithTag(writer, 3, (int) value.getDirection());
                }
                if (value.getIs_primary()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_primary()));
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 5, (int) value.getDraw_layer());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Line value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.FLOAT.encodeWithTag(writer, 5, (int) value.getDraw_layer());
                if (value.getIs_primary()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_primary()));
                }
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    Direction.ADAPTER.encodeWithTag(writer, 3, (int) value.getDirection());
                }
                Segment.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSegments());
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Line decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                Direction direction = Direction.DIRECTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Float fDecode = null;
                boolean zBooleanValue = false;
                Direction directionDecode = direction;
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Line(strDecode, arrayList, directionDecode, zBooleanValue, fDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(Segment.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        try {
                            directionDecode = Direction.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 4) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 5) {
                        fDecode = ProtoAdapter.FLOAT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Line redact(Line value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Line.copy$default(value, null, Internal.m26823redactElements(value.getSegments(), Segment.ADAPTER), null, false, null, ByteString.EMPTY, 29, null);
            }
        };
    }
}
